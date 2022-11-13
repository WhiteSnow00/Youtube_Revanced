import android.text.TextUtils$TruncateAt;
import java.util.BitSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ees extends dsr
{
    public eeu a;
    public final BitSet d;
    private final String[] e;
    
    public ees() {
        this.e = new String[] { "text" };
        this.d = new BitSet(1);
    }
    
    public static /* bridge */ void d(final ees ees, final dsx dsx, final eeu a) {
        ees.v(dsx, (dst)a);
        ees.a = a;
        ees.d.clear();
    }
    
    @Override
    public final /* bridge */ dst a() {
        return (dst)this.c();
    }
    
    @Override
    protected final void b(final dst dst) {
        this.a = (eeu)dst;
    }
    
    public final eeu c() {
        dsr.n(1, this.d, this.e);
        return this.a;
    }
    
    public final void e(final int m) {
        this.a.M = m;
    }
    
    public final void f(final TextUtils$TruncateAt e) {
        this.a.e = e;
    }
    
    public final void g(final int y) {
        this.a.y = y;
    }
}
