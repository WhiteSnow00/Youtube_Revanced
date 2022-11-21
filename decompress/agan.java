import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class agan
{
    int[] a;
    public final int b;
    
    public agan(final byte[] array, final int b) {
        if (array.length == 32) {
            this.a = agaj.d(array);
            this.b = b;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }
    
    public abstract int a();
    
    public abstract int[] b(final int[] p0, final int p1);
    
    final ByteBuffer c(final byte[] array, int i) {
        final int[] b = this.b(agaj.d(array), i);
        final int[] array2 = b.clone();
        agaj.c(array2);
        for (i = 0; i < 16; ++i) {
            b[i] += array2[i];
        }
        final ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(b, 0, 16);
        return order;
    }
}
