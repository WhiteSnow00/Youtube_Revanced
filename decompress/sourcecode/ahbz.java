import java.util.ArrayDeque;
import android.content.Context;
import java.util.Iterator;
import java.util.Collection;
import java.util.Arrays;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.List;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public class ahbz
{
    public ahbz() {
    }
    
    public ahbz(final byte[] array) {
        this();
    }
    
    static int A(final byte[] array, int i, final agzy agzy, final agxq agxq) {
        final agzj agzj = (agzj)agzy;
        i = H(array, i, agxq);
        final int n = agxq.a + i;
        while (i < n) {
            i = H(array, i, agxq);
            agzj.g(agyh.J(agxq.a));
        }
        if (i == n) {
            return i;
        }
        throw ahab.j();
    }
    
    static int B(final byte[] array, int i, final agzy agzy, final agxq agxq) {
        final ahan ahan = (ahan)agzy;
        i = H(array, i, agxq);
        final int n = agxq.a + i;
        while (i < n) {
            i = K(array, i, agxq);
            ahan.f(agyh.L(agxq.b));
        }
        if (i == n) {
            return i;
        }
        throw ahab.j();
    }
    
    static int C(final byte[] array, int i, final agzy agzy, final agxq agxq) {
        final agzj agzj = (agzj)agzy;
        i = H(array, i, agxq);
        final int n = agxq.a + i;
        while (i < n) {
            i = H(array, i, agxq);
            agzj.g(agxq.a);
        }
        if (i == n) {
            return i;
        }
        throw ahab.j();
    }
    
    static int D(final byte[] array, int i, final agzy agzy, final agxq agxq) {
        final ahan ahan = (ahan)agzy;
        i = H(array, i, agxq);
        final int n = agxq.a + i;
        while (i < n) {
            i = K(array, i, agxq);
            ahan.f(agxq.b);
        }
        if (i == n) {
            return i;
        }
        throw ahab.j();
    }
    
    static int E(final byte[] array, int h, final agxq agxq) {
        h = H(array, h, agxq);
        final int a = agxq.a;
        if (a < 0) {
            throw ahab.f();
        }
        if (a == 0) {
            agxq.c = "";
            return h;
        }
        agxq.c = new String(array, h, a, agzz.a);
        return h + a;
    }
    
    static int F(final byte[] array, int h, final agxq agxq) {
        h = H(array, h, agxq);
        final int a = agxq.a;
        if (a < 0) {
            throw ahab.f();
        }
        if (a == 0) {
            agxq.c = "";
            return h;
        }
        agxq.c = ahcl.g(array, h, a);
        return h + a;
    }
    
    static int G(final int n, final byte[] array, int n2, int a, final ahcc ahcc, final agxq agxq) {
        if (ahco.a(n) == 0) {
            throw ahab.c();
        }
        final int b = ahco.b(n);
        if (b == 0) {
            n2 = K(array, n2, agxq);
            ahcc.g(n, agxq.b);
            return n2;
        }
        if (b == 1) {
            ahcc.g(n, O(array, n2));
            return n2 + 8;
        }
        if (b != 2) {
            if (b != 3) {
                if (b == 5) {
                    ahcc.g(n, r(array, n2));
                    return n2 + 4;
                }
                throw ahab.c();
            }
            else {
                final int n3 = (n & 0xFFFFFFF8) | 0x4;
                final ahcc c = ahcc.c();
                int a2 = 0;
                int n4;
                while (true) {
                    n4 = n2;
                    if (n2 >= a) {
                        break;
                    }
                    n2 = H(array, n2, agxq);
                    a2 = agxq.a;
                    if (a2 == n3) {
                        n4 = n2;
                        break;
                    }
                    n2 = G(a2, array, n2, a, c, agxq);
                }
                if (n4 <= a && a2 == n3) {
                    ahcc.g(n, c);
                    return n4;
                }
                throw ahab.g();
            }
        }
        else {
            n2 = H(array, n2, agxq);
            a = agxq.a;
            if (a < 0) {
                throw ahab.f();
            }
            if (a <= array.length - n2) {
                if (a == 0) {
                    ahcc.g(n, agyc.b);
                }
                else {
                    ahcc.g(n, agyc.z(array, n2, a));
                }
                return n2 + a;
            }
            throw ahab.j();
        }
    }
    
    static int H(final byte[] array, int a, final agxq agxq) {
        final int n = a + 1;
        a = array[a];
        if (a >= 0) {
            agxq.a = a;
            return n;
        }
        return I(a, array, n, agxq);
    }
    
    static int I(int n, final byte[] array, int n2, final agxq agxq) {
        final int n3 = n & 0x7F;
        n = n2 + 1;
        n2 = array[n2];
        if (n2 >= 0) {
            agxq.a = (n3 | n2 << 7);
            return n;
        }
        n2 = (n3 | (n2 & 0x7F) << 7);
        final int n4 = n + 1;
        n = array[n];
        if (n >= 0) {
            agxq.a = (n2 | n << 14);
            return n4;
        }
        n = (n2 | (n & 0x7F) << 14);
        n2 = n4 + 1;
        final byte b = array[n4];
        if (b >= 0) {
            agxq.a = (n | b << 21);
            return n2;
        }
        final int n5 = n | (b & 0x7F) << 21;
        n = n2 + 1;
        final byte b2 = array[n2];
        if (b2 >= 0) {
            agxq.a = (n5 | b2 << 28);
            return n;
        }
        while (true) {
            n2 = n + 1;
            if (array[n] >= 0) {
                break;
            }
            n = n2;
        }
        agxq.a = (n5 | (b2 & 0x7F) << 28);
        return n2;
    }
    
    static int J(final int n, final byte[] array, int i, final int n2, final agzy agzy, final agxq agxq) {
        final agzj agzj = (agzj)agzy;
        i = H(array, i, agxq);
        agzj.g(agxq.a);
        while (i < n2) {
            final int h = H(array, i, agxq);
            if (n != agxq.a) {
                break;
            }
            i = H(array, h, agxq);
            agzj.g(agxq.a);
        }
        return i;
    }
    
    static int K(final byte[] array, int n, final agxq agxq) {
        final int n2 = n + 1;
        final long b = array[n];
        if (b >= 0L) {
            agxq.b = b;
            return n2;
        }
        n = n2 + 1;
        byte b2 = array[n2];
        long b3 = (b & 0x7FL) | (long)(b2 & 0x7F) << 7;
        for (int n3 = 7; b2 < 0; b2 = array[n], n3 += 7, b3 |= (long)(b2 & 0x7F) << n3, ++n) {}
        agxq.b = b3;
        return n;
    }
    
    static int L(final Object c, final ahbp ahbp, final byte[] array, int c2, final int n, final int n2, final agxq agxq) {
        c2 = ((ahaz)ahbp).c(c, array, c2, n, n2, agxq);
        agxq.c = c;
        return c2;
    }
    
    static int M(final Object c, final ahbp ahbp, final byte[] array, int i, int n, final agxq agxq) {
        final int n2 = i + 1;
        final byte b = array[i];
        i = n2;
        int a = b;
        if (b < 0) {
            i = I(b, array, n2, agxq);
            a = agxq.a;
        }
        if (a >= 0 && a <= n - i) {
            n = a + i;
            ahbp.i(c, array, i, n, agxq);
            agxq.c = c;
            return n;
        }
        throw ahab.j();
    }
    
    static int N(int a, final byte[] array, int n, final int n2, final agxq agxq) {
        if (ahco.a(a) == 0) {
            throw ahab.c();
        }
        final int b = ahco.b(a);
        if (b == 0) {
            return K(array, n, agxq);
        }
        if (b == 1) {
            return n + 8;
        }
        if (b == 2) {
            return H(array, n, agxq) + agxq.a;
        }
        if (b != 3) {
            if (b == 5) {
                return n + 4;
            }
            throw ahab.c();
        }
        else {
            final int n3 = (a & 0xFFFFFFF8) | 0x4;
            a = 0;
            int h;
            while (true) {
                h = n;
                if (n >= n2) {
                    break;
                }
                h = H(array, n, agxq);
                a = agxq.a;
                if (a == n3) {
                    break;
                }
                n = N(a, array, h, n2, agxq);
            }
            if (h <= n2 && a == n3) {
                return h;
            }
            throw ahab.g();
        }
    }
    
    static long O(final byte[] array, final int n) {
        return ((long)array[n + 7] & 0xFFL) << 56 | (((long)array[n] & 0xFFL) | ((long)array[n + 1] & 0xFFL) << 8 | ((long)array[n + 2] & 0xFFL) << 16 | ((long)array[n + 3] & 0xFFL) << 24 | ((long)array[n + 4] & 0xFFL) << 32 | ((long)array[n + 5] & 0xFFL) << 40 | ((long)array[n + 6] & 0xFFL) << 48);
    }
    
    public static void P(final aglk aglk, final Map.Entry entry) {
        final agzf agzf = entry.getKey();
        if (agzf.d) {
            final ahcm a = ahcm.a;
            switch (agzf.c.ordinal()) {
                case 17: {
                    ahbq.T(agzf.b, (List)entry.getValue(), aglk, agzf.e);
                    return;
                }
                case 16: {
                    ahbq.S(agzf.b, (List)entry.getValue(), aglk, agzf.e);
                    return;
                }
                case 15: {
                    ahbq.R(agzf.b, (List)entry.getValue(), aglk, agzf.e);
                    return;
                }
                case 14: {
                    ahbq.Q(agzf.b, (List)entry.getValue(), aglk, agzf.e);
                    return;
                }
                case 13: {
                    ahbq.N(agzf.b, (List)entry.getValue(), aglk, agzf.e);
                    return;
                }
                case 12: {
                    ahbq.V(agzf.b, (List)entry.getValue(), aglk, agzf.e);
                    return;
                }
                case 11: {
                    ahbq.G(agzf.b, (List)entry.getValue(), aglk);
                    return;
                }
                case 10: {
                    final List list = (List)entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        ahbq.P(agzf.b, (List)entry.getValue(), aglk, ahbh.a.a(list.get(0).getClass()));
                        return;
                    }
                    break;
                }
                case 9: {
                    final List list2 = (List)entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        ahbq.M(agzf.b, (List)entry.getValue(), aglk, ahbh.a.a(list2.get(0).getClass()));
                        return;
                    }
                    break;
                }
                case 8: {
                    ahbq.U(agzf.b, (List)entry.getValue(), aglk);
                    return;
                }
                case 7: {
                    ahbq.F(agzf.b, (List)entry.getValue(), aglk, agzf.e);
                    return;
                }
                case 6: {
                    ahbq.J(agzf.b, (List)entry.getValue(), aglk, agzf.e);
                    return;
                }
                case 5: {
                    ahbq.K(agzf.b, (List)entry.getValue(), aglk, agzf.e);
                    return;
                }
                case 4: {
                    ahbq.N(agzf.b, (List)entry.getValue(), aglk, agzf.e);
                    return;
                }
                case 3: {
                    ahbq.W(agzf.b, (List)entry.getValue(), aglk, agzf.e);
                    return;
                }
                case 2: {
                    ahbq.O(agzf.b, (List)entry.getValue(), aglk, agzf.e);
                    return;
                }
                case 1: {
                    ahbq.L(agzf.b, (List)entry.getValue(), aglk, agzf.e);
                    return;
                }
                case 0: {
                    ahbq.H(agzf.b, (List)entry.getValue(), aglk, agzf.e);
                }
            }
        }
        else {
            final ahcm a2 = ahcm.a;
            switch (agzf.c.ordinal()) {
                case 17: {
                    aglk.q(agzf.b, (long)entry.getValue());
                    return;
                }
                case 16: {
                    aglk.p(agzf.b, (int)entry.getValue());
                    return;
                }
                case 15: {
                    aglk.o(agzf.b, (long)entry.getValue());
                    return;
                }
                case 14: {
                    aglk.n(agzf.b, (int)entry.getValue());
                    return;
                }
                case 13: {
                    aglk.j(agzf.b, (int)entry.getValue());
                    return;
                }
                case 12: {
                    aglk.s(agzf.b, (int)entry.getValue());
                    return;
                }
                case 11: {
                    aglk.c(agzf.b, (agyc)entry.getValue());
                    return;
                }
                case 10: {
                    aglk.l(agzf.b, (Object)entry.getValue(), ahbh.a.a(entry.getValue().getClass()));
                    return;
                }
                case 9: {
                    aglk.i(agzf.b, (Object)entry.getValue(), ahbh.a.a(entry.getValue().getClass()));
                    return;
                }
                case 8: {
                    aglk.r(agzf.b, (String)entry.getValue());
                    return;
                }
                case 7: {
                    aglk.b(agzf.b, (boolean)entry.getValue());
                    return;
                }
                case 6: {
                    aglk.f(agzf.b, (int)entry.getValue());
                    return;
                }
                case 5: {
                    aglk.g(agzf.b, (long)entry.getValue());
                    return;
                }
                case 4: {
                    aglk.j(agzf.b, (int)entry.getValue());
                    return;
                }
                case 3: {
                    aglk.t(agzf.b, (long)entry.getValue());
                    return;
                }
                case 2: {
                    aglk.k(agzf.b, (long)entry.getValue());
                    return;
                }
                case 1: {
                    aglk.h(agzf.b, (float)entry.getValue());
                    return;
                }
                case 0: {
                    aglk.d(agzf.b, (double)entry.getValue());
                    break;
                }
            }
        }
    }
    
    public static int Q(final String s) {
        int i = 0;
        int n = 0;
        while (i < s.length()) {
            n = n * 31 + s.charAt(i);
            ++i;
        }
        return n;
    }
    
    public static int R(final String s, int n) {
        while (n < s.length() && s.charAt(n) != '-') {
            ++n;
        }
        return n;
    }
    
    public static int S(final int n) {
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
    
    public static String T(final int n) {
        return Integer.toString(n - 1);
    }
    
    public static int V(final int n) {
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
    
    public static int W(final int n) {
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
    
    public static int X(final int n) {
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
    
    public static String Y(final int n) {
        return Integer.toString(n - 1);
    }
    
    static String a(final agyc agyc) {
        final StringBuilder sb = new StringBuilder(agyc.d());
        for (int i = 0; i < agyc.d(); ++i) {
            final byte a = agyc.a(i);
            if (a != 34) {
                if (a != 39) {
                    if (a != 92) {
                        switch (a) {
                            default: {
                                if (a >= 32 && a <= 126) {
                                    sb.append((char)a);
                                    break;
                                }
                                sb.append('\\');
                                sb.append((char)((a >>> 6 & 0x3) + 48));
                                sb.append((char)((a >>> 3 & 0x7) + 48));
                                sb.append((char)((a & 0x7) + 48));
                                break;
                            }
                            case 13: {
                                sb.append("\\r");
                                break;
                            }
                            case 12: {
                                sb.append("\\f");
                                break;
                            }
                            case 11: {
                                sb.append("\\v");
                                break;
                            }
                            case 10: {
                                sb.append("\\n");
                                break;
                            }
                            case 9: {
                                sb.append("\\t");
                                break;
                            }
                            case 8: {
                                sb.append("\\b");
                                break;
                            }
                            case 7: {
                                sb.append("\\a");
                                break;
                            }
                        }
                    }
                    else {
                        sb.append("\\\\");
                    }
                }
                else {
                    sb.append("\\'");
                }
            }
            else {
                sb.append("\\\"");
            }
        }
        return sb.toString();
    }
    
    public static Object aB(Object o, final ahbk ahbk, Object o2, final ExtensionRegistryLite extensionRegistryLite, final agyv agyv, Object x, final aeda aeda) {
        final agzg agzg = (agzg)o2;
        final int a = agzg.a();
        final agzf d = agzg.d;
        if (d.d && d.e) {
            final ahcm a2 = ahcm.a;
            ArrayList list = null;
            switch (agzg.b().ordinal()) {
                default: {
                    throw new IllegalStateException("Type cannot be packed: ".concat(String.valueOf(String.valueOf(agzg.d.c))));
                }
                case 17: {
                    list = new ArrayList();
                    ahbk.J(list);
                    break;
                }
                case 16: {
                    list = new ArrayList();
                    ahbk.I(list);
                    break;
                }
                case 15: {
                    list = new ArrayList();
                    ahbk.H(list);
                    break;
                }
                case 14: {
                    list = new ArrayList();
                    ahbk.G(list);
                    break;
                }
                case 13: {
                    final ArrayList list2 = new ArrayList();
                    ahbk.A(list2);
                    x = ahbq.X(o, a, list2, agzg.d.a, x, aeda);
                    list = list2;
                    break;
                }
                case 12: {
                    list = new ArrayList();
                    ahbk.L(list);
                    break;
                }
                case 7: {
                    list = new ArrayList();
                    ahbk.y(list);
                    break;
                }
                case 6: {
                    list = new ArrayList();
                    ahbk.B(list);
                    break;
                }
                case 5: {
                    list = new ArrayList();
                    ahbk.C(list);
                    break;
                }
                case 4: {
                    list = new ArrayList();
                    ahbk.E(list);
                    break;
                }
                case 3: {
                    list = new ArrayList();
                    ahbk.M(list);
                    break;
                }
                case 2: {
                    list = new ArrayList();
                    ahbk.F(list);
                    break;
                }
                case 1: {
                    list = new ArrayList();
                    ahbk.D(list);
                    break;
                }
                case 0: {
                    list = new ArrayList();
                    ahbk.z(list);
                    break;
                }
            }
            agyv.n(agzg.d, list);
        }
        else {
            if (agzg.b() == ahcm.n) {
                final int f = ahbk.f();
                if (agzg.d.a.findValueByNumber(f) == null) {
                    return ahbq.E(o, a, f, x);
                }
                o = f;
            }
            else {
                switch (agzg.b().ordinal()) {
                    default: {
                        o = null;
                        break;
                    }
                    case 17: {
                        o = ahbk.m();
                        break;
                    }
                    case 16: {
                        o = ahbk.h();
                        break;
                    }
                    case 15: {
                        o = ahbk.l();
                        break;
                    }
                    case 14: {
                        o = ahbk.g();
                        break;
                    }
                    case 13: {
                        throw new IllegalStateException("Shouldn't reach here.");
                    }
                    case 12: {
                        o = ahbk.i();
                        break;
                    }
                    case 11: {
                        o = ahbk.o();
                        break;
                    }
                    case 10: {
                        if (!agzg.e()) {
                            o2 = agyv.l(agzg.d);
                            if (o2 instanceof agzi) {
                                final ahbp b = ahbh.a.b(o2);
                                o = o2;
                                if (!((agzi)o2).isMutable()) {
                                    o = b.e();
                                    b.g(o, o2);
                                    agyv.n(agzg.d, o);
                                }
                                ahbk.x(o, b, extensionRegistryLite);
                                return x;
                            }
                        }
                        o = ahbk.t(agzg.c.getClass(), extensionRegistryLite);
                        break;
                    }
                    case 9: {
                        if (!agzg.e()) {
                            o2 = agyv.l(agzg.d);
                            if (o2 instanceof agzi) {
                                final ahbp b2 = ahbh.a.b(o2);
                                o = o2;
                                if (!((agzi)o2).isMutable()) {
                                    o = b2.e();
                                    b2.g(o, o2);
                                    agyv.n(agzg.d, o);
                                }
                                ahbk.w(o, b2, extensionRegistryLite);
                                return x;
                            }
                        }
                        final Class<? extends MessageLite> class1 = agzg.c.getClass();
                        final agyi agyi = (agyi)ahbk;
                        agyi.N(3);
                        o = agyi.r(ahbh.a.a(class1), extensionRegistryLite);
                        break;
                    }
                    case 8: {
                        o = ahbk.u();
                        break;
                    }
                    case 7: {
                        o = ahbk.O();
                        break;
                    }
                    case 6: {
                        o = ahbk.e();
                        break;
                    }
                    case 5: {
                        o = ahbk.j();
                        break;
                    }
                    case 4: {
                        o = ahbk.f();
                        break;
                    }
                    case 3: {
                        o = ahbk.n();
                        break;
                    }
                    case 2: {
                        o = ahbk.k();
                        break;
                    }
                    case 1: {
                        o = ahbk.b();
                        break;
                    }
                    case 0: {
                        o = ahbk.a();
                        break;
                    }
                }
            }
            if (agzg.e()) {
                agyv.m(agzg.d, o);
            }
            else {
                final int ordinal = agzg.b().ordinal();
                Object e;
                if (ordinal != 9 && ordinal != 10) {
                    e = o;
                }
                else {
                    o2 = agyv.l(agzg.d);
                    e = o;
                    if (o2 != null) {
                        e = agzz.e(o2, o);
                    }
                }
                agyv.n(agzg.d, e);
            }
        }
        return x;
    }
    
    private static int aC(int binarySearch) {
        final int n = binarySearch = Arrays.binarySearch(ahbo.a, binarySearch);
        if (n < 0) {
            binarySearch = -(n + 1) - 1;
        }
        return binarySearch;
    }
    
    public static int aa(final int n) {
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
    
    public static String ab(final int n) {
        return Integer.toString(n - 1);
    }
    
    public static int ad(final int n) {
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
    
    public static String ae(final int n) {
        return Integer.toString(n - 1);
    }
    
    public static int ag(final int n) {
        return (int)(Integer.rotateLeft((int)(n * -862048943L), 15) * 461845907L);
    }
    
    public static int ah(final Object o) {
        int hashCode;
        if (o == null) {
            hashCode = 0;
        }
        else {
            hashCode = o.hashCode();
        }
        return ag(hashCode);
    }
    
    public static int ai(int max) {
        max = Math.max(max, 2);
        final int highestOneBit = Integer.highestOneBit(max);
        if (max <= highestOneBit) {
            return highestOneBit;
        }
        max = highestOneBit + highestOneBit;
        if (max > 0) {
            return max;
        }
        return 1073741824;
    }
    
    public static int aj(final int n, final int n2) {
        return n & ~n2;
    }
    
    public static int ak(final int n, final int n2, final int n3) {
        return (n & ~n3) | (n2 & n3);
    }
    
    public static int al(final int n) {
        int n2;
        if (n < 32) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        return n2 * (n + 1);
    }
    
    public static int am(final Object o, final Object o2, final int n, final Object o3, final int[] array, final Object[] array2, final Object[] array3) {
        final int ah = ah(o);
        final int n2 = ah & n;
        int an = an(o3, n2);
        if (an == 0) {
            return -1;
        }
        final int aj = aj(ah, n);
        int n3 = -1;
        while (true) {
            --an;
            final int n4 = array[an];
            if (aj(n4, n) == aj && aeda.v(o, array2[an]) && (array3 == null || aeda.v(o2, array3[an]))) {
                final int n5 = n4 & n;
                if (n3 == -1) {
                    ar(o3, n2, n5);
                }
                else {
                    array[n3] = ak(array[n3], n5, n);
                }
                return an;
            }
            final int n6 = n4 & n;
            if (n6 == 0) {
                return -1;
            }
            n3 = an;
            an = n6;
        }
    }
    
    public static int an(final Object o, final int n) {
        if (o instanceof byte[]) {
            return ((byte[])o)[n] & 0xFF;
        }
        if (o instanceof short[]) {
            return (char)((short[])o)[n];
        }
        return ((int[])o)[n];
    }
    
    public static int ao(final int n) {
        return Math.max(4, ai(n + 1));
    }
    
    public static Object ap(final int n) {
        if (n < 2 || n > 1073741824 || Integer.highestOneBit(n) != n) {
            final StringBuilder sb = new StringBuilder("must be power of 2 between 2^1 and 2^30: ");
            sb.append(n);
            throw new IllegalArgumentException(sb.toString());
        }
        if (n <= 256) {
            return new byte[n];
        }
        if (n <= 65536) {
            return new short[n];
        }
        return new int[n];
    }
    
    public static void aq(final Object o) {
        if (o instanceof byte[]) {
            Arrays.fill((byte[])o, (byte)0);
            return;
        }
        if (o instanceof short[]) {
            Arrays.fill((short[])o, (short)0);
            return;
        }
        Arrays.fill((int[])o, 0);
    }
    
    public static void ar(final Object o, final int n, final int n2) {
        if (o instanceof byte[]) {
            ((byte[])o)[n] = (byte)n2;
            return;
        }
        if (o instanceof short[]) {
            ((short[])o)[n] = (short)n2;
            return;
        }
        ((int[])o)[n] = n2;
    }
    
    public static Collection as(final Collection collection, final aext aext) {
        aext.getClass();
        return new afak(collection, aext);
    }
    
    public static Collection at(final Collection collection, final aexg aexg) {
        return new afal(collection, aexg);
    }
    
    public static boolean au(final Collection collection, final Collection collection2) {
        final Iterator iterator = collection2.iterator();
        while (iterator.hasNext()) {
            if (!collection.contains(iterator.next())) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean av(final Collection collection, final Object o) {
        collection.getClass();
        try {
            return collection.contains(o);
        }
        catch (final ClassCastException | NullPointerException ex) {
            return false;
        }
    }
    
    public static void aw(final Object o, final Object o2) {
        if (o == null) {
            new StringBuilder("null key in entry: null=").append(o2);
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(o2)));
        }
        if (o2 != null) {
            return;
        }
        final StringBuilder sb = new StringBuilder("null value in entry: ");
        sb.append(o);
        sb.append("=null");
        throw new NullPointerException(sb.toString());
    }
    
    public static void ax(final boolean b) {
        agot.E(b, (Object)"no calls to next() since the last call to remove()");
    }
    
    public static void ay(final int n, final String s) {
        if (n >= 0) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(" cannot be negative but was: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static Object az(Context applicationContext, final Class clazz) {
        applicationContext = applicationContext.getApplicationContext();
        if (applicationContext instanceof arix) {
            final Object ar = ((arix)applicationContext).aR();
            try {
                return clazz.cast(ar);
            }
            catch (final ClassCastException ex) {
                throw new IllegalStateException("Failed to get an entry point. Did you mark your interface with @SingletonEntryPoint?", ex);
            }
        }
        throw new IllegalStateException("Given application context does not implement GeneratedComponentManager: ".concat(String.valueOf(String.valueOf(applicationContext.getClass()))));
    }
    
    public static void b(final agyc agyc, final ArrayDeque arrayDeque) {
        if (agyc.h()) {
            final int ac = aC(agyc.d());
            final int c = ahbo.c(ac + 1);
            if (!arrayDeque.isEmpty() && arrayDeque.peek().d() < c) {
                final int c2 = ahbo.c(ac);
                Object o = arrayDeque.pop();
                while (!arrayDeque.isEmpty() && arrayDeque.peek().d() < c2) {
                    o = new ahbo((agyc)arrayDeque.pop(), (agyc)o);
                }
                ahbo ahbo;
                for (ahbo = new ahbo((agyc)o, agyc); !arrayDeque.isEmpty() && arrayDeque.peek().d() < ahbo.c(aC(ahbo.d) + 1); ahbo = new ahbo((agyc)arrayDeque.pop(), (agyc)ahbo)) {}
                arrayDeque.push(ahbo);
                return;
            }
            arrayDeque.push(agyc);
        }
        else {
            if (agyc instanceof ahbo) {
                final ahbo ahbo2 = (ahbo)agyc;
                final int h = ahbo.h;
                b(ahbo2.e, arrayDeque);
                b(ahbo2.f, arrayDeque);
                return;
            }
            throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(String.valueOf(agyc.getClass()))));
        }
    }
    
    public static int c(final agzd agzd) {
        final ahbx b = agzd.l.b;
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
        return ((agzf)b.f(0).getKey()).b;
    }
    
    public static ahar d(final Object o) {
        return (ahar)((agli)o).a;
    }
    
    public static int e(final int n, final Object o, final Object o2) {
        final ahas ahas = (ahas)o;
        final agli agli = (agli)o2;
        final boolean empty = ahas.isEmpty();
        int n2 = 0;
        int n3 = 0;
        if (!empty) {
            final Iterator iterator = ahas.entrySet().iterator();
            while (true) {
                n2 = n3;
                if (!iterator.hasNext()) {
                    break;
                }
                final Map.Entry<Object, V> entry = (Map.Entry<Object, V>)iterator.next();
                n3 += agym.ac(n) + agym.S(agli.q((ahar)agli.a, entry.getKey(), (Object)entry.getValue()));
            }
        }
        return n2;
    }
    
    public static boolean f(final Object o) {
        return !((ahas)o).b;
    }
    
    public static Object g(final Object o, final Object o2) {
        final ahas ahas = (ahas)o;
        final ahas ahas2 = (ahas)o2;
        ahas ahas3 = ahas;
        if (!ahas2.isEmpty()) {
            ahas a = ahas;
            if (!ahas.b) {
                a = ahas.a();
            }
            a.b();
            ahas3 = a;
            if (!ahas2.isEmpty()) {
                a.putAll(ahas2);
                ahas3 = a;
            }
        }
        return ahas3;
    }
    
    public static Object h() {
        return ahas.a.a();
    }
    
    public static int i(final Map.Entry entry) {
        return entry.getKey().b;
    }
    
    public static agyv j(final Object o) {
        return ((agzd)o).l;
    }
    
    public static agyv k(final Object o) {
        return ((agzd)o).e();
    }
    
    public static void l(final ahbk ahbk, final Object o, final ExtensionRegistryLite extensionRegistryLite, final agyv agyv) {
        final agzg agzg = (agzg)o;
        agyv.n(agzg.d, ahbk.t(agzg.c.getClass(), extensionRegistryLite));
    }
    
    public static void m(final Object o) {
        j(o).f();
    }
    
    public static agyc n(final agym agym, final byte[] array) {
        agym.an();
        return (agyc)new agya(array);
    }
    
    static double o(final byte[] array, final int n) {
        return Double.longBitsToDouble(O(array, n));
    }
    
    static float p(final byte[] array, final int n) {
        return Float.intBitsToFloat(r(array, n));
    }
    
    static int q(final byte[] array, int h, final agxq agxq) {
        h = H(array, h, agxq);
        final int a = agxq.a;
        if (a < 0) {
            throw ahab.f();
        }
        if (a > array.length - h) {
            throw ahab.j();
        }
        if (a == 0) {
            agxq.c = agyc.b;
            return h;
        }
        agxq.c = agyc.z(array, h, a);
        return h + a;
    }
    
    static int r(final byte[] array, final int n) {
        return (array[n + 3] & 0xFF) << 24 | ((array[n] & 0xFF) | (array[n + 1] & 0xFF) << 8 | (array[n + 2] & 0xFF) << 16);
    }
    
    static int s(final ahbp ahbp, final byte[] array, int l, final int n, final int n2, final agxq agxq) {
        final Object e = ahbp.e();
        l = L(e, ahbp, array, l, n, n2, agxq);
        ahbp.f(e);
        agxq.c = e;
        return l;
    }
    
    static int t(final ahbp ahbp, final byte[] array, int m, final int n, final agxq agxq) {
        final Object e = ahbp.e();
        m = M(e, ahbp, array, m, n, agxq);
        ahbp.f(e);
        agxq.c = e;
        return m;
    }
    
    static int u(final ahbp ahbp, final int n, final byte[] array, int i, final int n2, final agzy agzy, final agxq agxq) {
        i = t(ahbp, array, i, n2, agxq);
        agzy.add(agxq.c);
        while (i < n2) {
            final int h = H(array, i, agxq);
            if (n != agxq.a) {
                break;
            }
            i = t(ahbp, array, h, n2, agxq);
            agzy.add(agxq.c);
        }
        return i;
    }
    
    static int v(final byte[] array, int i, final agzy agzy, final agxq agxq) {
        final agxt agxt = (agxt)agzy;
        i = H(array, i, agxq);
        final int n = agxq.a + i;
        while (i < n) {
            i = K(array, i, agxq);
            agxt.f(agxq.b != 0L);
        }
        if (i == n) {
            return i;
        }
        throw ahab.j();
    }
    
    static int w(final byte[] array, int i, final agzy agzy, final agxq agxq) {
        final agyn agyn = (agyn)agzy;
        int n;
        for (i = H(array, i, agxq), n = agxq.a + i; i < n; i += 8) {
            agyn.f(o(array, i));
        }
        if (i == n) {
            return i;
        }
        throw ahab.j();
    }
    
    static int x(final byte[] array, int i, final agzy agzy, final agxq agxq) {
        final agzj agzj = (agzj)agzy;
        int n;
        for (i = H(array, i, agxq), n = agxq.a + i; i < n; i += 4) {
            agzj.g(r(array, i));
        }
        if (i == n) {
            return i;
        }
        throw ahab.j();
    }
    
    static int y(final byte[] array, int i, final agzy agzy, final agxq agxq) {
        final ahan ahan = (ahan)agzy;
        int n;
        for (i = H(array, i, agxq), n = agxq.a + i; i < n; i += 8) {
            ahan.f(O(array, i));
        }
        if (i == n) {
            return i;
        }
        throw ahab.j();
    }
    
    static int z(final byte[] array, int i, final agzy agzy, final agxq agxq) {
        final agyy agyy = (agyy)agzy;
        int n;
        for (i = H(array, i, agxq), n = agxq.a + i; i < n; i += 4) {
            agyy.h(p(array, i));
        }
        if (i == n) {
            return i;
        }
        throw ahab.j();
    }
}
