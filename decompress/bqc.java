import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class bqc implements bxl
{
    private final long a;
    private final afgh b;
    
    public bqc(final long a, final afgh b) {
        this.a = a;
        this.b = b;
    }
    
    public final int a() {
        return 1;
    }
    
    public final int b(final long n) {
        if (this.a > n) {
            return 0;
        }
        return -1;
    }
    
    public final long c(final int n) {
        bad.d(n == 0);
        return this.a;
    }
    
    public final List d(final long n) {
        afgh afgh;
        if (n >= this.a) {
            afgh = this.b;
        }
        else {
            afgh = afgh.q();
        }
        return afgh;
    }
}
