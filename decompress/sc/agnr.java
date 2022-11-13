import java.nio.ByteOrder;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agnr extends agnq
{
    public static final agnr a;
    
    static {
        a = new agnr();
    }
    
    @Override
    public final ByteBuffer a(final int n) {
        return ByteBuffer.allocate(n).order(ByteOrder.LITTLE_ENDIAN);
    }
}
