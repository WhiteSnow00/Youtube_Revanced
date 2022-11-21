import j$.io.DesugarInputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FilterInputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agnu extends FilterInputStream implements InputStreamRetargetInterface
{
    private long a;
    private long b;
    
    public agnu(final InputStream inputStream) {
        super(inputStream);
        this.b = -1L;
        this.a = 1048577L;
    }
    
    @Override
    public final int available() {
        return (int)Math.min(this.in.available(), this.a);
    }
    
    @Override
    public final void mark(final int n) {
        synchronized (this) {
            this.in.mark(n);
            this.b = this.a;
        }
    }
    
    @Override
    public final int read() {
        if (this.a == 0L) {
            return -1;
        }
        final int read = this.in.read();
        if (read != -1) {
            --this.a;
        }
        return read;
    }
    
    @Override
    public final int read(final byte[] array, int read, int n) {
        final long a = this.a;
        if (a == 0L) {
            return -1;
        }
        n = (int)Math.min(n, a);
        read = this.in.read(array, read, n);
        if (read != -1) {
            this.a -= read;
        }
        return read;
    }
    
    @Override
    public final void reset() {
        synchronized (this) {
            if (!this.in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.b != -1L) {
                this.in.reset();
                this.a = this.b;
                return;
            }
            throw new IOException("Mark not set");
        }
    }
    
    @Override
    public final long skip(long n) {
        n = Math.min(n, this.a);
        n = this.in.skip(n);
        this.a -= n;
        return n;
    }
    
    public final long transferTo(final OutputStream outputStream) {
        return DesugarInputStream.transferTo((InputStream)this, outputStream);
    }
}
