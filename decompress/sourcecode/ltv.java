// 
// Decompiled by Procyon v0.6.0
// 

final class ltv
{
    public final int a;
    public final long[] b;
    public final int[] c;
    public final int d;
    public final long[] e;
    public final int[] f;
    
    public ltv(final long[] b, final int[] c, final int d, final long[] e, final int[] f) {
        final int length = e.length;
        final int length2 = c.length;
        final boolean b2 = true;
        jfi.S(length2 == length);
        final int length3 = b.length;
        jfi.S(length3 == length);
        jfi.S(f.length == length && b2);
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.a = length3;
    }
}
