import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dro extends arfu
{
    public long a;
    public long b;
    public long c;
    public drn d;
    private long e;
    
    public dro() {
        super("trex");
    }
    
    protected final long h() {
        return 24L;
    }
    
    public final void i(final ByteBuffer byteBuffer) {
        this.u(byteBuffer);
        this.a = cln.w(byteBuffer);
        this.e = cln.w(byteBuffer);
        this.b = cln.w(byteBuffer);
        this.c = cln.w(byteBuffer);
        this.d = new drn(byteBuffer);
    }
    
    protected final void j(final ByteBuffer byteBuffer) {
        this.t(byteBuffer);
        cln.m(byteBuffer, this.a);
        cln.m(byteBuffer, this.e);
        cln.m(byteBuffer, this.b);
        cln.m(byteBuffer, this.c);
        this.d.a(byteBuffer);
    }
}
