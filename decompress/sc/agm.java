import android.os.Bundle;
import android.app.Notification;
import android.content.ComponentName;
import android.provider.Settings$Secure;
import java.util.HashSet;
import android.app.NotificationManager;
import android.content.Context;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agm
{
    private static final Object a;
    private static String b;
    private static Set c;
    private static final Object d;
    private static agl e;
    private final Context f;
    private final NotificationManager g;
    
    static {
        a = new Object();
        agm.c = new HashSet();
        d = new Object();
    }
    
    private agm(final Context f) {
        this.f = f;
        this.g = (NotificationManager)f.getSystemService("notification");
    }
    
    public static agm a(final Context context) {
        return new agm(context);
    }
    
    public static Set b(Context a) {
        final String string = Settings$Secure.getString(a.getContentResolver(), "enabled_notification_listeners");
        a = (Context)agm.a;
        monitorenter(a);
        Label_0105: {
            if (string == null) {
                break Label_0105;
            }
            try {
                if (!string.equals(agm.b)) {
                    final String[] split = string.split(":", -1);
                    final int length = split.length;
                    final HashSet c = new HashSet(length);
                    for (int i = 0; i < length; ++i) {
                        final ComponentName unflattenFromString = ComponentName.unflattenFromString(split[i]);
                        if (unflattenFromString != null) {
                            c.add((Object)unflattenFromString.getPackageName());
                        }
                    }
                    agm.c = c;
                    agm.b = string;
                }
                final Set c2 = agm.c;
                monitorexit(a);
                return c2;
            }
            finally {
                monitorexit(a);
                while (true) {}
            }
        }
    }
    
    public final void c(final int n) {
        this.d(null, n);
    }
    
    public final void d(final String s, final int n) {
        this.g.cancel(s, n);
    }
    
    public final void e(final int n, final Notification notification) {
        this.f(null, n, notification);
    }
    
    public final void f(final String s, final int n, final Notification notification) {
        final Bundle extras = notification.extras;
        if (extras != null && extras.getBoolean("android.support.useSideChannel")) {
            final agi agi = new agi(this.f.getPackageName(), n, s, notification);
            synchronized (agm.d) {
                if (agm.e == null) {
                    agm.e = new agl(this.f.getApplicationContext());
                }
                agm.e.a.obtainMessage(0, (Object)agi).sendToTarget();
                monitorexit(agm.d);
                this.g.cancel(s, n);
                return;
            }
        }
        this.g.notify(s, n, notification);
    }
    
    public final boolean g() {
        return agh.b(this.g);
    }
}
