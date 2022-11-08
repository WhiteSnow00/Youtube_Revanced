import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class drh extends ardd
{
    ByteBuffer a;
    
    public drh() {
        super("sv3d");
    }
    
    public drh(final String s) {
        super(s);
    }
    
    @Override
    protected final long h() {
        return this.a.limit();
    }
    
    public final void i(final ByteBuffer a) {
        (this.a = a).position(a.position() + a.remaining());
    }
    
    @Override
    protected final void j(final ByteBuffer byteBuffer) {
        this.a.rewind();
        byteBuffer.put(this.a);
    }
}
