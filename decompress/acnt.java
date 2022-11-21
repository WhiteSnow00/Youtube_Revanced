import android.animation.Animator$AnimatorListener;
import android.view.View;
import android.view.ViewPropertyAnimator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acnt extends acnm
{
    public ViewPropertyAnimator b;
    public ViewPropertyAnimator c;
    private float d;
    private float e;
    
    private static final void g(final View view) {
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }
    
    @Override
    public final void a() {
        final ViewPropertyAnimator b = this.b;
        if (b != null) {
            b.cancel();
        }
        else {
            this.f();
        }
        final ViewPropertyAnimator c = this.c;
        if (c != null) {
            c.cancel();
            return;
        }
        this.e();
    }
    
    @Override
    public final void b() {
        final acng a = super.a;
        final long c = a.c;
        final ViewPropertyAnimator animate = a.a.a().animate();
        this.b = animate;
        animate.setDuration(c).alpha(0.0f).translationX(this.d).translationY(this.e).setListener((Animator$AnimatorListener)new acnr(this, a)).start();
        final ViewPropertyAnimator animate2 = a.b.a().animate();
        this.c = animate2;
        animate2.setDuration(c).alpha(1.0f).translationX(0.0f).translationY(0.0f).setListener((Animator$AnimatorListener)new acns(this, a)).start();
    }
    
    @Override
    protected final boolean c() {
        final acng a = super.a;
        this.d = (float)(a.j - a.h);
        this.e = (float)(a.k - a.i);
        final View a2 = a.a.a();
        final float d = this.d;
        final float translationX = a2.getTranslationX();
        final float e = this.e;
        final float translationY = a2.getTranslationY();
        final View a3 = a.b.a();
        a3.setAlpha(0.0f);
        a3.setTranslationX(-(d - translationX));
        a3.setTranslationY(-(e - translationY));
        return true;
    }
    
    public final void e() {
        final acng a = super.a;
        g(a.b.a());
        a.g.run();
    }
    
    public final void f() {
        final acng a = super.a;
        g(a.a.a());
        a.e.run();
    }
}
