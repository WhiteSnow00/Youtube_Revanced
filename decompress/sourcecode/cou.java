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

public final class cou implements cng
{
    public static final String a;
    final Context b;
    public final csz c;
    public final cns d;
    public final coe e;
    public final con f;
    public final List g;
    public Intent h;
    public cot i;
    public final aja j;
    private final dmk k;
    
    static {
        a = cmr.b("SystemAlarmDispatcher");
    }
    
    public cou(final Context context) {
        final Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        final dmk k = new dmk((char[])null);
        this.k = k;
        this.f = new con(applicationContext, k, null);
        final coe j = coe.j(context);
        this.e = j;
        this.c = new csz(j.c.d);
        final cns f = j.f;
        this.d = f;
        this.j = j.k;
        f.b((cng)this);
        this.g = new ArrayList();
        this.h = null;
    }
    
    public static final void e() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Needs to be invoked on the main thread.");
    }
    
    public final void a(final cqv cqv, final boolean b) {
        ((Executor)this.j.a).execute(new cos(this, con.d(this.b, cqv, b), 0));
    }
    
    public final void b() {
        cmr.a();
        this.d.c((cng)this);
        this.i = null;
    }
    
    public final void c() {
        e();
        final PowerManager$WakeLock a = css.a(this.b, "ProcessCommand");
        try {
            a.acquire();
            csk.b(this.e.k, (Runnable)new cor(this));
        }
        finally {
            a.release();
        }
    }
    
    public final void d(final Intent intent, final int n) {
        cmr.a();
        new StringBuilder("Adding command ").append(intent);
        e();
        final String action = intent.getAction();
        if (TextUtils.isEmpty((CharSequence)action)) {
            cmr.a();
            Log.w(cou.a, "Unknown command. Ignoring");
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
