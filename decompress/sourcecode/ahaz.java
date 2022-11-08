import com.google.protobuf.ExtensionRegistryLite;
import java.util.Iterator;
import java.io.IOException;
import java.util.Map;
import java.util.List;
import java.util.Arrays;
import java.lang.reflect.Field;
import com.google.protobuf.MessageLite;
import sun.misc.Unsafe;

// 
// Decompiled by Procyon v0.6.0
// 

final class ahaz implements ahbp
{
    private static final int[] a;
    private static final Unsafe b;
    private final int[] c;
    private final Object[] d;
    private final int e;
    private final int f;
    private final MessageLite g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final int[] l;
    private final int m;
    private final int n;
    private final aham o;
    private final aeda p;
    
    static {
        a = new int[0];
        b = ahcj.k();
    }
    
    private ahaz(final int[] c, final Object[] d, final int e, final int f, final MessageLite g, final boolean j, final boolean k, final int[] l, final int m, final int n, final aham o, final aeda p19, final ahbz ahbz, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.i = (g instanceof agzi);
        this.j = j;
        boolean h = false;
        if (ahbz != null) {
            h = h;
            if (g instanceof agzd) {
                h = true;
            }
        }
        this.h = h;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p19;
        this.g = g;
    }
    
    private final int A(final int n, int i) {
        int n2 = this.c.length / 3 - 1;
        while (i <= n2) {
            final int n3 = n2 + i >>> 1;
            final int n4 = n3 * 3;
            final int s = this.s(n4);
            if (n == s) {
                return n4;
            }
            if (n < s) {
                n2 = n3 - 1;
            }
            else {
                i = n3 + 1;
            }
        }
        return -1;
    }
    
    private static int B(final int n) {
        return n >>> 20 & 0xFF;
    }
    
    private final int C(final int n) {
        return this.c[n + 1];
    }
    
    private static long D(final int n) {
        return n & 0xFFFFF;
    }
    
    private static long E(final Object o, final long n) {
        return (long)ahcj.i(o, n);
    }
    
    private final agzo F(int n) {
        n /= 3;
        return (agzo)this.d[n + n + 1];
    }
    
    private final ahbp G(int n) {
        n /= 3;
        n += n;
        final ahbp ahbp = (ahbp)this.d[n];
        if (ahbp != null) {
            return ahbp;
        }
        return (ahbp)(this.d[n] = ahbh.a.a((Class)this.d[n + 1]));
    }
    
    private final Object H(int n) {
        n /= 3;
        return this.d[n + n];
    }
    
    private final Object I(Object object, final int n) {
        final ahbp g = this.G(n);
        final long d = D(this.C(n));
        if (!this.W(object, n)) {
            return g.e();
        }
        object = ahaz.b.getObject(object, d);
        if (Z(object)) {
            return object;
        }
        final Object e = g.e();
        if (object != null) {
            g.g(e, object);
        }
        return e;
    }
    
    private final Object J(Object e, final int n, final int n2) {
        final ahbp g = this.G(n2);
        if (!this.aa(e, n, n2)) {
            return g.e();
        }
        final Object object = ahaz.b.getObject(e, D(this.C(n2)));
        if (Z(object)) {
            return object;
        }
        e = g.e();
        if (object != null) {
            g.g(e, object);
        }
        return e;
    }
    
    private static Field K(final Class clazz, final String s) {
        try {
            return clazz.getDeclaredField(s);
        }
        catch (final NoSuchFieldException ex) {
            final Field[] declaredFields = clazz.getDeclaredFields();
            for (final Field field : declaredFields) {
                if (s.equals(field.getName())) {
                    return field;
                }
            }
            final String name = clazz.getName();
            final String string = Arrays.toString(declaredFields);
            final StringBuilder sb = new StringBuilder("Field ");
            sb.append(s);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(string);
            throw new RuntimeException(sb.toString());
        }
    }
    
    private static List L(final Object o, final long n) {
        return (List)ahcj.i(o, n);
    }
    
