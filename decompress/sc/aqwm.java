import java.io.IOException;
import java.io.File;
import java.io.RandomAccessFile;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqwm implements aqwl
{
    private final RandomAccessFile a;
    private long b;
    private long c;
    
    public aqwm(final File file) {
        this.a = new RandomAccessFile(file, "r");
        this.b = 0L;
        this.c = 0L;
    }
    
    public final long a() {
        synchronized (this) {
            try {
                return this.a.length();
            }
            catch (final IOException ex) {
                return -1L;
            }
        }
    }
    
    public final int b(final byte[] array, int read, final int n) {
        synchronized (this) {
            adkp.I(array.length - read >= n, (Object)"Buffer length must be greater than desired number of bytes.");
            if (n == 0) {
                return 0;
            }
            if (this.c != this.a.getFilePointer()) {
                this.a.seek(this.c);
            }
            read = this.a.read(array, read, n);
            if (read != -1) {
                this.c += read;
                return read;
            }
            return 0;
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
        return Long.MAX_VALUE;
    }
    
    public final long e() {
        synchronized (this) {
            return this.c;
        }
    }
    
    public final long f(long c) {
        monitorenter(this);
        boolean b;
        if (c >= 0L) {
            b = true;
        }
        else {
            b = false;
        }
        try {
            adkp.I(b, (Object)"Can't skip negative bytes.");
            if (c == 0L) {
                return 0L;
            }
            final long min = Math.min(this.c + c, this.a.length());
            this.a.seek(min);
            c = this.c;
            this.c = min;
            monitorexit(this);
            return min - c;
        }
        finally {
            monitorexit(this);
        }
    }
    
    public final void g() {
        synchronized (this) {
            this.b = this.c;
        }
    }
    
    public final void h() {
        synchronized (this) {
            this.c = this.b;
        }
    }
    
    public final boolean i() {
        synchronized (this) {
            final long c = this.c;
            final long length = this.a.length();
            monitorexit(this);
            return c < length;
        }
    }
}
