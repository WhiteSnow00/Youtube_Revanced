// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.common.ui;

import android.graphics.Path$Direction;
import android.view.View;
import android.graphics.Canvas;
import android.content.res.TypedArray;
import android.util.DisplayMetrics;
import android.graphics.Paint$Style;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.LinearLayout;

public class RoundedLinearLayout extends LinearLayout
{
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final RectF e;
    private final Path f;
    private final Paint g;
    private float[] h;
    
    public RoundedLinearLayout(final Context context) {
        this(context, null);
    }
    
    public RoundedLinearLayout(final Context context, final AttributeSet set) {
        super(context, set);
        final DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, trt.f);
        final int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(6, tqf.aZ(displayMetrics, 16));
        this.e = new RectF();
        this.f = new Path();
        this.a = obtainStyledAttributes.getDimensionPixelSize(5, dimensionPixelSize);
        this.b = obtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.c = obtainStyledAttributes.getDimensionPixelSize(2, dimensionPixelSize);
        this.d = obtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        final int color = obtainStyledAttributes.getColor(0, 0);
        final int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        if (color != 0 && dimensionPixelSize2 > 0) {
            final Paint g = new Paint();
            (this.g = g).setColor(color);
            g.setStrokeWidth((float)dimensionPixelSize2);
            g.setStyle(Paint$Style.STROKE);
            return;
        }
        this.g = null;
    }
    
    protected final float a() {
        return (float)this.c;
    }
    
    protected final float b() {
        return (float)this.b;
    }
    
    protected final float c() {
        return (float)this.d;
    }
    
    protected final float d() {
        return (float)this.a;
    }
    
    public final void draw(final Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f);
        super.draw(canvas);
        final Paint g = this.g;
        if (g != null) {
            canvas.drawPath(this.f, g);
        }
        canvas.restore();
    }
    
    protected final void onSizeChanged(int n, int n2, int n3, int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        if (n != 0) {
            if (n2 != 0) {
                final int f = anc.f((View)this);
                n4 = 0;
                if (f == 0) {
                    n3 = 0;
                }
                else {
                    n3 = 1;
                }
                this.e.set(0.0f, 0.0f, (float)n, (float)n2);
                this.f.reset();
                if (this.h == null) {
                    this.h = new float[8];
                }
                n = n3 + n3;
                final float[] h = this.h;
                h[n] = this.d();
                h[n + 1] = this.d();
                n = n4;
                if (f == 0) {
                    n = 1;
                }
                final float b = this.b();
                n += n;
                h[n] = b;
                h[n + 1] = this.b();
                n2 = 2;
                if (f == 0) {
                    n = 2;
                }
                else {
                    n = 3;
                }
                final float a = this.a();
                n += n;
                h[n] = a;
                h[n + 1] = this.a();
                n = n2;
                if (f == 0) {
                    n = 3;
                }
                final float c = this.c();
                n += n;
                h[n] = c;
                h[n + 1] = this.c();
                this.f.addRoundRect(this.e, h, Path$Direction.CW);
                this.f.close();
            }
        }
    }
}
