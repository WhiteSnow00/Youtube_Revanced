import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.os.Handler;
import android.content.Context;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public class bz extends bw
{
    public final Activity b;
    public final Context c;
    public final Handler d;
    final cl e;
    
    public bz(final Activity b, final Context c, final Handler d) {
        this.e = new cl();
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public View a(final int n) {
        throw null;
    }
    
    public boolean b() {
        throw null;
    }
    
    public void c() {
    }
    
    public final void e(final Intent intent, final int n, final Bundle bundle) {
        if (n == -1) {
            agv.b(this.c, intent, bundle);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }
}
