import java.nio.ByteOrder;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arhh extends aglt
{
    public static arhh as(final ByteBuffer byteBuffer) {
        final arhh arhh = new arhh();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        arhh.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return arhh;
    }
    
    public final aglt at() {
        final aglt aglt = new aglt();
        final int b = this.b(6);
        if (b != 0) {
            aglt.f(this.a(b + this.a), this.b);
            return aglt;
        }
        return null;
    }
    
    public final aglt au() {
        final aglt aglt = new aglt();
        final int b = this.b(8);
        if (b != 0) {
            aglt.f(this.a(b + this.a), this.b);
            return aglt;
        }
        return null;
    }
    
    public final aglt av() {
        final aglt aglt = new aglt();
        final int b = this.b(4);
        if (b != 0) {
            aglt.f(this.a(b + this.a), this.b);
            return aglt;
        }
        return null;
    }
}
