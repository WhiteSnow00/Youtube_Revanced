import java.util.Arrays;
import java.util.Random;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atzh
{
    private static final Random b;
    public final byte[] a;
    
    static {
        b = new Random();
        a();
        a();
    }
    
    private atzh(final byte[] a) {
        this.a = a;
    }
    
    public static atzh a() {
        final byte[] array = new byte[16];
        atzh.b.nextBytes(array);
        return new atzh(array);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof atzh && Arrays.equals(this.a, ((atzh)o).a));
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }
}
