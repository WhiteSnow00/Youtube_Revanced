// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.navigation;

import android.view.Gravity;
import android.os.Bundle;
import java.util.Iterator;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import android.os.Parcelable;
import android.view.View$MeasureSpec;
import android.graphics.Canvas;
import android.graphics.drawable.InsetDrawable;
import android.util.TypedValue;
import android.view.Menu;
import android.widget.LinearLayout;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.google.android.material.internal.NavigationMenuView;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.Path;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.MenuInflater;

public class NavigationView extends adub
{
    private static final int[] i;
    private static final int[] j;
    public final adtx e;
    public final int[] f;
    public boolean g;
    public boolean h;
    private final adtn k;
    private final int l;
    private MenuInflater m;
    private ViewTreeObserver$OnGlobalLayoutListener n;
    private int o;
    private int p;
    private Path q;
    private final RectF r;
    
    static {
        i = new int[] { 16842912 };
        j = new int[] { -16842910 };
    }
    
    public NavigationView(final Context context) {
        this(context, null);
    }
    
    public NavigationView(final Context context, final AttributeSet set) {
        this(context, set, 2130970002);
    }
    
    public NavigationView(final Context context, final AttributeSet set, int n) {
        super(adyy.a(context, set, n, 2132084674), set, n);
        final adtx e = new adtx();
        this.e = e;
        this.f = new int[2];
        this.g = true;
        this.h = true;
        this.o = 0;
        this.p = 0;
        this.r = new RectF();
        final Context context2 = this.getContext();
        final adtn k = new adtn(context2);
        this.k = k;
        final cdn d = aduf.d(context2, set, adum.a, n, 2132084674, new int[0]);
        if (d.q(1)) {
            ana.Q((View)this, d.k(1));
        }
        this.p = d.e(7, 0);
        this.o = d.f(0, 0);
        if (this.getBackground() == null || this.getBackground() instanceof ColorDrawable) {
            final adwk a = adwk.c(context2, set, n, 2132084674).a();
            final Drawable background = this.getBackground();
            final adwf adwf = new adwf(a);
            if (background instanceof ColorDrawable) {
                adwf.o(ColorStateList.valueOf(((ColorDrawable)background).getColor()));
            }
            adwf.m(context2);
            ana.Q((View)this, (Drawable)adwf);
        }
        if (d.q(8)) {
            this.setElevation((float)d.e(8, 0));
        }
        this.setFitsSystemWindows(d.p(2, false));
        this.l = d.e(3, 0);
        ColorStateList j;
        if (d.q(30)) {
            j = d.j(30);
        }
        else {
            j = null;
        }
        if (d.q(33)) {
            n = d.i(33, 0);
        }
        else {
            n = 0;
        }
        ColorStateList h = j;
        int g = n;
        if (n == 0) {
            ColorStateList b;
            if ((b = j) == null) {
                b = this.b(16842808);
            }
            g = 0;
            h = b;
        }
        ColorStateList i;
        if (d.q(14)) {
            i = d.j(14);
        }
        else {
            i = this.b(16842808);
        }
        if (d.q(24)) {
            n = d.i(24, 0);
        }
        else {
            n = 0;
        }
        if (d.q(13)) {
            final int e2 = d.e(13, 0);
            if (e.q != e2) {
                e.q = e2;
                e.v = true;
                e.j();
            }
        }
        ColorStateList l;
        if (d.q(25)) {
            l = d.j(25);
        }
        else {
            l = null;
        }
        int m = n;
        ColorStateList b2 = l;
        if (n == 0) {
            if ((b2 = l) == null) {
                b2 = this.b(16842806);
            }
            m = 0;
        }
        final Drawable k2 = d.k(10);
        Drawable l2 = null;
        Label_0609: {
            if ((l2 = k2) == null) {
                if (!d.q(17)) {
                    l2 = k2;
                    if (!d.q(18)) {
                        break Label_0609;
                    }
                }
                final Drawable c = this.c(d, adwd.s(this.getContext(), d, 19));
                final ColorStateList s = adwd.s(context2, d, 16);
                l2 = c;
                if (s != null) {
                    e.m = new RippleDrawable(advx.b(s), (Drawable)null, this.c(d, null));
                    e.j();
                    l2 = c;
                }
            }
        }
        if (d.q(11)) {
            e.n = d.e(11, 0);
            e.j();
        }
        if (d.q(26)) {
            e.o = d.e(26, 0);
            e.j();
        }
        e.r = d.e(6, 0);
        e.j();
        e.s = d.e(5, 0);
        e.j();
        e.t = d.e(32, 0);
        e.j();
        e.u = d.e(31, 0);
        e.j();
        this.g = d.p(34, this.g);
        this.h = d.p(4, this.h);
        n = d.e(12, 0);
        e.x = d.f(15, 1);
        e.j();
        ((im)k).b = (ik)new adul();
        e.d = 1;
        e.c(context2, (im)k);
        if (g != 0) {
            e.g = g;
            e.j();
        }
        e.h = h;
        e.j();
        e.k = i;
        e.j();
        e.k(this.getOverScrollMode());
        if (m != 0) {
            e.i = m;
            e.j();
        }
        e.j = b2;
        e.j();
        e.l = l2;
        e.j();
        e.p = n;
        e.j();
        ((im)k).g((iz)e);
        if (e.a == null) {
            ((RecyclerView)(e.a = (NavigationMenuView)e.f.inflate(2131624344, (ViewGroup)this, false))).ab((op)new adtv(e, (RecyclerView)e.a));
            if (e.e == null) {
                e.e = new adtq(e);
            }
            n = e.A;
            if (n != -1) {
                e.a.setOverScrollMode(n);
            }
            e.b = (LinearLayout)e.f.inflate(2131624341, (ViewGroup)e.a, false);
            ((RecyclerView)e.a).ac((nq)e.e);
        }
        this.addView((View)e.a);
        if (d.q(27)) {
            n = d.i(27, 0);
            e.l(true);
            if (this.m == null) {
                this.m = (MenuInflater)new ht(this.getContext());
            }
            this.m.inflate(n, (Menu)k);
            e.l(false);
            e.j();
        }
        if (d.q(9)) {
            n = d.i(9, 0);
            e.b.addView(e.f.inflate(n, (ViewGroup)e.b, false));
            final NavigationMenuView a2 = e.a;
            a2.setPadding(0, 0, 0, a2.getPaddingBottom());
        }
        d.o();
        this.n = (ViewTreeObserver$OnGlobalLayoutListener)new zdj(this, 7);
        this.getViewTreeObserver().addOnGlobalLayoutListener(this.n);
    }
    
