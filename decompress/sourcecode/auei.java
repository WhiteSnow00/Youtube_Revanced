import org.chromium.net.UploadDataProvider;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

final class auei extends auep
{
    public final auer a;
    public final ByteBuffer b;
    public boolean c;
    private final UploadDataProvider f;
    
    public auei(final int n, final auer a) {
        this.f = (UploadDataProvider)new aueh(this);
        if (n > 0) {
            this.b = ByteBuffer.allocate(n);
            this.a = a;
            return;
        }
        throw new IllegalArgumentException("chunkLength should be greater than 0");
    }
    
    private final void f() {
        if (!this.b.hasRemaining()) {
            this.e();
            final ByteBuffer byteBuffer = (ByteBuffer)this.b.flip();
            this.a.a();
            this.d();
        }
    }
    
    public final UploadDataProvider a() {
        return this.f;
    }
    
    public final void b() {
    }
    
    public final void c() {
    }
    
    public final void close() {
        super.close();
        if (!this.c) {
            this.c = true;
            final ByteBuffer byteBuffer = (ByteBuffer)this.b.flip();
        }
    }
    
    public final void write(final int n) {
        this.f();
        this.b.put((byte)n);
    }
    
    public final void write(final byte[] array, final int n, final int n2) {
        this.e();
        if (array.length - n >= n2 && n >= 0 && n2 >= 0) {
            int i = n2;
            while (i > 0) {
                final int min = Math.min(i, this.b.remaining());
                this.b.put(array, n + n2 - i, min);
                i -= min;
                this.f();
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
