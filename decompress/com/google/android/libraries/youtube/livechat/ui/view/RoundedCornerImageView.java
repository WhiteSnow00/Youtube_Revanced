// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.livechat.ui.view;

import android.graphics.Path$Direction;
import java.util.Arrays;
import android.graphics.Canvas;
import android.content.res.TypedArray;
import android.util.DisplayMetrics;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.Path;
import android.support.v7.widget.AppCompatImageView;

public class RoundedCornerImageView extends AppCompatImageView
{
    private final Path a;
    private final RectF b;
    private int c;
    private float[] d;
    
    public RoundedCornerImageView(final Context context) {
        super(context);
        this.a = new Path();
        this.b = new RectF();
    }
    
    public RoundedCornerImageView(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = new Path();
        this.b = new RectF();
        final DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, vzr.a);
        this.c = obtainStyledAttributes.getDimensionPixelSize(0, tmy.aZ(displayMetrics, 4));
        obtainStyledAttributes.recycle();
    }
    
    public final void draw(final Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.a);
        super.draw(canvas);
        canvas.restore();
    }
    
    protected final void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        if (n != 0) {
            if (n2 != 0) {
                this.b.set(0.0f, 0.0f, (float)n, (float)n2);
                this.a.reset();
                if (this.d == null) {
                    this.d = new float[8];
                }
                Arrays.fill(this.d, 0, 8, (float)this.c);
                this.a.addRoundRect(this.b, this.d, Path$Direction.CW);
                this.a.close();
            }
        }
    }
}
