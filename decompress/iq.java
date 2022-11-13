import android.view.View;
import android.view.MenuItem;
import android.view.ActionProvider;
import android.view.ActionProvider$VisibilityListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class iq extends ip implements ActionProvider$VisibilityListener
{
    private pvh d;
    
    public iq(final iu iu, final ActionProvider actionProvider) {
        super(iu, actionProvider);
    }
    
    public final View e(final MenuItem menuItem) {
        return this.a.onCreateActionView(menuItem);
    }
    
    public final boolean f() {
        return this.a.isVisible();
    }
    
    public final boolean g() {
        return this.a.overridesItemVisibility();
    }
    
    public final void h(final pvh d) {
        this.d = d;
        this.a.setVisibilityListener((ActionProvider$VisibilityListener)this);
    }
    
    public final void onActionProviderVisibilityChanged(final boolean b) {
        final pvh d = this.d;
        if (d != null) {
            ((io)d.a).j.C();
        }
    }
}
