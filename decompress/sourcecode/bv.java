import android.view.animation.Transformation;
import android.view.animation.Animation;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationSet;

// 
// Decompiled by Procyon v0.6.0
// 

final class bv extends AnimationSet implements Runnable
{
    private final ViewGroup a;
    private final View b;
    private boolean c;
    private boolean d;
    private boolean e;
    
    public bv(final Animation animation, final ViewGroup a, final View b) {
        super(false);
        this.e = true;
        this.a = a;
        this.b = b;
        this.addAnimation(animation);
        a.post((Runnable)this);
    }
    
    public final boolean getTransformation(final long n, final Transformation transformation) {
        this.e = true;
        if (this.c) {
            return !this.d;
        }
        if (!super.getTransformation(n, transformation)) {
            this.c = true;
            aly.b((View)this.a, (Runnable)this);
        }
        return true;
    }
    
    public final boolean getTransformation(final long n, final Transformation transformation, final float n2) {
        this.e = true;
        if (this.c) {
            return !this.d;
        }
        if (!super.getTransformation(n, transformation, n2)) {
            this.c = true;
            aly.b((View)this.a, (Runnable)this);
        }
        return true;
    }
    
    public final void run() {
        if (!this.c && this.e) {
            this.e = false;
            this.a.post((Runnable)this);
            return;
        }
        this.a.endViewTransition(this.b);
        this.d = true;
    }
}
