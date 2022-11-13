// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.user.profile.photopicker.edit;

import android.content.res.TypedArray;
import android.view.MotionEvent;
import android.graphics.Path$Direction;
import android.view.View;
import android.graphics.Canvas;
import android.graphics.Matrix$ScaleToFit;
import android.graphics.drawable.Drawable$Callback;
import android.content.res.Resources;
import android.os.Handler;
import android.view.GestureDetector$OnGestureListener;
import android.graphics.Paint$Style;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Paint;
import android.view.GestureDetector$SimpleOnGestureListener;
import android.view.ScaleGestureDetector$OnScaleGestureListener;
import android.view.ScaleGestureDetector;
import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.RectF;
import android.graphics.Path;
import android.graphics.Matrix;

public class EditablePhotoView extends qvn
{
    private final Matrix A;
    private final Matrix B;
    private boolean C;
    private final Path D;
    private final RectF E;
    private final float[] F;
    private int G;
    private int H;
    private int I;
    private int J;
    public Drawable a;
    public final Matrix b;
    public final Rect c;
    float d;
    GestureDetector e;
    public boolean f;
    public int g;
    public boolean h;
    public float i;
    public float j;
    public boolean k;
    public long l;
    public ValueAnimator m;
    public boolean n;
    public final RectF o;
    public final RectF p;
    public qvp q;
    public pba r;
    public ScaleGestureDetector s;
    ScaleGestureDetector$OnScaleGestureListener t;
    GestureDetector$SimpleOnGestureListener u;
    private Paint w;
    private Paint x;
    private int y;
    private final Matrix z;
    
    public EditablePhotoView(final Context context) {
        super(context);
        this.b = new Matrix();
        this.z = new Matrix();
        this.A = new Matrix();
        this.B = new Matrix();
        this.c = new Rect();
        this.D = new Path();
        this.g = 0;
        this.h = false;
        this.o = new RectF();
        this.E = new RectF();
        this.p = new RectF();
        this.F = new float[9];
        this.t = (ScaleGestureDetector$OnScaleGestureListener)new qvh(this);
        this.u = (GestureDetector$SimpleOnGestureListener)new qvi(this);
        this.i();
    }
    
    public EditablePhotoView(final Context context, final AttributeSet set) {
        super(context, set);
        this.b = new Matrix();
        this.z = new Matrix();
        this.A = new Matrix();
        this.B = new Matrix();
        this.c = new Rect();
        this.D = new Path();
        this.g = 0;
        this.h = false;
        this.o = new RectF();
        this.E = new RectF();
        this.p = new RectF();
        this.F = new float[9];
        this.t = (ScaleGestureDetector$OnScaleGestureListener)new qvh(this);
        this.u = (GestureDetector$SimpleOnGestureListener)new qvi(this);
        this.k(context, set);
        this.i();
    }
    
