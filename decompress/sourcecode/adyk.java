import java.util.Iterator;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.ImageView$ScaleType;
import android.view.View$OnAttachStateChangeListener;
import android.text.TextUtils;
import android.view.View;
import android.support.v7.widget.AppCompatTextView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.accessibility.AccessibilityManager;
import java.util.LinkedHashSet;
import android.widget.FrameLayout;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import android.widget.LinearLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adyk extends LinearLayout
{
    public final TextInputLayout a;
    public final CheckableImageButton b;
    public ColorStateList c;
    public final CheckableImageButton d;
    public int e;
    public ColorStateList f;
    public PorterDuff$Mode g;
    public CharSequence h;
    public final TextView i;
    public EditText j;
    public final TextWatcher k;
    private final FrameLayout l;
    private PorterDuff$Mode m;
    private final adyj n;
    private final LinkedHashSet o;
    private int p;
    private boolean q;
    private final AccessibilityManager r;
    private aoi s;
    private final aepj t;
    
    public adyk(final TextInputLayout a, final cdn cdn, final byte[] array, final byte[] array2) {
        super(a.getContext());
        this.e = 0;
        this.o = new LinkedHashSet();
        this.k = (TextWatcher)new adyi(this);
        final aepj t = new aepj(this);
        this.t = t;
        this.r = (AccessibilityManager)this.getContext().getSystemService("accessibility");
        this.a = a;
        this.setVisibility(8);
        this.setOrientation(0);
        this.setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-2, -1, 8388613));
        final FrameLayout l = new FrameLayout(this.getContext());
        (this.l = l).setVisibility(8);
        l.setLayoutParams((ViewGroup$LayoutParams)new LinearLayout$LayoutParams(-2, -1));
        final LayoutInflater from = LayoutInflater.from(this.getContext());
        final CheckableImageButton u = this.u((ViewGroup)this, from, 2131431972);
        this.b = u;
        final CheckableImageButton u2 = this.u((ViewGroup)l, from, 2131431971);
        this.d = u2;
        final CharSequence charSequence = null;
        this.n = new adyj(this, cdn, null, null);
        final AppCompatTextView i = new AppCompatTextView(this.getContext());
        this.i = (TextView)i;
        final int[] a2 = adys.a;
        if (cdn.q(35)) {
            this.c = adwd.s(this.getContext(), cdn, 35);
        }
        if (cdn.q(36)) {
            this.m = adwd.q(cdn.f(36, -1), (PorterDuff$Mode)null);
        }
        if (cdn.q(34)) {
            this.n(cdn.k(34));
        }
        u.setContentDescription(this.getResources().getText(2132017993));
        ana.X((View)u, 2);
        u.setClickable(false);
        u.setFocusable(u.c = false);
        if (!cdn.q(50)) {
            if (cdn.q(30)) {
                this.f = adwd.s(this.getContext(), cdn, 30);
            }
            if (cdn.q(31)) {
                this.g = adwd.q(cdn.f(31, -1), (PorterDuff$Mode)null);
            }
        }
        if (cdn.q(28)) {
            this.l(cdn.f(28, 0));
            if (cdn.q(25)) {
                this.i(cdn.m(25));
            }
            this.h(cdn.p(24, true));
        }
        else if (cdn.q(50)) {
            if (cdn.q(51)) {
                this.f = adwd.s(this.getContext(), cdn, 51);
            }
            if (cdn.q(52)) {
                this.g = adwd.q(cdn.f(52, -1), (PorterDuff$Mode)null);
            }
            this.l(cdn.p(50, false) ? 1 : 0);
            this.i(cdn.m(48));
        }
        final int e = cdn.e(27, this.getResources().getDimensionPixelSize(2131168149));
        if (e >= 0) {
            if (e != this.p) {
                adwd.V(u2, this.p = e);
                adwd.V(u, e);
            }
            if (cdn.q(29)) {
                final ImageView$ScaleType s = adwd.S(cdn.f(29, -1));
                u2.setScaleType(s);
                u.setScaleType(s);
            }
            ((TextView)i).setVisibility(8);
            ((TextView)i).setId(2131431991);
            ((TextView)i).setLayoutParams((ViewGroup$LayoutParams)new LinearLayout$LayoutParams(-2, -2, 80.0f));
            ana.aw((View)i);
            ((TextView)i).setTextAppearance(cdn.i(69, 0));
            if (cdn.q(70)) {
                ((TextView)i).setTextColor(cdn.j(70));
            }
            final CharSequence m = cdn.m(68);
            CharSequence h = charSequence;
            if (!TextUtils.isEmpty(m)) {
                h = m;
            }
            this.h = h;
            ((TextView)i).setText(m);
            this.w();
            l.addView((View)u2);
            this.addView((View)i);
            this.addView((View)l);
            this.addView((View)u);
            a.m.add(t);
            if (a.c != null) {
                t.a(a);
            }
            this.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)new ie(this, 14));
            return;
        }
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }
    
    private final CheckableImageButton u(final ViewGroup viewGroup, final LayoutInflater layoutInflater, final int id) {
        final CheckableImageButton checkableImageButton = (CheckableImageButton)layoutInflater.inflate(2131624346, viewGroup, false);
        checkableImageButton.setId(id);
        if (adwd.h(this.getContext())) {
            alk.g((ViewGroup$MarginLayoutParams)checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }
    
    private final void v() {
        final FrameLayout l = this.l;
        final int visibility = this.d.getVisibility();
        final int n = 0;
        int visibility2;
        if (visibility == 0 && !this.t()) {
            visibility2 = 0;
        }
        else {
            visibility2 = 8;
        }
        l.setVisibility(visibility2);
        int n2;
        if (this.h != null && !this.q) {
            n2 = 0;
        }
        else {
            n2 = 8;
        }
        int visibility3 = n;
        if (!this.s()) {
            visibility3 = n;
            if (!this.t()) {
                if (n2 == 0) {
                    visibility3 = n;
                }
                else {
                    visibility3 = 8;
                }
            }
        }
        this.setVisibility(visibility3);
    }
    
    private final void w() {
        final int visibility = this.i.getVisibility();
        final CharSequence h = this.h;
        boolean b = false;
        int visibility2;
        final int n = visibility2 = 8;
        if (h != null) {
            visibility2 = n;
            if (!this.q) {
                visibility2 = 0;
            }
        }
        if (visibility != visibility2) {
            final adyl b2 = this.b();
            if (visibility2 == 0) {
                b = true;
            }
            b2.h(b);
        }
        this.v();
        this.i.setVisibility(visibility2);
        this.a.L();
    }
    
    public final Drawable a() {
        return this.d.getDrawable();
    }
    
    public final adyl b() {
        final adyj n = this.n;
        final int e = this.e;
        Object o;
        if ((o = n.a.get(e)) == null) {
            if (e != -1) {
                if (e != 0) {
                    if (e != 1) {
                        if (e != 2) {
                            if (e != 3) {
                                final StringBuilder sb = new StringBuilder("Invalid end icon mode: ");
                                sb.append(e);
                                throw new IllegalArgumentException(sb.toString());
                            }
                            o = new adyh(n.b);
                        }
                        else {
                            o = new adya(n.b);
                        }
                    }
                    else {
                        o = new adyr(n.b, n.d);
                    }
                }
                else {
                    o = new adyl(n.b);
                }
            }
            else {
                o = new adyb(n.b);
            }
            n.a.append(e, o);
        }
        return (adyl)o;
    }
    
    public final void c() {
        if (this.s != null && this.r != null && ana.am((View)this)) {
            aoh.a(this.r, this.s);
        }
    }
    
    public final void d(final boolean q) {
        this.q = q;
        this.w();
    }
    
    public final void e() {
        adwd.U(this.a, this.d, this.f);
    }
    
    final void f(final boolean b) {
        final adyl b2 = this.b();
        final boolean s = b2.s();
        final int n = 0;
        final int n2 = 1;
        int n3 = n;
        if (s) {
            final boolean a = this.d.a;
            n3 = n;
            if (a != b2.t()) {
                this.d.setChecked(a ^ true);
                n3 = 1;
            }
        }
        if (b2.q()) {
            final boolean activated = this.d.isActivated();
            if (activated != b2.r()) {
                this.d.setActivated(activated ^ true);
                n3 = n2;
            }
        }
        if (!b && n3 == 0) {
            return;
        }
        this.e();
    }
    
    public final void g() {
        final aoi s = this.s;
        if (s != null) {
            final AccessibilityManager r = this.r;
            if (r != null) {
                aoh.b(r, s);
            }
        }
    }
    
    final void h(final boolean b) {
        this.d.a(b);
    }
    
    final void i(final CharSequence contentDescription) {
        if (this.d.getContentDescription() != contentDescription) {
            this.d.setContentDescription(contentDescription);
        }
    }
    
    public final void j(final int n) {
        Drawable b;
        if (n != 0) {
            b = fc.b(this.getContext(), n);
        }
        else {
            b = null;
        }
        this.k(b);
    }
    
    public final void k(final Drawable imageDrawable) {
        this.d.setImageDrawable(imageDrawable);
        if (imageDrawable != null) {
            adwd.T(this.a, this.d, this.f, this.g);
            this.e();
        }
    }
    
    public final void l(final int e) {
        if (this.e == e) {
            return;
        }
        final adyl b = this.b();
        this.g();
        CharSequence text = null;
        this.s = null;
        b.j();
        this.e = e;
        final Iterator iterator = this.o.iterator();
        while (iterator.hasNext()) {
            ((adyw)iterator.next()).a();
        }
        this.m(e != 0);
        final adyl b2 = this.b();
        int n;
        if ((n = this.n.c) == 0) {
            n = b2.b();
        }
        this.j(n);
        final int a = b2.a();
        if (a != 0) {
            text = this.getResources().getText(a);
        }
        this.i(text);
        this.h(b2.s());
        final int l = this.a.l;
        if (b2.o(l)) {
            b2.i();
            this.s = b2.A();
            this.c();
            adwd.W(this.d, b2.c());
            final EditText j = this.j;
            if (j != null) {
                b2.g(j);
                this.o(b2);
            }
            adwd.T(this.a, this.d, this.f, this.g);
            this.f(true);
            return;
        }
        final StringBuilder sb = new StringBuilder("The current box background mode ");
        sb.append(l);
        sb.append(" is not supported by the end icon mode ");
        sb.append(e);
        throw new IllegalStateException(sb.toString());
    }
    
    public final void m(final boolean b) {
        if (this.s() != b) {
            final CheckableImageButton d = this.d;
            int visibility;
            if (!b) {
                visibility = 8;
            }
            else {
                visibility = 0;
            }
            d.setVisibility(visibility);
            this.v();
            this.q();
            this.a.L();
        }
    }
    
    final void n(final Drawable imageDrawable) {
        this.b.setImageDrawable(imageDrawable);
        this.p();
        adwd.T(this.a, this.b, this.c, this.m);
    }
    
    public final void o(final adyl adyl) {
        final EditText j = this.j;
        if (j == null) {
            return;
        }
        if (adyl.d() != null) {
            j.setOnFocusChangeListener(adyl.d());
        }
        if (adyl.e() != null) {
            this.d.setOnFocusChangeListener(adyl.e());
        }
    }
    
    public final void p() {
        final Drawable drawable = this.b.getDrawable();
        int visibility = 0;
        boolean b = false;
        Label_0043: {
            if (drawable != null) {
                final TextInputLayout a = this.a;
                if (a.d.g && a.K()) {
                    b = true;
                    break Label_0043;
                }
            }
            b = false;
        }
        final CheckableImageButton b2 = this.b;
        if (!b) {
            visibility = 8;
        }
        b2.setVisibility(visibility);
        this.v();
        this.q();
        if (!this.r()) {
            this.a.L();
        }
    }
    
    public final void q() {
        if (this.a.c == null) {
            return;
        }
        final boolean s = this.s();
        int i = 0;
        if (!s) {
            if (this.t()) {
                i = i;
            }
            else {
                i = ana.i((View)this.a.c);
            }
        }
        ana.ab((View)this.i, this.getContext().getResources().getDimensionPixelSize(2131167843), this.a.c.getPaddingTop(), i, this.a.c.getPaddingBottom());
    }
    
    public final boolean r() {
        return this.e != 0;
    }
    
    public final boolean s() {
        return this.l.getVisibility() == 0 && this.d.getVisibility() == 0;
    }
    
    public final boolean t() {
        return this.b.getVisibility() == 0;
    }
}
