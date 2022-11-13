import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bjr extends bjq
{
    final List e;
    
    public bjr(final bjm bjm, final long n, final long n2, final long n3, final long n4, final List list, final long n5, final List e, final long n6, final long n7) {
        super(bjm, n, n2, n3, n4, list, n5, n6, n7);
        this.e = e;
    }
    
    public final long c(final long n) {
        return this.e.size();
    }
    
    public final bjm g(final bjp bjp, final long n) {
        return this.e.get((int)(n - this.a));
    }
    
    public final boolean h() {
        return true;
    }
}
