import android.view.Menu;
import android.view.MenuItem;
import android.view.ActionMode;
import android.view.ActionMode$Callback;

// 
// Decompiled by Procyon v0.6.0
// 

final class jhd implements ActionMode$Callback
{
    public jhd() {
    }
    
    public final boolean onActionItemClicked(final ActionMode actionMode, final MenuItem menuItem) {
        return false;
    }
    
    public final boolean onCreateActionMode(final ActionMode actionMode, final Menu menu) {
        actionMode.setTag(fyx.a);
        return true;
    }
    
    public final void onDestroyActionMode(final ActionMode actionMode) {
    }
    
    public final boolean onPrepareActionMode(final ActionMode actionMode, final Menu menu) {
        return false;
    }
}
