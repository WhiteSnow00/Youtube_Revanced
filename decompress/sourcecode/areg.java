import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class areg extends ardd
{
    public int a;
    public int b;
    
    public areg() {
        super("pasp");
    }
    
    protected final long h() {
        return 8L;
    }
    
    protected final void i(final ByteBuffer byteBuffer) {
        this.a = byteBuffer.getInt();
        this.b = byteBuffer.getInt();
    }
    
    protected final void j(final ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.a);
        byteBuffer.putInt(this.b);
    }
}
