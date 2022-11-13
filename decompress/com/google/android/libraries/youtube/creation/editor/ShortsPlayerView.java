// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.creation.editor;

import android.animation.ValueAnimator;
import android.view.ViewParent;
import android.animation.Animator;
import android.animation.Animator$AnimatorListener;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;
import android.graphics.Matrix$ScaleToFit;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.View$MeasureSpec;
import android.widget.ImageView$ScaleType;
import android.view.ViewGroup;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.RelativeLayout;
import android.widget.FrameLayout;

public class ShortsPlayerView extends FrameLayout
{
    public final ShortsPlayerTextureView a;
    public final RelativeLayout b;
    public final ShortsPlayerImageView c;
    public final tyj d;
    final FrameLayout e;
    public txz f;
    public uon g;
    public float h;
    public boolean i;
    public tyn j;
    public float k;
    public float l;
    public boolean m;
    public boolean n;
    public double o;
    public double p;
    public azf q;
    public uml r;
    public aujg s;
    private int t;
    private int u;
    private boolean v;
    
    public ShortsPlayerView(final Context context) {
        this(context, null);
    }
    
    public ShortsPlayerView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public ShortsPlayerView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.h = 0.0f;
        this.v = true;
        this.m = false;
        this.n = false;
        View.inflate(context, 2131625416, (ViewGroup)this);
        final View viewById = this.findViewById(2131432343);
        viewById.getClass();
        this.a = (ShortsPlayerTextureView)viewById;
        final RelativeLayout b = (RelativeLayout)this.findViewById(2131431501);
        b.getClass();
        this.b = b;
        final View viewById2 = this.findViewById(2131429172);
        viewById2.getClass();
        (this.c = (ShortsPlayerImageView)viewById2).setScaleType(ImageView$ScaleType.MATRIX);
        this.findViewById(2131430625);
        final FrameLayout e = (FrameLayout)this.findViewById(2131432333);
        this.e = e;
        this.d = new tyj((View)e);
    }
    
    public static final float i(final float n, final float n2, final float n3) {
        return Math.max(0.0f, (n3 - Math.abs(n) - n2) / n3);
    }
    
    public static final float j(final float n, final float n2) {
        return Math.abs(n) / n2;
    }
    
    private final void k(final int n, final int n2) {
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(n, 1073741824);
        final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(n2, 1073741824);
        for (int i = 0; i < this.getChildCount(); ++i) {
            final View child = this.getChildAt(i);
            if (child.getVisibility() != 8) {
                this.measureChildWithMargins(child, measureSpec, 0, measureSpec2, 0);
            }
        }
        this.setMeasuredDimension(View$MeasureSpec.makeMeasureSpec(n, 1073741824), View$MeasureSpec.makeMeasureSpec(n2, 1073741824));
    }
    
    public final void a() {
        this.d.a();
    }
    
    public final void b(final float n, final int gravity) {
        final FrameLayout$LayoutParams layoutParams = (FrameLayout$LayoutParams)this.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.gravity = gravity;
            this.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        }
        final RectF rectF = new RectF(0.0f, 0.0f, (float)this.getWidth(), (float)this.getHeight());
        final RectF rectF2 = new RectF(0.0f, 0.0f, (float)this.getWidth(), n);
        final Matrix matrix = new Matrix();
        matrix.setRectToRect(rectF, rectF2, Matrix$ScaleToFit.CENTER);
        this.a.setTransform(matrix);
        this.a.invalidate();
        this.c.setImageMatrix(matrix);
        final ViewGroup$LayoutParams layoutParams2 = this.e.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = (int)n;
            this.e.setLayoutParams(layoutParams2);
        }
    }
    
    public final void c(final boolean b) {
        if (b) {
            final tyj d = this.d;
            if (!d.f) {
                d.a();
                final View d2 = d.d;
                d.e = new AnimatorSet();
                final AnimatorSet e = d.e;
                final ObjectAnimator setDuration = ObjectAnimator.ofFloat((Object)d2, View.ALPHA, new float[] { 0.0f, 1.0f }).setDuration(300L);
                ((ValueAnimator)setDuration).addListener((Animator$AnimatorListener)new tyg(d2));
                ((ValueAnimator)setDuration).setInterpolator(tyj.a);
                e.play((Animator)setDuration);
                d.e.start();
                d.f = true;
            }
        }
        else {
            final tyj d3 = this.d;
            if (d3.f) {
                if (d3.e.isRunning()) {
                    d3.e.end();
                }
                final View d4 = d3.d;
                d3.e = new AnimatorSet();
                final AnimatorSet e2 = d3.e;
                final ObjectAnimator setDuration2 = ObjectAnimator.ofFloat((Object)d4, View.ALPHA, new float[] { 1.0f, 0.0f }).setDuration(300L);
                ((ValueAnimator)setDuration2).addListener((Animator$AnimatorListener)new tyh(d4));
                ((ValueAnimator)setDuration2).setInterpolator(tyj.a);
                e2.play((Animator)setDuration2);
                d3.e.start();
                d3.f = false;
            }
        }
    }
    
    public final void d(final float n) {
        this.a.setTranslationX(n);
        this.c.setTranslationX(n);
    }
    
    public final void e(final float n) {
        this.a.setTranslationY(n);
        this.c.setTranslationY(n);
    }
    
    public final void f(final float a) {
        if (this.h == 0.0f) {
            this.h = a;
            final ShortsPlayerTextureView a2 = this.a;
            a2.a = a;
            a2.requestLayout();
            final ShortsPlayerImageView c = this.c;
            c.a = a;
            c.requestLayout();
            this.requestLayout();
            return;
        }
        ttr.b("Changing the video aspect ratio after it's initialized is not allowed");
    }
    
    public final void g() {
        final uon g = this.g;
        if (g != null) {
            if (!this.i) {
                if (this.h != 0.0f) {
                    g.B();
                    this.i = true;
                    final ViewParent parent = this.getParent();
                    if (this.s != null && parent instanceof ShortsPlayerViewContainer) {
                        ((ShortsPlayerViewContainer)parent).a = true;
                    }
                }
            }
        }
    }
    
    public final boolean h() {
        final tyn j = this.j;
        return j != null && j.b;
    }
    
    public final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        if (this.v && this.h() && this.h != 0.0f) {
            this.g();
            this.v = false;
            final double o = this.o;
            final double n5 = this.a.getWidth();
            Double.isNaN(n5);
            this.d((float)(-(o * n5)));
            final double p5 = this.p;
            final double n6 = this.a.getHeight();
            Double.isNaN(n6);
            this.e((float)(-(p5 * n6)));
        }
    }
    
    protected final void onMeasure(int n, int n2) {
        final tyn j = this.j;
        if (j != null && j.b) {
            if (this.h == 0.0f) {
                super.onMeasure(n, n2);
                return;
            }
            if (this.s != null && this.i) {
                this.k(this.t, this.u);
                return;
            }
            n = View$MeasureSpec.getSize(n);
            n2 = View$MeasureSpec.getSize(n2);
            this.k(this.t = n, this.u = n2);
        }
        else {
            super.onMeasure(n, n2);
            if (this.h == 0.0f) {
                return;
            }
            if (this.s != null && this.i) {
                super.onMeasure(View$MeasureSpec.makeMeasureSpec(this.t, 1073741824), View$MeasureSpec.makeMeasureSpec(this.u, 1073741824));
                return;
            }
            final int measuredWidth = this.getMeasuredWidth();
            final int measuredHeight = this.getMeasuredHeight();
            final float n3 = (float)measuredWidth;
            final float n4 = (float)measuredHeight;
            final float h = this.h;
            if (h > n3 / n4) {
                n = Math.round(n3 / h);
                n2 = measuredWidth;
            }
            else {
                n2 = Math.round(n4 * h);
                n = measuredHeight;
            }
            if (n2 == measuredWidth && n == measuredHeight) {
                this.g();
            }
            this.t = n2;
            this.u = n;
            super.onMeasure(View$MeasureSpec.makeMeasureSpec(n2, 1073741824), View$MeasureSpec.makeMeasureSpec(n, 1073741824));
        }
    }
}
