// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded;

import android.graphics.drawable.Drawable;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.legacy.a;
import android.view.MotionEvent;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import android.graphics.Paint$Align;
import android.graphics.Canvas;
import android.content.Context;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import java.util.Map;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.StateListDrawable;
import android.view.View;

public final class f extends View
{
    public e a;
    public StateListDrawable b;
    public int c;
    public int d;
    public int e;
    public int f;
    public Rect g;
    public Rect h;
    public Rect i;
    public Rect j;
    public Paint k;
    public Paint l;
    public Map m;
    private ControlsOverlayStyle n;
    private boolean o;
    private boolean p;
    private long q;
    private long r;
    private long s;
    private long t;
    private String u;
    private String v;
    private final pvh w;
    
    public f(final Context context, final pvh w, final byte[] array, final byte[] array2, final byte[] array3) {
        super(context);
        this.w = w;
    }
    
    private final long c(int min) {
        final Rect bounds = this.a.getBounds();
        final int n = bounds.left + this.f;
        final int n2 = bounds.right - this.f;
        min = Math.min(n2, Math.max(n, min));
        return this.s * (min - n) / (n2 - n);
    }
    
    private final String d(final long n) {
        final int n2 = (int)n / 1000;
        final String format = String.format("%02d:%02d", n2 / 60 % 60, n2 % 60);
        if (this.s >= 3600000L) {
            return String.format("%d:%s", n2 / 3600, format);
        }
        return format;
    }
    
    private final void e() {
        this.p = false;
        this.b.setState(com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded.f.ENABLED_STATE_SET);
        this.invalidate();
        this.getParent().requestDisallowInterceptTouchEvent(false);
    }
    
    private final void f(final int n, final int n2) {
        final long s = this.s;
        String s2;
        if (s >= 36000000L) {
            s2 = "10:00:00";
        }
        else if (s >= 3600000L) {
            s2 = "0:00:00";
        }
        else {
            s2 = "00:00";
        }
        this.k.getTextBounds(s2, 0, s2.length(), this.g);
        final int intrinsicHeight = this.a.getIntrinsicHeight();
        if (n >= this.c) {
            final e a = this.a;
            final int width = this.g.width();
            final int d = this.d;
            final int n3 = n2 / 2;
            final int n4 = intrinsicHeight / 2;
            final int width2 = this.g.width();
            final int n5 = n3 - n4;
            a.setBounds(width + d, n5, n - d - width2, n5 + intrinsicHeight);
            this.g.offset(0, this.a.getBounds().centerY() - this.g.centerY());
        }
        else {
            final e a2 = this.a;
            final int d2 = this.d;
            final int n6 = n2 / 2 - intrinsicHeight / 2;
            a2.setBounds(d2, n6, n - d2, n6 + intrinsicHeight);
        }
        this.a.copyBounds(this.i);
        this.i.inset(0, -(n2 - intrinsicHeight) / 2);
    }
    
    private final void g() {
        final Rect bounds = this.a.getBounds();
        final int f = this.f;
        final int n = bounds.width() - this.f - f;
        long n2;
        if (this.p) {
            n2 = this.q;
        }
        else {
            n2 = this.r;
        }
        final long s = this.s;
        int n3 = 0;
        int n4;
        if (s > 0L) {
            n4 = (int)(f + n * n2 / s);
        }
        else {
            n4 = 0;
        }
        final StateListDrawable b = this.b;
        final int left = bounds.left;
        final int centerY = bounds.centerY();
        final int intrinsicWidth = ((Drawable)b).getIntrinsicWidth();
        final int intrinsicHeight = ((Drawable)b).getIntrinsicHeight();
        final int n5 = intrinsicWidth / 2;
        final int n6 = centerY - intrinsicHeight / 2;
        final int n7 = left + n4 - n5;
        ((Drawable)b).setBounds(n7, n6, intrinsicWidth + n7, intrinsicHeight + n6);
        this.b.copyBounds(this.h);
        final Rect h = this.h;
        final int n8 = -this.e;
        h.inset(n8, n8);
        int n9;
        if (bounds.width() > 0) {
            n9 = n4 * 100 / bounds.width();
        }
        else {
            n9 = 0;
        }
        int n10;
        if (n > 0) {
            n10 = (n4 - f) * 100 / n;
        }
        else {
            n10 = 0;
        }
        if (!this.o) {
            n9 = n10;
        }
        final long s2 = this.s;
        int n11;
        if (s2 > 0L) {
            n11 = (int)(f + this.t * n / s2);
        }
        else {
            n11 = 0;
        }
        if (n > 0) {
            n3 = (n11 - f) * 100 / n;
        }
        this.a.setLevel(n3 * 1000 + n9);
        this.u = this.d(n2);
        this.invalidate();
    }
    
