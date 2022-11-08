import android.util.Log;
import com.google.android.exoplayer.ColorInfo;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.google.android.exoplayer.MediaFormat;
import android.util.Pair;

// 
// Decompiled by Procyon v0.6.0
// 

final class ltp
{
    private static final int a;
    
    static {
        a = lwj.c("cenc");
    }
    
    public static lsq a(final ltj ltj, final boolean b) {
        final lsq lsq = null;
        if (b) {
            return null;
        }
        final lwg a = ltj.a;
        a.x(8);
        while (a.a() >= 8) {
            final int c = a.c();
            if (a.c() == ltk.aC) {
                a.x(a.a - 8);
                a.w(a.a + c);
                a.y(12);
                final lwg lwg = new lwg();
                lsq a2 = null;
            Label_0337_Outer:
                while (true) {
                    a2 = lsq;
                    if (a.a() < 8) {
                        break;
                    }
                    final int n = a.c() - 8;
                    Label_0347: {
                        if (a.c() == ltk.aD) {
                            lwg.v((byte[])a.c, a.a + n);
                            lwg.x(a.a);
                            while (true) {
                                while (lwg.a() > 0) {
                                    final int n2 = lwg.a + lwg.c();
                                    if (lwg.c() == ltk.aP) {
                                        String p2 = null;
                                        String p4;
                                        String p3 = p4 = p2;
                                        while (lwg.a < n2) {
                                            final int n3 = lwg.c() - 12;
                                            final int c2 = lwg.c();
                                            lwg.y(4);
                                            if (c2 == ltk.aE) {
                                                p4 = lwg.p(n3);
                                            }
                                            else if (c2 == ltk.aF) {
                                                p2 = lwg.p(n3);
                                            }
                                            else if (c2 == ltk.aG) {
                                                lwg.y(4);
                                                p3 = lwg.p(n3 - 4);
                                            }
                                            else {
                                                lwg.y(n3);
                                            }
                                        }
                                        if (p2 == null || p3 == null || !"com.apple.iTunes".equals(p4)) {
                                            continue Label_0337_Outer;
                                        }
                                        a2 = lsq.a(p2, p3);
                                        if (a2 == null) {
                                            break Label_0347;
                                        }
                                        break Label_0337_Outer;
                                    }
                                    else {
                                        lwg.x(n2);
                                    }
                                }
                                a2 = null;
                                continue;
                            }
                        }
                    }
                    a.y(n);
                }
                return a2;
            }
            a.y(c - 8);
        }
        return null;
    }
    
