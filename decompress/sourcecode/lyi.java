import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import android.util.Pair;
import androidx.media3.common.DrmInitData;

// 
// Decompiled by Procyon v0.6.0
// 

final class lyi
{
    private static final byte[] a;
    
    static {
        a = baw.aj("OpusHead");
    }
    
    public static lyo a(lyf a, final lyg lyg, long o, final DrmInitData drmInitData) {
        final lyf a2 = a.a(1835297121);
        final bar a3 = a2.b(1751411826).a;
        a3.G(16);
        final int d = a3.d();
        int n;
        if (d == 1936684398) {
            n = 1;
        }
        else if (d == 1986618469) {
            n = 2;
        }
        else if (d != 1952807028 && d != 1935832172 && d != 1937072756 && d != 1668047728) {
            if (d == 1835365473) {
                n = 5;
            }
            else {
                n = -1;
            }
        }
        else {
            n = 3;
        }
        if (n == -1) {
            return null;
        }
        final bar a4 = a.b(1953196132).a;
        a4.G(8);
        final int d2 = lyh.d(a4.d());
        int n2;
        if (d2 == 0) {
            n2 = 8;
        }
        else {
            n2 = 16;
        }
        a4.H(n2);
        final int d3 = a4.d();
        a4.H(4);
        final int b = a4.b;
        int n3;
        if (d2 == 0) {
            n3 = 4;
        }
        else {
            n3 = 8;
        }
        int n4 = 0;
        long n5 = 0L;
        long n7 = 0L;
        Label_0291: {
            while (true) {
                n5 = -9223372036854775807L;
                if (n4 >= n3) {
                    a4.H(n3);
                    break;
                }
                if (a4.a[b + n4] != -1) {
                    long n6;
                    if (d2 == 0) {
                        n6 = a4.q();
                    }
                    else {
                        n6 = a4.r();
                    }
                    n7 = n6;
                    if (n6 == 0L) {
                        break;
                    }
                    break Label_0291;
                }
                else {
                    ++n4;
                }
            }
            n7 = -9223372036854775807L;
        }
        a4.H(16);
        final int d4 = a4.d();
        final int d5 = a4.d();
        a4.H(4);
        final int d6 = a4.d();
        final int d7 = a4.d();
        final int n8 = 65536;
        int n9 = d4;
        int n10 = d5;
        int n11 = d6;
        int n12 = 0;
        Label_0505: {
            if (d4 == 0) {
                if (d5 == 65536) {
                    if (d6 == -65536) {
                        if (d7 == 0) {
                            n12 = 90;
                            break Label_0505;
                        }
                        n9 = 0;
                        n10 = 65536;
                        n11 = -65536;
                    }
                    else {
                        n9 = 0;
                        n10 = 65536;
                        n11 = d6;
                    }
                }
                else {
                    n9 = 0;
                    n11 = d6;
                    n10 = d5;
                }
            }
            if (n9 == 0) {
                if (n10 == -65536) {
                    if (n11 == 65536) {
                        n11 = n8;
                        if (d7 == 0) {
                            n12 = 270;
                            break Label_0505;
                        }
                    }
                    n9 = 0;
                    n10 = -65536;
                }
                else {
                    n9 = 0;
                }
            }
            if (n9 == -65536 && n10 == 0 && n11 == 0 && d7 == -65536) {
                n12 = 180;
            }
            else {
                n12 = 0;
            }
        }
        if (o == -9223372036854775807L) {
            o = n7;
        }
        final bar a5 = lyg.a;
        a5.G(8);
        int n13;
        if (lyh.d(a5.d()) == 0) {
            n13 = 8;
        }
        else {
            n13 = 16;
        }
        a5.H(n13);
        final long q = a5.q();
        long y;
        if (o == -9223372036854775807L) {
            y = n5;
        }
        else {
            y = baw.y(o, 1000000L, q);
        }
        final lyf a6 = a2.a(1835626086).a(1937007212);
        final bar a7 = a2.b(1835296868).a;
        a7.G(8);
        final int d8 = lyh.d(a7.d());
        int n14;
        if (d8 == 0) {
            n14 = 8;
        }
        else {
            n14 = 16;
        }
        a7.H(n14);
        o = a7.q();
        int n15;
        if (d8 == 0) {
            n15 = 4;
        }
        else {
            n15 = 8;
        }
        a7.H(n15);
        final int m = a7.m();
        final StringBuilder sb = new StringBuilder();
        sb.append((char)((m >> 10 & 0x1F) + 96));
        sb.append((char)((m >> 5 & 0x1F) + 96));
        sb.append((char)((m & 0x1F) + 96));
        final Pair create = Pair.create((Object)o, (Object)sb.toString());
        final bar a8 = a6.b(1937011556).a;
        final String c = (String)create.second;
        a8.G(12);
        final int d9 = a8.d();
        lyp[] array = new lyp[d9];
        final int n16 = 0;
        ayf ayf = null;
        int n17 = 0;
        int n18 = 0;
        final int n19 = n;
        int n20 = n16;
        while (true) {
            DrmInitData b2 = drmInitData;
            if (n20 >= d9) {
                break;
            }
            final int b3 = a8.b;
            final int d10;
            final int n21 = d10 = a8.d();
            final boolean b4 = d10 > 0;
            final String s = "childAtomSize should be positive";
            dk.i(b4, (Object)"childAtomSize should be positive");
            final int d11 = a8.d();
            lyp[] array2 = null;
            int n23 = 0;
            int s2 = 0;
            int n25 = 0;
            int n38;
            int n39;
            if (d11 != 1635148593 && d11 != 1635148595 && d11 != 1701733238 && d11 != 1836070006 && d11 != 1752589105 && d11 != 1751479857 && d11 != 1932670515 && d11 != 1987063864 && d11 != 1987063865 && d11 != 1635135537 && d11 != 1685479798 && d11 != 1685479729 && d11 != 1685481573 && d11 != 1685481521) {
                ayf a9 = null;
                int n26 = 0;
                Label_2639: {
                    int n29;
                    int n30;
                    int n31;
                    if (d11 != 1836069985 && d11 != 1701733217 && d11 != 1633889587 && d11 != 1700998451 && d11 != 1633889588 && d11 != 1685353315 && d11 != 1685353317 && d11 != 1685353320 && d11 != 1685353324 && d11 != 1935764850 && d11 != 1935767394 && d11 != 1819304813 && d11 != 1936684916 && d11 != 1953984371 && d11 != 778924083 && d11 != 1634492771 && d11 != 1634492791 && d11 != 1970037111 && d11 != 1332770163 && d11 != 1716281667) {
                        if (d11 != 1414810956 && d11 != 1954034535 && d11 != 2004251764 && d11 != 1937010800 && d11 != 1664495672) {
                            if (d11 == 1667329389) {
                                final aye aye = new aye();
                                aye.b(d3);
                                aye.k = "application/x-camera-motion";
                                ayf = aye.a();
                            }
                            final int n22 = n12;
                            array2 = array;
                            n23 = n20;
                            final int n24 = d10;
                            s2 = n22;
                            a9 = ayf;
                            n25 = n17;
                            n26 = n24;
                            break Label_2639;
                        }
                        a8.G(b3 + 16);
                        String k = null;
                        List<byte[]> singletonList = null;
                        Label_1347: {
                            if (d11 == 1414810956) {
                                k = "application/ttml+xml";
                            }
                            else {
                                if (d11 == 1954034535) {
                                    final int n27 = d10 - 16;
                                    final byte[] array3 = new byte[n27];
                                    a8.B(array3, 0, n27);
                                    singletonList = Collections.singletonList(array3);
                                    o = Long.MAX_VALUE;
                                    k = "application/x-quicktime-tx3g";
                                    break Label_1347;
                                }
                                if (d11 == 2004251764) {
                                    k = "application/x-mp4-vtt";
                                }
                                else {
                                    if (d11 == 1937010800) {
                                        k = "application/ttml+xml";
                                        o = 0L;
                                        singletonList = null;
                                        break Label_1347;
                                    }
                                    k = "application/x-mp4-cea-608";
                                    n17 = 1;
                                }
                            }
                            singletonList = null;
                            o = Long.MAX_VALUE;
                        }
                        final aye aye2 = new aye();
                        aye2.b(d3);
                        aye2.k = k;
                        aye2.c = c;
                        aye2.o = o;
                        aye2.m = singletonList;
                        final ayf a10 = aye2.a();
                        array2 = array;
                        final int n28 = n20;
                        n29 = d10;
                        a9 = a10;
                        n30 = n17;
                        n31 = n28;
                    }
                    else {
                        a8.G(b3 + 16);
                        a8.H(8);
                        final int i = a8.m();
                        a8.H(6);
                        final int j = a8.j();
                        int b5 = a8.b;
                        int intValue;
                        DrmInitData drmInitData2;
                        if (d11 == 1701733217) {
                            final Pair d12 = d(a8, b3, d10);
                            if (d12 != null) {
                                intValue = (int)d12.first;
                                if (b2 == null) {
                                    b2 = null;
                                }
                                else {
                                    b2 = b2.b(((lyp)d12.second).b);
                                }
                                array[n20] = (lyp)d12.second;
                            }
                            else {
                                intValue = 1701733217;
                            }
                            a8.G(b5);
                            drmInitData2 = b2;
                        }
                        else {
                            intValue = d11;
                            drmInitData2 = b2;
                        }
                        String s3 = null;
                        int z = 0;
                        Label_1817: {
                            if (intValue == 1633889587) {
                                s3 = "audio/ac3";
                            }
                            else if (intValue == 1700998451) {
                                s3 = "audio/eac3";
                            }
                            else if (intValue == 1633889588) {
                                s3 = "audio/ac4";
                            }
                            else if (intValue == 1685353315) {
                                s3 = "audio/vnd.dts";
                            }
                            else if (intValue != 1685353320 && intValue != 1685353324) {
                                if (intValue == 1685353317) {
                                    s3 = "audio/vnd.dts.hd;profile=lbr";
                                }
                                else if (intValue == 1935764850) {
                                    s3 = "audio/3gpp";
                                }
                                else if (intValue == 1935767394) {
                                    s3 = "audio/amr-wb";
                                }
                                else {
                                    if (intValue == 1819304813 || intValue == 1936684916) {
                                        s3 = "audio/raw";
                                        z = 2;
                                        break Label_1817;
                                    }
                                    if (intValue == 1953984371) {
                                        s3 = "audio/raw";
                                        z = 268435456;
                                        break Label_1817;
                                    }
                                    if (intValue == 778924083) {
                                        s3 = "audio/mpeg";
                                    }
                                    else if (intValue == 1634492771) {
                                        s3 = "audio/alac";
                                    }
                                    else if (intValue == 1634492791) {
                                        s3 = "audio/g711-alaw";
                                    }
                                    else if (intValue == 1970037111) {
                                        s3 = "audio/g711-mlaw";
                                    }
                                    else if (intValue == 1332770163) {
                                        s3 = "audio/opus";
                                    }
                                    else if (intValue == 1716281667) {
                                        s3 = "audio/flac";
                                    }
                                    else {
                                        s3 = null;
                                    }
                                }
                            }
                            else {
                                s3 = "audio/vnd.dts.hd";
                            }
                            z = -1;
                        }
                        String s4 = null;
                        byte[] array4 = null;
                        final String s5 = s3;
                        ayf ayf2 = ayf;
                        String s6 = s5;
                        final int n32 = d10;
                        final int n33 = n20;
                        int intValue2 = j;
                        int intValue3 = i;
                        while (b5 - b3 < n32) {
                            a8.G(b5);
                            final int d13 = a8.d();
                            dk.i(d13 > 0, (Object)s);
                            final int d14 = a8.d();
                            int a13 = 0;
                            int b6 = 0;
                            ayf ayf3 = null;
                            String s7 = null;
                            Label_2463: {
                                if (d14 != 1702061171) {
                                    if (d14 == 1684103987) {
                                        a8.G(b5 + 8);
                                        ayf2 = bsr.c(a8, Integer.toString(d3), c, drmInitData2);
                                    }
                                    else if (d14 == 1684366131) {
                                        a8.G(b5 + 8);
                                        ayf2 = bsr.d(a8, Integer.toString(d3), c, drmInitData2);
                                    }
                                    else if (d14 == 1684103988) {
                                        a8.G(b5 + 8);
                                        ayf2 = bss.a(a8, Integer.toString(d3), c, drmInitData2);
                                    }
                                    else if (d14 == 1684305011) {
                                        final aye aye3 = new aye();
                                        aye3.b(d3);
                                        aye3.k = s6;
                                        aye3.x = intValue3;
                                        aye3.y = intValue2;
                                        aye3.n = drmInitData2;
                                        aye3.c = c;
                                        ayf2 = aye3.a();
                                    }
                                    else if (d14 == 1682927731) {
                                        final int n34 = d13 - 8;
                                        final byte[] a11 = lyi.a;
                                        final int length = a11.length;
                                        array4 = new byte[length + n34];
                                        System.arraycopy(a11, 0, array4, 0, length);
                                        a8.G(b5 + 8);
                                        a8.B(array4, a11.length, n34);
                                    }
                                    else {
                                        if (d14 != 1684425825) {
                                            if (d14 == 1634492771) {
                                                final int n35 = d13 - 12;
                                                array4 = new byte[n35];
                                                a8.G(b5 + 12);
                                                a8.B(array4, 0, n35);
                                                final Pair a12 = bad.a(array4);
                                                intValue2 = (int)a12.first;
                                                intValue3 = (int)a12.second;
                                            }
                                            a13 = intValue3;
                                            b6 = intValue2;
                                            ayf3 = ayf2;
                                            s7 = s4;
                                            break Label_2463;
                                        }
                                        final int n36 = d13 - 12;
                                        array4 = new byte[n36 + 4];
                                        array4[0] = 102;
                                        array4[1] = 76;
                                        array4[2] = 97;
                                        array4[3] = 67;
                                        a8.G(b5 + 12);
                                        a8.B(array4, 4, n36);
                                    }
                                    a13 = intValue3;
                                    b6 = intValue2;
                                    ayf3 = ayf2;
                                    s7 = s4;
                                }
                                else {
                                    a13 = intValue3;
                                    b6 = intValue2;
                                    ayf3 = ayf2;
                                    s7 = s4;
                                    if (b5 != -1) {
                                        final Pair c2 = c(a8, b5);
                                        final String s8 = (String)c2.first;
                                        array4 = (byte[])c2.second;
                                        a13 = intValue3;
                                        b6 = intValue2;
                                        Object c3 = s4;
                                        if ("audio/mp4a-latm".equals(s8)) {
                                            a13 = intValue3;
                                            b6 = intValue2;
                                            c3 = s4;
                                            if (array4 != null) {
                                                final ijj a14 = bsq.a(array4);
                                                b6 = a14.b;
                                                a13 = a14.a;
                                                c3 = a14.c;
                                            }
                                        }
                                        final String s9 = s8;
                                        s7 = (String)c3;
                                        ayf3 = ayf2;
                                        s6 = s9;
                                    }
                                }
                            }
                            b5 += d13;
                            intValue3 = a13;
                            intValue2 = b6;
                            ayf2 = ayf3;
                            s4 = s7;
                        }
                        final lyp[] array5 = array;
                        if ((a9 = ayf2) == null) {
                            a9 = ayf2;
                            if (s6 != null) {
                                final aye aye4 = new aye();
                                aye4.b(d3);
                                aye4.k = s6;
                                aye4.h = s4;
                                aye4.x = intValue3;
                                aye4.y = intValue2;
                                aye4.z = z;
                                List<byte[]> singletonList2;
                                if (array4 == null) {
                                    singletonList2 = null;
                                }
                                else {
                                    singletonList2 = Collections.singletonList(array4);
                                }
                                aye4.m = singletonList2;
                                aye4.n = drmInitData2;
                                aye4.c = c;
                                a9 = aye4.a();
                            }
                        }
                        n29 = n32;
                        n31 = n33;
                        array2 = array5;
                        n30 = n17;
                    }
                    final int n37 = n12;
                    n26 = n29;
                    n23 = n31;
                    n25 = n30;
                    s2 = n37;
                }
                n38 = b3;
                ayf = a9;
                n39 = n26;
            }
            else {
                final lyp[] array6 = array;
                final int n40 = n20;
                final String s10 = "childAtomSize should be positive";
                a8.G(b3 + 16);
                a8.H(16);
                final int l = a8.m();
                final int m2 = a8.m();
                a8.H(50);
                final int b7 = a8.b;
                int intValue4;
                DrmInitData n41;
                if (d11 == 1701733238) {
                    final Pair d15 = d(a8, b3, d10);
                    DrmInitData b8;
                    if (d15 != null) {
                        intValue4 = (int)d15.first;
                        if (drmInitData == null) {
                            b8 = null;
                        }
                        else {
                            b8 = drmInitData.b(((lyp)d15.second).b);
                        }
                        array6[n40] = (lyp)d15.second;
                    }
                    else {
                        b8 = drmInitData;
                        intValue4 = 1701733238;
                    }
                    a8.G(b7);
                    n41 = b8;
                }
                else {
                    n41 = drmInitData;
                    intValue4 = d11;
                }
                n39 = n21;
                float t = 1.0f;
                int n42 = n18;
                int v = -1;
                List m3 = null;
                String k2 = null;
                byte[] u = null;
                int n43 = 0;
                Object o2 = null;
                n38 = b3;
                int d16;
                List a16;
                int n45 = 0;
                float e;
                String s11;
                int n46;
                byte[] array7;
                int n47;
                Object a17;
                for (int n44 = b7; n44 - n38 < n39; n44 += d16, v = n46, m3 = a16, t = e, k2 = s11, u = array7, n43 = n47, n42 = n45, o2 = a17) {
                    a8.G(n44);
                    final int b9 = a8.b;
                    d16 = a8.d();
                    if (d16 == 0) {
                        if (a8.b - n38 == n39) {
                            break;
                        }
                        d16 = 0;
                    }
                    dk.i(d16 > 0, (Object)s10);
                    final int d17 = a8.d();
                    if (d17 == 1635148611) {
                        dk.h(k2 == null);
                        a8.G(b9 + 8);
                        final bst a15 = bst.a(a8);
                        a16 = a15.a;
                        n45 = a15.b;
                        e = t;
                        if (n43 == 0) {
                            e = a15.e;
                        }
                        s11 = "video/avc";
                        n46 = v;
                        array7 = u;
                        n47 = n43;
                        a17 = o2;
                    }
                    else {
                        List<byte[]> list = null;
                        byte[] copyOfRange = null;
                        String s18 = null;
                        Label_3100: {
                            String s12;
                            if (d17 == 1752589123) {
                                dk.h(k2 == null);
                                a8.G(b9 + 8);
                                final btr a18 = btr.a(a8);
                                list = a18.a;
                                n45 = a18.b;
                                s12 = "video/hevc";
                            }
                            else if (d17 != 1685480259 && d17 != 1685485123) {
                                if (d17 == 1987076931) {
                                    dk.h(k2 == null);
                                    String s13;
                                    if (intValue4 == 1987063864) {
                                        s13 = "video/x-vnd.on2.vp8";
                                    }
                                    else {
                                        s13 = "video/x-vnd.on2.vp9";
                                    }
                                    final String s14 = s13;
                                    list = m3;
                                    s12 = s14;
                                    n45 = n42;
                                }
                                else if (d17 == 1635135811) {
                                    dk.h(k2 == null);
                                    final String s15 = "video/av01";
                                    list = m3;
                                    s12 = s15;
                                    n45 = n42;
                                }
                                else if (d17 == 1681012275) {
                                    dk.h(k2 == null);
                                    final String s16 = "video/3gpp";
                                    list = m3;
                                    s12 = s16;
                                    n45 = n42;
                                }
                                else if (d17 == 1702061171) {
                                    dk.h(k2 == null);
                                    final Pair c4 = c(a8, b9);
                                    final String s17 = (String)c4.first;
                                    final byte[] array8 = (byte[])c4.second;
                                    list = m3;
                                    s12 = s17;
                                    n45 = n42;
                                    if (array8 != null) {
                                        list = Collections.singletonList(array8);
                                        s12 = s17;
                                        n45 = n42;
                                    }
                                }
                                else {
                                    if (d17 == 1885434736) {
                                        a8.G(b9 + 8);
                                        e = a8.l() / (float)a8.l();
                                        n47 = 1;
                                        n46 = v;
                                        a16 = m3;
                                        s11 = k2;
                                        array7 = u;
                                        n45 = n42;
                                        a17 = o2;
                                        continue;
                                    }
                                    if (d17 == 1937126244) {
                                        int d18;
                                        for (int n48 = b9 + 8; n48 - b9 < d16; n48 += d18) {
                                            a8.G(n48);
                                            d18 = a8.d();
                                            if (a8.d() == 1886547818) {
                                                copyOfRange = Arrays.copyOfRange(a8.a, n48, d18 + n48);
                                                list = m3;
                                                s18 = k2;
                                                n45 = n42;
                                                break Label_3100;
                                            }
                                        }
                                        copyOfRange = null;
                                        list = m3;
                                        s18 = k2;
                                        n45 = n42;
                                        break Label_3100;
                                    }
                                    final int n49 = intValue4;
                                    list = m3;
                                    s18 = k2;
                                    copyOfRange = u;
                                    n45 = n42;
                                    intValue4 = n49;
                                    if (d17 != 1936995172) {
                                        break Label_3100;
                                    }
                                    final int i2 = a8.i();
                                    a8.H(3);
                                    n46 = v;
                                    a16 = m3;
                                    e = t;
                                    s11 = k2;
                                    array7 = u;
                                    n47 = n43;
                                    n45 = n42;
                                    a17 = o2;
                                    intValue4 = n49;
                                    if (i2 != 0) {
                                        continue;
                                    }
                                    final int i3 = a8.i();
                                    if (i3 == 0) {
                                        n46 = 0;
                                        a16 = m3;
                                        e = t;
                                        s11 = k2;
                                        array7 = u;
                                        n47 = n43;
                                        n45 = n42;
                                        a17 = o2;
                                        intValue4 = n49;
                                        continue;
                                    }
                                    if (i3 == 1) {
                                        n46 = 1;
                                        a16 = m3;
                                        e = t;
                                        s11 = k2;
                                        array7 = u;
                                        n47 = n43;
                                        n45 = n42;
                                        a17 = o2;
                                        intValue4 = n49;
                                        continue;
                                    }
                                    if (i3 == 2) {
                                        n46 = 2;
                                        a16 = m3;
                                        e = t;
                                        s11 = k2;
                                        array7 = u;
                                        n47 = n43;
                                        n45 = n42;
                                        a17 = o2;
                                        intValue4 = n49;
                                        continue;
                                    }
                                    if (i3 != 3) {
                                        n46 = v;
                                        a16 = m3;
                                        e = t;
                                        s11 = k2;
                                        array7 = u;
                                        n47 = n43;
                                        n45 = n42;
                                        a17 = o2;
                                        intValue4 = n49;
                                        continue;
                                    }
                                    n46 = 3;
                                    a16 = m3;
                                    e = t;
                                    s11 = k2;
                                    array7 = u;
                                    n47 = n43;
                                    n45 = n42;
                                    a17 = o2;
                                    intValue4 = n49;
                                    continue;
                                }
                            }
                            else {
                                final int n50 = intValue4;
                                final bhu h = bhu.h(a8);
                                n46 = v;
                                a16 = m3;
                                e = t;
                                s11 = k2;
                                array7 = u;
                                n47 = n43;
                                n45 = n42;
                                a17 = o2;
                                intValue4 = n50;
                                if (h != null) {
                                    a17 = h.a;
                                    s11 = "video/dolby-vision";
                                    intValue4 = n50;
                                    n45 = n42;
                                    n47 = n43;
                                    array7 = u;
                                    e = t;
                                    a16 = m3;
                                    n46 = v;
                                }
                                continue;
                            }
                            copyOfRange = u;
                            s18 = s12;
                        }
                        n46 = v;
                        a16 = list;
                        e = t;
                        s11 = s18;
                        array7 = copyOfRange;
                        n47 = n43;
                        a17 = o2;
                    }
                }
                if (k2 == null) {
                    n18 = n42;
                    s2 = n12;
                    n25 = n17;
                    array2 = array6;
                    n23 = n40;
                }
                else {
                    final aye aye5 = new aye();
                    aye5.b(d3);
                    aye5.k = k2;
                    aye5.h = (String)o2;
                    aye5.p = l;
                    aye5.q = m2;
                    aye5.t = t;
                    s2 = n12;
                    aye5.s = s2;
                    aye5.u = u;
                    aye5.v = v;
                    aye5.m = m3;
                    aye5.n = n41;
                    ayf = aye5.a();
                    n23 = n40;
                    array2 = array6;
                    n18 = n42;
                    n25 = n17;
                }
            }
            a8.G(n38 + n39);
            final int n51 = n23 + 1;
            n12 = s2;
            array = array2;
            n20 = n51;
            n17 = n25;
        }
        a = a.a(1701082227);
        long[] array11 = null;
        long[] array12 = null;
        Label_4362: {
            if (a != null) {
                final lyg b10 = a.b(1701606260);
                Pair create2;
                if (b10 == null) {
                    create2 = null;
                }
                else {
                    final bar a19 = b10.a;
                    a19.G(8);
                    final int d19 = lyh.d(a19.d());
                    final int l2 = a19.l();
                    final long[] array9 = new long[l2];
                    final long[] array10 = new long[l2];
                    for (int n52 = 0; n52 < l2; ++n52) {
                        if (d19 == 1) {
                            o = a19.r();
                        }
                        else {
                            o = a19.q();
                        }
                        array9[n52] = o;
                        if (d19 == 1) {
                            o = a19.p();
                        }
                        else {
                            o = a19.d();
                        }
                        array10[n52] = o;
                        if (a19.z() != 1) {
                            throw new IllegalArgumentException("Unsupported media rate.");
                        }
                        a19.H(2);
                    }
                    create2 = Pair.create((Object)array9, (Object)array10);
                }
                if (create2 != null) {
                    array11 = (long[])create2.first;
                    array12 = (long[])create2.second;
                    break Label_4362;
                }
            }
            array11 = null;
            array12 = null;
        }
        if (ayf == null) {
            return null;
        }
        return new lyo(d3, n19, (long)create.first, q, y, ayf, n17, array, n18, array11, array12);
    }
    
