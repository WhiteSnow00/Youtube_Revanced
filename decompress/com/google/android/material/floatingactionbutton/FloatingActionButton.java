// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.floatingactionbutton;

import android.view.MotionEvent;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.os.Bundle;
import com.google.android.material.stateful.ExtendableSavedState;
import android.os.Parcelable;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.view.View;
import android.animation.AnimatorSet;
import android.animation.Animator;
import android.animation.Animator$AnimatorListener;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.widget.ImageView$ScaleType;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.Rect;

public class FloatingActionButton extends aduk implements adsl, adwv, aeg
{
    public int a;
    public boolean b;
    public final Rect c;
    private ColorStateList e;
    private PorterDuff$Mode f;
    private ColorStateList g;
    private int h;
    private int i;
    private int j;
    private int k;
    private final Rect l;
    private adtd m;
    private final adxi n;
    private final arcq o;
    
    public FloatingActionButton(final Context context) {
        this(context, null);
    }
    
    public FloatingActionButton(final Context context, final AttributeSet set) {
        this(context, set, 2130969434);
    }
    
    public FloatingActionButton(final Context context, final AttributeSet set, int a) {
        super(adyy.a(context, set, a, 2132084673), set, a);
        this.c = new Rect();
        this.l = new Rect();
        final Context context2 = this.getContext();
        final TypedArray a2 = aduf.a(context2, set, adth.b, a, 2132084673, new int[0]);
        this.e = adwd.f(context2, a2, 1);
        this.f = adwd.q(a2.getInt(2, -1), (PorterDuff$Mode)null);
        this.g = adwd.f(context2, a2, 12);
        this.i = a2.getInt(7, -1);
        this.j = a2.getDimensionPixelSize(6, 0);
        this.h = a2.getDimensionPixelSize(3, 0);
        final float dimension = a2.getDimension(4, 0.0f);
        final float dimension2 = a2.getDimension(9, 0.0f);
        final float dimension3 = a2.getDimension(11, 0.0f);
        this.b = a2.getBoolean(16, false);
        final int dimensionPixelSize = this.getResources().getDimensionPixelSize(2131168115);
        final int dimensionPixelSize2 = a2.getDimensionPixelSize(10, 0);
        this.k = dimensionPixelSize2;
        final adtd i = this.i();
        if (i.z != dimensionPixelSize2) {
            i.z = dimensionPixelSize2;
            i.i();
        }
        final adqg a3 = adqg.a(context2, a2, 15);
        final adqg a4 = adqg.a(context2, a2, 8);
        final adwk a5 = adwk.d(context2, set, a, 2132084673, adwk.a).a();
        final boolean boolean1 = a2.getBoolean(5, false);
        this.setEnabled(a2.getBoolean(0, true));
        a2.recycle();
        (this.o = new arcq((ImageView)this)).n(set, a);
        this.n = new adxi((adsl)this);
        this.i().h(a5);
        final adtd j = this.i();
        final ColorStateList e = this.e;
        final PorterDuff$Mode f = this.f;
        final ColorStateList g = this.g;
        final int h = this.h;
        final adtf adtf = (adtf)j;
        final adwk l = adtf.l;
        aff.k((Object)l);
        (adtf.m = new adte(l)).setTintList(e);
        if (f != null) {
            adtf.m.setTintMode(f);
        }
        adtf.m.m(adtf.B.getContext());
        Object m2;
        if (h > 0) {
            final Context context3 = adtf.B.getContext();
            final adwk k = adtf.l;
            aff.k((Object)k);
            final adsn o = new adsn(k);
            a = agx.a(context3, 2131099873);
            final int a6 = agx.a(context3, 2131099872);
            final int a7 = agx.a(context3, 2131099870);
            final int a8 = agx.a(context3, 2131099871);
            o.c = a;
            o.d = a6;
            o.e = a7;
            o.f = a8;
            final float b = (float)h;
            if (o.b != b) {
                o.b = b;
                o.a.setStrokeWidth(b * 1.3333f);
                o.g = true;
                o.invalidateSelf();
            }
            o.b(e);
            adtf.o = o;
            final adsn o2 = adtf.o;
            aff.k((Object)o2);
            final adwf m = adtf.m;
            aff.k((Object)m);
            m2 = new LayerDrawable(new Drawable[] { (Drawable)o2, (Drawable)m });
        }
        else {
            adtf.o = null;
            m2 = adtf.m;
        }
        adtf.n = (Drawable)new RippleDrawable(advx.b(g), (Drawable)m2, (Drawable)null);
        adtf.p = adtf.n;
        this.i().u = dimensionPixelSize;
        final adtd i2 = this.i();
        if (i2.r != dimension) {
            i2.f(i2.r = dimension, i2.s, i2.t);
        }
        final adtd i3 = this.i();
        if (i3.s != dimension2) {
            i3.s = dimension2;
            i3.f(i3.r, dimension2, i3.t);
        }
        final adtd i4 = this.i();
        if (i4.t != dimension3) {
            i4.t = dimension3;
            i4.f(i4.r, i4.s, dimension3);
        }
        this.i().w = a3;
        this.i().x = a4;
        this.i().q = boolean1;
        this.setScaleType(ImageView$ScaleType.MATRIX);
    }
    
