// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.textfield;

import android.view.View$AccessibilityDelegate;
import android.os.Parcelable;
import android.content.res.Configuration;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.graphics.Canvas;
import android.util.SparseArray;
import android.view.ViewStructure;
import java.util.Iterator;
import android.graphics.Typeface;
import android.text.TextWatcher;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.drawable.ColorDrawable;
import android.util.TypedValue;
import android.os.Build$VERSION;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff$Mode;
import android.widget.LinearLayout$LayoutParams;
import android.text.Editable;
import android.widget.AutoCompleteTextView;
import android.view.ViewGroup;
import android.text.TextUtils;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.FrameLayout;
import java.util.LinkedHashSet;
import android.widget.EditText;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.RectF;
import android.graphics.Rect;
import android.graphics.drawable.StateListDrawable;
import android.content.res.ColorStateList;
import android.widget.TextView;
import android.widget.LinearLayout;

public class TextInputLayout extends LinearLayout
{
    public static final int r = 0;
    private static final int[][] s;
    private int A;
    private TextView B;
    private ColorStateList C;
    private int D;
    private cih E;
    private cih F;
    private ColorStateList G;
    private ColorStateList H;
    private boolean I;
    private CharSequence J;
    private adyh K;
    private adyh L;
    private StateListDrawable M;
    private boolean N;
    private adyh O;
    private adyh P;
    private adym Q;
    private boolean R;
    private final int S;
    private int T;
    private int U;
    private int V;
    private int W;
    public final aeav a;
    private int aa;
    private int ab;
    private final Rect ac;
    private final Rect ad;
    private final RectF ae;
    private Drawable af;
    private int ag;
    private Drawable ah;
    private int ai;
    private Drawable aj;
    private ColorStateList ak;
    private ColorStateList al;
    private int am;
    private int an;
    private int ao;
    private ColorStateList ap;
    private int aq;
    private int ar;
    private int as;
    private int at;
    private int au;
    private boolean av;
    private ValueAnimator aw;
    private boolean ax;
    public final aeam b;
    public EditText c;
    public final aeaq d;
    public boolean e;
    public int f;
    public boolean g;
    public TextView h;
    public CharSequence i;
    public boolean j;
    public boolean k;
    public int l;
    public final LinkedHashSet m;
    public boolean n;
    public final advm o;
    public boolean p;
    public boolean q;
    private final FrameLayout t;
    private CharSequence u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;
    
    static {
        s = new int[][] { { 16842919 }, new int[0] };
    }
    
    public TextInputLayout(final Context context) {
        this(context, null);
    }
    
    public TextInputLayout(final Context context, final AttributeSet set) {
        this(context, set, 2130970625);
    }
    
    public TextInputLayout(final Context context, final AttributeSet set, int l) {
        super(aeba.a(context, set, l, 2132084680), set, l);
        this.v = -1;
        this.w = -1;
        this.x = -1;
        this.y = -1;
        final aeaq d = new aeaq(this);
        this.d = d;
        this.ac = new Rect();
        this.ad = new Rect();
        this.ae = new RectF();
        this.m = new LinkedHashSet();
        final advm o = new advm((View)this);
        this.o = o;
        final Context context2 = this.getContext();
        this.setOrientation(1);
        this.setWillNotDraw(false);
        this.setAddStatesFromChildren(true);
        final FrameLayout t = new FrameLayout(context2);
        (this.t = t).setAddStatesFromChildren(true);
        o.u(adsf.a);
        o.s(adsf.a);
        o.m(8388659);
        final cdo d2 = adwh.d(context2, set, aeau.c, l, 2132084680, new int[] { 22, 20, 37, 42, 46 });
        final aeav a = new aeav(this, d2, (byte[])null, (byte[])null);
        this.a = a;
        this.I = d2.p(45, true);
        this.t(d2.m(4));
        this.p = d2.p(44, true);
        this.av = d2.p(39, true);
        if (d2.q(6)) {
            this.y(d2.f(6, -1));
        }
        else if (d2.q(3)) {
            this.z(d2.e(3, -1));
        }
        if (d2.q(5)) {
            this.w(d2.f(5, -1));
        }
        else if (d2.q(2)) {
            this.x(d2.e(2, -1));
        }
        this.Q = adym.c(context2, set, l, 2132084680).a();
        this.S = context2.getResources().getDimensionPixelOffset(2131168206);
        this.T = d2.d(9, 0);
        this.V = d2.e(16, context2.getResources().getDimensionPixelSize(2131168207));
        this.W = d2.e(17, context2.getResources().getDimensionPixelSize(2131168208));
        this.U = this.V;
        final float r = d2.r(13);
        final float r2 = d2.r(12);
        final float r3 = d2.r(10);
        final float r4 = d2.r(11);
        final adyl e = this.Q.e();
        if (r >= 0.0f) {
            e.d(r);
        }
        if (r2 >= 0.0f) {
            e.e(r2);
        }
        if (r3 >= 0.0f) {
            e.c(r3);
        }
        if (r4 >= 0.0f) {
            e.b(r4);
        }
        this.Q = e.a();
        final ColorStateList n = adds.N(context2, d2, 7);
        if (n != null) {
            l = n.getDefaultColor();
            this.aq = l;
            this.ab = l;
            if (n.isStateful()) {
                this.ar = n.getColorForState(new int[] { -16842910 }, -1);
                this.as = n.getColorForState(new int[] { 16842908, 16842910 }, -1);
                this.at = n.getColorForState(new int[] { 16843623, 16842910 }, -1);
            }
            else {
                this.as = this.aq;
                final ColorStateList d3 = td.d(context2, 2131101544);
                this.ar = d3.getColorForState(new int[] { -16842910 }, -1);
                this.at = d3.getColorForState(new int[] { 16843623 }, -1);
            }
        }
        else {
            this.ab = 0;
            this.aq = 0;
            this.ar = 0;
            this.as = 0;
            this.at = 0;
        }
        if (d2.q(1)) {
            final ColorStateList j = d2.j(1);
            this.al = j;
            this.ak = j;
        }
        final ColorStateList n2 = adds.N(context2, d2, 14);
        this.ao = d2.s(14);
        this.am = agy.a(context2, 2131101571);
        this.au = agy.a(context2, 2131101572);
        this.an = agy.a(context2, 2131101575);
        if (n2 != null) {
            if (n2.isStateful()) {
                this.am = n2.getDefaultColor();
                this.au = n2.getColorForState(new int[] { -16842910 }, -1);
                this.an = n2.getColorForState(new int[] { 16843623, 16842910 }, -1);
                this.ao = n2.getColorForState(new int[] { 16842908, 16842910 }, -1);
            }
            else if (this.ao != n2.getDefaultColor()) {
                this.ao = n2.getDefaultColor();
            }
            this.I();
        }
        if (d2.q(15)) {
            final ColorStateList n3 = adds.N(context2, d2, 15);
            if (this.ap != n3) {
                this.ap = n3;
                this.I();
            }
        }
        if (d2.i(46, -1) != -1) {
            o.k(d2.i(46, 0));
            this.al = o.h;
            if (this.c != null) {
                this.G(false);
                this.ad();
            }
        }
        final int i = d2.i(37, 0);
        final CharSequence m = d2.m(32);
        final boolean p3 = d2.p(33, false);
        final int k = d2.i(42, 0);
        final boolean p4 = d2.p(41, false);
        final CharSequence m2 = d2.m(40);
        final int i2 = d2.i(54, 0);
        final CharSequence m3 = d2.m(53);
        final boolean p5 = d2.p(18, false);
        this.j(d2.f(19, -1));
        this.A = d2.i(22, 0);
        this.z = d2.i(20, 0);
        l = d2.f(8, 0);
        if (l != this.l) {
            this.l = l;
            if (this.c != null) {
                this.W();
            }
        }
        d.f(m);
        d.i(k);
        d.g(i);
        if (this.B == null) {
            (this.B = (TextView)new AppCompatTextView(this.getContext())).setId(2131431992);
            anb.X((View)this.B, 2);
            final cih r5 = this.R();
            this.E = r5;
            ((cin)r5).a = 67L;
            this.F = this.R();
            this.A(this.D);
            this.B(this.C);
        }
        if (TextUtils.isEmpty(m3)) {
            this.aa(false);
        }
        else {
            if (!this.j) {
                this.aa(true);
            }
            this.i = m3;
        }
        this.af();
        this.A(i2);
        if (d2.q(38)) {
            this.q(d2.j(38));
        }
        if (d2.q(43)) {
            d.j(d2.j(43));
        }
        if (d2.q(47)) {
            this.v(d2.j(47));
        }
        if (d2.q(23)) {
            final ColorStateList j2 = d2.j(23);
            if (this.G != j2) {
                this.G = j2;
                this.ac();
            }
        }
        if (d2.q(21)) {
            final ColorStateList j3 = d2.j(21);
            if (this.H != j3) {
                this.H = j3;
                this.ac();
            }
        }
        if (d2.q(55)) {
            this.B(d2.j(55));
        }
        final aeam b = new aeam(this, d2, (byte[])null, (byte[])null);
        this.b = b;
        final boolean p6 = d2.p(0, true);
        d2.o();
        anb.X((View)this, 2);
        anb.Y((View)this, 1);
        t.addView((View)a);
        t.addView((View)b);
        this.addView((View)t);
        this.setEnabled(p6);
        this.s(p4);
        this.p(p3);
        this.i(p5);
        this.r(m2);
    }
    
