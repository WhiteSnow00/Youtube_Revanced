// 
// Decompiled by Procyon v0.6.0
// 

public final class arha extends aglt
{
    public static int as(final aglr aglr, final long n, final long n2, final int n3, final int n4) {
        aglr.q(4);
        aglr.v(3, n4);
        aglr.v(2, n3);
        aglr.u(1, (int)n2);
        aglr.u(0, (int)n);
        return aglr.c();
    }
    
    public final aglt at() {
        final aglt aglt = new aglt();
        final int b = this.b(10);
        if (b != 0) {
            aglt.f(this.a(b + this.a), this.b);
            return aglt;
        }
        return null;
    }
    
    public final aglt au() {
        final aglt aglt = new aglt();
        final int b = this.b(8);
        if (b != 0) {
            aglt.f(this.a(b + this.a), this.b);
            return aglt;
        }
        return null;
    }
    
    public final long p() {
        final int b = this.b(6);
        if (b != 0) {
            return (long)this.b.getInt(b + this.a) & 0xFFFFFFFFL;
        }
        return 0L;
    }
    
    public final long q() {
        final int b = this.b(4);
        if (b != 0) {
            return (long)this.b.getInt(b + this.a) & 0xFFFFFFFFL;
        }
        return 0L;
    }
}
