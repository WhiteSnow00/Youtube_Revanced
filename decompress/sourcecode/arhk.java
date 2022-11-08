import java.nio.ByteOrder;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arhk extends aglt
{
    public static arhk at(final ByteBuffer byteBuffer) {
        final arhk arhk = new arhk();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        arhk.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return arhk;
    }
    
    public final int H() {
        final int b = this.b(6);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }
    
    public final int as() {
        final int b = this.b(4);
        if (b != 0) {
            return this.d(b);
        }
        return 0;
    }
    
    public final void au(final arhl arhl, final int n) {
        final int b = this.b(4);
        if (b != 0) {
            arhl.f(this.a(this.c(b) + n * 4), this.b);
        }
    }
}
