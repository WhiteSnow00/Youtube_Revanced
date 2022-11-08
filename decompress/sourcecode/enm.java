// 
// Decompiled by Procyon v0.6.0
// 

public final class enm extends enu
{
    private final boolean h;
    
    public enm(final emj emj, final agza agza, final int n) {
        super(emj, "UdRLZDfL4bVVU0VX3qg8hi1McU3FMuLhNf0tRNLophcguwloVZffIAQP6VRf+/uk", "yXOhM6UEm+Qz/JUey2l1+qI404D+W2SeSSnUBSRl6qI=", agza, n, 61);
        this.h = emj.o.a;
    }
    
    protected final void a() {
        final long longValue = (long)this.d.invoke(null, this.a.a, this.h);
        synchronized (this.g) {
            final agza g = this.g;
            g.copyOnWrite();
            final ehs ehs = (ehs)g.instance;
            final ehs a = ehs.a;
            ehs.c |= 0x800000;
            ehs.U = longValue;
        }
    }
}
