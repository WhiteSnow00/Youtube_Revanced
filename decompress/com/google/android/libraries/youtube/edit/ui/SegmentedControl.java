// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.edit.ui;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.animation.Animator$AnimatorListener;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.TimeInterpolator;
import android.view.View$OnLayoutChangeListener;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.widget.LinearLayout$LayoutParams;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import java.util.ArrayList;
import android.util.AttributeSet;
import android.content.Context;
import android.animation.ObjectAnimator;
import java.util.List;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.FrameLayout;

public class SegmentedControl extends FrameLayout
{
    LinearLayout a;
    public final ImageView b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public usi g;
    public List h;
    private ObjectAnimator i;
    
    public SegmentedControl(final Context context) {
        this(context, null);
    }
    
    public SegmentedControl(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public SegmentedControl(final Context context, AttributeSet obtainStyledAttributes, int resourceId) {
        super(context, obtainStyledAttributes, resourceId);
        this.d = -1;
        this.h = new ArrayList();
        final ImageView b = new ImageView(this.getContext());
        (this.b = b).setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-2, -2));
        Label_0109: {
            if (obtainStyledAttributes != null) {
                obtainStyledAttributes = (AttributeSet)this.getContext().getTheme().obtainStyledAttributes(obtainStyledAttributes, ugk.b, 0, 0);
                try {
                    resourceId = ((TypedArray)obtainStyledAttributes).getResourceId(0, 0);
                    this.c = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(1, 0);
                    break Label_0109;
                }
                finally {
                    ((TypedArray)obtainStyledAttributes).recycle();
                }
            }
            resourceId = 0;
        }
        if (this.c == 0) {
            this.c = this.getResources().getDimensionPixelSize(2131169500);
        }
        int n;
        if (resourceId != 0) {
            n = resourceId;
        }
        else {
            resourceId = 2131233225;
            n = 0;
        }
        b.setImageResource(resourceId);
        b.setTag((Object)n);
        b.setVisibility(8);
        b.setId(2131431342);
        b.setTranslationY((float)this.c);
        this.addView((View)b);
        (this.a = new LinearLayout((Context)new ContextThemeWrapper(this.getContext(), 2132083534))).setOrientation(0);
        this.a.setId(2131431341);
        this.addView((View)this.a);
    }
    
    private final float g(final float n) {
        if (this.j()) {
            return 1.0f - n;
        }
        return n;
    }
    
    private final int h(final int n) {
        int n2 = n;
        if (this.j()) {
            n2 = -n;
        }
        return n2;
    }
    
    private final int i(final float n) {
        final int a = this.a();
        final boolean b = true;
        agot.D(a > 0);
        final int min = Math.min(this.a() - 1, (int)(n / this.getWidth() * this.a()));
        agot.D(min < this.a() && b);
        if (this.j()) {
            return this.a() - 1 - min;
        }
        return min;
    }
    
    private final boolean j() {
        return ana.f((View)this) == 1;
    }
    
    public final int a() {
        final LinearLayout a = this.a;
        if (a == null) {
            return 0;
        }
        return a.getChildCount();
    }
    
    public final void addView(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (view instanceof SegmentedControlSegment) {
            final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams(-2, -2);
            linearLayout$LayoutParams.weight = 1.0f;
            this.a.addView(view, n, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
            final SegmentedControlSegment segmentedControlSegment = (SegmentedControlSegment)view;
            segmentedControlSegment.setSaveEnabled(false);
            if (segmentedControlSegment.isChecked()) {
                segmentedControlSegment.post((Runnable)new upt(this, segmentedControlSegment, 6));
            }
            segmentedControlSegment.setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)new jqg(this, segmentedControlSegment, 3));
            if (this.a() == 1) {
                view.addOnLayoutChangeListener((View$OnLayoutChangeListener)new jbw(this, 18));
            }
            return;
        }
        if (view.getId() != 2131431341 && view.getId() != 2131431342) {
            throw new IllegalArgumentException("SegmentControl only supports children of type SegmentedControlSegment");
        }
        super.addView(view, n, viewGroup$LayoutParams);
    }
    
    public final SegmentedControlSegment b(final int n) {
        return (SegmentedControlSegment)this.a.getChildAt(n);
    }
    
    public final SegmentedControlSegment c() {
        final int d = this.d;
        if (d == -1) {
            return null;
        }
        return this.b(d);
    }
    
    public final void d(final int d, final boolean b, final boolean b2) {
        if (d >= 0 && d < this.a()) {
            this.f = true;
            for (int i = 0; i < this.a(); ++i) {
                final SegmentedControlSegment b3 = this.b(i);
                b3.setChecked(i == d);
                b3.setEnabled(i != d);
            }
            final int d2 = this.d;
            this.d = d;
            this.b.setVisibility(0);
            if (b && d2 != -1) {
                final ObjectAnimator j = this.i;
                if (j != null && j.isRunning()) {
                    this.i.cancel();
                }
                final int width = this.c().getWidth();
                (this.i = ObjectAnimator.ofFloat((Object)this.b, "translationX", new float[] { (float)this.h(d2 * width + this.c), (float)this.h(width * this.d + this.c) })).setInterpolator((TimeInterpolator)new atr());
                this.i.setDuration(300L);
                this.i.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new usg(this, 0));
                this.i.addListener((Animator$AnimatorListener)new ush(this));
                this.i.start();
            }
            else {
                this.b.setTranslationX((float)this.h(this.d * this.c().getWidth() + this.c));
                for (int k = 0; k < this.a(); ++k) {
                    if (k == this.d) {
                        this.b(k).a();
                    }
                    else {
                        this.b(k).b();
                    }
                }
            }
            final usi g = this.g;
            if (g != null && b2) {
                g.e(d, b);
            }
            this.f = false;
            return;
        }
        throw new IndexOutOfBoundsException("Invalid selection index");
    }
    
    public final void e(final SegmentedControlSegment segmentedControlSegment, final boolean b, final boolean b2) {
        for (int i = 0; i < this.a(); ++i) {
            if (this.b(i).equals(segmentedControlSegment)) {
                this.d(i, b, b2);
                return;
            }
        }
        final String value = String.valueOf(segmentedControlSegment);
        final StringBuilder sb = new StringBuilder("SegmentedControlSegment ");
        sb.append(value);
        sb.append(" is not contained by this view.");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final void f(float g) {
        final int a = this.a();
        if (a == 0) {
            return;
        }
        final float n = 1.0f / a;
        final float g2 = this.g(g / this.getWidth());
        final int i = this.i(g);
        final SegmentedControlSegment b = this.b(i);
        final boolean j = this.j();
        final int n2 = 0;
        int n3;
        if (j) {
            n3 = Math.max(0, i - 1);
        }
        else {
            n3 = Math.min(a - 1, i + 1);
        }
        final SegmentedControlSegment b2 = this.b(n3);
        g = this.g((g2 - i * n) / n);
        int k;
        if (g < 0.05f) {
            b.a();
            k = n2;
            if (i != n3) {
                b2.b();
                k = n2;
            }
        }
        else {
            b.c(g, -1.0f);
            b2.c(-1.0f, g);
            k = n2;
        }
        while (k < a) {
            if (k != i && k != n3) {
                this.b(k).b();
            }
            ++k;
        }
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        if (this.a() == 0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        final int action = motionEvent.getAction();
        if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
            }
            else {
                this.e = true;
                final int i = this.i(motionEvent.getX());
                if (this.d != i) {
                    this.d(i, true, true);
                    return super.onInterceptTouchEvent(motionEvent);
                }
                return super.onInterceptTouchEvent(motionEvent);
            }
        }
        this.e = false;
        return super.onInterceptTouchEvent(motionEvent);
    }
    
    public final void onRestoreInstanceState(final Parcelable parcelable) {
        Parcelable parcelable2 = parcelable;
        if (parcelable instanceof Bundle) {
            final Bundle bundle = (Bundle)parcelable;
            this.post((Runnable)new wlr(this, bundle.getInt("VISIBILITY"), bundle.getInt("SELECTED_SPEED_INDEX"), 1));
            parcelable2 = bundle.getParcelable("SUPER_STATE");
        }
        super.onRestoreInstanceState(parcelable2);
    }
    
    public final Parcelable onSaveInstanceState() {
        final Bundle bundle = new Bundle();
        bundle.putParcelable("SUPER_STATE", super.onSaveInstanceState());
        bundle.putInt("SELECTED_SPEED_INDEX", this.d);
        bundle.putInt("VISIBILITY", this.getVisibility());
        return (Parcelable)bundle;
    }
}
