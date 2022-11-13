import android.view.View;
import android.view.MenuItem;
import android.graphics.drawable.Icon;
import android.app.Notification$BigPictureStyle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afk
{
    static void a(final Notification$BigPictureStyle notification$BigPictureStyle, final Icon icon) {
        notification$BigPictureStyle.bigLargeIcon(icon);
    }
    
    @Deprecated
    public static View b(final MenuItem menuItem) {
        return menuItem.getActionView();
    }
}
