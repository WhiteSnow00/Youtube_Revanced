import android.app.Notification;
import android.app.Service;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cqf
{
    public static void a(final Service service, final int n, final Notification notification, final int n2) {
        service.startForeground(n, notification, n2);
    }
}
