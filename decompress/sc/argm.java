import java.nio.channels.WritableByteChannel;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

final class argm implements argd
{
    final long a;
    final ByteBuffer b;
    final int c;
    
    public argm(final long a, final ByteBuffer b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final long a() {
        return this.a;
    }
    
    public final void b(final WritableByteChannel writableByteChannel) {
        writableByteChannel.write((ByteBuffer)((ByteBuffer)this.b.position(this.c)).slice().limit(aqsy.q(this.a)));
    }
}
