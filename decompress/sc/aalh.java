// 
// Decompiled by Procyon v0.6.0
// 

public final class aalh
{
    public final aalj a;
    public tvn b;
    public aand c;
    public boolean d;
    public boolean e;
    
    public aalh(final zbh zbh) {
        zbh.d((zbi)(this.a = new aalj()));
    }
    
    public final xan a() {
        final tvn b = this.b;
        if (b != null) {
            return (xan)b.a();
        }
        return null;
    }
    
    public final void b(final ashi ashi, final ashi ashi2, final ashi ashi3) {
        final asiq asiq = new asiq();
        asiq.c(ashi.am((asjm)new aakj(this, 12)));
        asiq.c(ashi3.an((asjm)new aakj(this, 7), (asjm)uyl.r));
        asiq.c(aale.o(ashi2, (aezf)aalg.a).am((asjm)new aakj(this, 10)));
        asiq.c(aale.o(ashi3, (aezf)aalg.c).an((asjm)new aakj(this, 11), (asjm)uyl.r));
        asiq.c(aale.o(ashi3, (aezf)aalg.d).an((asjm)new aakj(this, 13), (asjm)uyl.r));
        asiq.c(aale.o(ashi2, (aezf)aalg.e).am((asjm)new aakj(this, 14)));
        asiq.c(aale.o(ashi2, (aezf)aalg.f).am((asjm)new aakj(this, 15)));
        asiq.c(aale.o(ashi2, (aezf)aalg.g).am((asjm)new aakj(this, 16)));
        asiq.c(aale.o(ashi3, (aezf)aalg.h).an((asjm)new aakj(this, 6), (asjm)uyl.r));
        asiq.c(aale.o(ashi3, (aezf)aalg.b).an((asjm)new aakj(this, 8), (asjm)uyl.r));
        asiq.c(ashi2.p().Z((asjr)zhp.t).am((asjm)new aakj(this, 9)));
    }
    
    public final void c() {
        final xan a = this.a();
        if (a != null) {
            a.c("pl_int");
            this.e();
        }
    }
    
    public final void d(final aamg aamg) {
        final xan xan = (xan)this.b.a();
        if (xan != null) {
            if (aamg.a() > 0L) {
                xan.d(aamg.f(), aamg.a());
                return;
            }
            xan.c(aamg.f());
        }
    }
    
    public final void e() {
        final xan xan = (xan)this.b.a();
        if (xan != null) {
            xan.c("aa");
            final tvn b = this.b;
            if (b instanceof abjc) {
                ((abjc)b).a = null;
            }
            this.d = false;
            this.e = false;
        }
    }
}