    private final void h() {
        final boolean s = this.n.s;
        boolean o;
        final boolean b = o = false;
        if (s) {
            o = b;
            if (this.isEnabled()) {
                o = b;
                if (this.s > 0L) {
                    o = true;
                }
            }
        }
        this.o = o;
        if (this.p && !o) {
            this.e();
        }
        this.g();
    }
    
    public final void a(final ControlsOverlayStyle n) {
        this.n = n;
        this.h();
        this.a.setState(new int[] { (n == ControlsOverlayStyle.i) ? 1 : 0 });
        this.invalidate();
    }
    
    public final void b(final long r, final long s, final long t) {
        final long s2 = this.s;
        this.r = r;
        this.t = t;
        this.s = s;
        if (s != s2 || this.v == null) {
            this.h();
            this.v = this.d(s);
            if (s / 3600000L != s2 / 3600000L) {
                this.f(this.getWidth(), this.getHeight());
            }
        }
        this.g();
        this.invalidate();
    }
    
    protected final void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        this.a.draw(canvas);
        if (this.o) {
            this.b.draw(canvas);
        }
        if (this.getWidth() >= this.c) {
            this.k.setTextAlign(Paint$Align.RIGHT);
            canvas.drawText(this.u, (float)this.g.right, (float)this.g.bottom, this.k);
            this.k.setTextAlign(Paint$Align.RIGHT);
            canvas.drawText(this.v, (float)this.getWidth(), (float)this.g.bottom, this.k);
        }
        final Map m = this.m;
        if (m != null && this.s > 0L) {
            final TimelineMarker[] array = m.get(abea.a);
            if (array != null) {
                final Rect bounds = this.a.getBounds();
                this.j.top = bounds.top;
                this.j.bottom = bounds.bottom;
                for (int i = 0; i < array.length; ++i) {
                    final long a = array[i].a;
                    if (a == 9223372036854775806L) {
                        this.j.right = bounds.right;
                        final Rect j = this.j;
                        j.left = j.right - 4;
                    }
                    else {
                        final long min = Math.min(this.s, Math.max(0L, a));
                        final int n = bounds.left + this.f;
                        final int right = bounds.right;
                        final int f = this.f;
                        final double n2 = (double)min;
                        final double n3 = (double)this.s;
                        final Rect k = this.j;
                        final double n4 = right - f - n;
                        Double.isNaN(n2);
                        Double.isNaN(n3);
                        final double n5 = n2 / n3;
                        Double.isNaN(n4);
                        k.left = n + (int)(n4 * n5 - 2.0);
                        final Rect l = this.j;
                        l.right = l.left + 4;
                    }
                    canvas.drawRect(this.j, this.l);
                }
            }
        }
    }
    
    protected final void onMeasure(final int n, final int n2) {
        this.setMeasuredDimension(getDefaultSize(this.a.getIntrinsicWidth(), n), getDefaultSize(Math.max(this.g.height(), Math.max(this.h.height(), this.i.height())), n2));
    }
    
    protected final void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        this.f(n, n2);
        this.g();
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        this.e();
                        return true;
                    }
                }
                else if (this.p) {
                    this.q = this.c((int)motionEvent.getX());
                    this.g();
                    return true;
                }
            }
            else if (this.p) {
                this.e();
                final pvh w = this.w;
                ((a)w.a).a.r((int)this.q);
                ((a)w.a).B();
                return true;
            }
        }
        else if (!this.p && this.o) {
            final int n = (int)motionEvent.getX();
            final int n2 = (int)motionEvent.getY();
            if (this.h.contains(n, n2) || this.i.contains(n, n2)) {
                this.p = true;
                this.getParent().requestDisallowInterceptTouchEvent(true);
                this.b.setState(View.PRESSED_ENABLED_STATE_SET);
                this.q = this.c((int)motionEvent.getX());
                this.g();
                final pvh w2 = this.w;
                ((a)w2.a).A();
                ((a)w2.a).a.q();
                return true;
            }
        }
        return false;
    }
    
    public final void setEnabled(final boolean enabled) {
        super.setEnabled(enabled);
        this.h();
    }
}
