import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ldp
{
    public static final Interpolator a;
    public final View b;
    public final int c;
    public final asib d;
    public int e;
    public ValueAnimator f;
    public uwc g;
    
    static {
        a = (Interpolator)apb.c(0.05f, 0.0f, 0.0f, 1.0f);
    }
    
    public ldp(final View b, final utk utk) {
        this.f = null;
        this.g = null;
        this.b = b;
        this.c = b.getContext().getResources().getDimensionPixelSize(2131170373);
        (this.d = new asib()).c(utk.g().j.p().al((asix)new jpm(this, b, 9)));
    }
}
