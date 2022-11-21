import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Rect;
import android.graphics.Path$FillType;
import android.graphics.Path;
import android.graphics.Canvas;
import android.animation.Animator$AnimatorListener;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.animation.LinearInterpolator;
import android.animation.Animator;
import android.content.res.Resources;
import android.view.animation.Interpolator;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cho extends Drawable implements Animatable
{
    private static final Interpolator e;
    private static final Interpolator f;
    private static final int[] g;
    public final chn a;
    public final Resources b;
    public float c;
    public boolean d;
    private float h;
    private final Animator i;
    
    static {
        e = (Interpolator)new LinearInterpolator();
        f = (Interpolator)new atu();
        g = new int[] { -16777216 };
    }
    
    public cho(final Context context) {
        afc.j(context);
        this.b = context.getResources();
        final chn a = new chn();
        (this.a = a).c(cho.g);
        a.e(2.5f);
        this.invalidateSelf();
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[] { 0.0f, 1.0f });
        ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new lez(this, a, 1));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator((TimeInterpolator)cho.e);
        ofFloat.addListener((Animator$AnimatorListener)new gkf(this, a, 1));
        this.i = (Animator)ofFloat;
    }
    
    public static final void e(float n, final chn chn) {
        if (n > 0.75f) {
            final int a = chn.a();
            final int[] i = chn.i;
            chn.g();
            final int n2 = i[0];
            final int n3 = a & 0xFF;
            n = (n - 0.75f) / 0.25f;
            final int n4 = (int)(((n2 & 0xFF) - n3) * n);
            final int n5 = a >> 8 & 0xFF;
            final int n6 = (int)(((n2 >> 8 & 0xFF) - n5) * n);
            final int n7 = a >> 16 & 0xFF;
            final int n8 = (int)(((n2 >> 16 & 0xFF) - n7) * n);
            final int n9 = a >> 24 & 0xFF;
            chn.t = (n9 + (int)(n * ((n2 >> 24 & 0xFF) - n9)) << 24 | n7 + n8 << 16 | n5 + n6 << 8 | n3 + n4);
            return;
        }
        chn.t = chn.a();
    }
    
    public final void a(final float n, final chn chn, final boolean b) {
        if (this.d) {
            e(n, chn);
            final double floor = Math.floor(chn.l / 0.8f);
            final float j = chn.j;
            final float k = chn.k;
            chn.e = j + (-0.01f + k - j) * n;
            chn.f = k;
            final float l = chn.l;
            chn.g = l + ((float)(floor + 1.0) - l) * n;
            return;
        }
        if (n == 1.0f && !b) {
            return;
        }
        final float i = chn.l;
        float m;
        float f;
        if (n < 0.5f) {
            final float n2 = n / 0.5f;
            m = chn.j;
            f = cho.f.getInterpolation(n2) * 0.79f + 0.01f + m;
        }
        else {
            final float n3 = (-0.5f + n) / 0.5f;
            f = chn.j + 0.79f;
            m = f - ((1.0f - cho.f.getInterpolation(n3)) * 0.79f + 0.01f);
        }
        final float c = this.c;
        chn.e = m;
        chn.f = f;
        chn.g = i + 0.20999998f * n;
        this.h = (n + c) * 216.0f;
    }
    
    public final void b(final boolean b) {
        this.a.d(b);
        this.invalidateSelf();
    }
    
    public final void c(final float o) {
        final chn a = this.a;
        if (o != a.o) {
            a.o = o;
        }
        this.invalidateSelf();
    }
    
    public final void d(final float f) {
        final chn a = this.a;
        a.e = 0.0f;
        a.f = f;
        this.invalidateSelf();
    }
    
    public final void draw(final Canvas canvas) {
        final Rect bounds = this.getBounds();
        canvas.save();
        canvas.rotate(this.h, bounds.exactCenterX(), bounds.exactCenterY());
        final chn a = this.a;
        final RectF a2 = a.a;
        final float p = a.p;
        float n = a.h / 2.0f + p;
        if (p <= 0.0f) {
            n = Math.min(bounds.width(), bounds.height()) / 2.0f - Math.max(a.q * a.o / 2.0f, a.h / 2.0f);
        }
        a2.set(bounds.centerX() - n, bounds.centerY() - n, bounds.centerX() + n, bounds.centerY() + n);
        final float e = a.e;
        final float g = a.g;
        final float f = a.f;
        a.b.setColor(a.t);
        a.b.setAlpha(a.s);
        final float n2 = a.h / 2.0f;
        a2.inset(n2, n2);
        canvas.drawCircle(a2.centerX(), a2.centerY(), a2.width() / 2.0f, a.d);
        final float n3 = -n2;
        a2.inset(n3, n3);
        final Paint b = a.b;
        final float n4 = (e + g) * 360.0f;
        final float n5 = (f + g) * 360.0f - n4;
        canvas.drawArc(a2, n4, n5, false, b);
        if (a.m) {
            final Path n6 = a.n;
            if (n6 == null) {
                (a.n = new Path()).setFillType(Path$FillType.EVEN_ODD);
            }
            else {
                n6.reset();
            }
            final float n7 = Math.min(a2.width(), a2.height()) / 2.0f;
            final float n8 = (float)a.q;
            final float o = a.o;
            a.n.moveTo(0.0f, 0.0f);
            a.n.lineTo(a.q * a.o, 0.0f);
            final Path n9 = a.n;
            final float n10 = (float)a.q;
            final float o2 = a.o;
            n9.lineTo(n10 * o2 / 2.0f, a.r * o2);
            a.n.offset(n7 + a2.centerX() - n8 * o / 2.0f, a2.centerY() + a.h / 2.0f);
            a.n.close();
            a.c.setColor(a.t);
            a.c.setAlpha(a.s);
            canvas.save();
            canvas.rotate(n4 + n5, a2.centerX(), a2.centerY());
            canvas.drawPath(a.n, a.c);
            canvas.restore();
        }
        canvas.restore();
    }
    
    public final int getAlpha() {
        return this.a.s;
    }
    
    public final int getOpacity() {
        return -3;
    }
    
    public final boolean isRunning() {
        return this.i.isRunning();
    }
    
    public final void setAlpha(final int s) {
        this.a.s = s;
        this.invalidateSelf();
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
        this.a.b.setColorFilter(colorFilter);
        this.invalidateSelf();
    }
    
    public final void start() {
        this.i.cancel();
        this.a.f();
        final chn a = this.a;
        if (a.f != a.e) {
            this.d = true;
            this.i.setDuration(666L);
            this.i.start();
            return;
        }
        a.h();
        this.a.b();
        this.i.setDuration(1332L);
        this.i.start();
    }
    
    public final void stop() {
        this.i.cancel();
        this.h = 0.0f;
        this.a.d(false);
        this.a.h();
        this.a.b();
        this.invalidateSelf();
    }
}
