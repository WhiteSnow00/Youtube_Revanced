import java.nio.ByteOrder;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arhn extends aglt
{
    public static arhn as(final ByteBuffer byteBuffer) {
        final arhn arhn = new arhn();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        arhn.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return arhn;
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
    
    public final aglt au() {
        final aglt aglt = new aglt();
        final int b = this.b(20);
        if (b != 0) {
            aglt.f(this.a(b + this.a), this.b);
            return aglt;
        }
        return null;
    }
    
    public final agls av() {
        final agls agls = new agls();
        final int b = this.b(26);
        if (b != 0) {
            agls.a(b + this.a, this.b);
            return agls;
        }
        return null;
    }
    
    public final aglt aw() {
        final aglt aglt = new aglt();
        final int b = this.b(14);
        if (b != 0) {
            aglt.f(this.a(b + this.a), this.b);
            return aglt;
        }
        return null;
    }
}
