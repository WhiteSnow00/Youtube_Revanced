import java.nio.channels.WritableByteChannel;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

final class argk implements argd
{
    final long a;
    final ByteBuffer b;
    final long c;
    
    public argk(final long a, final ByteBuffer b, final long c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final long a() {
        return this.a;
    }
    
    public final void b(final WritableByteChannel writableByteChannel) {
        writableByteChannel.write((ByteBuffer)((ByteBuffer)this.b.position(aqsy.q(this.c))).slice().limit(aqsy.q(this.a)));
    }
    
    @Override
    public final String toString() {
        final long a = this.a;
        final StringBuilder sb = new StringBuilder(43);
        sb.append("DefaultMp4Sample(size:");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
}
