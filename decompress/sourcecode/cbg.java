import android.view.animation.Transformation;
import android.view.View;
import android.view.animation.Animation;

// 
// Decompiled by Procyon v0.6.0
// 

final class cbg extends Animation
{
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ View c;
    
    public cbg(final int a, final int b, final View c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    protected final void applyTransformation(final float n, final Transformation transformation) {
        final int a = this.a;
        cbn.oA(this.c, a - (int)((a - this.b) * n));
    }
}
