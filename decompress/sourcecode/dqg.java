import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dqg extends ardd
{
    byte[] a;
    
    public dqg() {
        super("skip");
    }
    
    @Override
    protected final long h() {
        return this.a.length;
    }
    
    public final void i(final ByteBuffer byteBuffer) {
        byteBuffer.get(this.a = new byte[byteBuffer.remaining()]);
    }
    
    @Override
    protected final void j(final ByteBuffer byteBuffer) {
        byteBuffer.put(this.a);
    }
    
    @Override
    public final String toString() {
        final int length = this.a.length;
        final String h = super.h;
        final StringBuilder sb = new StringBuilder(h.length() + 36);
        sb.append("FreeSpaceBox[size=");
        sb.append(length);
        sb.append(";type=");
        sb.append(h);
        sb.append("]");
        return sb.toString();
    }
}
