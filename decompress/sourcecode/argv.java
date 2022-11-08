import java.nio.ByteOrder;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class argv extends aglt
{
    public static argv au(final ByteBuffer byteBuffer) {
        final argv argv = new argv();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        argv.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return argv;
    }
    
    public final float as() {
        final int b = this.b(8);
        if (b != 0) {
            return this.b.getFloat(b + this.a);
        }
        return 0.0f;
    }
    
    public final long at() {
        final int b = this.b(18);
        if (b != 0) {
            return (long)this.b.getInt(b + this.a) & 0xFFFFFFFFL;
        }
        return 0L;
    }
    
    public final aglt av() {
        final aglt aglt = new aglt();
        final int b = this.b(20);
        if (b != 0) {
            aglt.f(this.a(b + this.a), this.b);
            return aglt;
        }
        return null;
    }
    
    public final aglt aw() {
        final aglt aglt = new aglt();
        final int b = this.b(12);
        if (b != 0) {
            aglt.f(this.a(b + this.a), this.b);
            return aglt;
        }
        return null;
    }
    
    public final aglt ax() {
        final aglt aglt = new aglt();
        final int b = this.b(14);
        if (b != 0) {
            aglt.f(this.a(b + this.a), this.b);
            return aglt;
        }
        return null;
    }
    
    public final aglt ay() {
        final aglt aglt = new aglt();
        final int b = this.b(16);
        if (b != 0) {
            aglt.f(this.a(b + this.a), this.b);
            return aglt;
        }
        return null;
    }
}
