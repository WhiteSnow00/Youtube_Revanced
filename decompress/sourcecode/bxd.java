// 
// Decompiled by Procyon v0.6.0
// 

abstract class bxd
{
    public final bwx b;
    public buc c;
    public btl d;
    public bwz e;
    public long f;
    public long g;
    public long h;
    public int i;
    public int j;
    public bxb k;
    public long l;
    public boolean m;
    public boolean n;
    
    public bxd() {
        this.b = new bwx();
        this.k = new bxb();
    }
    
    protected abstract long a(final bar p0);
    
    protected void b(final boolean b) {
        int i;
        if (b) {
            this.k = new bxb();
            this.g = 0L;
            i = 0;
        }
        else {
            i = 1;
        }
        this.i = i;
        this.f = -1L;
        this.h = 0L;
    }
    
    protected abstract boolean c(final bar p0, final long p1, final bxb p2);
    
    protected final long e(final long n) {
        return n * 1000000L / this.j;
    }
    
    protected final long f(final long n) {
        return this.j * n / 1000000L;
    }
    
    protected void g(final long h) {
        this.h = h;
    }
}
