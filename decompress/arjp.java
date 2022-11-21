import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arjp extends arim
{
    public int a;
    public int b;
    
    public arjp() {
        super("pasp");
    }
    
    @Override
    protected final long h() {
        return 8L;
    }
    
    @Override
    protected final void i(final ByteBuffer byteBuffer) {
        this.a = byteBuffer.getInt();
        this.b = byteBuffer.getInt();
    }
    
    @Override
    protected final void j(final ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.a);
        byteBuffer.putInt(this.b);
    }
}
