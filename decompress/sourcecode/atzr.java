import j$.io.DesugarInputStream;
import java.io.OutputStream;
import java.io.IOException;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atzr extends InputStream implements InputStreamRetargetInterface
{
    private final byte[] a;
    private int b;
    private int c;
    private final atzw d;
    
    public atzr(final InputStream inputStream) {
        final atzw d = new atzw();
        this.d = d;
        this.a = new byte[256];
        this.b = 0;
        this.c = 0;
        try {
            atzu.c(d, inputStream);
        }
        catch (final atzs atzs) {
            throw new IOException("Brotli decoder initialization failed", atzs);
        }
    }
    
    @Override
    public final void close() {
        atzu.a(this.d);
    }
    
    @Override
    public final int read() {
        int c;
        if ((c = this.c) >= this.b) {
            final byte[] a = this.a;
            final int length = a.length;
            final int read = this.read(a, 0, 256);
            this.b = read;
            this.c = 0;
            if (read == -1) {
                return -1;
            }
            c = 0;
        }
        final byte[] a2 = this.a;
        this.c = c + 1;
        return a2[c] & 0xFF;
    }
    
    @Override
    public final int read(final byte[] f, int ae, final int n) {
        if (ae < 0) {
            final StringBuilder sb = new StringBuilder("Bad offset: ");
            sb.append(ae);
            throw new IllegalArgumentException(sb.toString());
        }
        if (n >= 0) {
            final int n2 = ae + n;
            final int length = f.length;
            if (n2 <= length) {
                if (n == 0) {
                    return 0;
                }
                int n4;
                final int n3 = n4 = Math.max(this.b - this.c, 0);
                int ac = ae;
                int ad = n;
                if (n3 != 0) {
                    n4 = Math.min(n3, n);
                    System.arraycopy(this.a, this.c, f, ae, n4);
                    this.c += n4;
                    ac = ae + n4;
                    ad = n - n4;
                    if (ad == 0) {
                        return n4;
                    }
                }
                try {
                    final atzw d = this.d;
                    d.f = f;
                    d.ac = ac;
                    d.ad = ad;
                    d.ae = 0;
                    atzu.b(d);
                    ae = this.d.ae;
                    ae += n4;
                    if (ae > 0) {
                        return ae;
                    }
                    return -1;
                }
                catch (final atzs atzs) {
                    throw new IOException("Brotli stream decoding failed", atzs);
                }
            }
            final StringBuilder sb2 = new StringBuilder("Buffer overflow: ");
            sb2.append(n2);
            sb2.append(" > ");
            sb2.append(length);
            throw new IllegalArgumentException(sb2.toString());
        }
        final StringBuilder sb3 = new StringBuilder("Bad length: ");
        sb3.append(n);
        throw new IllegalArgumentException(sb3.toString());
    }
}
