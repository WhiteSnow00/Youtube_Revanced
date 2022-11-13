// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.appbar;

import java.util.List;
import android.widget.ImageView;
import java.util.Comparator;
import java.util.Collection;
import java.util.Collections;
import android.widget.TextView;
import android.view.View$MeasureSpec;
import android.util.Pair;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ImageView$ScaleType;
import android.support.v7.widget.Toolbar;

public class MaterialToolbar extends Toolbar
{
    private static final ImageView$ScaleType[] z;
    private Integer A;
    private boolean B;
    private boolean C;
    private ImageView$ScaleType D;
    private Boolean E;
    
    static {
        z = new ImageView$ScaleType[] { ImageView$ScaleType.MATRIX, ImageView$ScaleType.FIT_XY, ImageView$ScaleType.FIT_START, ImageView$ScaleType.FIT_CENTER, ImageView$ScaleType.FIT_END, ImageView$ScaleType.CENTER, ImageView$ScaleType.CENTER_CROP, ImageView$ScaleType.CENTER_INSIDE };
    }
    
    public MaterialToolbar(final Context context) {
        this(context, null);
    }
    
    public MaterialToolbar(final Context context, final AttributeSet set) {
        this(context, set, 2130970692);
    }
    
    public MaterialToolbar(Context context, final AttributeSet set, int n) {
        super(aeba.a(context, set, n, 2132085268), set, n);
        context = this.getContext();
        final int[] e = adsz.e;
        final int n2 = 0;
        final TypedArray a = adwh.a(context, set, e, n, 2132085268, new int[0]);
        if (a.hasValue(2)) {
            this.A = a.getColor(2, -1);
            final Drawable e2 = this.e();
            if (e2 != null) {
                this.s(e2);
            }
        }
        this.B = a.getBoolean(4, false);
        this.C = a.getBoolean(3, false);
        n = a.getInt(1, -1);
        if (n >= 0 && n < 8) {
            this.D = MaterialToolbar.z[n];
        }
        if (a.hasValue(0)) {
            this.E = a.getBoolean(0, false);
        }
        a.recycle();
        final Drawable background = this.getBackground();
        if (background != null && !(background instanceof ColorDrawable)) {
            return;
        }
        final adyh adyh = new adyh();
        n = n2;
        if (background != null) {
            n = ((ColorDrawable)background).getColor();
        }
        adyh.o(ColorStateList.valueOf(n));
        adyh.m(context);
        adyh.n(anb.a((View)this));
        anb.Q((View)this, (Drawable)adyh);
    }
    
    private final void K(final View view, final Pair pair) {
        final int n = this.getMeasuredWidth() / 2;
        final int measuredWidth = view.getMeasuredWidth();
        final int n2 = n - measuredWidth / 2;
        final int n3 = measuredWidth + n2;
        final int max = Math.max(Math.max((int)pair.first - n2, 0), Math.max(n3 - (int)pair.second, 0));
        int n4 = n2;
        int n5 = n3;
        if (max > 0) {
            n4 = n2 + max;
            n5 = n3 - max;
            view.measure(View$MeasureSpec.makeMeasureSpec(n5 - n4, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(n4, view.getTop(), n5, view.getBottom());
    }
    
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        adyf.f((View)this);
    }
    
    protected final void onLayout(final boolean b, int n, int paddingLeft, int n2, int i) {
        super.onLayout(b, n, paddingLeft, n2, i);
        final boolean b2 = this.B;
        final int n3 = 0;
        final ImageView imageView = null;
        if (b2 || this.C) {
            final List a = adwi.a((Toolbar)this, super.o);
            Object o;
            if (a.isEmpty()) {
                o = null;
            }
            else {
                o = Collections.min((Collection<? extends TextView>)a, (Comparator<? super TextView>)adwi.a);
            }
            final List a2 = adwi.a((Toolbar)this, super.p);
            Object o2;
            if (a2.isEmpty()) {
                o2 = null;
            }
            else {
                o2 = Collections.max((Collection<? extends TextView>)a2, (Comparator<? super TextView>)adwi.a);
            }
            if (o != null || o2 != null) {
                n = this.getMeasuredWidth();
                final int n4 = n / 2;
                paddingLeft = this.getPaddingLeft();
                n2 = n - this.getPaddingRight();
                View child;
                int n5;
                int left;
                for (i = 0; i < this.getChildCount(); ++i, paddingLeft = n5, n2 = left) {
                    child = this.getChildAt(i);
                    n5 = paddingLeft;
                    left = n2;
                    if (child.getVisibility() != 8) {
                        n5 = paddingLeft;
                        left = n2;
                        if (child != o) {
                            n5 = paddingLeft;
                            left = n2;
                            if (child != o2) {
                                n = paddingLeft;
                                if (child.getRight() < n4 && child.getRight() > (n = paddingLeft)) {
                                    n = child.getRight();
                                }
                                n5 = n;
                                left = n2;
                                if (child.getLeft() > n4) {
                                    n5 = n;
                                    if (child.getLeft() < (left = n2)) {
                                        left = child.getLeft();
                                        n5 = n;
                                    }
                                }
                            }
                        }
                    }
                }
                final Pair pair = new Pair((Object)paddingLeft, (Object)n2);
                if (this.B && o != null) {
                    this.K((View)o, pair);
                }
                if (this.C && o2 != null) {
                    this.K((View)o2, pair);
                }
            }
        }
        final ImageView b3 = super.b;
        Drawable drawable;
        if (b3 != null) {
            drawable = b3.getDrawable();
        }
        else {
            drawable = null;
        }
        n = n3;
        ImageView imageView2;
        if (drawable == null) {
            imageView2 = imageView;
        }
        else {
            while (true) {
                imageView2 = imageView;
                if (n >= this.getChildCount()) {
                    break;
                }
                final View child2 = this.getChildAt(n);
                if (child2 instanceof ImageView) {
                    imageView2 = (ImageView)child2;
                    final Drawable drawable2 = imageView2.getDrawable();
                    if (drawable2 != null && drawable2.getConstantState() != null && drawable2.getConstantState().equals(drawable.getConstantState())) {
                        break;
                    }
                }
                ++n;
            }
        }
        if (imageView2 != null) {
            final Boolean e = this.E;
            if (e != null) {
                imageView2.setAdjustViewBounds((boolean)e);
            }
            final ImageView$ScaleType d = this.D;
            if (d != null) {
                imageView2.setScaleType(d);
            }
        }
    }
    
    public final void s(final Drawable drawable) {
        Drawable mutate = drawable;
        if (drawable != null) {
            mutate = drawable;
            if (this.A != null) {
                mutate = drawable.mutate();
                aiq.f(mutate, (int)this.A);
            }
        }
        super.s(mutate);
    }
    
    public final void setElevation(final float elevation) {
        super.setElevation(elevation);
        adyf.e((View)this, elevation);
    }
}
