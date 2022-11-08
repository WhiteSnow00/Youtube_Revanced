import android.view.animation.PathInterpolator;
import android.animation.TimeInterpolator;
import android.view.animation.Interpolator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fyf implements Interpolator
{
    private final TimeInterpolator a;
    
    public fyf() {
        this.a = (TimeInterpolator)new PathInterpolator(0.4f, 0.0f, 0.2f, 1.0f);
    }
    
    public final float getInterpolation(final float n) {
        return this.a.getInterpolation(n);
    }
}
