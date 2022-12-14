// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.timeline;

import java.util.List;
import android.os.Build$VERSION;
import android.text.TextUtils$TruncateAt;
import android.graphics.Color;
import android.view.ViewParent;
import android.graphics.RectF;
import android.widget.ImageView$ScaleType;
import android.view.MotionEvent;
import android.content.res.Resources;
import android.view.View$AccessibilityDelegate;
import android.view.View;
import java.util.concurrent.TimeUnit;
import android.util.AttributeSet;
import android.content.Context;
import java.util.HashMap;
import android.widget.TextView;
import android.graphics.Rect;
import android.widget.ImageView;

public class TextTrackView extends gzq
{
    public txz a;
    public gzw b;
    public final ImageView c;
    public final ImageView d;
    public final qlj e;
    public final int f;
    public boolean g;
    public aeea h;
    private final Rect i;
    private final Rect j;
    private final Rect k;
    private final TextView l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private HashMap q;
    private HashMap r;
    private float s;
    private float t;
    private int u;
    private gzn v;
    private float w;
    private float x;
    private long y;
    
    public TextTrackView(final Context context, final AttributeSet set) {
        super(context, set);
        this.i = new Rect();
        this.j = new Rect();
        this.k = new Rect();
        this.e = new qlj();
        this.y = TimeUnit.SECONDS.toMillis(15L);
        final Resources resources = context.getResources();
        final int color = resources.getColor(2131102276);
        this.o = color;
        this.p = resources.getColor(2131102277);
        final int color2 = resources.getColor(2131102264);
        final int color3 = resources.getColor(2131102251);
        final int color4 = resources.getColor(2131102278);
        final int color5 = resources.getColor(2131102262);
        final int color6 = resources.getColor(2131102263);
        final int color7 = resources.getColor(2131102264);
        final int color8 = resources.getColor(2131102265);
        final int color9 = resources.getColor(2131102266);
        final int color10 = resources.getColor(2131102299);
        final HashMap q = new HashMap();
        this.q = q;
        final Integer value = color3;
        q.put(color, value);
        this.q.put(color4, value);
        this.q.put(color5, value);
        this.q.put(color6, value);
        this.q.put(color7, value);
        final HashMap q2 = this.q;
        final Integer value2 = color8;
        q2.put(value2, value);
        this.q.put(color9, color10);
        final HashMap r = new HashMap();
        this.r = r;
        final Integer value3 = color2;
        r.put(color, value3);
        this.r.put(value2, value3);
        final int intrinsicWidth = agx.a(context, 2131231997).getIntrinsicWidth();
        this.f = intrinsicWidth;
        this.m = intrinsicWidth / 2;
        this.n = resources.getDimensionPixelSize(2131170180);
        final TextView l = new TextView(context);
        this.addView((View)(this.l = l));
        final ImageView m = m(context, 2131231997);
        this.c = m;
        final ImageView i = m(context, 2131231998);
        this.d = i;
        this.addView((View)m);
        this.addView((View)i);
        l.setImportantForAccessibility(2);
        m.setAccessibilityDelegate((View$AccessibilityDelegate)new gzk(this, this.getContext()));
        i.setAccessibilityDelegate((View$AccessibilityDelegate)new gzl(this, this.getContext()));
    }
    
    public static /* bridge */ void g(final TextTrackView textTrackView, final long n, final gzn gzn) {
        textTrackView.q(n, gzn, false);
    }
    
    private final float j() {
        return this.c.getX() + this.m;
    }
    
    private final float k() {
        return this.d.getX() + this.m;
    }
    
    private static float l(final MotionEvent motionEvent, int pointerIndex) {
        pointerIndex = motionEvent.findPointerIndex(pointerIndex);
        if (pointerIndex == -1) {
            return Float.NaN;
        }
        return motionEvent.getX(pointerIndex);
    }
    
    private static ImageView m(final Context context, final int n) {
        final ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(agx.a(context, n));
        imageView.setScaleType(ImageView$ScaleType.FIT_XY);
        return imageView;
    }
    
    private final void n(final ImageView imageView, final RectF rectF) {
        final float n = (float)this.n;
        final float n2 = imageView.getX() + this.m;
        final float n3 = n / 2.0f;
        final float n4 = n2 - n3;
        float n5 = 0.0f;
        final float n6 = n2 + n3;
        if (n4 < 0.0f) {
            n5 = -n4;
        }
        else if (n6 > this.getWidth()) {
            n5 = this.getWidth() - n6;
        }
        rectF.left = n4 + n5;
        rectF.top = (float)imageView.getTop();
        rectF.right = n6 + n5;
        rectF.bottom = (float)imageView.getBottom();
    }
    
