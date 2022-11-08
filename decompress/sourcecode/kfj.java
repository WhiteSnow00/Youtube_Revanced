import java.util.List;
import android.view.View;
import android.content.Context;
import android.widget.FrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kfj implements acil, gfa, gjc
{
    private final vax a;
    private final atjj b;
    private final atjj c;
    private final FrameLayout d;
    private Object e;
    private gli f;
    private acil g;
    private kcn h;
    private kfi i;
    
    public kfj(final Context context, final atjj b, final atjj c, final vax a) {
        this.d = new FrameLayout(context);
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public final View a() {
        return (View)this.d;
    }
    
    public final boolean b(final gjc gjc) {
        return gjc instanceof kfj && ((kfj)gjc).e == this.e;
    }
    
    public final void c(final acir acir) {
        final acil g = this.g;
        if (g != null) {
            g.c(acir);
            this.g = null;
        }
        this.f = null;
        this.e = null;
    }
    
    public final View f() {
        final acil g = this.g;
        if (g == null) {
            return null;
        }
        return ((gfa)g).f();
    }
    
    public final void k(final boolean b) {
        final acil g = this.g;
        if (g != null) {
            ((gfa)g).k(b);
        }
    }
    
    public final asgn pR(final int n) {
        final acil g = this.g;
        if (g instanceof gjc) {
            return ((gjc)g).pR(n);
        }
        return asgn.f();
    }
}
