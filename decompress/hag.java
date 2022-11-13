import android.animation.ValueAnimator;
import android.animation.AnimatorSet;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

final class hag
{
    public final TextView a;
    public final TextView b;
    final AnimatorSet c;
    ValueAnimator d;
    ValueAnimator e;
    public String f;
    
    public hag(final TextView a, final TextView b) {
        this.c = new AnimatorSet();
        this.f = "";
        this.a = a;
        this.b = b;
    }
}
