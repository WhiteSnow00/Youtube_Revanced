import android.content.Intent;
import android.content.Context;
import android.os.Handler;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

final class bdv extends BroadcastReceiver implements Runnable
{
    private final Handler a;
    
    public bdv(final Handler a) {
        this.a = a;
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.a.post((Runnable)this);
        }
    }
    
    public final void run() {
    }
}
