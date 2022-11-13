import android.view.View;
import java.util.Locale;
import android.content.res.Configuration;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fl
{
    static int a(final Configuration configuration) {
        return configuration.getLayoutDirection();
    }
    
    static void b(final Configuration configuration, final Locale layoutDirection) {
        configuration.setLayoutDirection(layoutDirection);
    }
    
    static void c(final View view, final int layoutDirection) {
        view.setLayoutDirection(layoutDirection);
    }
    
    static void d(final Configuration configuration, final Locale locale) {
        configuration.setLocale(locale);
    }
}
