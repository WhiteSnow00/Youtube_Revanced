import java.util.BitSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adfa extends dsr
{
    public adfb a;
    public final BitSet d;
    private final String[] e;
    
    public adfa() {
        this.e = new String[] { "analyticsChartType", "commandResolver" };
        this.d = new BitSet(2);
    }
    
    public static /* bridge */ void c(final adfa adfa, final dsx dsx, final adfb a) {
        adfa.v(dsx, (dst)a);
        adfa.a = a;
        adfa.d.clear();
    }
    
    public final /* bridge */ dst a() {
        n(2, this.d, this.e);
        return this.a;
    }
    
    protected final void b(final dst dst) {
        this.a = (adfb)dst;
    }
}
