import java.util.Arrays;
import android.animation.Animator$AnimatorListener;
import android.animation.TimeInterpolator;
import android.animation.ObjectAnimator;
import android.util.Property;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adzd extends adyy
{
    public static final int f = 0;
    private static final Property g;
    public final atu a;
    public final adyj b;
    public int c;
    public boolean d;
    public float e;
    private ObjectAnimator h;
    
    static {
        g = (Property)new adzc((Class)Float.class);
    }
    
    public adzd(final adzi b) {
        super(3);
        this.c = 1;
        this.b = b;
        this.a = new atu();
    }
    
    public final void a() {
        final ObjectAnimator h = this.h;
        if (h != null) {
            h.cancel();
        }
    }
    
    public final void b(final cjy cjy) {
    }
    
    public final void c() {
    }
    
    public final void d() {
        if (this.h == null) {
            (this.h = ObjectAnimator.ofFloat((Object)this, adzd.g, new float[] { 0.0f, 1.0f })).setDuration(333L);
            this.h.setInterpolator((TimeInterpolator)null);
            this.h.setRepeatCount(-1);
            this.h.addListener((Animator$AnimatorListener)new adzb(this));
        }
        this.d = true;
        this.c = 1;
        Arrays.fill(this.l, adfe.K(this.b.c[0], this.j.i));
        this.h.start();
    }
    
    public final void e() {
    }
}
