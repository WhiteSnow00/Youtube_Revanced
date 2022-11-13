// 
// Decompiled by Procyon v0.6.0
// 

public final class jbb implements jei
{
    public static final wyt a;
    public final jbh b;
    public final iuv c;
    public final wyw d;
    public final jej e;
    public toz f;
    public final msr g;
    
    static {
        a = new wyt(xaa.c(151179));
    }
    
    public jbb(final msr g, final jbh b, final iuv c, final wyw d, final jej e, final byte[] array, final byte[] array2) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.g = g;
        this.e = e;
    }
    
    @Override
    public final void O(final int n) {
        this.a(false);
    }
    
    public final void a(final boolean b) {
        final toz f = this.f;
        if (f != null) {
            if (b != f.d()) {
                if (b && this.b.j()) {
                    return;
                }
                if (b && !this.b.g) {
                    return;
                }
                this.f.l(b, true);
            }
        }
    }
}
