import android.view.MotionEvent;
import java.util.Iterator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.Animator$AnimatorListener;
import android.animation.PropertyValuesHolder;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import app.revanced.integrations.patches.HideEndscreenOverlayPatch;
import android.view.View;
import android.view.ViewGroup$MarginLayoutParams;
import android.content.Context;
import android.animation.ObjectAnimator;
import android.support.v7.widget.RecyclerView;
import android.graphics.Rect;
import android.widget.FrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class abho extends FrameLayout implements abhr
{
    private final Rect a;
    public final abhq b;
    public final int c;
    public RecyclerView d;
    public byte[] e;
    public int f;
    public itt g;
    private final wyw h;
    private final abhm i;
    private boolean j;
    private float k;
    private ObjectAnimator l;
    
    public abho(final Context context, final wyw h, final abhq b, final abhm i, final boolean b2) {
        super(context);
        this.a = new Rect();
        h.getClass();
        this.h = h;
        b.getClass();
        this.b = b;
        i.getClass();
        this.i = i;
        int dimensionPixelSize;
        if (b2) {
            dimensionPixelSize = 0;
        }
        else {
            dimensionPixelSize = context.getResources().getDimensionPixelSize(2131169353);
        }
        this.c = dimensionPixelSize;
    }
    
    private final int p(final int n) {
        if (n == 0 || n == 3) {
            return this.a();
        }
        if (n == 1) {
            return this.b();
        }
        return 0;
    }
    
    private final void q(final boolean b, float min) {
        if (!this.r() || this.b.e()) {
            this.j = false;
            return;
        }
        if (!this.j) {
            this.k = this.d.getTranslationY();
            this.j = true;
        }
        min = Math.min(Math.max(this.k + min, (float)this.p(2)), (float)this.p(1));
        this.b.c(this.d(min), true);
        if (b) {
            this.f(min);
            return;
        }
        this.j = false;
        this.f(min);
        if (min > (this.p(1) + (float)this.p(2)) / 2.0f) {
            this.o(1, true, 1);
            return;
        }
        this.o(2, true, 1);
    }
    
    private final boolean r() {
        return this.d != null;
    }
    
    protected abstract int a();
    
    protected abstract int b();
    
    protected void c(final RecyclerView recyclerView) {
        throw null;
    }
    
    public final float d(final float n) {
        final float n2 = (float)this.p(1);
        final float n3 = (float)this.p(2);
        return 1.0f - (n - n3) / (n2 - n3);
    }
    
    public final void e(final int n) {
        this.n(1, n);
    }
    
    public final void f(final float translationY) {
        this.d.setTranslationY(translationY);
    }
    
    public final void h(final float n) {
        this.q(true, n);
    }
    
    public final void i(final float n) {
        this.q(false, n);
    }
    
    public final void j(final Rect rect) {
        if (this.a.equals((Object)rect)) {
            return;
        }
        this.a.set(rect);
        if (this.r()) {
            this.i.a(rect);
        }
    }
    
    public final void k() {
        if (this.r()) {
            final abhm i = this.i;
            if (i.g != null) {
                if (i.e.e()) {
                    i.g.setContentDescription((CharSequence)null);
                }
                if (i.e.d()) {
                    i.g.setContentDescription((CharSequence)i.c.getResources().getString(2132017368));
                }
                else if (i.e.f()) {
                    i.g.setContentDescription((CharSequence)i.c.getResources().getString(2132017369));
                }
            }
        }
        if (this.b.e()) {
            this.d.setVisibility(8);
        }
        if (this.b.d()) {
            final byte[] e = this.e;
            if (e != null) {
                this.h.t((wzz)new wyt(e), (alhi)null);
            }
        }
        final float n = (float)this.p(this.b.a);
        this.f(n);
        this.b.c(this.d(n), false);
    }
    
    public final void l() {
        if (!this.r()) {
            return;
        }
        if (this.d.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
            tpe.aF((View)this.d, tpe.aq(this.f), (Class)ViewGroup$MarginLayoutParams.class);
            this.o(this.b.a, false, 0);
        }
    }
    
    public final void m(final int n) {
        this.n(n, 0);
    }
    
    public final void n(final int n, final int n2) {
        if (this.b.a != n) {
            this.o(n, true, n2);
        }
    }
    
    public final void o(final int a, final boolean b, final int n) {
        final boolean r = this.r();
        if (HideEndscreenOverlayPatch.getEndscreenOverlay()) {
            return;
        }
        if (!r) {
            if (a == 0) {
                return;
            }
            if (!this.r()) {
                final abhm i = this.i;
                RecyclerView d = i.g;
                if (d == null) {
                    i.g = (RecyclerView)LayoutInflater.from(i.c).inflate(2131624037, (ViewGroup)this, false);
                    final RecyclerView g = i.g;
                    g.getClass();
                    g.ae((nt)null);
                    i.g.u((oa)new abhj(i, 0));
                    i.i = i.g.getPaddingLeft();
                    i.j = i.g.getPaddingRight();
                    i.k = i.g.getPaddingBottom();
                    final Context c = i.c;
                    final abhk abhk = new abhk(i);
                    abhk.ac(0);
                    i.g.af((nw)abhk);
                    i.b.f((ackn)new kdu(i, 17));
                    i.b.h(i.a);
                    i.g.ab((op)new abhl(i.g));
                    d = i.g;
                }
                this.d = d;
                if (d != null) {
                    final ViewGroup viewGroup = (ViewGroup)d.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView((View)this.d);
                    }
                    this.addView((View)this.d);
                    this.c(this.d);
                    this.i.a(this.a);
                }
                if (this.f > 0) {
                    this.l();
                }
            }
        }
        final abhq b2 = this.b;
        final int a2 = b2.a;
        b2.a = a;
        final Iterator iterator = b2.c.iterator();
        while (iterator.hasNext()) {
            ((abhp)iterator.next()).b(a2, a, n);
        }
        final ObjectAnimator l = this.l;
        if (l != null && l.isStarted()) {
            this.l.removeAllListeners();
            this.l.cancel();
            this.l = null;
        }
        if (b) {
            (this.l = ObjectAnimator.ofPropertyValuesHolder((Object)this.d, new PropertyValuesHolder[] { PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[] { (float)this.p(a) }) }).setDuration(300L)).addListener((Animator$AnimatorListener)new abhn(this));
            this.l.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new uub(this, 16));
            this.l.start();
            return;
        }
        this.k();
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        return this.g.d((View)this, motionEvent);
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        return this.g.d((View)this, motionEvent);
    }
    
    public final void pi(final float n) {
        this.q(true, n);
    }
}
