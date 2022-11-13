import android.app.PendingIntent;
import android.os.Bundle;
import android.content.Intent;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ags
{
    public static PendingIntent a(final Context context, final int n, final Intent[] array, final int n2, final Bundle bundle) {
        return PendingIntent.getActivities(context, n, array, n2, bundle);
    }
}
