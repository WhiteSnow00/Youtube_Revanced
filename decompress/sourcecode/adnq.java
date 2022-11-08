// 
// Decompiled by Procyon v0.6.0
// 

final class adnq extends adix
{
    final /* synthetic */ asix a;
    final /* synthetic */ adkr b;
    final /* synthetic */ boolean c;
    final /* synthetic */ asit d;
    final /* synthetic */ adnr e;
    
    public adnq(final adnr e, final adjo adjo, final adkr adkr, final asix a, final adkr b, final boolean c, final asit d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        super(adjo, adkr);
    }
    
    public final asit d() {
        return this.d;
    }
    
    public final void e(final agza agza) {
        final asix a = this.a;
        if (a != null) {
            try {
                a.a((Object)agza);
            }
            catch (final Exception ex) {}
        }
        final int c = adio.C(this.b.c);
        if (c != 0) {
            if (c == 4 && !((adku)agza.instance).aj) {
                if (this.c) {
                    if (this.e.i()) {
                        agza.copyOnWrite();
                        final adku adku = (adku)agza.instance;
                        adku.c |= 0x10000000;
                        adku.aj = true;
                        final apfs j = this.e.j;
                        agza.copyOnWrite();
                        final adku adku2 = (adku)agza.instance;
                        adku2.ak = j.S;
                        adku2.c |= 0x20000000;
                        apfr apfr;
                        if ((apfr = apfr.b(this.b.d)) == null) {
                            apfr = apfr.a;
                        }
                        agza.copyOnWrite();
                        final adku adku3 = (adku)agza.instance;
                        adku3.al = apfr.aD;
                        adku3.c |= 0x40000000;
                    }
                }
                else if (this.e.k()) {
                    agza.copyOnWrite();
                    final adku adku4 = (adku)agza.instance;
                    adku4.c |= 0x10000000;
                    adku4.aj = true;
                }
            }
        }
    }
}
