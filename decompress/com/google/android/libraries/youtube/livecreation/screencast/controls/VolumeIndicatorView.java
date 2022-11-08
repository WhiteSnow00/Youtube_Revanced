// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.livecreation.screencast.controls;

import android.graphics.Canvas;
import android.util.AttributeSet;
import android.content.res.Resources;
import android.graphics.Paint$Style;
import android.os.Looper;
import android.content.Context;
import android.os.HandlerThread;
import android.graphics.Paint;
import android.graphics.Rect;
import android.media.audiofx.AutomaticGainControl;
import android.media.AudioRecord;
import android.os.Handler;
import android.media.AudioRecord$OnRecordPositionUpdateListener;
import android.view.View;

public final class VolumeIndicatorView extends View implements AudioRecord$OnRecordPositionUpdateListener
{
    public final Handler a;
    public final Handler b;
    public AudioRecord c;
    public boolean d;
    public volatile double e;
    public short[] f;
    public AutomaticGainControl g;
    public final Runnable h;
    public final Runnable i;
    private final Rect j;
    private final Paint k;
    private final Paint l;
    private final Paint m;
    private final Paint n;
    private final int o;
    private final int p;
    private final HandlerThread q;
    private final Runnable r;
    private final Runnable s;
    private final Runnable t;
    
    public VolumeIndicatorView(Context context) {
        super(context);
        this.j = new Rect();
        this.b = new Handler(Looper.getMainLooper());
        this.h = (Runnable)new wkw(this, 20);
        this.r = (Runnable)new wnt(this, 1);
        this.s = (Runnable)new wnt(this, 0);
        this.i = (Runnable)new wnt(this, 2);
        this.t = (Runnable)new wnt(this, 3);
        this.setWillNotDraw(false);
        context = this.getContext();
        final Resources resources = context.getResources();
        final Paint l = new Paint();
        (this.l = l).setStyle(Paint$Style.FILL);
        l.setColor(agx.a(context, 2131102028));
        final Paint k = new Paint();
        (this.k = k).setStyle(Paint$Style.FILL);
        k.setColor(agx.a(context, 2131102027));
        final Paint m = new Paint();
        (this.m = m).setStyle(Paint$Style.FILL);
        m.setColor(agx.a(context, 2131102029));
        final Paint n = new Paint();
        (this.n = n).setStyle(Paint$Style.FILL);
        n.setColor(agx.a(context, 2131102030));
        this.o = resources.getDimensionPixelSize(2131169452);
        this.p = resources.getDimensionPixelSize(2131169453);
        final HandlerThread q = new HandlerThread("MicThread", 0);
        (this.q = q).start();
        this.a = new Handler(q.getLooper());
    }
    
    public VolumeIndicatorView(Context context, final AttributeSet set) {
        super(context, set);
        this.j = new Rect();
        this.b = new Handler(Looper.getMainLooper());
        this.h = (Runnable)new wkw(this, 20);
        this.r = (Runnable)new wnt(this, 1);
        this.s = (Runnable)new wnt(this, 0);
        this.i = (Runnable)new wnt(this, 2);
        this.t = (Runnable)new wnt(this, 3);
        this.setWillNotDraw(false);
        context = this.getContext();
        final Resources resources = context.getResources();
        final Paint l = new Paint();
        (this.l = l).setStyle(Paint$Style.FILL);
        l.setColor(agx.a(context, 2131102028));
        final Paint k = new Paint();
        (this.k = k).setStyle(Paint$Style.FILL);
        k.setColor(agx.a(context, 2131102027));
        final Paint m = new Paint();
        (this.m = m).setStyle(Paint$Style.FILL);
        m.setColor(agx.a(context, 2131102029));
        final Paint n = new Paint();
        (this.n = n).setStyle(Paint$Style.FILL);
        n.setColor(agx.a(context, 2131102030));
        this.o = resources.getDimensionPixelSize(2131169452);
        this.p = resources.getDimensionPixelSize(2131169453);
        final HandlerThread q = new HandlerThread("MicThread", 0);
        (this.q = q).start();
        this.a = new Handler(q.getLooper());
    }
    
    public VolumeIndicatorView(Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.j = new Rect();
        this.b = new Handler(Looper.getMainLooper());
        this.h = (Runnable)new wkw(this, 20);
        this.r = (Runnable)new wnt(this, 1);
        this.s = (Runnable)new wnt(this, 0);
        this.i = (Runnable)new wnt(this, 2);
        this.t = (Runnable)new wnt(this, 3);
        this.setWillNotDraw(false);
        context = this.getContext();
        final Resources resources = context.getResources();
        final Paint l = new Paint();
        (this.l = l).setStyle(Paint$Style.FILL);
        l.setColor(agx.a(context, 2131102028));
        final Paint k = new Paint();
        (this.k = k).setStyle(Paint$Style.FILL);
        k.setColor(agx.a(context, 2131102027));
        final Paint m = new Paint();
        (this.m = m).setStyle(Paint$Style.FILL);
        m.setColor(agx.a(context, 2131102029));
        final Paint n2 = new Paint();
        (this.n = n2).setStyle(Paint$Style.FILL);
        n2.setColor(agx.a(context, 2131102030));
        this.o = resources.getDimensionPixelSize(2131169452);
        this.p = resources.getDimensionPixelSize(2131169453);
        final HandlerThread q = new HandlerThread("MicThread", 0);
        (this.q = q).start();
        this.a = new Handler(q.getLooper());
    }
    
    public final void a() {
        this.d();
        this.a.post(this.t);
    }
    
    public final void b() {
        szc.e();
        agot.u(this.d ^ true);
        final AutomaticGainControl g = this.g;
        if (g != null) {
            g.release();
            this.g = null;
        }
        final AudioRecord c = this.c;
        if (c != null) {
            c.setRecordPositionUpdateListener((AudioRecord$OnRecordPositionUpdateListener)null);
            this.c.release();
            this.c = null;
        }
        this.f = null;
    }
    
    public final void c() {
        this.a.post(this.r);
        this.a.post(this.i);
    }
    
    public final void d() {
        this.a.removeCallbacks(this.i);
        this.a.post(this.s);
    }
    
    public final void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        if (this.c == null) {
            return;
        }
        final int n = this.getMeasuredWidth() - this.o;
        final int measuredHeight = this.getMeasuredHeight();
        int n2 = 1;
        if (n > 0) {
            n2 = 1 + n / (this.o + this.p);
        }
        final double e = this.e;
        final double n3 = n2;
        Double.isNaN(n3);
        final int n4 = (int)Math.round(e * n3);
        final double n5 = n2 * 50;
        Double.isNaN(n5);
        final int n6 = (int)Math.round(n5 / 100.0);
        final double n7 = n2 * 70;
        Double.isNaN(n7);
        final int n8 = (int)Math.round(n7 / 100.0);
        int i = 0;
        int n9 = 0;
        while (i < n2) {
            Paint paint = this.l;
            if (i < n4) {
                if (i < n6) {
                    paint = this.k;
                }
                else if (i < n8) {
                    paint = this.m;
                }
                else {
                    paint = this.n;
                }
            }
            this.j.set(n9, 0, this.o + n9, measuredHeight);
            canvas.drawRect(this.j, paint);
            n9 += this.o + this.p;
            ++i;
        }
    }
    
    public final void onMarkerReached(final AudioRecord audioRecord) {
    }
    
    public final void onPeriodicNotification(final AudioRecord audioRecord) {
        szc.f();
        this.invalidate();
    }
}
