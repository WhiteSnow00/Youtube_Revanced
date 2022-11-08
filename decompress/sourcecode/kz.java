import android.widget.TextView;
import android.os.LocaleList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kz
{
    static LocaleList a(final String s) {
        return LocaleList.forLanguageTags(s);
    }
    
    static void b(final TextView textView, final LocaleList textLocales) {
        textView.setTextLocales(textLocales);
    }
}
