import android.view.animation.Transformation;
import android.view.View;
import android.view.animation.Animation;

// 
// Decompiled by Procyon v0.6.0
// 

final class cbk extends Animation
{
    final int a;
    final int b;
    final View c;
    
    public cbk(final int a, final int b, final View c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    protected final void applyTransformation(final float n, final Transformation transformation) {
        final int a = this.a;
        cbr.oy(this.c, a - (int)((a - this.b) * n));
    }
}
