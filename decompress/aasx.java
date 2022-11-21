// 
// Decompiled by Procyon v0.6.0
// 

public final class aasx
{
    public final float[] a;
    public final int b;
    
    public aasx(final float[] a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public final float a(final aasx aasx) {
        int i = 0;
        float n = 0.0f;
        while (i < this.b) {
            n += this.a[i] * aasx.a[i];
            ++i;
        }
        return n;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        int n = 0;
        int n2;
        while (true) {
            n2 = this.b - 1;
            if (n >= n2) {
                break;
            }
            final float n3 = this.a[n];
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(n3);
            sb2.append(", ");
            sb.append(sb2.toString());
            ++n;
        }
        sb.append(this.a[n2]);
        return sb.toString();
    }
}
