import java.util.BitSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dxr extends dsq
{
    private static final String[] a;
    private final BitSet d;
    private dxs e;
    
    static {
        a = new String[] { "delegate" };
    }
    
    public dxr() {
        this.d = new BitSet(1);
    }
    
    protected final void b(final dss dss) {
        this.e = (dxs)dss;
    }
    
    public final dxs c() {
        n(1, this.d, dxr.a);
        return this.e;
    }
    
    public final void e(final dss a) {
        this.d.set(0);
        this.e.a = a;
    }
}
