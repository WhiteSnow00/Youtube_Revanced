import j$.io.DesugarInputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

final class dos extends InputStream implements InputStreamRetargetInterface
{
    private final ByteBuffer a;
    private int b;
    
    public dos(final ByteBuffer a) {
        this.b = -1;
        this.a = a;
    }
    
    @Override
    public final int available() {
        return this.a.remaining();
    }
    
    @Override
    public final void mark(final int n) {
        synchronized (this) {
            this.b = this.a.position();
        }
    }
    
    @Override
    public final boolean markSupported() {
        return true;
    }
    
    @Override
    public final int read() {
        if (!this.a.hasRemaining()) {
            return -1;
        }
        return this.a.get() & 0xFF;
    }
    
    @Override
    public final int read(final byte[] array, final int n, int min) {
        if (!this.a.hasRemaining()) {
            return -1;
        }
        min = Math.min(min, this.available());
        this.a.get(array, n, min);
        return min;
    }
    
    @Override
    public final void reset() {
        synchronized (this) {
            final int b = this.b;
            if (b != -1) {
                this.a.position(b);
                return;
            }
            throw new IOException("Cannot reset to unset mark position");
        }
    }
    
    @Override
    public final long skip(long min) {
        if (!this.a.hasRemaining()) {
            return -1L;
        }
        min = Math.min(min, this.available());
        final ByteBuffer a = this.a;
        a.position((int)(a.position() + min));
        return min;
    }
}
