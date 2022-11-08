// 
// Decompiled by Procyon v0.6.0
// 

final class bwq
{
    public bwi a;
    public long b;
    public long c;
    public int d;
    public int e;
    public long[] f;
    public int[] g;
    public int[] h;
    public long[] i;
    public boolean[] j;
    public boolean k;
    public boolean[] l;
    public final bar m;
    public boolean n;
    public long o;
    public boolean p;
    public lyp q;
    
    public bwq() {
        this.f = new long[0];
        this.g = new int[0];
        this.h = new int[0];
        this.i = new long[0];
        this.j = new boolean[0];
        this.l = new boolean[0];
        this.m = new bar();
    }
    
    public final long a(final int n) {
        return this.i[n];
    }
    
    public final void b(final int n) {
        this.m.C(n);
        this.k = true;
        this.n = true;
    }
    
    public final boolean c(final int n) {
        return this.k && this.l[n];
    }
}
