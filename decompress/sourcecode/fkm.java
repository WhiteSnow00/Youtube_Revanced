import android.os.PowerManager;
import android.content.Intent;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fkm extends BroadcastReceiver
{
    public final atix a;
    public final AtomicBoolean b;
    public final asif c;
    public final atjj d;
    public final atjj e;
    public final oas f;
    
    public fkm(final atjj d, final atjj e, final oas f) {
        this.a = atix.e();
        this.b = new AtomicBoolean(false);
        this.c = new asif();
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        if (intent == null) {
            return;
        }
        final PowerManager powerManager = (PowerManager)context.getSystemService("power");
        if (!"android.os.action.DEVICE_IDLE_MODE_CHANGED".equals(intent.getAction())) {
            return;
        }
        this.a.tr((Object)powerManager.isDeviceIdleMode());
    }
}
