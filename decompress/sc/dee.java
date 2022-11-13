import j$.io.DesugarInputStream;
import java.io.OutputStream;
import java.io.InputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FilterInputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dee extends FilterInputStream implements InputStreamRetargetInterface
{
    private static final byte[] a;
    private static final int b;
    private final byte c;
    private int d;
    
    static {
        a = new byte[] { -1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0 };
        b = 31;
    }
    
    public dee(final InputStream inputStream, final int n) {
        super(inputStream);
        if (n >= -1 && n <= 8) {
            this.c = (byte)n;
            return;
        }
        final StringBuilder sb = new StringBuilder("Cannot add invalid orientation: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    @Override
    public final void mark(final int n) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final boolean markSupported() {
        return false;
    }
    
    @Override
    public final int read() {
        final int d = this.d;
        int n = 0;
        Label_0055: {
            if (d >= 2) {
                final int b = dee.b;
                if (d <= b) {
                    if (d == b) {
                        n = this.c;
                        break Label_0055;
                    }
                    n = (dee.a[d - 2] & 0xFF);
                    break Label_0055;
                }
            }
            n = super.read();
        }
        if (n != -1) {
            ++this.d;
        }
        return n;
    }
    
    @Override
    public final int read(final byte[] array, int n, int min) {
        final int d = this.d;
        final int b = dee.b;
        if (d > b) {
            n = super.read(array, n, min);
        }
        else if (d == b) {
            array[n] = this.c;
            n = 1;
        }
        else if (d < 2) {
            n = super.read(array, n, 2 - d);
        }
        else {
            min = Math.min(b - d, min);
            System.arraycopy(dee.a, this.d - 2, array, n, min);
            n = min;
        }
        if (n > 0) {
            this.d += n;
        }
        return n;
    }
    
    @Override
    public final void reset() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final long skip(long skip) {
        skip = super.skip(skip);
        if (skip > 0L) {
            this.d += (int)skip;
        }
        return skip;
    }
    
    public final long transferTo(final OutputStream outputStream) {
        return DesugarInputStream.transferTo((InputStream)this, outputStream);
    }
}
