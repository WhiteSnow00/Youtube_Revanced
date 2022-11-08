import android.content.Context;
import android.net.Uri;
import android.view.MenuItem;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jwt implements fzi
{
    private final Activity a;
    
    public jwt(final Activity a) {
        this.a = a;
    }
    
    public final int j() {
        return 2131429832;
    }
    
    public final int k() {
        return 0;
    }
    
    public final fyz l() {
        return null;
    }
    
    public final boolean n() {
        return true;
    }
    
    public final void o(final MenuItem menuItem) {
        menuItem.setShowAsAction(0);
    }
    
    public final boolean p() {
        gow.v((Context)this.a, Uri.parse(this.a.getResources().getString(2132018666)));
        return true;
    }
    
    public final int q() {
        return 104;
    }
    
    public final CharSequence r() {
        return this.a.getString(2132018658);
    }
}
