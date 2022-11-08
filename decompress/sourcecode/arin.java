import android.os.Bundle;
import android.view.LayoutInflater;
import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class arin implements arix
{
    private volatile Object a;
    private final Object b;
    private final br c;
    
    public arin(final br c) {
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
        return (ContextWrapper)new ariq(context, br);
    }
    
    public static ContextWrapper f(final LayoutInflater layoutInflater, final br br) {
        return (ContextWrapper)new ariq(layoutInflater, br);
    }
    
    public static final void g(final br br) {
        aqqn.m((Object)br);
        if (br.m == null) {
            br.ag(new Bundle());
        }
    }
    
    public final Object aR() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    aqqn.n(this.c.O(), "Sting Fragments must be attached before creating the component.");
                    final br c = this.c;
                    aqqn.l(c.O() instanceof arix, "Sting Fragments must be attached to an @Sting Activity. Found: %s", new Object[] { c.O().getClass() });
                    this.c(this.c);
                    final eqb bd = ((arim)aqqm.k(this.c.O(), (Class)arim.class)).bd();
                    aqzg.z((Object)(bd.b = this.c), (Class)br.class);
                    this.a = new esp(bd.a, bd.c, bd.d, bd.b);
                }
            }
        }
        return this.a;
    }
    
    protected void c(final br br) {
    }
}
