import android.os.Looper;
import android.opengl.GLES20;
import android.app.Notification$Style;
import android.app.Notification$Builder;
import android.media.session.MediaSession$Token;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.app.Notification$MediaStyle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class axl
{
    static Notification$MediaStyle a() {
        return new Notification$MediaStyle();
    }
    
    static Notification$MediaStyle b(final Notification$MediaStyle notification$MediaStyle, final int[] array, final MediaSessionCompat$Token mediaSessionCompat$Token) {
        if (array != null) {
            e(notification$MediaStyle, array);
        }
        if (mediaSessionCompat$Token != null) {
            c(notification$MediaStyle, (MediaSession$Token)mediaSessionCompat$Token.b);
        }
        return notification$MediaStyle;
    }
    
    static void c(final Notification$MediaStyle notification$MediaStyle, final MediaSession$Token mediaSession) {
        notification$MediaStyle.setMediaSession(mediaSession);
    }
    
    static void d(final Notification$Builder notification$Builder, final Notification$MediaStyle style) {
        notification$Builder.setStyle((Notification$Style)style);
    }
    
    static void e(final Notification$MediaStyle notification$MediaStyle, final int... showActionsInCompactView) {
        notification$MediaStyle.setShowActionsInCompactView(showActionsInCompactView);
    }
    
    public static int f() {
        final int[] array = { 0 };
        GLES20.glGenTextures(1, array, 0);
        h("glGenTextures");
        return array[0];
    }
    
    public static void g(final String s) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            return;
        }
        final StringBuilder sb = new StringBuilder("Attempting to perform GL operation '");
        sb.append(s);
        sb.append("' on UI thread!");
        throw new RuntimeException(sb.toString());
    }
    
    public static void h(final String s) {
        final int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        final String hexString = Integer.toHexString(glGetError);
        final StringBuilder sb = new StringBuilder("GL Operation '");
        sb.append(s);
        sb.append("' caused error ");
        sb.append(hexString);
        sb.append("!");
        throw new RuntimeException(sb.toString());
    }
    
    public static void i() {
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        h("glTexParameteri");
    }
}
