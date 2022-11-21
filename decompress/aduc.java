import com.google.android.material.appbar.AppBarLayout$BaseBehavior;
import android.view.KeyEvent;
import com.google.android.material.appbar.AppBarLayout;
import android.view.View;
import android.view.View$OnKeyListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aduc implements View$OnKeyListener
{
    public final View a;
    public final AppBarLayout b;
    
    public aduc(final View a, final AppBarLayout b) {
        this.a = a;
        this.b = b;
    }
    
    public final boolean onKey(final View view, final int n, final KeyEvent keyEvent) {
        AppBarLayout$BaseBehavior.F(keyEvent, this.a, this.b);
        return false;
    }
}
