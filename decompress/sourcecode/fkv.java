import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.text.TextUtils;
import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;
import android.content.Context;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fkv implements zoj
{
    private final zpm a;
    private final oas b;
    private final arud c;
    
    public fkv(final zpm a, final oas b, final arud c, final byte[] array, final byte[] array2) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        this.c = c;
    }
    
    public final long a() {
        final zpm a = this.a;
        final oas b = this.b;
        final aexq j = a.j();
        if ((long)j.e(0L) == 0L) {
            return -1L;
        }
        return TimeUnit.MILLISECONDS.toSeconds(b.c() - (long)j.c());
    }
    
    public final ListenableFuture c() {
        return afva.m((Object)true);
    }
    
    public final boolean d(final Context context) {
        return xkm.V(context);
    }
    
    public final boolean e(final Context context) {
        alvs alvs;
        if ((alvs = this.c.f().e) == null) {
            alvs = alvs.a;
        }
        final String k = alvs.k;
        final boolean empty = TextUtils.isEmpty((CharSequence)k);
        boolean b = true;
        if (!empty) {
            final NotificationChannel notificationChannel = ((NotificationManager)context.getSystemService("notification")).getNotificationChannel(k);
            if (notificationChannel == null) {
                zjp.b(zjo.a, zjn.g, "Android O+ Notification Channel does not exist: ".concat(String.valueOf(k)));
            }
            else {
                if (notificationChannel.getImportance() != 0 && notificationChannel.getImportance() != -1000) {
                    return true;
                }
                b = false;
            }
        }
        return b;
    }
}
