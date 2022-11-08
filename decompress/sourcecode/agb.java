import android.app.Notification$Builder;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class agb
{
    static Notification$Builder a(final Context context, final String s) {
        return new Notification$Builder(context, s);
    }
    
    static Notification$Builder b(final Notification$Builder notification$Builder, final int badgeIconType) {
        return notification$Builder.setBadgeIconType(badgeIconType);
    }
    
    static Notification$Builder c(final Notification$Builder notification$Builder, final boolean colorized) {
        return notification$Builder.setColorized(colorized);
    }
    
    static Notification$Builder d(final Notification$Builder notification$Builder, final int groupAlertBehavior) {
        return notification$Builder.setGroupAlertBehavior(groupAlertBehavior);
    }
    
    static Notification$Builder e(final Notification$Builder notification$Builder, final CharSequence settingsText) {
        return notification$Builder.setSettingsText(settingsText);
    }
    
    static Notification$Builder f(final Notification$Builder notification$Builder, final String shortcutId) {
        return notification$Builder.setShortcutId(shortcutId);
    }
    
    static Notification$Builder g(final Notification$Builder notification$Builder, final long timeoutAfter) {
        return notification$Builder.setTimeoutAfter(timeoutAfter);
    }
}
