import android.view.MenuItem;
import android.view.MenuItem$OnActionExpandListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class is implements MenuItem$OnActionExpandListener
{
    final /* synthetic */ iu a;
    private final MenuItem$OnActionExpandListener b;
    
    public is(final iu a, final MenuItem$OnActionExpandListener b) {
        this.a = a;
        this.b = b;
    }
    
    public final boolean onMenuItemActionCollapse(final MenuItem menuItem) {
        return this.b.onMenuItemActionCollapse(((id)this.a).a(menuItem));
    }
    
    public final boolean onMenuItemActionExpand(final MenuItem menuItem) {
        return this.b.onMenuItemActionExpand(((id)this.a).a(menuItem));
    }
}
