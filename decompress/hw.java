import android.view.SearchEvent;
import android.view.ActionMode;
import android.view.ActionMode$Callback;
import android.view.Window$Callback;

// 
// Decompiled by Procyon v0.6.0
// 

public class hw
{
    static ActionMode a(final Window$Callback window$Callback, final ActionMode$Callback actionMode$Callback, final int n) {
        return window$Callback.onWindowStartingActionMode(actionMode$Callback, n);
    }
    
    static boolean b(final Window$Callback window$Callback, final SearchEvent searchEvent) {
        return window$Callback.onSearchRequested(searchEvent);
    }
    
    public void c() {
    }
    
    public void d(final int n, final int n2) {
    }
    
    public void e(final int n, final int n2, final Object o) {
        this.d(n, n2);
    }
    
    public void f(final int n, final int n2) {
    }
    
    public void g(final int n, final int n2) {
    }
    
    public void h(final int n, final int n2) {
    }
}
