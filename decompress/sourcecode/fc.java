import android.graphics.drawable.Drawable;
import android.content.Context;
import android.os.LocaleList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fc
{
    public static LocaleList a(final String s) {
        return LocaleList.forLanguageTags(s);
    }
    
    public static Drawable b(final Context context, final int n) {
        return or.e().c(context, n);
    }
}
