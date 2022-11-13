// 
// Decompiled by Procyon v0.6.0
// 

public final class aauc implements aaud
{
    private final int c;
    
    public aauc(final int c) {
        this.c = c;
    }
    
    @Override
    public final double a(double n) {
        final int c = this.c;
        if (c == 0) {
            n = (double)aauc.b.clamp((Comparable)n);
            if (n <= 0.08333333333333333) {
                n = Math.sqrt(n * 3.0);
            }
            else {
                n = Math.log(n * 12.0 - 0.28466892) * 0.17883277 + 0.55991073;
            }
            return n;
        }
        if (c != 1) {
            n = (double)aauc.b.clamp((Comparable)n);
            return Math.pow((Math.pow(n, 0.1593017578125) * 18.8515625 + 0.8359375) / (Math.pow(n, 0.1593017578125) * 18.6875 + 1.0), 78.84375);
        }
        return Math.pow((double)aauc.a.clamp((Comparable)n), 0.45454545454545453);
    }
    
    @Override
    public final double b() {
        final int c = this.c;
        if (c == 0) {
            return 1000.0;
        }
        if (c != 1) {
            return 10000.0;
        }
        return 1.0;
    }
    
    @Override
    public final double c(double n) {
        final int c = this.c;
        if (c == 0) {
            n = (double)aauc.b.clamp((Comparable)n);
            double n2;
            if (n <= 0.5) {
                n *= n;
                n2 = 3.0;
            }
            else {
                n = Math.exp((n - 0.55991073) / 0.17883277) + 0.28466892;
                n2 = 12.0;
            }
            return n / n2;
        }
        if (c != 1) {
            n = Math.pow((double)aauc.a.clamp((Comparable)n), 0.012683313515655966);
            return Math.pow(Math.max(0.0, (-0.8359375 + n) / (18.8515625 - n * 18.6875)), 6.277394636015326);
        }
        return Math.pow((double)aauc.a.clamp((Comparable)n), 2.2);
    }
    
    @Override
    public final boolean d() {
        return this.c != 1;
    }
}
