import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abew extends tfa implements abps
{
    public final abpq d;
    public final abpu e;
    public final asiq f;
    private abvx g;
    private abev h;
    private final andl i;
    
    public abew(final abpq d, final abpu e, final andl i) {
        this.f = new asiq();
        d.getClass();
        this.d = d;
        this.e = e;
        i.getClass();
        this.i = i;
    }
    
    public final void b() {
        this.f.b();
        final abvx g = this.g;
        if (g != null && this.h != null) {
            final abwa e = g.e();
            if (e != null) {
                e.k((abvy)this.h);
            }
        }
    }
    
    public final void c(final abvx g) {
        if (this.h != null) {
            return;
        }
        abwa e;
        if ((this.g = g) != null) {
            e = g.e();
        }
        else {
            e = null;
        }
        if (e == null) {
            return;
        }
        final long j = this.d.j();
        if (j <= 0L) {
            return;
        }
        long n;
        if (this.i.d >= 0) {
            n = Math.min(TimeUnit.MILLISECONDS.convert(this.i.d, TimeUnit.SECONDS), j);
        }
        else {
            n = Math.max(TimeUnit.MILLISECONDS.convert(this.i.d, TimeUnit.SECONDS) + j, 0L);
        }
        e.e((abvy)(this.h = new abev(this, n, j)));
    }
    
    public final asir[] lX(final abpu abpu) {
        return new asir[] { ((ashi)abpu.p().a).j(aale.s(abpu.bM(), 67108864L)).j(aale.q(1)).an((asjm)new abdd(this, 14), (asjm)abfd.b) };
    }
}
