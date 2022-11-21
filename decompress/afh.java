import android.content.Intent;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afh
{
    public static Intent a(final Activity activity) {
        return activity.getParentActivityIntent();
    }
    
    public static boolean b(final Activity activity, final Intent intent) {
        return activity.navigateUpTo(intent);
    }
    
    public static boolean c(final Activity activity, final Intent intent) {
        return activity.shouldUpRecreateTask(intent);
    }
    
    public static final alf d(final ala ala) {
        return ala.a();
    }
}
