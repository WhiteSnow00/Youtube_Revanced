import android.app.LocaleManager;
import android.os.LocaleList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fd
{
    public static LocaleList a(final Object o) {
        return ((LocaleManager)o).getApplicationLocales();
    }
    
    public static void b(final Object o, final LocaleList applicationLocales) {
        ((LocaleManager)o).setApplicationLocales(applicationLocales);
    }
}
