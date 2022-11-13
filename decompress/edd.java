import java.util.BitSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class edd extends dsr
{
    public edf a;
    public final BitSet d;
    private final String[] e;
    
    public edd() {
        this.e = new String[] { "binder" };
        this.d = new BitSet(1);
    }
    
    public static /* bridge */ void c(final edd edd, final dsx dsx, final edf a) {
        edd.v(dsx, (dst)a);
        edd.a = a;
        edd.d.clear();
    }
    
    @Override
    public final /* bridge */ dst a() {
        dsr.n(1, this.d, this.e);
        return (dst)this.a;
    }
    
    @Override
    protected final void b(final dst dst) {
        this.a = (edf)dst;
    }
    
    public final void d(final boolean c) {
        this.a.c = c;
    }
    
    @Override
    public final /* bridge */ void r(final boolean b) {
        this.d(b);
    }
    
    @Override
    public final /* bridge */ void s(final CharSequence e) {
        super.s(e);
        this.a.e = e;
    }
}
