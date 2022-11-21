// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.edit.ui;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.view.View$AccessibilityDelegate;
import android.util.AttributeSet;
import android.content.Context;

public class SegmentedControlSegment extends ln
{
    private float a;
    private float b;
    private int c;
    private int d;
    
    public SegmentedControlSegment(final Context context) {
        super(context);
        this.a = -1.0f;
        this.b = -1.0f;
        this.c = 0;
        this.d = 0;
        this.d(null);
    }
    
    public SegmentedControlSegment(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = -1.0f;
        this.b = -1.0f;
        this.c = 0;
        this.d = 0;
        this.d(set);
    }
    
    public SegmentedControlSegment(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a = -1.0f;
        this.b = -1.0f;
        this.c = 0;
        this.d = 0;
        this.d(set);
    }
    
    private final void d(AttributeSet obtainStyledAttributes) {
        if (obtainStyledAttributes != null) {
            obtainStyledAttributes = (AttributeSet)this.getContext().getTheme().obtainStyledAttributes(obtainStyledAttributes, ujr.c, 0, 0);
            try {
                this.c = ((TypedArray)obtainStyledAttributes).getColor(1, 0);
                this.d = ((TypedArray)obtainStyledAttributes).getColor(0, 0);
            }
            finally {
                ((TypedArray)obtainStyledAttributes).recycle();
            }
        }
        this.setAccessibilityDelegate((View$AccessibilityDelegate)new uvh());
    }
    
    public final void a() {
        this.c(0.0f, 1.0f);
    }
    
    public final void b() {
        this.c(-1.0f, -1.0f);
    }
    
    public final void c(final float a, final float b) {
        if (a == this.a && b == this.b) {
            return;
        }
        this.a = a;
        this.b = b;
        this.invalidate();
    }
    
    public final void draw(final Canvas canvas) {
        final int c = this.c;
        if (c != 0 && this.d != 0 && (this.a != -1.0f || this.b != -1.0f)) {
            final float n = (float)this.getWidth();
            final float n2 = (float)this.getHeight();
            final float a = this.a;
            float n3;
            if (a != -1.0f) {
                n3 = a * n;
            }
            else {
                n3 = 0.0f;
            }
            final float b = this.b;
            float n4;
            if (b != -1.0f) {
                n4 = b * n;
            }
            else {
                n4 = n;
            }
            if (n3 > 0.0f) {
                canvas.save();
                this.setTextColor(this.c);
                canvas.clipRect(0.0f, 0.0f, n3, n2);
                super.draw(canvas);
                canvas.restore();
            }
            canvas.save();
            this.setTextColor(this.d);
            canvas.clipRect(n3, 0.0f, n4, n2);
            super.draw(canvas);
            canvas.restore();
            if (n4 < n) {
                canvas.save();
                this.setTextColor(this.c);
                canvas.clipRect(n4, 0.0f, n, n2);
                super.draw(canvas);
                canvas.restore();
            }
            return;
        }
        if (c != 0) {
            this.setTextColor(c);
        }
        super.draw(canvas);
    }
}
