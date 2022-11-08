import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.widget.FrameLayout;
import android.content.Context;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fus extends acja
{
    private final acio a;
    private final ViewGroup b;
    private final acir c;
    private final FrameLayout$LayoutParams d;
    private acil e;
    
    public fus(final Context context, final giz a, final acir c) {
        this.a = (acio)a;
        final FrameLayout b = new FrameLayout(context);
        this.b = (ViewGroup)b;
        this.c = c;
        a.c((View)b);
        ((ViewGroup)b).setLayoutParams((ViewGroup$LayoutParams)(this.d = new FrameLayout$LayoutParams(-1, -2)));
    }
    
    public final View a() {
        return ((giz)this.a).a;
    }
    
    public final void c(final acir acir) {
        this.b.removeAllViews();
        final acil e = this.e;
        if (e == null) {
            return;
        }
        acir.b(e.a());
    }
}
