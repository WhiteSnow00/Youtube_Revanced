// 
// Decompiled by Procyon v0.6.0
// 

package com.airbnb.lottie;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.os.Parcelable;
import java.util.Iterator;
import android.view.View;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.Drawable;
import java.util.concurrent.Callable;
import android.animation.Animator$AnimatorListener;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.os.Build$VERSION;
import android.util.AttributeSet;
import java.util.HashSet;
import android.content.Context;
import java.util.Set;
import android.support.v7.widget.AppCompatImageView;

public class LottieAnimationView extends AppCompatImageView
{
    public static final cuk a;
    public cuk b;
    public int c;
    public final cui d;
    public boolean e;
    public ctv f;
    private final cuk g;
    private final cuk h;
    private boolean i;
    private String j;
    private int k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private final Set q;
    private int r;
    private cuq s;
    private int t;
    
    static {
        a = (cuk)new ctr();
    }
    
    public LottieAnimationView(final Context context) {
        super(context);
        this.g = (cuk)new cts(this, 1);
        this.h = (cuk)new cts(this, 0);
        this.c = 0;
        this.d = new cui();
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = false;
        this.e = true;
        this.t = 1;
        this.q = new HashSet();
        this.r = 0;
        this.v(null, 2130969797);
    }
    
    public LottieAnimationView(final Context context, final AttributeSet set) {
        super(context, set);
        this.g = (cuk)new cts(this, 1);
        this.h = (cuk)new cts(this, 0);
        this.c = 0;
        this.d = new cui();
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = false;
        this.e = true;
        this.t = 1;
        this.q = new HashSet();
        this.r = 0;
        this.v(set, 2130969797);
    }
    
