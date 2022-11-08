// 
// Decompiled by Procyon v0.6.0
// 

public final class atzj
{
    static {
        atzi.c("0123456789abcdef");
    }
    
    public static final boolean a(atze f, int n, final byte[] array, final int n2) {
        f.getClass();
        array.getClass();
        int c = f.c;
        byte[] array2 = f.a;
        int i = 1;
        atze atze = f;
        while (i < n2) {
            int c2 = c;
            f = atze;
            int b;
            if ((b = n) == c) {
                f = atze.f;
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
            atze = f;
        }
        return true;
    }
    
    public static final int b(final atyu atyu, final atzb atzb) {
        final atze a = atyu.a;
        if (a == null) {
            return -2;
        }
        byte[] a2 = a.a;
        int n = a.b;
        int n2 = a.c;
        final int[] c = atzb.c;
        atze atze = a;
        int n3 = 0;
        int n4 = -1;
    Label_0223:
        while (true) {
            final int n5 = n3 + 1;
            final int n6 = c[n3];
            final int n7 = n5 + 1;
            final int n8 = c[n5];
            if (n8 != -1) {
                n4 = n8;
            }
            if (atze == null) {
                break;
            }
            byte[] array = null;
            int n11 = 0;
            Label_0418: {
                if (n6 >= 0) {
                    final int n9 = n + 1;
                    final byte b = a2[n];
                    int i = n7;
                    while (i != n7 + n6) {
                        if ((b & 0xFF) == c[i]) {
                            final int n10 = c[i + n6];
                            if (n9 == n2) {
                                final atze f = atze.f;
                                f.getClass();
                                n = f.b;
                                array = f.a;
                                n2 = f.c;
                                atze atze2;
                                if ((atze2 = f) == a) {
                                    atze2 = null;
                                }
                                n11 = n10;
                                atze = atze2;
                                break Label_0418;
                            }
                            n = n9;
                            n11 = n10;
                            array = a2;
                            break Label_0418;
                        }
                        else {
                            ++i;
                        }
                    }
                    return n4;
                }
                final int n12 = -n6;
                int n13 = n7;
                int n14 = n2;
                array = a2;
                int n16;
                atze f2;
                int n19;
                int n20;
                while (true) {
                    final int n15 = n + 1;
                    n16 = n13 + 1;
                    if ((array[n] & 0xFF) != c[n13]) {
                        return n4;
                    }
                    final int n17 = 1;
                    final boolean b2 = n16 == n7 + n12;
                    int n18;
                    if (n15 == n14) {
                        atze.getClass();
                        f2 = atze.f;
                        f2.getClass();
                        final int b3 = f2.b;
                        array = f2.a;
                        final int c2 = f2.c;
                        if (f2 == a) {
                            if (!b2) {
                                break Label_0223;
                            }
                            f2 = null;
                            n18 = n17;
                            n19 = b3;
                            n20 = c2;
                        }
                        else {
                            n18 = (b2 ? 1 : 0);
                            n19 = b3;
                            n20 = c2;
                        }
                    }
                    else {
                        final boolean b4 = b2;
                        n20 = n14;
                        n19 = n15;
                        f2 = atze;
                        n18 = (b4 ? 1 : 0);
                    }
                    if (n18 != 0) {
                        break;
                    }
                    n14 = n20;
                    n13 = n16;
                    n = n19;
                    atze = f2;
                }
                n11 = c[n16];
                final int n21 = n20;
                n = n19;
                n2 = n21;
                atze = f2;
            }
            if (n11 >= 0) {
                return n11;
            }
            n3 = -n11;
            a2 = array;
        }
        return -2;
    }
}
