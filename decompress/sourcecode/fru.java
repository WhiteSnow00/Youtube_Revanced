import android.view.View;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

final class fru extends BroadcastReceiver
{
    final /* synthetic */ frv a;
    private final frv b;
    
    public fru(final frv a, final frv b) {
        this.a = a;
        this.b = b;
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            this.a.n = true;
            final frv b = this.b;
            if (b != null && b.getParent() != null) {
                this.b.getParent().requestDisallowInterceptTouchEvent(false);
            }
            this.a.c((View)this.b);
        }
    }
}