    private final ColorStateList b(int colorForState) {
        final TypedValue typedValue = new TypedValue();
        if (!this.getContext().getTheme().resolveAttribute(colorForState, typedValue, true)) {
            return null;
        }
        final ColorStateList d = td.d(this.getContext(), typedValue.resourceId);
        if (!this.getContext().getTheme().resolveAttribute(2130969086, typedValue, true)) {
            return null;
        }
        final int data = typedValue.data;
        final int defaultColor = d.getDefaultColor();
        final int[] j = NavigationView.j;
        final int[] i = NavigationView.i;
        final int[] empty_STATE_SET = NavigationView.EMPTY_STATE_SET;
        colorForState = d.getColorForState(j, defaultColor);
        return new ColorStateList(new int[][] { j, i, empty_STATE_SET }, new int[] { colorForState, data, defaultColor });
    }
    
    private final Drawable c(final cdn cdn, final ColorStateList list) {
        final int[] a = adum.a;
        final adwf adwf = new adwf(adwk.b(this.getContext(), cdn.i(17, 0), cdn.i(18, 0), (adwb)new advz(0.0f)).a());
        adwf.o(list);
        return (Drawable)new InsetDrawable((Drawable)adwf, cdn.e(22, 0), cdn.e(23, 0), cdn.e(21, 0), cdn.e(20, 0));
    }
    
