import android.os.Handler;
import android.os.HandlerThread;
import java.util.Iterator;
import android.os.RemoteException;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import android.os.IInterface;
import android.content.ServiceConnection;
import android.os.IBinder$DeathRecipient;
import java.lang.ref.WeakReference;
import android.content.Intent;
import java.util.Set;
import java.util.List;
import android.content.Context;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aebd
{
    private static final Map m;
    public final Context a;
    public final List b;
    public final Set c;
    public final Object d;
    public boolean e;
    public final Intent f;
    public final aeba g;
    public final WeakReference h;
    public final IBinder$DeathRecipient i;
    public ServiceConnection j;
    public IInterface k;
    public final aeby l;
    private final String n;
    private final AtomicInteger o;
    
    static {
        m = new HashMap();
    }
    
    public aebd(final Context a, final aeby l, final String n, final Intent f, final aeba g, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = new ArrayList();
        this.c = new HashSet();
        this.d = new Object();
        this.i = (IBinder$DeathRecipient)new aeaw(this);
        this.o = new AtomicInteger(0);
        this.a = a;
        this.l = l;
        this.n = n;
        this.f = f;
        this.g = g;
        this.h = new WeakReference(null);
    }
    
    public final RemoteException a() {
        return new RemoteException(String.valueOf(this.n).concat(" : Binder has died."));
    }
    
    public final void b() {
        final Object d = this.d;
        monitorenter(d);
        try {
            final Iterator iterator = this.c.iterator();
            while (iterator.hasNext()) {
                ((nmo)iterator.next()).d((Exception)this.a());
            }
            this.c.clear();
            monitorexit(d);
        }
        finally {
            monitorexit(d);
            while (true) {}
        }
    }
    
    public final void c(final aeau aeau) {
        final Map m = aebd.m;
        synchronized (m) {
            if (!m.containsKey(this.n)) {
                final HandlerThread handlerThread = new HandlerThread(this.n, 10);
                handlerThread.start();
                m.put(this.n, new Handler(handlerThread.getLooper()));
            }
            final Handler handler = m.get(this.n);
            monitorexit(m);
            handler.post((Runnable)aeau);
        }
    }
    
    public final void d() {
        synchronized (this.d) {
            if (this.o.get() > 0 && this.o.decrementAndGet() > 0) {
                return;
            }
            monitorexit(this.d);
            this.c((aeau)new aeay(this));
        }
    }
    
    public final void f(final aeau aeau, final nmo nmo) {
        synchronized (this.d) {
            this.c.add(nmo);
            ((nly)nmo.a).p((nlr)new aeav(this, nmo, 0, null));
            monitorexit(this.d);
            synchronized (this.d) {
                this.o.getAndIncrement();
                monitorexit(this.d);
                this.c((aeau)new aeax(this, aeau.f, aeau, (byte[])null));
            }
        }
    }
    
    public final void g(final nmo nmo) {
        synchronized (this.d) {
            this.c.remove(nmo);
            monitorexit(this.d);
            this.d();
        }
    }
}
