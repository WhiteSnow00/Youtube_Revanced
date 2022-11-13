// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.ads.player.ui;

import android.graphics.Canvas;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.graphics.Paint$Style;
import android.widget.ImageView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.graphics.Paint;
import android.widget.LinearLayout;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.widget.TextView;
import android.widget.FrameLayout;

public final class SkipAdButton extends FrameLayout
{
    public slf a;
    public sld b;
    public CharSequence c;
    public CharSequence d;
    public TextView e;
    public int f;
    public int g;
    public ColorDrawable h;
    public aoxg i;
    public final Context j;
    public int k;
    public int l;
    private LinearLayout m;
    private final Paint n;
    private final Paint o;
    private boolean p;
    
    static {
        new SparseArray();
    }
    
    public SkipAdButton(final Context j) {
        super(j);
        this.n = new Paint();
        this.o = new Paint();
        this.c(this.j = j);
    }
    
    public SkipAdButton(final Context j, final AttributeSet set) {
        super(j, set);
        this.n = new Paint();
        this.o = new Paint();
        this.c(this.j = j);
    }
    
    public SkipAdButton(final Context j, final AttributeSet set, final int n) {
        super(j, set, n);
        this.n = new Paint();
        this.o = new Paint();
        this.c(this.j = j);
    }
    
    public SkipAdButton(final Context j, final AttributeSet set, final int n, final int n2) {
        super(j, set, n, n2);
        this.n = new Paint();
        this.o = new Paint();
        this.c(this.j = j);
    }
    
    private final void c(final Context context) {
        LayoutInflater.from(context).inflate(2131625437, (ViewGroup)this, true);
        this.setMinimumHeight(this.getResources().getDimensionPixelSize(2131165336));
        this.m = (LinearLayout)this.findViewById(2131431562);
        final ImageView imageView = (ImageView)this.findViewById(2131431563);
        this.g = agy.a(context, 2131102104);
        agy.a(context, 2131102108);
        this.n.setColor(this.g);
        this.n.setStyle(Paint$Style.FILL);
        this.o.setColor(agy.a(context, 2131102105));
        this.o.setStrokeWidth(this.getResources().getDimension(2131165335));
        this.o.setStyle(Paint$Style.STROKE);
        final TextView e = (TextView)this.findViewById(2131431564);
        this.e = e;
        this.c = e.getText();
        this.f = this.e.getCurrentTextColor();
        agy.a(context, 2131102109);
        final TextView e2 = this.e;
        this.b = new sld(e2, this.c, this.f, e2.getTextSize(), this.e.getBackground(), this.e.getAlpha());
        this.h = new ColorDrawable(this.g);
        final LinearLayout m = this.m;
        this.a = new slf((View)m, (Drawable)this.h, m.getAlpha());
        this.a(this.p);
        final Resources resources = context.getResources();
        this.k = resources.getDimensionPixelSize(2131169767);
        this.l = resources.getDimensionPixelSize(2131169766);
        this.d = resources.getText(2132019835);
    }
    
    public final void a(final boolean p) {
        this.p = p;
        int n;
        if (!p) {
            n = 2131102106;
        }
        else {
            n = 2131102107;
        }
        final int a = agy.a(this.getContext(), n);
        final sld b = this.b;
        b.b = a;
        b.b((ahkz)null);
    }
    
    public final boolean b() {
        return this.i != null;
    }
    
    protected final void dispatchDraw(final Canvas canvas) {
        final int width = this.m.getWidth();
        final int height = this.m.getHeight();
        final int top = this.m.getTop();
        final int left = this.m.getLeft();
        final float n = (float)left;
        final float n2 = (float)top;
        final float n3 = (float)(width + left);
        final float n4 = (float)(height + top);
        canvas.drawRect(n, n2, n3, n4, this.n);
        if (!this.p) {
            canvas.drawLines(new float[] { n3, n2, n, n2, n, n2, n, n4, n, n4, n3, n4 }, this.o);
        }
        super.dispatchDraw(canvas);
    }
}
