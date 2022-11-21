// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.edit.filters.ui;

import java.util.List;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.Iterator;
import com.google.android.libraries.youtube.edit.filters.model.FilterMapTable$FilterDescriptor;
import java.util.concurrent.Executor;
import android.animation.Animator$AnimatorListener;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.View;
import android.content.res.TypedArray;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.content.Context;
import android.animation.ValueAnimator;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;

public class ChooseFilterView extends LinearLayout
{
    public final usf a;
    public final LinearLayout b;
    public final HorizontalScrollView c;
    public final urs d;
    public uqf e;
    public boolean f;
    public boolean g;
    public boolean h;
    public ValueAnimator i;
    public aup j;
    
    public ChooseFilterView(final Context context, final AttributeSet set) {
        super(context, set);
        this.f = false;
        LayoutInflater.from(context).inflate(2131624176, (ViewGroup)this, true);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, umi.a, 0, 0);
        final int int1 = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        int n;
        if (int1 != 1) {
            if (int1 != 2) {
                if (int1 != 3) {
                    n = 2131624177;
                }
                else {
                    n = 2131624180;
                }
            }
            else {
                n = 2131624179;
            }
        }
        else {
            n = 2131624178;
        }
        this.d = new urs(this);
        this.a = new usf(this.getContext(), n);
        this.b = (LinearLayout)this.findViewById(2131427638);
        this.c = (HorizontalScrollView)this.findViewById(2131427639);
        this.setImportantForAccessibility(1);
        this.setAlpha(0.0f);
    }
    
    private final void q(final String s) {
        if (!tua.e(this.getContext())) {
            return;
        }
        tua.c(this.getContext(), (View)this, (CharSequence)s);
    }
    
    private final void r(final boolean f, final boolean b) {
        this.f = f;
        this.post((Runnable)new urv(this, f, b));
    }
    
    public final int a() {
        return this.a.m;
    }
    
    public final ValueAnimator b(final int n, final int n2) {
        final ValueAnimator ofInt = ValueAnimator.ofInt(new int[] { n, n2 });
        ofInt.setDuration(250L);
        ofInt.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new qi(this, 20));
        if (n2 == 1) {
            ofInt.addListener((Animator$AnimatorListener)new urw(this));
            this.q(this.getContext().getString(2132017268));
        }
        else {
            ofInt.addListener((Animator$AnimatorListener)new urx(this));
            this.q(this.getContext().getString(2132017270));
        }
        return ofInt;
    }
    
    public final usf c() {
        if (this.a.r()) {
            return this.a;
        }
        return null;
    }
    
    public final void d() {
        this.h = true;
    }
    
    public final void e(final uqx uqx, final aup aup, final Executor executor) {
        ((uqz)uqx).a.b((uqh)new urt(this, uqx, executor, aup));
    }
    
    public final void f(final View view, final aup j) {
        this.j = j;
        if (view != null) {
            this.a.l(view);
        }
        final urs d = this.d;
        d.getClass();
        d.a();
        if (this.f) {
            this.r(true, false);
        }
    }
    
    public final void g(final String s) {
        this.a.n(s);
    }
    
    public final void h(final View view) {
        this.a.l(view);
    }
    
    public final void i(final ury d) {
        this.a.d = d;
    }
    
    public final void j(final use n) {
        this.a.n = n;
    }
    
    public final void k() {
        this.l(true);
    }
    
    public final void l(final boolean b) {
        this.r(this.f ^ true, b);
    }
    
    public final void m(final hic d) {
        final urs d2 = this.d;
        d2.getClass();
        d2.d = d;
        d2.a();
    }
    
    public final void n(final urz c) {
        final urs d = this.d;
        d.getClass();
        d.c = c;
        if (d.a.c() != null && d.a.f) {
            d.b();
        }
    }
    
    public final void o(final xab xab, final zkn o) {
        final usf a = this.a;
        a.o = o;
        final Iterator iterator = a.e.iterator();
        while (iterator.hasNext()) {
            final vxu ac = vxu.ac(xab, ((FilterMapTable$FilterDescriptor)iterator.next()).a);
            final Object b = ac.b;
            if (b != null) {
                xab.D(xny.P((apry)b));
                xab.w(xny.P((apry)ac.b), (alji)ac.a);
            }
        }
    }
    
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final uqf e = this.e;
        if (e != null) {
            e.a();
            this.e = null;
        }
        final usf a = this.a;
        final Iterator iterator = a.f.iterator();
        while (iterator.hasNext()) {
            ((uqf)iterator.next()).a();
        }
        a.f.clear();
    }
    
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Object o = parcelable;
        if (parcelable instanceof Bundle) {
            final Bundle bundle = (Bundle)parcelable;
            final usf a = this.a;
            if (!a.k) {
                a.n(afbj.e(bundle.getString("SELECTED_FILTER")));
            }
            this.r(bundle.getBoolean("CHOOSE_FILTER_VIEW_VISIBLE"), false);
            parcelable = bundle.getParcelable("SUPER_STATE");
            if ((o = parcelable) == null) {
                o = new Bundle();
            }
        }
        super.onRestoreInstanceState((Parcelable)o);
    }
    
    public final Parcelable onSaveInstanceState() {
        final Bundle bundle = new Bundle();
        bundle.putParcelable("SUPER_STATE", super.onSaveInstanceState());
        bundle.putString("SELECTED_FILTER", this.a.c);
        bundle.putBoolean("CHOOSE_FILTER_VIEW_VISIBLE", this.f);
        return (Parcelable)bundle;
    }
    
    public final void p(final List list, final View view, final boolean b, final boolean b2, final aefs aefs, final aup aup) {
        adme.K(list.isEmpty() ^ true);
        final usf a = this.a;
        final LinearLayout b3 = this.b;
        final HorizontalScrollView c = this.c;
        a.i = aefs.ca(list);
        a.g(list, (ViewGroup)b3, c, b, b2);
        this.f(view, aup);
    }
}
