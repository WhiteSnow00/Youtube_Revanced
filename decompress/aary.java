// 
// Decompiled by Procyon v0.6.0
// 

public final class aary implements aaph
{
    public float[] a;
    public float[] b;
    private final aarx c;
    private final aapg d;
    
    public aary(final aarx c, final float[] a, final float[] b) {
        this.c = c;
        this.a = a;
        this.b = b;
        this.d = new aapg();
    }
    
    public static float[] b(final float n) {
        return new float[] { n, n, n };
    }
    
    public final void a(final boolean b, final long n) {
        this.d.b(b, n);
        final float a = this.d.a();
        final aarx c = this.c;
        final float[] b2 = this.b;
        final float n2 = b2[0];
        final float n3 = 1.0f - a;
        final float[] a2 = this.a;
        c.sZ(n2 * a + a2[0] * n3, b2[1] * a + a2[1] * n3, a * b2[2] + n3 * a2[2]);
    }
}
