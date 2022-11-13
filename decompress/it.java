import android.view.MenuItem;
import android.view.MenuItem$OnMenuItemClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class it implements MenuItem$OnMenuItemClickListener
{
    final iu a;
    private final MenuItem$OnMenuItemClickListener b;
    
    public it(final iu a, final MenuItem$OnMenuItemClickListener b) {
        this.a = a;
        this.b = b;
    }
    
    public final boolean onMenuItemClick(final MenuItem menuItem) {
        return this.b.onMenuItemClick(this.a.a(menuItem));
    }
}
