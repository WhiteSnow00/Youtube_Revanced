// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.card;

import android.graphics.Rect;
import android.os.Build$VERSION;
import android.graphics.RectF;
import android.graphics.drawable.InsetDrawable;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityEvent;
import android.graphics.drawable.LayerDrawable;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;

public class MaterialCardView extends CardView implements Checkable, adwv
{
    private static final int[] h;
    private static final int[] i;
    public boolean g;
    private final adsa j;
    private boolean k;
    
    static {
        h = new int[] { 16842911 };
        i = new int[] { 16842912 };
    }
    
    public MaterialCardView(final Context context) {
        this(context, null);
    }
    
    public MaterialCardView(final Context context, final AttributeSet set) {
        this(context, set, 2130969855);
    }
    
    public MaterialCardView(final Context context, final AttributeSet set, int n) {
        super(adyy.a(context, set, n, 2132085179), set, n);
        this.g = false;
        this.k = true;
        final TypedArray a = aduf.a(this.getContext(), set, adsb.b, n, 2132085179, new int[0]);
        final adsa j = new adsa(this, set, n);
        (this.j = j).e(((aay)super.f.a).e);
        n = super.c.left;
        j.c.set(n, super.c.top, super.c.right, super.c.bottom);
        j.h();
        j.o = adwd.f(j.b.getContext(), a, 11);
        if (j.o == null) {
            j.o = ColorStateList.valueOf(-1);
        }
        j.i = a.getDimensionPixelSize(12, 0);
        final boolean boolean1 = a.getBoolean(0, false);
        j.t = boolean1;
        j.b.setLongClickable(boolean1);
        j.m = adwd.f(j.b.getContext(), a, 6);
        final Drawable g = adwd.g(j.b.getContext(), a, 2);
        if (g != null) {
            aip.g(j.k = g.mutate(), j.m);
            j.f(j.b.g, false);
        }
        else {
            j.k = adsa.a;
        }
        final LayerDrawable q = j.q;
        if (q != null) {
            q.setDrawableByLayerId(2131429965, j.k);
        }
        j.g = a.getDimensionPixelSize(5, 0);
        j.f = a.getDimensionPixelSize(4, 0);
        j.h = a.getInteger(3, 8388661);
        j.l = adwd.f(j.b.getContext(), a, 7);
        if (j.l == null) {
            j.l = ColorStateList.valueOf(adwd.A((View)j.b, 2130969044));
        }
        final ColorStateList f = adwd.f(j.b.getContext(), a, 1);
        final adwf e = j.e;
        ColorStateList value;
        if ((value = f) == null) {
            value = ColorStateList.valueOf(0);
        }
        e.o(value);
        n = advx.b;
        final Drawable p3 = j.p;
        if (p3 != null) {
            ((RippleDrawable)p3).setColor(j.l);
        }
        else {
            final adwf r = j.r;
        }
        j.i();
        j.e.t((float)j.i, j.o);
        j.b.setBackgroundDrawable(j.d((Drawable)j.d));
        Object i;
        if (j.b.isClickable()) {
            i = j.c();
        }
        else {
            i = j.e;
        }
        j.j = (Drawable)i;
        j.b.setForeground(j.d(j.j));
        a.recycle();
    }
    
    public final float b() {
        return this.j.d.b();
    }
    
    public final void d(final int n) {
        this.j.e(ColorStateList.valueOf(n));
    }
    
    public final void e(final float n) {
        super.e(n);
        this.j.j();
    }
    
    public final void f(final float n) {
        super.f(n);
        final adsa j = this.j;
        j.g(j.n.f(n));
        j.j.invalidateSelf();
        if (j.n() || j.m()) {
            j.h();
        }
        if (j.n()) {
            j.j();
        }
    }
    
    public final void g() {
        super.g();
        this.j.i();
    }
    
    public final void i(final Drawable backgroundDrawable) {
        super.setBackgroundDrawable(backgroundDrawable);
    }
    
    public final boolean isChecked() {
        return this.g;
    }
    
