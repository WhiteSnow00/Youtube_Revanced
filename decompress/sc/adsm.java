import android.widget.ScrollView;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adsm extends akw
{
    final AppBarLayout$BaseBehavior a;
    
    public adsm(final AppBarLayout$BaseBehavior a) {
        this.a = a;
    }
    
    public final void c(final View view, final aom aom) {
        super.c(view, aom);
        aom.D(this.a.b);
        aom.q(ScrollView.class.getName());
    }
}
