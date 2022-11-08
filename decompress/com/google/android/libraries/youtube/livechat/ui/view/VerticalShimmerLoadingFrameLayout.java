// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.livechat.ui.view;

import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.Animator$AnimatorListener;
import android.animation.TimeInterpolator;
import android.view.animation.LinearInterpolator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable$Orientation;
import android.util.AttributeSet;
import java.util.concurrent.TimeUnit;
import android.content.Context;
import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;

public class VerticalShimmerLoadingFrameLayout extends LoadingFrameLayout
{
    private static final long f;
    public View a;
    public View b;
    private final ValueAnimator g;
    private final Context h;
    private final View i;
    
    static {
        f = TimeUnit.SECONDS.toMillis(1L);
    }
    
    public VerticalShimmerLoadingFrameLayout(final Context context) {
        this(context, null);
    }
    
    public VerticalShimmerLoadingFrameLayout(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public VerticalShimmerLoadingFrameLayout(final Context h, final AttributeSet set, int orElse) {
        super(h, set, orElse);
        this.h = h;
        final View i = new View(h);
        (this.i = i).setBackgroundColor(tmy.ct(h, 2130969774).orElse(0));
        this.addView(i, -1, -1);
        (this.a = new View(h)).setBackgroundColor(tmy.ct(h, 2130969773).orElse(0));
        this.addView(this.a, -1, -1);
        final int orElse2 = tmy.ct(h, 2130969777).orElse(0);
        final int orElse3 = tmy.ct(h, 2130969776).orElse(0);
        orElse = tmy.ct(h, 2130969775).orElse(0);
        (this.b = new View(h)).setBackground((Drawable)new GradientDrawable(GradientDrawable$Orientation.BOTTOM_TOP, new int[] { orElse2, orElse3, orElse }));
        this.addView(this.b, -1, -1);
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[] { 0.0f, 1.0f });
        final long millis = TimeUnit.SECONDS.toMillis(30L);
        final long f = VerticalShimmerLoadingFrameLayout.f;
        ofFloat.setRepeatCount((int)(millis / f));
        ofFloat.setInterpolator((TimeInterpolator)new LinearInterpolator());
        ofFloat.setDuration(f);
        ofFloat.addListener((Animator$AnimatorListener)new wdw(this));
        ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new usg(this, 7));
        this.g = ofFloat;
        this.c();
    }
    
    private final void j() {
        this.d(true);
        if (this.getChildAt(this.getChildCount() - 1) != this.b) {
            this.bringChildToFront(this.i);
            this.bringChildToFront(this.a);
            this.bringChildToFront(this.b);
        }
        if (!this.g.isStarted()) {
            this.g.start();
        }
    }
    
    private final void k() {
        this.g.end();
    }
    
    public final void a() {
        if (this.a == null) {
            return;
        }
        this.k();
        super.a();
    }
    
    public final void b(final CharSequence charSequence, final boolean b) {
        if (this.a == null) {
            return;
        }
        this.k();
        super.b(charSequence, b);
    }
    
    public final void c() {
        if (this.a != null) {
            if (ana.am((View)this)) {
                this.j();
            }
        }
    }
    
    public final void d(final boolean b) {
        tmy.v(this.i, b);
        tmy.v(this.a, b);
        tmy.v(this.b, b);
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a != null) {
            if (super.e == 1) {
                this.j();
            }
        }
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.a == null) {
            return;
        }
        this.k();
    }
}
