import android.app.Notification$Builder;
import android.graphics.Bitmap;
import android.app.Notification$BigPictureStyle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afj
{
    static Notification$BigPictureStyle a(final Notification$BigPictureStyle notification$BigPictureStyle, final Bitmap bitmap) {
        return notification$BigPictureStyle.bigPicture(bitmap);
    }
    
    static Notification$BigPictureStyle b(final Notification$Builder notification$Builder) {
        return new Notification$BigPictureStyle(notification$Builder);
    }
    
    static Notification$BigPictureStyle c(final Notification$BigPictureStyle notification$BigPictureStyle, final CharSequence bigContentTitle) {
        return notification$BigPictureStyle.setBigContentTitle(bigContentTitle);
    }
    
    static void d(final Notification$BigPictureStyle notification$BigPictureStyle, final Bitmap bitmap) {
        notification$BigPictureStyle.bigLargeIcon((Bitmap)null);
    }
    
    static void e(final Notification$BigPictureStyle notification$BigPictureStyle, final CharSequence summaryText) {
        notification$BigPictureStyle.setSummaryText(summaryText);
    }
    
    public static final ale f(final akz akz) {
        return akz.a();
    }
}
