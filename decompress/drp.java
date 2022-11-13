import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class drp extends arfu
{
    public long a;
    
    public drp() {
        super("tfdt");
    }
    
    protected final long h() {
        if (this.s() == 0) {
            return 8L;
        }
        return 12L;
    }
    
    public final void i(final ByteBuffer byteBuffer) {
        this.u(byteBuffer);
        if (this.s() == 1) {
            this.a = cln.x(byteBuffer);
            return;
        }
        this.a = cln.w(byteBuffer);
    }
    
    protected final void j(final ByteBuffer byteBuffer) {
        this.t(byteBuffer);
        if (this.s() == 1) {
            byteBuffer.putLong(this.a);
            return;
        }
        cln.m(byteBuffer, this.a);
    }
    
    public final String toString() {
        final long a = this.a;
        final StringBuilder sb = new StringBuilder(77);
        sb.append("TrackFragmentBaseMediaDecodeTimeBox{baseMediaDecodeTime=");
        sb.append(a);
        sb.append("}");
        return sb.toString();
    }
}
