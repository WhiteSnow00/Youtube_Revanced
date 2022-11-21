// 
// Decompiled by Procyon v0.6.0
// 

public final class ablf
{
    public final long a;
    public final able b;
    
    public ablf() {
    }
    
    public ablf(final long a, final able b) {
        this.a = a;
        this.b = b;
    }
    
    public static aqwt a() {
        final aqwt aqwt = new aqwt();
        aqwt.e(0L);
        aqwt.d();
        aqwt.f(able.a().a());
        return aqwt;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof ablf) {
            final ablf ablf = (ablf)o;
            if (this.a == ablf.a && this.b.equals(ablf.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        return ((((int)(a ^ a >>> 32) ^ 0xF4243) * 1000003 ^ 0x4D5) * 1000003 ^ this.b.hashCode()) * 1000003;
    }
    
    @Override
    public final String toString() {
        final long a = this.a;
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("PrefetchPrebufferParameters{mediaDurationMs=");
        sb.append(a);
        sb.append(", enableAutoMediaDuration=false, prefetchPlaybackContextWrapper=");
        sb.append(value);
        sb.append(", expectedViewport=null}");
        return sb.toString();
    }
}
