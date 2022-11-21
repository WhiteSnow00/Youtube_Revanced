// 
// Decompiled by Procyon v0.6.0
// 

public final class aucv
{
    static {
        aucu.a("0123456789abcdef");
    }
    
    public static final boolean a(aucq f, int n, final byte[] array, final int n2) {
        f.getClass();
        array.getClass();
        int c = f.c;
        byte[] a = f.a;
        int i = 1;
        aucq aucq = f;
        while (i < n2) {
            int c2 = c;
            f = aucq;
            int b;
            if ((b = n) == c) {
                f = aucq.f;
                f.getClass();
                final byte[] a2 = f.a;
                b = f.b;
                c2 = f.c;
                a = a2;
            }
            if (a[b] != array[i]) {
                return false;
            }
            n = b + 1;
            ++i;
            c = c2;
            aucq = f;
        }
        return true;
    }
    
    public static final int b(final aucg aucg, final aucn aucn) {
        final aucq a = aucg.a;
        if (a == null) {
            return -2;
        }
        byte[] a2 = a.a;
        int b = a.b;
        int c = a.c;
        final int[] b2 = aucn.b;
        aucq aucq = a;
        int n = 0;
        int n2 = -1;
    Label_0210:
        while (true) {
            final int n3 = b2[n];
            int n4 = n + 1;
            final int n5 = b2[n4];
            if (n5 != -1) {
                n2 = n5;
            }
            if (aucq == null) {
                break;
            }
            ++n4;
            int n8 = 0;
            byte[] array = null;
            int n9 = 0;
            int n10 = 0;
            aucq aucq3 = null;
            Label_0387: {
                if (n3 >= 0) {
                    final int n6 = b + 1;
                    final byte b3 = a2[b];
                    int i = n4;
                    while (i != n4 + n3) {
                        if ((b3 & 0xFF) == b2[i]) {
                            final int n7 = b2[i + n3];
                            if (n6 == c) {
                                final aucq f = aucq.f;
                                f.getClass();
                                n8 = f.b;
                                array = f.a;
                                n9 = f.c;
                                aucq aucq2;
                                if ((aucq2 = f) == a) {
                                    aucq2 = null;
                                }
                                n10 = n7;
                                aucq3 = aucq2;
                                break Label_0387;
                            }
                            n9 = c;
                            n8 = n6;
                            aucq3 = aucq;
                            n10 = n7;
                            array = a2;
                            break Label_0387;
                        }
                        else {
                            ++i;
                        }
                    }
                    return n2;
                }
                final int n11 = -n3;
                int n12 = n4;
                byte[] array2 = a2;
                int n14;
                aucq f2;
                while (true) {
                    final int n13 = b + 1;
                    final byte b4 = array2[b];
                    n14 = n12 + 1;
                    if ((b4 & 0xFF) != b2[n12]) {
                        return n2;
                    }
                    int n15;
                    if (n14 == n4 + n11) {
                        n15 = 1;
                    }
                    else {
                        n15 = 0;
                    }
                    if (n13 == c) {
                        aucq.getClass();
                        f2 = aucq.f;
                        f2.getClass();
                        n8 = f2.b;
                        array = f2.a;
                        n9 = f2.c;
                        if (f2 == a) {
                            if (n15 == 0) {
                                break Label_0210;
                            }
                            f2 = null;
                            n15 = 1;
                        }
                    }
                    else {
                        f2 = aucq;
                        n9 = c;
                        n8 = n13;
                        array = array2;
                    }
                    if (n15 != 0) {
                        break;
                    }
                    final int n16 = n9;
                    final int n17 = n14;
                    array2 = array;
                    b = n8;
                    c = n16;
                    n12 = n17;
                    aucq = f2;
                }
                n10 = b2[n14];
                aucq3 = f2;
            }
            if (n10 >= 0) {
                return n10;
            }
            final int n18 = -n10;
            final int n19 = n8;
            c = n9;
            a2 = array;
            b = n19;
            n = n18;
            aucq = aucq3;
        }
        return -2;
    }
}
