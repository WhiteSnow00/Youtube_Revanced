import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.Animator;
import android.animation.LayoutTransition;
import com.google.android.apps.youtube.app.common.ui.slimstatusbar.SlimStatusBar;
import android.view.ViewGroup;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kuu
{
    public final Context a;
    public final arhr b;
    public final arhr c;
    public final arhr d;
    public final asho e;
    public final wwv f;
    public final abns g;
    public ViewGroup h;
    public SlimStatusBar i;
    public LayoutTransition j;
    public boolean k;
    public boolean l;
    public final mrm m;
    
    public kuu(final Context a, final arhr b, final arhr c, final arhr d, final abns g, final wwv f, final mrm m, final asho e, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.g = g;
        this.f = f;
        this.m = m;
        this.e = e;
    }
    
    public static Animator a(final SlimStatusBar slimStatusBar) {
        return (Animator)ObjectAnimator.ofPropertyValuesHolder((Object)slimStatusBar, new PropertyValuesHolder[] { PropertyValuesHolder.ofInt("top", new int[] { slimStatusBar.getTop(), slimStatusBar.getBottom() }) });
    }
}
