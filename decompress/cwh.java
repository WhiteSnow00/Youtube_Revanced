// 
// Decompiled by Procyon v0.6.0
// 

public final class cwh
{
    public final String a;
    public final String b;
    public final float c;
    public final int d;
    public final float e;
    public final float f;
    public final int g;
    public final int h;
    public final float i;
    public final boolean j;
    public final int k;
    
    public cwh(final String a, final String b, final float c, final int k, final int d, final float e, final float f, final int g, final int h, final float i, final boolean j) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.k = k;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    @Override
    public final int hashCode() {
        final float n = (float)((this.a.hashCode() * 31 + this.b.hashCode()) * 31);
        final float c = this.c;
        final int k = this.k;
        if (k != 0) {
            final int n2 = (int)(n + c);
            final int d = this.d;
            final long n3 = Float.floatToRawIntBits(this.e);
            return (((n2 * 31 + (k - 1)) * 31 + d) * 31 + (int)(n3 ^ n3 >>> 32)) * 31 + this.g;
        }
        throw null;
    }
}
