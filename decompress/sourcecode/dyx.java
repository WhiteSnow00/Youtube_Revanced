import android.animation.TimeInterpolator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dyx extends dzc
{
    private final TimeInterpolator e;
    
    public dyx(final TimeInterpolator e) {
        this.e = e;
    }
    
    @Override
    public final float a(final long n) {
        return this.e.getInterpolation(this.f("default_input").c);
    }
}
