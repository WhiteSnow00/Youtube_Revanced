import java.util.BitSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gsm extends dsr
{
    gso a;
    public final BitSet d;
    private final String[] e;
    
    public gsm() {
        this.e = new String[] { "clipCreationScrubberViewController", "isDarkMode" };
        this.d = new BitSet(2);
    }
    
    static /* bridge */ void c(final gsm gsm, final dsx dsx, final gso a) {
        gsm.v(dsx, (dst)a);
        gsm.a = a;
        gsm.d.clear();
    }
    
    @Override
    public final /* bridge */ dst a() {
        dsr.n(2, this.d, this.e);
        return (dst)this.a;
    }
    
    @Override
    protected final void b(final dst dst) {
        this.a = (gso)dst;
    }
}
