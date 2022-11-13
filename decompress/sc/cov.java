import java.util.concurrent.Executor;
import java.util.Iterator;
import android.util.Log;
import android.text.TextUtils;
import android.os.PowerManager$WakeLock;
import android.os.Looper;
import java.util.ArrayList;
import android.content.Intent;
import java.util.List;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cov implements cnh
{
    public static final String a;
    final Context b;
    public final cta c;
    public final cnt d;
    public final cof e;
    public final coo f;
    public final List g;
    public Intent h;
    public cou i;
    public final ajb j;
    private final dml k;
    
    static {
        a = cms.b("SystemAlarmDispatcher");
    }
    
    public cov(final Context context) {
        final Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        final dml k = new dml((char[])null);
        this.k = k;
        this.f = new coo(applicationContext, k, null);
        final cof j = cof.j(context);
        this.e = j;
        this.c = new cta(j.c.d);
        final cnt f = j.f;
        this.d = f;
        this.j = j.k;
        f.b((cnh)this);
        this.g = new ArrayList();
        this.h = null;
    }
    
    public static final void e() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Needs to be invoked on the main thread.");
    }
    
    public final void a(final cqw cqw, final boolean b) {
        ((Executor)this.j.a).execute(new cot(this, coo.d(this.b, cqw, b), 0));
    }
    
    public final void b() {
        cms.a();
        this.d.c((cnh)this);
        this.i = null;
    }
    
    public final void c() {
        e();
        final PowerManager$WakeLock a = cst.a(this.b, "ProcessCommand");
        try {
            a.acquire();
            csl.b(this.e.k, (Runnable)new cos(this));
        }
        finally {
            a.release();
        }
    }
    
    public final void d(final Intent intent, final int n) {
        cms.a();
        new StringBuilder("Adding command ").append(intent);
        e();
        final String action = intent.getAction();
        if (TextUtils.isEmpty((CharSequence)action)) {
            cms.a();
            Log.w(cov.a, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            e();
            synchronized (this.g) {
                final Iterator iterator = this.g.iterator();
                while (iterator.hasNext()) {
                    if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent)iterator.next()).getAction())) {
                        return;
                    }
                }
            }
        }
        intent.putExtra("KEY_START_ID", n);
        final List g = this.g;
        monitorenter(g);
        try {
            final boolean empty = this.g.isEmpty();
            this.g.add(intent);
            if (!(empty ^ true)) {
                this.c();
            }
            monitorexit(g);
        }
        finally {
            monitorexit(g);
            while (true) {}
        }
    }
}
