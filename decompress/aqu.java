import android.animation.ValueAnimator$DurationScaleChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqu implements ValueAnimator$DurationScaleChangeListener
{
    public final aqv a;
    
    public aqu(final aqv a) {
        this.a = a;
    }
    
    public final void onChanged(final float f) {
        ((aqw)this.a.b).f = f;
    }
}
