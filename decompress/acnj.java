import android.animation.Animator$AnimatorListener;
import android.view.ViewPropertyAnimator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acnj implements acmw
{
    public acmv a;
    public ViewPropertyAnimator b;
    
    public acnj() {
    }
    
    public acnj(final byte[] array) {
    }
    
    @Override
    public final void a() {
        final ViewPropertyAnimator b = this.b;
        if (b != null) {
            b.cancel();
            return;
        }
        this.c();
    }
    
    @Override
    public final void b() {
        final acmv a = this.a;
        final ViewPropertyAnimator animate = a.a.a().animate();
        this.b = animate;
        animate.alpha(1.0f).setDuration(a.b).setListener((Animator$AnimatorListener)new acnu(this, a)).start();
    }
    
    public final void c() {
        final acmv a = this.a;
        a.a.a().setAlpha(1.0f);
        a.d.run();
    }
}
