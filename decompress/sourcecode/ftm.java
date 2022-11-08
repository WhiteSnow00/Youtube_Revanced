import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ftm
{
    public final int a;
    public final int b;
    
    private ftm(final int a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public static ftm a(final int n) {
        return new ftm(n, 0);
    }
    
    public static ftm b() {
        return new ftm(8, 1);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof ftm)) {
            return false;
        }
        final ftm ftm = (ftm)o;
        return this.a == ftm.a && this.b == ftm.b;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b });
    }
}
