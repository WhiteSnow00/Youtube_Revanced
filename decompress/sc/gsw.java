import java.util.BitSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gsw extends dsr
{
    gsx a;
    public final BitSet d;
    private final String[] e;
    
    public gsw() {
        this.e = new String[] { "onScrollListener", "totalTimeWindowMs", "vodDurationMs" };
        this.d = new BitSet(3);
    }
    
    static /* bridge */ void c(final gsw gsw, final dsx dsx, final gsx a) {
        gsw.v(dsx, (dst)a);
        gsw.a = a;
        gsw.d.clear();
    }
    
    @Override
    public final /* bridge */ dst a() {
        dsr.n(3, this.d, this.e);
        return (dst)this.a;
    }
    
    @Override
    protected final void b(final dst dst) {
        this.a = (gsx)dst;
    }
}
