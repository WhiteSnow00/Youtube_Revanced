// 
// Decompiled by Procyon v0.6.0
// 

public abstract class bph extends bpu
{
    public final long a;
    public final long b;
    public bpj c;
    public int[] d;
    
    public bph(final bbl bbl, final bbp bbp, final ayg ayg, final int n, final Object o, final long n2, final long n3, final long a, final long b, final long n4) {
        super(bbl, bbp, ayg, n, o, n2, n3, n4);
        this.a = a;
        this.b = b;
    }
    
    public final int c(final int n) {
        return ((int[])dk.e((Object)this.d))[n];
    }
    
    public final bpj d() {
        final bpj c = this.c;
        dk.e((Object)c);
        return c;
    }
}
