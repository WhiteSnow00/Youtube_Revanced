// 
// Decompiled by Procyon v0.6.0
// 

public enum amop implements agzm
{
    a("NETWORK_QUALITY_OBSERVATION_SOURCE_UNKNOWN", 0, 0), 
    b("NETWORK_QUALITY_OBSERVATION_SOURCE_HTTP", 1, 1), 
    c("NETWORK_QUALITY_OBSERVATION_SOURCE_TCP", 2, 2), 
    d("NETWORK_QUALITY_OBSERVATION_SOURCE_QUIC", 3, 3), 
    e("NETWORK_QUALITY_OBSERVATION_SOURCE_HTTP_CACHED_ESTIMATE", 4, 4), 
    f("NETWORK_QUALITY_OBSERVATION_SOURCE_DEFAULT_HTTP_FROM_PLATFORM", 5, 5), 
    g("NETWORK_QUALITY_OBSERVATION_SOURCE_DEPRECATED_HTTP_EXTERNAL_ESTIMATE", 6, 6), 
    h("NETWORK_QUALITY_OBSERVATION_SOURCE_TRANSPORT_CACHED_ESTIMATE", 7, 7), 
    i("NETWORK_QUALITY_OBSERVATION_SOURCE_DEFAULT_TRANSPORT_FROM_PLATFORM", 8, 8), 
    j("NETWORK_QUALITY_OBSERVATION_SOURCE_H2_PINGS", 9, 9);
    
    public final int k;
    
    private amop(final String s, final int n, final int k) {
        this.k = k;
    }
    
    public static agzo a() {
        return amom.d;
    }
    
    public static amop b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 9: {
                return amop.j;
            }
            case 8: {
                return amop.i;
            }
            case 7: {
                return amop.h;
            }
            case 6: {
                return amop.g;
            }
            case 5: {
                return amop.f;
            }
            case 4: {
                return amop.e;
            }
            case 3: {
                return amop.d;
            }
            case 2: {
                return amop.c;
            }
            case 1: {
                return amop.b;
            }
            case 0: {
                return amop.a;
            }
        }
    }
    
    @Override
    public final int getNumber() {
        return this.k;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.k);
    }
}
