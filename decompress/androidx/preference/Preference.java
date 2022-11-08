// 
// Decompiled by Procyon v0.6.0
// 

package androidx.preference;

import java.util.Set;
import android.view.View$OnCreateContextMenuListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Parcelable;
import android.content.SharedPreferences$Editor;
import java.util.ArrayList;
import android.text.TextUtils;
import android.content.SharedPreferences;
import android.view.ViewGroup;
import android.view.View;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Intent;
import android.content.Context;
import android.os.Bundle;
import android.graphics.drawable.Drawable;
import android.view.View$OnClickListener;
import java.util.List;

public class Preference implements Comparable
{
    public boolean A;
    public int B;
    public int C;
    public cek D;
    public PreferenceGroup E;
    public ceo F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private List K;
    private boolean L;
    private cen M;
    private final View$OnClickListener N;
    private CharSequence a;
    private Drawable b;
    private Bundle c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    public final Context j;
    public cff k;
    public long l;
    public boolean m;
    public cel n;
    public cem o;
    public int p;
    public CharSequence q;
    public int r;
    public String s;
    public Intent t;
    public String u;
    public boolean v;
    public boolean w;
    public String x;
    public Object y;
    public boolean z;
    
    public Preference(final Context context) {
        this(context, null);
    }
    
    public Preference(final Context context, final AttributeSet set) {
        this(context, set, vh.c(context, 2130970127, 16842894));
    }
    
    public Preference(final Context context, final AttributeSet set, final int n) {
        this(context, set, n, 0);
    }
    
    public Preference(final Context j, final AttributeSet set, final int n, final int n2) {
        this.p = Integer.MAX_VALUE;
        this.d = true;
        this.v = true;
        this.w = true;
        this.f = true;
        this.g = true;
        this.z = true;
        this.h = true;
        this.i = true;
        this.H = true;
        this.J = true;
        this.B = 2131625076;
        this.N = (View$OnClickListener)new jl(this, 8);
        this.j = j;
        final TypedArray obtainStyledAttributes = j.obtainStyledAttributes(set, cfj.g, n, n2);
        this.r = vh.e(obtainStyledAttributes, 23, 0, 0);
        this.s = vh.h(obtainStyledAttributes, 26, 6);
        this.q = vh.g(obtainStyledAttributes, 34, 4);
        this.a = vh.g(obtainStyledAttributes, 33, 7);
        this.p = vh.l(obtainStyledAttributes, 28, 8);
        this.u = vh.h(obtainStyledAttributes, 22, 13);
        this.B = vh.e(obtainStyledAttributes, 27, 3, 2131625076);
        this.C = vh.e(obtainStyledAttributes, 35, 9, 0);
        this.d = vh.i(obtainStyledAttributes, 21, 2, true);
        this.v = vh.i(obtainStyledAttributes, 30, 5, true);
        this.w = vh.i(obtainStyledAttributes, 29, 1, true);
        this.x = vh.h(obtainStyledAttributes, 19, 10);
        this.h = vh.i(obtainStyledAttributes, 16, 16, this.v);
        this.i = vh.i(obtainStyledAttributes, 17, 17, this.v);
        if (obtainStyledAttributes.hasValue(18)) {
            this.y = this.lj(obtainStyledAttributes, 18);
        }
        else if (obtainStyledAttributes.hasValue(11)) {
            this.y = this.lj(obtainStyledAttributes, 11);
        }
        this.J = vh.i(obtainStyledAttributes, 31, 12, true);
        final boolean hasValue = obtainStyledAttributes.hasValue(32);
        this.G = hasValue;
        if (hasValue) {
            this.H = vh.i(obtainStyledAttributes, 32, 14, true);
        }
        this.I = vh.i(obtainStyledAttributes, 24, 15, false);
        this.z = vh.i(obtainStyledAttributes, 25, 25, true);
        this.A = vh.i(obtainStyledAttributes, 20, 20, false);
        obtainStyledAttributes.recycle();
    }
    
