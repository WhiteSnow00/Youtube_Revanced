import android.animation.Animator;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gal extends AnimatorListenerAdapter
{
    final /* synthetic */ gav a;
    final /* synthetic */ gaw b;
    final /* synthetic */ BottomUiContainer c;
    final /* synthetic */ hez d;
    
    public gal(final BottomUiContainer c, final gav a, final gaw b, final hez d, final byte[] array, final byte[] array2) {
        this.c = c;
        this.a = a;
        this.b = b;
        this.d = d;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.c.s(this.a, this.b, this.d);
    }
}
