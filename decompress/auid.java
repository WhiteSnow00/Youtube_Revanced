// 
// Decompiled by Procyon v0.6.0
// 

public final class auid extends auht
{
    private static final long serialVersionUID = -3205227092378684157L;
    private final int b;
    
    public auid(final aufv aufv, final aufx aufx) {
        super(aufv, aufx);
        this.b = 100;
    }
    
    public final int a(final long n, final long n2) {
        return super.a.a(n, n2) / 100;
    }
    
    public final long b(final long n, final int n2) {
        return super.a.c(n, n2 * 100L);
    }
    
    public final long c(final long n, long i) {
        i = atoc.i(i, 100);
        return super.a.c(n, i);
    }
    
    public final long d(final long n, final long n2) {
        return super.a.d(n, n2) / 100L;
    }
    
    public final long e() {
        return super.a.e() * 100L;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof auid) {
            final auid auid = (auid)o;
            if (super.a.equals(auid.a) && ((auhr)this).d == ((auhr)auid).d) {
                final int b = auid.b;
                return true;
            }
        }
        return false;
    }
    
    public final int hashCode() {
        return ((auhr)this).d.hashCode() + 100 + super.a.hashCode();
    }
}
