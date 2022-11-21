import java.nio.channels.WritableByteChannel;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

final class arjg implements arix
{
    final long a;
    final ByteBuffer b;
    final int c;
    
    public arjg(final long a, final ByteBuffer b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final long a() {
        return this.a;
    }
    
    @Override
    public final void b(final WritableByteChannel writableByteChannel) {
        writableByteChannel.write((ByteBuffer)((ByteBuffer)this.b.position(this.c)).slice().limit(aqvs.o(this.a)));
    }
}
