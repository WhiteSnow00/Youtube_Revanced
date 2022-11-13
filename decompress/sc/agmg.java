import java.util.concurrent.Executor;
import android.os.IBinder;
import android.util.Log;
import android.content.Intent;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ExecutorService;
import android.os.Binder;
import android.app.Service;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class agmg extends Service
{
    private Binder a;
    private final Object b;
    private int c;
    private int d;
    final ExecutorService e;
    
    public agmg() {
        final nbr a = nbk.a;
        this.e = nbr.i((ThreadFactory)new emj("Firebase-Messaging-Intent-Handle", 2));
        this.b = new Object();
        this.d = 0;
    }
    
    public final nnc e(final Intent intent) {
        final nns nns = new nns();
        this.e.execute((Runnable)new adlo(this, intent, nns, 13, (byte[])null));
        return (nnc)nns.a;
    }
    
    public final void f(final Intent intent) {
        if (intent != null) {
            synchronized (agnb.b) {
                if (agnb.c != null && agnb.b(intent)) {
                    agnb.a(intent, false);
                    final nmp c = agnb.c;
                    if (c.l.decrementAndGet() < 0) {
                        Log.e("WakeLock", c.i.concat(" release without a matched acquire!"));
                    }
                    synchronized (c.b) {
                        c.c();
                        if (!c.k.containsKey(null)) {
                            final String i = c.i;
                            final StringBuilder sb = new StringBuilder();
                            sb.append(i);
                            sb.append(" counter does not exist");
                            Log.w("WakeLock", sb.toString());
                        }
                        else {
                            final aulc aulc = c.k.get(null);
                            if (aulc != null && --aulc.a == 0) {
                                c.k.remove(null);
                            }
                        }
                        c.d();
                    }
                }
            }
        }
        synchronized (this.b) {
            final int d = this.d - 1;
            this.d = d;
            if (d == 0) {
                this.stopSelfResult(this.c);
            }
        }
    }
    
    public abstract void g(final Intent p0);
    
    protected Intent h() {
        throw null;
    }
    
    public final IBinder onBind(final Intent intent) {
        synchronized (this) {
            if (this.a == null) {
                this.a = new agnc(new xra(this), null, null, null);
            }
            return (IBinder)this.a;
        }
    }
    
    public final void onDestroy() {
        this.e.shutdown();
        super.onDestroy();
    }
    
    public final int onStartCommand(final Intent intent, final int n, final int c) {
        Object o = this.b;
        synchronized (o) {
            this.c = c;
            ++this.d;
            monitorexit(o);
            o = this.h();
            if (o == null) {
                this.f(intent);
                return 2;
            }
            o = this.e((Intent)o);
            if (((nnc)o).i()) {
                this.f(intent);
                return 2;
            }
            ((nnc)o).l((Executor)rr.i, (nmv)new aecx(this, intent, 2));
            return 3;
        }
    }
}
