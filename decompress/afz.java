import android.app.Notification;
import android.app.Notification$Builder;
import android.app.Notification$Action;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.os.Bundle;
import android.app.Notification$Action$Builder;

// 
// Decompiled by Procyon v0.6.0
// 

final class afz
{
    static Notification$Action$Builder a(final Notification$Action$Builder notification$Action$Builder, final Bundle bundle) {
        return notification$Action$Builder.addExtras(bundle);
    }
    
    static Notification$Action$Builder b(final Notification$Action$Builder notification$Action$Builder, final RemoteInput remoteInput) {
        return notification$Action$Builder.addRemoteInput(remoteInput);
    }
    
    static Notification$Action$Builder c(final int n, final CharSequence charSequence, final PendingIntent pendingIntent) {
        return new Notification$Action$Builder(n, charSequence, pendingIntent);
    }
    
    static Notification$Action d(final Notification$Action$Builder notification$Action$Builder) {
        return notification$Action$Builder.build();
    }
    
    static Notification$Builder e(final Notification$Builder notification$Builder, final Notification$Action notification$Action) {
        return notification$Builder.addAction(notification$Action);
    }
    
    static Notification$Builder f(final Notification$Builder notification$Builder, final String group) {
        return notification$Builder.setGroup(group);
    }
    
    static Notification$Builder g(final Notification$Builder notification$Builder, final boolean groupSummary) {
        return notification$Builder.setGroupSummary(groupSummary);
    }
    
    static Notification$Builder h(final Notification$Builder notification$Builder, final boolean localOnly) {
        return notification$Builder.setLocalOnly(localOnly);
    }
    
    static Notification$Builder i(final Notification$Builder notification$Builder, final String sortKey) {
        return notification$Builder.setSortKey(sortKey);
    }
    
    static String j(final Notification notification) {
        return notification.getGroup();
    }
}
