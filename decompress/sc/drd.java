import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class drd extends arfu
{
    public long[] a;
    
    public drd() {
        super("stss");
    }
    
    protected final long h() {
        return this.a.length * 4 + 8;
    }
    
    public final void i(final ByteBuffer byteBuffer) {
        this.u(byteBuffer);
        final int q = aqsy.q(cln.w(byteBuffer));
        this.a = new long[q];
        for (int i = 0; i < q; ++i) {
            this.a[i] = cln.w(byteBuffer);
        }
    }
    
    protected final void j(final ByteBuffer byteBuffer) {
        this.t(byteBuffer);
        cln.m(byteBuffer, (long)this.a.length);
        final long[] a = this.a;
        for (int length = a.length, i = 0; i < length; ++i) {
            cln.m(byteBuffer, a[i]);
        }
    }
    
    public final String toString() {
        final int length = this.a.length;
        final StringBuilder sb = new StringBuilder(37);
        sb.append("SyncSampleBox[entryCount=");
        sb.append(length);
        sb.append("]");
        return sb.toString();
    }
}
