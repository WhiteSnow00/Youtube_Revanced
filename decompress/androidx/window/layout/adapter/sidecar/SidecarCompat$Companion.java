// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.layout.adapter.sidecar;

import android.text.TextUtils;
import androidx.window.core.Version;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarInterface;
import android.content.Context;
import android.view.WindowManager$LayoutParams;
import android.view.Window;
import android.os.IBinder;
import android.app.Activity;

public final class SidecarCompat$Companion
{
    private SidecarCompat$Companion() {
    }
    
    public final IBinder getActivityWindowToken$window_release(final Activity activity) {
        if (activity != null) {
            final Window window = activity.getWindow();
            if (window != null) {
                final WindowManager$LayoutParams attributes = window.getAttributes();
                if (attributes != null) {
                    return attributes.token;
                }
            }
        }
        return null;
    }
    
    public final SidecarInterface getSidecarCompat$window_release(final Context context) {
        context.getClass();
        return SidecarProvider.getSidecarImpl(context.getApplicationContext());
    }
    
    public final Version getSidecarVersion() {
        final Version version = null;
        try {
            final String apiVersion = SidecarProvider.getApiVersion();
            Version parse = version;
            if (!TextUtils.isEmpty((CharSequence)apiVersion)) {
                parse = Version.Companion.parse(apiVersion);
            }
            return parse;
        }
        catch (final NoClassDefFoundError | UnsupportedOperationException ex) {
            return version;
        }
    }
}
