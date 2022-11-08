import java.io.IOException;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.io.Closeable;

// 
// Decompiled by Procyon v0.6.0
// 

final class dcr implements Closeable
{
    public final Charset a;
    public int b;
    private final InputStream c;
    private byte[] d;
    private int e;
    
    public dcr(final InputStream c, final Charset a) {
        a.getClass();
        if (a.equals(dcs.a)) {
            this.c = c;
            this.a = a;
            this.d = new byte[8192];
            return;
        }
        throw new IllegalArgumentException("Unsupported encoding");
    }
    
    private final void b() {
        final InputStream c = this.c;
        final byte[] d = this.d;
        final int length = d.length;
        final int read = c.read(d, 0, 8192);
        if (read != -1) {
            this.e = 0;
            this.b = read;
            return;
        }
        throw new EOFException();
    }
    
    public final String a() {
        final InputStream c = this.c;
        monitorenter(c);
        try {
            if (this.d != null) {
                if (this.e >= this.b) {
                    this.b();
                }
                for (int i = this.e; i != this.b; ++i) {
                    final byte[] d = this.d;
                    if (d[i] == 10) {
                        final int e = this.e;
                        int n;
                        if (i == e || d[n = i - 1] != 13) {
                            n = i;
                        }
                        final String s = new String(d, e, n - e, this.a.name());
                        this.e = i + 1;
                        monitorexit(c);
                        return s;
                    }
                }
                final dcq dcq = new dcq(this, this.b - this.e + 80);
                int j = 0;
                byte[] d3 = null;
            Block_9:
                while (true) {
                    final byte[] d2 = this.d;
                    final int e2 = this.e;
                    dcq.write(d2, e2, this.b - e2);
                    this.b = -1;
                    this.b();
                    for (j = this.e; j != this.b; ++j) {
                        d3 = this.d;
                        if (d3[j] == 10) {
                            break Block_9;
                        }
                    }
                }
                final int e3 = this.e;
                if (j != e3) {
                    dcq.write(d3, e3, j - e3);
                }
                this.e = j + 1;
                final String string = dcq.toString();
                monitorexit(c);
                return string;
            }
            throw new IOException("LineReader is closed");
        }
        finally {
            monitorexit(c);
            while (true) {}
        }
    }
    
    @Override
    public final void close() {
        synchronized (this.c) {
            if (this.d != null) {
                this.d = null;
                this.c.close();
            }
        }
    }
}
