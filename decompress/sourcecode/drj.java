import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class drj extends dpt
{
    private int a;
    private int[] b;
    
    public drj() {
        super("vmhd");
        this.a = 0;
        this.b = new int[] { 0, 0, 0 };
        ((ardf)this).r = 1;
    }
    
    protected final long h() {
        return 12L;
    }
    
    public final void i(final ByteBuffer byteBuffer) {
        ((ardf)this).u(byteBuffer);
        this.a = clm.t(byteBuffer);
        this.b = new int[3];
        for (int i = 0; i < 3; ++i) {
            this.b[i] = clm.t(byteBuffer);
        }
    }
    
    protected final void j(final ByteBuffer byteBuffer) {
        ((ardf)this).t(byteBuffer);
        clm.k(byteBuffer, this.a);
        final int[] b = this.b;
        final int length = b.length;
        for (int i = 0; i < 3; ++i) {
            clm.k(byteBuffer, b[i]);
        }
    }
    
    public final String toString() {
        final int a = this.a;
        final int[] b = this.b;
        final int n = b[0];
        final int n2 = b[1];
        final int n3 = b[2];
        final StringBuilder sb = new StringBuilder(108);
        sb.append("VideoMediaHeaderBox[graphicsmode=");
        sb.append(a);
        sb.append(";opcolor0=");
        sb.append(n);
        sb.append(";opcolor1=");
        sb.append(n2);
        sb.append(";opcolor2=");
        sb.append(n3);
        sb.append("]");
        return sb.toString();
    }
}
