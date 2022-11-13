import java.util.Arrays;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agfx implements afwo
{
    private final agge a;
    private final afxf b;
    
    public agfx(final agge a, final afxf b) {
        this.a = a;
        this.b = b;
    }
    
    public final byte[] a(byte[] a, final byte[] array) {
        a = this.a.a(a);
        return aevy.T(new byte[][] { a, this.b.a(aevy.T(new byte[][] { array, a, Arrays.copyOf(ByteBuffer.allocate(8).putLong(0L).array(), 8) })) });
    }
}
