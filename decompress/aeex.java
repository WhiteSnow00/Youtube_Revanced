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

public final class aeex
{
    private static final Map m;
    public final Context a;
    public final List b;
    public final Set c;
    public final Object d;
    public boolean e;
    public final Intent f;
    public final aeeu g;
    public final WeakReference h;
    public final IBinder$DeathRecipient i;
    public ServiceConnection j;
    public IInterface k;
    public final aefs l;
    private final String n;
    private final AtomicInteger o;
    
    static {
        m = new HashMap();
    }
    
    public aeex(final Context a, final aefs l, final String n, final Intent f, final aeeu g, final byte[] array, final byte[] array2) {
        this.b = new ArrayList();
        this.c = new HashSet();
        this.d = new Object();
        this.i = (IBinder$DeathRecipient)new aeeq(this);
        this.o = new AtomicInteger(0);
        this.a = a;
        this.l = l;
        this.n = n;
        this.f = f;
        this.g = g;
        this.h = new WeakReference(null);
    }
    
    static /* bridge */ void e(final aeex aeex) {
        aeex.e = false;
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
                ((noj)iterator.next()).c((Exception)this.a());
            }
            this.c.clear();
            monitorexit(d);
        }
        finally {
            monitorexit(d);
            while (true) {}
        }
    }
    
    public final void c(final aeeo aeeo) {
        final Map m = aeex.m;
        synchronized (m) {
            if (!m.containsKey(this.n)) {
                final HandlerThread handlerThread = new HandlerThread(this.n, 10);
                handlerThread.start();
                m.put(this.n, new Handler(handlerThread.getLooper()));
            }
            final Handler handler = m.get(this.n);
            monitorexit(m);
            handler.post((Runnable)aeeo);
        }
    }
    
    public final void d() {
        synchronized (this.d) {
            if (this.o.get() > 0 && this.o.decrementAndGet() > 0) {
                return;
            }
            monitorexit(this.d);
            this.c(new aees(this));
        }
    }
    
    public final void f(final aeeo aeeo, final noj noj) {
        synchronized (this.d) {
            this.c.add(noj);
            ((nnt)noj.a).p((nnn)new aeep(this, noj, 0, null));
            monitorexit(this.d);
            synchronized (this.d) {
                this.o.getAndIncrement();
                monitorexit(this.d);
                this.c(new aeer(this, aeeo.f, aeeo, null));
            }
        }
    }
    
    public final void g(final noj noj) {
        synchronized (this.d) {
            this.c.remove(noj);
            monitorexit(this.d);
            this.d();
        }
    }
}
