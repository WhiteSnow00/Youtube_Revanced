// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.reel.watch.overlay;

import android.content.res.Resources$Theme;
import android.graphics.Paint$Style;
import android.os.SystemClock;
import android.provider.Settings$SettingNotFoundException;
import android.provider.Settings$System;
import android.graphics.Canvas;
import android.util.TypedValue;
import android.util.DisplayMetrics;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.Paint;
import android.view.View;

public class ReelPlayerProgressPresenter extends View
{
    public volatile long a;
    public volatile long b;
    public long c;
    private int d;
    private int e;
    private int f;
    private volatile long g;
    private volatile float h;
    private volatile float i;
    private volatile boolean j;
    private int k;
    private float l;
    private long m;
    private final float[] n;
    private final float[] o;
    private final float[] p;
    private final float[] q;
    private final float[] r;
    private final float[] s;
    private boolean t;
    private final Paint u;
    private final Paint v;
    private final Paint w;
    private final RectF x;
    private final Runnable y;
    
    public ReelPlayerProgressPresenter(final Context context) {
        super(context);
        this.g = 0L;
        this.j = true;
        this.m = -1L;
        this.n = new float[101];
        this.o = new float[101];
        this.p = new float[101];
        this.q = new float[101];
        this.r = new float[101];
        this.s = new float[101];
        this.t = true;
        this.u = new Paint(1);
        this.v = new Paint(1);
        this.w = new Paint(1);
        this.x = new RectF();
        this.y = (Runnable)new hmi(this, 10);
    }
    
    public ReelPlayerProgressPresenter(final Context context, final AttributeSet set) {
        super(context, set);
        this.g = 0L;
        this.j = true;
        this.m = -1L;
        this.n = new float[101];
        this.o = new float[101];
        this.p = new float[101];
        this.q = new float[101];
        this.r = new float[101];
        this.s = new float[101];
        this.t = true;
        this.u = new Paint(1);
        this.v = new Paint(1);
        this.w = new Paint(1);
        this.x = new RectF();
        this.y = (Runnable)new hmi(this, 10);
    }
    
    private static float e(final DisplayMetrics displayMetrics, final float n) {
        return TypedValue.applyDimension(1, n, displayMetrics);
    }
    
    private final void f(final Canvas canvas, final float n, final float n2, final float n3, final float n4, final Paint paint) {
        final float l = this.l;
        canvas.drawRoundRect(n, n2, n3, n4, l, l, paint);
    }
    
    protected final void a() {
        if (this.m < 0L) {
            try {
                this.m = (long)(Settings$System.getFloat(this.getContext().getContentResolver(), "animator_duration_scale") * 500.0f);
            }
            catch (final Settings$SettingNotFoundException ex) {
                this.m = 500L;
            }
        }
    }
    
