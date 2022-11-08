import android.animation.Animator;
import com.google.android.libraries.youtube.rendering.ui.spec.motion.TouchFeedbackDrawable;
import android.animation.Animator$AnimatorListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gsu implements Animator$AnimatorListener
{
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;
    
    public gsu(final adcr a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public gsu(final TouchFeedbackDrawable a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gsu(final fyn a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gsu(final gsv a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gsu(final hpm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gsu(final jli a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gsu(final udf a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gsu(final ued a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void onAnimationCancel(final Animator animator) {
        final int b = this.b;
        if (b == 0) {
            ((gsv)this.a).a = 0;
            return;
        }
        if (b == 1) {
            ((fyn)this.a).c();
            return;
        }
        if (b != 2) {
            return;
        }
        ((hpm)this.a).e();
    }
    
    public final void onAnimationEnd(final Animator animator) {
        switch (this.b) {
            default: {
                return;
            }
            case 6: {
                ((adcr)this.a).g(animator);
                return;
            }
            case 5: {
                final ued ued = (ued)this.a;
                ued.aT(ued.ax);
                return;
            }
            case 4: {
                final Object a = this.a;
                ((udf)a).ae.aP((br)a);
                return;
            }
            case 3: {
                final jli jli = (jli)this.a;
                jli.m.setBackgroundColor(jli.a);
                return;
            }
            case 2: {
                ((hpm)this.a).e();
                return;
            }
            case 1: {
                ((fyn)this.a).c();
                return;
            }
            case 0: {
                final gsv gsv = (gsv)this.a;
                gsv.a = 0;
                gsv.b = 0;
            }
        }
    }
    
    public final void onAnimationRepeat(final Animator animator) {
    }
    
    public final void onAnimationStart(final Animator animator) {
        switch (this.b) {
            default: {
                ((TouchFeedbackDrawable)this.a).a.a(0);
            }
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6: {}
        }
    }
}
