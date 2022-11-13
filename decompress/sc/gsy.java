import java.util.BitSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gsy extends dsr
{
    gta a;
    public final BitSet d;
    private final String[] e;
    
    public gsy() {
        this.e = new String[] { "clipCreationScrubberViewController" };
        this.d = new BitSet(1);
    }
    
    static /* bridge */ void c(final gsy gsy, final dsx dsx, final gta a) {
        gsy.v(dsx, (dst)a);
        gsy.a = a;
        gsy.d.clear();
    }
    
    @Override
    public final /* bridge */ dst a() {
        dsr.n(1, this.d, this.e);
        return (dst)this.a;
    }
    
    @Override
    protected final void b(final dst dst) {
        this.a = (gta)dst;
    }
}