    private final int h(int n) {
        final int j = this.j;
        if (j != 0) {
            return j;
        }
        final Resources resources = this.getResources();
        if (n == -1) {
            if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
                n = this.h(1);
            }
            else {
                n = this.h(0);
            }
            return n;
        }
        if (n != 1) {
            return resources.getDimensionPixelSize(2131166263);
        }
        return resources.getDimensionPixelSize(2131166262);
    }
    
    private final adtd i() {
        if (this.m == null) {
            this.m = (adtd)new adtf(this, new aepj(this), (byte[])null, (byte[])null, (byte[])null);
        }
        return this.m;
    }
    
    public final aeh a() {
        return (aeh)new FloatingActionButton$Behavior();
    }
    
    public final int b() {
        return this.h(this.i);
    }
    
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        this.i();
        this.getDrawableState();
    }
    
    final void e() {
        final adtd i = this.i();
        Label_0035: {
            if (i.B.getVisibility() == 0) {
                if (i.A != 1) {
                    break Label_0035;
                }
            }
            else if (i.A == 2) {
                break Label_0035;
            }
            return;
        }
        final Animator v = i.v;
        if (v != null) {
            v.cancel();
        }
        if (i.m()) {
            final adqg x = i.x;
            AnimatorSet set;
            if (x != null) {
                set = i.b(x, 0.0f, 0.0f, 0.0f);
            }
            else {
                set = i.c(0.0f, 0.4f, 0.4f, adtd.d, adtd.e);
            }
            set.addListener((Animator$AnimatorListener)new adst(i));
            set.start();
            return;
        }
        i.B.g(4, false);
    }
    
    final void f() {
        final adtd i = this.i();
        Label_0035: {
            if (i.B.getVisibility() != 0) {
                if (i.A != 2) {
                    break Label_0035;
                }
            }
            else if (i.A == 1) {
                break Label_0035;
            }
            return;
        }
        final Animator v = i.v;
        if (v != null) {
            v.cancel();
        }
        final adqg w = i.w;
        if (i.m()) {
            if (i.B.getVisibility() != 0) {
                final FloatingActionButton b = i.B;
                float n = 0.0f;
                b.setAlpha(0.0f);
                final FloatingActionButton b2 = i.B;
                if (w == null) {
                    n = 0.4f;
                }
                b2.setScaleY(n);
                i.B.setScaleX(n);
                i.g(n);
            }
            final adqg w2 = i.w;
            AnimatorSet set;
            if (w2 != null) {
                set = i.b(w2, 1.0f, 1.0f, 1.0f);
            }
            else {
                set = i.c(1.0f, 1.0f, 1.0f, adtd.b, adtd.c);
            }
            set.addListener((Animator$AnimatorListener)new adsu(i));
            set.start();
            return;
        }
        i.B.g(0, false);
        i.B.setAlpha(1.0f);
        i.B.setScaleY(1.0f);
        i.B.setScaleX(1.0f);
        i.g(1.0f);
    }
    
    public final ColorStateList getBackgroundTintList() {
        return this.e;
    }
    
    public final PorterDuff$Mode getBackgroundTintMode() {
        return this.f;
    }
    
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.i();
    }
    
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        final adtd i = this.i();
        final adwf m = i.m;
        if (m != null) {
            adwd.af((View)i.B, m);
        }
    }
    
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final adtd i = this.i();
        i.B.getViewTreeObserver();
        final ViewTreeObserver$OnPreDrawListener c = i.C;
    }
    
    protected final void onMeasure(int min, final int n) {
        final int b = this.b();
        this.a = (b - this.k) / 2;
        this.i().j();
        min = Math.min(View.resolveSize(b, min), View.resolveSize(b, n));
        this.setMeasuredDimension(this.c.left + min + this.c.right, min + this.c.top + this.c.bottom);
    }
    
    protected final void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final ExtendableSavedState extendableSavedState = (ExtendableSavedState)parcelable;
        super.onRestoreInstanceState(extendableSavedState.d);
        final adxi n = this.n;
        final Bundle bundle = (Bundle)extendableSavedState.a.get((Object)"expandableWidgetHelper");
        aff.k((Object)bundle);
        n.b = bundle.getBoolean("expanded", false);
        n.a = bundle.getInt("expandedComponentIdHint", 0);
        if (n.b) {
            final ViewParent parent = ((View)n.c).getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout)parent).c((View)n.c);
            }
        }
    }
    
    protected final Parcelable onSaveInstanceState() {
        Object onSaveInstanceState;
        if ((onSaveInstanceState = super.onSaveInstanceState()) == null) {
            onSaveInstanceState = new Bundle();
        }
        final ExtendableSavedState extendableSavedState = new ExtendableSavedState((Parcelable)onSaveInstanceState);
        final abn a = extendableSavedState.a;
        final adxi n = this.n;
        final Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", n.b);
        bundle.putInt("expandedComponentIdHint", n.a);
        a.put((Object)"expandableWidgetHelper", (Object)bundle);
        return (Parcelable)extendableSavedState;
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            final Rect l = this.l;
            if (ana.ao((View)this)) {
                l.set(0, 0, this.getWidth(), this.getHeight());
                l.left += this.c.left;
                l.top += this.c.top;
                l.right -= this.c.right;
                l.bottom -= this.c.bottom;
                if (!this.l.contains((int)motionEvent.getX(), (int)motionEvent.getY())) {
                    return false;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }
    
    public final void setBackgroundColor(final int n) {
    }
    
    public final void setBackgroundDrawable(final Drawable drawable) {
    }
    
    public final void setBackgroundResource(final int n) {
    }
    
    public final void setBackgroundTintList(final ColorStateList list) {
        if (this.e != list) {
            this.e = list;
            final adtd i = this.i();
            final adwf m = i.m;
            if (m != null) {
                m.setTintList(list);
            }
            final adsn o = i.o;
            if (o != null) {
                o.b(list);
            }
        }
    }
    
    public final void setBackgroundTintMode(final PorterDuff$Mode porterDuff$Mode) {
        if (this.f != porterDuff$Mode) {
            this.f = porterDuff$Mode;
            final adwf m = this.i().m;
            if (m != null) {
                m.setTintMode(porterDuff$Mode);
            }
        }
    }
    
    public final void setElevation(final float elevation) {
        super.setElevation(elevation);
        this.i().k(elevation);
    }
    
    public final void setImageDrawable(final Drawable imageDrawable) {
        if (this.getDrawable() != imageDrawable) {
            super.setImageDrawable(imageDrawable);
            this.i().i();
        }
    }
    
    public final void setImageResource(final int n) {
        this.o.p(n);
        final Drawable drawable = this.getDrawable();
        if (drawable == null) {
            return;
        }
        drawable.clearColorFilter();
    }
    
    public final void setScaleX(final float scaleX) {
        super.setScaleX(scaleX);
        this.i();
    }
    
    public final void setScaleY(final float scaleY) {
        super.setScaleY(scaleY);
        this.i();
    }
    
    public final void setTranslationX(final float translationX) {
        super.setTranslationX(translationX);
        this.i();
    }
    
    public final void setTranslationY(final float translationY) {
        super.setTranslationY(translationY);
        this.i();
    }
    
    public final void setTranslationZ(final float translationZ) {
        super.setTranslationZ(translationZ);
        this.i();
    }
    
    public final void ti(final adwk adwk) {
        this.i().h(adwk);
    }
}
