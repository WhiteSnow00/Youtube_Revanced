import java.util.Map;
import java.util.Locale;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aumt
{
    private final HashMap a;
    private final HashMap b;
    
    public aumt() {
        this.a = c();
        this.b = c();
    }
    
    private static final HashMap c() {
        return new HashMap(7);
    }
    
    public final String[] a(final Locale locale, String value, final String s) {
        monitorenter(this);
        final String[] array = null;
        if (locale != null) {
            try {
                Map c;
                if ((c = this.a.get(locale)) == null) {
                    final HashMap a = this.a;
                    c = c();
                    a.put(locale, c);
                }
                Map map;
                if ((map = (Map)c.get(value)) == null) {
                    final HashMap c2 = c();
                    c.put(value, c2);
                    final String[][] zoneStrings = auim.c(Locale.ENGLISH).getZoneStrings();
                    final int length = zoneStrings.length;
                    int i = 0;
                    while (true) {
                        while (i < length) {
                            final String[] array2 = zoneStrings[i];
                            if (array2 != null && array2.length >= 5 && value.equals(array2[0])) {
                                final String[][] zoneStrings2 = auim.c(locale).getZoneStrings();
                                final int length2 = zoneStrings2.length;
                                int n = 0;
                                String[] array3;
                                while (true) {
                                    array3 = array;
                                    if (n >= length2) {
                                        break;
                                    }
                                    array3 = zoneStrings2[n];
                                    if (array3 != null && array3.length >= 5 && value.equals(array3[0])) {
                                        break;
                                    }
                                    ++n;
                                }
                                map = c2;
                                if (array2 == null) {
                                    return (String[])map.get(s);
                                }
                                map = c2;
                                if (array3 == null) {
                                    return (String[])map.get(s);
                                }
                                c2.put(array2[2], new String[] { array3[2], array3[1] });
                                if (array2[2].equals(array2[4])) {
                                    value = String.valueOf(array2[4]);
                                    c2.put(value.concat("-Summer"), new String[] { array3[4], array3[3] });
                                    map = c2;
                                    return (String[])map.get(s);
                                }
                                c2.put(array2[4], new String[] { array3[4], array3[3] });
                                map = c2;
                                return (String[])map.get(s);
                            }
                            else {
                                ++i;
                            }
                        }
                        final String[] array2 = null;
                        continue;
                    }
                }
                return (String[])map.get(s);
            }
            finally {
                monitorexit(this);
            }
        }
        monitorexit(this);
        return null;
    }
    
    public final String[] b(final Locale locale, final String s, final boolean b) {
        monitorenter(this);
        final String[] array = null;
        if (locale != null) {
            String substring = s;
            try {
                if (s.startsWith("Etc/")) {
                    substring = s.substring(4);
                }
                Map c;
                if ((c = this.b.get(locale)) == null) {
                    final HashMap b2 = this.b;
                    c = c();
                    b2.put(locale, c);
                }
                Map map;
                if ((map = (Map)c.get(substring)) == null) {
                    final HashMap c2 = c();
                    c.put(substring, c2);
                    final String[][] zoneStrings = auim.c(Locale.ENGLISH).getZoneStrings();
                    final int length = zoneStrings.length;
                    int i = 0;
                    while (true) {
                        while (i < length) {
                            final String[] array2 = zoneStrings[i];
                            if (array2 != null && array2.length >= 5 && substring.equals(array2[0])) {
                                final String[][] zoneStrings2 = auim.c(locale).getZoneStrings();
                                final int length2 = zoneStrings2.length;
                                int n = 0;
                                String[] array3;
                                while (true) {
                                    array3 = array;
                                    if (n >= length2) {
                                        break;
                                    }
                                    array3 = zoneStrings2[n];
                                    if (array3 != null && array3.length >= 5 && substring.equals(array3[0])) {
                                        break;
                                    }
                                    ++n;
                                }
                                map = c2;
                                if (array2 == null) {
                                    return (String[])map.get(b);
                                }
                                map = c2;
                                if (array3 != null) {
                                    c2.put(Boolean.TRUE, new String[] { array3[2], array3[1] });
                                    c2.put(Boolean.FALSE, new String[] { array3[4], array3[3] });
                                    map = c2;
                                    return (String[])map.get(b);
                                }
                                return (String[])map.get(b);
                            }
                            else {
                                ++i;
                            }
                        }
                        final String[] array2 = null;
                        continue;
                    }
                }
                return (String[])map.get(b);
            }
            finally {
                monitorexit(this);
            }
        }
        monitorexit(this);
        return null;
    }
}
