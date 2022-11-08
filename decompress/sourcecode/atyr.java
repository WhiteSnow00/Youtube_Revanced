import java.util.Arrays;
import java.util.Random;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atyr
{
    private static final Random b;
    public final byte[] a;
    
    static {
        b = new Random();
        a();
        a();
    }
    
    private atyr(final byte[] a) {
        this.a = a;
    }
    
    public static atyr a() {
        final byte[] array = new byte[16];
        atyr.b.nextBytes(array);
        return new atyr(array);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof atyr && Arrays.equals(this.a, ((atyr)o).a));
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }
}
