// 
// Decompiled by Procyon v0.6.0
// 

public final class armj extends agpm
{
    public static int as(final agpk agpk, final long n, final long n2, final int n3, final int n4) {
        agpk.q(4);
        agpk.v(3, n4);
        agpk.v(2, n3);
        agpk.u(1, (int)n2);
        agpk.u(0, (int)n);
        return agpk.c();
    }
    
    public final agpm at() {
        final agpm agpm = new agpm();
        final int b = this.b(10);
        if (b != 0) {
            agpm.f(this.a(b + this.a), this.b);
            return agpm;
        }
        return null;
    }
    
    public final agpm au() {
        final agpm agpm = new agpm();
        final int b = this.b(8);
        if (b != 0) {
            agpm.f(this.a(b + this.a), this.b);
            return agpm;
        }
        return null;
    }
    
    @Override
    public final long p() {
        final int b = this.b(6);
        if (b != 0) {
            return (long)this.b.getInt(b + this.a) & 0xFFFFFFFFL;
        }
        return 0L;
    }
    
    @Override
    public final long q() {
        final int b = this.b(4);
        if (b != 0) {
            return (long)this.b.getInt(b + this.a) & 0xFFFFFFFFL;
        }
        return 0L;
    }
}
