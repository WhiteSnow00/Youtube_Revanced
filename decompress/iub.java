import j$.time.Instant;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iub implements iuo
{
    private static final Instant a;
    private xan b;
    private final xao c;
    private long d;
    private final afss e;
    
    static {
        a = Instant.ofEpochMilli(3000L);
    }
    
    public iub(final xao c, final afss e) {
        this.c = c;
        this.e = e;
    }
    
    private final void c() {
        this.b = null;
        this.d = 0L;
    }
    
    @Override
    public final void a() {
        if (this.b != null && this.e.a().minusMillis(this.d).isAfter(iub.a)) {
            this.c();
            zlm.b(zll.b, zlk.y, "Rotation was longer than rotation upper bound (3s).");
            return;
        }
        final xan b = this.b;
        if (b != null) {
            b.f(this.d);
            this.b.c("pr_e");
            this.c();
            return;
        }
        zlm.b(zll.b, zlk.y, "Called logRotationEnd before rotation start was logged.");
    }
    
    @Override
    public final xan b(final int n) {
        this.d = this.e.a().toEpochMilli();
        final xan c = this.c.c(almx.cc);
        final ahaz builder = ((ahbh)almj.a).createBuilder();
        final almx cc = almx.cc;
        builder.copyOnWrite();
        final almj almj = (almj)builder.instance;
        almj.e = cc.cI;
        almj.b |= 0x1;
        builder.copyOnWrite();
        final almj almj2 = (almj)builder.instance;
        almj2.T = n - 1;
        almj2.d |= 0x8000;
        c.a((almj)builder.build());
        return this.b = c;
    }
}