    public final boolean j() {
        final adsa j = this.j;
        return j != null && j.t;
    }
    
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        adwd.af((View)this, this.j.d);
    }
    
    protected final int[] onCreateDrawableState(final int n) {
        final int[] onCreateDrawableState = super.onCreateDrawableState(n + 3);
        if (this.j()) {
            mergeDrawableStates(onCreateDrawableState, MaterialCardView.h);
        }
        if (this.g) {
            mergeDrawableStates(onCreateDrawableState, MaterialCardView.i);
        }
        return onCreateDrawableState;
    }
    
    public final void onInitializeAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName((CharSequence)"androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.g);
    }
    
    public final void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((CharSequence)"androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(this.j());
        accessibilityNodeInfo.setClickable(this.isClickable());
        accessibilityNodeInfo.setChecked(this.g);
    }
    
    protected final void onMeasure(int f, int f2) {
        super.onMeasure(f, f2);
        final adsa j = this.j;
        final int measuredWidth = this.getMeasuredWidth();
        final int measuredHeight = this.getMeasuredHeight();
        if (j.q != null) {
            int n;
            if (j.b.a) {
                final float b = j.b();
                n = (int)Math.ceil(b + b);
                final float a = j.a();
                f2 = (int)Math.ceil(a + a);
            }
            else {
                n = 0;
                f2 = 0;
            }
            if (j.l()) {
                f = measuredWidth - j.f - j.g - f2;
            }
            else {
                f = j.f;
            }
            int f3;
            if (j.k()) {
                f3 = j.f;
            }
            else {
                f3 = measuredHeight - j.f - j.g - n;
            }
            if (j.l()) {
                f2 = j.f;
            }
            else {
                f2 = measuredWidth - j.f - j.g - f2;
            }
            int f4;
            if (j.k()) {
                f4 = measuredHeight - j.f - j.g - n;
            }
            else {
                f4 = j.f;
            }
            final int f5 = ana.f((View)j.b);
            int n2;
            if (f5 == 1) {
                n2 = f;
            }
            else {
                n2 = f2;
            }
            if (f5 == 1) {
                f = f2;
            }
            j.q.setLayerInset(2, f, f4, n2, f3);
        }
    }
    
    public final void setBackground(final Drawable backgroundDrawable) {
        this.setBackgroundDrawable(backgroundDrawable);
    }
    
    public final void setBackgroundDrawable(final Drawable backgroundDrawable) {
        if (this.k) {
            final adsa j = this.j;
            if (!j.s) {
                j.s = true;
            }
            super.setBackgroundDrawable(backgroundDrawable);
        }
    }
    
    public final void setChecked(final boolean b) {
        if (this.g != b) {
            this.toggle();
        }
    }
    
    public final void setClickable(final boolean clickable) {
        super.setClickable(clickable);
        final adsa j = this.j;
        if (j != null) {
            final Drawable i = j.j;
            Object k;
            if (j.b.isClickable()) {
                k = j.c();
            }
            else {
                k = j.e;
            }
            j.j = (Drawable)k;
            final Drawable l = j.j;
            if (i != l) {
                if (j.b.getForeground() instanceof InsetDrawable) {
                    ((InsetDrawable)j.b.getForeground()).setDrawable(l);
                    return;
                }
                j.b.setForeground(j.d(l));
            }
        }
    }
    
    public final void ti(final adwk adwk) {
        final RectF rectF = new RectF();
        rectF.set(this.j.d.getBounds());
        this.setClipToOutline(adwk.g(rectF));
        this.j.g(adwk);
    }
    
    public final void toggle() {
        if (this.j() && this.isEnabled()) {
            this.g ^= true;
            this.refreshDrawableState();
            if (Build$VERSION.SDK_INT > 26) {
                final adsa j = this.j;
                final Drawable p = j.p;
                if (p != null) {
                    final Rect bounds = p.getBounds();
                    final int bottom = bounds.bottom;
                    j.p.setBounds(bounds.left, bounds.top, bounds.right, bottom - 1);
                    j.p.setBounds(bounds.left, bounds.top, bounds.right, bottom);
                }
            }
            this.j.f(this.g, true);
        }
    }
}
