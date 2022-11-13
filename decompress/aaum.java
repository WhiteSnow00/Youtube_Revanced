// 
// Decompiled by Procyon v0.6.0
// 

public final class aaum extends aaun
{
    private final float[] a;
    private final float[] b;
    private final float[] c;
    
    public aaum(final float[] a, final float[] b) {
        if (a != null && b != null) {
            final int length = b.length;
            final int length2 = a.length;
            if (length2 == length && length2 >= 2) {
                final int n = length2 - 1;
                final float[] array = new float[n];
                final float[] c = new float[length2];
                final int n2 = 0;
                int n3;
                for (int i = 0; i < n; i = n3) {
                    n3 = i + 1;
                    final float n4 = a[n3] - a[i];
                    if (n4 <= 0.0f) {
                        throw new IllegalArgumentException("The control points must all have strictly increasing X values.");
                    }
                    array[i] = (b[n3] - b[i]) / n4;
                }
                c[0] = array[0];
                for (int j = 1; j < n; ++j) {
                    c[j] = (array[j - 1] + array[j]) * 0.5f;
                }
                c[n] = array[length2 - 2];
                for (int k = n2; k < n; ++k) {
                    final float n5 = array[k];
                    if (n5 == 0.0f) {
                        c[k + 1] = (c[k] = 0.0f);
                    }
                    else {
                        final float n6 = c[k] / n5;
                        final int n7 = k + 1;
                        final float n8 = c[n7] / n5;
                        if (n6 < 0.0f || n8 < 0.0f) {
                            throw new IllegalArgumentException("The control points must have monotonic Y values.");
                        }
                        final float n9 = (float)Math.hypot(n6, n8);
                        if (n9 > 3.0f) {
                            final float n10 = 3.0f / n9;
                            c[k] *= n10;
                            c[n7] *= n10;
                        }
                    }
                }
                this.a = a;
                this.b = b;
                this.c = c;
                return;
            }
        }
        throw new IllegalArgumentException("There must be at least two control points and the arrays must be of equal length.");
    }
    
    public final float a(float n) {
        int length = this.a.length;
        if (Float.isNaN(n)) {
            return n;
        }
        final float[] a = this.a;
        int n2 = 0;
        if (n <= a[0]) {
            return this.b[0];
        }
        --length;
        if (n >= a[length]) {
            return this.b[length];
        }
        while (true) {
            final float[] a2 = this.a;
            final int n3 = n2 + 1;
            final float n4 = a2[n3];
            if (n < n4) {
                final float n5 = a2[n2];
                final float n6 = n4 - n5;
                final float[] b = this.b;
                final float n7 = b[n2];
                final float n8 = (n - n5) / n6;
                final float n9 = n8 + n8;
                final float[] c = this.c;
                n = c[n2];
                final float n10 = b[n3];
                final float n11 = c[n3];
                final float n12 = 1.0f - n8;
                return (n7 * (n9 + 1.0f) + n * n6 * n8) * n12 * n12 + (n10 * (3.0f - n9) + n6 * n11 * (-1.0f + n8)) * n8 * n8;
            }
            if (n == n4) {
                return this.b[n3];
            }
            n2 = n3;
        }
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder("MonotoneCubicSpline{[");
        for (int length = this.a.length, i = 0; i < length; ++i) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append("(");
            sb.append(this.a[i]);
            sb.append(", ");
            sb.append(this.b[i]);
            sb.append(": ");
            sb.append(this.c[i]);
            sb.append(")");
        }
        sb.append("]}");
        return sb.toString();
    }
}
