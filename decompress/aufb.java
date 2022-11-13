import java.net.ProtocolException;
import org.chromium.net.UploadDataProvider;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

final class aufb extends aufg
{
    public final aufi a;
    public final long b;
    public final ByteBuffer c;
    private final UploadDataProvider f;
    private long g;
    
    public aufb(final long b, final aufi a) {
        this.f = new aufa(this);
        if (b >= 0L) {
            this.b = b;
            this.c = ByteBuffer.allocate((int)Math.min(b, 16384L));
            this.a = a;
            this.g = 0L;
            return;
        }
        throw new IllegalArgumentException("Content length must be larger than 0 for non-chunked upload.");
    }
    
    private final void f(final int n) {
        if (this.g + n <= this.b) {
            return;
        }
        final long b = this.b;
        final long g = this.g;
        final StringBuilder sb = new StringBuilder("expected ");
        sb.append(b - g);
        sb.append(" bytes but received ");
        sb.append(n);
        throw new ProtocolException(sb.toString());
    }
    
    private final void g() {
        if (!this.c.hasRemaining()) {
            this.h();
        }
    }
    
    private final void h() {
        this.e();
        final ByteBuffer byteBuffer = (ByteBuffer)this.c.flip();
        this.a.a();
        this.d();
    }
    
    private final void i() {
        if (this.g == this.b) {
            this.h();
        }
    }
    
    public final UploadDataProvider a() {
        return this.f;
    }
    
    public final void b() {
        if (this.g >= this.b) {
            return;
        }
        throw new ProtocolException("Content received is less than Content-Length.");
    }
    
    public final void c() {
    }
    
    public final void write(final int n) {
        this.e();
        this.f(1);
        this.g();
        this.c.put((byte)n);
        ++this.g;
        this.i();
    }
    
    public final void write(final byte[] array, final int n, final int n2) {
        this.e();
        if (array.length - n >= n2 && n >= 0 && n2 >= 0) {
            this.f(n2);
            int min;
            for (int i = n2; i > 0; i -= min) {
                this.g();
                min = Math.min(i, this.c.remaining());
                this.c.put(array, n + n2 - i, min);
            }
            this.g += n2;
            this.i();
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
