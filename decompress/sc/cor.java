import java.util.Iterator;
import java.util.List;
import android.os.PowerManager$WakeLock;
import java.util.concurrent.Executor;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cor implements cpc, csy
{
    public final Context a;
    public final int b;
    public final cqw c;
    public final cov d;
    public final cpe e;
    public int f;
    public final Executor g;
    public final Executor h;
    public PowerManager$WakeLock i;
    public boolean j;
    public final avu k;
    private final Object l;
    
    static {
        cms.b("DelayMetCommandHandler");
    }
    
    public cor(final Context a, final int b, final cov d, final avu k, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = (cqw)k.a;
        this.k = k;
        final des j = d.e.j;
        final ajb i = d.j;
        this.g = (Executor)i.c;
        this.h = (Executor)i.a;
        this.e = new cpe(j, this, null);
        this.j = false;
        this.f = 0;
        this.l = new Object();
    }
    
    public final void a() {
        synchronized (this.l) {
            this.e.b();
            this.d.c.a(this.c);
            final PowerManager$WakeLock i = this.i;
            if (i != null && i.isHeld()) {
                cms.a();
                final StringBuilder sb = new StringBuilder("Releasing wakelock ");
                sb.append(this.i);
                sb.append("for WorkSpec ");
                sb.append(this.c);
                this.i.release();
            }
        }
    }
    
    public final void b(final cqw cqw) {
        cms.a();
        new StringBuilder("Exceeded time limits on execution for ").append(cqw);
        cqw.toString();
        this.g.execute((Runnable)new cdj(this, 12));
    }
    
    @Override
    public final void e(final List list) {
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            if (chu.j((crh)iterator.next()).equals((Object)this.c)) {
                this.g.execute((Runnable)new cdj(this, 13));
                break;
            }
        }
    }
    
    @Override
    public final void f(final List list) {
        this.g.execute((Runnable)new cdj(this, 12));
    }
}
