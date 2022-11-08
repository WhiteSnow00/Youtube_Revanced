import android.os.IBinder;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afa
{
    public static IBinder a(final Bundle bundle, final String s) {
        return bundle.getBinder(s);
    }
    
    public static void b(final Bundle bundle, final String s, final IBinder binder) {
        bundle.putBinder(s, binder);
    }
    
    public static void c(final Object o, final String s) {
        if (o != null) {
            return;
        }
        throw new NullPointerException(s);
    }
}
