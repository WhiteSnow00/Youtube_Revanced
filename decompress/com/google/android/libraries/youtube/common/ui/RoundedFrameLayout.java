// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.common.ui;

import android.graphics.Path$Direction;
import java.util.Arrays;
import android.graphics.Canvas;
import android.content.res.TypedArray;
import android.util.DisplayMetrics;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.FrameLayout;

public class RoundedFrameLayout extends FrameLayout
{
    private int a;
    private RectF b;
    private float[] c;
    private Path d;
    
    public RoundedFrameLayout(final Context context) {
        super(context);
    }
    
    public RoundedFrameLayout(final Context context, final AttributeSet set) {
        super(context, set);
        final DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, trt.e);
        this.b = new RectF();
        this.a = obtainStyledAttributes.getDimensionPixelSize(0, tqf.aZ(displayMetrics, 16));
        this.setWillNotDraw(false);
        obtainStyledAttributes.recycle();
    }
    
    public final void draw(final Canvas canvas) {
        canvas.save();
        final Path d = this.d;
        if (d != null) {
            canvas.clipPath(d);
        }
        else {
            tut.b("Rounded frame layout rectPath is null");
        }
        super.draw(canvas);
        canvas.restore();
    }
    
    protected final void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        if (n != 0) {
            if (n2 != 0) {
                this.b.set(0.0f, 0.0f, (float)n, (float)n2);
                final Path d = this.d;
                if (d == null) {
                    this.d = new Path();
                }
                else {
                    d.reset();
                }
                if (this.c == null) {
                    this.c = new float[8];
                }
                Arrays.fill(this.c, 0, 8, (float)this.a);
                this.d.addRoundRect(this.b, this.c, Path$Direction.CW);
                this.d.close();
            }
        }
    }
}
