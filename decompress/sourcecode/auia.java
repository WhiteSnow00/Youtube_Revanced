import java.util.Locale;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auia implements auio, auim
{
    private static final Map a;
    private final auey b;
    private final boolean c;
    
    static {
        a = (Map)new ConcurrentHashMap();
    }
    
    public auia(final auey b, final boolean c) {
        this.b = b;
        this.c = c;
    }
    
    public final int a() {
        return this.b();
    }
    
    public final int b() {
        if (this.c) {
            return 6;
        }
        return 20;
    }
    
    public final int c(final auii auii, final CharSequence charSequence, final int n) {
        final Locale b = auii.b;
        final Map a = auia.a;
        Object o;
        if ((o = a.get(b)) == null) {
            o = new ConcurrentHashMap();
            a.put(b, o);
        }
        final Object[] array = (Object[])((Map)o).get(this.b);
        int intValue;
        Object o2;
        if (array == null) {
            final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(32);
            final aufl aufl = new aufl(aufc.a);
            final auey b2 = this.b;
            final auew a2 = b2.a(((aufv)aufl).b);
            if (!a2.u()) {
                final String y = b2.y;
                final StringBuilder sb = new StringBuilder("Field '");
                sb.append(y);
                sb.append("' is not supported");
                throw new IllegalArgumentException(sb.toString());
            }
            final aufk aufk = new aufk(aufl, a2);
            int i = aufk.b.d();
            final int c = aufk.b.c();
            if (c - i > 32) {
                return ~n;
            }
            final int b3 = aufk.b.b(b);
            while (i <= c) {
                final aufl a3 = aufk.a;
                final long h = aufk.b.h(((aufv)a3).a, i);
                final aueu b4 = ((aufv)a3).b;
                ((aufv)a3).a = h;
                ((Map<String, Boolean>)concurrentHashMap).put(aufk.e(b), Boolean.TRUE);
                ((Map<String, Boolean>)concurrentHashMap).put(aufk.e(b).toLowerCase(b), Boolean.TRUE);
                ((Map<String, Boolean>)concurrentHashMap).put(aufk.e(b).toUpperCase(b), Boolean.TRUE);
                ((Map<String, Boolean>)concurrentHashMap).put(aufk.f(b), Boolean.TRUE);
                ((Map<String, Boolean>)concurrentHashMap).put(aufk.f(b).toLowerCase(b), Boolean.TRUE);
                ((Map<String, Boolean>)concurrentHashMap).put(aufk.f(b).toUpperCase(b), Boolean.TRUE);
                ++i;
            }
            intValue = b3;
            if ("en".equals(b.getLanguage())) {
                intValue = b3;
                if (this.b == auey.b) {
                    ((Map<String, Boolean>)concurrentHashMap).put("BCE", Boolean.TRUE);
                    ((Map<String, Boolean>)concurrentHashMap).put("bce", Boolean.TRUE);
                    ((Map<String, Boolean>)concurrentHashMap).put("CE", Boolean.TRUE);
                    ((Map<String, Boolean>)concurrentHashMap).put("ce", Boolean.TRUE);
                    intValue = 3;
                }
            }
            ((Map)o).put(this.b, new Object[] { concurrentHashMap, intValue });
            o2 = concurrentHashMap;
        }
        else {
            o2 = array[0];
            intValue = (int)array[1];
        }
        for (int j = Math.min(charSequence.length(), n + intValue); j > n; --j) {
            final String string = charSequence.subSequence(n, j).toString();
            if (((Map)o2).containsKey(string)) {
                final auey b5 = this.b;
                final auig c2 = auii.c();
                c2.a = b5.a(auii.a);
                c2.b = 0;
                c2.c = string;
                c2.d = b;
                return j;
            }
        }
        return ~n;
    }
    
    public final void d(final Appendable appendable, final long n, final aueu aueu, final int n2, final aufc aufc, final Locale locale) {
        try {
            final auew a = this.b.a(aueu);
            String s;
            if (this.c) {
                s = a.l(n, locale);
            }
            else {
                s = a.n(n, locale);
            }
            appendable.append(s);
        }
        catch (final RuntimeException ex) {
            appendable.append('\ufffd');
        }
    }
}
