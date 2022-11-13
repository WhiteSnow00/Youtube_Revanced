import java.io.OutputStream;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

final class asel extends arzf
{
    final ByteBuffer a;
    
    public asel(final ByteBuffer a) {
        a.getClass();
        this.a = a;
    }
    
    public final void b() {
        final ByteBuffer byteBuffer = (ByteBuffer)this.a.mark();
    }
    
    public final void c() {
        final ByteBuffer byteBuffer = (ByteBuffer)this.a.reset();
    }
    
    public final boolean d() {
        return true;
    }
    
    public final int e() {
        this.a(1);
        return this.a.get() & 0xFF;
    }
    
    public final int f() {
        return this.a.remaining();
    }
    
    public final /* bridge */ asei g(final int n) {
        this.a(n);
        final ByteBuffer duplicate = this.a.duplicate();
        duplicate.limit(this.a.position() + n);
        final ByteBuffer a = this.a;
        a.position(a.position() + n);
        return (asei)new asel(duplicate);
    }
    
    public final void i(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        final int remaining = byteBuffer.remaining();
        this.a(remaining);
        final int limit = this.a.limit();
        final ByteBuffer a = this.a;
        a.limit(a.position() + remaining);
        byteBuffer.put(this.a);
        byteBuffer = (ByteBuffer)this.a.limit(limit);
    }
    
    public final void j(final OutputStream outputStream, final int n) {
        this.a(n);
        if (this.a.hasArray()) {
            outputStream.write(this.a.array(), this.a.arrayOffset() + this.a.position(), n);
            final ByteBuffer a = this.a;
            a.position(a.position() + n);
            return;
        }
        final byte[] array = new byte[n];
        this.a.get(array);
        outputStream.write(array);
    }
    
    public final void k(final byte[] array, final int n, final int n2) {
        this.a(n2);
        this.a.get(array, n, n2);
    }
    
    public final void l(final int n) {
        this.a(n);
        final ByteBuffer a = this.a;
        a.position(a.position() + n);
    }
}
