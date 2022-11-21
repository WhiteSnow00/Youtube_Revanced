import j$.io.DesugarInputStream;
import java.io.OutputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

final class ashf extends InputStream implements InputStreamRetargetInterface, arye
{
    private final ashe a;
    
    public ashf(final ashe a) {
        a.getClass();
        this.a = a;
    }
    
    @Override
    public final int available() {
        return ((asdh)this.a).a;
    }
    
    @Override
    public final void close() {
        this.a.close();
    }
    
    @Override
    public final void mark(final int n) {
        this.a.b();
    }
    
    @Override
    public final boolean markSupported() {
        return this.a.d();
    }
    
    @Override
    public final int read() {
        final ashe a = this.a;
        if (((asdh)a).a == 0) {
            return -1;
        }
        return a.e();
    }
    
    @Override
    public final int read(final byte[] array, final int n, int min) {
        final int a = ((asdh)this.a).a;
        if (a == 0) {
            return -1;
        }
        min = Math.min(a, min);
        this.a.k(array, n, min);
        return min;
    }
    
    @Override
    public final void reset() {
        this.a.c();
    }
    
    @Override
    public final long skip(final long n) {
        final int n2 = (int)Math.min(((asdh)this.a).a, n);
        this.a.l(n2);
        return n2;
    }
    
    public final long transferTo(final OutputStream outputStream) {
        return DesugarInputStream.transferTo((InputStream)this, outputStream);
    }
}
