// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.setupdesign.view;

import android.view.ViewGroup$LayoutParams;
import android.view.Display;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.os.Build$VERSION;
import android.view.WindowInsets;
import android.content.res.TypedArray;
import android.view.View$MeasureSpec;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;
import android.widget.FrameLayout;

public class IntrinsicSizeFrameLayout extends FrameLayout
{
    private int a;
    private int b;
    private Object c;
    private final Rect d;
    
    public IntrinsicSizeFrameLayout(final Context context) {
        super(context);
        this.a = 0;
        this.b = 0;
        this.d = new Rect();
        this.b(context, null, 0);
    }
    
    public IntrinsicSizeFrameLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = 0;
        this.b = 0;
        this.d = new Rect();
        this.b(context, set, 0);
    }
    
    public IntrinsicSizeFrameLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a = 0;
        this.b = 0;
        this.d = new Rect();
        this.b(context, set, n);
    }
    
    private final int a(int measureSpec, int mode) {
        if (mode <= 0) {
            return measureSpec;
        }
        mode = View$MeasureSpec.getMode(measureSpec);
        final int size = View$MeasureSpec.getSize(measureSpec);
        if (mode == 0) {
            return View$MeasureSpec.makeMeasureSpec(this.a, 1073741824);
        }
        if (mode == Integer.MIN_VALUE) {
            measureSpec = View$MeasureSpec.makeMeasureSpec(Math.min(size, this.a), 1073741824);
        }
        return measureSpec;
    }
    
    private final void b(final Context context, final AttributeSet set, final int n) {
        if (this.isInEditMode()) {
            return;
        }
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, aefr.l, n, 0);
        this.a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.b = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        if (aefb.q()) {
            if (aefe.f(context).l(aefc.aL)) {
                this.a = (int)aefe.f(context).a(context, aefc.aL);
            }
            if (aefe.f(context).l(aefc.aK)) {
                this.b = (int)aefe.f(context).a(context, aefc.aK);
            }
        }
    }
    
    public final WindowInsets onApplyWindowInsets(final WindowInsets c) {
        this.c = c;
        return super.onApplyWindowInsets(c);
    }
    
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.c == null) {
            this.requestApplyInsets();
        }
    }
    
    protected final void onMeasure(int n, final int n2) {
        Label_0120: {
            if (Build$VERSION.SDK_INT >= 31) {
                this.d.set(((WindowManager)this.getContext().getSystemService((Class)WindowManager.class)).getCurrentWindowMetrics().getBounds());
                final Display display = this.getDisplay();
                if (display != null) {
                    final DisplayMetrics displayMetrics = new DisplayMetrics();
                    display.getRealMetrics(displayMetrics);
                    if (this.d.width() > 0 && this.d.width() < displayMetrics.widthPixels) {
                        this.getWindowVisibleDisplayFrame(this.d);
                        n = View$MeasureSpec.makeMeasureSpec(this.d.width(), 1073741824);
                        break Label_0120;
                    }
                }
            }
            n = this.a(n, this.b);
        }
        super.onMeasure(n, this.a(n2, this.a));
    }
    
    public final void setLayoutParams(final ViewGroup$LayoutParams layoutParams) {
        if (aefb.q() && this.a == 0 && this.b == 0) {
            layoutParams.width = -1;
            layoutParams.height = -1;
        }
        super.setLayoutParams(layoutParams);
    }
}
