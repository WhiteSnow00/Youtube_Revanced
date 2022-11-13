import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dri extends arfs
{
    ByteBuffer a;
    
    public dri() {
        super("sv3d");
    }
    
    public dri(final String s) {
        super(s);
    }
    
    protected final long h() {
        return this.a.limit();
    }
    
    public final void i(final ByteBuffer a) {
        (this.a = a).position(a.position() + a.remaining());
    }
    
    protected final void j(final ByteBuffer byteBuffer) {
        this.a.rewind();
        byteBuffer.put(this.a);
    }
}
