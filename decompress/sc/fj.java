import android.widget.PopupWindow;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class fj extends anm
{
    final fk a;
    
    public fj(final fk a) {
        this.a = a;
    }
    
    public final void a(final View view) {
        this.a.a.q.setVisibility(8);
        final fw a = this.a.a;
        final PopupWindow r = a.r;
        if (r != null) {
            r.dismiss();
        }
        else if (a.q.getParent() instanceof View) {
            anb.L((View)this.a.a.q.getParent());
        }
        this.a.a.q.i();
        this.a.a.I.s((anl)null);
        final fw a2 = this.a.a;
        a2.I = null;
        anb.L((View)a2.u);
    }
}