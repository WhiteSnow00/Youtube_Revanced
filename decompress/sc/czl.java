import android.view.Choreographer;
import java.util.Iterator;
import android.animation.Animator;
import android.animation.Animator$AnimatorListener;
import android.view.Choreographer$FrameCallback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class czl extends czi implements Choreographer$FrameCallback
{
    public float b;
    public long c;
    public float d;
    public int e;
    public float f;
    public float g;
    public ctv h;
    public boolean i;
    private boolean j;
    
    public czl() {
        this.b = 1.0f;
        this.j = false;
        this.c = 0L;
        this.d = 0.0f;
        this.e = 0;
        this.f = -2.14748365E9f;
        this.g = 2.14748365E9f;
        this.i = false;
    }
    
    public final float c() {
        final ctv h = this.h;
        if (h == null) {
            return 0.0f;
        }
        final float d = this.d;
        final float h2 = h.h;
        return (d - h2) / (h.i - h2);
    }
    
    public final void cancel() {
        final Iterator iterator = super.a.iterator();
        while (iterator.hasNext()) {
            ((Animator$AnimatorListener)iterator.next()).onAnimationCancel((Animator)this);
        }
        this.h();
    }
    
    public final float d() {
        final ctv h = this.h;
        if (h == null) {
            return 0.0f;
        }
        final float g = this.g;
        if (g == 2.14748365E9f) {
            return h.i;
        }
        return g;
    }
    
    public final void doFrame(final long n) {
        this.g();
        final ctv h = this.h;
        if (h != null && this.i) {
            final long c = this.c;
            long n2 = 0L;
            if (c != 0L) {
                n2 = n - c;
            }
            final float n3 = 1.0E9f / h.j / Math.abs(this.b);
            final float d = this.d;
            final boolean m = this.m();
            float n4 = n2 / n3;
            if (m) {
                n4 = -n4;
            }
            final float d2 = d + n4;
            this.d = d2;
            final boolean i = czm.i(d2, this.e(), this.d());
            this.d = czm.b(this.d, this.e(), this.d());
            this.c = n;
            this.b();
            if (i ^ true) {
                if (this.getRepeatCount() != -1 && this.e >= this.getRepeatCount()) {
                    float d3;
                    if (this.b < 0.0f) {
                        d3 = this.e();
                    }
                    else {
                        d3 = this.d();
                    }
                    this.d = d3;
                    this.h();
                    this.a(this.m());
                }
                else {
                    final Iterator iterator = super.a.iterator();
                    while (iterator.hasNext()) {
                        ((Animator$AnimatorListener)iterator.next()).onAnimationRepeat((Animator)this);
                    }
                    ++this.e;
                    if (this.getRepeatMode() == 2) {
                        this.j ^= true;
                        this.j();
                    }
                    else {
                        float d4;
                        if (this.m()) {
                            d4 = this.d();
                        }
                        else {
                            d4 = this.e();
                        }
                        this.d = d4;
                    }
                    this.c = n;
                }
            }
            if (this.h != null) {
                final float d5 = this.d;
                final float f = this.f;
                if (d5 < f || d5 > this.g) {
                    throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", f, this.g, this.d));
                }
            }
            ctq.a();
        }
    }
    
    public final float e() {
        final ctv h = this.h;
        if (h == null) {
            return 0.0f;
        }
        final float f = this.f;
        if (f == -2.14748365E9f) {
            return h.h;
        }
        return f;
    }
    
    public final void f() {
        this.h();
        this.a(this.m());
    }
    
    public final void g() {
        if (this.i) {
            this.i(false);
            Choreographer.getInstance().postFrameCallback((Choreographer$FrameCallback)this);
        }
    }
    
    public final float getAnimatedFraction() {
        if (this.h == null) {
            return 0.0f;
        }
        float n;
        float n2;
        if (this.m()) {
            n = this.d();
            n2 = this.d;
        }
        else {
            n = this.d;
            n2 = this.e();
        }
        return (n - n2) / (this.d() - this.e());
    }
    
    public final Object getAnimatedValue() {
        return this.c();
    }
    
    public final long getDuration() {
        final ctv h = this.h;
        if (h == null) {
            return 0L;
        }
        return (long)h.a();
    }
    
    public final void h() {
        this.i(true);
    }
    
    protected final void i(final boolean b) {
        Choreographer.getInstance().removeFrameCallback((Choreographer$FrameCallback)this);
        if (b) {
            this.i = false;
        }
    }
    
    public final boolean isRunning() {
        return this.i;
    }
    
    public final void j() {
        this.b = -this.b;
    }
    
    public final void k(final float n) {
        if (this.d == n) {
            return;
        }
        this.d = czm.b(n, this.e(), this.d());
        this.c = 0L;
        this.b();
    }
    
    public final void l(float b, float b2) {
        if (b > b2) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", b, b2));
        }
        final ctv h = this.h;
        float h2;
        if (h == null) {
            h2 = -3.4028235E38f;
        }
        else {
            h2 = h.h;
        }
        float i;
        if (h == null) {
            i = Float.MAX_VALUE;
        }
        else {
            i = h.i;
        }
        b = czm.b(b, h2, i);
        b2 = czm.b(b2, h2, i);
        if (b == this.f && b2 == this.g) {
            return;
        }
        this.f = b;
        this.g = b2;
        this.k((float)(int)czm.b(this.d, b, b2));
    }
    
    public final boolean m() {
        return this.b < 0.0f;
    }
    
    public final void setRepeatMode(final int repeatMode) {
        super.setRepeatMode(repeatMode);
        if (repeatMode != 2 && this.j) {
            this.j = false;
            this.j();
        }
    }
}
