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

public final class adtl implements adti
{
    public final void a(final Context context, final adtg adtg, final Optional optional, final Optional optional2) {
        synchronized (this) {
            final adtm adtm = new adtm(adtg);
            final Intent setPackage = new Intent("ACTION_S11Y").setPackage((String)optional2.orElse((Object)null));
            final Handler handler = (Handler)optional.map((Function)adtc.c).orElse((Object)null);
            final Bundle bundle = new Bundle();
            final ahcr builder = ((ahcz)odg.a).createBuilder();
            final String packageName = context.getApplicationContext().getPackageName();
            builder.copyOnWrite();
            final odg odg = (odg)builder.instance;
            packageName.getClass();
            odg.b = packageName;
            bundle.putByteArray("S11Y_SESSION_DETECTION_REQUEST", ((ahbc)builder.build()).toByteArray());
            context.sendOrderedBroadcast(setPackage, (String)null, (BroadcastReceiver)adtm, handler, 0, (String)null, bundle);
        }
    }
}
