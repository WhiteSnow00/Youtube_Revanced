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

public final class izv extends abry implements sgy, fqb
{
    public View A;
    public TextView B;
    public View C;
    public TextView D;
    public fkk E;
    public int F;
    public int G;
    public final uyi H;
    public soy I;
    public jjg J;
    public final hyc K;
    public final Context a;
    public final aceo b;
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
    public abby u;
    public View v;
    public ftg w;
    public ahje x;
    public View y;
    public float z;
    
    public izv(final Context a, final aceo b, final int c, final hyc k, final uyi h, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
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
    
    public final void e(final ahly ahly) {
        if (this.y != null && (ahly.b & 0x2) != 0x0) {
            ahma ahma;
            if ((ahma = ahly.d) == null) {
                ahma = ahma.a;
            }
            if (ahma.b == 1) {
                ahma ahma2;
                if ((ahma2 = ahly.d) == null) {
                    ahma2 = ahma.a;
                }
                aovd a;
                if (ahma2.b == 1) {
                    a = (aovd)ahma2.c;
                }
                else {
                    a = aovd.a;
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
        ahlz ahlz;
        if ((ahlz = ahly.c) == null) {
            ahlz = ahlz.a;
        }
        if (ahlz.b == 1) {
            ahlz ahlz2;
            if ((ahlz2 = ahly.c) == null) {
                ahlz2 = ahlz.a;
            }
            aovc a2;
            if (ahlz2.b == 1) {
                a2 = (aovc)ahlz2.c;
            }
            else {
                a2 = aovc.a;
            }
            final int width = this.p.getWidth();
            final int height = this.p.getHeight();
            final float n = Math.max(width, height + height) / 2.0f;
            final ViewGroup p = this.p;
            final Animator circularReveal = ViewAnimationUtils.createCircularReveal((View)p, Math.round(p.getWidth() * a2.c), Math.round(this.p.getHeight() * a2.d), 0.01f * n, n + n);
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
            ((abbx)this.t).mg((abcb)this.u);
            this.d.setClickable(false);
            this.A.setClickable(false);
            this.v.setBackgroundColor(this.F);
        }
        final ftg w = this.w;
        if (w != null) {
            ((ftj)w).c();
        }
        final jjg j = this.J;
        if (j != null) {
            j.d();
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
        ((abbx)this.t).mg((abcb)this.u);
        this.m.setText((CharSequence)this.p.getResources().getString(2132017453, new Object[] { " · ", tsx.j((long)(int)Math.ceil(n / 1000.0f)) }));
    }
    
    public final void j(final fkk e) {
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
                    ((ftj)this.w).c();
                }
                final jjg j = this.J;
                if (j != null) {
                    j.d();
                }
            }
        }
        else if (this.p != null) {
            i(this.f);
            i(this.n);
            i(this.B);
            tmy.v(this.o, true);
            this.v.setClickable(true);
            final ahje x = this.x;
            if (x != null && this.J != null) {
                this.w.a(x, (wwv)null);
            }
            else {
                this.g.setVisibility(0);
                i(this.h);
            }
            final jjg i = this.J;
            if (i != null) {
                i.e(this.z, this.G);
            }
        }
    }
    
    public final boolean ow(final fkk fkk) {
        return ezp.d(fkk);
    }
}
