import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.NextGenWatchContainerLayout;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lbg extends AnimatorListenerAdapter
{
    public final int a;
    public Animator b;
    public final /* synthetic */ NextGenWatchContainerLayout c;
    
    public lbg(final NextGenWatchContainerLayout c) {
        this.c = c;
        this.a = c.getResources().getInteger(2131493041);
    }
    
    public final void a() {
        this.b = null;
    }
    
    public final boolean b() {
        final Animator b = this.b;
        return b != null && b.isRunning();
    }
    
    public final void onAnimationCancel(final Animator animator) {
        this.a();
        this.c.d();
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a();
        this.c.d();
    }
}
