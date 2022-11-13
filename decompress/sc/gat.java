import android.animation.Animator;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gat extends AnimatorListenerAdapter
{
    final gbd a;
    final gbe b;
    final BottomUiContainer c;
    final hft d;
    
    public gat(final BottomUiContainer c, final gbd a, final gbe b, final hft d, final byte[] array, final byte[] array2) {
        this.c = c;
        this.a = a;
        this.b = b;
        this.d = d;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.c.s(this.a, this.b, this.d);
    }
}
