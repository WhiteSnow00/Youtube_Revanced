import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dqi extends dpt
{
    private int a;
    private int b;
    private long c;
    private long d;
    
    public dqi() {
        super("hmhd");
    }
    
    protected final long h() {
        return 20L;
    }
    
    public final void i(final ByteBuffer byteBuffer) {
        ((ardf)this).u(byteBuffer);
        this.a = clm.t(byteBuffer);
        this.b = clm.t(byteBuffer);
        this.c = clm.w(byteBuffer);
        this.d = clm.w(byteBuffer);
        clm.w(byteBuffer);
    }
    
    protected final void j(final ByteBuffer byteBuffer) {
        ((ardf)this).t(byteBuffer);
        clm.k(byteBuffer, this.a);
        clm.k(byteBuffer, this.b);
        clm.m(byteBuffer, this.c);
        clm.m(byteBuffer, this.d);
        clm.m(byteBuffer, 0L);
    }
    
    public final String toString() {
        final int a = this.a;
        final int b = this.b;
        final long c = this.c;
        final long d = this.d;
        final StringBuilder sb = new StringBuilder(132);
        sb.append("HintMediaHeaderBox{maxPduSize=");
        sb.append(a);
        sb.append(", avgPduSize=");
        sb.append(b);
        sb.append(", maxBitrate=");
        sb.append(c);
        sb.append(", avgBitrate=");
        sb.append(d);
        sb.append("}");
        return sb.toString();
    }
}
