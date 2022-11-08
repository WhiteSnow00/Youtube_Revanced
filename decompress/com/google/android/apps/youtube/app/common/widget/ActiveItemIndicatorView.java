// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.widget;

import android.graphics.Canvas;
import android.graphics.Paint$Style;
import android.graphics.Paint$Cap;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Paint;
import android.view.View;

public class ActiveItemIndicatorView extends View
{
    int a;
    public float[] b;
    float[] c;
    public int d;
    public int e;
    private Paint f;
    private Paint g;
    private int h;
    private int i;
    
    public ActiveItemIndicatorView(final Context context) {
        super(context);
        this.e();
    }
    
    public ActiveItemIndicatorView(final Context context, final AttributeSet set) {
        super(context, set);
        this.e();
    }
    
    public ActiveItemIndicatorView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.e();
    }
    
    public ActiveItemIndicatorView(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.e();
    }
    
    private final int d() {
        return this.getPaddingLeft() + this.i + this.h / 2;
    }
    
    private final void e() {
        final int dimensionPixelSize = this.getResources().getDimensionPixelSize(2131165686);
        this.i = dimensionPixelSize;
        this.h = dimensionPixelSize;
        (this.f = new Paint()).setStrokeCap(Paint$Cap.ROUND);
        this.f.setStyle(Paint$Style.FILL_AND_STROKE);
        this.f.setStrokeWidth((float)this.h);
        this.f.setAntiAlias(true);
        (this.g = new Paint()).setStrokeCap(Paint$Cap.ROUND);
        this.g.setStyle(Paint$Style.FILL_AND_STROKE);
        this.g.setStrokeWidth((float)this.h);
        this.g.setAntiAlias(true);
        this.c = new float[2];
        this.b(1);
    }
    
    public final int a() {
        final int d = this.d;
        int n;
        if (d > 0) {
            final int h = this.h;
            final int i = this.i;
            n = d * (h + i) + i;
        }
        else {
            n = 0;
        }
        return n + this.getPaddingLeft() + this.getPaddingRight();
    }
    
    public final void b(int a) {
        if (this.a == a) {
            return;
        }
        this.a = a;
        final Paint f = this.f;
        final Context context = this.getContext();
        int n;
        if (a == 2) {
            n = 2130970903;
        }
        else {
            n = 2130970908;
        }
        f.setColor(tmy.ct(context, n).orElse(0));
        final Paint g = this.g;
        final Context context2 = this.getContext();
        if (a == 2) {
            a = 2130970865;
        }
        else {
            a = 2130970877;
        }
        g.setColor(tmy.ct(context2, a).orElse(0));
        this.invalidate();
    }
    
    public final void c() {
        this.c[0] = (float)(this.d() + this.e * (this.h + this.i));
        this.c[1] = (float)(this.getHeight() / 2);
    }
    
    protected final void onDraw(final Canvas canvas) {
        if (this.e >= this.d) {
            return;
        }
        canvas.drawPoints(this.b, this.g);
        canvas.drawPoints(this.c, this.f);
    }
    
    protected final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        int d = this.d();
        final int n5 = this.getHeight() / 2;
        int n6 = 0;
        while (true) {
            final float[] b2 = this.b;
            if (n6 >= b2.length) {
                break;
            }
            b2[n6] = (float)d;
            b2[n6 + 1] = (float)n5;
            d += this.h + this.i;
            n6 += 2;
        }
        this.c();
        super.onLayout(b, n, n2, n3, n4);
    }
    
    protected final void onMeasure(final int n, final int n2) {
        this.setMeasuredDimension(this.a(), this.h + this.getPaddingTop() + this.getPaddingBottom());
    }
}
