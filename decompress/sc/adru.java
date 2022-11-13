import android.content.BroadcastReceiver;
import android.os.Bundle;
import java.util.function.Function;
import android.os.Handler;
import android.content.Intent;
import j$.util.Optional;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adru implements adrr
{
    public final void a(final Context context, final adrp adrp, final Optional optional, final Optional optional2) {
        synchronized (this) {
            final adrv adrv = new adrv(adrp);
            final Intent setPackage = new Intent("ACTION_S11Y").setPackage((String)optional2.orElse((Object)null));
            final Handler handler = (Handler)optional.map((Function)achg.q).orElse((Object)null);
            final Bundle bundle = new Bundle();
            final ahaz builder = ((ahbh)ocq.a).createBuilder();
            final String packageName = context.getApplicationContext().getPackageName();
            builder.copyOnWrite();
            final ocq ocq = (ocq)builder.instance;
            packageName.getClass();
            ocq.b = packageName;
            bundle.putByteArray("S11Y_SESSION_DETECTION_REQUEST", ((agzk)builder.build()).toByteArray());
            context.sendOrderedBroadcast(setPackage, (String)null, (BroadcastReceiver)adrv, handler, 0, (String)null, bundle);
        }
    }
}
