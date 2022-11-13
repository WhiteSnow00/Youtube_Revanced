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

public final class flc implements zqe
{
    private final zrg a;
    private final oby b;
    private final arwh c;
    
    public flc(final zrg a, final oby b, final arwh c, final byte[] array, final byte[] array2) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        this.c = c;
    }
    
    public final long a() {
        final zrg a = this.a;
        final oby b = this.b;
        final aezp j = a.j();
        if ((long)j.e((Object)0L) == 0L) {
            return -1L;
        }
        return TimeUnit.MILLISECONDS.toSeconds(b.c() - (long)j.c());
    }
    
    public final ListenableFuture b(final Context context) {
        return aftq.e(((zqe)this).c(), (aezf)new yfg((zqe)this, context, 3), (Executor)afum.a);
    }
    
    public final ListenableFuture c() {
        return afwm.m((Object)true);
    }
    
    public final boolean d(final Context context) {
        return xmm.C(context);
    }
    
    public final boolean e(final Context context) {
        alxw alxw;
        if ((alxw = this.c.f().e) == null) {
            alxw = alxw.a;
        }
        final String k = alxw.k;
        final boolean empty = TextUtils.isEmpty((CharSequence)k);
        boolean b = true;
        if (!empty) {
            final NotificationChannel notificationChannel = ((NotificationManager)context.getSystemService("notification")).getNotificationChannel(k);
            if (notificationChannel == null) {
                zlm.b(zll.a, zlk.g, "Android O+ Notification Channel does not exist: ".concat(String.valueOf(k)));
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
