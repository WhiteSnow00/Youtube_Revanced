// 
// Decompiled by Procyon v0.6.0
// 

public abstract class bpu extends bpm
{
    public final long n;
    
    public bpu(final bbl bbl, final bbp bbp, final ayg ayg, final int n, final Object o, final long n2, final long n3, final long n4) {
        super(bbl, bbp, 1, ayg, n, o, n2, n3);
        dk.d((Object)ayg);
        this.n = n4;
    }
    
    public long f() {
        final long n = this.n;
        if (n != -1L) {
            return n + 1L;
        }
        return -1L;
    }
    
    public abstract boolean h();
}
