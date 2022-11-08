import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

final class atyy implements atzh
{
    private final InputStream a;
    
    public atyy(final InputStream a) {
        this.a = a;
    }
    
    @Override
    public final void close() {
        this.a.close();
    }
    
    @Override
    public final long t(final atyu atyu) {
        try {
            if (Thread.currentThread().isInterrupted()) {
                throw new InterruptedIOException("interrupted");
            }
            final atze j = atyu.j(1);
            final int read = this.a.read(j.a, j.c, (int)Math.min(8192L, 8192 - j.c));
            if (read == -1) {
                if (j.b == j.c) {
                    atyu.a = j.a();
                    atzf.b(j);
                }
                return -1L;
            }
            j.c += read;
            final long b = atyu.b;
            final long n = read;
            atyu.b = b + n;
            return n;
        }
        catch (final AssertionError assertionError) {
            if (atyz.b(assertionError)) {
                throw new IOException(assertionError);
            }
            throw assertionError;
        }
    }
    
    @Override
    public final String toString() {
        final InputStream a = this.a;
        final StringBuilder sb = new StringBuilder("source(");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
}
