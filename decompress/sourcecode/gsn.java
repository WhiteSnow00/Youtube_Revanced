import java.util.BitSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gsn extends dsq
{
    gso a;
    public final BitSet d;
    private final String[] e;
    
    public gsn() {
        this.e = new String[] { "clipStoryboardClientBrokerProvider", "clipStoryboardViewAdapterProvider", "onScrollListener", "totalTimeWindowMs", "uiScheduler", "vodDurationMs" };
        this.d = new BitSet(6);
    }
    
    protected final void b(final dss dss) {
        this.a = (gso)dss;
    }
}
