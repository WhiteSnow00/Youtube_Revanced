import android.net.NetworkInfo;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyManager;
import android.net.ConnectivityManager;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bas extends BroadcastReceiver
{
    final aenl a;
    
    public bas(final aenl a, final byte[] array, final byte[] array2) {
        this.a = a;
    }
    
    public final void onReceive(final Context context, Intent a) {
        final ConnectivityManager connectivityManager = (ConnectivityManager)context.getSystemService("connectivity");
        int n = 0;
        Label_0236: {
            if (connectivityManager != null) {
                try {
                    final NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                        final int type = activeNetworkInfo.getType();
                    Label_0093_Outer:
                        while (true) {
                            while (true) {
                                Label_0103: {
                                    if (type == 0) {
                                        break Label_0103;
                                    }
                                    if (type == 1) {
                                        break Label_0098;
                                    }
                                    if (type == 4 || type == 5) {
                                        break Label_0103;
                                    }
                                    if (type != 6) {
                                        if (type != 9) {
                                            n = 8;
                                            break Label_0236;
                                        }
                                        n = 7;
                                        break Label_0236;
                                    }
                                    n = 5;
                                    break Label_0236;
                                    n = 2;
                                    break Label_0236;
                                }
                                switch (activeNetworkInfo.getSubtype()) {
                                    case 13: {
                                        continue;
                                    }
                                    case 18: {
                                        continue Label_0093_Outer;
                                    }
                                    default: {
                                        n = 6;
                                        break;
                                    }
                                    case 20: {
                                        if (baz.a >= 29) {
                                            n = 9;
                                            break;
                                        }
                                        break;
                                    }
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 14:
                                    case 15:
                                    case 17: {
                                        n = 4;
                                        break;
                                    }
                                    case 1:
                                    case 2: {
                                        n = 3;
                                        break;
                                    }
                                }
                                break;
                            }
                            break;
                        }
                    }
                    else {
                        n = 1;
                    }
                }
                catch (final SecurityException ex) {}
            }
        }
        if (baz.a >= 31 && n == 5) {
            a = (Intent)this.a;
            try {
                final TelephonyManager telephonyManager = (TelephonyManager)context.getSystemService("phone");
                bad.b(telephonyManager);
                final bar bar = new bar((aenl)a, null, null);
                telephonyManager.registerTelephonyCallback(context.getMainExecutor(), (TelephonyCallback)bar);
                telephonyManager.unregisterTelephonyCallback((TelephonyCallback)bar);
                return;
            }
            catch (final RuntimeException ex2) {
                ((aenl)a).i(5);
                return;
            }
        }
        this.a.i(n);
    }
}
