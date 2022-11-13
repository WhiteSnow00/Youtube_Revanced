// 
// Decompiled by Procyon v0.6.0
// 

public enum alwb implements ahbl
{
    a("LOGGING_QUEUE_TYPE_UNKNOWN", 0, 0), 
    b("LOGGING_QUEUE_TYPE_PIXIE_DUST", 1, 1), 
    c("LOGGING_QUEUE_TYPE_CACHE_METADATA", 2, 2);
    
    private static final alwb[] e;
    public final int d;
    
    private alwb(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static ahbn a() {
        return alua.k;
    }
    
    public static alwb b(final int n) {
        if (n == 0) {
            return alwb.a;
        }
        if (n == 1) {
            return alwb.b;
        }
        if (n != 2) {
            return null;
        }
        return alwb.c;
    }
    
    public final int getNumber() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}
