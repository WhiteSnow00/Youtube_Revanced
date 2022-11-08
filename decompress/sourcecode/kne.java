import android.view.animation.Animation;
import android.view.animation.AlphaAnimation;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kne implements fao
{
    private final View a;
    private final int b;
    private final long c;
    
    public kne(final View a, final int b, final long c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void a() {
        final AlphaAnimation animation = new AlphaAnimation(0.5f, 1.0f);
        animation.setDuration(1000L);
        animation.setStartOffset(this.c + this.b * 75L);
        animation.setRepeatCount(-1);
        animation.setRepeatMode(2);
        this.a.setAnimation((Animation)animation);
    }
    
    @Override
    public final void b() {
    }
}
