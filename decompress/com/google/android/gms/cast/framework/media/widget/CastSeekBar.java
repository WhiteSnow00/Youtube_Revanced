// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.cast.framework.media.widget;

import android.view.MotionEvent;
import java.util.Iterator;
import android.graphics.Canvas;
import android.content.res.TypedArray;
import android.graphics.Paint$Style;
import android.view.View$AccessibilityDelegate;
import java.util.ArrayList;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Paint;
import java.util.List;
import android.view.View;

public class CastSeekBar extends View
{
    public mmg a;
    public List b;
    private final float c;
    private final float d;
    private final float e;
    private final float f;
    private final Paint g;
    private final int h;
    private final int i;
    private final int j;
    
    public CastSeekBar(final Context context) {
        this(context, null);
    }
    
    public CastSeekBar(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public CastSeekBar(final Context context, final AttributeSet set, int resourceId) {
        super(context, set, resourceId);
        this.b = new ArrayList();
        this.setAccessibilityDelegate((View$AccessibilityDelegate)new mmh(this));
        (this.g = new Paint(1)).setStyle(Paint$Style.FILL);
        this.c = context.getResources().getDimension(2131165720);
        this.d = context.getResources().getDimension(2131165719);
        this.e = context.getResources().getDimension(2131165721) / 2.0f;
        context.getResources().getDimension(2131165722);
        this.f = context.getResources().getDimension(2131165718);
        final mmg a = new mmg();
        this.a = a;
        a.b = 1;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet)null, mjm.a, 2130968919, 2132083203);
        final int resourceId2 = obtainStyledAttributes.getResourceId(18, 0);
        resourceId = obtainStyledAttributes.getResourceId(20, 0);
        final int resourceId3 = obtainStyledAttributes.getResourceId(23, 0);
        final int resourceId4 = obtainStyledAttributes.getResourceId(0, 0);
        this.h = context.getResources().getColor(resourceId2);
        context.getResources().getColor(resourceId);
        this.i = context.getResources().getColor(resourceId3);
        this.j = context.getResources().getColor(resourceId4);
        obtainStyledAttributes.recycle();
    }
    
    private final void b(final Canvas canvas, final int n, final int n2, final int n3, final int n4, final int color) {
        this.g.setColor(color);
        final float n5 = (float)n3;
        final float n6 = (float)n4;
        final float e = this.e;
        canvas.drawRect(n / n5 * n6, -e, n2 / n5 * n6, e, this.g);
    }
    
    public final void a() {
        final int a = this.a.a;
    }
    
    public final void onDraw(final Canvas canvas) {
        final int save = canvas.save();
        canvas.translate((float)this.getPaddingLeft(), (float)this.getPaddingTop());
        final int n = this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight();
        final int measuredHeight = this.getMeasuredHeight();
        final int paddingTop = this.getPaddingTop();
        final int paddingBottom = this.getPaddingBottom();
        this.a();
        final int save2 = canvas.save();
        canvas.translate(0.0f, (float)((measuredHeight - paddingTop - paddingBottom) / 2));
        final mmg a = this.a;
        final boolean f = a.f;
        final int c = a.c;
        final int max = Math.max(0, 0);
        if (max > 0) {
            this.b(canvas, 0, max, this.a.b, n, this.i);
        }
        if (max < 0) {
            this.b(canvas, max, 0, this.a.b, n, this.h);
        }
        if (this.a.b > 0) {
            this.b(canvas, 0, 1, 1, n, this.i);
        }
        canvas.restoreToCount(save2);
        final List b = this.b;
        if (b != null) {
            if (!b.isEmpty()) {
                this.g.setColor(this.j);
                final int measuredWidth = this.getMeasuredWidth();
                final int paddingLeft = this.getPaddingLeft();
                final int paddingRight = this.getPaddingRight();
                final int measuredHeight2 = this.getMeasuredHeight();
                final int paddingTop2 = this.getPaddingTop();
                final int paddingBottom2 = this.getPaddingBottom();
                final int save3 = canvas.save();
                canvas.translate(0.0f, (float)((measuredHeight2 - paddingTop2 - paddingBottom2) / 2));
                final Iterator iterator = b.iterator();
                while (iterator.hasNext()) {
                    if (iterator.next() != null) {
                        final int min = Math.min(0, this.a.b);
                        final float n2 = (float)(measuredWidth - paddingLeft - paddingRight);
                        final float n3 = (float)this.a.b;
                        float n4 = min * n2 / n3;
                        final float n5 = (min + 1) * n2 / n3;
                        final float f2 = this.f;
                        float n6 = n5;
                        if (n5 - n4 < f2) {
                            n6 = n4 + f2;
                        }
                        if (n6 > n2) {
                            n6 = n2;
                        }
                        if (n6 - n4 < f2) {
                            n4 = n6 - f2;
                        }
                        final float e = this.e;
                        canvas.drawRect(n4, -e, n6, e, this.g);
                    }
                }
                canvas.restoreToCount(save3);
            }
        }
        if (this.isEnabled()) {
            final boolean f3 = this.a.f;
        }
        canvas.restoreToCount(save);
    }
    
    protected final void onMeasure(final int n, final int n2) {
        synchronized (this) {
            this.setMeasuredDimension(resolveSizeAndState((int)(this.c + this.getPaddingLeft() + this.getPaddingRight()), n, 0), resolveSizeAndState((int)(this.d + this.getPaddingTop() + this.getPaddingBottom()), n2, 0));
        }
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        if (this.isEnabled()) {
            final boolean f = this.a.f;
        }
        return false;
    }
}
