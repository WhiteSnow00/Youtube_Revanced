import android.os.PowerManager;
import android.content.Intent;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fkt extends BroadcastReceiver
{
    public final atjs a;
    public final AtomicBoolean b;
    public final asiu c;
    public final atke d;
    public final atke e;
    public final oby f;
    
    public fkt(final atke d, final atke e, final oby f) {
        this.a = atjs.e();
        this.b = new AtomicBoolean(false);
        this.c = new asiu();
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
        this.a.tu((Object)powerManager.isDeviceIdleMode());
    }
}