    public static ltt b(lti a, final ltj ltj, long n, final boolean b) {
        final lti a2 = a.a(ltk.H);
        final lwg a3 = a2.b(ltk.V).a;
        a3.x(16);
        final int c = a3.c();
        if (c != ltt.b && c != ltt.a && c != ltt.c && c != ltt.d && c != ltt.e && c != ltt.f) {
            return null;
        }
        final lwg a4 = a.b(ltk.R).a;
        a4.x(8);
        final int f = ltk.f(a4.c());
        int n2;
        if (f == 0) {
            n2 = 8;
        }
        else {
            n2 = 16;
        }
        a4.y(n2);
        final int c2 = a4.c();
        a4.y(4);
        final int a5 = a4.a;
        int n3;
        if (f == 0) {
            n3 = 4;
        }
        else {
            n3 = 8;
        }
        int n4 = 0;
        long n5 = 0L;
        long n7 = 0L;
        Label_0263: {
            while (true) {
                n5 = -1L;
                if (n4 >= n3) {
                    a4.y(n3);
                    break;
                }
                if (((byte[])a4.c)[a5 + n4] != -1) {
                    long n6;
                    if (f == 0) {
                        n6 = a4.n();
                    }
                    else {
                        n6 = a4.o();
                    }
                    n7 = n6;
                    if (n6 == 0L) {
                        break;
                    }
                    break Label_0263;
                }
                else {
                    ++n4;
                }
            }
            n7 = -1L;
        }
        a4.y(16);
        final int c3 = a4.c();
        final int c4 = a4.c();
        a4.y(4);
        final int c5 = a4.c();
        final int c6 = a4.c();
        final int n8 = 65536;
        int n9 = c3;
        int n10 = c4;
        int n11 = c5;
        int n12 = 0;
        Label_0497: {
            if (c3 == 0) {
                if (c4 == 65536) {
                    if (c5 == -65536) {
                        if (c6 == 0) {
                            n12 = 90;
                            break Label_0497;
                        }
                        n9 = 0;
                        n10 = 65536;
                        n11 = -65536;
                    }
                    else {
                        n9 = 0;
                        n10 = 65536;
                        n11 = c5;
                    }
                }
                else {
                    n9 = 0;
                    n11 = c5;
                    n10 = c4;
                }
            }
            int n13;
            int n14;
            if (n9 == 0) {
                if (n10 == -65536) {
                    if (n11 == 65536) {
                        n13 = n8;
                        if (c6 == 0) {
                            n12 = 270;
                            break Label_0497;
                        }
                    }
                    else {
                        n13 = n11;
                    }
                    n14 = 0;
                    n10 = -65536;
                }
                else {
                    n13 = n11;
                    n14 = 0;
                }
            }
            else {
                final int n15 = n11;
                n14 = n9;
                n13 = n15;
            }
            if (n14 == -65536 && n10 == 0 && n13 == 0 && c6 == -65536) {
                n12 = 180;
            }
            else {
                n12 = 0;
            }
        }
        if (n == -1L) {
            n = n7;
        }
        final lwg a6 = ltj.a;
        a6.x(8);
        int n16;
        if (ltk.f(a6.c()) == 0) {
            n16 = 8;
        }
        else {
            n16 = 16;
        }
        a6.y(n16);
        final long n17 = a6.n();
        if (n == -1L) {
            n = n5;
        }
        else {
            n = lwj.g(n, 1000000L, n17);
        }
        final lti a7 = a2.a(ltk.I).a(ltk.J);
        final lwg a8 = a2.b(ltk.U).a;
        a8.x(8);
        final int f2 = ltk.f(a8.c());
        int n18;
        if (f2 == 0) {
            n18 = 8;
        }
        else {
            n18 = 16;
        }
        a8.y(n18);
        final long n19 = a8.n();
        int n20;
        if (f2 == 0) {
            n20 = 4;
        }
        else {
            n20 = 8;
        }
        a8.y(n20);
        final int k = a8.k();
        final StringBuilder sb = new StringBuilder();
        sb.append((char)((k >> 10 & 0x1F) + 96));
        sb.append((char)((k >> 5 & 0x1F) + 96));
        sb.append((char)((k & 0x1F) + 96));
        final Pair create = Pair.create((Object)n19, (Object)sb.toString());
        final lwg a9 = a7.b(ltk.W).a;
        String s = (String)create.second;
        a9.x(12);
        final int c7 = a9.c();
        final athj athj = new athj(c7);
        int i = 0;
        final int n21 = n12;
        while (i < c7) {
            final int a10 = a9.a;
            final int c8;
            final int n22 = c8 = a9.c();
            final boolean b2 = c8 > 0;
            String s2 = "childAtomSize should be positive";
            jfi.T(b2, (Object)"childAtomSize should be positive");
            final int c9 = a9.c();
            int n37 = 0;
            int n38 = 0;
            Label_3639: {
                if (c9 != ltk.e && c9 != ltk.f && c9 != ltk.ac && c9 != ltk.an && c9 != ltk.g && c9 != ltk.h && c9 != ltk.i && c9 != ltk.aL && c9 != ltk.aM) {
                    Label_1310: {
                        if (c9 == ltk.l || c9 == ltk.ad || c9 == ltk.q || c9 == ltk.s || c9 == ltk.u || c9 == ltk.x || c9 == ltk.v || c9 == ltk.w || c9 == ltk.az || c9 == ltk.aA || c9 == ltk.o || c9 == ltk.p || c9 == ltk.m) {
                            a9.x(a10 + 8);
                            int j;
                            if (b) {
                                a9.y(8);
                                j = a9.k();
                                a9.y(6);
                            }
                            else {
                                a9.y(16);
                                j = 0;
                            }
                            int n23 = 0;
                            int m = 0;
                            Label_1439: {
                                int l;
                                if (j != 0 && j != 1) {
                                    if (j != 2) {
                                        break Label_1310;
                                    }
                                    a9.y(16);
                                    n23 = (int)Math.round(Double.longBitsToDouble(a9.m()));
                                    l = a9.j();
                                    a9.y(20);
                                }
                                else {
                                    m = a9.k();
                                    a9.y(6);
                                    final Object c10 = a9.c;
                                    final int a11 = a9.a;
                                    final int a12 = a11 + 1;
                                    a9.a = a12;
                                    final byte[] array = (byte[])c10;
                                    final byte b3 = array[a11];
                                    final int a13 = a12 + 1;
                                    a9.a = a13;
                                    final int n24 = (array[a12] & 0xFF) | (b3 & 0xFF) << 8;
                                    a9.a = a13 + 2;
                                    n23 = n24;
                                    l = m;
                                    if (j == 1) {
                                        a9.y(16);
                                        n23 = n24;
                                        break Label_1439;
                                    }
                                }
                                m = l;
                            }
                            final int a14 = a9.a;
                            int f3 = c9;
                            if (c9 == ltk.ad) {
                                f3 = f(a9, a10, c8, athj, i);
                                a9.x(a14);
                            }
                            String s3;
                            if (f3 == ltk.q) {
                                s3 = "audio/ac3";
                            }
                            else if (f3 == ltk.s) {
                                s3 = "audio/eac3";
                            }
                            else if (f3 == ltk.u) {
                                s3 = "audio/vnd.dts";
                            }
                            else if (f3 != ltk.v && f3 != ltk.w) {
                                if (f3 == ltk.x) {
                                    s3 = "audio/vnd.dts.hd;profile=lbr";
                                }
                                else if (f3 == ltk.az) {
                                    s3 = "audio/3gpp";
                                }
                                else if (f3 == ltk.aA) {
                                    s3 = "audio/amr-wb";
                                }
                                else if (f3 != ltk.o && f3 != ltk.p) {
                                    if (f3 == ltk.m) {
                                        s3 = "audio/mpeg";
                                    }
                                    else {
                                        s3 = null;
                                    }
                                }
                                else {
                                    s3 = "audio/raw";
                                }
                            }
                            else {
                                s3 = "audio/vnd.dts.hd";
                            }
                            int n25 = m;
                            byte[] array2 = null;
                            final int n26 = i;
                            int n27 = n23;
                            String s4 = s3;
                            final int n28 = c8;
                            int c11;
                            int intValue;
                            int intValue2;
                            for (int n29 = a14; n29 - a10 < n28; n29 += c11, n25 = intValue, n27 = intValue2) {
                                a9.x(n29);
                                c11 = a9.c();
                                jfi.T(c11 > 0, (Object)s2);
                                final int c12 = a9.c();
                                final int m2 = ltk.M;
                                if (c12 != m2 && (!b || c12 != ltk.n)) {
                                    if (c12 == ltk.r) {
                                        a9.x(n29 + 8);
                                        final String string = Integer.toString(c2);
                                        final int[] a15 = lvx.a;
                                        final int n30 = lvx.b[(a9.h() & 0xC0) >> 6];
                                        final int h = a9.h();
                                        int n31 = lvx.d[(h & 0x38) >> 3];
                                        if ((h & 0x4) != 0x0) {
                                            ++n31;
                                        }
                                        athj.c = MediaFormat.b(string, "audio/ac3", -1, -1, n, n31, n30, null, s);
                                    }
                                    else if (c12 == ltk.t) {
                                        a9.x(n29 + 8);
                                        final String string2 = Integer.toString(c2);
                                        final int[] a16 = lvx.a;
                                        a9.y(2);
                                        final int n32 = lvx.b[(a9.h() & 0xC0) >> 6];
                                        final int h2 = a9.h();
                                        int n33 = lvx.d[(h2 & 0xE) >> 1];
                                        if ((h2 & 0x1) != 0x0) {
                                            ++n33;
                                        }
                                        athj.c = MediaFormat.b(string2, "audio/eac3", -1, -1, n, n33, n32, null, s);
                                    }
                                    else if (c12 == ltk.y) {
                                        athj.c = MediaFormat.b(Integer.toString(c2), s4, -1, -1, n, n25, n27, null, s);
                                    }
                                    intValue = n25;
                                    intValue2 = n27;
                                }
                                else {
                                    int n34 = 0;
                                    String s5 = null;
                                    Label_2037: {
                                        if (c12 == m2) {
                                            n34 = n29;
                                            s5 = s2;
                                        }
                                        else {
                                            int c13;
                                            for (int a17 = a9.a; a17 - n29 < c11; a17 += c13) {
                                                a9.x(a17);
                                                c13 = a9.c();
                                                jfi.T(c13 > 0, (Object)s2);
                                                final int c14 = a9.c();
                                                n34 = a17;
                                                s5 = s2;
                                                if (c14 == ltk.M) {
                                                    break Label_2037;
                                                }
                                            }
                                            s5 = s2;
                                            n34 = -1;
                                        }
                                    }
                                    intValue = n25;
                                    intValue2 = n27;
                                    s2 = s5;
                                    if (n34 != -1) {
                                        final Pair e = e(a9, n34);
                                        s4 = (String)e.first;
                                        array2 = (byte[])e.second;
                                        if ("audio/mp4a-latm".equals(s4)) {
                                            final Pair a18 = lvy.a(array2);
                                            intValue2 = (int)a18.first;
                                            intValue = (int)a18.second;
                                            s2 = s5;
                                        }
                                        else {
                                            s2 = s5;
                                            intValue2 = n27;
                                            intValue = n25;
                                        }
                                    }
                                }
                            }
                            if (athj.c == null && s4 != null) {
                                int n35;
                                if (!"audio/raw".equals(s4)) {
                                    n35 = -1;
                                }
                                else {
                                    n35 = 2;
                                }
                                final String string3 = Integer.toString(c2);
                                List<byte[]> singletonList;
                                if (array2 == null) {
                                    singletonList = null;
                                }
                                else {
                                    singletonList = Collections.singletonList(array2);
                                }
                                athj.c = MediaFormat.c(string3, s4, -1, -1, n, n25, n27, singletonList, s, n35);
                            }
                            final int n36 = n28;
                            i = n26;
                            n37 = a10;
                            n38 = n36;
                            break Label_3639;
                        }
                        if (c9 == ltk.am) {
                            athj.c = MediaFormat.g(Integer.toString(c2), "application/ttml+xml", n, s);
                        }
                        else if (c9 == ltk.aw) {
                            athj.c = MediaFormat.g(Integer.toString(c2), "application/x-quicktime-tx3g", n, s);
                        }
                        else if (c9 == ltk.ax) {
                            athj.c = MediaFormat.g(Integer.toString(c2), "application/x-mp4vtt", n, s);
                        }
                        else if (c9 == ltk.ay) {
                            athj.c = MediaFormat.h(Integer.toString(c2), "application/ttml+xml", n, s, 0L);
                        }
                        else if (c9 == ltk.aO) {
                            athj.c = MediaFormat.f(Integer.toString(c2), "application/x-camera-motion", n);
                        }
                    }
                    n37 = a10;
                    n38 = c8;
                }
                else {
                    final String s6 = "childAtomSize should be positive";
                    a9.x(a10 + 8);
                    a9.y(24);
                    final int k2 = a9.k();
                    final int k3 = a9.k();
                    a9.y(50);
                    int a19 = a9.a;
                    if (c9 == ltk.ac) {
                        f(a9, a10, c8, athj, i);
                        a9.x(a19);
                    }
                    final int n39 = i;
                    int n40 = 0;
                    byte[] copyOfRange = null;
                    String s7 = null;
                    List<byte[]> singletonList2 = null;
                    float n41 = 1.0f;
                    int n42 = -1;
                    final String s8 = s;
                    int n43;
                    int n49 = 0;
                    int n59;
                    int n60;
                    for (n43 = a10; a19 - n43 < n22; n43 = n60, a19 = n59, n42 = n49) {
                        a9.x(a19);
                        final int a20 = a9.a;
                        int c15 = a9.c();
                        if (c15 == 0) {
                            if (a9.a - n43 == n22) {
                                break;
                            }
                            c15 = 0;
                        }
                        jfi.T(c15 > 0, (Object)s6);
                        final int c16 = a9.c();
                        int n48 = 0;
                        int n50 = 0;
                        Label_3523: {
                            if (c16 == ltk.K) {
                                jfi.U(s7 == null);
                                a9.x(a20 + 12);
                                final int a21 = (a9.h() & 0x3) + 1;
                                if (a21 == 3) {
                                    throw new IllegalStateException();
                                }
                                singletonList2 = new ArrayList<byte[]>();
                                final int n44 = a9.h() & 0x1F;
                                for (int n45 = 0; n45 < n44; ++n45) {
                                    singletonList2.add(lwe.e(a9));
                                }
                                final int n46 = n43;
                                for (int h3 = a9.h(), n47 = 0; n47 < h3; ++n47) {
                                    singletonList2.add(lwe.e(a9));
                                }
                                float d;
                                if (n44 > 0) {
                                    final lwf lwf = new lwf(singletonList2.get(0));
                                    lwf.d((a21 + 1) * 8);
                                    d = lwe.c(lwf).d;
                                }
                                else {
                                    d = 1.0f;
                                }
                                athj.a = a21;
                                if (n40 == 0) {
                                    n41 = d;
                                }
                                s7 = "video/avc";
                                n48 = n40;
                                n49 = n42;
                                n50 = n46;
                            }
                            else {
                                final int n51 = n43;
                                String s9 = null;
                                Label_3259: {
                                    if (c16 == ltk.L) {
                                        jfi.U(s7 == null);
                                        a9.x(a20 + 29);
                                        final int h4 = a9.h();
                                        final int h5 = a9.h();
                                        final int a22 = a9.a;
                                        int n52 = 0;
                                        int n53 = 0;
                                        while (n52 < h5) {
                                            a9.y(1);
                                            for (int k4 = a9.k(), n54 = 0; n54 < k4; ++n54) {
                                                final int k5 = a9.k();
                                                n53 += k5 + 4;
                                                a9.y(k5);
                                            }
                                            ++n52;
                                        }
                                        a9.x(a22);
                                        final byte[] array3 = new byte[n53];
                                        int n55 = 0;
                                        int n56 = 0;
                                        while (n55 < h5) {
                                            a9.y(1);
                                            for (int k6 = a9.k(), n57 = 0; n57 < k6; ++n57) {
                                                final int k7 = a9.k();
                                                System.arraycopy(lwe.a, 0, array3, n56, 4);
                                                n56 += 4;
                                                System.arraycopy(a9.c, a9.a, array3, n56, k7);
                                                n56 += k7;
                                                a9.y(k7);
                                            }
                                            ++n55;
                                        }
                                        Object singletonList3;
                                        if (n53 == 0) {
                                            singletonList3 = null;
                                        }
                                        else {
                                            singletonList3 = Collections.singletonList(array3);
                                        }
                                        final Pair create2 = Pair.create(singletonList3, (Object)((h4 & 0x3) + 1));
                                        singletonList2 = (List)create2.first;
                                        athj.a = (int)create2.second;
                                        s9 = "video/hevc";
                                        n48 = n40;
                                    }
                                    else {
                                        n48 = n40;
                                        if (c16 == ltk.j) {
                                            jfi.U(s7 == null);
                                            s9 = "video/3gpp";
                                        }
                                        else if (c16 == ltk.M) {
                                            jfi.U(s7 == null);
                                            final Pair e2 = e(a9, a20);
                                            s9 = (String)e2.first;
                                            singletonList2 = Collections.singletonList(e2.second);
                                        }
                                        else if (c16 == ltk.al) {
                                            a9.x(a20 + 8);
                                            n41 = a9.j() / (float)a9.j();
                                            n48 = 1;
                                            s9 = s7;
                                        }
                                        else if (c16 == ltk.aN) {
                                            jfi.U(s7 == null);
                                            if (c9 == ltk.aL) {
                                                s9 = "video/x-vnd.on2.vp8";
                                            }
                                            else {
                                                s9 = "video/x-vnd.on2.vp9";
                                            }
                                        }
                                        else {
                                            if (c16 == ltk.aJ) {
                                                while (true) {
                                                    int c17;
                                                    for (int n58 = a20 + 8; n58 - a20 < c15; n58 += c17) {
                                                        a9.x(n58);
                                                        c17 = a9.c();
                                                        if (a9.c() == ltk.aK) {
                                                            copyOfRange = Arrays.copyOfRange((byte[])a9.c, n58, c17 + n58);
                                                            s9 = s7;
                                                            break Label_3259;
                                                        }
                                                    }
                                                    copyOfRange = null;
                                                    continue;
                                                }
                                            }
                                            if (c16 == ltk.aI) {
                                                final int h6 = a9.h();
                                                a9.y(3);
                                                if (h6 == 0) {
                                                    final int h7 = a9.h();
                                                    if (h7 == 0) {
                                                        n49 = 0;
                                                        n50 = n51;
                                                        break Label_3523;
                                                    }
                                                    if (h7 == 1) {
                                                        n49 = 1;
                                                        n50 = n51;
                                                        break Label_3523;
                                                    }
                                                    if (h7 == 2) {
                                                        n49 = 2;
                                                        n50 = n51;
                                                        break Label_3523;
                                                    }
                                                    if (h7 == 3) {
                                                        n49 = 3;
                                                        n50 = n51;
                                                        break Label_3523;
                                                    }
                                                }
                                            }
                                            n50 = n51;
                                            n49 = n42;
                                            break Label_3523;
                                        }
                                    }
                                }
                                s7 = s9;
                                n49 = n42;
                                n50 = n51;
                            }
                        }
                        n59 = a19 + c15;
                        n60 = n50;
                        n40 = n48;
                    }
                    final int n61 = n43;
                    final int n62 = n22;
                    final long n63 = n;
                    s = s8;
                    i = n39;
                    n37 = n61;
                    n38 = n62;
                    n = n63;
                    if (s7 != null) {
                        athj.c = MediaFormat.j(Integer.toString(c2), s7, -1, n63, k2, k3, singletonList2, n21, n41, copyOfRange, n42, null);
                        n = n63;
                        n38 = n62;
                        n37 = n61;
                        i = n39;
                        s = s8;
                    }
                }
            }
            a9.x(n37 + n38);
            ++i;
        }
        a = a.a(ltk.S);
        Pair pair = null;
        Label_3887: {
            if (a != null) {
                final ltj b4 = a.b(ltk.T);
                if (b4 != null) {
                    final lwg a23 = b4.a;
                    a23.x(8);
                    final int f4 = ltk.f(a23.c());
                    final int j2 = a23.j();
                    final long[] array4 = new long[j2];
                    final long[] array5 = new long[j2];
                    for (int n64 = 0; n64 < j2; ++n64) {
                        if (f4 == 1) {
                            n = a23.o();
                        }
                        else {
                            n = a23.n();
                        }
                        array4[n64] = n;
                        if (f4 == 1) {
                            n = a23.m();
                        }
                        else {
                            n = a23.c();
                        }
                        array5[n64] = n;
                        final Object c18 = a23.c;
                        final int a24 = a23.a;
                        final int a25 = a24 + 1;
                        a23.a = a25;
                        final byte[] array6 = (byte[])c18;
                        final byte b5 = array6[a24];
                        a23.a = a25 + 1;
                        if ((short)((array6[a25] & 0xFF) | (b5 & 0xFF) << 8) != 1) {
                            throw new IllegalArgumentException("Unsupported media rate.");
                        }
                        a23.y(2);
                    }
                    pair = Pair.create((Object)array4, (Object)array5);
                    break Label_3887;
                }
            }
            pair = Pair.create((Object)null, (Object)null);
        }
        if (athj.c == null) {
            return null;
        }
        n = (long)create.first;
        return new ltt(c2, c, n, n17, (MediaFormat)athj.c, (ardu[])athj.b, athj.a, (long[])pair.first, (long[])pair.second, null, null);
    }
    
