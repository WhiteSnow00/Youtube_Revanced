import java.util.BitSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oux extends dsq
{
    public ouz a;
    private final String[] d;
    private final BitSet e;
    
    public oux() {
        this.d = new String[] { "componentCallable" };
        this.e = new BitSet(1);
    }
    
    protected final void b(final dss dss) {
        this.a = (ouz)dss;
    }
    
    public final ouz c() {
        n(1, this.e, this.d);
        return this.a;
    }
    
    public final void e(final ouo b) {
        this.a.b = b;
        this.e.set(0);
    }
    
    public final void f(final orz c) {
        this.a.c = c;
    }
}
