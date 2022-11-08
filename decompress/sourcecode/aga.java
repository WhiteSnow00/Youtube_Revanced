import android.widget.RemoteViews;
import android.app.Notification$Builder;
import android.app.Notification$Action$Builder;

// 
// Decompiled by Procyon v0.6.0
// 

final class aga
{
    static Notification$Action$Builder a(final Notification$Action$Builder notification$Action$Builder, final boolean allowGeneratedReplies) {
        return notification$Action$Builder.setAllowGeneratedReplies(allowGeneratedReplies);
    }
    
    static Notification$Builder b(final Notification$Builder notification$Builder, final RemoteViews customBigContentView) {
        return notification$Builder.setCustomBigContentView(customBigContentView);
    }
    
    static Notification$Builder c(final Notification$Builder notification$Builder, final RemoteViews customContentView) {
        return notification$Builder.setCustomContentView(customContentView);
    }
    
    static Notification$Builder d(final Notification$Builder notification$Builder, final RemoteViews customHeadsUpContentView) {
        return notification$Builder.setCustomHeadsUpContentView(customHeadsUpContentView);
    }
    
    static Notification$Builder e(final Notification$Builder notification$Builder, final CharSequence[] remoteInputHistory) {
        return notification$Builder.setRemoteInputHistory(remoteInputHistory);
    }
}
