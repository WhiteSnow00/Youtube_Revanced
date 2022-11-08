import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import java.util.Arrays;
import androidx.media3.common.DrmInitData;
import androidx.media3.extractor.metadata.mp4.MdtaMetadataEntry;
import androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry;
import androidx.media3.common.Metadata$Entry;
import java.util.List;
import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.id3.ApicFrame;
import androidx.media3.extractor.metadata.id3.InternalFrame;
import androidx.media3.extractor.metadata.id3.CommentFrame;
import androidx.media3.extractor.metadata.id3.TextInformationFrame;
import java.util.ArrayList;
import android.util.Pair;

// 
// Decompiled by Procyon v0.6.0
// 

final class bwh
{
    private static final byte[] a;
    
    static {
        a = baw.aj("OpusHead");
    }
    
    public static Pair a(final bvz bvz) {
        final bar a = bvz.a;
        a.G(8);
        Object o2;
        Object o = o2 = null;
        while (a.a() >= 8) {
            final int b = a.b;
            final int d = a.d();
            final int d2 = a.d();
            Object o4 = null;
            Label_1392: {
                if (d2 == 1835365473) {
                    a.G(b);
                    a.H(8);
                    c(a);
                Label_1228:
                    while (true) {
                        final int b2 = a.b;
                        if (b2 >= b + d) {
                            break;
                        }
                        final int d3 = a.d();
                        if (a.d() == 1768715124) {
                            a.G(b2);
                            a.H(8);
                            final ArrayList<Throwable> list = new ArrayList<Throwable>();
                            int b3;
                            int n;
                            int n2;
                            int n3;
                            String s;
                            TextInformationFrame textInformationFrame;
                            String v2;
                            String v;
                            int d4;
                            String s2;
                            int b4;
                            int d5;
                            String v3;
                            CommentFrame commentFrame;
                            InternalFrame internalFrame;
                            byte[] array;
                            ApicFrame apicFrame;
                            StringBuilder sb;
                            Object o3 = null;
                            Label_0270_Outer:Block_46_Outer:
                            while (true) {
                                if (a.b < b2 + d3) {
                                    b3 = bwm.b;
                                    n = a.b + a.d();
                                    n2 = a.d();
                                    n3 = (n2 >> 24 & 0xFF);
                                    Label_1184: {
                                        Label_1170: {
                                            Label_1164: {
                                                Label_1123: {
                                                    Label_0872: {
                                                        if (n3 == 169 || n3 == 253) {
                                                            break Label_0872;
                                                        }
                                                        Label_0254: {
                                                            if (n2 != 1735291493) {
                                                                break Label_0254;
                                                            }
                                                            try {
                                                                n2 = bwm.a(a);
                                                                if (n2 > 0 && n2 <= 192) {
                                                                    s = bwm.a[n2 - 1];
                                                                }
                                                                else {
                                                                    s = null;
                                                                }
                                                                while (true) {
                                                                Label_0270:
                                                                    while (true) {
                                                                        Label_0706_Outer:Block_49_Outer:
                                                                        while (true) {
                                                                            if (s != null) {
                                                                                textInformationFrame = new TextInformationFrame("TCON", (String)null, s);
                                                                            }
                                                                            else {
                                                                                bao.c("MetadataUtil", "Failed to parse standard genre code");
                                                                            }
                                                                            a.G(n);
                                                                            break Label_1170;
                                                                            while (true) {
                                                                            Label_0706:
                                                                                while (true) {
                                                                                    Label_0810: {
                                                                                        Block_44: {
                                                                                            Block_54: {
                                                                                                Block_41: {
                                                                                                    Block_52_Outer:Label_0787_Outer:Block_40_Outer:Label_0403_Outer:Block_36_Outer:
                                                                                                    while (true) {
                                                                                                        bwm.b(1920233063, "ITUNESADVISORY", a, false, false);
                                                                                                        continue Label_0270;
                                                                                                        while (true) {
                                                                                                            v = (v2 = null);
                                                                                                            n2 = -1;
                                                                                                            n3 = -1;
                                                                                                            break Label_0706;
                                                                                                            Label_0689: {
                                                                                                                iftrue(Label_0869:)(n2 != 757935405);
                                                                                                            }
                                                                                                            continue Label_0706_Outer;
                                                                                                        }
                                                                                                        Label_0298: {
                                                                                                            iftrue(Label_0319:)(n2 != 1953329263);
                                                                                                        }
                                                                                                    Block_38_Outer:
                                                                                                        while (true) {
                                                                                                            while (true) {
                                                                                                                Block_37: {
                                                                                                                    Block_45: {
                                                                                                                        while (true) {
                                                                                                                            Label_0801: {
                                                                                                                                Block_42: {
                                                                                                                                    Block_34: {
                                                                                                                                        while (true) {
                                                                                                                                            while (true) {
                                                                                                                                                Label_0403:Block_61_Outer:
                                                                                                                                                while (true) {
                                                                                                                                                    while (true) {
                                                                                                                                                        while (true) {
                                                                                                                                                            while (true) {
                                                                                                                                                            Block_53:
                                                                                                                                                                while (true) {
                                                                                                                                                                    Block_35: {
                                                                                                                                                                        break Block_35;
                                                                                                                                                                        Label_0869:
                                                                                                                                                                        break Label_1123;
                                                                                                                                                                        Label_0279:
                                                                                                                                                                        iftrue(Label_0298:)(n2 != 1953655662);
                                                                                                                                                                        break Block_34;
                                                                                                                                                                        while (true) {
                                                                                                                                                                            bwm.d(1953919848, "TVSHOW", a);
                                                                                                                                                                            continue Label_0270;
                                                                                                                                                                            iftrue(Label_0797:)(d4 == 1684108385);
                                                                                                                                                                            break Label_0801;
                                                                                                                                                                            s2 = "image/png";
                                                                                                                                                                            n2 = 14;
                                                                                                                                                                            break Label_0403;
                                                                                                                                                                            b4 = a.b;
                                                                                                                                                                            iftrue(Label_0813:)(b4 >= n);
                                                                                                                                                                            break Block_53;
                                                                                                                                                                            Label_0670:
                                                                                                                                                                            iftrue(Label_0689:)(n2 != 1953919848);
                                                                                                                                                                            continue Label_0787_Outer;
                                                                                                                                                                        }
                                                                                                                                                                        Label_0651:
                                                                                                                                                                        iftrue(Label_0670:)(n2 != 1936683886);
                                                                                                                                                                        while (true) {
                                                                                                                                                                            Block_50: {
                                                                                                                                                                                break Block_50;
                                                                                                                                                                                v2 = a.v(d5 - 12);
                                                                                                                                                                                break Label_0810;
                                                                                                                                                                                a.H(8);
                                                                                                                                                                                v3 = a.v(n3 - 16);
                                                                                                                                                                                commentFrame = new CommentFrame("und", v3, v3);
                                                                                                                                                                                break Label_1164;
                                                                                                                                                                                bwm.b(1668311404, "TCMP", a, true, true);
                                                                                                                                                                                continue Label_0270;
                                                                                                                                                                            }
                                                                                                                                                                            bwm.d(1936683886, "TVSHOWSORT", a);
                                                                                                                                                                            continue Label_0270;
                                                                                                                                                                            s2 = "image/jpeg";
                                                                                                                                                                            break Label_0403;
                                                                                                                                                                            n3 = a.d();
                                                                                                                                                                            iftrue(Label_0932:)(a.d() != 1684108385);
                                                                                                                                                                            continue Block_36_Outer;
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    bwm.b(1953329263, "TBPM", a, true, false);
                                                                                                                                                                    continue Label_0270;
                                                                                                                                                                    while (true) {
                                                                                                                                                                        a.G(n2);
                                                                                                                                                                        a.H(16);
                                                                                                                                                                        internalFrame = new InternalFrame(v, v2, a.v(n3 - 16));
                                                                                                                                                                        continue Label_0270_Outer;
                                                                                                                                                                        Label_0340:
                                                                                                                                                                        iftrue(Label_0495:)(n2 != 1668249202);
                                                                                                                                                                        break Block_37;
                                                                                                                                                                        Label_0813:
                                                                                                                                                                        iftrue(Label_0864:)(v == null || v2 == null || n2 == -1);
                                                                                                                                                                        continue Block_49_Outer;
                                                                                                                                                                    }
                                                                                                                                                                    Label_0495:
                                                                                                                                                                    iftrue(Label_0514:)(n2 != 1631670868);
                                                                                                                                                                    break Block_42;
                                                                                                                                                                    bwm.b(1885823344, "ITUNESGAPLESS", a, false, true);
                                                                                                                                                                    continue Label_0270;
                                                                                                                                                                    iftrue(Label_0443:)(s2 != null);
                                                                                                                                                                    break Block_41;
                                                                                                                                                                    n3 = d5;
                                                                                                                                                                    continue Block_40_Outer;
                                                                                                                                                                }
                                                                                                                                                                d5 = a.d();
                                                                                                                                                                d4 = a.d();
                                                                                                                                                                a.H(4);
                                                                                                                                                                iftrue(Label_0756:)(d4 != 1835360622);
                                                                                                                                                                break Block_54;
                                                                                                                                                                iftrue(Label_0279:)(n2 != 1684632427);
                                                                                                                                                                bwm.c(1684632427, "TPOS", a);
                                                                                                                                                                continue Label_0270;
                                                                                                                                                                n2 = bwa.e(a.d());
                                                                                                                                                                iftrue(Label_0384:)(n2 != 13);
                                                                                                                                                                continue Block_61_Outer;
                                                                                                                                                            }
                                                                                                                                                            Label_0384:
                                                                                                                                                            iftrue(Label_0401:)(n2 != 14);
                                                                                                                                                            continue Label_0403_Outer;
                                                                                                                                                        }
                                                                                                                                                        Label_0590:
                                                                                                                                                        iftrue(Label_0609:)(n2 != 1936679791);
                                                                                                                                                        Block_47: {
                                                                                                                                                            break Block_47;
                                                                                                                                                            Label_0864:
                                                                                                                                                            continue Label_0270;
                                                                                                                                                        }
                                                                                                                                                        bwm.d(1936679791, "TSOC", a);
                                                                                                                                                        continue Label_0270;
                                                                                                                                                        Label_0797:
                                                                                                                                                        n2 = b4;
                                                                                                                                                        break Label_0801;
                                                                                                                                                        Label_0533:
                                                                                                                                                        iftrue(Label_0552:)(n2 != 1936679276);
                                                                                                                                                        break Block_44;
                                                                                                                                                        Label_0443:
                                                                                                                                                        a.H(4);
                                                                                                                                                        n2 = n3 - 16;
                                                                                                                                                        array = new byte[n2];
                                                                                                                                                        a.B(array, 0, n2);
                                                                                                                                                        apicFrame = new ApicFrame(s2, (String)null, 3, array);
                                                                                                                                                        continue Label_0270;
                                                                                                                                                        n3 = (0xFFFFFF & n2);
                                                                                                                                                        iftrue(Label_0956:)(n3 != 6516084);
                                                                                                                                                        continue Block_49_Outer;
                                                                                                                                                    }
                                                                                                                                                    Label_0401:
                                                                                                                                                    s2 = null;
                                                                                                                                                    continue Label_0403;
                                                                                                                                                }
                                                                                                                                                Label_0756:
                                                                                                                                                iftrue(Label_0776:)(d4 != 1851878757);
                                                                                                                                                continue Block_36_Outer;
                                                                                                                                            }
                                                                                                                                            Label_0552:
                                                                                                                                            iftrue(Label_0571:)(n2 != 1936679282);
                                                                                                                                            break Block_45;
                                                                                                                                            Label_0319:
                                                                                                                                            iftrue(Label_0340:)(n2 != 1668311404);
                                                                                                                                            continue Block_49_Outer;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    bwm.c(1953655662, "TRCK", a);
                                                                                                                                    continue Label_0270;
                                                                                                                                }
                                                                                                                                bwm.d(1631670868, "TPE2", a);
                                                                                                                                continue Label_0270;
                                                                                                                                bwm.d(1936682605, "TSOT", a);
                                                                                                                                continue Label_0270;
                                                                                                                            }
                                                                                                                            a.H(d5 - 12);
                                                                                                                            break Label_0810;
                                                                                                                            Label_0514:
                                                                                                                            iftrue(Label_0533:)(n2 != 1936682605);
                                                                                                                            continue Block_46_Outer;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    bwm.d(1936679282, "TSOA", a);
                                                                                                                    continue Label_0270;
                                                                                                                }
                                                                                                                n3 = a.d();
                                                                                                                iftrue(Label_0483:)(a.d() != 1684108385);
                                                                                                                continue Block_46_Outer;
                                                                                                            }
                                                                                                            Label_0776:
                                                                                                            iftrue(Label_0787:)(d4 != 1684108385);
                                                                                                            continue Block_38_Outer;
                                                                                                        }
                                                                                                        Label_0609:
                                                                                                        iftrue(Label_0630:)(n2 != 1920233063);
                                                                                                        continue Block_52_Outer;
                                                                                                    }
                                                                                                    Label_0932: {
                                                                                                        bao.c("MetadataUtil", "Failed to parse comment attribute: ".concat(bwa.g(n2)));
                                                                                                    }
                                                                                                    break Label_1164;
                                                                                                }
                                                                                                sb = new StringBuilder();
                                                                                                sb.append("Unrecognized cover art flags: ");
                                                                                                sb.append(n2);
                                                                                                bao.c("MetadataUtil", sb.toString());
                                                                                                continue Label_0270_Outer;
                                                                                            }
                                                                                            v = a.v(d5 - 12);
                                                                                            break Label_0810;
                                                                                        }
                                                                                        bwm.d(1936679276, "TSO2", a);
                                                                                        continue Label_0270;
                                                                                    }
                                                                                    continue Label_0706;
                                                                                }
                                                                                Label_0630: {
                                                                                    iftrue(Label_0651:)(n2 != 1885823344);
                                                                                }
                                                                                continue Block_46_Outer;
                                                                            }
                                                                            Label_0483: {
                                                                                bao.c("MetadataUtil", "Failed to parse cover art attribute");
                                                                            }
                                                                            continue Label_0270_Outer;
                                                                        }
                                                                        bwm.d(1936679265, "TSOP", a);
                                                                        continue Label_0270;
                                                                    }
                                                                    Label_0571: {
                                                                        iftrue(Label_0590:)(n2 != 1936679265);
                                                                    }
                                                                    continue;
                                                                }
                                                            }
                                                            finally {
                                                                break Label_1184;
                                                            }
                                                        }
                                                    }
                                                    Label_0956: {
                                                        if (n3 == 7233901 || n3 == 7631467) {
                                                            o3 = bwm.d(n2, "TIT2", a);
                                                            break Label_1164;
                                                        }
                                                    }
                                                    if (n3 == 6516589 || n3 == 7828084) {
                                                        o3 = bwm.d(n2, "TCOM", a);
                                                        break Label_1164;
                                                    }
                                                    if (n3 == 6578553) {
                                                        o3 = bwm.d(n2, "TDRC", a);
                                                        break Label_1164;
                                                    }
                                                    if (n3 == 4280916) {
                                                        o3 = bwm.d(n2, "TPE1", a);
                                                        break Label_1164;
                                                    }
                                                    if (n3 == 7630703) {
                                                        o3 = bwm.d(n2, "TSSE", a);
                                                        break Label_1164;
                                                    }
                                                    if (n3 == 6384738) {
                                                        o3 = bwm.d(n2, "TALB", a);
                                                        break Label_1164;
                                                    }
                                                    if (n3 == 7108978) {
                                                        o3 = bwm.d(n2, "USLT", a);
                                                        break Label_1164;
                                                    }
                                                    if (n3 == 6776174) {
                                                        o3 = bwm.d(n2, "TCON", a);
                                                        break Label_1164;
                                                    }
                                                    if (n3 == 6779504) {
                                                        o3 = bwm.d(n2, "TIT1", a);
                                                        break Label_1164;
                                                    }
                                                }
                                                bwa.g(n2);
                                                bao.e();
                                                a.G(n);
                                                o3 = null;
                                                break Label_1170;
                                            }
                                            a.G(n);
                                        }
                                        if (o3 == null) {
                                            continue;
                                        }
                                        list.add((Throwable)o3);
                                        continue;
                                    }
                                    a.G(n);
                                }
                                else {
                                    if (list.isEmpty()) {
                                        break Label_1228;
                                    }
                                    o4 = new Metadata((List)list);
                                    break Label_1392;
                                }
                            }
                        }
                        else {
                            a.G(b2 + d3);
                        }
                    }
                    o4 = null;
                }
                else {
                    o4 = o;
                    if (d2 == 1936553057) {
                        a.G(b);
                        a.H(12);
                        while (true) {
                            final int b5 = a.b;
                            if (b5 >= b + d) {
                                break;
                            }
                            final int d6 = a.d();
                            if (a.d() == 1935766900) {
                                if (d6 < 14) {
                                    break;
                                }
                                a.H(5);
                                final int i = a.i();
                                float n4 = 120.0f;
                                if (i != 12) {
                                    if (i != 13) {
                                        break;
                                    }
                                }
                                else if (i == 12) {
                                    n4 = 240.0f;
                                }
                                a.H(1);
                                o2 = new Metadata(new Metadata$Entry[] { (Metadata$Entry)new SmtaMetadataEntry(n4, a.i()) });
                                o4 = o;
                                break Label_1392;
                            }
                            else {
                                a.G(b5 + d6);
                            }
                        }
                        o2 = null;
                        o4 = o;
                    }
                }
            }
            a.G(b + d);
            o = o4;
        }
        return Pair.create(o, o2);
    }
    
    public static Metadata b(final bvy bvy) {
        final bvz b = bvy.b(1751411826);
        final bvz b2 = bvy.b(1801812339);
        final bvz b3 = bvy.b(1768715124);
        if (b == null || b2 == null || b3 == null || g(b.a) != 1835299937) {
            return null;
        }
        final bar a = b2.a;
        a.G(12);
        final int d = a.d();
        final String[] array = new String[d];
        for (int i = 0; i < d; ++i) {
            final int d2 = a.d();
            a.H(4);
            array[i] = a.w(d2 - 8);
        }
        final bar a2 = b3.a;
        a2.G(8);
        final ArrayList<Object> list = new ArrayList<Object>();
        while (a2.a() > 8) {
            final int b4 = a2.b;
            final int d3 = a2.d();
            final int n = a2.d() - 1;
            if (n >= 0 && n < d) {
                final String s = array[n];
                final int b5 = bwm.b;
                Object o;
                while (true) {
                    final int b6 = a2.b;
                    if (b6 >= b4 + d3) {
                        o = null;
                        break;
                    }
                    int d4 = a2.d();
                    if (a2.d() == 1684108385) {
                        final int d5 = a2.d();
                        final int d6 = a2.d();
                        d4 -= 16;
                        final byte[] array2 = new byte[d4];
                        a2.B(array2, 0, d4);
                        o = new MdtaMetadataEntry(s, array2, d6, d5);
                        break;
                    }
                    a2.G(b6 + d4);
                }
                if (o != null) {
                    list.add(o);
                }
            }
            else {
                final StringBuilder sb = new StringBuilder("Skipped metadata with unknown key index: ");
                sb.append(n);
                bao.c("AtomParsers", sb.toString());
            }
            a2.G(b4 + d3);
        }
        if (list.isEmpty()) {
            return null;
        }
        return new Metadata((List)list);
    }
    
    public static void c(final bar bar) {
        final int b = bar.b;
        bar.H(4);
        int n = b;
        if (bar.d() != 1751411826) {
            n = b + 4;
        }
        bar.G(n);
    }
    
    public static List d(final bvy bvy, final btq btq, final long n, final DrmInitData drmInitData, final boolean b, final aexg aexg) {
        ArrayList list = new ArrayList();
        ArrayList list2;
    Label_5038_Outer:
        for (int i = 0; i < bvy.c.size(); ++i, list = list2) {
            final bvy bvy2 = bvy.c.get(i);
            if (bvy2.d != 1953653099) {
                list2 = list;
            }
            else {
                final bvz b2 = bvy.b(1836476516);
                dk.d((Object)b2);
                final bvy a = bvy2.a(1835297121);
                dk.d((Object)a);
                final bvz b3 = a.b(1751411826);
                dk.d((Object)b3);
                final int e = e(g(b3.a));
                Object o3 = null;
                String s12 = null;
                Label_3670: {
                    String s;
                    if (e == -1) {
                        s = "AtomParsers";
                    }
                    else {
                        final bvz b4 = bvy2.b(1953196132);
                        dk.d((Object)b4);
                        final bar a2 = b4.a;
                        int n2 = 8;
                        a2.G(8);
                        final int f = bwa.f(a2.d());
                        if (f != 0) {
                            n2 = 16;
                        }
                        a2.H(n2);
                        final int d = a2.d();
                        a2.H(4);
                        final int b5 = a2.b;
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
                        Label_0329: {
                            while (true) {
                                n5 = -9223372036854775807L;
                                if (n4 >= n3) {
                                    a2.H(n3);
                                    break;
                                }
                                if (a2.a[b5 + n4] != -1) {
                                    long n6;
                                    if (f == 0) {
                                        n6 = a2.q();
                                    }
                                    else {
                                        n6 = a2.r();
                                    }
                                    n7 = n6;
                                    if (n6 == 0L) {
                                        break;
                                    }
                                    break Label_0329;
                                }
                                else {
                                    ++n4;
                                }
                            }
                            n7 = -9223372036854775807L;
                        }
                        a2.H(16);
                        final int d2 = a2.d();
                        final int d3 = a2.d();
                        a2.H(4);
                        final int d4 = a2.d();
                        final int d5 = a2.d();
                        final int n8 = 65536;
                        s = "AtomParsers";
                        int n9 = d2;
                        int n10 = d3;
                        int n11 = d4;
                        int n12 = 0;
                        Label_0579: {
                            if (d2 == 0) {
                                if (d3 == 65536) {
                                    if (d4 == -65536) {
                                        if (d5 == 0) {
                                            n12 = 90;
                                            break Label_0579;
                                        }
                                        n9 = 0;
                                        n10 = 65536;
                                        n11 = -65536;
                                    }
                                    else {
                                        n9 = 0;
                                        n10 = 65536;
                                        n11 = d4;
                                    }
                                }
                                else {
                                    n9 = 0;
                                    n11 = d4;
                                    n10 = d3;
                                }
                            }
                            int n13;
                            int n14;
                            if (n9 == 0) {
                                if (n10 == -65536) {
                                    if (n11 == 65536) {
                                        n13 = n8;
                                        if (d5 == 0) {
                                            n12 = 270;
                                            break Label_0579;
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
                            if (n14 == -65536 && n10 == 0 && n13 == 0 && d5 == -65536) {
                                n12 = 180;
                            }
                            else {
                                n12 = 0;
                            }
                        }
                        if (n != -9223372036854775807L) {
                            n7 = n;
                        }
                        final bar a3 = b2.a;
                        int n16 = 8;
                        a3.G(8);
                        if (bwa.f(a3.d()) != 0) {
                            n16 = 16;
                        }
                        a3.H(n16);
                        final long q = a3.q();
                        long y;
                        if (n7 == -9223372036854775807L) {
                            y = n5;
                        }
                        else {
                            y = baw.y(n7, 1000000L, q);
                        }
                        final bvy a4 = a.a(1835626086);
                        dk.d((Object)a4);
                        final bvy a5 = a4.a(1937007212);
                        dk.d((Object)a5);
                        final bvz b6 = a.b(1835296868);
                        dk.d((Object)b6);
                        final Pair j = i(b6.a);
                        final bvz b7 = a5.b(1937011556);
                        dk.d((Object)b7);
                        final bar a6 = b7.a;
                        final String c = (String)j.second;
                        a6.G(12);
                        final int d6 = a6.d();
                        bwe bwe = new bwe(d6);
                        int k = 0;
                        final long n17 = q;
                        final int s2 = n12;
                        while (k < d6) {
                            final int b8 = a6.b;
                            int d7;
                            final int n18 = d7 = a6.d();
                            blx.c(d7 > 0, "childAtomSize must be positive");
                            final int d8 = a6.d();
                            bwe bwe2 = null;
                            String s4 = null;
                            Label_3518: {
                                if (d8 != 1635148593 && d8 != 1635148595 && d8 != 1701733238 && d8 != 1831958048 && d8 != 1836070006 && d8 != 1752589105 && d8 != 1751479857 && d8 != 1932670515 && d8 != 1211250227 && d8 != 1987063864 && d8 != 1987063865 && d8 != 1635135537 && d8 != 1685479798 && d8 != 1685479729 && d8 != 1685481573 && d8 != 1685481521) {
                                    if (d8 != 1836069985 && d8 != 1701733217 && d8 != 1633889587 && d8 != 1700998451 && d8 != 1633889588 && d8 != 1835823201 && d8 != 1685353315 && d8 != 1685353317 && d8 != 1685353320 && d8 != 1685353324 && d8 != 1685353336 && d8 != 1935764850 && d8 != 1935767394 && d8 != 1819304813 && d8 != 1936684916 && d8 != 1953984371 && d8 != 778924082 && d8 != 778924083 && d8 != 1835557169 && d8 != 1835560241 && d8 != 1634492771 && d8 != 1634492791 && d8 != 1970037111 && d8 != 1332770163 && d8 != 1716281667) {
                                        if (d8 != 1414810956 && d8 != 1954034535 && d8 != 2004251764 && d8 != 1937010800 && d8 != 1664495672) {
                                            if (d8 == 1835365492) {
                                                a6.G(b8 + 16);
                                                a6.u();
                                                final String u = a6.u();
                                                if (u != null) {
                                                    final aye aye = new aye();
                                                    aye.b(d);
                                                    aye.k = u;
                                                    bwe.a = aye.a();
                                                }
                                            }
                                            else if (d8 == 1667329389) {
                                                final aye aye2 = new aye();
                                                aye2.b(d);
                                                aye2.k = "application/x-camera-motion";
                                                bwe.a = aye2.a();
                                            }
                                            final String s3 = s;
                                            bwe2 = bwe;
                                            s4 = s3;
                                            break Label_3518;
                                        }
                                        a6.G(b8 + 16);
                                        String l = null;
                                        Object r = null;
                                        long o = 0L;
                                        Label_1492: {
                                            Label_1386: {
                                                if (d8 == 1414810956) {
                                                    l = "application/ttml+xml";
                                                }
                                                else {
                                                    if (d8 == 1954034535) {
                                                        final int n19 = d7 - 16;
                                                        final byte[] array = new byte[n19];
                                                        a6.B(array, 0, n19);
                                                        r = afcr.r((Object)array);
                                                        l = "application/x-quicktime-tx3g";
                                                        o = Long.MAX_VALUE;
                                                        break Label_1492;
                                                    }
                                                    if (d8 == 2004251764) {
                                                        l = "application/x-mp4-vtt";
                                                    }
                                                    else {
                                                        if (d8 == 1937010800) {
                                                            l = "application/ttml+xml";
                                                            o = 0L;
                                                            break Label_1386;
                                                        }
                                                        bwe.c = 1;
                                                        l = "application/x-mp4-cea-608";
                                                    }
                                                }
                                                o = Long.MAX_VALUE;
                                            }
                                            r = null;
                                        }
                                        final aye aye3 = new aye();
                                        aye3.b(d);
                                        aye3.k = l;
                                        aye3.c = c;
                                        aye3.o = o;
                                        aye3.m = (List)r;
                                        bwe.a = aye3.a();
                                    }
                                    else {
                                        m(a6, d8, b8, d7, d, c, b, drmInitData, bwe, k);
                                    }
                                    final String s5 = s;
                                    bwe2 = bwe;
                                    s4 = s5;
                                    d7 = n18;
                                }
                                else {
                                    final bar bar = a6;
                                    final String s6 = s;
                                    bar.G(b8 + 16);
                                    bar.H(16);
                                    final int m = bar.m();
                                    final int m2 = bar.m();
                                    bar.H(50);
                                    int b9 = bar.b;
                                    int intValue;
                                    DrmInitData drmInitData2;
                                    if (d8 == 1701733238) {
                                        final Pair j2 = j(bar, b8, d7);
                                        DrmInitData b10;
                                        if (j2 != null) {
                                            intValue = (int)j2.first;
                                            if (drmInitData == null) {
                                                b10 = null;
                                            }
                                            else {
                                                b10 = drmInitData.b(((lyp)j2.second).b);
                                            }
                                            bwe.d[k] = (lyp)j2.second;
                                        }
                                        else {
                                            b10 = drmInitData;
                                            intValue = 1701733238;
                                        }
                                        bar.G(b9);
                                        drmInitData2 = b10;
                                    }
                                    else {
                                        drmInitData2 = drmInitData;
                                        intValue = d8;
                                    }
                                    String a7;
                                    int n20;
                                    if (intValue == 1831958048) {
                                        a7 = "video/mpeg";
                                        n20 = intValue;
                                    }
                                    else {
                                        n20 = 1211250227;
                                        if (intValue == 1211250227) {
                                            a7 = "video/3gpp";
                                        }
                                        else {
                                            a7 = null;
                                            n20 = intValue;
                                        }
                                    }
                                    float t = 1.0f;
                                    final byte[] array2 = null;
                                    Object m3 = null;
                                    int n21 = -1;
                                    int v = -1;
                                    Object a8 = null;
                                    ByteBuffer byteBuffer = null;
                                    bwc k2 = null;
                                    int n22 = -1;
                                    int n23 = 0;
                                    int n24 = -1;
                                    final bwe bwe3 = bwe;
                                    final DrmInitData n25 = drmInitData2;
                                    byte[] u2 = array2;
                                    final int n26 = n20;
                                    while (b9 - b8 < d7) {
                                        bar.G(b9);
                                        final int b11 = bar.b;
                                        int d9 = bar.d();
                                        int n27 = n21;
                                        if (d9 == 0) {
                                            if (bar.b - b8 == d7) {
                                                break;
                                            }
                                            d9 = 0;
                                        }
                                        blx.c(d9 > 0, "childAtomSize must be positive");
                                        final int d10 = bar.d();
                                        Label_2046: {
                                            String s7;
                                            String s8;
                                            if (d10 == 1635148611) {
                                                blx.c(a7 == null, (String)null);
                                                bar.G(b11 + 8);
                                                final bst a9 = bst.a(bar);
                                                m3 = a9.a;
                                                bwe3.b = a9.b;
                                                if (n23 == 0) {
                                                    t = a9.e;
                                                }
                                                s7 = a9.f;
                                                s8 = "video/avc";
                                            }
                                            else {
                                                if (d10 != 1752589123) {
                                                    int n28 = 0;
                                                    Label_3278: {
                                                        ByteBuffer byteBuffer2 = null;
                                                        int n30 = 0;
                                                        int b13 = 0;
                                                        int n31 = 0;
                                                        int a10 = 0;
                                                        Label_3258: {
                                                            if (d10 != 1685480259 && d10 != 1685485123) {
                                                                if (d10 == 1987076931) {
                                                                    blx.c(a7 == null, (String)null);
                                                                    if (n26 == 1987063864) {
                                                                        a7 = "video/x-vnd.on2.vp8";
                                                                    }
                                                                    else {
                                                                        a7 = "video/x-vnd.on2.vp9";
                                                                    }
                                                                }
                                                                else if (d10 == 1635135811) {
                                                                    blx.c(a7 == null, (String)null);
                                                                    a7 = "video/av01";
                                                                }
                                                                else {
                                                                    if (d10 != 1668050025) {
                                                                        byte[] array3 = null;
                                                                        String s9 = null;
                                                                        Label_2511: {
                                                                            if (d10 == 1835295606) {
                                                                                ByteBuffer l2;
                                                                                if ((l2 = byteBuffer) == null) {
                                                                                    l2 = l();
                                                                                }
                                                                                final short z = bar.z();
                                                                                final short z2 = bar.z();
                                                                                final short z3 = bar.z();
                                                                                final short z4 = bar.z();
                                                                                final short z5 = bar.z();
                                                                                final short z6 = bar.z();
                                                                                n28 = v;
                                                                                final short z7 = bar.z();
                                                                                final short z8 = bar.z();
                                                                                final long q2 = bar.q();
                                                                                final long q3 = bar.q();
                                                                                l2.position(1);
                                                                                l2.putShort(z5);
                                                                                l2.putShort(z6);
                                                                                l2.putShort(z);
                                                                                l2.putShort(z2);
                                                                                l2.putShort(z3);
                                                                                l2.putShort(z4);
                                                                                l2.putShort(z7);
                                                                                l2.putShort(z8);
                                                                                l2.putShort((short)(q2 / 10000L));
                                                                                l2.putShort((short)(q3 / 10000L));
                                                                                byteBuffer2 = l2;
                                                                                array3 = u2;
                                                                                s9 = a7;
                                                                            }
                                                                            else {
                                                                                final Object o2 = m3;
                                                                                if (d10 == 1681012275) {
                                                                                    blx.c(a7 == null, (String)null);
                                                                                    s9 = "video/3gpp";
                                                                                    byteBuffer2 = byteBuffer;
                                                                                    n28 = v;
                                                                                    array3 = u2;
                                                                                }
                                                                                else {
                                                                                    if (d10 == 1702061171) {
                                                                                        blx.c(a7 == null, (String)null);
                                                                                        k2 = k(bar, b11);
                                                                                        a7 = k2.a;
                                                                                        final byte[] b12 = k2.b;
                                                                                        if (b12 != null) {
                                                                                            m3 = afcr.r((Object)b12);
                                                                                        }
                                                                                        else {
                                                                                            m3 = o2;
                                                                                        }
                                                                                        n28 = v;
                                                                                        break Label_3278;
                                                                                    }
                                                                                    if (d10 == 1885434736) {
                                                                                        bar.G(b11 + 8);
                                                                                        t = bar.l() / (float)bar.l();
                                                                                        m3 = o2;
                                                                                        n23 = 1;
                                                                                        break Label_2046;
                                                                                    }
                                                                                    if (d10 == 1937126244) {
                                                                                        while (true) {
                                                                                            int d11;
                                                                                            for (int n29 = b11 + 8; n29 - b11 < d9; n29 += d11) {
                                                                                                bar.G(n29);
                                                                                                d11 = bar.d();
                                                                                                if (bar.d() == 1886547818) {
                                                                                                    final byte[] copyOfRange = Arrays.copyOfRange(bar.a, n29, d11 + n29);
                                                                                                    s9 = a7;
                                                                                                    byteBuffer2 = byteBuffer;
                                                                                                    n28 = v;
                                                                                                    array3 = copyOfRange;
                                                                                                    break Label_2511;
                                                                                                }
                                                                                            }
                                                                                            final byte[] copyOfRange = null;
                                                                                            continue;
                                                                                        }
                                                                                    }
                                                                                    if (d10 == 1936995172) {
                                                                                        final int i2 = bar.i();
                                                                                        bar.H(3);
                                                                                        s9 = a7;
                                                                                        byteBuffer2 = byteBuffer;
                                                                                        n28 = v;
                                                                                        array3 = u2;
                                                                                        if (i2 == 0) {
                                                                                            final int i3 = bar.i();
                                                                                            if (i3 != 0) {
                                                                                                if (i3 != 1) {
                                                                                                    if (i3 != 2) {
                                                                                                        if (i3 != 3) {
                                                                                                            s9 = a7;
                                                                                                            byteBuffer2 = byteBuffer;
                                                                                                            n28 = v;
                                                                                                            array3 = u2;
                                                                                                        }
                                                                                                        else {
                                                                                                            n28 = 3;
                                                                                                            s9 = a7;
                                                                                                            byteBuffer2 = byteBuffer;
                                                                                                            array3 = u2;
                                                                                                        }
                                                                                                    }
                                                                                                    else {
                                                                                                        n28 = 2;
                                                                                                        s9 = a7;
                                                                                                        byteBuffer2 = byteBuffer;
                                                                                                        array3 = u2;
                                                                                                    }
                                                                                                }
                                                                                                else {
                                                                                                    n28 = 1;
                                                                                                    s9 = a7;
                                                                                                    byteBuffer2 = byteBuffer;
                                                                                                    array3 = u2;
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                n28 = 0;
                                                                                                s9 = a7;
                                                                                                byteBuffer2 = byteBuffer;
                                                                                                array3 = u2;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        s9 = a7;
                                                                                        byteBuffer2 = byteBuffer;
                                                                                        n28 = v;
                                                                                        array3 = u2;
                                                                                        if (d10 == 1668246642) {
                                                                                            final int d12 = bar.d();
                                                                                            if (d12 != 1852009592 && d12 != 1852009571) {
                                                                                                bao.c(s6, "Unsupported color type: ".concat(bwa.g(d12)));
                                                                                                n30 = d9;
                                                                                                byteBuffer2 = byteBuffer;
                                                                                                b13 = n22;
                                                                                                n31 = n24;
                                                                                                a10 = n27;
                                                                                                n28 = v;
                                                                                                break Label_3258;
                                                                                            }
                                                                                            final int m4 = bar.m();
                                                                                            final int m5 = bar.m();
                                                                                            bar.H(2);
                                                                                            boolean b14;
                                                                                            if (d9 == 19) {
                                                                                                b14 = ((bar.i() & 0x80) != 0x0);
                                                                                                d9 = 19;
                                                                                            }
                                                                                            else {
                                                                                                b14 = false;
                                                                                            }
                                                                                            a10 = axz.a(m4);
                                                                                            int n32;
                                                                                            if (!b14) {
                                                                                                n32 = 2;
                                                                                            }
                                                                                            else {
                                                                                                n32 = 1;
                                                                                            }
                                                                                            b13 = axz.b(m5);
                                                                                            n30 = d9;
                                                                                            byteBuffer2 = byteBuffer;
                                                                                            n31 = n32;
                                                                                            n28 = v;
                                                                                            break Label_3258;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        a7 = s9;
                                                                        n30 = d9;
                                                                        b13 = n22;
                                                                        n31 = n24;
                                                                        a10 = n27;
                                                                        u2 = array3;
                                                                        break Label_3258;
                                                                    }
                                                                    ByteBuffer l3;
                                                                    if ((l3 = byteBuffer) == null) {
                                                                        l3 = l();
                                                                    }
                                                                    l3.position(21);
                                                                    l3.putShort(bar.z());
                                                                    l3.putShort(bar.z());
                                                                    byteBuffer = l3;
                                                                }
                                                                break Label_2046;
                                                            }
                                                            final byte[] array4 = u2;
                                                            final bhu h = bhu.h(bar);
                                                            n30 = d9;
                                                            byteBuffer2 = byteBuffer;
                                                            b13 = n22;
                                                            n31 = n24;
                                                            a10 = n27;
                                                            n28 = v;
                                                            u2 = array4;
                                                            if (h != null) {
                                                                a8 = h.a;
                                                                a7 = "video/dolby-vision";
                                                                u2 = array4;
                                                                n28 = v;
                                                                a10 = n27;
                                                                n31 = n24;
                                                                b13 = n22;
                                                                byteBuffer2 = byteBuffer;
                                                                n30 = d9;
                                                            }
                                                        }
                                                        n27 = a10;
                                                        n24 = n31;
                                                        n22 = b13;
                                                        byteBuffer = byteBuffer2;
                                                        d9 = n30;
                                                    }
                                                    v = n28;
                                                    break Label_2046;
                                                }
                                                blx.c(a7 == null, (String)null);
                                                bar.G(b11 + 8);
                                                final btr a11 = btr.a(bar);
                                                m3 = a11.a;
                                                bwe3.b = a11.b;
                                                if (n23 == 0) {
                                                    t = a11.c;
                                                }
                                                s7 = a11.d;
                                                s8 = "video/hevc";
                                            }
                                            final String s10 = s7;
                                            a7 = s8;
                                            a8 = s10;
                                        }
                                        b9 += d9;
                                        n21 = n27;
                                    }
                                    if (a7 == null) {
                                        bwe2 = bwe3;
                                        s4 = s6;
                                    }
                                    else {
                                        final aye aye4 = new aye();
                                        aye4.b(d);
                                        aye4.k = a7;
                                        aye4.h = (String)a8;
                                        aye4.p = m;
                                        aye4.q = m2;
                                        aye4.t = t;
                                        aye4.s = s2;
                                        aye4.u = u2;
                                        aye4.v = v;
                                        aye4.m = (List)m3;
                                        aye4.n = n25;
                                        if (n21 != -1 || n24 != -1 || n22 != -1 || byteBuffer != null) {
                                            byte[] array5;
                                            if (byteBuffer != null) {
                                                array5 = byteBuffer.array();
                                            }
                                            else {
                                                array5 = null;
                                            }
                                            aye4.w = new axz(n21, n24, n22, array5);
                                        }
                                        if (k2 != null) {
                                            aye4.f = aesy.A(k2.c);
                                            aye4.g = aesy.A(k2.d);
                                        }
                                        final ayf a12 = aye4.a();
                                        bwe2 = bwe3;
                                        bwe2.a = a12;
                                        s4 = s6;
                                    }
                                }
                            }
                            a6.G(b8 + d7);
                            ++k;
                            final String s11 = s4;
                            bwe = bwe2;
                            s = s11;
                        }
                        final bvy a13 = bvy2.a(1701082227);
                        long[] array6 = null;
                        long[] array7 = null;
                        Label_3602: {
                            if (a13 != null) {
                                final Pair h2 = h(a13);
                                if (h2 != null) {
                                    array6 = (long[])h2.first;
                                    array7 = (long[])h2.second;
                                    break Label_3602;
                                }
                            }
                            array7 = null;
                            array6 = null;
                        }
                        if (bwe.a != null) {
                            o3 = new lyo(d, e, (long)j.first, n17, y, bwe.a, bwe.c, bwe.d, bwe.b, array6, array7, (byte[])null);
                            s12 = s;
                            break Label_3670;
                        }
                    }
                    o3 = null;
                    s12 = s;
                }
                final lyo lyo = (lyo)aexg.apply(o3);
                if (lyo != null) {
                    final bvy a14 = bvy2.a(1835297121);
                    dk.d((Object)a14);
                    final bvy a15 = a14.a(1835626086);
                    dk.d((Object)a15);
                    final bvy a16 = a15.a(1937007212);
                    dk.d((Object)a16);
                    final bvz b15 = a16.b(1937011578);
                    Object o4;
                    if (b15 != null) {
                        o4 = new bwf(b15, lyo.f);
                    }
                    else {
                        final bvz b16 = a16.b(1937013298);
                        if (b16 == null) {
                            throw ayz.a("Track has no sample table size information", (Throwable)null);
                        }
                        o4 = new bwg(b16);
                    }
                    int b17 = ((bwd)o4).b();
                    bwr bwr = null;
                    Label_3837: {
                        if (b17 == 0) {
                            bwr = new bwr(lyo, new long[0], new int[0], 0, new long[0], new int[0], 0L, null);
                        }
                        else {
                            bvz bvz = a16.b(1937007471);
                            boolean b18;
                            if (bvz == null) {
                                bvz = a16.b(1668232756);
                                dk.d((Object)bvz);
                                b18 = true;
                            }
                            else {
                                b18 = false;
                            }
                            final bar a17 = bvz.a;
                            final bvz b19 = a16.b(1937011555);
                            dk.d((Object)b19);
                            final bar a18 = b19.a;
                            final bvz b20 = a16.b(1937011827);
                            dk.d((Object)b20);
                            final bar a19 = b20.a;
                            final bvz b21 = a16.b(1937011571);
                            bar a20;
                            if (b21 != null) {
                                a20 = b21.a;
                            }
                            else {
                                a20 = null;
                            }
                            final bvz b22 = a16.b(1668576371);
                            bar a21;
                            if (b22 != null) {
                                a21 = b22.a;
                            }
                            else {
                                a21 = null;
                            }
                            final bwb bwb = new bwb(a18, a17, b18);
                            a19.G(12);
                            final int n33 = a19.l() - 1;
                            final int l4 = a19.l();
                            int n34 = a19.l();
                            int l5;
                            if (a21 != null) {
                                a21.G(12);
                                l5 = a21.l();
                            }
                            else {
                                l5 = 0;
                            }
                            int l6 = 0;
                            int n35 = 0;
                            bar bar2 = null;
                            Label_4115: {
                                if (a20 != null) {
                                    a20.G(12);
                                    l6 = a20.l();
                                    if (l6 > 0) {
                                        n35 = a20.l() - 1;
                                        bar2 = a20;
                                        break Label_4115;
                                    }
                                    a20 = null;
                                }
                                else {
                                    l6 = 0;
                                }
                                n35 = -1;
                                bar2 = a20;
                            }
                            int a22 = ((bwd)o4).a();
                            final String n36 = lyo.f.n;
                            int n37 = n33;
                            long[] copy = null;
                            int[] array10 = null;
                            long[] array11 = null;
                            int n44 = 0;
                            int[] array13 = null;
                            long n52 = 0L;
                            Label_5406: {
                                Label_4501: {
                                    if (a22 != -1) {
                                        if (!"audio/raw".equals(n36) && !"audio/g711-mlaw".equals(n36)) {
                                            n37 = n33;
                                            if (!"audio/g711-alaw".equals(n36)) {
                                                break Label_4501;
                                            }
                                        }
                                        if ((n37 = n33) == 0) {
                                            if (l5 == 0 && l6 == 0) {
                                                final int a23 = bwb.a;
                                                final long[] array8 = new long[a23];
                                                final int[] array9 = new int[a23];
                                                while (bwb.a()) {
                                                    final int b23 = bwb.b;
                                                    array8[b23] = bwb.d;
                                                    array9[b23] = bwb.c;
                                                }
                                                final long n38 = n34;
                                                final int n39 = 8192 / a22;
                                                int n40 = 0;
                                                int n41 = 0;
                                                while (n40 < a23) {
                                                    n41 += baw.c(array9[n40], n39);
                                                    ++n40;
                                                }
                                                copy = new long[n41];
                                                array10 = new int[n41];
                                                array11 = new long[n41];
                                                final int[] array12 = new int[n41];
                                                int n42 = 0;
                                                int n43 = 0;
                                                n44 = 0;
                                                int n45 = 0;
                                                while (n42 < a23) {
                                                    final int n46 = array9[n42];
                                                    long n47 = array8[n42];
                                                    int max = n44;
                                                    final int n48 = a22;
                                                    int min;
                                                    for (int n49 = n46; n49 > 0; n49 -= min, ++n45) {
                                                        min = Math.min(n39, n49);
                                                        copy[n45] = n47;
                                                        final int n50 = n48 * min;
                                                        array10[n45] = n50;
                                                        max = Math.max(max, n50);
                                                        array11[n45] = n43 * n38;
                                                        array12[n45] = 1;
                                                        n47 += array10[n45];
                                                        n43 += min;
                                                    }
                                                    ++n42;
                                                    a22 = n48;
                                                    n44 = max;
                                                }
                                                final long n51 = n43;
                                                array13 = array12;
                                                n52 = n38 * n51;
                                                break Label_5406;
                                            }
                                            n37 = 0;
                                        }
                                    }
                                }
                                final long[] array14 = new long[b17];
                                final int[] array15 = new int[b17];
                                final long[] array16 = new long[b17];
                                final int[] array17 = new int[b17];
                                final int n53 = n37;
                                int l7 = l4;
                                int n54 = n35;
                                int n55 = l6;
                                int n56 = 0;
                                int n57 = 0;
                                final int n58 = 0;
                                final int n59 = 0;
                                long d13 = 0L;
                                long n60 = 0L;
                                final int n61 = l5;
                                int n62 = 0;
                                int n63 = n53;
                                int n64 = n59;
                                int n65 = n61;
                                int c2 = n58;
                            Label_5038:
                                while (true) {
                                    while (n57 < b17) {
                                        boolean a24 = true;
                                        final int n66 = n62;
                                        final int n67 = b17;
                                        int[] copy4;
                                        int[] array18;
                                        long[] array19;
                                        while (true) {
                                            while (c2 == 0) {
                                                a24 = bwb.a();
                                                if (a24) {
                                                    d13 = bwb.d;
                                                    c2 = bwb.c;
                                                }
                                                else {
                                                    final int n68 = 0;
                                                    int d14 = n66;
                                                    if (!a24) {
                                                        bao.c(s12, "Unexpected end of chunk data");
                                                        copy = Arrays.copyOf(array14, n57);
                                                        final int[] copy2 = Arrays.copyOf(array15, n57);
                                                        final long[] copy3 = Arrays.copyOf(array16, n57);
                                                        copy4 = Arrays.copyOf(array17, n57);
                                                        n62 = d14;
                                                        array18 = copy2;
                                                        b17 = n57;
                                                        array19 = copy3;
                                                        break Label_5038;
                                                    }
                                                    int n69 = n65;
                                                    int n70 = n64;
                                                    int n71 = d14;
                                                    if (a21 != null) {
                                                        int l8;
                                                        int n72;
                                                        for (l8 = n64, n72 = n65; l8 == 0; l8 = a21.l(), d14 = a21.d(), --n72) {
                                                            if (n72 <= 0) {
                                                                l8 = 0;
                                                                break;
                                                            }
                                                        }
                                                        n70 = l8 - 1;
                                                        n71 = d14;
                                                        n69 = n72;
                                                    }
                                                    array14[n57] = d13;
                                                    final int c3 = ((bwd)o4).c();
                                                    int n73;
                                                    if ((array15[n57] = c3) > (n73 = n56)) {
                                                        n73 = c3;
                                                    }
                                                    array16[n57] = n60 + n71;
                                                    int n74;
                                                    if (bar2 == null) {
                                                        n74 = 1;
                                                    }
                                                    else {
                                                        n74 = 0;
                                                    }
                                                    array17[n57] = n74;
                                                    int n75 = n54;
                                                    int n76 = n55;
                                                    if (n57 == n54) {
                                                        array17[n57] = 1;
                                                        final int n77 = n55 - 1;
                                                        n75 = n54;
                                                        if ((n76 = n77) > 0) {
                                                            dk.d((Object)bar2);
                                                            n75 = bar2.l() - 1;
                                                            n76 = n77;
                                                        }
                                                    }
                                                    n60 += n34;
                                                    if (--l7 == 0) {
                                                        if (n63 > 0) {
                                                            l7 = a19.l();
                                                            n34 = a19.d();
                                                            --n63;
                                                        }
                                                        else {
                                                            l7 = 0;
                                                        }
                                                    }
                                                    d13 += array15[n57];
                                                    final int n78 = n68 - 1;
                                                    ++n57;
                                                    b17 = n67;
                                                    n54 = n75;
                                                    n56 = n73;
                                                    n62 = n71;
                                                    c2 = n78;
                                                    n65 = n69;
                                                    n64 = n70;
                                                    n55 = n76;
                                                    continue Label_5038;
                                                }
                                            }
                                            final int n68 = c2;
                                            continue Label_5038_Outer;
                                        }
                                        n52 = n60 + n62;
                                        boolean b24 = false;
                                        Label_5085: {
                                            if (a21 != null) {
                                                while (n65 > 0) {
                                                    if (a21.l() != 0) {
                                                        b24 = false;
                                                        break Label_5085;
                                                    }
                                                    a21.d();
                                                    --n65;
                                                }
                                            }
                                            b24 = true;
                                        }
                                        Label_5386: {
                                            int n79;
                                            int n80;
                                            int n81;
                                            int n82;
                                            if (n55 == 0) {
                                                if (l7 == 0) {
                                                    if (c2 == 0) {
                                                        if (n63 == 0) {
                                                            if (n64 == 0) {
                                                                if (b24) {
                                                                    break Label_5386;
                                                                }
                                                                b24 = false;
                                                                n79 = 0;
                                                                n80 = 0;
                                                                c2 = 0;
                                                                n81 = 0;
                                                                n82 = 0;
                                                            }
                                                            else {
                                                                n82 = n64;
                                                                n79 = 0;
                                                                n80 = 0;
                                                                c2 = 0;
                                                                n81 = 0;
                                                            }
                                                        }
                                                        else {
                                                            n82 = n64;
                                                            n81 = n63;
                                                            n79 = 0;
                                                            n80 = 0;
                                                            c2 = 0;
                                                        }
                                                    }
                                                    else {
                                                        n82 = n64;
                                                        n81 = n63;
                                                        n79 = 0;
                                                        n80 = 0;
                                                    }
                                                }
                                                else {
                                                    n82 = n64;
                                                    final int n83 = n63;
                                                    n80 = l7;
                                                    n79 = 0;
                                                    n81 = n83;
                                                }
                                            }
                                            else {
                                                n82 = n64;
                                                n79 = n55;
                                                final int n84 = n63;
                                                n80 = l7;
                                                n81 = n84;
                                            }
                                            final int a25 = lyo.a;
                                            String s13;
                                            if (!b24) {
                                                s13 = ", ctts invalid";
                                            }
                                            else {
                                                s13 = "";
                                            }
                                            final StringBuilder sb = new StringBuilder("Inconsistent stbl box for track ");
                                            sb.append(a25);
                                            sb.append(": remainingSynchronizationSamples ");
                                            sb.append(n79);
                                            sb.append(", remainingSamplesAtTimestampDelta ");
                                            sb.append(n80);
                                            sb.append(", remainingSamplesInChunk ");
                                            sb.append(c2);
                                            sb.append(", remainingTimestampDeltaChanges ");
                                            sb.append(n81);
                                            sb.append(", remainingSamplesAtTimestampOffset ");
                                            sb.append(n82);
                                            sb.append(s13);
                                            bao.c(s12, sb.toString());
                                        }
                                        n44 = n56;
                                        final int[] array20 = array18;
                                        array13 = copy4;
                                        array11 = array19;
                                        array10 = array20;
                                        break Label_5406;
                                    }
                                    int[] copy4 = array17;
                                    long[] array19 = array16;
                                    int[] array18 = array15;
                                    copy = array14;
                                    continue Label_5038;
                                }
                            }
                            final lyo lyo2 = lyo;
                            final long y2 = baw.y(n52, 1000000L, lyo2.c);
                            final long[] h3 = lyo2.h;
                            if (h3 == null) {
                                baw.aA(array11, lyo2.c);
                                bwr = new bwr(lyo2, copy, array10, n44, array11, array13, y2, null);
                            }
                            else {
                                Label_5766: {
                                    if (h3.length == 1 && lyo2.b == 1) {
                                        final int length = array11.length;
                                        if (length >= 2) {
                                            final long n85 = ((long[])dk.d((Object)lyo2.i))[0];
                                            final long n86 = n85 + baw.y(lyo2.h[0], lyo2.c, lyo2.d);
                                            final int n87 = length - 1;
                                            final int e2 = baw.e(4, 0, n87);
                                            final int e3 = baw.e(length - 4, 0, n87);
                                            final long n88 = array11[0];
                                            if (n88 <= n85 && n85 < array11[e2] && array11[e3] < n86 && n86 <= n52) {
                                                final long y3 = baw.y(n85 - n88, (long)lyo2.f.B, lyo2.c);
                                                final long y4 = baw.y(n52 - n86, (long)lyo2.f.B, lyo2.c);
                                                long n89 = y3;
                                                if (y3 == 0L) {
                                                    if (y4 == 0L) {
                                                        break Label_5766;
                                                    }
                                                    n89 = 0L;
                                                }
                                                if (n89 <= 2147483647L && y4 <= 2147483647L) {
                                                    btq.a = (int)n89;
                                                    btq.b = (int)y4;
                                                    baw.aA(array11, lyo2.c);
                                                    bwr = new bwr(lyo2, copy, array10, n44, array11, array13, baw.y(lyo2.h[0], 1000000L, lyo2.d), null);
                                                    break Label_3837;
                                                }
                                            }
                                        }
                                    }
                                }
                                final long[] h4 = lyo2.h;
                                int length2 = h4.length;
                                if (length2 == 1) {
                                    if (h4[0] == 0L) {
                                        final long n90 = ((long[])dk.d((Object)lyo2.i))[0];
                                        for (int n91 = 0; n91 < array11.length; ++n91) {
                                            array11[n91] = baw.y(array11[n91] - n90, 1000000L, lyo2.c);
                                        }
                                        bwr = new bwr(lyo2, copy, array10, n44, array11, array13, baw.y(n52 - n90, 1000000L, lyo2.c), null);
                                        break Label_3837;
                                    }
                                    length2 = 1;
                                }
                                final boolean b25 = lyo2.b == 1;
                                final int[] array21 = new int[length2];
                                final int[] array22 = new int[length2];
                                final long[] array23 = (long[])dk.d((Object)lyo2.i);
                                int n92 = 0;
                                int n93 = 0;
                                int n94 = 0;
                                boolean b26 = false;
                                while (true) {
                                    final long[] h5 = lyo2.h;
                                    if (n92 >= h5.length) {
                                        break;
                                    }
                                    final long n95 = array23[n92];
                                    if (n95 != -1L) {
                                        final long y5 = baw.y(h5[n92], lyo2.c, lyo2.d);
                                        array21[n92] = baw.av(array11, n95, true);
                                        array22[n92] = baw.au(array11, n95 + y5, b25);
                                        int n96;
                                        int n97;
                                        while (true) {
                                            n96 = array21[n92];
                                            n97 = array22[n92];
                                            if (n96 >= n97 || (array13[n96] & 0x1) != 0x0) {
                                                break;
                                            }
                                            array21[n92] = n96 + 1;
                                        }
                                        final int n98 = n93 + (n97 - n96);
                                        b26 |= (n94 != n96);
                                        n94 = n97;
                                        n93 = n98;
                                    }
                                    ++n92;
                                }
                                final int[] array24 = array10;
                                final boolean b27 = b26 | n93 != b17;
                                long[] array25;
                                if (b27) {
                                    array25 = new long[n93];
                                }
                                else {
                                    array25 = copy;
                                }
                                int[] array26;
                                if (b27) {
                                    array26 = new int[n93];
                                }
                                else {
                                    array26 = array24;
                                }
                                if (b27) {
                                    n44 = 0;
                                }
                                int[] array27;
                                if (b27) {
                                    array27 = new int[n93];
                                }
                                else {
                                    array27 = array13;
                                }
                                final long[] array28 = new long[n93];
                                int n99 = 0;
                                int n100 = 0;
                                long n101 = 0L;
                                int[] array29 = array13;
                                final long[] array30 = array11;
                                final int[] array31 = array22;
                                final int[] array32 = array27;
                                while (n100 < lyo2.h.length) {
                                    final long n102 = lyo2.i[n100];
                                    int n103 = array21[n100];
                                    final int n104 = array31[n100];
                                    if (b27) {
                                        final int n105 = n104 - n103;
                                        System.arraycopy(copy, n103, array25, n99, n105);
                                        System.arraycopy(array24, n103, array26, n99, n105);
                                        System.arraycopy(array29, n103, array32, n99, n105);
                                    }
                                    final int[] array33 = array29;
                                    while (n103 < n104) {
                                        array28[n99] = baw.y(n101, 1000000L, lyo2.d) + baw.y(Math.max(0L, array30[n103] - n102), 1000000L, lyo2.c);
                                        int n106 = n44;
                                        if (b27 && array26[n99] > (n106 = n44)) {
                                            n106 = array24[n103];
                                        }
                                        ++n99;
                                        ++n103;
                                        n44 = n106;
                                    }
                                    final long n107 = lyo2.h[n100];
                                    ++n100;
                                    n101 += n107;
                                    array29 = array33;
                                }
                                bwr = new bwr(lyo2, array25, array26, n44, array28, array32, baw.y(n101, 1000000L, lyo2.d), null);
                            }
                        }
                    }
                    list.add(bwr);
                    list2 = list;
                }
                else {
                    list2 = list;
                }
            }
        }
        return list;
    }
    
    private static int e(final int n) {
        if (n == 1936684398) {
            return 1;
        }
        if (n == 1986618469) {
            return 2;
        }
        if (n == 1952807028 || n == 1935832172 || n == 1937072756 || n == 1668047728) {
            return 3;
        }
        if (n == 1835365473) {
            return 5;
        }
        return -1;
    }
    
    private static int f(final bar bar) {
        int n;
        int n2;
        for (n = bar.i(), n2 = (n & 0x7F); (n & 0x80) == 0x80; n = bar.i(), n2 = (n2 << 7 | (n & 0x7F))) {}
        return n2;
    }
    
    private static int g(final bar bar) {
        bar.G(16);
        return bar.d();
    }
    
    private static Pair h(final bvy bvy) {
        final bvz b = bvy.b(1701606260);
        if (b == null) {
            return null;
        }
        final bar a = b.a;
        a.G(8);
        final int f = bwa.f(a.d());
        final int l = a.l();
        final long[] array = new long[l];
        final long[] array2 = new long[l];
        for (int i = 0; i < l; ++i) {
            long n;
            if (f == 1) {
                n = a.r();
            }
            else {
                n = a.q();
            }
            array[i] = n;
            long p;
            if (f == 1) {
                p = a.p();
            }
            else {
                p = a.d();
            }
            array2[i] = p;
            if (a.z() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            a.H(2);
        }
        return Pair.create((Object)array, (Object)array2);
    }
    
    private static Pair i(final bar bar) {
        final int n = 8;
        bar.G(8);
        final int f = bwa.f(bar.d());
        int n2;
        if (f == 0) {
            n2 = 8;
        }
        else {
            n2 = 16;
        }
        bar.H(n2);
        final long q = bar.q();
        int n3 = n;
        if (f == 0) {
            n3 = 4;
        }
        bar.H(n3);
        final int m = bar.m();
        final StringBuilder sb = new StringBuilder();
        sb.append((char)((m >> 10 & 0x1F) + 96));
        sb.append((char)((m >> 5 & 0x1F) + 96));
        sb.append((char)((m & 0x1F) + 96));
        return Pair.create((Object)q, (Object)sb.toString());
    }
    
    private static Pair j(final bar bar, final int n, final int n2) {
        int d;
        for (int b = bar.b; b - n < n2; b += d) {
            bar.G(b);
            d = bar.d();
            final boolean b2 = true;
            blx.c(d > 0, "childAtomSize must be positive");
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
                Label_0549: {
                    if ("cenc".equals(s) || "cbc1".equals(s) || "cens".equals(s) || "cbcs".equals(s)) {
                        blx.c(n6 != null, "frma atom is mandatory");
                        blx.c(n4 != -1, "schi atom is mandatory");
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
                                    if (bwa.f(d5) == 0) {
                                        bar.H(1);
                                        n8 = 0;
                                        n9 = 0;
                                    }
                                    else {
                                        final int i = bar.i();
                                        n8 = (i & 0xF);
                                        n9 = (i & 0xF0) >> 4;
                                    }
                                    final boolean b3 = bar.i() == 1;
                                    final int j = bar.i();
                                    final byte[] array = new byte[16];
                                    bar.B(array, 0, 16);
                                    byte[] array2;
                                    if (b3 && j == 0) {
                                        final int k = bar.i();
                                        array2 = new byte[k];
                                        bar.B(array2, 0, k);
                                    }
                                    else {
                                        array2 = null;
                                    }
                                    final Object o = new lyp(b3, s, j, array, n9, n8, array2, (byte[])null);
                                    blx.c(o != null && b2, "tenc atom is mandatory");
                                    final int a = baw.a;
                                    create = Pair.create((Object)n6, o);
                                    break Label_0549;
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
    
    private static bwc k(final bar bar, int n) {
        bar.G(n + 12);
        bar.H(1);
        f(bar);
        bar.H(2);
        n = bar.i();
        if ((n & 0x80) != 0x0) {
            bar.H(2);
        }
        if ((n & 0x40) != 0x0) {
            bar.H(bar.i());
        }
        if ((n & 0x20) != 0x0) {
            bar.H(2);
        }
        bar.H(1);
        f(bar);
        final String e = ayy.e(bar.i());
        if (!"audio/mpeg".equals(e) && !"audio/vnd.dts".equals(e) && !"audio/vnd.dts.hd".equals(e)) {
            bar.H(4);
            long q = bar.q();
            long q2 = bar.q();
            bar.H(1);
            n = f(bar);
            final byte[] array = new byte[n];
            bar.B(array, 0, n);
            if (q2 <= 0L) {
                q2 = -1L;
            }
            if (q <= 0L) {
                q = -1L;
            }
            return new bwc(e, array, q2, q);
        }
        return new bwc(e, null, -1L, -1L);
    }
    
    private static ByteBuffer l() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }
    
    private static void m(final bar bar, int n, final int n2, final int n3, final int n4, final String s, final boolean b, final DrmInitData drmInitData, final bwe bwe, int b2) {
        bar.G(n2 + 16);
        int m;
        if (b) {
            m = bar.m();
            bar.H(6);
        }
        else {
            bar.H(8);
            m = 0;
        }
        int j;
        int n5;
        int d;
        if (m != 0 && m != 1) {
            if (m != 2) {
                return;
            }
            bar.H(16);
            j = (int)Math.round(Double.longBitsToDouble(bar.p()));
            n5 = bar.l();
            bar.H(20);
            d = 0;
        }
        else {
            n5 = bar.m();
            bar.H(6);
            j = bar.j();
            bar.G(bar.b - 4);
            d = bar.d();
            if (m == 1) {
                bar.H(16);
            }
        }
        final int b3 = bar.b;
        final int n6 = 1701733217;
        final int n7 = n;
        DrmInitData drmInitData2 = drmInitData;
        if ((n = n7) == 1701733217) {
            final Pair i = j(bar, n2, n3);
            DrmInitData b4 = drmInitData;
            n = n6;
            if (i != null) {
                n = (int)i.first;
                if (drmInitData == null) {
                    b4 = null;
                }
                else {
                    b4 = drmInitData.b(((lyp)i.second).b);
                }
                bwe.d[b2] = (lyp)i.second;
            }
            bar.G(b3);
            drmInitData2 = b4;
        }
        String s2 = null;
        int z = 0;
        Label_0607: {
            if (n == 1633889587) {
                s2 = "audio/ac3";
            }
            else if (n == 1700998451) {
                s2 = "audio/eac3";
            }
            else if (n == 1633889588) {
                s2 = "audio/ac4";
            }
            else if (n == 1685353315) {
                s2 = "audio/vnd.dts";
            }
            else if (n != 1685353320 && n != 1685353324) {
                if (n == 1685353317) {
                    s2 = "audio/vnd.dts.hd;profile=lbr";
                }
                else if (n == 1685353336) {
                    s2 = "audio/vnd.dts.uhd;profile=p2";
                }
                else if (n == 1935764850) {
                    s2 = "audio/3gpp";
                }
                else if (n == 1935767394) {
                    s2 = "audio/amr-wb";
                }
                else {
                    s2 = "audio/raw";
                    if (n == 1819304813 || n == 1936684916) {
                        z = 2;
                        break Label_0607;
                    }
                    if (n == 1953984371) {
                        z = 268435456;
                        break Label_0607;
                    }
                    if (n != 778924082 && n != 778924083) {
                        if (n == 1835557169) {
                            s2 = "audio/mha1";
                        }
                        else if (n == 1835560241) {
                            s2 = "audio/mhm1";
                        }
                        else if (n == 1634492771) {
                            s2 = "audio/alac";
                        }
                        else if (n == 1634492791) {
                            s2 = "audio/g711-alaw";
                        }
                        else if (n == 1970037111) {
                            s2 = "audio/g711-mlaw";
                        }
                        else if (n == 1332770163) {
                            s2 = "audio/opus";
                        }
                        else if (n == 1716281667) {
                            s2 = "audio/flac";
                        }
                        else {
                            if (n != 1835823201) {
                                z = -1;
                                s2 = null;
                                break Label_0607;
                            }
                            s2 = "audio/true-hd";
                        }
                    }
                    else {
                        s2 = "audio/mpeg";
                    }
                }
            }
            else {
                s2 = "audio/vnd.dts.hd";
            }
            z = -1;
        }
        String a = s2;
        Object c = null;
        Object k = null;
        bwc bwc = null;
        int n8 = b3;
        n = n5;
        b2 = j;
        while (n8 - n2 < n3) {
            bar.G(n8);
            final int d2 = bar.d();
            final boolean b5 = d2 > 0;
            final String s3 = "childAtomSize must be positive";
            blx.c(b5, "childAtomSize must be positive");
            final int d3 = bar.d();
            int intValue = 0;
            int intValue2 = 0;
            Object r = null;
            Object o = null;
            bwc l = null;
            Label_1493: {
                Label_0730: {
                    if (d3 == 1835557187) {
                        final int n9 = d2 - 13;
                        final byte[] array = new byte[n9];
                        bar.G(n8 + 13);
                        bar.B(array, 0, n9);
                        k = afcr.r((Object)array);
                    }
                    else {
                        int n10 = 0;
                        Label_1366: {
                            if (d3 != 1702061171) {
                                if (b && d3 == 2002876005) {
                                    int b6 = bar.b;
                                    blx.c(b6 >= n8, (String)null);
                                    while (true) {
                                        while (b6 - n8 < d2) {
                                            bar.G(b6);
                                            final int d4 = bar.d();
                                            blx.c(d4 > 0, s3);
                                            if (bar.d() == 1702061171) {
                                                n10 = b6;
                                                break Label_1366;
                                            }
                                            b6 += d4;
                                        }
                                        b6 = -1;
                                        continue;
                                    }
                                }
                                if (d3 == 1684103987) {
                                    bar.G(n8 + 8);
                                    bwe.a = bsr.c(bar, Integer.toString(n4), s, drmInitData2);
                                }
                                else if (d3 == 1684366131) {
                                    bar.G(n8 + 8);
                                    bwe.a = bsr.d(bar, Integer.toString(n4), s, drmInitData2);
                                }
                                else if (d3 == 1684103988) {
                                    bar.G(n8 + 8);
                                    bwe.a = bss.a(bar, Integer.toString(n4), s, drmInitData2);
                                }
                                else if (d3 == 1684892784) {
                                    if (d > 0) {
                                        b2 = d;
                                        n = 2;
                                        break Label_0730;
                                    }
                                    final StringBuilder sb = new StringBuilder("Invalid sample rate for Dolby TrueHD MLP stream: ");
                                    sb.append(d);
                                    throw ayz.a(sb.toString(), (Throwable)null);
                                }
                                else if (d3 == 1684305011) {
                                    final aye aye = new aye();
                                    aye.b(n4);
                                    aye.k = a;
                                    aye.x = n;
                                    aye.y = b2;
                                    aye.n = drmInitData2;
                                    aye.c = s;
                                    bwe.a = aye.a();
                                }
                                else {
                                    if (d3 == 1682927731) {
                                        final int n11 = d2 - 8;
                                        final byte[] a2 = bwh.a;
                                        final byte[] copy = Arrays.copyOf(a2, a2.length + n11);
                                        bar.G(n8 + 8);
                                        bar.B(copy, a2.length, n11);
                                        k = bsf.b(copy);
                                        break Label_0730;
                                    }
                                    if (d3 == 1684425825) {
                                        final int n12 = d2 - 12;
                                        final byte[] array2 = new byte[n12 + 4];
                                        array2[0] = 102;
                                        array2[1] = 76;
                                        array2[2] = 97;
                                        array2[3] = 67;
                                        bar.G(n8 + 12);
                                        bar.B(array2, 4, n12);
                                        k = afcr.r((Object)array2);
                                    }
                                    else if (d3 == 1634492771) {
                                        n = d2 - 12;
                                        final byte[] array3 = new byte[n];
                                        bar.G(n8 + 12);
                                        bar.B(array3, 0, n);
                                        final Pair a3 = bad.a(array3);
                                        intValue = (int)a3.first;
                                        intValue2 = (int)a3.second;
                                        r = afcr.r((Object)array3);
                                        o = c;
                                        l = bwc;
                                        break Label_1493;
                                    }
                                }
                                intValue = b2;
                                intValue2 = n;
                                o = c;
                                r = k;
                                l = bwc;
                                break Label_1493;
                            }
                            else {
                                n10 = n8;
                            }
                        }
                        intValue = b2;
                        intValue2 = n;
                        o = c;
                        r = k;
                        l = bwc;
                        if (n10 != -1) {
                            l = k(bar, n10);
                            a = l.a;
                            final byte[] b7 = l.b;
                            intValue = b2;
                            intValue2 = n;
                            String s4 = (String)c;
                            if (b7 != null) {
                                if ("audio/mp4a-latm".equals(a)) {
                                    final ijj a4 = bsq.a(b7);
                                    b2 = a4.b;
                                    n = a4.a;
                                    c = a4.c;
                                }
                                k = afcr.r((Object)b7);
                                s4 = (String)c;
                                intValue2 = n;
                                intValue = b2;
                            }
                            r = k;
                            o = s4;
                        }
                        break Label_1493;
                    }
                }
                intValue = b2;
                intValue2 = n;
                o = c;
                r = k;
                l = bwc;
            }
            n8 += d2;
            b2 = intValue;
            n = intValue2;
            c = o;
            k = r;
            bwc = l;
        }
        if (bwe.a == null && a != null) {
            final aye aye2 = new aye();
            aye2.b(n4);
            aye2.k = a;
            aye2.h = (String)c;
            aye2.x = n;
            aye2.y = b2;
            aye2.z = z;
            aye2.m = (List)k;
            aye2.n = drmInitData2;
            aye2.c = s;
            if (bwc != null) {
                aye2.f = aesy.A(bwc.c);
                aye2.g = aesy.A(bwc.d);
            }
            bwe.a = aye2.a();
        }
    }
}
