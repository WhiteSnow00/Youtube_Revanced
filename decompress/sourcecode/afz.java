import android.app.Notification$Builder;
import android.app.Notification$Action$Builder;
import android.app.PendingIntent;
import android.graphics.drawable.Icon;

// 
// Decompiled by Procyon v0.6.0
// 

final class afz
{
    static Notification$Action$Builder a(final Icon icon, final CharSequence charSequence, final PendingIntent pendingIntent) {
        return new Notification$Action$Builder(icon, charSequence, pendingIntent);
    }
    
    static Notification$Builder b(final Notification$Builder notification$Builder, final Icon smallIcon) {
        return notification$Builder.setSmallIcon(smallIcon);
    }
}
