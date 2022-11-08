import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.Typeface;
import android.view.ViewGroup$MarginLayoutParams;
import android.util.StateSet;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.InsetDrawable;
import android.content.res.ColorStateList;
import android.os.Build$VERSION;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ContextThemeWrapper;
import com.google.android.setupcompat.template.FooterActionButton;
import android.content.res.TypedArray;
import android.widget.Button;
import android.util.AttributeSet;
import com.google.android.setupcompat.internal.TemplateLayout;
import java.util.concurrent.atomic.AtomicInteger;
import android.view.ViewStub;
import android.content.Context;
import android.widget.LinearLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aedf implements aedi
{
    final boolean a;
    final boolean b;
    final boolean c;
    public LinearLayout d;
    public aedg e;
    public aedg f;
    int g;
    int h;
    final int i;
    public final agjc j;
    private final Context k;
    private final ViewStub l;
    private int m;
    private int n;
    private int o;
    private int p;
    private final int q;
    private final int r;
    
    static {
        new AtomicInteger(1);
    }
    
    public aedf(final TemplateLayout templateLayout, final AttributeSet set, int n) {
        final agjc j = new agjc((char[])null);
        this.j = j;
        final Context context = templateLayout.getContext();
        this.k = context;
        this.l = (ViewStub)templateLayout.h(2131431829);
        aedh.a.clear();
        final aecp aecp = (aecp)templateLayout;
        this.a = aecp.f();
        this.b = aecp.e();
        this.c = aecp.g();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, aecq.a, n, 0);
        n = obtainStyledAttributes.getDimensionPixelSize(11, 0);
        this.i = n;
        this.o = obtainStyledAttributes.getDimensionPixelSize(10, n);
        this.p = obtainStyledAttributes.getDimensionPixelSize(7, n);
        this.g = obtainStyledAttributes.getDimensionPixelSize(9, 0);
        this.h = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        n = obtainStyledAttributes.getColor(12, 0);
        this.q = n;
        final int color = obtainStyledAttributes.getColor(14, 0);
        this.r = color;
        final int resourceId = obtainStyledAttributes.getResourceId(13, 0);
        final int resourceId2 = obtainStyledAttributes.getResourceId(15, 0);
        obtainStyledAttributes.recycle();
        if (resourceId2 != 0) {
            final aedg b = aeda.b(resourceId2, context);
            aeda.f("setSecondaryButton");
            this.i();
            final aect i = aeda.i(aedb.H, aedb.A, aedb.B, aedb.D, j(b.a), aedb.I, aedb.J, aedb.w, aedb.y, aedb.j, aedb.x, aedb.u, aedb.v, this.h(b, 2132083675, aedb.H));
            final FooterActionButton k = this.k(b, i);
            this.n = k.getId();
            k.b = false;
            this.f = b;
            this.c((Button)k, color);
            this.l((Button)k, i);
            this.d();
            j.d(true, true);
        }
        if (resourceId != 0) {
            final aedg b2 = aeda.b(resourceId, context);
            aeda.f("setPrimaryButton");
            this.i();
            final aect l = aeda.i(aedb.E, aedb.A, aedb.B, aedb.C, j(b2.a), aedb.F, aedb.G, aedb.w, aedb.y, aedb.j, aedb.x, aedb.u, aedb.v, this.h(b2, 2132083674, aedb.E));
            final FooterActionButton m = this.k(b2, l);
            this.m = m.getId();
            m.b = true;
            this.e = b2;
            this.c((Button)m, n);
            this.l((Button)m, l);
            this.d();
            j.e(true, true);
        }
    }
    
    private final int h(final aedg aedg, final int n, final aedb aedb) {
        final int c = aedg.c;
        int n2 = n;
        if (c != 0) {
            if (this.a) {
                n2 = n;
            }
            else {
                n2 = c;
            }
        }
        if (this.a) {
            if (aedd.f(this.k).c(this.k, aedb) != 0) {
                return 2132083674;
            }
            n2 = 2132083675;
        }
        return n2;
    }
    
    private final LinearLayout i() {
        if (this.d == null) {
            if (this.l == null) {
                throw new IllegalStateException("Footer stub is not found in this template");
            }
            this.l.setLayoutInflater(LayoutInflater.from((Context)new ContextThemeWrapper(this.k, 2132083677)));
            this.l.setLayoutResource(2131625531);
            final LinearLayout d = (LinearLayout)this.l.inflate();
            if ((this.d = d) != null) {
                d.setId(View.generateViewId());
                d.setPadding(this.g, this.o, this.h, this.p);
                if (this.e()) {
                    d.setGravity(8388629);
                }
            }
            final LinearLayout d2 = this.d;
            if (d2 != null) {
                if (this.a) {
                    if (!this.c) {
                        d2.setBackgroundColor(aedd.f(this.k).c(this.k, aedb.e));
                    }
                    if (aedd.f(this.k).l(aedb.s)) {
                        this.o = (int)aedd.f(this.k).a(this.k, aedb.s);
                    }
                    if (aedd.f(this.k).l(aedb.t)) {
                        this.p = (int)aedd.f(this.k).a(this.k, aedb.t);
                    }
                    if (aedd.f(this.k).l(aedb.g)) {
                        this.g = (int)aedd.f(this.k).a(this.k, aedb.g);
                    }
                    if (aedd.f(this.k).l(aedb.h)) {
                        this.h = (int)aedd.f(this.k).a(this.k, aedb.h);
                    }
                    d2.setPadding(this.g, this.o, this.h, this.p);
                    if (aedd.f(this.k).l(aedb.f)) {
                        final int minimumHeight = (int)aedd.f(this.k).a(this.k, aedb.f);
                        if (minimumHeight > 0) {
                            d2.setMinimumHeight(minimumHeight);
                        }
                    }
                }
            }
        }
        return this.d;
    }
    
    private static aedb j(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 8: {
                return aedb.r;
            }
            case 7: {
                return aedb.q;
            }
            case 6: {
                return aedb.p;
            }
            case 5: {
                return aedb.o;
            }
            case 4: {
                return aedb.n;
            }
            case 3: {
                return aedb.m;
            }
            case 2: {
                return aedb.l;
            }
            case 1: {
                return aedb.k;
            }
        }
    }
    
    private final FooterActionButton k(final aedg aedg, final aect aect) {
        final FooterActionButton footerActionButton = (FooterActionButton)LayoutInflater.from((Context)new ContextThemeWrapper(this.k, aect.n)).inflate(2131625530, (ViewGroup)null, false);
        footerActionButton.setId(View.generateViewId());
        footerActionButton.setText(aedg.b);
        footerActionButton.setOnClickListener((View$OnClickListener)aedg);
        footerActionButton.setVisibility(0);
        footerActionButton.setEnabled(true);
        footerActionButton.a = aedg;
        footerActionButton.getId();
        return footerActionButton;
    }
    
    private final void l(final Button button, final aect aect) {
        if (!this.a) {
            return;
        }
        final Context k = this.k;
        final boolean b = this.b;
        final int id = button.getId();
        final int m = this.m;
        aedh.a.put(button.getId(), button.getTextColors());
        if (!b) {
            if (button.isEnabled()) {
                aedh.d(k, button, aect.f);
            }
            else {
                aedh.c(k, button, aect.d);
            }
            final aedb a = aect.a;
            final aedb b2 = aect.b;
            final aedb c = aect.c;
            aeda.e(Build$VERSION.SDK_INT >= 29, "Update button background only support on sdk Q or higher");
            final int c2 = aedd.f(k).c(k, a);
            final float p2 = aedd.f(k).p(k, b2);
            final int c3 = aedd.f(k).c(k, c);
            if (c2 != 0) {
                float float1 = p2;
                if (p2 <= 0.0f) {
                    final TypedArray obtainStyledAttributes = k.obtainStyledAttributes(new int[] { 16842803 });
                    float1 = obtainStyledAttributes.getFloat(0, 0.26f);
                    obtainStyledAttributes.recycle();
                }
                int n;
                if ((n = c3) == 0) {
                    n = c2;
                }
                final ColorStateList backgroundTintList = new ColorStateList(new int[][] { { -16842910 }, new int[0] }, new int[] { aedh.a(n, float1), c2 });
                button.getBackground().mutate().setState(new int[0]);
                button.refreshDrawableState();
                button.setBackgroundTintList(backgroundTintList);
            }
        }
        final aedb f = aect.f;
        final aedb i = aect.m;
        int n2;
        if (b) {
            n2 = button.getTextColors().getDefaultColor();
        }
        else {
            n2 = aedd.f(k).c(k, f);
        }
        final float p3 = aedd.f(k).p(k, i);
        final Drawable background = button.getBackground();
        RippleDrawable rippleDrawable;
        if (background instanceof InsetDrawable) {
            rippleDrawable = (RippleDrawable)((InsetDrawable)background).getDrawable();
        }
        else if (background instanceof RippleDrawable) {
            rippleDrawable = (RippleDrawable)background;
        }
        else {
            rippleDrawable = null;
        }
        if (rippleDrawable != null) {
            final int a2 = aedh.a(n2, p3);
            rippleDrawable.setColor(new ColorStateList(new int[][] { { 16842919 }, { 16842908 }, StateSet.NOTHING }, new int[] { a2, a2, 0 }));
        }
        final aedb g = aect.g;
        final ViewGroup$LayoutParams layoutParams = button.getLayoutParams();
        if (aedd.f(k).l(g) && layoutParams instanceof ViewGroup$MarginLayoutParams) {
            final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)layoutParams;
            viewGroup$MarginLayoutParams.setMargins((int)aedd.f(k).a(k, g), viewGroup$MarginLayoutParams.topMargin, viewGroup$MarginLayoutParams.rightMargin, viewGroup$MarginLayoutParams.bottomMargin);
        }
        final float a3 = aedd.f(k).a(k, aect.h);
        if (a3 > 0.0f) {
            button.setTextSize(0, a3);
        }
        final aedb j = aect.i;
        if (aedd.f(k).l(j)) {
            final float a4 = aedd.f(k).a(k, j);
            if (a4 > 0.0f) {
                button.setMinHeight((int)a4);
            }
        }
        final aedb l = aect.j;
        final aedb k2 = aect.k;
        final String h = aedd.f(k).h(k, l);
        int q;
        if (aedd.f(k).l(k2)) {
            q = aedd.f(k).q(k, k2);
        }
        else {
            q = 0;
        }
        final Typeface create = Typeface.create(h, q);
        if (create != null) {
            button.setTypeface(create);
        }
        final float a5 = aedd.f(k).a(k, aect.l);
        final Drawable background2 = button.getBackground();
        GradientDrawable gradientDrawable;
        if (background2 instanceof InsetDrawable) {
            gradientDrawable = (GradientDrawable)((LayerDrawable)((InsetDrawable)background2).getDrawable()).getDrawable(0);
        }
        else if (background2 instanceof RippleDrawable) {
            final RippleDrawable rippleDrawable2 = (RippleDrawable)background2;
            if (rippleDrawable2.getDrawable(0) instanceof GradientDrawable) {
                gradientDrawable = (GradientDrawable)rippleDrawable2.getDrawable(0);
            }
            else {
                gradientDrawable = (GradientDrawable)((InsetDrawable)rippleDrawable2.getDrawable(0)).getDrawable();
            }
        }
        else {
            gradientDrawable = null;
        }
        if (gradientDrawable != null) {
            gradientDrawable.setCornerRadius(a5);
        }
        final aedb e = aect.e;
        if (button != null) {
            Drawable d;
            if (e != null) {
                d = aedd.f(k).d(k, e);
            }
            else {
                d = null;
            }
            if (d != null) {
                d.setBounds(0, 0, d.getIntrinsicWidth(), d.getIntrinsicHeight());
            }
            Drawable drawable;
            if (id != m) {
                drawable = null;
            }
            else {
                drawable = d;
            }
            if (id == m) {
                d = null;
            }
            button.setCompoundDrawablesRelative(d, (Drawable)null, drawable, (Drawable)null);
        }
        if (!this.b) {
            final aedb f2 = aect.f;
            final aedb d2 = aect.d;
            if (button.isEnabled()) {
                aedh.d(this.k, button, f2);
                return;
            }
            aedh.c(this.k, button, d2);
        }
    }
    
    public final Button a() {
        final LinearLayout d = this.d;
        if (d == null) {
            return null;
        }
        return (Button)d.findViewById(this.m);
    }
    
    public final Button b() {
        final LinearLayout d = this.d;
        if (d == null) {
            return null;
        }
        return (Button)d.findViewById(this.n);
    }
    
    protected final void c(Button a, int n) {
        if (!this.b && n != 0) {
            aedh.b(a, n);
        }
        this.d.addView((View)a);
        a = this.a();
        final Button b = this.b();
        boolean b2 = true;
        final int n2 = 0;
        if (a != null && a.getVisibility() == 0) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (b == null || b.getVisibility() != 0) {
            b2 = false;
        }
        final LinearLayout d = this.d;
        if (d != null) {
            int visibility = n2;
            if (n == 0) {
                if (b2) {
                    visibility = n2;
                }
                else {
                    visibility = 8;
                }
            }
            d.setVisibility(visibility);
        }
    }
    
    protected final void d() {
        final LinearLayout i = this.i();
        final Button a = this.a();
        final Button b = this.b();
        i.removeAllViews();
        final int orientation = this.k.getResources().getConfiguration().orientation;
        if (b != null) {
            i.addView((View)b);
        }
        if (!this.e()) {
            final LinearLayout j = this.i();
            final View view = new View(this.k);
            view.setLayoutParams((ViewGroup$LayoutParams)new LinearLayout$LayoutParams(0, 0, 1.0f));
            view.setVisibility(4);
            j.addView(view);
        }
        if (a != null) {
            i.addView((View)a);
        }
        if (a != null) {
            final LinearLayout$LayoutParams layoutParams = (LinearLayout$LayoutParams)a.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
                a.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
            }
        }
        if (b != null) {
            final LinearLayout$LayoutParams layoutParams2 = (LinearLayout$LayoutParams)b.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.width = -2;
                layoutParams2.weight = 0.0f;
                b.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
            }
        }
    }
    
    protected final boolean e() {
        return aedd.f(this.k).l(aedb.z) && aedd.f(this.k).j(this.k, aedb.z, false);
    }
    
    public final boolean f() {
        return this.a() != null && this.a().getVisibility() == 0;
    }
    
    public final boolean g() {
        return this.b() != null && this.b().getVisibility() == 0;
    }
}
