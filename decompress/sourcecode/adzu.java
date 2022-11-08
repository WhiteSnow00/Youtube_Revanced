import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

final class adzu extends BroadcastReceiver
{
    final /* synthetic */ adzv a;
    
    public adzu(final adzv a) {
        this.a = a;
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        this.a.a(context, intent);
    }
}
