import android.animation.Animator;
import android.view.ViewGroup;
import android.view.View;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class cjs extends AnimatorListenerAdapter implements cip
{
    boolean a;
    private final View b;
    private final int c;
    private final ViewGroup d;
    private final boolean e;
    private boolean f;
    
    public cjs(final View b, final int c) {
        this.a = false;
        this.b = b;
        this.c = c;
        this.d = (ViewGroup)b.getParent();
        this.g(this.e = true);
    }
    
    private final void f() {
        if (!this.a) {
            cjh.d(this.b, this.c);
            final ViewGroup d = this.d;
            if (d != null) {
                d.invalidate();
            }
        }
        this.g(false);
    }
    
    private final void g(final boolean f) {
        if (this.e && this.f != f) {
            final ViewGroup d = this.d;
            if (d != null) {
                cje.a(d, this.f = f);
            }
        }
    }
    
    public final void a(final ciq ciq) {
        this.f();
        ciq.A(this);
    }
    
    public final void b() {
    }
    
    public final void c() {
        this.g(false);
    }
    
    public final void d() {
        this.g(true);
    }
    
    public final void e() {
    }
    
    public final void onAnimationCancel(final Animator animator) {
        this.a = true;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.f();
    }
    
    public final void onAnimationPause(final Animator animator) {
        if (!this.a) {
            cjh.d(this.b, this.c);
        }
    }
    
    public final void onAnimationRepeat(final Animator animator) {
    }
    
    public final void onAnimationResume(final Animator animator) {
        if (!this.a) {
            cjh.d(this.b, 0);
        }
    }
    
    public final void onAnimationStart(final Animator animator) {
    }
}
