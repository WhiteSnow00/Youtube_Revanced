import java.nio.ByteOrder;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aglq extends aglp
{
    public static final aglq a;
    
    static {
        a = new aglq();
    }
    
    public final ByteBuffer a(final int n) {
        return ByteBuffer.allocate(n).order(ByteOrder.LITTLE_ENDIAN);
    }
}