    public static ltv c(final ltt ltt, final lti lti) {
        final ltj b = lti.b(ltk.as);
        Object o;
        if (b != null) {
            o = new ltn(b);
        }
        else {
            final ltj b2 = lti.b(ltk.at);
            if (b2 == null) {
                throw new lrl("Track has no sample table size information");
            }
            o = new lto(b2);
        }
        final int a = ((ltm)o).a();
        if (a == 0) {
            return new ltv(new long[0], new int[0], 0, new long[0], new int[0]);
        }
        ltj ltj = lti.b(ltk.au);
        boolean b3;
        if (ltj == null) {
            ltj = lti.b(ltk.av);
            b3 = true;
        }
        else {
            b3 = false;
        }
        final lwg a2 = ltj.a;
        final lwg a3 = lti.b(ltk.ar).a;
        final lwg a4 = lti.b(ltk.ao).a;
        final ltj b4 = lti.b(ltk.ap);
        lwg a5;
        if (b4 != null) {
            a5 = b4.a;
        }
        else {
            a5 = null;
        }
        final ltj b5 = lti.b(ltk.aq);
        lwg a6;
        if (b5 != null) {
            a6 = b5.a;
        }
        else {
            a6 = null;
        }
        final ltl ltl = new ltl(a3, a2, b3);
        a4.x(12);
        final int n = a4.j() - 1;
        final int j = a4.j();
        int i = a4.j();
        int k;
        if (a6 != null) {
            a6.x(12);
            k = a6.j();
        }
        else {
            k = 0;
        }
        int l = 0;
        int n2 = 0;
        lwg lwg = null;
        Label_0303: {
            if (a5 != null) {
                a5.x(12);
                l = a5.j();
                if (l > 0) {
                    n2 = a5.j() - 1;
                    lwg = a5;
                    break Label_0303;
                }
                a5 = null;
            }
            else {
                l = 0;
            }
            n2 = -1;
            lwg = a5;
        }
        final boolean c = ((ltm)o).c();
        final long n3 = 0L;
        int n4 = n;
        long[] array3 = null;
        long[] array5 = null;
        int[] array6 = null;
        int n10 = 0;
        int[] array7 = null;
        Label_1286: {
            if (c) {
                n4 = n;
                if ("audio/raw".equals(ltt.k.b) && (n4 = n) == 0) {
                    if (k == 0 && l == 0) {
                        final int a7 = ltl.a;
                        final long[] array = new long[a7];
                        final int[] array2 = new int[a7];
                        while (ltl.a()) {
                            final int b6 = ltl.b;
                            array[b6] = ltl.d;
                            array2[b6] = ltl.c;
                        }
                        int b7 = ((ltm)o).b();
                        final long n5 = i;
                        final int n6 = 8192 / b7;
                        int n7 = 0;
                        int n8 = 0;
                        while (n7 < a7) {
                            n8 += lwj.a(array2[n7], n6);
                            ++n7;
                        }
                        array3 = new long[n8];
                        final int[] array4 = new int[n8];
                        array5 = new long[n8];
                        array6 = new int[n8];
                        int n9 = 0;
                        n10 = 0;
                        int n11 = 0;
                        int n12 = 0;
                        while (n9 < a7) {
                            final int n13 = array2[n9];
                            long n14 = array[n9];
                            int max = n10;
                            int n15 = n11;
                            final int n16 = b7;
                            int min;
                            for (int n17 = n13; n17 > 0; n17 -= min, ++n12) {
                                min = Math.min(n6, n17);
                                array3[n12] = n14;
                                final int n18 = n16 * min;
                                array4[n12] = n18;
                                max = Math.max(max, n18);
                                array5[n12] = n15 * n5;
                                array6[n12] = 1;
                                n14 += array4[n12];
                                n15 += min;
                            }
                            ++n9;
                            final int n19 = n15;
                            b7 = n16;
                            n10 = max;
                            n11 = n19;
                        }
                        array7 = array4;
                        break Label_1286;
                    }
                    n4 = 0;
                }
            }
            array3 = new long[a];
            final int[] array8 = new int[a];
            final long[] array9 = new long[a];
            final int[] array10 = new int[a];
            int n20 = k;
            long n21;
            long d = n21 = 0L;
            final int n22 = 0;
            int n23 = 0;
            int m = 0;
            int n24 = 0;
            int c2 = 0;
            int n25 = l;
            int n26 = j;
            int n27 = n2;
            int n28 = n4;
            int n29 = n22;
            while (n23 < a) {
                int c3 = n24;
                final int n30 = i;
                while (c3 == 0) {
                    jfi.U(ltl.a());
                    d = ltl.d;
                    c3 = ltl.c;
                }
                int n31 = n20;
                int n32 = m;
                int n33 = c2;
                if (a6 != null) {
                    while (m == 0) {
                        if (n20 <= 0) {
                            m = 0;
                            break;
                        }
                        m = a6.j();
                        c2 = a6.c();
                        --n20;
                    }
                    n32 = m - 1;
                    n33 = c2;
                    n31 = n20;
                }
                array3[n23] = d;
                final int b8 = ((ltm)o).b();
                if ((array8[n23] = b8) > n29) {
                    n29 = b8;
                }
                array9[n23] = n21 + n33;
                int n34;
                if (lwg == null) {
                    n34 = 1;
                }
                else {
                    n34 = 0;
                }
                array10[n23] = n34;
                int n35 = n27;
                int n36 = n25;
                if (n23 == n27) {
                    array10[n23] = 1;
                    --n25;
                    n35 = n27;
                    if ((n36 = n25) > 0) {
                        n35 = lwg.j() - 1;
                        n36 = n25;
                    }
                }
                n21 += n30;
                final int n37 = n26 - 1;
                int j2;
                int j3;
                if (n37 == 0) {
                    if (n28 > 0) {
                        j2 = a4.j();
                        j3 = a4.j();
                        --n28;
                    }
                    else {
                        j3 = n30;
                        j2 = 0;
                    }
                }
                else {
                    j3 = n30;
                    j2 = n37;
                }
                d += array8[n23];
                --c3;
                ++n23;
                i = j3;
                n27 = n35;
                n26 = j2;
                n25 = n36;
                n20 = n31;
                m = n32;
                n24 = c3;
                c2 = n33;
            }
            jfi.S(m == 0);
            while (n20 > 0) {
                jfi.S(a6.j() == 0);
                a6.c();
                --n20;
            }
            Label_1269: {
                if (n25 == 0) {
                    if (n26 == 0) {
                        if (n24 == 0) {
                            if (n28 == 0) {
                                break Label_1269;
                            }
                            n26 = 0;
                            n24 = 0;
                        }
                        else {
                            n26 = 0;
                        }
                    }
                    n25 = 0;
                }
                final int g = ltt.g;
                final StringBuilder sb = new StringBuilder("Inconsistent stbl box for track ");
                sb.append(g);
                sb.append(": remainingSynchronizationSamples ");
                sb.append(n25);
                sb.append(", remainingSamplesAtTimestampDelta ");
                sb.append(n26);
                sb.append(", remainingSamplesInChunk ");
                sb.append(n24);
                sb.append(", remainingTimestampDeltaChanges ");
                sb.append(n28);
                Log.w("AtomParsers", sb.toString());
            }
            n10 = n29;
            final int[] array11 = array8;
            array5 = array9;
            array6 = array10;
            array7 = array11;
        }
        final long[] l2 = ltt.l;
        if (l2 == null) {
            lwj.r(array5, ltt.i);
            return new ltv(array3, array7, n10, array5, array6);
        }
        if (l2.length == 1 && l2[0] == 0L) {
            for (int n38 = 0; n38 < array5.length; ++n38) {
                array5[n38] = lwj.g(array5[n38] - ltt.m[0], 1000000L, ltt.i);
            }
            return new ltv(array3, array7, n10, array5, array6);
        }
        int n39 = 0;
        int n40 = 0;
        int n41 = 0;
        int n42 = 0;
        final int[] array12 = array6;
        while (true) {
            final long[] l3 = ltt.l;
            if (n39 >= l3.length) {
                break;
            }
            final long n43 = ltt.m[n39];
            int n44 = n40;
            int m2 = n41;
            boolean b9 = n42 != 0;
            if (n43 != -1L) {
                final long g2 = lwj.g(l3[n39], ltt.i, ltt.j);
                final int m3 = lwj.m(array5, n43, true);
                m2 = lwj.m(array5, n43 + g2, false);
                n44 = n40 + (m2 - m3);
                b9 = ((((n41 != m3) ? 1 : 0) | n42) != 0x0);
            }
            ++n39;
            n40 = n44;
            n41 = m2;
            n42 = (b9 ? 1 : 0);
        }
        final boolean b10 = (((n40 != a) ? 1 : 0) | n42) != 0x0;
        long[] array13;
        if (b10) {
            array13 = new long[n40];
        }
        else {
            array13 = array3;
        }
        int[] array14;
        if (b10) {
            array14 = new int[n40];
        }
        else {
            array14 = array7;
        }
        if (b10) {
            n10 = 0;
        }
        int[] array15;
        if (b10) {
            array15 = new int[n40];
        }
        else {
            array15 = array12;
        }
        final long[] array16 = new long[n40];
        final int n45 = 0;
        int n46 = 0;
        final int[] array17 = array12;
        int n47 = n10;
        long n48 = n3;
        int n49 = n45;
        final int[] array18 = array15;
        final long[] array19 = array16;
        while (true) {
            final long[] l4 = ltt.l;
            if (n49 >= l4.length) {
                break;
            }
            final long n50 = ltt.m[n49];
            final long n51 = l4[n49];
            if (n50 != -1L) {
                final long g3 = lwj.g(n51, ltt.i, ltt.j);
                int m4 = lwj.m(array5, n50, true);
                final int m5 = lwj.m(array5, g3 + n50, false);
                if (b10) {
                    final int n52 = m5 - m4;
                    System.arraycopy(array3, m4, array13, n46, n52);
                    System.arraycopy(array7, m4, array14, n46, n52);
                    System.arraycopy(array17, m4, array18, n46, n52);
                }
                while (m4 < m5) {
                    array19[n46] = lwj.g(n48, 1000000L, ltt.j) + lwj.g(array5[m4] - n50, 1000000L, ltt.i);
                    int n53 = n47;
                    if (b10 && array14[n46] > (n53 = n47)) {
                        n53 = array7[m4];
                    }
                    ++n46;
                    ++m4;
                    n47 = n53;
                }
            }
            n48 += n51;
            ++n49;
        }
        int n54 = 0;
        int n55 = 0;
        while (n54 < array18.length) {
            if (n55 != 0) {
                return new ltv(array13, array14, n47, array19, array18);
            }
            n55 = (array18[n54] & 0x1);
            ++n54;
        }
        if (n55 != 0) {
            return new ltv(array13, array14, n47, array19, array18);
        }
        throw new lrl("The edited sample sequence does not contain a sync sample.");
    }
    
