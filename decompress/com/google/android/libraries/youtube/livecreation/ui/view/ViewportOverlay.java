// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.livecreation.ui.view;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint$Style;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Paint;
import android.view.View;

public class ViewportOverlay extends View
{
    private Paint a;
    private View b;
    
    public ViewportOverlay(final Context context) {
        super(context);
        this.b(context, null, 0);
    }
    
    public ViewportOverlay(final Context context, final AttributeSet set) {
        super(context, set);
        this.b(context, set, 0);
    }
    
    public ViewportOverlay(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.b(context, set, n);
    }
    
    private final void b(final Context context, AttributeSet obtainStyledAttributes, final int n) {
        int color = agy.a(context, 2131100968);
        if (obtainStyledAttributes != null) {
            obtainStyledAttributes = (AttributeSet)context.getTheme().obtainStyledAttributes(obtainStyledAttributes, wql.d, n, 0);
            try {
                color = ((TypedArray)obtainStyledAttributes).getColor(0, color);
            }
            finally {
                ((TypedArray)obtainStyledAttributes).recycle();
            }
        }
        (this.a = new Paint()).setStyle(Paint$Style.FILL);
        this.a.setColor(color);
    }
    
    public final void a(final View b) {
        this.b = b;
        this.postInvalidate();
    }
    
    protected final void onDraw(final Canvas canvas) {
        final View b = this.b;
        if (b != null && b.getVisibility() == 0) {
            final int[] array = new int[2];
            this.b.getLocationInWindow(array);
            final int[] array2 = new int[2];
            this.getLocationInWindow(array2);
            array[0] -= array2[0];
            array[1] -= array2[1];
            final int width = this.b.getWidth();
            final int height = this.b.getHeight();
            canvas.drawRect(0.0f, 0.0f, (float)this.getMeasuredWidth(), (float)array[1], this.a);
            canvas.drawRect(0.0f, (float)array[1], (float)array[0], (float)this.getMeasuredHeight(), this.a);
            canvas.drawRect((float)(array[0] + width), (float)array[1], (float)this.getMeasuredWidth(), (float)this.getMeasuredHeight(), this.a);
            final int n = array[0];
            canvas.drawRect((float)n, (float)(array[1] + height), (float)(n + width), (float)this.getMeasuredHeight(), this.a);
            return;
        }
        canvas.drawRect(0.0f, 0.0f, (float)this.getMeasuredWidth(), (float)this.getMeasuredHeight(), this.a);
    }
}
