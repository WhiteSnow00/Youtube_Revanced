import java.text.DateFormatSymbols;
import java.util.Locale;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auez
{
    public static volatile Map a;
    private static final aujh b;
    private static volatile aujh c;
    
    static {
        auez.c = (b = new aujh());
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("UT", aufc.a);
        linkedHashMap.put("UTC", aufc.a);
        linkedHashMap.put("GMT", aufc.a);
        h(linkedHashMap, "EST", "America/New_York");
        h(linkedHashMap, "EDT", "America/New_York");
        h(linkedHashMap, "CST", "America/Chicago");
        h(linkedHashMap, "CDT", "America/Chicago");
        h(linkedHashMap, "MST", "America/Denver");
        h(linkedHashMap, "MDT", "America/Denver");
        h(linkedHashMap, "PST", "America/Los_Angeles");
        h(linkedHashMap, "PDT", "America/Los_Angeles");
        auez.a = Collections.unmodifiableMap((Map<?, ?>)linkedHashMap);
    }
    
    public static final long a() {
        return System.currentTimeMillis();
    }
    
    public static final long b(final aufp aufp) {
        if (aufp == null) {
            return a();
        }
        return aufp.tO();
    }
    
    public static final DateFormatSymbols c(final Locale locale) {
        try {
            return (DateFormatSymbols)DateFormatSymbols.class.getMethod("getInstance", Locale.class).invoke(null, locale);
        }
        catch (final Exception ex) {
            return new DateFormatSymbols(locale);
        }
    }
    
    public static final aueu d(final aueu aueu) {
        Object o = aueu;
        if (aueu == null) {
            o = augt.O();
        }
        return (aueu)o;
    }
    
    public static final aueu e(final aufp aufp) {
        if (aufp == null) {
            return (aueu)augt.O();
        }
        Object o;
        if ((o = aufp.tP()) == null) {
            o = augt.O();
        }
        return (aueu)o;
    }
    
    public static final aufc f(final aufc aufc) {
        aufc k = aufc;
        if (aufc == null) {
            k = aufc.k();
        }
        return k;
    }
    
    public static final aufn g() {
        return aufn.d();
    }
    
    private static void h(final Map map, final String s, final String s2) {
        try {
            map.put(s, aufc.i(s2));
        }
        catch (final RuntimeException ex) {}
    }
}
