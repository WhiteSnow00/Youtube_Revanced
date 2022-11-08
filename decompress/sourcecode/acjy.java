import com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout;
import android.animation.Animator$AnimatorListener;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.TimeInterpolator;
import android.view.animation.LinearInterpolator;
import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acjy extends acjv
{
    private final arhr b;
    private boolean c;
    private ValueAnimator d;
    private long e;
    private long f;
    private long g;
    
    public acjy(final arhr b) {
        this.c = false;
        this.b = b;
    }
    
    public final void a() {
        if (this.c) {
            ((acjo)this.b.a()).a();
            return;
        }
        final ValueAnimator d = this.d;
        if (d != null) {
            d.cancel();
            return;
        }
        this.f();
    }
    
    public final void b() {
        if (this.c) {
            ((acjo)this.b.a()).b();
            return;
        }
        final acjn a = super.a;
        final acje acje = (acje)a.a;
        final SwipeLayout f = acje.f();
        final float alpha = acje.a().getAlpha();
        (this.d = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[] { PropertyValuesHolder.ofKeyframe("alpha", new Keyframe[] { Keyframe.ofFloat(0.0f, alpha), Keyframe.ofFloat(this.g / (float)this.f, alpha), Keyframe.ofFloat(1.0f, 0.0f) }), PropertyValuesHolder.ofInt("displacement", new int[] { f.e, -f.getWidth() }) })).setStartDelay(this.e);
        this.d.setDuration(this.f);
        this.d.setInterpolator((TimeInterpolator)new LinearInterpolator());
        this.d.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new ldo(acje, f, 6));
        this.d.addListener((Animator$AnimatorListener)new acjx(this, a));
        this.d.start();
    }
    
    protected final void d() {
        final acjn a = super.a;
        final acje acje = (acje)a.a;
        final ajco g = acje.g();
        if (acje.f().p() && g != null && g.b == 1) {
            long e;
            if (acje.f().e == 0) {
                final long b = a.b;
                e = b + b;
            }
            else {
                e = 0L;
            }
            this.e = e;
            final long b2 = a.b;
            final long f = (long)(b2 * 2.5f);
            this.f = f;
            ((acjs)this).g(e + (this.g = f - b2));
            return;
        }
        this.c = true;
        final acjo acjo = (acjo)this.b.a();
        final aqsu a2 = acjn.a();
        a2.j(a.a);
        a2.g(a.b);
        a2.i(a.c);
        a2.h(a.d);
        acjo.c(a2.f());
    }
    
    public final void f() {
        this.d = null;
        final acjn a = super.a;
        final acje acje = (acje)a.a;
        acje.f().l(0);
        acje.a().setAlpha(1.0f);
        a.d.run();
    }
}
