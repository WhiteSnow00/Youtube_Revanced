import android.os.UserManager;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajt
{
    public static boolean a(final Context context) {
        return ((UserManager)context.getSystemService((Class)UserManager.class)).isUserUnlocked();
    }
}
