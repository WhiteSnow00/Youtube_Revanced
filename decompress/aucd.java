import java.util.Arrays;
import java.util.Random;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aucd
{
    private static final Random b;
    public final byte[] a;
    
    static {
        b = new Random();
        a();
        a();
    }
    
    private aucd(final byte[] a) {
        this.a = a;
    }
    
    public static aucd a() {
        final byte[] array = new byte[16];
        aucd.b.nextBytes(array);
        return new aucd(array);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof aucd && Arrays.equals(this.a, ((aucd)o).a));
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }
}
