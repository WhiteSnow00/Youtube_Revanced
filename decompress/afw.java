import android.view.inputmethod.EditorInfo;
import android.app.Notification;
import android.app.Notification$Builder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afw
{
    static Notification$Builder a(final Notification$Builder notification$Builder, final int priority) {
        return notification$Builder.setPriority(priority);
    }
    
    static Notification$Builder b(final Notification$Builder notification$Builder, final CharSequence subText) {
        return notification$Builder.setSubText(subText);
    }
    
    static Notification$Builder c(final Notification$Builder notification$Builder, final boolean usesChronometer) {
        return notification$Builder.setUsesChronometer(usesChronometer);
    }
    
    static Notification d(final Notification$Builder notification$Builder) {
        return notification$Builder.build();
    }
    
    public static void e(final EditorInfo editorInfo, final CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }
}
