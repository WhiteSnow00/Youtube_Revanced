import java.util.BitSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class een extends dsr
{
    eeo a;
    private final String[] d;
    private final BitSet e;
    
    public een() {
        this.d = new String[] { "color" };
        this.e = new BitSet(1);
    }
    
    static /* bridge */ void d(final een een, final dsx dsx, final eeo a) {
        een.v(dsx, (dst)a);
        een.a = a;
        een.e.clear();
    }
    
    @Override
    public final /* bridge */ dst a() {
        return (dst)this.c();
    }
    
    @Override
    protected final void b(final dst dst) {
        this.a = (eeo)dst;
    }
    
    public final eeo c() {
        dsr.n(1, this.e, this.d);
        return this.a;
    }
    
    public final void e(final float a) {
        this.a.a = a;
    }
    
    public final void f() {
        this.a.b = 0;
        this.e.set(0);
    }
    
    @Override
    public final /* bridge */ void o(final float n) {
        this.e(n);
    }
}
