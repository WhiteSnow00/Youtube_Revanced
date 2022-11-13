import java.io.InterruptedIOException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adnn extends adnf
{
    private boolean a;
    private final File b;
    private volatile long c;
    
    public adnn(final File file, final File b) {
        super((InputStream)new FileInputStream(file));
        this.a = false;
        this.c = -1L;
        this.b = b;
        this.f();
    }
    
    private final int e(final adnm adnm) {
        final long currentTimeMillis = System.currentTimeMillis();
        while (!this.a) {
            final int a = adnm.a();
            if (a < 0) {
                if (System.currentTimeMillis() - currentTimeMillis >= 20000L) {
                    return adnm.a();
                }
                try {
                    Thread.sleep(30L);
                    this.f();
                    continue;
                }
                catch (final InterruptedException ex) {
                    Thread.currentThread().interrupt();
                    String message;
                    if (ex.getMessage() != null) {
                        message = ex.getMessage();
                    }
                    else {
                        message = "";
                    }
                    throw new InterruptedIOException(message);
                }
            }
            return a;
        }
        return adnm.a();
    }
    
    private final void f() {
        if (this.b.exists()) {
            this.c = this.b.length();
            this.a = true;
        }
    }
    
    public final long a() {
        return this.c;
    }
    
    public final boolean b() {
        if (!this.a) {
            this.f();
        }
        return this.c != -1L;
    }
    
    final int c(final byte[] array, final int n, final int n2) {
        return super.read(array, n, n2);
    }
    
    final int d() {
        return super.read();
    }
    
    public final int read() {
        return this.e((adnm)new adnl(this));
    }
    
    public final int read(final byte[] array) {
        return this.read(array, 0, array.length);
    }
    
    public final int read(final byte[] array, final int n, final int n2) {
        return this.e((adnm)new adnk(this, array, n, n2));
    }
}
