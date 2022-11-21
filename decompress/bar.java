import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyCallback$DisplayInfoListener;
import android.telephony.TelephonyCallback;

// 
// Decompiled by Procyon v0.6.0
// 

final class bar extends TelephonyCallback implements TelephonyCallback$DisplayInfoListener
{
    private final aenl a;
    
    public bar(final aenl a, final byte[] array, final byte[] array2) {
        this.a = a;
    }
    
    public final void onDisplayInfoChanged(final TelephonyDisplayInfo telephonyDisplayInfo) {
        final int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        final int n = 5;
        final boolean b = overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5;
        final aenl a = this.a;
        int n2;
        if (!b) {
            n2 = n;
        }
        else {
            n2 = 10;
        }
        a.i(n2);
    }
}
