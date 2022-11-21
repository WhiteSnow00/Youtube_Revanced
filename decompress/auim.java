import java.text.DateFormatSymbols;
import java.util.Locale;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auim
{
    public static volatile Map a;
    private static final auig b;
    private static volatile auig c;
    
    static {
        auim.c = (b = new auig());
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("UT", auip.a);
        linkedHashMap.put("UTC", auip.a);
        linkedHashMap.put("GMT", auip.a);
        h(linkedHashMap, "EST", "America/New_York");
        h(linkedHashMap, "EDT", "America/New_York");
        h(linkedHashMap, "CST", "America/Chicago");
        h(linkedHashMap, "CDT", "America/Chicago");
        h(linkedHashMap, "MST", "America/Denver");
        h(linkedHashMap, "MDT", "America/Denver");
        h(linkedHashMap, "PST", "America/Los_Angeles");
        h(linkedHashMap, "PDT", "America/Los_Angeles");
        auim.a = Collections.unmodifiableMap((Map<?, ?>)linkedHashMap);
    }
    
    public static final long a() {
        return System.currentTimeMillis();
    }
    
    public static final long b(final aujc aujc) {
        if (aujc == null) {
            return a();
        }
        return aujc.tQ();
    }
    
    public static final DateFormatSymbols c(final Locale locale) {
        try {
            return (DateFormatSymbols)DateFormatSymbols.class.getMethod("getInstance", Locale.class).invoke(null, locale);
        }
        catch (final Exception ex) {
            return new DateFormatSymbols(locale);
        }
    }
    
    public static final auih d(final auih auih) {
        Object o = auih;
        if (auih == null) {
            o = aukg.O();
        }
        return (auih)o;
    }
    
    public static final auih e(final aujc aujc) {
        if (aujc == null) {
            return (auih)aukg.O();
        }
        Object o;
        if ((o = aujc.tR()) == null) {
            o = aukg.O();
        }
        return (auih)o;
    }
    
    public static final auip f(final auip auip) {
        auip k = auip;
        if (auip == null) {
            k = auip.k();
        }
        return k;
    }
    
    public static final auja g() {
        return auja.d();
    }
    
    private static void h(final Map map, final String s, final String s2) {
        try {
            map.put(s, auip.i(s2));
        }
        catch (final RuntimeException ex) {}
    }
}
