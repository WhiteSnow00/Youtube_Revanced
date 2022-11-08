import java.nio.ByteOrder;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arhj extends aglt
{
    public static arhj at(final ByteBuffer byteBuffer) {
        final arhj arhj = new arhj();
        aw(byteBuffer, arhj);
        return arhj;
    }
    
    public static void aw(final ByteBuffer byteBuffer, final arhj arhj) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        arhj.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }
    
    public final int as() {
        final int b = this.b(22);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }
    
    public final agls au() {
        final agls agls = new agls();
        final int b = this.b(6);
        if (b != 0) {
            agls.a(b + this.a, this.b);
            return agls;
        }
        return null;
    }
    
    public final agls av() {
        final agls agls = new agls();
        final int b = this.b(8);
        if (b != 0) {
            agls.a(b + this.a, this.b);
            return agls;
        }
        return null;
    }
}
