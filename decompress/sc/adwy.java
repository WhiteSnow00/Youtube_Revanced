import android.animation.Animator$AnimatorListener;
import android.animation.TimeInterpolator;
import android.animation.ObjectAnimator;
import android.util.Property;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adwy extends adxh
{
    public static final int[] a;
    public static final int[] b;
    public static final int[] c;
    private static final Property m;
    private static final Property n;
    public final ats d;
    public final adws e;
    public int f;
    public float g;
    public float h;
    cjv i;
    private ObjectAnimator o;
    private ObjectAnimator p;
    
    static {
        a = new int[] { 0, 1350, 2700, 4050 };
        b = new int[] { 667, 2017, 3367, 4717 };
        c = new int[] { 1000, 2350, 3700, 5050 };
        m = (Property)new adww((Class)Float.class);
        n = (Property)new adwx((Class)Float.class);
    }
    
    public adwy(final adwz e) {
        super(1);
        this.f = 0;
        this.i = null;
        this.e = e;
        this.d = new ats();
    }
    
    public final void a() {
        final ObjectAnimator o = this.o;
        if (o != null) {
            o.cancel();
        }
    }
    
    public final void b(final cjv i) {
        this.i = i;
    }
    
    public final void c() {
        final ObjectAnimator p = this.p;
        if (p != null) {
            if (!p.isRunning()) {
                if (this.j.isVisible()) {
                    this.p.start();
                    return;
                }
                this.a();
            }
        }
    }
    
    public final void d() {
        if (this.o == null) {
            (this.o = ObjectAnimator.ofFloat((Object)this, adwy.m, new float[] { 0.0f, 1.0f })).setDuration(5400L);
            this.o.setInterpolator((TimeInterpolator)null);
            this.o.setRepeatCount(-1);
            this.o.addListener((Animator$AnimatorListener)new adwu(this));
        }
        if (this.p == null) {
            (this.p = ObjectAnimator.ofFloat((Object)this, adwy.n, new float[] { 0.0f, 1.0f })).setDuration(333L);
            this.p.setInterpolator((TimeInterpolator)this.d);
            this.p.addListener((Animator$AnimatorListener)new adwv(this));
        }
        this.f = 0;
        this.l[0] = adds.T(this.e.c[0], this.j.i);
        this.h = 0.0f;
        this.o.start();
    }
    
    public final void e() {
        this.i = null;
    }
}
