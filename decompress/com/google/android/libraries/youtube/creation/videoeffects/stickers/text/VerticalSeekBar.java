// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.creation.videoeffects.stickers.text;

import android.view.MotionEvent;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.SeekBar;

public class VerticalSeekBar extends SeekBar
{
    public VerticalSeekBar(final Context context) {
        super(context);
    }
    
    public VerticalSeekBar(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public VerticalSeekBar(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    public VerticalSeekBar(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
    }
    
    protected final void onDraw(final Canvas canvas) {
        synchronized (this) {
            canvas.rotate(-90.0f);
            canvas.translate((float)(-this.getHeight()), 0.0f);
            super.onDraw(canvas);
        }
    }
    
    protected final void onMeasure(final int n, final int n2) {
        synchronized (this) {
            super.onMeasure(n2, n);
            this.setMeasuredDimension(this.getMeasuredHeight(), this.getMeasuredWidth());
        }
    }
    
    protected final void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n2, n, n4, n3);
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        final int action = motionEvent.getAction();
        if (action == 0 || action == 1 || action == 2) {
            this.setProgress((int)(this.getMax() * (1.0f - motionEvent.getY() / this.getHeight())));
            super.onSizeChanged(this.getHeight(), this.getWidth(), 0, 0);
            this.performClick();
        }
        return true;
    }
    
    public final boolean performClick() {
        super.performClick();
        return true;
    }
    
    public final void setProgress(int width) {
        synchronized (this) {
            super.setProgress(width);
            width = this.getWidth();
            super.onSizeChanged(this.getHeight(), width, 0, 0);
        }
    }
}
