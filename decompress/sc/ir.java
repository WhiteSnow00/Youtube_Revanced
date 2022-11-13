import android.view.View;
import android.view.CollapsibleActionView;
import android.widget.FrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

final class ir extends FrameLayout implements hn
{
    final CollapsibleActionView a;
    
    public ir(final View view) {
        super(view.getContext());
        this.a = (CollapsibleActionView)view;
        this.addView(view);
    }
    
    public final void onActionViewCollapsed() {
        this.a.onActionViewCollapsed();
    }
    
    public final void onActionViewExpanded() {
        this.a.onActionViewExpanded();
    }
}
