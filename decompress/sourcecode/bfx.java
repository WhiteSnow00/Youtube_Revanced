import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

final class bfx extends BroadcastReceiver
{
    final /* synthetic */ bfy a;
    
    public bfx(final bfy a) {
        this.a = a;
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        final bfy a = this.a;
        a.b.post((Runnable)new aur(a, 5));
    }
}
