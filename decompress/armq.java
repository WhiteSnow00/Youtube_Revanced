import java.nio.ByteOrder;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class armq extends agpm
{
    public static armq as(final ByteBuffer byteBuffer) {
        final armq armq = new armq();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        armq.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return armq;
    }
    
    public final agpm at() {
        final agpm agpm = new agpm();
        final int b = this.b(6);
        if (b != 0) {
            agpm.f(this.a(b + this.a), this.b);
            return agpm;
        }
        return null;
    }
    
    public final agpm au() {
        final agpm agpm = new agpm();
        final int b = this.b(8);
        if (b != 0) {
            agpm.f(this.a(b + this.a), this.b);
            return agpm;
        }
        return null;
    }
    
    public final agpm av() {
        final agpm agpm = new agpm();
        final int b = this.b(4);
        if (b != 0) {
            agpm.f(this.a(b + this.a), this.b);
            return agpm;
        }
        return null;
    }
}
