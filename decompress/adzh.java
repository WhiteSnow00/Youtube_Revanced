import android.animation.Animator$AnimatorListener;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.animation.ObjectAnimator;
import android.view.animation.Interpolator;
import android.util.Property;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adzh extends adyy
{
    public static final int[] a;
    public static final int[] b;
    private static final Property i;
    public final Interpolator[] c;
    public final adyj d;
    public int e;
    public boolean f;
    public float g;
    cjy h;
    private ObjectAnimator m;
    private ObjectAnimator n;
    
    static {
        a = new int[] { 533, 567, 850, 750 };
        b = new int[] { 1267, 1000, 333, 0 };
        i = (Property)new adzg((Class)Float.class);
    }
    
    public adzh(final Context context, final adzi d) {
        super(2);
        this.e = 0;
        this.h = null;
        this.d = d;
        this.c = new Interpolator[] { cja.b(context, 2130772062), cja.b(context, 2130772063), cja.b(context, 2130772064), cja.b(context, 2130772065) };
    }
    
    public final void a() {
        final ObjectAnimator m = this.m;
        if (m != null) {
            m.cancel();
        }
    }
    
    public final void b(final cjy h) {
        this.h = h;
    }
    
    public final void c() {
        final ObjectAnimator n = this.n;
        if (n != null) {
            if (!n.isRunning()) {
                this.a();
                if (this.j.isVisible()) {
                    this.n.setFloatValues(new float[] { this.g, 1.0f });
                    this.n.setDuration((long)((1.0f - this.g) * 1800.0f));
                    this.n.start();
                }
            }
        }
    }
    
    public final void d() {
        if (this.m == null) {
            (this.m = ObjectAnimator.ofFloat((Object)this, adzh.i, new float[] { 0.0f, 1.0f })).setDuration(1800L);
            this.m.setInterpolator((TimeInterpolator)null);
            this.m.setRepeatCount(-1);
            this.m.addListener((Animator$AnimatorListener)new adze(this));
        }
        if (this.n == null) {
            (this.n = ObjectAnimator.ofFloat((Object)this, adzh.i, new float[] { 1.0f })).setDuration(1800L);
            this.n.setInterpolator((TimeInterpolator)null);
            this.n.addListener((Animator$AnimatorListener)new adzf(this));
        }
        this.e = 0;
        final int k = adfe.K(this.d.c[0], this.j.i);
        final int[] l = this.l;
        l[1] = (l[0] = k);
        this.m.start();
    }
    
    public final void e() {
        this.h = null;
    }
}
