// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.ui.inline.spotlight;

import android.view.MotionEvent;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.RectF;
import j$.util.Optional;
import android.graphics.Paint;
import android.widget.LinearLayout;

public final class SpotlightScrimLayout extends LinearLayout
{
    public int a;
    public int b;
    public final Paint c;
    public Optional d;
    private final RectF e;
    
    public SpotlightScrimLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = 0;
        this.b = 0;
        this.c = new Paint();
        this.e = new RectF();
        this.d = Optional.empty();
    }
    
    protected final void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        final int width = this.getWidth();
        final RectF e = this.e;
        final int a = this.a;
        e.set(0.0f, (float)a, (float)width, (float)(a + this.b));
        canvas.drawRoundRect(this.e, 32.0f, 32.0f, this.c);
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        if (this.d.isPresent() && !this.e.contains(motionEvent.getX(), motionEvent.getY())) {
            ((kbt)this.d.get()).f();
        }
        return super.onTouchEvent(motionEvent);
    }
}
