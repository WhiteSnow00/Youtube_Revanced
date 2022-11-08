import android.animation.ValueAnimator;
import android.animation.ValueAnimator$AnimatorUpdateListener;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class fpu implements ValueAnimator$AnimatorUpdateListener
{
    private float a;
    private boolean b;
    protected final ValueAnimator e;
    
    protected fpu() {
        this.e = ValueAnimator.ofFloat(new float[] { 0.0f, 1.0f }).setDuration(200L);
        this.a = 0.0f;
        this.b = false;
    }
    
    private final void a() {
        if (!this.b) {
            this.e.addUpdateListener((ValueAnimator$AnimatorUpdateListener)this);
            this.b = true;
        }
    }
    
    public final float c() {
        if (this.e.isRunning()) {
            return (float)this.e.getAnimatedValue();
        }
        return this.a;
    }
    
    public final void d() {
        this.a();
        this.e.reverse();
        this.a = 0.0f;
    }
    
    protected final void e() {
        this.a();
        this.e.start();
        this.a = 1.0f;
    }
    
    final void f(final int n) {
        this.a();
        this.e.setDuration((long)n);
    }
    
    public final void g() {
        this.a();
        this.e.cancel();
        this.a = 1.0f;
    }
    
    public final void h() {
        this.a();
        this.e.cancel();
        this.a = 0.0f;
    }
}
