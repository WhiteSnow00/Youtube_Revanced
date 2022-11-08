import android.view.ViewGroup;
import android.view.View;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.Animation$AnimationListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kmt implements Animation$AnimationListener
{
    private final kmu a;
    private final boolean b;
    
    public kmt(final kmu a, final boolean b) {
        a.getClass();
        this.a = a;
        this.b = b;
    }
    
    public final void onAnimationEnd(final Animation animation) {
        final kmu a = this.a;
        final boolean b = this.b;
        final kfi kfi = (kfi)a;
        if (tqt.e(kfi.a)) {
            if (b) {
                final View child = ((ViewGroup)kfi.b).getChildAt(0);
                if (aol.c(child.createAccessibilityNodeInfo()).a.isAccessibilityFocused()) {
                    child.performAccessibilityAction(128, (Bundle)null);
                    child.sendAccessibilityEvent(8);
                }
            }
        }
    }
    
    public final void onAnimationRepeat(final Animation animation) {
    }
    
    public final void onAnimationStart(final Animation animation) {
    }
}
