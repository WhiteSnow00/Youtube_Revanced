import android.animation.Animator;
import android.animation.Animator$AnimatorListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hhd implements Animator$AnimatorListener
{
    final /* synthetic */ boolean a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;
    
    public hhd(final hhi b, final boolean a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public hhd(final ufk b, final boolean a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public final void onAnimationCancel(final Animator animator) {
        final int c = this.c;
        if (c != 0 && c != 1) {
            ((ufk)this.b).i.tr((Object)this.a);
        }
    }
    
    public final void onAnimationEnd(final Animator animator) {
        final int c = this.c;
        if (c != 0) {
            if (c != 1) {
                if (!this.a) {
                    ((ufk)this.b).j.setVisibility(8);
                    ((ufk)this.b).k.setVisibility(0);
                }
                ((ufk)this.b).i.tr((Object)this.a);
                return;
            }
            if (!this.a) {
                ((hhi)this.b).au.setVisibility(8);
                ((hhi)this.b).av.setVisibility(8);
            }
            else {
                ((hhi)this.b).ax.setVisibility(8);
            }
            ((hhi)this.b).ar.setEnabled(true);
            ((hhi)this.b).at.setEnabled(true);
            ((hhi)this.b).av.setEnabled(true);
        }
        else {
            if (this.a) {
                ((hhi)this.b).au.setVisibility(8);
                ((hhi)this.b).av.setVisibility(8);
                return;
            }
            ((hhi)this.b).aw.setVisibility(8);
        }
    }
    
    public final void onAnimationRepeat(final Animator animator) {
    }
    
    public final void onAnimationStart(final Animator animator) {
        final int c = this.c;
        if (c != 0) {
            if (c != 1) {
                if (this.a) {
                    ((ufk)this.b).j.setVisibility(0);
                    ((ufk)this.b).j.setAlpha(0.0f);
                }
                return;
            }
            if (this.a) {
                ((hhi)this.b).au.setVisibility(0);
                ((hhi)this.b).av.setVisibility(0);
            }
            else {
                ((hhi)this.b).ax.setVisibility(0);
            }
            ((hhi)this.b).ar.setEnabled(false);
            ((hhi)this.b).at.setEnabled(false);
            ((hhi)this.b).av.setEnabled(false);
        }
        else {
            if (this.a) {
                ((hhi)this.b).aw.setVisibility(0);
                return;
            }
            ((hhi)this.b).au.setVisibility(0);
            ((hhi)this.b).av.setVisibility(0);
        }
    }
}
