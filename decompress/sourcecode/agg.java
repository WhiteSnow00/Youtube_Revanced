import android.app.NotificationManager;

// 
// Decompiled by Procyon v0.6.0
// 

final class agg
{
    static int a(final NotificationManager notificationManager) {
        return notificationManager.getImportance();
    }
    
    static boolean b(final NotificationManager notificationManager) {
        return notificationManager.areNotificationsEnabled();
    }
}
