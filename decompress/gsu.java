import java.util.BitSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gsu extends dsr
{
    public gsv a;
    public final BitSet d;
    private final String[] e;
    
    public gsu() {
        this.e = new String[] { "clipCreationScrubberViewController", "isDarkMode", "vodDurationMs", "windowSizeMs" };
        this.d = new BitSet(4);
    }
    
    public static /* bridge */ void c(final gsu gsu, final dsx dsx, final gsv a) {
        gsu.v(dsx, (dst)a);
        gsu.a = a;
        gsu.d.clear();
    }
    
    @Override
    public final /* bridge */ dst a() {
        dsr.n(4, this.d, this.e);
        return (dst)this.a;
    }
    
    @Override
    protected final void b(final dst dst) {
        this.a = (gsv)dst;
    }
}
