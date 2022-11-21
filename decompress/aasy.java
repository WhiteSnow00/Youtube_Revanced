import android.opengl.Matrix;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aasy
{
    public final aavf a;
    public float b;
    public float c;
    private final float[] d;
    private final float[] e;
    private final float[][] f;
    
    public aasy(final aavf a, final float n, final float n2) {
        this.a = a;
        this.a(n, n2);
        this.d = new float[16];
        this.e = new float[16];
        this.f = new float[6][];
        for (int i = 0; i < 6; ++i) {
            this.f[i] = new float[4];
        }
    }
    
    public final void a(final float b, final float c) {
        this.b = b;
        this.c = c;
    }
    
    public final aanq b(final foq foq) {
        final float b = this.b;
        float n = 0.0f;
        if (b == 0.0f || this.c == 0.0f) {
            return new aanq(this, new aasx(new float[] { 0.0f, 0.0f }, 2));
        }
        Matrix.multiplyMM(this.e, 0, (float[])foq.b, 0, this.a.a, 0);
        Matrix.invertM(this.d, 0, this.e, 0);
        final float[][] f = this.f;
        final float[] array = f[0];
        array[2] = -1.0f;
        final aasx aasx = new aasx(array, 4);
        final aasx aasx2 = new aasx(f[1], 4);
        final float[] d = this.d;
        if (aasx.b == 4) {
            Matrix.multiplyMV(aasx2.a, 0, d, 0, aasx.a, 0);
            final float[] array2 = this.f[2];
            final float[] d2 = this.d;
            array2[0] = -d2[12];
            array2[1] = -d2[13];
            array2[2] = -d2[14];
            final aasx aasx3 = new aasx(array2, 4);
            final float a = aasx2.a(aasx);
            if (a != 0.0f) {
                n = aasx3.a(aasx) / a;
            }
            final aasx aasx4 = new aasx(this.f[3], 4);
            final float[] a2 = aasx4.a;
            for (int i = 0; i < aasx2.b; ++i) {
                a2[i] = aasx2.a[i] * n;
            }
            System.arraycopy(this.d, 12, this.f[4], 0, 3);
            final float[][] f2 = this.f;
            final aasx aasx5 = new aasx(f2[4], 4);
            final aasx aasx6 = new aasx(f2[5], 4);
            for (int j = 0; j < aasx4.b; ++j) {
                aasx6.a[j] = aasx4.a[j] + aasx5.a[j];
            }
            final float[] a3 = aasx6.a;
            return new aanq(this, new aasx(new float[] { a3[0], a3[1] }, 2));
        }
        throw new RuntimeException("Cannot be multiplied by matrix unless the vector size is 4");
    }
}
