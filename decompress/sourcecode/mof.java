import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executor;
import android.os.IBinder;
import android.content.ComponentName;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import android.content.Intent;
import android.content.Context;
import android.util.Log;
import java.util.ArrayDeque;
import android.os.Handler;
import android.os.Handler$Callback;
import android.os.Looper;
import android.util.SparseArray;
import java.util.Queue;
import android.os.Messenger;
import android.content.ServiceConnection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mof implements ServiceConnection
{
    public int a;
    public final Messenger b;
    public final Queue c;
    public final SparseArray d;
    public mnb e;
    public final /* synthetic */ qqr f;
    
    public mof(final qqr f, final byte[] array) {
        this.f = f;
        this.a = 0;
        this.b = new Messenger((Handler)new aeke(Looper.getMainLooper(), (Handler$Callback)new bnd(this, 7)));
        this.c = new ArrayDeque();
        this.d = new SparseArray();
    }
    
    final void a() {
        ((Executor)this.f.c).execute(new mkn(this, 5));
    }
    
    public final void b() {
        synchronized (this) {
            if (this.a == 1) {
                this.g("Timed out while binding");
            }
        }
    }
    
    final void c(final int n) {
        synchronized (this) {
            final moh moh = (moh)this.d.get(n);
            if (moh != null) {
                final StringBuilder sb = new StringBuilder("Timing out request: ");
                sb.append(n);
                Log.w("MessengerIpcClient", sb.toString());
                this.d.remove(n);
                moh.c(new moi("Timed out waiting for response"));
                this.d();
            }
        }
    }
    
    public final void d() {
        synchronized (this) {
            if (this.a == 2 && this.c.isEmpty() && this.d.size() == 0) {
                this.a = 3;
                mue.a().b((Context)this.f.b, (ServiceConnection)this);
            }
        }
    }
    
    public final boolean e(final moh moh) {
        synchronized (this) {
            final int a = this.a;
            boolean b = false;
            if (a == 0) {
                this.c.add(moh);
                if (this.a == 0) {
                    b = true;
                }
                kgk.aT(b);
                this.a = 1;
                final Intent intent = new Intent("com.mgoogle.android.c2dm.intent.REGISTER");
                intent.setPackage("com.mgoogle.android.gms");
                try {
                    if (!mue.a().c((Context)this.f.b, intent, (ServiceConnection)this, 1)) {
                        this.g("Unable to bind to service");
                    }
                    else {
                        ((ScheduledExecutorService)this.f.c).schedule(new mkn(this, 4), 30L, TimeUnit.SECONDS);
                    }
                }
                catch (final SecurityException ex) {
                    this.f("Unable to bind to service", ex);
                }
                return true;
            }
            if (a == 1) {
                this.c.add(moh);
                return true;
            }
            if (a != 2) {
                return false;
            }
            this.c.add(moh);
            this.a();
            return true;
        }
    }
    
    final void f(final String s, final Throwable t) {
        monitorenter(this);
        try {
            final int a = this.a;
            if (a == 0) {
                throw new IllegalStateException();
            }
            if (a == 1 || a == 2) {
                this.a = 4;
                mue.a().b((Context)this.f.b, (ServiceConnection)this);
                final moi moi = new moi(s, t);
                final Iterator iterator = this.c.iterator();
                while (iterator.hasNext()) {
                    ((moh)iterator.next()).c(moi);
                }
                this.c.clear();
                for (int i = 0; i < this.d.size(); ++i) {
                    ((moh)this.d.valueAt(i)).c(moi);
                }
                this.d.clear();
                monitorexit(this);
                return;
            }
            if (a != 3) {
                monitorexit(this);
                return;
            }
            this.a = 4;
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void g(final String s) {
        synchronized (this) {
            this.f(s, null);
        }
    }
    
    public final void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        ((Executor)this.f.c).execute(new moe(this, binder, 0));
    }
    
    public final void onServiceDisconnected(final ComponentName componentName) {
        ((Executor)this.f.c).execute(new mkn(this, 6));
    }
}
