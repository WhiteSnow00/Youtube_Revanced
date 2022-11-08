import java.util.function.Consumer;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

final class ghu extends BroadcastReceiver
{
    final /* synthetic */ wwv a;
    final /* synthetic */ ghw b;
    
    public ghu(final ghw b, final wwv a) {
        this.b = b;
        this.a = a;
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        final ghr ghr = this.b.e.get(intent.getAction());
        if (ghr != null) {
            ghr.b().ifPresent((Consumer)new gft(this.a, 12));
            final Runnable b = ghr.b;
            if (b != null) {
                b.run();
            }
        }
    }
}
