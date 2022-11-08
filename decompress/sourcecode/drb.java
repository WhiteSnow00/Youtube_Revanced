import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class drb extends dpt
{
    public drb() {
        super("sthd");
    }
    
    protected final long h() {
        return 4L;
    }
    
    public final void i(final ByteBuffer byteBuffer) {
        ((ardf)this).u(byteBuffer);
    }
    
    protected final void j(final ByteBuffer byteBuffer) {
        ((ardf)this).t(byteBuffer);
    }
    
    public final String toString() {
        return "SubtitleMediaHeaderBox";
    }
}
