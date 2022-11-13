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

public class FloatingActionButton extends adwm implements adun, adyx, aeh
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
    private advf m;
    private final adzk n;
    private final arfe o;
    
    public FloatingActionButton(final Context context) {
        this(context, null);
    }
    
    public FloatingActionButton(final Context context, final AttributeSet set) {
        this(context, set, 2130969434);
    }
    
    public FloatingActionButton(final Context context, final AttributeSet set, int a) {
        super(aeba.a(context, set, a, 2132084674), set, a);
        this.c = new Rect();
        this.l = new Rect();
        final Context context2 = this.getContext();
        final TypedArray a2 = adwh.a(context2, set, advj.b, a, 2132084674, new int[0]);
        this.e = adds.z(context2, a2, 1);
        this.f = adds.K(a2.getInt(2, -1), (PorterDuff$Mode)null);
        this.g = adds.z(context2, a2, 12);
        this.i = a2.getInt(7, -1);
        this.j = a2.getDimensionPixelSize(6, 0);
        this.h = a2.getDimensionPixelSize(3, 0);
        final float dimension = a2.getDimension(4, 0.0f);
        final float dimension2 = a2.getDimension(9, 0.0f);
        final float dimension3 = a2.getDimension(11, 0.0f);
        this.b = a2.getBoolean(16, false);
        final int dimensionPixelSize = this.getResources().getDimensionPixelSize(2131168114);
        final int dimensionPixelSize2 = a2.getDimensionPixelSize(10, 0);
        this.k = dimensionPixelSize2;
        final advf i = this.i();
        if (i.z != dimensionPixelSize2) {
            i.z = dimensionPixelSize2;
            i.i();
        }
        final adsi a3 = adsi.a(context2, a2, 15);
        final adsi a4 = adsi.a(context2, a2, 8);
        final adym a5 = adym.d(context2, set, a, 2132084674, adym.a).a();
        final boolean boolean1 = a2.getBoolean(5, false);
        this.setEnabled(a2.getBoolean(0, true));
        a2.recycle();
        (this.o = new arfe((ImageView)this)).n(set, a);
        this.n = new adzk((adun)this);
        this.i().h(a5);
        final advf j = this.i();
        final ColorStateList e = this.e;
        final PorterDuff$Mode f = this.f;
        final ColorStateList g = this.g;
        final int h = this.h;
        final advh advh = (advh)j;
        final adym l = advh.l;
        afg.k(l);
        (advh.m = (adyh)new advg(l)).setTintList(e);
        if (f != null) {
            advh.m.setTintMode(f);
        }
        advh.m.m(advh.B.getContext());
        Object m2;
        if (h > 0) {
            final Context context3 = advh.B.getContext();
            final adym k = advh.l;
            afg.k(k);
            final adup o = new adup(k);
            final int a6 = agy.a(context3, 2131099873);
            a = agy.a(context3, 2131099872);
            final int a7 = agy.a(context3, 2131099870);
            final int a8 = agy.a(context3, 2131099871);
            o.c = a6;
            o.d = a;
            o.e = a7;
            o.f = a8;
            final float b = o.b;
            final float b2 = (float)h;
            if (b != b2) {
                o.b = b2;
                o.a.setStrokeWidth(b2 * 1.3333f);
                o.g = true;
                o.invalidateSelf();
            }
            o.b(e);
            advh.o = o;
            final adup o2 = advh.o;
            afg.k(o2);
            final adyh m = advh.m;
            afg.k(m);
            m2 = new LayerDrawable(new Drawable[] { (Drawable)o2, (Drawable)m });
        }
        else {
            advh.o = null;
            m2 = advh.m;
        }
        advh.n = (Drawable)new RippleDrawable(adxz.b(g), (Drawable)m2, (Drawable)null);
        advh.p = advh.n;
        this.i().u = dimensionPixelSize;
        final advf i2 = this.i();
        if (i2.r != dimension) {
            i2.f(i2.r = dimension, i2.s, i2.t);
        }
        final advf i3 = this.i();
        if (i3.s != dimension2) {
            i3.s = dimension2;
            i3.f(i3.r, dimension2, i3.t);
        }
        final advf i4 = this.i();
        if (i4.t != dimension3) {
            i4.t = dimension3;
            i4.f(i4.r, i4.s, dimension3);
        }
        this.i().w = a3;
        this.i().x = a4;
        this.i().q = boolean1;
        this.setScaleType(ImageView$ScaleType.MATRIX);
    }
    
    public static void c(final FloatingActionButton floatingActionButton, final Drawable backgroundDrawable) {
        floatingActionButton.setBackgroundDrawable(backgroundDrawable);
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
    
    private final advf i() {
        if (this.m == null) {
            this.m = (advf)new advh(this, new afhd(this), (byte[])null, (byte[])null);
        }
        return this.m;
    }
    
    public final aei a() {
        return (aei)new FloatingActionButton$Behavior();
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
        final advf i = this.i();
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
            final adsi x = i.x;
            AnimatorSet set;
            if (x != null) {
                set = i.b(x, 0.0f, 0.0f, 0.0f);
            }
            else {
                set = i.c(0.0f, 0.4f, 0.4f, advf.d, advf.e);
            }
            set.addListener((Animator$AnimatorListener)new aduv(i));
            set.start();
            return;
        }
        i.B.g(4, false);
    }
    
    final void f() {
        final advf i = this.i();
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
        final adsi w = i.w;
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
            final adsi w2 = i.w;
            AnimatorSet set;
            if (w2 != null) {
                set = i.b(w2, 1.0f, 1.0f, 1.0f);
            }
            else {
                set = i.c(1.0f, 1.0f, 1.0f, advf.b, advf.c);
            }
            set.addListener((Animator$AnimatorListener)new aduw(i));
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
        final advf i = this.i();
        final adyh m = i.m;
        if (m != null) {
            adyf.g((View)i.B, m);
        }
    }
    
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final advf i = this.i();
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
        final adzk n = this.n;
        final Bundle bundle = (Bundle)extendableSavedState.a.get("expandableWidgetHelper");
        afg.k(bundle);
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
        final abo a = extendableSavedState.a;
        final adzk n = this.n;
        final Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", n.b);
        bundle.putInt("expandedComponentIdHint", n.a);
        a.put("expandableWidgetHelper", bundle);
        return (Parcelable)extendableSavedState;
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            final Rect l = this.l;
            if (anb.ao((View)this)) {
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
            final advf i = this.i();
            final adyh m = i.m;
            if (m != null) {
                m.setTintList(list);
            }
            final adup o = i.o;
            if (o != null) {
                o.b(list);
            }
        }
    }
    
    public final void setBackgroundTintMode(final PorterDuff$Mode porterDuff$Mode) {
        if (this.f != porterDuff$Mode) {
            this.f = porterDuff$Mode;
            final adyh m = this.i().m;
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
    
    public final void tn(final adym adym) {
        this.i().h(adym);
    }
}
