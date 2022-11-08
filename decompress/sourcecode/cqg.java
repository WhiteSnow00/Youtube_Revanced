import android.app.ForegroundServiceStartNotAllowedException;
import android.util.Log;
import androidx.work.impl.foreground.SystemForegroundService;
import android.app.Notification;
import android.app.Service;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cqg
{
    public static void a(final Service service, final int n, final Notification notification, final int n2) {
        try {
            service.startForeground(n, notification, n2);
        }
        catch (final ForegroundServiceStartNotAllowedException ex) {
            cmr.a();
            Log.w(SystemForegroundService.a, "Unable to start foreground service", (Throwable)ex);
        }
    }
}
