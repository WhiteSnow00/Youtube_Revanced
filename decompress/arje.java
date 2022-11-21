import java.nio.channels.WritableByteChannel;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

final class arje implements arix
{
    final long a;
    final ByteBuffer b;
    final long c;
    
    public arje(final long a, final ByteBuffer b, final long c) {
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
        writableByteChannel.write((ByteBuffer)((ByteBuffer)this.b.position(aqvs.o(this.c))).slice().limit(aqvs.o(this.a)));
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
