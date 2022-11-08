import java.util.Collections;
import java.util.Arrays;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class btr
{
    public final List a;
    public final int b;
    public final float c;
    public final String d;
    
    private btr(final List a, final int b, final float c, final String d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static btr a(final bar bar) {
        try {
            bar.H(21);
            final int n = bar.i() & 0x3;
            final int i = bar.i();
            final int b = bar.b;
            int j = 0;
            int n2 = 0;
            while (j < i) {
                bar.H(1);
                for (int m = bar.m(), k = 0; k < m; ++k) {
                    final int l = bar.m();
                    n2 += l + 4;
                    bar.H(l);
                }
                ++j;
            }
            bar.G(b);
            byte[] array = new byte[n2];
            String s = null;
            int n3 = 0;
            float n4 = 1.0f;
            int n5 = 0;
            final int n6 = n2;
            bar bar2 = bar;
            while (n3 < i) {
                int n7 = bar.i() & 0x3F;
                final int m2 = bar.m();
                int n8 = 0;
                String c = s;
                final byte[] array2 = array;
                while (n8 < m2) {
                    final int m3 = bar.m();
                    System.arraycopy(btw.a, 0, array2, n5, 4);
                    final int n9 = n5 + 4;
                    System.arraycopy(bar2.a, bar2.b, array2, n9, m3);
                    int n56;
                    int n58;
                    int n59;
                    int n60;
                    if (n7 == 33 && n8 == 0) {
                        final chr chr = new chr(array2, n9 + 2, n9 + m3);
                        chr.j(4);
                        final int f = chr.f(3);
                        chr.i();
                        final int f2 = chr.f(2);
                        final boolean k2 = chr.k();
                        final int f3 = chr.f(5);
                        int n10 = 0;
                        int n11 = 0;
                        while (n10 < 32) {
                            int n12 = n11;
                            if (chr.k()) {
                                n12 = (n11 | 1 << n10);
                            }
                            ++n10;
                            n11 = n12;
                        }
                        final int[] array3 = new int[6];
                        for (int n13 = 0; n13 < 6; ++n13) {
                            array3[n13] = chr.f(8);
                        }
                        final int f4 = chr.f(8);
                        int n14 = 0;
                        int n15 = 0;
                        while (n14 < f) {
                            int n16 = n15;
                            if (chr.k()) {
                                n16 = n15 + 89;
                            }
                            n15 = n16;
                            if (chr.k()) {
                                n15 = n16 + 8;
                            }
                            ++n14;
                        }
                        chr.j(n15);
                        if (f > 0) {
                            final int n17 = 8 - f;
                            chr.j(n17 + n17);
                        }
                        chr.g();
                        if (chr.g() == 3) {
                            chr.i();
                        }
                        chr.g();
                        chr.g();
                        if (chr.k()) {
                            chr.g();
                            chr.g();
                            chr.g();
                            chr.g();
                        }
                        chr.g();
                        chr.g();
                        final int g = chr.g();
                        int n18;
                        if (!chr.k()) {
                            n18 = f;
                        }
                        else {
                            n18 = 0;
                        }
                        while (n18 <= f) {
                            chr.g();
                            chr.g();
                            chr.g();
                            ++n18;
                        }
                        chr.g();
                        chr.g();
                        chr.g();
                        chr.g();
                        chr.g();
                        chr.g();
                        int n19 = n7;
                        if (chr.k()) {
                            n19 = n7;
                            if (chr.k()) {
                                int n20 = 0;
                                while (true) {
                                    n19 = n7;
                                    if (n20 >= 4) {
                                        break;
                                    }
                                    int n23;
                                    for (int n21 = 0; n21 < 6; n21 += n23) {
                                        if (!chr.k()) {
                                            chr.g();
                                        }
                                        else {
                                            final int min = Math.min(64, 1 << n20 + n20 + 4);
                                            if (n20 > 1) {
                                                chr.h();
                                            }
                                            for (int n22 = 0; n22 < min; ++n22) {
                                                chr.h();
                                            }
                                        }
                                        if (n20 == 3) {
                                            n23 = 3;
                                        }
                                        else {
                                            n23 = 1;
                                        }
                                    }
                                    ++n20;
                                }
                            }
                        }
                        final int n24 = n19;
                        chr.j(2);
                        if (chr.k()) {
                            chr.j(8);
                            chr.g();
                            chr.g();
                            chr.i();
                        }
                        final int g2 = chr.g();
                        int[] array4 = new int[0];
                        int[] copy = new int[0];
                        int n25 = 0;
                        int n26 = -1;
                        int n27 = -1;
                        final int n28 = m3;
                        while (n25 < g2) {
                            int g3;
                            int n52;
                            if (n25 != 0 && chr.k()) {
                                final int n29 = n26 + n27;
                                final int k3 = chr.k() ? 1 : 0;
                                final int n30 = (1 - (k3 + k3)) * (chr.g() + 1);
                                final int n31 = n29 + 1;
                                final boolean[] array5 = new boolean[n31];
                                for (int n32 = 0; n32 <= n29; ++n32) {
                                    if (!chr.k()) {
                                        array5[n32] = chr.k();
                                    }
                                    else {
                                        array5[n32] = true;
                                    }
                                }
                                final int[] array6 = new int[n31];
                                final int[] array7 = new int[n31];
                                int n33 = n27 - 1;
                                int n34 = 0;
                                while (n33 >= 0) {
                                    final int n35 = copy[n33] + n30;
                                    int n36 = n34;
                                    if (n35 < 0) {
                                        n36 = n34;
                                        if (array5[n26 + n33]) {
                                            array6[n34] = n35;
                                            n36 = n34 + 1;
                                        }
                                    }
                                    --n33;
                                    n34 = n36;
                                }
                                int n37 = n34;
                                if (n30 < 0) {
                                    n37 = n34;
                                    if (array5[n29]) {
                                        array6[n34] = n30;
                                        n37 = n34 + 1;
                                    }
                                }
                                int n38 = n37;
                                int n41;
                                for (int n39 = 0; n39 < n26; ++n39, n38 = n41) {
                                    final int n40 = array4[n39] + n30;
                                    n41 = n38;
                                    if (n40 < 0) {
                                        n41 = n38;
                                        if (array5[n39]) {
                                            array6[n38] = n40;
                                            n41 = n38 + 1;
                                        }
                                    }
                                }
                                final int[] copy2 = Arrays.copyOf(array6, n38);
                                int n42 = n26 - 1;
                                int n43 = 0;
                                while (n42 >= 0) {
                                    final int n44 = array4[n42] + n30;
                                    int n45 = n43;
                                    if (n44 > 0) {
                                        n45 = n43;
                                        if (array5[n42]) {
                                            array7[n43] = n44;
                                            n45 = n43 + 1;
                                        }
                                    }
                                    --n42;
                                    n43 = n45;
                                }
                                int n46 = n43;
                                if (n30 > 0) {
                                    n46 = n43;
                                    if (array5[n29]) {
                                        array7[n43] = n30;
                                        n46 = n43 + 1;
                                    }
                                }
                                int n47 = n46;
                                int n50;
                                for (int n48 = 0; n48 < n27; ++n48, n47 = n50) {
                                    final int n49 = copy[n48] + n30;
                                    n50 = n47;
                                    if (n49 > 0) {
                                        n50 = n47;
                                        if (array5[n26 + n48]) {
                                            array7[n47] = n49;
                                            n50 = n47 + 1;
                                        }
                                    }
                                }
                                copy = Arrays.copyOf(array7, n47);
                                final int n51 = n47;
                                array4 = copy2;
                                g3 = n38;
                                n52 = n51;
                            }
                            else {
                                g3 = chr.g();
                                final int g4 = chr.g();
                                array4 = new int[g3];
                                for (int n53 = 0; n53 < g3; ++n53) {
                                    array4[n53] = chr.g() + 1;
                                    chr.i();
                                }
                                copy = new int[g4];
                                for (int n54 = 0; n54 < g4; ++n54) {
                                    copy[n54] = chr.g() + 1;
                                    chr.i();
                                }
                                n52 = g4;
                            }
                            ++n25;
                            n26 = g3;
                            n27 = n52;
                        }
                        final int n55 = n28;
                        n56 = n3;
                        if (chr.k()) {
                            for (int n57 = 0; n57 < chr.g(); ++n57) {
                                chr.j(g + 5);
                            }
                        }
                        chr.j(2);
                        if (chr.k()) {
                            Label_1618: {
                                if (chr.k()) {
                                    final int f5 = chr.f(8);
                                    if (f5 == 255) {
                                        final int f6 = chr.f(16);
                                        final int f7 = chr.f(16);
                                        if (f6 != 0 && f7 != 0) {
                                            n4 = f6 / (float)f7;
                                            break Label_1618;
                                        }
                                    }
                                    else {
                                        if (f5 < 17) {
                                            n4 = btw.b[f5];
                                            break Label_1618;
                                        }
                                        final StringBuilder sb = new StringBuilder();
                                        sb.append("Unexpected aspect_ratio_idc value: ");
                                        sb.append(f5);
                                        bao.c("NalUnitUtil", sb.toString());
                                    }
                                }
                                n4 = 1.0f;
                            }
                            if (chr.k()) {
                                chr.i();
                            }
                            if (chr.k()) {
                                chr.j(4);
                                if (chr.k()) {
                                    chr.j(24);
                                }
                            }
                            if (chr.k()) {
                                chr.g();
                                chr.g();
                            }
                            chr.i();
                            chr.k();
                        }
                        else {
                            n4 = 1.0f;
                        }
                        c = bad.c(f2, k2, f3, n11, array3, f4);
                        n58 = 0;
                        n59 = n24;
                        n60 = n55;
                    }
                    else {
                        n60 = m3;
                        final int n61 = n3;
                        n59 = n7;
                        n56 = n61;
                        n58 = n8;
                    }
                    final int n62 = n9 + n60;
                    bar2 = bar;
                    bar2.H(n60);
                    ++n58;
                    final int n63 = n59;
                    n3 = n56;
                    n5 = n62;
                    n7 = n63;
                    n8 = n58;
                }
                ++n3;
                array = array2;
                s = c;
            }
            Object o;
            if (n6 == 0) {
                o = Collections.emptyList();
            }
            else {
                o = Collections.singletonList(array);
            }
            return new btr((List)o, n + 1, n4, s);
        }
        catch (final ArrayIndexOutOfBoundsException ex) {
            throw ayz.a("Error parsing HEVC config", (Throwable)ex);
        }
    }
}
