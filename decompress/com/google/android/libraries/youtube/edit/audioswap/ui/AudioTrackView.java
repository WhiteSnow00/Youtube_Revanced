// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.edit.audioswap.ui;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable$Callback;
import java.util.Set;
import android.view.ViewParent;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.ViewConfiguration;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.graphics.Rect;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.libraries.video.editablevideo.EditableVideo;
import android.graphics.Paint;
import android.widget.FrameLayout;

public class AudioTrackView extends FrameLayout implements qzn, rad
{
    public final rgw a;
    public final Paint b;
    public EditableVideo c;
    public qzq d;
    public uks e;
    public ukv f;
    public boolean g;
    public boolean h;
    public xab i;
    private final int j;
    private final int k;
    private final YouTubeTextView l;
    private Rect m;
    private int n;
    private long o;
    private int p;
    private float q;
    private ViewPropertyAnimator r;
    private boolean s;
    private boolean t;
    
    public AudioTrackView(final Context context, final AttributeSet set) {
        super(context, set);
        this.g = true;
        this.h = false;
        this.t = false;
        final Resources resources = context.getResources();
        this.j = ViewConfiguration.get(context).getScaledTouchSlop();
        this.l = (YouTubeTextView)LayoutInflater.from(context).inflate(2131624045, (ViewGroup)this, true).findViewById(2131427665);
        this.a = new rgw(context);
        this.k = agy.a(context, 2131233396).getIntrinsicWidth() / 2;
        final int n = (int)resources.getDimension(2131170340);
        final Paint b = new Paint();
        (this.b = b).setColor(resources.getColor(2131102316));
        b.setStrokeWidth((float)n);
        this.setWillNotDraw(false);
    }
    
    private final void e(final boolean b) {
        final ViewParent parent = this.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(b ^ true);
        }
    }
    
    private final void f() {
        final qzq d = this.d;
        if (d == null) {
            return;
        }
        final boolean c = d.c;
        final int n = 0;
        int k;
        if (!c && !this.h) {
            k = this.k;
        }
        else {
            k = 0;
        }
        this.m = new Rect(this.getPaddingLeft() + k, this.getPaddingTop(), this.getWidth() - this.getPaddingRight() - k, this.getHeight() - this.getPaddingBottom());
        int i = n;
        if (this.d.c) {
            i = this.k;
        }
        this.n = i;
    }
    
    private final void g() {
        if (this.s) {
            this.s = false;
            final xab i = this.i;
            if (i != null) {
                if (!this.t) {
                    i.l((xbe)new wzy(xbf.c(10718)));
                    this.t = true;
                }
                this.i.J(3, (xbe)new wzy(xbf.c(10718)), (alji)null);
            }
        }
        this.e(true);
    }
    
    public final void a(final EditableVideo editableVideo, final Set set) {
    }
    
    public final void b(final EditableVideo editableVideo, final int n) {
        this.postInvalidate();
    }
    
    public final void c(final EditableVideo editableVideo, final Set set) {
    }
    
    public final void d() {
        final EditableVideo c = this.c;
        if (c != null) {
            c.v((rad)this);
            this.c = null;
        }
        final qzq d = this.d;
        if (d != null) {
            d.h((qzn)this);
        }
        final uks e = this.e;
        if (e != null) {
            e.setCallback((Drawable$Callback)null);
            this.e = null;
        }
        final ViewPropertyAnimator r = this.r;
        if (r != null) {
            r.cancel();
            this.r = null;
        }
        this.a.a = null;
        this.requestLayout();
    }
    
    public final void l(final qzq qzq) {
        this.f();
        this.postInvalidate();
    }
    
    public final void m() {
    }
    
    protected final void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        if (this.c == null) {
            return;
        }
        final uks e = this.e;
        if (e != null) {
            e.a = this.n;
            e.setBounds(this.m);
            this.e.draw(canvas);
        }
        final int width = this.m.width();
        final int n = this.n;
        final int left = this.m.left;
        final int n2 = this.n;
        final float b = this.d.b(this.c.n());
        final float n3 = (float)(width - (n + n));
        final int left2 = this.m.left;
        final int n4 = this.n;
        final float b2 = this.d.b(this.c.l());
        final boolean g = this.g;
        final float b3 = left + n2 + b * n3;
        if (g) {
            final float n5 = (float)(left2 + n4);
            this.a.setBounds(this.m);
            final rgw a = this.a;
            a.b = b3;
            a.c = n5 + b2 * n3;
            a.draw(canvas);
        }
        canvas.drawLine(b3, (float)this.m.top, b3, (float)this.m.bottom, this.b);
    }
    
    protected final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        this.f();
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        final int pointerId = motionEvent.getPointerId(0);
        final float x = motionEvent.getX(0);
        final int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        this.g();
                        return true;
                    }
                    if (actionMasked != 6) {
                        return true;
                    }
                }
                else {
                    if (this.p != pointerId) {
                        return true;
                    }
                    if (!this.s && Math.abs(this.q - x) > this.j) {
                        this.s = true;
                        this.e(false);
                    }
                    if (!this.s) {
                        return true;
                    }
                    final long d = this.d.d((x - this.q) / this.m.width());
                    final long o = this.o;
                    final ukv f = this.f;
                    final lso b = f.b;
                    long n;
                    if (b != null) {
                        n = b.d() * 1000L;
                    }
                    else {
                        n = 0L;
                    }
                    this.c.x(Math.min(0L, Math.max(this.c.l() - this.c.n() - Math.max(f.c() * f.b(), n), o + d)));
                    if (this.r == null) {
                        this.r = this.l.animate().alpha(0.0f).setDuration((long)this.getResources().getInteger(2131492872));
                        return true;
                    }
                    return true;
                }
            }
            if (this.p == pointerId) {
                this.g();
            }
        }
        else if (motionEvent.getPointerCount() == 1) {
            this.o = this.c.g();
            this.p = pointerId;
            this.q = x;
        }
        return true;
    }
    
    public final void t() {
    }
    
    protected final boolean verifyDrawable(final Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.e;
    }
}
