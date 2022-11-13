// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.creation.videoeffects.fragment;

import android.content.res.TypedArray;
import android.graphics.PathEffect;
import android.graphics.Canvas;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.CornerPathEffect;
import android.graphics.Path;
import android.graphics.Paint;
import android.widget.RelativeLayout;

public final class ElevatedRoundedCornersRelativeLayout extends RelativeLayout
{
    private final Paint a;
    private final Path b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final boolean g;
    private CornerPathEffect h;
    
    public ElevatedRoundedCornersRelativeLayout(final Context context) {
        this(context, null);
    }
    
    public ElevatedRoundedCornersRelativeLayout(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public ElevatedRoundedCornersRelativeLayout(Context obtainStyledAttributes, final AttributeSet set, int dimensionPixelSize) {
        super(obtainStyledAttributes, set, dimensionPixelSize);
        final Paint a = new Paint();
        this.a = a;
        this.b = new Path();
        this.getBackground().getClass();
        final Resources resources = obtainStyledAttributes.getResources();
        final int dimensionPixelSize2 = resources.getDimensionPixelSize(2131166340);
        this.c = dimensionPixelSize2;
        dimensionPixelSize = resources.getDimensionPixelSize(2131166341);
        this.d = dimensionPixelSize;
        final int dimensionPixelSize3 = resources.getDimensionPixelSize(2131166342);
        this.e = dimensionPixelSize3;
        this.f = resources.getColor(2131099884);
        obtainStyledAttributes = (Context)obtainStyledAttributes.getTheme().obtainStyledAttributes(set, ugh.a, 0, 0);
        try {
            a.setColor(((ColorDrawable)this.getBackground()).getColor());
            this.setBackgroundColor(0);
            this.setPadding(this.getPaddingLeft() + dimensionPixelSize2 - dimensionPixelSize, this.getPaddingTop() + dimensionPixelSize2 - dimensionPixelSize3, this.getPaddingRight() + dimensionPixelSize2 + dimensionPixelSize, this.getPaddingBottom() + dimensionPixelSize2 + dimensionPixelSize3);
            final float dimension = ((TypedArray)obtainStyledAttributes).getDimension(0, 0.0f);
            if (dimension > 0.0f) {
                this.h = new CornerPathEffect(dimension);
            }
            this.g = ((TypedArray)obtainStyledAttributes).getBoolean(1, true);
        }
        finally {
            ((TypedArray)obtainStyledAttributes).recycle();
        }
    }
    
    protected final void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        final CornerPathEffect h = this.h;
        if (h != null) {
            this.a.setPathEffect((PathEffect)h);
            this.a.setAntiAlias(true);
        }
        else {
            this.a.setAntiAlias(false);
        }
        if (this.g) {
            this.a.setShadowLayer((float)this.c, (float)this.d, (float)this.e, this.f);
        }
        else {
            this.a.clearShadowLayer();
        }
        final int c = this.c;
        final int d = this.d;
        final int width = this.getWidth();
        final int c2 = this.c;
        final int d2 = this.d;
        final int e = this.e;
        final int height = this.getHeight();
        final int c3 = this.c;
        final int e2 = this.e;
        this.b.reset();
        final Path b = this.b;
        final float n = (float)(c - d);
        final float n2 = (float)(c2 - e);
        b.moveTo(n, n2);
        final Path b2 = this.b;
        final float n3 = (float)(width - c2 - d2);
        b2.lineTo(n3, n2);
        final Path b3 = this.b;
        final float n4 = (float)(height - c3 - e2);
        b3.lineTo(n3, n4);
        this.b.lineTo(n, n4);
        this.b.close();
        canvas.drawPath(this.b, this.a);
    }
}
