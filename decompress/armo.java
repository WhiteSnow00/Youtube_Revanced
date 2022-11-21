import java.nio.ByteOrder;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class armo extends agpm
{
    public static void as(final ByteBuffer byteBuffer, final armo armo) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        armo.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }
}
