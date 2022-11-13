import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

final class adlx extends BroadcastReceiver
{
    final adly a;
    
    public adlx(final adly a) {
        this.a = a;
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        ((adlr)this.a).c();
    }
}
