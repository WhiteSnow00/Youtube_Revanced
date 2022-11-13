// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.creation.videoeffects.stickers.text;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.graphics.Paint;
import android.content.Context;
import android.view.View;

public class ColorChip extends View
{
    public int a;
    public int b;
    public int c;
    public int d;
    private final Context e;
    private final int f;
    private final Paint g;
    
    public ColorChip(final Context context) {
        this(context, null);
    }
    
    public ColorChip(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public ColorChip(final Context e, AttributeSet obtainStyledAttributes, final int n) {
        super(e, obtainStyledAttributes, n);
        this.g = new Paint();
        this.e = e;
        obtainStyledAttributes = (AttributeSet)e.getTheme().obtainStyledAttributes(obtainStyledAttributes, uhu.a, 0, 0);
        try {
            this.a = ((TypedArray)obtainStyledAttributes).getColor(0, this.a(2131102276));
            this.b = ((TypedArray)obtainStyledAttributes).getColor(1, 0);
            this.c = ((TypedArray)obtainStyledAttributes).getColor(2, this.a);
            this.d = ((TypedArray)obtainStyledAttributes).getColor(3, this.b);
            this.f = this.a(2131102254);
        }
        finally {
            ((TypedArray)obtainStyledAttributes).recycle();
        }
    }
    
    private final int a(final int n) {
        return this.e.getResources().getColor(n);
    }
    
    protected final void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        if (canvas != null) {
            final int paddingLeft = this.getPaddingLeft();
            final int n = (this.getWidth() - paddingLeft - this.getPaddingRight()) / 2;
            final int n2 = this.getHeight() / 2;
            this.g.setColor(this.f);
            final Paint g = this.g;
            final float n3 = (float)n2;
            final float n4 = (float)(paddingLeft + n);
            final float n5 = (float)n;
            canvas.drawCircle(n3, n4, n5, g);
            this.g.setColor(this.a);
            canvas.drawCircle(n3, n4, n5 - this.e.getResources().getDimension(2131170089), this.g);
        }
    }
}
