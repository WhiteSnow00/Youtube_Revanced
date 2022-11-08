import java.util.Locale;
import java.util.List;
import java.text.ParseException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asbf
{
    private static final long a;
    
    static {
        a = TimeUnit.SECONDS.toNanos(1L);
    }
    
    public static Double a(final Map map, final String s) {
        if (!map.containsKey(s)) {
            return null;
        }
        final String value = map.get(s);
        if (value instanceof Double) {
            return (Double)value;
        }
        if (value instanceof String) {
            try {
                return Double.parseDouble(value);
            }
            catch (final NumberFormatException ex) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not a double", value, s));
            }
        }
        throw new IllegalArgumentException(String.format("value '%s' for key '%s' in '%s' is not a number", value, s, map));
    }
    
    public static Integer b(Map value, final String s) {
        if (!((Map)value).containsKey(s)) {
            return null;
        }
        value = ((Map)value).get(s);
        if (!(value instanceof Double)) {
            if (value instanceof String) {
                try {
                    return Integer.parseInt((String)value);
                }
                catch (final NumberFormatException ex) {
                    throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", value, s));
                }
            }
            throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", value, s));
        }
        final Double n = (Double)value;
        final int intValue = n.intValue();
        if (intValue == n) {
            return intValue;
        }
        new StringBuilder("Number expected to be integer: ").append(n);
        throw new ClassCastException("Number expected to be integer: ".concat(String.valueOf(n)));
    }
    
    public static Long c(final Map map, String substring) {
        String s = d(map, substring);
        if (s != null) {
            try {
                final boolean empty = s.isEmpty();
                final boolean b = false;
                Label_0617: {
                    if (empty || s.charAt(s.length() - 1) != 's') {
                        break Label_0617;
                    }
                    boolean b2;
                    if (s.charAt(0) == '-') {
                        s = s.substring(1);
                        b2 = true;
                    }
                    else {
                        b2 = false;
                    }
                    final String substring2 = s.substring(0, s.length() - 1);
                    substring = "";
                    final int index = substring2.indexOf(46);
                    String substring3 = substring2;
                    if (index != -1) {
                        substring = substring2.substring(index + 1);
                        substring3 = substring2.substring(0, index);
                    }
                    final long long1 = Long.parseLong(substring3);
                    int n;
                    if (substring.isEmpty()) {
                        n = 0;
                    }
                    else {
                        int n2 = 0;
                        int n3 = 0;
                        while (true) {
                            n = n3;
                            if (n2 >= 9) {
                                break;
                            }
                            final int n4 = n3 *= 10;
                            if (n2 < substring.length()) {
                                if (substring.charAt(n2) < '0' || substring.charAt(n2) > '9') {
                                    throw new ParseException("Invalid nanoseconds.", 0);
                                }
                                n3 = n4 + (substring.charAt(n2) - '0');
                            }
                            ++n2;
                        }
                    }
                    if (long1 >= 0L) {
                        long n5 = long1;
                        int n6 = n;
                        if (b2) {
                            n5 = -long1;
                            n6 = -n;
                        }
                        final long n7 = n6;
                        try {
                            final long a = asbf.a;
                            long q = 0L;
                            int n8 = 0;
                            Label_0316: {
                                if (n7 > -a) {
                                    q = n5;
                                    n8 = n6;
                                    if (n7 < a) {
                                        break Label_0316;
                                    }
                                }
                                q = aesy.Q(n5, n7 / a);
                                n8 = (int)(n7 % a);
                            }
                            long n9 = q;
                            int n10 = n8;
                            if (q > 0L) {
                                n9 = q;
                                if ((n10 = n8) < 0) {
                                    n10 = (int)(n8 + a);
                                    n9 = q - 1L;
                                }
                            }
                            long n11 = n9;
                            int n12 = n10;
                            if (n9 < 0L) {
                                n11 = n9;
                                if ((n12 = n10) > 0) {
                                    n12 = (int)(n10 - a);
                                    n11 = n9 + 1L;
                                }
                            }
                            if (n11 >= -315576000000L && n11 <= 315576000000L) {
                                final long n13 = n12;
                                if (n13 >= -999999999L && n13 < a && ((n11 >= 0L && n12 >= 0) || (n11 <= 0L && n12 <= 0))) {
                                    final long nanos = TimeUnit.SECONDS.toNanos(n11);
                                    long n14 = nanos + n13;
                                    final boolean b3 = (n13 ^ nanos) < 0L;
                                    boolean b4 = b;
                                    if ((nanos ^ n14) >= 0L) {
                                        b4 = true;
                                    }
                                    if (!(b3 | b4)) {
                                        n14 = (0x1L ^ n14 >>> 63) + Long.MAX_VALUE;
                                    }
                                    return n14;
                                }
                            }
                            throw new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", n11, n12));
                        }
                        catch (final IllegalArgumentException ex) {
                            throw new ParseException("Duration value is out of range.", 0);
                        }
                    }
                    try {
                        throw new ParseException("Invalid duration string: ".concat(String.valueOf(s)), 0);
                        throw new ParseException("Invalid duration string: ".concat(s), 0);
                    }
                    catch (final ParseException ex2) {
                        throw new RuntimeException(ex2);
                    }
                }
            }
            catch (final ParseException ex3) {}
        }
        return null;
    }
    
    public static String d(final Map map, final String s) {
        if (!map.containsKey(s)) {
            return null;
        }
        final String value = map.get(s);
        if (value instanceof String) {
            return value;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not String", value, s, map));
    }
    
    public static List e(final Map map, final String s) {
        if (!map.containsKey(s)) {
            return null;
        }
        final List value = map.get(s);
        if (value instanceof List) {
            return value;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not List", value, s, map));
    }
    
    public static List f(final Map map, final String s) {
        final List e = e(map, s);
        if (e == null) {
            return null;
        }
        i(e);
        return e;
    }
    
    public static List g(final Map map, final String s) {
        final List e = e(map, s);
        if (e == null) {
            return null;
        }
        for (int i = 0; i < e.size(); ++i) {
            if (!(e.get(i) instanceof String)) {
                throw new ClassCastException(String.format(Locale.US, "value '%s' for idx %d in '%s' is not string", e.get(i), i, e));
            }
        }
        return e;
    }
    
    public static Map h(final Map map, final String s) {
        if (!map.containsKey(s)) {
            return null;
        }
        final Map value = map.get(s);
        if (value instanceof Map) {
            return value;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not object", value, s, map));
    }
    
    public static void i(final List list) {
        for (int i = 0; i < list.size(); ++i) {
            if (!(list.get(i) instanceof Map)) {
                throw new ClassCastException(String.format(Locale.US, "value %s for idx %d in %s is not object", list.get(i), i, list));
            }
        }
    }
    
    public static Boolean j(final Map map) {
        if (!map.containsKey("waitForReady")) {
            return null;
        }
        final Boolean value = map.get("waitForReady");
        if (value instanceof Boolean) {
            return value;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not Boolean", value, "waitForReady", map));
    }
}
