import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Locale;
import android.text.TextUtils;
import java.util.Arrays;
import android.os.Build$VERSION;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.WeakHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aewp
{
    public static final WeakHashMap a;
    public static final Deque b;
    public static final Deque c;
    public static final Object d;
    public static final Runnable e;
    public static int f;
    public static int g;
    public static aevk h;
    static final mtf i;
    private static final ThreadLocal j;
    
    static {
        final afkg a2 = afkg.a;
        i = new mtf("tiktok_systrace");
        a = new WeakHashMap();
        j = new aewm();
        b = new ArrayDeque();
        c = new ArrayDeque();
        d = new Object();
        e = aewl.b;
        aewp.g = 0;
    }
    
    public static aevk a() {
        return aewp.j.get().c;
    }
    
    static aevk b() {
        return aewp.c.peek();
    }
    
    static aevk c() {
        final aevk a = a();
        if (a != null) {
            return a;
        }
        return (aevk)new aeuj();
    }
    
    public static aevk d() {
        final aevk h = aewp.h;
        if (h != null) {
            aewp.h = null;
            return h;
        }
        return null;
    }
    
    public static aevk e(final aewo aewo, final aevk c) {
        final aevk c2 = aewo.c;
        if (c2 == c) {
            return c;
        }
        if (c2 == null) {
            boolean b;
            if (Build$VERSION.SDK_INT >= 29) {
                b = aewn.a();
            }
            else {
                b = qcz.w(aewp.i);
            }
            aewo.b = b;
        }
        if (aewo.b) {
            y(c2, c);
        }
        aewo.c = c;
        final agsk d = aewo.d;
        return c2;
    }
    
    public static aevl f() {
        t();
        return aeuu.d;
    }
    
    public static aewo g() {
        return aewp.j.get();
    }
    
    public static String h(aevk a) {
        int n = 0;
        int n2 = 0;
        int n3;
        aevk aevk;
        for (aevk a2 = a; a2 != null; a2 = aevk, n = n3) {
            n3 = n + 1;
            final int n4 = n2 + a2.b().length();
            aevk = (a2 = a2.a());
            n = n3;
            n2 = n4;
            if (aevk != null) {
                n2 = n4 + 4;
            }
        }
        if (n > 250) {
            int i = n - 1;
            final String[] array = new String[n];
            aevk a3 = a;
            while (i >= 0) {
                array[i] = a3.b();
                a3 = a3.a();
                --i;
            }
            final afgj h = afgm.h();
            final aflu k = afhk.q(array).k();
            int n5 = 0;
            while (((Iterator)k).hasNext()) {
                h.g(((Iterator)k).next(), n5);
                ++n5;
            }
            final afgm c = h.c();
            final afkc afkc = (afkc)c;
            final int d = afkc.d;
            final int n6 = n >> 2;
            aeve aeve = null;
            Label_1243: {
                if (d <= n6) {
                    final int n7 = n + 1;
                    final int[] array2 = new int[n7];
                    for (int j = 0; j < n; ++j) {
                        array2[j] = (int)c.get(array[j]);
                    }
                    array2[n] = afkc.d;
                    final aevf aevf = new aevf(array2);
                    int d2 = 0;
                    while (true) {
                        int n8 = -1;
                        if (d2 >= n7) {
                            break;
                        }
                        ++aevf.f;
                        final int n9 = aevf.a[d2];
                    Label_0305:
                        while (true) {
                            aevd aevd = null;
                            while (aevf.f > 0) {
                                if (aevf.e == 0) {
                                    final Map d3 = aevf.c.d;
                                    final Integer value = n9;
                                    if (!d3.containsKey(value)) {
                                        aevf.c.d.put(value, new aevd(d2, 1073741824));
                                        if (aevd != null) {
                                            aevd.c = aevf.c;
                                        }
                                        aevf.f += n8;
                                        aevf.a();
                                        continue Label_0305;
                                    }
                                    if (aevd != null) {
                                        aevd.c = aevf.c;
                                    }
                                    aevf.d = d2;
                                    ++aevf.e;
                                    aevf.b();
                                    break;
                                }
                                else {
                                    final int[] a4 = aevf.a;
                                    final int a5 = aevf.c.d.get(a4[aevf.d]).a;
                                    final int e = aevf.e;
                                    if (a4[a5 + e] == n9) {
                                        if (aevd != null) {
                                            aevd.c = aevf.c;
                                        }
                                        aevf.e = e + 1;
                                        aevf.b();
                                        break;
                                    }
                                    final aevd aevd2 = aevf.c.d.get(aevf.a[aevf.d]);
                                    final int a6 = aevd2.a;
                                    final aevd c2 = new aevd(a6, aevf.e + a6 + n8);
                                    aevf.c.d.put(aevf.a[aevf.d], c2);
                                    c2.d.put(aevf.a[c2.b + 1], aevd2);
                                    aevd2.a = c2.b + 1;
                                    if (aevd != null) {
                                        aevd.c = c2;
                                    }
                                    c2.d.put(n9, new aevd(d2, 1073741824));
                                    --aevf.f;
                                    aevf.a();
                                    aevd = c2;
                                    n8 = -1;
                                }
                            }
                            break;
                        }
                        ++d2;
                    }
                    final ArrayDeque<aevc> arrayDeque = new ArrayDeque<aevc>();
                    aevc aevc = new aevc(aevf.b, 0, -1, -1);
                    arrayDeque.push(aevc);
                    while (!arrayDeque.isEmpty()) {
                        final aevc aevc2 = arrayDeque.pop();
                        final Iterator iterator = ((aevd)aevc2.d).d.values().iterator();
                        aevc aevc3 = aevc;
                        while (true) {
                            aevc = aevc3;
                            if (!iterator.hasNext()) {
                                break;
                            }
                            final aevd aevd3 = (aevd)iterator.next();
                            aevc aevc4 = null;
                            Label_0993: {
                                Label_0965: {
                                    if (!aevf.c(aevc2.b, aevc2.c, aevd3.a, aevd3.b)) {
                                        if (aevd3.d.isEmpty()) {
                                            final int b = aevc2.b;
                                            final int c3 = aevc2.c;
                                            final int a7 = aevd3.a;
                                            if (aevf.c(b, c3, a7, a7 + c3 - b)) {
                                                break Label_0965;
                                            }
                                        }
                                        aevc4 = new aevc(aevd3, 1, aevd3.a, aevd3.b);
                                        break Label_0993;
                                    }
                                }
                                aevc4 = new aevc(aevd3, aevc2.a + 1, aevc2.b, aevc2.c);
                            }
                            aevc aevc5 = aevc3;
                            if (aevc3.a < aevc4.a) {
                                aevc5 = aevc4;
                            }
                            arrayDeque.push(aevc4);
                            aevc3 = aevc5;
                        }
                    }
                    final int min = Math.min(aevf.a.length, aevc.c + 1);
                    aevd b2 = aevf.b;
                    int n10 = 0;
                Label_1194:
                    while (true) {
                        final int[] a8 = aevf.a;
                        final int b3 = aevc.b;
                        final aevd aevd4 = b2.d.get(a8[b3 + n10 % (min - b3)]);
                        if (aevd4 == null) {
                            break;
                        }
                        int a9 = aevd4.a;
                        int n11 = n10;
                        while (true) {
                            b2 = aevd4;
                            n10 = n11;
                            if (a9 >= aevd4.b + 1) {
                                break;
                            }
                            final int[] a10 = aevf.a;
                            b2 = aevd4;
                            n10 = n11;
                            if (a9 >= a10.length) {
                                break;
                            }
                            final int b4 = aevc.b;
                            n10 = n11;
                            if (a10[b4 + n11 % (min - b4)] != a10[a9]) {
                                break Label_1194;
                            }
                            ++n11;
                            ++a9;
                        }
                    }
                    final int b5 = aevc.b;
                    aeve = new aeve(b5, min, n10 / (min - b5));
                    if (aeve.c * (aeve.b - aeve.a) >= n6) {
                        break Label_1243;
                    }
                }
                aeve = null;
            }
            String s = "";
            if (aeve != null) {
                final int b6 = aeve.b;
                final int a11 = aeve.a;
                final int c4 = aeve.c;
                String concat;
                if (a11 > 0) {
                    concat = String.valueOf(TextUtils.join((CharSequence)" -> ", (Object[])Arrays.copyOf(array, a11))).concat(" -> ");
                }
                else {
                    concat = "";
                }
                final int n12 = aeve.a + (b6 - a11) * c4;
                if (n12 < n) {
                    s = " -> ".concat(String.valueOf(TextUtils.join((CharSequence)" -> ", (Object[])Arrays.copyOfRange(array, n12, n))));
                }
                s = String.format(Locale.US, "%s{%s}x%d%s", concat, TextUtils.join((CharSequence)" -> ", (Object[])Arrays.copyOfRange(array, aeve.a, aeve.b)), aeve.c, s);
            }
            if (!s.isEmpty()) {
                return s;
            }
        }
        final char[] array3 = new char[n2];
        while (a != null) {
            final String b7 = a.b();
            final int n13 = n2 - b7.length();
            b7.getChars(0, b7.length(), array3, n13);
            final aevk aevk2 = a = a.a();
            n2 = n13;
            if (aevk2 != null) {
                n2 = n13 - 4;
                " -> ".getChars(0, 4, array3, n2);
                a = aevk2;
            }
        }
        return new String(array3);
    }
    
    public static Map i() {
        final HashMap hashMap = new HashMap();
        final WeakHashMap a = aewp.a;
        monitorenter(a);
        try {
            for (final Map.Entry<K, aewo> entry : a.entrySet()) {
                final aevk c = entry.getValue().c;
                if (c != null) {
                    hashMap.put(entry.getKey(), c);
                }
            }
            monitorexit(a);
            return hashMap;
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    static void j(final aevk aevk) {
        aevk.getClass();
        final aewo aewo = aewp.j.get();
        final aevk c = aewo.c;
        c.getClass();
        adme.Z(aevk == c, "Tried to end span %s, but that span is not the current span. The current span is %s.", aevk.b(), c.b());
        e(aewo, c.a());
    }
    
    public static void k() {
        final int f = aewp.f;
        if ((aewp.f = f - 1) >= 0) {
            if (aewp.g == f) {
                adme.U(aewp.c.isEmpty() ^ true, "current async trace should not be null");
                n(null);
                aewp.g = 0;
            }
            return;
        }
        throw new IllegalStateException("More calls to pause than to resume");
    }
    
    static boolean l(final aewo aewo, final aevk aevk) {
        final aeup aeup = (aeup)aevk;
        final Thread b = aeup.b;
        b.getClass();
        final agsk d = aewo.d;
        return ((aeup)aeup.a).b == b;
    }
    
    public static void m() {
        ++aewp.f;
        if (aewp.g == 0) {
            final aewo aewo = aewp.j.get();
            if (aewo.c == null) {
                final aevk b = b();
                if (b != null) {
                    e(aewo, b);
                    aewp.g = aewp.f;
                }
            }
        }
    }
    
    public static void n(final aevk aevk) {
        e(aewp.j.get(), aevk);
    }
    
    public static aeux o(final String s) {
        return p(s, aeva.a);
    }
    
    public static aeux p(final String s, final aevb aevb) {
        return q(s, aevb, true);
    }
    
    public static aeux q(final String s, final aevb aevb, final boolean b) {
        final aewo aewo = aewp.j.get();
        final aevk c = aewo.c;
        Object o;
        if (c == null) {
            o = new aeuk(s, aevb, b);
        }
        else if (c instanceof aetz) {
            o = ((aetz)c).e(s, aevb, b);
        }
        else {
            o = c.h(s, aevb, aewo);
        }
        e(aewo, (aevk)o);
        return new aeux((aevk)o);
    }
    
    public static boolean r() {
        return a() != null;
    }
    
    public static aevl s() {
        final aewo aewo = aewp.j.get();
        if (!aewo.a) {
            return aeuu.e;
        }
        Object c;
        if ((c = aewo.c) == null) {
            c = new aeuj();
        }
        aewp.b.add(c);
        qem.t(aewp.e);
        return aeuu.f;
    }
    
    public static void t() {
        ++aewp.f;
        if (aewp.g == 0) {
            final aewo aewo = aewp.j.get();
            if (aewo.c == null) {
                final aevk b = b();
                if (b != null) {
                    e(aewo, b);
                    aewp.g = aewp.f;
                }
            }
        }
    }
    
    public static boolean u() {
        final aevk b = b();
        if (b != null && !(b instanceof aetz)) {
            m();
            return true;
        }
        return false;
    }
    
    private static void v(final String s) {
        if (s.length() > 127) {
            s.substring(0, 127);
        }
    }
    
    private static void w(final aevk aevk) {
        if (aevk.a() != null) {
            w(aevk.a());
        }
        v(aevk.b());
    }
    
    private static void x(final aevk aevk) {
        if (aevk.a() != null) {
            x(aevk.a());
        }
    }
    
    private static void y(final aevk aevk, final aevk aevk2) {
        if (aevk != null) {
            if (aevk2 != null) {
                if (aevk.a() == aevk2) {
                    return;
                }
                if (aevk == aevk2.a()) {
                    v(aevk2.b());
                    return;
                }
            }
            x(aevk);
        }
        if (aevk2 != null) {
            w(aevk2);
        }
    }
}
