// 
// Decompiled by Procyon v0.6.0
// 

package androidx.core.app;

import android.os.Parcelable;
import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;

public class RemoteActionCompatParcelizer
{
    public static RemoteActionCompat read(final ckq ckq) {
        final RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.a = (IconCompat)ckq.t((ckr)remoteActionCompat.a);
        remoteActionCompat.b = ckq.d(remoteActionCompat.b, 2);
        remoteActionCompat.c = ckq.d(remoteActionCompat.c, 3);
        remoteActionCompat.d = (PendingIntent)ckq.b((Parcelable)remoteActionCompat.d, 4);
        remoteActionCompat.e = ckq.l(remoteActionCompat.e, 5);
        remoteActionCompat.f = ckq.l(remoteActionCompat.f, 6);
        return remoteActionCompat;
    }
    
    public static void write(final RemoteActionCompat remoteActionCompat, final ckq ckq) {
        ckq.u((ckr)remoteActionCompat.a);
        ckq.g(remoteActionCompat.b, 2);
        ckq.g(remoteActionCompat.c, 3);
        ckq.i((Parcelable)remoteActionCompat.d, 4);
        ckq.f(remoteActionCompat.e, 5);
        ckq.f(remoteActionCompat.f, 6);
    }
}
