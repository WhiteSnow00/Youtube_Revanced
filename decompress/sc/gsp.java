import java.util.BitSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gsp extends dsr
{
    gsq a;
    public final BitSet d;
    private final String[] e;
    
    public gsp() {
        this.e = new String[] { "clipCreationScrubberViewController" };
        this.d = new BitSet(1);
    }
    
    static /* bridge */ void c(final gsp gsp, final dsx dsx, final gsq a) {
        gsp.v(dsx, (dst)a);
        gsp.a = a;
        gsp.d.clear();
    }
    
    @Override
    public final /* bridge */ dst a() {
        dsr.n(1, this.d, this.e);
        return (dst)this.a;
    }
    
    @Override
    protected final void b(final dst dst) {
        this.a = (gsq)dst;
    }
}
