import j$.io.DesugarInputStream;
import java.io.OutputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bbp extends InputStream implements InputStreamRetargetInterface
{
    private final bbn a;
    private final bbr b;
    private final byte[] c;
    private boolean d;
    private boolean e;
    private long f;
    
    public bbp(final bbn a, final bbr b) {
        this.d = false;
        this.e = false;
        this.a = a;
        this.b = b;
        this.c = new byte[1];
    }
    
    public final void a() {
        if (!this.d) {
            this.a.b(this.b);
            this.d = true;
        }
    }
    
    @Override
    public final void close() {
        if (!this.e) {
            this.a.f();
            this.e = true;
        }
    }
    
    @Override
    public final int read() {
        if (this.read(this.c) == -1) {
            return -1;
        }
        return this.c[0] & 0xFF;
    }
    
    @Override
    public final int read(final byte[] array) {
        return this.read(array, 0, array.length);
    }
    
    @Override
    public final int read(final byte[] array, int a, final int n) {
        bad.f(this.e ^ true);
        this.a();
        a = this.a.a(array, a, n);
        if (a == -1) {
            return -1;
        }
        this.f += a;
        return a;
    }
    
    public final long transferTo(final OutputStream outputStream) {
        return DesugarInputStream.transferTo((InputStream)this, outputStream);
    }
}