    private final void k(final View view, final boolean enabled) {
        view.setEnabled(enabled);
        if (view instanceof ViewGroup) {
            final ViewGroup viewGroup = (ViewGroup)view;
            int childCount = viewGroup.getChildCount();
            while (--childCount >= 0) {
                this.k(viewGroup.getChildAt(childCount), enabled);
            }
        }
    }
    
    public final void A(cff k) {
        this.k = k;
        if (!this.m) {
            this.l = k.a();
        }
        if (this.V()) {
            k = this.k;
            SharedPreferences c;
            if (k != null) {
                c = k.c();
            }
            else {
                c = null;
            }
            if (c.contains(this.s)) {
                this.h(null);
                return;
            }
        }
        final Object y = this.y;
        if (y != null) {
            this.h(y);
        }
    }
    
    public void B() {
        this.Q();
    }
    
    protected void C() {
        this.Q();
    }
    
    public final void D() {
        if (this.U()) {
            if (this.v) {
                this.c();
                final cem o = this.o;
                if (o != null && o.b(this)) {
                    return;
                }
                final cff k = this.k;
                if (k != null) {
                    final cfe c = k.c;
                    if (c != null) {
                        if (c.aL(this)) {
                            return;
                        }
                    }
                }
                final Intent t = this.t;
                if (t != null) {
                    this.j.startActivity(t);
                }
            }
        }
    }
    
    public final void E() {
        if (TextUtils.isEmpty((CharSequence)this.x)) {
            return;
        }
        final Preference r = this.r(this.x);
        if (r != null) {
            if (r.K == null) {
                r.K = new ArrayList();
            }
            r.K.add(this);
            this.W(r.j());
            return;
        }
        final StringBuilder sb = new StringBuilder("Dependency \"");
        sb.append(this.x);
        sb.append("\" not found for preference \"");
        sb.append(this.s);
        sb.append("\" (title: \"");
        sb.append((Object)this.q);
        sb.append("\"");
        throw new IllegalStateException(sb.toString());
    }
    
    public void F(final Object y) {
        this.y = y;
    }
    
    public final void G(final boolean d) {
        if (this.d != d) {
            this.d = d;
            this.x(this.j());
            this.d();
        }
    }
    
    public final void H(final Drawable b) {
        if (this.b != b) {
            this.b = b;
            this.r = 0;
            this.d();
        }
    }
    
    public final void I(final String s) {
        this.s = s;
        if (!this.e || this.T()) {
            return;
        }
        if (!TextUtils.isEmpty((CharSequence)this.s)) {
            this.e = true;
            return;
        }
        throw new IllegalStateException("Preference does not have a key assigned.");
    }
    
    public final void J(final int p) {
        if (p != this.p) {
            this.p = p;
            this.y();
        }
    }
    
    public final void K(final int n) {
        this.n(this.j.getString(n));
    }
    
    public final void L(final ceo f) {
        this.F = f;
        this.d();
    }
    
    public final void M(final int n) {
        this.N(this.j.getString(n));
    }
    
    public final void N(final CharSequence q) {
        if (!TextUtils.equals(q, this.q)) {
            this.q = q;
            this.d();
        }
    }
    
    public final void O(final boolean z) {
        if (this.z != z) {
            this.z = z;
            final cek d = this.D;
            if (d != null) {
                ((cfa)d).b();
            }
        }
    }
    
    public final void P(final SharedPreferences$Editor sharedPreferences$Editor) {
        if (!this.k.a) {
            sharedPreferences$Editor.apply();
        }
    }
    
    public final void Q() {
        final String x = this.x;
        if (x != null) {
            final Preference r = this.r(x);
            if (r != null) {
                final List k = r.K;
                if (k != null) {
                    k.remove(this);
                }
            }
        }
    }
    
    public boolean R(final Object o) {
        final cel n = this.n;
        return n == null || n.a(this, o);
    }
    
