import android.view.animation.TranslateAnimation;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kms
{
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    private final Context e;
    
    public kms(final Context e) {
        this.e = e;
        this.a = e.getResources().getDimensionPixelSize(2131167942);
        this.b = e.getResources().getDimensionPixelSize(2131167943);
        this.c = e.getResources().getInteger(2131492901);
        this.d = e.getResources().getInteger(2131492900);
    }
    
    public final Animation a(final float n, final float n2, final long duration, final int n3) {
        final AlphaAnimation alphaAnimation = new AlphaAnimation(n, n2);
        alphaAnimation.setDuration(duration);
        alphaAnimation.setInterpolator(this.e, n3);
        return (Animation)alphaAnimation;
    }
    
    public final Animation b(final int n, final int n2, final long duration, final int n3) {
        final TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float)n, (float)n2);
        translateAnimation.setDuration(duration);
        translateAnimation.setInterpolator(this.e, n3);
        return (Animation)translateAnimation;
    }
}
