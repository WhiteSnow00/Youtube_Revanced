import java.util.Locale;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auir implements aujf, aujd
{
    private static final Map a;
    private final aufp b;
    private final boolean c;
    
    static {
        a = (Map)new ConcurrentHashMap();
    }
    
    public auir(final aufp b, final boolean c) {
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
    
    public final int c(final auiz auiz, final CharSequence charSequence, final int n) {
        final Locale b = auiz.b;
        final Map a = auir.a;
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
            final augc augc = new augc(auft.a);
            final aufp b2 = this.b;
            final aufn a2 = b2.a(augc.b);
            if (!a2.u()) {
                final String y = b2.y;
                final StringBuilder sb = new StringBuilder("Field '");
                sb.append(y);
                sb.append("' is not supported");
                throw new IllegalArgumentException(sb.toString());
            }
            final augb augb = new augb(augc, a2);
            int i = augb.b.d();
            final int c = augb.b.c();
            if (c - i > 32) {
                return ~n;
            }
            final int b3 = augb.b.b(b);
            while (i <= c) {
                final augc a3 = augb.a;
                final long h = augb.b.h(a3.a, i);
                final aufl b4 = a3.b;
                a3.a = h;
                ((Map<String, Boolean>)concurrentHashMap).put(augb.e(b), Boolean.TRUE);
                ((Map<String, Boolean>)concurrentHashMap).put(augb.e(b).toLowerCase(b), Boolean.TRUE);
                ((Map<String, Boolean>)concurrentHashMap).put(augb.e(b).toUpperCase(b), Boolean.TRUE);
                ((Map<String, Boolean>)concurrentHashMap).put(augb.f(b), Boolean.TRUE);
                ((Map<String, Boolean>)concurrentHashMap).put(augb.f(b).toLowerCase(b), Boolean.TRUE);
                ((Map<String, Boolean>)concurrentHashMap).put(augb.f(b).toUpperCase(b), Boolean.TRUE);
                ++i;
            }
            intValue = b3;
            if ("en".equals(b.getLanguage())) {
                intValue = b3;
                if (this.b == aufp.b) {
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
                final aufp b5 = this.b;
                final auix c2 = auiz.c();
                c2.a = b5.a(auiz.a);
                c2.b = 0;
                c2.c = string;
                c2.d = b;
                return j;
            }
        }
        return ~n;
    }
    
    public final void d(final Appendable appendable, final long n, final aufl aufl, final int n2, final auft auft, final Locale locale) {
        try {
            final aufn a = this.b.a(aufl);
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