    protected boolean S(final boolean b) {
        if (!this.V()) {
            return b;
        }
        return this.k.c().getBoolean(this.s, b);
    }
    
    public final boolean T() {
        return !TextUtils.isEmpty((CharSequence)this.s);
    }
    
    public boolean U() {
        return this.d && this.f && this.g;
    }
    
    protected final boolean V() {
        return this.k != null && this.w && this.T();
    }
    
    public final void W(final boolean b) {
        if (this.f == b) {
            this.f = (b ^ true);
            this.x(this.j());
            this.d();
        }
    }
    
    public final void X(final boolean b) {
        if (this.g == b) {
            this.g = (b ^ true);
            this.x(this.j());
            this.d();
        }
    }
    
    protected void Y(final boolean b) {
        if (!this.V()) {
            return;
        }
        if (b == this.S(b ^ true)) {
            return;
        }
        final SharedPreferences$Editor b2 = this.k.b();
        b2.putBoolean(this.s, b);
        this.P(b2);
    }
    
    protected void Z(final String s) {
        if (!this.V()) {
            return;
        }
        if (TextUtils.equals((CharSequence)s, (CharSequence)this.s(null))) {
            return;
        }
        final SharedPreferences$Editor b = this.k.b();
        b.putString(this.s, s);
        this.P(b);
    }
    
    public final void aa() {
        if (this.I) {
            this.I = false;
            this.d();
        }
    }
    
    protected void ab(final int n) {
        if (!this.V()) {
            return;
        }
        if (n == this.p(~n)) {
            return;
        }
        final SharedPreferences$Editor b = this.k.b();
        b.putInt(this.s, n);
        this.P(b);
    }
    
    protected void c() {
    }
    
    public void d() {
        final cek d = this.D;
        if (d != null) {
            final int index = ((cfa)d).a.indexOf(this);
            if (index != -1) {
                ((nq)d).b.d(index, 1, (Object)this);
            }
        }
    }
    
