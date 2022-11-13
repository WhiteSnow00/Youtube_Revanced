// 
// Decompiled by Procyon v0.6.0
// 

public final class cgc implements Comparable
{
    public final int a;
    public final String b;
    public final String c;
    private final int d;
    
    public cgc(final int a, final int d, final String b, final String c) {
        this.a = a;
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final /* bridge */ int compareTo(final Object o) {
        final cgc cgc = (cgc)o;
        cgc.getClass();
        int n;
        if ((n = this.a - cgc.a) == 0) {
            n = this.d - cgc.d;
        }
        return n;
    }
}