    private static int b(final bar bar) {
        int n;
        int n2;
        for (n = bar.i(), n2 = (n & 0x7F); (n & 0x80) == 0x80; n = bar.i(), n2 = (n2 << 7 | (n & 0x7F))) {}
        return n2;
    }
    
    private static Pair c(final bar bar, int n) {
        bar.G(n + 12);
        bar.H(1);
        b(bar);
        bar.H(2);
        n = bar.i();
        if ((n & 0x80) != 0x0) {
            bar.H(2);
        }
        if ((n & 0x40) != 0x0) {
            bar.H(bar.m());
        }
        if ((n & 0x20) != 0x0) {
            bar.H(2);
        }
        bar.H(1);
        b(bar);
        final String e = ayy.e(bar.i());
        if (!"audio/mpeg".equals(e) && !"audio/vnd.dts".equals(e) && !"audio/vnd.dts.hd".equals(e)) {
            bar.H(12);
            bar.H(1);
            n = b(bar);
            final byte[] array = new byte[n];
            bar.B(array, 0, n);
            return Pair.create((Object)e, (Object)array);
        }
        return Pair.create((Object)e, (Object)null);
    }
    
    private static Pair d(final bar bar, final int n, final int n2) {
        int d;
        for (int b = bar.b; b - n < n2; b += d) {
            bar.G(b);
            d = bar.d();
            dk.i(d > 0, (Object)"childAtomSize should be positive");
            if (bar.d() == 1936289382) {
                int n3 = b + 8;
                int n4 = -1;
                int n5 = 0;
                String s = null;
                Integer n6 = null;
                while (n3 - b < d) {
                    bar.G(n3);
                    final int d2 = bar.d();
                    final int d3 = bar.d();
                    Integer value;
                    String w;
                    if (d3 == 1718775137) {
                        value = bar.d();
                        w = s;
                    }
                    else if (d3 == 1935894637) {
                        bar.H(4);
                        w = bar.w(4);
                        value = n6;
                    }
                    else {
                        w = s;
                        value = n6;
                        if (d3 == 1935894633) {
                            n4 = n3;
                            n5 = d2;
                            value = n6;
                            w = s;
                        }
                    }
                    n3 += d2;
                    s = w;
                    n6 = value;
                }
                Pair create = null;
                Label_0510: {
                    if ("cenc".equals(s) || "cbc1".equals(s) || "cens".equals(s) || "cbcs".equals(s)) {
                        dk.k((Object)n6, (Object)"frma atom is mandatory");
                        dk.i(n4 != -1, (Object)"schi atom is mandatory");
                        while (true) {
                            int d4;
                            for (int n7 = n4 + 8; n7 - n4 < n5; n7 += d4) {
                                bar.G(n7);
                                d4 = bar.d();
                                if (bar.d() == 1952804451) {
                                    final int d5 = bar.d();
                                    bar.H(1);
                                    int n8;
                                    int n9;
                                    if (lyh.d(d5) == 0) {
                                        bar.H(1);
                                        n8 = 0;
                                        n9 = 0;
                                    }
                                    else {
                                        final int i = bar.i();
                                        n8 = (i & 0xF);
                                        n9 = (i & 0xF0) >> 4;
                                    }
                                    final boolean b2 = bar.i() == 1;
                                    final int j = bar.i();
                                    final byte[] array = new byte[16];
                                    bar.B(array, 0, 16);
                                    byte[] array2;
                                    if (b2 && j == 0) {
                                        final int k = bar.i();
                                        array2 = new byte[k];
                                        bar.B(array2, 0, k);
                                    }
                                    else {
                                        array2 = null;
                                    }
                                    final Object o = new lyp(b2, s, j, array, n9, n8, array2);
                                    dk.k(o, (Object)"tenc atom is mandatory");
                                    create = Pair.create((Object)n6, o);
                                    break Label_0510;
                                }
                            }
                            final Object o = null;
                            continue;
                        }
                    }
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
        }
        return null;
    }
}