    protected void g(final Parcelable parcelable) {
        this.L = true;
        if (parcelable != Preference$BaseSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }
    
    protected void h(final Object o) {
    }
    
    public boolean j() {
        return !this.U();
    }
    
    protected Parcelable li() {
        this.L = true;
        return (Parcelable)Preference$BaseSavedState.EMPTY_STATE;
    }
    
    protected Object lj(final TypedArray typedArray, final int n) {
        return null;
    }
    
    public long lk() {
        return this.l;
    }
    
    public CharSequence m() {
        final ceo f = this.F;
        if (f != null) {
            return f.a(this);
        }
        return this.a;
    }
    
    public void n(final CharSequence a) {
        if (this.F == null) {
            if (!TextUtils.equals(this.a, a)) {
                this.a = a;
                this.d();
            }
            return;
        }
        throw new IllegalStateException("Preference already has a SummaryProvider set.");
    }
    
    protected int p(final int n) {
        if (!this.V()) {
            return n;
        }
        return this.k.c().getInt(this.s, n);
    }
    
    public final Bundle q() {
        if (this.c == null) {
            this.c = new Bundle();
        }
        return this.c;
    }
    
    protected final Preference r(final String s) {
        final cff k = this.k;
        if (k == null) {
            return null;
        }
        return k.d((CharSequence)s);
    }
    
    public void rH(final cfi cfi) {
        final View a = cfi.a;
        a.setOnClickListener(this.N);
        a.setId(0);
        final TextView textView = (TextView)cfi.E(16908304);
        final int n = 8;
        Integer value = null;
        Label_0081: {
            if (textView != null) {
                final CharSequence m = this.m();
                if (!TextUtils.isEmpty(m)) {
                    textView.setText(m);
                    textView.setVisibility(0);
                    value = textView.getCurrentTextColor();
                    break Label_0081;
                }
                textView.setVisibility(8);
            }
            value = null;
        }
        final TextView textView2 = (TextView)cfi.E(16908310);
        if (textView2 != null) {
            final CharSequence q = this.q;
            if (!TextUtils.isEmpty(q)) {
                textView2.setText(q);
                textView2.setVisibility(0);
                if (this.G) {
                    textView2.setSingleLine(this.H);
                }
                if (!this.v && this.U() && value != null) {
                    textView2.setTextColor((int)value);
                }
            }
            else {
                textView2.setVisibility(8);
            }
        }
        final ImageView imageView = (ImageView)cfi.E(16908294);
        if (imageView != null) {
            Label_0255: {
                int r;
                if ((r = this.r) == 0) {
                    if (this.b == null) {
                        break Label_0255;
                    }
                    r = 0;
                }
                if (this.b == null) {
                    this.b = fc.b(this.j, r);
                }
                final Drawable b = this.b;
                if (b != null) {
                    imageView.setImageDrawable(b);
                }
            }
            if (this.b != null) {
                imageView.setVisibility(0);
            }
            else {
                int visibility;
                if (!this.I) {
                    visibility = 8;
                }
                else {
                    visibility = 4;
                }
                imageView.setVisibility(visibility);
            }
        }
        View view;
        if ((view = cfi.E(2131429276)) == null) {
            view = cfi.E(16908350);
        }
        if (view != null) {
            if (this.b != null) {
                view.setVisibility(0);
            }
            else {
                int visibility2;
                if (!this.I) {
                    visibility2 = n;
                }
                else {
                    visibility2 = 4;
                }
                view.setVisibility(visibility2);
            }
        }
        if (this.J) {
            this.k(a, this.U());
        }
        else {
            this.k(a, true);
        }
        final boolean v = this.v;
        a.setFocusable(v);
        a.setClickable(v);
        cfi.v = this.h;
        cfi.w = this.i;
        final boolean a2 = this.A;
        if (a2 && this.M == null) {
            this.M = new cen(this);
        }
        Object i;
        if (a2) {
            i = this.M;
        }
        else {
            i = null;
        }
        a.setOnCreateContextMenuListener((View$OnCreateContextMenuListener)i);
        a.setLongClickable(a2);
        if (a2 && !v) {
            ana.Q(a, (Drawable)null);
        }
    }
    
    public void rI(final View view) {
        this.D();
    }
    
    protected String s(final String s) {
        if (!this.V()) {
            return s;
        }
        return this.k.c().getString(this.s, s);
    }
    
    public final Set t(final Set set) {
        if (!this.V()) {
            return set;
        }
        return this.k.c().getStringSet(this.s, set);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        final CharSequence q = this.q;
        if (!TextUtils.isEmpty(q)) {
            sb.append(q);
            sb.append(' ');
        }
        final CharSequence m = this.m();
        if (!TextUtils.isEmpty(m)) {
            sb.append(m);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }
    
    final void u(final PreferenceGroup e) {
        if (e != null && this.E != null) {
            throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
        }
        this.E = e;
    }
    
    public void v(final Bundle bundle) {
        if (this.T()) {
            final Parcelable parcelable = bundle.getParcelable(this.s);
            if (parcelable != null) {
                this.L = false;
                this.g(parcelable);
                if (!this.L) {
                    throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
                }
            }
        }
    }
    
    public void w(final Bundle bundle) {
        if (this.T()) {
            this.L = false;
            final Parcelable li = this.li();
            if (!this.L) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
            if (li != null) {
                bundle.putParcelable(this.s, li);
            }
        }
    }
    
    public void x(final boolean b) {
        final List k = this.K;
        if (k == null) {
            return;
        }
        for (int size = k.size(), i = 0; i < size; ++i) {
            ((Preference)k.get(i)).W(b);
        }
    }
    
    protected final void y() {
        final cek d = this.D;
        if (d != null) {
            d.b();
        }
    }
    
    public void z() {
        this.E();
    }
}
