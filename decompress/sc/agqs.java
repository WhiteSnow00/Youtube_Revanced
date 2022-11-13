import java.util.ArrayDeque;
import android.util.StatsEvent$Builder;
import android.util.StatsLog;
import android.util.StatsEvent;
import java.util.Arrays;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import com.google.protobuf.ExtensionRegistryLite;
import android.os.Bundle;
import android.content.Context;
import android.app.Service;
import java.lang.reflect.Array;
import java.io.ObjectOutputStream;
import java.util.IdentityHashMap;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agqs
{
    public static volatile arwo a;
    public static volatile arwo b;
    public static volatile arwo c;
    
    public static int A(final ahdo ahdo, final byte[] array, int t, final int n, final int n2, final agzp agzp) {
        final Object e = ahdo.e();
        t = T(e, ahdo, array, t, n, n2, agzp);
        ahdo.f(e);
        agzp.c = e;
        return t;
    }
    
    public static int B(final ahdo ahdo, final byte[] array, int u, final int n, final agzp agzp) {
        final Object e = ahdo.e();
        u = U(e, ahdo, array, u, n, agzp);
        ahdo.f(e);
        agzp.c = e;
        return u;
    }
    
    public static int C(final ahdo ahdo, final int n, final byte[] array, int i, final int n2, final ahbx ahbx, final agzp agzp) {
        i = B(ahdo, array, i, n2, agzp);
        ahbx.add(agzp.c);
        while (i < n2) {
            final int p7 = P(array, i, agzp);
            if (n != agzp.a) {
                break;
            }
            i = B(ahdo, array, p7, n2, agzp);
            ahbx.add(agzp.c);
        }
        return i;
    }
    
    public static int D(final byte[] array, int i, final ahbx ahbx, final agzp agzp) {
        final agzs agzs = (agzs)ahbx;
        i = P(array, i, agzp);
        final int n = agzp.a + i;
        while (i < n) {
            i = S(array, i, agzp);
            agzs.f(agzp.b != 0L);
        }
        if (i == n) {
            return i;
        }
        throw ahca.j();
    }
    
    public static int E(final byte[] array, int i, final ahbx ahbx, final agzp agzp) {
        final aham aham = (aham)ahbx;
        int n;
        for (i = P(array, i, agzp), n = agzp.a + i; i < n; i += 8) {
            aham.f(w(array, i));
        }
        if (i == n) {
            return i;
        }
        throw ahca.j();
    }
    
    public static int F(final byte[] array, int i, final ahbx ahbx, final agzp agzp) {
        final ahbi ahbi = (ahbi)ahbx;
        int n;
        for (i = P(array, i, agzp), n = agzp.a + i; i < n; i += 4) {
            ahbi.g(z(array, i));
        }
        if (i == n) {
            return i;
        }
        throw ahca.j();
    }
    
    public static int G(final byte[] array, int i, final ahbx ahbx, final agzp agzp) {
        final ahcm ahcm = (ahcm)ahbx;
        int n;
        for (i = P(array, i, agzp), n = agzp.a + i; i < n; i += 8) {
            ahcm.f(W(array, i));
        }
        if (i == n) {
            return i;
        }
        throw ahca.j();
    }
    
    public static int H(final byte[] array, int i, final ahbx ahbx, final agzp agzp) {
        final ahax ahax = (ahax)ahbx;
        int n;
        for (i = P(array, i, agzp), n = agzp.a + i; i < n; i += 4) {
            ahax.h(x(array, i));
        }
        if (i == n) {
            return i;
        }
        throw ahca.j();
    }
    
    public static int I(final byte[] array, int i, final ahbx ahbx, final agzp agzp) {
        final ahbi ahbi = (ahbi)ahbx;
        i = P(array, i, agzp);
        final int n = agzp.a + i;
        while (i < n) {
            i = P(array, i, agzp);
            ahbi.g(ahag.J(agzp.a));
        }
        if (i == n) {
            return i;
        }
        throw ahca.j();
    }
    
    public static int J(final byte[] array, int i, final ahbx ahbx, final agzp agzp) {
        final ahcm ahcm = (ahcm)ahbx;
        i = P(array, i, agzp);
        final int n = agzp.a + i;
        while (i < n) {
            i = S(array, i, agzp);
            ahcm.f(ahag.L(agzp.b));
        }
        if (i == n) {
            return i;
        }
        throw ahca.j();
    }
    
    public static int K(final byte[] array, int i, final ahbx ahbx, final agzp agzp) {
        final ahbi ahbi = (ahbi)ahbx;
        i = P(array, i, agzp);
        final int n = agzp.a + i;
        while (i < n) {
            i = P(array, i, agzp);
            ahbi.g(agzp.a);
        }
        if (i == n) {
            return i;
        }
        throw ahca.j();
    }
    
    public static int L(final byte[] array, int i, final ahbx ahbx, final agzp agzp) {
        final ahcm ahcm = (ahcm)ahbx;
        i = P(array, i, agzp);
        final int n = agzp.a + i;
        while (i < n) {
            i = S(array, i, agzp);
            ahcm.f(agzp.b);
        }
        if (i == n) {
            return i;
        }
        throw ahca.j();
    }
    
    public static int M(final byte[] array, int p3, final agzp agzp) {
        p3 = P(array, p3, agzp);
        final int a = agzp.a;
        if (a < 0) {
            throw ahca.f();
        }
        if (a == 0) {
            agzp.c = "";
            return p3;
        }
        agzp.c = new String(array, p3, a, ahby.a);
        return p3 + a;
    }
    
    public static int N(final byte[] array, int p3, final agzp agzp) {
        p3 = P(array, p3, agzp);
        final int a = agzp.a;
        if (a < 0) {
            throw ahca.f();
        }
        if (a == 0) {
            agzp.c = "";
            return p3;
        }
        agzp.c = ahej.g(array, p3, a);
        return p3 + a;
    }
    
    public static int O(final int n, final byte[] array, int n2, int p6, final ahea ahea, final agzp agzp) {
        if (ahem.a(n) == 0) {
            throw ahca.c();
        }
        final int b = ahem.b(n);
        if (b == 0) {
            n2 = S(array, n2, agzp);
            ahea.g(n, (Object)agzp.b);
            return n2;
        }
        if (b == 1) {
            ahea.g(n, (Object)W(array, n2));
            return n2 + 8;
        }
        if (b != 2) {
            if (b != 3) {
                if (b == 5) {
                    ahea.g(n, (Object)z(array, n2));
                    return n2 + 4;
                }
                throw ahca.c();
            }
            else {
                final int n3 = (n & 0xFFFFFFF8) | 0x4;
                final ahea c = ahea.c();
                int a = 0;
                int n4;
                int n5;
                while (true) {
                    n4 = a;
                    n5 = n2;
                    if (n2 >= p6) {
                        break;
                    }
                    final int p7 = P(array, n2, agzp);
                    a = agzp.a;
                    if ((n2 = a) == n3) {
                        n5 = p7;
                        n4 = n2;
                        break;
                    }
                    n2 = O(n2, array, p7, p6, c, agzp);
                }
                if (n5 <= p6 && n4 == n3) {
                    ahea.g(n, (Object)c);
                    return n5;
                }
                throw ahca.g();
            }
        }
        else {
            p6 = P(array, n2, agzp);
            n2 = agzp.a;
            if (n2 < 0) {
                throw ahca.f();
            }
            if (n2 <= array.length - p6) {
                if (n2 == 0) {
                    ahea.g(n, (Object)ahab.b);
                }
                else {
                    ahea.g(n, (Object)ahab.z(array, p6, n2));
                }
                return p6 + n2;
            }
            throw ahca.j();
        }
    }
    
    public static int P(final byte[] array, int a, final agzp agzp) {
        final int n = a + 1;
        a = array[a];
        if (a >= 0) {
            agzp.a = a;
            return n;
        }
        return Q(a, array, n, agzp);
    }
    
    public static int Q(int n, final byte[] array, int n2, final agzp agzp) {
        final byte b = array[n2];
        ++n2;
        n &= 0x7F;
        if (b >= 0) {
            agzp.a = (n | b << 7);
            return n2;
        }
        final int n3 = n | (b & 0x7F) << 7;
        n = n2 + 1;
        n2 = array[n2];
        if (n2 >= 0) {
            agzp.a = (n3 | n2 << 14);
            return n;
        }
        final int n4 = n3 | (n2 & 0x7F) << 14;
        n2 = n + 1;
        n = array[n];
        if (n >= 0) {
            agzp.a = (n4 | n << 21);
            return n2;
        }
        final int n5 = n4 | (n & 0x7F) << 21;
        n = n2 + 1;
        final byte b2 = array[n2];
        if (b2 >= 0) {
            agzp.a = (n5 | b2 << 28);
            return n;
        }
        while (true) {
            n2 = n + 1;
            if (array[n] >= 0) {
                break;
            }
            n = n2;
        }
        agzp.a = (n5 | (b2 & 0x7F) << 28);
        return n2;
    }
    
    public static int R(final int n, final byte[] array, int i, final int n2, final ahbx ahbx, final agzp agzp) {
        final ahbi ahbi = (ahbi)ahbx;
        i = P(array, i, agzp);
        ahbi.g(agzp.a);
        while (i < n2) {
            final int p6 = P(array, i, agzp);
            if (n != agzp.a) {
                break;
            }
            i = P(array, p6, agzp);
            ahbi.g(agzp.a);
        }
        return i;
    }
    
    public static int S(final byte[] array, int n, final agzp agzp) {
        final long b = array[n];
        ++n;
        if (b >= 0L) {
            agzp.b = b;
            return n;
        }
        int n2;
        byte b2;
        long b3;
        for (n2 = n + 1, b2 = array[n], b3 = ((b & 0x7FL) | (long)(b2 & 0x7F) << 7), n = 7; b2 < 0; b2 = array[n2], n += 7, b3 |= (long)(b2 & 0x7F) << n, ++n2) {}
        agzp.b = b3;
        return n2;
    }
    
    public static int T(final Object c, final ahdo ahdo, final byte[] array, int c2, final int n, final int n2, final agzp agzp) {
        c2 = ((ahcy)ahdo).c(c, array, c2, n, n2, agzp);
        agzp.c = c;
        return c2;
    }
    
    public static int U(final Object c, final ahdo ahdo, final byte[] array, int q, int n, final agzp agzp) {
        final int n2 = q + 1;
        final byte b = array[q];
        q = n2;
        int a = b;
        if (b < 0) {
            q = Q(b, array, n2, agzp);
            a = agzp.a;
        }
        if (a >= 0 && a <= n - q) {
            n = a + q;
            ahdo.i(c, array, q, n, agzp);
            agzp.c = c;
            return n;
        }
        throw ahca.j();
    }
    
    public static int V(int n, final byte[] array, int n2, final int n3, final agzp agzp) {
        if (ahem.a(n) == 0) {
            throw ahca.c();
        }
        final int b = ahem.b(n);
        if (b == 0) {
            return S(array, n2, agzp);
        }
        if (b == 1) {
            return n2 + 8;
        }
        if (b == 2) {
            return P(array, n2, agzp) + agzp.a;
        }
        if (b != 3) {
            if (b == 5) {
                return n2 + 4;
            }
            throw ahca.c();
        }
        else {
            final int n4 = (n & 0xFFFFFFF8) | 0x4;
            n = 0;
            int a;
            int n5;
            while (true) {
                a = n;
                n5 = n2;
                if (n2 >= n3) {
                    break;
                }
                n2 = P(array, n2, agzp);
                n = (a = agzp.a);
                n5 = n2;
                if (n == n4) {
                    break;
                }
                n2 = V(n, array, n2, n3, agzp);
            }
            if (n5 <= n3 && a == n4) {
                return n5;
            }
            throw ahca.g();
        }
    }
    
    public static long W(final byte[] array, final int n) {
        return ((long)array[n] & 0xFFL) | ((long)array[n + 1] & 0xFFL) << 8 | ((long)array[n + 2] & 0xFFL) << 16 | ((long)array[n + 3] & 0xFFL) << 24 | ((long)array[n + 4] & 0xFFL) << 32 | ((long)array[n + 5] & 0xFFL) << 40 | ((long)array[n + 6] & 0xFFL) << 48 | ((long)array[n + 7] & 0xFFL) << 56;
    }
    
    public static int X(final String s) {
        int i = 0;
        int n = 0;
        while (i < s.length()) {
            n = n * 31 + s.charAt(i);
            ++i;
        }
        return n;
    }
    
    public static void Y(final agnj agnj, final Map.Entry entry) {
        final ahbe ahbe = entry.getKey();
        if (ahbe.d) {
            final ahek a = ahek.a;
            switch (ahbe.c.ordinal()) {
                case 17: {
                    ahdp.T(ahbe.b, (List)entry.getValue(), agnj, ahbe.e);
                    return;
                }
                case 16: {
                    ahdp.S(ahbe.b, (List)entry.getValue(), agnj, ahbe.e);
                    return;
                }
                case 15: {
                    ahdp.R(ahbe.b, (List)entry.getValue(), agnj, ahbe.e);
                    return;
                }
                case 14: {
                    ahdp.Q(ahbe.b, (List)entry.getValue(), agnj, ahbe.e);
                    return;
                }
                case 13: {
                    ahdp.N(ahbe.b, (List)entry.getValue(), agnj, ahbe.e);
                    return;
                }
                case 12: {
                    ahdp.V(ahbe.b, (List)entry.getValue(), agnj, ahbe.e);
                    return;
                }
                case 11: {
                    ahdp.G(ahbe.b, (List)entry.getValue(), agnj);
                    return;
                }
                case 10: {
                    final List list = (List)entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        ahdp.P(ahbe.b, (List)entry.getValue(), agnj, ahdg.a.a((Class)list.get(0).getClass()));
                        return;
                    }
                    break;
                }
                case 9: {
                    final List list2 = (List)entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        ahdp.M(ahbe.b, (List)entry.getValue(), agnj, ahdg.a.a((Class)list2.get(0).getClass()));
                        return;
                    }
                    break;
                }
                case 8: {
                    ahdp.U(ahbe.b, (List)entry.getValue(), agnj);
                    return;
                }
                case 7: {
                    ahdp.F(ahbe.b, (List)entry.getValue(), agnj, ahbe.e);
                    return;
                }
                case 6: {
                    ahdp.J(ahbe.b, (List)entry.getValue(), agnj, ahbe.e);
                    return;
                }
                case 5: {
                    ahdp.K(ahbe.b, (List)entry.getValue(), agnj, ahbe.e);
                    return;
                }
                case 4: {
                    ahdp.N(ahbe.b, (List)entry.getValue(), agnj, ahbe.e);
                    return;
                }
                case 3: {
                    ahdp.W(ahbe.b, (List)entry.getValue(), agnj, ahbe.e);
                    return;
                }
                case 2: {
                    ahdp.O(ahbe.b, (List)entry.getValue(), agnj, ahbe.e);
                    return;
                }
                case 1: {
                    ahdp.L(ahbe.b, (List)entry.getValue(), agnj, ahbe.e);
                    return;
                }
                case 0: {
                    ahdp.H(ahbe.b, (List)entry.getValue(), agnj, ahbe.e);
                }
            }
        }
        else {
            final ahek a2 = ahek.a;
            switch (ahbe.c.ordinal()) {
                case 17: {
                    agnj.r(ahbe.b, (long)entry.getValue());
                    return;
                }
                case 16: {
                    agnj.q(ahbe.b, (int)entry.getValue());
                    return;
                }
                case 15: {
                    agnj.p(ahbe.b, (long)entry.getValue());
                    return;
                }
                case 14: {
                    agnj.o(ahbe.b, (int)entry.getValue());
                    return;
                }
                case 13: {
                    agnj.k(ahbe.b, (int)entry.getValue());
                    return;
                }
                case 12: {
                    agnj.t(ahbe.b, (int)entry.getValue());
                    return;
                }
                case 11: {
                    agnj.d(ahbe.b, (ahab)entry.getValue());
                    return;
                }
                case 10: {
                    agnj.m(ahbe.b, entry.getValue(), ahdg.a.a((Class)entry.getValue().getClass()));
                    return;
                }
                case 9: {
                    agnj.j(ahbe.b, entry.getValue(), ahdg.a.a((Class)entry.getValue().getClass()));
                    return;
                }
                case 8: {
                    agnj.s(ahbe.b, (String)entry.getValue());
                    return;
                }
                case 7: {
                    agnj.c(ahbe.b, (boolean)entry.getValue());
                    return;
                }
                case 6: {
                    agnj.g(ahbe.b, (int)entry.getValue());
                    return;
                }
                case 5: {
                    agnj.h(ahbe.b, (long)entry.getValue());
                    return;
                }
                case 4: {
                    agnj.k(ahbe.b, (int)entry.getValue());
                    return;
                }
                case 3: {
                    agnj.u(ahbe.b, (long)entry.getValue());
                    return;
                }
                case 2: {
                    agnj.l(ahbe.b, (long)entry.getValue());
                    return;
                }
                case 1: {
                    agnj.i(ahbe.b, (float)entry.getValue());
                    return;
                }
                case 0: {
                    agnj.e(ahbe.b, (double)entry.getValue());
                    break;
                }
            }
        }
    }
    
    public static boolean Z(final Comparator comparator, final Iterable iterable) {
        comparator.getClass();
        iterable.getClass();
        Object o;
        if (iterable instanceof SortedSet) {
            if ((o = ((SortedSet)iterable).comparator()) == null) {
                o = afhw.a;
            }
        }
        else {
            if (!(iterable instanceof afjh)) {
                return false;
            }
            o = ((afjh)iterable).comparator();
        }
        return comparator.equals(o);
    }
    
    public static int a(final int n) {
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
    
    public static int aa(final Set set) {
        final Iterator iterator = set.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Object next = iterator.next();
            int hashCode;
            if (next != null) {
                hashCode = next.hashCode();
            }
            else {
                hashCode = 0;
            }
            n += hashCode;
        }
        return n;
    }
    
    public static afjf ab(final Set set, final Set set2) {
        set.getClass();
        set2.getClass();
        return (afjf)new afiz(set, set2);
    }
    
    public static afjf ac(final Set set, final Set set2) {
        set.getClass();
        set2.getClass();
        return (afjf)new afix(set, set2);
    }
    
    public static HashSet ad() {
        return new HashSet();
    }
    
    public static HashSet ae(final Iterable iterable) {
        HashSet ad;
        if (iterable instanceof Collection) {
            ad = new HashSet((Collection<? extends E>)iterable);
        }
        else {
            final Iterator<Object> iterator = iterable.iterator();
            ad = ad();
            agpc.M(ad, iterator);
        }
        return ad;
    }
    
    public static HashSet af(final Object... array) {
        final HashSet ag = ag(array.length);
        Collections.addAll(ag, array);
        return ag;
    }
    
    public static HashSet ag(final int n) {
        return new HashSet(agpi.F(n));
    }
    
    public static Set ah(final Set set, aezs aezs) {
        if (set instanceof SortedSet) {
            final SortedSet set2 = (SortedSet)set;
            afjd afjd;
            if (set2 instanceof afjc) {
                final afjc afjc = (afjc)set2;
                aezs = adyf.F(afjc.b, aezs);
                afjd = new afjd((SortedSet)afjc.a, aezs);
            }
            else {
                set2.getClass();
                aezs.getClass();
                afjd = new afjd(set2, aezs);
            }
            return afjd;
        }
        if (set instanceof afjc) {
            final afjc afjc2 = (afjc)set;
            aezs = adyf.F(afjc2.b, aezs);
            return (Set)new afjc((Set)afjc2.a, aezs);
        }
        set.getClass();
        aezs.getClass();
        return (Set)new afjc(set, aezs);
    }
    
    public static Set ai() {
        return Collections.newSetFromMap((Map<Object, Boolean>)new ConcurrentHashMap());
    }
    
    public static Set aj() {
        return Collections.newSetFromMap(new IdentityHashMap<Object, Boolean>());
    }
    
    public static boolean ak(final Set set, final Object o) {
        if (set == o) {
            return true;
        }
        if (!(o instanceof Set)) {
            return false;
        }
        final Set set2 = (Set)o;
        try {
            if (set.size() == set2.size() && set.containsAll(set2)) {
                return true;
            }
            return false;
        }
        catch (final NullPointerException | ClassCastException ex) {
            return false;
        }
    }
    
    public static boolean al(final Set set, final Collection collection) {
        collection.getClass();
        Object i = collection;
        if (collection instanceof afhr) {
            i = ((afhr)collection).i();
        }
        if (i instanceof Set && ((Collection)i).size() > set.size()) {
            return agpc.O(set.iterator(), (Collection)i);
        }
        return am(set, ((Collection)i).iterator());
    }
    
    public static boolean am(final Set set, final Iterator iterator) {
        boolean b = false;
        while (iterator.hasNext()) {
            b |= set.remove(iterator.next());
        }
        return b;
    }
    
    public static void an(final afhl afhl, final ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(afhl.v().size());
        for (final Map.Entry<Object, V> entry : afhl.v().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection)entry.getValue()).size());
            final Iterator iterator2 = ((Collection)entry.getValue()).iterator();
            while (iterator2.hasNext()) {
                objectOutputStream.writeObject(iterator2.next());
            }
        }
    }
    
    public static Object[] ao(final Object[] array, final int n) {
        return (Object[])Array.newInstance(array.getClass().getComponentType(), n);
    }
    
    public static aett ap(final Service service, final String s) {
        qdt.h();
        return (aett)((aetd)agpc.am((Context)service, aetd.class)).bF().a(s);
    }
    
    public static Bundle aq(final br br) {
        Bundle m;
        if ((m = br.m) == null) {
            m = new Bundle();
        }
        return m;
    }
    
    public static void ar(final Throwable t, final Throwable t2) {
        try {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(t, t2);
        }
        catch (final Exception ex) {}
    }
    
    public static agqs as() {
        return new agqs();
    }
    
    public static adet at(final Class clazz, final String s) {
        try {
            return new adet(clazz.getDeclaredField(s));
        }
        catch (final NoSuchFieldException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    public static Object au(Object o, final ahdj ahdj, Object o2, final ExtensionRegistryLite extensionRegistryLite, final ahau ahau, Object x, final adyf adyf) {
        final ahbf ahbf = (ahbf)o2;
        final int a = ahbf.a();
        final ahbe d = ahbf.d;
        if (d.d && d.e) {
            final ahek a2 = ahek.a;
            ArrayList list = null;
            switch (ahbf.b().ordinal()) {
                default: {
                    throw new IllegalStateException("Type cannot be packed: ".concat(String.valueOf(String.valueOf(ahbf.d.c))));
                }
                case 17: {
                    list = new ArrayList();
                    ahdj.J((List)list);
                    break;
                }
                case 16: {
                    list = new ArrayList();
                    ahdj.I((List)list);
                    break;
                }
                case 15: {
                    list = new ArrayList();
                    ahdj.H((List)list);
                    break;
                }
                case 14: {
                    list = new ArrayList();
                    ahdj.G((List)list);
                    break;
                }
                case 13: {
                    final ArrayList list2 = new ArrayList();
                    ahdj.A((List)list2);
                    x = ahdp.X(o, a, (List)list2, ahbf.d.a, x, adyf);
                    list = list2;
                    break;
                }
                case 12: {
                    list = new ArrayList();
                    ahdj.L((List)list);
                    break;
                }
                case 7: {
                    list = new ArrayList();
                    ahdj.y((List)list);
                    break;
                }
                case 6: {
                    list = new ArrayList();
                    ahdj.B((List)list);
                    break;
                }
                case 5: {
                    list = new ArrayList();
                    ahdj.C((List)list);
                    break;
                }
                case 4: {
                    list = new ArrayList();
                    ahdj.E((List)list);
                    break;
                }
                case 3: {
                    list = new ArrayList();
                    ahdj.M((List)list);
                    break;
                }
                case 2: {
                    list = new ArrayList();
                    ahdj.F((List)list);
                    break;
                }
                case 1: {
                    list = new ArrayList();
                    ahdj.D((List)list);
                    break;
                }
                case 0: {
                    list = new ArrayList();
                    ahdj.z((List)list);
                    break;
                }
            }
            ahau.n(ahbf.d, (Object)list);
        }
        else {
            if (ahbf.b() == ahek.n) {
                final int f = ahdj.f();
                if (ahbf.d.a.findValueByNumber(f) == null) {
                    return ahdp.E(o, a, f, x);
                }
                o = f;
            }
            else {
                switch (ahbf.b().ordinal()) {
                    default: {
                        o = null;
                        break;
                    }
                    case 17: {
                        o = ahdj.m();
                        break;
                    }
                    case 16: {
                        o = ahdj.h();
                        break;
                    }
                    case 15: {
                        o = ahdj.l();
                        break;
                    }
                    case 14: {
                        o = ahdj.g();
                        break;
                    }
                    case 13: {
                        throw new IllegalStateException("Shouldn't reach here.");
                    }
                    case 12: {
                        o = ahdj.i();
                        break;
                    }
                    case 11: {
                        o = ahdj.o();
                        break;
                    }
                    case 10: {
                        if (!ahbf.e()) {
                            o2 = ahau.l(ahbf.d);
                            if (o2 instanceof ahbh) {
                                final ahdo b = ahdg.a.b(o2);
                                o = o2;
                                if (!((ahbh)o2).isMutable()) {
                                    o = b.e();
                                    b.g(o, o2);
                                    ahau.n(ahbf.d, o);
                                }
                                ahdj.x(o, b, extensionRegistryLite);
                                return x;
                            }
                        }
                        o = ahdj.t((Class)ahbf.c.getClass(), extensionRegistryLite);
                        break;
                    }
                    case 9: {
                        if (!ahbf.e()) {
                            o2 = ahau.l(ahbf.d);
                            if (o2 instanceof ahbh) {
                                final ahdo b2 = ahdg.a.b(o2);
                                o = o2;
                                if (!((ahbh)o2).isMutable()) {
                                    o = b2.e();
                                    b2.g(o, o2);
                                    ahau.n(ahbf.d, o);
                                }
                                ahdj.w(o, b2, extensionRegistryLite);
                                return x;
                            }
                        }
                        final Class<? extends MessageLite> class1 = ahbf.c.getClass();
                        final ahah ahah = (ahah)ahdj;
                        ahah.N(3);
                        o = ahah.r(ahdg.a.a((Class)class1), extensionRegistryLite);
                        break;
                    }
                    case 8: {
                        o = ahdj.u();
                        break;
                    }
                    case 7: {
                        o = ahdj.O();
                        break;
                    }
                    case 6: {
                        o = ahdj.e();
                        break;
                    }
                    case 5: {
                        o = ahdj.j();
                        break;
                    }
                    case 4: {
                        o = ahdj.f();
                        break;
                    }
                    case 3: {
                        o = ahdj.n();
                        break;
                    }
                    case 2: {
                        o = ahdj.k();
                        break;
                    }
                    case 1: {
                        o = ahdj.b();
                        break;
                    }
                    case 0: {
                        o = ahdj.a();
                        break;
                    }
                }
            }
            if (ahbf.e()) {
                ahau.m(ahbf.d, o);
            }
            else {
                final int ordinal = ahbf.b().ordinal();
                Object e;
                if (ordinal != 9 && ordinal != 10) {
                    e = o;
                }
                else {
                    o2 = ahau.l(ahbf.d);
                    e = o;
                    if (o2 != null) {
                        e = ahby.e(o2, o);
                    }
                }
                ahau.n(ahbf.d, e);
            }
        }
        return x;
    }
    
    private static final int av(int binarySearch) {
        final int n = binarySearch = Arrays.binarySearch(ahdn.a, binarySearch);
        if (n < 0) {
            binarySearch = -(n + 1) - 1;
        }
        return binarySearch;
    }
    
    public static int b(final int n) {
        return n - 1;
    }
    
    public static int c(final Boolean b) {
        if (b == null) {
            return 1;
        }
        if (b) {
            return 2;
        }
        return 3;
    }
    
    public static void d(final long n, final int n2, final int n3, final int n4, final int n5, final int n6, final long n7, final int n8, final int n9, final boolean b, final boolean b2, final int n10) {
        final StatsEvent$Builder builder = StatsEvent.newBuilder();
        builder.setAtomId(209001);
        builder.writeLong(n);
        builder.writeInt(n2);
        builder.writeInt(n3);
        builder.writeInt(n4);
        builder.writeInt(n5);
        builder.writeInt(n6);
        builder.writeLong(n7);
        builder.writeInt(n8);
        builder.writeInt(n9);
        builder.writeBoolean(b);
        builder.writeBoolean(b2);
        builder.writeInt(n10);
        builder.usePooledBuffer();
        StatsLog.write(builder.build());
    }
    
    public static void e(final long n, final int n2, final int n3, final int n4, final int n5, final int n6, final boolean b, final boolean b2, final int n7, final boolean b3, final boolean b4, final boolean b5, final int n8, final String s, final int n9, final int n10, final int n11, final int n12, final int n13, final int n14, final int n15, final int n16, final int n17, final int n18, final int n19, final int n20, final int n21, final int n22, final int n23, final int n24, final int n25, final int n26, final int n27, final int n28, final int n29) {
        final StatsEvent$Builder builder = StatsEvent.newBuilder();
        builder.setAtomId(209000);
        builder.writeLong(n);
        builder.writeInt(n2);
        builder.writeInt(n3);
        builder.writeInt(n4);
        builder.writeInt(n5);
        builder.writeInt(n6);
        builder.writeBoolean(b);
        builder.writeBoolean(b2);
        builder.writeInt(n7);
        builder.writeBoolean(b3);
        builder.writeBoolean(b4);
        builder.writeBoolean(b5);
        builder.writeInt(n8);
        builder.writeString(s);
        builder.writeInt(n9);
        builder.writeInt(n10);
        builder.writeInt(n11);
        builder.writeInt(n12);
        builder.writeInt(n13);
        builder.writeInt(n14);
        builder.writeInt(n15);
        builder.writeInt(n16);
        builder.writeInt(n17);
        builder.writeInt(n18);
        builder.writeInt(n19);
        builder.writeInt(n20);
        builder.writeInt(n21);
        builder.writeInt(n22);
        builder.writeInt(n23);
        builder.writeInt(n24);
        builder.writeInt(n25);
        builder.writeInt(n26);
        builder.writeInt(n27);
        builder.writeInt(n28);
        builder.writeInt(n29);
        builder.usePooledBuffer();
        StatsLog.write(builder.build());
    }
    
    public static int f(final int n) {
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
    
    public static int g(final int n) {
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
    
    public static int h(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int i(final int n) {
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
    
    public static final void j(final ahab ahab, final ArrayDeque arrayDeque) {
        if (ahab.h()) {
            final int av = av(ahab.d());
            final int c = ahdn.c(av + 1);
            if (!arrayDeque.isEmpty() && arrayDeque.peek().d() < c) {
                final int c2 = ahdn.c(av);
                Object o = arrayDeque.pop();
                while (!arrayDeque.isEmpty() && arrayDeque.peek().d() < c2) {
                    o = new ahdn((ahab)arrayDeque.pop(), (ahab)o);
                }
                ahdn ahdn;
                for (ahdn = new ahdn((ahab)o, ahab); !arrayDeque.isEmpty() && arrayDeque.peek().d() < ahdn.c(av(ahdn.d) + 1); ahdn = new ahdn((ahab)arrayDeque.pop(), (ahab)ahdn)) {}
                arrayDeque.push(ahdn);
                return;
            }
            arrayDeque.push(ahab);
        }
        else {
            if (ahab instanceof ahdn) {
                final ahdn ahdn2 = (ahdn)ahab;
                final int[] a = ahdn.a;
                j(ahdn2.e, arrayDeque);
                j(ahdn2.f, arrayDeque);
                return;
            }
            throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(String.valueOf(ahab.getClass()))));
        }
    }
    
    public static int k(final ahbc ahbc) {
        final ahdw b = ahbc.l.b;
        final int a = b.a();
        int i = 0;
        if (a != 1) {
            final StringBuilder sb = new StringBuilder("Expected only one extension, saw ");
            sb.append(a);
            if (a != 0) {
                sb.append(": ");
                int a2;
                if (b.a() < 3) {
                    a2 = b.a();
                }
                else {
                    a2 = 3;
                }
                while (i < a2) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(b.f(i).getKey().b);
                    ++i;
                }
                if (a > 3) {
                    sb.append("...");
                }
            }
            throw new IllegalStateException(sb.toString());
        }
        return ((ahbe)b.f(0).getKey()).b;
    }
    
    public static final ahcq l(final Object o) {
        return (ahcq)((agnj)o).a;
    }
    
    public static final int m(final int n, final Object o, final Object o2) {
        final ahcr ahcr = (ahcr)o;
        final agnj agnj = (agnj)o2;
        final boolean empty = ahcr.isEmpty();
        int n2 = 0;
        int n3 = 0;
        if (!empty) {
            final Iterator iterator = ahcr.entrySet().iterator();
            while (true) {
                n2 = n3;
                if (!iterator.hasNext()) {
                    break;
                }
                final Map.Entry<Object, V> entry = (Map.Entry<Object, V>)iterator.next();
                n3 += ahal.ac(n) + ahal.S(agnj.a((ahcq)agnj.a, entry.getKey(), entry.getValue()));
            }
        }
        return n2;
    }
    
    public static final boolean n(final Object o) {
        return !((ahcr)o).b;
    }
    
    public static final Object o(final Object o, final Object o2) {
        final ahcr ahcr = (ahcr)o;
        final ahcr ahcr2 = (ahcr)o2;
        ahcr ahcr3 = ahcr;
        if (!ahcr2.isEmpty()) {
            ahcr a = ahcr;
            if (!ahcr.b) {
                a = ahcr.a();
            }
            a.b();
            ahcr3 = a;
            if (!ahcr2.isEmpty()) {
                a.putAll((Map)ahcr2);
                ahcr3 = a;
            }
        }
        return ahcr3;
    }
    
    public static final Object p() {
        return ahcr.a.a();
    }
    
    public static int q(final Map.Entry entry) {
        return entry.getKey().b;
    }
    
    public static ahau r(final Object o) {
        return ((ahbc)o).l;
    }
    
    public static ahau s(final Object o) {
        return ((ahbc)o).e();
    }
    
    public static void t(final ahdj ahdj, final Object o, final ExtensionRegistryLite extensionRegistryLite, final ahau ahau) {
        final ahbf ahbf = (ahbf)o;
        ahau.n(ahbf.d, ahdj.t((Class)ahbf.c.getClass(), extensionRegistryLite));
    }
    
    public static final void u(final Object o) {
        r(o).f();
    }
    
    public static final ahab v(final ahal ahal, final byte[] array) {
        ahal.an();
        return (ahab)new agzz(array);
    }
    
    public static double w(final byte[] array, final int n) {
        return Double.longBitsToDouble(W(array, n));
    }
    
    public static float x(final byte[] array, final int n) {
        return Float.intBitsToFloat(z(array, n));
    }
    
    public static int y(final byte[] array, int a, final agzp agzp) {
        final int p3 = P(array, a, agzp);
        a = agzp.a;
        if (a < 0) {
            throw ahca.f();
        }
        if (a > array.length - p3) {
            throw ahca.j();
        }
        if (a == 0) {
            agzp.c = ahab.b;
            return p3;
        }
        agzp.c = ahab.z(array, p3, a);
        return p3 + a;
    }
    
    public static int z(final byte[] array, final int n) {
        return (array[n + 3] & 0xFF) << 24 | ((array[n + 1] & 0xFF) << 8 | (array[n] & 0xFF) | (array[n + 2] & 0xFF) << 16);
    }
}
