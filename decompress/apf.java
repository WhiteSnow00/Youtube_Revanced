// 
// Decompiled by Procyon v0.6.0
// 

public final class apf
{
    public int a;
    public int b;
    public float c;
    public float d;
    public long e;
    public long f;
    public long g;
    public float h;
    public int i;
    
    public apf() {
        this.e = Long.MIN_VALUE;
        this.g = -1L;
        this.f = 0L;
    }
    
    public final float a(final long n) {
        final long e = this.e;
        if (n < e) {
            return 0.0f;
        }
        final long g = this.g;
        if (g >= 0L && n >= g) {
            final float h = this.h;
            return 1.0f - h + h * apg.a((n - g) / (float)this.i, 0.0f, 1.0f);
        }
        return apg.a((n - e) / (float)this.a, 0.0f, 1.0f) * 0.5f;
    }
}
