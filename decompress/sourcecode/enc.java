// 
// Decompiled by Procyon v0.6.0
// 

public final class enc extends enu
{
    private final emk h;
    
    public enc(final emj emj, final agza agza, final int n, final emk h) {
        super(emj, "DEi5JrQn0pxSuKS2Ij/fpEA7I+0FPLXDsBWBfvVwt/zwZUJJ4fnydbsyET2LCYMF", "Jj1vyuWfy0iUak+iXdGffQYzyyVnoa3nOmSynhrPgns=", agza, n, 85);
        this.h = h;
    }
    
    protected final void a() {
        final long[] array = (long[])this.d.invoke(null, this.h.c, this.h.d, this.h.e, this.h.f);
        synchronized (this.g) {
            final agza g = this.g;
            final long ad = array[0];
            g.copyOnWrite();
            final ehs ehs = (ehs)g.instance;
            final ehs a = ehs.a;
            ehs.d |= 0x800;
            ehs.ad = ad;
            final agza g2 = this.g;
            final long ae = array[1];
            g2.copyOnWrite();
            final ehs ehs2 = (ehs)g2.instance;
            ehs2.d |= 0x1000;
            ehs2.ae = ae;
        }
    }
}
