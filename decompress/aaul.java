// 
// Decompiled by Procyon v0.6.0
// 

public final class aaul extends aaun
{
    private final float[] a;
    private final float[] b;
    private final float[] c;
    
    public aaul(final float[] a, final float[] b) {
        final int length = a.length;
        if (length == b.length) {
            final int n = length - 1;
            this.c = new float[n];
            int n2;
            for (int i = 0; i < n; i = n2) {
                final float[] c = this.c;
                n2 = i + 1;
                c[i] = (b[n2] - b[i]) / (a[n2] - a[i]);
            }
            this.a = a;
            this.b = b;
            return;
        }
        throw new IllegalArgumentException("There must be at least two control points and the arrays must be of equal length.");
    }
    
    public final float a(final float n) {
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
                return this.b[n2] + this.c[n2] * (n - a2[n2]);
            }
            if (n == n4) {
                return this.b[n3];
            }
            n2 = n3;
        }
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder("LinearSpline{[");
        for (int length = this.a.length, i = 0; i < length; ++i) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append("(");
            sb.append(this.a[i]);
            sb.append(", ");
            sb.append(this.b[i]);
            if (i < length - 1) {
                sb.append(": ");
                sb.append(this.c[i]);
            }
            sb.append(")");
        }
        sb.append("]}");
        return sb.toString();
    }
}
