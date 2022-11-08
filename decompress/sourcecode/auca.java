import java.security.cert.CertificateException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import android.util.Log;
import org.chromium.net.X509Util;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auca extends BroadcastReceiver
{
    public final void onReceive(final Context context, final Intent intent) {
        if (!"android.security.action.KEYCHAIN_CHANGED".equals(intent.getAction())) {
            if (!"android.security.action.TRUST_STORE_CHANGED".equals(intent.getAction())) {
                if (!"android.security.action.KEY_ACCESS_CHANGED".equals(intent.getAction()) || intent.getBooleanExtra("android.security.extra.KEY_ACCESSIBLE", false)) {
                    return;
                }
            }
        }
        try {
            X509Util.-$$Nest$smreloadDefaultTrustManager();
        }
        catch (final NoSuchAlgorithmException ex) {
            Log.e("cr_X509Util", "Unable to reload the default TrustManager", (Throwable)ex);
        }
        catch (final KeyStoreException ex2) {
            Log.e("cr_X509Util", "Unable to reload the default TrustManager", (Throwable)ex2);
        }
        catch (final CertificateException ex3) {
            Log.e("cr_X509Util", "Unable to reload the default TrustManager", (Throwable)ex3);
        }
    }
}
