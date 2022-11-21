import java.nio.ByteOrder;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class armp extends agpm
{
    public static armp ay(final ByteBuffer byteBuffer) {
        final armp armp = new armp();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        armp.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return armp;
    }
    
    public final float as() {
        final int b = this.b(10);
        if (b != 0) {
            return this.b.getFloat(b + this.a);
        }
        return 0.0f;
    }
    
    public final float at() {
        final int b = this.b(18);
        if (b != 0) {
            return this.b.getFloat(b + this.a);
        }
        return 0.0f;
    }
    
    public final float au() {
        final int b = this.b(12);
        if (b != 0) {
            return this.b.getFloat(b + this.a);
        }
        return 0.0f;
    }
    
    public final float av() {
        final int b = this.b(14);
        if (b != 0) {
            return this.b.getFloat(b + this.a);
        }
        return 0.0f;
    }
    
    public final float aw() {
        final int b = this.b(16);
        if (b != 0) {
            return this.b.getFloat(b + this.a);
        }
        return 0.0f;
    }
    
    public final long ax() {
        final int b = this.b(8);
        if (b != 0) {
            return (long)this.b.getInt(b + this.a) & 0xFFFFFFFFL;
        }
        return 0L;
    }
    
    @Override
    public final long p() {
        final int b = this.b(6);
        if (b != 0) {
            return (long)this.b.getInt(b + this.a) & 0xFFFFFFFFL;
        }
        return 0L;
    }
    
    @Override
    public final long q() {
        final int b = this.b(4);
        if (b != 0) {
            return (long)this.b.getInt(b + this.a) & 0xFFFFFFFFL;
        }
        return 0L;
    }
}
