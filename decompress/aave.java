// 
// Decompiled by Procyon v0.6.0
// 

public final class aave
{
    public static final float[] a;
    public static final float[] b;
    public static final float[] c;
    public final aavh d;
    public final aavh e;
    public final int f;
    public final int g;
    
    static {
        a = new float[] { 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f };
        b = new float[] { 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f };
        c = new float[] { 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f };
    }
    
    public aave(final float[] array, final float[] array2, final int g) {
        array.getClass();
        array2.getClass();
        final int length = array.length;
        final boolean b = false;
        adme.K(length % 3 == 0);
        final int length2 = array2.length;
        adme.K(0x1 == ((length2 & 0x1) ^ 0x1));
        final int f = length / 3;
        boolean b2 = b;
        if (f == length2 >> 1) {
            b2 = true;
        }
        adme.K(b2);
        this.f = f;
        this.g = g;
        this.d = new aavh(array, 3);
        this.e = new aavh(array2, 2);
    }
    
    public static aave a(float n, float n2, final float[] array) {
        int n3;
        int n4;
        if (n > n2) {
            n3 = (int)Math.max(1.0f, 10.0f / n * n2);
            n4 = 10;
        }
        else {
            n4 = (int)Math.max(1.0f, 10.0f / n2 * n);
            n3 = 10;
        }
        n /= 2.0f;
        n2 /= 2.0f;
        final float n5 = -n;
        final float n6 = -n2;
        return new aave(d(new float[] { n5, n6, 0.0f, n5, n2, 0.0f, n, n6, 0.0f, n, n2, 0.0f }, 3, n4, n3), d(array, 2, n4, n3), 5);
    }
    
    public static aave c(final float n) {
        final float[] array = new float[66];
        for (int i = 1; i < 21; ++i) {
            final float n2 = (float)i;
            final int n3 = i * 3;
            final int n4 = n3 + 1;
            final double n5 = n;
            final float n6 = n2 / 20.0f;
            final double n7 = (n6 + n6) * 3.1415927f;
            final double sin = Math.sin(n7);
            Double.isNaN(n5);
            array[n3] = (float)(sin * n5);
            final double cos = Math.cos(n7);
            Double.isNaN(n5);
            array[n4] = (float)(n5 * cos);
            array[n4 + 1] = 0.0f;
        }
        System.arraycopy(array, 3, array, 63, 3);
        return new aave(array, new float[44], 6);
    }
    
    private static float[] d(final float[] array, final int n, final int n2, final int n3) {
        final float[] array2 = new float[(n3 + n3) * (n2 + 1) * n];
        int i = 0;
        int n4 = 0;
        while (i < n3) {
            for (int j = 0; j <= n2; ++j) {
                for (int k = 0; k < 2; ++k) {
                    final float n5 = (float)j;
                    final float n6 = (float)n2;
                    final float n7 = (float)i;
                    final float n8 = (float)n3;
                    float n10;
                    final float n9 = n10 = n5 / n6;
                    if (i % 2 == 1) {
                        n10 = 1.0f - n9;
                    }
                    for (int l = 0; l < n; ++l) {
                        final float n11 = (k + n7) / n8;
                        final float n12 = array[l];
                        final float n13 = 1.0f - n10;
                        final float n14 = 1.0f - n11;
                        array2[n4] = n12 * n13 * n14 + array[n + l] * n13 * n11 + array[n + n + l] * n10 * n14 + array[n * 3 + l] * n10 * n11;
                        ++n4;
                    }
                }
            }
            ++i;
        }
        return array2;
    }
    
    public final void b() {
        this.d.b();
        this.e.b();
    }
}
