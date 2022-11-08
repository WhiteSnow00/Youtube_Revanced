import j$.io.DesugarInputStream;
import java.io.OutputStream;
import java.io.InputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FilterInputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dpd extends FilterInputStream implements InputStreamRetargetInterface
{
    private int a;
    
    public dpd(final InputStream inputStream) {
        super(inputStream);
        this.a = Integer.MIN_VALUE;
    }
    
    private final long a(final long n) {
        final int a = this.a;
        if (a == 0) {
            return -1L;
        }
        if (a != Integer.MIN_VALUE) {
            final long n2 = a;
            if (n > n2) {
                return n2;
            }
        }
        return n;
    }
    
    private final void b(final long n) {
        final int a = this.a;
        if (a != Integer.MIN_VALUE && n != -1L) {
            this.a = (int)(a - n);
        }
    }
    
    @Override
    public final int available() {
        final int a = this.a;
        int n;
        if (a == Integer.MIN_VALUE) {
            n = super.available();
        }
        else {
            n = Math.min(a, super.available());
        }
        return n;
    }
    
    @Override
    public final void mark(final int a) {
        synchronized (this) {
            super.mark(a);
            this.a = a;
        }
    }
    
    @Override
    public final int read() {
        if (this.a(1L) == -1L) {
            return -1;
        }
        final int read = super.read();
        this.b(1L);
        return read;
    }
    
    @Override
    public final int read(final byte[] array, int read, int n) {
        n = (int)this.a(n);
        if (n == -1) {
            return -1;
        }
        read = super.read(array, read, n);
        this.b(read);
        return read;
    }
    
    @Override
    public final void reset() {
        synchronized (this) {
            super.reset();
            this.a = Integer.MIN_VALUE;
        }
    }
    
    @Override
    public final long skip(long n) {
        n = this.a(n);
        if (n == -1L) {
            return 0L;
        }
        n = super.skip(n);
        this.b(n);
        return n;
    }
}
