import java.util.concurrent.Callable;
import android.util.Base64;
import java.util.concurrent.Executor;
import android.content.Intent;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agmh
{
    private static final Object a;
    private static agnd b;
    
    static {
        a = new Object();
    }
    
    public static nnc a(final Context context, final Intent intent) {
        synchronized (agmh.a) {
            if (agmh.b == null) {
                agmh.b = new agnd(context);
            }
            final agnd b = agmh.b;
            monitorexit(agmh.a);
            return b.a(intent).a((Executor)rr.j, (nmr)myh.f);
        }
    }
    
    public static final nnc b(final Intent intent, final Context context, final Executor executor) {
        final String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        final int targetSdkVersion = context.getApplicationInfo().targetSdkVersion;
        final int flags = intent.getFlags();
        nnc nnc;
        if (targetSdkVersion >= 26 && (flags & 0x10000000) == 0x0) {
            nnc = a(context, intent);
        }
        else {
            nnc = nnv.a(executor, (Callable)new zuj(context, intent, 14)).b(executor, (nmr)new aglc(context, intent, 2));
        }
        return nnc;
    }
}
