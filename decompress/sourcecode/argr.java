import java.nio.ByteOrder;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class argr extends aglt
{
    public static void at(final ByteBuffer byteBuffer, final argr argr) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        argr.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }
    
    public final String Q() {
        final int b = this.b(10);
        if (b != 0) {
            return this.e(b + this.a);
        }
        return null;
    }
    
    public final boolean as() {
        final int b = this.b(14);
        return b != 0 && this.b.get(b + this.a) != 0;
    }
}
