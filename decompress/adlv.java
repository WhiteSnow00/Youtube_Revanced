import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

final class adlv extends BroadcastReceiver
{
    final adlw a;
    
    public adlv(final adlw a) {
        this.a = a;
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        ((adlr)this.a).c();
    }
}
