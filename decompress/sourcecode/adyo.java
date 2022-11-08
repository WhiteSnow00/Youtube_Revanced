import android.view.ViewGroup;
import android.animation.Animator$AnimatorListener;
import java.util.ArrayList;
import android.animation.AnimatorSet;
import android.text.TextUtils;
import android.widget.EditText;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.animation.ObjectAnimator;
import android.view.View;
import java.util.List;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.widget.TextView;
import android.animation.Animator;
import com.google.android.material.textfield.TextInputLayout;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adyo
{
    public final Context a;
    public final TextInputLayout b;
    public Animator c;
    public int d;
    public int e;
    public CharSequence f;
    public boolean g;
    public TextView h;
    public CharSequence i;
    public int j;
    public ColorStateList k;
    public CharSequence l;
    public boolean m;
    public TextView n;
    public int o;
    public ColorStateList p;
    private final int q;
    private final int r;
    private final int s;
    private final TimeInterpolator t;
    private final TimeInterpolator u;
    private final TimeInterpolator v;
    private LinearLayout w;
    private int x;
    private FrameLayout y;
    private final float z;
    
    public adyo(final TextInputLayout b) {
        final Context context = b.getContext();
        this.a = context;
        this.b = b;
        this.z = (float)context.getResources().getDimensionPixelSize(2131166290);
        this.q = adwd.j(context, 2130969950, 217);
        this.r = adwd.j(context, 2130969946, 167);
        this.s = adwd.j(context, 2130969950, 167);
        this.t = adwd.o(context, 2130969955, adqd.d);
        this.u = adwd.o(context, 2130969955, adqd.a);
        this.v = adwd.o(context, 2130969958, adqd.a);
    }
    
    static final boolean m(final int n) {
        return n == 0 || n == 1;
    }
    
    private final int n(final boolean b, final int n, final int n2) {
        if (b) {
            return this.a.getResources().getDimensionPixelSize(n);
        }
        return n2;
    }
    
    private final TextView o(final int n) {
        if (n == 1) {
            return this.h;
        }
        if (n != 2) {
            return null;
        }
        return this.n;
    }
    
    private final void p(final List list, final boolean b, final TextView textView, final int n, int n2, final int n3) {
        if (textView != null) {
            if (b) {
                if (n == n3 || n == n2) {
                    if (n3 == n) {
                        n2 = 1;
                    }
                    else {
                        n2 = 0;
                    }
                    float n4;
                    if (n3 == n) {
                        n4 = 1.0f;
                    }
                    else {
                        n4 = 0.0f;
                    }
                    final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)textView, View.ALPHA, new float[] { n4 });
                    int n5;
                    if (n2 != 0) {
                        n5 = this.r;
                    }
                    else {
                        n5 = this.s;
                    }
                    ofFloat.setDuration((long)n5);
                    TimeInterpolator interpolator;
                    if (n2 != 0) {
                        interpolator = this.u;
                    }
                    else {
                        interpolator = this.v;
                    }
                    ofFloat.setInterpolator(interpolator);
                    list.add(ofFloat);
                    if (n3 == n) {
                        final ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((Object)textView, View.TRANSLATION_Y, new float[] { -this.z, 0.0f });
                        ofFloat2.setDuration((long)this.q);
                        ofFloat2.setInterpolator(this.t);
                        list.add(ofFloat2);
                    }
                }
            }
        }
    }
    
    public final void a(final TextView textView, final int n) {
        if (this.w == null && this.y == null) {
            (this.w = new LinearLayout(this.a)).setOrientation(0);
            this.b.addView((View)this.w, -1, -2);
            this.y = new FrameLayout(this.a);
            this.w.addView((View)this.y, (ViewGroup$LayoutParams)new LinearLayout$LayoutParams(0, -2, 1.0f));
            if (this.b.c != null) {
                this.b();
            }
        }
        if (m(n)) {
            this.y.setVisibility(0);
            this.y.addView((View)textView);
        }
        else {
            this.w.addView((View)textView, (ViewGroup$LayoutParams)new LinearLayout$LayoutParams(-2, -2));
        }
        this.w.setVisibility(0);
        ++this.x;
    }
    
    public final void b() {
        if (this.w != null) {
            final EditText c = this.b.c;
            if (c != null) {
                final boolean h = adwd.h(this.a);
                ana.ab((View)this.w, this.n(h, 2131167841, ana.j((View)c)), this.n(h, 2131167842, this.a.getResources().getDimensionPixelSize(2131167840)), this.n(h, 2131167841, ana.i((View)c)), 0);
            }
        }
    }
    
    public final void c() {
        final Animator c = this.c;
        if (c != null) {
            c.cancel();
        }
    }
    
    public final void d() {
        this.f = null;
        this.c();
        if (this.d == 1) {
            if (this.m && !TextUtils.isEmpty(this.l)) {
                this.e = 2;
            }
            else {
                this.e = 0;
            }
        }
        this.k(this.d, this.e, this.l(this.h, ""));
    }
    
    public final void e(final TextView textView, int x) {
        final LinearLayout w = this.w;
        if (w == null) {
            return;
        }
        Label_0042: {
            if (m(x)) {
                final FrameLayout y = this.y;
                if (y != null) {
                    y.removeView((View)textView);
                    break Label_0042;
                }
            }
            w.removeView((View)textView);
        }
        x = this.x - 1;
        this.x = x;
        final LinearLayout w2 = this.w;
        if (x == 0) {
            ((ViewGroup)w2).setVisibility(8);
        }
    }
    
    public final void f(final CharSequence charSequence) {
        this.i = charSequence;
        final TextView h = this.h;
        if (h != null) {
            h.setContentDescription(charSequence);
        }
    }
    
    public final void g(final int j) {
        this.j = j;
        final TextView h = this.h;
        if (h != null) {
            this.b.C(h, j);
        }
    }
    
    public final void h(final ColorStateList list) {
        this.k = list;
        final TextView h = this.h;
        if (h != null && list != null) {
            h.setTextColor(list);
        }
    }
    
    public final void i(final int n) {
        this.o = n;
        final TextView n2 = this.n;
        if (n2 != null) {
            n2.setTextAppearance(n);
        }
    }
    
    public final void j(final ColorStateList list) {
        this.p = list;
        final TextView n = this.n;
        if (n != null && list != null) {
            n.setTextColor(list);
        }
    }
    
    public final void k(final int n, final int d, final boolean b) {
        if (n == d) {
            return;
        }
        if (b) {
            final AnimatorSet c = new AnimatorSet();
            this.c = (Animator)c;
            final ArrayList list = new ArrayList();
            this.p(list, this.m, this.n, 2, n, d);
            this.p(list, this.g, this.h, 1, n, d);
            adwd.F(c, (List)list);
            c.addListener((Animator$AnimatorListener)new adym(this, d, this.o(n), n, this.o(d)));
            c.start();
        }
        else if (n != d) {
            if (d != 0) {
                final TextView o = this.o(d);
                if (o != null) {
                    o.setVisibility(0);
                    o.setAlpha(1.0f);
                }
            }
            if (n != 0) {
                final TextView o2 = this.o(n);
                if (o2 != null) {
                    o2.setVisibility(4);
                    if (n == 1) {
                        o2.setText((CharSequence)null);
                    }
                }
            }
            this.d = d;
        }
        this.b.E();
        this.b.G(b);
        this.b.I();
    }
    
    public final boolean l(final TextView textView, final CharSequence charSequence) {
        final boolean ao = ana.ao((View)this.b);
        boolean b2;
        final boolean b = b2 = false;
        if (ao) {
            b2 = b;
            if (this.b.isEnabled()) {
                if (this.e == this.d && textView != null) {
                    if (!TextUtils.equals(textView.getText(), charSequence)) {
                        return true;
                    }
                    b2 = b;
                }
                else {
                    b2 = true;
                }
            }
        }
        return b2;
    }
}
