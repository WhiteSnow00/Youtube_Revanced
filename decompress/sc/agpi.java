import java.lang.reflect.Array;
import android.os.Bundle;
import java.util.Locale;
import java.util.Set;
import java.io.Serializable;
import java.util.RandomAccess;
import java.util.List;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Map;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agpi
{
    public static volatile arwo a;
    public static volatile arwo b;
    public static volatile arwo c;
    public static volatile arwo d;
    public static volatile arwo e;
    public static volatile arwo f;
    public static volatile arwo g;
    
    private agpi() {
    }
    
    public static void A(final Object o, final int n) {
        if (o != null) {
            return;
        }
        final StringBuilder sb = new StringBuilder("at index ");
        sb.append(n);
        throw new NullPointerException(sb.toString());
    }
    
    public static void B(final Object... array) {
        C(array, array.length);
    }
    
    public static void C(final Object[] array, final int n) {
        for (int i = 0; i < n; ++i) {
            A(array[i], i);
        }
    }
    
    public static void D(final Iterable iterable, final Object[] array) {
        final Iterator iterator = iterable.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            array[n] = iterator.next();
            ++n;
        }
    }
    
    public static boolean E(final afhr afhr, final Object o) {
        if (o == afhr) {
            return true;
        }
        if (o instanceof afhr) {
            final afhr afhr2 = (afhr)o;
            if (afhr.size() == afhr2.size()) {
                if (afhr.j().size() == afhr2.j().size()) {
                    for (final afhs afhs : afhr2.j()) {
                        if (afhr.b(afhs.a) != afhs.a()) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }
    
    public static int F(final int n) {
        if (n < 3) {
            aefb.J(n, "expectedSize");
            return n + 1;
        }
        if (n < 1073741824) {
            final double n2 = n;
            Double.isNaN(n2);
            return (int)Math.ceil(n2 / 0.75);
        }
        return Integer.MAX_VALUE;
    }
    
    public static afev G(final Map map) {
        final Iterator iterator = map.entrySet().iterator();
        if (!iterator.hasNext()) {
            return afim.b;
        }
        final Map.Entry<Enum, V> entry = (Map.Entry<Enum, V>)iterator.next();
        final Enum enum1 = entry.getKey();
        final V value = entry.getValue();
        aefb.H((Object)enum1, (Object)value);
        final EnumMap enumMap = new EnumMap<Enum, Object>(enum1.getDeclaringClass());
        enumMap.put(enum1, value);
        while (iterator.hasNext()) {
            final Map.Entry<Enum, V> entry2 = (Map.Entry<Enum, V>)iterator.next();
            final Enum enum2 = entry2.getKey();
            final V value2 = entry2.getValue();
            aefb.H((Object)enum2, (Object)value2);
            enumMap.put(enum2, value2);
        }
        final int size = enumMap.size();
        Object o;
        if (size != 0) {
            if (size != 1) {
                o = new afek(enumMap);
            }
            else {
                final Map.Entry entry3 = (Map.Entry)agpc.W(enumMap.entrySet());
                o = afev.m(entry3.getKey(), entry3.getValue());
            }
        }
        else {
            o = afim.b;
        }
        return (afev)o;
    }
    
    public static Object H(final Map map, final Object o) {
        map.getClass();
        try {
            return map.get(o);
        }
        catch (final ClassCastException | NullPointerException ex) {
            return null;
        }
    }
    
    public static HashMap I(final int n) {
        return new HashMap(F(n));
    }
    
    public static Iterator J(final Iterator iterator) {
        return (Iterator)new afha(iterator);
    }
    
    public static Map.Entry K(final Object o, final Object o2) {
        return (Map.Entry)new afei(o, o2);
    }
    
    public static Map.Entry L(final Map.Entry entry) {
        entry.getClass();
        return (Map.Entry)new afhb(entry);
    }
    
    public static Map M(final Map map, final aezf aezf) {
        aezf.getClass();
        return (Map)new afhi(map, new afhd(aezf));
    }
    
    public static boolean N(final Map map, final Object o) {
        return map == o || (o instanceof Map && map.entrySet().equals(((Map)o).entrySet()));
    }
    
    public static ArrayList O() {
        return new ArrayList();
    }
    
    public static ArrayList P(final Iterable iterable) {
        iterable.getClass();
        ArrayList q;
        if (iterable instanceof Collection) {
            q = new ArrayList((Collection<?>)iterable);
        }
        else {
            q = Q(iterable.iterator());
        }
        return q;
    }
    
    public static ArrayList Q(final Iterator iterator) {
        final ArrayList o = O();
        agpc.M(o, iterator);
        return o;
    }
    
    @SafeVarargs
    public static ArrayList R(final Object... array) {
        array.getClass();
        final int length = array.length;
        aefb.J(length, "arraySize");
        final ArrayList list = new ArrayList<Object>(afwm.G(length + 5L + length / 10));
        Collections.addAll((Collection<? super Object>)list, array);
        return list;
    }
    
    public static ArrayList S(final int n) {
        aefb.J(n, "initialArraySize");
        return new ArrayList(n);
    }
    
    public static List T(final List list) {
        if (list instanceof afeq) {
            return (List)((afeq)list).a();
        }
        if (list instanceof afgt) {
            return ((afgt)list).a;
        }
        if (list instanceof RandomAccess) {
            return (List)new afgr(list);
        }
        return new afgt(list);
    }
    
    public static List U(final List list, final aezf aezf) {
        Serializable s;
        if (list instanceof RandomAccess) {
            s = new afgv(list, aezf);
        }
        else {
            s = new afgx(list, aezf);
        }
        return (List)s;
    }
    
    public static boolean V(final List list, final Object o) {
        if (o == list) {
            return true;
        }
        if (!(o instanceof List)) {
            return false;
        }
        final List list2 = (List)o;
        final int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (list2 instanceof RandomAccess) {
            for (int i = 0; i < size; ++i) {
                if (!adkp.ae(list.get(i), list2.get(i))) {
                    return false;
                }
            }
            return true;
        }
        final Iterator iterator = list.iterator();
        final Iterator iterator2 = list2.iterator();
        while (iterator.hasNext()) {
            if (iterator2.hasNext()) {
                if (adkp.ae(iterator.next(), iterator2.next())) {
                    continue;
                }
            }
            return false;
        }
        if (!iterator2.hasNext()) {
            return true;
        }
        return false;
    }
    
    public static final aerk W(final Set set, final long n, final aezp aezp) {
        return new aerk(set, n, aezp);
    }
    
    public static final void X(final Collection collection, final Set set) {
        set.addAll(collection);
    }
    
    public static aeqe Y(final aezp aezp, aeqe aeqe) {
        if (aezp.h()) {
            aeqe = new aeqe(aezp);
        }
        else {
            aeqe.getClass();
        }
        return aeqe;
    }
    
    public static Locale Z(final br br) {
        final Bundle m = br.m;
        if (m == null) {
            return null;
        }
        return (Locale)m.getSerializable("com.google.apps.tiktok.inject.peer.EXTRA_LOCALE");
    }
    
    public static int a(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static void aa(final Throwable t, final Throwable t2) {
        try {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(t, t2);
        }
        catch (final Exception ex) {}
    }
    
    public static int b(final int n) {
        return n - 2;
    }
    
    public static int c(final int n) {
        if (n == 0) {
            return 2;
        }
        if (n == 1) {
            return 3;
        }
        if (n == 2) {
            return 4;
        }
        if (n == 3) {
            return 5;
        }
        if (n != 4) {
            return 0;
        }
        return 6;
    }
    
    public static int d(final int n) {
        if (n == 0) {
            return 2;
        }
        if (n == 1) {
            return 3;
        }
        if (n != 2) {
            return 0;
        }
        return 4;
    }
    
    public static int e(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n == 3) {
            return 4;
        }
        if (n != 4) {
            return 0;
        }
        return 5;
    }
    
    public static int f(final int n) {
        switch (n) {
            default: {
                switch (n) {
                    default: {
                        return 0;
                    }
                    case 56: {
                        return 57;
                    }
                    case 55: {
                        return 56;
                    }
                    case 54: {
                        return 55;
                    }
                    case 53: {
                        return 54;
                    }
                    case 52: {
                        return 53;
                    }
                    case 51: {
                        return 52;
                    }
                }
                break;
            }
            case 42: {
                return 43;
            }
            case 41: {
                return 42;
            }
            case 40: {
                return 41;
            }
            case 39: {
                return 40;
            }
            case 38: {
                return 39;
            }
            case 37: {
                return 38;
            }
            case 36: {
                return 37;
            }
            case 35: {
                return 36;
            }
            case 34: {
                return 35;
            }
            case 33: {
                return 34;
            }
            case 32: {
                return 33;
            }
            case 31: {
                return 32;
            }
            case 30: {
                return 31;
            }
            case 29: {
                return 30;
            }
            case 28: {
                return 29;
            }
            case 27: {
                return 28;
            }
            case 26: {
                return 27;
            }
            case 25: {
                return 26;
            }
            case 24: {
                return 25;
            }
            case 23: {
                return 24;
            }
            case 22: {
                return 23;
            }
            case 21: {
                return 22;
            }
            case 20: {
                return 21;
            }
            case 19: {
                return 20;
            }
            case 18: {
                return 19;
            }
            case 17: {
                return 18;
            }
            case 16: {
                return 17;
            }
            case 15: {
                return 16;
            }
            case 14: {
                return 15;
            }
            case 13: {
                return 14;
            }
            case 12: {
                return 13;
            }
            case 11: {
                return 12;
            }
            case 10: {
                return 11;
            }
            case 9: {
                return 10;
            }
            case 8: {
                return 9;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int g(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 14: {
                return 15;
            }
            case 13: {
                return 14;
            }
            case 12: {
                return 13;
            }
            case 11: {
                return 12;
            }
            case 10: {
                return 11;
            }
            case 9: {
                return 10;
            }
            case 8: {
                return 9;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static void h(final long n, final String s) {
        if (n >= 0L) {
            return;
        }
        throw new IllegalArgumentException(s);
    }
    
    public static boolean i(final double n, final int n2, final int n3) {
        return n >= n2 && n < n3;
    }
    
    public static int j(final String s, int n) {
        while (n < s.length() && s.charAt(n) != '-') {
            ++n;
        }
        return n;
    }
    
    public static int k(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static String l(final int n) {
        return Integer.toString(n - 1);
    }
    
    public static void m(final int n) {
        if (n != 0) {
            return;
        }
        throw null;
    }
    
    public static int n(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int o(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int p(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 4) {
            return 0;
        }
        return 5;
    }
    
    public static String q(final int n) {
        return Integer.toString(n - 1);
    }
    
    public static void r(final int n) {
        if (n != 0) {
            return;
        }
        throw null;
    }
    
    public static int s(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static String t(final int n) {
        return Integer.toString(n - 1);
    }
    
    public static void u(final int n) {
        if (n != 0) {
            return;
        }
        throw null;
    }
    
    public static int v(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static String w(final int n) {
        return Integer.toString(n - 1);
    }
    
    public static void x(final int n) {
        if (n != 0) {
            return;
        }
        throw null;
    }
    
    public static int y(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static Object[] z(final Class clazz, final int n) {
        return (Object[])Array.newInstance(clazz, n);
    }
}
