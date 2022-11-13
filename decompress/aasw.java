// 
// Decompiled by Procyon v0.6.0
// 

public final class aasw implements aaph
{
    public float[] a;
    private final aarz b;
    private final aapg c;
    private final float[] d;
    
    public aasw(final aarz b, final float[] d, final float[] a) {
        b.getClass();
        this.b = b;
        this.d = d;
        this.a = a;
        this.c = new aapg();
    }
    
    public final void a(final boolean b, final long n) {
        final aapg c = this.c;
        final float a = c.a();
        c.b(b, n);
        final float n2 = this.c.a() - a;
        final aarz b2 = this.b;
        final float[] a2 = this.a;
        final float n3 = a2[0];
        final float[] d = this.d;
        final float n4 = d[0];
        final float n5 = 1.0f - n2;
        b2.k(n3 * n2 + n4 * n5, a2[1] * n2 + d[1] * n5, n2 * a2[2] + n5 * d[2]);
    }
}
