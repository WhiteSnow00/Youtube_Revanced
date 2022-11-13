import android.opengl.GLES20;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aumn implements aukz
{
    public static final float[] a;
    public static final float[] b;
    public static final float[] c;
    public float[] d;
    public float e;
    private int f;
    private int g;
    
    static {
        a = new float[] { 0.256788f, 0.504129f, 0.0979059f, 0.0627451f };
        b = new float[] { -0.148223f, -0.290993f, 0.439216f, 0.501961f };
        c = new float[] { 0.439216f, -0.367788f, -0.0714274f, 0.501961f };
    }
    
    public final void a(final aulc aulc) {
        this.f = aulc.b("xUnit");
        this.g = aulc.b("coeffs");
    }
    
    public final void b(final float[] array, final int n) {
        GLES20.glUniform4fv(this.g, 1, this.d, 0);
        final int f = this.f;
        final float e = this.e;
        final float n2 = array[0];
        final float n3 = array[1];
        final float n4 = (float)n;
        GLES20.glUniform2f(f, n2 * e / n4, e * n3 / n4);
    }
}
