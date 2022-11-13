import android.util.AndroidRuntimeException;
import android.animation.ValueAnimator$DurationScaleChangeListener;
import android.animation.ValueAnimator;
import android.os.Build$VERSION;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ark extends arh
{
    public arl n;
    private float o;
    private boolean p;
    
    public ark(final arj arj) {
        super(arj);
        this.n = null;
        this.o = Float.MAX_VALUE;
        this.p = false;
    }
    
    public ark(final Object o, final ari ari) {
        super(o, ari);
        this.n = null;
        this.o = Float.MAX_VALUE;
        this.p = false;
    }
    
    @Override
    public final boolean d(long n) {
        if (this.p) {
            final float o = this.o;
            if (o != Float.MAX_VALUE) {
                this.n.d(o);
                this.o = Float.MAX_VALUE;
            }
            this.h = this.n.a();
            this.g = 0.0f;
            this.p = false;
            return true;
        }
        float n5;
        if (this.o != Float.MAX_VALUE) {
            final arl n2 = this.n;
            final double n3 = this.h;
            final double n4 = this.g;
            n /= 2L;
            final ard b = n2.b(n3, n4, n);
            this.n.d(this.o);
            this.o = Float.MAX_VALUE;
            final ard b2 = this.n.b((double)b.a, (double)b.b, n);
            n5 = b2.a;
            this.h = n5;
            this.g = b2.b;
        }
        else {
            final ard b3 = this.n.b((double)this.h, (double)this.g, n);
            n5 = b3.a;
            this.h = n5;
            this.g = b3.b;
        }
        final float max = Math.max(n5, -3.4028235E38f);
        this.h = max;
        final float min = Math.min(max, Float.MAX_VALUE);
        this.h = min;
        final float g = this.g;
        final arl n6 = this.n;
        if (Math.abs(g) < n6.d && Math.abs(min - n6.a()) < n6.c) {
            this.h = this.n.a();
            this.g = 0.0f;
            return true;
        }
        return false;
    }
    
    public final void h(float h) {
        if (super.l) {
            this.o = h;
            return;
        }
        if (this.n == null) {
            this.n = new arl(h);
        }
        this.n.d(h);
        final arl n = this.n;
        if (n == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        final double n2 = n.a();
        if (n2 > 3.4028234663852886E38) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (n2 < -3.4028234663852886E38) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        final double abs = Math.abs((double)(super.m * 0.75f));
        n.c = abs;
        n.d = abs * 62.5;
        if (aqv.a().b()) {
            if (!super.l) {
                super.l = true;
                if (!super.i) {
                    super.h = super.k.a(super.j);
                }
                h = super.h;
                if (h > Float.MAX_VALUE || h < -3.4028235E38f) {
                    throw new IllegalArgumentException("Starting value need to be in between min value and max value");
                }
                final aqv a = aqv.a();
                if (a.b.size() == 0) {
                    a.h.D(a.c);
                    if (Build$VERSION.SDK_INT >= 33) {
                        a.f = ValueAnimator.getDurationScale();
                        if (a.g == null) {
                            a.g = new aqu(a);
                        }
                        final aqu g = a.g;
                        if (g.a == null) {
                            ValueAnimator.registerDurationScaleChangeListener((ValueAnimator$DurationScaleChangeListener)(g.a = new aqt(g)));
                        }
                    }
                }
                if (!a.b.contains(this)) {
                    a.b.add(this);
                }
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
    }
    
    public final void i() {
        if (aqv.a().b()) {
            if (super.l) {
                super.b(true);
            }
            final float o = this.o;
            if (o != Float.MAX_VALUE) {
                final arl n = this.n;
                if (n == null) {
                    this.n = new arl(o);
                }
                else {
                    n.d(o);
                }
                this.o = Float.MAX_VALUE;
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be canceled from the same thread as the animation handler");
    }
    
    public final void j() {
        if (this.n.b <= 0.0) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (aqv.a().b()) {
            if (this.l) {
                this.p = true;
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
    }
}
