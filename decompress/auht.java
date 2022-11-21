import java.net.ProtocolException;
import org.chromium.net.UploadDataProvider;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

final class auht extends auic
{
    public final int a;
    public ByteBuffer b;
    public boolean c;
    private final UploadDataProvider f;
    
    public auht() {
        this.f = new auhs(this);
        this.a = -1;
        this.b = ByteBuffer.allocate(16384);
    }
    
    public auht(final long n) {
        this.f = new auhs(this);
        if (n > 2147483647L) {
            throw new IllegalArgumentException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for requests larger than 2GB.");
        }
        if (n >= 0L) {
            final int a = (int)n;
            this.a = a;
            this.b = ByteBuffer.allocate(a);
            return;
        }
        throw new IllegalArgumentException("Content length < 0.");
    }
    
    private final void f(int a) {
        if (this.a != -1 && this.b.position() + a > this.a) {
            a = this.a;
            final StringBuilder sb = new StringBuilder("exceeded content-length limit of ");
            sb.append(a);
            sb.append(" bytes");
            throw new ProtocolException(sb.toString());
        }
        if (this.c) {
            throw new IllegalStateException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for writing after connect");
        }
        if (this.a != -1) {
            return;
        }
        if (this.b.limit() - this.b.position() > a) {
            return;
        }
        final int capacity = this.b.capacity();
        final ByteBuffer allocate = ByteBuffer.allocate(Math.max(capacity + capacity, this.b.capacity() + a));
        final ByteBuffer byteBuffer = (ByteBuffer)this.b.flip();
        allocate.put(this.b);
        this.b = allocate;
    }
    
    @Override
    public final UploadDataProvider a() {
        return this.f;
    }
    
    @Override
    public final void b() {
    }
    
    @Override
    public final void c() {
        this.c = true;
        if (this.b.position() >= this.a) {
            final ByteBuffer byteBuffer = (ByteBuffer)this.b.flip();
            return;
        }
        throw new ProtocolException("Content received is less than Content-Length");
    }
    
    @Override
    public final void write(final int n) {
        this.e();
        this.f(1);
        this.b.put((byte)n);
    }
    
    @Override
    public final void write(final byte[] array, final int n, final int n2) {
        this.e();
        this.f(n2);
        this.b.put(array, n, n2);
    }
}
