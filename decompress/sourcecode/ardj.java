import java.nio.channels.WritableByteChannel;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ardj implements ardi
{
    final ByteBuffer a;
    
    public ardj(final byte[] array) {
        this.a = ByteBuffer.wrap(array);
    }
    
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
    
    public final long b() {
        return this.a.position();
    }
    
    public final long c() {
        return this.a.capacity();
    }
    
    public final void close() {
    }
    
    public final long d(final long n, final long n2, final WritableByteChannel writableByteChannel) {
        return writableByteChannel.write((ByteBuffer)((ByteBuffer)this.a.position(aqqm.q(n))).slice().limit(aqqm.q(n2)));
    }
    
    public final ByteBuffer e(final long n, final long n2) {
        final int position = this.a.position();
        this.a.position(aqqm.q(n));
        final ByteBuffer slice = this.a.slice();
        slice.limit(aqqm.q(n2));
        this.a.position(position);
        return slice;
    }
    
    public final void f(final long n) {
        this.a.position(aqqm.q(n));
    }
}
