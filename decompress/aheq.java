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

public final class aheq implements ahfg
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
    private final ahed o;
    private final adzw p;
    
    static {
        a = new int[0];
        b = ahfz.k();
    }
    
    private aheq(final int[] c, final Object[] d, final int e, final int f, final MessageLite g, final boolean j, final boolean k, final int[] l, final int m, final int n, final ahed o, final adzw p18, final agsk agsk, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.i = (g instanceof ahcz);
        this.j = j;
        boolean h = false;
        if (agsk != null) {
            h = h;
            if (g instanceof ahcu) {
                h = true;
            }
        }
        this.h = h;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p18;
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
        return (long)ahfz.i(o, n);
    }
    
    private final ahdf F(int n) {
        n /= 3;
        return (ahdf)this.d[n + n + 1];
    }
    
    private final ahfg G(int n) {
        final Object[] d = this.d;
        n /= 3;
        n += n;
        final ahfg ahfg = (ahfg)d[n];
        if (ahfg != null) {
            return ahfg;
        }
        return (ahfg)(this.d[n] = ahey.a.a((Class)this.d[n + 1]));
    }
    
    private final Object H(int n) {
        n /= 3;
        return this.d[n + n];
    }
    
    private final Object I(Object object, final int n) {
        final ahfg g = this.G(n);
        final long d = D(this.C(n));
        if (!this.W(object, n)) {
            return g.e();
        }
        object = aheq.b.getObject(object, d);
        if (Z(object)) {
            return object;
        }
        final Object e = g.e();
        if (object != null) {
            g.g(e, object);
        }
        return e;
    }
    
    private final Object J(Object object, final int n, final int n2) {
        final ahfg g = this.G(n2);
        if (!this.aa(object, n, n2)) {
            return g.e();
        }
        object = aheq.b.getObject(object, D(this.C(n2)));
        if (Z(object)) {
            return object;
        }
        final Object e = g.e();
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
        return (List)ahfz.i(o, n);
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
        final Unsafe b = aheq.b;
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
        final ahfg g = this.G(s);
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
        final Unsafe b = aheq.b;
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
        final ahfg g = this.G(s);
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
    
    private final void P(final Object o, final int n, final ahfb ahfb) {
        if (V(n)) {
            ahfz.v(o, D(n), (Object)ahfb.v());
            return;
        }
        if (this.i) {
            ahfz.v(o, D(n), (Object)ahfb.u());
            return;
        }
        ahfz.v(o, D(n), (Object)ahfb.o());
    }
    
    private final void Q(final Object o, int z) {
        z = this.z(z);
        final long n = 0xFFFFF & z;
        if (n == 1048575L) {
            return;
        }
        ahfz.t(o, n, 1 << (z >>> 20) | ahfz.d(o, n));
    }
    
    private final void R(final Object o, final int n, final int n2) {
        ahfz.t(o, (long)(this.z(n2) & 0xFFFFF), n);
    }
    
    private final void S(final Object o, final int n, final Object o2) {
        aheq.b.putObject(o, D(this.C(n)), o2);
        this.Q(o, n);
    }
    
    private final void T(final Object o, final int n, final int n2, final Object o2) {
        aheq.b.putObject(o, D(this.C(n2)), o2);
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
            return (ahfz.d(i, n) & 1 << (z >>> 20)) != 0x0;
        }
        c = this.C(c);
        final long d = D(c);
        switch (B(c)) {
            default: {
                throw new IllegalArgumentException();
            }
            case 17: {
                return ahfz.i(i, d) != null;
            }
            case 16: {
                return ahfz.f(i, d) != 0L;
            }
            case 15: {
                return ahfz.d(i, d) != 0;
            }
            case 14: {
                return ahfz.f(i, d) != 0L;
            }
            case 13: {
                return ahfz.d(i, d) != 0;
            }
            case 12: {
                return ahfz.d(i, d) != 0;
            }
            case 11: {
                return ahfz.d(i, d) != 0;
            }
            case 10: {
                return !ahbt.b.equals(ahfz.i(i, d));
            }
            case 9: {
                return ahfz.i(i, d) != null;
            }
            case 8: {
                i = ahfz.i(i, d);
                if (i instanceof String) {
                    return !((String)i).isEmpty();
                }
                if (i instanceof ahbt) {
                    return !ahbt.b.equals(i);
                }
                throw new IllegalArgumentException();
            }
            case 7: {
                return ahfz.x(i, d);
            }
            case 6: {
                return ahfz.d(i, d) != 0;
            }
            case 5: {
                return ahfz.f(i, d) != 0L;
            }
            case 4: {
                return ahfz.d(i, d) != 0;
            }
            case 3: {
                return ahfz.f(i, d) != 0L;
            }
            case 2: {
                return ahfz.f(i, d) != 0L;
            }
            case 1: {
                return Float.floatToRawIntBits(ahfz.c(i, d)) != 0;
            }
            case 0: {
                return Double.doubleToRawLongBits(ahfz.b(i, d)) != 0L;
            }
        }
    }
    
    private final boolean X(final Object o, final int n, final int n2, final int n3, final int n4) {
        if (n2 == 1048575) {
            return this.W(o, n);
        }
        return (n3 & n4) != 0x0;
    }
    
    private static boolean Y(final Object o, final int n, final ahfg ahfg) {
        return ahfg.k(ahfz.i(o, D(n)));
    }
    
    private static boolean Z(final Object o) {
        return o != null && (!(o instanceof ahcz) || ((ahcz)o).isMutable());
    }
    
    private final boolean aa(final Object o, final int n, final int n2) {
        return ahfz.d(o, (long)(this.z(n2) & 0xFFFFF)) == n;
    }
    
    private static boolean ab(final Object o, final long n) {
        return (boolean)ahfz.i(o, n);
    }
    
    private static final int ac(final byte[] array, int n, final int n2, final ahgc ahgc, final Class clazz, final ahbh ahbh) {
        final ahgc a = ahgc.a;
        Label_0355: {
            switch (ahgc.ordinal()) {
                default: {
                    throw new RuntimeException("unsupported field type.");
                }
                case 17: {
                    n = agsk.R(array, n, ahbh);
                    ahbh.c = ahby.L(ahbh.b);
                    return n;
                }
                case 16: {
                    n = agsk.O(array, n, ahbh);
                    ahbh.c = ahby.J(ahbh.a);
                    return n;
                }
                case 11: {
                    n = agsk.x(array, n, ahbh);
                    return n;
                }
                case 10: {
                    n = agsk.A(ahey.a.a(clazz), array, n, n2, ahbh);
                    return n;
                }
                case 8: {
                    n = agsk.M(array, n, ahbh);
                    return n;
                }
                case 7: {
                    n = agsk.R(array, n, ahbh);
                    ahbh.c = (ahbh.b != 0L);
                    return n;
                }
                case 6:
                case 14: {
                    ahbh.c = agsk.y(array, n);
                    break;
                }
                case 5:
                case 15: {
                    ahbh.c = agsk.V(array, n);
                    break Label_0355;
                }
                case 4:
                case 12:
                case 13: {
                    n = agsk.O(array, n, ahbh);
                    ahbh.c = ahbh.a;
                    return n;
                }
                case 2:
                case 3: {
                    n = agsk.R(array, n, ahbh);
                    ahbh.c = ahbh.b;
                    return n;
                }
                case 1: {
                    ahbh.c = agsk.w(array, n);
                    break;
                }
                case 0: {
                    ahbh.c = agsk.v(array, n);
                    break Label_0355;
                }
            }
            n += 4;
            return n;
        }
        n += 8;
        return n;
    }
    
    private final void ad(final Object o, final byte[] array, int n, final int n2, final ahbh ahbh) {
        M(o);
        final Unsafe b = aheq.b;
        int i = n;
        int n3 = -1;
        int n4 = 0;
        n = 0;
        int n5 = 1048575;
        while (i < n2) {
            int p5 = i + 1;
            int a = array[i];
            if (a < 0) {
                p5 = agsk.P(a, array, p5, ahbh);
                a = ahbh.a;
            }
            final int n6 = a >>> 3;
            int n7;
            if (n6 > n3) {
                n7 = this.y(n6, n4 / 3);
            }
            else {
                n7 = this.x(n6);
            }
            int n18 = 0;
            Label_1124: {
                Label_0119: {
                    if (n7 != -1) {
                        final int n8 = a & 0x7;
                        final int[] c = this.c;
                        final int n9 = c[n7 + 1];
                        final int b2 = B(n9);
                        final long d = D(n9);
                        int n15 = 0;
                        Label_0778: {
                            if (b2 <= 17) {
                                final int n10 = c[n7 + 2];
                                final int n11 = 1 << (n10 >>> 20);
                                final int n12 = n10 & 0xFFFFF;
                                int n13 = n;
                                int n14;
                                if (n12 != (n14 = n5)) {
                                    if (n5 != 1048575) {
                                        b.putInt(o, (long)n5, n);
                                    }
                                    if (n12 != 1048575) {
                                        n = b.getInt(o, (long)n12);
                                    }
                                    n14 = n12;
                                    n13 = n;
                                }
                                Label_0795: {
                                    Label_0767: {
                                        Label_0761: {
                                            Label_0735: {
                                                Label_0703: {
                                                    switch (b2) {
                                                        case 16: {
                                                            if (n8 == 0) {
                                                                n = agsk.R(array, p5, ahbh);
                                                                b.putLong(o, d, ahby.L(ahbh.b));
                                                                break Label_0703;
                                                            }
                                                            break;
                                                        }
                                                        case 15: {
                                                            if (n8 == 0) {
                                                                n = agsk.O(array, p5, ahbh);
                                                                b.putInt(o, d, ahby.J(ahbh.a));
                                                                break Label_0767;
                                                            }
                                                            break;
                                                        }
                                                        case 12: {
                                                            if (n8 == 0) {
                                                                n = agsk.O(array, p5, ahbh);
                                                                b.putInt(o, d, ahbh.a);
                                                                break Label_0767;
                                                            }
                                                            break;
                                                        }
                                                        case 10: {
                                                            if (n8 == 2) {
                                                                n = agsk.x(array, p5, ahbh);
                                                                b.putObject(o, d, ahbh.c);
                                                                break Label_0767;
                                                            }
                                                            break;
                                                        }
                                                        case 9: {
                                                            if (n8 == 2) {
                                                                final Object j = this.I(o, n7);
                                                                n = agsk.T(j, this.G(n7), array, p5, n2, ahbh);
                                                                this.S(o, n7, j);
                                                                break Label_0767;
                                                            }
                                                            break;
                                                        }
                                                        case 8: {
                                                            if (n8 == 2) {
                                                                if ((n9 & 0x20000000) == 0x0) {
                                                                    n = agsk.L(array, p5, ahbh);
                                                                }
                                                                else {
                                                                    n = agsk.M(array, p5, ahbh);
                                                                }
                                                                b.putObject(o, d, ahbh.c);
                                                                break Label_0767;
                                                            }
                                                            break;
                                                        }
                                                        case 7: {
                                                            if (n8 == 0) {
                                                                n = agsk.R(array, p5, ahbh);
                                                                ahfz.n(o, d, ahbh.b != 0L);
                                                                break Label_0767;
                                                            }
                                                            break;
                                                        }
                                                        case 6:
                                                        case 13: {
                                                            if (n8 == 5) {
                                                                b.putInt(o, d, agsk.y(array, p5));
                                                                break Label_0735;
                                                            }
                                                            break;
                                                        }
                                                        case 5:
                                                        case 14: {
                                                            if (n8 == 1) {
                                                                b.putLong(o, d, agsk.V(array, p5));
                                                                break Label_0761;
                                                            }
                                                            break;
                                                        }
                                                        case 4:
                                                        case 11: {
                                                            if (n8 == 0) {
                                                                n = agsk.O(array, p5, ahbh);
                                                                b.putInt(o, d, ahbh.a);
                                                                break Label_0767;
                                                            }
                                                            break;
                                                        }
                                                        case 2:
                                                        case 3: {
                                                            if (n8 == 0) {
                                                                n = agsk.R(array, p5, ahbh);
                                                                b.putLong(o, d, ahbh.b);
                                                                break Label_0703;
                                                            }
                                                            break;
                                                        }
                                                        case 1: {
                                                            if (n8 == 5) {
                                                                ahfz.s(o, d, agsk.w(array, p5));
                                                                break Label_0735;
                                                            }
                                                            break;
                                                        }
                                                        case 0: {
                                                            if (n8 == 1) {
                                                                ahfz.r(o, d, agsk.v(array, p5));
                                                                break Label_0761;
                                                            }
                                                            break;
                                                        }
                                                    }
                                                    break Label_0795;
                                                }
                                                n15 = (n13 | n11);
                                                n5 = n14;
                                                break Label_0778;
                                            }
                                            n = p5 + 4;
                                            break Label_0767;
                                        }
                                        n = p5 + 8;
                                    }
                                    n15 = (n13 | n11);
                                    n5 = n14;
                                    break Label_0778;
                                }
                                n = p5;
                                n = n13;
                                n5 = n14;
                                break Label_0119;
                            }
                            Label_1049: {
                                if (b2 == 27) {
                                    if (n8 == 2) {
                                        ahdp e;
                                        final ahdp ahdp = e = (ahdp)b.getObject(o, d);
                                        if (!ahdp.c()) {
                                            final int size = ahdp.size();
                                            int n16;
                                            if (size == 0) {
                                                n16 = 10;
                                            }
                                            else {
                                                n16 = size + size;
                                            }
                                            e = ahdp.e(n16);
                                            b.putObject(o, d, e);
                                        }
                                        final int b3 = agsk.B(this.G(n7), a, array, p5, n2, e, ahbh);
                                        n15 = n;
                                        n = b3;
                                        break Label_0778;
                                    }
                                }
                                else {
                                    int n17 = 0;
                                    Label_0993: {
                                        if (b2 <= 49) {
                                            final int w = this.w(o, array, p5, n2, a, n6, n8, n7, n9, b2, d, ahbh);
                                            if ((n17 = w) == p5) {
                                                break Label_0993;
                                            }
                                            n18 = w;
                                        }
                                        else if (b2 == 50) {
                                            if (n8 != 2) {
                                                break Label_1049;
                                            }
                                            final int u = this.u(o, array, p5, n2, n7, d, ahbh);
                                            if ((n17 = u) == p5) {
                                                break Label_0993;
                                            }
                                            n18 = u;
                                        }
                                        else {
                                            final int v = this.v(o, array, p5, n2, a, n6, n8, n9, b2, d, n7, ahbh);
                                            if ((n17 = v) == p5) {
                                                break Label_0993;
                                            }
                                            n18 = v;
                                        }
                                        n4 = n7;
                                        break Label_1124;
                                    }
                                    p5 = n17;
                                }
                            }
                            break Label_0119;
                        }
                        n4 = n7;
                        n3 = n6;
                        i = n;
                        n = n15;
                        continue;
                    }
                    n7 = 0;
                }
                n18 = agsk.N(a, array, p5, n2, d(o), ahbh);
                n4 = n7;
            }
            n3 = n6;
            i = n18;
        }
        if (n5 != 1048575) {
            b.putInt(o, (long)n5, n);
        }
        if (i == n2) {
            return;
        }
        throw ahds.g();
    }
    
    private static final int ae(final Object o) {
        return adzw.aU(o).a();
    }
    
    private final Object af(Object o, int b, Object o2, final Object o3) {
        final int s = this.s(b);
        o = ahfz.i(o, D(this.C(b)));
        if (o == null) {
            return o2;
        }
        final ahdf f = this.F(b);
        if (f == null) {
            return o2;
        }
        final ahej ahej = (ahej)o;
        final ahei j = agsk.j(this.H(b));
        final Iterator iterator = ((Map)ahej).entrySet().iterator();
        while (iterator.hasNext()) {
            final Map.Entry<K, Integer> entry = (Map.Entry<K, Integer>)iterator.next();
            if (!f.isInRange((int)entry.getValue())) {
                if ((o = o2) == null) {
                    o = adzw.aW(o3);
                }
                b = agpd.b(j, entry.getKey(), entry.getValue());
                final ahbt b2 = ahbt.b;
                final byte[] array = new byte[b];
                final ahcd ak = ahcd.ak(array);
                try {
                    agpd.c(ak, j, entry.getKey(), entry.getValue());
                    adzw.aS(o, s, agsk.t(ak, array));
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
    
    private final void ag(final Object o, final agpd agpd) {
        Iterator e = null;
        Map.Entry entry = null;
        Label_0049: {
            if (this.h) {
                final ahcm p2 = agsk.p(o);
                if (!p2.i()) {
                    e = p2.e();
                    entry = (Map.Entry)e.next();
                    break Label_0049;
                }
            }
            e = null;
            entry = null;
        }
        final int length = this.c.length;
        final Unsafe b = aheq.b;
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
            while (entry != null && agsk.o(entry) <= s) {
                agsk.u(agpd, entry);
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
                        agpd.k(s, b.getObject(o, d), this.G(n));
                        break;
                    }
                    break;
                }
                case 67: {
                    if (this.aa(o, s, n)) {
                        agpd.s(s, E(o, d));
                        break;
                    }
                    break;
                }
                case 66: {
                    if (this.aa(o, s, n)) {
                        agpd.r(s, t(o, d));
                        break;
                    }
                    break;
                }
                case 65: {
                    if (this.aa(o, s, n)) {
                        agpd.q(s, E(o, d));
                        break;
                    }
                    break;
                }
                case 64: {
                    if (this.aa(o, s, n)) {
                        agpd.p(s, t(o, d));
                        break;
                    }
                    break;
                }
                case 63: {
                    if (this.aa(o, s, n)) {
                        agpd.g(s, t(o, d));
                        break;
                    }
                    break;
                }
                case 62: {
                    if (this.aa(o, s, n)) {
                        agpd.u(s, t(o, d));
                        break;
                    }
                    break;
                }
                case 61: {
                    if (this.aa(o, s, n)) {
                        agpd.e(s, (ahbt)b.getObject(o, d));
                        break;
                    }
                    break;
                }
                case 60: {
                    if (this.aa(o, s, n)) {
                        agpd.n(s, b.getObject(o, d), this.G(n));
                        break;
                    }
                    break;
                }
                case 59: {
                    if (this.aa(o, s, n)) {
                        ai(s, b.getObject(o, d), agpd);
                        break;
                    }
                    break;
                }
                case 58: {
                    if (this.aa(o, s, n)) {
                        agpd.d(s, ab(o, d));
                        break;
                    }
                    break;
                }
                case 57: {
                    if (this.aa(o, s, n)) {
                        agpd.h(s, t(o, d));
                        break;
                    }
                    break;
                }
                case 56: {
                    if (this.aa(o, s, n)) {
                        agpd.i(s, E(o, d));
                        break;
                    }
                    break;
                }
                case 55: {
                    if (this.aa(o, s, n)) {
                        agpd.l(s, t(o, d));
                        break;
                    }
                    break;
                }
                case 54: {
                    if (this.aa(o, s, n)) {
                        agpd.v(s, E(o, d));
                        break;
                    }
                    break;
                }
                case 53: {
                    if (this.aa(o, s, n)) {
                        agpd.m(s, E(o, d));
                        break;
                    }
                    break;
                }
                case 52: {
                    if (this.aa(o, s, n)) {
                        agpd.j(s, p(o, d));
                        break;
                    }
                    break;
                }
                case 51: {
                    if (this.aa(o, s, n)) {
                        agpd.f(s, o(o, d));
                        break;
                    }
                    break;
                }
                case 50: {
                    this.ah(agpd, s, b.getObject(o, d), n);
                    break;
                }
                case 49: {
                    ahfh.M(this.s(n), (List)b.getObject(o, d), agpd, this.G(n));
                    break;
                }
                case 48: {
                    ahfh.T(this.s(n), (List)b.getObject(o, d), agpd, true);
                    break;
                }
                case 47: {
                    ahfh.S(this.s(n), (List)b.getObject(o, d), agpd, true);
                    break;
                }
                case 46: {
                    ahfh.R(this.s(n), (List)b.getObject(o, d), agpd, true);
                    break;
                }
                case 45: {
                    ahfh.Q(this.s(n), (List)b.getObject(o, d), agpd, true);
                    break;
                }
                case 44: {
                    ahfh.I(this.s(n), (List)b.getObject(o, d), agpd, true);
                    break;
                }
                case 43: {
                    ahfh.V(this.s(n), (List)b.getObject(o, d), agpd, true);
                    break;
                }
                case 42: {
                    ahfh.F(this.s(n), (List)b.getObject(o, d), agpd, true);
                    break;
                }
                case 41: {
                    ahfh.J(this.s(n), (List)b.getObject(o, d), agpd, true);
                    break;
                }
                case 40: {
                    ahfh.K(this.s(n), (List)b.getObject(o, d), agpd, true);
                    break;
                }
                case 39: {
                    ahfh.N(this.s(n), (List)b.getObject(o, d), agpd, true);
                    break;
                }
                case 38: {
                    ahfh.W(this.s(n), (List)b.getObject(o, d), agpd, true);
                    break;
                }
                case 37: {
                    ahfh.O(this.s(n), (List)b.getObject(o, d), agpd, true);
                    break;
                }
                case 36: {
                    ahfh.L(this.s(n), (List)b.getObject(o, d), agpd, true);
                    break;
                }
                case 35: {
                    ahfh.H(this.s(n), (List)b.getObject(o, d), agpd, true);
                    break;
                }
                case 34: {
                    ahfh.T(this.s(n), (List)b.getObject(o, d), agpd, false);
                    break;
                }
                case 33: {
                    ahfh.S(this.s(n), (List)b.getObject(o, d), agpd, false);
                    break;
                }
                case 32: {
                    ahfh.R(this.s(n), (List)b.getObject(o, d), agpd, false);
                    break;
                }
                case 31: {
                    ahfh.Q(this.s(n), (List)b.getObject(o, d), agpd, false);
                    break;
                }
                case 30: {
                    ahfh.I(this.s(n), (List)b.getObject(o, d), agpd, false);
                    break;
                }
                case 29: {
                    ahfh.V(this.s(n), (List)b.getObject(o, d), agpd, false);
                    break;
                }
                case 28: {
                    ahfh.G(this.s(n), (List)b.getObject(o, d), agpd);
                    break;
                }
                case 27: {
                    ahfh.P(this.s(n), (List)b.getObject(o, d), agpd, this.G(n));
                    break;
                }
                case 26: {
                    ahfh.U(this.s(n), (List)b.getObject(o, d), agpd);
                    break;
                }
                case 25: {
                    ahfh.F(this.s(n), (List)b.getObject(o, d), agpd, false);
                    break;
                }
                case 24: {
                    ahfh.J(this.s(n), (List)b.getObject(o, d), agpd, false);
                    break;
                }
                case 23: {
                    ahfh.K(this.s(n), (List)b.getObject(o, d), agpd, false);
                    break;
                }
                case 22: {
                    ahfh.N(this.s(n), (List)b.getObject(o, d), agpd, false);
                    break;
                }
                case 21: {
                    ahfh.W(this.s(n), (List)b.getObject(o, d), agpd, false);
                    break;
                }
                case 20: {
                    ahfh.O(this.s(n), (List)b.getObject(o, d), agpd, false);
                    break;
                }
                case 19: {
                    ahfh.L(this.s(n), (List)b.getObject(o, d), agpd, false);
                    break;
                }
                case 18: {
                    ahfh.H(this.s(n), (List)b.getObject(o, d), agpd, false);
                    break;
                }
                case 17: {
                    if ((n6 & int1) != 0x0) {
                        agpd.k(s, b.getObject(o, d), this.G(n));
                        break;
                    }
                    break;
                }
                case 16: {
                    if ((n6 & int1) != 0x0) {
                        agpd.s(s, b.getLong(o, d));
                        break;
                    }
                    break;
                }
                case 15: {
                    if ((n6 & int1) != 0x0) {
                        agpd.r(s, b.getInt(o, d));
                        break;
                    }
                    break;
                }
                case 14: {
                    if ((n6 & int1) != 0x0) {
                        agpd.q(s, b.getLong(o, d));
                        break;
                    }
                    break;
                }
                case 13: {
                    if ((n6 & int1) != 0x0) {
                        agpd.p(s, b.getInt(o, d));
                        break;
                    }
                    break;
                }
                case 12: {
                    if ((n6 & int1) != 0x0) {
                        agpd.g(s, b.getInt(o, d));
                        break;
                    }
                    break;
                }
                case 11: {
                    if ((n6 & int1) != 0x0) {
                        agpd.u(s, b.getInt(o, d));
                        break;
                    }
                    break;
                }
                case 10: {
                    if ((n6 & int1) != 0x0) {
                        agpd.e(s, (ahbt)b.getObject(o, d));
                        break;
                    }
                    break;
                }
                case 9: {
                    if ((n6 & int1) != 0x0) {
                        agpd.n(s, b.getObject(o, d), this.G(n));
                        break;
                    }
                    break;
                }
                case 8: {
                    if ((n6 & int1) != 0x0) {
                        ai(s, b.getObject(o, d), agpd);
                        break;
                    }
                    break;
                }
                case 7: {
                    if ((n6 & int1) != 0x0) {
                        agpd.d(s, ahfz.x(o, d));
                        break;
                    }
                    break;
                }
                case 6: {
                    if ((n6 & int1) != 0x0) {
                        agpd.h(s, b.getInt(o, d));
                        break;
                    }
                    break;
                }
                case 5: {
                    if ((n6 & int1) != 0x0) {
                        agpd.i(s, b.getLong(o, d));
                        break;
                    }
                    break;
                }
                case 4: {
                    if ((n6 & int1) != 0x0) {
                        agpd.l(s, b.getInt(o, d));
                        break;
                    }
                    break;
                }
                case 3: {
                    if ((n6 & int1) != 0x0) {
                        agpd.v(s, b.getLong(o, d));
                        break;
                    }
                    break;
                }
                case 2: {
                    if ((n6 & int1) != 0x0) {
                        agpd.m(s, b.getLong(o, d));
                        break;
                    }
                    break;
                }
                case 1: {
                    if ((n6 & int1) != 0x0) {
                        agpd.j(s, ahfz.c(o, d));
                        break;
                    }
                    break;
                }
                case 0: {
                    if ((n6 & int1) != 0x0) {
                        agpd.f(s, ahfz.b(o, d));
                        break;
                    }
                    break;
                }
            }
            n += 3;
        }
        while (entry2 != null) {
            agsk.u(agpd, entry2);
            if (e.hasNext()) {
                entry2 = (Map.Entry)e.next();
            }
            else {
                entry2 = null;
            }
        }
        aj(o, agpd);
    }
    
    private final void ah(final agpd agpd, final int n, final Object o, int b) {
        if (o != null) {
            final ahei j = agsk.j(this.H(b));
            final ahej ahej = (ahej)o;
            final Object b2 = agpd.b;
            for (final Map.Entry<Object, V> entry : ((Map)ahej).entrySet()) {
                ((ahcd)agpd.b).B(n, 2);
                final Object b3 = agpd.b;
                b = agpd.b(j, entry.getKey(), entry.getValue());
                ((ahcd)b3).D(b);
                agpd.c((ahcd)agpd.b, j, entry.getKey(), entry.getValue());
            }
        }
    }
    
    private static final void ai(final int n, final Object o, final agpd agpd) {
        if (o instanceof String) {
            agpd.t(n, (String)o);
            return;
        }
        agpd.e(n, (ahbt)o);
    }
    
    private static final void aj(final Object o, final agpd agpd) {
        adzw.aU(o).i(agpd);
    }
    
    static ahfs d(final Object o) {
        final ahcz ahcz = (ahcz)o;
        ahfs unknownFields;
        if ((unknownFields = ahcz.unknownFields) == ahfs.a) {
            unknownFields = ahfs.c();
            ahcz.unknownFields = unknownFields;
        }
        return unknownFields;
    }
    
    static aheq m(final ahel ahel, final adzw adzw, final ahed ahed, final adzw adzw2, final agsk agsk, final agsk agsk2) {
        if (ahel instanceof ahfa) {
            return n((ahfa)ahel, ahed, adzw2, agsk, agsk2);
        }
        final ahfp ahfp = (ahfp)ahel;
        final ahex a = ahfp.a;
        final ahex b = ahex.b;
        final ahcl[] c = ahfp.c;
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
            final ahcl ahcl = c[i];
            int n3;
            int n4;
            if (ahcl.b == ahco.Y) {
                n3 = n + 1;
                n4 = n2;
            }
            else {
                final int z = ahcl.b.Z;
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
        if ((array5 = ahfp.b) == null) {
            array5 = aheq.a;
        }
        int n5 = 0;
        int j = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        final int n9 = d;
        while (j < c.length) {
            final ahcl ahcl2 = c[j];
            final int d3 = ahcl2.d;
            final aheu k = ahcl2.i;
            int n10;
            int n11;
            int z3;
            int n12;
            if (k != null) {
                final int z2 = ahcl2.b.Z;
                n10 = (int)ahfz.g((Field)k.b);
                n11 = (int)ahfz.g((Field)k.a);
                z3 = z2 + 51;
                n12 = 0;
            }
            else {
                final ahco b2 = ahcl2.b;
                n10 = (int)ahfz.g(ahcl2.a);
                z3 = b2.Z;
                final ahcn aa = b2.aa;
                if (!aa.e && aa != ahcn.d) {
                    final Field e = ahcl2.e;
                    int n13;
                    if (e == null) {
                        n13 = 1048575;
                    }
                    else {
                        n13 = (int)ahfz.g(e);
                    }
                    final int numberOfTrailingZeros = Integer.numberOfTrailingZeros(ahcl2.f);
                    n11 = n13;
                    n12 = numberOfTrailingZeros;
                }
                else {
                    n12 = 0;
                    n11 = 0;
                }
            }
            array[n6] = ahcl2.d;
            int n14;
            if (!ahcl2.h) {
                n14 = 0;
            }
            else {
                n14 = 536870912;
            }
            int n15;
            if (!ahcl2.g) {
                n15 = 0;
            }
            else {
                n15 = 268435456;
            }
            array[n6 + 1] = (n10 | (n14 | n15 | z3 << 20));
            array[n6 + 2] = (n12 << 20 | n11);
            final int ordinal = ahcl2.b.ordinal();
            Object o;
            if (ordinal != 9 && ordinal != 17) {
                if (ordinal != 27 && ordinal != 49) {
                    o = null;
                }
                else {
                    o = ahcl2.c;
                }
            }
            else {
                final Field a2 = ahcl2.a;
                if (a2 != null) {
                    o = a2.getType();
                }
                else {
                    o = ahcl2.j;
                }
            }
            final Object l = ahcl2.k;
            if (l != null) {
                final int n16 = n6 / 3;
                final int n17 = n16 + n16;
                array2[n17] = l;
                if (o != null) {
                    array2[n17 + 1] = o;
                }
                else {
                    final ahdf m = ahcl2.l;
                    if (m != null) {
                        array2[n17 + 1] = m;
                    }
                }
            }
            else if (o != null) {
                final int n18 = n6 / 3;
                array2[n18 + n18 + 1] = o;
            }
            else {
                final ahdf l2 = ahcl2.l;
                if (l2 != null) {
                    final int n19 = n6 / 3;
                    array2[n19 + n19 + 1] = l2;
                }
            }
            int n20;
            if ((n20 = n5) < array5.length) {
                n20 = n5;
                if (array5[n5] == d3) {
                    array5[n5] = n6;
                    n20 = n5 + 1;
                }
            }
            final ahco b3 = ahcl2.b;
            int n21;
            int n22;
            if (b3 == ahco.Y) {
                array3[n7] = n6;
                n21 = n7 + 1;
                n22 = n8;
            }
            else {
                final int z4 = b3.Z;
                n21 = n7;
                n22 = n8;
                if (z4 >= 18) {
                    n21 = n7;
                    n22 = n8;
                    if (z4 <= 49) {
                        array4[n8] = (int)ahfz.g(ahcl2.a);
                        n22 = n8 + 1;
                        n21 = n7;
                    }
                }
            }
            ++j;
            n6 += 3;
            n5 = n20;
            n7 = n21;
            n8 = n22;
        }
        int[] a3;
        if ((a3 = array3) == null) {
            a3 = aheq.a;
        }
        int[] a4;
        if (array4 == null) {
            a4 = aheq.a;
        }
        else {
            a4 = array4;
        }
        final boolean b4 = a == b;
        final int length2 = array5.length;
        final int length3 = a3.length;
        final int n23 = length2 + length3;
        final int length4 = a4.length;
        final int[] array6 = new int[n23 + length4];
        System.arraycopy(array5, 0, array6, 0, length2);
        System.arraycopy(a3, 0, array6, length2, length3);
        System.arraycopy(a4, 0, array6, n23, length4);
        return new aheq(array, array2, n9, d2, ahfp.d, b4, true, array6, length2, n23, ahed, adzw2, agsk, null, null, null, null, null);
    }
    
    static aheq n(final ahfa ahfa, final ahed ahed, final adzw adzw, final agsk agsk, final agsk agsk2) {
        final ahex b = ahfa.b();
        final ahex b2 = ahex.b;
        final String b3 = ahfa.b;
        final int length = b3.length();
        int n = 0;
        int n4;
        if (b3.charAt(0) >= '\ud800') {
            int n2 = 1;
            while (true) {
                final int n3 = n4 = n2 + 1;
                if (b3.charAt(n2) < '\ud800') {
                    break;
                }
                n2 = n3;
            }
        }
        else {
            n4 = 1;
        }
        int n5 = n4 + 1;
        final char char1 = b3.charAt(n4);
        int n6 = n5;
        int n7;
        if ((n7 = char1) >= 55296) {
            int n8 = char1 & '\u1fff';
            int n9 = 13;
            char char2;
            while (true) {
                n6 = n5 + 1;
                char2 = b3.charAt(n5);
                if (char2 < '\ud800') {
                    break;
                }
                n8 |= (char2 & '\u1fff') << n9;
                n9 += 13;
                n5 = n6;
            }
            n7 = (n8 | char2 << n9);
        }
        int[] a;
        int char3;
        int char4;
        int n10;
        int n11;
        int n12;
        int n13;
        if (n7 == 0) {
            a = aheq.a;
            char3 = 0;
            char4 = 0;
            n10 = 0;
            n11 = 0;
            n12 = 0;
            n13 = 0;
        }
        else {
            final int n14 = n6 + 1;
            int char5;
            final char c = (char)(char5 = b3.charAt(n6));
            int n15 = n14;
            if (c >= '\ud800') {
                final int n16 = c & '\u1fff';
                int n17 = 13;
                int n18 = n14;
                int n19 = n16;
                int n20;
                char char6;
                while (true) {
                    n20 = n18 + 1;
                    char6 = b3.charAt(n18);
                    if (char6 < '\ud800') {
                        break;
                    }
                    n19 |= (char6 & '\u1fff') << n17;
                    n17 += 13;
                    n18 = n20;
                }
                final int n21 = n19 | char6 << n17;
                n15 = n20;
                char5 = n21;
            }
            final int n22 = n15 + 1;
            int char7;
            final char c2 = (char)(char7 = b3.charAt(n15));
            int n23 = n22;
            if (c2 >= '\ud800') {
                int n24 = c2 & '\u1fff';
                int n25 = 13;
                int n26 = n22;
                int n27;
                char char8;
                while (true) {
                    n27 = n26 + 1;
                    char8 = b3.charAt(n26);
                    if (char8 < '\ud800') {
                        break;
                    }
                    n24 |= (char8 & '\u1fff') << n25;
                    n25 += 13;
                    n26 = n27;
                }
                char7 = (n24 | char8 << n25);
                n23 = n27;
            }
            final int n28 = n23 + 1;
            int char9;
            final char c3 = (char)(char9 = b3.charAt(n23));
            int n29 = n28;
            if (c3 >= '\ud800') {
                final int n30 = c3 & '\u1fff';
                int n31 = 13;
                int n32 = n28;
                int n33 = n30;
                int n34;
                char char10;
                while (true) {
                    n34 = n32 + 1;
                    char10 = b3.charAt(n32);
                    if (char10 < '\ud800') {
                        break;
                    }
                    n33 |= (char10 & '\u1fff') << n31;
                    n31 += 13;
                    n32 = n34;
                }
                final int n35 = n33 | char10 << n31;
                n29 = n34;
                char9 = n35;
            }
            final int n36 = n29 + 1;
            int char11;
            final char c4 = (char)(char11 = b3.charAt(n29));
            int n37 = n36;
            if (c4 >= '\ud800') {
                final int n38 = c4 & '\u1fff';
                int n39 = 13;
                int n40 = n36;
                int n41 = n38;
                int n42;
                char char12;
                while (true) {
                    n42 = n40 + 1;
                    char12 = b3.charAt(n40);
                    if (char12 < '\ud800') {
                        break;
                    }
                    n41 |= (char12 & '\u1fff') << n39;
                    n39 += 13;
                    n40 = n42;
                }
                final int n43 = n41 | char12 << n39;
                n37 = n42;
                char11 = n43;
            }
            final int n44 = n37 + 1;
            final char c5 = (char)(char3 = b3.charAt(n37));
            int n45 = n44;
            if (c5 >= '\ud800') {
                int n46 = c5 & '\u1fff';
                int n47 = 13;
                int n48 = n44;
                int n49;
                char char13;
                while (true) {
                    n49 = n48 + 1;
                    char13 = b3.charAt(n48);
                    if (char13 < '\ud800') {
                        break;
                    }
                    n46 |= (char13 & '\u1fff') << n47;
                    n47 += 13;
                    n48 = n49;
                }
                char3 = (n46 | char13 << n47);
                n45 = n49;
            }
            final int n50 = n45 + 1;
            final char c6 = (char)(char4 = b3.charAt(n45));
            int n51 = n50;
            if (c6 >= '\ud800') {
                int n52 = c6 & '\u1fff';
                int n53 = 13;
                int n54 = n50;
                int n55;
                char char14;
                while (true) {
                    n55 = n54 + 1;
                    char14 = b3.charAt(n54);
                    if (char14 < '\ud800') {
                        break;
                    }
                    n52 |= (char14 & '\u1fff') << n53;
                    n53 += 13;
                    n54 = n55;
                }
                char4 = (n52 | char14 << n53);
                n51 = n55;
            }
            int n56 = n51 + 1;
            int char15 = b3.charAt(n51);
            int n60;
            if (char15 >= 55296) {
                int n57 = char15 & 0x1FFF;
                int n58 = 13;
                int n59;
                char char16;
                while (true) {
                    n59 = n56 + 1;
                    char16 = b3.charAt(n56);
                    if (char16 < '\ud800') {
                        break;
                    }
                    n57 |= (char16 & '\u1fff') << n58;
                    n58 += 13;
                    n56 = n59;
                }
                char15 = (n57 | char16 << n58);
                n60 = n59;
            }
            else {
                n60 = n56;
            }
            final int n61 = n60 + 1;
            int char17;
            final char c7 = (char)(char17 = b3.charAt(n60));
            int n62 = n61;
            if (c7 >= '\ud800') {
                final int n63 = c7 & '\u1fff';
                int n64 = 13;
                int n65 = n61;
                int n66 = n63;
                char char18;
                while (true) {
                    n62 = n65 + 1;
                    char18 = b3.charAt(n65);
                    if (char18 < '\ud800') {
                        break;
                    }
                    n66 |= (char18 & '\u1fff') << n64;
                    n64 += 13;
                    n65 = n62;
                }
                char17 = (n66 | char18 << n64);
            }
            final int n67 = char5 + char5 + char7;
            a = new int[char17 + char4 + char15];
            n = char5;
            n6 = n62;
            n13 = char17;
            n12 = char11;
            n11 = char9;
            n10 = n67;
        }
        final Unsafe b4 = aheq.b;
        final Object[] c8 = ahfa.c;
        final Class<? extends MessageLite> class1 = ahfa.a.getClass();
        final int n68 = n13 + char4;
        final int[] array = new int[char3 * 3];
        final Object[] array2 = new Object[char3 + char3];
        int n69 = n13;
        int n70 = n68;
        int n71 = 0;
        int n72 = 0;
        int n73 = n6;
        int n74 = length;
        boolean b5;
        while (true) {
            b5 = (b == b2);
            if (n73 >= n74) {
                break;
            }
            final int n75 = n73 + 1;
            int char19 = b3.charAt(n73);
            int n79;
            if (char19 >= 55296) {
                int n76 = char19 & 0x1FFF;
                int n77 = n75;
                int n78 = 13;
                char char20;
                while (true) {
                    n79 = n77 + 1;
                    char20 = b3.charAt(n77);
                    if (char20 < '\ud800') {
                        break;
                    }
                    n76 |= (char20 & '\u1fff') << n78;
                    n78 += 13;
                    n77 = n79;
                }
                char19 = (n76 | char20 << n78);
            }
            else {
                n79 = n75;
            }
            int n80 = n79 + 1;
            final char char21 = b3.charAt(n79);
            int n83;
            int n84;
            if (char21 >= '\ud800') {
                int n81 = char21 & '\u1fff';
                int n82 = 13;
                char char22;
                while (true) {
                    n83 = n80 + 1;
                    char22 = b3.charAt(n80);
                    if (char22 < '\ud800') {
                        break;
                    }
                    n81 |= (char22 & '\u1fff') << n82;
                    n82 += 13;
                    n80 = n83;
                }
                n84 = (n81 | char22 << n82);
            }
            else {
                n83 = n80;
                n84 = char21;
            }
            int n85 = n71;
            if ((n84 & 0x400) != 0x0) {
                a[n71] = n72;
                n85 = n71 + 1;
            }
            final int n86 = n84 & 0xFF;
            int n100;
            int n103;
            int n104;
            int n105;
            int n106;
            if (n86 >= 51) {
                int n87 = n83 + 1;
                int char23 = b3.charAt(n83);
                int n91;
                if (char23 >= 55296) {
                    int n88 = char23 & 0x1FFF;
                    int n89 = 13;
                    int n90;
                    char char24;
                    while (true) {
                        n90 = n87 + 1;
                        char24 = b3.charAt(n87);
                        if (char24 < '\ud800') {
                            break;
                        }
                        n88 |= (char24 & '\u1fff') << n89;
                        n89 += 13;
                        n87 = n90;
                    }
                    char23 = (n88 | char24 << n89);
                    n91 = n90;
                }
                else {
                    n91 = n87;
                }
                final int n92 = n86 - 51;
                int n93 = 0;
                Label_1688: {
                    int n96;
                    if (n92 != 9 && n92 != 17) {
                        n93 = n10;
                        if (n92 != 12) {
                            break Label_1688;
                        }
                        n93 = n10;
                        if (b5) {
                            break Label_1688;
                        }
                        final int n94 = n72 / 3;
                        final int n95 = n10 + 1;
                        array2[n94 + n94 + 1] = c8[n10];
                        n96 = n95;
                    }
                    else {
                        final int n97 = n72 / 3;
                        final int n98 = n10 + 1;
                        array2[n97 + n97 + 1] = c8[n10];
                        n96 = n98;
                    }
                    n93 = n96;
                }
                int n99 = char23 + char23;
                final Object o = c8[n99];
                Field k;
                if (o instanceof Field) {
                    k = (Field)o;
                }
                else {
                    k = K(class1, (String)o);
                    c8[n99] = k;
                }
                n100 = (int)b4.objectFieldOffset(k);
                ++n99;
                final Object o2 = c8[n99];
                Field i;
                if (o2 instanceof Field) {
                    i = (Field)o2;
                }
                else {
                    i = K(class1, (String)o2);
                    c8[n99] = i;
                }
                final int n101 = (int)b4.objectFieldOffset(i);
                n10 = n93;
                final int n102 = n91;
                n103 = n101;
                n104 = 0;
                n105 = n70;
                n106 = n102;
            }
            else {
                final int n107 = n74;
                final int n108 = n10 + 1;
                final Field j = K(class1, (String)c8[n10]);
                int n109 = 0;
                if (n86 != 9 && n86 != 17) {
                    Label_2099: {
                        if (n86 != 27 && n86 != 49) {
                            int n110;
                            if (n86 != 12 && n86 != 30 && n86 != 44) {
                                n109 = n108;
                                n110 = n69;
                                if (n86 == 50) {
                                    final int n111 = n69 + 1;
                                    a[n69] = n72;
                                    final int n112 = n72 / 3;
                                    final int n113 = n108 + 1;
                                    final Object o3 = c8[n108];
                                    final int n114 = n112 + n112;
                                    array2[n114] = o3;
                                    if ((n84 & 0x800) != 0x0) {
                                        final int n115 = n113 + 1;
                                        array2[n114 + 1] = c8[n113];
                                        n110 = n111;
                                        n109 = n115;
                                    }
                                    else {
                                        n110 = n111;
                                        n109 = n113;
                                    }
                                }
                            }
                            else {
                                n109 = n108;
                                n110 = n69;
                                if (!b5) {
                                    final int n116 = n72 / 3;
                                    n109 = n108 + 1;
                                    array2[n116 + n116 + 1] = c8[n108];
                                    break Label_2099;
                                }
                            }
                            n69 = n110;
                        }
                        else {
                            final int n117 = n72 / 3;
                            n109 = n108 + 1;
                            array2[n117 + n117 + 1] = c8[n108];
                        }
                    }
                }
                else {
                    final int n118 = n72 / 3;
                    array2[n118 + n118 + 1] = j.getType();
                    n109 = n108;
                }
                final int n119 = (int)b4.objectFieldOffset(j);
                int n120 = 1048575;
                if ((n84 & 0x1000) == 0x1000 && n86 <= 17) {
                    final int n121 = n83 + 1;
                    int char25;
                    final char c9 = (char)(char25 = b3.charAt(n83));
                    int n122 = n121;
                    if (c9 >= '\ud800') {
                        int n123 = c9 & '\u1fff';
                        int n124 = 13;
                        int n125 = n121;
                        int n126;
                        char char26;
                        while (true) {
                            n126 = n125 + 1;
                            char26 = b3.charAt(n125);
                            if (char26 < '\ud800') {
                                break;
                            }
                            n123 |= (char26 & '\u1fff') << n124;
                            n124 += 13;
                            n125 = n126;
                        }
                        char25 = (n123 | char26 << n124);
                        n122 = n126;
                    }
                    final int n127 = n + n + char25 / 32;
                    final Object o4 = c8[n127];
                    n83 = n122;
                    Field l;
                    if (o4 instanceof Field) {
                        l = (Field)o4;
                    }
                    else {
                        l = K(class1, (String)o4);
                        c8[n127] = l;
                    }
                    n120 = (int)b4.objectFieldOffset(l);
                    n104 = char25 % 32;
                }
                else {
                    n104 = 0;
                }
                n105 = n70;
                if (n86 >= 18) {
                    n105 = n70;
                    if (n86 <= 49) {
                        a[n70] = n119;
                        n105 = n70 + 1;
                    }
                }
                final int n128 = n109;
                n74 = n107;
                n106 = n83;
                n103 = n120;
                n10 = n128;
                n100 = n119;
            }
            final int n129 = n72 + 1;
            array[n72] = char19;
            final int n130 = n129 + 1;
            int n131;
            if ((n84 & 0x200) != 0x0) {
                n131 = 536870912;
            }
            else {
                n131 = 0;
            }
            int n132;
            if ((n84 & 0x100) != 0x0) {
                n132 = 268435456;
            }
            else {
                n132 = 0;
            }
            array[n129] = (n100 | (n132 | n131 | n86 << 20));
            n72 = n130 + 1;
            array[n130] = (n104 << 20 | n103);
            n71 = n85;
            n73 = n106;
            n70 = n105;
        }
        return new aheq(array, array2, n11, n12, ahfa.a, b5, false, a, n13, n68, ahed, adzw, agsk, null, null, null, null, null);
    }
    
    private static double o(final Object o, final long n) {
        return (double)ahfz.i(o, n);
    }
    
    private static float p(final Object o, final long n) {
        return (float)ahfz.i(o, n);
    }
    
    private final int q(final Object o) {
        final Unsafe b = aheq.b;
        final int n = 0;
        int i = 0;
        int n2 = 0;
        int n3 = 1048575;
        int int1 = 0;
        while (i < this.c.length) {
            final int c = this.C(i);
            final int s = this.s(i);
            final int b2 = B(c);
            int n8;
            int n9;
            int n10;
            int n11;
            if (b2 <= 17) {
                final int n4 = this.c[i + 2];
                final int n5 = n4 & 0xFFFFF;
                int n6;
                if (n5 != (n6 = n3)) {
                    int1 = b.getInt(o, (long)n5);
                    n6 = n5;
                }
                final int n7 = 1 << (n4 >>> 20);
                n8 = n6;
                n9 = int1;
                n10 = n4;
                n11 = n7;
            }
            else {
                if (this.k && b2 >= ahco.J.Z && b2 <= ahco.W.Z) {
                    n10 = (this.c[i + 2] & 0xFFFFF);
                }
                else {
                    n10 = 0;
                }
                n11 = 0;
                n9 = int1;
                n8 = n3;
            }
            final long d = D(c);
            int n12 = 0;
            Label_2789: {
                int n13 = 0;
                Label_2286: {
                    int n14 = 0;
                    int n15 = 0;
                    int ac2 = 0;
                    switch (b2) {
                        default: {
                            n12 = n2;
                            break Label_2789;
                        }
                        case 68: {
                            n12 = n2;
                            if (this.aa(o, s, i)) {
                                n13 = ahcd.L(s, (MessageLite)b.getObject(o, d), this.G(i));
                                break Label_2286;
                            }
                            break Label_2789;
                        }
                        case 67: {
                            n12 = n2;
                            if (this.aa(o, s, i)) {
                                n13 = ahcd.Y(s, E(o, d));
                                break Label_2286;
                            }
                            break Label_2789;
                        }
                        case 66: {
                            n12 = n2;
                            if (this.aa(o, s, i)) {
                                n13 = ahcd.W(s, t(o, d));
                                break Label_2286;
                            }
                            break Label_2789;
                        }
                        case 65: {
                            n12 = n2;
                            if (this.aa(o, s, i)) {
                                n13 = ahcd.aE(s);
                                break Label_2286;
                            }
                            break Label_2789;
                        }
                        case 64: {
                            n12 = n2;
                            if (this.aa(o, s, i)) {
                                n13 = ahcd.aD(s);
                                break Label_2286;
                            }
                            break Label_2789;
                        }
                        case 63: {
                            n12 = n2;
                            if (this.aa(o, s, i)) {
                                n13 = ahcd.K(s, t(o, d));
                                break Label_2286;
                            }
                            break Label_2789;
                        }
                        case 62: {
                            n12 = n2;
                            if (this.aa(o, s, i)) {
                                n13 = ahcd.ad(s, t(o, d));
                                break Label_2286;
                            }
                            break Label_2789;
                        }
                        case 61: {
                            n12 = n2;
                            if (this.aa(o, s, i)) {
                                n13 = ahcd.I(s, (ahbt)b.getObject(o, d));
                                break Label_2286;
                            }
                            break Label_2789;
                        }
                        case 60: {
                            n12 = n2;
                            if (this.aa(o, s, i)) {
                                n13 = ahfh.i(s, b.getObject(o, d), this.G(i));
                                break Label_2286;
                            }
                            break Label_2789;
                        }
                        case 59: {
                            n12 = n2;
                            if (!this.aa(o, s, i)) {
                                break Label_2789;
                            }
                            final Object object = b.getObject(o, d);
                            if (object instanceof ahbt) {
                                n13 = ahcd.I(s, (ahbt)object);
                                break Label_2286;
                            }
                            n13 = ahcd.aa(s, (String)object);
                            break Label_2286;
                        }
                        case 58: {
                            n12 = n2;
                            if (this.aa(o, s, i)) {
                                n13 = ahcd.ay(s);
                                break Label_2286;
                            }
                            break Label_2789;
                        }
                        case 57: {
                            n12 = n2;
                            if (this.aa(o, s, i)) {
                                n13 = ahcd.aA(s);
                                break Label_2286;
                            }
                            break Label_2789;
                        }
                        case 56: {
                            n12 = n2;
                            if (this.aa(o, s, i)) {
                                n13 = ahcd.aB(s);
                                break Label_2286;
                            }
                            break Label_2789;
                        }
                        case 55: {
                            n12 = n2;
                            if (this.aa(o, s, i)) {
                                n13 = ahcd.N(s, t(o, d));
                                break Label_2286;
                            }
                            break Label_2789;
                        }
                        case 54: {
                            n12 = n2;
                            if (this.aa(o, s, i)) {
                                n13 = ahcd.af(s, E(o, d));
                                break Label_2286;
                            }
                            break Label_2789;
                        }
                        case 53: {
                            n12 = n2;
                            if (this.aa(o, s, i)) {
                                n13 = ahcd.P(s, E(o, d));
                                break Label_2286;
                            }
                            break Label_2789;
                        }
                        case 52: {
                            n12 = n2;
                            if (this.aa(o, s, i)) {
                                n13 = ahcd.aC(s);
                                break Label_2286;
                            }
                            break Label_2789;
                        }
                        case 51: {
                            n12 = n2;
                            if (this.aa(o, s, i)) {
                                n13 = ahcd.az(s);
                                break Label_2286;
                            }
                            break Label_2789;
                        }
                        case 50: {
                            n13 = agsk.k(s, b.getObject(o, d), this.H(i));
                            break Label_2286;
                        }
                        case 49: {
                            n13 = ahfh.f(s, (List)b.getObject(o, d), this.G(i));
                            break Label_2286;
                        }
                        case 48: {
                            final int l = ahfh.l((List)b.getObject(o, d));
                            n12 = n2;
                            if (l > 0) {
                                if (this.k) {
                                    b.putInt(o, (long)n10, l);
                                }
                                final int ac = ahcd.ac(s);
                                n14 = ahcd.ae(l);
                                n15 = l;
                                ac2 = ac;
                                break;
                            }
                            break Label_2789;
                        }
                        case 47: {
                            final int k = ahfh.k((List)b.getObject(o, d));
                            n12 = n2;
                            if (k > 0) {
                                if (this.k) {
                                    b.putInt(o, (long)n10, k);
                                }
                                final int ac3 = ahcd.ac(s);
                                n14 = ahcd.ae(k);
                                n15 = k;
                                ac2 = ac3;
                                break;
                            }
                            break Label_2789;
                        }
                        case 46: {
                            final int e = ahfh.e((List)b.getObject(o, d));
                            n12 = n2;
                            if (e > 0) {
                                if (this.k) {
                                    b.putInt(o, (long)n10, e);
                                }
                                final int ac4 = ahcd.ac(s);
                                n14 = ahcd.ae(e);
                                n15 = e;
                                ac2 = ac4;
                                break;
                            }
                            break Label_2789;
                        }
                        case 45: {
                            final int d2 = ahfh.d((List)b.getObject(o, d));
                            n12 = n2;
                            if (d2 > 0) {
                                if (this.k) {
                                    b.putInt(o, (long)n10, d2);
                                }
                                final int ac5 = ahcd.ac(s);
                                n14 = ahcd.ae(d2);
                                n15 = d2;
                                ac2 = ac5;
                                break;
                            }
                            break Label_2789;
                        }
                        case 44: {
                            final int c2 = ahfh.c((List)b.getObject(o, d));
                            n12 = n2;
                            if (c2 > 0) {
                                if (this.k) {
                                    b.putInt(o, (long)n10, c2);
                                }
                                final int ac6 = ahcd.ac(s);
                                n14 = ahcd.ae(c2);
                                n15 = c2;
                                ac2 = ac6;
                                break;
                            }
                            break Label_2789;
                        }
                        case 43: {
                            final int n16 = ahfh.n((List)b.getObject(o, d));
                            n12 = n2;
                            if (n16 > 0) {
                                if (this.k) {
                                    b.putInt(o, (long)n10, n16);
                                }
                                final int ac7 = ahcd.ac(s);
                                n14 = ahcd.ae(n16);
                                n15 = n16;
                                ac2 = ac7;
                                break;
                            }
                            break Label_2789;
                        }
                        case 42: {
                            final int a = ahfh.a((List)b.getObject(o, d));
                            n12 = n2;
                            if (a > 0) {
                                if (this.k) {
                                    b.putInt(o, (long)n10, a);
                                }
                                final int ac8 = ahcd.ac(s);
                                n14 = ahcd.ae(a);
                                n15 = a;
                                ac2 = ac8;
                                break;
                            }
                            break Label_2789;
                        }
                        case 41: {
                            final int d3 = ahfh.d((List)b.getObject(o, d));
                            n12 = n2;
                            if (d3 > 0) {
                                if (this.k) {
                                    b.putInt(o, (long)n10, d3);
                                }
                                final int ac9 = ahcd.ac(s);
                                n14 = ahcd.ae(d3);
                                n15 = d3;
                                ac2 = ac9;
                                break;
                            }
                            break Label_2789;
                        }
                        case 40: {
                            final int e2 = ahfh.e((List)b.getObject(o, d));
                            n12 = n2;
                            if (e2 > 0) {
                                if (this.k) {
                                    b.putInt(o, (long)n10, e2);
                                }
                                final int ac10 = ahcd.ac(s);
                                n14 = ahcd.ae(e2);
                                n15 = e2;
                                ac2 = ac10;
                                break;
                            }
                            break Label_2789;
                        }
                        case 39: {
                            final int g = ahfh.g((List)b.getObject(o, d));
                            n12 = n2;
                            if (g > 0) {
                                if (this.k) {
                                    b.putInt(o, (long)n10, g);
                                }
                                final int ac11 = ahcd.ac(s);
                                n14 = ahcd.ae(g);
                                n15 = g;
                                ac2 = ac11;
                                break;
                            }
                            break Label_2789;
                        }
                        case 38: {
                            final int o2 = ahfh.o((List)b.getObject(o, d));
                            n12 = n2;
                            if (o2 > 0) {
                                if (this.k) {
                                    b.putInt(o, (long)n10, o2);
                                }
                                final int ac12 = ahcd.ac(s);
                                n14 = ahcd.ae(o2);
                                n15 = o2;
                                ac2 = ac12;
                                break;
                            }
                            break Label_2789;
                        }
                        case 37: {
                            final int h = ahfh.h((List)b.getObject(o, d));
                            n12 = n2;
                            if (h > 0) {
                                if (this.k) {
                                    b.putInt(o, (long)n10, h);
                                }
                                final int ac13 = ahcd.ac(s);
                                n14 = ahcd.ae(h);
                                n15 = h;
                                ac2 = ac13;
                                break;
                            }
                            break Label_2789;
                        }
                        case 36: {
                            final int d4 = ahfh.d((List)b.getObject(o, d));
                            n12 = n2;
                            if (d4 > 0) {
                                if (this.k) {
                                    b.putInt(o, (long)n10, d4);
                                }
                                final int ac14 = ahcd.ac(s);
                                n14 = ahcd.ae(d4);
                                n15 = d4;
                                ac2 = ac14;
                                break;
                            }
                            break Label_2789;
                        }
                        case 35: {
                            final int e3 = ahfh.e((List)b.getObject(o, d));
                            n12 = n2;
                            if (e3 > 0) {
                                if (this.k) {
                                    b.putInt(o, (long)n10, e3);
                                }
                                ac2 = ahcd.ac(s);
                                n14 = ahcd.ae(e3);
                                n15 = e3;
                                break;
                            }
                            break Label_2789;
                        }
                        case 34: {
                            n13 = ahfh.y(s, (List)b.getObject(o, d));
                            break Label_2286;
                        }
                        case 33: {
                            n13 = ahfh.x(s, (List)b.getObject(o, d));
                            break Label_2286;
                        }
                        case 32: {
                            n13 = ahfh.u(s, (List)b.getObject(o, d));
                            break Label_2286;
                        }
                        case 31: {
                            n13 = ahfh.t(s, (List)b.getObject(o, d));
                            break Label_2286;
                        }
                        case 30: {
                            n13 = ahfh.s(s, (List)b.getObject(o, d));
                            break Label_2286;
                        }
                        case 29: {
                            n13 = ahfh.z(s, (List)b.getObject(o, d));
                            break Label_2286;
                        }
                        case 28: {
                            n13 = ahfh.b(s, (List)b.getObject(o, d));
                            break Label_2286;
                        }
                        case 27: {
                            n13 = ahfh.j(s, (List)b.getObject(o, d), this.G(i));
                            break Label_2286;
                        }
                        case 26: {
                            n13 = ahfh.m(s, (List)b.getObject(o, d));
                            break Label_2286;
                        }
                        case 25: {
                            n13 = ahfh.r(s, (List)b.getObject(o, d));
                            break Label_2286;
                        }
                        case 24: {
                            n13 = ahfh.t(s, (List)b.getObject(o, d));
                            break Label_2286;
                        }
                        case 23: {
                            n13 = ahfh.u(s, (List)b.getObject(o, d));
                            break Label_2286;
                        }
                        case 22: {
                            n13 = ahfh.v(s, (List)b.getObject(o, d));
                            break Label_2286;
                        }
                        case 21: {
                            n13 = ahfh.A(s, (List)b.getObject(o, d));
                            break Label_2286;
                        }
                        case 20: {
                            n13 = ahfh.w(s, (List)b.getObject(o, d));
                            break Label_2286;
                        }
                        case 19: {
                            n13 = ahfh.t(s, (List)b.getObject(o, d));
                            break Label_2286;
                        }
                        case 18: {
                            n13 = ahfh.u(s, (List)b.getObject(o, d));
                            break Label_2286;
                        }
                        case 17: {
                            n12 = n2;
                            if ((n9 & n11) != 0x0) {
                                n13 = ahcd.L(s, (MessageLite)b.getObject(o, d), this.G(i));
                                break Label_2286;
                            }
                            break Label_2789;
                        }
                        case 16: {
                            n12 = n2;
                            if ((n9 & n11) != 0x0) {
                                n13 = ahcd.Y(s, b.getLong(o, d));
                                break Label_2286;
                            }
                            break Label_2789;
                        }
                        case 15: {
                            n12 = n2;
                            if ((n9 & n11) != 0x0) {
                                n13 = ahcd.W(s, b.getInt(o, d));
                                break Label_2286;
                            }
                            break Label_2789;
                        }
                        case 14: {
                            n12 = n2;
                            if ((n9 & n11) != 0x0) {
                                n13 = ahcd.aE(s);
                                break Label_2286;
                            }
                            break Label_2789;
                        }
                        case 13: {
                            n12 = n2;
                            if ((n9 & n11) != 0x0) {
                                n13 = ahcd.aD(s);
                                break Label_2286;
                            }
                            break Label_2789;
                        }
                        case 12: {
                            n12 = n2;
                            if ((n9 & n11) != 0x0) {
                                n13 = ahcd.K(s, b.getInt(o, d));
                                break Label_2286;
                            }
                            break Label_2789;
                        }
                        case 11: {
                            n12 = n2;
                            if ((n9 & n11) != 0x0) {
                                n13 = ahcd.ad(s, b.getInt(o, d));
                                break Label_2286;
                            }
                            break Label_2789;
                        }
                        case 10: {
                            n12 = n2;
                            if ((n9 & n11) != 0x0) {
                                n13 = ahcd.I(s, (ahbt)b.getObject(o, d));
                                break Label_2286;
                            }
                            break Label_2789;
                        }
                        case 9: {
                            n12 = n2;
                            if ((n9 & n11) != 0x0) {
                                n13 = ahfh.i(s, b.getObject(o, d), this.G(i));
                                break Label_2286;
                            }
                            break Label_2789;
                        }
                        case 8: {
                            n12 = n2;
                            if ((n9 & n11) == 0x0) {
                                break Label_2789;
                            }
                            final Object object2 = b.getObject(o, d);
                            if (object2 instanceof ahbt) {
                                n13 = ahcd.I(s, (ahbt)object2);
                                break Label_2286;
                            }
                            n13 = ahcd.aa(s, (String)object2);
                            break Label_2286;
                        }
                        case 7: {
                            n12 = n2;
                            if ((n9 & n11) != 0x0) {
                                n13 = ahcd.ay(s);
                                break Label_2286;
                            }
                            break Label_2789;
                        }
                        case 6: {
                            n12 = n2;
                            if ((n9 & n11) != 0x0) {
                                n13 = ahcd.aA(s);
                                break Label_2286;
                            }
                            break Label_2789;
                        }
                        case 5: {
                            n12 = n2;
                            if ((n9 & n11) != 0x0) {
                                n13 = ahcd.aB(s);
                                break Label_2286;
                            }
                            break Label_2789;
                        }
                        case 4: {
                            n12 = n2;
                            if ((n9 & n11) != 0x0) {
                                n13 = ahcd.N(s, b.getInt(o, d));
                                break Label_2286;
                            }
                            break Label_2789;
                        }
                        case 3: {
                            n12 = n2;
                            if ((n9 & n11) != 0x0) {
                                n13 = ahcd.af(s, b.getLong(o, d));
                                break Label_2286;
                            }
                            break Label_2789;
                        }
                        case 2: {
                            n12 = n2;
                            if ((n9 & n11) != 0x0) {
                                n13 = ahcd.P(s, b.getLong(o, d));
                                break Label_2286;
                            }
                            break Label_2789;
                        }
                        case 1: {
                            n12 = n2;
                            if ((n9 & n11) != 0x0) {
                                n13 = ahcd.aC(s);
                                break Label_2286;
                            }
                            break Label_2789;
                        }
                        case 0: {
                            n12 = n2;
                            if ((n9 & n11) != 0x0) {
                                n13 = ahcd.az(s);
                                break Label_2286;
                            }
                            break Label_2789;
                        }
                    }
                    n12 = n2 + (ac2 + n14 + n15);
                    break Label_2789;
                }
                n12 = n2 + n13;
            }
            i += 3;
            n2 = n12;
            n3 = n8;
            int1 = n9;
        }
        int n17 = n2 + ae(o);
        if (this.h) {
            final ahcm p = agsk.p(o);
            int n18 = 0;
            for (int j = n; j < p.b.a(); ++j) {
                final Map.Entry f = p.b.f(j);
                n18 += ahcm.k((ahcw)f.getKey(), f.getValue());
            }
            for (final Map.Entry<ahcw, V> entry : p.b.c()) {
                n18 += ahcm.k((ahcw)entry.getKey(), (Object)entry.getValue());
            }
            n17 += n18;
        }
        return n17;
    }
    
    private final int r(final Object o) {
        final Unsafe b = aheq.b;
        int i = 0;
        int n = 0;
        while (i < this.c.length) {
            final int c = this.C(i);
            final int b2 = B(c);
            final int s = this.s(i);
            final long d = D(c);
            int n2;
            if (b2 >= ahco.J.Z && b2 <= ahco.W.Z) {
                n2 = (this.c[i + 2] & 0xFFFFF);
            }
            else {
                n2 = 0;
            }
            int n3 = 0;
            Label_2643: {
                int n4 = 0;
                Label_2126: {
                    int n5 = 0;
                    int n6 = 0;
                    int ae2 = 0;
                    switch (b2) {
                        default: {
                            n3 = n;
                            break Label_2643;
                        }
                        case 68: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = ahcd.L(s, (MessageLite)ahfz.i(o, d), this.G(i));
                                break Label_2126;
                            }
                            break Label_2643;
                        }
                        case 67: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = ahcd.Y(s, E(o, d));
                                break Label_2126;
                            }
                            break Label_2643;
                        }
                        case 66: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = ahcd.W(s, t(o, d));
                                break Label_2126;
                            }
                            break Label_2643;
                        }
                        case 65: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = ahcd.aE(s);
                                break Label_2126;
                            }
                            break Label_2643;
                        }
                        case 64: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = ahcd.aD(s);
                                break Label_2126;
                            }
                            break Label_2643;
                        }
                        case 63: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = ahcd.K(s, t(o, d));
                                break Label_2126;
                            }
                            break Label_2643;
                        }
                        case 62: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = ahcd.ad(s, t(o, d));
                                break Label_2126;
                            }
                            break Label_2643;
                        }
                        case 61: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = ahcd.I(s, (ahbt)ahfz.i(o, d));
                                break Label_2126;
                            }
                            break Label_2643;
                        }
                        case 60: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = ahfh.i(s, ahfz.i(o, d), this.G(i));
                                break Label_2126;
                            }
                            break Label_2643;
                        }
                        case 59: {
                            n3 = n;
                            if (!this.aa(o, s, i)) {
                                break Label_2643;
                            }
                            final Object j = ahfz.i(o, d);
                            if (j instanceof ahbt) {
                                n4 = ahcd.I(s, (ahbt)j);
                                break Label_2126;
                            }
                            n4 = ahcd.aa(s, (String)j);
                            break Label_2126;
                        }
                        case 58: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = ahcd.ay(s);
                                break Label_2126;
                            }
                            break Label_2643;
                        }
                        case 57: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = ahcd.aA(s);
                                break Label_2126;
                            }
                            break Label_2643;
                        }
                        case 56: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = ahcd.aB(s);
                                break Label_2126;
                            }
                            break Label_2643;
                        }
                        case 55: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = ahcd.N(s, t(o, d));
                                break Label_2126;
                            }
                            break Label_2643;
                        }
                        case 54: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = ahcd.af(s, E(o, d));
                                break Label_2126;
                            }
                            break Label_2643;
                        }
                        case 53: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = ahcd.P(s, E(o, d));
                                break Label_2126;
                            }
                            break Label_2643;
                        }
                        case 52: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = ahcd.aC(s);
                                break Label_2126;
                            }
                            break Label_2643;
                        }
                        case 51: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = ahcd.az(s);
                                break Label_2126;
                            }
                            break Label_2643;
                        }
                        case 50: {
                            n4 = agsk.k(s, ahfz.i(o, d), this.H(i));
                            break Label_2126;
                        }
                        case 49: {
                            n4 = ahfh.f(s, L(o, d), this.G(i));
                            break Label_2126;
                        }
                        case 48: {
                            final int l = ahfh.l((List)b.getObject(o, d));
                            n3 = n;
                            if (l > 0) {
                                if (this.k) {
                                    b.putInt(o, (long)n2, l);
                                }
                                n5 = ahcd.ac(s);
                                final int ae = ahcd.ae(l);
                                n6 = l;
                                ae2 = ae;
                                break;
                            }
                            break Label_2643;
                        }
                        case 47: {
                            final int k = ahfh.k((List)b.getObject(o, d));
                            n3 = n;
                            if (k > 0) {
                                if (this.k) {
                                    b.putInt(o, (long)n2, k);
                                }
                                n5 = ahcd.ac(s);
                                final int ae3 = ahcd.ae(k);
                                n6 = k;
                                ae2 = ae3;
                                break;
                            }
                            break Label_2643;
                        }
                        case 46: {
                            final int e = ahfh.e((List)b.getObject(o, d));
                            n3 = n;
                            if (e > 0) {
                                if (this.k) {
                                    b.putInt(o, (long)n2, e);
                                }
                                n5 = ahcd.ac(s);
                                final int ae4 = ahcd.ae(e);
                                n6 = e;
                                ae2 = ae4;
                                break;
                            }
                            break Label_2643;
                        }
                        case 45: {
                            final int d2 = ahfh.d((List)b.getObject(o, d));
                            n3 = n;
                            if (d2 > 0) {
                                if (this.k) {
                                    b.putInt(o, (long)n2, d2);
                                }
                                n5 = ahcd.ac(s);
                                final int ae5 = ahcd.ae(d2);
                                n6 = d2;
                                ae2 = ae5;
                                break;
                            }
                            break Label_2643;
                        }
                        case 44: {
                            final int c2 = ahfh.c((List)b.getObject(o, d));
                            n3 = n;
                            if (c2 > 0) {
                                if (this.k) {
                                    b.putInt(o, (long)n2, c2);
                                }
                                n5 = ahcd.ac(s);
                                final int ae6 = ahcd.ae(c2);
                                n6 = c2;
                                ae2 = ae6;
                                break;
                            }
                            break Label_2643;
                        }
                        case 43: {
                            final int n7 = ahfh.n((List)b.getObject(o, d));
                            n3 = n;
                            if (n7 > 0) {
                                if (this.k) {
                                    b.putInt(o, (long)n2, n7);
                                }
                                n5 = ahcd.ac(s);
                                final int ae7 = ahcd.ae(n7);
                                n6 = n7;
                                ae2 = ae7;
                                break;
                            }
                            break Label_2643;
                        }
                        case 42: {
                            final int a = ahfh.a((List)b.getObject(o, d));
                            n3 = n;
                            if (a > 0) {
                                if (this.k) {
                                    b.putInt(o, (long)n2, a);
                                }
                                n5 = ahcd.ac(s);
                                final int ae8 = ahcd.ae(a);
                                n6 = a;
                                ae2 = ae8;
                                break;
                            }
                            break Label_2643;
                        }
                        case 41: {
                            final int d3 = ahfh.d((List)b.getObject(o, d));
                            n3 = n;
                            if (d3 > 0) {
                                if (this.k) {
                                    b.putInt(o, (long)n2, d3);
                                }
                                n5 = ahcd.ac(s);
                                final int ae9 = ahcd.ae(d3);
                                n6 = d3;
                                ae2 = ae9;
                                break;
                            }
                            break Label_2643;
                        }
                        case 40: {
                            final int e2 = ahfh.e((List)b.getObject(o, d));
                            n3 = n;
                            if (e2 > 0) {
                                if (this.k) {
                                    b.putInt(o, (long)n2, e2);
                                }
                                n5 = ahcd.ac(s);
                                final int ae10 = ahcd.ae(e2);
                                n6 = e2;
                                ae2 = ae10;
                                break;
                            }
                            break Label_2643;
                        }
                        case 39: {
                            final int g = ahfh.g((List)b.getObject(o, d));
                            n3 = n;
                            if (g > 0) {
                                if (this.k) {
                                    b.putInt(o, (long)n2, g);
                                }
                                n5 = ahcd.ac(s);
                                final int ae11 = ahcd.ae(g);
                                n6 = g;
                                ae2 = ae11;
                                break;
                            }
                            break Label_2643;
                        }
                        case 38: {
                            final int o2 = ahfh.o((List)b.getObject(o, d));
                            n3 = n;
                            if (o2 > 0) {
                                if (this.k) {
                                    b.putInt(o, (long)n2, o2);
                                }
                                n5 = ahcd.ac(s);
                                final int ae12 = ahcd.ae(o2);
                                n6 = o2;
                                ae2 = ae12;
                                break;
                            }
                            break Label_2643;
                        }
                        case 37: {
                            final int h = ahfh.h((List)b.getObject(o, d));
                            n3 = n;
                            if (h > 0) {
                                if (this.k) {
                                    b.putInt(o, (long)n2, h);
                                }
                                n5 = ahcd.ac(s);
                                final int ae13 = ahcd.ae(h);
                                n6 = h;
                                ae2 = ae13;
                                break;
                            }
                            break Label_2643;
                        }
                        case 36: {
                            final int d4 = ahfh.d((List)b.getObject(o, d));
                            n3 = n;
                            if (d4 > 0) {
                                if (this.k) {
                                    b.putInt(o, (long)n2, d4);
                                }
                                n5 = ahcd.ac(s);
                                final int ae14 = ahcd.ae(d4);
                                n6 = d4;
                                ae2 = ae14;
                                break;
                            }
                            break Label_2643;
                        }
                        case 35: {
                            final int e3 = ahfh.e((List)b.getObject(o, d));
                            n3 = n;
                            if (e3 > 0) {
                                if (this.k) {
                                    b.putInt(o, (long)n2, e3);
                                }
                                n5 = ahcd.ac(s);
                                ae2 = ahcd.ae(e3);
                                n6 = e3;
                                break;
                            }
                            break Label_2643;
                        }
                        case 34: {
                            n4 = ahfh.y(s, L(o, d));
                            break Label_2126;
                        }
                        case 33: {
                            n4 = ahfh.x(s, L(o, d));
                            break Label_2126;
                        }
                        case 32: {
                            n4 = ahfh.u(s, L(o, d));
                            break Label_2126;
                        }
                        case 31: {
                            n4 = ahfh.t(s, L(o, d));
                            break Label_2126;
                        }
                        case 30: {
                            n4 = ahfh.s(s, L(o, d));
                            break Label_2126;
                        }
                        case 29: {
                            n4 = ahfh.z(s, L(o, d));
                            break Label_2126;
                        }
                        case 28: {
                            n4 = ahfh.b(s, L(o, d));
                            break Label_2126;
                        }
                        case 27: {
                            n4 = ahfh.j(s, L(o, d), this.G(i));
                            break Label_2126;
                        }
                        case 26: {
                            n4 = ahfh.m(s, L(o, d));
                            break Label_2126;
                        }
                        case 25: {
                            n4 = ahfh.r(s, L(o, d));
                            break Label_2126;
                        }
                        case 24: {
                            n4 = ahfh.t(s, L(o, d));
                            break Label_2126;
                        }
                        case 23: {
                            n4 = ahfh.u(s, L(o, d));
                            break Label_2126;
                        }
                        case 22: {
                            n4 = ahfh.v(s, L(o, d));
                            break Label_2126;
                        }
                        case 21: {
                            n4 = ahfh.A(s, L(o, d));
                            break Label_2126;
                        }
                        case 20: {
                            n4 = ahfh.w(s, L(o, d));
                            break Label_2126;
                        }
                        case 19: {
                            n4 = ahfh.t(s, L(o, d));
                            break Label_2126;
                        }
                        case 18: {
                            n4 = ahfh.u(s, L(o, d));
                            break Label_2126;
                        }
                        case 17: {
                            n3 = n;
                            if (this.W(o, i)) {
                                n4 = ahcd.L(s, (MessageLite)ahfz.i(o, d), this.G(i));
                                break Label_2126;
                            }
                            break Label_2643;
                        }
                        case 16: {
                            n3 = n;
                            if (this.W(o, i)) {
                                n4 = ahcd.Y(s, ahfz.f(o, d));
                                break Label_2126;
                            }
                            break Label_2643;
                        }
                        case 15: {
                            n3 = n;
                            if (this.W(o, i)) {
                                n4 = ahcd.W(s, ahfz.d(o, d));
                                break Label_2126;
                            }
                            break Label_2643;
                        }
                        case 14: {
                            n3 = n;
                            if (this.W(o, i)) {
                                n4 = ahcd.aE(s);
                                break Label_2126;
                            }
                            break Label_2643;
                        }
                        case 13: {
                            n3 = n;
                            if (this.W(o, i)) {
                                n4 = ahcd.aD(s);
                                break Label_2126;
                            }
                            break Label_2643;
                        }
                        case 12: {
                            n3 = n;
                            if (this.W(o, i)) {
                                n4 = ahcd.K(s, ahfz.d(o, d));
                                break Label_2126;
                            }
                            break Label_2643;
                        }
                        case 11: {
                            n3 = n;
                            if (this.W(o, i)) {
                                n4 = ahcd.ad(s, ahfz.d(o, d));
                                break Label_2126;
                            }
                            break Label_2643;
                        }
                        case 10: {
                            n3 = n;
                            if (this.W(o, i)) {
                                n4 = ahcd.I(s, (ahbt)ahfz.i(o, d));
                                break Label_2126;
                            }
                            break Label_2643;
                        }
                        case 9: {
                            n3 = n;
                            if (this.W(o, i)) {
                                n4 = ahfh.i(s, ahfz.i(o, d), this.G(i));
                                break Label_2126;
                            }
                            break Label_2643;
                        }
                        case 8: {
                            n3 = n;
                            if (!this.W(o, i)) {
                                break Label_2643;
                            }
                            final Object m = ahfz.i(o, d);
                            if (m instanceof ahbt) {
                                n4 = ahcd.I(s, (ahbt)m);
                                break Label_2126;
                            }
                            n4 = ahcd.aa(s, (String)m);
                            break Label_2126;
                        }
                        case 7: {
                            n3 = n;
                            if (this.W(o, i)) {
                                n4 = ahcd.ay(s);
                                break Label_2126;
                            }
                            break Label_2643;
                        }
                        case 6: {
                            n3 = n;
                            if (this.W(o, i)) {
                                n4 = ahcd.aA(s);
                                break Label_2126;
                            }
                            break Label_2643;
                        }
                        case 5: {
                            n3 = n;
                            if (this.W(o, i)) {
                                n4 = ahcd.aB(s);
                                break Label_2126;
                            }
                            break Label_2643;
                        }
                        case 4: {
                            n3 = n;
                            if (this.W(o, i)) {
                                n4 = ahcd.N(s, ahfz.d(o, d));
                                break Label_2126;
                            }
                            break Label_2643;
                        }
                        case 3: {
                            n3 = n;
                            if (this.W(o, i)) {
                                n4 = ahcd.af(s, ahfz.f(o, d));
                                break Label_2126;
                            }
                            break Label_2643;
                        }
                        case 2: {
                            n3 = n;
                            if (this.W(o, i)) {
                                n4 = ahcd.P(s, ahfz.f(o, d));
                                break Label_2126;
                            }
                            break Label_2643;
                        }
                        case 1: {
                            n3 = n;
                            if (this.W(o, i)) {
                                n4 = ahcd.aC(s);
                                break Label_2126;
                            }
                            break Label_2643;
                        }
                        case 0: {
                            n3 = n;
                            if (this.W(o, i)) {
                                n4 = ahcd.az(s);
                                break Label_2126;
                            }
                            break Label_2643;
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
        return (int)ahfz.i(o, n);
    }
    
    private final int u(Object o, final byte[] array, int i, final int n, int n2, final long n3, final ahbh ahbh) {
        final Unsafe b = aheq.b;
        final Object h = this.H(n2);
        Object o3;
        final Object o2 = o3 = b.getObject(o, n3);
        if (agsk.l(o2)) {
            o3 = agsk.n();
            agsk.m(o3, o2);
            b.putObject(o, n3, o3);
        }
        final ahei j = agsk.j(h);
        final ahej ahej = (ahej)o3;
        i = agsk.O(array, i, ahbh);
        n2 = ahbh.a;
        if (n2 < 0 || n2 > n - i) {
            throw ahds.j();
        }
        final int n4 = i + n2;
        Object o4 = j.a;
        o = j.b;
        while (i < n4) {
            final int n5 = i + 1;
            final int n6 = n2 = array[i];
            i = n5;
            if (n6 < 0) {
                i = agsk.P(n6, array, n5, ahbh);
                n2 = ahbh.a;
            }
            final int n7 = n2 & 0x7;
            final int n8 = n2 >>> 3;
            if (n8 != 1) {
                if (n8 == 2) {
                    final ahgc ahgc = (ahgc)j.d;
                    if (n7 == ahgc.t) {
                        i = ac(array, i, n, ahgc, j.b.getClass(), ahbh);
                        o = ahbh.c;
                        continue;
                    }
                }
            }
            else {
                final ahgc ahgc2 = (ahgc)j.c;
                if (n7 == ahgc2.t) {
                    i = ac(array, i, n, ahgc2, null, ahbh);
                    o4 = ahbh.c;
                    continue;
                }
            }
            i = agsk.U(n2, array, i, n, ahbh);
        }
        if (i == n4) {
            ((Map<Object, Object>)ahej).put(o4, o);
            return n4;
        }
        throw ahds.g();
    }
    
    private final int v(final Object o, final byte[] array, int n, int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final long n8, final int n9, final ahbh ahbh) {
        final Unsafe b = aheq.b;
        final long n10 = this.c[n9 + 2] & 0xFFFFF;
        switch (n7) {
            case 68: {
                if (n5 == 3) {
                    final Object j = this.J(o, n4, n9);
                    n = agsk.S(j, this.G(n9), array, n, n2, (n3 & 0xFFFFFFF8) | 0x4, ahbh);
                    this.T(o, n4, n9, j);
                    return n;
                }
                break;
            }
            case 67: {
                if (n5 == 0) {
                    n = agsk.R(array, n, ahbh);
                    b.putObject(o, n8, ahby.L(ahbh.b));
                    b.putInt(o, n10, n4);
                    return n;
                }
                break;
            }
            case 66: {
                if (n5 == 0) {
                    n = agsk.O(array, n, ahbh);
                    b.putObject(o, n8, ahby.J(ahbh.a));
                    b.putInt(o, n10, n4);
                    return n;
                }
                break;
            }
            case 63: {
                if (n5 == 0) {
                    n = agsk.O(array, n, ahbh);
                    n2 = ahbh.a;
                    final ahdf f = this.F(n9);
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
                if (n5 == 2) {
                    n = agsk.x(array, n, ahbh);
                    b.putObject(o, n8, ahbh.c);
                    b.putInt(o, n10, n4);
                    return n;
                }
                break;
            }
            case 60: {
                if (n5 == 2) {
                    final Object i = this.J(o, n4, n9);
                    n = agsk.T(i, this.G(n9), array, n, n2, ahbh);
                    this.T(o, n4, n9, i);
                    return n;
                }
                break;
            }
            case 59: {
                if (n5 == 2) {
                    n = agsk.O(array, n, ahbh);
                    n2 = ahbh.a;
                    if (n2 == 0) {
                        b.putObject(o, n8, "");
                    }
                    else {
                        if ((n6 & 0x20000000) != 0x0 && !ahgb.h(array, n, n + n2)) {
                            throw ahds.d();
                        }
                        b.putObject(o, n8, new String(array, n, n2, ahdq.a));
                        n += n2;
                    }
                    b.putInt(o, n10, n4);
                    break;
                }
                break;
            }
            case 58: {
                if (n5 == 0) {
                    n = agsk.R(array, n, ahbh);
                    b.putObject(o, n8, ahbh.b != 0L);
                    b.putInt(o, n10, n4);
                    return n;
                }
                break;
            }
            case 57:
            case 64: {
                if (n5 == 5) {
                    b.putObject(o, n8, agsk.y(array, n));
                    b.putInt(o, n10, n4);
                    return n + 4;
                }
                break;
            }
            case 56:
            case 65: {
                if (n5 == 1) {
                    b.putObject(o, n8, agsk.V(array, n));
                    b.putInt(o, n10, n4);
                    return n + 8;
                }
                break;
            }
            case 55:
            case 62: {
                if (n5 == 0) {
                    n = agsk.O(array, n, ahbh);
                    b.putObject(o, n8, ahbh.a);
                    b.putInt(o, n10, n4);
                    return n;
                }
                break;
            }
            case 53:
            case 54: {
                if (n5 == 0) {
                    n = agsk.R(array, n, ahbh);
                    b.putObject(o, n8, ahbh.b);
                    b.putInt(o, n10, n4);
                    return n;
                }
                break;
            }
            case 52: {
                if (n5 == 5) {
                    b.putObject(o, n8, agsk.w(array, n));
                    b.putInt(o, n10, n4);
                    return n + 4;
                }
                break;
            }
            case 51: {
                if (n5 == 1) {
                    b.putObject(o, n8, agsk.v(array, n));
                    b.putInt(o, n10, n4);
                    return n + 8;
                }
                break;
            }
        }
        return n;
    }
    
    private final int w(final Object o, final byte[] array, int i, final int n, final int n2, int n3, int n4, final int n5, final long n6, int n7, final long n8, final ahbh ahbh) {
        int n9 = i;
        final Unsafe b = aheq.b;
        ahdp e;
        final ahdp ahdp = e = (ahdp)b.getObject(o, n8);
        if (!ahdp.c()) {
            final int size = ahdp.size();
            int n10;
            if (size == 0) {
                n10 = 10;
            }
            else {
                n10 = size + size;
            }
            e = ahdp.e(n10);
            b.putObject(o, n8, e);
        }
        Label_1919: {
            switch (n7) {
                default: {
                    n7 = n9;
                    if (n4 == 3) {
                        final ahfg g = this.G(n5);
                        n3 = ((n2 & 0xFFFFFFF8) | 0x4);
                        i = agsk.z(g, array, i, n, n3, ahbh);
                        e.add(ahbh.c);
                        while (i < n) {
                            n4 = agsk.O(array, i, ahbh);
                            if (n2 != ahbh.a) {
                                break;
                            }
                            i = agsk.z(g, array, n4, n, n3, ahbh);
                            e.add(ahbh.c);
                        }
                        return i;
                    }
                    break;
                }
                case 34:
                case 48: {
                    if (n4 == 2) {
                        i = agsk.I(array, n9, e, ahbh);
                        return i;
                    }
                    n7 = n9;
                    if (n4 == 0) {
                        final ahee ahee = (ahee)e;
                        i = agsk.R(array, n9, ahbh);
                        ahee.f(ahby.L(ahbh.b));
                        while (i < n) {
                            n3 = agsk.O(array, i, ahbh);
                            if (n2 != ahbh.a) {
                                break;
                            }
                            i = agsk.R(array, n3, ahbh);
                            ahee.f(ahby.L(ahbh.b));
                        }
                        return i;
                    }
                    break;
                }
                case 33:
                case 47: {
                    if (n4 == 2) {
                        i = agsk.H(array, n9, e, ahbh);
                        return i;
                    }
                    n7 = n9;
                    if (n4 == 0) {
                        final ahda ahda = (ahda)e;
                        i = agsk.O(array, n9, ahbh);
                        ahda.g(ahby.J(ahbh.a));
                        while (i < n) {
                            n3 = agsk.O(array, i, ahbh);
                            if (n2 != ahbh.a) {
                                break;
                            }
                            i = agsk.O(array, n3, ahbh);
                            ahda.g(ahby.J(ahbh.a));
                        }
                        return i;
                    }
                    break;
                }
                case 30:
                case 44: {
                    if (n4 == 2) {
                        i = agsk.J(array, n9, e, ahbh);
                    }
                    else {
                        n7 = n9;
                        if (n4 != 0) {
                            break;
                        }
                        i = agsk.Q(n2, array, i, n, e, ahbh);
                    }
                    ahfh.Y(o, n3, (List)e, this.F(n5), (Object)null, this.p);
                    return i;
                }
                case 28: {
                    n7 = n9;
                    if (n4 != 2) {
                        break;
                    }
                    i = agsk.O(array, n9, ahbh);
                    n3 = ahbh.a;
                    if (n3 < 0) {
                        throw ahds.f();
                    }
                    if (n3 <= array.length - i) {
                        while (true) {
                            Label_0639: {
                                if (n3 != 0) {
                                    e.add((Object)ahbt.z(array, i, n3));
                                    break Label_0639;
                                }
                                e.add((Object)ahbt.b);
                                while (i < n) {
                                    n3 = agsk.O(array, i, ahbh);
                                    if (n2 != ahbh.a) {
                                        break;
                                    }
                                    i = agsk.O(array, n3, ahbh);
                                    n3 = ahbh.a;
                                    if (n3 < 0) {
                                        throw ahds.f();
                                    }
                                    if (n3 > array.length - i) {
                                        throw ahds.j();
                                    }
                                    if (n3 != 0) {
                                        e.add((Object)ahbt.z(array, i, n3));
                                        break Label_0639;
                                    }
                                    e.add((Object)ahbt.b);
                                }
                                return i;
                            }
                            i += n3;
                            continue;
                        }
                    }
                    throw ahds.j();
                }
                case 27: {
                    n7 = n9;
                    if (n4 == 2) {
                        return agsk.B(this.G(n5), n2, array, i, n, e, ahbh);
                    }
                    break;
                }
                case 26: {
                    n7 = n9;
                    if (n4 != 2) {
                        break;
                    }
                    if ((n6 & 0x20000000L) == 0x0L) {
                        n3 = agsk.O(array, n9, ahbh);
                        i = ahbh.a;
                        if (i >= 0) {
                            while (true) {
                                Label_0871: {
                                    if (i != 0) {
                                        e.add((Object)new String(array, n3, i, ahdq.a));
                                        break Label_0871;
                                    }
                                    e.add((Object)"");
                                    i = n3;
                                    while (true) {
                                        n7 = i;
                                        if (i >= n) {
                                            break Label_1919;
                                        }
                                        n3 = agsk.O(array, i, ahbh);
                                        n7 = i;
                                        if (n2 != ahbh.a) {
                                            break Label_1919;
                                        }
                                        i = agsk.O(array, n3, ahbh);
                                        n4 = ahbh.a;
                                        if (n4 < 0) {
                                            throw ahds.f();
                                        }
                                        if (n4 != 0) {
                                            e.add((Object)new String(array, i, n4, ahdq.a));
                                            n3 = i;
                                            i = n4;
                                            break;
                                        }
                                        e.add((Object)"");
                                    }
                                }
                                i += n3;
                                continue;
                            }
                        }
                        throw ahds.f();
                    }
                    else {
                        n3 = agsk.O(array, n9, ahbh);
                        n4 = ahbh.a;
                        if (n4 < 0) {
                            throw ahds.f();
                        }
                        if (n4 == 0) {
                            e.add((Object)"");
                            i = n3;
                        }
                        else {
                            i = n3 + n4;
                            if (!ahgb.h(array, n3, i)) {
                                throw ahds.d();
                            }
                            e.add((Object)new String(array, n3, n4, ahdq.a));
                        }
                        while (true) {
                            n7 = i;
                            if (i >= n) {
                                break Label_1919;
                            }
                            n3 = agsk.O(array, i, ahbh);
                            n7 = i;
                            if (n2 != ahbh.a) {
                                break Label_1919;
                            }
                            n3 = agsk.O(array, n3, ahbh);
                            n4 = ahbh.a;
                            if (n4 < 0) {
                                throw ahds.f();
                            }
                            if (n4 == 0) {
                                e.add((Object)"");
                                i = n3;
                            }
                            else {
                                i = n3 + n4;
                                if (!ahgb.h(array, n3, i)) {
                                    throw ahds.d();
                                }
                                e.add((Object)new String(array, n3, n4, ahdq.a));
                            }
                        }
                    }
                    break;
                }
                case 25:
                case 42: {
                    if (n4 == 2) {
                        i = agsk.C(array, n9, e, ahbh);
                        return i;
                    }
                    n7 = n9;
                    if (n4 == 0) {
                        final ahbk ahbk = (ahbk)e;
                        i = agsk.R(array, n9, ahbh);
                        ahbk.f(ahbh.b != 0L);
                        while (i < n) {
                            n3 = agsk.O(array, i, ahbh);
                            if (n2 != ahbh.a) {
                                break;
                            }
                            i = agsk.R(array, n3, ahbh);
                            ahbk.f(ahbh.b != 0L);
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
                        i = agsk.E(array, n9, e, ahbh);
                        return i;
                    }
                    n7 = n9;
                    if (n4 == 5) {
                        final ahda ahda2 = (ahda)e;
                        ahda2.g(agsk.y(array, i));
                        while (true) {
                            i = n9 + 4;
                            if (i >= n) {
                                break;
                            }
                            n9 = agsk.O(array, i, ahbh);
                            if (n2 != ahbh.a) {
                                break;
                            }
                            ahda2.g(agsk.y(array, n9));
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
                        i = agsk.F(array, n9, e, ahbh);
                        return i;
                    }
                    n7 = n9;
                    if (n4 == 1) {
                        final ahee ahee2 = (ahee)e;
                        ahee2.f(agsk.V(array, i));
                        while (true) {
                            i = n9 + 8;
                            if (i >= n) {
                                break;
                            }
                            n9 = agsk.O(array, i, ahbh);
                            if (n2 != ahbh.a) {
                                break;
                            }
                            ahee2.f(agsk.V(array, n9));
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
                        i = agsk.J(array, n9, e, ahbh);
                        return i;
                    }
                    n7 = n9;
                    if (n4 == 0) {
                        return agsk.Q(n2, array, i, n, e, ahbh);
                    }
                    break;
                }
                case 20:
                case 21:
                case 37:
                case 38: {
                    if (n4 == 2) {
                        i = agsk.K(array, n9, e, ahbh);
                        return i;
                    }
                    n7 = n9;
                    if (n4 == 0) {
                        final ahee ahee3 = (ahee)e;
                        i = agsk.R(array, n9, ahbh);
                        ahee3.f(ahbh.b);
                        while (i < n) {
                            n3 = agsk.O(array, i, ahbh);
                            if (n2 != ahbh.a) {
                                break;
                            }
                            i = agsk.R(array, n3, ahbh);
                            ahee3.f(ahbh.b);
                        }
                        return i;
                    }
                    break;
                }
                case 19:
                case 36: {
                    if (n4 == 2) {
                        i = agsk.G(array, n9, e, ahbh);
                        return i;
                    }
                    n7 = n9;
                    if (n4 == 5) {
                        final ahcp ahcp = (ahcp)e;
                        ahcp.h(agsk.w(array, i));
                        while (true) {
                            i = n9 + 4;
                            if (i >= n) {
                                break;
                            }
                            n9 = agsk.O(array, i, ahbh);
                            if (n2 != ahbh.a) {
                                break;
                            }
                            ahcp.h(agsk.w(array, n9));
                        }
                        return i;
                    }
                    break;
                }
                case 18:
                case 35: {
                    if (n4 == 2) {
                        i = agsk.D(array, n9, e, ahbh);
                        return i;
                    }
                    n7 = n9;
                    if (n4 == 1) {
                        final ahce ahce = (ahce)e;
                        ahce.f(agsk.v(array, i));
                        while (true) {
                            i = n9 + 8;
                            if (i >= n) {
                                break;
                            }
                            n9 = agsk.O(array, i, ahbh);
                            if (n2 != ahbh.a) {
                                break;
                            }
                            ahce.f(agsk.v(array, n9));
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
            Label_1281: {
                int n4 = 0;
                int n5 = 0;
                Label_1277: {
                    switch (b) {
                        default: {
                            n3 = n;
                            break Label_1281;
                        }
                        case 68: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                final Object j = ahfz.i(o, d);
                                n4 = n * 53;
                                n5 = j.hashCode();
                                break Label_1277;
                            }
                            break Label_1281;
                        }
                        case 67: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = n * 53;
                                n5 = ahdq.c(E(o, d));
                                break Label_1277;
                            }
                            break Label_1281;
                        }
                        case 66: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = n * 53;
                                n5 = t(o, d);
                                break Label_1277;
                            }
                            break Label_1281;
                        }
                        case 65: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = n * 53;
                                n5 = ahdq.c(E(o, d));
                                break Label_1277;
                            }
                            break Label_1281;
                        }
                        case 64: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = n * 53;
                                n5 = t(o, d);
                                break Label_1277;
                            }
                            break Label_1281;
                        }
                        case 63: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = n * 53;
                                n5 = t(o, d);
                                break Label_1277;
                            }
                            break Label_1281;
                        }
                        case 62: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = n * 53;
                                n5 = t(o, d);
                                break Label_1277;
                            }
                            break Label_1281;
                        }
                        case 61: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = n * 53;
                                n5 = ahfz.i(o, d).hashCode();
                                break Label_1277;
                            }
                            break Label_1281;
                        }
                        case 60: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                final Object k = ahfz.i(o, d);
                                n4 = n * 53;
                                n5 = k.hashCode();
                                break Label_1277;
                            }
                            break Label_1281;
                        }
                        case 59: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = n * 53;
                                n5 = ((String)ahfz.i(o, d)).hashCode();
                                break Label_1277;
                            }
                            break Label_1281;
                        }
                        case 58: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = n * 53;
                                n5 = ahdq.a(ab(o, d));
                                break Label_1277;
                            }
                            break Label_1281;
                        }
                        case 57: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = n * 53;
                                n5 = t(o, d);
                                break Label_1277;
                            }
                            break Label_1281;
                        }
                        case 56: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = n * 53;
                                n5 = ahdq.c(E(o, d));
                                break Label_1277;
                            }
                            break Label_1281;
                        }
                        case 55: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = n * 53;
                                n5 = t(o, d);
                                break Label_1277;
                            }
                            break Label_1281;
                        }
                        case 54: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = n * 53;
                                n5 = ahdq.c(E(o, d));
                                break Label_1277;
                            }
                            break Label_1281;
                        }
                        case 53: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = n * 53;
                                n5 = ahdq.c(E(o, d));
                                break Label_1277;
                            }
                            break Label_1281;
                        }
                        case 52: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = n * 53;
                                n5 = Float.floatToIntBits(p(o, d));
                                break Label_1277;
                            }
                            break Label_1281;
                        }
                        case 51: {
                            n3 = n;
                            if (this.aa(o, s, i)) {
                                n4 = n * 53;
                                n5 = ahdq.c(Double.doubleToLongBits(o(o, d)));
                                break Label_1277;
                            }
                            break Label_1281;
                        }
                        case 50: {
                            n4 = n * 53;
                            n5 = ahfz.i(o, d).hashCode();
                            break Label_1277;
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
                            n5 = ahfz.i(o, d).hashCode();
                            break Label_1277;
                        }
                        case 17: {
                            final Object l = ahfz.i(o, d);
                            if (l != null) {
                                n2 = l.hashCode();
                                break;
                            }
                            break;
                        }
                        case 16: {
                            n4 = n * 53;
                            n5 = ahdq.c(ahfz.f(o, d));
                            break Label_1277;
                        }
                        case 15: {
                            n4 = n * 53;
                            n5 = ahfz.d(o, d);
                            break Label_1277;
                        }
                        case 14: {
                            n4 = n * 53;
                            n5 = ahdq.c(ahfz.f(o, d));
                            break Label_1277;
                        }
                        case 13: {
                            n4 = n * 53;
                            n5 = ahfz.d(o, d);
                            break Label_1277;
                        }
                        case 12: {
                            n4 = n * 53;
                            n5 = ahfz.d(o, d);
                            break Label_1277;
                        }
                        case 11: {
                            n4 = n * 53;
                            n5 = ahfz.d(o, d);
                            break Label_1277;
                        }
                        case 10: {
                            n4 = n * 53;
                            n5 = ahfz.i(o, d).hashCode();
                            break Label_1277;
                        }
                        case 9: {
                            final Object m = ahfz.i(o, d);
                            if (m != null) {
                                n2 = m.hashCode();
                                break;
                            }
                            break;
                        }
                        case 8: {
                            n4 = n * 53;
                            n5 = ((String)ahfz.i(o, d)).hashCode();
                            break Label_1277;
                        }
                        case 7: {
                            n4 = n * 53;
                            n5 = ahdq.a(ahfz.x(o, d));
                            break Label_1277;
                        }
                        case 6: {
                            n4 = n * 53;
                            n5 = ahfz.d(o, d);
                            break Label_1277;
                        }
                        case 5: {
                            n4 = n * 53;
                            n5 = ahdq.c(ahfz.f(o, d));
                            break Label_1277;
                        }
                        case 4: {
                            n4 = n * 53;
                            n5 = ahfz.d(o, d);
                            break Label_1277;
                        }
                        case 3: {
                            n4 = n * 53;
                            n5 = ahdq.c(ahfz.f(o, d));
                            break Label_1277;
                        }
                        case 2: {
                            n4 = n * 53;
                            n5 = ahdq.c(ahfz.f(o, d));
                            break Label_1277;
                        }
                        case 1: {
                            n4 = n * 53;
                            n5 = Float.floatToIntBits(ahfz.c(o, d));
                            break Label_1277;
                        }
                        case 0: {
                            n4 = n * 53;
                            n5 = ahdq.c(Double.doubleToLongBits(ahfz.b(o, d)));
                            break Label_1277;
                        }
                    }
                    n3 = n * 53 + n2;
                    break Label_1281;
                }
                n3 = n4 + n5;
            }
            i += 3;
            n = n3;
        }
        int n6 = n * 53 + adzw.aU(o).hashCode();
        if (this.h) {
            n6 = n6 * 53 + agsk.p(o).hashCode();
        }
        return n6;
    }
    
    public final int c(final Object o, final byte[] array, int i, int n, int n2, final ahbh ahbh) {
        byte[] array2 = array;
        int n3 = n;
        int n4 = n2;
        M(o);
        final Unsafe b = aheq.b;
        int n5 = -1;
        int n6 = 0;
        int a = 0;
        int n7 = 0;
        int n8 = 1048575;
        while (true) {
            while (i < n3) {
                int p6 = i + 1;
                a = array2[i];
                if (a < 0) {
                    p6 = agsk.P(a, array2, p6, ahbh);
                    a = ahbh.a;
                }
                final int n9 = a >>> 3;
                if (n9 > n5) {
                    i = this.y(n9, n6 / 3);
                }
                else {
                    i = this.x(n9);
                }
                final int n10 = i;
                int n26 = 0;
                int n27 = 0;
                Label_1465: {
                    if (n10 != -1) {
                        final int n11 = a & 0x7;
                        final int[] c = this.c;
                        final int n12 = c[n10 + 1];
                        final int b2 = B(n12);
                        final long d = D(n12);
                        int b3 = 0;
                        Label_0429: {
                            if (b2 <= 17) {
                                final int n13 = c[n10 + 2];
                                final int n14 = 1 << (n13 >>> 20);
                                final int n15 = n13 & 0xFFFFF;
                                int n16;
                                int n17;
                                if (n15 != n8) {
                                    if (n8 != 1048575) {
                                        b.putInt(o, (long)n8, n7);
                                    }
                                    final int int1 = b.getInt(o, (long)n15);
                                    n16 = n15;
                                    n17 = int1;
                                }
                                else {
                                    n17 = n7;
                                    n16 = n8;
                                }
                                Label_1085: {
                                    int n19 = 0;
                                    Label_1021: {
                                        Label_1011: {
                                            Label_0977: {
                                                Label_0838: {
                                                    switch (b2) {
                                                        default: {
                                                            if (n11 == 3) {
                                                                final Object j = this.I(o, n10);
                                                                final int s = agsk.S(j, this.G(n10), array, p6, n, n9 << 3 | 0x4, ahbh);
                                                                this.S(o, n10, j);
                                                                final int n18 = n17 | n14;
                                                                n8 = n16;
                                                                n7 = n18;
                                                                b3 = s;
                                                                break Label_0429;
                                                            }
                                                            break;
                                                        }
                                                        case 16: {
                                                            if (n11 == 0) {
                                                                n19 = agsk.R(array, p6, ahbh);
                                                                b.putLong(o, d, ahby.L(ahbh.b));
                                                                n17 |= n14;
                                                                break Label_1021;
                                                            }
                                                            break;
                                                        }
                                                        case 15: {
                                                            if (n11 == 0) {
                                                                n19 = agsk.O(array, p6, ahbh);
                                                                b.putInt(o, d, ahby.J(ahbh.a));
                                                                break Label_1011;
                                                            }
                                                            break;
                                                        }
                                                        case 12: {
                                                            if (n11 != 0) {
                                                                break;
                                                            }
                                                            n19 = agsk.O(array, p6, ahbh);
                                                            final int a2 = ahbh.a;
                                                            final ahdf f = this.F(n10);
                                                            if (f != null && !f.isInRange(a2)) {
                                                                d(o).g(a, (Object)(long)a2);
                                                                break Label_1021;
                                                            }
                                                            b.putInt(o, d, a2);
                                                            break Label_1011;
                                                        }
                                                        case 10: {
                                                            if (n11 == 2) {
                                                                n19 = agsk.x(array, p6, ahbh);
                                                                b.putObject(o, d, ahbh.c);
                                                                break Label_1011;
                                                            }
                                                            break;
                                                        }
                                                        case 9: {
                                                            if (n11 == 2) {
                                                                final Object k = this.I(o, n10);
                                                                n19 = agsk.T(k, this.G(n10), array, p6, n, ahbh);
                                                                this.S(o, n10, k);
                                                                break Label_1011;
                                                            }
                                                            break;
                                                        }
                                                        case 8: {
                                                            if (n11 == 2) {
                                                                if ((0x20000000 & n12) == 0x0) {
                                                                    n19 = agsk.L(array, p6, ahbh);
                                                                }
                                                                else {
                                                                    n19 = agsk.M(array, p6, ahbh);
                                                                }
                                                                b.putObject(o, d, ahbh.c);
                                                                break Label_0838;
                                                            }
                                                            break;
                                                        }
                                                        case 7: {
                                                            if (n11 == 0) {
                                                                n19 = agsk.R(array, p6, ahbh);
                                                                ahfz.n(o, d, ahbh.b != 0L);
                                                                break Label_0838;
                                                            }
                                                            break;
                                                        }
                                                        case 6:
                                                        case 13: {
                                                            if (n11 == 5) {
                                                                b.putInt(o, d, agsk.y(array, p6));
                                                                n19 = p6 + 4;
                                                                break Label_0838;
                                                            }
                                                            break;
                                                        }
                                                        case 5:
                                                        case 14: {
                                                            if (n11 == 1) {
                                                                b.putLong(o, d, agsk.V(array, p6));
                                                                n19 = p6 + 8;
                                                                break Label_1011;
                                                            }
                                                            break;
                                                        }
                                                        case 4:
                                                        case 11: {
                                                            if (n11 == 0) {
                                                                n19 = agsk.O(array, p6, ahbh);
                                                                b.putInt(o, d, ahbh.a);
                                                                break Label_1011;
                                                            }
                                                            break;
                                                        }
                                                        case 2:
                                                        case 3: {
                                                            if (n11 == 0) {
                                                                n19 = agsk.R(array, p6, ahbh);
                                                                b.putLong(o, d, ahbh.b);
                                                                n17 |= n14;
                                                                break Label_1021;
                                                            }
                                                            break;
                                                        }
                                                        case 1: {
                                                            if (n11 == 5) {
                                                                ahfz.s(o, d, agsk.w(array, p6));
                                                                n19 = p6 + 4;
                                                                break Label_1011;
                                                            }
                                                            break;
                                                        }
                                                        case 0: {
                                                            if (n11 == 1) {
                                                                ahfz.r(o, d, agsk.v(array, p6));
                                                                n19 = p6 + 8;
                                                                break Label_1011;
                                                            }
                                                            break;
                                                        }
                                                    }
                                                    break Label_0977;
                                                }
                                                n17 |= n14;
                                                break Label_1021;
                                            }
                                            break Label_1085;
                                        }
                                        n17 |= n14;
                                    }
                                    array2 = array;
                                    final int n20 = n16;
                                    n6 = i;
                                    final int n21 = n;
                                    n5 = n9;
                                    final int n22 = n2;
                                    i = n19;
                                    n7 = n17;
                                    n8 = n20;
                                    n4 = n22;
                                    n3 = n21;
                                    continue;
                                }
                                final int n23 = i;
                                i = n2;
                                final int n24 = p6;
                                final int n25 = n17;
                                n8 = n16;
                                n26 = n23;
                                n27 = n24;
                                n7 = n25;
                                break Label_1465;
                            }
                            Label_1399: {
                                if (b2 != 27) {
                                    final int n28 = n7;
                                    int n29 = 0;
                                    Label_1330: {
                                        int n30;
                                        if (b2 <= 49) {
                                            final int w = this.w(o, array, p6, n, a, n9, n11, n10, n12, b2, d, ahbh);
                                            if ((n29 = w) == p6) {
                                                break Label_1330;
                                            }
                                            n30 = w;
                                        }
                                        else if (b2 == 50) {
                                            if (n11 != 2) {
                                                break Label_1399;
                                            }
                                            final int u = this.u(o, array, p6, n, n10, d, ahbh);
                                            if ((n29 = u) == p6) {
                                                break Label_1330;
                                            }
                                            n30 = u;
                                        }
                                        else {
                                            final int v = this.v(o, array, p6, n, a, n9, n11, n12, b2, d, n10, ahbh);
                                            if ((n29 = v) == p6) {
                                                break Label_1330;
                                            }
                                            n30 = v;
                                        }
                                        array2 = array;
                                        n5 = n9;
                                        n3 = n;
                                        n4 = n2;
                                        final int n31 = n28;
                                        n6 = i;
                                        i = n30;
                                        n7 = n31;
                                        continue;
                                    }
                                    n26 = i;
                                    i = a;
                                    i = n2;
                                    n27 = n29;
                                    n7 = n28;
                                    break Label_1465;
                                }
                                if (n11 == 2) {
                                    ahdp e;
                                    final ahdp ahdp = e = (ahdp)b.getObject(o, d);
                                    if (!ahdp.c()) {
                                        final int size = ahdp.size();
                                        int n32;
                                        if (size == 0) {
                                            n32 = 10;
                                        }
                                        else {
                                            n32 = size + size;
                                        }
                                        e = ahdp.e(n32);
                                        b.putObject(o, d, e);
                                    }
                                    b3 = agsk.B(this.G(n10), a, array, p6, n, e, ahbh);
                                    break Label_0429;
                                }
                            }
                            n27 = p6;
                            final int n33 = n2;
                            n26 = i;
                            i = a;
                            i = n33;
                            break Label_1465;
                        }
                        n3 = n;
                        array2 = array;
                        final int n34 = n2;
                        n6 = i;
                        n5 = n9;
                        i = b3;
                        n4 = n34;
                        continue;
                    }
                    final int n35 = p6;
                    i = a;
                    i = n4;
                    n26 = 0;
                    n27 = n35;
                }
                boolean b4 = true;
                if (a == i && i != 0) {
                    n2 = n27;
                    n4 = i;
                    Object af = null;
                    if (n8 != 1048575) {
                        b.putInt(o, (long)n8, n7);
                    }
                    for (i = this.m; i < this.n; ++i) {
                        af = this.af(o, this.l[i], af, o);
                    }
                    if (af != null) {
                        adzw.aV(o, (ahfs)af);
                    }
                    if (n4 == 0) {
                        if (n2 != n) {
                            throw ahds.g();
                        }
                    }
                    else if (n2 > n || a != n4) {
                        throw ahds.g();
                    }
                    return n2;
                }
                final int n36 = i;
                Label_2891: {
                    if (this.h) {
                        final ExtensionRegistryLite d2 = ahbh.d;
                        if (d2 != ExtensionRegistryLite.a) {
                            final MessageLite g = this.g;
                            final adzw p7 = this.p;
                            final ahcx b5 = d2.b(g, n9);
                            if (b5 == null) {
                                i = agsk.N(a, array, n27, n, d(o), ahbh);
                                break Label_2891;
                            }
                            final ahcu ahcu = (ahcu)o;
                            ahcu.e();
                            final ahcm l = ahcu.l;
                            final ahcw d3 = b5.d;
                            Label_2123: {
                                if (d3.d && d3.e) {
                                    final ahgc a3 = ahgc.a;
                                    switch (b5.b().ordinal()) {
                                        default: {
                                            throw new IllegalStateException("Type cannot be packed: ".concat(String.valueOf(String.valueOf(b5.d.c))));
                                        }
                                        case 17: {
                                            final ahee ahee = new ahee();
                                            i = agsk.I(array, n27, (ahdp)ahee, ahbh);
                                            l.n(b5.d, (Object)ahee);
                                            break;
                                        }
                                        case 16: {
                                            final ahda ahda = new ahda();
                                            i = agsk.H(array, n27, (ahdp)ahda, ahbh);
                                            l.n(b5.d, (Object)ahda);
                                            break;
                                        }
                                        case 13: {
                                            final ahda ahda2 = new ahda();
                                            i = agsk.J(array, n27, (ahdp)ahda2, ahbh);
                                            ahfh.X((Object)ahcu, n9, (List)ahda2, b5.d.a, (Object)null, p7);
                                            l.n(b5.d, (Object)ahda2);
                                            break;
                                        }
                                        case 7: {
                                            final ahbk ahbk = new ahbk(new boolean[10], 0);
                                            i = agsk.C(array, n27, (ahdp)ahbk, ahbh);
                                            l.n(b5.d, (Object)ahbk);
                                            break;
                                        }
                                        case 6:
                                        case 14: {
                                            final ahda ahda3 = new ahda();
                                            i = agsk.E(array, n27, (ahdp)ahda3, ahbh);
                                            l.n(b5.d, (Object)ahda3);
                                            break;
                                        }
                                        case 5:
                                        case 15: {
                                            final ahee ahee2 = new ahee();
                                            i = agsk.F(array, n27, (ahdp)ahee2, ahbh);
                                            l.n(b5.d, (Object)ahee2);
                                            break;
                                        }
                                        case 4:
                                        case 12: {
                                            final ahda ahda4 = new ahda();
                                            i = agsk.J(array, n27, (ahdp)ahda4, ahbh);
                                            l.n(b5.d, (Object)ahda4);
                                            break;
                                        }
                                        case 2:
                                        case 3: {
                                            final ahee ahee3 = new ahee();
                                            i = agsk.K(array, n27, (ahdp)ahee3, ahbh);
                                            l.n(b5.d, (Object)ahee3);
                                            break;
                                        }
                                        case 1: {
                                            final ahcp ahcp = new ahcp(new float[10], 0);
                                            i = agsk.G(array, n27, (ahdp)ahcp, ahbh);
                                            l.n(b5.d, (Object)ahcp);
                                            break;
                                        }
                                        case 0: {
                                            final ahce ahce = new ahce(new double[10], 0);
                                            i = agsk.D(array, n27, (ahdp)ahce, ahbh);
                                            l.n(b5.d, (Object)ahce);
                                            break;
                                        }
                                    }
                                }
                                else {
                                    Object o2 = null;
                                    Label_2386: {
                                        if (b5.b() == ahgc.n) {
                                            i = agsk.O(array, n27, ahbh);
                                            if (b5.d.a.findValueByNumber(ahbh.a) == null) {
                                                ahfh.E((Object)ahcu, n9, ahbh.a, (Object)null);
                                                break Label_2123;
                                            }
                                            o2 = ahbh.a;
                                        }
                                        else {
                                            Label_2810: {
                                                switch (b5.b().ordinal()) {
                                                    default: {
                                                        o2 = null;
                                                        i = n27;
                                                        break Label_2386;
                                                    }
                                                    case 17: {
                                                        i = agsk.R(array, n27, ahbh);
                                                        o2 = ahby.L(ahbh.b);
                                                        break Label_2386;
                                                    }
                                                    case 16: {
                                                        i = agsk.O(array, n27, ahbh);
                                                        o2 = ahby.J(ahbh.a);
                                                        break Label_2386;
                                                    }
                                                    case 13: {
                                                        throw new IllegalStateException("Shouldn't reach here.");
                                                    }
                                                    case 11: {
                                                        i = agsk.x(array, n27, ahbh);
                                                        o2 = ahbh.c;
                                                        break Label_2386;
                                                    }
                                                    case 10: {
                                                        final ahfg a4 = ahey.a.a((Class)b5.c.getClass());
                                                        if (b5.e()) {
                                                            i = agsk.A(a4, array, n27, n, ahbh);
                                                            l.m(b5.d, ahbh.c);
                                                            break Label_2123;
                                                        }
                                                        Object o3;
                                                        if ((o3 = l.l(b5.d)) == null) {
                                                            o3 = a4.e();
                                                            l.n(b5.d, o3);
                                                        }
                                                        i = n;
                                                        i = agsk.T(o3, a4, array, n27, n, ahbh);
                                                        break Label_2891;
                                                    }
                                                    case 9: {
                                                        i = (n9 << 3 | 0x4);
                                                        final ahfg a5 = ahey.a.a((Class)b5.c.getClass());
                                                        if (b5.e()) {
                                                            final int z = agsk.z(a5, array, n27, n, i, ahbh);
                                                            l.m(b5.d, ahbh.c);
                                                            i = n;
                                                            i = z;
                                                            break Label_2891;
                                                        }
                                                        Object o4;
                                                        if ((o4 = l.l(b5.d)) == null) {
                                                            o4 = a5.e();
                                                            l.n(b5.d, o4);
                                                        }
                                                        final int s2 = agsk.S(o4, a5, array, n27, n, i, ahbh);
                                                        i = n;
                                                        i = s2;
                                                        break Label_2891;
                                                    }
                                                    case 8: {
                                                        i = agsk.L(array, n27, ahbh);
                                                        o2 = ahbh.c;
                                                        break Label_2386;
                                                    }
                                                    case 7: {
                                                        i = agsk.R(array, n27, ahbh);
                                                        if (ahbh.b == 0L) {
                                                            b4 = false;
                                                        }
                                                        o2 = b4;
                                                        break Label_2386;
                                                    }
                                                    case 6:
                                                    case 14: {
                                                        o2 = agsk.y(array, n27);
                                                        break;
                                                    }
                                                    case 5:
                                                    case 15: {
                                                        o2 = agsk.V(array, n27);
                                                        break Label_2810;
                                                    }
                                                    case 4:
                                                    case 12: {
                                                        i = agsk.O(array, n27, ahbh);
                                                        o2 = ahbh.a;
                                                        break Label_2386;
                                                    }
                                                    case 2:
                                                    case 3: {
                                                        i = agsk.R(array, n27, ahbh);
                                                        o2 = ahbh.b;
                                                        break Label_2386;
                                                    }
                                                    case 1: {
                                                        o2 = agsk.w(array, n27);
                                                        break;
                                                    }
                                                    case 0: {
                                                        o2 = agsk.v(array, n27);
                                                        break Label_2810;
                                                    }
                                                }
                                                i = n27 + 4;
                                                break Label_2386;
                                            }
                                            i = n27 + 8;
                                        }
                                    }
                                    if (b5.e()) {
                                        l.m(b5.d, o2);
                                    }
                                    else {
                                        l.n(b5.d, o2);
                                    }
                                }
                            }
                            break Label_2891;
                        }
                    }
                    final ahfs d4 = d(o);
                    i = n;
                    i = agsk.N(a, array, n27, n, d4, ahbh);
                }
                array2 = array;
                final int n37 = n;
                n5 = n9;
                n6 = n26;
                n3 = n37;
                n4 = n36;
            }
            n = n3;
            n2 = i;
            continue;
        }
    }
    
    public final Object e() {
        return ((ahcz)this.g).newMutableInstance();
    }
    
    public final void f(final Object o) {
        if (!Z(o)) {
            return;
        }
        if (o instanceof ahcz) {
            final ahcz ahcz = (ahcz)o;
            ahcz.clearMemoizedSerializedSize();
            ahcz.clearMemoizedHashCode();
            ahcz.markImmutable();
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
                        final Unsafe b2 = aheq.b;
                        final Object object = b2.getObject(o, d);
                        if (object != null) {
                            ((ahej)object).c();
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
                this.G(i).f(aheq.b.getObject(o, d));
            }
        }
        adzw.aX(o);
        if (this.h) {
            agsk.s(o);
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
                        ahfz.v(o, d, ahfz.i(o2, d));
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
                        ahfz.v(o, d, ahfz.i(o2, d));
                        this.R(o, s, i);
                        break;
                    }
                    break;
                }
                case 50: {
                    ahfh.C(o, o2, d);
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
                        ahfz.u(o, d, ahfz.f(o2, d));
                        this.Q(o, i);
                        break;
                    }
                    break;
                }
                case 15: {
                    if (this.W(o2, i)) {
                        ahfz.t(o, d, ahfz.d(o2, d));
                        this.Q(o, i);
                        break;
                    }
                    break;
                }
                case 14: {
                    if (this.W(o2, i)) {
                        ahfz.u(o, d, ahfz.f(o2, d));
                        this.Q(o, i);
                        break;
                    }
                    break;
                }
                case 13: {
                    if (this.W(o2, i)) {
                        ahfz.t(o, d, ahfz.d(o2, d));
                        this.Q(o, i);
                        break;
                    }
                    break;
                }
                case 12: {
                    if (this.W(o2, i)) {
                        ahfz.t(o, d, ahfz.d(o2, d));
                        this.Q(o, i);
                        break;
                    }
                    break;
                }
                case 11: {
                    if (this.W(o2, i)) {
                        ahfz.t(o, d, ahfz.d(o2, d));
                        this.Q(o, i);
                        break;
                    }
                    break;
                }
                case 10: {
                    if (this.W(o2, i)) {
                        ahfz.v(o, d, ahfz.i(o2, d));
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
                        ahfz.v(o, d, ahfz.i(o2, d));
                        this.Q(o, i);
                        break;
                    }
                    break;
                }
                case 7: {
                    if (this.W(o2, i)) {
                        ahfz.n(o, d, ahfz.x(o2, d));
                        this.Q(o, i);
                        break;
                    }
                    break;
                }
                case 6: {
                    if (this.W(o2, i)) {
                        ahfz.t(o, d, ahfz.d(o2, d));
                        this.Q(o, i);
                        break;
                    }
                    break;
                }
                case 5: {
                    if (this.W(o2, i)) {
                        ahfz.u(o, d, ahfz.f(o2, d));
                        this.Q(o, i);
                        break;
                    }
                    break;
                }
                case 4: {
                    if (this.W(o2, i)) {
                        ahfz.t(o, d, ahfz.d(o2, d));
                        this.Q(o, i);
                        break;
                    }
                    break;
                }
                case 3: {
                    if (this.W(o2, i)) {
                        ahfz.u(o, d, ahfz.f(o2, d));
                        this.Q(o, i);
                        break;
                    }
                    break;
                }
                case 2: {
                    if (this.W(o2, i)) {
                        ahfz.u(o, d, ahfz.f(o2, d));
                        this.Q(o, i);
                        break;
                    }
                    break;
                }
                case 1: {
                    if (this.W(o2, i)) {
                        ahfz.s(o, d, ahfz.c(o2, d));
                        this.Q(o, i);
                        break;
                    }
                    break;
                }
                case 0: {
                    if (this.W(o2, i)) {
                        ahfz.r(o, d, ahfz.b(o2, d));
                        this.Q(o, i);
                        break;
                    }
                    break;
                }
            }
        }
        ahfh.D(o, o2);
        if (this.h) {
            ahfh.B(o, o2);
        }
    }
    
    public final void h(final Object p0, final ahfb p1, final ExtensionRegistryLite p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //     4: pop            
        //     5: aload_1        
        //     6: invokestatic    aheq.M:(Ljava/lang/Object;)V
        //     9: aload_0        
        //    10: getfield        aheq.p:Ladzw;
        //    13: astore          17
        //    15: aconst_null    
        //    16: astore          15
        //    18: aconst_null    
        //    19: astore          11
        //    21: aload           11
        //    23: astore          12
        //    25: aload           12
        //    27: astore          13
        //    29: aload_2        
        //    30: invokeinterface ahfb.c:()I
        //    35: istore          5
        //    37: aload           12
        //    39: astore          13
        //    41: aload_0        
        //    42: iload           5
        //    44: invokespecial   aheq.x:(I)I
        //    47: istore          4
        //    49: iload           4
        //    51: ifge            294
        //    54: iload           5
        //    56: ldc_w           2147483647
        //    59: if_icmpne       114
        //    62: aload_0        
        //    63: getfield        aheq.m:I
        //    66: istore          4
        //    68: aload           12
        //    70: astore_2       
        //    71: iload           4
        //    73: aload_0        
        //    74: getfield        aheq.n:I
        //    77: if_icmpge       101
        //    80: aload_0        
        //    81: aload_1        
        //    82: aload_0        
        //    83: getfield        aheq.l:[I
        //    86: iload           4
        //    88: iaload         
        //    89: aload_2        
        //    90: aload_1        
        //    91: invokespecial   aheq.af:(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    94: astore_2       
        //    95: iinc            4, 1
        //    98: goto            71
        //   101: aload_2        
        //   102: ifnull          4737
        //   105: aload_1        
        //   106: aload_2        
        //   107: checkcast       Lahfs;
        //   110: invokestatic    adzw.aV:(Ljava/lang/Object;Lahfs;)V
        //   113: return         
        //   114: aload           12
        //   116: astore          13
        //   118: aload_0        
        //   119: getfield        aheq.h:Z
        //   122: ifne            131
        //   125: aconst_null    
        //   126: astore          14
        //   128: goto            147
        //   131: aload           12
        //   133: astore          13
        //   135: aload_3        
        //   136: aload_0        
        //   137: getfield        aheq.g:Lcom/google/protobuf/MessageLite;
        //   140: iload           5
        //   142: invokevirtual   com/google/protobuf/ExtensionRegistryLite.b:(Lcom/google/protobuf/MessageLite;I)Lahcx;
        //   145: astore          14
        //   147: aload           14
        //   149: ifnull          202
        //   152: aload           15
        //   154: astore          11
        //   156: aload           15
        //   158: ifnonnull       171
        //   161: aload           12
        //   163: astore          13
        //   165: aload_1        
        //   166: invokestatic    agsk.q:(Ljava/lang/Object;)Lahcm;
        //   169: astore          11
        //   171: aload           12
        //   173: astore          13
        //   175: aload_1        
        //   176: aload_2        
        //   177: aload           14
        //   179: aload_3        
        //   180: aload           11
        //   182: aload           12
        //   184: aload           17
        //   186: invokestatic    agsk.aj:(Ljava/lang/Object;Lahfb;Ljava/lang/Object;Lcom/google/protobuf/ExtensionRegistryLite;Lahcm;Ljava/lang/Object;Ladzw;)Ljava/lang/Object;
        //   189: astore          12
        //   191: aload           11
        //   193: astore          15
        //   195: aload           12
        //   197: astore          11
        //   199: goto            21
        //   202: aload           12
        //   204: astore          14
        //   206: aload           12
        //   208: ifnonnull       221
        //   211: aload           12
        //   213: astore          13
        //   215: aload_1        
        //   216: invokestatic    adzw.aW:(Ljava/lang/Object;)Ljava/lang/Object;
        //   219: astore          14
        //   221: aload           14
        //   223: astore          13
        //   225: aload           17
        //   227: aload           14
        //   229: aload_2        
        //   230: invokevirtual   adzw.aR:(Ljava/lang/Object;Lahfb;)Z
        //   233: istore          10
        //   235: aload           14
        //   237: astore          11
        //   239: iload           10
        //   241: ifne            21
        //   244: aload_0        
        //   245: getfield        aheq.m:I
        //   248: istore          4
        //   250: aload           14
        //   252: astore_2       
        //   253: iload           4
        //   255: aload_0        
        //   256: getfield        aheq.n:I
        //   259: if_icmpge       283
        //   262: aload_0        
        //   263: aload_1        
        //   264: aload_0        
        //   265: getfield        aheq.l:[I
        //   268: iload           4
        //   270: iaload         
        //   271: aload_2        
        //   272: aload_1        
        //   273: invokespecial   aheq.af:(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   276: astore_2       
        //   277: iinc            4, 1
        //   280: goto            253
        //   283: aload_2        
        //   284: ifnull          4737
        //   287: goto            105
        //   290: astore_2       
        //   291: goto            4738
        //   294: aload           12
        //   296: astore          13
        //   298: aload_0        
        //   299: iload           4
        //   301: invokespecial   aheq.C:(I)I
        //   304: istore          6
        //   306: aload           12
        //   308: astore          13
        //   310: iload           6
        //   312: invokestatic    aheq.B:(I)I
        //   315: istore          7
        //   317: iload           7
        //   319: tableswitch {
        //                0: 4523
        //                1: 4478
        //                2: 4433
        //                3: 4388
        //                4: 4343
        //                5: 4298
        //                6: 4253
        //                7: 4208
        //                8: 4170
        //                9: 4103
        //               10: 4058
        //               11: 4013
        //               12: 3889
        //               13: 3844
        //               14: 3799
        //               15: 3754
        //               16: 3709
        //               17: 3642
        //               18: 3608
        //               19: 3574
        //               20: 3540
        //               21: 3506
        //               22: 3472
        //               23: 3438
        //               24: 3404
        //               25: 3370
        //               26: 3258
        //               27: 3037
        //               28: 2868
        //               29: 2834
        //               30: 2764
        //               31: 2730
        //               32: 2696
        //               33: 2662
        //               34: 2628
        //               35: 2594
        //               36: 2560
        //               37: 2526
        //               38: 2492
        //               39: 2458
        //               40: 2424
        //               41: 2390
        //               42: 2356
        //               43: 2322
        //               44: 2252
        //               45: 2218
        //               46: 2184
        //               47: 2150
        //               48: 2116
        //               49: 1895
        //               50: 1415
        //               51: 1368
        //               52: 1330
        //               53: 1292
        //               54: 1254
        //               55: 1216
        //               56: 1178
        //               57: 1140
        //               58: 1102
        //               59: 1070
        //               60: 1015
        //               61: 980
        //               62: 942
        //               63: 841
        //               64: 803
        //               65: 765
        //               66: 727
        //               67: 689
        //               68: 634
        //          default: 608
        //        }
        //   608: aload           12
        //   610: astore          14
        //   612: aload           12
        //   614: ifnonnull       4568
        //   617: aload           12
        //   619: astore          13
        //   621: aload           12
        //   623: astore          16
        //   625: aload_1        
        //   626: invokestatic    adzw.aW:(Ljava/lang/Object;)Ljava/lang/Object;
        //   629: astore          14
        //   631: goto            4568
        //   634: aload           12
        //   636: astore          13
        //   638: aload_0        
        //   639: aload_1        
        //   640: iload           5
        //   642: iload           4
        //   644: invokespecial   aheq.J:(Ljava/lang/Object;II)Ljava/lang/Object;
        //   647: checkcast       Lcom/google/protobuf/MessageLite;
        //   650: astore          11
        //   652: aload           12
        //   654: astore          13
        //   656: aload_2        
        //   657: aload           11
        //   659: aload_0        
        //   660: iload           4
        //   662: invokespecial   aheq.G:(I)Lahfg;
        //   665: aload_3        
        //   666: invokeinterface ahfb.w:(Ljava/lang/Object;Lahfg;Lcom/google/protobuf/ExtensionRegistryLite;)V
        //   671: aload           12
        //   673: astore          13
        //   675: aload_0        
        //   676: aload_1        
        //   677: iload           5
        //   679: iload           4
        //   681: aload           11
        //   683: invokespecial   aheq.T:(Ljava/lang/Object;IILjava/lang/Object;)V
        //   686: goto            1095
        //   689: aload           12
        //   691: astore          13
        //   693: aload_1        
        //   694: iload           6
        //   696: invokestatic    aheq.D:(I)J
        //   699: aload_2        
        //   700: invokeinterface ahfb.m:()J
        //   705: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   708: invokestatic    ahfz.v:(Ljava/lang/Object;JLjava/lang/Object;)V
        //   711: aload           12
        //   713: astore          13
        //   715: aload_0        
        //   716: aload_1        
        //   717: iload           5
        //   719: iload           4
        //   721: invokespecial   aheq.R:(Ljava/lang/Object;II)V
        //   724: goto            1095
        //   727: aload           12
        //   729: astore          13
        //   731: aload_1        
        //   732: iload           6
        //   734: invokestatic    aheq.D:(I)J
        //   737: aload_2        
        //   738: invokeinterface ahfb.h:()I
        //   743: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   746: invokestatic    ahfz.v:(Ljava/lang/Object;JLjava/lang/Object;)V
        //   749: aload           12
        //   751: astore          13
        //   753: aload_0        
        //   754: aload_1        
        //   755: iload           5
        //   757: iload           4
        //   759: invokespecial   aheq.R:(Ljava/lang/Object;II)V
        //   762: goto            1095
        //   765: aload           12
        //   767: astore          13
        //   769: aload_1        
        //   770: iload           6
        //   772: invokestatic    aheq.D:(I)J
        //   775: aload_2        
        //   776: invokeinterface ahfb.l:()J
        //   781: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   784: invokestatic    ahfz.v:(Ljava/lang/Object;JLjava/lang/Object;)V
        //   787: aload           12
        //   789: astore          13
        //   791: aload_0        
        //   792: aload_1        
        //   793: iload           5
        //   795: iload           4
        //   797: invokespecial   aheq.R:(Ljava/lang/Object;II)V
        //   800: goto            1095
        //   803: aload           12
        //   805: astore          13
        //   807: aload_1        
        //   808: iload           6
        //   810: invokestatic    aheq.D:(I)J
        //   813: aload_2        
        //   814: invokeinterface ahfb.g:()I
        //   819: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   822: invokestatic    ahfz.v:(Ljava/lang/Object;JLjava/lang/Object;)V
        //   825: aload           12
        //   827: astore          13
        //   829: aload_0        
        //   830: aload_1        
        //   831: iload           5
        //   833: iload           4
        //   835: invokespecial   aheq.R:(Ljava/lang/Object;II)V
        //   838: goto            1095
        //   841: aload           12
        //   843: astore          13
        //   845: aload_2        
        //   846: invokeinterface ahfb.d:()I
        //   851: istore          7
        //   853: aload           12
        //   855: astore          13
        //   857: aload_0        
        //   858: iload           4
        //   860: invokespecial   aheq.F:(I)Lahdf;
        //   863: astore          11
        //   865: aload           11
        //   867: ifnull          908
        //   870: aload           12
        //   872: astore          13
        //   874: aload           11
        //   876: iload           7
        //   878: invokeinterface ahdf.isInRange:(I)Z
        //   883: ifeq            889
        //   886: goto            908
        //   889: aload           12
        //   891: astore          13
        //   893: aload_1        
        //   894: iload           5
        //   896: iload           7
        //   898: aload           12
        //   900: invokestatic    ahfh.E:(Ljava/lang/Object;IILjava/lang/Object;)Ljava/lang/Object;
        //   903: astore          11
        //   905: goto            21
        //   908: aload           12
        //   910: astore          13
        //   912: aload_1        
        //   913: iload           6
        //   915: invokestatic    aheq.D:(I)J
        //   918: iload           7
        //   920: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   923: invokestatic    ahfz.v:(Ljava/lang/Object;JLjava/lang/Object;)V
        //   926: aload           12
        //   928: astore          13
        //   930: aload_0        
        //   931: aload_1        
        //   932: iload           5
        //   934: iload           4
        //   936: invokespecial   aheq.R:(Ljava/lang/Object;II)V
        //   939: goto            1095
        //   942: aload           12
        //   944: astore          13
        //   946: aload_1        
        //   947: iload           6
        //   949: invokestatic    aheq.D:(I)J
        //   952: aload_2        
        //   953: invokeinterface ahfb.i:()I
        //   958: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   961: invokestatic    ahfz.v:(Ljava/lang/Object;JLjava/lang/Object;)V
        //   964: aload           12
        //   966: astore          13
        //   968: aload_0        
        //   969: aload_1        
        //   970: iload           5
        //   972: iload           4
        //   974: invokespecial   aheq.R:(Ljava/lang/Object;II)V
        //   977: goto            1095
        //   980: aload           12
        //   982: astore          13
        //   984: aload_1        
        //   985: iload           6
        //   987: invokestatic    aheq.D:(I)J
        //   990: aload_2        
        //   991: invokeinterface ahfb.o:()Lahbt;
        //   996: invokestatic    ahfz.v:(Ljava/lang/Object;JLjava/lang/Object;)V
        //   999: aload           12
        //  1001: astore          13
        //  1003: aload_0        
        //  1004: aload_1        
        //  1005: iload           5
        //  1007: iload           4
        //  1009: invokespecial   aheq.R:(Ljava/lang/Object;II)V
        //  1012: goto            1095
        //  1015: aload           12
        //  1017: astore          13
        //  1019: aload_0        
        //  1020: aload_1        
        //  1021: iload           5
        //  1023: iload           4
        //  1025: invokespecial   aheq.J:(Ljava/lang/Object;II)Ljava/lang/Object;
        //  1028: checkcast       Lcom/google/protobuf/MessageLite;
        //  1031: astore          11
        //  1033: aload           12
        //  1035: astore          13
        //  1037: aload_2        
        //  1038: aload           11
        //  1040: aload_0        
        //  1041: iload           4
        //  1043: invokespecial   aheq.G:(I)Lahfg;
        //  1046: aload_3        
        //  1047: invokeinterface ahfb.x:(Ljava/lang/Object;Lahfg;Lcom/google/protobuf/ExtensionRegistryLite;)V
        //  1052: aload           12
        //  1054: astore          13
        //  1056: aload_0        
        //  1057: aload_1        
        //  1058: iload           5
        //  1060: iload           4
        //  1062: aload           11
        //  1064: invokespecial   aheq.T:(Ljava/lang/Object;IILjava/lang/Object;)V
        //  1067: goto            1095
        //  1070: aload           12
        //  1072: astore          13
        //  1074: aload_0        
        //  1075: aload_1        
        //  1076: iload           6
        //  1078: aload_2        
        //  1079: invokespecial   aheq.P:(Ljava/lang/Object;ILahfb;)V
        //  1082: aload           12
        //  1084: astore          13
        //  1086: aload_0        
        //  1087: aload_1        
        //  1088: iload           5
        //  1090: iload           4
        //  1092: invokespecial   aheq.R:(Ljava/lang/Object;II)V
        //  1095: aload           12
        //  1097: astore          11
        //  1099: goto            21
        //  1102: aload           12
        //  1104: astore          13
        //  1106: aload_1        
        //  1107: iload           6
        //  1109: invokestatic    aheq.D:(I)J
        //  1112: aload_2        
        //  1113: invokeinterface ahfb.O:()Z
        //  1118: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  1121: invokestatic    ahfz.v:(Ljava/lang/Object;JLjava/lang/Object;)V
        //  1124: aload           12
        //  1126: astore          13
        //  1128: aload_0        
        //  1129: aload_1        
        //  1130: iload           5
        //  1132: iload           4
        //  1134: invokespecial   aheq.R:(Ljava/lang/Object;II)V
        //  1137: goto            1095
        //  1140: aload           12
        //  1142: astore          13
        //  1144: aload_1        
        //  1145: iload           6
        //  1147: invokestatic    aheq.D:(I)J
        //  1150: aload_2        
        //  1151: invokeinterface ahfb.e:()I
        //  1156: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1159: invokestatic    ahfz.v:(Ljava/lang/Object;JLjava/lang/Object;)V
        //  1162: aload           12
        //  1164: astore          13
        //  1166: aload_0        
        //  1167: aload_1        
        //  1168: iload           5
        //  1170: iload           4
        //  1172: invokespecial   aheq.R:(Ljava/lang/Object;II)V
        //  1175: goto            1095
        //  1178: aload           12
        //  1180: astore          13
        //  1182: aload_1        
        //  1183: iload           6
        //  1185: invokestatic    aheq.D:(I)J
        //  1188: aload_2        
        //  1189: invokeinterface ahfb.j:()J
        //  1194: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1197: invokestatic    ahfz.v:(Ljava/lang/Object;JLjava/lang/Object;)V
        //  1200: aload           12
        //  1202: astore          13
        //  1204: aload_0        
        //  1205: aload_1        
        //  1206: iload           5
        //  1208: iload           4
        //  1210: invokespecial   aheq.R:(Ljava/lang/Object;II)V
        //  1213: goto            1095
        //  1216: aload           12
        //  1218: astore          13
        //  1220: aload_1        
        //  1221: iload           6
        //  1223: invokestatic    aheq.D:(I)J
        //  1226: aload_2        
        //  1227: invokeinterface ahfb.f:()I
        //  1232: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1235: invokestatic    ahfz.v:(Ljava/lang/Object;JLjava/lang/Object;)V
        //  1238: aload           12
        //  1240: astore          13
        //  1242: aload_0        
        //  1243: aload_1        
        //  1244: iload           5
        //  1246: iload           4
        //  1248: invokespecial   aheq.R:(Ljava/lang/Object;II)V
        //  1251: goto            1095
        //  1254: aload           12
        //  1256: astore          13
        //  1258: aload_1        
        //  1259: iload           6
        //  1261: invokestatic    aheq.D:(I)J
        //  1264: aload_2        
        //  1265: invokeinterface ahfb.n:()J
        //  1270: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1273: invokestatic    ahfz.v:(Ljava/lang/Object;JLjava/lang/Object;)V
        //  1276: aload           12
        //  1278: astore          13
        //  1280: aload_0        
        //  1281: aload_1        
        //  1282: iload           5
        //  1284: iload           4
        //  1286: invokespecial   aheq.R:(Ljava/lang/Object;II)V
        //  1289: goto            1095
        //  1292: aload           12
        //  1294: astore          13
        //  1296: aload_1        
        //  1297: iload           6
        //  1299: invokestatic    aheq.D:(I)J
        //  1302: aload_2        
        //  1303: invokeinterface ahfb.k:()J
        //  1308: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1311: invokestatic    ahfz.v:(Ljava/lang/Object;JLjava/lang/Object;)V
        //  1314: aload           12
        //  1316: astore          13
        //  1318: aload_0        
        //  1319: aload_1        
        //  1320: iload           5
        //  1322: iload           4
        //  1324: invokespecial   aheq.R:(Ljava/lang/Object;II)V
        //  1327: goto            1095
        //  1330: aload           12
        //  1332: astore          13
        //  1334: aload_1        
        //  1335: iload           6
        //  1337: invokestatic    aheq.D:(I)J
        //  1340: aload_2        
        //  1341: invokeinterface ahfb.b:()F
        //  1346: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //  1349: invokestatic    ahfz.v:(Ljava/lang/Object;JLjava/lang/Object;)V
        //  1352: aload           12
        //  1354: astore          13
        //  1356: aload_0        
        //  1357: aload_1        
        //  1358: iload           5
        //  1360: iload           4
        //  1362: invokespecial   aheq.R:(Ljava/lang/Object;II)V
        //  1365: goto            1095
        //  1368: aload           12
        //  1370: astore          13
        //  1372: aload_1        
        //  1373: iload           6
        //  1375: invokestatic    aheq.D:(I)J
        //  1378: aload_2        
        //  1379: invokeinterface ahfb.a:()D
        //  1384: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //  1387: invokestatic    ahfz.v:(Ljava/lang/Object;JLjava/lang/Object;)V
        //  1390: aload           12
        //  1392: astore          13
        //  1394: aload_0        
        //  1395: aload_1        
        //  1396: iload           5
        //  1398: iload           4
        //  1400: invokespecial   aheq.R:(Ljava/lang/Object;II)V
        //  1403: goto            1095
        //  1406: astore          11
        //  1408: aload           12
        //  1410: astore          13
        //  1412: goto            4653
        //  1415: aload           12
        //  1417: astore          13
        //  1419: aload_0        
        //  1420: iload           4
        //  1422: invokespecial   aheq.H:(I)Ljava/lang/Object;
        //  1425: astore          18
        //  1427: aload           12
        //  1429: astore          13
        //  1431: aload_0        
        //  1432: iload           4
        //  1434: invokespecial   aheq.C:(I)I
        //  1437: invokestatic    aheq.D:(I)J
        //  1440: lstore          8
        //  1442: aload           12
        //  1444: astore          13
        //  1446: aload_1        
        //  1447: lload           8
        //  1449: invokestatic    ahfz.i:(Ljava/lang/Object;J)Ljava/lang/Object;
        //  1452: astore          14
        //  1454: aload           14
        //  1456: ifnonnull       1483
        //  1459: aload           12
        //  1461: astore          13
        //  1463: invokestatic    agsk.n:()Ljava/lang/Object;
        //  1466: astore          11
        //  1468: aload           12
        //  1470: astore          13
        //  1472: aload_1        
        //  1473: lload           8
        //  1475: aload           11
        //  1477: invokestatic    ahfz.v:(Ljava/lang/Object;JLjava/lang/Object;)V
        //  1480: goto            1536
        //  1483: aload           12
        //  1485: astore          13
        //  1487: aload           14
        //  1489: invokestatic    agsk.l:(Ljava/lang/Object;)Z
        //  1492: istore          10
        //  1494: aload           14
        //  1496: astore          11
        //  1498: iload           10
        //  1500: ifeq            1536
        //  1503: aload           12
        //  1505: astore          13
        //  1507: invokestatic    agsk.n:()Ljava/lang/Object;
        //  1510: astore          11
        //  1512: aload           12
        //  1514: astore          13
        //  1516: aload           11
        //  1518: aload           14
        //  1520: invokestatic    agsk.m:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1523: pop            
        //  1524: aload           12
        //  1526: astore          13
        //  1528: aload_1        
        //  1529: lload           8
        //  1531: aload           11
        //  1533: invokestatic    ahfz.v:(Ljava/lang/Object;JLjava/lang/Object;)V
        //  1536: aload           12
        //  1538: astore          13
        //  1540: aload           11
        //  1542: checkcast       Lahej;
        //  1545: astore          16
        //  1547: aload           12
        //  1549: astore          13
        //  1551: aload           18
        //  1553: invokestatic    agsk.j:(Ljava/lang/Object;)Lahei;
        //  1556: astore          18
        //  1558: aload           12
        //  1560: astore          13
        //  1562: aload_2        
        //  1563: checkcast       Lahbz;
        //  1566: iconst_2       
        //  1567: invokevirtual   ahbz.N:(I)V
        //  1570: aload           12
        //  1572: astore          13
        //  1574: aload_2        
        //  1575: checkcast       Lahbz;
        //  1578: getfield        ahbz.a:Lahby;
        //  1581: invokevirtual   ahby.o:()I
        //  1584: istore          4
        //  1586: aload           12
        //  1588: astore          13
        //  1590: aload_2        
        //  1591: checkcast       Lahbz;
        //  1594: getfield        ahbz.a:Lahby;
        //  1597: iload           4
        //  1599: invokevirtual   ahby.f:(I)I
        //  1602: istore          5
        //  1604: aload           12
        //  1606: astore          13
        //  1608: aload           18
        //  1610: getfield        ahei.a:Ljava/lang/Object;
        //  1613: astore          14
        //  1615: aload           12
        //  1617: astore          13
        //  1619: aload           18
        //  1621: getfield        ahei.b:Ljava/lang/Object;
        //  1624: astore          11
        //  1626: aload           14
        //  1628: astore          13
        //  1630: aload_2        
        //  1631: checkcast       Lahbz;
        //  1634: invokevirtual   ahbz.c:()I
        //  1637: istore          4
        //  1639: iload           4
        //  1641: ldc_w           2147483647
        //  1644: if_icmpeq       1818
        //  1647: aload_2        
        //  1648: checkcast       Lahbz;
        //  1651: getfield        ahbz.a:Lahby;
        //  1654: invokevirtual   ahby.E:()Z
        //  1657: istore          10
        //  1659: iload           10
        //  1661: ifeq            1667
        //  1664: goto            1818
        //  1667: iload           4
        //  1669: iconst_1       
        //  1670: if_icmpeq       1753
        //  1673: iload           4
        //  1675: iconst_2       
        //  1676: if_icmpeq       1708
        //  1679: aload_2        
        //  1680: checkcast       Lahbz;
        //  1683: invokevirtual   ahbz.P:()Z
        //  1686: ifeq            1692
        //  1689: goto            1799
        //  1692: new             Lahds;
        //  1695: astore          14
        //  1697: aload           14
        //  1699: ldc_w           "Unable to parse map entry."
        //  1702: invokespecial   ahds.<init>:(Ljava/lang/String;)V
        //  1705: aload           14
        //  1707: athrow         
        //  1708: aload           18
        //  1710: getfield        ahei.d:Ljava/lang/Object;
        //  1713: astore          19
        //  1715: aload           18
        //  1717: getfield        ahei.b:Ljava/lang/Object;
        //  1720: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1723: astore          14
        //  1725: aload           19
        //  1727: checkcast       Lahgc;
        //  1730: astore          19
        //  1732: aload_2        
        //  1733: checkcast       Lahbz;
        //  1736: aload           19
        //  1738: aload           14
        //  1740: aload_3        
        //  1741: invokevirtual   ahbz.q:(Lahgc;Ljava/lang/Class;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;
        //  1744: astore          14
        //  1746: aload           14
        //  1748: astore          11
        //  1750: goto            1799
        //  1753: aload           18
        //  1755: getfield        ahei.c:Ljava/lang/Object;
        //  1758: checkcast       Lahgc;
        //  1761: astore          14
        //  1763: aload_2        
        //  1764: checkcast       Lahbz;
        //  1767: astore          19
        //  1769: aload           19
        //  1771: aload           14
        //  1773: aconst_null    
        //  1774: aconst_null    
        //  1775: invokevirtual   ahbz.q:(Lahgc;Ljava/lang/Class;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;
        //  1778: astore          14
        //  1780: aload           14
        //  1782: astore          13
        //  1784: goto            1799
        //  1787: astore          14
        //  1789: aload_2        
        //  1790: checkcast       Lahbz;
        //  1793: invokevirtual   ahbz.P:()Z
        //  1796: ifeq            1802
        //  1799: goto            1630
        //  1802: new             Lahds;
        //  1805: astore          11
        //  1807: aload           11
        //  1809: ldc_w           "Unable to parse map entry."
        //  1812: invokespecial   ahds.<init>:(Ljava/lang/String;)V
        //  1815: aload           11
        //  1817: athrow         
        //  1818: aload           16
        //  1820: aload           13
        //  1822: aload           11
        //  1824: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1829: pop            
        //  1830: aload           12
        //  1832: astore          13
        //  1834: aload           12
        //  1836: astore          16
        //  1838: aload_2        
        //  1839: checkcast       Lahbz;
        //  1842: getfield        ahbz.a:Lahby;
        //  1845: iload           5
        //  1847: invokevirtual   ahby.C:(I)V
        //  1850: aload           12
        //  1852: astore          11
        //  1854: goto            21
        //  1857: astore          11
        //  1859: goto            1864
        //  1862: astore          11
        //  1864: aload           12
        //  1866: astore          13
        //  1868: aload           12
        //  1870: astore          16
        //  1872: aload_2        
        //  1873: checkcast       Lahbz;
        //  1876: getfield        ahbz.a:Lahby;
        //  1879: iload           5
        //  1881: invokevirtual   ahby.C:(I)V
        //  1884: aload           12
        //  1886: astore          13
        //  1888: aload           12
        //  1890: astore          16
        //  1892: aload           11
        //  1894: athrow         
        //  1895: aload           12
        //  1897: astore          13
        //  1899: aload           12
        //  1901: astore          16
        //  1903: iload           6
        //  1905: invokestatic    aheq.D:(I)J
        //  1908: lstore          8
        //  1910: aload           12
        //  1912: astore          13
        //  1914: aload           12
        //  1916: astore          16
        //  1918: aload_0        
        //  1919: iload           4
        //  1921: invokespecial   aheq.G:(I)Lahfg;
        //  1924: astore          18
        //  1926: aload           12
        //  1928: astore          13
        //  1930: aload           12
        //  1932: astore          16
        //  1934: aload_0        
        //  1935: getfield        aheq.o:Lahed;
        //  1938: aload_1        
        //  1939: lload           8
        //  1941: invokevirtual   ahed.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  1944: astore          14
        //  1946: aload           12
        //  1948: astore          13
        //  1950: aload           12
        //  1952: astore          16
        //  1954: aload_2        
        //  1955: checkcast       Lahbz;
        //  1958: getfield        ahbz.b:I
        //  1961: istore          4
        //  1963: aload           12
        //  1965: astore          13
        //  1967: aload           12
        //  1969: astore          16
        //  1971: iload           4
        //  1973: invokestatic    ahge.b:(I)I
        //  1976: iconst_3       
        //  1977: if_icmpne       2104
        //  1980: aload           12
        //  1982: astore          13
        //  1984: aload           12
        //  1986: astore          16
        //  1988: aload           14
        //  1990: aload_2        
        //  1991: checkcast       Lahbz;
        //  1994: aload           18
        //  1996: aload_3        
        //  1997: invokevirtual   ahbz.r:(Lahfg;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;
        //  2000: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //  2005: pop            
        //  2006: aload           12
        //  2008: astore          11
        //  2010: aload           12
        //  2012: astore          13
        //  2014: aload           12
        //  2016: astore          16
        //  2018: aload_2        
        //  2019: checkcast       Lahbz;
        //  2022: getfield        ahbz.a:Lahby;
        //  2025: invokevirtual   ahby.E:()Z
        //  2028: ifne            21
        //  2031: aload           12
        //  2033: astore          11
        //  2035: aload           12
        //  2037: astore          13
        //  2039: aload           12
        //  2041: astore          16
        //  2043: aload_2        
        //  2044: checkcast       Lahbz;
        //  2047: getfield        ahbz.c:I
        //  2050: ifne            21
        //  2053: aload           12
        //  2055: astore          13
        //  2057: aload           12
        //  2059: astore          16
        //  2061: aload_2        
        //  2062: checkcast       Lahbz;
        //  2065: getfield        ahbz.a:Lahby;
        //  2068: invokevirtual   ahby.n:()I
        //  2071: istore          5
        //  2073: iload           5
        //  2075: iload           4
        //  2077: if_icmpeq       1980
        //  2080: aload           12
        //  2082: astore          13
        //  2084: aload           12
        //  2086: astore          16
        //  2088: aload_2        
        //  2089: checkcast       Lahbz;
        //  2092: iload           5
        //  2094: putfield        ahbz.c:I
        //  2097: aload           12
        //  2099: astore          11
        //  2101: goto            21
        //  2104: aload           12
        //  2106: astore          13
        //  2108: aload           12
        //  2110: astore          16
        //  2112: invokestatic    ahds.a:()Lahdr;
        //  2115: athrow         
        //  2116: aload           12
        //  2118: astore          13
        //  2120: aload           12
        //  2122: astore          16
        //  2124: aload_2        
        //  2125: aload_0        
        //  2126: getfield        aheq.o:Lahed;
        //  2129: aload_1        
        //  2130: iload           6
        //  2132: invokestatic    aheq.D:(I)J
        //  2135: invokevirtual   ahed.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  2138: invokeinterface ahfb.J:(Ljava/util/List;)V
        //  2143: aload           12
        //  2145: astore          11
        //  2147: goto            21
        //  2150: aload           12
        //  2152: astore          13
        //  2154: aload           12
        //  2156: astore          16
        //  2158: aload_2        
        //  2159: aload_0        
        //  2160: getfield        aheq.o:Lahed;
        //  2163: aload_1        
        //  2164: iload           6
        //  2166: invokestatic    aheq.D:(I)J
        //  2169: invokevirtual   ahed.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  2172: invokeinterface ahfb.I:(Ljava/util/List;)V
        //  2177: aload           12
        //  2179: astore          11
        //  2181: goto            21
        //  2184: aload           12
        //  2186: astore          13
        //  2188: aload           12
        //  2190: astore          16
        //  2192: aload_2        
        //  2193: aload_0        
        //  2194: getfield        aheq.o:Lahed;
        //  2197: aload_1        
        //  2198: iload           6
        //  2200: invokestatic    aheq.D:(I)J
        //  2203: invokevirtual   ahed.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  2206: invokeinterface ahfb.H:(Ljava/util/List;)V
        //  2211: aload           12
        //  2213: astore          11
        //  2215: goto            21
        //  2218: aload           12
        //  2220: astore          13
        //  2222: aload           12
        //  2224: astore          16
        //  2226: aload_2        
        //  2227: aload_0        
        //  2228: getfield        aheq.o:Lahed;
        //  2231: aload_1        
        //  2232: iload           6
        //  2234: invokestatic    aheq.D:(I)J
        //  2237: invokevirtual   ahed.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  2240: invokeinterface ahfb.G:(Ljava/util/List;)V
        //  2245: aload           12
        //  2247: astore          11
        //  2249: goto            21
        //  2252: aload           12
        //  2254: astore          13
        //  2256: aload           12
        //  2258: astore          16
        //  2260: aload_0        
        //  2261: getfield        aheq.o:Lahed;
        //  2264: aload_1        
        //  2265: iload           6
        //  2267: invokestatic    aheq.D:(I)J
        //  2270: invokevirtual   ahed.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  2273: astore          11
        //  2275: aload           12
        //  2277: astore          13
        //  2279: aload           12
        //  2281: astore          16
        //  2283: aload_2        
        //  2284: aload           11
        //  2286: invokeinterface ahfb.A:(Ljava/util/List;)V
        //  2291: aload           12
        //  2293: astore          13
        //  2295: aload           12
        //  2297: astore          16
        //  2299: aload_1        
        //  2300: iload           5
        //  2302: aload           11
        //  2304: aload_0        
        //  2305: iload           4
        //  2307: invokespecial   aheq.F:(I)Lahdf;
        //  2310: aload           12
        //  2312: aload           17
        //  2314: invokestatic    ahfh.Y:(Ljava/lang/Object;ILjava/util/List;Lahdf;Ljava/lang/Object;Ladzw;)Ljava/lang/Object;
        //  2317: astore          11
        //  2319: goto            21
        //  2322: aload           12
        //  2324: astore          13
        //  2326: aload           12
        //  2328: astore          16
        //  2330: aload_2        
        //  2331: aload_0        
        //  2332: getfield        aheq.o:Lahed;
        //  2335: aload_1        
        //  2336: iload           6
        //  2338: invokestatic    aheq.D:(I)J
        //  2341: invokevirtual   ahed.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  2344: invokeinterface ahfb.L:(Ljava/util/List;)V
        //  2349: aload           12
        //  2351: astore          11
        //  2353: goto            21
        //  2356: aload           12
        //  2358: astore          13
        //  2360: aload           12
        //  2362: astore          16
        //  2364: aload_2        
        //  2365: aload_0        
        //  2366: getfield        aheq.o:Lahed;
        //  2369: aload_1        
        //  2370: iload           6
        //  2372: invokestatic    aheq.D:(I)J
        //  2375: invokevirtual   ahed.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  2378: invokeinterface ahfb.y:(Ljava/util/List;)V
        //  2383: aload           12
        //  2385: astore          11
        //  2387: goto            21
        //  2390: aload           12
        //  2392: astore          13
        //  2394: aload           12
        //  2396: astore          16
        //  2398: aload_2        
        //  2399: aload_0        
        //  2400: getfield        aheq.o:Lahed;
        //  2403: aload_1        
        //  2404: iload           6
        //  2406: invokestatic    aheq.D:(I)J
        //  2409: invokevirtual   ahed.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  2412: invokeinterface ahfb.B:(Ljava/util/List;)V
        //  2417: aload           12
        //  2419: astore          11
        //  2421: goto            21
        //  2424: aload           12
        //  2426: astore          13
        //  2428: aload           12
        //  2430: astore          16
        //  2432: aload_2        
        //  2433: aload_0        
        //  2434: getfield        aheq.o:Lahed;
        //  2437: aload_1        
        //  2438: iload           6
        //  2440: invokestatic    aheq.D:(I)J
        //  2443: invokevirtual   ahed.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  2446: invokeinterface ahfb.C:(Ljava/util/List;)V
        //  2451: aload           12
        //  2453: astore          11
        //  2455: goto            21
        //  2458: aload           12
        //  2460: astore          13
        //  2462: aload           12
        //  2464: astore          16
        //  2466: aload_2        
        //  2467: aload_0        
        //  2468: getfield        aheq.o:Lahed;
        //  2471: aload_1        
        //  2472: iload           6
        //  2474: invokestatic    aheq.D:(I)J
        //  2477: invokevirtual   ahed.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  2480: invokeinterface ahfb.E:(Ljava/util/List;)V
        //  2485: aload           12
        //  2487: astore          11
        //  2489: goto            21
        //  2492: aload           12
        //  2494: astore          13
        //  2496: aload           12
        //  2498: astore          16
        //  2500: aload_2        
        //  2501: aload_0        
        //  2502: getfield        aheq.o:Lahed;
        //  2505: aload_1        
        //  2506: iload           6
        //  2508: invokestatic    aheq.D:(I)J
        //  2511: invokevirtual   ahed.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  2514: invokeinterface ahfb.M:(Ljava/util/List;)V
        //  2519: aload           12
        //  2521: astore          11
        //  2523: goto            21
        //  2526: aload           12
        //  2528: astore          13
        //  2530: aload           12
        //  2532: astore          16
        //  2534: aload_2        
        //  2535: aload_0        
        //  2536: getfield        aheq.o:Lahed;
        //  2539: aload_1        
        //  2540: iload           6
        //  2542: invokestatic    aheq.D:(I)J
        //  2545: invokevirtual   ahed.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  2548: invokeinterface ahfb.F:(Ljava/util/List;)V
        //  2553: aload           12
        //  2555: astore          11
        //  2557: goto            21
        //  2560: aload           12
        //  2562: astore          13
        //  2564: aload           12
        //  2566: astore          16
        //  2568: aload_2        
        //  2569: aload_0        
        //  2570: getfield        aheq.o:Lahed;
        //  2573: aload_1        
        //  2574: iload           6
        //  2576: invokestatic    aheq.D:(I)J
        //  2579: invokevirtual   ahed.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  2582: invokeinterface ahfb.D:(Ljava/util/List;)V
        //  2587: aload           12
        //  2589: astore          11
        //  2591: goto            21
        //  2594: aload           12
        //  2596: astore          13
        //  2598: aload           12
        //  2600: astore          16
        //  2602: aload_2        
        //  2603: aload_0        
        //  2604: getfield        aheq.o:Lahed;
        //  2607: aload_1        
        //  2608: iload           6
        //  2610: invokestatic    aheq.D:(I)J
        //  2613: invokevirtual   ahed.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  2616: invokeinterface ahfb.z:(Ljava/util/List;)V
        //  2621: aload           12
        //  2623: astore          11
        //  2625: goto            21
        //  2628: aload           12
        //  2630: astore          13
        //  2632: aload           12
        //  2634: astore          16
        //  2636: aload_2        
        //  2637: aload_0        
        //  2638: getfield        aheq.o:Lahed;
        //  2641: aload_1        
        //  2642: iload           6
        //  2644: invokestatic    aheq.D:(I)J
        //  2647: invokevirtual   ahed.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  2650: invokeinterface ahfb.J:(Ljava/util/List;)V
        //  2655: aload           12
        //  2657: astore          11
        //  2659: goto            21
        //  2662: aload           12
        //  2664: astore          13
        //  2666: aload           12
        //  2668: astore          16
        //  2670: aload_2        
        //  2671: aload_0        
        //  2672: getfield        aheq.o:Lahed;
        //  2675: aload_1        
        //  2676: iload           6
        //  2678: invokestatic    aheq.D:(I)J
        //  2681: invokevirtual   ahed.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  2684: invokeinterface ahfb.I:(Ljava/util/List;)V
        //  2689: aload           12
        //  2691: astore          11
        //  2693: goto            21
        //  2696: aload           12
        //  2698: astore          13
        //  2700: aload           12
        //  2702: astore          16
        //  2704: aload_2        
        //  2705: aload_0        
        //  2706: getfield        aheq.o:Lahed;
        //  2709: aload_1        
        //  2710: iload           6
        //  2712: invokestatic    aheq.D:(I)J
        //  2715: invokevirtual   ahed.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  2718: invokeinterface ahfb.H:(Ljava/util/List;)V
        //  2723: aload           12
        //  2725: astore          11
        //  2727: goto            21
        //  2730: aload           12
        //  2732: astore          13
        //  2734: aload           12
        //  2736: astore          16
        //  2738: aload_2        
        //  2739: aload_0        
        //  2740: getfield        aheq.o:Lahed;
        //  2743: aload_1        
        //  2744: iload           6
        //  2746: invokestatic    aheq.D:(I)J
        //  2749: invokevirtual   ahed.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  2752: invokeinterface ahfb.G:(Ljava/util/List;)V
        //  2757: aload           12
        //  2759: astore          11
        //  2761: goto            21
        //  2764: aload           12
        //  2766: astore          13
        //  2768: aload           12
        //  2770: astore          16
        //  2772: aload_0        
        //  2773: getfield        aheq.o:Lahed;
        //  2776: aload_1        
        //  2777: iload           6
        //  2779: invokestatic    aheq.D:(I)J
        //  2782: invokevirtual   ahed.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  2785: astore          11
        //  2787: aload           12
        //  2789: astore          13
        //  2791: aload           12
        //  2793: astore          16
        //  2795: aload_2        
        //  2796: aload           11
        //  2798: invokeinterface ahfb.A:(Ljava/util/List;)V
        //  2803: aload           12
        //  2805: astore          13
        //  2807: aload           12
        //  2809: astore          16
        //  2811: aload_1        
        //  2812: iload           5
        //  2814: aload           11
        //  2816: aload_0        
        //  2817: iload           4
        //  2819: invokespecial   aheq.F:(I)Lahdf;
        //  2822: aload           12
        //  2824: aload           17
        //  2826: invokestatic    ahfh.Y:(Ljava/lang/Object;ILjava/util/List;Lahdf;Ljava/lang/Object;Ladzw;)Ljava/lang/Object;
        //  2829: astore          11
        //  2831: goto            21
        //  2834: aload           12
        //  2836: astore          13
        //  2838: aload           12
        //  2840: astore          16
        //  2842: aload_2        
        //  2843: aload_0        
        //  2844: getfield        aheq.o:Lahed;
        //  2847: aload_1        
        //  2848: iload           6
        //  2850: invokestatic    aheq.D:(I)J
        //  2853: invokevirtual   ahed.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  2856: invokeinterface ahfb.L:(Ljava/util/List;)V
        //  2861: aload           12
        //  2863: astore          11
        //  2865: goto            21
        //  2868: aload           12
        //  2870: astore          13
        //  2872: aload           12
        //  2874: astore          16
        //  2876: aload_0        
        //  2877: getfield        aheq.o:Lahed;
        //  2880: aload_1        
        //  2881: iload           6
        //  2883: invokestatic    aheq.D:(I)J
        //  2886: invokevirtual   ahed.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  2889: astore          14
        //  2891: aload           12
        //  2893: astore          13
        //  2895: aload           12
        //  2897: astore          16
        //  2899: aload_2        
        //  2900: checkcast       Lahbz;
        //  2903: getfield        ahbz.b:I
        //  2906: invokestatic    ahge.b:(I)I
        //  2909: iconst_2       
        //  2910: if_icmpne       3025
        //  2913: aload           12
        //  2915: astore          13
        //  2917: aload           12
        //  2919: astore          16
        //  2921: aload           14
        //  2923: aload_2        
        //  2924: checkcast       Lahbz;
        //  2927: invokevirtual   ahbz.o:()Lahbt;
        //  2930: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //  2935: pop            
        //  2936: aload           12
        //  2938: astore          11
        //  2940: aload           12
        //  2942: astore          13
        //  2944: aload           12
        //  2946: astore          16
        //  2948: aload_2        
        //  2949: checkcast       Lahbz;
        //  2952: getfield        ahbz.a:Lahby;
        //  2955: invokevirtual   ahby.E:()Z
        //  2958: ifne            21
        //  2961: aload           12
        //  2963: astore          13
        //  2965: aload           12
        //  2967: astore          16
        //  2969: aload_2        
        //  2970: checkcast       Lahbz;
        //  2973: getfield        ahbz.a:Lahby;
        //  2976: invokevirtual   ahby.n:()I
        //  2979: istore          4
        //  2981: aload           12
        //  2983: astore          13
        //  2985: aload           12
        //  2987: astore          16
        //  2989: iload           4
        //  2991: aload_2        
        //  2992: checkcast       Lahbz;
        //  2995: getfield        ahbz.b:I
        //  2998: if_icmpeq       2913
        //  3001: aload           12
        //  3003: astore          13
        //  3005: aload           12
        //  3007: astore          16
        //  3009: aload_2        
        //  3010: checkcast       Lahbz;
        //  3013: iload           4
        //  3015: putfield        ahbz.c:I
        //  3018: aload           12
        //  3020: astore          11
        //  3022: goto            21
        //  3025: aload           12
        //  3027: astore          13
        //  3029: aload           12
        //  3031: astore          16
        //  3033: invokestatic    ahds.a:()Lahdr;
        //  3036: athrow         
        //  3037: aload           12
        //  3039: astore          13
        //  3041: aload           12
        //  3043: astore          16
        //  3045: aload_0        
        //  3046: iload           4
        //  3048: invokespecial   aheq.G:(I)Lahfg;
        //  3051: astore          18
        //  3053: aload           12
        //  3055: astore          13
        //  3057: aload           12
        //  3059: astore          16
        //  3061: iload           6
        //  3063: invokestatic    aheq.D:(I)J
        //  3066: lstore          8
        //  3068: aload           12
        //  3070: astore          13
        //  3072: aload           12
        //  3074: astore          16
        //  3076: aload_0        
        //  3077: getfield        aheq.o:Lahed;
        //  3080: aload_1        
        //  3081: lload           8
        //  3083: invokevirtual   ahed.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  3086: astore          14
        //  3088: aload           12
        //  3090: astore          13
        //  3092: aload           12
        //  3094: astore          16
        //  3096: aload_2        
        //  3097: checkcast       Lahbz;
        //  3100: getfield        ahbz.b:I
        //  3103: istore          5
        //  3105: aload           12
        //  3107: astore          13
        //  3109: aload           12
        //  3111: astore          16
        //  3113: iload           5
        //  3115: invokestatic    ahge.b:(I)I
        //  3118: iconst_2       
        //  3119: if_icmpne       3246
        //  3122: aload           12
        //  3124: astore          13
        //  3126: aload           12
        //  3128: astore          16
        //  3130: aload           14
        //  3132: aload_2        
        //  3133: checkcast       Lahbz;
        //  3136: aload           18
        //  3138: aload_3        
        //  3139: invokevirtual   ahbz.s:(Lahfg;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;
        //  3142: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //  3147: pop            
        //  3148: aload           12
        //  3150: astore          11
        //  3152: aload           12
        //  3154: astore          13
        //  3156: aload           12
        //  3158: astore          16
        //  3160: aload_2        
        //  3161: checkcast       Lahbz;
        //  3164: getfield        ahbz.a:Lahby;
        //  3167: invokevirtual   ahby.E:()Z
        //  3170: ifne            21
        //  3173: aload           12
        //  3175: astore          11
        //  3177: aload           12
        //  3179: astore          13
        //  3181: aload           12
        //  3183: astore          16
        //  3185: aload_2        
        //  3186: checkcast       Lahbz;
        //  3189: getfield        ahbz.c:I
        //  3192: ifne            21
        //  3195: aload           12
        //  3197: astore          13
        //  3199: aload           12
        //  3201: astore          16
        //  3203: aload_2        
        //  3204: checkcast       Lahbz;
        //  3207: getfield        ahbz.a:Lahby;
        //  3210: invokevirtual   ahby.n:()I
        //  3213: istore          4
        //  3215: iload           4
        //  3217: iload           5
        //  3219: if_icmpeq       3122
        //  3222: aload           12
        //  3224: astore          13
        //  3226: aload           12
        //  3228: astore          16
        //  3230: aload_2        
        //  3231: checkcast       Lahbz;
        //  3234: iload           4
        //  3236: putfield        ahbz.c:I
        //  3239: aload           12
        //  3241: astore          11
        //  3243: goto            21
        //  3246: aload           12
        //  3248: astore          13
        //  3250: aload           12
        //  3252: astore          16
        //  3254: invokestatic    ahds.a:()Lahdr;
        //  3257: athrow         
        //  3258: aload           12
        //  3260: astore          13
        //  3262: aload           12
        //  3264: astore          16
        //  3266: iload           6
        //  3268: invokestatic    aheq.V:(I)Z
        //  3271: ifeq            3322
        //  3274: aload           12
        //  3276: astore          13
        //  3278: aload           12
        //  3280: astore          16
        //  3282: aload_0        
        //  3283: getfield        aheq.o:Lahed;
        //  3286: aload_1        
        //  3287: iload           6
        //  3289: invokestatic    aheq.D:(I)J
        //  3292: invokevirtual   ahed.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  3295: astore          11
        //  3297: aload           12
        //  3299: astore          13
        //  3301: aload           12
        //  3303: astore          16
        //  3305: aload_2        
        //  3306: checkcast       Lahbz;
        //  3309: aload           11
        //  3311: iconst_1       
        //  3312: invokevirtual   ahbz.K:(Ljava/util/List;Z)V
        //  3315: aload           12
        //  3317: astore          11
        //  3319: goto            21
        //  3322: aload           12
        //  3324: astore          13
        //  3326: aload           12
        //  3328: astore          16
        //  3330: aload_0        
        //  3331: getfield        aheq.o:Lahed;
        //  3334: aload_1        
        //  3335: iload           6
        //  3337: invokestatic    aheq.D:(I)J
        //  3340: invokevirtual   ahed.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  3343: astore          11
        //  3345: aload           12
        //  3347: astore          13
        //  3349: aload           12
        //  3351: astore          16
        //  3353: aload_2        
        //  3354: checkcast       Lahbz;
        //  3357: aload           11
        //  3359: iconst_0       
        //  3360: invokevirtual   ahbz.K:(Ljava/util/List;Z)V
        //  3363: aload           12
        //  3365: astore          11
        //  3367: goto            21
        //  3370: aload           12
        //  3372: astore          13
        //  3374: aload           12
        //  3376: astore          16
        //  3378: aload_2        
        //  3379: aload_0        
        //  3380: getfield        aheq.o:Lahed;
        //  3383: aload_1        
        //  3384: iload           6
        //  3386: invokestatic    aheq.D:(I)J
        //  3389: invokevirtual   ahed.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  3392: invokeinterface ahfb.y:(Ljava/util/List;)V
        //  3397: aload           12
        //  3399: astore          11
        //  3401: goto            21
        //  3404: aload           12
        //  3406: astore          13
        //  3408: aload           12
        //  3410: astore          16
        //  3412: aload_2        
        //  3413: aload_0        
        //  3414: getfield        aheq.o:Lahed;
        //  3417: aload_1        
        //  3418: iload           6
        //  3420: invokestatic    aheq.D:(I)J
        //  3423: invokevirtual   ahed.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  3426: invokeinterface ahfb.B:(Ljava/util/List;)V
        //  3431: aload           12
        //  3433: astore          11
        //  3435: goto            21
        //  3438: aload           12
        //  3440: astore          13
        //  3442: aload           12
        //  3444: astore          16
        //  3446: aload_2        
        //  3447: aload_0        
        //  3448: getfield        aheq.o:Lahed;
        //  3451: aload_1        
        //  3452: iload           6
        //  3454: invokestatic    aheq.D:(I)J
        //  3457: invokevirtual   ahed.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  3460: invokeinterface ahfb.C:(Ljava/util/List;)V
        //  3465: aload           12
        //  3467: astore          11
        //  3469: goto            21
        //  3472: aload           12
        //  3474: astore          13
        //  3476: aload           12
        //  3478: astore          16
        //  3480: aload_2        
        //  3481: aload_0        
        //  3482: getfield        aheq.o:Lahed;
        //  3485: aload_1        
        //  3486: iload           6
        //  3488: invokestatic    aheq.D:(I)J
        //  3491: invokevirtual   ahed.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  3494: invokeinterface ahfb.E:(Ljava/util/List;)V
        //  3499: aload           12
        //  3501: astore          11
        //  3503: goto            21
        //  3506: aload           12
        //  3508: astore          13
        //  3510: aload           12
        //  3512: astore          16
        //  3514: aload_2        
        //  3515: aload_0        
        //  3516: getfield        aheq.o:Lahed;
        //  3519: aload_1        
        //  3520: iload           6
        //  3522: invokestatic    aheq.D:(I)J
        //  3525: invokevirtual   ahed.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  3528: invokeinterface ahfb.M:(Ljava/util/List;)V
        //  3533: aload           12
        //  3535: astore          11
        //  3537: goto            21
        //  3540: aload           12
        //  3542: astore          13
        //  3544: aload           12
        //  3546: astore          16
        //  3548: aload_2        
        //  3549: aload_0        
        //  3550: getfield        aheq.o:Lahed;
        //  3553: aload_1        
        //  3554: iload           6
        //  3556: invokestatic    aheq.D:(I)J
        //  3559: invokevirtual   ahed.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  3562: invokeinterface ahfb.F:(Ljava/util/List;)V
        //  3567: aload           12
        //  3569: astore          11
        //  3571: goto            21
        //  3574: aload           12
        //  3576: astore          13
        //  3578: aload           12
        //  3580: astore          16
        //  3582: aload_2        
        //  3583: aload_0        
        //  3584: getfield        aheq.o:Lahed;
        //  3587: aload_1        
        //  3588: iload           6
        //  3590: invokestatic    aheq.D:(I)J
        //  3593: invokevirtual   ahed.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  3596: invokeinterface ahfb.D:(Ljava/util/List;)V
        //  3601: aload           12
        //  3603: astore          11
        //  3605: goto            21
        //  3608: aload           12
        //  3610: astore          13
        //  3612: aload           12
        //  3614: astore          16
        //  3616: aload_2        
        //  3617: aload_0        
        //  3618: getfield        aheq.o:Lahed;
        //  3621: aload_1        
        //  3622: iload           6
        //  3624: invokestatic    aheq.D:(I)J
        //  3627: invokevirtual   ahed.b:(Ljava/lang/Object;J)Ljava/util/List;
        //  3630: invokeinterface ahfb.z:(Ljava/util/List;)V
        //  3635: aload           12
        //  3637: astore          11
        //  3639: goto            21
        //  3642: aload           12
        //  3644: astore          13
        //  3646: aload           12
        //  3648: astore          16
        //  3650: aload_0        
        //  3651: aload_1        
        //  3652: iload           4
        //  3654: invokespecial   aheq.I:(Ljava/lang/Object;I)Ljava/lang/Object;
        //  3657: checkcast       Lcom/google/protobuf/MessageLite;
        //  3660: astore          11
        //  3662: aload           12
        //  3664: astore          13
        //  3666: aload           12
        //  3668: astore          16
        //  3670: aload_2        
        //  3671: aload           11
        //  3673: aload_0        
        //  3674: iload           4
        //  3676: invokespecial   aheq.G:(I)Lahfg;
        //  3679: aload_3        
        //  3680: invokeinterface ahfb.w:(Ljava/lang/Object;Lahfg;Lcom/google/protobuf/ExtensionRegistryLite;)V
        //  3685: aload           12
        //  3687: astore          13
        //  3689: aload           12
        //  3691: astore          16
        //  3693: aload_0        
        //  3694: aload_1        
        //  3695: iload           4
        //  3697: aload           11
        //  3699: invokespecial   aheq.S:(Ljava/lang/Object;ILjava/lang/Object;)V
        //  3702: aload           12
        //  3704: astore          11
        //  3706: goto            21
        //  3709: aload           12
        //  3711: astore          13
        //  3713: aload           12
        //  3715: astore          16
        //  3717: aload_1        
        //  3718: iload           6
        //  3720: invokestatic    aheq.D:(I)J
        //  3723: aload_2        
        //  3724: invokeinterface ahfb.m:()J
        //  3729: invokestatic    ahfz.u:(Ljava/lang/Object;JJ)V
        //  3732: aload           12
        //  3734: astore          13
        //  3736: aload           12
        //  3738: astore          16
        //  3740: aload_0        
        //  3741: aload_1        
        //  3742: iload           4
        //  3744: invokespecial   aheq.Q:(Ljava/lang/Object;I)V
        //  3747: aload           12
        //  3749: astore          11
        //  3751: goto            21
        //  3754: aload           12
        //  3756: astore          13
        //  3758: aload           12
        //  3760: astore          16
        //  3762: aload_1        
        //  3763: iload           6
        //  3765: invokestatic    aheq.D:(I)J
        //  3768: aload_2        
        //  3769: invokeinterface ahfb.h:()I
        //  3774: invokestatic    ahfz.t:(Ljava/lang/Object;JI)V
        //  3777: aload           12
        //  3779: astore          13
        //  3781: aload           12
        //  3783: astore          16
        //  3785: aload_0        
        //  3786: aload_1        
        //  3787: iload           4
        //  3789: invokespecial   aheq.Q:(Ljava/lang/Object;I)V
        //  3792: aload           12
        //  3794: astore          11
        //  3796: goto            21
        //  3799: aload           12
        //  3801: astore          13
        //  3803: aload           12
        //  3805: astore          16
        //  3807: aload_1        
        //  3808: iload           6
        //  3810: invokestatic    aheq.D:(I)J
        //  3813: aload_2        
        //  3814: invokeinterface ahfb.l:()J
        //  3819: invokestatic    ahfz.u:(Ljava/lang/Object;JJ)V
        //  3822: aload           12
        //  3824: astore          13
        //  3826: aload           12
        //  3828: astore          16
        //  3830: aload_0        
        //  3831: aload_1        
        //  3832: iload           4
        //  3834: invokespecial   aheq.Q:(Ljava/lang/Object;I)V
        //  3837: aload           12
        //  3839: astore          11
        //  3841: goto            21
        //  3844: aload           12
        //  3846: astore          13
        //  3848: aload           12
        //  3850: astore          16
        //  3852: aload_1        
        //  3853: iload           6
        //  3855: invokestatic    aheq.D:(I)J
        //  3858: aload_2        
        //  3859: invokeinterface ahfb.g:()I
        //  3864: invokestatic    ahfz.t:(Ljava/lang/Object;JI)V
        //  3867: aload           12
        //  3869: astore          13
        //  3871: aload           12
        //  3873: astore          16
        //  3875: aload_0        
        //  3876: aload_1        
        //  3877: iload           4
        //  3879: invokespecial   aheq.Q:(Ljava/lang/Object;I)V
        //  3882: aload           12
        //  3884: astore          11
        //  3886: goto            21
        //  3889: aload           12
        //  3891: astore          13
        //  3893: aload           12
        //  3895: astore          16
        //  3897: aload_2        
        //  3898: invokeinterface ahfb.d:()I
        //  3903: istore          7
        //  3905: aload           12
        //  3907: astore          13
        //  3909: aload           12
        //  3911: astore          16
        //  3913: aload_0        
        //  3914: iload           4
        //  3916: invokespecial   aheq.F:(I)Lahdf;
        //  3919: astore          11
        //  3921: aload           11
        //  3923: ifnull          3972
        //  3926: aload           12
        //  3928: astore          13
        //  3930: aload           12
        //  3932: astore          16
        //  3934: aload           11
        //  3936: iload           7
        //  3938: invokeinterface ahdf.isInRange:(I)Z
        //  3943: ifeq            3949
        //  3946: goto            3972
        //  3949: aload           12
        //  3951: astore          13
        //  3953: aload           12
        //  3955: astore          16
        //  3957: aload_1        
        //  3958: iload           5
        //  3960: iload           7
        //  3962: aload           12
        //  3964: invokestatic    ahfh.E:(Ljava/lang/Object;IILjava/lang/Object;)Ljava/lang/Object;
        //  3967: astore          11
        //  3969: goto            21
        //  3972: aload           12
        //  3974: astore          13
        //  3976: aload           12
        //  3978: astore          16
        //  3980: aload_1        
        //  3981: iload           6
        //  3983: invokestatic    aheq.D:(I)J
        //  3986: iload           7
        //  3988: invokestatic    ahfz.t:(Ljava/lang/Object;JI)V
        //  3991: aload           12
        //  3993: astore          13
        //  3995: aload           12
        //  3997: astore          16
        //  3999: aload_0        
        //  4000: aload_1        
        //  4001: iload           4
        //  4003: invokespecial   aheq.Q:(Ljava/lang/Object;I)V
        //  4006: aload           12
        //  4008: astore          11
        //  4010: goto            21
        //  4013: aload           12
        //  4015: astore          13
        //  4017: aload           12
        //  4019: astore          16
        //  4021: aload_1        
        //  4022: iload           6
        //  4024: invokestatic    aheq.D:(I)J
        //  4027: aload_2        
        //  4028: invokeinterface ahfb.i:()I
        //  4033: invokestatic    ahfz.t:(Ljava/lang/Object;JI)V
        //  4036: aload           12
        //  4038: astore          13
        //  4040: aload           12
        //  4042: astore          16
        //  4044: aload_0        
        //  4045: aload_1        
        //  4046: iload           4
        //  4048: invokespecial   aheq.Q:(Ljava/lang/Object;I)V
        //  4051: aload           12
        //  4053: astore          11
        //  4055: goto            21
        //  4058: aload           12
        //  4060: astore          13
        //  4062: aload           12
        //  4064: astore          16
        //  4066: aload_1        
        //  4067: iload           6
        //  4069: invokestatic    aheq.D:(I)J
        //  4072: aload_2        
        //  4073: invokeinterface ahfb.o:()Lahbt;
        //  4078: invokestatic    ahfz.v:(Ljava/lang/Object;JLjava/lang/Object;)V
        //  4081: aload           12
        //  4083: astore          13
        //  4085: aload           12
        //  4087: astore          16
        //  4089: aload_0        
        //  4090: aload_1        
        //  4091: iload           4
        //  4093: invokespecial   aheq.Q:(Ljava/lang/Object;I)V
        //  4096: aload           12
        //  4098: astore          11
        //  4100: goto            21
        //  4103: aload           12
        //  4105: astore          13
        //  4107: aload           12
        //  4109: astore          16
        //  4111: aload_0        
        //  4112: aload_1        
        //  4113: iload           4
        //  4115: invokespecial   aheq.I:(Ljava/lang/Object;I)Ljava/lang/Object;
        //  4118: checkcast       Lcom/google/protobuf/MessageLite;
        //  4121: astore          11
        //  4123: aload           12
        //  4125: astore          13
        //  4127: aload           12
        //  4129: astore          16
        //  4131: aload_2        
        //  4132: aload           11
        //  4134: aload_0        
        //  4135: iload           4
        //  4137: invokespecial   aheq.G:(I)Lahfg;
        //  4140: aload_3        
        //  4141: invokeinterface ahfb.x:(Ljava/lang/Object;Lahfg;Lcom/google/protobuf/ExtensionRegistryLite;)V
        //  4146: aload           12
        //  4148: astore          13
        //  4150: aload           12
        //  4152: astore          16
        //  4154: aload_0        
        //  4155: aload_1        
        //  4156: iload           4
        //  4158: aload           11
        //  4160: invokespecial   aheq.S:(Ljava/lang/Object;ILjava/lang/Object;)V
        //  4163: aload           12
        //  4165: astore          11
        //  4167: goto            21
        //  4170: aload           12
        //  4172: astore          13
        //  4174: aload           12
        //  4176: astore          16
        //  4178: aload_0        
        //  4179: aload_1        
        //  4180: iload           6
        //  4182: aload_2        
        //  4183: invokespecial   aheq.P:(Ljava/lang/Object;ILahfb;)V
        //  4186: aload           12
        //  4188: astore          13
        //  4190: aload           12
        //  4192: astore          16
        //  4194: aload_0        
        //  4195: aload_1        
        //  4196: iload           4
        //  4198: invokespecial   aheq.Q:(Ljava/lang/Object;I)V
        //  4201: aload           12
        //  4203: astore          11
        //  4205: goto            21
        //  4208: aload           12
        //  4210: astore          13
        //  4212: aload           12
        //  4214: astore          16
        //  4216: aload_1        
        //  4217: iload           6
        //  4219: invokestatic    aheq.D:(I)J
        //  4222: aload_2        
        //  4223: invokeinterface ahfb.O:()Z
        //  4228: invokestatic    ahfz.n:(Ljava/lang/Object;JZ)V
        //  4231: aload           12
        //  4233: astore          13
        //  4235: aload           12
        //  4237: astore          16
        //  4239: aload_0        
        //  4240: aload_1        
        //  4241: iload           4
        //  4243: invokespecial   aheq.Q:(Ljava/lang/Object;I)V
        //  4246: aload           12
        //  4248: astore          11
        //  4250: goto            21
        //  4253: aload           12
        //  4255: astore          13
        //  4257: aload           12
        //  4259: astore          16
        //  4261: aload_1        
        //  4262: iload           6
        //  4264: invokestatic    aheq.D:(I)J
        //  4267: aload_2        
        //  4268: invokeinterface ahfb.e:()I
        //  4273: invokestatic    ahfz.t:(Ljava/lang/Object;JI)V
        //  4276: aload           12
        //  4278: astore          13
        //  4280: aload           12
        //  4282: astore          16
        //  4284: aload_0        
        //  4285: aload_1        
        //  4286: iload           4
        //  4288: invokespecial   aheq.Q:(Ljava/lang/Object;I)V
        //  4291: aload           12
        //  4293: astore          11
        //  4295: goto            21
        //  4298: aload           12
        //  4300: astore          13
        //  4302: aload           12
        //  4304: astore          16
        //  4306: aload_1        
        //  4307: iload           6
        //  4309: invokestatic    aheq.D:(I)J
        //  4312: aload_2        
        //  4313: invokeinterface ahfb.j:()J
        //  4318: invokestatic    ahfz.u:(Ljava/lang/Object;JJ)V
        //  4321: aload           12
        //  4323: astore          13
        //  4325: aload           12
        //  4327: astore          16
        //  4329: aload_0        
        //  4330: aload_1        
        //  4331: iload           4
        //  4333: invokespecial   aheq.Q:(Ljava/lang/Object;I)V
        //  4336: aload           12
        //  4338: astore          11
        //  4340: goto            21
        //  4343: aload           12
        //  4345: astore          13
        //  4347: aload           12
        //  4349: astore          16
        //  4351: aload_1        
        //  4352: iload           6
        //  4354: invokestatic    aheq.D:(I)J
        //  4357: aload_2        
        //  4358: invokeinterface ahfb.f:()I
        //  4363: invokestatic    ahfz.t:(Ljava/lang/Object;JI)V
        //  4366: aload           12
        //  4368: astore          13
        //  4370: aload           12
        //  4372: astore          16
        //  4374: aload_0        
        //  4375: aload_1        
        //  4376: iload           4
        //  4378: invokespecial   aheq.Q:(Ljava/lang/Object;I)V
        //  4381: aload           12
        //  4383: astore          11
        //  4385: goto            21
        //  4388: aload           12
        //  4390: astore          13
        //  4392: aload           12
        //  4394: astore          16
        //  4396: aload_1        
        //  4397: iload           6
        //  4399: invokestatic    aheq.D:(I)J
        //  4402: aload_2        
        //  4403: invokeinterface ahfb.n:()J
        //  4408: invokestatic    ahfz.u:(Ljava/lang/Object;JJ)V
        //  4411: aload           12
        //  4413: astore          13
        //  4415: aload           12
        //  4417: astore          16
        //  4419: aload_0        
        //  4420: aload_1        
        //  4421: iload           4
        //  4423: invokespecial   aheq.Q:(Ljava/lang/Object;I)V
        //  4426: aload           12
        //  4428: astore          11
        //  4430: goto            21
        //  4433: aload           12
        //  4435: astore          13
        //  4437: aload           12
        //  4439: astore          16
        //  4441: aload_1        
        //  4442: iload           6
        //  4444: invokestatic    aheq.D:(I)J
        //  4447: aload_2        
        //  4448: invokeinterface ahfb.k:()J
        //  4453: invokestatic    ahfz.u:(Ljava/lang/Object;JJ)V
        //  4456: aload           12
        //  4458: astore          13
        //  4460: aload           12
        //  4462: astore          16
        //  4464: aload_0        
        //  4465: aload_1        
        //  4466: iload           4
        //  4468: invokespecial   aheq.Q:(Ljava/lang/Object;I)V
        //  4471: aload           12
        //  4473: astore          11
        //  4475: goto            21
        //  4478: aload           12
        //  4480: astore          13
        //  4482: aload           12
        //  4484: astore          16
        //  4486: aload_1        
        //  4487: iload           6
        //  4489: invokestatic    aheq.D:(I)J
        //  4492: aload_2        
        //  4493: invokeinterface ahfb.b:()F
        //  4498: invokestatic    ahfz.s:(Ljava/lang/Object;JF)V
        //  4501: aload           12
        //  4503: astore          13
        //  4505: aload           12
        //  4507: astore          16
        //  4509: aload_0        
        //  4510: aload_1        
        //  4511: iload           4
        //  4513: invokespecial   aheq.Q:(Ljava/lang/Object;I)V
        //  4516: aload           12
        //  4518: astore          11
        //  4520: goto            21
        //  4523: aload           12
        //  4525: astore          13
        //  4527: aload           12
        //  4529: astore          16
        //  4531: aload_1        
        //  4532: iload           6
        //  4534: invokestatic    aheq.D:(I)J
        //  4537: aload_2        
        //  4538: invokeinterface ahfb.a:()D
        //  4543: invokestatic    ahfz.r:(Ljava/lang/Object;JD)V
        //  4546: aload           12
        //  4548: astore          13
        //  4550: aload           12
        //  4552: astore          16
        //  4554: aload_0        
        //  4555: aload_1        
        //  4556: iload           4
        //  4558: invokespecial   aheq.Q:(Ljava/lang/Object;I)V
        //  4561: aload           12
        //  4563: astore          11
        //  4565: goto            21
        //  4568: aload           14
        //  4570: astore          13
        //  4572: aload           14
        //  4574: astore          16
        //  4576: aload           17
        //  4578: aload           14
        //  4580: aload_2        
        //  4581: invokevirtual   adzw.aR:(Ljava/lang/Object;Lahfb;)Z
        //  4584: istore          10
        //  4586: aload           14
        //  4588: astore          11
        //  4590: iload           10
        //  4592: ifne            21
        //  4595: aload_0        
        //  4596: getfield        aheq.m:I
        //  4599: istore          4
        //  4601: aload           14
        //  4603: astore_2       
        //  4604: iload           4
        //  4606: aload_0        
        //  4607: getfield        aheq.n:I
        //  4610: if_icmpge       4634
        //  4613: aload_0        
        //  4614: aload_1        
        //  4615: aload_0        
        //  4616: getfield        aheq.l:[I
        //  4619: iload           4
        //  4621: iaload         
        //  4622: aload_2        
        //  4623: aload_1        
        //  4624: invokespecial   aheq.af:(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  4627: astore_2       
        //  4628: iinc            4, 1
        //  4631: goto            4604
        //  4634: aload_2        
        //  4635: ifnull          4737
        //  4638: goto            105
        //  4641: aload           12
        //  4643: astore          13
        //  4645: goto            4653
        //  4648: astore          11
        //  4650: goto            4641
        //  4653: aload           13
        //  4655: astore          12
        //  4657: aload           13
        //  4659: ifnonnull       4668
        //  4662: aload_1        
        //  4663: invokestatic    adzw.aW:(Ljava/lang/Object;)Ljava/lang/Object;
        //  4666: astore          12
        //  4668: aload           12
        //  4670: astore          13
        //  4672: aload           17
        //  4674: aload           12
        //  4676: aload_2        
        //  4677: invokevirtual   adzw.aR:(Ljava/lang/Object;Lahfb;)Z
        //  4680: istore          10
        //  4682: aload           12
        //  4684: astore          11
        //  4686: iload           10
        //  4688: ifne            21
        //  4691: aload_0        
        //  4692: getfield        aheq.m:I
        //  4695: istore          4
        //  4697: aload           12
        //  4699: astore_2       
        //  4700: iload           4
        //  4702: aload_0        
        //  4703: getfield        aheq.n:I
        //  4706: if_icmpge       4730
        //  4709: aload_0        
        //  4710: aload_1        
        //  4711: aload_0        
        //  4712: getfield        aheq.l:[I
        //  4715: iload           4
        //  4717: iaload         
        //  4718: aload_2        
        //  4719: aload_1        
        //  4720: invokespecial   aheq.af:(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  4723: astore_2       
        //  4724: iinc            4, 1
        //  4727: goto            4700
        //  4730: aload_2        
        //  4731: ifnull          4737
        //  4734: goto            105
        //  4737: return         
        //  4738: aload_0        
        //  4739: getfield        aheq.m:I
        //  4742: istore          4
        //  4744: iload           4
        //  4746: aload_0        
        //  4747: getfield        aheq.n:I
        //  4750: if_icmpge       4776
        //  4753: aload_0        
        //  4754: aload_1        
        //  4755: aload_0        
        //  4756: getfield        aheq.l:[I
        //  4759: iload           4
        //  4761: iaload         
        //  4762: aload           13
        //  4764: aload_1        
        //  4765: invokespecial   aheq.af:(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  4768: astore          13
        //  4770: iinc            4, 1
        //  4773: goto            4744
        //  4776: aload           13
        //  4778: ifnull          4790
        //  4781: aload_1        
        //  4782: aload           13
        //  4784: checkcast       Lahfs;
        //  4787: invokestatic    adzw.aV:(Ljava/lang/Object;Lahfs;)V
        //  4790: goto            4795
        //  4793: aload_2        
        //  4794: athrow         
        //  4795: goto            4793
        //  4798: astore          11
        //  4800: aload           16
        //  4802: astore          12
        //  4804: goto            4641
        //  4807: astore          14
        //  4809: goto            1789
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type  
        //  -----  -----  -----  -----  ------
        //  29     37     290    4798   Any
        //  41     49     290    4798   Any
        //  118    125    290    4798   Any
        //  135    147    290    4798   Any
        //  165    171    290    4798   Any
        //  175    191    290    4798   Any
        //  215    221    290    4798   Any
        //  225    235    290    4798   Any
        //  298    306    290    4798   Any
        //  310    317    4648   4653   Lahdr;
        //  310    317    290    4798   Any
        //  625    631    4798   4807   Lahdr;
        //  625    631    290    4798   Any
        //  638    652    1406   1415   Lahdr;
        //  638    652    290    4798   Any
        //  656    671    1406   1415   Lahdr;
        //  656    671    290    4798   Any
        //  675    686    1406   1415   Lahdr;
        //  675    686    290    4798   Any
        //  693    711    1406   1415   Lahdr;
        //  693    711    290    4798   Any
        //  715    724    1406   1415   Lahdr;
        //  715    724    290    4798   Any
        //  731    749    1406   1415   Lahdr;
        //  731    749    290    4798   Any
        //  753    762    1406   1415   Lahdr;
        //  753    762    290    4798   Any
        //  769    787    1406   1415   Lahdr;
        //  769    787    290    4798   Any
        //  791    800    1406   1415   Lahdr;
        //  791    800    290    4798   Any
        //  807    825    1406   1415   Lahdr;
        //  807    825    290    4798   Any
        //  829    838    1406   1415   Lahdr;
        //  829    838    290    4798   Any
        //  845    853    1406   1415   Lahdr;
        //  845    853    290    4798   Any
        //  857    865    1406   1415   Lahdr;
        //  857    865    290    4798   Any
        //  874    886    1406   1415   Lahdr;
        //  874    886    290    4798   Any
        //  893    905    1406   1415   Lahdr;
        //  893    905    290    4798   Any
        //  912    926    1406   1415   Lahdr;
        //  912    926    290    4798   Any
        //  930    939    1406   1415   Lahdr;
        //  930    939    290    4798   Any
        //  946    964    1406   1415   Lahdr;
        //  946    964    290    4798   Any
        //  968    977    1406   1415   Lahdr;
        //  968    977    290    4798   Any
        //  984    999    1406   1415   Lahdr;
        //  984    999    290    4798   Any
        //  1003   1012   1406   1415   Lahdr;
        //  1003   1012   290    4798   Any
        //  1019   1033   1406   1415   Lahdr;
        //  1019   1033   290    4798   Any
        //  1037   1052   1406   1415   Lahdr;
        //  1037   1052   290    4798   Any
        //  1056   1067   1406   1415   Lahdr;
        //  1056   1067   290    4798   Any
        //  1074   1082   1406   1415   Lahdr;
        //  1074   1082   290    4798   Any
        //  1086   1095   1406   1415   Lahdr;
        //  1086   1095   290    4798   Any
        //  1106   1124   1406   1415   Lahdr;
        //  1106   1124   290    4798   Any
        //  1128   1137   1406   1415   Lahdr;
        //  1128   1137   290    4798   Any
        //  1144   1162   1406   1415   Lahdr;
        //  1144   1162   290    4798   Any
        //  1166   1175   1406   1415   Lahdr;
        //  1166   1175   290    4798   Any
        //  1182   1200   1406   1415   Lahdr;
        //  1182   1200   290    4798   Any
        //  1204   1213   1406   1415   Lahdr;
        //  1204   1213   290    4798   Any
        //  1220   1238   1406   1415   Lahdr;
        //  1220   1238   290    4798   Any
        //  1242   1251   1406   1415   Lahdr;
        //  1242   1251   290    4798   Any
        //  1258   1276   1406   1415   Lahdr;
        //  1258   1276   290    4798   Any
        //  1280   1289   1406   1415   Lahdr;
        //  1280   1289   290    4798   Any
        //  1296   1314   1406   1415   Lahdr;
        //  1296   1314   290    4798   Any
        //  1318   1327   1406   1415   Lahdr;
        //  1318   1327   290    4798   Any
        //  1334   1352   1406   1415   Lahdr;
        //  1334   1352   290    4798   Any
        //  1356   1365   1406   1415   Lahdr;
        //  1356   1365   290    4798   Any
        //  1372   1390   1406   1415   Lahdr;
        //  1372   1390   290    4798   Any
        //  1394   1403   1406   1415   Lahdr;
        //  1394   1403   290    4798   Any
        //  1419   1427   4648   4653   Lahdr;
        //  1419   1427   290    4798   Any
        //  1431   1442   4648   4653   Lahdr;
        //  1431   1442   290    4798   Any
        //  1446   1454   4648   4653   Lahdr;
        //  1446   1454   290    4798   Any
        //  1463   1468   1406   1415   Lahdr;
        //  1463   1468   290    4798   Any
        //  1472   1480   1406   1415   Lahdr;
        //  1472   1480   290    4798   Any
        //  1487   1494   4648   4653   Lahdr;
        //  1487   1494   290    4798   Any
        //  1507   1512   1406   1415   Lahdr;
        //  1507   1512   290    4798   Any
        //  1516   1524   1406   1415   Lahdr;
        //  1516   1524   290    4798   Any
        //  1528   1536   1406   1415   Lahdr;
        //  1528   1536   290    4798   Any
        //  1540   1547   4648   4653   Lahdr;
        //  1540   1547   290    4798   Any
        //  1551   1558   4648   4653   Lahdr;
        //  1551   1558   290    4798   Any
        //  1562   1570   4648   4653   Lahdr;
        //  1562   1570   290    4798   Any
        //  1574   1586   4648   4653   Lahdr;
        //  1574   1586   290    4798   Any
        //  1590   1604   4648   4653   Lahdr;
        //  1590   1604   290    4798   Any
        //  1608   1615   4648   4653   Lahdr;
        //  1608   1615   290    4798   Any
        //  1619   1626   4648   4653   Lahdr;
        //  1619   1626   290    4798   Any
        //  1630   1639   1862   1864   Any
        //  1647   1659   1862   1864   Any
        //  1679   1689   1787   1789   Lahdr;
        //  1679   1689   1862   1864   Any
        //  1692   1708   1787   1789   Lahdr;
        //  1692   1708   1862   1864   Any
        //  1708   1746   1787   1789   Lahdr;
        //  1708   1746   1862   1864   Any
        //  1753   1769   1787   1789   Lahdr;
        //  1753   1769   1862   1864   Any
        //  1769   1780   4807   4812   Lahdr;
        //  1769   1780   1857   1862   Any
        //  1789   1799   1857   1862   Any
        //  1802   1818   1857   1862   Any
        //  1818   1830   1857   1862   Any
        //  1838   1850   4798   4807   Lahdr;
        //  1838   1850   290    4798   Any
        //  1872   1884   4798   4807   Lahdr;
        //  1872   1884   290    4798   Any
        //  1892   1895   4798   4807   Lahdr;
        //  1892   1895   290    4798   Any
        //  1903   1910   4798   4807   Lahdr;
        //  1903   1910   290    4798   Any
        //  1918   1926   4798   4807   Lahdr;
        //  1918   1926   290    4798   Any
        //  1934   1946   4798   4807   Lahdr;
        //  1934   1946   290    4798   Any
        //  1954   1963   4798   4807   Lahdr;
        //  1954   1963   290    4798   Any
        //  1971   1980   4798   4807   Lahdr;
        //  1971   1980   290    4798   Any
        //  1988   2006   4798   4807   Lahdr;
        //  1988   2006   290    4798   Any
        //  2018   2031   4798   4807   Lahdr;
        //  2018   2031   290    4798   Any
        //  2043   2053   4798   4807   Lahdr;
        //  2043   2053   290    4798   Any
        //  2061   2073   4798   4807   Lahdr;
        //  2061   2073   290    4798   Any
        //  2088   2097   4798   4807   Lahdr;
        //  2088   2097   290    4798   Any
        //  2112   2116   4798   4807   Lahdr;
        //  2112   2116   290    4798   Any
        //  2124   2143   4798   4807   Lahdr;
        //  2124   2143   290    4798   Any
        //  2158   2177   4798   4807   Lahdr;
        //  2158   2177   290    4798   Any
        //  2192   2211   4798   4807   Lahdr;
        //  2192   2211   290    4798   Any
        //  2226   2245   4798   4807   Lahdr;
        //  2226   2245   290    4798   Any
        //  2260   2275   4798   4807   Lahdr;
        //  2260   2275   290    4798   Any
        //  2283   2291   4798   4807   Lahdr;
        //  2283   2291   290    4798   Any
        //  2299   2319   4798   4807   Lahdr;
        //  2299   2319   290    4798   Any
        //  2330   2349   4798   4807   Lahdr;
        //  2330   2349   290    4798   Any
        //  2364   2383   4798   4807   Lahdr;
        //  2364   2383   290    4798   Any
        //  2398   2417   4798   4807   Lahdr;
        //  2398   2417   290    4798   Any
        //  2432   2451   4798   4807   Lahdr;
        //  2432   2451   290    4798   Any
        //  2466   2485   4798   4807   Lahdr;
        //  2466   2485   290    4798   Any
        //  2500   2519   4798   4807   Lahdr;
        //  2500   2519   290    4798   Any
        //  2534   2553   4798   4807   Lahdr;
        //  2534   2553   290    4798   Any
        //  2568   2587   4798   4807   Lahdr;
        //  2568   2587   290    4798   Any
        //  2602   2621   4798   4807   Lahdr;
        //  2602   2621   290    4798   Any
        //  2636   2655   4798   4807   Lahdr;
        //  2636   2655   290    4798   Any
        //  2670   2689   4798   4807   Lahdr;
        //  2670   2689   290    4798   Any
        //  2704   2723   4798   4807   Lahdr;
        //  2704   2723   290    4798   Any
        //  2738   2757   4798   4807   Lahdr;
        //  2738   2757   290    4798   Any
        //  2772   2787   4798   4807   Lahdr;
        //  2772   2787   290    4798   Any
        //  2795   2803   4798   4807   Lahdr;
        //  2795   2803   290    4798   Any
        //  2811   2831   4798   4807   Lahdr;
        //  2811   2831   290    4798   Any
        //  2842   2861   4798   4807   Lahdr;
        //  2842   2861   290    4798   Any
        //  2876   2891   4798   4807   Lahdr;
        //  2876   2891   290    4798   Any
        //  2899   2913   4798   4807   Lahdr;
        //  2899   2913   290    4798   Any
        //  2921   2936   4798   4807   Lahdr;
        //  2921   2936   290    4798   Any
        //  2948   2961   4798   4807   Lahdr;
        //  2948   2961   290    4798   Any
        //  2969   2981   4798   4807   Lahdr;
        //  2969   2981   290    4798   Any
        //  2989   3001   4798   4807   Lahdr;
        //  2989   3001   290    4798   Any
        //  3009   3018   4798   4807   Lahdr;
        //  3009   3018   290    4798   Any
        //  3033   3037   4798   4807   Lahdr;
        //  3033   3037   290    4798   Any
        //  3045   3053   4798   4807   Lahdr;
        //  3045   3053   290    4798   Any
        //  3061   3068   4798   4807   Lahdr;
        //  3061   3068   290    4798   Any
        //  3076   3088   4798   4807   Lahdr;
        //  3076   3088   290    4798   Any
        //  3096   3105   4798   4807   Lahdr;
        //  3096   3105   290    4798   Any
        //  3113   3122   4798   4807   Lahdr;
        //  3113   3122   290    4798   Any
        //  3130   3148   4798   4807   Lahdr;
        //  3130   3148   290    4798   Any
        //  3160   3173   4798   4807   Lahdr;
        //  3160   3173   290    4798   Any
        //  3185   3195   4798   4807   Lahdr;
        //  3185   3195   290    4798   Any
        //  3203   3215   4798   4807   Lahdr;
        //  3203   3215   290    4798   Any
        //  3230   3239   4798   4807   Lahdr;
        //  3230   3239   290    4798   Any
        //  3254   3258   4798   4807   Lahdr;
        //  3254   3258   290    4798   Any
        //  3266   3274   4798   4807   Lahdr;
        //  3266   3274   290    4798   Any
        //  3282   3297   4798   4807   Lahdr;
        //  3282   3297   290    4798   Any
        //  3305   3315   4798   4807   Lahdr;
        //  3305   3315   290    4798   Any
        //  3330   3345   4798   4807   Lahdr;
        //  3330   3345   290    4798   Any
        //  3353   3363   4798   4807   Lahdr;
        //  3353   3363   290    4798   Any
        //  3378   3397   4798   4807   Lahdr;
        //  3378   3397   290    4798   Any
        //  3412   3431   4798   4807   Lahdr;
        //  3412   3431   290    4798   Any
        //  3446   3465   4798   4807   Lahdr;
        //  3446   3465   290    4798   Any
        //  3480   3499   4798   4807   Lahdr;
        //  3480   3499   290    4798   Any
        //  3514   3533   4798   4807   Lahdr;
        //  3514   3533   290    4798   Any
        //  3548   3567   4798   4807   Lahdr;
        //  3548   3567   290    4798   Any
        //  3582   3601   4798   4807   Lahdr;
        //  3582   3601   290    4798   Any
        //  3616   3635   4798   4807   Lahdr;
        //  3616   3635   290    4798   Any
        //  3650   3662   4798   4807   Lahdr;
        //  3650   3662   290    4798   Any
        //  3670   3685   4798   4807   Lahdr;
        //  3670   3685   290    4798   Any
        //  3693   3702   4798   4807   Lahdr;
        //  3693   3702   290    4798   Any
        //  3717   3732   4798   4807   Lahdr;
        //  3717   3732   290    4798   Any
        //  3740   3747   4798   4807   Lahdr;
        //  3740   3747   290    4798   Any
        //  3762   3777   4798   4807   Lahdr;
        //  3762   3777   290    4798   Any
        //  3785   3792   4798   4807   Lahdr;
        //  3785   3792   290    4798   Any
        //  3807   3822   4798   4807   Lahdr;
        //  3807   3822   290    4798   Any
        //  3830   3837   4798   4807   Lahdr;
        //  3830   3837   290    4798   Any
        //  3852   3867   4798   4807   Lahdr;
        //  3852   3867   290    4798   Any
        //  3875   3882   4798   4807   Lahdr;
        //  3875   3882   290    4798   Any
        //  3897   3905   4798   4807   Lahdr;
        //  3897   3905   290    4798   Any
        //  3913   3921   4798   4807   Lahdr;
        //  3913   3921   290    4798   Any
        //  3934   3946   4798   4807   Lahdr;
        //  3934   3946   290    4798   Any
        //  3957   3969   4798   4807   Lahdr;
        //  3957   3969   290    4798   Any
        //  3980   3991   4798   4807   Lahdr;
        //  3980   3991   290    4798   Any
        //  3999   4006   4798   4807   Lahdr;
        //  3999   4006   290    4798   Any
        //  4021   4036   4798   4807   Lahdr;
        //  4021   4036   290    4798   Any
        //  4044   4051   4798   4807   Lahdr;
        //  4044   4051   290    4798   Any
        //  4066   4081   4798   4807   Lahdr;
        //  4066   4081   290    4798   Any
        //  4089   4096   4798   4807   Lahdr;
        //  4089   4096   290    4798   Any
        //  4111   4123   4798   4807   Lahdr;
        //  4111   4123   290    4798   Any
        //  4131   4146   4798   4807   Lahdr;
        //  4131   4146   290    4798   Any
        //  4154   4163   4798   4807   Lahdr;
        //  4154   4163   290    4798   Any
        //  4178   4186   4798   4807   Lahdr;
        //  4178   4186   290    4798   Any
        //  4194   4201   4798   4807   Lahdr;
        //  4194   4201   290    4798   Any
        //  4216   4231   4798   4807   Lahdr;
        //  4216   4231   290    4798   Any
        //  4239   4246   4798   4807   Lahdr;
        //  4239   4246   290    4798   Any
        //  4261   4276   4798   4807   Lahdr;
        //  4261   4276   290    4798   Any
        //  4284   4291   4798   4807   Lahdr;
        //  4284   4291   290    4798   Any
        //  4306   4321   4798   4807   Lahdr;
        //  4306   4321   290    4798   Any
        //  4329   4336   4798   4807   Lahdr;
        //  4329   4336   290    4798   Any
        //  4351   4366   4798   4807   Lahdr;
        //  4351   4366   290    4798   Any
        //  4374   4381   4798   4807   Lahdr;
        //  4374   4381   290    4798   Any
        //  4396   4411   4798   4807   Lahdr;
        //  4396   4411   290    4798   Any
        //  4419   4426   4798   4807   Lahdr;
        //  4419   4426   290    4798   Any
        //  4441   4456   4798   4807   Lahdr;
        //  4441   4456   290    4798   Any
        //  4464   4471   4798   4807   Lahdr;
        //  4464   4471   290    4798   Any
        //  4486   4501   4798   4807   Lahdr;
        //  4486   4501   290    4798   Any
        //  4509   4516   4798   4807   Lahdr;
        //  4509   4516   290    4798   Any
        //  4531   4546   4798   4807   Lahdr;
        //  4531   4546   290    4798   Any
        //  4554   4561   4798   4807   Lahdr;
        //  4554   4561   290    4798   Any
        //  4576   4586   4798   4807   Lahdr;
        //  4576   4586   290    4798   Any
        //  4662   4668   290    4798   Any
        //  4672   4682   290    4798   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0634:
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
    
    public final void i(final Object o, final byte[] array, final int n, final int n2, final ahbh ahbh) {
        if (this.j) {
            this.ad(o, array, n, n2, ahbh);
            return;
        }
        this.c(o, array, n, n2, 0, ahbh);
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
                    if (ahfz.d(o, n) != ahfz.d(o2, n)) {
                        return false;
                    }
                    if (!ahfh.q(ahfz.i(o, d), ahfz.i(o2, d))) {
                        return false;
                    }
                    continue;
                }
                case 50: {
                    b = ahfh.q(ahfz.i(o, d), ahfz.i(o2, d));
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
                    b = ahfh.q(ahfz.i(o, d), ahfz.i(o2, d));
                    break;
                }
                case 17: {
                    if (this.U(o, o2, i) && ahfh.q(ahfz.i(o, d), ahfz.i(o2, d))) {
                        continue;
                    }
                    return false;
                }
                case 16: {
                    if (this.U(o, o2, i) && ahfz.f(o, d) == ahfz.f(o2, d)) {
                        continue;
                    }
                    return false;
                }
                case 15: {
                    if (this.U(o, o2, i) && ahfz.d(o, d) == ahfz.d(o2, d)) {
                        continue;
                    }
                    return false;
                }
                case 14: {
                    if (this.U(o, o2, i) && ahfz.f(o, d) == ahfz.f(o2, d)) {
                        continue;
                    }
                    return false;
                }
                case 13: {
                    if (this.U(o, o2, i) && ahfz.d(o, d) == ahfz.d(o2, d)) {
                        continue;
                    }
                    return false;
                }
                case 12: {
                    if (this.U(o, o2, i) && ahfz.d(o, d) == ahfz.d(o2, d)) {
                        continue;
                    }
                    return false;
                }
                case 11: {
                    if (this.U(o, o2, i) && ahfz.d(o, d) == ahfz.d(o2, d)) {
                        continue;
                    }
                    return false;
                }
                case 10: {
                    if (this.U(o, o2, i) && ahfh.q(ahfz.i(o, d), ahfz.i(o2, d))) {
                        continue;
                    }
                    return false;
                }
                case 9: {
                    if (this.U(o, o2, i) && ahfh.q(ahfz.i(o, d), ahfz.i(o2, d))) {
                        continue;
                    }
                    return false;
                }
                case 8: {
                    if (this.U(o, o2, i) && ahfh.q(ahfz.i(o, d), ahfz.i(o2, d))) {
                        continue;
                    }
                    return false;
                }
                case 7: {
                    if (this.U(o, o2, i) && ahfz.x(o, d) == ahfz.x(o2, d)) {
                        continue;
                    }
                    return false;
                }
                case 6: {
                    if (this.U(o, o2, i) && ahfz.d(o, d) == ahfz.d(o2, d)) {
                        continue;
                    }
                    return false;
                }
                case 5: {
                    if (this.U(o, o2, i) && ahfz.f(o, d) == ahfz.f(o2, d)) {
                        continue;
                    }
                    return false;
                }
                case 4: {
                    if (this.U(o, o2, i) && ahfz.d(o, d) == ahfz.d(o2, d)) {
                        continue;
                    }
                    return false;
                }
                case 3: {
                    if (this.U(o, o2, i) && ahfz.f(o, d) == ahfz.f(o2, d)) {
                        continue;
                    }
                    return false;
                }
                case 2: {
                    if (this.U(o, o2, i) && ahfz.f(o, d) == ahfz.f(o2, d)) {
                        continue;
                    }
                    return false;
                }
                case 1: {
                    if (this.U(o, o2, i) && Float.floatToIntBits(ahfz.c(o, d)) == Float.floatToIntBits(ahfz.c(o2, d))) {
                        continue;
                    }
                    return false;
                }
                case 0: {
                    if (this.U(o, o2, i) && Double.doubleToLongBits(ahfz.b(o, d)) == Double.doubleToLongBits(ahfz.b(o2, d))) {
                        continue;
                    }
                    return false;
                }
            }
            if (!b) {
                return false;
            }
        }
        return adzw.aU(o).equals(adzw.aU(o2)) && (!this.h || agsk.p(o).equals((Object)agsk.p(o2)));
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
                    int1 = aheq.b.getInt(o, (long)n4);
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
                            final ahej ahej = (ahej)ahfz.i(o, D(c));
                            if (!((Map)ahej).isEmpty() && ((ahgc)agsk.j(this.H(n2)).d).s == ahgd.i) {
                                final Iterator iterator = ((Map)ahej).values().iterator();
                                ahfg ahfg = null;
                                while (iterator.hasNext()) {
                                    final Object next = iterator.next();
                                    ahfg a;
                                    if ((a = ahfg) == null) {
                                        a = ahey.a.a((Class)next.getClass());
                                    }
                                    ahfg = a;
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
                final List list = (List)ahfz.i(o, D(c));
                if (!list.isEmpty()) {
                    final ahfg g = this.G(n2);
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
        return !this.h || agsk.p(o).j();
    }
    
    public final void l(final Object o, final agpd agpd) {
        if (this.j) {
            Iterator e = null;
            Map.Entry entry = null;
            Label_0056: {
                if (this.h) {
                    final ahcm p2 = agsk.p(o);
                    if (!p2.i()) {
                        e = p2.e();
                        entry = (Map.Entry)e.next();
                        break Label_0056;
                    }
                }
                e = null;
                entry = null;
            }
            final int length = this.c.length;
            int n = 0;
            Map.Entry entry2;
            while (true) {
                entry2 = entry;
                if (n >= length) {
                    break;
                }
                final int c = this.C(n);
                final int s = this.s(n);
                while (entry != null && agsk.o(entry) <= s) {
                    agsk.u(agpd, entry);
                    if (e.hasNext()) {
                        entry = (Map.Entry)e.next();
                    }
                    else {
                        entry = null;
                    }
                }
                switch (B(c)) {
                    case 68: {
                        if (this.aa(o, s, n)) {
                            agpd.k(s, ahfz.i(o, D(c)), this.G(n));
                            break;
                        }
                        break;
                    }
                    case 67: {
                        if (this.aa(o, s, n)) {
                            agpd.s(s, E(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 66: {
                        if (this.aa(o, s, n)) {
                            agpd.r(s, t(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 65: {
                        if (this.aa(o, s, n)) {
                            agpd.q(s, E(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 64: {
                        if (this.aa(o, s, n)) {
                            agpd.p(s, t(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 63: {
                        if (this.aa(o, s, n)) {
                            agpd.g(s, t(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 62: {
                        if (this.aa(o, s, n)) {
                            agpd.u(s, t(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 61: {
                        if (this.aa(o, s, n)) {
                            agpd.e(s, (ahbt)ahfz.i(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 60: {
                        if (this.aa(o, s, n)) {
                            agpd.n(s, ahfz.i(o, D(c)), this.G(n));
                            break;
                        }
                        break;
                    }
                    case 59: {
                        if (this.aa(o, s, n)) {
                            ai(s, ahfz.i(o, D(c)), agpd);
                            break;
                        }
                        break;
                    }
                    case 58: {
                        if (this.aa(o, s, n)) {
                            agpd.d(s, ab(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 57: {
                        if (this.aa(o, s, n)) {
                            agpd.h(s, t(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 56: {
                        if (this.aa(o, s, n)) {
                            agpd.i(s, E(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 55: {
                        if (this.aa(o, s, n)) {
                            agpd.l(s, t(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 54: {
                        if (this.aa(o, s, n)) {
                            agpd.v(s, E(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 53: {
                        if (this.aa(o, s, n)) {
                            agpd.m(s, E(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 52: {
                        if (this.aa(o, s, n)) {
                            agpd.j(s, p(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 51: {
                        if (this.aa(o, s, n)) {
                            agpd.f(s, o(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 50: {
                        this.ah(agpd, s, ahfz.i(o, D(c)), n);
                        break;
                    }
                    case 49: {
                        ahfh.M(this.s(n), (List)ahfz.i(o, D(c)), agpd, this.G(n));
                        break;
                    }
                    case 48: {
                        ahfh.T(this.s(n), (List)ahfz.i(o, D(c)), agpd, true);
                        break;
                    }
                    case 47: {
                        ahfh.S(this.s(n), (List)ahfz.i(o, D(c)), agpd, true);
                        break;
                    }
                    case 46: {
                        ahfh.R(this.s(n), (List)ahfz.i(o, D(c)), agpd, true);
                        break;
                    }
                    case 45: {
                        ahfh.Q(this.s(n), (List)ahfz.i(o, D(c)), agpd, true);
                        break;
                    }
                    case 44: {
                        ahfh.I(this.s(n), (List)ahfz.i(o, D(c)), agpd, true);
                        break;
                    }
                    case 43: {
                        ahfh.V(this.s(n), (List)ahfz.i(o, D(c)), agpd, true);
                        break;
                    }
                    case 42: {
                        ahfh.F(this.s(n), (List)ahfz.i(o, D(c)), agpd, true);
                        break;
                    }
                    case 41: {
                        ahfh.J(this.s(n), (List)ahfz.i(o, D(c)), agpd, true);
                        break;
                    }
                    case 40: {
                        ahfh.K(this.s(n), (List)ahfz.i(o, D(c)), agpd, true);
                        break;
                    }
                    case 39: {
                        ahfh.N(this.s(n), (List)ahfz.i(o, D(c)), agpd, true);
                        break;
                    }
                    case 38: {
                        ahfh.W(this.s(n), (List)ahfz.i(o, D(c)), agpd, true);
                        break;
                    }
                    case 37: {
                        ahfh.O(this.s(n), (List)ahfz.i(o, D(c)), agpd, true);
                        break;
                    }
                    case 36: {
                        ahfh.L(this.s(n), (List)ahfz.i(o, D(c)), agpd, true);
                        break;
                    }
                    case 35: {
                        ahfh.H(this.s(n), (List)ahfz.i(o, D(c)), agpd, true);
                        break;
                    }
                    case 34: {
                        ahfh.T(this.s(n), (List)ahfz.i(o, D(c)), agpd, false);
                        break;
                    }
                    case 33: {
                        ahfh.S(this.s(n), (List)ahfz.i(o, D(c)), agpd, false);
                        break;
                    }
                    case 32: {
                        ahfh.R(this.s(n), (List)ahfz.i(o, D(c)), agpd, false);
                        break;
                    }
                    case 31: {
                        ahfh.Q(this.s(n), (List)ahfz.i(o, D(c)), agpd, false);
                        break;
                    }
                    case 30: {
                        ahfh.I(this.s(n), (List)ahfz.i(o, D(c)), agpd, false);
                        break;
                    }
                    case 29: {
                        ahfh.V(this.s(n), (List)ahfz.i(o, D(c)), agpd, false);
                        break;
                    }
                    case 28: {
                        ahfh.G(this.s(n), (List)ahfz.i(o, D(c)), agpd);
                        break;
                    }
                    case 27: {
                        ahfh.P(this.s(n), (List)ahfz.i(o, D(c)), agpd, this.G(n));
                        break;
                    }
                    case 26: {
                        ahfh.U(this.s(n), (List)ahfz.i(o, D(c)), agpd);
                        break;
                    }
                    case 25: {
                        ahfh.F(this.s(n), (List)ahfz.i(o, D(c)), agpd, false);
                        break;
                    }
                    case 24: {
                        ahfh.J(this.s(n), (List)ahfz.i(o, D(c)), agpd, false);
                        break;
                    }
                    case 23: {
                        ahfh.K(this.s(n), (List)ahfz.i(o, D(c)), agpd, false);
                        break;
                    }
                    case 22: {
                        ahfh.N(this.s(n), (List)ahfz.i(o, D(c)), agpd, false);
                        break;
                    }
                    case 21: {
                        ahfh.W(this.s(n), (List)ahfz.i(o, D(c)), agpd, false);
                        break;
                    }
                    case 20: {
                        ahfh.O(this.s(n), (List)ahfz.i(o, D(c)), agpd, false);
                        break;
                    }
                    case 19: {
                        ahfh.L(this.s(n), (List)ahfz.i(o, D(c)), agpd, false);
                        break;
                    }
                    case 18: {
                        ahfh.H(this.s(n), (List)ahfz.i(o, D(c)), agpd, false);
                        break;
                    }
                    case 17: {
                        if (this.W(o, n)) {
                            agpd.k(s, ahfz.i(o, D(c)), this.G(n));
                            break;
                        }
                        break;
                    }
                    case 16: {
                        if (this.W(o, n)) {
                            agpd.s(s, ahfz.f(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 15: {
                        if (this.W(o, n)) {
                            agpd.r(s, ahfz.d(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 14: {
                        if (this.W(o, n)) {
                            agpd.q(s, ahfz.f(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 13: {
                        if (this.W(o, n)) {
                            agpd.p(s, ahfz.d(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 12: {
                        if (this.W(o, n)) {
                            agpd.g(s, ahfz.d(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 11: {
                        if (this.W(o, n)) {
                            agpd.u(s, ahfz.d(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 10: {
                        if (this.W(o, n)) {
                            agpd.e(s, (ahbt)ahfz.i(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 9: {
                        if (this.W(o, n)) {
                            agpd.n(s, ahfz.i(o, D(c)), this.G(n));
                            break;
                        }
                        break;
                    }
                    case 8: {
                        if (this.W(o, n)) {
                            ai(s, ahfz.i(o, D(c)), agpd);
                            break;
                        }
                        break;
                    }
                    case 7: {
                        if (this.W(o, n)) {
                            agpd.d(s, ahfz.x(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 6: {
                        if (this.W(o, n)) {
                            agpd.h(s, ahfz.d(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 5: {
                        if (this.W(o, n)) {
                            agpd.i(s, ahfz.f(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 4: {
                        if (this.W(o, n)) {
                            agpd.l(s, ahfz.d(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 3: {
                        if (this.W(o, n)) {
                            agpd.v(s, ahfz.f(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 2: {
                        if (this.W(o, n)) {
                            agpd.m(s, ahfz.f(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 1: {
                        if (this.W(o, n)) {
                            agpd.j(s, ahfz.c(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 0: {
                        if (this.W(o, n)) {
                            agpd.f(s, ahfz.b(o, D(c)));
                            break;
                        }
                        break;
                    }
                }
                n += 3;
            }
            while (entry2 != null) {
                agsk.u(agpd, entry2);
                if (e.hasNext()) {
                    entry2 = (Map.Entry)e.next();
                }
                else {
                    entry2 = null;
                }
            }
            aj(o, agpd);
            return;
        }
        this.ag(o, agpd);
    }
}
