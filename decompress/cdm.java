import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cdm extends BroadcastReceiver
{
    final mwm a;
    
    public cdm(final mwm a, final byte[] array) {
        this.a = a;
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        this.a.c();
    }
}
