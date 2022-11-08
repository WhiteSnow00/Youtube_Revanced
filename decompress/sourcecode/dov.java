import j$.io.DesugarInputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FilterInputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dov extends FilterInputStream implements InputStreamRetargetInterface
{
    private final long a;
    private int b;
    
    public dov(final InputStream inputStream, final long a) {
        super(inputStream);
        this.a = a;
    }
    
    private final void a(int b) {
        if (b >= 0) {
            this.b += b;
            return;
        }
        final long a = this.a;
        b = this.b;
        if (a - b <= 0L) {
            return;
        }
        final StringBuilder sb = new StringBuilder("Failed to read all expected data, expected: ");
        sb.append(a);
        sb.append(", but read: ");
        sb.append(b);
        throw new IOException(sb.toString());
    }
    
    @Override
    public final int available() {
        synchronized (this) {
            return (int)Math.max(this.a - this.b, this.in.available());
        }
    }
    
    @Override
    public final int read() {
        synchronized (this) {
            final int read = super.read();
            int n;
            if (read >= 0) {
                n = 1;
            }
            else {
                n = -1;
            }
            this.a(n);
            return read;
        }
    }
    
    @Override
    public final int read(final byte[] array) {
        return this.read(array, 0, array.length);
    }
    
    @Override
    public final int read(final byte[] array, int read, final int n) {
        synchronized (this) {
            read = super.read(array, read, n);
            this.a(read);
            return read;
        }
    }
}
