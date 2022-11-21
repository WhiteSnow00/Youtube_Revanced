import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.AbsListView$LayoutParams;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.LinearLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acld extends ackr
{
    private LinearLayout a;
    
    public acld(final Context context, final acme acme, final acmh acmh) {
        super(context, acme, acmh);
    }
    
    protected final ViewGroup b(final Context context) {
        (this.a = new LinearLayout(context)).setOrientation(0);
        this.a.setLayoutParams((ViewGroup$LayoutParams)new AbsListView$LayoutParams(-1, -2));
        this.a.setGravity(48);
        return (ViewGroup)this.a;
    }
    
    protected final ackw d(final Context context, final acmh acmh) {
        return (ackw)new aclc(context, acmh);
    }
    
    protected final void g(final aclz aclz, final aclb aclb) {
        this.a.setPadding(aclz.b("grid_row_presenter_horizontal_row_padding", aclb.e), aclz.b("grid_row_presenter_top_padding", aclb.c), aclz.b("grid_row_presenter_horizontal_row_padding", aclb.f), aclz.b("grid_row_presenter_bottom_padding", aclb.d));
    }
    
    protected final void i(final View view, final aclb aclb, int g) {
        g = aclb.g;
        view.setPadding(g, 0, g, 0);
        this.a.addView(view);
    }
}
