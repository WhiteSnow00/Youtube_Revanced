import java.util.BitSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gsr extends dsr
{
    gst a;
    public final BitSet d;
    private final String[] e;
    
    public gsr() {
        this.e = new String[] { "clipCreationScrubberViewController" };
        this.d = new BitSet(1);
    }
    
    static /* bridge */ void c(final gsr gsr, final dsx dsx, final gst a) {
        gsr.v(dsx, (dst)a);
        gsr.a = a;
        gsr.d.clear();
    }
    
    @Override
    public final /* bridge */ dst a() {
        dsr.n(1, this.d, this.e);
        return (dst)this.a;
    }
    
    @Override
    protected final void b(final dst dst) {
        this.a = (gst)dst;
    }
}
