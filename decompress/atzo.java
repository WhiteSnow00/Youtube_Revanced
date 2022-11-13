import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

final class atzo implements atzx
{
    private final InputStream a;
    
    public atzo(final InputStream a) {
        this.a = a;
    }
    
    public final void close() {
        this.a.close();
    }
    
    public final long t(final atzk atzk) {
        try {
            if (Thread.currentThread().isInterrupted()) {
                throw new InterruptedIOException("interrupted");
            }
            final atzu j = atzk.j(1);
            final int read = this.a.read(j.a, j.c, (int)Math.min(8192L, 8192 - j.c));
            if (read == -1) {
                if (j.b == j.c) {
                    atzk.a = j.a();
                    atzv.b(j);
                }
                return -1L;
            }
            j.c += read;
            final long b = atzk.b;
            final long n = read;
            atzk.b = b + n;
            return n;
        }
        catch (final AssertionError assertionError) {
            if (atzp.b(assertionError)) {
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
