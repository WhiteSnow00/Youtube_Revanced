// 
// Decompiled by Procyon v0.6.0
// 

final class lyq
{
    public lyj a;
    public long b;
    public long c;
    public int d;
    public int e;
    public long[] f;
    public int[] g;
    public int[] h;
    public int[] i;
    public int[] j;
    public long[] k;
    public boolean[] l;
    public boolean m;
    public boolean[] n;
    public lyp o;
    public final bar p;
    public boolean q;
    public long r;
    
    public lyq() {
        this.f = new long[0];
        this.g = new int[0];
        this.h = new int[0];
        this.i = new int[0];
        this.j = new int[0];
        this.k = new long[0];
        this.l = new boolean[0];
        this.n = new boolean[0];
        this.p = new bar();
    }
    
    public final long a(final int n) {
        return this.k[n] + this.j[n];
    }
    
    public final void b(final int n) {
        this.p.C(n);
        this.m = true;
        this.q = true;
    }
    
    public final boolean c(final int n) {
        return this.m && this.n[n];
    }
}
