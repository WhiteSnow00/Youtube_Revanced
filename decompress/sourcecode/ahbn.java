import j$.io.DesugarInputStream;
import java.io.OutputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

final class ahbn extends InputStream implements InputStreamRetargetInterface
{
    final /* synthetic */ ahbo a;
    private ahbm b;
    private agxz c;
    private int d;
    private int e;
    private int f;
    private int g;
    
    public ahbn(final ahbo a) {
        this.a = a;
        this.d();
    }
    
    private final int a() {
        return this.a.d - (this.f + this.e);
    }
    
    private final int b(final byte[] array, int n, final int n2) {
        int i = n2;
        int n3 = n;
        while (i > 0) {
            this.c();
            if (this.c == null) {
                break;
            }
            final int min = Math.min(this.d - this.e, i);
            n = n3;
            if (array != null) {
                ((agyc)this.c).G(array, this.e, n3, min);
                n = n3 + min;
            }
            this.e += min;
            i -= min;
            n3 = n;
        }
        return n2 - i;
    }
    
    private final void c() {
        if (this.c != null) {
            final int e = this.e;
            final int d = this.d;
            if (e == d) {
                this.f += d;
                int d2 = 0;
                this.e = 0;
                if (this.b.hasNext()) {
                    final agxz a = this.b.a();
                    this.c = a;
                    d2 = a.d();
                }
                else {
                    this.c = null;
                }
                this.d = d2;
            }
        }
    }
    
    private final void d() {
        final ahbm b = new ahbm((agyc)this.a);
        this.b = b;
        final agxz a = b.a();
        this.c = a;
        this.d = a.d();
        this.e = 0;
        this.f = 0;
    }
    
    @Override
    public final int available() {
        return this.a();
    }
    
    @Override
    public final void mark(final int n) {
        this.g = this.f + this.e;
    }
    
    @Override
    public final boolean markSupported() {
        return true;
    }
    
    @Override
    public final int read() {
        this.c();
        final agxz c = this.c;
        if (c == null) {
            return -1;
        }
        return c.a(this.e++) & 0xFF;
    }
    
    @Override
    public final int read(final byte[] array, int b, final int n) {
        array.getClass();
        if (b >= 0 && n >= 0 && n <= array.length - b) {
            if ((b = this.b(array, b, n)) == 0) {
                if (n <= 0 && this.a() != 0) {
                    b = 0;
                }
                else {
                    b = -1;
                }
            }
            return b;
        }
        throw new IndexOutOfBoundsException();
    }
    
    @Override
    public final void reset() {
        synchronized (this) {
            this.d();
            this.b(null, 0, this.g);
        }
    }
    
    @Override
    public final long skip(final long n) {
        if (n >= 0L) {
            long n2 = n;
            if (n > 2147483647L) {
                n2 = 2147483647L;
            }
            return this.b(null, 0, (int)n2);
        }
        throw new IndexOutOfBoundsException();
    }
}
