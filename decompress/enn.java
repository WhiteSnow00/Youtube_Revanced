// 
// Decompiled by Procyon v0.6.0
// 

public final class enn extends env
{
    private final boolean h;
    
    public enn(final emk emk, final ahaz ahaz, final int n) {
        super(emk, "UdRLZDfL4bVVU0VX3qg8hi1McU3FMuLhNf0tRNLophcguwloVZffIAQP6VRf+/uk", "yXOhM6UEm+Qz/JUey2l1+qI404D+W2SeSSnUBSRl6qI=", ahaz, n, 61);
        this.h = emk.o.a;
    }
    
    protected final void a() {
        final long longValue = (long)this.d.invoke(null, this.a.a, this.h);
        synchronized (this.g) {
            final ahaz g = this.g;
            g.copyOnWrite();
            final eht eht = (eht)g.instance;
            final eht a = eht.a;
            eht.c |= 0x800000;
            eht.U = longValue;
        }
    }
}
