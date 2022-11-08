import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abda extends tcv implements abnq
{
    public final abno d;
    public final abns e;
    public final asib f;
    private abtt g;
    private abcz h;
    private final anbh i;
    
    public abda(final abno d, final abns e, final anbh i) {
        this.f = new asib();
        d.getClass();
        this.d = d;
        this.e = e;
        i.getClass();
        this.i = i;
    }
    
    public final void b() {
        this.f.b();
        final abtt g = this.g;
        if (g != null && this.h != null) {
            final abtw e = g.e();
            if (e != null) {
                e.k((abtu)this.h);
            }
        }
    }
    
    public final void c(final abtt g) {
        if (this.h != null) {
            return;
        }
        abtw e;
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
        e.e((abtu)(this.h = new abcz(this, n, j)));
    }
    
    public final asic[] lX(final abns abns) {
        return new asic[] { ((asgt)abns.q().a).j(aajj.t(abns.bN(), 67108864L)).j(aajj.r(1)).am((asix)new abbr(this, 9), (asix)abdi.b) };
    }
}
