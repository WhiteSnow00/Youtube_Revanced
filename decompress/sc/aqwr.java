import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public class aqwr implements aqwl
{
    private final InputStream a;
    private long b;
    private long c;
    private boolean d;
    private long e;
    
    public aqwr(final InputStream inputStream) {
        this(inputStream, -1L);
    }
    
    public aqwr(final InputStream a, final long e) {
        if (!a.markSupported()) {
            this.a = new BufferedInputStream(a);
        }
        else {
            this.a = a;
        }
        this.e = e;
        this.a.mark(1048577);
    }
    
    public long a() {
        synchronized (this) {
            return this.e;
        }
    }
    
    public final int b(final byte[] array, int read, int n) {
        synchronized (this) {
            adkp.I(array.length - read >= n, (Object)"Cannot read into a buffer smaller than given length");
            if (n == 0) {
                return 0;
            }
            if (this.d) {
                this.a.reset();
                this.d = false;
            }
            n = (int)Math.min(n, 1048576L - (this.c - this.b));
            read = this.a.read(array, read, n);
            if (read == -1) {
                final long e = this.e;
                if (e == -1L) {
                    this.e = this.c;
                }
                else if (this.c < e) {
                    throw new IOException("The stream ended before all expected bytes were read");
                }
                return 0;
            }
            final long c = this.c + read;
            this.c = c;
            final long e2 = this.e;
            if (e2 != -1L && c > e2) {
                throw new IOException("The stream continues beyond expected size");
            }
            return read;
        }
    }
    
    public final long c() {
        synchronized (this) {
            return this.b;
        }
    }
    
    public final void close() {
        synchronized (this) {
            this.a.close();
        }
    }
    
    public final long d() {
        monitorenter(this);
        monitorexit(this);
        return 1048576L;
    }
    
    public final long e() {
        synchronized (this) {
            return this.c;
        }
    }
    
    public final long f(long n) {
        monitorenter(this);
        try {
            final long min = Math.min(n, 1048576L - (this.c - this.b));
            final long n2 = 0L;
            if (min == 0L) {
                monitorexit(this);
                return 0L;
            }
            if (this.d) {
                this.a.reset();
                this.d = false;
            }
            if ((n = this.a.skip(min)) == 0L) {
                n = n2;
                if (this.i()) {
                    do {
                        n = this.a.skip(min);
                    } while (n == 0L);
                }
            }
            this.c += n;
            monitorexit(this);
            return n;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void g() {
        synchronized (this) {
            if (this.b != this.c) {
                this.a.mark(1048577);
            }
            this.b = this.c;
        }
    }
    
    public final void h() {
        synchronized (this) {
            this.c = this.b;
            this.d = true;
        }
    }
    
    public final boolean i() {
        monitorenter(this);
        try {
            if (this.d) {
                this.a.reset();
                this.d = false;
            }
            if (this.a.available() > 0) {
                monitorexit(this);
                return true;
            }
            if (this.a.read() == -1) {
                this.e = this.c;
                monitorexit(this);
                return false;
            }
            this.a.reset();
            long c = this.c;
            long n = this.b;
            while (true) {
                c -= n;
                if (c <= 0L) {
                    break;
                }
                n = this.a.skip(c);
            }
            monitorexit(this);
            return true;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
