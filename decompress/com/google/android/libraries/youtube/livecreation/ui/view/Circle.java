// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.livecreation.ui.view;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint$Style;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.Paint;
import android.view.View;

public class Circle extends View
{
    public float a;
    public float b;
    private final Paint c;
    private final RectF d;
    private final int e;
    private final int f;
    private final int g;
    
    public Circle(Context obtainStyledAttributes, final AttributeSet set) {
        super(obtainStyledAttributes, set);
        obtainStyledAttributes = (Context)obtainStyledAttributes.getTheme().obtainStyledAttributes(set, wol.a, 0, 0);
        try {
            final int dimensionPixelSize = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(0, 100);
            this.e = dimensionPixelSize;
            final int dimensionPixelSize2 = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(3, 10);
            this.f = dimensionPixelSize2;
            this.a = ((TypedArray)obtainStyledAttributes).getFloat(1, 0.0f);
            final int color = ((TypedArray)obtainStyledAttributes).getColor(2, -65536);
            this.g = color;
            this.b = ((TypedArray)obtainStyledAttributes).getFloat(4, 0.0f);
            ((TypedArray)obtainStyledAttributes).recycle();
            obtainStyledAttributes = (Context)new Paint();
            (this.c = (Paint)obtainStyledAttributes).setAntiAlias(true);
            ((Paint)obtainStyledAttributes).setStyle(Paint$Style.STROKE);
            ((Paint)obtainStyledAttributes).setStrokeWidth((float)dimensionPixelSize2);
            ((Paint)obtainStyledAttributes).setColor(color);
            final float n = (float)dimensionPixelSize2;
            final float n2 = (float)(dimensionPixelSize + dimensionPixelSize2);
            this.d = new RectF(n, n, n2, n2);
        }
        finally {
            ((TypedArray)obtainStyledAttributes).recycle();
        }
    }
    
    protected final void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawArc(this.d, this.a, this.b, false, this.c);
    }
}
