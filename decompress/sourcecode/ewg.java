import android.content.SharedPreferences;
import android.app.backup.RestoreObserver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ewg extends RestoreObserver
{
    final /* synthetic */ SharedPreferences a;
    
    public ewg(final SharedPreferences a) {
        this.a = a;
    }
    
    public final void onUpdate(final int n, final String s) {
    }
    
    public final void restoreFinished(final int n) {
        if (n == 0) {
            this.a.edit().putBoolean("got_future_restore", false).apply();
            trn.g("Manual restore succeeded.");
            return;
        }
        final StringBuilder sb = new StringBuilder("Manual restore failed with error: ");
        sb.append(n);
        trn.l(sb.toString());
    }
    
    public final void restoreStarting(final int n) {
    }
}
