import com.google.android.material.appbar.AppBarLayout$BaseBehavior;
import android.view.KeyEvent;
import com.google.android.material.appbar.AppBarLayout;
import android.view.View;
import android.view.View$OnUnhandledKeyEventListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adub implements View$OnUnhandledKeyEventListener
{
    public final View a;
    public final AppBarLayout b;
    
    public adub(final View a, final AppBarLayout b) {
        this.a = a;
        this.b = b;
    }
    
    public final boolean onUnhandledKeyEvent(final View view, final KeyEvent keyEvent) {
        AppBarLayout$BaseBehavior.F(keyEvent, this.a, this.b);
        return false;
    }
}
