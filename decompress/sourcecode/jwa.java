import android.support.v7.widget.AppCompatImageView;
import android.view.View;
import android.support.v7.widget.ActionMenuView;
import android.content.res.ColorStateList;
import java.util.Collection;
import android.graphics.drawable.ColorDrawable;
import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.Drawable;
import android.content.Context;
import com.google.android.apps.youtube.app.common.ui.actionbar.ActionBarColor;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.apps.youtube.app.ui.actionbar.MainCollapsingToolbarLayout;
import android.content.res.Resources;
import android.support.v7.widget.Toolbar;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jwa implements adqq
{
    private final fa a;
    private final fyy b;
    private fzb c;
    private final Toolbar d;
    private final ep e;
    private final Resources f;
    private final MainCollapsingToolbarLayout g;
    private final atjj h;
    private final jxc i;
    private boolean j;
    private int k;
    private int l;
    private int m;
    private final uyf n;
    
    public jwa(final fa a, final jxc i, final fyy b, final Resources f, final Toolbar d, final MainCollapsingToolbarLayout g, final AppBarLayout appBarLayout, final atjj h, final uyf n, final fzb fzb, final ActionBarColor actionBarColor, final int n2, final ActionBarColor actionBarColor2, final int n3, final ActionBarColor actionBarColor3, final boolean j) {
        this.a = a;
        this.i = i;
        h.getClass();
        this.h = h;
        b.getClass();
        this.b = b;
        this.f = f;
        this.d = d;
        final ep supportActionBar = a.getSupportActionBar();
        supportActionBar.getClass();
        this.e = supportActionBar;
        this.n = n;
        this.g = g;
        supportActionBar.l(false);
        this.j = j;
        appBarLayout.i((adqn)this);
        this.m = 0;
        this.k = 0;
        this.l = 0;
        this.b(fzb, actionBarColor, n2, actionBarColor2, n3, actionBarColor3, j);
    }
    
    private final int c(final ActionBarColor actionBarColor) {
        return actionBarColor.mt((Context)this.a);
    }
    
    private final void d(final int n) {
        final Toolbar d = this.d;
        d.setPaddingRelative(n, d.getPaddingTop(), this.d.getPaddingEnd(), this.d.getPaddingBottom());
    }
    
    private final void e(final int n, final int n2) {
        if (n == 0) {
            this.d.s((Drawable)null);
            this.d.o(this.f.getDimensionPixelSize(2131167010), 0);
            this.d(this.a.getResources().getDimensionPixelSize(2131170145));
            return;
        }
        if (n != 1) {
            return;
        }
        final Drawable a = agw.a(this.e.b(), 2131233636);
        a.mutate().setColorFilter(n2, PorterDuff$Mode.SRC_IN);
        this.d.s(a);
        this.d.q(2132017170);
        if (gkt.J(this.n)) {
            final Toolbar d = this.d;
            if (d.n != 0) {
                d.n = 0;
                if (d.e() != null) {
                    d.requestLayout();
                }
            }
        }
        else {
            this.d.o(this.f.getDimensionPixelSize(2131167009), 0);
        }
        this.d(this.a.getResources().getDimensionPixelSize(2131170146));
    }
    
    public final void a(final AppBarLayout appBarLayout, int n) {
        if (this.l != this.k && this.d.getBackground() instanceof ColorDrawable) {
            final int e = this.g.e();
            final boolean b = false;
            int n2 = 0;
            if (e == 3) {
                final MainCollapsingToolbarLayout g = this.g;
                final jxc i = this.i;
                int height;
                if (i.x()) {
                    height = i.k.getHeight();
                }
                else {
                    height = 0;
                }
                Label_0156: {
                    if (height > 0) {
                        if (n != 0) {
                            n = Math.abs(n);
                            final float n3 = (float)height;
                            final int round = Math.round(g.c.a * n3);
                            final int round2 = Math.round(n3 * g.c.b);
                            if (n >= round) {
                                n = Math.min(255, (int)((n - round) / (float)(round2 - round) * 255.0f));
                                break Label_0156;
                            }
                        }
                    }
                    n = 0;
                }
                int backgroundColor;
                if (n > 0) {
                    backgroundColor = ((this.k & 0xFFFFFF) | n << 24);
                }
                else {
                    backgroundColor = 0;
                }
                if (n > 0) {
                    n2 = ((0xFFFFFF & this.m) | n << 24);
                }
                this.d.setBackgroundColor(backgroundColor);
                this.d.B(n2);
                return;
            }
            if (n < 0) {
                n = 1;
            }
            else {
                n = 0;
            }
            int backgroundColor2;
            if (n != 0) {
                backgroundColor2 = this.l;
            }
            else {
                backgroundColor2 = this.k;
            }
            this.d.setBackgroundColor(backgroundColor2);
            final boolean j = this.j;
            final MainCollapsingToolbarLayout g2 = this.g;
            boolean b2 = b;
            if (j) {
                b2 = b;
                if (n == 0) {
                    b2 = true;
                }
            }
            g2.m(b2);
        }
    }
    
    public final void b(final fzb c, final ActionBarColor actionBarColor, int c2, final ActionBarColor actionBarColor2, final int n, final ActionBarColor actionBarColor3, final boolean j) {
        c.getClass();
        int n2;
        if ((n2 = this.c(c.d)) == tmy.cn(this.e.b(), 2130970864)) {
            n2 = tmy.cn(this.e.b(), 2130970924);
        }
        final fzb c3 = this.c;
        if (c3 == null || c3.e != c.e) {
            this.e(c.e, n2);
        }
        final fzb c4 = this.c;
        if (c4 == null || c4.d != c.d) {
            this.e(c.e, n2);
            this.b.d(n2);
            final tnw tnw = (tnw)this.h.a();
            final Toolbar d = this.d;
            d.s(tnw.b(d.e(), n2));
            final Drawable drawable = this.e.b().getResources().getDrawable(2131233836);
            final Toolbar d2 = this.d;
            final Drawable b = tnw.b(drawable, n2);
            d2.l();
            final ActionMenuView a = d2.a;
            a.d();
            final jt c5 = a.c;
            final jr h = c5.h;
            if (h != null) {
                ((AppCompatImageView)h).setImageDrawable(b);
            }
            else {
                c5.j = true;
                c5.i = b;
            }
        }
        this.b.c((Collection)c.c);
        this.c = c;
        this.j = j;
        if (this.i.w()) {
            final int c6 = this.c(actionBarColor);
            this.d.setBackgroundColor(c6);
            this.k = c6;
            this.l = (c6 | 0xFF000000);
        }
        else {
            this.d.setBackground((Drawable)null);
            this.m = 0;
            this.k = 0;
            this.l = 0;
        }
        final fzb c7 = this.c;
        final View b2 = c7.b;
        int n4 = 0;
        Label_0446: {
            if (b2 != null) {
                final View d3 = this.e.d();
                final int n3 = 16;
                if (d3 == b2) {
                    n4 = n3;
                    if (b2.getParent() != null) {
                        break Label_0446;
                    }
                }
                this.e.h(b2, new en(-1, -1));
                n4 = n3;
            }
            else {
                this.e.p(c7.a);
                this.g.l(this.c.a);
                n4 = 8;
            }
        }
        this.e.k(n4, 24);
        this.d.A((Context)this.a, c2);
        c2 = this.c(actionBarColor2);
        if ((this.m = c2) != 0) {
            this.d.B(c2);
        }
        this.d.w((Context)this.a, n);
        if (this.c(actionBarColor3) != 0) {
            this.d.x(ColorStateList.valueOf(this.c(actionBarColor3)));
        }
    }
}
