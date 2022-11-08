import android.app.Notification$Builder;
import android.app.Notification$Action$Builder;

// 
// Decompiled by Procyon v0.6.0
// 

final class age
{
    static Notification$Action$Builder a(final Notification$Action$Builder notification$Action$Builder, final boolean authenticationRequired) {
        return notification$Action$Builder.setAuthenticationRequired(authenticationRequired);
    }
    
    static Notification$Builder b(final Notification$Builder notification$Builder, final int foregroundServiceBehavior) {
        return notification$Builder.setForegroundServiceBehavior(foregroundServiceBehavior);
    }
}
