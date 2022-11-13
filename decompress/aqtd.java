import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

final class aqtd
{
    public static final int a = 0;
    private static final int[] b;
    private static final int[] c;
    
    static {
        b = new int[] { 0, 9, 11, 1114111 };
        c = new int[] { 0, 1114111 };
    }
    
    public static final aqtc a(final aqtl aqtl, final aqtk aqtk) {
        final int j = aqtl.j;
        final aqtc aqtc = null;
        final aqtc aqtc2 = null;
        aqtc aqtc3 = null;
        Label_0764: {
            if (j == 0) {
                break Label_0764;
            }
            boolean b = true;
            final boolean b2 = true;
            int i = 0;
            final int n = 0;
            Label_0760: {
                switch (j - 1) {
                    default: {
                        throw new IllegalStateException("regexp: unhandled case in compile");
                    }
                    case 18: {
                        final aqtl[] c = aqtl.c;
                        final int length = c.length;
                        if (length != 0) {
                            aqtc b3;
                            for (int k = n; k < length; ++k, aqtc3 = b3) {
                                final aqtc a = a(c[k], aqtk);
                                if (aqtc3 != null) {
                                    if (aqtc3.a != 0) {
                                        b3 = aqtc3;
                                        if (a.a != 0) {
                                            b3 = b(1, aqtk);
                                            final aqte b4 = aqtk.b(b3.a);
                                            b4.b = aqtc3.a;
                                            b4.c = a.a;
                                            b3.b = aqtk.a(aqtc3.b, a.b);
                                        }
                                        continue;
                                    }
                                }
                                b3 = a;
                            }
                            return aqtc3;
                        }
                        return f(aqtk);
                    }
                    case 17: {
                        final aqtl[] c2 = aqtl.c;
                        final int length2 = c2.length;
                        if (length2 != 0) {
                            aqtc d = aqtc;
                            while (i < length2) {
                                final aqtc a2 = a(c2[i], aqtk);
                                if (d == null) {
                                    d = a2;
                                }
                                else {
                                    d = d(d, a2, aqtk);
                                }
                                ++i;
                            }
                            return d;
                        }
                        return f(aqtk);
                    }
                    case 15: {
                        final aqtc a3 = a(aqtl.c[0], aqtk);
                        final int b5 = aqtl.b;
                        final aqtc b6 = b(1, aqtk);
                        final aqte b7 = aqtk.b(b6.a);
                        int n2;
                        if ((b5 & 0x20) != 0x0) {
                            b7.c = a3.a;
                            final int a4 = b6.a;
                            n2 = a4 + a4;
                            b6.b = n2;
                        }
                        else {
                            b7.b = a3.a;
                            final int a5 = b6.a;
                            n2 = (a5 + a5 | 0x1);
                            b6.b = n2;
                        }
                        b6.b = aqtk.a(n2, a3.b);
                        return b6;
                    }
                    case 14: {
                        final aqtc a6 = a(aqtl.c[0], aqtk);
                        return new aqtc(a6.a, h(a6, (aqtl.b & 0x20) != 0x0 && b2, aqtk).b);
                    }
                    case 13: {
                        final aqtc a7 = a(aqtl.c[0], aqtk);
                        if ((aqtl.b & 0x20) == 0x0) {
                            b = false;
                        }
                        return h(a7, b, aqtk);
                    }
                    case 12: {
                        break;
                    }
                    case 11: {
                        break Label_0760;
                    }
                    case 10: {
                        break Label_0760;
                    }
                    case 9: {
                        break Label_0760;
                    }
                    case 8: {
                        break Label_0760;
                    }
                    case 7: {
                        break Label_0760;
                    }
                    case 6: {
                        break Label_0760;
                    }
                    case 5: {
                        break Label_0760;
                    }
                    case 4: {
                        break Label_0760;
                    }
                    case 3: {
                        break Label_0760;
                    }
                    case 2: {
                        break Label_0760;
                    }
                    case 1: {
                        break Label_0760;
                    }
                    case 0: {
                        break Label_0760;
                    }
                }
                final int g = aqtl.g;
                final aqtc c3 = c(g + g, aqtk);
                final aqtl aqtl2 = aqtl.c[0];
                try {
                    final aqtc a8 = a(aqtl2, aqtk);
                    final int g2 = aqtl.g;
                    return d(d(c3, a8, aqtk), c(g2 + g2 | 0x1, aqtk), aqtk);
                    return e(4, aqtk);
                    return e(2, aqtk);
                    return f(aqtk);
                    int n3 = 0;
                    int length3;
                    aqtc d2 = null;
                    aqtc g3;
                    int[] d3 = null;
                    Label_0686:Block_16_Outer:
                    while (true) {
                        Block_14: {
                            while (true) {
                            Block_15:
                                while (true) {
                                    ++n3;
                                    break Label_0686;
                                    Label_0750: {
                                        return f(aqtk);
                                    }
                                    return e(16, aqtk);
                                    return e(8, aqtk);
                                    return g(aqtd.b, 0, aqtk);
                                    throw null;
                                    return g(aqtl.d, aqtl.b, aqtk);
                                    iftrue(Label_0747:)(n3 >= length3);
                                    break Block_15;
                                    Label_0731:
                                    d2 = d(d2, g3, aqtk);
                                    continue Block_16_Outer;
                                    d3 = aqtl.d;
                                    length3 = d3.length;
                                    iftrue(Label_0750:)(length3 == 0);
                                    break Block_14;
                                    Label_0747:
                                    return d2;
                                    return e(1, aqtk);
                                    return e(32, aqtk);
                                    d2 = g3;
                                    continue Block_16_Outer;
                                }
                                g3 = g(new int[] { d3[n3] }, aqtl.b, aqtk);
                                iftrue(Label_0731:)(d2 != null);
                                continue;
                            }
                        }
                        n3 = 0;
                        d2 = aqtc2;
                        continue Label_0686;
                    }
                    return g(aqtd.c, 0, aqtk);
                    return i();
                }
                finally {
                    while (true) {}
                }
            }
        }
    }
    
