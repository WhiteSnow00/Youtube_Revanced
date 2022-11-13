import android.animation.ValueAnimator$DurationScaleChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqt implements ValueAnimator$DurationScaleChangeListener
{
    public final aqu a;
    
    public aqt(final aqu a) {
        this.a = a;
    }
    
    public final void onChanged(final float f) {
        ((aqv)this.a.b).f = f;
    }
}
