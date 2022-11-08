// 
// Decompiled by Procyon v0.6.0
// 

public enum amaq implements agzm
{
    a("MDE_STREAM_OPTIMIZATIONS_RENDERER_LATENCY_UNKNOWN", 0, 0), 
    b("MDE_STREAM_OPTIMIZATIONS_RENDERER_LATENCY_NORMAL", 1, 1), 
    c("MDE_STREAM_OPTIMIZATIONS_RENDERER_LATENCY_LOW", 2, 2), 
    d("MDE_STREAM_OPTIMIZATIONS_RENDERER_LATENCY_ULTRA_LOW", 3, 3);
    
    public final int e;
    
    private amaq(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static agzo a() {
        return alyk.d;
    }
    
    public static amaq b(final int n) {
        if (n == 0) {
            return amaq.a;
        }
        if (n == 1) {
            return amaq.b;
        }
        if (n == 2) {
            return amaq.c;
        }
        if (n != 3) {
            return null;
        }
        return amaq.d;
    }
    
    @Override
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