    private static void M(final Object o) {
        if (Z(o)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(String.valueOf(o))));
    }
    
    private final void N(final Object o, Object o2, int s) {
        if (!this.W(o2, s)) {
            return;
        }
        final long d = D(this.C(s));
        final Unsafe b = ahaz.b;
        final Object object = b.getObject(o2, d);
        if (object == null) {
            s = this.s(s);
            final String string = o2.toString();
            final StringBuilder sb = new StringBuilder("Source subfield ");
            sb.append(s);
            sb.append(" is present but null: ");
            sb.append(string);
            throw new IllegalStateException(sb.toString());
        }
        final ahbp g = this.G(s);
        if (!this.W(o, s)) {
            if (!Z(object)) {
                b.putObject(o, d, object);
            }
            else {
                o2 = g.e();
                g.g(o2, object);
                b.putObject(o, d, o2);
            }
            this.Q(o, s);
            return;
        }
        final Object o3 = o2 = b.getObject(o, d);
        if (!Z(o3)) {
            o2 = g.e();
            g.g(o2, o3);
            b.putObject(o, d, o2);
        }
        g.g(o2, object);
    }
    
    private final void O(final Object o, Object o2, int s) {
        final int s2 = this.s(s);
        if (!this.aa(o2, s2, s)) {
            return;
        }
        final long d = D(this.C(s));
        final Unsafe b = ahaz.b;
        final Object object = b.getObject(o2, d);
        if (object == null) {
            s = this.s(s);
            final String string = o2.toString();
            final StringBuilder sb = new StringBuilder("Source subfield ");
            sb.append(s);
            sb.append(" is present but null: ");
            sb.append(string);
            throw new IllegalStateException(sb.toString());
        }
        final ahbp g = this.G(s);
        if (!this.aa(o, s2, s)) {
            if (!Z(object)) {
                b.putObject(o, d, object);
            }
            else {
                o2 = g.e();
                g.g(o2, object);
                b.putObject(o, d, o2);
            }
            this.R(o, s2, s);
            return;
        }
        final Object o3 = o2 = b.getObject(o, d);
        if (!Z(o3)) {
            o2 = g.e();
            g.g(o2, o3);
            b.putObject(o, d, o2);
        }
        g.g(o2, object);
    }
    
    private final void P(final Object o, final int n, final ahbk ahbk) {
        if (V(n)) {
            ahcj.v(o, D(n), (Object)ahbk.v());
            return;
        }
        if (this.i) {
            ahcj.v(o, D(n), (Object)ahbk.u());
            return;
        }
        ahcj.v(o, D(n), (Object)ahbk.o());
    }
    
    private final void Q(final Object o, int z) {
        z = this.z(z);
        final long n = 0xFFFFF & z;
        if (n == 1048575L) {
            return;
        }
        ahcj.t(o, n, 1 << (z >>> 20) | ahcj.d(o, n));
    }
    
    private final void R(final Object o, final int n, final int n2) {
        ahcj.t(o, (long)(this.z(n2) & 0xFFFFF), n);
    }
    
    private final void S(final Object o, final int n, final Object o2) {
        ahaz.b.putObject(o, D(this.C(n)), o2);
        this.Q(o, n);
    }
    
    private final void T(final Object o, final int n, final int n2, final Object o2) {
        ahaz.b.putObject(o, D(this.C(n2)), o2);
        this.R(o, n, n2);
    }
    
    private final boolean U(final Object o, final Object o2, final int n) {
        return this.W(o, n) == this.W(o2, n);
    }
    
    private static boolean V(final int n) {
        return (n & 0x20000000) != 0x0;
    }
    
    private final boolean W(Object i, int c) {
        final int z = this.z(c);
        final long n = 0xFFFFF & z;
        if (n != 1048575L) {
            return (ahcj.d(i, n) & 1 << (z >>> 20)) != 0x0;
        }
        c = this.C(c);
        final long d = D(c);
        switch (B(c)) {
            default: {
                throw new IllegalArgumentException();
            }
            case 17: {
                return ahcj.i(i, d) != null;
            }
            case 16: {
                return ahcj.f(i, d) != 0L;
            }
            case 15: {
                return ahcj.d(i, d) != 0;
            }
            case 14: {
                return ahcj.f(i, d) != 0L;
            }
            case 13: {
                return ahcj.d(i, d) != 0;
            }
            case 12: {
                return ahcj.d(i, d) != 0;
            }
            case 11: {
                return ahcj.d(i, d) != 0;
            }
            case 10: {
                return !agyc.b.equals(ahcj.i(i, d));
            }
            case 9: {
                return ahcj.i(i, d) != null;
            }
            case 8: {
                i = ahcj.i(i, d);
                if (i instanceof String) {
                    return !((String)i).isEmpty();
                }
                if (i instanceof agyc) {
                    return !agyc.b.equals(i);
                }
                throw new IllegalArgumentException();
            }
            case 7: {
                return ahcj.x(i, d);
            }
            case 6: {
                return ahcj.d(i, d) != 0;
            }
            case 5: {
                return ahcj.f(i, d) != 0L;
            }
            case 4: {
                return ahcj.d(i, d) != 0;
            }
            case 3: {
                return ahcj.f(i, d) != 0L;
            }
            case 2: {
                return ahcj.f(i, d) != 0L;
            }
            case 1: {
                return Float.floatToRawIntBits(ahcj.c(i, d)) != 0;
            }
            case 0: {
                return Double.doubleToRawLongBits(ahcj.b(i, d)) != 0L;
            }
        }
    }
    
    private final boolean X(final Object o, final int n, final int n2, final int n3, final int n4) {
        if (n2 == 1048575) {
            return this.W(o, n);
        }
        return (n3 & n4) != 0x0;
    }
    
    private static boolean Y(final Object o, final int n, final ahbp ahbp) {
        return ahbp.k(ahcj.i(o, D(n)));
    }
    
    private static boolean Z(final Object o) {
        return o != null && (!(o instanceof agzi) || ((agzi)o).isMutable());
    }
    
    private final boolean aa(final Object o, final int n, final int n2) {
        return ahcj.d(o, (long)(this.z(n2) & 0xFFFFF)) == n;
    }
    
    private static boolean ab(final Object o, final long n) {
        return (boolean)ahcj.i(o, n);
    }
    
    private static final int ac(final byte[] array, int n, final int n2, final ahcm ahcm, final Class clazz, final agxq agxq) {
        final ahcm a = ahcm.a;
        Label_0355: {
            switch (ahcm.ordinal()) {
                default: {
                    throw new RuntimeException("unsupported field type.");
                }
                case 17: {
                    n = ahbz.K(array, n, agxq);
                    agxq.c = agyh.L(agxq.b);
                    return n;
                }
                case 16: {
                    n = ahbz.H(array, n, agxq);
                    agxq.c = agyh.J(agxq.a);
                    return n;
                }
                case 11: {
                    n = ahbz.q(array, n, agxq);
                    return n;
                }
                case 10: {
                    n = ahbz.t(ahbh.a.a(clazz), array, n, n2, agxq);
                    return n;
                }
                case 8: {
                    n = ahbz.F(array, n, agxq);
                    return n;
                }
                case 7: {
                    n = ahbz.K(array, n, agxq);
                    agxq.c = (agxq.b != 0L);
                    return n;
                }
                case 6:
                case 14: {
                    agxq.c = ahbz.r(array, n);
                    break;
                }
                case 5:
                case 15: {
                    agxq.c = ahbz.O(array, n);
                    break Label_0355;
                }
                case 4:
                case 12:
                case 13: {
                    n = ahbz.H(array, n, agxq);
                    agxq.c = agxq.a;
                    return n;
                }
                case 2:
                case 3: {
                    n = ahbz.K(array, n, agxq);
                    agxq.c = agxq.b;
                    return n;
                }
                case 1: {
                    agxq.c = ahbz.p(array, n);
                    break;
                }
                case 0: {
                    agxq.c = ahbz.o(array, n);
                    break Label_0355;
                }
            }
            n += 4;
            return n;
        }
        n += 8;
        return n;
    }
    
    private final void ad(final Object o, final byte[] array, int n, final int n2, final agxq agxq) {
        M(o);
        final Unsafe b = ahaz.b;
        int i = n;
        int n3 = -1;
        int n4 = 0;
        n = 0;
        int n5 = 1048575;
        while (i < n2) {
            final int n6 = i + 1;
            int a = array[i];
            int j;
            if (a < 0) {
                j = ahbz.I(a, array, n6, agxq);
                a = agxq.a;
            }
            else {
                j = n6;
            }
            final int n7 = a >>> 3;
            final int n8 = a & 0x7;
            int n9;
            if (n7 > n3) {
                n9 = this.y(n7, n4 / 3);
            }
            else {
                n9 = this.x(n7);
            }
            int n17 = 0;
            int n18 = 0;
            Label_1176: {
                if (n9 != -1) {
                    final int[] c = this.c;
                    final int n10 = c[n9 + 1];
                    final int b2 = B(n10);
                    final long d = D(n10);
                    Label_0987: {
                        if (b2 <= 17) {
                            final int n11 = c[n9 + 2];
                            final int n12 = 1 << (n11 >>> 20);
                            final int n13 = n11 & 0xFFFFF;
                            int n14;
                            if (n13 != n5) {
                                if (n5 != 1048575) {
                                    b.putInt(o, (long)n5, n);
                                }
                                if (n13 != 1048575) {
                                    n = b.getInt(o, (long)n13);
                                }
                                n5 = n13;
                                n14 = n;
                            }
                            else {
                                n14 = n;
                            }
                            Label_0845: {
                                Label_0829: {
                                    Label_0823: {
                                        Label_0795: {
                                            Label_0759: {
                                                switch (b2) {
                                                    case 16: {
                                                        if (n8 == 0) {
                                                            n = ahbz.K(array, j, agxq);
                                                            b.putLong(o, d, agyh.L(agxq.b));
                                                            break Label_0759;
                                                        }
                                                        break;
                                                    }
                                                    case 15: {
                                                        if (n8 == 0) {
                                                            n = ahbz.H(array, j, agxq);
                                                            b.putInt(o, d, agyh.J(agxq.a));
                                                            break Label_0829;
                                                        }
                                                        break;
                                                    }
                                                    case 12: {
                                                        if (n8 == 0) {
                                                            n = ahbz.H(array, j, agxq);
                                                            b.putInt(o, d, agxq.a);
                                                            break Label_0829;
                                                        }
                                                        break;
                                                    }
                                                    case 10: {
                                                        if (n8 == 2) {
                                                            n = ahbz.q(array, j, agxq);
                                                            b.putObject(o, d, agxq.c);
                                                            break Label_0829;
                                                        }
                                                        break;
                                                    }
                                                    case 9: {
                                                        n = n9;
                                                        if (n8 == 2) {
                                                            final Object k = this.I(o, n);
                                                            final int m = ahbz.M(k, this.G(n), array, j, n2, agxq);
                                                            this.S(o, n, k);
                                                            n = m;
                                                            break Label_0829;
                                                        }
                                                        break;
                                                    }
                                                    case 8: {
                                                        n = j;
                                                        if (n8 == 2) {
                                                            if ((n10 & 0x20000000) == 0x0) {
                                                                n = ahbz.E(array, n, agxq);
                                                            }
                                                            else {
                                                                n = ahbz.F(array, n, agxq);
                                                            }
                                                            b.putObject(o, d, agxq.c);
                                                            break Label_0829;
                                                        }
                                                        break;
                                                    }
                                                    case 7: {
                                                        if (n8 == 0) {
                                                            n = ahbz.K(array, j, agxq);
                                                            ahcj.n(o, d, agxq.b != 0L);
                                                            break Label_0829;
                                                        }
                                                        break;
                                                    }
                                                    case 6:
                                                    case 13: {
                                                        if (n8 == 5) {
                                                            b.putInt(o, d, ahbz.r(array, j));
                                                            break Label_0795;
                                                        }
                                                        break;
                                                    }
                                                    case 5:
                                                    case 14: {
                                                        if (n8 == 1) {
                                                            b.putLong(o, d, ahbz.O(array, j));
                                                            break Label_0823;
                                                        }
                                                        break;
                                                    }
                                                    case 4:
                                                    case 11: {
                                                        if (n8 == 0) {
                                                            n = ahbz.H(array, j, agxq);
                                                            b.putInt(o, d, agxq.a);
                                                            break Label_0829;
                                                        }
                                                        break;
                                                    }
                                                    case 2:
                                                    case 3: {
                                                        if (n8 == 0) {
                                                            n = ahbz.K(array, j, agxq);
                                                            b.putLong(o, d, agxq.b);
                                                            break Label_0759;
                                                        }
                                                        break;
                                                    }
                                                    case 1: {
                                                        if (n8 == 5) {
                                                            ahcj.s(o, d, ahbz.p(array, j));
                                                            break Label_0795;
                                                        }
                                                        break;
                                                    }
                                                    case 0: {
                                                        if (n8 == 1) {
                                                            ahcj.r(o, d, ahbz.o(array, j));
                                                            break Label_0823;
                                                        }
                                                        break;
                                                    }
                                                }
                                                break Label_0845;
                                            }
                                            final int n15 = n14 | n12;
                                            i = n;
                                            n = n15;
                                            break Label_0987;
                                        }
                                        n = j + 4;
                                        break Label_0829;
                                    }
                                    n = j + 8;
                                }
                                final int n16 = n14 | n12;
                                i = n;
                                n = n16;
                                break Label_0987;
                            }
                            n = j;
                            n17 = n9;
                            n18 = n;
                            n = n14;
                            break Label_1176;
                        }
                        final int n19 = n9;
                        final int n20 = n7;
                        Label_1119: {
                            if (b2 == 27) {
                                if (n8 == 2) {
                                    agzy e;
                                    final agzy agzy = e = (agzy)b.getObject(o, d);
                                    if (!agzy.c()) {
                                        final int size = agzy.size();
                                        int n21;
                                        if (size == 0) {
                                            n21 = 10;
                                        }
                                        else {
                                            n21 = size + size;
                                        }
                                        e = agzy.e(n21);
                                        b.putObject(o, d, e);
                                    }
                                    i = ahbz.u(this.G(n19), a, array, j, n2, e, agxq);
                                    n9 = n19;
                                    break Label_0987;
                                }
                            }
                            else {
                                int n22 = 0;
                                Label_1063: {
                                    if (b2 <= 49) {
                                        final int w = this.w(o, array, j, n2, a, n20, n8, n19, n10, b2, d, agxq);
                                        if ((n22 = w) == j) {
                                            break Label_1063;
                                        }
                                        i = w;
                                    }
                                    else {
                                        final int n23 = j;
                                        if (b2 == 50) {
                                            if (n8 != 2) {
                                                break Label_1119;
                                            }
                                            i = this.u(o, array, n23, n2, n19, d, agxq);
                                            if ((n22 = i) == n23) {
                                                break Label_1063;
                                            }
                                        }
                                        else {
                                            i = this.v(o, array, n23, n2, a, n20, n8, n10, b2, d, n19, agxq);
                                            if ((n22 = i) == n23) {
                                                break Label_1063;
                                            }
                                        }
                                    }
                                    n4 = n9;
                                    n3 = n20;
                                    continue;
                                }
                                j = n22;
                            }
                        }
                        final int n24 = n9;
                        n18 = j;
                        n17 = n24;
                        break Label_1176;
                    }
                    n4 = n9;
                    n3 = n7;
                    continue;
                }
                final int n25 = 0;
                n18 = j;
                n17 = n25;
            }
            final int g = ahbz.G(a, array, n18, n2, d(o), agxq);
            n3 = n7;
            n4 = n17;
            i = g;
        }
        if (n5 != 1048575) {
            b.putInt(o, (long)n5, n);
        }
        if (i == n2) {
            return;
        }
        throw ahab.g();
    }
    
    private static final int ae(final Object o) {
        return aeda.aL(o).a();
    }
    
    private final Object af(Object o, int q, Object o2, final Object o3) {
        final int s = this.s(q);
        o = ahcj.i(o, D(this.C(q)));
        if (o == null) {
            return o2;
        }
        final agzo f = this.F(q);
        if (f == null) {
            return o2;
        }
        final ahas ahas = (ahas)o;
        final ahar d = ahbz.d(this.H(q));
        final Iterator iterator = ((Map)ahas).entrySet().iterator();
        while (iterator.hasNext()) {
            final Map.Entry<K, Integer> entry = (Map.Entry<K, Integer>)iterator.next();
            if (!f.isInRange((int)entry.getValue())) {
                if ((o = o2) == null) {
                    o = aeda.aN(o3);
                }
                q = agli.q(d, (Object)entry.getKey(), (Object)entry.getValue());
                final agyc b = agyc.b;
                final byte[] array = new byte[q];
                final agym ak = agym.ak(array);
                try {
                    agli.r(ak, d, (Object)entry.getKey(), (Object)entry.getValue());
                    aeda.aJ(o, s, ahbz.n(ak, array));
                    iterator.remove();
                    o2 = o;
                    continue;
                }
                catch (final IOException ex) {
                    throw new RuntimeException(ex);
                }
                break;
            }
        }
        return o2;
    }
    
    private final void ag(final Object o, final aglk aglk) {
        Iterator e = null;
        Map.Entry entry = null;
        Label_0044: {
            if (this.h) {
                final agyv j = ahbz.j(o);
                if (!j.i()) {
                    e = j.e();
                    entry = (Map.Entry)e.next();
                    break Label_0044;
                }
            }
            e = null;
            entry = null;
        }
        final int length = this.c.length;
        final Unsafe b = ahaz.b;
        int n = 0;
        int n2 = 1048575;
        int int1 = 0;
        Map.Entry entry2;
        while (true) {
            entry2 = entry;
            if (n >= length) {
                break;
            }
            final int c = this.C(n);
            final int s = this.s(n);
            final int b2 = B(c);
            int n6;
            if (b2 <= 17) {
                final int n3 = this.c[n + 2];
                final int n4 = n3 & 0xFFFFF;
                int n5;
                if (n4 != (n5 = n2)) {
                    int1 = b.getInt(o, (long)n4);
                    n5 = n4;
                }
                n6 = 1 << (n3 >>> 20);
                n2 = n5;
            }
            else {
                n6 = 0;
            }
            while (entry != null && ahbz.i(entry) <= s) {
                ahbz.P(aglk, entry);
                if (e.hasNext()) {
                    entry = (Map.Entry)e.next();
                }
                else {
                    entry = null;
                }
            }
            final long d = D(c);
            switch (b2) {
                case 68: {
                    if (this.aa(o, s, n)) {
                        aglk.i(s, b.getObject(o, d), this.G(n));
                        break;
                    }
                    break;
                }
                case 67: {
                    if (this.aa(o, s, n)) {
                        aglk.q(s, E(o, d));
                        break;
                    }
                    break;
                }
                case 66: {
                    if (this.aa(o, s, n)) {
                        aglk.p(s, t(o, d));
                        break;
                    }
                    break;
                }
                case 65: {
                    if (this.aa(o, s, n)) {
                        aglk.o(s, E(o, d));
                        break;
                    }
                    break;
                }
                case 64: {
                    if (this.aa(o, s, n)) {
                        aglk.n(s, t(o, d));
                        break;
                    }
                    break;
                }
                case 63: {
                    if (this.aa(o, s, n)) {
                        aglk.e(s, t(o, d));
                        break;
                    }
                    break;
                }
                case 62: {
                    if (this.aa(o, s, n)) {
                        aglk.s(s, t(o, d));
                        break;
                    }
                    break;
                }
                case 61: {
                    if (this.aa(o, s, n)) {
                        aglk.c(s, (agyc)b.getObject(o, d));
                        break;
                    }
                    break;
                }
                case 60: {
                    if (this.aa(o, s, n)) {
                        aglk.l(s, b.getObject(o, d), this.G(n));
                        break;
                    }
                    break;
                }
                case 59: {
                    if (this.aa(o, s, n)) {
                        ai(s, b.getObject(o, d), aglk);
                        break;
                    }
                    break;
                }
                case 58: {
                    if (this.aa(o, s, n)) {
                        aglk.b(s, ab(o, d));
                        break;
                    }
                    break;
                }
                case 57: {
                    if (this.aa(o, s, n)) {
                        aglk.f(s, t(o, d));
                        break;
                    }
                    break;
                }
                case 56: {
                    if (this.aa(o, s, n)) {
                        aglk.g(s, E(o, d));
                        break;
                    }
                    break;
                }
                case 55: {
                    if (this.aa(o, s, n)) {
                        aglk.j(s, t(o, d));
                        break;
                    }
                    break;
                }
                case 54: {
                    if (this.aa(o, s, n)) {
                        aglk.t(s, E(o, d));
                        break;
                    }
                    break;
                }
                case 53: {
                    if (this.aa(o, s, n)) {
                        aglk.k(s, E(o, d));
                        break;
                    }
                    break;
                }
                case 52: {
                    if (this.aa(o, s, n)) {
                        aglk.h(s, p(o, d));
                        break;
                    }
                    break;
                }
                case 51: {
                    if (this.aa(o, s, n)) {
                        aglk.d(s, o(o, d));
                        break;
                    }
                    break;
                }
                case 50: {
                    this.ah(aglk, s, b.getObject(o, d), n);
                    break;
                }
                case 49: {
                    ahbq.M(this.s(n), (List)b.getObject(o, d), aglk, this.G(n));
                    break;
                }
                case 48: {
                    ahbq.T(this.s(n), (List)b.getObject(o, d), aglk, true);
                    break;
                }
                case 47: {
                    ahbq.S(this.s(n), (List)b.getObject(o, d), aglk, true);
                    break;
                }
                case 46: {
                    ahbq.R(this.s(n), (List)b.getObject(o, d), aglk, true);
                    break;
                }
                case 45: {
                    ahbq.Q(this.s(n), (List)b.getObject(o, d), aglk, true);
                    break;
                }
                case 44: {
                    ahbq.I(this.s(n), (List)b.getObject(o, d), aglk, true);
                    break;
                }
                case 43: {
                    ahbq.V(this.s(n), (List)b.getObject(o, d), aglk, true);
                    break;
                }
                case 42: {
                    ahbq.F(this.s(n), (List)b.getObject(o, d), aglk, true);
                    break;
                }
                case 41: {
                    ahbq.J(this.s(n), (List)b.getObject(o, d), aglk, true);
                    break;
                }
                case 40: {
                    ahbq.K(this.s(n), (List)b.getObject(o, d), aglk, true);
                    break;
                }
                case 39: {
                    ahbq.N(this.s(n), (List)b.getObject(o, d), aglk, true);
                    break;
                }
                case 38: {
                    ahbq.W(this.s(n), (List)b.getObject(o, d), aglk, true);
                    break;
                }
                case 37: {
                    ahbq.O(this.s(n), (List)b.getObject(o, d), aglk, true);
                    break;
                }
                case 36: {
                    ahbq.L(this.s(n), (List)b.getObject(o, d), aglk, true);
                    break;
                }
                case 35: {
                    ahbq.H(this.s(n), (List)b.getObject(o, d), aglk, true);
                    break;
                }
                case 34: {
                    ahbq.T(this.s(n), (List)b.getObject(o, d), aglk, false);
                    break;
                }
                case 33: {
                    ahbq.S(this.s(n), (List)b.getObject(o, d), aglk, false);
                    break;
                }
                case 32: {
                    ahbq.R(this.s(n), (List)b.getObject(o, d), aglk, false);
                    break;
                }
                case 31: {
                    ahbq.Q(this.s(n), (List)b.getObject(o, d), aglk, false);
                    break;
                }
                case 30: {
                    ahbq.I(this.s(n), (List)b.getObject(o, d), aglk, false);
                    break;
                }
                case 29: {
                    ahbq.V(this.s(n), (List)b.getObject(o, d), aglk, false);
                    break;
                }
                case 28: {
                    ahbq.G(this.s(n), (List)b.getObject(o, d), aglk);
                    break;
                }
                case 27: {
                    ahbq.P(this.s(n), (List)b.getObject(o, d), aglk, this.G(n));
                    break;
                }
                case 26: {
                    ahbq.U(this.s(n), (List)b.getObject(o, d), aglk);
                    break;
                }
                case 25: {
                    ahbq.F(this.s(n), (List)b.getObject(o, d), aglk, false);
                    break;
                }
                case 24: {
                    ahbq.J(this.s(n), (List)b.getObject(o, d), aglk, false);
                    break;
                }
                case 23: {
                    ahbq.K(this.s(n), (List)b.getObject(o, d), aglk, false);
                    break;
                }
                case 22: {
                    ahbq.N(this.s(n), (List)b.getObject(o, d), aglk, false);
                    break;
                }
                case 21: {
                    ahbq.W(this.s(n), (List)b.getObject(o, d), aglk, false);
                    break;
                }
                case 20: {
                    ahbq.O(this.s(n), (List)b.getObject(o, d), aglk, false);
                    break;
                }
                case 19: {
                    ahbq.L(this.s(n), (List)b.getObject(o, d), aglk, false);
                    break;
                }
                case 18: {
                    ahbq.H(this.s(n), (List)b.getObject(o, d), aglk, false);
                    break;
                }
                case 17: {
                    if ((n6 & int1) != 0x0) {
                        aglk.i(s, b.getObject(o, d), this.G(n));
                        break;
                    }
                    break;
                }
                case 16: {
                    if ((n6 & int1) != 0x0) {
                        aglk.q(s, b.getLong(o, d));
                        break;
                    }
                    break;
                }
                case 15: {
                    if ((n6 & int1) != 0x0) {
                        aglk.p(s, b.getInt(o, d));
                        break;
                    }
                    break;
                }
                case 14: {
                    if ((n6 & int1) != 0x0) {
                        aglk.o(s, b.getLong(o, d));
                        break;
                    }
                    break;
                }
                case 13: {
                    if ((n6 & int1) != 0x0) {
                        aglk.n(s, b.getInt(o, d));
                        break;
                    }
                    break;
                }
                case 12: {
                    if ((n6 & int1) != 0x0) {
                        aglk.e(s, b.getInt(o, d));
                        break;
                    }
                    break;
                }
                case 11: {
                    if ((n6 & int1) != 0x0) {
                        aglk.s(s, b.getInt(o, d));
                        break;
                    }
                    break;
                }
                case 10: {
                    if ((n6 & int1) != 0x0) {
                        aglk.c(s, (agyc)b.getObject(o, d));
                        break;
                    }
                    break;
                }
                case 9: {
                    if ((n6 & int1) != 0x0) {
                        aglk.l(s, b.getObject(o, d), this.G(n));
                        break;
                    }
                    break;
                }
                case 8: {
                    if ((n6 & int1) != 0x0) {
                        ai(s, b.getObject(o, d), aglk);
                        break;
                    }
                    break;
                }
                case 7: {
                    if ((n6 & int1) != 0x0) {
                        aglk.b(s, ahcj.x(o, d));
                        break;
                    }
                    break;
                }
                case 6: {
                    if ((n6 & int1) != 0x0) {
                        aglk.f(s, b.getInt(o, d));
                        break;
                    }
                    break;
                }
                case 5: {
                    if ((n6 & int1) != 0x0) {
                        aglk.g(s, b.getLong(o, d));
                        break;
                    }
                    break;
                }
                case 4: {
                    if ((n6 & int1) != 0x0) {
                        aglk.j(s, b.getInt(o, d));
                        break;
                    }
                    break;
                }
                case 3: {
                    if ((n6 & int1) != 0x0) {
                        aglk.t(s, b.getLong(o, d));
                        break;
                    }
                    break;
                }
                case 2: {
                    if ((n6 & int1) != 0x0) {
                        aglk.k(s, b.getLong(o, d));
                        break;
                    }
                    break;
                }
                case 1: {
                    if ((n6 & int1) != 0x0) {
                        aglk.h(s, ahcj.c(o, d));
                        break;
                    }
                    break;
                }
                case 0: {
                    if ((n6 & int1) != 0x0) {
                        aglk.d(s, ahcj.b(o, d));
                        break;
                    }
                    break;
                }
            }
            n += 3;
        }
        while (entry2 != null) {
            ahbz.P(aglk, entry2);
            if (e.hasNext()) {
                entry2 = (Map.Entry)e.next();
            }
            else {
                entry2 = null;
            }
        }
        aj(o, aglk);
    }
    
    private final void ah(final aglk aglk, final int n, Object b, int q) {
        if (b != null) {
            final ahar d = ahbz.d(this.H(q));
            final ahas ahas = (ahas)b;
            b = aglk.b;
            for (final Map.Entry<Object, V> entry : ((Map)ahas).entrySet()) {
                ((agym)aglk.b).B(n, 2);
                final Object b2 = aglk.b;
                q = agli.q(d, entry.getKey(), (Object)entry.getValue());
                ((agym)b2).D(q);
                agli.r((agym)aglk.b, d, entry.getKey(), (Object)entry.getValue());
            }
        }
    }
    
    private static final void ai(final int n, final Object o, final aglk aglk) {
        if (o instanceof String) {
            aglk.r(n, (String)o);
            return;
        }
        aglk.c(n, (agyc)o);
    }
    
    private static final void aj(final Object o, final aglk aglk) {
        aeda.aL(o).i(aglk);
    }
    
    static ahcc d(final Object o) {
        final agzi agzi = (agzi)o;
        ahcc unknownFields;
        if ((unknownFields = agzi.unknownFields) == ahcc.a) {
            unknownFields = ahcc.c();
            agzi.unknownFields = unknownFields;
        }
        return unknownFields;
    }
    
    static ahaz m(final ahau ahau, final ahbz ahbz, final aham aham, final aeda aeda, final ahbz ahbz2, final ahbz ahbz3) {
        if (ahau instanceof ahbj) {
            return n((ahbj)ahau, aham, aeda, ahbz2, ahbz3);
        }
        final ahby ahby = (ahby)ahau;
        final boolean b = ahby.a == ahbg.b;
        final agyu[] c = ahby.c;
        final int length = c.length;
        int d;
        int d2;
        if (length == 0) {
            d = 0;
            d2 = 0;
        }
        else {
            d = c[0].d;
            d2 = c[length - 1].d;
        }
        final int[] array = new int[length * 3];
        final Object[] array2 = new Object[length + length];
        int i = 0;
        int n = 0;
        int n2 = 0;
        while (i < length) {
            final agyu agyu = c[i];
            int n3;
            int n4;
            if (agyu.b == agyx.Y) {
                n3 = n + 1;
                n4 = n2;
            }
            else {
                final int z = agyu.b.Z;
                n3 = n;
                n4 = n2;
                if (z >= 18) {
                    n3 = n;
                    n4 = n2;
                    if (z <= 49) {
                        n4 = n2 + 1;
                        n3 = n;
                    }
                }
            }
            ++i;
            n = n3;
            n2 = n4;
        }
        int[] array3;
        if (n > 0) {
            array3 = new int[n];
        }
        else {
            array3 = null;
        }
        int[] array4;
        if (n2 > 0) {
            array4 = new int[n2];
        }
        else {
            array4 = null;
        }
        int[] array5;
        if ((array5 = ahby.b) == null) {
            array5 = ahaz.a;
        }
        int j = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        final int n9 = d;
        while (j < c.length) {
            final agyu agyu2 = c[j];
            final int d3 = agyu2.d;
            final ahbd k = agyu2.i;
            int n10 = 0;
            int numberOfTrailingZeros = 0;
            int n12 = 0;
            int n13 = 0;
            Label_0470: {
                int z2;
                int n11;
                if (k != null) {
                    z2 = agyu2.b.Z + 51;
                    n10 = (int)ahcj.g((Field)k.b);
                    n11 = (int)ahcj.g((Field)k.a);
                    numberOfTrailingZeros = 0;
                }
                else {
                    final agyx b2 = agyu2.b;
                    n10 = (int)ahcj.g(agyu2.a);
                    z2 = b2.Z;
                    final agyw aa = b2.aa;
                    if (aa.e || aa == agyw.d) {
                        n12 = z2;
                        numberOfTrailingZeros = 0;
                        n13 = 0;
                        break Label_0470;
                    }
                    final Field e = agyu2.e;
                    if (e == null) {
                        n11 = 1048575;
                    }
                    else {
                        n11 = (int)ahcj.g(e);
                    }
                    numberOfTrailingZeros = Integer.numberOfTrailingZeros(agyu2.f);
                }
                final int n14 = n11;
                n12 = z2;
                n13 = n14;
            }
            array[n5] = agyu2.d;
            int n15;
            if (!agyu2.h) {
                n15 = 0;
            }
            else {
                n15 = 536870912;
            }
            int n16;
            if (!agyu2.g) {
                n16 = 0;
            }
            else {
                n16 = 268435456;
            }
            array[n5 + 1] = (n16 | n15 | n12 << 20 | n10);
            array[n5 + 2] = (numberOfTrailingZeros << 20 | n13);
            final int ordinal = agyu2.b.ordinal();
            Object o;
            if (ordinal != 9 && ordinal != 17) {
                if (ordinal != 27 && ordinal != 49) {
                    o = null;
                }
                else {
                    o = agyu2.c;
                }
            }
            else {
                final Field a = agyu2.a;
                if (a != null) {
                    o = a.getType();
                }
                else {
                    o = agyu2.j;
                }
            }
            final Object l = agyu2.k;
            if (l != null) {
                final int n17 = n5 / 3;
                final int n18 = n17 + n17;
                array2[n18] = l;
                if (o != null) {
                    array2[n18 + 1] = o;
                }
                else {
                    final agzo m = agyu2.l;
                    if (m != null) {
                        array2[n18 + 1] = m;
                    }
                }
            }
            else if (o != null) {
                final int n19 = n5 / 3;
                array2[n19 + n19 + 1] = o;
            }
            else {
                final agzo l2 = agyu2.l;
                if (l2 != null) {
                    final int n20 = n5 / 3;
                    array2[n20 + n20 + 1] = l2;
                }
            }
            int n21;
            if ((n21 = n6) < array5.length) {
                n21 = n6;
                if (array5[n6] == d3) {
                    array5[n6] = n5;
                    n21 = n6 + 1;
                }
            }
            final agyx b3 = agyu2.b;
            int n23 = 0;
            int n24 = 0;
            Label_0882: {
                int n22;
                if (b3 == agyx.Y) {
                    array3[n7] = n5;
                    n22 = n7 + 1;
                }
                else {
                    final int z3 = b3.Z;
                    n22 = n7;
                    if (z3 >= 18) {
                        n23 = n7;
                        n24 = n8;
                        if (z3 <= 49) {
                            array4[n8] = (int)ahcj.g(agyu2.a);
                            n24 = n8 + 1;
                            n23 = n7;
                        }
                        break Label_0882;
                    }
                }
                n23 = n22;
                n24 = n8;
            }
            ++j;
            n5 += 3;
            n6 = n21;
            n7 = n23;
            n8 = n24;
        }
        int[] a2;
        if ((a2 = array3) == null) {
            a2 = ahaz.a;
        }
        int[] a3;
        if ((a3 = array4) == null) {
            a3 = ahaz.a;
        }
        final int length2 = array5.length;
        final int length3 = a2.length;
        final int n25 = length2 + length3;
        final int length4 = a3.length;
        final int[] array6 = new int[n25 + length4];
        System.arraycopy(array5, 0, array6, 0, length2);
        System.arraycopy(a2, 0, array6, length2, length3);
        System.arraycopy(a3, 0, array6, n25, length4);
        return new ahaz(array, array2, n9, d2, ahby.d, b, true, array6, length2, n25, aham, aeda, ahbz2, null, null, null, null, null, null);
    }
    
    static ahaz n(final ahbj ahbj, final aham aham, final aeda aeda, final ahbz ahbz, final ahbz ahbz2) {
        final ahbg b = ahbj.b();
        final ahbg b2 = ahbg.b;
        int n = 0;
        final boolean b3 = b == b2;
        final String b4 = ahbj.b;
        final int length = b4.length();
        int n4;
        if (b4.charAt(0) >= '\ud800') {
            int n2 = 1;
            while (true) {
                final int n3 = n4 = n2 + 1;
                if (b4.charAt(n2) < '\ud800') {
                    break;
                }
                n2 = n3;
            }
        }
        else {
            n4 = 1;
        }
        final int n5 = n4 + 1;
        final char char1 = b4.charAt(n4);
        int n6 = n5;
        int n7;
        if ((n7 = char1) >= 55296) {
            int n8 = char1 & '\u1fff';
            int n9 = 13;
            int n10 = n5;
            int n11;
            char char2;
            while (true) {
                n11 = n10 + 1;
                char2 = b4.charAt(n10);
                if (char2 < '\ud800') {
                    break;
                }
                n8 |= (char2 & '\u1fff') << n9;
                n9 += 13;
                n10 = n11;
            }
            n7 = (n8 | char2 << n9);
            n6 = n11;
        }
        int[] a;
        int n12;
        int n13;
        int n14;
        int n15;
        int n16;
        int n17;
        if (n7 == 0) {
            a = ahaz.a;
            n12 = 0;
            n13 = 0;
            n14 = 0;
            n15 = 0;
            n16 = 0;
            n17 = 0;
        }
        else {
            final int n18 = n6 + 1;
            int char3;
            final char c = (char)(char3 = b4.charAt(n6));
            int n19 = n18;
            if (c >= '\ud800') {
                int n20 = c & '\u1fff';
                int n21 = 13;
                int n22 = n18;
                int n23;
                char char4;
                while (true) {
                    n23 = n22 + 1;
                    char4 = b4.charAt(n22);
                    if (char4 < '\ud800') {
                        break;
                    }
                    n20 |= (char4 & '\u1fff') << n21;
                    n21 += 13;
                    n22 = n23;
                }
                char3 = (n20 | char4 << n21);
                n19 = n23;
            }
            final int n24 = n19 + 1;
            int char5;
            final char c2 = (char)(char5 = b4.charAt(n19));
            int n25 = n24;
            if (c2 >= '\ud800') {
                int n26 = c2 & '\u1fff';
                int n27 = 13;
                int n28 = n24;
                int n29;
                char char6;
                while (true) {
                    n29 = n28 + 1;
                    char6 = b4.charAt(n28);
                    if (char6 < '\ud800') {
                        break;
                    }
                    n26 |= (char6 & '\u1fff') << n27;
                    n27 += 13;
                    n28 = n29;
                }
                char5 = (n26 | char6 << n27);
                n25 = n29;
            }
            final int n30 = n25 + 1;
            int char7;
            final char c3 = (char)(char7 = b4.charAt(n25));
            int n31 = n30;
            if (c3 >= '\ud800') {
                int n32 = c3 & '\u1fff';
                int n33 = 13;
                int n34 = n30;
                int n35;
                char char8;
                while (true) {
                    n35 = n34 + 1;
                    char8 = b4.charAt(n34);
                    if (char8 < '\ud800') {
                        break;
                    }
                    n32 |= (char8 & '\u1fff') << n33;
                    n33 += 13;
                    n34 = n35;
                }
                char7 = (n32 | char8 << n33);
                n31 = n35;
            }
            final int n36 = n31 + 1;
            int char9;
            final char c4 = (char)(char9 = b4.charAt(n31));
            int n37 = n36;
            if (c4 >= '\ud800') {
                final int n38 = c4 & '\u1fff';
                int n39 = 13;
                int n40 = n36;
                int n41 = n38;
                int n42;
                char char10;
                while (true) {
                    n42 = n40 + 1;
                    char10 = b4.charAt(n40);
                    if (char10 < '\ud800') {
                        break;
                    }
                    n41 |= (char10 & '\u1fff') << n39;
                    n39 += 13;
                    n40 = n42;
                }
                final int n43 = n41 | char10 << n39;
                n37 = n42;
                char9 = n43;
            }
            final int n44 = n37 + 1;
            int char11;
            final char c5 = (char)(char11 = b4.charAt(n37));
            int n45 = n44;
            if (c5 >= '\ud800') {
                int n46 = c5 & '\u1fff';
                int n47 = 13;
                int n48 = n44;
                int n49;
                char char12;
                while (true) {
                    n49 = n48 + 1;
                    char12 = b4.charAt(n48);
                    if (char12 < '\ud800') {
                        break;
                    }
                    n46 |= (char12 & '\u1fff') << n47;
                    n47 += 13;
                    n48 = n49;
                }
                char11 = (n46 | char12 << n47);
                n45 = n49;
            }
            final int n50 = n45 + 1;
            int char13;
            final char c6 = (char)(char13 = b4.charAt(n45));
            int n51 = n50;
            if (c6 >= '\ud800') {
                int n52 = c6 & '\u1fff';
                int n53 = 13;
                int n54 = n50;
                int n55;
                char char14;
                while (true) {
                    n55 = n54 + 1;
                    char14 = b4.charAt(n54);
                    if (char14 < '\ud800') {
                        break;
                    }
                    n52 |= (char14 & '\u1fff') << n53;
                    n53 += 13;
                    n54 = n55;
                }
                char13 = (n52 | char14 << n53);
                n51 = n55;
            }
            final int n56 = n51 + 1;
            int char15;
            final char c7 = (char)(char15 = b4.charAt(n51));
            int n57 = n56;
            if (c7 >= '\ud800') {
                int n58 = c7 & '\u1fff';
                int n59 = 13;
                int n60 = n56;
                int n61;
                char char16;
                while (true) {
                    n61 = n60 + 1;
                    char16 = b4.charAt(n60);
                    if (char16 < '\ud800') {
                        break;
                    }
                    n58 |= (char16 & '\u1fff') << n59;
                    n59 += 13;
                    n60 = n61;
                }
                char15 = (n58 | char16 << n59);
                n57 = n61;
            }
            final int n62 = n57 + 1;
            int char17;
            final char c8 = (char)(char17 = b4.charAt(n57));
            int n63 = n62;
            if (c8 >= '\ud800') {
                final int n64 = c8 & '\u1fff';
                int n65 = n62;
                int n66 = 13;
                int n67 = n64;
                int n68;
                char char18;
                while (true) {
                    n68 = n65 + 1;
                    char18 = b4.charAt(n65);
                    if (char18 < '\ud800') {
                        break;
                    }
                    n67 |= (char18 & '\u1fff') << n66;
                    n66 += 13;
                    n65 = n68;
                }
                final int n69 = n67 | char18 << n66;
                n63 = n68;
                char17 = n69;
            }
            a = new int[char17 + char13 + char15];
            final int n70 = char13;
            n16 = char9;
            final int n71 = char3 + char3 + char5;
            final int n72 = char3;
            n6 = n63;
            n17 = char17;
            n15 = char11;
            n14 = n71;
            n13 = char7;
            n12 = n70;
            n = n72;
        }
        final Unsafe b5 = ahaz.b;
        final Object[] c9 = ahbj.c;
        final Class<? extends MessageLite> class1 = ahbj.a.getClass();
        final int[] array = new int[n15 * 3];
        final Object[] array2 = new Object[n15 + n15];
        final int n73 = n17 + n12;
        final int n74 = n17;
        final int n75 = n6;
        int n76 = n73;
        int n77 = 0;
        int n78 = 0;
        int n79 = n74;
        int n80 = n16;
        final int n81 = n13;
        int n94;
        int n97;
        int n111;
        int n114;
        int n115;
        int n140;
        for (int i = n75; i < length; i = n140, n14 = n111, n80 = n94, n78 = n97, n79 = n114, n76 = n115) {
            int n82 = i + 1;
            int char19 = b4.charAt(i);
            int n87;
            if (char19 >= 55296) {
                int n83 = char19 & 0x1FFF;
                int n84 = n82;
                int n85 = 13;
                int n86;
                char char20;
                while (true) {
                    n86 = n84 + 1;
                    char20 = b4.charAt(n84);
                    n87 = n17;
                    if (char20 < '\ud800') {
                        break;
                    }
                    n83 |= (char20 & '\u1fff') << n85;
                    n85 += 13;
                    n17 = n87;
                    n84 = n86;
                }
                final int n88 = n83 | char20 << n85;
                n82 = n86;
                char19 = n88;
            }
            else {
                n87 = n17;
            }
            final int n89 = n82 + 1;
            int char21 = b4.charAt(n82);
            int n95;
            if (char21 >= 55296) {
                int n90 = char21 & 0x1FFF;
                int n91 = n89;
                int n92 = 13;
                int n93;
                char char22;
                while (true) {
                    n93 = n91 + 1;
                    char22 = b4.charAt(n91);
                    n94 = n80;
                    if (char22 < '\ud800') {
                        break;
                    }
                    n90 |= (char22 & '\u1fff') << n92;
                    n92 += 13;
                    n80 = n94;
                    n91 = n93;
                }
                char21 = (n90 | char22 << n92);
                n95 = n93;
            }
            else {
                n94 = n80;
                n95 = n89;
            }
            final int n96 = char21 & 0xFF;
            n97 = n78;
            if ((char21 & 0x400) != 0x0) {
                a[n78] = n77;
                n97 = n78 + 1;
            }
            int n108;
            int n109;
            int n112;
            int n113;
            if (n96 >= 51) {
                int n98 = n95 + 1;
                int char23 = b4.charAt(n95);
                int n102;
                if (char23 >= 55296) {
                    int n99 = 13;
                    int n100 = char23 & 0x1FFF;
                    int n101;
                    char char24;
                    while (true) {
                        n101 = n98 + 1;
                        char24 = b4.charAt(n98);
                        if (char24 < '\ud800') {
                            break;
                        }
                        n100 |= (char24 & '\u1fff') << n99;
                        n99 += 13;
                        n98 = n101;
                    }
                    char23 = (n100 | char24 << n99);
                    n102 = n101;
                }
                else {
                    n102 = n98;
                }
                final int n103 = n96 - 51;
                int n104;
                if (n103 != 9 && n103 != 17) {
                    n104 = n14;
                    if (n103 == 12) {
                        n104 = n14;
                        if (!b3) {
                            final int n105 = n77 / 3;
                            n104 = n14 + 1;
                            array2[n105 + n105 + 1] = c9[n14];
                        }
                    }
                }
                else {
                    final int n106 = n77 / 3;
                    n104 = n14 + 1;
                    array2[n106 + n106 + 1] = c9[n14];
                }
                int n107 = char23 + char23;
                final Object o = c9[n107];
                Field k;
                if (o instanceof Field) {
                    k = (Field)o;
                }
                else {
                    k = K(class1, (String)o);
                    c9[n107] = k;
                }
                n108 = (int)b5.objectFieldOffset(k);
                ++n107;
                final Object o2 = c9[n107];
                Field j;
                if (o2 instanceof Field) {
                    j = (Field)o2;
                }
                else {
                    j = K(class1, (String)o2);
                    c9[n107] = j;
                }
                n109 = (int)b5.objectFieldOffset(j);
                final int n110 = n102;
                n111 = n104;
                n112 = 0;
                n113 = n110;
                n114 = n79;
                n115 = n76;
            }
            else {
                final int n116 = n14 + 1;
                final Field l = K(class1, (String)c9[n14]);
                int n117 = 0;
                if (n96 != 9 && n96 != 17) {
                    Label_2148: {
                        if (n96 != 27 && n96 != 49) {
                            int n118;
                            if (n96 != 12 && n96 != 30 && n96 != 44) {
                                n117 = n116;
                                n118 = n79;
                                if (n96 == 50) {
                                    final int n119 = n79 + 1;
                                    a[n79] = n77;
                                    final int n120 = n77 / 3;
                                    final int n121 = n120 + n120;
                                    final int n122 = n116 + 1;
                                    array2[n121] = c9[n116];
                                    if ((char21 & 0x800) != 0x0) {
                                        final int n123 = n122 + 1;
                                        array2[n121 + 1] = c9[n122];
                                        n118 = n119;
                                        n117 = n123;
                                    }
                                    else {
                                        n118 = n119;
                                        n117 = n122;
                                    }
                                }
                            }
                            else {
                                n117 = n116;
                                n118 = n79;
                                if (!b3) {
                                    final int n124 = n77 / 3;
                                    n117 = n116 + 1;
                                    array2[n124 + n124 + 1] = c9[n116];
                                    break Label_2148;
                                }
                            }
                            n79 = n118;
                        }
                        else {
                            final int n125 = n77 / 3;
                            n117 = n116 + 1;
                            array2[n125 + n125 + 1] = c9[n116];
                        }
                    }
                }
                else {
                    final int n126 = n77 / 3;
                    array2[n126 + n126 + 1] = l.getType();
                    n117 = n116;
                }
                final int n127 = (int)b5.objectFieldOffset(l);
                int n128 = 1048575;
                final int n129 = n117;
                int n135;
                if ((char21 & 0x1000) == 0x1000 && n96 <= 17) {
                    int n130 = n95 + 1;
                    int char25 = b4.charAt(n95);
                    if (char25 >= 55296) {
                        int n131 = char25 & 0x1FFF;
                        int n132 = 13;
                        int n133 = n130;
                        char char26;
                        while (true) {
                            n130 = n133 + 1;
                            char26 = b4.charAt(n133);
                            if (char26 < '\ud800') {
                                break;
                            }
                            n131 |= (char26 & '\u1fff') << n132;
                            n132 += 13;
                            n133 = n130;
                        }
                        char25 = (n131 | char26 << n132);
                    }
                    final int n134 = n + n + char25 / 32;
                    final Object o3 = c9[n134];
                    Field m;
                    if (o3 instanceof Field) {
                        m = (Field)o3;
                    }
                    else {
                        m = K(class1, (String)o3);
                        c9[n134] = m;
                    }
                    n128 = (int)b5.objectFieldOffset(m);
                    n135 = char25 % 32;
                    n95 = n130;
                }
                else {
                    n135 = 0;
                }
                n112 = n135;
                n108 = n127;
                n113 = n95;
                n114 = n79;
                n115 = n76;
                n109 = n128;
                n111 = n129;
                if (n96 >= 18) {
                    n112 = n135;
                    n108 = n127;
                    n113 = n95;
                    n114 = n79;
                    n115 = n76;
                    n109 = n128;
                    n111 = n129;
                    if (n96 <= 49) {
                        a[n76] = n127;
                        n115 = n76 + 1;
                        n111 = n129;
                        n109 = n128;
                        n114 = n79;
                        n113 = n95;
                        n108 = n127;
                        n112 = n135;
                    }
                }
            }
            final int n136 = n77 + 1;
            array[n77] = char19;
            final int n137 = n136 + 1;
            int n138;
            if ((char21 & 0x200) != 0x0) {
                n138 = 536870912;
            }
            else {
                n138 = 0;
            }
            int n139;
            if ((char21 & 0x100) != 0x0) {
                n139 = 268435456;
            }
            else {
                n139 = 0;
            }
            array[n136] = (n138 | n139 | n96 << 20 | n108);
            n77 = n137 + 1;
            array[n137] = (n112 << 20 | n109);
            n140 = n113;
            n17 = n87;
        }
        return new ahaz(array, array2, n81, n80, ahbj.a, b3, false, a, n17, n73, aham, aeda, ahbz, null, null, null, null, null, null);
    }
    
    private static double o(final Object o, final long n) {
        return (double)ahcj.i(o, n);
    }
    
    private static float p(final Object o, final long n) {
        return (float)ahcj.i(o, n);
    }
    
    private final int q(final Object o) {
        final Unsafe b = ahaz.b;
        int i = 0;
        int n = 0;
        int n2 = 1048575;
        int int1 = 0;
        while (i < this.c.length) {
            final int c = this.C(i);
            final int s = this.s(i);
            final int b2 = B(c);
            int n6;
            int n7;
            int n8;
            if (b2 <= 17) {
                final int n3 = this.c[i + 2];
                final int n4 = n3 & 0xFFFFF;
                final int n5 = 1 << (n3 >>> 20);
                n6 = n2;
                n7 = n3;
                n8 = n5;
                if (n4 != n2) {
                    int1 = b.getInt(o, (long)n4);
                    n6 = n4;
                    n7 = n3;
                    n8 = n5;
                }
            }
            else {
                int n9;
                if (this.k && b2 >= agyx.J.Z && b2 <= agyx.W.Z) {
                    n9 = (this.c[i + 2] & 0xFFFFF);
                }
                else {
                    n9 = 0;
                }
                n8 = 0;
                n7 = n9;
                n6 = n2;
            }
            final long d = D(c);
            int n10 = 0;
            Label_2904: {
                int n11 = 0;
                Label_2375: {
                    int n12 = 0;
                    int n13 = 0;
                    int ae2 = 0;
                    switch (b2) {
                        default: {
                            n10 = n;
                            break Label_2904;
                        }
                        case 68: {
                            n10 = n;
                            if (this.aa(o, s, i)) {
                                n11 = agym.L(s, (MessageLite)b.getObject(o, d), this.G(i));
                                break Label_2375;
                            }
                            break Label_2904;
                        }
                        case 67: {
                            n10 = n;
                            if (this.aa(o, s, i)) {
                                n11 = agym.Y(s, E(o, d));
                                break Label_2375;
                            }
                            break Label_2904;
                        }
                        case 66: {
                            n10 = n;
                            if (this.aa(o, s, i)) {
                                n11 = agym.W(s, t(o, d));
                                break Label_2375;
                            }
                            break Label_2904;
                        }
                        case 65: {
                            n10 = n;
                            if (this.aa(o, s, i)) {
                                n11 = agym.aE(s);
                                break Label_2375;
                            }
                            break Label_2904;
                        }
                        case 64: {
                            n10 = n;
                            if (this.aa(o, s, i)) {
                                n11 = agym.aD(s);
                                break Label_2375;
                            }
                            break Label_2904;
                        }
                        case 63: {
                            n10 = n;
                            if (this.aa(o, s, i)) {
                                n11 = agym.K(s, t(o, d));
                                break Label_2375;
                            }
                            break Label_2904;
                        }
                        case 62: {
                            n10 = n;
                            if (this.aa(o, s, i)) {
                                n11 = agym.ad(s, t(o, d));
                                break Label_2375;
                            }
                            break Label_2904;
                        }
                        case 61: {
                            n10 = n;
                            if (this.aa(o, s, i)) {
                                n11 = agym.I(s, (agyc)b.getObject(o, d));
                                break Label_2375;
                            }
                            break Label_2904;
                        }
                        case 60: {
                            n10 = n;
                            if (this.aa(o, s, i)) {
                                n11 = ahbq.i(s, b.getObject(o, d), this.G(i));
                                break Label_2375;
                            }
                            break Label_2904;
                        }
                        case 59: {
                            n10 = n;
                            if (!this.aa(o, s, i)) {
                                break Label_2904;
                            }
                            final Object object = b.getObject(o, d);
                            if (object instanceof agyc) {
                                n11 = agym.I(s, (agyc)object);
                                break Label_2375;
                            }
                            n11 = agym.aa(s, (String)object);
                            break Label_2375;
                        }
                        case 58: {
                            n10 = n;
                            if (this.aa(o, s, i)) {
                                n11 = agym.ay(s);
                                break Label_2375;
                            }
                            break Label_2904;
                        }
                        case 57: {
                            n10 = n;
                            if (this.aa(o, s, i)) {
                                n11 = agym.aA(s);
                                break Label_2375;
                            }
                            break Label_2904;
                        }
                        case 56: {
                            n10 = n;
                            if (this.aa(o, s, i)) {
                                n11 = agym.aB(s);
                                break Label_2375;
                            }
                            break Label_2904;
                        }
                        case 55: {
                            n10 = n;
                            if (this.aa(o, s, i)) {
                                n11 = agym.N(s, t(o, d));
                                break Label_2375;
                            }
                            break Label_2904;
                        }
                        case 54: {
                            n10 = n;
                            if (this.aa(o, s, i)) {
                                n11 = agym.af(s, E(o, d));
                                break Label_2375;
                            }
                            break Label_2904;
                        }
                        case 53: {
                            n10 = n;
                            if (this.aa(o, s, i)) {
                                n11 = agym.P(s, E(o, d));
                                break Label_2375;
                            }
                            break Label_2904;
                        }
                        case 52: {
                            n10 = n;
                            if (this.aa(o, s, i)) {
                                n11 = agym.aC(s);
                                break Label_2375;
                            }
                            break Label_2904;
                        }
                        case 51: {
                            n10 = n;
                            if (this.aa(o, s, i)) {
                                n11 = agym.az(s);
                                break Label_2375;
                            }
                            break Label_2904;
                        }
                        case 50: {
                            n11 = ahbz.e(s, b.getObject(o, d), this.H(i));
                            break Label_2375;
                        }
                        case 49: {
                            n11 = ahbq.f(s, (List)b.getObject(o, d), this.G(i));
                            break Label_2375;
                        }
                        case 48: {
                            final int l = ahbq.l((List)b.getObject(o, d));
                            n10 = n;
                            if (l > 0) {
                                if (this.k) {
                                    b.putInt(o, (long)n7, l);
                                }
                                n12 = agym.ac(s);
                                final int ae = agym.ae(l);
                                n13 = l;
                                ae2 = ae;
                                break;
                            }
                            break Label_2904;
                        }
                        case 47: {
                            final int k = ahbq.k((List)b.getObject(o, d));
                            n10 = n;
                            if (k > 0) {
                                if (this.k) {
                                    b.putInt(o, (long)n7, k);
                                }
                                n12 = agym.ac(s);
                                final int ae3 = agym.ae(k);
                                n13 = k;
                                ae2 = ae3;
                                break;
                            }
                            break Label_2904;
                        }
                        case 46: {
                            final int e = ahbq.e((List)b.getObject(o, d));
                            n10 = n;
                            if (e > 0) {
                                if (this.k) {
                                    b.putInt(o, (long)n7, e);
                                }
                                n12 = agym.ac(s);
                                final int ae4 = agym.ae(e);
                                n13 = e;
                                ae2 = ae4;
                                break;
                            }
                            break Label_2904;
                        }
                        case 45: {
                            final int d2 = ahbq.d((List)b.getObject(o, d));
                            n10 = n;
                            if (d2 > 0) {
                                if (this.k) {
                                    b.putInt(o, (long)n7, d2);
                                }
                                n12 = agym.ac(s);
                                final int ae5 = agym.ae(d2);
                                n13 = d2;
                                ae2 = ae5;
                                break;
                            }
                            break Label_2904;
                        }
                        case 44: {
                            final int c2 = ahbq.c((List)b.getObject(o, d));
                            n10 = n;
                            if (c2 > 0) {
                                if (this.k) {
                                    b.putInt(o, (long)n7, c2);
                                }
                                n12 = agym.ac(s);
                                final int ae6 = agym.ae(c2);
                                n13 = c2;
                                ae2 = ae6;
                                break;
                            }
                            break Label_2904;
                        }
                        case 43: {
                            final int n14 = ahbq.n((List)b.getObject(o, d));
                            n10 = n;
                            if (n14 > 0) {
                                if (this.k) {
                                    b.putInt(o, (long)n7, n14);
                                }
                                n12 = agym.ac(s);
                                final int ae7 = agym.ae(n14);
                                n13 = n14;
                                ae2 = ae7;
                                break;
                            }
                            break Label_2904;
                        }
                        case 42: {
                            final int a = ahbq.a((List)b.getObject(o, d));
                            n10 = n;
                            if (a > 0) {
                                if (this.k) {
                                    b.putInt(o, (long)n7, a);
                                }
                                n12 = agym.ac(s);
                                final int ae8 = agym.ae(a);
                                n13 = a;
                                ae2 = ae8;
                                break;
                            }
                            break Label_2904;
                        }
                        case 41: {
                            final int d3 = ahbq.d((List)b.getObject(o, d));
                            n10 = n;
                            if (d3 > 0) {
                                if (this.k) {
                                    b.putInt(o, (long)n7, d3);
                                }
                                n12 = agym.ac(s);
                                final int ae9 = agym.ae(d3);
                                n13 = d3;
                                ae2 = ae9;
                                break;
                            }
                            break Label_2904;
                        }
                        case 40: {
                            final int e2 = ahbq.e((List)b.getObject(o, d));
                            n10 = n;
                            if (e2 > 0) {
                                if (this.k) {
                                    b.putInt(o, (long)n7, e2);
                                }
                                n12 = agym.ac(s);
                                final int ae10 = agym.ae(e2);
                                n13 = e2;
                                ae2 = ae10;
                                break;
                            }
                            break Label_2904;
                        }
                        case 39: {
                            final int g = ahbq.g((List)b.getObject(o, d));
                            n10 = n;
                            if (g > 0) {
                                if (this.k) {
                                    b.putInt(o, (long)n7, g);
                                }
                                n12 = agym.ac(s);
                                final int ae11 = agym.ae(g);
                                n13 = g;
                                ae2 = ae11;
                                break;
                            }
                            break Label_2904;
                        }
                        case 38: {
                            final int o2 = ahbq.o((List)b.getObject(o, d));
                            n10 = n;
                            if (o2 > 0) {
                                if (this.k) {
                                    b.putInt(o, (long)n7, o2);
                                }
                                n12 = agym.ac(s);
                                final int ae12 = agym.ae(o2);
                                n13 = o2;
                                ae2 = ae12;
                                break;
                            }
                            break Label_2904;
                        }
                        case 37: {
                            final int h = ahbq.h((List)b.getObject(o, d));
                            n10 = n;
                            if (h > 0) {
                                if (this.k) {
                                    b.putInt(o, (long)n7, h);
                                }
                                n12 = agym.ac(s);
                                final int ae13 = agym.ae(h);
                                n13 = h;
                                ae2 = ae13;
                                break;
                            }
                            break Label_2904;
                        }
                        case 36: {
                            final int d4 = ahbq.d((List)b.getObject(o, d));
                            n10 = n;
                            if (d4 > 0) {
                                if (this.k) {
                                    b.putInt(o, (long)n7, d4);
                                }
                                n12 = agym.ac(s);
                                final int ae14 = agym.ae(d4);
                                n13 = d4;
                                ae2 = ae14;
                                break;
                            }
                            break Label_2904;
                        }
                        case 35: {
                            final int e3 = ahbq.e((List)b.getObject(o, d));
                            n10 = n;
                            if (e3 > 0) {
                                if (this.k) {
                                    b.putInt(o, (long)n7, e3);
                                }
                                n12 = agym.ac(s);
                                ae2 = agym.ae(e3);
                                n13 = e3;
                                break;
                            }
                            break Label_2904;
                        }
                        case 34: {
                            n11 = ahbq.y(s, (List)b.getObject(o, d));
                            break Label_2375;
                        }
                        case 33: {
                            n11 = ahbq.x(s, (List)b.getObject(o, d));
                            break Label_2375;
                        }
                        case 32: {
                            n11 = ahbq.u(s, (List)b.getObject(o, d));
                            break Label_2375;
                        }
                        case 31: {
                            n11 = ahbq.t(s, (List)b.getObject(o, d));
                            break Label_2375;
                        }
                        case 30: {
                            n11 = ahbq.s(s, (List)b.getObject(o, d));
                            break Label_2375;
                        }
                        case 29: {
                            n11 = ahbq.z(s, (List)b.getObject(o, d));
                            break Label_2375;
                        }
                        case 28: {
                            n11 = ahbq.b(s, (List)b.getObject(o, d));
                            break Label_2375;
                        }
                        case 27: {
                            n11 = ahbq.j(s, (List)b.getObject(o, d), this.G(i));
                            break Label_2375;
                        }
                        case 26: {
                            n11 = ahbq.m(s, (List)b.getObject(o, d));
                            break Label_2375;
                        }
                        case 25: {
                            n11 = ahbq.r(s, (List)b.getObject(o, d));
                            break Label_2375;
                        }
                        case 24: {
                            n11 = ahbq.t(s, (List)b.getObject(o, d));
                            break Label_2375;
                        }
                        case 23: {
                            n11 = ahbq.u(s, (List)b.getObject(o, d));
                            break Label_2375;
                        }
                        case 22: {
                            n11 = ahbq.v(s, (List)b.getObject(o, d));
                            break Label_2375;
                        }
                        case 21: {
                            n11 = ahbq.A(s, (List)b.getObject(o, d));
                            break Label_2375;
                        }
                        case 20: {
                            n11 = ahbq.w(s, (List)b.getObject(o, d));
                            break Label_2375;
                        }
                        case 19: {
                            n11 = ahbq.t(s, (List)b.getObject(o, d));
                            break Label_2375;
                        }
                        case 18: {
                            n11 = ahbq.u(s, (List)b.getObject(o, d));
                            break Label_2375;
                        }
                        case 17: {
                            n10 = n;
                            if ((int1 & n8) != 0x0) {
                                n11 = agym.L(s, (MessageLite)b.getObject(o, d), this.G(i));
                                break Label_2375;
                            }
                            break Label_2904;
                        }
                        case 16: {
                            n10 = n;
                            if ((int1 & n8) != 0x0) {
                                n11 = agym.Y(s, b.getLong(o, d));
                                break Label_2375;
                            }
                            break Label_2904;
                        }
                        case 15: {
                            n10 = n;
                            if ((int1 & n8) != 0x0) {
                                n11 = agym.W(s, b.getInt(o, d));
                                break Label_2375;
                            }
                            break Label_2904;
                        }
                        case 14: {
                            n10 = n;
                            if ((int1 & n8) != 0x0) {
                                n11 = agym.aE(s);
                                break Label_2375;
                            }
                            break Label_2904;
                        }
                        case 13: {
                            n10 = n;
                            if ((int1 & n8) != 0x0) {
                                n11 = agym.aD(s);
                                break Label_2375;
                            }
                            break Label_2904;
                        }
                        case 12: {
                            n10 = n;
                            if ((int1 & n8) != 0x0) {
                                n11 = agym.K(s, b.getInt(o, d));
                                break Label_2375;
                            }
                            break Label_2904;
                        }
                        case 11: {
                            n10 = n;
                            if ((int1 & n8) != 0x0) {
                                n11 = agym.ad(s, b.getInt(o, d));
                                break Label_2375;
                            }
                            break Label_2904;
                        }
                        case 10: {
                            n10 = n;
                            if ((int1 & n8) != 0x0) {
                                n11 = agym.I(s, (agyc)b.getObject(o, d));
                                break Label_2375;
                            }
                            break Label_2904;
                        }
                        case 9: {
                            n10 = n;
                            if ((int1 & n8) != 0x0) {
                                n11 = ahbq.i(s, b.getObject(o, d), this.G(i));
                                break Label_2375;
                            }
                            break Label_2904;
                        }
                        case 8: {
                            n10 = n;
                            if ((int1 & n8) == 0x0) {
                                break Label_2904;
                            }
                            final Object object2 = b.getObject(o, d);
                            if (object2 instanceof agyc) {
                                n11 = agym.I(s, (agyc)object2);
                                break Label_2375;
                            }
                            n11 = agym.aa(s, (String)object2);
                            break Label_2375;
                        }
                        case 7: {
                            n10 = n;
                            if ((int1 & n8) != 0x0) {
                                n11 = agym.ay(s);
                                break Label_2375;
                            }
                            break Label_2904;
                        }
                        case 6: {
                            n10 = n;
                            if ((int1 & n8) != 0x0) {
                                n11 = agym.aA(s);
                                break Label_2375;
                            }
                            break Label_2904;
                        }
                        case 5: {
                            n10 = n;
                            if ((int1 & n8) != 0x0) {
                                n11 = agym.aB(s);
                                break Label_2375;
                            }
                            break Label_2904;
                        }
                        case 4: {
                            n10 = n;
                            if ((int1 & n8) != 0x0) {
                                n11 = agym.N(s, b.getInt(o, d));
                                break Label_2375;
                            }
                            break Label_2904;
                        }
                        case 3: {
                            n10 = n;
                            if ((int1 & n8) != 0x0) {
                                n11 = agym.af(s, b.getLong(o, d));
                                break Label_2375;
                            }
                            break Label_2904;
                        }
                        case 2: {
                            n10 = n;
                            if ((int1 & n8) != 0x0) {
                                n11 = agym.P(s, b.getLong(o, d));
                                break Label_2375;
                            }
                            break Label_2904;
                        }
                        case 1: {
                            n10 = n;
                            if ((int1 & n8) != 0x0) {
                                n11 = agym.aC(s);
                                break Label_2375;
                            }
                            break Label_2904;
                        }
                        case 0: {
                            n10 = n;
                            if ((int1 & n8) != 0x0) {
                                n11 = agym.az(s);
                                break Label_2375;
                            }
                            break Label_2904;
                        }
                    }
                    n10 = n + (n12 + ae2 + n13);
                    break Label_2904;
                }
                n10 = n + n11;
            }
            i += 3;
            n = n10;
            n2 = n6;
        }
        int n15 = n + ae(o);
        if (this.h) {
            final agyv j = ahbz.j(o);
            int n16 = 0;
            int n17 = 0;
            while (n16 < j.b.a()) {
                final Map.Entry f = j.b.f(n16);
                n17 += agyv.k((agzf)f.getKey(), f.getValue());
                ++n16;
            }
            for (final Map.Entry<agzf, V> entry : j.b.c()) {
                n17 += agyv.k((agzf)entry.getKey(), (Object)entry.getValue());
            }
            n15 += n17;
        }
        return n15;
    }
    
    private final int r(final Object o) {
        final Unsafe b = ahaz.b;
        int i = 0;
        int n = 0;
        while (i < this.c.length) {
            final int c = this.C(i);
            final int b2 = B(c);
            final int s = this.s(i);
            final long d = D(c);
            int n2;
            if (b2 >= agyx.J.Z && b2 <= agyx.W.Z) {
                n2 = (this.c[i + 2] & 0xFFFFF);
            }
            else {
                n2 = 0;
            }
            int n3 = 0;
            Label_2731: {
                int n4 = 0;
                Label_2195: {
                    int n5 = 0;
                    int n6 = 0;
                    int ae2 = 0;
                    switch (b2) {
                        default: {
                            n3 = n;
                            break Label_2731;
                        }
                        case 68: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = agym.L(s, (MessageLite)ahcj.i(o, d), this.G(i));
                                break Label_2195;
                            }
                            break Label_2731;
                        }
                        case 67: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = agym.Y(s, E(o, d));
                                break Label_2195;
                            }
                            break Label_2731;
                        }
                        case 66: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = agym.W(s, t(o, d));
                                break Label_2195;
                            }
                            break Label_2731;
                        }
                        case 65: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = agym.aE(s);
                                break Label_2195;
                            }
                            break Label_2731;
                        }
                        case 64: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = agym.aD(s);
                                break Label_2195;
                            }
                            break Label_2731;
                        }
                        case 63: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = agym.K(s, t(o, d));
                                break Label_2195;
                            }
                            break Label_2731;
                        }
                        case 62: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = agym.ad(s, t(o, d));
                                break Label_2195;
                            }
                            break Label_2731;
                        }
                        case 61: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = agym.I(s, (agyc)ahcj.i(o, d));
                                break Label_2195;
                            }
                            break Label_2731;
                        }
                        case 60: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = ahbq.i(s, ahcj.i(o, d), this.G(i));
                                break Label_2195;
                            }
                            break Label_2731;
                        }
                        case 59: {
                            n3 = n;
                            if (!this.aa(o, s, i)) {
                                break Label_2731;
                            }
                            final Object j = ahcj.i(o, d);
                            if (j instanceof agyc) {
                                n4 = agym.I(s, (agyc)j);
                                break Label_2195;
                            }
                            n4 = agym.aa(s, (String)j);
                            break Label_2195;
                        }
                        case 58: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = agym.ay(s);
                                break Label_2195;
                            }
                            break Label_2731;
                        }
                        case 57: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = agym.aA(s);
                                break Label_2195;
                            }
                            break Label_2731;
                        }
                        case 56: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = agym.aB(s);
                                break Label_2195;
                            }
                            break Label_2731;
                        }
                        case 55: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = agym.N(s, t(o, d));
                                break Label_2195;
                            }
                            break Label_2731;
                        }
                        case 54: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = agym.af(s, E(o, d));
                                break Label_2195;
                            }
                            break Label_2731;
                        }
                        case 53: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = agym.P(s, E(o, d));
                                break Label_2195;
                            }
                            break Label_2731;
                        }
                        case 52: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = agym.aC(s);
                                break Label_2195;
                            }
                            break Label_2731;
                        }
                        case 51: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = agym.az(s);
                                break Label_2195;
                            }
                            break Label_2731;
                        }
                        case 50: {
                            n4 = ahbz.e(s, ahcj.i(o, d), this.H(i));
                            break Label_2195;
                        }
                        case 49: {
                            n4 = ahbq.f(s, L(o, d), this.G(i));
                            break Label_2195;
                        }
                        case 48: {
                            final int l = ahbq.l((List)b.getObject(o, d));
                            n3 = n;
                            if (l > 0) {
                                if (this.k) {
                                    b.putInt(o, (long)n2, l);
                                }
                                n5 = agym.ac(s);
                                final int ae = agym.ae(l);
                                n6 = l;
                                ae2 = ae;
                                break;
                            }
                            break Label_2731;
                        }
                        case 47: {
                            final int k = ahbq.k((List)b.getObject(o, d));
                            n3 = n;
                            if (k > 0) {
                                if (this.k) {
                                    b.putInt(o, (long)n2, k);
                                }
                                n5 = agym.ac(s);
                                final int ae3 = agym.ae(k);
                                n6 = k;
                                ae2 = ae3;
                                break;
                            }
                            break Label_2731;
                        }
                        case 46: {
                            final int e = ahbq.e((List)b.getObject(o, d));
                            n3 = n;
                            if (e > 0) {
                                if (this.k) {
                                    b.putInt(o, (long)n2, e);
                                }
                                n5 = agym.ac(s);
                                final int ae4 = agym.ae(e);
                                n6 = e;
                                ae2 = ae4;
                                break;
                            }
                            break Label_2731;
                        }
                        case 45: {
                            final int d2 = ahbq.d((List)b.getObject(o, d));
                            n3 = n;
                            if (d2 > 0) {
                                if (this.k) {
                                    b.putInt(o, (long)n2, d2);
                                }
                                n5 = agym.ac(s);
                                final int ae5 = agym.ae(d2);
                                n6 = d2;
                                ae2 = ae5;
                                break;
                            }
                            break Label_2731;
                        }
                        case 44: {
                            final int c2 = ahbq.c((List)b.getObject(o, d));
                            n3 = n;
                            if (c2 > 0) {
                                if (this.k) {
                                    b.putInt(o, (long)n2, c2);
                                }
                                n5 = agym.ac(s);
                                final int ae6 = agym.ae(c2);
                                n6 = c2;
                                ae2 = ae6;
                                break;
                            }
                            break Label_2731;
                        }
                        case 43: {
                            final int n7 = ahbq.n((List)b.getObject(o, d));
                            n3 = n;
                            if (n7 > 0) {
                                if (this.k) {
                                    b.putInt(o, (long)n2, n7);
                                }
                                n5 = agym.ac(s);
                                final int ae7 = agym.ae(n7);
                                n6 = n7;
                                ae2 = ae7;
                                break;
                            }
                            break Label_2731;
                        }
                        case 42: {
                            final int a = ahbq.a((List)b.getObject(o, d));
                            n3 = n;
                            if (a > 0) {
                                if (this.k) {
                                    b.putInt(o, (long)n2, a);
                                }
                                n5 = agym.ac(s);
                                final int ae8 = agym.ae(a);
                                n6 = a;
                                ae2 = ae8;
                                break;
                            }
                            break Label_2731;
                        }
                        case 41: {
                            final int d3 = ahbq.d((List)b.getObject(o, d));
                            n3 = n;
                            if (d3 > 0) {
                                if (this.k) {
                                    b.putInt(o, (long)n2, d3);
                                }
                                n5 = agym.ac(s);
                                final int ae9 = agym.ae(d3);
                                n6 = d3;
                                ae2 = ae9;
                                break;
                            }
                            break Label_2731;
                        }
                        case 40: {
                            final int e2 = ahbq.e((List)b.getObject(o, d));
                            n3 = n;
                            if (e2 > 0) {
                                if (this.k) {
                                    b.putInt(o, (long)n2, e2);
                                }
                                n5 = agym.ac(s);
                                final int ae10 = agym.ae(e2);
                                n6 = e2;
                                ae2 = ae10;
                                break;
                            }
                            break Label_2731;
                        }
                        case 39: {
                            final int g = ahbq.g((List)b.getObject(o, d));
                            n3 = n;
                            if (g > 0) {
                                if (this.k) {
                                    b.putInt(o, (long)n2, g);
                                }
                                n5 = agym.ac(s);
                                final int ae11 = agym.ae(g);
                                n6 = g;
                                ae2 = ae11;
                                break;
                            }
                            break Label_2731;
                        }
                        case 38: {
                            final int o2 = ahbq.o((List)b.getObject(o, d));
                            n3 = n;
                            if (o2 > 0) {
                                if (this.k) {
                                    b.putInt(o, (long)n2, o2);
                                }
                                n5 = agym.ac(s);
                                final int ae12 = agym.ae(o2);
                                n6 = o2;
                                ae2 = ae12;
                                break;
                            }
                            break Label_2731;
                        }
                        case 37: {
                            final int h = ahbq.h((List)b.getObject(o, d));
                            n3 = n;
                            if (h > 0) {
                                if (this.k) {
                                    b.putInt(o, (long)n2, h);
                                }
                                n5 = agym.ac(s);
                                final int ae13 = agym.ae(h);
                                n6 = h;
                                ae2 = ae13;
                                break;
                            }
                            break Label_2731;
                        }
                        case 36: {
                            final int d4 = ahbq.d((List)b.getObject(o, d));
                            n3 = n;
                            if (d4 > 0) {
                                if (this.k) {
                                    b.putInt(o, (long)n2, d4);
                                }
                                n5 = agym.ac(s);
                                final int ae14 = agym.ae(d4);
                                n6 = d4;
                                ae2 = ae14;
                                break;
                            }
                            break Label_2731;
                        }
                        case 35: {
                            final int e3 = ahbq.e((List)b.getObject(o, d));
                            n3 = n;
                            if (e3 > 0) {
                                if (this.k) {
                                    b.putInt(o, (long)n2, e3);
                                }
                                n5 = agym.ac(s);
                                ae2 = agym.ae(e3);
                                n6 = e3;
                                break;
                            }
                            break Label_2731;
                        }
                        case 34: {
                            n4 = ahbq.y(s, L(o, d));
                            break Label_2195;
                        }
                        case 33: {
                            n4 = ahbq.x(s, L(o, d));
                            break Label_2195;
                        }
                        case 32: {
                            n4 = ahbq.u(s, L(o, d));
                            break Label_2195;
                        }
                        case 31: {
                            n4 = ahbq.t(s, L(o, d));
                            break Label_2195;
                        }
                        case 30: {
                            n4 = ahbq.s(s, L(o, d));
                            break Label_2195;
                        }
                        case 29: {
                            n4 = ahbq.z(s, L(o, d));
                            break Label_2195;
                        }
                        case 28: {
                            n4 = ahbq.b(s, L(o, d));
                            break Label_2195;
                        }
                        case 27: {
                            n4 = ahbq.j(s, L(o, d), this.G(i));
                            break Label_2195;
                        }
                        case 26: {
                            n4 = ahbq.m(s, L(o, d));
                            break Label_2195;
                        }
                        case 25: {
                            n4 = ahbq.r(s, L(o, d));
                            break Label_2195;
                        }
                        case 24: {
                            n4 = ahbq.t(s, L(o, d));
                            break Label_2195;
                        }
                        case 23: {
                            n4 = ahbq.u(s, L(o, d));
                            break Label_2195;
                        }
                        case 22: {
                            n4 = ahbq.v(s, L(o, d));
                            break Label_2195;
                        }
                        case 21: {
                            n4 = ahbq.A(s, L(o, d));
                            break Label_2195;
                        }
                        case 20: {
                            n4 = ahbq.w(s, L(o, d));
                            break Label_2195;
                        }
                        case 19: {
                            n4 = ahbq.t(s, L(o, d));
                            break Label_2195;
                        }
                        case 18: {
                            n4 = ahbq.u(s, L(o, d));
                            break Label_2195;
                        }
                        case 17: {
                            n3 = n;
                            if (this.W(o, i)) {
                                n4 = agym.L(s, (MessageLite)ahcj.i(o, d), this.G(i));
                                break Label_2195;
                            }
                            break Label_2731;
                        }
                        case 16: {
                            n3 = n;
                            if (this.W(o, i)) {
                                n4 = agym.Y(s, ahcj.f(o, d));
                                break Label_2195;
                            }
                            break Label_2731;
                        }
                        case 15: {
                            n3 = n;
                            if (this.W(o, i)) {
                                n4 = agym.W(s, ahcj.d(o, d));
                                break Label_2195;
                            }
                            break Label_2731;
                        }
                        case 14: {
                            n3 = n;
                            if (this.W(o, i)) {
                                n4 = agym.aE(s);
                                break Label_2195;
                            }
                            break Label_2731;
                        }
                        case 13: {
                            n3 = n;
                            if (this.W(o, i)) {
                                n4 = agym.aD(s);
                                break Label_2195;
                            }
                            break Label_2731;
                        }
                        case 12: {
                            n3 = n;
                            if (this.W(o, i)) {
                                n4 = agym.K(s, ahcj.d(o, d));
                                break Label_2195;
                            }
                            break Label_2731;
                        }
                        case 11: {
                            n3 = n;
                            if (this.W(o, i)) {
                                n4 = agym.ad(s, ahcj.d(o, d));
                                break Label_2195;
                            }
                            break Label_2731;
                        }
                        case 10: {
                            n3 = n;
                            if (this.W(o, i)) {
                                n4 = agym.I(s, (agyc)ahcj.i(o, d));
                                break Label_2195;
                            }
                            break Label_2731;
                        }
                        case 9: {
                            n3 = n;
                            if (this.W(o, i)) {
                                n4 = ahbq.i(s, ahcj.i(o, d), this.G(i));
                                break Label_2195;
                            }
                            break Label_2731;
                        }
                        case 8: {
                            n3 = n;
                            if (!this.W(o, i)) {
                                break Label_2731;
                            }
                            final Object m = ahcj.i(o, d);
                            if (m instanceof agyc) {
                                n4 = agym.I(s, (agyc)m);
                                break Label_2195;
                            }
                            n4 = agym.aa(s, (String)m);
                            break Label_2195;
                        }
                        case 7: {
                            n3 = n;
                            if (this.W(o, i)) {
                                n4 = agym.ay(s);
                                break Label_2195;
                            }
                            break Label_2731;
                        }
                        case 6: {
                            n3 = n;
                            if (this.W(o, i)) {
                                n4 = agym.aA(s);
                                break Label_2195;
                            }
                            break Label_2731;
                        }
                        case 5: {
                            n3 = n;
                            if (this.W(o, i)) {
                                n4 = agym.aB(s);
                                break Label_2195;
                            }
                            break Label_2731;
                        }
                        case 4: {
                            n3 = n;
                            if (this.W(o, i)) {
                                n4 = agym.N(s, ahcj.d(o, d));
                                break Label_2195;
                            }
                            break Label_2731;
                        }
                        case 3: {
                            n3 = n;
                            if (this.W(o, i)) {
                                n4 = agym.af(s, ahcj.f(o, d));
                                break Label_2195;
                            }
                            break Label_2731;
                        }
                        case 2: {
                            n3 = n;
                            if (this.W(o, i)) {
                                n4 = agym.P(s, ahcj.f(o, d));
                                break Label_2195;
                            }
                            break Label_2731;
                        }
                        case 1: {
                            n3 = n;
                            if (this.W(o, i)) {
                                n4 = agym.aC(s);
                                break Label_2195;
                            }
                            break Label_2731;
                        }
                        case 0: {
                            n3 = n;
                            if (this.W(o, i)) {
                                n4 = agym.az(s);
                                break Label_2195;
                            }
                            break Label_2731;
                        }
                    }
                    n4 = n5 + ae2 + n6;
                }
                n3 = n + n4;
            }
            i += 3;
            n = n3;
        }
        return n + ae(o);
    }
    
    private final int s(final int n) {
        return this.c[n];
    }
    
    private static int t(final Object o, final long n) {
        return (int)ahcj.i(o, n);
    }
    
    private final int u(Object o, final byte[] array, int i, final int n, int n2, final long n3, final agxq agxq) {
        final Unsafe b = ahaz.b;
        final Object h = this.H(n2);
        Object o3;
        final Object o2 = o3 = b.getObject(o, n3);
        if (ahbz.f(o2)) {
            o3 = ahbz.h();
            ahbz.g(o3, o2);
            b.putObject(o, n3, o3);
        }
        final ahar d = ahbz.d(h);
        final ahas ahas = (ahas)o3;
        i = ahbz.H(array, i, agxq);
        n2 = agxq.a;
        if (n2 < 0 || n2 > n - i) {
            throw ahab.j();
        }
        final int n4 = i + n2;
        Object o4 = d.a;
        o = d.b;
        while (i < n4) {
            final int n5 = i + 1;
            final int n6 = n2 = array[i];
            i = n5;
            if (n6 < 0) {
                i = ahbz.I(n6, array, n5, agxq);
                n2 = agxq.a;
            }
            final int n7 = n2 & 0x7;
            final int n8 = n2 >>> 3;
            if (n8 != 1) {
                if (n8 == 2) {
                    final ahcm ahcm = (ahcm)d.d;
                    if (n7 == ahcm.t) {
                        i = ac(array, i, n, ahcm, d.b.getClass(), agxq);
                        o = agxq.c;
                        continue;
                    }
                }
            }
            else {
                final ahcm ahcm2 = (ahcm)d.c;
                if (n7 == ahcm2.t) {
                    i = ac(array, i, n, ahcm2, null, agxq);
                    o4 = agxq.c;
                    continue;
                }
            }
            i = ahbz.N(n2, array, i, n, agxq);
        }
        if (i == n4) {
            ((Map<Object, Object>)ahas).put(o4, o);
            return n4;
        }
        throw ahab.g();
    }
    
    private final int v(final Object o, final byte[] array, int n, int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final long n8, final int n9, final agxq agxq) {
        final Unsafe b = ahaz.b;
        final long n10 = this.c[n9 + 2] & 0xFFFFF;
        switch (n7) {
            case 68: {
                if (n5 != 3) {
                    break;
                }
                final Object j = this.J(o, n4, n9);
                n = ahbz.L(j, this.G(n9), array, n, n2, (n3 & 0xFFFFFFF8) | 0x4, agxq);
                this.T(o, n4, n9, j);
                return n;
            }
            case 67: {
                if (n5 != 0) {
                    break;
                }
                n = ahbz.K(array, n, agxq);
                b.putObject(o, n8, agyh.L(agxq.b));
                b.putInt(o, n10, n4);
                return n;
            }
            case 66: {
                if (n5 != 0) {
                    break;
                }
                n = ahbz.H(array, n, agxq);
                b.putObject(o, n8, agyh.J(agxq.a));
                b.putInt(o, n10, n4);
                return n;
            }
            case 63: {
                if (n5 == 0) {
                    n = ahbz.H(array, n, agxq);
                    n2 = agxq.a;
                    final agzo f = this.F(n9);
                    if (f != null && !f.isInRange(n2)) {
                        d(o).g(n3, (Object)(long)n2);
                    }
                    else {
                        b.putObject(o, n8, n2);
                        b.putInt(o, n10, n4);
                    }
                    break;
                }
                break;
            }
            case 61: {
                if (n5 != 2) {
                    break;
                }
                n = ahbz.q(array, n, agxq);
                b.putObject(o, n8, agxq.c);
                b.putInt(o, n10, n4);
                return n;
            }
            case 60: {
                if (n5 != 2) {
                    break;
                }
                final Object i = this.J(o, n4, n9);
                n = ahbz.M(i, this.G(n9), array, n, n2, agxq);
                this.T(o, n4, n9, i);
                return n;
            }
            case 59: {
                if (n5 == 2) {
                    n = ahbz.H(array, n, agxq);
                    n2 = agxq.a;
                    if (n2 == 0) {
                        b.putObject(o, n8, "");
                    }
                    else {
                        if ((n6 & 0x20000000) != 0x0 && !ahcl.h(array, n, n + n2)) {
                            throw ahab.d();
                        }
                        b.putObject(o, n8, new String(array, n, n2, agzz.a));
                        n += n2;
                    }
                    b.putInt(o, n10, n4);
                    break;
                }
                break;
            }
            case 58: {
                if (n5 == 0) {
                    n = ahbz.K(array, n, agxq);
                    b.putObject(o, n8, agxq.b != 0L);
                    b.putInt(o, n10, n4);
                    return n;
                }
                break;
            }
            case 57:
            case 64: {
                if (n5 != 5) {
                    break;
                }
                b.putObject(o, n8, ahbz.r(array, n));
                b.putInt(o, n10, n4);
                return n + 4;
            }
            case 56:
            case 65: {
                if (n5 != 1) {
                    break;
                }
                b.putObject(o, n8, ahbz.O(array, n));
                b.putInt(o, n10, n4);
                return n + 8;
            }
            case 55:
            case 62: {
                if (n5 != 0) {
                    break;
                }
                n = ahbz.H(array, n, agxq);
                b.putObject(o, n8, agxq.a);
                b.putInt(o, n10, n4);
                return n;
            }
            case 53:
            case 54: {
                if (n5 != 0) {
                    break;
                }
                n = ahbz.K(array, n, agxq);
                b.putObject(o, n8, agxq.b);
                b.putInt(o, n10, n4);
                return n;
            }
            case 52: {
                if (n5 != 5) {
                    break;
                }
                b.putObject(o, n8, ahbz.p(array, n));
                b.putInt(o, n10, n4);
                return n + 4;
            }
            case 51: {
                if (n5 != 1) {
                    break;
                }
                b.putObject(o, n8, ahbz.o(array, n));
                b.putInt(o, n10, n4);
                return n + 8;
            }
        }
        return n;
    }
    
    private final int w(final Object o, final byte[] array, int i, final int n, final int n2, int n3, int n4, final int n5, final long n6, int n7, final long n8, final agxq agxq) {
        int n9 = i;
        final Unsafe b = ahaz.b;
        agzy e;
        final agzy agzy = e = (agzy)b.getObject(o, n8);
        if (!agzy.c()) {
            final int size = agzy.size();
            int n10;
            if (size == 0) {
                n10 = 10;
            }
            else {
                n10 = size + size;
            }
            e = agzy.e(n10);
            b.putObject(o, n8, e);
        }
        Label_1916: {
            switch (n7) {
                default: {
                    n7 = n9;
                    if (n4 == 3) {
                        final ahbp g = this.G(n5);
                        n3 = ((n2 & 0xFFFFFFF8) | 0x4);
                        i = ahbz.s(g, array, i, n, n3, agxq);
                        e.add(agxq.c);
                        while (i < n) {
                            n4 = ahbz.H(array, i, agxq);
                            if (n2 != agxq.a) {
                                break;
                            }
                            i = ahbz.s(g, array, n4, n, n3, agxq);
                            e.add(agxq.c);
                        }
                        return i;
                    }
                    break;
                }
                case 34:
                case 48: {
                    if (n4 == 2) {
                        i = ahbz.B(array, n9, e, agxq);
                        return i;
                    }
                    n7 = n9;
                    if (n4 == 0) {
                        final ahan ahan = (ahan)e;
                        i = ahbz.K(array, n9, agxq);
                        ahan.f(agyh.L(agxq.b));
                        while (i < n) {
                            n3 = ahbz.H(array, i, agxq);
                            if (n2 != agxq.a) {
                                break;
                            }
                            i = ahbz.K(array, n3, agxq);
                            ahan.f(agyh.L(agxq.b));
                        }
                        return i;
                    }
                    break;
                }
                case 33:
                case 47: {
                    if (n4 == 2) {
                        i = ahbz.A(array, n9, e, agxq);
                        return i;
                    }
                    n7 = n9;
                    if (n4 == 0) {
                        final agzj agzj = (agzj)e;
                        i = ahbz.H(array, n9, agxq);
                        agzj.g(agyh.J(agxq.a));
                        while (i < n) {
                            n3 = ahbz.H(array, i, agxq);
                            if (n2 != agxq.a) {
                                break;
                            }
                            i = ahbz.H(array, n3, agxq);
                            agzj.g(agyh.J(agxq.a));
                        }
                        return i;
                    }
                    break;
                }
                case 30:
                case 44: {
                    if (n4 == 2) {
                        i = ahbz.C(array, n9, e, agxq);
                    }
                    else {
                        n7 = n9;
                        if (n4 != 0) {
                            break;
                        }
                        i = ahbz.J(n2, array, i, n, e, agxq);
                    }
                    ahbq.Y(o, n3, (List)e, this.F(n5), (Object)null, this.p);
                    return i;
                }
                case 28: {
                    n7 = n9;
                    if (n4 != 2) {
                        break;
                    }
                    i = ahbz.H(array, n9, agxq);
                    n3 = agxq.a;
                    if (n3 < 0) {
                        throw ahab.f();
                    }
                    if (n3 <= array.length - i) {
                        while (true) {
                            Label_0639: {
                                if (n3 != 0) {
                                    e.add((Object)agyc.z(array, i, n3));
                                    break Label_0639;
                                }
                                e.add((Object)agyc.b);
                                while (i < n) {
                                    n3 = ahbz.H(array, i, agxq);
                                    if (n2 != agxq.a) {
                                        break;
                                    }
                                    i = ahbz.H(array, n3, agxq);
                                    n3 = agxq.a;
                                    if (n3 < 0) {
                                        throw ahab.f();
                                    }
                                    if (n3 > array.length - i) {
                                        throw ahab.j();
                                    }
                                    if (n3 != 0) {
                                        e.add((Object)agyc.z(array, i, n3));
                                        break Label_0639;
                                    }
                                    e.add((Object)agyc.b);
                                }
                                return i;
                            }
                            i += n3;
                            continue;
                        }
                    }
                    throw ahab.j();
                }
                case 27: {
                    if (n4 != 2) {
                        n7 = n9;
                        break;
                    }
                    return ahbz.u(this.G(n5), n2, array, i, n, e, agxq);
                }
                case 26: {
                    n7 = n9;
                    if (n4 != 2) {
                        break;
                    }
                    if ((n6 & 0x20000000L) == 0x0L) {
                        i = ahbz.H(array, n9, agxq);
                        n3 = agxq.a;
                        if (n3 >= 0) {
                            while (true) {
                                Label_0873: {
                                    if (n3 != 0) {
                                        e.add((Object)new String(array, i, n3, agzz.a));
                                        break Label_0873;
                                    }
                                    e.add((Object)"");
                                    while (true) {
                                        n7 = i;
                                        if (i >= n) {
                                            break Label_1916;
                                        }
                                        n3 = ahbz.H(array, i, agxq);
                                        n7 = i;
                                        if (n2 != agxq.a) {
                                            break Label_1916;
                                        }
                                        i = ahbz.H(array, n3, agxq);
                                        n3 = agxq.a;
                                        if (n3 < 0) {
                                            throw ahab.f();
                                        }
                                        if (n3 != 0) {
                                            e.add((Object)new String(array, i, n3, agzz.a));
                                            break;
                                        }
                                        e.add((Object)"");
                                    }
                                }
                                i += n3;
                                continue;
                            }
                        }
                        throw ahab.f();
                    }
                    else {
                        n3 = ahbz.H(array, n9, agxq);
                        n4 = agxq.a;
                        if (n4 < 0) {
                            throw ahab.f();
                        }
                        if (n4 == 0) {
                            e.add((Object)"");
                            i = n3;
                        }
                        else {
                            i = n3 + n4;
                            if (!ahcl.h(array, n3, i)) {
                                throw ahab.d();
                            }
                            e.add((Object)new String(array, n3, n4, agzz.a));
                        }
                        while (true) {
                            n7 = i;
                            if (i >= n) {
                                break Label_1916;
                            }
                            n3 = ahbz.H(array, i, agxq);
                            n7 = i;
                            if (n2 != agxq.a) {
                                break Label_1916;
                            }
                            i = ahbz.H(array, n3, agxq);
                            n4 = agxq.a;
                            if (n4 < 0) {
                                throw ahab.f();
                            }
                            if (n4 == 0) {
                                e.add((Object)"");
                            }
                            else {
                                n3 = i + n4;
                                if (!ahcl.h(array, i, n3)) {
                                    throw ahab.d();
                                }
                                e.add((Object)new String(array, i, n4, agzz.a));
                                i = n3;
                            }
                        }
                    }
                    break;
                }
                case 25:
                case 42: {
                    if (n4 == 2) {
                        i = ahbz.v(array, n9, e, agxq);
                        return i;
                    }
                    n7 = n9;
                    if (n4 == 0) {
                        final agxt agxt = (agxt)e;
                        i = ahbz.K(array, n9, agxq);
                        agxt.f(agxq.b != 0L);
                        while (i < n) {
                            n3 = ahbz.H(array, i, agxq);
                            if (n2 != agxq.a) {
                                break;
                            }
                            i = ahbz.K(array, n3, agxq);
                            agxt.f(agxq.b != 0L);
                        }
                        return i;
                    }
                    break;
                }
                case 24:
                case 31:
                case 41:
                case 45: {
                    if (n4 == 2) {
                        i = ahbz.x(array, n9, e, agxq);
                        return i;
                    }
                    n7 = n9;
                    if (n4 == 5) {
                        final agzj agzj2 = (agzj)e;
                        agzj2.g(ahbz.r(array, i));
                        while (true) {
                            i = n9 + 4;
                            if (i >= n) {
                                break;
                            }
                            n9 = ahbz.H(array, i, agxq);
                            if (n2 != agxq.a) {
                                break;
                            }
                            agzj2.g(ahbz.r(array, n9));
                        }
                        return i;
                    }
                    break;
                }
                case 23:
                case 32:
                case 40:
                case 46: {
                    if (n4 == 2) {
                        i = ahbz.y(array, n9, e, agxq);
                        return i;
                    }
                    n7 = n9;
                    if (n4 == 1) {
                        final ahan ahan2 = (ahan)e;
                        ahan2.f(ahbz.O(array, i));
                        while (true) {
                            i = n9 + 8;
                            if (i >= n) {
                                break;
                            }
                            n9 = ahbz.H(array, i, agxq);
                            if (n2 != agxq.a) {
                                break;
                            }
                            ahan2.f(ahbz.O(array, n9));
                        }
                        return i;
                    }
                    break;
                }
                case 22:
                case 29:
                case 39:
                case 43: {
                    if (n4 == 2) {
                        i = ahbz.C(array, n9, e, agxq);
                        return i;
                    }
                    if (n4 != 0) {
                        n7 = n9;
                        break;
                    }
                    return ahbz.J(n2, array, i, n, e, agxq);
                }
                case 20:
                case 21:
                case 37:
                case 38: {
                    if (n4 == 2) {
                        i = ahbz.D(array, n9, e, agxq);
                        return i;
                    }
                    n7 = n9;
                    if (n4 == 0) {
                        final ahan ahan3 = (ahan)e;
                        i = ahbz.K(array, n9, agxq);
                        ahan3.f(agxq.b);
                        while (i < n) {
                            n3 = ahbz.H(array, i, agxq);
                            if (n2 != agxq.a) {
                                break;
                            }
                            i = ahbz.K(array, n3, agxq);
                            ahan3.f(agxq.b);
                        }
                        return i;
                    }
                    break;
                }
                case 19:
                case 36: {
                    if (n4 == 2) {
                        i = ahbz.z(array, n9, e, agxq);
                        return i;
                    }
                    n7 = n9;
                    if (n4 == 5) {
                        final agyy agyy = (agyy)e;
                        agyy.h(ahbz.p(array, i));
                        while (true) {
                            i = n9 + 4;
                            if (i >= n) {
                                break;
                            }
                            n9 = ahbz.H(array, i, agxq);
                            if (n2 != agxq.a) {
                                break;
                            }
                            agyy.h(ahbz.p(array, n9));
                        }
                        return i;
                    }
                    break;
                }
                case 18:
                case 35: {
                    if (n4 == 2) {
                        i = ahbz.w(array, n9, e, agxq);
                        return i;
                    }
                    n7 = n9;
                    if (n4 == 1) {
                        final agyn agyn = (agyn)e;
                        agyn.f(ahbz.o(array, i));
                        while (true) {
                            i = n9 + 8;
                            if (i >= n) {
                                break;
                            }
                            n9 = ahbz.H(array, i, agxq);
                            if (n2 != agxq.a) {
                                break;
                            }
                            agyn.f(ahbz.o(array, n9));
                        }
                        return i;
                    }
                    break;
                }
            }
        }
        i = n7;
        return i;
    }
    
    private final int x(final int n) {
        if (n >= this.e && n <= this.f) {
            return this.A(n, 0);
        }
        return -1;
    }
    
    private final int y(final int n, final int n2) {
        if (n >= this.e && n <= this.f) {
            return this.A(n, n2);
        }
        return -1;
    }
    
    private final int z(final int n) {
        return this.c[n + 2];
    }
    
    public final int a(final Object o) {
        int n;
        if (this.j) {
            n = this.r(o);
        }
        else {
            n = this.q(o);
        }
        return n;
    }
    
    public final int b(final Object o) {
        final int length = this.c.length;
        int i = 0;
        int n = 0;
        while (i < length) {
            final int c = this.C(i);
            final int s = this.s(i);
            final long d = D(c);
            final int b = B(c);
            int n2 = 37;
            int n3 = 0;
            Label_1409: {
                int n4 = 0;
                int n5 = 0;
                Label_1402: {
                    switch (b) {
                        default: {
                            n3 = n;
                            break Label_1409;
                        }
                        case 68: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = n * 53;
                                n5 = ahcj.i(o, d).hashCode();
                                break Label_1402;
                            }
                            break Label_1409;
                        }
                        case 67: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = n * 53;
                                n5 = agzz.c(E(o, d));
                                break Label_1402;
                            }
                            break Label_1409;
                        }
                        case 66: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = n * 53;
                                n5 = t(o, d);
                                break Label_1402;
                            }
                            break Label_1409;
                        }
                        case 65: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = n * 53;
                                n5 = agzz.c(E(o, d));
                                break Label_1402;
                            }
                            break Label_1409;
                        }
                        case 64: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = n * 53;
                                n5 = t(o, d);
                                break Label_1402;
                            }
                            break Label_1409;
                        }
                        case 63: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = n * 53;
                                n5 = t(o, d);
                                break Label_1402;
                            }
                            break Label_1409;
                        }
                        case 62: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = n * 53;
                                n5 = t(o, d);
                                break Label_1402;
                            }
                            break Label_1409;
                        }
                        case 61: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = n * 53;
                                n5 = ahcj.i(o, d).hashCode();
                                break Label_1402;
                            }
                            break Label_1409;
                        }
                        case 60: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = n * 53;
                                n5 = ahcj.i(o, d).hashCode();
                                break Label_1402;
                            }
                            break Label_1409;
                        }
                        case 59: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = n * 53;
                                n5 = ((String)ahcj.i(o, d)).hashCode();
                                break Label_1402;
                            }
                            break Label_1409;
                        }
                        case 58: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = n * 53;
                                n5 = agzz.a(ab(o, d));
                                break Label_1402;
                            }
                            break Label_1409;
                        }
                        case 57: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = n * 53;
                                n5 = t(o, d);
                                break Label_1402;
                            }
                            break Label_1409;
                        }
                        case 56: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = n * 53;
                                n5 = agzz.c(E(o, d));
                                break Label_1402;
                            }
                            break Label_1409;
                        }
                        case 55: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = n * 53;
                                n5 = t(o, d);
                                break Label_1402;
                            }
                            break Label_1409;
                        }
                        case 54: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = n * 53;
                                n5 = agzz.c(E(o, d));
                                break Label_1402;
                            }
                            break Label_1409;
                        }
                        case 53: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = n * 53;
                                n5 = agzz.c(E(o, d));
                                break Label_1402;
                            }
                            break Label_1409;
                        }
                        case 52: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = n * 53;
                                n5 = Float.floatToIntBits(p(o, d));
                                break Label_1402;
                            }
                            break Label_1409;
                        }
                        case 51: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = n * 53;
                                n5 = agzz.c(Double.doubleToLongBits(o(o, d)));
                                break Label_1402;
                            }
                            break Label_1409;
                        }
                        case 50: {
                            n4 = n * 53;
                            n5 = ahcj.i(o, d).hashCode();
                            break Label_1402;
                        }
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49: {
                            n4 = n * 53;
                            n5 = ahcj.i(o, d).hashCode();
                            break Label_1402;
                        }
                        case 17: {
                            final Object j = ahcj.i(o, d);
                            if (j != null) {
                                n2 = j.hashCode();
                                break;
                            }
                            break;
                        }
                        case 16: {
                            n4 = n * 53;
                            n5 = agzz.c(ahcj.f(o, d));
                            break Label_1402;
                        }
                        case 15: {
                            n4 = n * 53;
                            n5 = ahcj.d(o, d);
                            break Label_1402;
                        }
                        case 14: {
                            n4 = n * 53;
                            n5 = agzz.c(ahcj.f(o, d));
                            break Label_1402;
                        }
                        case 13: {
                            n4 = n * 53;
                            n5 = ahcj.d(o, d);
                            break Label_1402;
                        }
                        case 12: {
                            n4 = n * 53;
                            n5 = ahcj.d(o, d);
                            break Label_1402;
                        }
                        case 11: {
                            n4 = n * 53;
                            n5 = ahcj.d(o, d);
                            break Label_1402;
                        }
                        case 10: {
                            n4 = n * 53;
                            n5 = ahcj.i(o, d).hashCode();
                            break Label_1402;
                        }
                        case 9: {
                            final Object k = ahcj.i(o, d);
                            if (k != null) {
                                n2 = k.hashCode();
                                break;
                            }
                            break;
                        }
                        case 8: {
                            n4 = n * 53;
                            n5 = ((String)ahcj.i(o, d)).hashCode();
                            break Label_1402;
                        }
                        case 7: {
                            n4 = n * 53;
                            n5 = agzz.a(ahcj.x(o, d));
                            break Label_1402;
                        }
                        case 6: {
                            n4 = n * 53;
                            n5 = ahcj.d(o, d);
                            break Label_1402;
                        }
                        case 5: {
                            n4 = n * 53;
                            n5 = agzz.c(ahcj.f(o, d));
                            break Label_1402;
                        }
                        case 4: {
                            n4 = n * 53;
                            n5 = ahcj.d(o, d);
                            break Label_1402;
                        }
                        case 3: {
                            n4 = n * 53;
                            n5 = agzz.c(ahcj.f(o, d));
                            break Label_1402;
                        }
                        case 2: {
                            n4 = n * 53;
                            n5 = agzz.c(ahcj.f(o, d));
                            break Label_1402;
                        }
                        case 1: {
                            n4 = n * 53;
                            n5 = Float.floatToIntBits(ahcj.c(o, d));
                            break Label_1402;
                        }
                        case 0: {
                            n4 = n * 53;
                            n5 = agzz.c(Double.doubleToLongBits(ahcj.b(o, d)));
                            break Label_1402;
                        }
                    }
                    n3 = n * 53 + n2;
                    break Label_1409;
                }
                n3 = n4 + n5;
            }
            i += 3;
            n = n3;
        }
        int n6 = n * 53 + aeda.aL(o).hashCode();
        if (this.h) {
            n6 = n6 * 53 + ahbz.j(o).hashCode();
        }
        return n6;
    }
    
    final int c(Object af, final byte[] array, int n, int n2, int n3, final agxq agxq) {
        byte[] array2 = array;
        int n4 = n2;
        int n5 = n3;
        agxq agxq2 = agxq;
        M(af);
        final Unsafe b = ahaz.b;
        int n6 = 0;
        int n7 = -1;
        int n8 = 0;
        int n9 = 0;
        int n10 = 1048575;
        ahaz ahaz;
        int n11;
        while (true) {
            final Object o = af;
            if (n >= n4) {
                n3 = n5;
                n2 = n4;
                ahaz = this;
                n11 = n10;
                break;
            }
            int n12 = n + 1;
            n = array2[n];
            if (n < 0) {
                n12 = ahbz.I(n, array2, n12, agxq2);
                n = agxq2.a;
            }
            final int n13 = n >>> 3;
            final int n14 = n & 0x7;
            int n15;
            if (n13 > n7) {
                n15 = this.y(n13, n8 / 3);
            }
            else {
                n15 = this.x(n13);
            }
            int n20 = 0;
            int n28 = 0;
            int n38 = 0;
            int n39 = 0;
            int n40 = 0;
            Label_1566: {
                if (n15 != -1) {
                    final int[] c = this.c;
                    final int n16 = c[n15 + 1];
                    final int b2 = B(n16);
                    final int n17 = n;
                    final long d = D(n16);
                    int n37 = 0;
                    Label_1272: {
                        if (b2 <= 17) {
                            final int n18 = c[n15 + 2];
                            final int n19 = 1 << (n18 >>> 20);
                            n20 = (n18 & 0xFFFFF);
                            int int1;
                            if (n20 != n10) {
                                if (n10 != 1048575) {
                                    b.putInt(o, (long)n10, n9);
                                }
                                int1 = b.getInt(o, (long)n20);
                            }
                            else {
                                n20 = n10;
                                int1 = n9;
                            }
                            final int n21 = n15;
                            Label_1130: {
                                Label_1126: {
                                    int n24 = 0;
                                    int n25 = 0;
                                    Label_1105: {
                                        Label_1098: {
                                            Label_1091: {
                                                Label_1068: {
                                                    Label_0932: {
                                                        Label_0917: {
                                                            int n34 = 0;
                                                            Label_0911: {
                                                                int n32 = 0;
                                                                Label_0892: {
                                                                    Label_0749: {
                                                                        Label_0745: {
                                                                            int n26 = 0;
                                                                            int n27 = 0;
                                                                            Label_0730: {
                                                                                switch (b2) {
                                                                                    default: {
                                                                                        final int n22 = n21;
                                                                                        if (n14 == 3) {
                                                                                            final Object i = this.I(o, n22);
                                                                                            final int l = ahbz.L(i, this.G(n22), array, n12, n2, n13 << 3 | 0x4, agxq);
                                                                                            this.S(o, n22, i);
                                                                                            final int n23 = int1 | n19;
                                                                                            n24 = l;
                                                                                            n25 = n23;
                                                                                            break Label_1105;
                                                                                        }
                                                                                        break Label_1126;
                                                                                    }
                                                                                    case 16: {
                                                                                        if (n14 == 0) {
                                                                                            n26 = ahbz.K(array2, n12, agxq2);
                                                                                            b.putLong(af, d, agyh.L(agxq2.b));
                                                                                            n27 = (int1 | n19);
                                                                                            break Label_0730;
                                                                                        }
                                                                                        n28 = n21;
                                                                                        n = n17;
                                                                                        break Label_0749;
                                                                                    }
                                                                                    case 15: {
                                                                                        if (n14 == 0) {
                                                                                            n26 = ahbz.H(array2, n12, agxq2);
                                                                                            b.putInt(o, d, agyh.J(agxq2.a));
                                                                                            break;
                                                                                        }
                                                                                        break Label_0745;
                                                                                    }
                                                                                    case 12: {
                                                                                        final int n29 = n21;
                                                                                        if (n14 != 0) {
                                                                                            break Label_0745;
                                                                                        }
                                                                                        n26 = ahbz.H(array2, n12, agxq2);
                                                                                        final int a = agxq2.a;
                                                                                        final agzo f = this.F(n29);
                                                                                        if (f != null && !f.isInRange(a)) {
                                                                                            d(af).g(n17, (Object)(long)a);
                                                                                            n9 = int1;
                                                                                            n = n26;
                                                                                            n6 = n17;
                                                                                            n8 = n29;
                                                                                            break Label_0917;
                                                                                        }
                                                                                        b.putInt(o, d, a);
                                                                                        break;
                                                                                    }
                                                                                    case 10: {
                                                                                        if (n14 == 2) {
                                                                                            n26 = ahbz.q(array2, n12, agxq2);
                                                                                            b.putObject(o, d, agxq2.c);
                                                                                            break;
                                                                                        }
                                                                                        break Label_0745;
                                                                                    }
                                                                                    case 9: {
                                                                                        final int n30 = n21;
                                                                                        if (n14 == 2) {
                                                                                            final Object j = this.I(o, n30);
                                                                                            n26 = ahbz.M(j, this.G(n30), array, n12, n2, agxq);
                                                                                            this.S(o, n30, j);
                                                                                            break;
                                                                                        }
                                                                                        break Label_0745;
                                                                                    }
                                                                                    case 8: {
                                                                                        final int n31 = n12;
                                                                                        if (n14 == 2) {
                                                                                            if ((0x20000000 & n16) == 0x0) {
                                                                                                n32 = ahbz.E(array2, n31, agxq2);
                                                                                            }
                                                                                            else {
                                                                                                n32 = ahbz.F(array2, n31, agxq2);
                                                                                            }
                                                                                            b.putObject(o, d, agxq2.c);
                                                                                            break Label_0892;
                                                                                        }
                                                                                        break Label_0932;
                                                                                    }
                                                                                    case 7: {
                                                                                        if (n14 == 0) {
                                                                                            n32 = ahbz.K(array2, n12, agxq2);
                                                                                            ahcj.n(o, d, agxq2.b != 0L);
                                                                                            break Label_0892;
                                                                                        }
                                                                                        break Label_0932;
                                                                                    }
                                                                                    case 6:
                                                                                    case 13: {
                                                                                        final int n33 = n12;
                                                                                        if (n14 == 5) {
                                                                                            b.putInt(o, d, ahbz.r(array2, n33));
                                                                                            n32 = n33 + 4;
                                                                                            break Label_0892;
                                                                                        }
                                                                                        break Label_0932;
                                                                                    }
                                                                                    case 5:
                                                                                    case 14: {
                                                                                        if (n14 == 1) {
                                                                                            b.putLong(af, d, ahbz.O(array2, n12));
                                                                                            break Label_1091;
                                                                                        }
                                                                                        break Label_1068;
                                                                                    }
                                                                                    case 4:
                                                                                    case 11: {
                                                                                        if (n14 == 0) {
                                                                                            n24 = ahbz.H(array2, n12, agxq2);
                                                                                            b.putInt(o, d, agxq2.a);
                                                                                            break Label_1098;
                                                                                        }
                                                                                        break Label_1068;
                                                                                    }
                                                                                    case 2:
                                                                                    case 3: {
                                                                                        if (n14 == 0) {
                                                                                            n24 = ahbz.K(array2, n12, agxq2);
                                                                                            b.putLong(af, d, agxq2.b);
                                                                                            n25 = (int1 | n19);
                                                                                            break Label_1105;
                                                                                        }
                                                                                        break Label_1068;
                                                                                    }
                                                                                    case 1: {
                                                                                        n24 = n12;
                                                                                        if (n14 == 5) {
                                                                                            ahcj.s(o, d, ahbz.p(array2, n24));
                                                                                            n24 += 4;
                                                                                            break Label_1098;
                                                                                        }
                                                                                        break Label_1068;
                                                                                    }
                                                                                    case 0: {
                                                                                        if (n14 == 1) {
                                                                                            ahcj.r(o, d, ahbz.o(array2, n12));
                                                                                            break Label_1091;
                                                                                        }
                                                                                        break Label_1126;
                                                                                    }
                                                                                }
                                                                                n27 = (int1 | n19);
                                                                            }
                                                                            n34 = n26;
                                                                            n8 = n21;
                                                                            n9 = n27;
                                                                            break Label_0911;
                                                                        }
                                                                        n28 = n21;
                                                                    }
                                                                    break Label_1130;
                                                                }
                                                                final int n35 = int1 | n19;
                                                                n8 = n21;
                                                                n9 = n35;
                                                                n34 = n32;
                                                            }
                                                            n6 = n;
                                                            n = n34;
                                                        }
                                                        n7 = n13;
                                                        n10 = n20;
                                                        n5 = n3;
                                                        continue;
                                                    }
                                                    n28 = n21;
                                                    break Label_1130;
                                                }
                                                break Label_1126;
                                            }
                                            n24 = n12 + 8;
                                        }
                                        n25 = (int1 | n19);
                                    }
                                    final int n36 = n;
                                    n = n24;
                                    n37 = n36;
                                    n8 = n21;
                                    n9 = n25;
                                    break Label_1272;
                                }
                                n28 = n21;
                            }
                            n38 = n3;
                            n39 = n;
                            n = n13;
                            n40 = int1;
                            break Label_1566;
                        }
                        Label_1499: {
                            if (b2 != 27) {
                                final int n41 = n9;
                                n20 = n10;
                                int n42 = 0;
                                Label_1421: {
                                    int n43;
                                    if (b2 <= 49) {
                                        final int w = this.w(af, array, n12, n2, n17, n13, n14, n15, n16, b2, d, agxq);
                                        if ((n42 = w) == n12) {
                                            break Label_1421;
                                        }
                                        n43 = w;
                                    }
                                    else {
                                        final int n44 = n12;
                                        final int n45 = n15;
                                        if (b2 == 50) {
                                            if (n14 != 2) {
                                                break Label_1499;
                                            }
                                            n43 = this.u(af, array, n44, n2, n45, d, agxq);
                                            if ((n42 = n43) == n44) {
                                                break Label_1421;
                                            }
                                        }
                                        else {
                                            n43 = this.v(af, array, n44, n2, n17, n13, n14, n16, b2, d, n45, agxq);
                                            if ((n42 = n43) == n44) {
                                                break Label_1421;
                                            }
                                        }
                                    }
                                    array2 = array;
                                    n4 = n2;
                                    final int n46 = n3;
                                    agxq2 = agxq;
                                    final int n47 = n15;
                                    n7 = n13;
                                    final int n48 = n;
                                    final int n49 = n41;
                                    n = n43;
                                    n6 = n48;
                                    n8 = n47;
                                    n9 = n49;
                                    n10 = n20;
                                    n5 = n46;
                                    continue;
                                }
                                n12 = n42;
                                n28 = n15;
                                n38 = n3;
                                n39 = n;
                                n = n13;
                                n40 = n41;
                                break Label_1566;
                            }
                            if (n14 == 2) {
                                agzy e;
                                final agzy agzy = e = (agzy)b.getObject(o, d);
                                if (!agzy.c()) {
                                    n = agzy.size();
                                    if (n == 0) {
                                        n = 10;
                                    }
                                    else {
                                        n += n;
                                    }
                                    e = agzy.e(n);
                                    b.putObject(o, d, e);
                                }
                                final ahbp g = this.G(n15);
                                n20 = n10;
                                n = ahbz.u(g, n17, array, n12, n2, e, agxq);
                                array2 = array;
                                n37 = n17;
                                n8 = n15;
                                break Label_1272;
                            }
                        }
                        n20 = n10;
                        n38 = n3;
                        n28 = n15;
                        n39 = n;
                        n = n13;
                        n40 = n9;
                        break Label_1566;
                    }
                    final int n50 = n3;
                    n7 = n13;
                    final int n51 = n2;
                    n6 = n37;
                    n10 = n20;
                    n5 = n50;
                    n4 = n51;
                    continue;
                }
                final int n52 = n10;
                n28 = 0;
                n38 = n5;
                n39 = n;
                n = n13;
                n40 = n9;
                n20 = n52;
            }
            boolean b3 = true;
            if (n39 == n38 && n38 != 0) {
                ahaz = this;
                n = n12;
                n9 = n40;
                n6 = n39;
                n11 = n20;
                n3 = n38;
                break;
            }
            int n53 = 0;
            int n54 = 0;
            Label_3083: {
                if (this.h) {
                    final ExtensionRegistryLite d2 = agxq.d;
                    if (d2 != ExtensionRegistryLite.a) {
                        final MessageLite g2 = this.g;
                        final aeda p6 = this.p;
                        final agzg b4 = d2.b(g2, n);
                        if (b4 == null) {
                            final int g3 = ahbz.G(n39, array, n12, n2, d(af), agxq);
                            n53 = n2;
                            n54 = n;
                            array2 = array;
                            n = g3;
                            break Label_3083;
                        }
                        final agzd agzd = (agzd)af;
                        agzd.e();
                        final agyv k = agzd.l;
                        final agzf d3 = b4.d;
                        Label_2314: {
                            if (!d3.d || !d3.e) {
                                array2 = array;
                                Object o2 = null;
                                Label_2529: {
                                    if (b4.b() == ahcm.n) {
                                        n12 = ahbz.H(array2, n12, agxq);
                                        if (b4.d.a.findValueByNumber(agxq.a) == null) {
                                            ahbq.E((Object)agzd, n, agxq.a, (Object)null);
                                            break Label_2314;
                                        }
                                        o2 = agxq.a;
                                    }
                                    else {
                                        Label_2979: {
                                            switch (b4.b().ordinal()) {
                                                default: {
                                                    o2 = null;
                                                    break Label_2529;
                                                }
                                                case 17: {
                                                    n12 = ahbz.K(array2, n12, agxq);
                                                    o2 = agyh.L(agxq.b);
                                                    break Label_2529;
                                                }
                                                case 16: {
                                                    n12 = ahbz.H(array2, n12, agxq);
                                                    o2 = agyh.J(agxq.a);
                                                    break Label_2529;
                                                }
                                                case 13: {
                                                    throw new IllegalStateException("Shouldn't reach here.");
                                                }
                                                case 11: {
                                                    n12 = ahbz.q(array2, n12, agxq);
                                                    o2 = agxq.c;
                                                    break Label_2529;
                                                }
                                                case 10: {
                                                    final ahbp a2 = ahbh.a.a((Class)b4.c.getClass());
                                                    if (b4.e()) {
                                                        n12 = ahbz.t(a2, array2, n12, n2, agxq);
                                                        k.m(b4.d, agxq.c);
                                                        break Label_2314;
                                                    }
                                                    Object o3;
                                                    if ((o3 = k.l(b4.d)) == null) {
                                                        o3 = a2.e();
                                                        k.n(b4.d, o3);
                                                    }
                                                    final int n55 = n2;
                                                    final int m = ahbz.M(o3, a2, array, n12, n2, agxq);
                                                    final int n56 = n;
                                                    n = m;
                                                    n53 = n55;
                                                    n54 = n56;
                                                    break Label_3083;
                                                }
                                                case 9: {
                                                    final int n57 = n << 3 | 0x4;
                                                    final ahbp a3 = ahbh.a.a((Class)b4.c.getClass());
                                                    int n58;
                                                    if (b4.e()) {
                                                        n58 = ahbz.s(a3, array, n12, n2, n57, agxq);
                                                        k.m(b4.d, agxq.c);
                                                    }
                                                    else {
                                                        Object o4;
                                                        if ((o4 = k.l(b4.d)) == null) {
                                                            o4 = a3.e();
                                                            k.n(b4.d, o4);
                                                        }
                                                        n58 = ahbz.L(o4, a3, array, n12, n2, n57, agxq);
                                                    }
                                                    n54 = n;
                                                    array2 = array;
                                                    final int n59 = n2;
                                                    n = n58;
                                                    n53 = n59;
                                                    break Label_3083;
                                                }
                                                case 8: {
                                                    n12 = ahbz.E(array2, n12, agxq);
                                                    o2 = agxq.c;
                                                    break Label_2529;
                                                }
                                                case 7: {
                                                    n12 = ahbz.K(array2, n12, agxq);
                                                    if (agxq.b == 0L) {
                                                        b3 = false;
                                                    }
                                                    o2 = b3;
                                                    break Label_2529;
                                                }
                                                case 6:
                                                case 14: {
                                                    o2 = ahbz.r(array2, n12);
                                                    break;
                                                }
                                                case 5:
                                                case 15: {
                                                    o2 = ahbz.O(array2, n12);
                                                    break Label_2979;
                                                }
                                                case 4:
                                                case 12: {
                                                    n12 = ahbz.H(array2, n12, agxq);
                                                    o2 = agxq.a;
                                                    break Label_2529;
                                                }
                                                case 2:
                                                case 3: {
                                                    n12 = ahbz.K(array2, n12, agxq);
                                                    o2 = agxq.b;
                                                    break Label_2529;
                                                }
                                                case 1: {
                                                    o2 = ahbz.p(array2, n12);
                                                    break;
                                                }
                                                case 0: {
                                                    o2 = ahbz.o(array2, n12);
                                                    break Label_2979;
                                                }
                                            }
                                            n12 += 4;
                                            break Label_2529;
                                        }
                                        n12 += 8;
                                    }
                                }
                                n54 = n;
                                if (b4.e()) {
                                    k.m(b4.d, o2);
                                }
                                else {
                                    k.n(b4.d, o2);
                                }
                                final int n60 = n2;
                                n = n12;
                                n53 = n60;
                                array2 = array;
                                break Label_3083;
                            }
                            final ahcm a4 = ahcm.a;
                            switch (b4.b().ordinal()) {
                                default: {
                                    throw new IllegalStateException("Type cannot be packed: ".concat(String.valueOf(String.valueOf(b4.d.c))));
                                }
                                case 17: {
                                    final ahan ahan = new ahan();
                                    n12 = ahbz.B(array, n12, (agzy)ahan, agxq);
                                    k.n(b4.d, (Object)ahan);
                                    break;
                                }
                                case 16: {
                                    final agzj agzj = new agzj();
                                    n12 = ahbz.A(array, n12, (agzy)agzj, agxq);
                                    k.n(b4.d, (Object)agzj);
                                    break;
                                }
                                case 13: {
                                    final agzj agzj2 = new agzj();
                                    n12 = ahbz.C(array, n12, (agzy)agzj2, agxq);
                                    ahbq.X((Object)agzd, n, (List)agzj2, b4.d.a, (Object)null, p6);
                                    k.n(b4.d, (Object)agzj2);
                                    break;
                                }
                                case 7: {
                                    final agxt agxt = new agxt(new boolean[10], 0);
                                    n12 = ahbz.v(array, n12, (agzy)agxt, agxq);
                                    k.n(b4.d, (Object)agxt);
                                    break;
                                }
                                case 6:
                                case 14: {
                                    final agzj agzj3 = new agzj();
                                    n12 = ahbz.x(array, n12, (agzy)agzj3, agxq);
                                    k.n(b4.d, (Object)agzj3);
                                    break;
                                }
                                case 5:
                                case 15: {
                                    final ahan ahan2 = new ahan();
                                    n12 = ahbz.y(array, n12, (agzy)ahan2, agxq);
                                    k.n(b4.d, (Object)ahan2);
                                    break;
                                }
                                case 4:
                                case 12: {
                                    final agzj agzj4 = new agzj();
                                    n12 = ahbz.C(array, n12, (agzy)agzj4, agxq);
                                    k.n(b4.d, (Object)agzj4);
                                    break;
                                }
                                case 2:
                                case 3: {
                                    final ahan ahan3 = new ahan();
                                    n12 = ahbz.D(array, n12, (agzy)ahan3, agxq);
                                    k.n(b4.d, (Object)ahan3);
                                    break;
                                }
                                case 1: {
                                    final agyy agyy = new agyy(new float[10], 0);
                                    n12 = ahbz.z(array, n12, (agzy)agyy, agxq);
                                    k.n(b4.d, (Object)agyy);
                                    break;
                                }
                                case 0: {
                                    final agyn agyn = new agyn(new double[10], 0);
                                    n12 = ahbz.w(array, n12, (agzy)agyn, agxq);
                                    k.n(b4.d, (Object)agyn);
                                    break;
                                }
                            }
                        }
                        final int n61 = n2;
                        n54 = n;
                        array2 = array;
                        n = n12;
                        n53 = n61;
                        break Label_3083;
                    }
                }
                array2 = array;
                final ahcc d4 = d(af);
                final int n62 = n2;
                final int g4 = ahbz.G(n39, array, n12, n2, d4, agxq);
                n54 = n;
                n53 = n62;
                n = g4;
            }
            final int n63 = n38;
            agxq2 = agxq;
            n8 = n28;
            final int n64 = n54;
            n9 = n40;
            n10 = n20;
            n4 = n53;
            n6 = n39;
            n7 = n64;
            n5 = n63;
        }
        final Object o5 = af;
        af = null;
        if (n11 != 1048575) {
            b.putInt(o5, (long)n11, n9);
        }
        for (int m2 = ahaz.m; m2 < ahaz.n; ++m2) {
            af = ahaz.af(o5, ahaz.l[m2], af, o5);
        }
        if (af != null) {
            aeda.aM(o5, (ahcc)af);
        }
        if (n3 == 0) {
            if (n != n2) {
                throw ahab.g();
            }
        }
        else if (n > n2 || n6 != n3) {
            throw ahab.g();
        }
        return n;
    }
    
    public final Object e() {
        return ((agzi)this.g).newMutableInstance();
    }
    
    public final void f(final Object o) {
        if (!Z(o)) {
            return;
        }
        if (o instanceof agzi) {
            final agzi agzi = (agzi)o;
            agzi.clearMemoizedSerializedSize();
            agzi.clearMemoizedHashCode();
            agzi.markImmutable();
        }
        for (int length = this.c.length, i = 0; i < length; i += 3) {
            final int c = this.C(i);
            final long d = D(c);
            final int b = B(c);
            if (b != 9) {
                switch (b) {
                    default: {
                        continue;
                    }
                    case 50: {
                        final Unsafe b2 = ahaz.b;
                        final Object object = b2.getObject(o, d);
                        if (object != null) {
                            ((ahas)object).c();
                            b2.putObject(o, d, object);
                        }
                        continue;
                    }
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49: {
                        this.o.c(o, d);
                        continue;
                    }
                    case 17: {
                        break;
                    }
                }
            }
            if (this.W(o, i)) {
                this.G(i).f(ahaz.b.getObject(o, d));
            }
        }
        aeda.aO(o);
        if (this.h) {
            ahbz.m(o);
        }
    }
    
    public final void g(final Object o, final Object o2) {
        M(o);
        o2.getClass();
        for (int i = 0; i < this.c.length; i += 3) {
            final int c = this.C(i);
            final long d = D(c);
            final int s = this.s(i);
            switch (B(c)) {
                case 68: {
                    this.O(o, o2, i);
                    break;
                }
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67: {
                    if (this.aa(o2, s, i)) {
                        ahcj.v(o, d, ahcj.i(o2, d));
                        this.R(o, s, i);
                        break;
                    }
                    break;
                }
                case 60: {
                    this.O(o, o2, i);
                    break;
                }
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59: {
                    if (this.aa(o2, s, i)) {
                        ahcj.v(o, d, ahcj.i(o2, d));
                        this.R(o, s, i);
                        break;
                    }
                    break;
                }
                case 50: {
                    ahbq.C(o, o2, d);
                    break;
                }
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49: {
                    this.o.d(o, o2, d);
                    break;
                }
                case 17: {
                    this.N(o, o2, i);
                    break;
                }
                case 16: {
                    if (this.W(o2, i)) {
                        ahcj.u(o, d, ahcj.f(o2, d));
                        this.Q(o, i);
                        break;
                    }
                    break;
                }
                case 15: {
                    if (this.W(o2, i)) {
                        ahcj.t(o, d, ahcj.d(o2, d));
                        this.Q(o, i);
                        break;
                    }
                    break;
                }
                case 14: {
                    if (this.W(o2, i)) {
                        ahcj.u(o, d, ahcj.f(o2, d));
                        this.Q(o, i);
                        break;
                    }
                    break;
                }
                case 13: {
                    if (this.W(o2, i)) {
                        ahcj.t(o, d, ahcj.d(o2, d));
                        this.Q(o, i);
                        break;
                    }
                    break;
                }
                case 12: {
                    if (this.W(o2, i)) {
                        ahcj.t(o, d, ahcj.d(o2, d));
                        this.Q(o, i);
                        break;
                    }
                    break;
                }
                case 11: {
                    if (this.W(o2, i)) {
                        ahcj.t(o, d, ahcj.d(o2, d));
                        this.Q(o, i);
                        break;
                    }
                    break;
                }
                case 10: {
                    if (this.W(o2, i)) {
                        ahcj.v(o, d, ahcj.i(o2, d));
                        this.Q(o, i);
                        break;
                    }
                    break;
                }
                case 9: {
                    this.N(o, o2, i);
                    break;
                }
                case 8: {
                    if (this.W(o2, i)) {
                        ahcj.v(o, d, ahcj.i(o2, d));
                        this.Q(o, i);
                        break;
                    }
                    break;
                }
                case 7: {
                    if (this.W(o2, i)) {
                        ahcj.n(o, d, ahcj.x(o2, d));
                        this.Q(o, i);
                        break;
                    }
                    break;
                }
                case 6: {
                    if (this.W(o2, i)) {
                        ahcj.t(o, d, ahcj.d(o2, d));
                        this.Q(o, i);
                        break;
                    }
                    break;
                }
                case 5: {
                    if (this.W(o2, i)) {
                        ahcj.u(o, d, ahcj.f(o2, d));
                        this.Q(o, i);
                        break;
                    }
                    break;
                }
                case 4: {
                    if (this.W(o2, i)) {
                        ahcj.t(o, d, ahcj.d(o2, d));
                        this.Q(o, i);
                        break;
                    }
                    break;
                }
                case 3: {
                    if (this.W(o2, i)) {
                        ahcj.u(o, d, ahcj.f(o2, d));
                        this.Q(o, i);
                        break;
                    }
                    break;
                }
                case 2: {
                    if (this.W(o2, i)) {
                        ahcj.u(o, d, ahcj.f(o2, d));
                        this.Q(o, i);
                        break;
                    }
                    break;
                }
                case 1: {
                    if (this.W(o2, i)) {
                        ahcj.s(o, d, ahcj.c(o2, d));
                        this.Q(o, i);
                        break;
                    }
                    break;
                }
                case 0: {
                    if (this.W(o2, i)) {
                        ahcj.r(o, d, ahcj.b(o2, d));
                        this.Q(o, i);
                        break;
                    }
                    break;
                }
            }
        }
        ahbq.D(o, o2);
        if (this.h) {
            ahbq.B(o, o2);
        }
    }
    
    public final void h(final Object p0, final ahbk p1, final ExtensionRegistryLite p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //     4: pop            
        //     5: aload_1        
        //     6: invokestatic    ahaz.M:(Ljava/lang/Object;)V
        //     9: aload_0        
        //    10: getfield        ahaz.p:Laeda;
        //    13: astore          4
        //    15: aconst_null    
        //    16: astore          5
        //    18: aconst_null    
        //    19: astore          6
        //    21: aload           6
        //    23: astore          7
        //    25: aload_2        
        //    26: invokeinterface ahbk.c:()I
        //    31: istore          8
        //    33: aload           6
        //    35: astore          7
        //    37: aload_0        
        //    38: iload           8
        //    40: invokespecial   ahaz.x:(I)I
        //    43: istore          9
        //    45: iload           9
        //    47: ifge            286
        //    50: iload           8
        //    52: ldc_w           2147483647
        //    55: if_icmpne       110
        //    58: aload_0        
        //    59: getfield        ahaz.m:I
        //    62: istore          8
        //    64: aload           6
        //    66: astore_2       
        //    67: iload           8
        //    69: aload_0        
        //    70: getfield        ahaz.n:I
        //    73: if_icmpge       97
        //    76: aload_0        
        //    77: aload_1        
        //    78: aload_0        
        //    79: getfield        ahaz.l:[I
        //    82: iload           8
        //    84: iaload         
        //    85: aload_2        
        //    86: aload_1        
        //    87: invokespecial   ahaz.af:(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    90: astore_2       
        //    91: iinc            8, 1
        //    94: goto            67
        //    97: aload_2        
        //    98: ifnull          4502
        //   101: aload_1        
        //   102: aload_2        
        //   103: checkcast       Lahcc;
        //   106: invokestatic    aeda.aM:(Ljava/lang/Object;Lahcc;)V
        //   109: return         
        //   110: aload           6
        //   112: astore          7
        //   114: aload_0        
        //   115: getfield        ahaz.h:Z
        //   118: ifne            127
        //   121: aconst_null    
        //   122: astore          10
        //   124: goto            143
        //   127: aload           6
        //   129: astore          7
        //   131: aload_3        
        //   132: aload_0        
        //   133: getfield        ahaz.g:Lcom/google/protobuf/MessageLite;
        //   136: iload           8
        //   138: invokevirtual   com/google/protobuf/ExtensionRegistryLite.b:(Lcom/google/protobuf/MessageLite;I)Lagzg;
        //   141: astore          10
        //   143: aload           10
        //   145: ifnull          194
        //   148: aload           5
        //   150: astore          11
        //   152: aload           5
        //   154: ifnonnull       167
        //   157: aload           6
        //   159: astore          7
        //   161: aload_1        
        //   162: invokestatic    ahbz.k:(Ljava/lang/Object;)Lagyv;
        //   165: astore          11
        //   167: aload           6
        //   169: astore          7
        //   171: aload_1        
        //   172: aload_2        
        //   173: aload           10
        //   175: aload_3        
        //   176: aload           11
        //   178: aload           6
        //   180: aload           4
        //   182: invokestatic    ahbz.aB:(Ljava/lang/Object;Lahbk;Ljava/lang/Object;Lcom/google/protobuf/ExtensionRegistryLite;Lagyv;Ljava/lang/Object;Laeda;)Ljava/lang/Object;
        //   185: astore          6
        //   187: aload           11
        //   189: astore          5
        //   191: goto            21
        //   194: aload           6
        //   196: astore          11
        //   198: aload           6
        //   200: ifnonnull       213
        //   203: aload           6
        //   205: astore          7
        //   207: aload_1        
        //   208: invokestatic    aeda.aN:(Ljava/lang/Object;)Ljava/lang/Object;
        //   211: astore          11
        //   213: aload           11
        //   215: astore          7
        //   217: aload           4
        //   219: aload           11
        //   221: aload_2        
        //   222: invokevirtual   aeda.aI:(Ljava/lang/Object;Lahbk;)Z
        //   225: istore          12
        //   227: aload           11
        //   229: astore          6
        //   231: iload           12
        //   233: ifne            21
        //   236: aload_0        
        //   237: getfield        ahaz.m:I
        //   240: istore          8
        //   242: aload           11
        //   244: astore_2       
        //   245: iload           8
        //   247: aload_0        
        //   248: getfield        ahaz.n:I
        //   251: if_icmpge       275
        //   254: aload_0        
        //   255: aload_1        
        //   256: aload_0        
        //   257: getfield        ahaz.l:[I
        //   260: iload           8
        //   262: iaload         
        //   263: aload_2        
        //   264: aload_1        
        //   265: invokespecial   ahaz.af:(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   268: astore_2       
        //   269: iinc            8, 1
        //   272: goto            245
        //   275: aload_2        
        //   276: ifnull          4502
        //   279: goto            101
        //   282: astore_2       
        //   283: goto            4503
        //   286: aload           6
        //   288: astore          7
        //   290: aload_0        
        //   291: iload           9
        //   293: invokespecial   ahaz.C:(I)I
        //   296: istore          13
        //   298: aload           6
        //   300: astore          7
        //   302: iload           13
        //   304: invokestatic    ahaz.B:(I)I
        //   307: istore          14
        //   309: iload           14
        //   311: tableswitch {
        //                0: 4292
        //                1: 4251
        //                2: 4210
        //                3: 4169
        //                4: 4128
        //                5: 4087
        //                6: 4046
        //                7: 4005
        //                8: 3971
        //                9: 3908
        //               10: 3867
        //               11: 3826
        //               12: 3706
        //               13: 3665
        //               14: 3624
        //               15: 3583
        //               16: 3542
        //               17: 3479
        //               18: 3449
        //               19: 3419
        //               20: 3389
        //               21: 3359
        //               22: 3329
        //               23: 3299
        //               24: 3269
        //               25: 3239
        //               26: 3135
        //               27: 2935
        //               28: 2771
        //               29: 2741
        //               30: 2671
        //               31: 2641
        //               32: 2611
        //               33: 2581
        //               34: 2551
        //               35: 2521
        //               36: 2491
        //               37: 2461
        //               38: 2431
        //               39: 2401
        //               40: 2371
        //               41: 2341
        //               42: 2311
        //               43: 2281
        //               44: 2211
        //               45: 2181
        //               46: 2151
        //               47: 2121
        //               48: 2091
        //               49: 1879
        //               50: 1403
        //               51: 1360
        //               52: 1322
        //               53: 1284
        //               54: 1246
        //               55: 1208
        //               56: 1170
        //               57: 1132
        //               58: 1094
        //               59: 1066
        //               60: 1011
        //               61: 976
        //               62: 938
        //               63: 833
        //               64: 795
        //               65: 757
        //               66: 719
        //               67: 681
        //               68: 626
        //          default: 600
        //        }
        //   600: aload           6
        //   602: astore          11
        //   604: aload           6
        //   606: ifnonnull       4333
        //   609: aload           6
        //   611: astore          7
        //   613: aload           6
        //   615: astore          10
        //   617: aload_1        
        //   618: invokestatic    aeda.aN:(Ljava/lang/Object;)Ljava/lang/Object;
        //   621: astore          11
        //   623: goto            4333
        //   626: aload           6
        //   628: astore          7
        //   630: aload_0        
        //   631: aload_1        
        //   632: iload           8
        //   634: iload           9
        //   636: invokespecial   ahaz.J:(Ljava/lang/Object;II)Ljava/lang/Object;
        //   639: checkcast       Lcom/google/protobuf/MessageLite;
        //   642: astore          11
        //   644: aload           6
        //   646: astore          7
        //   648: aload_2        
        //   649: aload           11
        //   651: aload_0        
        //   652: iload           9
        //   654: invokespecial   ahaz.G:(I)Lahbp;
        //   657: aload_3        
        //   658: invokeinterface ahbk.w:(Ljava/lang/Object;Lahbp;Lcom/google/protobuf/ExtensionRegistryLite;)V
        //   663: aload           6
        //   665: astore          7
        //   667: aload_0        
        //   668: aload_1        
        //   669: iload           8
        //   671: iload           9
        //   673: aload           11
        //   675: invokespecial   ahaz.T:(Ljava/lang/Object;IILjava/lang/Object;)V
        //   678: goto            1091
        //   681: aload           6
        //   683: astore          7
        //   685: aload_1        
        //   686: iload           13
        //   688: invokestatic    ahaz.D:(I)J
        //   691: aload_2        
        //   692: invokeinterface ahbk.m:()J
        //   697: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   700: invokestatic    ahcj.v:(Ljava/lang/Object;JLjava/lang/Object;)V
        //   703: aload           6
        //   705: astore          7
        //   707: aload_0        
        //   708: aload_1        
        //   709: iload           8
        //   711: iload           9
        //   713: invokespecial   ahaz.R:(Ljava/lang/Object;II)V
        //   716: goto            1091
        //   719: aload           6
        //   721: astore          7
        //   723: aload_1        
        //   724: iload           13
        //   726: invokestatic    ahaz.D:(I)J
        //   729: aload_2        
        //   730: invokeinterface ahbk.h:()I
        //   735: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   738: invokestatic    ahcj.v:(Ljava/lang/Object;JLjava/lang/Object;)V
        //   741: aload           6
        //   743: astore          7
        //   745: aload_0        
        //   746: aload_1        
        //   747: iload           8
        //   749: iload           9
        //   751: invokespecial   ahaz.R:(Ljava/lang/Object;II)V
        //   754: goto            1091
        //   757: aload           6
        //   759: astore          7
        //   761: aload_1        
        //   762: iload           13
        //   764: invokestatic    ahaz.D:(I)J
        //   767: aload_2        
        //   768: invokeinterface ahbk.l:()J
        //   773: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   776: invokestatic    ahcj.v:(Ljava/lang/Object;JLjava/lang/Object;)V
        //   779: aload           6
        //   781: astore          7
        //   783: aload_0        
        //   784: aload_1        
        //   785: iload           8
        //   787: iload           9
        //   789: invokespecial   ahaz.R:(Ljava/lang/Object;II)V
        //   792: goto            1091
        //   795: aload           6
        //   797: astore          7
        //   799: aload_1        
        //   800: iload           13
        //   802: invokestatic    ahaz.D:(I)J
        //   805: aload_2        
        //   806: invokeinterface ahbk.g:()I
        //   811: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   814: invokestatic    ahcj.v:(Ljava/lang/Object;JLjava/lang/Object;)V
        //   817: aload           6
        //   819: astore          7
        //   821: aload_0        
        //   822: aload_1        
        //   823: iload           8
        //   825: iload           9
        //   827: invokespecial   ahaz.R:(Ljava/lang/Object;II)V
        //   830: goto            1091
        //   833: aload           6
        //   835: astore          7
        //   837: aload_2        
        //   838: invokeinterface ahbk.d:()I
        //   843: istore          14
        //   845: aload           6
        //   847: astore          7
        //   849: aload_0        
        //   850: iload           9
        //   852: invokespecial   ahaz.F:(I)Lagzo;
        //   855: astore          11
        //   857: aload           11
        //   859: ifnull          904
        //   862: aload           6
        //   864: astore          7
        //   866: aload           11
        //   868: iload           14
        //   870: invokeinterface agzo.isInRange:(I)Z
        //   875: ifeq            881
        //   878: goto            904
        //   881: aload           6
        //   883: astore          7
        //   885: aload_1        
        //   886: iload           8
        //   888: iload           14
        //   890: aload           6
        //   892: invokestatic    ahbq.E:(Ljava/lang/Object;IILjava/lang/Object;)Ljava/lang/Object;
        //   895: astore          11
        //   897: aload           11
        //   899: astore          6
        //   901: goto            1091
        //   904: aload           6
        //   906: astore          7
        //   908: aload_1        
        //   909: iload           13
        //   911: invokestatic    ahaz.D:(I)J
        //   914: iload           14
        //   916: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   919: invokestatic    ahcj.v:(Ljava/lang/Object;JLjava/lang/Object;)V
        //   922: aload           6
        //   924: astore          7
        //   926: aload_0        
        //   927: aload_1        
        //   928: iload           8
        //   930: iload           9
        //   932: invokespecial   ahaz.R:(Ljava/lang/Object;II)V
        //   935: goto            1091
        //   938: aload           6
        //   940: astore          7
        //   942: aload_1        
        //   943: iload           13
        //   945: invokestatic    ahaz.D:(I)J
        //   948: aload_2        
        //   949: invokeinterface ahbk.i:()I
        //   954: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   957: invokestatic    ahcj.v:(Ljava/lang/Object;JLjava/lang/Object;)V
        //   960: aload           6
        //   962: astore          7
        //   964: aload_0        
        //   965: aload_1        
        //   966: iload           8
        //   968: iload           9
        //   970: invokespecial   ahaz.R:(Ljava/lang/Object;II)V
        //   973: goto            1091
        //   976: aload           6
        //   978: astore          7
        //   980: aload_1        
        //   981: iload           13
        //   983: invokestatic    ahaz.D:(I)J
        //   986: aload_2        
        //   987: invokeinterface ahbk.o:()Lagyc;
        //   992: invokestatic    ahcj.v:(Ljava/lang/Object;JLjava/lang/Object;)V
        //   995: aload           6
        //   997: astore          7
        //   999: aload_0        
        //  1000: aload_1        
        //  1001: iload           8
        //  1003: iload           9
        //  1005: invokespecial   ahaz.R:(Ljava/lang/Object;II)V
        //  1008: goto            1091
        //  1011: aload           6
        //  1013: astore          7
        //  1015: aload_0        
        //  1016: aload_1        
        //  1017: iload           8
        //  1019: iload           9
        //  1021: invokespecial   ahaz.J:(Ljava/lang/Object;II)Ljava/lang/Object;
        //  1024: checkcast       Lcom/google/protobuf/MessageLite;
        //  1027: astore          11
        //  1029: aload           6
        //  1031: astore          7
        //  1033: aload_2        
        //  1034: aload           11
        //  1036: aload_0        
        //  1037: iload           9
        //  1039: invokespecial   ahaz.G:(I)Lahbp;
        //  1042: aload_3        
        //  1043: invokeinterface ahbk.x:(Ljava/lang/Object;Lahbp;Lcom/google/protobuf/ExtensionRegistryLite;)V
        //  1048: aload           6
        //  1050: astore          7
        //  1052: aload_0        
        //  1053: aload_1        
        //  1054: iload           8
        //  1056: iload           9
        //  1058: aload           11
        //  1060: invokespecial   ahaz.T:(Ljava/lang/Object;IILjava/lang/Object;)V
        //  1063: goto            1091
        //  1066: aload           6
        //  1068: astore          7
        //  1070: aload_0        
        //  1071: aload_1        
        //  1072: iload           13
        //  1074: aload_2        
        //  1075: invokespecial   ahaz.P:(Ljava/lang/Object;ILahbk;)V
        //  1078: aload           6
        //  1080: astore          7
        //  1082: aload_0        
        //  1083: aload_1        
        //  1084: iload           8
        //  1086: iload           9
        //  1088: invokespecial   ahaz.R:(Ljava/lang/Object;II)V
        //  1091: goto            21
        //  1094: aload           6
        //  1096: astore          7
        //  1098: aload_1        
        //  1099: iload           13
        //  1101: invokestatic    ahaz.D:(I)J
        //  1104: aload_2        
        //  1105: invokeinterface ahbk.O:()Z
        //  1110: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  1113: invokestatic    ahcj.v:(Ljava/lang/Object;JLjava/lang/Object;)V
        //  1116: aload           6
        //  1118: astore          7
        //  1120: aload_0        
        //  1121: aload_1        
        //  1122: iload           8
        //  1124: iload           9
        //  1126: invokespecial   ahaz.R:(Ljava/lang/Object;II)V
        //  1129: goto            1091
        //  1132: aload           6
        //  1134: astore          7
        //  1136: aload_1        
        //  1137: iload           13
        //  1139: invokestatic    ahaz.D:(I)J
        //  1142: aload_2        
        //  1143: invokeinterface ahbk.e:()I
        //  1148: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1151: invokestatic    ahcj.v:(Ljava/lang/Object;JLjava/lang/Object;)V
        //  1154: aload           6
        //  1156: astore          7
        //  1158: aload_0        
        //  1159: aload_1        
        //  1160: iload           8
        //  1162: iload           9
        //  1164: invokespecial   ahaz.R:(Ljava/lang/Object;II)V
        //  1167: goto            1091
        //  1170: aload           6
        //  1172: astore          7
        //  1174: aload_1        
        //  1175: iload           13
        //  1177: invokestatic    ahaz.D:(I)J
        //  1180: aload_2        
        //  1181: invokeinterface ahbk.j:()J
        //  1186: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1189: invokestatic    ahcj.v:(Ljava/lang/Object;JLjava/lang/Object;)V
        //  1192: aload           6
        //  1194: astore          7
        //  1196: aload_0        
        //  1197: aload_1        
        //  1198: iload           8
        //  1200: iload           9
        //  1202: invokespecial   ahaz.R:(Ljava/lang/Object;II)V
        //  1205: goto            1091
        //  1208: aload           6
        //  1210: astore          7
        //  1212: aload_1        
        //  1213: iload           13
        //  1215: invokestatic    ahaz.D:(I)J
        //  1218: aload_2        
        //  1219: invokeinterface ahbk.f:()I
        //  1224: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1227: invokestatic    ahcj.v:(Ljava/lang/Object;JLjava/lang/Object;)V
        //  1230: aload           6
        //  1232: astore          7
        //  1234: aload_0        
        //  1235: aload_1        
        //  1236: iload           8
        //  1238: iload           9
        //  1240: invokespecial   ahaz.R:(Ljava/lang/Object;II)V
        //  1243: goto            1091
        //  1246: aload           6
        //  1248: astore          7
        //  1250: aload_1        
        //  1251: iload           13
        //  1253: invokestatic    ahaz.D:(I)J
        //  1256: aload_2        
        //  1257: invokeinterface ahbk.n:()J
        //  1262: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1265: invokestatic    ahcj.v:(Ljava/lang/Object;JLjava/lang/Object;)V
        //  1268: aload           6
        //  1270: astore          7
        //  1272: aload_0        
        //  1273: aload_1        
        //  1274: iload           8
        //  1276: iload           9
        //  1278: invokespecial   ahaz.R:(Ljava/lang/Object;II)V
        //  1281: goto            1091
        //  1284: aload           6
        //  1286: astore          7
        //  1288: aload_1        
        //  1289: iload           13
        //  1291: invokestatic    ahaz.D:(I)J
        //  1294: aload_2        
        //  1295: invokeinterface ahbk.k:()J
        //  1300: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1303: invokestatic    ahcj.v:(Ljava/lang/Object;JLjava/lang/Object;)V
        //  1306: aload           6
        //  1308: astore          7
        //  1310: aload_0        
        //  1311: aload_1        
        //  1312: iload           8
        //  1314: iload           9
        //  1316: invokespecial   ahaz.R:(Ljava/lang/Object;II)V
        //  1319: goto            1091
        //  1322: aload           6
        //  1324: astore          7
        //  1326: aload_1        
        //  1327: iload           13
        //  1329: invokestatic    ahaz.D:(I)J
        //  1332: aload_2        
        //  1333: invokeinterface ahbk.b:()F
        //  1338: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //  1341: invokestatic    ahcj.v:(Ljava/lang/Object;JLjava/lang/Object;)V
        //  1344: aload           6
        //  1346: astore          7
        //  1348: aload_0        
        //  1349: aload_1        
        //  1350: iload           8
        //  1352: iload           9
        //  1354: invokespecial   ahaz.R:(Ljava/lang/Object;II)V
        //  1357: goto            1091
        //  1360: aload           6
        //  1362: astore          7
        //  1364: aload_1        
        //  1365: iload           13
        //  1367: invokestatic    ahaz.D:(I)J
        //  1370: aload_2        
        //  1371: invokeinterface ahbk.a:()D
        //  1376: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //  1379: invokestatic    ahcj.v:(Ljava/lang/Object;JLjava/lang/Object;)V
        //  1382: aload           6
        //  1384: astore          7
        //  1386: aload_0        
        //  1387: aload_1        
        //  1388: iload           8
        //  1390: iload           9
        //  1392: invokespecial   ahaz.R:(Ljava/lang/Object;II)V
        //  1395: goto            1091
        //  1398: astore          7
        //  1400: goto            4414
        //  1403: aload           6
        //  1405: astore          7
        //  1407: aload_0        
        //  1408: iload           9
        //  1410: invokespecial   ahaz.H:(I)Ljava/lang/Object;
        //  1413: astore          15
        //  1415: aload           6
        //  1417: astore          7
        //  1419: aload_0        
        //  1420: iload           9
        //  1422: invokespecial   ahaz.C:(I)I
        //  1425: invokestatic    ahaz.D:(I)J
        //  1428: lstore          16
        //  1430: aload           6
        //  1432: astore          7
        //  1434: aload_1        
        //  1435: lload           16
        //  1437: invokestatic    ahcj.i:(Ljava/lang/Object;J)Ljava/lang/Object;
        //  1440: astore          10
        //  1442: aload           10
        //  1444: ifnonnull       1471
        //  1447: aload           6
        //  1449: astore          7
        //  1451: invokestatic    ahbz.h:()Ljava/lang/Object;
        //  1454: astore          11
        //  1456: aload           6
        //  1458: astore          7
        //  1460: aload_1        
        //  1461: lload           16
        //  1463: aload           11
        //  1465: invokestatic    ahcj.v:(Ljava/lang/Object;JLjava/lang/Object;)V
        //  1468: goto            1524
        //  1471: aload           6
        //  1473: astore          7
        //  1475: aload           10
        //  1477: invokestatic    ahbz.f:(Ljava/lang/Object;)Z
        //  1480: istore          12
        //  1482: aload           10
        //  1484: astore          11
        //  1486: iload           12
        //  1488: ifeq            1524
        //  1491: aload           6
        //  1493: astore          7
        //  1495: invokestatic    ahbz.h:()Ljava/lang/Object;
        //  1498: astore          11
        //  1500: aload           6
        //  1502: astore          7
        //  1504: aload           11
        //  1506: aload           10
        //  1508: invokestatic    ahbz.g:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1511: pop            
        //  1512: aload           6
        //  1514: astore          7
        //  1516: aload_1        
        //  1517: lload           16
        //  1519: aload           11
        //  1521: invokestatic    ahcj.v:(Ljava/lang/Object;JLjava/lang/Object;)V
        //  1524: aload           6
        //  1526: astore          7
        //  1528: aload           11
        //  1530: checkcast       Lahas;
        //  1533: astore          18
        //  1535: aload           6
        //  1537: astore          7
        //  1539: aload           15
        //  1541: invokestatic    ahbz.d:(Ljava/lang/Object;)Lahar;
        //  1544: astore          15
        //  1546: aload           6
        //  1548: astore          7
        //  1550: aload_2        
        //  1551: checkcast       Lagyi;
        //  1554: iconst_2       
        //  1555: invokevirtual   agyi.N:(I)V
        //  1558: aload           6
        //  1560: astore          7
        //  1562: aload_2        
        //  1563: checkcast       Lagyi;
        //  1566: getfield        agyi.a:Lagyh;
        //  1569: invokevirtual   agyh.o:()I
        //  1572: istore          8
        //  1574: aload           6
        //  1576: astore          7
        //  1578: aload_2        
        //  1579: checkcast       Lagyi;
        //  1582: getfield        agyi.a:Lagyh;
        //  1585: iload           8
        //  1587: invokevirtual   agyh.f:(I)I
        //  1590: istore          9
        //  1592: aload           6
        //  1594: astore          7
        //  1596: aload           15
        //  1598: getfield        ahar.a:Ljava/lang/Object;
        //  1601: astore          11
        //  1603: aload           6
        //  1605: astore          7
        //  1607: aload           15
        //  1609: getfield        ahar.b:Ljava/lang/Object;
        //  1612: astore          10
        //  1614: aload           10
        //  1616: astore          7
        //  1618: aload_2        
        //  1619: checkcast       Lagyi;
        //  1622: invokevirtual   agyi.c:()I
        //  1625: istore          8
        //  1627: iload           8
        //  1629: ldc_w           2147483647
        //  1632: if_icmpeq       1806
        //  1635: aload_2        
        //  1636: checkcast       Lagyi;
        //  1639: getfield        agyi.a:Lagyh;
        //  1642: invokevirtual   agyh.E:()Z
        //  1645: istore          12
        //  1647: iload           12
        //  1649: ifeq            1655
        //  1652: goto            1806
        //  1655: iload           8
        //  1657: iconst_1       
        //  1658: if_icmpeq       1741
        //  1661: iload           8
        //  1663: iconst_2       
        //  1664: if_icmpeq       1696
        //  1667: aload_2        
        //  1668: checkcast       Lagyi;
        //  1671: invokevirtual   agyi.P:()Z
        //  1674: ifeq            1680
        //  1677: goto            1787
        //  1680: new             Lahab;
        //  1683: astore          10
        //  1685: aload           10
        //  1687: ldc_w           "Unable to parse map entry."
        //  1690: invokespecial   ahab.<init>:(Ljava/lang/String;)V
        //  1693: aload           10
        //  1695: athrow         
        //  1696: aload           15
        //  1698: getfield        ahar.d:Ljava/lang/Object;
        //  1701: astore          19
        //  1703: aload           15
        //  1705: getfield        ahar.b:Ljava/lang/Object;
        //  1708: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1711: astore          10
        //  1713: aload           19
        //  1715: checkcast       Lahcm;
        //  1718: astore          19
        //  1720: aload_2        
        //  1721: checkcast       Lagyi;
        //  1724: aload           19
        //  1726: aload           10
        //  1728: aload_3        
        //  1729: invokevirtual   agyi.q:(Lahcm;Ljava/lang/Class;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;
        //  1732: astore          10
        //  1734: aload           10
        //  1736: astore          7
        //  1738: goto            1677
        //  1741: aload           15
        //  1743: getfield        ahar.c:Ljava/lang/Object;
        //  1746: checkcast       Lahcm;
        //  1749: astore          19
        //  1751: aload_2        
        //  1752: checkcast       Lagyi;
        //  1755: astore          10
        //  1757: aload           10
        //  1759: aload           19
        //  1761: aconst_null    
        //  1762: aconst_null    
        //  1763: invokevirtual   agyi.q:(Lahcm;Ljava/lang/Class;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;
        //  1766: astore          10
        //  1768: aload           10
        //  1770: astore          11
        //  1772: goto            1787
        //  1775: astore          10
        //  1777: aload_2        
        //  1778: checkcast       Lagyi;
        //  1781: invokevirtual   agyi.P:()Z
        //  1784: ifeq            1790
        //  1787: goto            1618
        //  1790: new             Lahab;
        //  1793: astore          7
        //  1795: aload           7
        //  1797: ldc_w           "Unable to parse map entry."
        //  1800: invokespecial   ahab.<init>:(Ljava/lang/String;)V
        //  1803: aload           7
        //  1805: athrow         
        //  1806: aload           18
        //  1808: aload           11
        //  1810: aload           7
        //  1812: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1817: pop            
        //  1818: aload           6
        //  1820: astore          7
        //  1822: aload           6
        //  1824: astore          10
        //  1826: aload_2        
        //  1827: checkcast       Lagyi;
        //  1830: getfield        agyi.a:Lagyh;
        //  1833: iload           9
        //  1835: invokevirtual   agyh.C:(I)V
        //  1838: goto            21
        //  1841: astore          11
        //  1843: goto            1848
        //  1846: astore          11
        //  1848: aload           6
        //  1850: astore          7
        //  1852: aload           6
        //  1854: astore          10
        //  1856: aload_2        
        //  1857: checkcast       Lagyi;
        //  1860: getfield        agyi.a:Lagyh;
        //  1863: iload           9
        //  1865: invokevirtual   agyh.C:(I)V
        //  1868: aload           6
        //  1870: astore          7
        //  1872: aload           6
        //  1874: astore          10
        //  1876: aload           11
        //  1878: athrow         
        //  1879: aload           6
        //  1881: astore          7
        //  1883: aload           6
        //  1885: astore          10
        //  1887: iload           13
        //  1889: invokestatic    ahaz.D:(I)J
        //  1892: lstore          16
        //  1894: aload           6
        //  1896: astore          7
        //  1898: aload           6
        //  1900: astore          10
        //  1902: aload_0        
        //  1903: iload           9
        //  1905: invokespecial   ahaz.G:(I)Lahbp;
        //  1908: astore          18
        //  1910: aload           6
        //  1912: astore          7
        //  1914: aload           6
        //  1916: astore          10
        //  1918: aload_0        
        //  1919: getfield        ahaz.o:Laham;
        //  1922: aload_1        
        //  1923: lload           16
        //  1925: invokevirtual   aham.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  1928: astore          11
        //  1930: aload           6
        //  1932: astore          7
        //  1934: aload           6
        //  1936: astore          10
        //  1938: aload_2        
        //  1939: checkcast       Lagyi;
        //  1942: getfield        agyi.b:I
        //  1945: istore          8
        //  1947: aload           6
        //  1949: astore          7
        //  1951: aload           6
        //  1953: astore          10
        //  1955: iload           8
        //  1957: invokestatic    ahco.b:(I)I
        //  1960: iconst_3       
        //  1961: if_icmpne       2079
        //  1964: aload           6
        //  1966: astore          7
        //  1968: aload           6
        //  1970: astore          10
        //  1972: aload           11
        //  1974: aload_2        
        //  1975: checkcast       Lagyi;
        //  1978: aload           18
        //  1980: aload_3        
        //  1981: invokevirtual   agyi.r:(Lahbp;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;
        //  1984: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //  1989: pop            
        //  1990: aload           6
        //  1992: astore          7
        //  1994: aload           6
        //  1996: astore          10
        //  1998: aload_2        
        //  1999: checkcast       Lagyi;
        //  2002: getfield        agyi.a:Lagyh;
        //  2005: invokevirtual   agyh.E:()Z
        //  2008: ifne            21
        //  2011: aload           6
        //  2013: astore          7
        //  2015: aload           6
        //  2017: astore          10
        //  2019: aload_2        
        //  2020: checkcast       Lagyi;
        //  2023: getfield        agyi.c:I
        //  2026: ifeq            2032
        //  2029: goto            21
        //  2032: aload           6
        //  2034: astore          7
        //  2036: aload           6
        //  2038: astore          10
        //  2040: aload_2        
        //  2041: checkcast       Lagyi;
        //  2044: getfield        agyi.a:Lagyh;
        //  2047: invokevirtual   agyh.n:()I
        //  2050: istore          9
        //  2052: iload           9
        //  2054: iload           8
        //  2056: if_icmpeq       1964
        //  2059: aload           6
        //  2061: astore          7
        //  2063: aload           6
        //  2065: astore          10
        //  2067: aload_2        
        //  2068: checkcast       Lagyi;
        //  2071: iload           9
        //  2073: putfield        agyi.c:I
        //  2076: goto            21
        //  2079: aload           6
        //  2081: astore          7
        //  2083: aload           6
        //  2085: astore          10
        //  2087: invokestatic    ahab.a:()Lahaa;
        //  2090: athrow         
        //  2091: aload           6
        //  2093: astore          7
        //  2095: aload           6
        //  2097: astore          10
        //  2099: aload_2        
        //  2100: aload_0        
        //  2101: getfield        ahaz.o:Laham;
        //  2104: aload_1        
        //  2105: iload           13
        //  2107: invokestatic    ahaz.D:(I)J
        //  2110: invokevirtual   aham.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  2113: invokeinterface ahbk.J:(Ljava/util/List;)V
        //  2118: goto            21
        //  2121: aload           6
        //  2123: astore          7
        //  2125: aload           6
        //  2127: astore          10
        //  2129: aload_2        
        //  2130: aload_0        
        //  2131: getfield        ahaz.o:Laham;
        //  2134: aload_1        
        //  2135: iload           13
        //  2137: invokestatic    ahaz.D:(I)J
        //  2140: invokevirtual   aham.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  2143: invokeinterface ahbk.I:(Ljava/util/List;)V
        //  2148: goto            21
        //  2151: aload           6
        //  2153: astore          7
        //  2155: aload           6
        //  2157: astore          10
        //  2159: aload_2        
        //  2160: aload_0        
        //  2161: getfield        ahaz.o:Laham;
        //  2164: aload_1        
        //  2165: iload           13
        //  2167: invokestatic    ahaz.D:(I)J
        //  2170: invokevirtual   aham.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  2173: invokeinterface ahbk.H:(Ljava/util/List;)V
        //  2178: goto            21
        //  2181: aload           6
        //  2183: astore          7
        //  2185: aload           6
        //  2187: astore          10
        //  2189: aload_2        
        //  2190: aload_0        
        //  2191: getfield        ahaz.o:Laham;
        //  2194: aload_1        
        //  2195: iload           13
        //  2197: invokestatic    ahaz.D:(I)J
        //  2200: invokevirtual   aham.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  2203: invokeinterface ahbk.G:(Ljava/util/List;)V
        //  2208: goto            21
        //  2211: aload           6
        //  2213: astore          7
        //  2215: aload           6
        //  2217: astore          10
        //  2219: aload_0        
        //  2220: getfield        ahaz.o:Laham;
        //  2223: aload_1        
        //  2224: iload           13
        //  2226: invokestatic    ahaz.D:(I)J
        //  2229: invokevirtual   aham.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  2232: astore          11
        //  2234: aload           6
        //  2236: astore          7
        //  2238: aload           6
        //  2240: astore          10
        //  2242: aload_2        
        //  2243: aload           11
        //  2245: invokeinterface ahbk.A:(Ljava/util/List;)V
        //  2250: aload           6
        //  2252: astore          7
        //  2254: aload           6
        //  2256: astore          10
        //  2258: aload_1        
        //  2259: iload           8
        //  2261: aload           11
        //  2263: aload_0        
        //  2264: iload           9
        //  2266: invokespecial   ahaz.F:(I)Lagzo;
        //  2269: aload           6
        //  2271: aload           4
        //  2273: invokestatic    ahbq.Y:(Ljava/lang/Object;ILjava/util/List;Lagzo;Ljava/lang/Object;Laeda;)Ljava/lang/Object;
        //  2276: astore          6
        //  2278: goto            21
        //  2281: aload           6
        //  2283: astore          7
        //  2285: aload           6
        //  2287: astore          10
        //  2289: aload_2        
        //  2290: aload_0        
        //  2291: getfield        ahaz.o:Laham;
        //  2294: aload_1        
        //  2295: iload           13
        //  2297: invokestatic    ahaz.D:(I)J
        //  2300: invokevirtual   aham.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  2303: invokeinterface ahbk.L:(Ljava/util/List;)V
        //  2308: goto            21
        //  2311: aload           6
        //  2313: astore          7
        //  2315: aload           6
        //  2317: astore          10
        //  2319: aload_2        
        //  2320: aload_0        
        //  2321: getfield        ahaz.o:Laham;
        //  2324: aload_1        
        //  2325: iload           13
        //  2327: invokestatic    ahaz.D:(I)J
        //  2330: invokevirtual   aham.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  2333: invokeinterface ahbk.y:(Ljava/util/List;)V
        //  2338: goto            21
        //  2341: aload           6
        //  2343: astore          7
        //  2345: aload           6
        //  2347: astore          10
        //  2349: aload_2        
        //  2350: aload_0        
        //  2351: getfield        ahaz.o:Laham;
        //  2354: aload_1        
        //  2355: iload           13
        //  2357: invokestatic    ahaz.D:(I)J
        //  2360: invokevirtual   aham.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  2363: invokeinterface ahbk.B:(Ljava/util/List;)V
        //  2368: goto            21
        //  2371: aload           6
        //  2373: astore          7
        //  2375: aload           6
        //  2377: astore          10
        //  2379: aload_2        
        //  2380: aload_0        
        //  2381: getfield        ahaz.o:Laham;
        //  2384: aload_1        
        //  2385: iload           13
        //  2387: invokestatic    ahaz.D:(I)J
        //  2390: invokevirtual   aham.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  2393: invokeinterface ahbk.C:(Ljava/util/List;)V
        //  2398: goto            21
        //  2401: aload           6
        //  2403: astore          7
        //  2405: aload           6
        //  2407: astore          10
        //  2409: aload_2        
        //  2410: aload_0        
        //  2411: getfield        ahaz.o:Laham;
        //  2414: aload_1        
        //  2415: iload           13
        //  2417: invokestatic    ahaz.D:(I)J
        //  2420: invokevirtual   aham.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  2423: invokeinterface ahbk.E:(Ljava/util/List;)V
        //  2428: goto            21
        //  2431: aload           6
        //  2433: astore          7
        //  2435: aload           6
        //  2437: astore          10
        //  2439: aload_2        
        //  2440: aload_0        
        //  2441: getfield        ahaz.o:Laham;
        //  2444: aload_1        
        //  2445: iload           13
        //  2447: invokestatic    ahaz.D:(I)J
        //  2450: invokevirtual   aham.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  2453: invokeinterface ahbk.M:(Ljava/util/List;)V
        //  2458: goto            21
        //  2461: aload           6
        //  2463: astore          7
        //  2465: aload           6
        //  2467: astore          10
        //  2469: aload_2        
        //  2470: aload_0        
        //  2471: getfield        ahaz.o:Laham;
        //  2474: aload_1        
        //  2475: iload           13
        //  2477: invokestatic    ahaz.D:(I)J
        //  2480: invokevirtual   aham.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  2483: invokeinterface ahbk.F:(Ljava/util/List;)V
        //  2488: goto            21
        //  2491: aload           6
        //  2493: astore          7
        //  2495: aload           6
        //  2497: astore          10
        //  2499: aload_2        
        //  2500: aload_0        
        //  2501: getfield        ahaz.o:Laham;
        //  2504: aload_1        
        //  2505: iload           13
        //  2507: invokestatic    ahaz.D:(I)J
        //  2510: invokevirtual   aham.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  2513: invokeinterface ahbk.D:(Ljava/util/List;)V
        //  2518: goto            21
        //  2521: aload           6
        //  2523: astore          7
        //  2525: aload           6
        //  2527: astore          10
        //  2529: aload_2        
        //  2530: aload_0        
        //  2531: getfield        ahaz.o:Laham;
        //  2534: aload_1        
        //  2535: iload           13
        //  2537: invokestatic    ahaz.D:(I)J
        //  2540: invokevirtual   aham.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  2543: invokeinterface ahbk.z:(Ljava/util/List;)V
        //  2548: goto            21
        //  2551: aload           6
        //  2553: astore          7
        //  2555: aload           6
        //  2557: astore          10
        //  2559: aload_2        
        //  2560: aload_0        
        //  2561: getfield        ahaz.o:Laham;
        //  2564: aload_1        
        //  2565: iload           13
        //  2567: invokestatic    ahaz.D:(I)J
        //  2570: invokevirtual   aham.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  2573: invokeinterface ahbk.J:(Ljava/util/List;)V
        //  2578: goto            21
        //  2581: aload           6
        //  2583: astore          7
        //  2585: aload           6
        //  2587: astore          10
        //  2589: aload_2        
        //  2590: aload_0        
        //  2591: getfield        ahaz.o:Laham;
        //  2594: aload_1        
        //  2595: iload           13
        //  2597: invokestatic    ahaz.D:(I)J
        //  2600: invokevirtual   aham.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  2603: invokeinterface ahbk.I:(Ljava/util/List;)V
        //  2608: goto            21
        //  2611: aload           6
        //  2613: astore          7
        //  2615: aload           6
        //  2617: astore          10
        //  2619: aload_2        
        //  2620: aload_0        
        //  2621: getfield        ahaz.o:Laham;
        //  2624: aload_1        
        //  2625: iload           13
        //  2627: invokestatic    ahaz.D:(I)J
        //  2630: invokevirtual   aham.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  2633: invokeinterface ahbk.H:(Ljava/util/List;)V
        //  2638: goto            21
        //  2641: aload           6
        //  2643: astore          7
        //  2645: aload           6
        //  2647: astore          10
        //  2649: aload_2        
        //  2650: aload_0        
        //  2651: getfield        ahaz.o:Laham;
        //  2654: aload_1        
        //  2655: iload           13
        //  2657: invokestatic    ahaz.D:(I)J
        //  2660: invokevirtual   aham.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  2663: invokeinterface ahbk.G:(Ljava/util/List;)V
        //  2668: goto            21
        //  2671: aload           6
        //  2673: astore          7
        //  2675: aload           6
        //  2677: astore          10
        //  2679: aload_0        
        //  2680: getfield        ahaz.o:Laham;
        //  2683: aload_1        
        //  2684: iload           13
        //  2686: invokestatic    ahaz.D:(I)J
        //  2689: invokevirtual   aham.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  2692: astore          11
        //  2694: aload           6
        //  2696: astore          7
        //  2698: aload           6
        //  2700: astore          10
        //  2702: aload_2        
        //  2703: aload           11
        //  2705: invokeinterface ahbk.A:(Ljava/util/List;)V
        //  2710: aload           6
        //  2712: astore          7
        //  2714: aload           6
        //  2716: astore          10
        //  2718: aload_1        
        //  2719: iload           8
        //  2721: aload           11
        //  2723: aload_0        
        //  2724: iload           9
        //  2726: invokespecial   ahaz.F:(I)Lagzo;
        //  2729: aload           6
        //  2731: aload           4
        //  2733: invokestatic    ahbq.Y:(Ljava/lang/Object;ILjava/util/List;Lagzo;Ljava/lang/Object;Laeda;)Ljava/lang/Object;
        //  2736: astore          6
        //  2738: goto            21
        //  2741: aload           6
        //  2743: astore          7
        //  2745: aload           6
        //  2747: astore          10
        //  2749: aload_2        
        //  2750: aload_0        
        //  2751: getfield        ahaz.o:Laham;
        //  2754: aload_1        
        //  2755: iload           13
        //  2757: invokestatic    ahaz.D:(I)J
        //  2760: invokevirtual   aham.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  2763: invokeinterface ahbk.L:(Ljava/util/List;)V
        //  2768: goto            21
        //  2771: aload           6
        //  2773: astore          7
        //  2775: aload           6
        //  2777: astore          10
        //  2779: aload_0        
        //  2780: getfield        ahaz.o:Laham;
        //  2783: aload_1        
        //  2784: iload           13
        //  2786: invokestatic    ahaz.D:(I)J
        //  2789: invokevirtual   aham.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  2792: astore          11
        //  2794: aload           6
        //  2796: astore          7
        //  2798: aload           6
        //  2800: astore          10
        //  2802: aload_2        
        //  2803: checkcast       Lagyi;
        //  2806: getfield        agyi.b:I
        //  2809: invokestatic    ahco.b:(I)I
        //  2812: iconst_2       
        //  2813: if_icmpne       2923
        //  2816: aload           6
        //  2818: astore          7
        //  2820: aload           6
        //  2822: astore          10
        //  2824: aload           11
        //  2826: aload_2        
        //  2827: checkcast       Lagyi;
        //  2830: invokevirtual   agyi.o:()Lagyc;
        //  2833: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //  2838: pop            
        //  2839: aload           6
        //  2841: astore          7
        //  2843: aload           6
        //  2845: astore          10
        //  2847: aload_2        
        //  2848: checkcast       Lagyi;
        //  2851: getfield        agyi.a:Lagyh;
        //  2854: invokevirtual   agyh.E:()Z
        //  2857: ifeq            2863
        //  2860: goto            21
        //  2863: aload           6
        //  2865: astore          7
        //  2867: aload           6
        //  2869: astore          10
        //  2871: aload_2        
        //  2872: checkcast       Lagyi;
        //  2875: getfield        agyi.a:Lagyh;
        //  2878: invokevirtual   agyh.n:()I
        //  2881: istore          8
        //  2883: aload           6
        //  2885: astore          7
        //  2887: aload           6
        //  2889: astore          10
        //  2891: iload           8
        //  2893: aload_2        
        //  2894: checkcast       Lagyi;
        //  2897: getfield        agyi.b:I
        //  2900: if_icmpeq       2816
        //  2903: aload           6
        //  2905: astore          7
        //  2907: aload           6
        //  2909: astore          10
        //  2911: aload_2        
        //  2912: checkcast       Lagyi;
        //  2915: iload           8
        //  2917: putfield        agyi.c:I
        //  2920: goto            21
        //  2923: aload           6
        //  2925: astore          7
        //  2927: aload           6
        //  2929: astore          10
        //  2931: invokestatic    ahab.a:()Lahaa;
        //  2934: athrow         
        //  2935: aload           6
        //  2937: astore          7
        //  2939: aload           6
        //  2941: astore          10
        //  2943: aload_0        
        //  2944: iload           9
        //  2946: invokespecial   ahaz.G:(I)Lahbp;
        //  2949: astore          18
        //  2951: aload           6
        //  2953: astore          7
        //  2955: aload           6
        //  2957: astore          10
        //  2959: aload_0        
        //  2960: getfield        ahaz.o:Laham;
        //  2963: aload_1        
        //  2964: iload           13
        //  2966: invokestatic    ahaz.D:(I)J
        //  2969: invokevirtual   aham.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  2972: astore          11
        //  2974: aload           6
        //  2976: astore          7
        //  2978: aload           6
        //  2980: astore          10
        //  2982: aload_2        
        //  2983: checkcast       Lagyi;
        //  2986: getfield        agyi.b:I
        //  2989: istore          8
        //  2991: aload           6
        //  2993: astore          7
        //  2995: aload           6
        //  2997: astore          10
        //  2999: iload           8
        //  3001: invokestatic    ahco.b:(I)I
        //  3004: iconst_2       
        //  3005: if_icmpne       3123
        //  3008: aload           6
        //  3010: astore          7
        //  3012: aload           6
        //  3014: astore          10
        //  3016: aload           11
        //  3018: aload_2        
        //  3019: checkcast       Lagyi;
        //  3022: aload           18
        //  3024: aload_3        
        //  3025: invokevirtual   agyi.s:(Lahbp;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;
        //  3028: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //  3033: pop            
        //  3034: aload           6
        //  3036: astore          7
        //  3038: aload           6
        //  3040: astore          10
        //  3042: aload_2        
        //  3043: checkcast       Lagyi;
        //  3046: getfield        agyi.a:Lagyh;
        //  3049: invokevirtual   agyh.E:()Z
        //  3052: ifne            21
        //  3055: aload           6
        //  3057: astore          7
        //  3059: aload           6
        //  3061: astore          10
        //  3063: aload_2        
        //  3064: checkcast       Lagyi;
        //  3067: getfield        agyi.c:I
        //  3070: ifeq            3076
        //  3073: goto            21
        //  3076: aload           6
        //  3078: astore          7
        //  3080: aload           6
        //  3082: astore          10
        //  3084: aload_2        
        //  3085: checkcast       Lagyi;
        //  3088: getfield        agyi.a:Lagyh;
        //  3091: invokevirtual   agyh.n:()I
        //  3094: istore          9
        //  3096: iload           9
        //  3098: iload           8
        //  3100: if_icmpeq       3008
        //  3103: aload           6
        //  3105: astore          7
        //  3107: aload           6
        //  3109: astore          10
        //  3111: aload_2        
        //  3112: checkcast       Lagyi;
        //  3115: iload           9
        //  3117: putfield        agyi.c:I
        //  3120: goto            21
        //  3123: aload           6
        //  3125: astore          7
        //  3127: aload           6
        //  3129: astore          10
        //  3131: invokestatic    ahab.a:()Lahaa;
        //  3134: athrow         
        //  3135: aload           6
        //  3137: astore          7
        //  3139: aload           6
        //  3141: astore          10
        //  3143: iload           13
        //  3145: invokestatic    ahaz.V:(I)Z
        //  3148: ifeq            3195
        //  3151: aload           6
        //  3153: astore          7
        //  3155: aload           6
        //  3157: astore          10
        //  3159: aload_0        
        //  3160: getfield        ahaz.o:Laham;
        //  3163: aload_1        
        //  3164: iload           13
        //  3166: invokestatic    ahaz.D:(I)J
        //  3169: invokevirtual   aham.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  3172: astore          11
        //  3174: aload           6
        //  3176: astore          7
        //  3178: aload           6
        //  3180: astore          10
        //  3182: aload_2        
        //  3183: checkcast       Lagyi;
        //  3186: aload           11
        //  3188: iconst_1       
        //  3189: invokevirtual   agyi.K:(Ljava/util/List;Z)V
        //  3192: goto            21
        //  3195: aload           6
        //  3197: astore          7
        //  3199: aload           6
        //  3201: astore          10
        //  3203: aload_0        
        //  3204: getfield        ahaz.o:Laham;
        //  3207: aload_1        
        //  3208: iload           13
        //  3210: invokestatic    ahaz.D:(I)J
        //  3213: invokevirtual   aham.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  3216: astore          11
        //  3218: aload           6
        //  3220: astore          7
        //  3222: aload           6
        //  3224: astore          10
        //  3226: aload_2        
        //  3227: checkcast       Lagyi;
        //  3230: aload           11
        //  3232: iconst_0       
        //  3233: invokevirtual   agyi.K:(Ljava/util/List;Z)V
        //  3236: goto            21
        //  3239: aload           6
        //  3241: astore          7
        //  3243: aload           6
        //  3245: astore          10
        //  3247: aload_2        
        //  3248: aload_0        
        //  3249: getfield        ahaz.o:Laham;
        //  3252: aload_1        
        //  3253: iload           13
        //  3255: invokestatic    ahaz.D:(I)J
        //  3258: invokevirtual   aham.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  3261: invokeinterface ahbk.y:(Ljava/util/List;)V
        //  3266: goto            21
        //  3269: aload           6
        //  3271: astore          7
        //  3273: aload           6
        //  3275: astore          10
        //  3277: aload_2        
        //  3278: aload_0        
        //  3279: getfield        ahaz.o:Laham;
        //  3282: aload_1        
        //  3283: iload           13
        //  3285: invokestatic    ahaz.D:(I)J
        //  3288: invokevirtual   aham.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  3291: invokeinterface ahbk.B:(Ljava/util/List;)V
        //  3296: goto            21
        //  3299: aload           6
        //  3301: astore          7
        //  3303: aload           6
        //  3305: astore          10
        //  3307: aload_2        
        //  3308: aload_0        
        //  3309: getfield        ahaz.o:Laham;
        //  3312: aload_1        
        //  3313: iload           13
        //  3315: invokestatic    ahaz.D:(I)J
        //  3318: invokevirtual   aham.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  3321: invokeinterface ahbk.C:(Ljava/util/List;)V
        //  3326: goto            21
        //  3329: aload           6
        //  3331: astore          7
        //  3333: aload           6
        //  3335: astore          10
        //  3337: aload_2        
        //  3338: aload_0        
        //  3339: getfield        ahaz.o:Laham;
        //  3342: aload_1        
        //  3343: iload           13
        //  3345: invokestatic    ahaz.D:(I)J
        //  3348: invokevirtual   aham.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  3351: invokeinterface ahbk.E:(Ljava/util/List;)V
        //  3356: goto            21
        //  3359: aload           6
        //  3361: astore          7
        //  3363: aload           6
        //  3365: astore          10
        //  3367: aload_2        
        //  3368: aload_0        
        //  3369: getfield        ahaz.o:Laham;
        //  3372: aload_1        
        //  3373: iload           13
        //  3375: invokestatic    ahaz.D:(I)J
        //  3378: invokevirtual   aham.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  3381: invokeinterface ahbk.M:(Ljava/util/List;)V
        //  3386: goto            21
        //  3389: aload           6
        //  3391: astore          7
        //  3393: aload           6
        //  3395: astore          10
        //  3397: aload_2        
        //  3398: aload_0        
        //  3399: getfield        ahaz.o:Laham;
        //  3402: aload_1        
        //  3403: iload           13
        //  3405: invokestatic    ahaz.D:(I)J
        //  3408: invokevirtual   aham.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  3411: invokeinterface ahbk.F:(Ljava/util/List;)V
        //  3416: goto            21
        //  3419: aload           6
        //  3421: astore          7
        //  3423: aload           6
        //  3425: astore          10
        //  3427: aload_2        
        //  3428: aload_0        
        //  3429: getfield        ahaz.o:Laham;
        //  3432: aload_1        
        //  3433: iload           13
        //  3435: invokestatic    ahaz.D:(I)J
        //  3438: invokevirtual   aham.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  3441: invokeinterface ahbk.D:(Ljava/util/List;)V
        //  3446: goto            21
        //  3449: aload           6
        //  3451: astore          7
        //  3453: aload           6
        //  3455: astore          10
        //  3457: aload_2        
        //  3458: aload_0        
        //  3459: getfield        ahaz.o:Laham;
        //  3462: aload_1        
        //  3463: iload           13
        //  3465: invokestatic    ahaz.D:(I)J
        //  3468: invokevirtual   aham.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  3471: invokeinterface ahbk.z:(Ljava/util/List;)V
        //  3476: goto            21
        //  3479: aload           6
        //  3481: astore          7
        //  3483: aload           6
        //  3485: astore          10
        //  3487: aload_0        
        //  3488: aload_1        
        //  3489: iload           9
        //  3491: invokespecial   ahaz.I:(Ljava/lang/Object;I)Ljava/lang/Object;
        //  3494: checkcast       Lcom/google/protobuf/MessageLite;
        //  3497: astore          11
        //  3499: aload           6
        //  3501: astore          7
        //  3503: aload           6
        //  3505: astore          10
        //  3507: aload_2        
        //  3508: aload           11
        //  3510: aload_0        
        //  3511: iload           9
        //  3513: invokespecial   ahaz.G:(I)Lahbp;
        //  3516: aload_3        
        //  3517: invokeinterface ahbk.w:(Ljava/lang/Object;Lahbp;Lcom/google/protobuf/ExtensionRegistryLite;)V
        //  3522: aload           6
        //  3524: astore          7
        //  3526: aload           6
        //  3528: astore          10
        //  3530: aload_0        
        //  3531: aload_1        
        //  3532: iload           9
        //  3534: aload           11
        //  3536: invokespecial   ahaz.S:(Ljava/lang/Object;ILjava/lang/Object;)V
        //  3539: goto            21
        //  3542: aload           6
        //  3544: astore          7
        //  3546: aload           6
        //  3548: astore          10
        //  3550: aload_1        
        //  3551: iload           13
        //  3553: invokestatic    ahaz.D:(I)J
        //  3556: aload_2        
        //  3557: invokeinterface ahbk.m:()J
        //  3562: invokestatic    ahcj.u:(Ljava/lang/Object;JJ)V
        //  3565: aload           6
        //  3567: astore          7
        //  3569: aload           6
        //  3571: astore          10
        //  3573: aload_0        
        //  3574: aload_1        
        //  3575: iload           9
        //  3577: invokespecial   ahaz.Q:(Ljava/lang/Object;I)V
        //  3580: goto            21
        //  3583: aload           6
        //  3585: astore          7
        //  3587: aload           6
        //  3589: astore          10
        //  3591: aload_1        
        //  3592: iload           13
        //  3594: invokestatic    ahaz.D:(I)J
        //  3597: aload_2        
        //  3598: invokeinterface ahbk.h:()I
        //  3603: invokestatic    ahcj.t:(Ljava/lang/Object;JI)V
        //  3606: aload           6
        //  3608: astore          7
        //  3610: aload           6
        //  3612: astore          10
        //  3614: aload_0        
        //  3615: aload_1        
        //  3616: iload           9
        //  3618: invokespecial   ahaz.Q:(Ljava/lang/Object;I)V
        //  3621: goto            21
        //  3624: aload           6
        //  3626: astore          7
        //  3628: aload           6
        //  3630: astore          10
        //  3632: aload_1        
        //  3633: iload           13
        //  3635: invokestatic    ahaz.D:(I)J
        //  3638: aload_2        
        //  3639: invokeinterface ahbk.l:()J
        //  3644: invokestatic    ahcj.u:(Ljava/lang/Object;JJ)V
        //  3647: aload           6
        //  3649: astore          7
        //  3651: aload           6
        //  3653: astore          10
        //  3655: aload_0        
        //  3656: aload_1        
        //  3657: iload           9
        //  3659: invokespecial   ahaz.Q:(Ljava/lang/Object;I)V
        //  3662: goto            21
        //  3665: aload           6
        //  3667: astore          7
        //  3669: aload           6
        //  3671: astore          10
        //  3673: aload_1        
        //  3674: iload           13
        //  3676: invokestatic    ahaz.D:(I)J
        //  3679: aload_2        
        //  3680: invokeinterface ahbk.g:()I
        //  3685: invokestatic    ahcj.t:(Ljava/lang/Object;JI)V
        //  3688: aload           6
        //  3690: astore          7
        //  3692: aload           6
        //  3694: astore          10
        //  3696: aload_0        
        //  3697: aload_1        
        //  3698: iload           9
        //  3700: invokespecial   ahaz.Q:(Ljava/lang/Object;I)V
        //  3703: goto            21
        //  3706: aload           6
        //  3708: astore          7
        //  3710: aload           6
        //  3712: astore          10
        //  3714: aload_2        
        //  3715: invokeinterface ahbk.d:()I
        //  3720: istore          14
        //  3722: aload           6
        //  3724: astore          7
        //  3726: aload           6
        //  3728: astore          10
        //  3730: aload_0        
        //  3731: iload           9
        //  3733: invokespecial   ahaz.F:(I)Lagzo;
        //  3736: astore          11
        //  3738: aload           11
        //  3740: ifnull          3789
        //  3743: aload           6
        //  3745: astore          7
        //  3747: aload           6
        //  3749: astore          10
        //  3751: aload           11
        //  3753: iload           14
        //  3755: invokeinterface agzo.isInRange:(I)Z
        //  3760: ifeq            3766
        //  3763: goto            3789
        //  3766: aload           6
        //  3768: astore          7
        //  3770: aload           6
        //  3772: astore          10
        //  3774: aload_1        
        //  3775: iload           8
        //  3777: iload           14
        //  3779: aload           6
        //  3781: invokestatic    ahbq.E:(Ljava/lang/Object;IILjava/lang/Object;)Ljava/lang/Object;
        //  3784: astore          6
        //  3786: goto            21
        //  3789: aload           6
        //  3791: astore          7
        //  3793: aload           6
        //  3795: astore          10
        //  3797: aload_1        
        //  3798: iload           13
        //  3800: invokestatic    ahaz.D:(I)J
        //  3803: iload           14
        //  3805: invokestatic    ahcj.t:(Ljava/lang/Object;JI)V
        //  3808: aload           6
        //  3810: astore          7
        //  3812: aload           6
        //  3814: astore          10
        //  3816: aload_0        
        //  3817: aload_1        
        //  3818: iload           9
        //  3820: invokespecial   ahaz.Q:(Ljava/lang/Object;I)V
        //  3823: goto            21
        //  3826: aload           6
        //  3828: astore          7
        //  3830: aload           6
        //  3832: astore          10
        //  3834: aload_1        
        //  3835: iload           13
        //  3837: invokestatic    ahaz.D:(I)J
        //  3840: aload_2        
        //  3841: invokeinterface ahbk.i:()I
        //  3846: invokestatic    ahcj.t:(Ljava/lang/Object;JI)V
        //  3849: aload           6
        //  3851: astore          7
        //  3853: aload           6
        //  3855: astore          10
        //  3857: aload_0        
        //  3858: aload_1        
        //  3859: iload           9
        //  3861: invokespecial   ahaz.Q:(Ljava/lang/Object;I)V
        //  3864: goto            21
        //  3867: aload           6
        //  3869: astore          7
        //  3871: aload           6
        //  3873: astore          10
        //  3875: aload_1        
        //  3876: iload           13
        //  3878: invokestatic    ahaz.D:(I)J
        //  3881: aload_2        
        //  3882: invokeinterface ahbk.o:()Lagyc;
        //  3887: invokestatic    ahcj.v:(Ljava/lang/Object;JLjava/lang/Object;)V
        //  3890: aload           6
        //  3892: astore          7
        //  3894: aload           6
        //  3896: astore          10
        //  3898: aload_0        
        //  3899: aload_1        
        //  3900: iload           9
        //  3902: invokespecial   ahaz.Q:(Ljava/lang/Object;I)V
        //  3905: goto            21
        //  3908: aload           6
        //  3910: astore          7
        //  3912: aload           6
        //  3914: astore          10
        //  3916: aload_0        
        //  3917: aload_1        
        //  3918: iload           9
        //  3920: invokespecial   ahaz.I:(Ljava/lang/Object;I)Ljava/lang/Object;
        //  3923: checkcast       Lcom/google/protobuf/MessageLite;
        //  3926: astore          11
        //  3928: aload           6
        //  3930: astore          7
        //  3932: aload           6
        //  3934: astore          10
        //  3936: aload_2        
        //  3937: aload           11
        //  3939: aload_0        
        //  3940: iload           9
        //  3942: invokespecial   ahaz.G:(I)Lahbp;
        //  3945: aload_3        
        //  3946: invokeinterface ahbk.x:(Ljava/lang/Object;Lahbp;Lcom/google/protobuf/ExtensionRegistryLite;)V
        //  3951: aload           6
        //  3953: astore          7
        //  3955: aload           6
        //  3957: astore          10
        //  3959: aload_0        
        //  3960: aload_1        
        //  3961: iload           9
        //  3963: aload           11
        //  3965: invokespecial   ahaz.S:(Ljava/lang/Object;ILjava/lang/Object;)V
        //  3968: goto            21
        //  3971: aload           6
        //  3973: astore          7
        //  3975: aload           6
        //  3977: astore          10
        //  3979: aload_0        
        //  3980: aload_1        
        //  3981: iload           13
        //  3983: aload_2        
        //  3984: invokespecial   ahaz.P:(Ljava/lang/Object;ILahbk;)V
        //  3987: aload           6
        //  3989: astore          7
        //  3991: aload           6
        //  3993: astore          10
        //  3995: aload_0        
        //  3996: aload_1        
        //  3997: iload           9
        //  3999: invokespecial   ahaz.Q:(Ljava/lang/Object;I)V
        //  4002: goto            21
        //  4005: aload           6
        //  4007: astore          7
        //  4009: aload           6
        //  4011: astore          10
        //  4013: aload_1        
        //  4014: iload           13
        //  4016: invokestatic    ahaz.D:(I)J
        //  4019: aload_2        
        //  4020: invokeinterface ahbk.O:()Z
        //  4025: invokestatic    ahcj.n:(Ljava/lang/Object;JZ)V
        //  4028: aload           6
        //  4030: astore          7
        //  4032: aload           6
        //  4034: astore          10
        //  4036: aload_0        
        //  4037: aload_1        
        //  4038: iload           9
        //  4040: invokespecial   ahaz.Q:(Ljava/lang/Object;I)V
        //  4043: goto            21
        //  4046: aload           6
        //  4048: astore          7
        //  4050: aload           6
        //  4052: astore          10
        //  4054: aload_1        
        //  4055: iload           13
        //  4057: invokestatic    ahaz.D:(I)J
        //  4060: aload_2        
        //  4061: invokeinterface ahbk.e:()I
        //  4066: invokestatic    ahcj.t:(Ljava/lang/Object;JI)V
        //  4069: aload           6
        //  4071: astore          7
        //  4073: aload           6
        //  4075: astore          10
        //  4077: aload_0        
        //  4078: aload_1        
        //  4079: iload           9
        //  4081: invokespecial   ahaz.Q:(Ljava/lang/Object;I)V
        //  4084: goto            21
        //  4087: aload           6
        //  4089: astore          7
        //  4091: aload           6
        //  4093: astore          10
        //  4095: aload_1        
        //  4096: iload           13
        //  4098: invokestatic    ahaz.D:(I)J
        //  4101: aload_2        
        //  4102: invokeinterface ahbk.j:()J
        //  4107: invokestatic    ahcj.u:(Ljava/lang/Object;JJ)V
        //  4110: aload           6
        //  4112: astore          7
        //  4114: aload           6
        //  4116: astore          10
        //  4118: aload_0        
        //  4119: aload_1        
        //  4120: iload           9
        //  4122: invokespecial   ahaz.Q:(Ljava/lang/Object;I)V
        //  4125: goto            21
        //  4128: aload           6
        //  4130: astore          7
        //  4132: aload           6
        //  4134: astore          10
        //  4136: aload_1        
        //  4137: iload           13
        //  4139: invokestatic    ahaz.D:(I)J
        //  4142: aload_2        
        //  4143: invokeinterface ahbk.f:()I
        //  4148: invokestatic    ahcj.t:(Ljava/lang/Object;JI)V
        //  4151: aload           6
        //  4153: astore          7
        //  4155: aload           6
        //  4157: astore          10
        //  4159: aload_0        
        //  4160: aload_1        
        //  4161: iload           9
        //  4163: invokespecial   ahaz.Q:(Ljava/lang/Object;I)V
        //  4166: goto            21
        //  4169: aload           6
        //  4171: astore          7
        //  4173: aload           6
        //  4175: astore          10
        //  4177: aload_1        
        //  4178: iload           13
        //  4180: invokestatic    ahaz.D:(I)J
        //  4183: aload_2        
        //  4184: invokeinterface ahbk.n:()J
        //  4189: invokestatic    ahcj.u:(Ljava/lang/Object;JJ)V
        //  4192: aload           6
        //  4194: astore          7
        //  4196: aload           6
        //  4198: astore          10
        //  4200: aload_0        
        //  4201: aload_1        
        //  4202: iload           9
        //  4204: invokespecial   ahaz.Q:(Ljava/lang/Object;I)V
        //  4207: goto            21
        //  4210: aload           6
        //  4212: astore          7
        //  4214: aload           6
        //  4216: astore          10
        //  4218: aload_1        
        //  4219: iload           13
        //  4221: invokestatic    ahaz.D:(I)J
        //  4224: aload_2        
        //  4225: invokeinterface ahbk.k:()J
        //  4230: invokestatic    ahcj.u:(Ljava/lang/Object;JJ)V
        //  4233: aload           6
        //  4235: astore          7
        //  4237: aload           6
        //  4239: astore          10
        //  4241: aload_0        
        //  4242: aload_1        
        //  4243: iload           9
        //  4245: invokespecial   ahaz.Q:(Ljava/lang/Object;I)V
        //  4248: goto            21
        //  4251: aload           6
        //  4253: astore          7
        //  4255: aload           6
        //  4257: astore          10
        //  4259: aload_1        
        //  4260: iload           13
        //  4262: invokestatic    ahaz.D:(I)J
        //  4265: aload_2        
        //  4266: invokeinterface ahbk.b:()F
        //  4271: invokestatic    ahcj.s:(Ljava/lang/Object;JF)V
        //  4274: aload           6
        //  4276: astore          7
        //  4278: aload           6
        //  4280: astore          10
        //  4282: aload_0        
        //  4283: aload_1        
        //  4284: iload           9
        //  4286: invokespecial   ahaz.Q:(Ljava/lang/Object;I)V
        //  4289: goto            21
        //  4292: aload           6
        //  4294: astore          7
        //  4296: aload           6
        //  4298: astore          10
        //  4300: aload_1        
        //  4301: iload           13
        //  4303: invokestatic    ahaz.D:(I)J
        //  4306: aload_2        
        //  4307: invokeinterface ahbk.a:()D
        //  4312: invokestatic    ahcj.r:(Ljava/lang/Object;JD)V
        //  4315: aload           6
        //  4317: astore          7
        //  4319: aload           6
        //  4321: astore          10
        //  4323: aload_0        
        //  4324: aload_1        
        //  4325: iload           9
        //  4327: invokespecial   ahaz.Q:(Ljava/lang/Object;I)V
        //  4330: goto            21
        //  4333: aload           11
        //  4335: astore          7
        //  4337: aload           11
        //  4339: astore          10
        //  4341: aload           4
        //  4343: aload           11
        //  4345: aload_2        
        //  4346: invokevirtual   aeda.aI:(Ljava/lang/Object;Lahbk;)Z
        //  4349: istore          12
        //  4351: aload           11
        //  4353: astore          6
        //  4355: iload           12
        //  4357: ifne            21
        //  4360: aload_0        
        //  4361: getfield        ahaz.m:I
        //  4364: istore          8
        //  4366: aload           11
        //  4368: astore_2       
        //  4369: iload           8
        //  4371: aload_0        
        //  4372: getfield        ahaz.n:I
        //  4375: if_icmpge       4399
        //  4378: aload_0        
        //  4379: aload_1        
        //  4380: aload_0        
        //  4381: getfield        ahaz.l:[I
        //  4384: iload           8
        //  4386: iaload         
        //  4387: aload_2        
        //  4388: aload_1        
        //  4389: invokespecial   ahaz.af:(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  4392: astore_2       
        //  4393: iinc            8, 1
        //  4396: goto            4369
        //  4399: aload_2        
        //  4400: ifnull          4502
        //  4403: goto            101
        //  4406: goto            4414
        //  4409: astore          7
        //  4411: goto            4406
        //  4414: aload           6
        //  4416: astore          11
        //  4418: aload           6
        //  4420: ifnonnull       4433
        //  4423: aload           6
        //  4425: astore          7
        //  4427: aload_1        
        //  4428: invokestatic    aeda.aN:(Ljava/lang/Object;)Ljava/lang/Object;
        //  4431: astore          11
        //  4433: aload           11
        //  4435: astore          7
        //  4437: aload           4
        //  4439: aload           11
        //  4441: aload_2        
        //  4442: invokevirtual   aeda.aI:(Ljava/lang/Object;Lahbk;)Z
        //  4445: istore          12
        //  4447: aload           11
        //  4449: astore          6
        //  4451: iload           12
        //  4453: ifne            21
        //  4456: aload_0        
        //  4457: getfield        ahaz.m:I
        //  4460: istore          8
        //  4462: aload           11
        //  4464: astore_2       
        //  4465: iload           8
        //  4467: aload_0        
        //  4468: getfield        ahaz.n:I
        //  4471: if_icmpge       4495
        //  4474: aload_0        
        //  4475: aload_1        
        //  4476: aload_0        
        //  4477: getfield        ahaz.l:[I
        //  4480: iload           8
        //  4482: iaload         
        //  4483: aload_2        
        //  4484: aload_1        
        //  4485: invokespecial   ahaz.af:(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  4488: astore_2       
        //  4489: iinc            8, 1
        //  4492: goto            4465
        //  4495: aload_2        
        //  4496: ifnull          4502
        //  4499: goto            101
        //  4502: return         
        //  4503: aload_0        
        //  4504: getfield        ahaz.m:I
        //  4507: istore          8
        //  4509: iload           8
        //  4511: aload_0        
        //  4512: getfield        ahaz.n:I
        //  4515: if_icmpge       4541
        //  4518: aload_0        
        //  4519: aload_1        
        //  4520: aload_0        
        //  4521: getfield        ahaz.l:[I
        //  4524: iload           8
        //  4526: iaload         
        //  4527: aload           7
        //  4529: aload_1        
        //  4530: invokespecial   ahaz.af:(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  4533: astore          7
        //  4535: iinc            8, 1
        //  4538: goto            4509
        //  4541: aload           7
        //  4543: ifnull          4555
        //  4546: aload_1        
        //  4547: aload           7
        //  4549: checkcast       Lahcc;
        //  4552: invokestatic    aeda.aM:(Ljava/lang/Object;Lahcc;)V
        //  4555: goto            4560
        //  4558: aload_2        
        //  4559: athrow         
        //  4560: goto            4558
        //  4563: astore          6
        //  4565: aload           10
        //  4567: astore          6
        //  4569: goto            4406
        //  4572: astore          10
        //  4574: goto            1777
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type  
        //  -----  -----  -----  -----  ------
        //  25     33     282    4563   Any
        //  37     45     282    4563   Any
        //  114    121    282    4563   Any
        //  131    143    282    4563   Any
        //  161    167    282    4563   Any
        //  171    187    282    4563   Any
        //  207    213    282    4563   Any
        //  217    227    282    4563   Any
        //  290    298    282    4563   Any
        //  302    309    4409   4414   Lahaa;
        //  302    309    282    4563   Any
        //  617    623    4563   4572   Lahaa;
        //  617    623    282    4563   Any
        //  630    644    1398   1403   Lahaa;
        //  630    644    282    4563   Any
        //  648    663    1398   1403   Lahaa;
        //  648    663    282    4563   Any
        //  667    678    1398   1403   Lahaa;
        //  667    678    282    4563   Any
        //  685    703    1398   1403   Lahaa;
        //  685    703    282    4563   Any
        //  707    716    1398   1403   Lahaa;
        //  707    716    282    4563   Any
        //  723    741    1398   1403   Lahaa;
        //  723    741    282    4563   Any
        //  745    754    1398   1403   Lahaa;
        //  745    754    282    4563   Any
        //  761    779    1398   1403   Lahaa;
        //  761    779    282    4563   Any
        //  783    792    1398   1403   Lahaa;
        //  783    792    282    4563   Any
        //  799    817    1398   1403   Lahaa;
        //  799    817    282    4563   Any
        //  821    830    1398   1403   Lahaa;
        //  821    830    282    4563   Any
        //  837    845    1398   1403   Lahaa;
        //  837    845    282    4563   Any
        //  849    857    1398   1403   Lahaa;
        //  849    857    282    4563   Any
        //  866    878    1398   1403   Lahaa;
        //  866    878    282    4563   Any
        //  885    897    1398   1403   Lahaa;
        //  885    897    282    4563   Any
        //  908    922    1398   1403   Lahaa;
        //  908    922    282    4563   Any
        //  926    935    1398   1403   Lahaa;
        //  926    935    282    4563   Any
        //  942    960    1398   1403   Lahaa;
        //  942    960    282    4563   Any
        //  964    973    1398   1403   Lahaa;
        //  964    973    282    4563   Any
        //  980    995    1398   1403   Lahaa;
        //  980    995    282    4563   Any
        //  999    1008   1398   1403   Lahaa;
        //  999    1008   282    4563   Any
        //  1015   1029   1398   1403   Lahaa;
        //  1015   1029   282    4563   Any
        //  1033   1048   1398   1403   Lahaa;
        //  1033   1048   282    4563   Any
        //  1052   1063   1398   1403   Lahaa;
        //  1052   1063   282    4563   Any
        //  1070   1078   1398   1403   Lahaa;
        //  1070   1078   282    4563   Any
        //  1082   1091   1398   1403   Lahaa;
        //  1082   1091   282    4563   Any
        //  1098   1116   1398   1403   Lahaa;
        //  1098   1116   282    4563   Any
        //  1120   1129   1398   1403   Lahaa;
        //  1120   1129   282    4563   Any
        //  1136   1154   1398   1403   Lahaa;
        //  1136   1154   282    4563   Any
        //  1158   1167   1398   1403   Lahaa;
        //  1158   1167   282    4563   Any
        //  1174   1192   1398   1403   Lahaa;
        //  1174   1192   282    4563   Any
        //  1196   1205   1398   1403   Lahaa;
        //  1196   1205   282    4563   Any
        //  1212   1230   1398   1403   Lahaa;
        //  1212   1230   282    4563   Any
        //  1234   1243   1398   1403   Lahaa;
        //  1234   1243   282    4563   Any
        //  1250   1268   1398   1403   Lahaa;
        //  1250   1268   282    4563   Any
        //  1272   1281   1398   1403   Lahaa;
        //  1272   1281   282    4563   Any
        //  1288   1306   1398   1403   Lahaa;
        //  1288   1306   282    4563   Any
        //  1310   1319   1398   1403   Lahaa;
        //  1310   1319   282    4563   Any
        //  1326   1344   1398   1403   Lahaa;
        //  1326   1344   282    4563   Any
        //  1348   1357   1398   1403   Lahaa;
        //  1348   1357   282    4563   Any
        //  1364   1382   1398   1403   Lahaa;
        //  1364   1382   282    4563   Any
        //  1386   1395   1398   1403   Lahaa;
        //  1386   1395   282    4563   Any
        //  1407   1415   4409   4414   Lahaa;
        //  1407   1415   282    4563   Any
        //  1419   1430   4409   4414   Lahaa;
        //  1419   1430   282    4563   Any
        //  1434   1442   4409   4414   Lahaa;
        //  1434   1442   282    4563   Any
        //  1451   1456   1398   1403   Lahaa;
        //  1451   1456   282    4563   Any
        //  1460   1468   1398   1403   Lahaa;
        //  1460   1468   282    4563   Any
        //  1475   1482   4409   4414   Lahaa;
        //  1475   1482   282    4563   Any
        //  1495   1500   1398   1403   Lahaa;
        //  1495   1500   282    4563   Any
        //  1504   1512   1398   1403   Lahaa;
        //  1504   1512   282    4563   Any
        //  1516   1524   1398   1403   Lahaa;
        //  1516   1524   282    4563   Any
        //  1528   1535   4409   4414   Lahaa;
        //  1528   1535   282    4563   Any
        //  1539   1546   4409   4414   Lahaa;
        //  1539   1546   282    4563   Any
        //  1550   1558   4409   4414   Lahaa;
        //  1550   1558   282    4563   Any
        //  1562   1574   4409   4414   Lahaa;
        //  1562   1574   282    4563   Any
        //  1578   1592   4409   4414   Lahaa;
        //  1578   1592   282    4563   Any
        //  1596   1603   4409   4414   Lahaa;
        //  1596   1603   282    4563   Any
        //  1607   1614   4409   4414   Lahaa;
        //  1607   1614   282    4563   Any
        //  1618   1627   1846   1848   Any
        //  1635   1647   1846   1848   Any
        //  1667   1677   1775   1777   Lahaa;
        //  1667   1677   1846   1848   Any
        //  1680   1696   1775   1777   Lahaa;
        //  1680   1696   1846   1848   Any
        //  1696   1734   1775   1777   Lahaa;
        //  1696   1734   1846   1848   Any
        //  1741   1757   1775   1777   Lahaa;
        //  1741   1757   1846   1848   Any
        //  1757   1768   4572   4577   Lahaa;
        //  1757   1768   1841   1846   Any
        //  1777   1787   1841   1846   Any
        //  1790   1806   1841   1846   Any
        //  1806   1818   1841   1846   Any
        //  1826   1838   4563   4572   Lahaa;
        //  1826   1838   282    4563   Any
        //  1856   1868   4563   4572   Lahaa;
        //  1856   1868   282    4563   Any
        //  1876   1879   4563   4572   Lahaa;
        //  1876   1879   282    4563   Any
        //  1887   1894   4563   4572   Lahaa;
        //  1887   1894   282    4563   Any
        //  1902   1910   4563   4572   Lahaa;
        //  1902   1910   282    4563   Any
        //  1918   1930   4563   4572   Lahaa;
        //  1918   1930   282    4563   Any
        //  1938   1947   4563   4572   Lahaa;
        //  1938   1947   282    4563   Any
        //  1955   1964   4563   4572   Lahaa;
        //  1955   1964   282    4563   Any
        //  1972   1990   4563   4572   Lahaa;
        //  1972   1990   282    4563   Any
        //  1998   2011   4563   4572   Lahaa;
        //  1998   2011   282    4563   Any
        //  2019   2029   4563   4572   Lahaa;
        //  2019   2029   282    4563   Any
        //  2040   2052   4563   4572   Lahaa;
        //  2040   2052   282    4563   Any
        //  2067   2076   4563   4572   Lahaa;
        //  2067   2076   282    4563   Any
        //  2087   2091   4563   4572   Lahaa;
        //  2087   2091   282    4563   Any
        //  2099   2118   4563   4572   Lahaa;
        //  2099   2118   282    4563   Any
        //  2129   2148   4563   4572   Lahaa;
        //  2129   2148   282    4563   Any
        //  2159   2178   4563   4572   Lahaa;
        //  2159   2178   282    4563   Any
        //  2189   2208   4563   4572   Lahaa;
        //  2189   2208   282    4563   Any
        //  2219   2234   4563   4572   Lahaa;
        //  2219   2234   282    4563   Any
        //  2242   2250   4563   4572   Lahaa;
        //  2242   2250   282    4563   Any
        //  2258   2278   4563   4572   Lahaa;
        //  2258   2278   282    4563   Any
        //  2289   2308   4563   4572   Lahaa;
        //  2289   2308   282    4563   Any
        //  2319   2338   4563   4572   Lahaa;
        //  2319   2338   282    4563   Any
        //  2349   2368   4563   4572   Lahaa;
        //  2349   2368   282    4563   Any
        //  2379   2398   4563   4572   Lahaa;
        //  2379   2398   282    4563   Any
        //  2409   2428   4563   4572   Lahaa;
        //  2409   2428   282    4563   Any
        //  2439   2458   4563   4572   Lahaa;
        //  2439   2458   282    4563   Any
        //  2469   2488   4563   4572   Lahaa;
        //  2469   2488   282    4563   Any
        //  2499   2518   4563   4572   Lahaa;
        //  2499   2518   282    4563   Any
        //  2529   2548   4563   4572   Lahaa;
        //  2529   2548   282    4563   Any
        //  2559   2578   4563   4572   Lahaa;
        //  2559   2578   282    4563   Any
        //  2589   2608   4563   4572   Lahaa;
        //  2589   2608   282    4563   Any
        //  2619   2638   4563   4572   Lahaa;
        //  2619   2638   282    4563   Any
        //  2649   2668   4563   4572   Lahaa;
        //  2649   2668   282    4563   Any
        //  2679   2694   4563   4572   Lahaa;
        //  2679   2694   282    4563   Any
        //  2702   2710   4563   4572   Lahaa;
        //  2702   2710   282    4563   Any
        //  2718   2738   4563   4572   Lahaa;
        //  2718   2738   282    4563   Any
        //  2749   2768   4563   4572   Lahaa;
        //  2749   2768   282    4563   Any
        //  2779   2794   4563   4572   Lahaa;
        //  2779   2794   282    4563   Any
        //  2802   2816   4563   4572   Lahaa;
        //  2802   2816   282    4563   Any
        //  2824   2839   4563   4572   Lahaa;
        //  2824   2839   282    4563   Any
        //  2847   2860   4563   4572   Lahaa;
        //  2847   2860   282    4563   Any
        //  2871   2883   4563   4572   Lahaa;
        //  2871   2883   282    4563   Any
        //  2891   2903   4563   4572   Lahaa;
        //  2891   2903   282    4563   Any
        //  2911   2920   4563   4572   Lahaa;
        //  2911   2920   282    4563   Any
        //  2931   2935   4563   4572   Lahaa;
        //  2931   2935   282    4563   Any
        //  2943   2951   4563   4572   Lahaa;
        //  2943   2951   282    4563   Any
        //  2959   2974   4563   4572   Lahaa;
        //  2959   2974   282    4563   Any
        //  2982   2991   4563   4572   Lahaa;
        //  2982   2991   282    4563   Any
        //  2999   3008   4563   4572   Lahaa;
        //  2999   3008   282    4563   Any
        //  3016   3034   4563   4572   Lahaa;
        //  3016   3034   282    4563   Any
        //  3042   3055   4563   4572   Lahaa;
        //  3042   3055   282    4563   Any
        //  3063   3073   4563   4572   Lahaa;
        //  3063   3073   282    4563   Any
        //  3084   3096   4563   4572   Lahaa;
        //  3084   3096   282    4563   Any
        //  3111   3120   4563   4572   Lahaa;
        //  3111   3120   282    4563   Any
        //  3131   3135   4563   4572   Lahaa;
        //  3131   3135   282    4563   Any
        //  3143   3151   4563   4572   Lahaa;
        //  3143   3151   282    4563   Any
        //  3159   3174   4563   4572   Lahaa;
        //  3159   3174   282    4563   Any
        //  3182   3192   4563   4572   Lahaa;
        //  3182   3192   282    4563   Any
        //  3203   3218   4563   4572   Lahaa;
        //  3203   3218   282    4563   Any
        //  3226   3236   4563   4572   Lahaa;
        //  3226   3236   282    4563   Any
        //  3247   3266   4563   4572   Lahaa;
        //  3247   3266   282    4563   Any
        //  3277   3296   4563   4572   Lahaa;
        //  3277   3296   282    4563   Any
        //  3307   3326   4563   4572   Lahaa;
        //  3307   3326   282    4563   Any
        //  3337   3356   4563   4572   Lahaa;
        //  3337   3356   282    4563   Any
        //  3367   3386   4563   4572   Lahaa;
        //  3367   3386   282    4563   Any
        //  3397   3416   4563   4572   Lahaa;
        //  3397   3416   282    4563   Any
        //  3427   3446   4563   4572   Lahaa;
        //  3427   3446   282    4563   Any
        //  3457   3476   4563   4572   Lahaa;
        //  3457   3476   282    4563   Any
        //  3487   3499   4563   4572   Lahaa;
        //  3487   3499   282    4563   Any
        //  3507   3522   4563   4572   Lahaa;
        //  3507   3522   282    4563   Any
        //  3530   3539   4563   4572   Lahaa;
        //  3530   3539   282    4563   Any
        //  3550   3565   4563   4572   Lahaa;
        //  3550   3565   282    4563   Any
        //  3573   3580   4563   4572   Lahaa;
        //  3573   3580   282    4563   Any
        //  3591   3606   4563   4572   Lahaa;
        //  3591   3606   282    4563   Any
        //  3614   3621   4563   4572   Lahaa;
        //  3614   3621   282    4563   Any
        //  3632   3647   4563   4572   Lahaa;
        //  3632   3647   282    4563   Any
        //  3655   3662   4563   4572   Lahaa;
        //  3655   3662   282    4563   Any
        //  3673   3688   4563   4572   Lahaa;
        //  3673   3688   282    4563   Any
        //  3696   3703   4563   4572   Lahaa;
        //  3696   3703   282    4563   Any
        //  3714   3722   4563   4572   Lahaa;
        //  3714   3722   282    4563   Any
        //  3730   3738   4563   4572   Lahaa;
        //  3730   3738   282    4563   Any
        //  3751   3763   4563   4572   Lahaa;
        //  3751   3763   282    4563   Any
        //  3774   3786   4563   4572   Lahaa;
        //  3774   3786   282    4563   Any
        //  3797   3808   4563   4572   Lahaa;
        //  3797   3808   282    4563   Any
        //  3816   3823   4563   4572   Lahaa;
        //  3816   3823   282    4563   Any
        //  3834   3849   4563   4572   Lahaa;
        //  3834   3849   282    4563   Any
        //  3857   3864   4563   4572   Lahaa;
        //  3857   3864   282    4563   Any
        //  3875   3890   4563   4572   Lahaa;
        //  3875   3890   282    4563   Any
        //  3898   3905   4563   4572   Lahaa;
        //  3898   3905   282    4563   Any
        //  3916   3928   4563   4572   Lahaa;
        //  3916   3928   282    4563   Any
        //  3936   3951   4563   4572   Lahaa;
        //  3936   3951   282    4563   Any
        //  3959   3968   4563   4572   Lahaa;
        //  3959   3968   282    4563   Any
        //  3979   3987   4563   4572   Lahaa;
        //  3979   3987   282    4563   Any
        //  3995   4002   4563   4572   Lahaa;
        //  3995   4002   282    4563   Any
        //  4013   4028   4563   4572   Lahaa;
        //  4013   4028   282    4563   Any
        //  4036   4043   4563   4572   Lahaa;
        //  4036   4043   282    4563   Any
        //  4054   4069   4563   4572   Lahaa;
        //  4054   4069   282    4563   Any
        //  4077   4084   4563   4572   Lahaa;
        //  4077   4084   282    4563   Any
        //  4095   4110   4563   4572   Lahaa;
        //  4095   4110   282    4563   Any
        //  4118   4125   4563   4572   Lahaa;
        //  4118   4125   282    4563   Any
        //  4136   4151   4563   4572   Lahaa;
        //  4136   4151   282    4563   Any
        //  4159   4166   4563   4572   Lahaa;
        //  4159   4166   282    4563   Any
        //  4177   4192   4563   4572   Lahaa;
        //  4177   4192   282    4563   Any
        //  4200   4207   4563   4572   Lahaa;
        //  4200   4207   282    4563   Any
        //  4218   4233   4563   4572   Lahaa;
        //  4218   4233   282    4563   Any
        //  4241   4248   4563   4572   Lahaa;
        //  4241   4248   282    4563   Any
        //  4259   4274   4563   4572   Lahaa;
        //  4259   4274   282    4563   Any
        //  4282   4289   4563   4572   Lahaa;
        //  4282   4289   282    4563   Any
        //  4300   4315   4563   4572   Lahaa;
        //  4300   4315   282    4563   Any
        //  4323   4330   4563   4572   Lahaa;
        //  4323   4330   282    4563   Any
        //  4341   4351   4563   4572   Lahaa;
        //  4341   4351   282    4563   Any
        //  4427   4433   282    4563   Any
        //  4437   4447   282    4563   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0626:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final void i(final Object o, final byte[] array, final int n, final int n2, final agxq agxq) {
        if (this.j) {
            this.ad(o, array, n, n2, agxq);
            return;
        }
        this.c(o, array, n, n2, 0, agxq);
    }
    
    public final boolean j(final Object o, final Object o2) {
        for (int length = this.c.length, i = 0; i < length; i += 3) {
            final int c = this.C(i);
            final long d = D(c);
            boolean b = false;
            switch (B(c)) {
                default: {
                    continue;
                }
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68: {
                    final long n = this.z(i) & 0xFFFFF;
                    if (ahcj.d(o, n) != ahcj.d(o2, n)) {
                        return false;
                    }
                    if (!ahbq.q(ahcj.i(o, d), ahcj.i(o2, d))) {
                        return false;
                    }
                    continue;
                }
                case 50: {
                    b = ahbq.q(ahcj.i(o, d), ahcj.i(o2, d));
                    break;
                }
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49: {
                    b = ahbq.q(ahcj.i(o, d), ahcj.i(o2, d));
                    break;
                }
                case 17: {
                    if (this.U(o, o2, i) && ahbq.q(ahcj.i(o, d), ahcj.i(o2, d))) {
                        continue;
                    }
                    return false;
                }
                case 16: {
                    if (this.U(o, o2, i) && ahcj.f(o, d) == ahcj.f(o2, d)) {
                        continue;
                    }
                    return false;
                }
                case 15: {
                    if (this.U(o, o2, i) && ahcj.d(o, d) == ahcj.d(o2, d)) {
                        continue;
                    }
                    return false;
                }
                case 14: {
                    if (this.U(o, o2, i) && ahcj.f(o, d) == ahcj.f(o2, d)) {
                        continue;
                    }
                    return false;
                }
                case 13: {
                    if (this.U(o, o2, i) && ahcj.d(o, d) == ahcj.d(o2, d)) {
                        continue;
                    }
                    return false;
                }
                case 12: {
                    if (this.U(o, o2, i) && ahcj.d(o, d) == ahcj.d(o2, d)) {
                        continue;
                    }
                    return false;
                }
                case 11: {
                    if (this.U(o, o2, i) && ahcj.d(o, d) == ahcj.d(o2, d)) {
                        continue;
                    }
                    return false;
                }
                case 10: {
                    if (this.U(o, o2, i) && ahbq.q(ahcj.i(o, d), ahcj.i(o2, d))) {
                        continue;
                    }
                    return false;
                }
                case 9: {
                    if (this.U(o, o2, i) && ahbq.q(ahcj.i(o, d), ahcj.i(o2, d))) {
                        continue;
                    }
                    return false;
                }
                case 8: {
                    if (this.U(o, o2, i) && ahbq.q(ahcj.i(o, d), ahcj.i(o2, d))) {
                        continue;
                    }
                    return false;
                }
                case 7: {
                    if (this.U(o, o2, i) && ahcj.x(o, d) == ahcj.x(o2, d)) {
                        continue;
                    }
                    return false;
                }
                case 6: {
                    if (this.U(o, o2, i) && ahcj.d(o, d) == ahcj.d(o2, d)) {
                        continue;
                    }
                    return false;
                }
                case 5: {
                    if (this.U(o, o2, i) && ahcj.f(o, d) == ahcj.f(o2, d)) {
                        continue;
                    }
                    return false;
                }
                case 4: {
                    if (this.U(o, o2, i) && ahcj.d(o, d) == ahcj.d(o2, d)) {
                        continue;
                    }
                    return false;
                }
                case 3: {
                    if (this.U(o, o2, i) && ahcj.f(o, d) == ahcj.f(o2, d)) {
                        continue;
                    }
                    return false;
                }
                case 2: {
                    if (this.U(o, o2, i) && ahcj.f(o, d) == ahcj.f(o2, d)) {
                        continue;
                    }
                    return false;
                }
                case 1: {
                    if (this.U(o, o2, i) && Float.floatToIntBits(ahcj.c(o, d)) == Float.floatToIntBits(ahcj.c(o2, d))) {
                        continue;
                    }
                    return false;
                }
                case 0: {
                    if (this.U(o, o2, i) && Double.doubleToLongBits(ahcj.b(o, d)) == Double.doubleToLongBits(ahcj.b(o2, d))) {
                        continue;
                    }
                    return false;
                }
            }
            if (!b) {
                return false;
            }
        }
        return aeda.aL(o).equals(aeda.aL(o2)) && (!this.h || ahbz.j(o).equals((Object)ahbz.j(o2)));
    }
    
    public final boolean k(final Object o) {
        int n = 1048575;
        int int1 = 0;
        for (int i = 0; i < this.m; ++i) {
            final int n2 = this.l[i];
            final int s = this.s(n2);
            final int c = this.C(n2);
            final int n3 = this.c[n2 + 2];
            final int n4 = n3 & 0xFFFFF;
            final int n5 = 1 << (n3 >>> 20);
            if (n4 != n) {
                if (n4 != 1048575) {
                    int1 = ahaz.b.getInt(o, (long)n4);
                }
                n = n4;
            }
            if ((0x10000000 & c) != 0x0 && !this.X(o, n2, n, int1, n5)) {
                return false;
            }
            final int b = B(c);
            if (b != 9 && b != 17) {
                if (b != 27) {
                    if (b != 60 && b != 68) {
                        if (b != 49) {
                            if (b != 50) {
                                continue;
                            }
                            final ahas ahas = (ahas)ahcj.i(o, D(c));
                            if (!((Map)ahas).isEmpty() && ((ahcm)ahbz.d(this.H(n2)).d).s == ahcn.i) {
                                final Iterator iterator = ((Map)ahas).values().iterator();
                                ahbp ahbp = null;
                                while (iterator.hasNext()) {
                                    final Object next = iterator.next();
                                    ahbp a;
                                    if ((a = ahbp) == null) {
                                        a = ahbh.a.a((Class)next.getClass());
                                    }
                                    ahbp = a;
                                    if (!a.k(next)) {
                                        return false;
                                    }
                                }
                            }
                            continue;
                        }
                    }
                    else {
                        if (this.aa(o, s, n2) && !Y(o, c, this.G(n2))) {
                            return false;
                        }
                        continue;
                    }
                }
                final List list = (List)ahcj.i(o, D(c));
                if (!list.isEmpty()) {
                    final ahbp g = this.G(n2);
                    for (int j = 0; j < list.size(); ++j) {
                        if (!g.k(list.get(j))) {
                            return false;
                        }
                    }
                }
            }
            else if (this.X(o, n2, n, int1, n5) && !Y(o, c, this.G(n2))) {
                return false;
            }
        }
        return !this.h || ahbz.j(o).j();
    }
    
    public final void l(final Object o, final aglk aglk) {
        if (this.j) {
            Object e = null;
            Map.Entry<?, ?> entry = null;
            Label_0052: {
                if (this.h) {
                    final agyv j = ahbz.j(o);
                    if (!j.i()) {
                        e = j.e();
                        entry = ((Iterator<Map.Entry<?, ?>>)e).next();
                        break Label_0052;
                    }
                }
                e = (entry = null);
            }
            final int length = this.c.length;
            int n = 0;
            Map.Entry entry2 = (Map.Entry)entry;
            Map.Entry entry3;
            while (true) {
                entry3 = entry2;
                if (n >= length) {
                    break;
                }
                final int c = this.C(n);
                final int s = this.s(n);
                while (entry2 != null && ahbz.i(entry2) <= s) {
                    ahbz.P(aglk, entry2);
                    if (((Iterator)e).hasNext()) {
                        entry2 = (Map.Entry)((Iterator<Map.Entry>)e).next();
                    }
                    else {
                        entry2 = null;
                    }
                }
                switch (B(c)) {
                    case 68: {
                        if (this.aa(o, s, n)) {
                            aglk.i(s, ahcj.i(o, D(c)), this.G(n));
                            break;
                        }
                        break;
                    }
                    case 67: {
                        if (this.aa(o, s, n)) {
                            aglk.q(s, E(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 66: {
                        if (this.aa(o, s, n)) {
                            aglk.p(s, t(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 65: {
                        if (this.aa(o, s, n)) {
                            aglk.o(s, E(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 64: {
                        if (this.aa(o, s, n)) {
                            aglk.n(s, t(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 63: {
                        if (this.aa(o, s, n)) {
                            aglk.e(s, t(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 62: {
                        if (this.aa(o, s, n)) {
                            aglk.s(s, t(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 61: {
                        if (this.aa(o, s, n)) {
                            aglk.c(s, (agyc)ahcj.i(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 60: {
                        if (this.aa(o, s, n)) {
                            aglk.l(s, ahcj.i(o, D(c)), this.G(n));
                            break;
                        }
                        break;
                    }
                    case 59: {
                        if (this.aa(o, s, n)) {
                            ai(s, ahcj.i(o, D(c)), aglk);
                            break;
                        }
                        break;
                    }
                    case 58: {
                        if (this.aa(o, s, n)) {
                            aglk.b(s, ab(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 57: {
                        if (this.aa(o, s, n)) {
                            aglk.f(s, t(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 56: {
                        if (this.aa(o, s, n)) {
                            aglk.g(s, E(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 55: {
                        if (this.aa(o, s, n)) {
                            aglk.j(s, t(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 54: {
                        if (this.aa(o, s, n)) {
                            aglk.t(s, E(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 53: {
                        if (this.aa(o, s, n)) {
                            aglk.k(s, E(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 52: {
                        if (this.aa(o, s, n)) {
                            aglk.h(s, p(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 51: {
                        if (this.aa(o, s, n)) {
                            aglk.d(s, o(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 50: {
                        this.ah(aglk, s, ahcj.i(o, D(c)), n);
                        break;
                    }
                    case 49: {
                        ahbq.M(this.s(n), (List)ahcj.i(o, D(c)), aglk, this.G(n));
                        break;
                    }
                    case 48: {
                        ahbq.T(this.s(n), (List)ahcj.i(o, D(c)), aglk, true);
                        break;
                    }
                    case 47: {
                        ahbq.S(this.s(n), (List)ahcj.i(o, D(c)), aglk, true);
                        break;
                    }
                    case 46: {
                        ahbq.R(this.s(n), (List)ahcj.i(o, D(c)), aglk, true);
                        break;
                    }
                    case 45: {
                        ahbq.Q(this.s(n), (List)ahcj.i(o, D(c)), aglk, true);
                        break;
                    }
                    case 44: {
                        ahbq.I(this.s(n), (List)ahcj.i(o, D(c)), aglk, true);
                        break;
                    }
                    case 43: {
                        ahbq.V(this.s(n), (List)ahcj.i(o, D(c)), aglk, true);
                        break;
                    }
                    case 42: {
                        ahbq.F(this.s(n), (List)ahcj.i(o, D(c)), aglk, true);
                        break;
                    }
                    case 41: {
                        ahbq.J(this.s(n), (List)ahcj.i(o, D(c)), aglk, true);
                        break;
                    }
                    case 40: {
                        ahbq.K(this.s(n), (List)ahcj.i(o, D(c)), aglk, true);
                        break;
                    }
                    case 39: {
                        ahbq.N(this.s(n), (List)ahcj.i(o, D(c)), aglk, true);
                        break;
                    }
                    case 38: {
                        ahbq.W(this.s(n), (List)ahcj.i(o, D(c)), aglk, true);
                        break;
                    }
                    case 37: {
                        ahbq.O(this.s(n), (List)ahcj.i(o, D(c)), aglk, true);
                        break;
                    }
                    case 36: {
                        ahbq.L(this.s(n), (List)ahcj.i(o, D(c)), aglk, true);
                        break;
                    }
                    case 35: {
                        ahbq.H(this.s(n), (List)ahcj.i(o, D(c)), aglk, true);
                        break;
                    }
                    case 34: {
                        ahbq.T(this.s(n), (List)ahcj.i(o, D(c)), aglk, false);
                        break;
                    }
                    case 33: {
                        ahbq.S(this.s(n), (List)ahcj.i(o, D(c)), aglk, false);
                        break;
                    }
                    case 32: {
                        ahbq.R(this.s(n), (List)ahcj.i(o, D(c)), aglk, false);
                        break;
                    }
                    case 31: {
                        ahbq.Q(this.s(n), (List)ahcj.i(o, D(c)), aglk, false);
                        break;
                    }
                    case 30: {
                        ahbq.I(this.s(n), (List)ahcj.i(o, D(c)), aglk, false);
                        break;
                    }
                    case 29: {
                        ahbq.V(this.s(n), (List)ahcj.i(o, D(c)), aglk, false);
                        break;
                    }
                    case 28: {
                        ahbq.G(this.s(n), (List)ahcj.i(o, D(c)), aglk);
                        break;
                    }
                    case 27: {
                        ahbq.P(this.s(n), (List)ahcj.i(o, D(c)), aglk, this.G(n));
                        break;
                    }
                    case 26: {
                        ahbq.U(this.s(n), (List)ahcj.i(o, D(c)), aglk);
                        break;
                    }
                    case 25: {
                        ahbq.F(this.s(n), (List)ahcj.i(o, D(c)), aglk, false);
                        break;
                    }
                    case 24: {
                        ahbq.J(this.s(n), (List)ahcj.i(o, D(c)), aglk, false);
                        break;
                    }
                    case 23: {
                        ahbq.K(this.s(n), (List)ahcj.i(o, D(c)), aglk, false);
                        break;
                    }
                    case 22: {
                        ahbq.N(this.s(n), (List)ahcj.i(o, D(c)), aglk, false);
                        break;
                    }
                    case 21: {
                        ahbq.W(this.s(n), (List)ahcj.i(o, D(c)), aglk, false);
                        break;
                    }
                    case 20: {
                        ahbq.O(this.s(n), (List)ahcj.i(o, D(c)), aglk, false);
                        break;
                    }
                    case 19: {
                        ahbq.L(this.s(n), (List)ahcj.i(o, D(c)), aglk, false);
                        break;
                    }
                    case 18: {
                        ahbq.H(this.s(n), (List)ahcj.i(o, D(c)), aglk, false);
                        break;
                    }
                    case 17: {
                        if (this.W(o, n)) {
                            aglk.i(s, ahcj.i(o, D(c)), this.G(n));
                            break;
                        }
                        break;
                    }
                    case 16: {
                        if (this.W(o, n)) {
                            aglk.q(s, ahcj.f(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 15: {
                        if (this.W(o, n)) {
                            aglk.p(s, ahcj.d(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 14: {
                        if (this.W(o, n)) {
                            aglk.o(s, ahcj.f(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 13: {
                        if (this.W(o, n)) {
                            aglk.n(s, ahcj.d(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 12: {
                        if (this.W(o, n)) {
                            aglk.e(s, ahcj.d(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 11: {
                        if (this.W(o, n)) {
                            aglk.s(s, ahcj.d(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 10: {
                        if (this.W(o, n)) {
                            aglk.c(s, (agyc)ahcj.i(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 9: {
                        if (this.W(o, n)) {
                            aglk.l(s, ahcj.i(o, D(c)), this.G(n));
                            break;
                        }
                        break;
                    }
                    case 8: {
                        if (this.W(o, n)) {
                            ai(s, ahcj.i(o, D(c)), aglk);
                            break;
                        }
                        break;
                    }
                    case 7: {
                        if (this.W(o, n)) {
                            aglk.b(s, ahcj.x(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 6: {
                        if (this.W(o, n)) {
                            aglk.f(s, ahcj.d(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 5: {
                        if (this.W(o, n)) {
                            aglk.g(s, ahcj.f(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 4: {
                        if (this.W(o, n)) {
                            aglk.j(s, ahcj.d(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 3: {
                        if (this.W(o, n)) {
                            aglk.t(s, ahcj.f(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 2: {
                        if (this.W(o, n)) {
                            aglk.k(s, ahcj.f(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 1: {
                        if (this.W(o, n)) {
                            aglk.h(s, ahcj.c(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 0: {
                        if (this.W(o, n)) {
                            aglk.d(s, ahcj.b(o, D(c)));
                            break;
                        }
                        break;
                    }
                }
                n += 3;
            }
            while (entry3 != null) {
                ahbz.P(aglk, entry3);
                if (((Iterator)e).hasNext()) {
                    entry3 = (Map.Entry)((Iterator<Map.Entry>)e).next();
                }
                else {
                    entry3 = null;
                }
            }
            aj(o, aglk);
            return;
        }
        this.ag(o, aglk);
    }
}
