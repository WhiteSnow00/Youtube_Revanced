import android.opengl.GLES20;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auly implements aukj
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
    
    public final void a(final aukm aukm) {
        this.f = aukm.b("xUnit");
        this.g = aukm.b("coeffs");
    }
    
    public final void b(final float[] array, final int n) {
        GLES20.glUniform4fv(this.g, 1, this.d, 0);
        final int f = this.f;
        final float e = this.e;
        final float n2 = (float)n;
        GLES20.glUniform2f(f, array[0] * e / n2, e * array[1] / n2);
    }
}