    private final int N() {
        if (!this.I) {
            return 0;
        }
        final int l = this.l;
        float b;
        if (l != 0) {
            if (l != 2) {
                return 0;
            }
            b = this.o.b() / 2.0f;
        }
        else {
            b = this.o.b();
        }
        return (int)b;
    }
    
    private final int O(int n, final boolean b) {
        final int n2 = n += this.c.getCompoundPaddingLeft();
        if (this.f() != null) {
            n = n2;
            if (!b) {
                n = n2 - this.c().getMeasuredWidth() + this.c().getPaddingLeft();
            }
        }
        return n;
    }
    
    private final int P(int n, final boolean b) {
        final int n2 = n -= this.c.getCompoundPaddingRight();
        if (this.f() != null) {
            n = n2;
            if (b) {
                n = n2 + (this.c().getMeasuredWidth() - this.c().getPaddingRight());
            }
        }
        return n;
    }
    
    private final Drawable Q() {
        if (this.L == null) {
            this.L = this.S(true);
        }
        return (Drawable)this.L;
    }
    
    private final cih R() {
        final cih cih = new cih();
        ((cin)cih).b = adds.D(this.getContext(), 2130969948, 87);
        ((cin)cih).c = adds.I(this.getContext(), 2130969958, adsf.a);
        return cih;
    }
    
    private final adyh S(final boolean b) {
        final float n = (float)this.getResources().getDimensionPixelOffset(2131168183);
        final EditText c = this.c;
        float b2;
        if (c instanceof aeas) {
            b2 = ((aeas)c).b;
        }
        else {
            b2 = (float)this.getResources().getDimensionPixelOffset(2131167652);
        }
        float n2;
        if (!b) {
            n2 = 0.0f;
        }
        else {
            n2 = n;
        }
        final int dimensionPixelOffset = this.getResources().getDimensionPixelOffset(2131168096);
        final adyl a = adym.a();
        a.d(n2);
        a.e(n2);
        a.b(n);
        a.c(n);
        final adym a2 = a.a();
        final adyh j = adyh.j(this.getContext(), b2);
        j.tn(a2);
        final adyg a3 = j.a;
        if (a3.i == null) {
            a3.i = new Rect();
        }
        j.a.i.set(0, dimensionPixelOffset, 0, dimensionPixelOffset);
        j.invalidateSelf();
        return j;
    }
    
    private final void T() {
        final adyh k = this.K;
        if (k == null) {
            return;
        }
        final adym i = k.k();
        final adym q = this.Q;
        if (i != q) {
            this.K.tn(q);
        }
        if (this.l == 2 && this.ah()) {
            this.K.s((float)this.U, this.aa);
        }
        int ab = this.ab;
        if (this.l == 1) {
            ab = ahz.e(this.ab, adds.V(((View)this).getContext(), 2130969109, 0));
        }
        this.ab = ab;
        this.K.o(ColorStateList.valueOf(ab));
        final adyh o = this.O;
        if (o != null) {
            if (this.P != null) {
                if (this.ah()) {
                    ColorStateList list;
                    if (this.c.isFocused()) {
                        list = ColorStateList.valueOf(this.am);
                    }
                    else {
                        list = ColorStateList.valueOf(this.aa);
                    }
                    o.o(list);
                    this.P.o(ColorStateList.valueOf(this.aa));
                }
                this.invalidate();
            }
        }
        this.F();
    }
    
