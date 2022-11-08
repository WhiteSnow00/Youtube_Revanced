import android.animation.Animator$AnimatorListener;
import android.view.View;
import android.view.ViewPropertyAnimator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acki extends acju
{
    public ViewPropertyAnimator b;
    
    private static final boolean i(final acjl acjl) {
        final View a = acjl.a.a();
        final float n = acjl.g - acjl.e - a.getTranslationX();
        final float n2 = acjl.h - acjl.f - a.getTranslationY();
        if (n == 0.0f && n2 == 0.0f) {
            a.setTranslationX(0.0f);
            a.setTranslationY(0.0f);
            return false;
        }
        a.setTranslationX(-n);
        a.setTranslationY(-n2);
        return true;
    }
    
    public final void a() {
        final ViewPropertyAnimator b = this.b;
        if (b != null) {
            b.cancel();
            return;
        }
        this.h();
    }
    
    public final void b() {
        final acjl a = super.a;
        final ViewPropertyAnimator animate = a.a.a().animate();
        this.b = animate;
        animate.setDuration(a.b).translationX(0.0f).translationY(0.0f).setListener((Animator$AnimatorListener)new ackh(this, a)).start();
    }
    
    protected final boolean c() {
        return i(super.a);
    }
    
    protected final boolean d(final acjj acjj) {
        boolean i;
        final boolean b = i = i(super.a.b(acjj));
        if (b) {
            final ViewPropertyAnimator b2 = this.b;
            i = b;
            if (b2 != null) {
                b2.setListener((Animator$AnimatorListener)null).cancel();
                this.b = null;
                i = true;
            }
        }
        return i;
    }
    
    public final void h() {
        final acjl a = super.a;
        final View a2 = a.a.a();
        a2.setTranslationX(0.0f);
        a2.setTranslationY(0.0f);
        a.d.run();
    }
}
