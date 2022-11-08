// 
// Decompiled by Procyon v0.6.0
// 

public final class jad implements jdi
{
    public static final wws a;
    public final jai b;
    public final itx c;
    public final wwv d;
    public final jdj e;
    public tmt f;
    public final mrm g;
    
    static {
        a = new wws(wya.c(151179));
    }
    
    public jad(final mrm g, final jai b, final itx c, final wwv d, final jdj e, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.g = g;
        this.e = e;
    }
    
    public final void O(final int n) {
        this.a(false);
    }
    
    public final void a(final boolean b) {
        final tmt f = this.f;
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
