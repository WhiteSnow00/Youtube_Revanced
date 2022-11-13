// 
// Decompiled by Procyon v0.6.0
// 

public final class end extends env
{
    private final eml h;
    
    public end(final emk emk, final ahaz ahaz, final int n, final eml h) {
        super(emk, "DEi5JrQn0pxSuKS2Ij/fpEA7I+0FPLXDsBWBfvVwt/zwZUJJ4fnydbsyET2LCYMF", "Jj1vyuWfy0iUak+iXdGffQYzyyVnoa3nOmSynhrPgns=", ahaz, n, 85);
        this.h = h;
    }
    
    protected final void a() {
        final long[] array = (long[])this.d.invoke(null, this.h.c, this.h.d, this.h.e, this.h.f);
        synchronized (this.g) {
            final ahaz g = this.g;
            final long ad = array[0];
            g.copyOnWrite();
            final eht eht = (eht)g.instance;
            final eht a = eht.a;
            eht.d |= 0x800;
            eht.ad = ad;
            final ahaz g2 = this.g;
            final long ae = array[1];
            g2.copyOnWrite();
            final eht eht2 = (eht)g2.instance;
            eht2.d |= 0x1000;
            eht2.ae = ae;
        }
    }
}
