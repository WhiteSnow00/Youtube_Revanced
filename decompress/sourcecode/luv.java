// 
// Decompiled by Procyon v0.6.0
// 

public final class luv
{
    private long a;
    private volatile long b;
    
    public luv() {
        this.b = Long.MIN_VALUE;
    }
    
    public final long a(long n) {
        long b = n;
        if (this.b != Long.MIN_VALUE) {
            final long n2 = (this.b + 4294967296L) / 8589934592L;
            final long n3 = (-1L + n2) * 8589934592L + n;
            n = (b = n + n2 * 8589934592L);
            if (Math.abs(n3 - this.b) < Math.abs(n - this.b)) {
                b = n3;
            }
        }
        n = 1000000L * b / 90000L;
        if (this.b == Long.MIN_VALUE) {
            this.a = -n;
        }
        this.b = b;
        return n + this.a;
    }
    
    public final void b() {
        this.b = Long.MIN_VALUE;
    }
}
