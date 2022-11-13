import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ftu
{
    public final int a;
    public final int b;
    
    private ftu(final int a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public static ftu a(final int n) {
        return new ftu(n, 0);
    }
    
    public static ftu b() {
        return new ftu(8, 1);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof ftu)) {
            return false;
        }
        final ftu ftu = (ftu)o;
        return this.a == ftu.a && this.b == ftu.b;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b });
    }
}
