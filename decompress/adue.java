import com.google.android.material.appbar.AppBarLayout$BaseBehavior;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adue implements apc
{
    final CoordinatorLayout a;
    final AppBarLayout b;
    final View c;
    final int d;
    final AppBarLayout$BaseBehavior e;
    
    public adue(final AppBarLayout$BaseBehavior e, final CoordinatorLayout a, final AppBarLayout b, final View c, final int d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final boolean a(final View view) {
        this.e.G(this.a, this.b, this.c, this.d, new int[] { 0, 0 });
        return true;
    }
}