    private static int d(final lwg lwg) {
        int n;
        int n2;
        for (n = lwg.h(), n2 = (n & 0x7F); (n & 0x80) == 0x80; n = lwg.h(), n2 = (n2 << 7 | (n & 0x7F))) {}
        return n2;
    }
    
    private static Pair e(final lwg lwg, int n) {
        lwg.x(n + 12);
        lwg.y(1);
        d(lwg);
        lwg.y(2);
        n = lwg.h();
        if ((n & 0x80) != 0x0) {
            lwg.y(2);
        }
        if ((n & 0x40) != 0x0) {
            lwg.y(lwg.k());
        }
        if ((n & 0x20) != 0x0) {
            lwg.y(2);
        }
        lwg.y(1);
        d(lwg);
        n = lwg.h();
        Object o = null;
        Label_0254: {
            if (n != 32) {
                if (n != 33) {
                    if (n != 35) {
                        if (n != 64) {
                            o = null;
                            if (n == 107) {
                                return Pair.create((Object)"audio/mpeg", (Object)null);
                            }
                            if (n == 165) {
                                o = "audio/ac3";
                                break Label_0254;
                            }
                            if (n == 166) {
                                o = "audio/eac3";
                                break Label_0254;
                            }
                            switch (n) {
                                default: {
                                    switch (n) {
                                        default: {
                                            break Label_0254;
                                        }
                                        case 170:
                                        case 171: {
                                            return Pair.create((Object)"audio/vnd.dts.hd", (Object)null);
                                        }
                                        case 169:
                                        case 172: {
                                            return Pair.create((Object)"audio/vnd.dts", (Object)null);
                                        }
                                    }
                                    break;
                                }
                                case 102:
                                case 103:
                                case 104: {
                                    break;
                                }
                            }
                        }
                        o = "audio/mp4a-latm";
                    }
                    else {
                        o = "video/hevc";
                    }
                }
                else {
                    o = "video/avc";
                }
            }
            else {
                o = "video/mp4v-es";
            }
        }
        lwg.y(12);
        lwg.y(1);
        n = d(lwg);
        final byte[] array = new byte[n];
        lwg.s(array, 0, n);
        return Pair.create(o, (Object)array);
    }
    
