import java.nio.ByteOrder;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arme extends agpm
{
    public static arme au(final ByteBuffer byteBuffer) {
        final arme arme = new arme();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        arme.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return arme;
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
    
    public final agpm av() {
        final agpm agpm = new agpm();
        final int b = this.b(20);
        if (b != 0) {
            agpm.f(this.a(b + this.a), this.b);
            return agpm;
        }
        return null;
    }
    
    public final agpm aw() {
        final agpm agpm = new agpm();
        final int b = this.b(12);
        if (b != 0) {
            agpm.f(this.a(b + this.a), this.b);
            return agpm;
        }
        return null;
    }
    
    public final agpm ax() {
        final agpm agpm = new agpm();
        final int b = this.b(14);
        if (b != 0) {
            agpm.f(this.a(b + this.a), this.b);
            return agpm;
        }
        return null;
    }
    
    public final agpm ay() {
        final agpm agpm = new agpm();
        final int b = this.b(16);
        if (b != 0) {
            agpm.f(this.a(b + this.a), this.b);
            return agpm;
        }
        return null;
    }
}
