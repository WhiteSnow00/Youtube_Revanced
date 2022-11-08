import android.text.SpannableStringBuilder;
import android.view.inputmethod.EditorInfo;
import android.os.Bundle;
import android.app.Notification$Builder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afw
{
    static Notification$Builder a(final Notification$Builder notification$Builder, final Bundle extras) {
        return notification$Builder.setExtras(extras);
    }
    
    public static void b(final EditorInfo editorInfo, final CharSequence charSequence, final int n, final int n2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        Object o;
        if (charSequence != null) {
            o = new SpannableStringBuilder(charSequence);
        }
        else {
            o = null;
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", (CharSequence)o);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", n);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", n2);
    }
    
    public static boolean c(final CharSequence charSequence, final int n, final int n2) {
        if (n2 != 0) {
            return Character.isHighSurrogate(charSequence.charAt(n));
        }
        return Character.isLowSurrogate(charSequence.charAt(n));
    }
}
