import android.animation.Animator;
import android.view.ViewAnimationUtils;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.view.animation.AlphaAnimation;
import android.view.ViewGroup$LayoutParams;
import android.text.TextUtils;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimeBar;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.content.Context;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jat extends abtz implements sjd, fqk
{
    public View A;
    public TextView B;
    public View C;
    public TextView D;
    public fkr E;
    public int F;
    public int G;
    public final vai H;
    public tan I;
    public kdt J;
    public final hyx K;
    public final Context a;
    public final acgs b;
    public final int c;
    public ImageView d;
    public ImageView e;
    public TextView f;
    public View g;
    public TextView h;
    public View i;
    public TextView j;
    public View k;
    public TextView l;
    public TextView m;
    public TextView n;
    public View o;
    public ViewGroup p;
    public int q;
    public int r;
    public CharSequence s;
    public TimeBar t;
    public abds u;
    public View v;
    public fto w;
    public ahlc x;
    public View y;
    public float z;
    
    public jat(final Context a, final acgs b, final int c, final hyx k, final vai h, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        super(a);
        this.G = 1;
        this.a = a;
        b.getClass();
        this.b = b;
        this.c = c;
        this.K = k;
        h.getClass();
        this.H = h;
    }
    
    public static final void i(final TextView textView) {
        if (textView != null) {
            int visibility;
            if (!TextUtils.isEmpty(textView.getText())) {
                visibility = 0;
            }
            else {
                visibility = 8;
            }
            textView.setVisibility(visibility);
        }
    }
    
    public final ViewGroup$LayoutParams a() {
        return new ViewGroup$LayoutParams(-1, -1);
    }
    
    public final void e(final ahnw ahnw) {
        if (this.y != null && (ahnw.b & 0x2) != 0x0) {
            ahny ahny;
            if ((ahny = ahnw.d) == null) {
                ahny = ahny.a;
            }
            if (ahny.b == 1) {
                ahny ahny2;
                if ((ahny2 = ahnw.d) == null) {
                    ahny2 = ahny.a;
                }
                aoxg a;
                if (ahny2.b == 1) {
                    a = (aoxg)ahny2.c;
                }
                else {
                    a = aoxg.a;
                }
                final AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setStartOffset((long)a.c);
                alphaAnimation.setFillAfter(true);
                alphaAnimation.setDuration((long)a.b);
                final TranslateAnimation translateAnimation = new TranslateAnimation(this.p.getWidth() / 2.0f * a.d, 0.0f, this.p.getHeight() / 2.0f * a.e, 0.0f);
                translateAnimation.setStartOffset((long)a.c);
                translateAnimation.setFillAfter(true);
                translateAnimation.setDuration((long)a.b);
                final AnimationSet set = new AnimationSet(true);
                set.addAnimation((Animation)alphaAnimation);
                set.addAnimation((Animation)translateAnimation);
                this.y.startAnimation((Animation)set);
            }
        }
        ahnx ahnx;
        if ((ahnx = ahnw.c) == null) {
            ahnx = ahnx.a;
        }
        if (ahnx.b == 1) {
            ahnx ahnx2;
            if ((ahnx2 = ahnw.c) == null) {
                ahnx2 = ahnx.a;
            }
            aoxf a2;
            if (ahnx2.b == 1) {
                a2 = (aoxf)ahnx2.c;
            }
            else {
                a2 = aoxf.a;
            }
            final int width = this.p.getWidth();
            final int height = this.p.getHeight();
            final float n = (float)Math.max(width, height + height);
            final ViewGroup p = this.p;
            final int round = Math.round(p.getWidth() * a2.c);
            final float n2 = (float)this.p.getHeight();
            final float d = a2.d;
            final float n3 = n / 2.0f;
            final Animator circularReveal = ViewAnimationUtils.createCircularReveal((View)p, round, Math.round(n2 * d), 0.01f * n3, n3 + n3);
            circularReveal.setDuration((long)a2.b);
            circularReveal.start();
        }
    }
    
    public final void f() {
        final ViewGroup p = this.p;
        if (p != null) {
            p.setVisibility(8);
            this.e.setVisibility(8);
            this.f.setVisibility(8);
            this.f.setClickable(false);
            this.g.setVisibility(8);
            this.h.setVisibility(8);
            this.k.setVisibility(8);
            this.l.setVisibility(8);
            this.i.setVisibility(8);
            this.j.setVisibility(8);
            this.o.setVisibility(8);
            this.m.setVisibility(8);
            this.n.setVisibility(8);
            this.B.setVisibility(8);
            this.u.l();
            ((abdr)this.t).mg((abdv)this.u);
            this.d.setClickable(false);
            this.A.setClickable(false);
            this.v.setBackgroundColor(this.F);
        }
        final fto w = this.w;
        if (w != null) {
            ((ftr)w).c();
        }
        final kdt j = this.J;
        if (j != null) {
            j.f();
        }
        this.q = 0;
        this.r = 0;
        this.s = null;
        this.setVisibility(8);
    }
    
    public final void g(final boolean b) {
        int visibility;
        if (!b) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        this.setVisibility(visibility);
    }
    
    public final void h(final long n, final long n2) {
        if (this.p == null) {
            return;
        }
        this.u.n(n2 - n, 0L, n2, n2);
        ((abdr)this.t).mg((abdv)this.u);
        this.m.setText((CharSequence)this.p.getResources().getString(2132017453, new Object[] { " · ", tvb.j((long)(int)Math.ceil(n / 1000.0f)) }));
    }
    
    public final void k(final fkr e) {
        this.E = e;
        if (e.n()) {
            if (this.p != null) {
                this.f.setVisibility(8);
                this.g.setVisibility(8);
                this.h.setVisibility(8);
                this.n.setVisibility(8);
                this.B.setVisibility(8);
                this.o.setVisibility(8);
                this.v.setClickable(false);
                if (this.x != null) {
                    ((ftr)this.w).c();
                }
                final kdt j = this.J;
                if (j != null) {
                    j.f();
                }
            }
        }
        else if (this.p != null) {
            i(this.f);
            i(this.n);
            i(this.B);
            tpe.v(this.o, true);
            this.v.setClickable(true);
            final ahlc x = this.x;
            if (x != null && this.J != null) {
                this.w.a(x, (wyw)null);
            }
            else {
                this.g.setVisibility(0);
                i(this.h);
            }
            final kdt i = this.J;
            if (i != null) {
                i.g(this.z, this.G);
            }
        }
    }
    
    public final boolean ow(final fkr fkr) {
        return ezt.d(fkr);
    }
}