    public EditablePhotoView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.b = new Matrix();
        this.z = new Matrix();
        this.A = new Matrix();
        this.B = new Matrix();
        this.c = new Rect();
        this.D = new Path();
        this.g = 0;
        this.h = false;
        this.o = new RectF();
        this.E = new RectF();
        this.p = new RectF();
        this.F = new float[9];
        this.t = (ScaleGestureDetector$OnScaleGestureListener)new qvh(this);
        this.u = (GestureDetector$SimpleOnGestureListener)new qvi(this);
        this.k(context, set);
        this.i();
    }
    
    private final void i() {
        final Context context = this.getContext();
        if (!super.v) {
            ((arkk)context).f().s(this);
        }
        final Resources resources = context.getApplicationContext().getResources();
        this.y = resources.getColor(2131101623);
        (this.w = new Paint()).setAntiAlias(true);
        this.w.setColor(resources.getColor(2131101624));
        this.w.setStyle(Paint$Style.FILL);
        (this.x = new Paint()).setAntiAlias(true);
        this.x.setColor(resources.getColor(2131101625));
        this.x.setStyle(Paint$Style.STROKE);
        this.x.setStrokeWidth(resources.getDimension(2131168466));
        this.e = new GestureDetector(context, (GestureDetector$OnGestureListener)this.u, (Handler)null, context.getPackageManager().hasSystemFeature("android.hardware.touchscreen.multitouch.distinct") ^ true);
        this.s = new ScaleGestureDetector(context, this.t);
        final Resources resources2 = this.getResources();
        float n;
        if (arrm.f()) {
            n = this.b();
        }
        else {
            n = this.a();
        }
        this.setContentDescription((CharSequence)resources2.getString(2132018987, new Object[] { n }));
    }
    
    private final void k(final Context context, AttributeSet obtainStyledAttributes) {
        obtainStyledAttributes = (AttributeSet)context.getTheme().obtainStyledAttributes(obtainStyledAttributes, qvo.a, 0, 0);
        try {
            this.G = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(3, 0);
            this.H = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(2, 0);
            this.I = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(4, 0) + ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(0, 0);
            this.J = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(1, 0);
        }
        finally {
            ((TypedArray)obtainStyledAttributes).recycle();
        }
    }
    
    public final float a() {
        this.b.postRotate(-this.q.a, (float)this.c.centerX(), (float)this.c.centerY());
        this.b.getValues(this.F);
        final float n = this.F[0];
        this.b.postRotate(this.q.a, (float)this.c.centerX(), (float)this.c.centerY());
        return n;
    }
    
    public final float b() {
        if (this.i != 0.0f) {
            return this.a() / this.i;
        }
        return 1.0f;
    }
    
    public final void d() {
        final Drawable a = this.a;
        if (a != null) {
            a.setCallback((Drawable$Callback)null);
        }
        this.a = null;
        this.f = false;
    }
    
    public final void e(final boolean b) {
        final Drawable a = this.a;
        if (a != null) {
            if (this.C) {
                this.a.setBounds(0, 0, a.getIntrinsicWidth(), this.a.getIntrinsicHeight());
                if (!b && (this.i != 0.0f || this.a == null || !this.C)) {
                    return;
                }
                final int intrinsicWidth = this.a.getIntrinsicWidth();
                final int intrinsicHeight = this.a.getIntrinsicHeight();
                final int right = this.c.right;
                final int left = this.c.left;
                final int bottom = this.c.bottom;
                final int top = this.c.top;
                final RectF o = this.o;
                final float n = (float)intrinsicWidth;
                final float n2 = (float)intrinsicHeight;
                o.set(0.0f, 0.0f, n, n2);
                final float d = n2 / n;
                this.d = d;
                final float n3 = (float)(bottom - top);
                final float n4 = (float)(right - left);
                if (d > n3 / n4) {
                    final int n5 = (this.c.top + this.c.bottom) / 2;
                    final int n6 = Math.round(n4 * this.d) / 2;
                    this.E.set((float)this.c.left, (float)(n5 - n6), (float)this.c.right, (float)(n5 + n6));
                }
                else {
                    final int n7 = (this.c.right + this.c.left) / 2;
                    final int n8 = Math.round(n3 / this.d) / 2;
                    this.E.set((float)(n7 - n8), (float)this.c.top, (float)(n7 + n8), (float)this.c.bottom);
                }
                this.b.setRectToRect(this.o, this.E, Matrix$ScaleToFit.CENTER);
                this.b.getValues(this.F);
                final float i = this.F[0];
                this.i = i;
                this.j = i * (float)arrm.a.c().a();
                this.z.set(this.b);
                this.z.invert(this.A);
                this.b.preConcat(this.q.b);
            }
        }
    }
    
    public final void f() {
        this.B.setConcat(this.A, this.b);
        this.q.b = this.B;
    }
    
    protected final void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(this.y);
        if (this.a == null) {
            return;
        }
        final int saveCount = canvas.getSaveCount();
        canvas.save();
        canvas.concat(this.b);
        this.a.draw(canvas);
        canvas.restoreToCount(saveCount);
        this.p.set(this.a.getBounds());
        this.b.mapRect(this.p);
        final int saveCount2 = canvas.getSaveCount();
        canvas.drawRect(0.0f, 0.0f, (float)this.getWidth(), (float)this.getHeight(), this.w);
        canvas.save();
        canvas.clipPath(this.D);
        canvas.concat(this.b);
        this.a.draw(canvas);
        canvas.restoreToCount(saveCount2);
        canvas.drawRect(this.c, this.x);
    }
    
    protected final void onLayout(final boolean b, int n, int n2, int i, final int n3) {
        super.onLayout(b, n, n2, i, n3);
        this.C = true;
        n2 = this.getWidth();
        n = this.getHeight();
        i = n2 - this.G - this.H;
        n2 = Math.min(i, n - this.I - this.J);
        if (anb.f((View)this) == 0) {
            n = this.G;
        }
        else {
            n = this.H;
        }
        n += (i - n2) / 2;
        i = this.I;
        this.c.set(n, i, n + n2, n2 + i);
        this.D.reset();
        this.D.addCircle((float)this.c.centerX(), (float)this.c.centerY(), this.c.width() / 2.0f, Path$Direction.CCW);
        this.e(b);
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        final ScaleGestureDetector s = this.s;
        if (s != null) {
            if (this.e != null) {
                if (!this.f) {
                    return true;
                }
                s.onTouchEvent(motionEvent);
                this.e.onTouchEvent(motionEvent);
                final int actionMasked = motionEvent.getActionMasked();
                Label_0158: {
                    if (actionMasked != 0) {
                        if (actionMasked != 1) {
                            if (actionMasked == 5) {
                                break Label_0158;
                            }
                            if (actionMasked != 6) {
                                return true;
                            }
                        }
                        this.g -= motionEvent.getPointerCount() - 1;
                        if (motionEvent.getPointerCount() == 2) {
                            this.l = motionEvent.getEventTime();
                            this.h = false;
                        }
                        else if (motionEvent.getPointerCount() == 1) {
                            this.l = 0L;
                        }
                        if (this.n) {
                            this.r.a(new msr(31).g(), (View)this);
                            this.n = false;
                            return true;
                        }
                        return true;
                    }
                }
                this.g = motionEvent.getPointerCount();
            }
        }
        return true;
    }
}
