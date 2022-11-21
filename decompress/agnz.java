import java.util.concurrent.Callable;
import android.util.Base64;
import java.util.concurrent.Executor;
import android.content.Intent;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agnz
{
    private static final Object a;
    private static agov b;
    
    static {
        a = new Object();
    }
    
    public static nnt a(final Context context, final Intent intent) {
        synchronized (agnz.a) {
            if (agnz.b == null) {
                agnz.b = new agov(context);
            }
            final agov b = agnz.b;
            monitorexit(agnz.a);
            return b.a(intent).a((Executor)rs.j, (nni)myw.f);
        }
    }
    
    public static final nnt b(final Intent intent, final Context context, final Executor executor) {
        final String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        final int targetSdkVersion = context.getApplicationInfo().targetSdkVersion;
        final int flags = intent.getFlags();
        nnt nnt;
        if (targetSdkVersion >= 26 && (flags & 0x10000000) == 0x0) {
            nnt = a(context, intent);
        }
        else {
            nnt = nom.c(executor, (Callable)new zwg(context, intent, 15)).b(executor, (nni)new agmt(context, intent, 2));
        }
        return nnt;
    }
}
