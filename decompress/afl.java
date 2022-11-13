import android.view.MotionEvent;
import android.graphics.drawable.Icon;
import android.app.Notification$BigPictureStyle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afl
{
    static void a(final Notification$BigPictureStyle notification$BigPictureStyle, final Icon icon) {
        notification$BigPictureStyle.bigPicture(icon);
    }
    
    static void b(final Notification$BigPictureStyle notification$BigPictureStyle, final CharSequence charSequence) {
        notification$BigPictureStyle.setContentDescription((CharSequence)null);
    }
    
    static void c(final Notification$BigPictureStyle notification$BigPictureStyle, final boolean b) {
        notification$BigPictureStyle.showBigPictureWhenCollapsed(b);
    }
    
    public static boolean d(final MotionEvent motionEvent, final int n) {
        return (motionEvent.getSource() & n) == n;
    }
}
