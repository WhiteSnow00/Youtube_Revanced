import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqth
{
    private static final int[][] f;
    public final String a;
    public int b;
    public final aqtf c;
    public int d;
    public final Map e;
    private aqtl g;
    
    static {
        f = new int[][] { { 0, 1114111, 1 } };
    }
    
    public aqth(final String a) {
        this.c = new aqtf();
        this.d = 0;
        this.e = new HashMap();
        this.a = a;
        this.b = 212;
    }
    
    public static int a(final aqtg aqtg, final int n) {
        if (!aqtg.i()) {
            throw new aqtj("missing closing ]", aqtg.c(n));
        }
        if (aqtg.g('\\')) {
            return b(aqtg);
        }
        return aqtg.b();
    }
    
    public static int b(final aqtg aqtg) {
        final int a = aqtg.a;
        aqtg.e(1);
        if (!aqtg.i()) {
            throw new aqtj();
        }
        int b = aqtg.b();
        if (b == 97) {
            return 7;
        }
        if (b == 102) {
            return 12;
        }
        if (b == 110) {
            return 10;
        }
        if (b == 114) {
            return 13;
        }
        if (b == 116) {
            return 9;
        }
        if (b != 118) {
            if (b != 120) {
                switch (b) {
                    default: {
                        if (!aqtn.c(b)) {
                            return b;
                        }
                        break;
                    }
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55: {
                        if (aqtg.i() && aqtg.a() >= 48 && aqtg.a() <= 55)
                        break;
                    }
                    case 48: {
                        b -= 48;
                        for (int n = 1; n < 3 && aqtg.i() && aqtg.a() >= 48 && aqtg.a() <= 55; ++n) {
                            b = b * 8 + aqtg.a() - 48;
                            aqtg.e(1);
                        }
                        return b;
                    }
                }
            }
            else if (aqtg.i()) {
                final int b2 = aqtg.b();
                if (b2 == 123) {
                    int n2 = 0;
                    int n3 = 0;
                    while (aqtg.i()) {
                        final int b3 = aqtg.b();
                        if (b3 == 125) {
                            if (n2 != 0) {
                                return n3;
                            }
                            break;
                        }
                        else {
                            final int a2 = aqtn.a(b3);
                            if (a2 < 0) {
                                break;
                            }
                            n3 = n3 * 16 + a2;
                            if (n3 > 1114111) {
                                break;
                            }
                            ++n2;
                        }
                    }
                }
                else if (aqtg.i()) {
                    final int a3 = aqtn.a(b2);
                    final int a4 = aqtn.a(aqtg.b());
                    if (a3 >= 0 && a4 >= 0) {
                        return a3 * 16 + a4;
                    }
                }
            }
            throw new aqtj("invalid escape sequence", aqtg.c(a));
        }
        return 11;
    }
    
    public static int c(final aqtg aqtg) {
        final int a = aqtg.a;
        while (aqtg.i()) {
            final int a2 = aqtg.a();
            if (a2 < 48 || a2 > 57) {
                break;
            }
            aqtg.e(1);
        }
        final String c = aqtg.c(a);
        if (c.isEmpty() || (c.length() > 1 && c.charAt(0) == '0')) {
            return -1;
        }
        if (c.length() > 8) {
            return -2;
        }
        return Integer.valueOf(c, 10);
    }
    
    public static aqtl[] k(final aqtl[] array, final int n, final int n2) {
        final aqtl[] array2 = new aqtl[n2 - n];
        for (int i = n; i < n2; ++i) {
            array2[i - n] = array[i];
        }
        return array2;
    }
    
    private final aqtl q(final aqtl aqtl, int length) {
        final int j = aqtl.j;
        if (j == 18) {
            final aqtl[] c = aqtl.c;
            if (c.length > 0) {
                final aqtl q = this.q(c[0], length);
                aqtl.c[0] = q;
                aqtl aqtl2 = aqtl;
                if (q.j == 2) {
                    this.g(q);
                    final aqtl[] c2 = aqtl.c;
                    length = c2.length;
                    if (length != 0 && length != 1) {
                        if (length != 2) {
                            aqtl.c = k(c2, 1, length);
                            aqtl2 = aqtl;
                        }
                        else {
                            aqtl2 = c2[1];
                            this.g(aqtl);
                        }
                    }
                    else {
                        aqtl.j = 2;
                        aqtl.c = null;
                        aqtl2 = aqtl;
                    }
                }
                return aqtl2;
            }
        }
        else if (j == 3) {
            final int[] d = aqtl.d;
            aqtl.d = aqtn.d(d, length, d.length);
            if (aqtl.d.length == 0) {
                aqtl.j = 2;
            }
        }
        return aqtl;
    }
    
    private static void r(final aqtl aqtl, final aqtl aqtl2) {
        final int j = aqtl.j;
        final int n = j - 1;
        if (j != 0) {
            int n2 = 0;
            if (n != 2) {
                if (n != 3) {
                    if (n == 4) {
                        final int i = aqtl2.j;
                        final int n3 = i - 1;
                        if (i != 0) {
                            if (n3 != 2) {
                                if (n3 != 3) {
                                    if (n3 != 5) {
                                        return;
                                    }
                                }
                                else {
                                    while (true) {
                                        final int[] d = aqtl2.d;
                                        if (n2 >= d.length) {
                                            return;
                                        }
                                        if (d[n2] <= 10 && d[n2 + 1] >= 10) {
                                            break;
                                        }
                                        n2 += 2;
                                    }
                                }
                            }
                            else {
                                final int[] d2 = aqtl2.d;
                                if (d2.length != 1 || d2[0] != 10) {
                                    return;
                                }
                            }
                            aqtl.j = 6;
                            return;
                        }
                        throw null;
                    }
                }
                else {
                    if (aqtl2.j == 3) {
                        final aqta aqta = new aqta(aqtl.d);
                        aqta.j(aqtl2.d[0], aqtl2.b);
                        aqtl.d = aqta.b();
                        return;
                    }
                    final aqta aqta2 = new aqta(aqtl.d);
                    aqta2.c(aqtl2.d);
                    aqtl.d = aqta2.b();
                }
            }
            else {
                final int n4 = aqtl2.d[0];
                final int n5 = aqtl.d[0];
                if (n4 != n5 || aqtl2.b != aqtl.b) {
                    aqtl.j = 4;
                    final aqta aqta3 = new aqta();
                    aqta3.j(n5, aqtl.b);
                    aqta3.j(aqtl2.d[0], aqtl2.b);
                    aqtl.d = aqta3.b();
                }
            }
            return;
        }
        throw null;
    }
    
    private static boolean s(final aqtl aqtl) {
        int j;
        if ((j = aqtl.j) == 3) {
            if (aqtl.d.length == 1) {
                return true;
            }
            j = 3;
        }
        if (j != 4 && j != 5) {
            if (j != 6) {
                return false;
            }
        }
        return true;
    }
    
    private final boolean t(final int n, final int b) {
        final int size = this.c.size();
        if (size < 2) {
            return false;
        }
        final aqtl aqtl = this.c.get(size - 1);
        final aqtl aqtl2 = this.c.get(size - 2);
        if (aqtl.j == 3 && aqtl2.j == 3) {
            if ((aqtl.b & 0x1) == (aqtl2.b & 0x1)) {
                final int[] d = aqtl2.d;
                final int[] d2 = aqtl.d;
                final int length = d.length;
                final int length2 = d2.length;
                final int[] d3 = new int[length + length2];
                System.arraycopy(d, 0, d3, 0, length);
                System.arraycopy(d2, 0, d3, length, length2);
                aqtl2.d = d3;
                if (n >= 0) {
                    aqtl.d = new int[] { n };
                    aqtl.b = b;
                    return true;
                }
                this.d();
                this.g(aqtl);
            }
        }
        return false;
    }
    
    private final aqtl[] u() {
        int i;
        int n;
        int n2;
        for (n = (i = this.c.size()); i > 0; i = n2) {
            final aqtf c = this.c;
            n2 = i - 1;
            if (aqsy.e(((aqtl)c.get(n2)).j)) {
                break;
            }
        }
        final aqtl[] array = this.c.subList(i, n).toArray(new aqtl[n - i]);
        this.c.removeRange(i, n);
        return array;
    }
    
    private final aqtl v(aqtl[] c, int n) {
        final int length = c.length;
        if (length != 1) {
            int i = 0;
            int n2 = 0;
            while (i < length) {
                final aqtl aqtl = c[i];
                int length2;
                if (aqtl.j == n) {
                    length2 = aqtl.c.length;
                }
                else {
                    length2 = 1;
                }
                n2 += length2;
                ++i;
            }
            final aqtl[] c2 = new aqtl[n2];
            final int length3 = c.length;
            int j = 0;
            int n3 = 0;
            while (j < length3) {
                final aqtl aqtl2 = c[j];
                if (aqtl2.j == n) {
                    final aqtl[] c3 = aqtl2.c;
                    System.arraycopy(c3, 0, c2, n3, c3.length);
                    n3 += aqtl2.c.length;
                    this.g(aqtl2);
                }
                else {
                    c2[n3] = aqtl2;
                    ++n3;
                }
                ++j;
            }
            final aqtl l = this.l(n);
            l.c = c2;
            if (n == 19) {
                final aqtl[] c4 = l.c;
                final int length4 = c4.length;
                if (length4 < 2) {
                    c = c4;
                }
                else {
                    int k = 0;
                    int b = 0;
                    n = 0;
                    int[] array = null;
                    int n4 = 0;
                    int n5 = 0;
                    while (k <= length4) {
                        int n7 = 0;
                        int n8 = 0;
                        Label_0554: {
                            int[] array2;
                            if (k < length4) {
                                aqtl aqtl4;
                                final aqtl aqtl3 = aqtl4 = c4[k];
                                if (aqtl3.j == 18) {
                                    final aqtl[] c5 = aqtl3.c;
                                    aqtl4 = aqtl3;
                                    if (c5.length > 0) {
                                        aqtl4 = c5[0];
                                    }
                                }
                                int[] d;
                                int length5;
                                int n6;
                                if (aqtl4.j == 3) {
                                    d = aqtl4.d;
                                    length5 = d.length;
                                    n6 = (aqtl4.b & 0x1);
                                }
                                else {
                                    d = null;
                                    n6 = 0;
                                    length5 = 0;
                                }
                                array2 = d;
                                n7 = n6;
                                n8 = length5;
                                if (n6 == b) {
                                    int n9;
                                    for (n9 = 0; n9 < n4 && n9 < length5 && array[n9] == d[n9]; ++n9) {}
                                    array2 = d;
                                    n7 = n6;
                                    n8 = length5;
                                    if (n9 > 0) {
                                        n8 = n9;
                                        n7 = b;
                                        break Label_0554;
                                    }
                                }
                            }
                            else {
                                array2 = null;
                                n7 = 0;
                                n8 = 0;
                            }
                            if (k != n5) {
                                if (k == n5 + 1) {
                                    final int n10 = n + 1;
                                    c4[n] = c4[n5];
                                    n = n10;
                                }
                                else {
                                    final aqtl m = this.l(3);
                                    m.b = b;
                                    m.d = aqtn.d(array, 0, n4);
                                    for (int n11 = n5; n11 < k; ++n11) {
                                        c4[n11] = this.q(c4[n11], n4);
                                    }
                                    final aqtl v = this.v(k(c4, n5, k), 19);
                                    final aqtl l2 = this.l(18);
                                    l2.c = new aqtl[] { m, v };
                                    final int n12 = n + 1;
                                    c4[n] = l2;
                                    n = n12;
                                }
                            }
                            n5 = k;
                            array = array2;
                        }
                        ++k;
                        b = n7;
                        n4 = n8;
                    }
                    int n13 = 0;
                    int n14 = 0;
                    int n15 = 0;
                    aqtl aqtl5 = null;
                    while (n15 <= n) {
                        aqtl aqtl8 = null;
                        Label_0993: {
                            Label_0746: {
                                if (n15 < n) {
                                    final aqtl aqtl6 = c4[n15];
                                    final int j2 = aqtl6.j;
                                    aqtl aqtl7 = null;
                                    Label_0663: {
                                        if (j2 != 2) {
                                            aqtl7 = aqtl6;
                                            if (j2 != 18) {
                                                break Label_0663;
                                            }
                                            final aqtl[] c6 = aqtl6.c;
                                            aqtl7 = aqtl6;
                                            if (c6.length <= 0 || (aqtl7 = c6[0]).j != 2) {
                                                break Label_0663;
                                            }
                                        }
                                        aqtl7 = null;
                                    }
                                    aqtl8 = aqtl7;
                                    if (aqtl5 != null) {
                                        aqtl8 = aqtl7;
                                        if (aqtl5.equals(aqtl7)) {
                                            if (!s(aqtl5)) {
                                                aqtl8 = aqtl7;
                                                if (aqtl5.j != 17) {
                                                    break Label_0746;
                                                }
                                                aqtl8 = aqtl7;
                                                if (aqtl5.e != aqtl5.f) {
                                                    break Label_0746;
                                                }
                                                aqtl8 = aqtl7;
                                                if (!s(aqtl5.c[0])) {
                                                    break Label_0746;
                                                }
                                            }
                                            aqtl8 = aqtl5;
                                            break Label_0993;
                                        }
                                    }
                                }
                                else {
                                    aqtl8 = null;
                                }
                            }
                            if (n15 != n14) {
                                if (n15 == n14 + 1) {
                                    c4[n13] = c4[n14];
                                    ++n13;
                                }
                                else {
                                    for (int n16 = n14; n16 < n15; ++n16) {
                                        aqtl l3 = c4[n16];
                                        Label_0927: {
                                            if (l3.j == 18) {
                                                final aqtl[] c7 = l3.c;
                                                if (c7.length > 0) {
                                                    if (n16 != n14) {
                                                        this.g(c7[0]);
                                                    }
                                                    final aqtl[] c8 = l3.c;
                                                    l3.c = k(c8, 1, c8.length);
                                                    final aqtl[] c9 = l3.c;
                                                    final int length6 = c9.length;
                                                    if (length6 != 0) {
                                                        if (length6 == 1) {
                                                            final aqtl aqtl9 = c9[0];
                                                            this.g(l3);
                                                            l3 = aqtl9;
                                                        }
                                                        break Label_0927;
                                                    }
                                                    l3.j = 2;
                                                    l3.c = aqtl.a;
                                                    break Label_0927;
                                                }
                                            }
                                            if (n16 != n14) {
                                                this.g(l3);
                                            }
                                            l3 = this.l(2);
                                        }
                                        c4[n16] = l3;
                                    }
                                    final aqtl v2 = this.v(k(c4, n14, n15), 19);
                                    final aqtl l4 = this.l(18);
                                    l4.c = new aqtl[] { aqtl5, v2 };
                                    c4[n13] = l4;
                                    ++n13;
                                }
                            }
                            n14 = n15;
                        }
                        ++n15;
                        aqtl5 = aqtl8;
                    }
                    int n17 = 0;
                    int n18 = 0;
                    n = 0;
                    while (n18 <= n13) {
                        if (n18 >= n13 || !s(c4[n18])) {
                            int n19 = n;
                            if (n18 != n17) {
                                int n20 = n17 + 1;
                                if (n18 == n20) {
                                    c4[n] = c4[n17];
                                    n19 = n + 1;
                                }
                                else {
                                    int n21 = n17;
                                    int n23;
                                    for (int n22 = n20; n22 < n18; ++n22, n21 = n23) {
                                        final aqtl aqtl10 = c4[n21];
                                        final aqtl aqtl11 = c4[n22];
                                        final int j3 = aqtl10.j;
                                        if (j3 == 0) {
                                            throw null;
                                        }
                                        final int j4 = aqtl11.j;
                                        if (j4 == 0) {
                                            throw null;
                                        }
                                        if (j3 - 1 >= j4 - 1) {
                                            n23 = n21;
                                            if (j3 != j4) {
                                                continue;
                                            }
                                            n23 = n21;
                                            if (aqtl10.d.length >= aqtl11.d.length) {
                                                continue;
                                            }
                                        }
                                        n23 = n22;
                                    }
                                    final aqtl aqtl12 = c4[n17];
                                    c4[n17] = c4[n21];
                                    c4[n21] = aqtl12;
                                    while (n20 < n18) {
                                        r(c4[n17], c4[n20]);
                                        this.g(c4[n20]);
                                        ++n20;
                                    }
                                    w(c4[n17]);
                                    c4[n] = c4[n17];
                                    n19 = n + 1;
                                }
                            }
                            n = n19;
                            if (n18 < n13) {
                                c4[n19] = c4[n18];
                                n = n19 + 1;
                            }
                            n17 = n18 + 1;
                        }
                        ++n18;
                    }
                    int n24 = 0;
                    int n26;
                    int n27;
                    for (int n25 = 0; n25 < n; n25 = n26, n24 = n27) {
                        n26 = n25 + 1;
                        if (n26 < n && c4[n25].j == 2) {
                            n27 = n24;
                            if (c4[n26].j == 2) {
                                continue;
                            }
                        }
                        c4[n24] = c4[n25];
                        n27 = n24 + 1;
                    }
                    c = k(c4, 0, n24);
                }
                l.c = c;
                c = l.c;
                if (c.length == 1) {
                    final aqtl aqtl13 = c[0];
                    this.g(l);
                    return aqtl13;
                }
            }
            return l;
        }
        return c[0];
    }
    
    private static final void w(final aqtl aqtl) {
        if (aqtl.j == 4) {
            final aqta aqta = new aqta(aqtl.d);
            aqta.g();
            aqtl.d = aqta.b();
            final int[] d = aqtl.d;
            final int length = d.length;
            if (length == 2) {
                if (d[0] == 0 && d[1] == 1114111) {
                    aqtl.d = null;
                    aqtl.j = 6;
                }
            }
            else if (length == 4 && d[0] == 0 && d[1] == 9 && d[2] == 11 && d[3] == 1114111) {
                aqtl.d = null;
                aqtl.j = 5;
            }
        }
    }
    
    public final aqtl d() {
        final aqtf c = this.c;
        return (aqtl)c.remove(c.size() - 1);
    }
    
    public final aqtl e(final aqtl aqtl) {
        final int j = aqtl.j;
        Label_0288: {
            Label_0226: {
                Label_0160: {
                    if (j == 4) {
                        final int[] d = aqtl.d;
                        if (d.length == 2) {
                            final int n = d[0];
                            if (n == d[1]) {
                                if (this.t(n, this.b & 0xFFFFFFFE)) {
                                    return null;
                                }
                                aqtl.j = 3;
                                aqtl.d = new int[] { aqtl.d[0] };
                                aqtl.b = (this.b & 0xFFFFFFFE);
                                break Label_0288;
                            }
                        }
                    }
                    else if (j != 4) {
                        break Label_0160;
                    }
                    final int[] d2 = aqtl.d;
                    if (d2.length == 4) {
                        final int n2 = d2[0];
                        if (n2 == d2[1] && d2[2] == d2[3]) {
                            final int c = aqsx.c(n2);
                            final int n3 = aqtl.d[2];
                            if (c == n3 && aqsx.c(n3) == aqtl.d[0]) {
                                break Label_0226;
                            }
                        }
                    }
                }
                if (aqtl.j == 4) {
                    final int[] d3 = aqtl.d;
                    if (d3.length == 2) {
                        final int n4 = d3[0];
                        if (n4 + 1 == d3[1]) {
                            final int c2 = aqsx.c(n4);
                            final int n5 = aqtl.d[1];
                            if (c2 == n5 && aqsx.c(n5) == aqtl.d[0]) {
                                break Label_0226;
                            }
                        }
                    }
                }
                this.t(-1, 0);
                break Label_0288;
            }
            if (this.t(aqtl.d[0], this.b | 0x1)) {
                return null;
            }
            aqtl.j = 3;
            aqtl.d = new int[] { aqtl.d[0] };
            aqtl.b = (this.b | 0x1);
        }
        this.c.add(aqtl);
        return aqtl;
    }
    
    public final void f(final int n) {
        final int b = this.b;
        final aqtl l = this.l(3);
        l.b = b;
        int n2 = n;
        if ((b & 0x1) != 0x0 && (n2 = n) >= 65) {
            if (n > 66639) {
                n2 = n;
            }
            else {
                int i = aqsx.c(n);
                n2 = n;
                while (i != n) {
                    int n3;
                    if ((n3 = n2) > i) {
                        n3 = i;
                    }
                    i = aqsx.c(i);
                    n2 = n3;
                }
            }
        }
        l.d = new int[] { n2 };
        this.e(l);
    }
    
    public final void g(final aqtl g) {
        final aqtl[] c = g.c;
        if (c != null && c.length > 0) {
            c[0] = this.g;
        }
        this.g = g;
    }
    
    public final boolean h(final aqtg aqtg, final aqta aqta) {
        final int a = aqtg.a;
        final int b = this.b;
        boolean b2 = false;
        if ((b & 0x40) == 0x0 || !aqtg.i() || aqtg.b() != 92 || !aqtg.i()) {
            return false;
        }
        aqtg.b();
        final aqtb aqtb = aqtb.a.get(aqtg.c(a));
        if (aqtb == null) {
            return false;
        }
        if (0x1 == (this.b & 0x1)) {
            b2 = true;
        }
        aqta.d(aqtb, b2);
        return true;
    }
    
    public final boolean i(final aqtg aqtg, final aqta aqta) {
        final int a = aqtg.a;
        if ((this.b & 0x80) == 0x0 || (!aqtg.h("\\p") && !aqtg.h("\\P"))) {
            return false;
        }
        aqtg.e(1);
        int n;
        if (aqtg.b() == 80) {
            n = -1;
        }
        else {
            n = 1;
        }
        if (!aqtg.i()) {
            aqtg.a = a;
            throw new aqtj("invalid character class range", aqtg.d());
        }
        final int b = aqtg.b();
        String s;
        if (b != 123) {
            final char c = (char)b;
            if (b == c) {
                s = String.valueOf(c);
            }
            else {
                s = new String(Character.toChars(c));
            }
        }
        else {
            final String d = aqtg.d();
            final int index = d.indexOf(125);
            if (index < 0) {
                aqtg.a = a;
                throw new aqtj("invalid character class range", aqtg.d());
            }
            s = d.substring(0, index);
            aqtg.f(s);
            aqtg.e(1);
        }
        int n2 = n;
        String substring = s;
        if (!s.isEmpty()) {
            n2 = n;
            substring = s;
            if (s.charAt(0) == '^') {
                n2 = -n;
                substring = s.substring(1);
            }
        }
        arzp arzp;
        if (substring.equals("Any")) {
            final int[][] f = aqth.f;
            arzp = arzp.j((Object)f, (Object)f);
        }
        else {
            final int[][] array = aqtm.bD.get(substring);
            if (array != null) {
                arzp = arzp.j((Object)array, (Object)aqtm.bG.get(substring));
            }
            else {
                final int[][] array2 = aqtm.bE.get(substring);
                if (array2 != null) {
                    arzp = arzp.j((Object)array2, (Object)aqtm.bF.get(substring));
                }
                else {
                    arzp = null;
                }
            }
        }
        if (arzp != null) {
            final int[][] array3 = (int[][])arzp.b;
            final int[][] array4 = (int[][])arzp.a;
            if ((this.b & 0x1) != 0x0 && array4 != null) {
                final aqta aqta2 = new aqta();
                aqta2.f(array3);
                aqta2.f(array4);
                aqta2.g();
                aqta.h(aqta2.b(), n2);
            }
            else if (n2 < 0) {
                final int length = array3.length;
                int i = 0;
                int n3 = 0;
                while (i < length) {
                    final int[] array5 = array3[i];
                    final int n4 = array5[0];
                    final int n5 = array5[1];
                    final int n6 = array5[2];
                    int n7 = n3;
                    int n8 = n4;
                    if (n6 == 1) {
                        final int n9 = n4 - 1;
                        if (n3 <= n9) {
                            aqta.e(n3, n9);
                        }
                        n3 = n5 + 1;
                    }
                    else {
                        while (true) {
                            n3 = n7;
                            if (n8 > n5) {
                                break;
                            }
                            final int n10 = n8 - 1;
                            if (n7 <= n10) {
                                aqta.e(n7, n10);
                            }
                            n7 = n8 + 1;
                            n8 += n6;
                        }
                    }
                    ++i;
                }
                if (n3 <= 1114111) {
                    aqta.e(n3, 1114111);
                }
            }
            else {
                aqta.f(array3);
            }
            return true;
        }
        throw new aqtj("invalid character class range", aqtg.c(a));
    }
    
    public final boolean j() {
        final int size = this.c.size();
        if (size >= 3 && ((aqtl)this.c.get(size - 2)).j == 21) {
            final aqtf c = this.c;
            final int n = size - 1;
            if (s((aqtl)c.get(n))) {
                final aqtf c2 = this.c;
                final int n2 = size - 3;
                if (s((aqtl)c2.get(n2))) {
                    aqtl aqtl = this.c.get(n);
                    final aqtl aqtl2 = this.c.get(n2);
                    final int j = aqtl.j;
                    if (j == 0) {
                        throw null;
                    }
                    final int i = aqtl2.j;
                    if (i != 0) {
                        aqtl aqtl3;
                        if (j - 1 > i - 1) {
                            this.c.set(n2, aqtl);
                            aqtl3 = aqtl2;
                        }
                        else {
                            aqtl3 = aqtl;
                            aqtl = aqtl2;
                        }
                        r(aqtl, aqtl3);
                        this.g(aqtl3);
                        this.d();
                        return true;
                    }
                    throw null;
                }
            }
        }
        if (size >= 2) {
            final aqtf c3 = this.c;
            final int n3 = size - 1;
            final aqtl aqtl4 = c3.get(n3);
            final aqtf c4 = this.c;
            final int n4 = size - 2;
            final aqtl aqtl5 = c4.get(n4);
            if (aqtl5.j == 21) {
                if (size >= 3) {
                    w((aqtl)this.c.get(size - 3));
                }
                this.c.set(n4, aqtl4);
                this.c.set(n3, aqtl5);
                return true;
            }
        }
        return false;
    }
    
    public final aqtl l(final int j) {
        aqtl g = this.g;
        if (g != null) {
            final aqtl[] c = g.c;
            if (c != null && c.length > 0) {
                this.g = c[0];
                g.b = 0;
                g.c = aqtl.a;
                g.d = null;
                g.f = 0;
                g.e = 0;
                g.g = 0;
                g.h = null;
                g.j = j;
                return g;
            }
        }
        g = new aqtl(j);
        return g;
    }
    
    public final aqtl m(final int n) {
        final aqtl l = this.l(n);
        l.b = this.b;
        return this.e(l);
    }
    
    public final void n(final int n, final int e, final int f, final int n2, final aqtg aqtg, int size) {
        int b;
        final int n3 = b = this.b;
        if ((n3 & 0x40) != 0x0) {
            b = n3;
            if (aqtg.i()) {
                b = n3;
                if (aqtg.g('?')) {
                    aqtg.e(1);
                    b = (n3 ^ 0x20);
                }
            }
            if (size != -1) {
                throw new aqtj("invalid nested repetition operator", aqtg.c(size));
            }
        }
        size = this.c.size();
        if (size == 0) {
            throw new aqtj("missing argument to repetition operator", aqtg.c(n2));
        }
        final aqtf c = this.c;
        --size;
        final aqtl aqtl = c.get(size);
        if (!aqsy.e(aqtl.j)) {
            final aqtl l = this.l(n);
            l.e = e;
            l.f = f;
            l.b = b;
            l.c = new aqtl[] { aqtl };
            this.c.set(size, l);
            return;
        }
        throw new aqtj("missing argument to repetition operator", aqtg.c(n2));
    }
    
    public final void o() {
        final aqtl[] u = this.u();
        final int length = u.length;
        if (length > 0) {
            w(u[length - 1]);
            this.e(this.v(u, 19));
            return;
        }
        this.e(this.l(1));
    }
    
    public final void p() {
        this.t(-1, 0);
        final aqtl[] u = this.u();
        if (u.length == 0) {
            this.e(this.l(2));
            return;
        }
        this.e(this.v(u, 18));
    }
}
