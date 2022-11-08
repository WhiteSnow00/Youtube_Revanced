import android.view.animation.Animation;
import android.view.ViewParent;
import android.view.View;
import android.view.animation.Animation$AnimationListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class org implements Animation$AnimationListener
{
    final /* synthetic */ View a;
    private final dvt b;
    
    public org(final View a) {
        this.a = a;
        final int a2 = orj.a;
        ViewParent viewParent;
        for (viewParent = a.getParent(); viewParent != null && !(viewParent instanceof dvt); viewParent = viewParent.getParent()) {}
        this.b = (dvt)viewParent;
    }
    
    public final void onAnimationEnd(final Animation animation) {
        final dvt b = this.b;
        if (b != null) {
            b.setHasTransientState(false);
        }
    }
    
    public final void onAnimationRepeat(final Animation animation) {
    }
    
    public final void onAnimationStart(final Animation animation) {
        final dvt b = this.b;
        if (b != null) {
            b.setHasTransientState(true);
        }
    }
}
