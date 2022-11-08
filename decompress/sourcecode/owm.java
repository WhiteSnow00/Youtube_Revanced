import java.util.BitSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class owm extends dsq
{
    owo a;
    public final BitSet d;
    private final String[] e;
    
    public owm() {
        this.e = new String[] { "componentCallable" };
        this.d = new BitSet(1);
    }
    
    protected final void b(final dss dss) {
        this.a = (owo)dss;
    }
    
    public final owo c() {
        n(1, this.d, this.e);
        return this.a;
    }
}
