import java.nio.channels.WritableByteChannel;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

final class dse implements arfx
{
    final long a;
    final arfx b;
    
    public dse(final long a, final arfx b) {
        this.a = a;
        this.b = b;
    }
    
    public final int a(final ByteBuffer byteBuffer) {
        if (this.a == this.b.b()) {
            return -1;
        }
        if (byteBuffer.remaining() > this.a - this.b.b()) {
            final ByteBuffer allocate = ByteBuffer.allocate(aqsy.q(this.a - this.b.b()));
            this.b.a(allocate);
            byteBuffer.put((ByteBuffer)allocate.rewind());
            return allocate.capacity();
        }
        return this.b.a(byteBuffer);
    }
    
    public final long b() {
        return this.b.b();
    }
    
    public final long c() {
        return this.a;
    }
    
    public final void close() {
        this.b.close();
    }
    
    public final long d(final long n, final long n2, final WritableByteChannel writableByteChannel) {
        return this.b.d(n, n2, writableByteChannel);
    }
    
    public final ByteBuffer e(final long n, final long n2) {
        return this.b.e(n, n2);
    }
    
    public final void f(final long n) {
        this.b.f(n);
    }
}
