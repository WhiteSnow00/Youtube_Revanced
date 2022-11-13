import j$.io.DesugarInputStream;
import java.io.OutputStream;
import java.io.IOException;
import io.grpc.Status;
import java.io.InputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FilterInputStream;

// 
// Decompiled by Procyon v0.6.0
// 

final class asdt extends FilterInputStream implements InputStreamRetargetInterface
{
    private final int a;
    private final asfr b;
    private long c;
    private long d;
    private long e;
    
    public asdt(final InputStream inputStream, final int a, final asfr b) {
        super(inputStream);
        this.e = -1L;
        this.a = a;
        this.b = b;
    }
    
    private final void a() {
        if (this.d > this.c) {
            this.b.g();
            this.c = this.d;
        }
    }
    
    private final void b() {
        if (this.d <= this.a) {
            return;
        }
        final Status h = Status.h;
        final int a = this.a;
        final StringBuilder sb = new StringBuilder("Decompressed gRPC message exceeds maximum size ");
        sb.append(a);
        throw h.withDescription(sb.toString()).d();
    }
    
    @Override
    public final void mark(final int n) {
        synchronized (this) {
            this.in.mark(n);
            this.e = this.d;
        }
    }
    
    @Override
    public final int read() {
        final int read = this.in.read();
        if (read != -1) {
            ++this.d;
        }
        this.b();
        this.a();
        return read;
    }
    
    @Override
    public final int read(final byte[] array, int read, final int n) {
        read = this.in.read(array, read, n);
        if (read != -1) {
            this.d += read;
        }
        this.b();
        this.a();
        return read;
    }
    
    @Override
    public final void reset() {
        synchronized (this) {
            if (!this.in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.e != -1L) {
                this.in.reset();
                this.d = this.e;
                return;
            }
            throw new IOException("Mark not set");
        }
    }
    
    @Override
    public final long skip(long skip) {
        skip = this.in.skip(skip);
        this.d += skip;
        this.b();
        this.a();
        return skip;
    }
    
    public final long transferTo(final OutputStream outputStream) {
        return DesugarInputStream.transferTo((InputStream)this, outputStream);
    }
}
