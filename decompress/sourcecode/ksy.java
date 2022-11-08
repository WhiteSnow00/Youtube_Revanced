import android.net.Uri;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ksy extends BroadcastReceiver
{
    final /* synthetic */ wtl a;
    
    public ksy(final wtl a, final byte[] array, final byte[] array2) {
        this.a = a;
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        final Uri data = intent.getData();
        Object encodedSchemeSpecificPart;
        if (data == null) {
            encodedSchemeSpecificPart = null;
        }
        else {
            encodedSchemeSpecificPart = data.getEncodedSchemeSpecificPart();
        }
        final String action = intent.getAction();
        final int hashCode = action.hashCode();
        int n = 0;
        Label_0074: {
            if (hashCode != 525384130) {
                if (hashCode == 1544582882) {
                    if (action.equals("android.intent.action.PACKAGE_ADDED")) {
                        n = 0;
                        break Label_0074;
                    }
                }
            }
            else if (action.equals("android.intent.action.PACKAGE_REMOVED")) {
                n = 1;
                break Label_0074;
            }
            n = -1;
        }
        if (n != 0) {
            if (n == 1) {
                if ("com.google.android.apps.youtube.vr".equals(encodedSchemeSpecificPart)) {
                    this.a.m();
                }
            }
        }
        else if ("com.google.android.apps.youtube.vr".equals(encodedSchemeSpecificPart)) {
            this.a.n();
        }
    }
}