    public LottieAnimationView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.g = (cuk)new cts(this, 1);
        this.h = (cuk)new cts(this, 0);
        this.c = 0;
        this.d = new cui();
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = false;
        this.e = true;
        this.t = 1;
        this.q = new HashSet();
        this.r = 0;
        this.v(set, n);
    }
    
    private final void t() {
        final cuq s = this.s;
        if (s != null) {
            s.g(this.g);
            this.s.f(this.h);
        }
    }
    
    private final void u() {
        final int t = this.t;
        final int n = t - 1;
        if (t != 0) {
            final int n2 = 2;
            int n3 = 0;
            Label_0088: {
                if (n != 0) {
                    n3 = n2;
                    if (n == 1) {
                        break Label_0088;
                    }
                }
                else {
                    final ctv f = this.f;
                    if (f == null || !f.k || Build$VERSION.SDK_INT >= 28) {
                        final ctv f2 = this.f;
                        n3 = n2;
                        if (f2 == null) {
                            break Label_0088;
                        }
                        n3 = n2;
                        if (f2.l <= 4) {
                            break Label_0088;
                        }
                    }
                }
                n3 = 1;
            }
            if (n3 != this.getLayerType()) {
                this.setLayerType(n3, (Paint)null);
            }
            return;
        }
        throw null;
    }
    
    private final void v(final AttributeSet set, int n) {
        final Context context = this.getContext();
        final int[] a = cur.a;
        boolean b = false;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, a, n, 0);
        this.e = obtainStyledAttributes.getBoolean(1, true);
        final boolean hasValue = obtainStyledAttributes.hasValue(10);
        final boolean hasValue2 = obtainStyledAttributes.hasValue(5);
        final boolean hasValue3 = obtainStyledAttributes.hasValue(16);
        if (hasValue && hasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (hasValue) {
            n = obtainStyledAttributes.getResourceId(10, 0);
            if (n != 0) {
                this.g(n);
            }
        }
        else if (hasValue2) {
            final String string = obtainStyledAttributes.getString(5);
            if (string != null) {
                this.h(string);
            }
        }
        else if (hasValue3) {
            final String string2 = obtainStyledAttributes.getString(16);
            if (string2 != null) {
                this.i(string2);
            }
        }
        this.c = obtainStyledAttributes.getResourceId(4, 0);
        if (obtainStyledAttributes.getBoolean(0, false)) {
            this.n = true;
            this.p = true;
        }
        if (obtainStyledAttributes.getBoolean(8, false)) {
            this.d.p(-1);
        }
        if (obtainStyledAttributes.hasValue(13)) {
            this.o(obtainStyledAttributes.getInt(13, 1));
        }
        if (obtainStyledAttributes.hasValue(12)) {
            this.n(obtainStyledAttributes.getInt(12, -1));
        }
        if (obtainStyledAttributes.hasValue(15)) {
            this.p(obtainStyledAttributes.getFloat(15, 1.0f));
        }
        this.d.h = obtainStyledAttributes.getString(7);
        this.m(obtainStyledAttributes.getFloat(9, 0.0f));
        final boolean boolean1 = obtainStyledAttributes.getBoolean(3, false);
        final cui d = this.d;
        if (d.i != boolean1) {
            d.i = boolean1;
            if (d.a != null) {
                d.g();
            }
        }
        if (obtainStyledAttributes.hasValue(2)) {
            n = obtainStyledAttributes.getResourceId(2, -1);
            this.d.f(new cwj(new String[] { "**" }), (Object)cun.E, new czt((Object)new cus(td.d(this.getContext(), n).getDefaultColor())));
        }
        if (obtainStyledAttributes.hasValue(14)) {
            this.d.c = obtainStyledAttributes.getFloat(14, 1.0f);
        }
        if (obtainStyledAttributes.hasValue(11)) {
            final int int1 = obtainStyledAttributes.getInt(11, 0);
            cij.b();
            if ((n = int1) >= 3) {
                n = 0;
            }
            this.r(cij.b()[n]);
        }
        this.d.e = obtainStyledAttributes.getBoolean(6, false);
        obtainStyledAttributes.recycle();
        final cui d2 = this.d;
        if (czr.b(this.getContext()) != 0.0f) {
            b = true;
        }
        d2.d = (boolean)b;
        this.u();
        this.i = true;
    }
    
    public final void a(final Animator$AnimatorListener animator$AnimatorListener) {
        ((czi)this.d.b).addListener(animator$AnimatorListener);
    }
    
    public final void b(final cwj cwj, final Object o, final czv czv) {
        this.d.f(cwj, o, (czt)new ctu(czv));
    }
    
    public final void buildDrawingCache(final boolean b) {
        ++this.r;
        super.buildDrawingCache(b);
        if (this.r == 1 && this.getWidth() > 0 && this.getHeight() > 0 && this.getLayerType() == 1 && this.getDrawingCache(b) == null) {
            this.r(2);
        }
        --this.r;
        ctq.a();
    }
    
    public final void c() {
        this.n = false;
        this.m = false;
        this.l = false;
        final cui d = this.d;
        d.f.clear();
        d.b.cancel();
        this.u();
    }
    
    public final void d() {
        this.p = false;
        this.n = false;
        this.m = false;
        this.l = false;
        this.d.i();
        this.u();
    }
    
    public final void e() {
        if (this.isShown()) {
            this.d.j();
            this.u();
            return;
        }
        this.l = true;
    }
    
    public final void f() {
        if (this.isShown()) {
            this.d.k();
            this.u();
            return;
        }
        this.l = false;
        this.m = true;
    }
    
    public final void g(final int k) {
        this.k = k;
        this.j = null;
        cuq cuq;
        if (this.isInEditMode()) {
            cuq = new cuq((Callable)new ctt(this, k), true);
        }
        else if (this.e) {
            final Context context = this.getContext();
            cuq = cua.k(context, k, cua.n(context, k));
        }
        else {
            cuq = cua.k(this.getContext(), k, (String)null);
        }
        this.k(cuq);
    }
    
    public final void h(final String j) {
        this.j = j;
        this.k = 0;
        cuq cuq;
        if (this.isInEditMode()) {
            cuq = new cuq((Callable)new cty(this, j, 1), true);
        }
        else if (this.e) {
            cuq = cua.h(this.getContext(), j);
        }
        else {
            cuq = cua.i(this.getContext(), j, (String)null);
        }
        this.k(cuq);
    }
    
    public final void i(final String s) {
        cuq cuq;
        if (this.e) {
            cuq = cua.l(this.getContext(), s);
        }
        else {
            cuq = cua.m(this.getContext(), s, (String)null);
        }
        this.k(cuq);
    }
    
    public final void invalidateDrawable(final Drawable drawable) {
        final Drawable drawable2 = this.getDrawable();
        final cui d = this.d;
        if (drawable2 == d) {
            super.invalidateDrawable((Drawable)d);
            return;
        }
        super.invalidateDrawable(drawable);
    }
    
    public final void j(final ctv f) {
        this.d.setCallback((Drawable$Callback)this);
        this.f = f;
        this.o = true;
        final boolean r = this.d.r(f);
        this.o = false;
        this.u();
        if (this.getDrawable() == this.d) {
            if (!r) {
                return;
            }
        }
        else if (!r) {
            final boolean q = this.q();
            this.setImageDrawable((Drawable)null);
            this.setImageDrawable((Drawable)this.d);
            if (q) {
                this.d.k();
            }
        }
        this.onVisibilityChanged((View)this, this.getVisibility());
        this.requestLayout();
        final Iterator iterator = this.q.iterator();
        while (iterator.hasNext()) {
            ((cum)iterator.next()).a(f);
        }
    }
    
    public final void k(final cuq s) {
        this.f = null;
        this.d.h();
        this.t();
        s.e(this.g);
        s.d(this.h);
        this.s = s;
    }
    
    public final void l(final float n, final float n2) {
        this.d.n(n, n2);
    }
    
    public final void m(final float n) {
        this.d.o(n);
    }
    
    public final void n(final int n) {
        this.d.p(n);
    }
    
    public final void o(final int repeatMode) {
        this.d.b.setRepeatMode(repeatMode);
    }
    
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.isInEditMode() && (this.p || this.n)) {
            this.e();
            this.p = false;
            this.n = false;
        }
    }
    
    protected final void onDetachedFromWindow() {
        if (this.q()) {
            this.c();
            this.n = true;
        }
        super.onDetachedFromWindow();
    }
    
    protected final void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof LottieAnimationView$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final LottieAnimationView$SavedState lottieAnimationView$SavedState = (LottieAnimationView$SavedState)parcelable;
        super.onRestoreInstanceState(lottieAnimationView$SavedState.getSuperState());
        final String a = lottieAnimationView$SavedState.a;
        this.j = a;
        if (!TextUtils.isEmpty((CharSequence)a)) {
            this.h(this.j);
        }
        final int b = lottieAnimationView$SavedState.b;
        if ((this.k = b) != 0) {
            this.g(b);
        }
        this.m(lottieAnimationView$SavedState.c);
        if (lottieAnimationView$SavedState.d) {
            this.e();
        }
        this.d.h = lottieAnimationView$SavedState.e;
        this.o(lottieAnimationView$SavedState.f);
        this.n(lottieAnimationView$SavedState.g);
    }
    
    protected final Parcelable onSaveInstanceState() {
        final LottieAnimationView$SavedState lottieAnimationView$SavedState = new LottieAnimationView$SavedState(super.onSaveInstanceState());
        lottieAnimationView$SavedState.a = this.j;
        lottieAnimationView$SavedState.b = this.k;
        lottieAnimationView$SavedState.c = this.d.c();
        final boolean q = this.d.q();
        boolean d = true;
        if (!q) {
            d = (!anb.am((View)this) && this.n && d);
        }
        lottieAnimationView$SavedState.d = d;
        final cui d2 = this.d;
        lottieAnimationView$SavedState.e = d2.h;
        lottieAnimationView$SavedState.f = d2.b.getRepeatMode();
        lottieAnimationView$SavedState.g = this.d.e();
        return (Parcelable)lottieAnimationView$SavedState;
    }
    
    protected final void onVisibilityChanged(final View view, final int n) {
        if (!this.i) {
            return;
        }
        if (this.isShown()) {
            if (this.m) {
                this.f();
            }
            else if (this.l) {
                this.e();
            }
            this.m = false;
            this.l = false;
            return;
        }
        if (this.q()) {
            this.d();
            this.m = true;
        }
    }
    
    public final void p(final float b) {
        this.d.b.b = b;
    }
    
    public final boolean q() {
        return this.d.q();
    }
    
    public final void r(final int t) {
        this.t = t;
        this.u();
    }
    
    public final void s(final cum cum) {
        final ctv f = this.f;
        if (f != null) {
            cum.a(f);
        }
        this.q.add(cum);
    }
    
    public final void setImageBitmap(final Bitmap imageBitmap) {
        this.t();
        super.setImageBitmap(imageBitmap);
    }
    
    public final void setImageDrawable(final Drawable imageDrawable) {
        this.t();
        super.setImageDrawable(imageDrawable);
    }
    
    public final void setImageResource(final int imageResource) {
        this.t();
        super.setImageResource(imageResource);
    }
    
    public final void unscheduleDrawable(final Drawable drawable) {
        Label_0061: {
            if (!this.o) {
                final cui d = this.d;
                if (drawable == d && d.q()) {
                    this.d();
                    break Label_0061;
                }
            }
            if (!this.o && drawable instanceof cui) {
                final cui cui = (cui)drawable;
                if (cui.q()) {
                    cui.i();
                }
            }
        }
        super.unscheduleDrawable(drawable);
    }
}
