import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bjq extends bjp
{
    final List e;
    
    public bjq(final bjl bjl, final long n, final long n2, final long n3, final long n4, final List list, final long n5, final List e, final long n6, final long n7) {
        super(bjl, n, n2, n3, n4, list, n5, n6, n7);
        this.e = e;
    }
    
    public final long c(final long n) {
        return this.e.size();
    }
    
    public final bjl g(final bjo bjo, final long n) {
        return this.e.get((int)(n - this.a));
    }
    
    public final boolean h() {
        return true;
    }
}
