// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.setupdesign.view;

import android.view.ViewOutlineProvider;
import android.view.View$MeasureSpec;
import android.view.Gravity;
import android.graphics.Canvas;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;

public class Illustration extends FrameLayout
{
    private float a;
    private Drawable b;
    private Drawable c;
    private final Rect d;
    private final Rect e;
    private float f;
    private float g;
    
    public Illustration(final Context context) {
        super(context);
        this.d = new Rect();
        this.e = new Rect();
        this.f = 1.0f;
        this.g = 0.0f;
        this.a(null, 0);
    }
    
    public Illustration(final Context context, final AttributeSet set) {
        super(context, set);
        this.d = new Rect();
        this.e = new Rect();
        this.f = 1.0f;
        this.g = 0.0f;
        this.a(set, 0);
    }
    
    public Illustration(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.d = new Rect();
        this.e = new Rect();
        this.f = 1.0f;
        this.g = 0.0f;
        this.a(set, n);
    }
    
    private final void a(final AttributeSet set, final int n) {
        if (this.isInEditMode()) {
            return;
        }
        if (set != null) {
            final TypedArray obtainStyledAttributes = this.getContext().obtainStyledAttributes(set, aedq.j, n, 0);
            this.g = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }
        this.a = this.getResources().getDisplayMetrics().density * 8.0f;
        this.setWillNotDraw(false);
    }
    
    private static final boolean b(final Drawable drawable, final int n) {
        return n == 1 && drawable.isAutoMirrored();
    }
    
    public final void onDraw(final Canvas canvas) {
        if (this.b != null) {
            canvas.save();
            canvas.translate(0.0f, (float)this.e.height());
            final float f = this.f;
            canvas.scale(f, f, 0.0f, 0.0f);
            if (b(this.b, this.getLayoutDirection())) {
                canvas.scale(-1.0f, 1.0f);
                canvas.translate((float)(-this.b.getBounds().width()), 0.0f);
            }
            this.b.draw(canvas);
            canvas.restore();
        }
        if (this.c != null) {
            canvas.save();
            if (b(this.c, this.getLayoutDirection())) {
                canvas.scale(-1.0f, 1.0f);
                canvas.translate((float)(-this.e.width()), 0.0f);
            }
            this.c.draw(canvas);
            canvas.restore();
        }
        super.onDraw(canvas);
    }
    
    protected final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        final int n5 = n3 - n;
        final int n6 = n4 - n2;
        final Drawable c = this.c;
        if (c != null) {
            final int intrinsicWidth = c.getIntrinsicWidth();
            final int intrinsicHeight = this.c.getIntrinsicHeight();
            this.d.set(0, 0, n5, n6);
            int n7 = intrinsicWidth;
            int n8 = intrinsicHeight;
            if (this.g != 0.0f) {
                final float f = n5 / (float)intrinsicWidth;
                this.f = f;
                n8 = (int)(intrinsicHeight * f);
                n7 = n5;
            }
            Gravity.apply(55, n7, n8, this.d, this.e);
            this.c.setBounds(this.e);
        }
        final Drawable b2 = this.b;
        if (b2 != null) {
            b2.setBounds(0, 0, (int)Math.ceil(n5 / this.f), (int)Math.ceil((n6 - this.e.height()) / this.f));
        }
        super.onLayout(b, n, n2, n3, n4);
    }
    
    protected final void onMeasure(final int n, final int n2) {
        if (this.g != 0.0f) {
            final float n3 = (float)(int)(View$MeasureSpec.getSize(n) / this.g);
            this.setPadding(0, (int)(n3 - n3 % this.a), 0, 0);
        }
        this.setOutlineProvider(ViewOutlineProvider.BOUNDS);
        super.onMeasure(n, n2);
    }
    
    public final void setBackgroundDrawable(final Drawable b) {
        if (b == this.b) {
            return;
        }
        this.b = b;
        this.invalidate();
        this.requestLayout();
    }
    
    @Deprecated
    public final void setForeground(final Drawable c) {
        if (c == this.c) {
            return;
        }
        this.c = c;
        this.invalidate();
        this.requestLayout();
    }
}
