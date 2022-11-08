import android.view.animation.Interpolator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dxb implements dxc
{
    final int a;
    final Interpolator b;
    
    public dxb(final int a, final Interpolator b) {
        this.a = a;
        this.b = b;
    }
    
    public final dyg a(final dyc dyc) {
        return (dyg)new dyf(this.a, dyc, this.b);
    }
}
