import android.opengl.Matrix;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aari
{
    public final aatv a;
    public float b;
    public float c;
    private final float[] d;
    private final float[] e;
    private final float[][] f;
    
    public aari(final aatv a, final float n, final float n2) {
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
    
    public final aalt b(final fon fon) {
        final float b = this.b;
        float n = 0.0f;
        if (b == 0.0f || this.c == 0.0f) {
            return new aalt(this, new aarh(new float[] { 0.0f, 0.0f }, 2));
        }
        Matrix.multiplyMM(this.e, 0, (float[])fon.b, 0, this.a.a, 0);
        Matrix.invertM(this.d, 0, this.e, 0);
        final float[][] f = this.f;
        final float[] array = f[0];
        array[2] = -1.0f;
        final aarh aarh = new aarh(array, 4);
        final aarh aarh2 = new aarh(f[1], 4);
        final float[] d = this.d;
        if (aarh.b == 4) {
            Matrix.multiplyMV(aarh2.a, 0, d, 0, aarh.a, 0);
            final float[] array2 = this.f[2];
            final float[] d2 = this.d;
            array2[0] = -d2[12];
            array2[1] = -d2[13];
            array2[2] = -d2[14];
            final aarh aarh3 = new aarh(array2, 4);
            final float a = aarh2.a(aarh);
            if (a != 0.0f) {
                n = aarh3.a(aarh) / a;
            }
            final aarh aarh4 = new aarh(this.f[3], 4);
            final float[] a2 = aarh4.a;
            for (int i = 0; i < aarh2.b; ++i) {
                a2[i] = aarh2.a[i] * n;
            }
            System.arraycopy(this.d, 12, this.f[4], 0, 3);
            final float[][] f2 = this.f;
            final aarh aarh5 = new aarh(f2[4], 4);
            final aarh aarh6 = new aarh(f2[5], 4);
            for (int j = 0; j < aarh4.b; ++j) {
                aarh6.a[j] = aarh4.a[j] + aarh5.a[j];
            }
            final float[] a3 = aarh6.a;
            return new aalt(this, new aarh(new float[] { a3[0], a3[1] }, 2));
        }
        throw new RuntimeException("Cannot be multiplied by matrix unless the vector size is 4");
    }
}