    protected final void a(final aoa aoa) {
        final adtx e = this.e;
        final int d = aoa.d();
        if (e.y != d) {
            e.y = d;
            e.m();
        }
        final NavigationMenuView a = e.a;
        a.setPadding(0, a.getPaddingTop(), 0, aoa.a());
        ana.v((View)e.b, aoa);
    }
    
    protected final void dispatchDraw(final Canvas canvas) {
        if (this.q == null) {
            super.dispatchDraw(canvas);
            return;
        }
        final int save = canvas.save();
        canvas.clipPath(this.q);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }
    
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        adwd.ae((View)this);
    }
    
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.getViewTreeObserver().removeOnGlobalLayoutListener(this.n);
    }
    
    protected final void onMeasure(int n, final int n2) {
        final int mode = View$MeasureSpec.getMode(n);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                n = View$MeasureSpec.makeMeasureSpec(this.l, 1073741824);
            }
        }
        else {
            n = View$MeasureSpec.makeMeasureSpec(Math.min(View$MeasureSpec.getSize(n), this.l), 1073741824);
        }
        super.onMeasure(n, n2);
    }
    
    protected final void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof NavigationView$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final NavigationView$SavedState navigationView$SavedState = (NavigationView$SavedState)parcelable;
        super.onRestoreInstanceState(navigationView$SavedState.d);
        final adtn k = this.k;
        final SparseArray sparseParcelableArray = navigationView$SavedState.a.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null) {
            if (!((im)k).h.isEmpty()) {
                for (final WeakReference weakReference : ((im)k).h) {
                    final iz iz = (iz)weakReference.get();
                    if (iz == null) {
                        ((im)k).h.remove(weakReference);
                    }
                    else {
                        final int a = iz.a();
                        if (a <= 0) {
                            continue;
                        }
                        final Parcelable parcelable2 = (Parcelable)sparseParcelableArray.get(a);
                        if (parcelable2 == null) {
                            continue;
                        }
                        iz.n(parcelable2);
                    }
                }
            }
        }
    }
    
    protected final Parcelable onSaveInstanceState() {
        final NavigationView$SavedState navigationView$SavedState = new NavigationView$SavedState(super.onSaveInstanceState());
        navigationView$SavedState.a = new Bundle();
        final adtn k = this.k;
        final Bundle a = navigationView$SavedState.a;
        if (!((im)k).h.isEmpty()) {
            final SparseArray sparseArray = new SparseArray();
            for (final WeakReference weakReference : ((im)k).h) {
                final iz iz = (iz)weakReference.get();
                if (iz == null) {
                    ((im)k).h.remove(weakReference);
                }
                else {
                    final int a2 = iz.a();
                    if (a2 <= 0) {
                        continue;
                    }
                    final Parcelable kc = iz.kC();
                    if (kc == null) {
                        continue;
                    }
                    sparseArray.put(a2, (Object)kc);
                }
            }
            a.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
        return (Parcelable)navigationView$SavedState;
    }
    
    protected final void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        if (this.getParent() instanceof aqq && this.p > 0 && this.getBackground() instanceof adwf) {
            final adwf adwf = (adwf)this.getBackground();
            final adwj e = adwf.k().e();
            if (Gravity.getAbsoluteGravity(this.o, ana.f((View)this)) == 3) {
                e.e((float)this.p);
                e.c((float)this.p);
            }
            else {
                e.d((float)this.p);
                e.b((float)this.p);
            }
            adwf.ti(e.a());
            if (this.q == null) {
                this.q = new Path();
            }
            this.q.reset();
            this.r.set(0.0f, 0.0f, (float)n, (float)n2);
            adwl.a.a(adwf.k(), adwf.a.k, this.r, this.q);
            this.invalidate();
            return;
        }
        this.q = null;
        this.r.setEmpty();
    }
    
    public final void setElevation(final float elevation) {
        super.setElevation(elevation);
        adwd.ad((View)this, elevation);
    }
    
    public final void setOverScrollMode(final int overScrollMode) {
        super.setOverScrollMode(overScrollMode);
        final adtx e = this.e;
        if (e != null) {
            e.k(overScrollMode);
        }
    }
}
