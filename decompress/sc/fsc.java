import android.view.View;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

final class fsc extends BroadcastReceiver
{
    final fsd a;
    private final fsd b;
    
    public fsc(final fsd a, final fsd b) {
        this.a = a;
        this.b = b;
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            this.a.n = true;
            final fsd b = this.b;
            if (b != null && b.getParent() != null) {
                this.b.getParent().requestDisallowInterceptTouchEvent(false);
            }
            this.a.c((View)this.b);
        }
    }
}