    private final void o() {
        adkp.Q(this.g);
        this.p(false);
        final aeea h = this.h;
        if (h != null) {
            h.cG(xaa.c(116672)).i();
        }
        long n;
        if (this.v == gzn.a) {
            n = this.b(this.j() - this.m);
        }
        else {
            n = this.b(this.k() - this.m * 3);
        }
        this.q(n, this.v, false);
        this.v = null;
        this.l.setText((CharSequence)this.b.a);
    }
    
    private final void p(final boolean g) {
        this.g = g;
        final ViewParent parent = this.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(g);
        }
    }
    
    private final void q(final long n, final gzn gzn, final boolean b) {
        final gzn a = gzn.a;
        final int ordinal = gzn.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                return;
            }
            if (b) {
                this.a.ac(n, (Runnable)new gtp(this, n, 3));
                return;
            }
            this.b.b(n);
            this.a.ab(n);
        }
        else {
            if (b) {
                this.a.ac(n, (Runnable)new gtp(this, n, 2));
                return;
            }
            this.b.c(n);
            this.a.ab(n);
        }
    }
    
    private static final int r(final int n) {
        return Color.rgb(Color.red(n), Color.green(n), Color.blue(n));
    }
    
    public final int a(final long n) {
        return (int)(n * this.t / this.d());
    }
    
    public final long b(final float n) {
        return Math.min((long)(n / this.t * this.d()), this.d());
    }
    
    public final long d() {
        final long i = this.a.I();
        if (i > 0L) {
            this.y = i;
        }
        return this.y;
    }
    
    public final void e(final float n) {
        final ImageView c = this.c;
        final int left = (int)n;
        c.setLeft(left);
        this.c.setRight(this.f + left);
        this.l.setLeft(left + this.m);
    }
    
    public final void f(final float n) {
        final ImageView d = this.d;
        final int n2 = (int)n;
        d.setLeft(this.f + n2);
        final ImageView d2 = this.d;
        final int f = this.f;
        d2.setRight(f + f + n2);
        this.l.setRight(n2 + this.f);
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        final gzn gzn = null;
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.v = null;
            }
        }
        else if (motionEvent.getPointerCount() == 1) {
            final int pointerId = motionEvent.getPointerId(0);
            this.u = pointerId;
            final float l = l(motionEvent, pointerId);
            final RectF rectF = new RectF();
            this.n(this.c, rectF);
            final float left = rectF.left;
            final float right = rectF.right;
            this.n(this.d, rectF);
            final float left2 = rectF.left;
            float right2 = rectF.right;
            float n = left;
            float n2 = right;
            float n3 = left2;
            if (right > left2) {
                final float n4 = (right - left2) / 2.0f;
                n = left - n4;
                n2 = right - n4;
                n3 = left2 + n4;
                right2 += n4;
            }
            gzn v;
            if (l >= n && l <= n2) {
                v = gzn.a;
            }
            else {
                v = gzn;
                if (l >= n3) {
                    v = gzn;
                    if (l <= right2) {
                        v = gzn.b;
                    }
                }
            }
            this.v = v;
        }
        return this.v != null;
    }
    
    protected final void onLayout(final boolean b, int backgroundColor, int left, int top, int n) {
        this.i.set(this.getPaddingLeft(), this.getPaddingTop(), this.getWidth() - this.getPaddingRight(), this.getHeight() - this.getPaddingBottom());
        left = this.getPaddingLeft();
        backgroundColor = this.getWidth() - this.getPaddingRight();
        top = this.m;
        this.w = (float)(left + top);
        this.x = (float)(backgroundColor - top);
        final gzw b2 = this.b;
        top = this.getPaddingTop();
        final int height = this.getHeight();
        n = this.getPaddingBottom();
        b2.e.left = left;
        b2.e.top = top;
        b2.e.right = backgroundColor;
        b2.e.bottom = height - n;
        final float t = this.x - this.w - this.f;
        this.t = t;
        this.s = t * 100.0f / this.d();
        final gzw b3 = this.b;
        final Rect e = b3.e;
        final long g = b3.g;
        if (g == 0L || g > this.d()) {
            this.b.b(this.d());
        }
        this.k.left = this.a(this.b.f) + this.m;
        this.k.right = this.a(this.b.g) + this.m * 3;
        final int top2 = e.top;
        n = e.bottom;
        left = this.k.left;
        backgroundColor = this.m;
        left -= backgroundColor;
        this.c.layout(left, top2, backgroundColor + backgroundColor + left, n);
        left = this.k.right;
        backgroundColor = this.m;
        left -= backgroundColor;
        this.d.layout(left, top2, backgroundColor + backgroundColor + left, n);
        this.l.setText((CharSequence)this.b.a);
        final TextView l = this.l;
        final gzw b4 = this.b;
        backgroundColor = b4.b;
        top = b4.c;
        left = backgroundColor;
        if (r(top) != this.p) {
            left = backgroundColor;
            if (top != 0) {
                left = top;
            }
        }
        backgroundColor = r(left);
        final HashMap q = this.q;
        final Integer value = backgroundColor;
        if (q.containsKey(value)) {
            backgroundColor = (int)this.q.get(value);
        }
        else {
            backgroundColor = this.o;
        }
        l.setTextColor(backgroundColor);
        top = (backgroundColor = this.o);
        if (left != top) {
            backgroundColor = r(left);
        }
        final HashMap r = this.r;
        final Integer value2 = left;
        if (r.containsKey(value2)) {
            backgroundColor = (int)this.r.get(value2);
        }
        ((View)l).setBackgroundColor(backgroundColor);
        final int height2 = this.getHeight();
        top = this.getPaddingTop();
        left = this.l.getLineHeight();
        this.l.setIncludeFontPadding(false);
        final TextView i = this.l;
        backgroundColor = this.m;
        left = (height2 - (top + top) - left) / 2;
        backgroundColor += backgroundColor;
        i.setPadding(backgroundColor, left, backgroundColor, 0);
        this.l.setEllipsize(TextUtils$TruncateAt.END);
        this.l.setMaxLines(1);
        this.l.layout(this.k.left, top2, this.k.right, n);
        this.c.setContentDescription((CharSequence)this.getResources().getString(2132017290, new Object[] { this.b.a }));
        this.d.setContentDescription((CharSequence)this.getResources().getString(2132017379, new Object[] { this.b.a }));
        this.getHitRect(this.j);
        if (Build$VERSION.SDK_INT >= 29) {
            this.setSystemGestureExclusionRects((List)afeq.r((Object)this.j));
            this.d.setSystemGestureExclusionRects((List)afeq.r((Object)this.j));
        }
        final aeea h = this.h;
        if (h != null) {
            final twx cg = h.cG(xaa.c(116672));
            cg.k(true);
            cg.c();
        }
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        if (this.v == null) {
            return super.onTouchEvent(motionEvent);
        }
        final float l = l(motionEvent, this.u);
        final int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked == 3) {
                    if (this.g) {
                        this.o();
                    }
                }
            }
            else {
                final boolean g = this.g;
                boolean b = false;
                final boolean b2 = false;
                if (!g) {
                    boolean b3 = b2;
                    if (this.v != null) {
                        b3 = true;
                    }
                    adkp.Q(b3);
                    adkp.Q(this.g ^ true);
                    this.a.W();
                    this.p(true);
                }
                else {
                    if (this.v != null) {
                        b = true;
                    }
                    adkp.Q(b);
                    float n = this.j();
                    float n2 = this.k();
                    final gzn a = gzn.a;
                    final int ordinal = this.v.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            n2 = Math.min(this.x, Math.max(l, this.f + n + this.s));
                            final TextView i = this.l;
                            final int n3 = (int)n2;
                            i.setRight(n3);
                            this.i.right = n3;
                            this.q(this.b(n2 - this.m * 3), this.v, true);
                        }
                    }
                    else {
                        n = Math.max(this.w, Math.min(l, n2 - this.f - this.s));
                        final TextView j = this.l;
                        final int n4 = (int)n;
                        j.setLeft(n4);
                        this.i.left = n4;
                        this.q(this.b(n - this.m), this.v, true);
                    }
                    final ImageView c = this.c;
                    final int m = this.m;
                    final int n5 = (int)n;
                    c.setLeft(n5 - m);
                    this.c.setRight(n5 + this.m);
                    final ImageView d = this.d;
                    final int k = this.m;
                    final int n6 = (int)n2;
                    d.setLeft(n6 - k);
                    this.d.setRight(n6 + this.m);
                }
            }
        }
        else if (motionEvent.getActionIndex() == motionEvent.findPointerIndex(this.u) && this.g) {
            this.o();
        }
        return true;
    }
}