    private final void U() {
        if (this.ai()) {
            ((aeaf)this.K).z(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }
    
    private final void V() {
        final TextView b = this.B;
        if (b != null && this.j) {
            b.setText((CharSequence)null);
            cir.b((ViewGroup)this.t, (cin)this.F);
            this.B.setVisibility(4);
        }
    }
    
    private final void W() {
        final int l = this.l;
        if (l != 0) {
            if (l != 1) {
                if (l != 2) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(l);
                    sb.append(" is illegal; only @BoxBackgroundMode constants are supported.");
                    throw new IllegalArgumentException(sb.toString());
                }
                if (this.I && !(this.K instanceof aeaf)) {
                    this.K = (adyh)new aeae(this.Q);
                }
                else {
                    this.K = new adyh(this.Q);
                }
                this.O = null;
                this.P = null;
            }
            else {
                this.K = new adyh(this.Q);
                this.O = new adyh();
                this.P = new adyh();
            }
        }
        else {
            this.K = null;
            this.O = null;
            this.P = null;
        }
        this.F();
        this.I();
        if (this.l == 1) {
            if (adds.C(this.getContext())) {
                this.T = this.getResources().getDimensionPixelSize(2131167838);
            }
            else if (adds.B(this.getContext())) {
                this.T = this.getResources().getDimensionPixelSize(2131167837);
            }
        }
        if (this.c != null) {
            if (this.l == 1) {
                if (adds.C(this.getContext())) {
                    final EditText c = this.c;
                    anb.ab((View)c, anb.j((View)c), this.getResources().getDimensionPixelSize(2131167836), anb.i((View)this.c), this.getResources().getDimensionPixelSize(2131167835));
                }
                else if (adds.B(this.getContext())) {
                    final EditText c2 = this.c;
                    anb.ab((View)c2, anb.j((View)c2), this.getResources().getDimensionPixelSize(2131167834), anb.i((View)this.c), this.getResources().getDimensionPixelSize(2131167833));
                }
            }
        }
        if (this.l != 0) {
            this.ad();
        }
        final EditText c3 = this.c;
        if (c3 instanceof AutoCompleteTextView) {
            final AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView)c3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                final int i = this.l;
                if (i == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(this.Q());
                    return;
                }
                if (i == 1) {
                    if (this.M == null) {
                        (this.M = new StateListDrawable()).addState(new int[] { 16842922 }, this.Q());
                        this.M.addState(new int[0], (Drawable)this.S(false));
                    }
                    autoCompleteTextView.setDropDownBackgroundDrawable((Drawable)this.M);
                }
            }
        }
    }
    
    private final void X() {
        if (!this.ai()) {
            return;
        }
        final RectF ae = this.ae;
        final advm o = this.o;
        final int width = this.c.getWidth();
        final int gravity = this.c.getGravity();
        final boolean v = o.v(o.k);
        o.l = v;
        float n4 = 0.0f;
        Label_0199: {
            float n = 0.0f;
            float n2 = 0.0f;
            Label_0195: {
                if (gravity != 17 && (gravity & 0x7) != 0x1) {
                    int n3;
                    if ((gravity & 0x800005) != 0x800005 && (gravity & 0x5) != 0x5) {
                        if (v) {
                            n = (float)o.f.right;
                            n2 = o.p;
                            break Label_0195;
                        }
                        n3 = o.f.left;
                    }
                    else {
                        if (!v) {
                            n = (float)o.f.right;
                            n2 = o.p;
                            break Label_0195;
                        }
                        n3 = o.f.left;
                    }
                    n4 = (float)n3;
                    break Label_0199;
                }
                final float n5 = (float)width;
                final float p = o.p;
                n = n5 / 2.0f;
                n2 = p / 2.0f;
            }
            n4 = n - n2;
        }
        ae.left = Math.max(n4, (float)o.f.left);
        ae.top = (float)o.f.top;
        float n9 = 0.0f;
        Label_0371: {
            float n6 = 0.0f;
            float n7 = 0.0f;
            Label_0367: {
                if (gravity != 17 && (gravity & 0x7) != 0x1) {
                    int n8;
                    if ((gravity & 0x800005) != 0x800005 && (gravity & 0x5) != 0x5) {
                        if (!o.l) {
                            n6 = ae.left;
                            n7 = o.p;
                            break Label_0367;
                        }
                        n8 = o.f.right;
                    }
                    else {
                        if (o.l) {
                            n6 = ae.left;
                            n7 = o.p;
                            break Label_0367;
                        }
                        n8 = o.f.right;
                    }
                    n9 = (float)n8;
                    break Label_0371;
                }
                final float n10 = (float)width;
                final float p2 = o.p;
                n6 = n10 / 2.0f;
                n7 = p2 / 2.0f;
            }
            n9 = n6 + n7;
        }
        ae.right = Math.min(n9, (float)o.f.right);
        ae.bottom = o.f.top + o.b();
        if (ae.width() > 0.0f) {
            if (ae.height() > 0.0f) {
                ae.left -= this.S;
                ae.right += this.S;
                ae.offset((float)(-this.getPaddingLeft()), -this.getPaddingTop() - ae.height() / 2.0f + this.U);
                ((aeaf)this.K).z(ae.left, ae.top, ae.right, ae.bottom);
            }
        }
    }
    
    private static void Y(final ViewGroup viewGroup, final boolean enabled) {
        for (int childCount = viewGroup.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = viewGroup.getChildAt(i);
            child.setEnabled(enabled);
            if (child instanceof ViewGroup) {
                Y((ViewGroup)child, enabled);
            }
        }
    }
    
    private final void Z(final CharSequence j) {
        if (!TextUtils.equals(j, this.J)) {
            this.J = j;
            this.o.t(j);
            if (!this.n) {
                this.X();
            }
        }
    }
    
    private final void aa(final boolean j) {
        if (this.j == j) {
            return;
        }
        if (j) {
            final TextView b = this.B;
            if (b != null) {
                this.t.addView((View)b);
                this.B.setVisibility(0);
            }
        }
        else {
            final TextView b2 = this.B;
            if (b2 != null) {
                b2.setVisibility(8);
            }
            this.B = null;
        }
        this.j = j;
    }
    
    private final void ab() {
        if (this.h != null) {
            final EditText c = this.c;
            Editable text;
            if (c == null) {
                text = null;
            }
            else {
                text = c.getText();
            }
            this.D(text);
        }
    }
    
    private final void ac() {
        final TextView h = this.h;
        if (h != null) {
            int n;
            if (this.g) {
                n = this.z;
            }
            else {
                n = this.A;
            }
            this.C(h, n);
            if (!this.g) {
                final ColorStateList g = this.G;
                if (g != null) {
                    this.h.setTextColor(g);
                }
            }
            if (this.g) {
                final ColorStateList h2 = this.H;
                if (h2 != null) {
                    this.h.setTextColor(h2);
                }
            }
        }
    }
    
    private final void ad() {
        if (this.l != 1) {
            final LinearLayout$LayoutParams linearLayout$LayoutParams = (LinearLayout$LayoutParams)this.t.getLayoutParams();
            final int n = this.N();
            if (n != linearLayout$LayoutParams.topMargin) {
                linearLayout$LayoutParams.topMargin = n;
                this.t.requestLayout();
            }
        }
    }
    
    private final void ae(final boolean b, final boolean b2) {
        final boolean enabled = this.isEnabled();
        final EditText c = this.c;
        final boolean b3 = c != null && !TextUtils.isEmpty((CharSequence)c.getText());
        final EditText c2 = this.c;
        final boolean b4 = c2 != null && c2.hasFocus();
        final ColorStateList ak = this.ak;
        if (ak != null) {
            this.o.i(ak);
        }
        Label_0255: {
            if (!enabled) {
                final ColorStateList ak2 = this.ak;
                int n;
                if (ak2 != null) {
                    n = ak2.getColorForState(new int[] { -16842910 }, this.au);
                }
                else {
                    n = this.au;
                }
                this.o.i(ColorStateList.valueOf(n));
            }
            else if (this.K()) {
                final advm o = this.o;
                final TextView h = this.d.h;
                ColorStateList textColors;
                if (h != null) {
                    textColors = h.getTextColors();
                }
                else {
                    textColors = null;
                }
                o.i(textColors);
            }
            else {
                if (this.g) {
                    final TextView h2 = this.h;
                    if (h2 != null) {
                        this.o.i(h2.getTextColors());
                        break Label_0255;
                    }
                }
                if (b4) {
                    final ColorStateList al = this.al;
                    if (al != null) {
                        this.o.l(al);
                    }
                }
            }
        }
        if (!b3 && this.av && (!this.isEnabled() || !b4)) {
            if (b2 || !this.n) {
                final ValueAnimator aw = this.aw;
                if (aw != null && aw.isRunning()) {
                    this.aw.cancel();
                }
                if (b && this.p) {
                    this.g(0.0f);
                }
                else {
                    this.o.r(0.0f);
                }
                if (this.ai() && !((aeaf)this.K).g.isEmpty()) {
                    this.U();
                }
                this.n = true;
                this.V();
                this.a.a(true);
                this.b.d(true);
            }
        }
        else if (b2 || this.n) {
            final ValueAnimator aw2 = this.aw;
            if (aw2 != null && aw2.isRunning()) {
                this.aw.cancel();
            }
            if (b && this.p) {
                this.g(1.0f);
            }
            else {
                this.o.r(1.0f);
            }
            this.n = false;
            if (this.ai()) {
                this.X();
            }
            this.af();
            this.a.a(false);
            this.b.d(false);
        }
    }
    
    private final void af() {
        final EditText c = this.c;
        Editable text;
        if (c == null) {
            text = null;
        }
        else {
            text = c.getText();
        }
        this.H(text);
    }
    
    private final void ag(final boolean b, final boolean b2) {
        final int defaultColor = this.ap.getDefaultColor();
        final int colorForState = this.ap.getColorForState(new int[] { 16843623, 16842910 }, defaultColor);
        final int colorForState2 = this.ap.getColorForState(new int[] { 16843518, 16842910 }, defaultColor);
        if (b) {
            this.aa = colorForState2;
            return;
        }
        if (b2) {
            this.aa = colorForState;
            return;
        }
        this.aa = defaultColor;
    }
    
    private final boolean ah() {
        return this.U >= 0 && this.aa != 0;
    }
    
    private final boolean ai() {
        return this.I && !TextUtils.isEmpty(this.J) && this.K instanceof aeaf;
    }
    
    private final boolean aj() {
        return this.l == 1 && this.c.getMinLines() <= 1;
    }
    
    static int b(final Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }
    
    public final void A(final int n) {
        this.D = n;
        final TextView b = this.B;
        if (b != null) {
            b.setTextAppearance(n);
        }
    }
    
    public final void B(final ColorStateList list) {
        if (this.C != list) {
            this.C = list;
            final TextView b = this.B;
            if (b != null && list != null) {
                b.setTextColor(list);
            }
        }
    }
    
    public final void C(final TextView textView, int defaultColor) {
        while (true) {
            try {
                textView.setTextAppearance(defaultColor);
                defaultColor = textView.getTextColors().getDefaultColor();
                if (defaultColor == -65281) {
                    textView.setTextAppearance(2132083808);
                    textView.setTextColor(agy.a(this.getContext(), 2131099866));
                }
            }
            catch (final Exception ex) {
                continue;
            }
            break;
        }
    }
    
    public final void D(final Editable editable) {
        final int b = b(editable);
        final boolean g = this.g;
        final int f = this.f;
        if (f == -1) {
            this.h.setText((CharSequence)String.valueOf(b));
            this.h.setContentDescription((CharSequence)null);
            this.g = false;
        }
        else {
            this.g = (b > f);
            final Context context = this.getContext();
            final TextView h = this.h;
            final int f2 = this.f;
            int n;
            if (!this.g) {
                n = 2132017699;
            }
            else {
                n = 2132017700;
            }
            final Integer value = b;
            h.setContentDescription((CharSequence)context.getString(n, new Object[] { value, f2 }));
            if (g != this.g) {
                this.ac();
            }
            this.h.setText((CharSequence)akc.a().b(this.getContext().getString(2132017701, new Object[] { value, this.f })));
        }
        if (this.c != null && g != this.g) {
            this.G(false);
            this.I();
            this.E();
        }
    }
    
    public final void E() {
        final EditText c = this.c;
        if (c != null) {
            if (this.l == 0) {
                final Drawable background = c.getBackground();
                if (background == null) {
                    return;
                }
                final Rect a = mb.a;
                final Drawable mutate = background.mutate();
                if (this.K()) {
                    mutate.setColorFilter((ColorFilter)kf.b(this.a(), PorterDuff$Mode.SRC_IN));
                    return;
                }
                if (this.g) {
                    final TextView h = this.h;
                    if (h != null) {
                        mutate.setColorFilter((ColorFilter)kf.b(h.getCurrentTextColor(), PorterDuff$Mode.SRC_IN));
                        return;
                    }
                }
                mutate.clearColorFilter();
                this.c.refreshDrawableState();
            }
        }
    }
    
    public final void F() {
        final EditText c = this.c;
        if (c != null && this.K != null && (this.N || c.getBackground() == null)) {
            if (this.l != 0) {
                final EditText c2 = this.c;
                Object i;
                if (c2 instanceof AutoCompleteTextView && !adyf.q(c2)) {
                    final int u = adds.U((View)this.c, 2130969044);
                    final int l = this.l;
                    if (l == 2) {
                        final Context context = this.getContext();
                        final adyh k = this.K;
                        final int[][] s = TextInputLayout.s;
                        final int y = adds.Y(context, "TextInputLayout");
                        final adyh adyh = new adyh(k.k());
                        final int w = adds.W(u, y, 0.1f);
                        adyh.o(new ColorStateList(s, new int[] { w, 0 }));
                        adyh.setTint(y);
                        final ColorStateList list = new ColorStateList(s, new int[] { w, y });
                        final adyh adyh2 = new adyh(k.k());
                        adyh2.setTint(-1);
                        i = new LayerDrawable(new Drawable[] { (Drawable)new RippleDrawable(list, (Drawable)adyh, (Drawable)adyh2), (Drawable)k });
                    }
                    else if (l == 1) {
                        final adyh j = this.K;
                        final int ab = this.ab;
                        i = new RippleDrawable(new ColorStateList(TextInputLayout.s, new int[] { adds.W(u, ab, 0.1f), ab }), (Drawable)j, (Drawable)j);
                    }
                    else {
                        i = null;
                    }
                }
                else {
                    i = this.K;
                }
                anb.Q((View)c2, (Drawable)i);
                this.N = true;
            }
        }
    }
    
    public final void G(final boolean b) {
        this.ae(b, false);
    }
    
    public final void H(final Editable editable) {
        if (b(editable) == 0 && !this.n) {
            if (this.B != null && this.j && !TextUtils.isEmpty(this.i)) {
                this.B.setText(this.i);
                cir.b((ViewGroup)this.t, (cin)this.E);
                this.B.setVisibility(0);
                this.B.bringToFront();
                this.announceForAccessibility(this.i);
            }
            return;
        }
        this.V();
    }
    
    public final void I() {
        if (this.K != null) {
            if (this.l != 0) {
                final boolean focused = this.isFocused();
                final int n = 0;
                boolean b = false;
                Label_0057: {
                    if (!focused) {
                        final EditText c = this.c;
                        if (c == null || !c.hasFocus()) {
                            b = false;
                            break Label_0057;
                        }
                    }
                    b = true;
                }
                boolean b2 = false;
                Label_0095: {
                    if (!this.isHovered()) {
                        final EditText c2 = this.c;
                        if (c2 == null || !c2.isHovered()) {
                            b2 = false;
                            break Label_0095;
                        }
                    }
                    b2 = true;
                }
                int n2 = 0;
                Label_0122: {
                    if (!this.K()) {
                        n2 = n;
                        if (this.h == null) {
                            break Label_0122;
                        }
                        n2 = n;
                        if (!this.g) {
                            break Label_0122;
                        }
                    }
                    n2 = 1;
                }
                Label_0257: {
                    if (!this.isEnabled()) {
                        this.aa = this.au;
                    }
                    else if (this.K()) {
                        if (this.ap != null) {
                            this.ag(b, b2);
                        }
                        else {
                            this.aa = this.a();
                        }
                    }
                    else {
                        int aa = 0;
                        Label_0228: {
                            if (this.g) {
                                final TextView h = this.h;
                                if (h != null) {
                                    if (this.ap != null) {
                                        this.ag(b, b2);
                                        break Label_0257;
                                    }
                                    aa = h.getCurrentTextColor();
                                    break Label_0228;
                                }
                            }
                            if (b) {
                                aa = this.ao;
                            }
                            else if (b2) {
                                aa = this.an;
                            }
                            else {
                                aa = this.am;
                            }
                        }
                        this.aa = aa;
                    }
                }
                if (Build$VERSION.SDK_INT >= 29) {
                    final Context context = this.getContext();
                    final TypedValue e = adds.E(context, 2130969043);
                    ColorStateList list = null;
                    if (e != null) {
                        if (e.resourceId != 0) {
                            list = td.d(context, e.resourceId);
                        }
                        else if (e.data != 0) {
                            list = ColorStateList.valueOf(e.data);
                        }
                    }
                    final EditText c3 = this.c;
                    if (c3 != null && c3.getTextCursorDrawable() != null) {
                        if (list != null) {
                            final Drawable textCursorDrawable = this.c.getTextCursorDrawable();
                            if (n2 != 0 && (list = this.ap) == null) {
                                list = ColorStateList.valueOf(this.aa);
                            }
                            aiq.g(textCursorDrawable, list);
                        }
                    }
                }
                final aeam b3 = this.b;
                b3.p();
                adyf.m(b3.a, b3.b, b3.c);
                b3.e();
                if (b3.b().u()) {
                    if (b3.a.K() && b3.a() != null) {
                        final Drawable mutate = b3.a().mutate();
                        aiq.f(mutate, b3.a.a());
                        b3.d.setImageDrawable(mutate);
                    }
                    else {
                        adyf.l(b3.a, b3.d, b3.f, b3.g);
                    }
                }
                this.a.b();
                if (this.l == 2) {
                    final int u = this.U;
                    int n3;
                    if (b && this.isEnabled()) {
                        n3 = this.W;
                        this.U = n3;
                    }
                    else {
                        n3 = this.V;
                        this.U = n3;
                    }
                    if (n3 != u && this.ai() && !this.n) {
                        this.U();
                        this.X();
                    }
                }
                if (this.l == 1) {
                    if (!this.isEnabled()) {
                        this.ab = this.ar;
                    }
                    else {
                        int ab;
                        if (b2 && !b) {
                            ab = this.at;
                        }
                        else if (b) {
                            ab = this.as;
                        }
                        else {
                            ab = this.aq;
                        }
                        this.ab = ab;
                    }
                }
                this.T();
            }
        }
    }
    
    public final boolean J() {
        return this.d.m;
    }
    
    public final boolean K() {
        final aeaq d = this.d;
        return d.e == 1 && d.h != null && !TextUtils.isEmpty(d.f);
    }
    
    public final boolean L() {
        if (this.c != null) {
            final Drawable drawable = this.a.c.getDrawable();
            final View view = null;
            final boolean b = true;
            final boolean b2 = true;
            boolean b3 = false;
            Label_0220: {
                Label_0218: {
                    if ((drawable != null || (this.f() != null && this.c().getVisibility() == 0)) && this.a.getMeasuredWidth() > 0) {
                        final int ag = this.a.getMeasuredWidth() - this.c.getPaddingLeft();
                        if (this.af == null || this.ag != ag) {
                            (this.af = (Drawable)new ColorDrawable()).setBounds(0, 0, this.ag = ag, 1);
                        }
                        final Drawable[] h = apt.h((TextView)this.c);
                        final Drawable drawable2 = h[0];
                        final Drawable af = this.af;
                        if (drawable2 == af) {
                            break Label_0218;
                        }
                        apt.d((TextView)this.c, af, h[1], h[2], h[3]);
                    }
                    else {
                        if (this.af == null) {
                            break Label_0218;
                        }
                        final Drawable[] h2 = apt.h((TextView)this.c);
                        apt.d((TextView)this.c, (Drawable)null, h2[1], h2[2], h2[3]);
                        this.af = null;
                    }
                    b3 = true;
                    break Label_0220;
                }
                b3 = false;
            }
            if ((this.b.t() || (this.b.r() && this.b.s()) || this.b.h != null) && this.b.getMeasuredWidth() > 0) {
                final int n = this.b.i.getMeasuredWidth() - this.c.getPaddingRight();
                final aeam b4 = this.b;
                Object o;
                if (b4.t()) {
                    o = b4.b;
                }
                else {
                    o = view;
                    if (b4.r()) {
                        o = view;
                        if (b4.s()) {
                            o = b4.d;
                        }
                    }
                }
                int n2 = n;
                if (o != null) {
                    n2 = n + ((View)o).getMeasuredWidth() + all.c((ViewGroup$MarginLayoutParams)((View)o).getLayoutParams());
                }
                final Drawable[] h3 = apt.h((TextView)this.c);
                final Drawable ah = this.ah;
                if (ah != null && this.ai != n2) {
                    ah.setBounds(0, 0, this.ai = n2, 1);
                    apt.d((TextView)this.c, h3[0], h3[1], this.ah, h3[3]);
                    b3 = b;
                }
                else {
                    if (ah == null) {
                        (this.ah = (Drawable)new ColorDrawable()).setBounds(0, 0, this.ai = n2, 1);
                    }
                    final Drawable aj = h3[2];
                    final Drawable ah2 = this.ah;
                    if (aj != ah2) {
                        this.aj = aj;
                        apt.d((TextView)this.c, h3[0], h3[1], ah2, h3[3]);
                        b3 = b;
                    }
                }
            }
            else if (this.ah != null) {
                final Drawable[] h4 = apt.h((TextView)this.c);
                if (h4[2] == this.ah) {
                    apt.d((TextView)this.c, h4[0], h4[1], this.aj, h4[3]);
                    b3 = b2;
                }
                this.ah = null;
            }
            return b3;
        }
        return false;
    }
    
    public final void M() {
        this.b.l(-1);
    }
    
    public final int a() {
        final TextView h = this.d.h;
        if (h != null) {
            return h.getCurrentTextColor();
        }
        return -1;
    }
    
    public final void addView(final View view, int n, final ViewGroup$LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, n, layoutParams);
            return;
        }
        final FrameLayout$LayoutParams frameLayout$LayoutParams = new FrameLayout$LayoutParams(layoutParams);
        frameLayout$LayoutParams.gravity = ((frameLayout$LayoutParams.gravity & 0xFFFFFF8F) | 0x10);
        this.t.addView(view, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
        this.t.setLayoutParams(layoutParams);
        this.ad();
        final EditText c = (EditText)view;
        if (this.c == null) {
            n = this.b.e;
            this.c = c;
            n = this.v;
            if (n != -1) {
                this.y(n);
            }
            else {
                this.z(this.x);
            }
            n = this.w;
            if (n != -1) {
                this.w(n);
            }
            else {
                this.x(this.y);
            }
            this.N = false;
            this.W();
            final aeax aeax = new aeax(this);
            final EditText c2 = this.c;
            if (c2 != null) {
                anb.N((View)c2, (akw)aeax);
            }
            final advm o = this.o;
            final Typeface typeface = this.c.getTypeface();
            final boolean w = o.w(typeface);
            final boolean x = o.x(typeface);
            if (w || x) {
                o.g();
            }
            this.o.q(this.c.getTextSize());
            final advm o2 = this.o;
            final float letterSpacing = this.c.getLetterSpacing();
            if (o2.o != letterSpacing) {
                o2.o = letterSpacing;
                o2.g();
            }
            n = this.c.getGravity();
            this.o.m((n & 0xFFFFFF8F) | 0x30);
            this.o.p(n);
            this.c.addTextChangedListener((TextWatcher)new aeaw(this));
            if (this.ak == null) {
                this.ak = this.c.getHintTextColors();
            }
            if (this.I) {
                if (TextUtils.isEmpty(this.J)) {
                    this.t(this.u = this.c.getHint());
                    this.c.setHint((CharSequence)null);
                }
                this.k = true;
            }
            if (this.h != null) {
                this.D(this.c.getText());
            }
            this.E();
            this.d.b();
            this.a.bringToFront();
            this.b.bringToFront();
            final Iterator iterator = this.m.iterator();
            while (iterator.hasNext()) {
                ((afhd)iterator.next()).b(this);
            }
            this.b.q();
            if (!this.isEnabled()) {
                c.setEnabled(false);
            }
            this.ae(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }
    
    public final TextView c() {
        return this.a.a;
    }
    
    public final CharSequence d() {
        final aeaq d = this.d;
        if (d.g) {
            return d.f;
        }
        return null;
    }
    
    public final void dispatchProvideAutofillStructure(final ViewStructure viewStructure, final int n) {
        final EditText c = this.c;
        if (c == null) {
            super.dispatchProvideAutofillStructure(viewStructure, n);
            return;
        }
        final CharSequence u = this.u;
        int i = 0;
        if (u != null) {
            final boolean k = this.k;
            this.k = false;
            final CharSequence hint = c.getHint();
            this.c.setHint(this.u);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, n);
                return;
            }
            finally {
                this.c.setHint(hint);
                this.k = k;
            }
        }
        viewStructure.setAutofillId(this.getAutofillId());
        this.onProvideAutofillStructure(viewStructure, n);
        this.onProvideAutofillVirtualStructure(viewStructure, n);
        viewStructure.setChildCount(this.t.getChildCount());
        while (i < this.t.getChildCount()) {
            final View child = this.t.getChildAt(i);
            final ViewStructure child2 = viewStructure.newChild(i);
            child.dispatchProvideAutofillStructure(child2, n);
            if (child == this.c) {
                child2.setHint(this.e());
            }
            ++i;
        }
    }
    
    protected final void dispatchRestoreInstanceState(final SparseArray sparseArray) {
        this.q = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.q = false;
    }
    
    public final void draw(final Canvas canvas) {
        super.draw(canvas);
        if (this.I) {
            this.o.d(canvas);
        }
        if (this.P != null) {
            final adyh o = this.O;
            if (o != null) {
                o.draw(canvas);
                if (this.c.isFocused()) {
                    final Rect bounds = this.P.getBounds();
                    final Rect bounds2 = this.O.getBounds();
                    final float a = this.o.a;
                    final int centerX = bounds2.centerX();
                    bounds.left = adsf.c(centerX, bounds2.left, a);
                    bounds.right = adsf.c(centerX, bounds2.right, a);
                    this.P.draw(canvas);
                }
            }
        }
    }
    
    protected final void drawableStateChanged() {
        if (this.ax) {
            return;
        }
        boolean b = true;
        this.ax = true;
        super.drawableStateChanged();
        final int[] drawableState = this.getDrawableState();
        final advm o = this.o;
        final boolean b2 = o != null && o.y(drawableState);
        if (this.c != null) {
            if (!anb.ao((View)this) || !this.isEnabled()) {
                b = false;
            }
            this.G(b);
        }
        this.E();
        this.I();
        if (b2) {
            this.invalidate();
        }
        this.ax = false;
    }
    
    public final CharSequence e() {
        if (this.I) {
            return this.J;
        }
        return null;
    }
    
    public final CharSequence f() {
        return this.a.b;
    }
    
    final void g(final float n) {
        if (this.o.a == n) {
            return;
        }
        if (this.aw == null) {
            (this.aw = new ValueAnimator()).setInterpolator(adds.I(this.getContext(), 2130969956, adsf.b));
            this.aw.setDuration((long)adds.D(this.getContext(), 2130969946, 167));
            this.aw.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new adti(this, 7));
        }
        this.aw.setFloatValues(new float[] { this.o.a, n });
        this.aw.start();
    }
    
    public int getBaseline() {
        final EditText c = this.c;
        if (c != null) {
            return c.getBaseline() + this.getPaddingTop() + this.N();
        }
        return super.getBaseline();
    }
    
    public final void h(final int ao) {
        if (this.ao != ao) {
            this.ao = ao;
            this.I();
        }
    }
    
    public final void i(final boolean e) {
        if (this.e != e) {
            if (e) {
                (this.h = (TextView)new AppCompatTextView(this.getContext())).setId(2131431989);
                this.h.setMaxLines(1);
                this.d.a(this.h, 2);
                all.g((ViewGroup$MarginLayoutParams)this.h.getLayoutParams(), this.getResources().getDimensionPixelOffset(2131168209));
                this.ac();
                this.ab();
            }
            else {
                this.d.e(this.h, 2);
                this.h = null;
            }
            this.e = e;
        }
    }
    
    public final void j(int f) {
        if (this.f != f) {
            if (f <= 0) {
                f = -1;
            }
            this.f = f;
            if (this.e) {
                this.ab();
            }
        }
    }
    
    public final void k(final int n) {
        this.b.j(n);
    }
    
    public final void l(final Drawable drawable) {
        this.b.k(drawable);
    }
    
    public final void m(final ColorStateList f) {
        final aeam b = this.b;
        if (b.f != f) {
            b.f = f;
            adyf.l(b.a, b.d, b.f, b.g);
        }
    }
    
    public final void n(final boolean b) {
        this.b.m(b);
    }
    
    public final void o(final CharSequence charSequence) {
        if (!this.d.g) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            this.p(true);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            final aeaq d = this.d;
            d.c();
            d.f = charSequence;
            d.h.setText(charSequence);
            final int d2 = d.d;
            if (d2 != 1) {
                d.e = 1;
            }
            d.k(d2, d.e, d.l(d.h, charSequence));
            return;
        }
        this.d.d();
    }
    
    protected final void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.o.f(configuration);
    }
    
    protected final void onLayout(final boolean b, int n, int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        final EditText c = this.c;
        if (c != null) {
            final Rect ac = this.ac;
            advn.a((ViewGroup)this, (View)c, ac);
            if (this.O != null) {
                n = ac.bottom;
                n2 = this.V;
                this.O.setBounds(ac.left, n - n2, ac.right, ac.bottom);
            }
            if (this.P != null) {
                n2 = ac.bottom;
                n = this.W;
                this.P.setBounds(ac.left, n2 - n, ac.right, ac.bottom);
            }
            if (this.I) {
                this.o.q(this.c.getTextSize());
                n = this.c.getGravity();
                this.o.m((n & 0xFFFFFF8F) | 0x30);
                this.o.p(n);
                final advm o = this.o;
                if (this.c == null) {
                    throw new IllegalStateException();
                }
                final Rect ad = this.ad;
                final boolean l = adds.L((View)this);
                ad.bottom = ac.bottom;
                n = this.l;
                if (n != 1) {
                    if (n != 2) {
                        ad.left = this.O(ac.left, l);
                        ad.top = this.getPaddingTop();
                        ad.right = this.P(ac.right, l);
                    }
                    else {
                        ad.left = ac.left + this.c.getPaddingLeft();
                        ad.top = ac.top - this.N();
                        ad.right = ac.right - this.c.getPaddingRight();
                    }
                }
                else {
                    ad.left = this.O(ac.left, l);
                    ad.top = ac.top + this.T;
                    ad.right = this.P(ac.right, l);
                }
                o.j(ad.left, ad.top, ad.right, ad.bottom);
                final advm o2 = this.o;
                if (this.c == null) {
                    throw new IllegalStateException();
                }
                final Rect ad2 = this.ad;
                o2.e(o2.n);
                final float n5 = -o2.n.ascent();
                ad2.left = ac.left + this.c.getCompoundPaddingLeft();
                if (this.aj()) {
                    n = (int)(ac.centerY() - n5 / 2.0f);
                }
                else {
                    n = ac.top + this.c.getCompoundPaddingTop();
                }
                ad2.top = n;
                ad2.right = ac.right - this.c.getCompoundPaddingRight();
                if (this.aj()) {
                    n = (int)(ad2.top + n5);
                }
                else {
                    n = ac.bottom - this.c.getCompoundPaddingBottom();
                }
                ad2.bottom = n;
                o2.n(ad2.left, ad2.top, ad2.right, ad2.bottom);
                this.o.g();
                if (this.ai() && !this.n) {
                    this.X();
                }
            }
        }
    }
    
    protected final void onMeasure(int gravity, int max) {
        super.onMeasure(gravity, max);
        final EditText c = this.c;
        gravity = 0;
        if (c != null) {
            max = Math.max(this.b.getMeasuredHeight(), this.a.getMeasuredHeight());
            if (this.c.getMeasuredHeight() < max) {
                this.c.setMinimumHeight(max);
                gravity = 1;
            }
        }
        final boolean l = this.L();
        if (gravity != 0 || l) {
            this.c.post((Runnable)new adme(this, 20));
        }
        if (this.B != null) {
            final EditText c2 = this.c;
            if (c2 != null) {
                gravity = c2.getGravity();
                this.B.setGravity(gravity);
                this.B.setPadding(this.c.getCompoundPaddingLeft(), this.c.getCompoundPaddingTop(), this.c.getCompoundPaddingRight(), this.c.getCompoundPaddingBottom());
            }
        }
        this.b.q();
    }
    
    protected final void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof TextInputLayout$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final TextInputLayout$SavedState textInputLayout$SavedState = (TextInputLayout$SavedState)parcelable;
        super.onRestoreInstanceState(textInputLayout$SavedState.d);
        this.o(textInputLayout$SavedState.a);
        if (textInputLayout$SavedState.b) {
            this.post((Runnable)new adme(this, 19));
        }
        this.requestLayout();
    }
    
    public final void onRtlPropertiesChanged(final int n) {
        super.onRtlPropertiesChanged(n);
        boolean r = true;
        if (n != 1) {
            r = false;
        }
        if (r != this.R) {
            final float a = this.Q.b.a(this.ae);
            final float a2 = this.Q.c.a(this.ae);
            final float a3 = this.Q.e.a(this.ae);
            final float a4 = this.Q.d.a(this.ae);
            final adym q = this.Q;
            final adyf j = q.j;
            final adyf k = q.k;
            final adyf m = q.m;
            final adyf l = q.l;
            final adyl a5 = adym.a();
            a5.i(k);
            a5.j(j);
            a5.g(l);
            a5.h(m);
            a5.d(a2);
            a5.e(a);
            a5.b(a4);
            a5.c(a3);
            final adym a6 = a5.a();
            this.R = r;
            final adyh i = this.K;
            if (i != null && i.k() != a6) {
                this.Q = a6;
                this.T();
            }
        }
    }
    
    public final Parcelable onSaveInstanceState() {
        final TextInputLayout$SavedState textInputLayout$SavedState = new TextInputLayout$SavedState(super.onSaveInstanceState());
        if (this.K()) {
            textInputLayout$SavedState.a = this.d();
        }
        final aeam b = this.b;
        final boolean r = b.r();
        boolean b2 = false;
        if (r) {
            b2 = b2;
            if (b.d.a) {
                b2 = true;
            }
        }
        textInputLayout$SavedState.b = b2;
        return (Parcelable)textInputLayout$SavedState;
    }
    
    public final void p(final boolean g) {
        final aeaq d = this.d;
        if (d.g == g) {
            return;
        }
        d.c();
        if (g) {
            (d.h = (TextView)new AppCompatTextView(d.a)).setId(2131431990);
            d.h.setTextAlignment(5);
            d.g(d.j);
            d.h(d.k);
            d.f(d.i);
            d.h.setVisibility(4);
            anb.aw((View)d.h);
            d.a(d.h, 0);
        }
        else {
            d.d();
            d.e(d.h, 0);
            d.h = null;
            d.b.E();
            d.b.I();
        }
        d.g = g;
    }
    
    public final void q(final ColorStateList list) {
        this.d.h(list);
    }
    
    public final void r(final CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (this.J()) {
                this.s(false);
            }
            return;
        }
        if (!this.J()) {
            this.s(true);
        }
        final aeaq d = this.d;
        d.c();
        d.l = charSequence;
        d.n.setText(charSequence);
        final int d2 = d.d;
        if (d2 != 2) {
            d.e = 2;
        }
        d.k(d2, d.e, d.l(d.n, charSequence));
    }
    
    public final void s(final boolean m) {
        final aeaq d = this.d;
        if (d.m == m) {
            return;
        }
        d.c();
        if (m) {
            (d.n = (TextView)new AppCompatTextView(d.a)).setId(2131431991);
            d.n.setTextAlignment(5);
            d.n.setVisibility(4);
            anb.aw((View)d.n);
            d.i(d.o);
            d.j(d.p);
            d.a(d.n, 1);
            d.n.setAccessibilityDelegate((View$AccessibilityDelegate)new aeap(d));
        }
        else {
            d.c();
            final int d2 = d.d;
            if (d2 == 2) {
                d.e = 0;
            }
            d.k(d2, d.e, d.l(d.n, (CharSequence)""));
            d.e(d.n, 1);
            d.n = null;
            d.b.E();
            d.b.I();
        }
        d.m = m;
    }
    
    public final void setEnabled(final boolean enabled) {
        Y((ViewGroup)this, enabled);
        super.setEnabled(enabled);
    }
    
    public final void t(final CharSequence charSequence) {
        if (this.I) {
            this.Z(charSequence);
            this.sendAccessibilityEvent(2048);
        }
    }
    
    public final void u(final boolean i) {
        if (i != this.I) {
            if (!(this.I = i)) {
                this.k = false;
                if (!TextUtils.isEmpty(this.J) && TextUtils.isEmpty(this.c.getHint())) {
                    this.c.setHint(this.J);
                }
                this.Z(null);
            }
            else {
                final CharSequence hint = this.c.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.J)) {
                        this.t(hint);
                    }
                    this.c.setHint((CharSequence)null);
                }
                this.k = true;
            }
            if (this.c != null) {
                this.ad();
            }
        }
    }
    
    public final void v(final ColorStateList al) {
        if (this.al != al) {
            if (this.ak == null) {
                this.o.l(al);
            }
            this.al = al;
            if (this.c != null) {
                this.G(false);
            }
        }
    }
    
    public final void w(final int n) {
        this.w = n;
        final EditText c = this.c;
        if (c != null && n != -1) {
            c.setMaxEms(n);
        }
    }
    
    public final void x(final int n) {
        this.y = n;
        final EditText c = this.c;
        if (c != null && n != -1) {
            c.setMaxWidth(n);
        }
    }
    
    public final void y(final int n) {
        this.v = n;
        final EditText c = this.c;
        if (c != null && n != -1) {
            c.setMinEms(n);
        }
    }
    
    public final void z(final int n) {
        this.x = n;
        final EditText c = this.c;
        if (c != null && n != -1) {
            c.setMinWidth(n);
        }
    }
}