    public static final aqtc b(int b, final aqtk aqtk) {
        final int b2 = aqtk.b;
        final aqte[] a = aqtk.a;
        final int length = a.length;
        if (b2 >= length) {
            aqtk.a = Arrays.copyOf(a, length + length);
        }
        final aqte[] a2 = aqtk.a;
        final int b3 = aqtk.b;
        a2[b3] = new aqte(b);
        b = b3 + 1;
        aqtk.b = b;
        return new aqtc(b - 1, 0);
    }
    
    private static final aqtc c(int n, final aqtk aqtk) {
        final aqtc b = b(3, aqtk);
        final int a = b.a;
        b.b = a + a;
        aqtk.b(a).c = n;
        final int d = aqtk.d;
        ++n;
        if (d < n) {
            aqtk.d = n;
        }
        return b;
    }
    
    private static final aqtc d(final aqtc aqtc, final aqtc aqtc2, final aqtk aqtk) {
        if (aqtc.a != 0) {
            final int a = aqtc2.a;
            if (a != 0) {
                aqtk.d(aqtc.b, a);
                return new aqtc(aqtc.a, aqtc2.b);
            }
        }
        return i();
    }
    
    private static final aqtc e(int a, final aqtk aqtk) {
        final aqtc b = b(4, aqtk);
        aqtk.b(b.a).c = a;
        a = b.a;
        b.b = a + a;
        return b;
    }
    
    private static final aqtc f(final aqtk aqtk) {
        final aqtc b = b(7, aqtk);
        final int a = b.a;
        b.b = a + a;
        return b;
    }
    
    private static final aqtc g(final int[] d, int c, final aqtk aqtk) {
        final aqtc b = b(8, aqtk);
        final aqte b2 = aqtk.b(b.a);
        b2.d = d;
        int length = d.length;
        if (length == 1) {
            c &= 0x1;
            if (aqsx.c(d[0]) == d[0]) {
                c = 0;
            }
            length = 1;
        }
        else {
            c = 0;
        }
        b2.c = c;
        final int a = b.a;
        b.b = a + a;
        if ((c == 0 && length == 1) || (length == 2 && d[0] == d[1])) {
            b2.a = 9;
        }
        else if (length == 2 && d[0] == 0 && d[1] == 1114111) {
            b2.a = 10;
        }
        else if (length == 4 && d[0] == 0 && d[1] == 9 && d[2] == 11 && d[3] == 1114111) {
            b2.a = 11;
        }
        return b;
    }
    
    private static final aqtc h(final aqtc aqtc, final boolean b, final aqtk aqtk) {
        final aqtc b2 = b(1, aqtk);
        final aqte b3 = aqtk.b(b2.a);
        if (b) {
            b3.c = aqtc.a;
            final int a = b2.a;
            b2.b = a + a;
        }
        else {
            b3.b = aqtc.a;
            final int a2 = b2.a;
            b2.b = (a2 + a2 | 0x1);
        }
        aqtk.d(aqtc.b, b2.a);
        return b2;
    }
    
    private static final aqtc i() {
        return new aqtc(0, 0);
    }
}
