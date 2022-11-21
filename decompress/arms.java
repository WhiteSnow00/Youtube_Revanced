import java.nio.ByteOrder;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arms extends agpm
{
    public static arms at(final ByteBuffer byteBuffer) {
        final arms arms = new arms();
        aw(byteBuffer, arms);
        return arms;
    }
    
    public static void aw(final ByteBuffer byteBuffer, final arms arms) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        arms.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }
    
    public final int as() {
        final int b = this.b(22);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }
    
    public final agpl au() {
        final agpl agpl = new agpl();
        final int b = this.b(6);
        if (b != 0) {
            agpl.a(b + this.a, this.b);
            return agpl;
        }
        return null;
    }
    
    public final agpl av() {
        final agpl agpl = new agpl();
        final int b = this.b(8);
        if (b != 0) {
            agpl.a(b + this.a, this.b);
            return agpl;
        }
        return null;
    }
}
