import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

final class ajo
{
    private static final Locale[] a;
    
    static {
        a = new Locale[] { new Locale("en", "XA"), new Locale("ar", "XB") };
    }
    
    static Locale a(final String s) {
        return Locale.forLanguageTag(s);
    }
    
    static boolean b(final Locale locale, final Locale locale2) {
        if (locale.equals(locale2)) {
            return true;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage())) {
            return false;
        }
        if (c(locale) || c(locale2)) {
            return false;
        }
        final String e = afa.e(locale);
        if (e.isEmpty()) {
            final String country = locale.getCountry();
            return country.isEmpty() || country.equals(locale2.getCountry());
        }
        return e.equals(afa.e(locale2));
    }
    
    private static boolean c(final Locale locale) {
        final Locale[] a = ajo.a;
        final int length = a.length;
        for (int i = 0; i < 2; ++i) {
            if (a[i].equals(locale)) {
                return true;
            }
        }
        return false;
    }
}
