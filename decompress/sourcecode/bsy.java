// 
// Decompiled by Procyon v0.6.0
// 

public final class bsy
{
    public static final bsy a;
    public final int b;
    public final long c;
    public final long d;
    
    static {
        a = new bsy(-3, -9223372036854775807L, -1L);
    }
    
    private bsy(final int b, final long c, final long d) {
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static bsy a(final long n, final long n2) {
        return new bsy(-1, n, n2);
    }
    
    public static bsy b(final long n) {
        return new bsy(0, -9223372036854775807L, n);
    }
    
    public static bsy c(final long n, final long n2) {
        return new bsy(-2, n, n2);
    }
}
