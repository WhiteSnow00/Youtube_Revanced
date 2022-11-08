import java.util.Iterator;
import java.util.List;
import android.os.PowerManager$WakeLock;
import java.util.concurrent.Executor;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class coq implements cpb, csx
{
    public final Context a;
    public final int b;
    public final cqv c;
    public final cou d;
    public final cpd e;
    public int f;
    public final Executor g;
    public final Executor h;
    public PowerManager$WakeLock i;
    public boolean j;
    public final avt k;
    private final Object l;
    
    static {
        cmr.b("DelayMetCommandHandler");
    }
    
    public coq(final Context a, final int b, final cou d, final avt k, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = (cqv)k.a;
        this.k = k;
        final der j = d.e.j;
        final aja i = d.j;
        this.g = (Executor)i.c;
        this.h = (Executor)i.a;
        this.e = new cpd(j, (cpb)this, null);
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
                cmr.a();
                final StringBuilder sb = new StringBuilder("Releasing wakelock ");
                sb.append(this.i);
                sb.append("for WorkSpec ");
                sb.append(this.c);
                this.i.release();
            }
        }
    }
    
    public final void b(final cqv cqv) {
        cmr.a();
        new StringBuilder("Exceeded time limits on execution for ").append(cqv);
        cqv.toString();
        this.g.execute(new cdi(this, 12));
    }
    
    public final void e(final List list) {
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            if (cht.j((crg)iterator.next()).equals((Object)this.c)) {
                this.g.execute(new cdi(this, 13));
                break;
            }
        }
    }
    
    public final void f(final List list) {
        this.g.execute(new cdi(this, 12));
    }
}
