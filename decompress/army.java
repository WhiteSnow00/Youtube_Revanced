import java.nio.ByteOrder;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class army extends agpm
{
    public static army aw(final ByteBuffer byteBuffer) {
        final army army = new army();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        army.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return army;
    }
    
    public static int ax(final agpk agpk, final int n, final long n2, final int n3, final int n4) {
        agpk.q(5);
        agpk.u(4, 0);
        agpk.v(3, n4);
        agpk.v(2, n3);
        agpk.u(1, (int)n2);
        agpk.v(0, n);
        return agpk.c();
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
    
    public final armc au() {
        final armc armc = new armc();
        final int b = this.b(4);
        if (b != 0) {
            armc.f(this.a(b + this.a), this.b);
            return armc;
        }
        return null;
    }
    
    public final armc av() {
        final armc armc = new armc();
        final int b = this.b(8);
        if (b != 0) {
            armc.f(this.a(b + this.a), this.b);
            return armc;
        }
        return null;
    }
}
