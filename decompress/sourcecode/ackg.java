import android.animation.Animator$AnimatorListener;
import android.view.ViewPropertyAnimator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ackg extends acjv
{
    public ViewPropertyAnimator b;
    
    public final void a() {
        final ViewPropertyAnimator b = this.b;
        if (b != null) {
            b.cancel();
            return;
        }
        this.f();
    }
    
    public final void b() {
        final acjn a = super.a;
        final ViewPropertyAnimator animate = a.a.a().animate();
        this.b = animate;
        animate.alpha(0.0f).setDuration(a.b).setListener((Animator$AnimatorListener)new ackf(this, a)).start();
    }
    
    protected final void d() {
    }
    
    public final void f() {
        final acjn a = super.a;
        a.a.a().setAlpha(1.0f);
        a.d.run();
    }
}
