import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dqx extends dpw
{
    public long[] a;
    
    public dqx() {
        super("stco");
        this.a = new long[0];
    }
    
    protected final long h() {
        return this.a.length * 4 + 8;
    }
    
    public final void i(final ByteBuffer byteBuffer) {
        ((ardf)this).u(byteBuffer);
        final int q = aqqm.q(clm.w(byteBuffer));
        this.a = new long[q];
        for (int i = 0; i < q; ++i) {
            this.a[i] = clm.w(byteBuffer);
        }
    }
    
    protected final void j(final ByteBuffer byteBuffer) {
        ((ardf)this).t(byteBuffer);
        clm.m(byteBuffer, (long)this.a.length);
        final long[] a = this.a;
        for (int length = a.length, i = 0; i < length; ++i) {
            clm.m(byteBuffer, a[i]);
        }
    }
    
    public final long[] k() {
        return this.a;
    }
}
