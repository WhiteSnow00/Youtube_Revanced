import android.media.AudioAttributes;
import android.net.Uri;
import android.app.Notification;
import android.app.Notification$Builder;

// 
// Decompiled by Procyon v0.6.0
// 

final class afy
{
    static Notification$Builder a(final Notification$Builder notification$Builder, final String s) {
        return notification$Builder.addPerson(s);
    }
    
    static Notification$Builder b(final Notification$Builder notification$Builder, final String category) {
        return notification$Builder.setCategory(category);
    }
    
    static Notification$Builder c(final Notification$Builder notification$Builder, final int color) {
        return notification$Builder.setColor(color);
    }
    
    static Notification$Builder d(final Notification$Builder notification$Builder, final Notification publicVersion) {
        return notification$Builder.setPublicVersion(publicVersion);
    }
    
    static Notification$Builder e(final Notification$Builder notification$Builder, final Uri uri, final AudioAttributes audioAttributes) {
        return notification$Builder.setSound(uri, audioAttributes);
    }
    
    static Notification$Builder f(final Notification$Builder notification$Builder, final int visibility) {
        return notification$Builder.setVisibility(visibility);
    }
}
