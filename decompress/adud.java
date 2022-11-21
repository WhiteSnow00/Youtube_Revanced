import android.widget.ScrollView;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adud extends akx
{
    final AppBarLayout$BaseBehavior a;
    
    public adud(final AppBarLayout$BaseBehavior a) {
        this.a = a;
    }
    
    public final void c(final View view, final aon aon) {
        super.c(view, aon);
        aon.E(this.a.b);
        aon.r((CharSequence)ScrollView.class.getName());
    }
}