    private static int f(final lwg lwg, final int n, final int n2, final athj athj, final int n3) {
        int a = lwg.a;
        while (true) {
            final boolean b = false;
            if (a - n >= n2) {
                return 0;
            }
            lwg.x(a);
            final int c = lwg.c();
            jfi.T(c > 0, (Object)"childAtomSize should be positive");
            if (lwg.c() == ltk.Y) {
                int n4 = a + 8;
                final Pair pair = null;
                Object o2;
                Object o = o2 = null;
                int n5 = 0;
                while (n4 - a < c) {
                    lwg.x(n4);
                    final int c2 = lwg.c();
                    final int c3 = lwg.c();
                    Object value = null;
                    int n6 = 0;
                    Label_0308: {
                        if (c3 == ltk.ae) {
                            value = lwg.c();
                            n6 = n5;
                        }
                        else if (c3 == ltk.Z) {
                            lwg.y(4);
                            if (lwg.c() == ltp.a) {
                                n6 = 1;
                                value = o;
                            }
                            else {
                                n6 = 0;
                                value = o;
                            }
                        }
                        else {
                            n6 = n5;
                            value = o;
                            if (c3 == ltk.aa) {
                                int c4;
                                for (int n7 = n4 + 8; n7 - n4 < c2; n7 += c4) {
                                    lwg.x(n7);
                                    c4 = lwg.c();
                                    if (lwg.c() == ltk.ab) {
                                        lwg.y(6);
                                        lwg.h();
                                        final int h = lwg.h();
                                        final byte[] array = new byte[16];
                                        lwg.s(array, 0, 16);
                                        o2 = new ardu(h, array, (char[])null);
                                        n6 = n5;
                                        value = o;
                                        break Label_0308;
                                    }
                                }
                                o2 = null;
                                value = o;
                                n6 = n5;
                            }
                        }
                    }
                    n4 += c2;
                    n5 = n6;
                    o = value;
                }
                Pair create = pair;
                if (n5 != 0) {
                    jfi.T(o != null, (Object)"frma atom is mandatory");
                    boolean b2 = b;
                    if (o2 != null) {
                        b2 = true;
                    }
                    jfi.T(b2, (Object)"schi->tenc atom is mandatory");
                    create = Pair.create(o, o2);
                }
                if (create != null) {
                    ((ardu[])athj.b)[n3] = (ardu)create.second;
                    return (int)create.first;
                }
            }
            a += c;
        }
    }
}
