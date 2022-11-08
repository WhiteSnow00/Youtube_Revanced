import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abdl extends tcw
{
    public final abdh c;
    public final aioe d;
    public final abni e;
    public final wym f;
    public final boolean g;
    public final boolean h;
    public final abdk i;
    public final aexq j;
    public final abns k;
    public asic l;
    public final abdb m;
    public volatile boolean n;
    public final abpj o;
    private final tdz p;
    private final int q;
    
    public abdl(final Executor executor, final afdu afdu, final tcx tcx, final abdh c, final aioe d, final anbh anbh, final abdb m, final tdz p15, final aexq j, final abns k, final abni e, final wym f, final abpj o, final byte[] array, final byte[] array2) {
        super(executor, afdu, tcx);
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        this.p = p15;
        this.e = e;
        this.f = f;
        this.o = o;
        final boolean ac = aeby.aC(anbh);
        final boolean f2 = anbh.f;
        boolean g = true;
        if (!f2) {
            g = (ac && g);
        }
        this.g = g;
        this.h = ac;
        int max;
        if (aeby.aC(anbh)) {
            max = Math.max(Math.abs(anbh.d), Math.abs(anbh.e));
        }
        else {
            max = -1;
        }
        this.q = max;
        this.m = m;
        this.j = j;
        this.k = k;
        this.i = new abdk(this);
    }
    
    protected final Runnable b() {
        return new abdq(this, 1);
    }
    
    public final void c() {
        super.b = true;
        final afie k = super.a.k();
        while (((Iterator)k).hasNext()) {
            final tcv tcv = (tcv)((Iterator)k).next();
            tcv.b = true;
            tcv.b();
        }
        final abdb m = this.m;
        if (m != null) {
            final ydt e = m.e;
            if (e != null) {
                e.a();
                m.e = null;
                m.c.d((Object)new abdn());
            }
        }
        if (!this.n) {
            this.p.d((Object)new abdo());
        }
        final asic l = this.l;
        if (l != null) {
            athh.f((AtomicReference)l);
        }
    }
    
    public final abif e() {
        final abie a = abif.a();
        final int q = this.q;
        if (q > 0) {
            a.c = 7;
            a.b(q);
        }
        else {
            a.c = 8;
        }
        return a.a();
    }
}
