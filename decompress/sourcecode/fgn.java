// 
// Decompiled by Procyon v0.6.0
// 

public final class fgn
{
    private static final wyn a;
    private final wyo b;
    private final fes c;
    private final fjz d;
    private final abpj e;
    
    static {
        a = (wyn)new wyp();
    }
    
    public fgn(final wyo b, final fes c, final abpj e, final fjz d, final byte[] array, final byte[] array2) {
        this.b = b;
        this.c = c;
        this.e = e;
        this.d = d;
    }
    
    private static void d(final wyn wyn, final alkz alkz, final String i) {
        final agza builder = ((agzi)alkg.a).createBuilder();
        final agza builder2 = ((agzi)alki.a).createBuilder();
        builder2.copyOnWrite();
        final alki alki = (alki)builder2.instance;
        alki.e = alkz.o;
        alki.b |= 0x8;
        builder.copyOnWrite();
        final alkg alkg = (alkg)builder.instance;
        final alki l = (alki)builder2.build();
        l.getClass();
        alkg.L = l;
        alkg.c |= 0x800000;
        builder.copyOnWrite();
        final alkg alkg2 = (alkg)builder.instance;
        alkg2.b |= 0x10;
        alkg2.i = i;
        wyn.a((alkg)builder.build());
    }
    
    public final wyn a() {
        this.d.g();
        if (!this.e.t()) {
            this.c.a();
            return fgn.a;
        }
        wyn wyn;
        if (this.c.b()) {
            if (!this.e.t()) {
                this.c.a();
                wyn = fgn.a;
            }
            else {
                wyn = this.b.c(alku.i);
                final fes c = this.c;
                long d;
                if (c.b()) {
                    c.e = -2L;
                    d = c.d;
                }
                else {
                    d = -1L;
                }
                wyn.f(d);
                d(wyn, alkz.b, "cold");
            }
        }
        else {
            wyn = this.b(alkz.b);
        }
        return wyn;
    }
    
    public final wyn b(final alkz alkz) {
        if (!this.e.t()) {
            return fgn.a;
        }
        final wyn b = this.b.b(alku.i);
        d(b, alkz, "warm");
        return b;
    }
    
    public final void c() {
        this.c.a();
    }
}