    public final void b(final anrf anrf, final boolean b, int n, int i, int n2, float e) {
        this.t = true;
        final int d = this.d;
        final int e2 = this.e;
        final int k = this.k;
        int d2;
        if (anrf == null) {
            if (b) {
                d2 = 1;
            }
            else {
                d2 = 0;
            }
        }
        else {
            d2 = anrf.d;
        }
        this.d = d2;
        int e3;
        if (anrf == null) {
            e3 = 0;
        }
        else {
            e3 = anrf.c - 1;
        }
        this.e = e3;
        this.a();
        if (anrf != null) {
            this.setContentDescription((CharSequence)this.getResources().getString(2132019352, new Object[] { anrf.c, anrf.d }));
        }
        this.b = 0L;
        this.a = 0L;
        this.i = 0.0f;
        this.g = 0L;
        this.h = 0.0f;
        int n3;
        if (d != this.d) {
            n3 = 0;
        }
        else {
            n3 = this.e - e2;
        }
        if (n3 != 0 && Math.abs(n3) <= 0) {
            this.g = SystemClock.elapsedRealtime();
            final float[] n4 = this.n;
            final float[] p6 = this.p;
            final int length = n4.length;
            System.arraycopy(n4, 0, p6, 0, 101);
            final float[] o = this.o;
            final float[] q = this.q;
            final int length2 = o.length;
            System.arraycopy(o, 0, q, 0, 101);
        }
        int d3 = this.d;
        this.k = 0;
        int min = 100;
        int n5 = 0;
        int min2 = 0;
        Label_0365: {
            if (d3 > 100) {
                final int e4 = this.e;
                if (e4 < d3) {
                    final int max = Math.max(0, e4);
                    this.k = max;
                    n5 = Math.min(0, max);
                    final int n6 = this.d - this.k;
                    min = Math.min(100, n6);
                    min2 = Math.min(0, n6 - min);
                    break Label_0365;
                }
                d3 -= 100;
                this.k = d3;
                n5 = Math.min(0, d3);
            }
            else {
                min = d3;
                n5 = 0;
            }
            min2 = 0;
        }
        final DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();
        final int width = this.getWidth();
        final int height = this.getHeight();
        this.l = e(displayMetrics, 1.0f);
        final float e5 = e(displayMetrics, 2.0f);
        final float e6 = e(displayMetrics, 6.0f);
        e = e(displayMetrics, e);
        this.x.top = (height - e) / 2.0f;
        final RectF x = this.x;
        x.bottom = x.top + e;
        int n8;
        int n7 = n8 = n5 + min + min2;
        while (true) {
            final float[] n9 = this.n;
            final int length3 = n9.length;
            if (n8 >= 101) {
                break;
            }
            n9[n8] = 0.0f;
            this.o[n8] = 0.0f;
            ++n8;
        }
        int j = 0;
        e = 0.0f;
        while (j < n5) {
            this.n[j] = e;
            e += e6;
            this.o[j] = e;
            e += e5;
            ++j;
        }
        float n10 = (float)width;
        --n7;
        for (int l = 0; l < min2; ++l, --n7) {
            this.o[n7] = n10;
            final float n11 = n10 - e6;
            this.n[n7] = n11;
            n10 = n11 - e5;
        }
        if (min > 0) {
            final float n12 = (n10 - e + 1.0f - (min - 1) * e5) / min;
            for (int n13 = n5, n14 = 0; n14 < min; ++n14, ++n13) {
                this.n[n13] = e;
                e += n12;
                this.o[n13] = e;
                e += e5;
            }
        }
        this.f = n5 + this.e - this.k;
        if (this.t) {
            this.t = false;
            final Resources$Theme theme = this.getContext().getTheme();
            final TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(n2, typedValue, true);
            this.u.setStyle(Paint$Style.FILL);
            this.u.setColor(typedValue.data);
            theme.resolveAttribute(n, typedValue, true);
            this.v.setStyle(Paint$Style.FILL);
            this.v.setColor(typedValue.data);
            theme.resolveAttribute(i, typedValue, true);
            this.w.setStyle(Paint$Style.FILL);
            this.w.setColor(typedValue.data);
        }
        if ((n = n3) != 0) {
            n = this.k - k;
        }
        if (n != 0) {
            float n15;
            for (i = this.n.length, i = 0; i < 101; ++i) {
                n2 = i + n;
                if (n2 >= 0 && n2 < 101) {
                    n15 = this.p[n2];
                    if (n15 != 0.0f || this.q[n2] != 0.0f) {
                        e = this.n[i];
                        if (e != 0.0f || this.o[i] != 0.0f) {
                            this.r[i] = e - n15;
                            this.s[i] = this.o[i] - this.q[n2];
                            continue;
                        }
                    }
                }
                this.r[i] = 0.0f;
                this.s[i] = 0.0f;
            }
            this.c();
            return;
        }
        this.g = 0L;
        this.invalidate();
    }
    
    public final void c() {
        if (!this.isAttachedToWindow()) {
            return;
        }
        final long a = this.a;
        int n2;
        final int n = n2 = 0;
        if (a > 0L) {
            n2 = n;
            if (this.b > 0L) {
                n2 = n;
                if (!this.j) {
                    final long b = this.b;
                    this.b = SystemClock.elapsedRealtime();
                    final long c = this.c + (this.b - b);
                    this.c = c;
                    if (c <= this.a) {
                        this.i = this.c / (float)this.a;
                        n2 = 1;
                    }
                    else {
                        this.a = 0L;
                        this.j = true;
                        n2 = n;
                    }
                }
            }
        }
        Label_0201: {
            if (this.g > 0L) {
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                final long g = this.g;
                final long m = this.m;
                if (m == 0L) {
                    this.h = 0.0f;
                }
                else {
                    this.h = 1.0f - (elapsedRealtime - g) / (float)m;
                }
                if (this.h >= 0.0f) {
                    break Label_0201;
                }
                this.h = 0.0f;
                this.g = 0L;
            }
            if (n2 == 0) {
                return;
            }
        }
        this.postInvalidateOnAnimation();
        if (this.m != 0L) {
            this.postOnAnimation(this.y);
        }
    }
    
    public final void d(final boolean j) {
        if (this.j && !j) {
            this.b = SystemClock.elapsedRealtime();
        }
        this.j = j;
        this.c();
    }
    
    protected final void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        if (this.d <= 0) {
            return;
        }
        final float top = this.x.top;
        final float bottom = this.x.bottom;
        int n = 0;
        while (true) {
            final float[] n2 = this.n;
            final int length = n2.length;
            if (n >= 101) {
                break;
            }
            final float n3 = n2[n];
            final float n4 = this.o[n];
            if (n4 > n3) {
                float n5 = n3;
                float n6 = n4;
                if (this.h > 0.0f) {
                    n5 = n3 - this.h * this.r[n];
                    n6 = n4 - this.h * this.s[n];
                }
                final int f = this.f;
                Paint paint;
                if (n < f) {
                    paint = this.w;
                }
                else if (n == f) {
                    paint = this.v;
                }
                else {
                    paint = this.u;
                }
                this.f(canvas, n5, top, n6, bottom, paint);
                if (n == this.f && this.i > 0.0f) {
                    try {
                        canvas.save();
                        final float n7 = n5 + this.i * (n6 - n5);
                        canvas.clipRect(n5, top, n7, bottom);
                        this.f(canvas, n5, top, n7, bottom, this.w);
                    }
                    finally {
                        canvas.restore();
                    }
                }
            }
            ++n;
        }
    }
}
