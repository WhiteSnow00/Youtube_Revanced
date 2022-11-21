import android.graphics.Paint;
import android.animation.Animator;
import android.view.View;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class cij extends AnimatorListenerAdapter
{
    private final View a;
    private boolean b;
    
    public cij(final View a) {
        this.b = false;
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        cjh.c(this.a, 1.0f);
        if (this.b) {
            this.a.setLayerType(0, (Paint)null);
        }
    }
    
    public final void onAnimationStart(final Animator animator) {
        if (anc.ak(this.a) && this.a.getLayerType() == 0) {
            this.b = true;
            this.a.setLayerType(2, (Paint)null);
        }
    }
}
