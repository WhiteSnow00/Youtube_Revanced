import android.view.MenuItem;
import android.view.MenuInflater;
import android.view.Menu;

// 
// Decompiled by Procyon v0.6.0
// 

final class cd implements alq
{
    final cl a;
    
    public cd(final cl a) {
        this.a = a;
    }
    
    public final void a(final Menu menu, final MenuInflater menuInflater) {
        this.a.T(menu, menuInflater);
    }
    
    public final void b(final Menu menu) {
        this.a.v(menu);
    }
    
    public final void c(final Menu menu) {
        this.a.V(menu);
    }
    
    public final boolean d(final MenuItem menuItem) {
        return this.a.U(menuItem);
    }
}
