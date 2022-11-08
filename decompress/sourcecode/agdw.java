import java.util.Arrays;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agdw implements afum
{
    private final aged a;
    private final afve b;
    
    public agdw(final aged a, final afve b) {
        this.a = a;
        this.b = b;
    }
    
    public final byte[] a(byte[] copy, final byte[] array) {
        final byte[] a = this.a.a(copy);
        copy = Arrays.copyOf(ByteBuffer.allocate(8).putLong(0L).array(), 8);
        return aety.S(new byte[][] { a, this.b.a(aety.S(new byte[][] { array, a, copy })) });
    }
}
