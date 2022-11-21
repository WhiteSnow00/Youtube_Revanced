// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.offline.ui;

import android.graphics.drawable.AnimationDrawable;
import android.content.res.TypedArray;
import android.content.res.Resources;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import android.widget.FrameLayout$LayoutParams;
import android.widget.ProgressBar;
import android.widget.ImageView$ScaleType;
import com.google.android.apps.youtube.app.common.widget.TintableImageView;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.libraries.youtube.common.ui.CircularImageView;
import android.content.res.ColorStateList;

public class OfflineArrowView extends iop
{
    public int a;
    public int b;
    public ColorStateList c;
    public int d;
    private CircularImageView p;
    private Drawable q;
    private int r;
    private int s;
    
    public OfflineArrowView(final Context context) {
        super(context);
        this.d = 1;
        this.n(ume.P(context, (AttributeSet)null, 0), null);
    }
    
    public OfflineArrowView(final Context context, final AttributeSet set) {
        super(context, set);
        this.d = 1;
        this.n(ume.P(context, set, 0), set);
    }
    
    public OfflineArrowView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.d = 1;
        this.n(ume.P(context, set, 0), set);
    }
    
    public OfflineArrowView(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.d = 1;
        this.n(ume.P(context, set, 0), set);
    }
    
    private final void n(final Context context, final AttributeSet set) {
        final Resources resources = context.getResources();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, ioo.a);
        this.k = obtainStyledAttributes.getResourceId(2, 2131233724);
        this.r = obtainStyledAttributes.getResourceId(8, 2131231849);
        this.s = obtainStyledAttributes.getResourceId(0, 2131231840);
        this.l = obtainStyledAttributes.getResourceId(1, 2131233521);
        this.a = obtainStyledAttributes.getResourceId(4, 2131231852);
        this.b = obtainStyledAttributes.getResourceId(7, 2131232857);
        this.m = obtainStyledAttributes.getResourceId(5, 2131231832);
        this.c = obtainStyledAttributes.getColorStateList(6);
        this.o = obtainStyledAttributes.getColorStateList(3);
        obtainStyledAttributes.recycle();
        this.j = agy.a(context, 2131232387);
        this.q = agy.a(context, 2131232388);
        final ColorStateList c = this.c;
        int n;
        if (c != null) {
            n = c.getDefaultColor();
            air.g(this.j, this.c);
        }
        else {
            n = resources.getColor(2131101589);
        }
        (this.f = new TintableImageView(context)).setScaleType(ImageView$ScaleType.CENTER);
        this.f();
        (this.e = new ProgressBar(context, (AttributeSet)null, 16842872)).setProgressDrawable(this.j);
        this.e.setRotation(-90.0f);
        final ProgressBar g = new ProgressBar(context);
        (this.g = g).setIndeterminateDrawable((Drawable)new pev(-1.0f, resources.getDimensionPixelSize(2131168397), resources.getDimensionPixelSize(2131168395), new int[] { n }));
        g.setVisibility(8);
        final int dimensionPixelSize = resources.getDimensionPixelSize(2131168396);
        final FrameLayout$LayoutParams frameLayout$LayoutParams = new FrameLayout$LayoutParams(dimensionPixelSize, dimensionPixelSize, 17);
        final CircularImageView p2 = new CircularImageView(context, null);
        (this.p = p2).setBackgroundColor(context.getResources().getColor(2131102368));
        final int dimensionPixelSize2 = resources.getDimensionPixelSize(2131168393);
        final FrameLayout$LayoutParams frameLayout$LayoutParams2 = new FrameLayout$LayoutParams(dimensionPixelSize2, dimensionPixelSize2, 17);
        final LottieAnimationView i = new LottieAnimationView(context);
        (this.i = i).g(2131951681);
        i.n(-1);
        final int dimensionPixelSize3 = resources.getDimensionPixelSize(2131168376);
        final FrameLayout$LayoutParams frameLayout$LayoutParams3 = new FrameLayout$LayoutParams(dimensionPixelSize3, dimensionPixelSize3, 17);
        this.addView((View)p2, (ViewGroup$LayoutParams)frameLayout$LayoutParams2);
        this.addView((View)g, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
        this.addView((View)this.e, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
        this.addView((View)i, (ViewGroup$LayoutParams)frameLayout$LayoutParams3);
        this.addView((View)this.f, (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-2, -2, 17));
    }
    
    private final void o() {
        final CircularImageView p = this.p;
        if (p != null && ((View)p).getVisibility() == 0) {
            ((View)p).setVisibility(8);
        }
        this.k();
    }
    
    private final void p(final int n, final boolean b) {
        final AnimationDrawable h = this.h;
        final TintableImageView f = this.f;
        this.o();
        this.n = n;
        if (h != null) {
            h.stop();
        }
        this.a(n, b);
        if (f != null) {
            f.setImageResource(n);
        }
    }
    
    public final void a(final int n, final boolean b) {
        final TintableImageView f = this.f;
        final ColorStateList c = this.c;
        if (f == null) {
            return;
        }
        if (c != null) {
            f.a(c);
            return;
        }
        if (b) {
            final ColorStateList o = this.o;
            if (o != null) {
                f.a(o);
                return;
            }
        }
        if (n == this.k) {
            f.a(TintableImageView.a);
            return;
        }
        if (n == this.l) {
            f.a(ColorStateList.valueOf(tqf.cr(this.getContext(), 2130970922)));
            return;
        }
        f.a((ColorStateList)null);
    }
    
    public final void b(final ColorStateList c) {
        this.c = c;
        this.a(super.n, true);
    }
    
    public final void c(final int n) {
        this.p(n, true);
    }
    
    public final void d(final int n) {
        this.p(n, false);
    }
    
    public final void e() {
        this.c(this.l);
    }
    
    public final void f() {
        this.c(this.k);
    }
    
    public final void g() {
        if (this.d == 2) {
            this.d(2131231838);
            tqf.v((View)this.p, true);
        }
    }
    
    public final void h() {
        if (this.d == 2) {
            final TintableImageView f = this.f;
            final LottieAnimationView i = this.i;
            final CircularImageView p = this.p;
            tqf.v((View)f, false);
            tqf.v((View)i, true);
            tqf.v((View)p, true);
            if (i != null && !i.q()) {
                i.e();
            }
        }
        else {
            this.o();
            final TintableImageView f2 = this.f;
            AnimationDrawable h;
            if ((h = this.h) == null) {
                final Drawable a = agy.a(this.getContext(), this.s);
                a.getClass();
                h = (AnimationDrawable)a;
                this.h = h;
            }
            this.a(this.s, false);
            if (f2 != null) {
                f2.setImageDrawable((Drawable)h);
            }
            this.n = this.s;
            if (!h.isRunning()) {
                h.start();
            }
        }
    }
    
    public final void i() {
        final CircularImageView p = this.p;
        if (this.d == 2) {
            this.d(2131231850);
            tqf.v((View)p, true);
            return;
        }
        this.d(this.r);
    }
    
    public final void j(final int progress) {
        final ProgressBar e = this.e;
        final ProgressBar g = this.g;
        final int d = this.d;
        if (e != null) {
            if (d == 2) {
                e.setProgressDrawable(this.q);
            }
            else {
                this.o();
                e.setProgressDrawable(this.j);
            }
            tqf.v((View)e, true);
            tqf.v((View)g, false);
            e.setMax(100);
            e.setProgress(progress);
        }
    }
}
