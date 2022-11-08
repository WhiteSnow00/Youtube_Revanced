import java.nio.ByteOrder;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arhf extends aglt
{
    public static void as(final ByteBuffer byteBuffer, final arhf arhf) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        arhf.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }
}
