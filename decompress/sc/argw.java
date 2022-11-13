import java.io.IOException;
import java.util.logging.Level;
import java.nio.ByteBuffer;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

public class argw extends arfu
{
    private static final Logger c;
    public argz a;
    public ByteBuffer b;
    
    static {
        c = Logger.getLogger(argw.class.getName());
    }
    
    public argw() {
        super("esds");
    }
    
    protected final long h() {
        return this.b.limit() + 4;
    }
    
    public final void i(final ByteBuffer byteBuffer) {
        this.u(byteBuffer);
        this.b = byteBuffer.slice();
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
        try {
            this.b.rewind();
            this.a = arhi.a(-1, this.b);
        }
        catch (final IndexOutOfBoundsException ex) {
            argw.c.logp(Level.WARNING, "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "_parseDetails", "Error parsing ObjectDescriptor", ex);
        }
        catch (final IOException ex2) {
            argw.c.logp(Level.WARNING, "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "_parseDetails", "Error parsing ObjectDescriptor", ex2);
        }
    }
    
    protected final void j(final ByteBuffer byteBuffer) {
        this.t(byteBuffer);
        this.b.rewind();
        byteBuffer.put(this.b);
    }
}
