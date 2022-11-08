import android.content.res.ColorStateList;
import android.util.TypedValue;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.animation.Animation$AnimationListener;
import android.animation.TimeInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.AnimationUtils;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.animation.Animation;
import android.view.View;
import android.content.res.Resources$Theme;
import android.animation.ValueAnimator;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.FrameLayout;
import android.content.Context;
import android.widget.LinearLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gcx implements gda
{
    public LinearLayout a;
    private final Context b;
    private final gcw c;
    private FrameLayout d;
    private TextView e;
    private ImageView f;
    private boolean g;
    private AlphaAnimation h;
    private TranslateAnimation i;
    private TranslateAnimation j;
    private AnimationSet k;
    private AnimationSet l;
    private ValueAnimator m;
    private gcz n;
    private final acng o;
    private FrameLayout p;
    private Resources$Theme q;
    private final uyf r;
    
    public gcx(final Context b, final acng o, final uyf r) {
        this.b = b;
        this.g = false;
        this.c = new gcw();
        this.o = o;
        this.r = r;
    }
    
    private final void i() {
        this.p.addView((View)this.d);
        final FrameLayout d = (FrameLayout)this.p.findViewById(2131427793);
        this.d = d;
        this.a = (LinearLayout)d.findViewById(2131427791);
        this.e = (TextView)this.d.findViewById(2131427792);
        this.f = (ImageView)this.d.findViewById(2131427790);
    }
    
    @Override
    public final aexq a() {
        if (this.b().h()) {
            return aexq.j(this.a);
        }
        return (aexq)aewp.a;
    }
    
    @Override
    public final aexq b() {
        return aexq.j(this.n);
    }
    
    @Override
    public final aexq c() {
        if (this.b().h()) {
            return aexq.j(this.d);
        }
        return (aexq)aewp.a;
    }
    
    @Override
    public final void d(final boolean b) {
        if (this.p != null) {
            if (this.d != null) {
                if (b) {
                    if (this.c.b) {
                        this.j.cancel();
                    }
                    if (this.c.a) {
                        this.i.cancel();
                    }
                    this.a.startAnimation((Animation)this.j);
                    return;
                }
                this.a.setVisibility(8);
            }
        }
    }
    
    @Override
    public final void e(final FrameLayout p) {
        this.f();
        this.p = p;
        if (this.d != null) {
            this.i();
        }
    }
    
    @Override
    public final void f() {
        final FrameLayout p = this.p;
        if (p != null) {
            final FrameLayout d = this.d;
            if (d != null) {
                p.removeView((View)d);
            }
        }
        this.n = null;
        this.p = null;
        this.d = null;
        this.c.a();
    }
    
    @Override
    public final void g(final gcz n, final boolean b) {
        if (this.p != null) {
            if (this.d == null) {
                this.d = (FrameLayout)LayoutInflater.from(this.b).inflate(2131624080, (ViewGroup)this.p, false);
                this.i();
                final LinearLayout a = this.a;
                tmy.r((View)a, a.getBackground());
            }
            this.q = this.p.getContext().getTheme();
            if (!this.g) {
                this.h = (AlphaAnimation)AnimationUtils.loadAnimation(this.b, 2130771998);
                this.i = (TranslateAnimation)AnimationUtils.loadAnimation(this.b, 2130771994);
                this.j = (TranslateAnimation)AnimationUtils.loadAnimation(this.b, 2130771995);
                this.k = (AnimationSet)AnimationUtils.loadAnimation(this.b, 2130771996);
                this.l = (AnimationSet)AnimationUtils.loadAnimation(this.b, 2130771997);
                (this.m = ValueAnimator.ofInt(new int[] { 51, 0 })).setDuration((long)this.b.getResources().getInteger(2131492873));
                this.m.setStartDelay((long)this.b.getResources().getInteger(2131492874));
                final atr atr = new atr();
                this.h.setInterpolator((Interpolator)atr);
                this.i.setInterpolator((Interpolator)atr);
                this.j.setInterpolator((Interpolator)atr);
                this.k.setInterpolator((Interpolator)atr);
                this.l.setInterpolator((Interpolator)atr);
                this.m.setInterpolator((TimeInterpolator)atr);
                final gcw c = this.c;
                final TranslateAnimation i = this.i;
                final TranslateAnimation j = this.j;
                final LinearLayout a2 = this.a;
                c.a();
                ((Animation)i).setAnimationListener((Animation$AnimationListener)new cbh(c, 4));
                ((Animation)j).setAnimationListener((Animation$AnimationListener)new gcv(c, (View)a2));
            }
            if (!this.g) {
                this.m.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new hwa(this, tmy.ct(this.p.getContext(), 2130970857).orElse(0), 1));
            }
            this.g = true;
            if (n != this.n) {
                this.n = n;
                this.e.setText(n.a);
                int n2;
                if ((n2 = this.o.a(n.b)) == 0) {
                    n2 = this.o.a(akbe.cU);
                }
                this.f.setImageDrawable(this.b.getResources().getDrawable(n2));
                final int k = n.i;
                final TypedValue typedValue = new TypedValue();
                int n3;
                if (k == 2) {
                    n3 = 2130970916;
                }
                else {
                    n3 = 2130970920;
                }
                this.b.getTheme().resolveAttribute(n3, typedValue, true);
                this.e.setTextAppearance(typedValue.data);
                int n4;
                if (n.i == 2) {
                    n4 = 2131165506;
                }
                else {
                    n4 = 2131165505;
                }
                final int dimensionPixelSize = this.b.getResources().getDimensionPixelSize(n4);
                final TextView e = this.e;
                e.setPaddingRelative(dimensionPixelSize, e.getPaddingTop(), this.e.getPaddingEnd(), this.e.getPaddingBottom());
                final Context b2 = this.b;
                final TextView e2 = this.e;
                final ImageView f = this.f;
                final LinearLayout a3 = this.a;
                final int cn = tmy.cn(b2, 2130970857);
                final int cn2 = tmy.cn(this.b, 2130970857);
                final int cn3 = tmy.cn(this.b, 2130970940);
                if (this.b().h()) {
                    final aoqe f2 = ((gcz)this.b().c()).f;
                    aoqb aoqb;
                    if ((aoqb = aoqb.b(f2.c)) == null) {
                        aoqb = aoqb.a;
                    }
                    final int a4 = actf.a(b2, aoqb, cn);
                    aoqb aoqb2;
                    if ((aoqb2 = aoqb.b(f2.e)) == null) {
                        aoqb2 = aoqb.a;
                    }
                    final int a5 = actf.a(b2, aoqb2, cn3);
                    aoqb aoqb3;
                    if ((aoqb3 = aoqb.b(f2.d)) == null) {
                        aoqb3 = aoqb.a;
                    }
                    final int a6 = actf.a(b2, aoqb3, cn2);
                    if (e2 != null) {
                        e2.setTextColor(a4);
                    }
                    if (a3 != null) {
                        ((View)a3).setBackgroundTintList(ColorStateList.valueOf(a5));
                    }
                    if (f != null) {
                        f.setImageTintList(ColorStateList.valueOf(a6));
                    }
                }
                final int g = n.g;
                if (g == 0) {
                    throw null;
                }
                if (g - 1 != 5) {
                    final FrameLayout d = this.d;
                    d.setPadding(d.getPaddingLeft(), this.d.getPaddingTop(), this.d.getPaddingRight(), (int)this.b.getResources().getDimension(2131165512));
                }
                else {
                    final FrameLayout d2 = this.d;
                    d2.setPadding(d2.getPaddingLeft(), this.d.getPaddingTop(), this.d.getPaddingRight(), 0);
                }
                final int l = n.i;
                int height = (int)this.b.getResources().getDimension(2131165508);
                if (l == 2) {
                    height = (int)this.b.getResources().getDimension(2131165509);
                }
                this.a.getLayoutParams().height = height;
            }
            if (gkt.x(this.r)) {
                this.d.setElevation(8.0f);
            }
            this.d.bringToFront();
            this.a.setVisibility(0);
            if (b && !this.c.a) {
                this.a.startAnimation((Animation)this.i);
                this.e.startAnimation((Animation)this.h);
                this.f.startAnimation((Animation)this.k);
            }
            return;
        }
        throw new IllegalStateException("Controller must be initialized for a feed before the content pill can be shown.");
    }
    
    @Override
    public final boolean h() {
        final LinearLayout a = this.a;
        boolean b = false;
        if (a != null) {
            if (a.getVisibility() != 0) {
                if (this.c.a) {
                    return true;
                }
                b = b;
            }
            else {
                b = true;
            }
        }
        return b;
    }
}
