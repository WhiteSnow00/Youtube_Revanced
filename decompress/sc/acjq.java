import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.AbsListView$LayoutParams;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.LinearLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acjq extends acje
{
    private LinearLayout a;
    
    public acjq(final Context context, final ackr ackr, final acku acku) {
        super(context, ackr, acku);
    }
    
    protected final ViewGroup b(final Context context) {
        (this.a = new LinearLayout(context)).setOrientation(0);
        this.a.setLayoutParams((ViewGroup$LayoutParams)new AbsListView$LayoutParams(-1, -2));
        this.a.setGravity(48);
        return (ViewGroup)this.a;
    }
    
    protected final acjj d(final Context context, final acku acku) {
        return (acjj)new acjp(context, acku);
    }
    
    protected final void g(final ackm ackm, final acjo acjo) {
        this.a.setPadding(ackm.b("grid_row_presenter_horizontal_row_padding", acjo.e), ackm.b("grid_row_presenter_top_padding", acjo.c), ackm.b("grid_row_presenter_horizontal_row_padding", acjo.f), ackm.b("grid_row_presenter_bottom_padding", acjo.d));
    }
    
    protected final void i(final View view, final acjo acjo, int g) {
        g = acjo.g;
        view.setPadding(g, 0, g, 0);
        this.a.addView(view);
    }
}
