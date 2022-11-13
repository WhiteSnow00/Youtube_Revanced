import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class bxh extends bdg implements bxj
{
    private final String a;
    
    protected bxh(final String a) {
        super((bdc[])new bxl[2], (bde[])new bxm[2]);
        this.a = a;
        this.l(1024);
    }
    
    public final String c() {
        return this.a;
    }
    
    protected final /* bridge */ bda g(final Throwable t) {
        return new bxk("Unexpected decode error", t);
    }
    
    protected final /* bridge */ bda h(bdc bdc, final bde bde, final boolean b) {
        bdc = bdc;
        final bxm bxm = (bxm)bde;
        try {
            final ByteBuffer c = ((bxl)bdc).c;
            dk.d((Object)c);
            bxm.e(((bxl)bdc).e, this.n(c.array(), c.limit(), b), ((bxl)bdc).g);
            ((bcw)bxm).clearFlag(Integer.MIN_VALUE);
            bdc = null;
        }
        catch (final bxk bxk) {}
        return (bda)bdc;
    }
    
    protected final /* bridge */ bdc i() {
        return new bxl();
    }
    
    protected final /* bridge */ bde j() {
        return (bde)new bxg(this);
    }
    
    protected abstract bxi n(final byte[] p0, final int p1, final boolean p2);
    
    public final void t(final long n) {
    }
}
