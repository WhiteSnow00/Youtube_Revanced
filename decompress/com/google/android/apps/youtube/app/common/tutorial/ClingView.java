// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.tutorial;

import android.graphics.Bitmap$Config;
import android.graphics.Rect;
import android.content.res.TypedArray;
import android.graphics.Xfermode;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Paint$Style;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.View;

public class ClingView extends View
{
    public View a;
    public View b;
    public fxa c;
    public final ViewTreeObserver$OnGlobalLayoutListener d;
    private Paint e;
    private Paint f;
    private Paint g;
    private Bitmap h;
    private Canvas i;
    private int j;
    private int[] k;
    
    public ClingView(final Context context, final AttributeSet set) {
        super(context, set);
        this.d = (ViewTreeObserver$OnGlobalLayoutListener)new je(this, 5);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, fxe.a);
        final int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        this.j = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        int color;
        if (resourceId != 0) {
            color = context.getResources().getColor(resourceId);
        }
        else {
            color = -872405934;
        }
        (this.e = new Paint()).setStyle(Paint$Style.FILL);
        this.e.setColor(color);
        (this.f = new Paint()).setStyle(Paint$Style.FILL);
        this.f.setColor(-1);
        this.f.setAntiAlias(true);
        this.f.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.CLEAR));
        this.g = new Paint(2);
        this.k = new int[2];
    }
    
    private final void b() {
        final Bitmap h = this.h;
        if (h != null) {
            h.recycle();
            this.h = null;
        }
        this.i = null;
    }
    
    public final Rect a() {
        final View b = this.b;
        int[] array;
        if (b == null) {
            array = null;
        }
        else {
            array = new int[2];
            b.getLocationInWindow(array);
            this.getLocationInWindow(this.k);
            final int n = array[0];
            final int[] k = this.k;
            array[0] = n - k[0];
            array[1] -= k[1];
        }
        if (array != null) {
            final View b2 = this.b;
            if (b2 != null) {
                final int n2 = array[0];
                final int j = this.j;
                return new Rect(n2 - j, array[1] - j, n2 + b2.getWidth() + this.j, array[1] + this.b.getHeight() + this.j);
            }
        }
        return new Rect();
    }
    
    public final void draw(final Canvas canvas) {
        super.draw(canvas);
        if (this.b == null) {
            return;
        }
        final Rect a = this.a();
        Bitmap h;
        if ((h = this.h) == null) {
            final int n = a.right - a.left;
            final int n2 = a.bottom - a.top;
            final int max = Math.max(n, n2);
            if (n > 0 && n2 > 0) {
                h = Bitmap.createBitmap(max, max, Bitmap$Config.ARGB_8888);
                this.h = h;
            }
            else {
                h = null;
            }
        }
        int top = a.top;
        int bottom = a.bottom;
        int left = a.left;
        int right = a.right;
        if (h != null) {
            if (this.i == null) {
                this.i = new Canvas(h);
            }
            final Canvas i = this.i;
            h.eraseColor(0);
            final int width = h.getWidth();
            final int right2 = a.right;
            final int left2 = a.left;
            top -= (h.getHeight() - (a.bottom - a.top)) / 2;
            final int height = h.getHeight();
            left -= (width - (right2 - left2)) / 2;
            final int width2 = h.getWidth();
            final int n3 = Math.max(h.getHeight(), h.getWidth()) / 2;
            i.drawRect(0.0f, 0.0f, (float)h.getWidth(), (float)h.getHeight(), this.e);
            i.drawCircle((float)(h.getWidth() / 2), (float)(h.getHeight() / 2), (float)n3, this.f);
            canvas.drawBitmap(h, (float)left, (float)top, this.g);
            bottom = top + height;
            right = left + width2;
        }
        final float n4 = (float)this.getMeasuredWidth();
        final Paint e = this.e;
        final float n5 = (float)top;
        canvas.drawRect(0.0f, 0.0f, n4, n5, e);
        final float n6 = (float)this.getMeasuredHeight();
        final Paint e2 = this.e;
        final float n7 = (float)left;
        canvas.drawRect(0.0f, n5, n7, n6, e2);
        final float n8 = (float)this.getMeasuredWidth();
        final float n9 = (float)this.getMeasuredHeight();
        final Paint e3 = this.e;
        final float n10 = (float)right;
        canvas.drawRect(n10, n5, n8, n9, e3);
        canvas.drawRect(n7, (float)bottom, n10, (float)this.getMeasuredHeight(), this.e);
        if (this.c != null) {
            a.left = left;
            a.right = right;
            a.top = top;
            a.bottom = bottom;
            this.c.c(a);
        }
    }
    
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final View b = this.b;
        if (b != null) {
            b.getViewTreeObserver().removeOnGlobalLayoutListener(this.d);
        }
        this.b();
    }
    
    protected final void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
        this.b();
    }
    
    public final void onVisibilityChanged(View a, final int n) {
        super.onVisibilityChanged(a, n);
        a = this.a;
        if (a != null) {
            a.sendAccessibilityEvent(2048);
        }
    }
}
