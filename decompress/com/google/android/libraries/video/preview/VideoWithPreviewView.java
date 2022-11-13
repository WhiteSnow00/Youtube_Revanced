// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.video.preview;

import android.view.WindowManager;
import android.util.DisplayMetrics;
import android.view.View$MeasureSpec;
import android.graphics.RectF;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Point;

public class VideoWithPreviewView extends rdi
{
    final Point a;
    public hjj b;
    
    public VideoWithPreviewView(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = new Point();
    }
    
    protected float a() {
        return this.getWidth() / 2.0f;
    }
    
    protected float c() {
        return 1.0f;
    }
    
    protected void i() {
        final float n = (float)this.getWidth();
        final float n2 = (float)this.getHeight();
        if (n != 0.0f && n2 != 0.0f) {
            final Matrix transform = new Matrix();
            transform.mapRect(new RectF(0.0f, 0.0f, n, n2));
            this.c.setTransform(transform);
        }
    }
    
    protected final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        if (b) {
            this.i();
        }
    }
    
    protected final void onMeasure(int n, int widthPixels) {
        final int mode = View$MeasureSpec.getMode(n);
        final boolean b = true;
        qnr.b(mode == 1073741824);
        this.a.x = View$MeasureSpec.getSize(n);
        final Point a = this.a;
        a.y = (int)(a.x / super.g + 0.5f);
        if (this.n() || View$MeasureSpec.getMode(widthPixels) != 0) {
            if (this.n()) {
                n = this.h;
            }
            else {
                n = View$MeasureSpec.getSize(widthPixels);
            }
            if (this.a.y > n) {
                this.a.y = n;
                final Point a2 = this.a;
                a2.x = (int)(a2.y * super.g + 0.5f);
            }
        }
        final hjj b2 = this.b;
        if (b2 != null) {
            final Point a3 = this.a;
            if (a3.x > 0 && a3.y > 0) {
                adkp.H(a3.x > 0);
                adkp.H(a3.y > 0 && b);
                final float n2 = (float)a3.x;
                final float n3 = (float)a3.y;
                final DisplayMetrics displayMetrics = new DisplayMetrics();
                ((WindowManager)b2.a.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
                widthPixels = displayMetrics.widthPixels;
                n = displayMetrics.heightPixels;
                final float n4 = (float)widthPixels;
                final float n5 = (float)n;
                final float n6 = n2 / n3;
                if (n6 >= n4 / n5) {
                    widthPixels = (int)(n5 * n6);
                }
                else {
                    n = (int)(n4 / n6);
                }
                a3.x = widthPixels;
                a3.y = n;
            }
        }
        super.onMeasure(View$MeasureSpec.makeMeasureSpec(this.a.x, 1073741824), View$MeasureSpec.makeMeasureSpec(this.a.y, 1073741824));
    }
    
    protected final float sj() {
        return this.getHeight() / 2.0f;
    }
    
    protected final void sk() {
        this.requestLayout();
    }
    
    public final void sl() {
        this.requestLayout();
    }
}
