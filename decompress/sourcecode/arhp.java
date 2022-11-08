import java.nio.ByteOrder;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arhp extends aglt
{
    public static arhp aw(final ByteBuffer byteBuffer) {
        final arhp arhp = new arhp();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        arhp.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return arhp;
    }
    
    public static int ax(final aglr aglr, final int n, final long n2, final int n3, final int n4) {
        aglr.q(5);
        aglr.u(4, 0);
        aglr.v(3, n4);
        aglr.v(2, n3);
        aglr.u(1, (int)n2);
        aglr.v(0, n);
        return aglr.c();
    }
    
    public final long as() {
        final int b = this.b(12);
        if (b != 0) {
            return (long)this.b.getInt(b + this.a) & 0xFFFFFFFFL;
        }
        return 0L;
    }
    
    public final long at() {
        final int b = this.b(6);
        if (b != 0) {
            return (long)this.b.getInt(b + this.a) & 0xFFFFFFFFL;
        }
        return 0L;
    }
    
    public final argt au() {
        final argt argt = new argt();
        final int b = this.b(4);
        if (b != 0) {
            argt.f(this.a(b + this.a), this.b);
            return argt;
        }
        return null;
    }
    
    public final argt av() {
        final argt argt = new argt();
        final int b = this.b(8);
        if (b != 0) {
            argt.f(this.a(b + this.a), this.b);
            return argt;
        }
        return null;
    }
}
