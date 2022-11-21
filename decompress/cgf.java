// 
// Decompiled by Procyon v0.6.0
// 

public final class cgf implements Comparable
{
    public final int a;
    public final String b;
    public final String c;
    private final int d;
    
    public cgf(final int a, final int d, final String b, final String c) {
        this.a = a;
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final /* bridge */ int compareTo(final Object o) {
        final cgf cgf = (cgf)o;
        cgf.getClass();
        int n;
        if ((n = this.a - cgf.a) == 0) {
            n = this.d - cgf.d;
        }
        return n;
    }
}
