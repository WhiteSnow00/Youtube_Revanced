// 
// Decompiled by Procyon v0.6.0
// 

public final class ahem
{
    static final int a;
    static final int b;
    static final int c;
    static final int d;
    
    static {
        a = c(1, 3);
        b = c(1, 4);
        c = c(2, 0);
        d = c(3, 2);
    }
    
    public static int a(final int n) {
        return n >>> 3;
    }
    
    public static int b(final int n) {
        return n & 0x7;
    }
    
    public static int c(final int n, final int n2) {
        return n << 3 | n2;
    }
}
