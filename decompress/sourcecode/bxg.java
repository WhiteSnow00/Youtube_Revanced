import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class bxg extends bdf implements bxi
{
    private final String a;
    
    protected bxg(final String a) {
        super((bdb[])new bxk[2], (bdd[])new bxl[2]);
        this.a = a;
        this.l(1024);
    }
    
    public final String c() {
        return this.a;
    }
    
    protected abstract bxh n(final byte[] p0, final int p1, final boolean p2);
    
    public final void t(final long n) {
    }
}
