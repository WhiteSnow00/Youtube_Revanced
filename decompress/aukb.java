import java.text.DateFormatSymbols;
import java.util.Comparator;
import java.util.Locale;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentMap;

// 
// Decompiled by Procyon v0.6.0
// 

final class aukb
{
    private static final ConcurrentMap n;
    public final String[] a;
    public final String[] b;
    public final String[] c;
    public final String[] d;
    public final String[] e;
    public final String[] f;
    public final TreeMap g;
    public final TreeMap h;
    public final TreeMap i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    
    static {
        n = (ConcurrentMap)new ConcurrentHashMap();
    }
    
    private aukb(final Locale locale) {
        final DateFormatSymbols c = auim.c(locale);
        this.a = c.getEras();
        this.b = d(c.getWeekdays());
        this.c = d(c.getShortWeekdays());
        this.d = e(c.getMonths());
        this.e = e(c.getShortMonths());
        this.f = c.getAmPmStrings();
        final Integer[] array = new Integer[13];
        for (int i = 0; i < 13; ++i) {
            array[i] = i;
        }
        final TreeMap g = new TreeMap((Comparator<? super K>)String.CASE_INSENSITIVE_ORDER);
        c(this.g = g, this.a, array);
        if ("en".equals(locale.getLanguage())) {
            g.put("BCE", array[0]);
            g.put("CE", array[1]);
        }
        final TreeMap h = new TreeMap((Comparator<? super K>)String.CASE_INSENSITIVE_ORDER);
        c(this.h = h, this.b, array);
        c(h, this.c, array);
        f(h, 7, array);
        final TreeMap j = new TreeMap((Comparator<? super K>)String.CASE_INSENSITIVE_ORDER);
        c(this.i = j, this.d, array);
        c(j, this.e, array);
        f(j, 12, array);
        this.j = b(this.a);
        this.k = b(this.b);
        b(this.c);
        this.l = b(this.d);
        b(this.e);
        this.m = b(this.f);
    }
    
    static aukb a(final Locale locale) {
        Locale default1 = locale;
        if (locale == null) {
            default1 = Locale.getDefault();
        }
        final ConcurrentMap n = aukb.n;
        aukb aukb;
        if ((aukb = (aukb)n.get(default1)) == null) {
            aukb = new aukb(default1);
            final aukb aukb2 = n.putIfAbsent(default1, aukb);
            if (aukb2 != null) {
                return aukb2;
            }
        }
        return aukb;
    }
    
    private static int b(final String[] array) {
        int length = array.length;
        int n = 0;
        while (true) {
            final int n2 = length - 1;
            if (n2 < 0) {
                break;
            }
            final String s = array[n2];
            length = n2;
            if (s == null) {
                continue;
            }
            final int length2 = s.length();
            length = n2;
            if (length2 <= n) {
                continue;
            }
            n = length2;
            length = n2;
        }
        return n;
    }
    
    private static void c(final TreeMap treeMap, final String[] array, final Integer[] array2) {
        int length = array.length;
        while (true) {
            final int n = length - 1;
            if (n < 0) {
                break;
            }
            final String s = array[n];
            length = n;
            if (s == null) {
                continue;
            }
            treeMap.put(s, array2[n]);
            length = n;
        }
    }
    
    private static String[] d(final String[] array) {
        final String[] array2 = new String[8];
        for (int i = 1; i < 8; ++i) {
            int n;
            if (i < 7) {
                n = i + 1;
            }
            else {
                n = 1;
            }
            array2[i] = array[n];
        }
        return array2;
    }
    
    private static String[] e(final String[] array) {
        final String[] array2 = new String[13];
        for (int i = 1; i < 13; ++i) {
            array2[i] = array[i - 1];
        }
        return array2;
    }
    
    private static void f(final TreeMap treeMap, final int n, final Integer[] array) {
        for (int i = 1; i <= n; ++i) {
            treeMap.put(String.valueOf(i).intern(), array[i]);
        }
    }
}
