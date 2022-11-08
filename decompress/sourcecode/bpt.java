// 
// Decompiled by Procyon v0.6.0
// 

public abstract class bpt extends bpl
{
    public final long n;
    
    public bpt(final bbk bbk, final bbo bbo, final ayf ayf, final int n, final Object o, final long n2, final long n3, final long n4) {
        super(bbk, bbo, 1, ayf, n, o, n2, n3);
        dk.d((Object)ayf);
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
