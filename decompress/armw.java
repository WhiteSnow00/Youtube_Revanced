import java.nio.ByteOrder;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class armw extends agpm
{
    public static armw as(final ByteBuffer byteBuffer) {
        final armw armw = new armw();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        armw.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return armw;
    }
    
    public final boolean at() {
        final int b = this.b(16);
        boolean b2 = true;
        if (b != 0) {
            b2 = b2;
            if (this.b.get(b + this.a) == 0) {
                b2 = false;
            }
        }
        return b2;
    }
    
    public final agpm au() {
        final agpm agpm = new agpm();
        final int b = this.b(20);
        if (b != 0) {
            agpm.f(this.a(b + this.a), this.b);
            return agpm;
        }
        return null;
    }
    
    public final agpl av() {
        final agpl agpl = new agpl();
        final int b = this.b(26);
        if (b != 0) {
            agpl.a(b + this.a, this.b);
            return agpl;
        }
        return null;
    }
    
    public final agpm aw() {
        final agpm agpm = new agpm();
        final int b = this.b(14);
        if (b != 0) {
            agpm.f(this.a(b + this.a), this.b);
            return agpm;
        }
        return null;
    }
}
