import java.util.BitSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class efm extends dsr
{
    public efo a;
    public final BitSet d;
    private final String[] e;
    
    public efm() {
        this.e = new String[] { "childComponent" };
        this.d = new BitSet(1);
    }
    
    public static /* bridge */ void c(final efm efm, final dsx dsx, final efo a) {
        efm.v(dsx, (dst)a);
        efm.a = a;
        efm.d.clear();
    }
    
    @Override
    public final /* bridge */ dst a() {
        dsr.n(1, this.d, this.e);
        return (dst)this.a;
    }
    
    @Override
    protected final void b(final dst dst) {
        this.a = (efo)dst;
    }
}
