import android.view.View;
import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ged
{
    public static final ged a;
    public final gle b;
    private final WeakReference c;
    
    static {
        a = new ged(null, (gle)gli.a);
    }
    
    public ged(final gfa gfa, final gle b) {
        this.c = new WeakReference((T)gfa);
        this.b = b;
    }
    
    public final View a() {
        final gfa gfa = (gfa)this.c.get();
        if (gfa == null) {
            return null;
        }
        return gfa.f();
    }
    
    public final gfa b() {
        return (gfa)this.c.get();
    }
    
    public final void c(final boolean b) {
        final gfa gfa = (gfa)this.c.get();
        if (gfa == null) {
            return;
        }
        gfa.k(b);
    }
}
