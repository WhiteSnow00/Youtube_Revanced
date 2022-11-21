import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ablb
{
    public final int a;
    
    public ablb() {
        this.a = aamr.g(1);
    }
    
    public ablb(final int a) {
        this.a = a;
    }
    
    public ablb(final int... array) {
        int i = 0;
        int a = 0;
        while (i < 2) {
            a |= aamr.g(array[i]);
            ++i;
        }
        this.a = a;
    }
    
    public static ablb a() {
        return new ablb();
    }
    
    public final boolean b() {
        return (this.a & aamr.g(2)) != 0x0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o != null && (o instanceof ablb && this.a == ((ablb)o).a);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a });
    }
}
