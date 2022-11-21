import j$.io.DesugarInputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

final class auib extends InputStream implements InputStreamRetargetInterface
{
    public boolean a;
    public ByteBuffer b;
    public IOException c;
    private final auhz d;
    
    public auib(final auhz d) {
        this.d = d;
    }
    
    private final void a() {
        if (!this.a) {
            if (!this.b()) {
                if (this.b == null) {
                    this.b = ByteBuffer.allocateDirect(32768);
                }
                final ByteBuffer byteBuffer = (ByteBuffer)this.b.clear();
                final auhz d = this.d;
                d.b.read(this.b);
                d.a.b(d.getReadTimeout());
                final IOException c = this.c;
                if (c != null) {
                    throw c;
                }
                final ByteBuffer b = this.b;
                if (b != null) {
                    final ByteBuffer byteBuffer2 = (ByteBuffer)b.flip();
                }
            }
            return;
        }
        final IOException c2 = this.c;
        if (c2 == null) {
            return;
        }
        throw c2;
    }
    
    private final boolean b() {
        final ByteBuffer b = this.b;
        return b != null && b.hasRemaining();
    }
    
    @Override
    public final int available() {
        if (this.a) {
            final IOException c = this.c;
            if (c == null) {
                return 0;
            }
            throw c;
        }
        else {
            if (this.b()) {
                return this.b.remaining();
            }
            return 0;
        }
    }
    
    @Override
    public final int read() {
        this.a();
        if (this.b()) {
            return this.b.get() & 0xFF;
        }
        return -1;
    }
    
    @Override
    public final int read(final byte[] array, final int n, int min) {
        if (n < 0 || min < 0 || n + min > array.length) {
            throw new IndexOutOfBoundsException();
        }
        if (min == 0) {
            return 0;
        }
        this.a();
        if (this.b()) {
            min = Math.min(this.b.limit() - this.b.position(), min);
            this.b.get(array, n, min);
            return min;
        }
        return -1;
    }
    
    public final long transferTo(final OutputStream outputStream) {
        return DesugarInputStream.transferTo((InputStream)this, outputStream);
    }
}
