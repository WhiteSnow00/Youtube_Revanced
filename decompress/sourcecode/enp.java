// 
// Decompiled by Procyon v0.6.0
// 

public final class enp extends enu
{
    private final emp h;
    private long i;
    
    public enp(final emj emj, final agza agza, final int n, final emp h) {
        super(emj, "yXY8/mGMSUXAD/doic4NhOcSiaIXIqWtQGozx2RibPkZkGDEn3zdgJKu8ncuIp2B", "lomf+VO0Ecj7WivSbw6aVWdgbo/lmDysFNgyXwY+gTY=", agza, n, 53);
        this.h = h;
        if (h != null) {
            this.i = h.a();
        }
    }
    
    protected final void a() {
        if (this.h != null) {
            final agza g = this.g;
            final long longValue = (long)this.d.invoke(null, this.i);
            g.copyOnWrite();
            final ehs ehs = (ehs)g.instance;
            final ehs a = ehs.a;
            ehs.c |= 0x4000;
            ehs.N = longValue;
        }
    }
}
