import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cpt extends BroadcastReceiver
{
    final cpu a;
    
    public cpt(final cpu a) {
        this.a = a;
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        context.getClass();
        intent.getClass();
        this.a.c(intent);
    }
}
