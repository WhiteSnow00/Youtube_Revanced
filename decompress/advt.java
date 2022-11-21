import androidx.cardview.widget.CardView;
import android.view.View;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.graphics.drawable.RippleDrawable;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.graphics.drawable.ColorDrawable;
import android.os.Build$VERSION;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.LayerDrawable;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import com.google.android.material.card.MaterialCardView;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class advt
{
    public static final Drawable a;
    private static final double v;
    public final MaterialCardView b;
    public final Rect c;
    public final adzz d;
    public final adzz e;
    public int f;
    public int g;
    public int h;
    public int i;
    public Drawable j;
    public Drawable k;
    public ColorStateList l;
    public ColorStateList m;
    public aeae n;
    public ColorStateList o;
    public Drawable p;
    public LayerDrawable q;
    public adzz r;
    public boolean s;
    public boolean t;
    public float u;
    private adzz w;
    private ValueAnimator x;
    private final TimeInterpolator y;
    private final int z;
    
    static {
        v = Math.cos(Math.toRadians(45.0));
        Object a2;
        if (Build$VERSION.SDK_INT <= 28) {
            a2 = new ColorDrawable();
        }
        else {
            a2 = null;
        }
        a = (Drawable)a2;
    }
    
    public advt(final MaterialCardView b, final AttributeSet set, final int n) {
        this.c = new Rect();
        this.s = false;
        this.u = 0.0f;
        this.b = b;
        final adzz d = new adzz(b.getContext(), set, n, 2132085187);
        (this.d = d).m(b.getContext());
        d.r(-12303292);
        final aead e = d.k().e();
        final TypedArray obtainStyledAttributes = b.getContext().obtainStyledAttributes(set, advu.a, n, 2132083199);
        if (obtainStyledAttributes.hasValue(3)) {
            e.f(obtainStyledAttributes.getDimension(3, 0.0f));
        }
        this.e = new adzz();
        this.g(e.a());
        this.y = adfe.A(b.getContext(), 2130969956, adtw.a);
        this.z = adfe.v(b.getContext(), 2130969948, 300);
        obtainStyledAttributes.recycle();
    }
    
    private final float o() {
        final float q = q(this.n.j, this.d.b());
        final adzw k = this.n.k;
        final adzz d = this.d;
        final float max = Math.max(q, q(k, d.a.a.c.a(d.i())));
        final adzw l = this.n.l;
        final adzz d2 = this.d;
        final float q2 = q(l, d2.a.a.d.a(d2.i()));
        final adzw m = this.n.m;
        final adzz d3 = this.d;
        return Math.max(max, Math.max(q2, q(m, d3.a.a.e.a(d3.i()))));
    }
    
    private final boolean p() {
        return this.d.w();
    }
    
    private static final float q(final adzw adzw, final float n) {
        if (adzw instanceof aeac) {
            final double v = advt.v;
            final double n2 = n;
            Double.isNaN(n2);
            return (float)((1.0 - v) * n2);
        }
        if (adzw instanceof adzv) {
            return n / 2.0f;
        }
        return 0.0f;
    }
    
    public final float a() {
        final float mv = ((CardView)this.b).mv();
        float o;
        if (this.n()) {
            o = this.o();
        }
        else {
            o = 0.0f;
        }
        return mv + o;
    }
    
    public final float b() {
        final float mv = ((CardView)this.b).mv();
        float o;
        if (this.n()) {
            o = this.o();
        }
        else {
            o = 0.0f;
        }
        return mv * 1.5f + o;
    }
    
    public final Drawable c() {
        if (this.p == null) {
            final int b = adzq.b;
            this.w = new adzz(this.n);
            this.p = (Drawable)new RippleDrawable(this.l, (Drawable)null, (Drawable)this.w);
        }
        if (this.q == null) {
            (this.q = new LayerDrawable(new Drawable[] { this.p, this.e, this.k })).setId(2, 2131429965);
        }
        return (Drawable)this.q;
    }
    
    public final Drawable d(final Drawable drawable) {
        int n;
        int n2;
        if (((CardView)this.b).a) {
            n = (int)Math.ceil(this.b());
            n2 = (int)Math.ceil(this.a());
        }
        else {
            n2 = 0;
            n = 0;
        }
        return (Drawable)new advs(drawable, n2, n, n2, n);
    }
    
    public final void e(final ColorStateList list) {
        this.d.o(list);
    }
    
    public final void f(final boolean b, final boolean b2) {
        final Drawable k = this.k;
        if (k != null) {
            final float n = 0.0f;
            float n2 = 0.0f;
            int alpha = 0;
            if (b2) {
                if (b) {
                    n2 = 1.0f;
                }
                float u;
                if (b) {
                    u = 1.0f - this.u;
                }
                else {
                    u = this.u;
                }
                final ValueAnimator x = this.x;
                if (x != null) {
                    x.cancel();
                    this.x = null;
                }
                (this.x = ValueAnimator.ofFloat(new float[] { this.u, n2 })).addUpdateListener((ValueAnimator$AnimatorUpdateListener)new aebr(this, 1));
                this.x.setInterpolator(this.y);
                this.x.setDuration((long)(this.z * u));
                this.x.start();
                return;
            }
            if (b) {
                alpha = 255;
            }
            k.setAlpha(alpha);
            float u2;
            if (!b) {
                u2 = n;
            }
            else {
                u2 = 1.0f;
            }
            this.u = u2;
        }
    }
    
    public final void g(final aeae n) {
        this.n = n;
        this.d.tm(n);
        final adzz d = this.d;
        d.f = (d.w() ^ true);
        this.e.tm(n);
        final adzz w = this.w;
        if (w != null) {
            w.tm(n);
        }
    }
    
    public final void h() {
        final boolean m = this.m();
        final float n = 0.0f;
        float o;
        if (!m && !this.n()) {
            o = 0.0f;
        }
        else {
            o = this.o();
        }
        final MaterialCardView b = this.b;
        float n2 = n;
        if (((CardView)b).b) {
            n2 = n;
            if (((CardView)b).a) {
                final double v = advt.v;
                final double n3 = MaterialCardView.h(b);
                Double.isNaN(n3);
                n2 = (float)((1.0 - v) * n3);
            }
        }
        final MaterialCardView b2 = this.b;
        final int left = this.c.left;
        final int n4 = (int)(o - n2);
        ((CardView)b2).c.set(left + n4, this.c.top + n4, this.c.right + n4, this.c.bottom + n4);
        sh.f(((CardView)b2).f);
    }
    
    public final void i() {
        this.d.n(((View)((CardView)this.b).f.b).getElevation());
    }
    
    public final void j() {
        if (!this.s) {
            this.b.i(this.d(this.d));
        }
        this.b.setForeground(this.d(this.j));
    }
    
    public final boolean k() {
        return (this.h & 0x50) == 0x50;
    }
    
    public final boolean l() {
        return (this.h & 0x800005) == 0x800005;
    }
    
    public final boolean m() {
        return ((CardView)this.b).b && !this.p();
    }
    
    public final boolean n() {
        return ((CardView)this.b).b && this.p() && ((CardView)this.b).a;
    }
}
