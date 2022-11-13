// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.timeline;

import android.view.View;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.util.TypedValue;
import android.content.res.TypedArray;
import android.graphics.Paint$Style;
import android.graphics.drawable.shapes.Shape;
import android.graphics.drawable.shapes.RectShape;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.widget.SeekBar;
import android.graphics.drawable.Drawable;
import android.widget.SeekBar$OnSeekBarChangeListener;

public class TimelineSeekBar extends gzr implements SeekBar$OnSeekBarChangeListener
{
    public Drawable a;
    public final int b;
    public final SeekBar c;
    public final Runnable d;
    public txz e;
    public gzs f;
    public msr g;
    private final Drawable h;
    private final int i;
    private final int j;
    private final int k;
    private ShapeDrawable l;
    private ShapeDrawable m;
    private ShapeDrawable n;
    private LayerDrawable o;
    private LayerDrawable p;
    
    public TimelineSeekBar(final Context context) {
        this(context, null);
    }
    
    public TimelineSeekBar(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public TimelineSeekBar(final Context context, final AttributeSet set, final int n) {
        this(context, set, n, 0);
    }
    
    public TimelineSeekBar(final Context context, final AttributeSet set, int color, final int n) {
        super(context, set, color);
        this.d = (Runnable)new gxo(this, 6);
        final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(set, gzf.a, color, n);
        try {
            final Drawable drawable = obtainStyledAttributes.getDrawable(2);
            this.h = drawable;
            this.k = obtainStyledAttributes.getDimensionPixelSize(3, this.g(2));
            final Drawable drawable2 = obtainStyledAttributes.getDrawable(4);
            this.a = drawable2;
            if (drawable2 == null) {
                this.a = context.getResources().getDrawable(2131232472);
            }
            color = obtainStyledAttributes.getColor(0, context.getResources().getColor(17170443));
            this.i = color;
            this.j = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.b = this.getResources().getDimensionPixelSize(2131169496);
            obtainStyledAttributes.recycle();
            LayoutInflater.from(context).inflate(2131625641, (ViewGroup)this, true);
            final SeekBar c = (SeekBar)this.findViewById(2131430461);
            (this.c = c).setProgressDrawable((Drawable)null);
            c.setOnSeekBarChangeListener((SeekBar$OnSeekBarChangeListener)this);
            (this.l = new ShapeDrawable()).setIntrinsicWidth(this.getResources().getDimensionPixelSize(2131168509));
            this.l.setShape((Shape)new RectShape());
            this.l.getPaint().setColor(color);
            this.l.getPaint().setStyle(Paint$Style.FILL);
            (this.m = new ShapeDrawable()).setShape((Shape)new RectShape());
            this.m.getPaint().setAlpha(0);
            if (drawable != null) {
                (this.n = new ShapeDrawable()).setShape((Shape)new RectShape());
                this.n.getPaint().setAlpha(0);
            }
            this.f.a().q(tpe.cl(this.g.K())).aH((asjm)new gyi(this, 7));
            this.e.M().q(tpe.cl(this.g.K())).aH((asjm)new gyi(this, 8));
            this.e.N().q(tpe.cl(this.g.K())).aH((asjm)new gyi(this, 9));
        }
        finally {
            obtainStyledAttributes.recycle();
        }
    }
    
    private final int g(final int n) {
        return (int)TypedValue.applyDimension(1, (float)n, this.getResources().getDisplayMetrics());
    }
    
    public final void d() {
        this.e(this.e.H());
    }
    
    public final void e(final long n) {
        this.c.setProgress((int)n);
    }
    
    public final void f() {
        this.d();
        this.postDelayed(this.d, 60L);
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        final int n = (int)motionEvent.getY();
        final Rect bounds = this.a.getBounds();
        return n < bounds.top - this.b || n > bounds.bottom + this.b || super.onInterceptTouchEvent(motionEvent);
    }
    
    protected final void onLayout(final boolean b, int intrinsicWidth, int n, int n2, int n3) {
        super.onLayout(b, intrinsicWidth, n, n2, n3);
        if (this.getHeight() > 0 && this.o == null) {
            final int intrinsicHeight = this.a.getIntrinsicHeight();
            n2 = this.a.getIntrinsicWidth();
            n3 = this.l.getIntrinsicWidth();
            n = this.g(1);
            final int n4 = n2 % 2;
            intrinsicWidth = n2;
            if (n4 == 0) {
                intrinsicWidth = n2 + n;
            }
            this.m.setIntrinsicHeight(this.getHeight());
            this.m.setIntrinsicWidth(intrinsicWidth);
            this.l.setIntrinsicHeight(this.getHeight() - intrinsicHeight - this.j);
            final LayerDrawable o = new LayerDrawable(new Drawable[] { (Drawable)this.m, (Drawable)this.l, this.a });
            this.o = o;
            if (n4 != 0) {
                n = 0;
            }
            o.setLayerInset(2, n, this.getHeight() - intrinsicHeight, 0, 0);
            this.o.setLayerInset(1, (intrinsicWidth - n3) / 2, 0, (intrinsicWidth + n3) / 2, intrinsicHeight + this.j);
            this.c.setThumb((Drawable)this.o);
        }
        if (this.h != null && this.getHeight() > 0 && this.p == null) {
            n = this.a.getIntrinsicHeight();
            this.n.setIntrinsicHeight(this.getHeight());
            this.p = new LayerDrawable(new Drawable[] { (Drawable)this.n, this.h });
            n2 = this.k;
            n3 = this.getHeight();
            intrinsicWidth = (n + this.k) / 2;
            this.p.setLayerInset(1, 0, n3 - intrinsicWidth, 0, (n - n2) / 2);
            this.c.setProgressDrawable((Drawable)this.p);
        }
        final View view = (View)this.c.getParent();
        view.post((Runnable)new gwk(this, view, 5));
    }
    
    public final void onProgressChanged(final SeekBar seekBar, final int n, final boolean b) {
        if (b) {
            this.e.ac((long)n, (Runnable)null);
        }
    }
    
    public final void onStartTrackingTouch(final SeekBar seekBar) {
        this.removeCallbacks(this.d);
        this.e.W();
    }
    
    public final void onStopTrackingTouch(final SeekBar seekBar) {
        final txz e = this.e;
        e.ab(e.H());
        this.f();
    }
}
