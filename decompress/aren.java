import android.content.Intent;
import android.content.Context;
import com.google.vr.audio.DeviceInfo;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aren extends BroadcastReceiver
{
    final DeviceInfo a;
    
    public aren(final DeviceInfo a) {
        this.a = a;
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        if (intent.getAction().equals("android.intent.action.HEADSET_PLUG")) {
            final int intExtra = intent.getIntExtra("state", -1);
            if (intExtra != 0) {
                if (intExtra != 1) {
                    final DeviceInfo a = this.a;
                    a.nativeUpdateHeadphoneStateChange(a.a, 0);
                    return;
                }
                final DeviceInfo a2 = this.a;
                a2.nativeUpdateHeadphoneStateChange(a2.a, 1);
            }
            else {
                final DeviceInfo a3 = this.a;
                a3.nativeUpdateHeadphoneStateChange(a3.a, 2);
            }
        }
    }
}
