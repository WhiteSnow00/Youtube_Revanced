import android.animation.Animator;
import com.google.android.apps.youtube.app.common.ui.slimstatusbar.SlimStatusBar;
import android.graphics.ColorFilter;
import android.widget.ImageView;
import android.view.View;
import android.animation.Animator$AnimatorListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gjs implements Animator$AnimatorListener
{
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;
    
    public gjs(final View a, final tvl b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public gjs(final ImageView b, final ColorFilter a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public gjs(final chk b, final chj a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public gjs(final gju b, final SlimStatusBar a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public gjs(final jwy b, final ImageView a, final int c, final byte[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public final void onAnimationCancel(final Animator animator) {
    }
    
    public final void onAnimationEnd(final Animator animator) {
        final int c = this.c;
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        ((ImageView)this.b).setColorFilter((ColorFilter)this.a);
                        return;
                    }
                    ((tvl)this.b).d();
                }
                else {
                    ((View)this.a).setAlpha(1.0f);
                    ((cuh)((jwy)this.b).a).j();
                }
            }
            return;
        }
        ((SlimStatusBar)this.a).setBackgroundColor(((gju)this.b).b);
    }
    
    public final void onAnimationRepeat(final Animator animator) {
        if (this.c != 1) {
            return;
        }
        ((chk)this.b).a(1.0f, (chj)this.a, true);
        ((chj)this.a).f();
        final chj chj = (chj)this.a;
        chj.g();
        chj.h();
        final chk chk = (chk)this.b;
        if (chk.d) {
            chk.d = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            ((chj)this.a).d(false);
            return;
        }
        ++chk.c;
    }
    
    public final void onAnimationStart(final Animator animator) {
        final int c = this.c;
        if (c == 1) {
            ((chk)this.b).c = 0.0f;
            return;
        }
        if (c != 3) {
            return;
        }
        final Object a = this.a;
        if (a != null) {
            ((View)a).setVisibility(0);
        }
        ((tvl)this.b).e();
    }
}
