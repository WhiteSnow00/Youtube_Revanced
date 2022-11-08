import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class drn extends ardf
{
    public long a;
    public long b;
    public long c;
    public drm d;
    private long e;
    
    public drn() {
        super("trex");
    }
    
    protected final long h() {
        return 24L;
    }
    
    public final void i(final ByteBuffer byteBuffer) {
        this.u(byteBuffer);
        this.a = clm.w(byteBuffer);
        this.e = clm.w(byteBuffer);
        this.b = clm.w(byteBuffer);
        this.c = clm.w(byteBuffer);
        this.d = new drm(byteBuffer);
    }
    
    protected final void j(final ByteBuffer byteBuffer) {
        this.t(byteBuffer);
        clm.m(byteBuffer, this.a);
        clm.m(byteBuffer, this.e);
        clm.m(byteBuffer, this.b);
        clm.m(byteBuffer, this.c);
        this.d.a(byteBuffer);
    }
}
