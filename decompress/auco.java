import j$.io.DesugarInputStream;
import java.io.OutputStream;
import java.io.IOException;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auco extends InputStream implements InputStreamRetargetInterface
{
    final aucp a;
    
    public auco(final aucp a) {
        this.a = a;
    }
    
    @Override
    public final int available() {
        final aucp a = this.a;
        if (!a.c) {
            return (int)Math.min(a.b.b, 2147483647L);
        }
        throw new IOException("closed");
    }
    
    @Override
    public final void close() {
        this.a.close();
    }
    
    @Override
    public final int read() {
        final aucp a = this.a;
        if (a.c) {
            throw new IOException("closed");
        }
        final aucg b = a.b;
        if (b.b == 0L && a.a.t(b) == -1L) {
            return -1;
        }
        return this.a.b.b() & 0xFF;
    }
    
    @Override
    public final int read(final byte[] array, final int n, final int n2) {
        array.getClass();
        if (this.a.c) {
            throw new IOException("closed");
        }
        aucx.b(array.length, n, n2);
        final aucp a = this.a;
        final aucg b = a.b;
        if (b.b == 0L && a.a.t(b) == -1L) {
            return -1;
        }
        return this.a.b.c(array, n, n2);
    }
    
    public final String toString() {
        final aucp a = this.a;
        new StringBuilder().append(a);
        return a.toString().concat(".inputStream()");
    }
    
    public final long transferTo(final OutputStream outputStream) {
        return DesugarInputStream.transferTo((InputStream)this, outputStream);
    }
}
