import android.os.Bundle;
import android.view.LayoutInflater;
import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class arlc implements arlm
{
    private volatile Object a;
    private final Object b;
    private final br c;
    
    public arlc(final br c) {
        this.b = new Object();
        this.c = c;
    }
    
    public static final Context d(Context baseContext) {
        while (baseContext instanceof ContextWrapper && !(baseContext instanceof Activity)) {
            baseContext = ((ContextWrapper)baseContext).getBaseContext();
        }
        return baseContext;
    }
    
    public static ContextWrapper e(final Context context, final br br) {
        return (ContextWrapper)new arlf(context, br);
    }
    
    public static ContextWrapper f(final LayoutInflater layoutInflater, final br br) {
        return (ContextWrapper)new arlf(layoutInflater, br);
    }
    
    public static final void g(final br br) {
        aqsz.m((Object)br);
        if (br.m == null) {
            br.ag(new Bundle());
        }
    }
    
    public final Object aR() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    aqsz.n(this.c.O(), "Sting Fragments must be attached before creating the component.");
                    final br c = this.c;
                    aqsz.l(c.O() instanceof arlm, "Sting Fragments must be attached to an @Sting Activity. Found: %s", new Object[] { c.O().getClass() });
                    this.c(this.c);
                    final eqe bh = ((arlb)aqsy.k(this.c.O(), (Class)arlb.class)).bh();
                    arbu.y(bh.b = this.c, br.class);
                    this.a = new ess(bh.a, bh.c, bh.d, bh.b);
                }
            }
        }
        return this.a;
    }
    
    protected void c(final br br) {
    }
}
