import java.util.Comparator;
import java.util.Collections;
import android.media.MediaCodecInfo$CodecCapabilities;
import java.util.Collection;
import android.media.MediaCodecInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import android.util.Pair;
import java.util.HashMap;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bmk
{
    public static final int a = 0;
    private static final Pattern b;
    private static final HashMap c;
    
    static {
        b = Pattern.compile("^\\D?(\\d+)$");
        c = new HashMap();
    }
    
    public static Pair a(ayg ayg) {
        final String k = ayg.k;
        if (k == null) {
            return null;
        }
        final String[] split = k.split("\\.");
        final boolean equals = "video/dolby-vision".equals(ayg.n);
        final int n = 2;
        if (equals) {
            final String i = ayg.k;
            if (split.length < 3) {
                bap.c("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: ".concat(String.valueOf(i)));
            }
            else {
                final Matcher matcher = bmk.b.matcher(split[1]);
                if (!matcher.matches()) {
                    bap.c("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: ".concat(String.valueOf(i)));
                }
                else {
                    final String group = matcher.group(1);
                    Object o = null;
                    Label_0488: {
                        if (group != null) {
                            int n2 = 0;
                            Label_0333: {
                                switch (group.hashCode()) {
                                    case 1545: {
                                        if (group.equals("09")) {
                                            n2 = 9;
                                            break Label_0333;
                                        }
                                        break;
                                    }
                                    case 1544: {
                                        if (group.equals("08")) {
                                            n2 = 8;
                                            break Label_0333;
                                        }
                                        break;
                                    }
                                    case 1543: {
                                        if (group.equals("07")) {
                                            n2 = 7;
                                            break Label_0333;
                                        }
                                        break;
                                    }
                                    case 1542: {
                                        if (group.equals("06")) {
                                            n2 = 6;
                                            break Label_0333;
                                        }
                                        break;
                                    }
                                    case 1541: {
                                        if (group.equals("05")) {
                                            n2 = 5;
                                            break Label_0333;
                                        }
                                        break;
                                    }
                                    case 1540: {
                                        if (group.equals("04")) {
                                            n2 = 4;
                                            break Label_0333;
                                        }
                                        break;
                                    }
                                    case 1539: {
                                        if (group.equals("03")) {
                                            n2 = 3;
                                            break Label_0333;
                                        }
                                        break;
                                    }
                                    case 1538: {
                                        if (group.equals("02")) {
                                            n2 = 2;
                                            break Label_0333;
                                        }
                                        break;
                                    }
                                    case 1537: {
                                        if (group.equals("01")) {
                                            n2 = 1;
                                            break Label_0333;
                                        }
                                        break;
                                    }
                                    case 1536: {
                                        if (group.equals("00")) {
                                            n2 = 0;
                                            break Label_0333;
                                        }
                                        break;
                                    }
                                }
                                n2 = -1;
                            }
                            switch (n2) {
                                case 9: {
                                    o = 512;
                                    break Label_0488;
                                }
                                case 8: {
                                    o = 256;
                                    break Label_0488;
                                }
                                case 7: {
                                    o = 128;
                                    break Label_0488;
                                }
                                case 6: {
                                    o = 64;
                                    break Label_0488;
                                }
                                case 5: {
                                    o = 32;
                                    break Label_0488;
                                }
                                case 4: {
                                    o = 16;
                                    break Label_0488;
                                }
                                case 3: {
                                    o = 8;
                                    break Label_0488;
                                }
                                case 2: {
                                    o = 4;
                                    break Label_0488;
                                }
                                case 1: {
                                    o = 2;
                                    break Label_0488;
                                }
                                case 0: {
                                    o = 1;
                                    break Label_0488;
                                }
                            }
                        }
                        o = null;
                    }
                    if (o == null) {
                        bap.c("MediaCodecUtil", "Unknown Dolby Vision profile string: ".concat(String.valueOf(group)));
                    }
                    else {
                        final String s = split[2];
                        Object o2 = null;
                        Label_0866: {
                            Label_0521: {
                                if (s != null) {
                                    final int hashCode = s.hashCode();
                                    switch (hashCode) {
                                        default: {
                                            switch (hashCode) {
                                                default: {
                                                    break Label_0521;
                                                }
                                                case 1570: {
                                                    if (s.equals("13")) {
                                                        o2 = 4096;
                                                        break Label_0866;
                                                    }
                                                    break Label_0521;
                                                }
                                                case 1569: {
                                                    if (s.equals("12")) {
                                                        o2 = 2048;
                                                        break Label_0866;
                                                    }
                                                    break Label_0521;
                                                }
                                                case 1568: {
                                                    if (s.equals("11")) {
                                                        o2 = 1024;
                                                        break Label_0866;
                                                    }
                                                    break Label_0521;
                                                }
                                                case 1567: {
                                                    if (s.equals("10")) {
                                                        o2 = 512;
                                                        break Label_0866;
                                                    }
                                                    break Label_0521;
                                                }
                                            }
                                            break;
                                        }
                                        case 1545: {
                                            if (s.equals("09")) {
                                                o2 = 256;
                                                break Label_0866;
                                            }
                                            break;
                                        }
                                        case 1544: {
                                            if (s.equals("08")) {
                                                o2 = 128;
                                                break Label_0866;
                                            }
                                            break;
                                        }
                                        case 1543: {
                                            if (s.equals("07")) {
                                                o2 = 64;
                                                break Label_0866;
                                            }
                                            break;
                                        }
                                        case 1542: {
                                            if (s.equals("06")) {
                                                o2 = 32;
                                                break Label_0866;
                                            }
                                            break;
                                        }
                                        case 1541: {
                                            if (s.equals("05")) {
                                                o2 = 16;
                                                break Label_0866;
                                            }
                                            break;
                                        }
                                        case 1540: {
                                            if (s.equals("04")) {
                                                o2 = 8;
                                                break Label_0866;
                                            }
                                            break;
                                        }
                                        case 1539: {
                                            if (s.equals("03")) {
                                                o2 = 4;
                                                break Label_0866;
                                            }
                                            break;
                                        }
                                        case 1538: {
                                            if (s.equals("02")) {
                                                o2 = 2;
                                                break Label_0866;
                                            }
                                            break;
                                        }
                                        case 1537: {
                                            if (s.equals("01")) {
                                                o2 = 1;
                                                break Label_0866;
                                            }
                                            break;
                                        }
                                    }
                                }
                            }
                            o2 = null;
                        }
                        if (o2 != null) {
                            return new Pair(o, o2);
                        }
                        bap.c("MediaCodecUtil", "Unknown Dolby Vision level string: ".concat(String.valueOf(s)));
                    }
                }
            }
            return null;
        }
        final String s2 = split[0];
        int n3 = 0;
        Label_1091: {
            switch (s2.hashCode()) {
                case 3624515: {
                    if (s2.equals("vp09")) {
                        n3 = 2;
                        break Label_1091;
                    }
                    break;
                }
                case 3356560: {
                    if (s2.equals("mp4a")) {
                        n3 = 6;
                        break Label_1091;
                    }
                    break;
                }
                case 3214780: {
                    if (s2.equals("hvc1")) {
                        n3 = 4;
                        break Label_1091;
                    }
                    break;
                }
                case 3199032: {
                    if (s2.equals("hev1")) {
                        n3 = 3;
                        break Label_1091;
                    }
                    break;
                }
                case 3006244: {
                    if (s2.equals("avc2")) {
                        n3 = 1;
                        break Label_1091;
                    }
                    break;
                }
                case 3006243: {
                    if (s2.equals("avc1")) {
                        n3 = 0;
                        break Label_1091;
                    }
                    break;
                }
                case 3004662: {
                    if (s2.equals("av01")) {
                        n3 = 5;
                        break Label_1091;
                    }
                    break;
                }
            }
            n3 = -1;
        }
        switch (n3) {
            default: {
                return null;
            }
            case 6: {
                final String j = ayg.k;
                if (split.length == 3) {
                    Pair pair2;
                    try {
                        if (!"audio/mp4a-latm".equals(ayz.e(Integer.parseInt(split[1], 16)))) {
                            return null;
                        }
                        final int int1 = Integer.parseInt(split[2]);
                        int n4;
                        if (int1 != 17) {
                            if (int1 != 20) {
                                if (int1 != 23) {
                                    if (int1 != 29) {
                                        if (int1 != 39) {
                                            if (int1 != 42) {
                                                switch (int1) {
                                                    default: {
                                                        n4 = -1;
                                                        break;
                                                    }
                                                    case 6: {
                                                        n4 = 6;
                                                        break;
                                                    }
                                                    case 5: {
                                                        n4 = 5;
                                                        break;
                                                    }
                                                    case 4: {
                                                        n4 = 4;
                                                        break;
                                                    }
                                                    case 3: {
                                                        n4 = 3;
                                                        break;
                                                    }
                                                    case 2: {
                                                        n4 = 2;
                                                        break;
                                                    }
                                                    case 1: {
                                                        n4 = 1;
                                                        break;
                                                    }
                                                }
                                            }
                                            else {
                                                n4 = 42;
                                            }
                                        }
                                        else {
                                            n4 = 39;
                                        }
                                    }
                                    else {
                                        n4 = 29;
                                    }
                                }
                                else {
                                    n4 = 23;
                                }
                            }
                            else {
                                n4 = 20;
                            }
                        }
                        else {
                            n4 = 17;
                        }
                        if (n4 == -1) {
                            return null;
                        }
                        pair2 = new Pair((Object)n4, (Object)0);
                    }
                    catch (final NumberFormatException ex) {
                        bap.c("MediaCodecUtil", "Ignoring malformed MP4A codec string: ".concat(String.valueOf(j)));
                        return null;
                    }
                    return pair2;
                }
                bap.c("MediaCodecUtil", "Ignoring malformed MP4A codec string: ".concat(String.valueOf(j)));
                return null;
            }
            case 5: {
                final String l = ayg.k;
                final aya z = ayg.z;
                if (split.length >= 4) {
                    Pair pair3;
                    try {
                        final int int2 = Integer.parseInt(split[1]);
                        final int int3 = Integer.parseInt(split[2].substring(0, 2));
                        final int int4 = Integer.parseInt(split[3]);
                        if (int2 != 0) {
                            final StringBuilder sb = new StringBuilder("Unknown AV1 profile: ");
                            sb.append(int2);
                            bap.c("MediaCodecUtil", sb.toString());
                            return null;
                        }
                        int n5 = 0;
                        Label_1571: {
                            if (int4 != 8) {
                                if (int4 != 10) {
                                    final StringBuilder sb2 = new StringBuilder("Unknown AV1 bit depth: ");
                                    sb2.append(int4);
                                    bap.c("MediaCodecUtil", sb2.toString());
                                    return null;
                                }
                                Label_1564: {
                                    if (z != null) {
                                        if (z.d == null) {
                                            final int c = z.c;
                                            if (c != 7 && c != 6) {
                                                break Label_1564;
                                            }
                                        }
                                        n5 = 4096;
                                        break Label_1571;
                                    }
                                }
                                n5 = 2;
                            }
                            else {
                                n5 = 1;
                            }
                        }
                        int n6 = n;
                        while (true) {
                            switch (int3) {
                                default: {
                                    n6 = -1;
                                    break;
                                }
                                case 13: {
                                    n6 = 8192;
                                    break;
                                }
                                case 12: {
                                    n6 = 4096;
                                    break;
                                }
                                case 11: {
                                    n6 = 2048;
                                    break;
                                }
                                case 10: {
                                    n6 = 1024;
                                    break;
                                }
                                case 9: {
                                    n6 = 512;
                                    break;
                                }
                                case 8: {
                                    n6 = 256;
                                    break;
                                }
                                case 7: {
                                    n6 = 128;
                                    break;
                                }
                                case 6: {
                                    n6 = 64;
                                    break;
                                }
                                case 5: {
                                    n6 = 32;
                                    break;
                                }
                                case 4: {
                                    n6 = 16;
                                    break;
                                }
                                case 3: {
                                    n6 = 8;
                                    break;
                                }
                                case 2: {
                                    n6 = 4;
                                    break;
                                }
                                case 1: {
                                    break;
                                }
                                case 23: {
                                    n6 = 8388608;
                                    continue;
                                }
                                case 22: {
                                    n6 = 4194304;
                                    continue;
                                }
                                case 21: {
                                    n6 = 2097152;
                                    continue;
                                }
                                case 20: {
                                    n6 = 1048576;
                                    continue;
                                }
                                case 19: {
                                    n6 = 524288;
                                    continue;
                                }
                                case 18: {
                                    n6 = 262144;
                                    continue;
                                }
                                case 17: {
                                    n6 = 131072;
                                    continue;
                                }
                                case 16: {
                                    n6 = 65536;
                                    continue;
                                }
                                case 15: {
                                    n6 = 32768;
                                    continue;
                                }
                                case 14: {
                                    n6 = 16384;
                                    continue;
                                }
                                case 0: {
                                    n6 = 1;
                                    break;
                                }
                            }
                            break;
                        }
                        if (n6 == -1) {
                            final StringBuilder sb3 = new StringBuilder("Unknown AV1 level: ");
                            sb3.append(int3);
                            bap.c("MediaCodecUtil", sb3.toString());
                            return null;
                        }
                        pair3 = new Pair((Object)n5, (Object)n6);
                    }
                    catch (final NumberFormatException ex2) {
                        bap.c("MediaCodecUtil", "Ignoring malformed AV1 codec string: ".concat(String.valueOf(l)));
                        return null;
                    }
                    return pair3;
                }
                bap.c("MediaCodecUtil", "Ignoring malformed AV1 codec string: ".concat(String.valueOf(l)));
                return null;
            }
            case 3:
            case 4: {
                final String m = ayg.k;
                if (split.length < 4) {
                    bap.c("MediaCodecUtil", "Ignoring malformed HEVC codec string: ".concat(String.valueOf(m)));
                }
                else {
                    final Matcher matcher2 = bmk.b.matcher(split[1]);
                    if (!matcher2.matches()) {
                        bap.c("MediaCodecUtil", "Ignoring malformed HEVC codec string: ".concat(String.valueOf(m)));
                    }
                    else {
                        final String group2 = matcher2.group(1);
                        int n7;
                        if ("1".equals(group2)) {
                            n7 = 1;
                        }
                        else {
                            if (!"2".equals(group2)) {
                                bap.c("MediaCodecUtil", "Unknown HEVC profile string: ".concat(String.valueOf(group2)));
                                return null;
                            }
                            n7 = 2;
                        }
                        final String s3 = split[3];
                        Object o3 = null;
                        Label_3025: {
                            if (s3 != null) {
                                int n8 = 0;
                                Label_2666: {
                                    switch (s3.hashCode()) {
                                        case 2312995: {
                                            if (s3.equals("L186")) {
                                                n8 = 12;
                                                break Label_2666;
                                            }
                                            break;
                                        }
                                        case 2312992: {
                                            if (s3.equals("L183")) {
                                                n8 = 11;
                                                break Label_2666;
                                            }
                                            break;
                                        }
                                        case 2312989: {
                                            if (s3.equals("L180")) {
                                                n8 = 10;
                                                break Label_2666;
                                            }
                                            break;
                                        }
                                        case 2312902: {
                                            if (s3.equals("L156")) {
                                                n8 = 9;
                                                break Label_2666;
                                            }
                                            break;
                                        }
                                        case 2312899: {
                                            if (s3.equals("L153")) {
                                                n8 = 8;
                                                break Label_2666;
                                            }
                                            break;
                                        }
                                        case 2312896: {
                                            if (s3.equals("L150")) {
                                                n8 = 7;
                                                break Label_2666;
                                            }
                                            break;
                                        }
                                        case 2312806: {
                                            if (s3.equals("L123")) {
                                                n8 = 6;
                                                break Label_2666;
                                            }
                                            break;
                                        }
                                        case 2312803: {
                                            if (s3.equals("L120")) {
                                                n8 = 5;
                                                break Label_2666;
                                            }
                                            break;
                                        }
                                        case 2193831: {
                                            if (s3.equals("H186")) {
                                                n8 = 25;
                                                break Label_2666;
                                            }
                                            break;
                                        }
                                        case 2193828: {
                                            if (s3.equals("H183")) {
                                                n8 = 24;
                                                break Label_2666;
                                            }
                                            break;
                                        }
                                        case 2193825: {
                                            if (s3.equals("H180")) {
                                                n8 = 23;
                                                break Label_2666;
                                            }
                                            break;
                                        }
                                        case 2193738: {
                                            if (s3.equals("H156")) {
                                                n8 = 22;
                                                break Label_2666;
                                            }
                                            break;
                                        }
                                        case 2193735: {
                                            if (s3.equals("H153")) {
                                                n8 = 21;
                                                break Label_2666;
                                            }
                                            break;
                                        }
                                        case 2193732: {
                                            if (s3.equals("H150")) {
                                                n8 = 20;
                                                break Label_2666;
                                            }
                                            break;
                                        }
                                        case 2193642: {
                                            if (s3.equals("H123")) {
                                                n8 = 19;
                                                break Label_2666;
                                            }
                                            break;
                                        }
                                        case 2193639: {
                                            if (s3.equals("H120")) {
                                                n8 = 18;
                                                break Label_2666;
                                            }
                                            break;
                                        }
                                        case 74854: {
                                            if (s3.equals("L93")) {
                                                n8 = 4;
                                                break Label_2666;
                                            }
                                            break;
                                        }
                                        case 74851: {
                                            if (s3.equals("L90")) {
                                                n8 = 3;
                                                break Label_2666;
                                            }
                                            break;
                                        }
                                        case 74761: {
                                            if (s3.equals("L63")) {
                                                n8 = 2;
                                                break Label_2666;
                                            }
                                            break;
                                        }
                                        case 74758: {
                                            if (s3.equals("L60")) {
                                                n8 = 1;
                                                break Label_2666;
                                            }
                                            break;
                                        }
                                        case 74665: {
                                            if (s3.equals("L30")) {
                                                n8 = 0;
                                                break Label_2666;
                                            }
                                            break;
                                        }
                                        case 71010: {
                                            if (s3.equals("H93")) {
                                                n8 = 17;
                                                break Label_2666;
                                            }
                                            break;
                                        }
                                        case 71007: {
                                            if (s3.equals("H90")) {
                                                n8 = 16;
                                                break Label_2666;
                                            }
                                            break;
                                        }
                                        case 70917: {
                                            if (s3.equals("H63")) {
                                                n8 = 15;
                                                break Label_2666;
                                            }
                                            break;
                                        }
                                        case 70914: {
                                            if (s3.equals("H60")) {
                                                n8 = 14;
                                                break Label_2666;
                                            }
                                            break;
                                        }
                                        case 70821: {
                                            if (s3.equals("H30")) {
                                                n8 = 13;
                                                break Label_2666;
                                            }
                                            break;
                                        }
                                    }
                                    n8 = -1;
                                }
                                switch (n8) {
                                    case 25: {
                                        o3 = 33554432;
                                        break Label_3025;
                                    }
                                    case 24: {
                                        o3 = 8388608;
                                        break Label_3025;
                                    }
                                    case 23: {
                                        o3 = 2097152;
                                        break Label_3025;
                                    }
                                    case 22: {
                                        o3 = 524288;
                                        break Label_3025;
                                    }
                                    case 21: {
                                        o3 = 131072;
                                        break Label_3025;
                                    }
                                    case 20: {
                                        o3 = 32768;
                                        break Label_3025;
                                    }
                                    case 19: {
                                        o3 = 8192;
                                        break Label_3025;
                                    }
                                    case 18: {
                                        o3 = 2048;
                                        break Label_3025;
                                    }
                                    case 17: {
                                        o3 = 512;
                                        break Label_3025;
                                    }
                                    case 16: {
                                        o3 = 128;
                                        break Label_3025;
                                    }
                                    case 15: {
                                        o3 = 32;
                                        break Label_3025;
                                    }
                                    case 14: {
                                        o3 = 8;
                                        break Label_3025;
                                    }
                                    case 13: {
                                        o3 = 2;
                                        break Label_3025;
                                    }
                                    case 12: {
                                        o3 = 16777216;
                                        break Label_3025;
                                    }
                                    case 11: {
                                        o3 = 4194304;
                                        break Label_3025;
                                    }
                                    case 10: {
                                        o3 = 1048576;
                                        break Label_3025;
                                    }
                                    case 9: {
                                        o3 = 262144;
                                        break Label_3025;
                                    }
                                    case 8: {
                                        o3 = 65536;
                                        break Label_3025;
                                    }
                                    case 7: {
                                        o3 = 16384;
                                        break Label_3025;
                                    }
                                    case 6: {
                                        o3 = 4096;
                                        break Label_3025;
                                    }
                                    case 5: {
                                        o3 = 1024;
                                        break Label_3025;
                                    }
                                    case 4: {
                                        o3 = 256;
                                        break Label_3025;
                                    }
                                    case 3: {
                                        o3 = 64;
                                        break Label_3025;
                                    }
                                    case 2: {
                                        o3 = 16;
                                        break Label_3025;
                                    }
                                    case 1: {
                                        o3 = 4;
                                        break Label_3025;
                                    }
                                    case 0: {
                                        o3 = 1;
                                        break Label_3025;
                                    }
                                }
                            }
                            o3 = null;
                        }
                        if (o3 != null) {
                            return new Pair((Object)n7, o3);
                        }
                        bap.c("MediaCodecUtil", "Unknown HEVC level string: ".concat(String.valueOf(s3)));
                    }
                }
                return null;
            }
            case 2: {
                int n9 = 2048;
                ayg = (ayg)ayg.k;
                if (split.length >= 3) {
                    try {
                        final int int5 = Integer.parseInt(split[1]);
                        final int int6 = Integer.parseInt(split[2]);
                        int n10;
                        if (int5 != 0) {
                            if (int5 != 1) {
                                if (int5 != 2) {
                                    if (int5 != 3) {
                                        n10 = -1;
                                    }
                                    else {
                                        n10 = 8;
                                    }
                                }
                                else {
                                    n10 = 4;
                                }
                            }
                            else {
                                n10 = 2;
                            }
                        }
                        else {
                            n10 = 1;
                        }
                        if (n10 == -1) {
                            ayg = (ayg)new StringBuilder("Unknown VP9 profile: ");
                            ((StringBuilder)ayg).append(int5);
                            bap.c("MediaCodecUtil", ((StringBuilder)ayg).toString());
                            return null;
                        }
                        if (int6 != 10) {
                            if (int6 != 11) {
                                if (int6 != 20) {
                                    if (int6 != 21) {
                                        if (int6 != 30) {
                                            if (int6 != 31) {
                                                if (int6 != 40) {
                                                    if (int6 != 41) {
                                                        if (int6 != 50) {
                                                            if (int6 != 51) {
                                                                switch (int6) {
                                                                    default: {
                                                                        n9 = -1;
                                                                        break;
                                                                    }
                                                                    case 62: {
                                                                        n9 = 8192;
                                                                        break;
                                                                    }
                                                                    case 61: {
                                                                        n9 = 4096;
                                                                        break;
                                                                    }
                                                                    case 60: {
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                n9 = 512;
                                                            }
                                                        }
                                                        else {
                                                            n9 = 256;
                                                        }
                                                    }
                                                    else {
                                                        n9 = 128;
                                                    }
                                                }
                                                else {
                                                    n9 = 64;
                                                }
                                            }
                                            else {
                                                n9 = 32;
                                            }
                                        }
                                        else {
                                            n9 = 16;
                                        }
                                    }
                                    else {
                                        n9 = 8;
                                    }
                                }
                                else {
                                    n9 = 4;
                                }
                            }
                            else {
                                n9 = 2;
                            }
                        }
                        else {
                            n9 = 1;
                        }
                        if (n9 == -1) {
                            ayg = (ayg)new StringBuilder("Unknown VP9 level: ");
                            ((StringBuilder)ayg).append(int6);
                            bap.c("MediaCodecUtil", ((StringBuilder)ayg).toString());
                            return null;
                        }
                        ayg = (ayg)new Pair((Object)n10, (Object)n9);
                    }
                    catch (final NumberFormatException ex3) {
                        bap.c("MediaCodecUtil", "Ignoring malformed VP9 codec string: ".concat(String.valueOf(ayg)));
                        return null;
                    }
                    return (Pair)ayg;
                }
                bap.c("MediaCodecUtil", "Ignoring malformed VP9 codec string: ".concat(String.valueOf(ayg)));
                ayg = null;
                return (Pair)ayg;
            }
            case 0:
            case 1: {
                ayg = (ayg)ayg.k;
                final int length = split.length;
                if (length < 2) {
                    bap.c("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(String.valueOf(ayg)));
                }
                else {
                    try {
                        int n11;
                        int n12;
                        if (split[1].length() == 6) {
                            n11 = Integer.parseInt(split[1].substring(0, 2), 16);
                            n12 = Integer.parseInt(split[1].substring(4), 16);
                        }
                        else {
                            if (length < 3) {
                                final StringBuilder sb4 = new StringBuilder("Ignoring malformed AVC codec string: ");
                                sb4.append((String)ayg);
                                bap.c("MediaCodecUtil", sb4.toString());
                                return null;
                            }
                            n11 = Integer.parseInt(split[1]);
                            n12 = Integer.parseInt(split[2]);
                        }
                        int n13;
                        if (n11 != 66) {
                            if (n11 != 77) {
                                if (n11 != 88) {
                                    if (n11 != 100) {
                                        if (n11 != 110) {
                                            if (n11 != 122) {
                                                if (n11 != 244) {
                                                    n13 = -1;
                                                }
                                                else {
                                                    n13 = 64;
                                                }
                                            }
                                            else {
                                                n13 = 32;
                                            }
                                        }
                                        else {
                                            n13 = 16;
                                        }
                                    }
                                    else {
                                        n13 = 8;
                                    }
                                }
                                else {
                                    n13 = 4;
                                }
                            }
                            else {
                                n13 = n;
                            }
                        }
                        else {
                            n13 = 1;
                        }
                        if (n13 == -1) {
                            ayg = (ayg)new StringBuilder("Unknown AVC profile: ");
                            ((StringBuilder)ayg).append(n11);
                            bap.c("MediaCodecUtil", ((StringBuilder)ayg).toString());
                        }
                        else {
                            int n14 = 0;
                            Label_3924: {
                                switch (n12) {
                                    default: {
                                        switch (n12) {
                                            default: {
                                                switch (n12) {
                                                    default: {
                                                        switch (n12) {
                                                            default: {
                                                                switch (n12) {
                                                                    default: {
                                                                        n14 = -1;
                                                                        break Label_3924;
                                                                    }
                                                                    case 52: {
                                                                        n14 = 65536;
                                                                        break Label_3924;
                                                                    }
                                                                    case 51: {
                                                                        n14 = 32768;
                                                                        break Label_3924;
                                                                    }
                                                                    case 50: {
                                                                        n14 = 16384;
                                                                        break Label_3924;
                                                                    }
                                                                }
                                                                break;
                                                            }
                                                            case 42: {
                                                                n14 = 8192;
                                                                break Label_3924;
                                                            }
                                                            case 41: {
                                                                n14 = 4096;
                                                                break Label_3924;
                                                            }
                                                            case 40: {
                                                                n14 = 2048;
                                                                break Label_3924;
                                                            }
                                                        }
                                                        break;
                                                    }
                                                    case 32: {
                                                        n14 = 1024;
                                                        break Label_3924;
                                                    }
                                                    case 31: {
                                                        n14 = 512;
                                                        break Label_3924;
                                                    }
                                                    case 30: {
                                                        n14 = 256;
                                                        break Label_3924;
                                                    }
                                                }
                                                break;
                                            }
                                            case 22: {
                                                n14 = 128;
                                                break Label_3924;
                                            }
                                            case 21: {
                                                n14 = 64;
                                                break Label_3924;
                                            }
                                            case 20: {
                                                n14 = 32;
                                                break Label_3924;
                                            }
                                        }
                                        break;
                                    }
                                    case 13: {
                                        n14 = 16;
                                        break;
                                    }
                                    case 12: {
                                        n14 = 8;
                                        break;
                                    }
                                    case 11: {
                                        n14 = 4;
                                        break;
                                    }
                                    case 10: {
                                        n14 = 1;
                                        break;
                                    }
                                }
                            }
                            if (n14 != -1) {
                                ayg = (ayg)new Pair((Object)n13, (Object)n14);
                                return (Pair)ayg;
                            }
                            ayg = (ayg)new StringBuilder("Unknown AVC level: ");
                            ((StringBuilder)ayg).append(n12);
                            bap.c("MediaCodecUtil", ((StringBuilder)ayg).toString());
                        }
                    }
                    catch (final NumberFormatException ex4) {
                        bap.c("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(String.valueOf(ayg)));
                    }
                }
                ayg = null;
                return (Pair)ayg;
            }
        }
    }
    
    public static blz b() {
        final List d = d("audio/raw", false, false);
        if (d.isEmpty()) {
            return null;
        }
        return (blz)d.get(0);
    }
    
    public static String c(final ayg ayg) {
        if ("audio/eac3-joc".equals(ayg.n)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(ayg.n)) {
            final Pair a = a(ayg);
            if (a != null) {
                final int intValue = (int)a.first;
                if (intValue == 16 || intValue == 256) {
                    return "video/hevc";
                }
                if (intValue == 512) {
                    return "video/avc";
                }
            }
        }
        return null;
    }
    
    public static List d(final String ex, final boolean b, final boolean b2) {
        monitorenter(bmk.class);
        try {
            final bmh bmh = new bmh((String)ex, b, b2);
            final List list = bmk.c.get(bmh);
            if (list != null) {
                monitorexit(bmk.class);
                return list;
            }
            final int a = bax.a;
            final pmj pmj = new pmj(b, b2);
            try {
                final ArrayList<blz> list2 = new ArrayList<blz>();
                final String a2 = bmh.a;
                pmj.a();
            Label_0131:
                for (int length = ((MediaCodecInfo[])pmj.b).length, i = 0; i < length; ++i) {
                    pmj.a();
                    final MediaCodecInfo mediaCodecInfo = ((MediaCodecInfo[])pmj.b)[i];
                    if (bax.a < 29 || !mediaCodecInfo.isAlias()) {
                        final String name = mediaCodecInfo.getName();
                        if (!mediaCodecInfo.isEncoder()) {
                            final String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                            final int length2 = supportedTypes.length;
                            int j = 0;
                            while (true) {
                                while (j < length2) {
                                    final String s = supportedTypes[j];
                                    if (s.equalsIgnoreCase(a2)) {
                                        if (s != null) {
                                            try {
                                                final MediaCodecInfo$CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(s);
                                                final boolean featureSupported = capabilitiesForType.isFeatureSupported("tunneled-playback");
                                                final boolean featureRequired = capabilitiesForType.isFeatureRequired("tunneled-playback");
                                                if (!bmh.c) {
                                                    if (featureRequired) {
                                                        continue Label_0131;
                                                    }
                                                }
                                                else if (!featureSupported) {
                                                    continue Label_0131;
                                                }
                                                boolean featureSupported2 = capabilitiesForType.isFeatureSupported("secure-playback");
                                                final boolean featureRequired2 = capabilitiesForType.isFeatureRequired("secure-playback");
                                                if (!bmh.b) {
                                                    if (featureRequired2) {
                                                        continue Label_0131;
                                                    }
                                                }
                                                else {
                                                    if (!featureSupported2) {
                                                        continue Label_0131;
                                                    }
                                                    featureSupported2 = true;
                                                }
                                                boolean hardwareAccelerated;
                                                if (bax.a >= 29) {
                                                    hardwareAccelerated = mediaCodecInfo.isHardwareAccelerated();
                                                }
                                                else {
                                                    hardwareAccelerated = !g(mediaCodecInfo, a2);
                                                }
                                                final boolean g = g(mediaCodecInfo, a2);
                                                if (bax.a >= 29) {
                                                    mediaCodecInfo.isVendor();
                                                }
                                                else {
                                                    final String b3 = aevy.b(mediaCodecInfo.getName());
                                                    if (!b3.startsWith("omx.google.") && !b3.startsWith("c2.android.")) {
                                                        b3.startsWith("c2.google.");
                                                    }
                                                }
                                                if (bmh.b != featureSupported2) {
                                                    continue Label_0131;
                                                }
                                                final boolean b4 = capabilitiesForType != null && capabilitiesForType.isFeatureSupported("adaptive-playback");
                                                if (capabilitiesForType != null) {
                                                    capabilitiesForType.isFeatureSupported("tunneled-playback");
                                                }
                                                boolean b5;
                                                if (capabilitiesForType != null && capabilitiesForType.isFeatureSupported("secure-playback")) {
                                                    b5 = true;
                                                }
                                                else {
                                                    b5 = false;
                                                }
                                                try {
                                                    list2.add(new blz(name, a2, s, capabilitiesForType, hardwareAccelerated, g, b4, b5));
                                                }
                                                catch (final Exception ex) {}
                                            }
                                            catch (final Exception ex2) {}
                                            final StringBuilder sb = new StringBuilder();
                                            sb.append("Failed to query codec ");
                                            sb.append(name);
                                            sb.append(" (");
                                            sb.append(s);
                                            sb.append(")");
                                            bap.a("MediaCodecUtil", sb.toString());
                                            throw ex;
                                        }
                                        continue Label_0131;
                                    }
                                    else {
                                        ++j;
                                    }
                                }
                                if (a2.equals("video/dolby-vision")) {
                                    if ("OMX.MS.HEVCDV.Decoder".equals(name)) {
                                        final String s = "video/hevcdv";
                                        continue;
                                    }
                                    if ("OMX.RTK.video.decoder".equals(name) || "OMX.realtek.video.decoder.tunneled".equals(name)) {
                                        final String s = "video/dv_hevc";
                                        continue;
                                    }
                                }
                                else {
                                    if (a2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(name)) {
                                        final String s = "audio/x-lg-alac";
                                        continue;
                                    }
                                    if (a2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(name)) {
                                        final String s = "audio/x-lg-flac";
                                        continue;
                                    }
                                    if (a2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(name)) {
                                        final String s = "audio/lg-ac3";
                                        continue;
                                    }
                                }
                                final String s = null;
                                continue;
                            }
                        }
                    }
                }
                if (b) {
                    list2.isEmpty();
                }
                if ("audio/raw".equals(ex)) {
                    f(list2, (bmj)bmg.a);
                }
                if (bax.a < 32 && list2.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((blz)list2.get(0)).a)) {
                    list2.add((blz)list2.remove(0));
                }
                final afeq o = afeq.o((Collection)list2);
                bmk.c.put(bmh, o);
                monitorexit(bmk.class);
                return (List)o;
            }
            catch (final Exception ex3) {
                throw new bmi(ex3);
            }
        }
        finally {
            monitorexit(bmk.class);
            while (true) {}
        }
    }
    
    public static List e(final List list, final ayg ayg) {
        final ArrayList list2 = new ArrayList(list);
        f(list2, (bmj)new bmf(ayg));
        return list2;
    }
    
    private static void f(final List list, final bmj bmj) {
        Collections.sort((List<Object>)list, (Comparator<? super Object>)new lcj(bmj, 1));
    }
    
    private static boolean g(final MediaCodecInfo mediaCodecInfo, final String s) {
        if (bax.a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        final boolean i = ayz.i(s);
        final boolean b = true;
        if (i) {
            return true;
        }
        final String b2 = aevy.b(mediaCodecInfo.getName());
        if (b2.startsWith("arc.")) {
            return false;
        }
        boolean b3 = b;
        if (!b2.startsWith("omx.google.")) {
            b3 = b;
            if (!b2.startsWith("omx.ffmpeg.")) {
                if (b2.startsWith("omx.sec.")) {
                    b3 = b;
                    if (b2.contains(".sw.")) {
                        return b3;
                    }
                }
                b3 = b;
                if (!b2.equals("omx.qcom.video.decoder.hevcswvdec")) {
                    b3 = b;
                    if (!b2.startsWith("c2.android.")) {
                        b3 = b;
                        if (!b2.startsWith("c2.google.")) {
                            if (!b2.startsWith("omx.")) {
                                if (b2.startsWith("c2.")) {
                                    return false;
                                }
                                b3 = b;
                            }
                            else {
                                b3 = false;
                            }
                        }
                    }
                }
            }
        }
        return b3;
    }
}
