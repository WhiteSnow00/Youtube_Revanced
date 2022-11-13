import android.content.Context;
import android.os.LocaleList;
import android.content.res.Configuration;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fm
{
    static ajp a(final Configuration configuration) {
        return ajp.c(configuration.getLocales().toLanguageTags());
    }
    
    static void b(final Configuration configuration, final Configuration configuration2, final Configuration configuration3) {
        final LocaleList locales = configuration.getLocales();
        final LocaleList locales2 = configuration2.getLocales();
        if (!locales.equals((Object)locales2)) {
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }
    
    public static void c(final ajp ajp) {
        LocaleList.setDefault(LocaleList.forLanguageTags(ajp.f()));
    }
    
    static void d(final Configuration configuration, final ajp ajp) {
        configuration.setLocales(LocaleList.forLanguageTags(ajp.f()));
    }
    
    public static final int e(final Context context) {
        final Configuration configuration = context.getResources().getConfiguration();
        final int screenWidthDp = configuration.screenWidthDp;
        final int screenHeightDp = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || screenWidthDp > 600) {
            return 5;
        }
        if (screenWidthDp >= 500 || (screenWidthDp > 480 && screenHeightDp > 640)) {
            return 4;
        }
        if (screenWidthDp >= 360) {
            return 3;
        }
        return 2;
    }
    
    public static final boolean f(final Context context) {
        return context.getResources().getBoolean(2131034112);
    }
}
