import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adrv implements aqzg
{
    private final long a;
    private InputStream b;
    private boolean c;
    private long d;
    private long e;
    private final aapu f;
    
    public adrv(final aapu f, final adot adot, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.f = f;
        adme.K(adot.a() != -1L);
        this.b = k(adot);
        this.a = adot.a();
    }
    
    private final void j() {
        if (this.c) {
            this.close();
            this.c = false;
        }
        if (this.b == null) {
            afqq.c(this.b = k(this.f.bD()), this.e);
        }
    }
    
    private static final InputStream k(final adot adot) {
        return new BufferedInputStream(adot, 131072);
    }
    
    public final long a() {
        return this.a;
    }
    
    public final int b(final byte[] array, int read, final int n) {
        if (n == 0) {
            return 0;
        }
        this.j();
        read = this.b.read(array, read, n);
        if (read == -1) {
            if (this.d >= this.a) {
                return 0;
            }
            throw new IOException("The stream ended before all expected bytes were read");
        }
        else {
            final long d = this.d + read;
            this.d = d;
            if (d <= this.a) {
                return read;
            }
            throw new IOException("Stream continues beyond expected size.");
        }
    }
    
    public final long c() {
        return this.e;
    }
    
    public final void close() {
        final InputStream b = this.b;
        if (b != null) {
            b.close();
            this.b = null;
        }
    }
    
    public final long d() {
        return Long.MAX_VALUE;
    }
    
    public final long e() {
        return this.d;
    }
    
    public final long f(final long n) {
        this.j();
        afqq.c(this.b, n);
        this.d += n;
        return n;
    }
    
    public final void g() {
        final InputStream b = this.b;
        if (b == null) {
            return;
        }
        if (this.e != this.d) {
            b.mark(131072);
        }
        this.e = this.d;
    }
    
    public final void h() {
        final InputStream b = this.b;
        if (b != null) {
            try {
                b.reset();
            }
            catch (final IOException ex) {
                this.c = true;
            }
            this.d = this.e;
        }
    }
    
    public final boolean i() {
        return this.a - this.d > 0L;
    }
}
