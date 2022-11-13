import android.provider.Settings$Global;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dsj
{
    static {
        final boolean a = dyp.a;
    }
    
    public static boolean a(final Context context) {
        return !dyp.f && (!dyp.e || (context != null && Settings$Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f));
    }
}
