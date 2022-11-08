import android.view.View;
import android.view.ViewGroup;
import android.animation.LayoutTransition;
import android.animation.LayoutTransition$TransitionListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jlh implements LayoutTransition$TransitionListener
{
    private final /* synthetic */ int a;
    
    public jlh(final int a) {
        this.a = a;
    }
    
    public final void endTransition(final LayoutTransition layoutTransition, final ViewGroup viewGroup, final View view, int a) {
        a = this.a;
        if (a == 0) {
            viewGroup.setLayoutTransition((LayoutTransition)null);
            return;
        }
        if (a != 1) {
            viewGroup.setLayoutTransition((LayoutTransition)null);
            return;
        }
        viewGroup.setLayoutTransition((LayoutTransition)null);
    }
    
    public final void startTransition(final LayoutTransition layoutTransition, final ViewGroup viewGroup, final View view, final int n) {
    }
}
