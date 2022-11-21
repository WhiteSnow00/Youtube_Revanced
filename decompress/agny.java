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

public abstract class agny extends Service
{
    private Binder a;
    private final Object b;
    private int c;
    private int d;
    final ExecutorService e;
    
    public agny() {
        final nch a = nca.a;
        this.e = nch.af((ThreadFactory)new emm("Firebase-Messaging-Intent-Handle", 2));
        this.b = new Object();
        this.d = 0;
    }
    
    public final nnt e(final Intent intent) {
        final noj noj = new noj();
        this.e.execute(new aegq(this, intent, noj, 11, null));
        return (nnt)noj.a;
    }
    
    public final void f(final Intent intent) {
        if (intent != null) {
            synchronized (agot.b) {
                if (agot.c != null && agot.b(intent)) {
                    agot.a(intent, false);
                    final nng c = agot.c;
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
                            final aunx aunx = c.k.get(null);
                            if (aunx != null && --aunx.a == 0) {
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
                this.a = new agou(new xsj(this), null, null, null);
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
            if (((nnt)o).i()) {
                this.f(intent);
                return 2;
            }
            ((nnt)o).l((Executor)rs.i, (nnn)new aeep(this, intent, 2));
            return 3;
        }
    }
}
