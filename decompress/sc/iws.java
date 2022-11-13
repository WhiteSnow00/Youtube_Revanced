// 
// Decompiled by Procyon v0.6.0
// 

public final class iws implements fpl
{
    public anza a;
    private final wyw b;
    private final jbi c;
    private long d;
    private boolean e;
    private final vaf f;
    
    public iws(final wyw b, final vaf f, final jbi c) {
        this.b = b;
        this.f = f;
        this.c = c;
        this.a = anza.a;
    }
    
    private final boolean c() {
        return fbu.am(this.f);
    }
    
    public final void a(final long n) {
        if (this.c()) {
            anza a;
            if (this.c.j()) {
                a = anza.A;
            }
            else if (this.e) {
                a = anza.g;
            }
            else {
                a = anza.h;
            }
            final ahaz builder = ((ahbh)alht.a).createBuilder();
            final int d = (int)this.d;
            builder.copyOnWrite();
            final alht alht = (alht)builder.instance;
            alht.b |= 0x2;
            alht.d = d;
            final int e = (int)n;
            builder.copyOnWrite();
            final alht alht2 = (alht)builder.instance;
            alht2.b |= 0x4;
            alht2.e = e;
            builder.copyOnWrite();
            final alht alht3 = (alht)builder.instance;
            alht3.c = a.I;
            alht3.b |= 0x1;
            final alht i = (alht)builder.build();
            final ahaz builder2 = ((ahbh)alhi.a).createBuilder();
            builder2.copyOnWrite();
            final alhi alhi = (alhi)builder2.instance;
            i.getClass();
            alhi.I = i;
            alhi.c |= 0x4000000;
            this.b.J(3, (wzz)new wyt(xaa.c(112394)), (alhi)builder2.build());
            this.a = a;
        }
    }
    
    public final void b(final long d, final boolean e) {
        if (!this.c()) {
            return;
        }
        this.d = d;
        this.e = e;
        this.b.l((wzz)new wyt(xaa.c(112394)));
    }
}
