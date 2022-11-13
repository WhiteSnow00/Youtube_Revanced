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

public class NavigationView extends adwd
{
    private static final int[] k;
    private static final int[] l;
    public final advz g;
    public final int[] h;
    public boolean i;
    public boolean j;
    private final advp m;
    private final int n;
    private MenuInflater o;
    private ViewTreeObserver$OnGlobalLayoutListener p;
    private int q;
    private int r;
    private Path s;
    private final RectF t;
    
    static {
        k = new int[] { 16842912 };
        l = new int[] { -16842910 };
    }
    
    public NavigationView(final Context context) {
        this(context, null);
    }
    
    public NavigationView(final Context context, final AttributeSet set) {
        this(context, set, 2130970002);
    }
    
    public NavigationView(final Context context, final AttributeSet set, int n) {
        super(aeba.a(context, set, n, 2132084675), set, n);
        final advz g = new advz();
        this.g = g;
        this.h = new int[2];
        this.i = true;
        this.j = true;
        this.q = 0;
        this.r = 0;
        this.t = new RectF();
        final Context context2 = this.getContext();
        final advp m = new advp(context2);
        this.m = m;
        final cdo d = adwh.d(context2, set, adwo.a, n, 2132084675, new int[0]);
        if (d.q(1)) {
            anb.Q((View)this, d.k(1));
        }
        this.r = d.e(7, 0);
        this.q = d.f(0, 0);
        if (this.getBackground() == null || this.getBackground() instanceof ColorDrawable) {
            final adym a = adym.c(context2, set, n, 2132084675).a();
            final Drawable background = this.getBackground();
            final adyh adyh = new adyh(a);
            if (background instanceof ColorDrawable) {
                adyh.o(ColorStateList.valueOf(((ColorDrawable)background).getColor()));
            }
            adyh.m(context2);
            anb.Q((View)this, (Drawable)adyh);
        }
        if (d.q(8)) {
            this.setElevation((float)d.e(8, 0));
        }
        this.setFitsSystemWindows(d.p(2, false));
        this.n = d.e(3, 0);
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
        int g2 = n;
        if (n == 0) {
            ColorStateList b;
            if ((b = j) == null) {
                b = this.b(16842808);
            }
            g2 = 0;
            h = b;
        }
        ColorStateList k;
        if (d.q(14)) {
            k = d.j(14);
        }
        else {
            k = this.b(16842808);
        }
        if (d.q(24)) {
            n = d.i(24, 0);
        }
        else {
            n = 0;
        }
        if (d.q(13)) {
            final int e = d.e(13, 0);
            if (g.q != e) {
                g.q = e;
                g.v = true;
                g.j();
            }
        }
        ColorStateList i;
        if (d.q(25)) {
            i = d.j(25);
        }
        else {
            i = null;
        }
        int l = n;
        ColorStateList b2 = i;
        if (n == 0) {
            if ((b2 = i) == null) {
                b2 = this.b(16842806);
            }
            l = 0;
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
                final Drawable c = this.c(d, adds.N(this.getContext(), d, 19));
                final ColorStateList n2 = adds.N(context2, d, 16);
                l2 = c;
                if (n2 != null) {
                    g.m = new RippleDrawable(adxz.b(n2), (Drawable)null, this.c(d, null));
                    g.j();
                    l2 = c;
                }
            }
        }
        if (d.q(11)) {
            g.n = d.e(11, 0);
            g.j();
        }
        if (d.q(26)) {
            g.o = d.e(26, 0);
            g.j();
        }
        g.r = d.e(6, 0);
        g.j();
        g.s = d.e(5, 0);
        g.j();
        g.t = d.e(32, 0);
        g.j();
        g.u = d.e(31, 0);
        g.j();
        this.i = d.p(34, this.i);
        this.j = d.p(4, this.j);
        n = d.e(12, 0);
        g.x = d.f(15, 1);
        g.j();
        ((im)m).b = (ik)new adwn();
        g.d = 1;
        g.c(context2, (im)m);
        if (g2 != 0) {
            g.g = g2;
            g.j();
        }
        g.h = h;
        g.j();
        g.k = k;
        g.j();
        g.k(this.getOverScrollMode());
        if (l != 0) {
            g.i = l;
            g.j();
        }
        g.j = b2;
        g.j();
        g.l = l2;
        g.j();
        g.p = n;
        g.j();
        ((im)m).g((iz)g);
        if (g.a == null) {
            ((RecyclerView)(g.a = (NavigationMenuView)g.f.inflate(2131624343, (ViewGroup)this, false))).ab((op)new advx(g, (RecyclerView)g.a));
            if (g.e == null) {
                g.e = new advs(g);
            }
            n = g.A;
            if (n != -1) {
                g.a.setOverScrollMode(n);
            }
            g.b = (LinearLayout)g.f.inflate(2131624340, (ViewGroup)g.a, false);
            ((RecyclerView)g.a).ac((nq)g.e);
        }
        this.addView((View)g.a);
        if (d.q(27)) {
            n = d.i(27, 0);
            g.l(true);
            if (this.o == null) {
                this.o = (MenuInflater)new ht(this.getContext());
            }
            this.o.inflate(n, (Menu)m);
            g.l(false);
            g.j();
        }
        if (d.q(9)) {
            n = d.i(9, 0);
            g.b.addView(g.f.inflate(n, (ViewGroup)g.b, false));
            final NavigationMenuView a2 = g.a;
            a2.setPadding(0, 0, 0, a2.getPaddingBottom());
        }
        d.o();
        this.p = (ViewTreeObserver$OnGlobalLayoutListener)new zfc(this, 7);
        this.getViewTreeObserver().addOnGlobalLayoutListener(this.p);
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
        final int[] l = NavigationView.l;
        final int[] k = NavigationView.k;
        final int[] empty_STATE_SET = NavigationView.EMPTY_STATE_SET;
        colorForState = d.getColorForState(l, defaultColor);
        return new ColorStateList(new int[][] { l, k, empty_STATE_SET }, new int[] { colorForState, data, defaultColor });
    }
    
    private final Drawable c(final cdo cdo, final ColorStateList list) {
        final int[] a = adwo.a;
        final adyh adyh = new adyh(adym.b(this.getContext(), cdo.i(17, 0), cdo.i(18, 0), (adyd)new adyb(0.0f)).a());
        adyh.o(list);
        return (Drawable)new InsetDrawable((Drawable)adyh, cdo.e(22, 0), cdo.e(23, 0), cdo.e(21, 0), cdo.e(20, 0));
    }
    
    protected final void a(final aob aob) {
        final advz g = this.g;
        final int d = aob.d();
        if (g.y != d) {
            g.y = d;
            g.m();
        }
        final NavigationMenuView a = g.a;
        a.setPadding(0, a.getPaddingTop(), 0, aob.a());
        anb.v((View)g.b, aob);
    }
    
    protected final void dispatchDraw(final Canvas canvas) {
        if (this.s == null) {
            super.dispatchDraw(canvas);
            return;
        }
        final int save = canvas.save();
        canvas.clipPath(this.s);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }
    
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        adyf.f((View)this);
    }
    
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.getViewTreeObserver().removeOnGlobalLayoutListener(this.p);
    }
    
    protected final void onMeasure(int n, final int n2) {
        final int mode = View$MeasureSpec.getMode(n);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                n = View$MeasureSpec.makeMeasureSpec(this.n, 1073741824);
            }
        }
        else {
            n = View$MeasureSpec.makeMeasureSpec(Math.min(View$MeasureSpec.getSize(n), this.n), 1073741824);
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
        final advp m = this.m;
        final SparseArray sparseParcelableArray = navigationView$SavedState.a.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null) {
            if (!((im)m).h.isEmpty()) {
                for (final WeakReference weakReference : ((im)m).h) {
                    final iz iz = (iz)weakReference.get();
                    if (iz == null) {
                        ((im)m).h.remove(weakReference);
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
        final advp m = this.m;
        final Bundle a = navigationView$SavedState.a;
        if (!((im)m).h.isEmpty()) {
            final SparseArray sparseArray = new SparseArray();
            for (final WeakReference weakReference : ((im)m).h) {
                final iz iz = (iz)weakReference.get();
                if (iz == null) {
                    ((im)m).h.remove(weakReference);
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
        if (this.getParent() instanceof aqr && this.r > 0 && this.getBackground() instanceof adyh) {
            final adyh adyh = (adyh)this.getBackground();
            final adyl e = adyh.k().e();
            if (Gravity.getAbsoluteGravity(this.q, anb.f((View)this)) == 3) {
                e.e((float)this.r);
                e.c((float)this.r);
            }
            else {
                e.d((float)this.r);
                e.b((float)this.r);
            }
            adyh.tn(e.a());
            if (this.s == null) {
                this.s = new Path();
            }
            this.s.reset();
            this.t.set(0.0f, 0.0f, (float)n, (float)n2);
            adyn.a.a(adyh.k(), adyh.a.k, this.t, this.s);
            this.invalidate();
            return;
        }
        this.s = null;
        this.t.setEmpty();
    }
    
    public final void setElevation(final float elevation) {
        super.setElevation(elevation);
        adyf.e((View)this, elevation);
    }
    
    public final void setOverScrollMode(final int overScrollMode) {
        super.setOverScrollMode(overScrollMode);
        final advz g = this.g;
        if (g != null) {
            g.k(overScrollMode);
        }
    }
}
