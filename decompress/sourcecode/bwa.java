// 
// Decompiled by Procyon v0.6.0
// 

public class bwa
{
    public final int d;
    
    public bwa(final int d) {
        this.d = d;
    }
    
    public static int e(final int n) {
        return n & 0xFFFFFF;
    }
    
    public static int f(final int n) {
        return n >> 24 & 0xFF;
    }
    
    public static String g(final int n) {
        final StringBuilder sb = new StringBuilder();
        sb.append((char)(n >> 24 & 0xFF));
        sb.append((char)(n >> 16 & 0xFF));
        sb.append((char)(n >> 8 & 0xFF));
        sb.append((char)(n & 0xFF));
        return sb.toString();
    }
    
    @Override
    public String toString() {
        return g(this.d);
    }
}
