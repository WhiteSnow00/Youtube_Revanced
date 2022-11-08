import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

final class fq extends BroadcastReceiver
{
    final /* synthetic */ fr a;
    
    public fq(final fr a) {
        this.a = a;
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        this.a.b();
    }
}
