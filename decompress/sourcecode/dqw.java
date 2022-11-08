import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dqw extends dpt
{
    private float a;
    
    public dqw() {
        super("smhd");
    }
    
    protected final long h() {
        return 8L;
    }
    
    public final void i(final ByteBuffer byteBuffer) {
        ((ardf)this).u(byteBuffer);
        this.a = clm.r(byteBuffer);
        clm.t(byteBuffer);
    }
    
    protected final void j(final ByteBuffer byteBuffer) {
        ((ardf)this).t(byteBuffer);
        clm.j(byteBuffer, (double)this.a);
        clm.k(byteBuffer, 0);
    }
    
    public final String toString() {
        final float a = this.a;
        final StringBuilder sb = new StringBuilder(44);
        sb.append("SoundMediaHeaderBox[balance=");
        sb.append(a);
        sb.append("]");
        return sb.toString();
    }
}
