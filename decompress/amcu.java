// 
// Decompiled by Procyon v0.6.0
// 

public enum amcu implements ahbl
{
    a("MDE_STREAM_OPTIMIZATIONS_RENDERER_LATENCY_UNKNOWN", 0, 0), 
    b("MDE_STREAM_OPTIMIZATIONS_RENDERER_LATENCY_NORMAL", 1, 1), 
    c("MDE_STREAM_OPTIMIZATIONS_RENDERER_LATENCY_LOW", 2, 2), 
    d("MDE_STREAM_OPTIMIZATIONS_RENDERER_LATENCY_ULTRA_LOW", 3, 3);
    
    private static final amcu[] f;
    public final int e;
    
    private amcu(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static ahbn a() {
        return alyw.e;
    }
    
    public static amcu b(final int n) {
        if (n == 0) {
            return amcu.a;
        }
        if (n == 1) {
            return amcu.b;
        }
        if (n == 2) {
            return amcu.c;
        }
        if (n != 3) {
            return null;
        }
        return amcu.d;
    }
    
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
