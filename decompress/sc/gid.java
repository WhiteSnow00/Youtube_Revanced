import java.util.function.Consumer;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

final class gid extends BroadcastReceiver
{
    final wyw a;
    final gif b;
    
    public gid(final gif b, final wyw a) {
        this.b = b;
        this.a = a;
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        final gia gia = this.b.e.get(intent.getAction());
        if (gia != null) {
            gia.b().ifPresent((Consumer)new gga(this.a, 12));
            final Runnable b = gia.b;
            if (b != null) {
                b.run();
            }
        }
    }
}
