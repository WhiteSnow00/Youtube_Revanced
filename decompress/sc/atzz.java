// 
// Decompiled by Procyon v0.6.0
// 

public final class atzz
{
    static {
        atzy.c("0123456789abcdef");
    }
    
    public static final boolean a(atzu f, int n, final byte[] array, final int n2) {
        f.getClass();
        array.getClass();
        int c = f.c;
        byte[] array2 = f.a;
        int i = 1;
        atzu atzu = f;
        while (i < n2) {
            int c2 = c;
            f = atzu;
            int b;
            if ((b = n) == c) {
                f = atzu.f;
                f.getClass();
                array2 = f.a;
                b = f.b;
                c2 = f.c;
            }
            if (array2[b] != array[i]) {
                return false;
            }
            n = b + 1;
            ++i;
            c = c2;
            atzu = f;
        }
        return true;
    }
    
    public static final int b(final atzk atzk, final atzr atzr) {
        final atzu a = atzk.a;
        if (a == null) {
            return -2;
        }
        final byte[] a2 = a.a;
        int n = a.b;
        int n2 = a.c;
        final int[] c = atzr.c;
        atzu f = a;
        int n3 = 0;
        int n4 = -1;
        byte[] array = a2;
    Label_0210:
        while (true) {
            final int n5 = c[n3];
            int n6 = n3 + 1;
            final int n7 = c[n6];
            if (n7 != -1) {
                n4 = n7;
            }
            if (f == null) {
                break;
            }
            ++n6;
            int n10 = 0;
            Label_0368: {
                if (n5 >= 0) {
                    final int n8 = n + 1;
                    final byte b = array[n];
                    int i = n6;
                    while (i != n6 + n5) {
                        if ((b & 0xFF) == c[i]) {
                            final int n9 = c[i + n5];
                            if (n8 == n2) {
                                final atzu f2 = f.f;
                                f2.getClass();
                                n = f2.b;
                                array = f2.a;
                                n2 = f2.c;
                                if ((f = f2) == a) {
                                    f = null;
                                }
                                n10 = n9;
                                break Label_0368;
                            }
                            n = n8;
                            n10 = n9;
                            break Label_0368;
                        }
                        else {
                            ++i;
                        }
                    }
                    return n4;
                }
                final int n11 = -n5;
                int n12 = n6;
                int n14;
                int b3;
                int c2;
                while (true) {
                    final int n13 = n + 1;
                    final byte b2 = array[n];
                    n14 = n12 + 1;
                    if ((b2 & 0xFF) != c[n12]) {
                        return n4;
                    }
                    int n15;
                    if (n14 == n6 + n11) {
                        n15 = 1;
                    }
                    else {
                        n15 = 0;
                    }
                    if (n13 == n2) {
                        f.getClass();
                        f = f.f;
                        f.getClass();
                        b3 = f.b;
                        array = f.a;
                        c2 = f.c;
                        if (f == a) {
                            if (n15 == 0) {
                                break Label_0210;
                            }
                            f = null;
                            n15 = 1;
                        }
                    }
                    else {
                        c2 = n2;
                        b3 = n13;
                    }
                    if (n15 != 0) {
                        break;
                    }
                    final int n16 = b3;
                    n2 = c2;
                    n12 = n14;
                    n = n16;
                }
                n10 = c[n14];
                final int n17 = c2;
                n = b3;
                n2 = n17;
            }
            if (n10 >= 0) {
                return n10;
            }
            n3 = -n10;
        }
        return -2;
    }
}
