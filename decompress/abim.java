import android.animation.Animator$AnimatorListener;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ValueAnimator;
import com.google.android.libraries.youtube.player.features.quickseek.overlay.TapBloomView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abim
{
    public final TapBloomView a;
    public ValueAnimator b;
    private final int c;
    private final int d;
    
    public abim(final TapBloomView a, final int c, final int d) {
        this.a = a;
        this.c = c;
        this.d = d;
    }
    
    public final ValueAnimator a() {
        final ValueAnimator b = this.b;
        if (b != null) {
            return b;
        }
        (this.b = ValueAnimator.ofFloat(new float[] { 0.0f, 1.0f })).setDuration((long)this.c);
        this.b.setRepeatCount(this.d);
        this.b.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new uve(this, 15));
        this.b.addListener((Animator$AnimatorListener)new abil(this));
        return this.b;
    }
    
    public final void b(final int b, final int c) {
        final TapBloomView a = this.a;
        a.b = b;
        a.c = c;
        this.a().start();
    }
}
