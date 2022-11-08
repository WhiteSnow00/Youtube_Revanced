// 
// Decompiled by Procyon v0.6.0
// 

public final class dzb extends dzc implements dyz
{
    private final long e;
    private long f;
    private long g;
    private long h;
    
    public dzb(final int n) {
        this.f = Long.MIN_VALUE;
        this.g = Long.MIN_VALUE;
        this.h = Long.MIN_VALUE;
        this.e = n;
    }
    
    @Override
    public final float a(final long h) {
        if (this.h == Long.MIN_VALUE) {
            this.f = h;
            this.h = h;
            this.g = h + this.e * 1000000L;
            return 0.0f;
        }
        final long g = this.g;
        this.h = h;
        if (h >= g) {
            return 1.0f;
        }
        final long f = this.f;
        return (h - f) / (float)(g - f);
    }
    
    @Override
    public final boolean b() {
        return this.h >= this.g;
    }
}
