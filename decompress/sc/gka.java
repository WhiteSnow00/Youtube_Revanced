import android.animation.Animator;
import com.google.android.apps.youtube.app.common.ui.slimstatusbar.SlimStatusBar;
import android.graphics.ColorFilter;
import android.widget.ImageView;
import android.view.View;
import android.animation.Animator$AnimatorListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gka implements Animator$AnimatorListener
{
    final Object a;
    final Object b;
    private final int c;
    
    public gka(final View a, final txr b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public gka(final ImageView b, final ColorFilter a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public gka(final chl b, final chk a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public gka(final gkc b, final SlimStatusBar a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public gka(final jya b, final ImageView a, final int c, final byte[] array) {
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
                    ((txr)this.b).d();
                }
                else {
                    ((View)this.a).setAlpha(1.0f);
                    ((cui)((jya)this.b).a).j();
                }
            }
            return;
        }
        ((SlimStatusBar)this.a).setBackgroundColor(((gkc)this.b).b);
    }
    
    public final void onAnimationRepeat(final Animator animator) {
        if (this.c != 1) {
            return;
        }
        ((chl)this.b).a(1.0f, (chk)this.a, true);
        ((chk)this.a).f();
        final chk chk = (chk)this.a;
        chk.g();
        chk.h();
        final chl chl = (chl)this.b;
        if (chl.d) {
            chl.d = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            ((chk)this.a).d(false);
            return;
        }
        ++chl.c;
    }
    
    public final void onAnimationStart(final Animator animator) {
        final int c = this.c;
        if (c == 1) {
            ((chl)this.b).c = 0.0f;
            return;
        }
        if (c != 3) {
            return;
        }
        final Object a = this.a;
        if (a != null) {
            ((View)a).setVisibility(0);
        }
        ((txr)this.b).e();
    }
}
