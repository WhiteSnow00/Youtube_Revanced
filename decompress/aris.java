import java.nio.channels.WritableByteChannel;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aris implements arir
{
    final ByteBuffer a;
    
    public aris(final byte[] array) {
        this.a = ByteBuffer.wrap(array);
    }
    
    @Override
    public final int a(final ByteBuffer byteBuffer) {
        if (this.a.remaining() == 0 && byteBuffer.remaining() != 0) {
            return -1;
        }
        final int min = Math.min(byteBuffer.remaining(), this.a.remaining());
        final byte[] array = new byte[min];
        this.a.get(array);
        byteBuffer.put(array);
        return min;
    }
    
    @Override
    public final long b() {
        return this.a.position();
    }
    
    @Override
    public final long c() {
        return this.a.capacity();
    }
    
    @Override
    public final void close() {
    }
    
    @Override
    public final long d(final long n, final long n2, final WritableByteChannel writableByteChannel) {
        return writableByteChannel.write((ByteBuffer)((ByteBuffer)this.a.position(aqvs.o(n))).slice().limit(aqvs.o(n2)));
    }
    
    @Override
    public final ByteBuffer e(final long n, final long n2) {
        final int position = this.a.position();
        this.a.position(aqvs.o(n));
        final ByteBuffer slice = this.a.slice();
        slice.limit(aqvs.o(n2));
        this.a.position(position);
        return slice;
    }
    
    @Override
    public final void f(final long n) {
        this.a.position(aqvs.o(n));
    }
}
