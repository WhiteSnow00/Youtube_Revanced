import android.view.inputmethod.EditorInfo;
import android.app.Notification$Builder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afv
{
    static Notification$Builder a(final Notification$Builder notification$Builder, final boolean showWhen) {
        return notification$Builder.setShowWhen(showWhen);
    }
    
    public static void b(final EditorInfo editorInfo, final CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }
}
