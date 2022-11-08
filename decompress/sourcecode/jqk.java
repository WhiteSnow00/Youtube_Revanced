import android.view.View;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jqk extends acja
{
    private final FrameLayout a;
    private final acir b;
    private final ViewGroup c;
    private acil d;
    
    public jqk(final Context context, final acir b, final ViewGroup c) {
        this.b = b;
        this.c = c;
        this.a = new FrameLayout(context);
    }
    
    public final View a() {
        return (View)this.a;
    }
    
    public final void c(final acir acir) {
        final acil d = this.d;
        if (d != null) {
            d.c(acir);
            this.a.removeAllViews();
        }
    }
}
