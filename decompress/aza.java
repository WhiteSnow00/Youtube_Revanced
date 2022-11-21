import java.util.regex.Matcher;
import android.text.TextUtils;
import java.util.regex.Pattern;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aza
{
    private static final ArrayList a;
    private static final Pattern b;
    
    static {
        a = new ArrayList();
        b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");
    }
    
    public static int a(final String s, final String s2) {
        int n = 0;
        Label_0222: {
            switch (s.hashCode()) {
                case 1556697186: {
                    if (s.equals("audio/true-hd")) {
                        n = 8;
                        break Label_0222;
                    }
                    break;
                }
                case 1505942594: {
                    if (s.equals("audio/vnd.dts.hd")) {
                        n = 7;
                        break Label_0222;
                    }
                    break;
                }
                case 1504831518: {
                    if (s.equals("audio/mpeg")) {
                        n = 0;
                        break Label_0222;
                    }
                    break;
                }
                case 1504578661: {
                    if (s.equals("audio/eac3")) {
                        n = 3;
                        break Label_0222;
                    }
                    break;
                }
                case 187078297: {
                    if (s.equals("audio/ac4")) {
                        n = 5;
                        break Label_0222;
                    }
                    break;
                }
                case 187078296: {
                    if (s.equals("audio/ac3")) {
                        n = 2;
                        break Label_0222;
                    }
                    break;
                }
                case -53558318: {
                    if (s.equals("audio/mp4a-latm")) {
                        n = 1;
                        break Label_0222;
                    }
                    break;
                }
                case -1095064472: {
                    if (s.equals("audio/vnd.dts")) {
                        n = 6;
                        break Label_0222;
                    }
                    break;
                }
                case -2123537834: {
                    if (s.equals("audio/eac3-joc")) {
                        n = 4;
                        break Label_0222;
                    }
                    break;
                }
            }
            n = -1;
        }
        switch (n) {
            default: {
                return 0;
            }
            case 8: {
                return 14;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 17;
            }
            case 4: {
                return 18;
            }
            case 3: {
                return 6;
            }
            case 2: {
                return 5;
            }
            case 1: {
                if (s2 == null) {
                    return 0;
                }
                final bys n2 = n(s2);
                if (n2 == null) {
                    return 0;
                }
                return n2.a();
            }
            case 0: {
                return 9;
            }
        }
    }
    
    public static int b(final String s) {
        final boolean empty = TextUtils.isEmpty((CharSequence)s);
        final int n = -1;
        if (empty) {
            return -1;
        }
        if (i(s)) {
            return 1;
        }
        if (m(s)) {
            return 2;
        }
        if (l(s)) {
            return 3;
        }
        if (j(s)) {
            return 4;
        }
        if ("application/id3".equals(s) || "application/x-emsg".equals(s) || "application/x-scte35".equals(s)) {
            return 5;
        }
        if (!"application/x-camera-motion".equals(s)) {
            final int size = aza.a.size();
            int n2 = 0;
            int n3;
            while (true) {
                n3 = n;
                if (n2 >= size) {
                    break;
                }
                final tun tun = aza.a.get(n2);
                final Object c = tun.c;
                if (s.equals(null)) {
                    final int a = tun.a;
                    n3 = 0;
                    break;
                }
                ++n2;
            }
            return n3;
        }
        return 6;
    }
    
    public static String c(String d) {
        if (d == null) {
            return null;
        }
        final String[] ar = baz.ar(d);
        for (int length = ar.length, i = 0; i < length; ++i) {
            d = d(ar[i]);
            if (d != null && i(d)) {
                return d;
            }
        }
        return null;
    }
    
    public static String d(String e) {
        final String s = null;
        if (e == null) {
            return null;
        }
        final String b = aewr.b(e.trim());
        if (b.startsWith("avc1") || b.startsWith("avc3")) {
            return "video/avc";
        }
        if (b.startsWith("hev1") || b.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (b.startsWith("dvav") || b.startsWith("dva1") || b.startsWith("dvhe") || b.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (b.startsWith("av01")) {
            return "video/av01";
        }
        if (b.startsWith("vp9") || b.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (b.startsWith("vp8") || b.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (b.startsWith("mp4a")) {
            e = s;
            if (b.startsWith("mp4a.")) {
                final bys n = n(b);
                e = s;
                if (n != null) {
                    e = e(n.a);
                }
            }
            if (e == null) {
                return "audio/mp4a-latm";
            }
            return e;
        }
        else {
            if (b.startsWith("mha1")) {
                return "audio/mha1";
            }
            if (b.startsWith("mhm1")) {
                return "audio/mhm1";
            }
            if (b.startsWith("ac-3") || b.startsWith("dac3")) {
                return "audio/ac3";
            }
            if (b.startsWith("ec-3") || b.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (b.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (b.startsWith("ac-4") || b.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (b.startsWith("dtsc")) {
                return "audio/vnd.dts";
            }
            if (b.startsWith("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (b.startsWith("dtsh") || b.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (b.startsWith("dtsx")) {
                return "audio/vnd.dts.uhd;profile=p2";
            }
            if (b.startsWith("opus")) {
                return "audio/opus";
            }
            if (b.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (b.startsWith("flac")) {
                return "audio/flac";
            }
            if (b.startsWith("stpp")) {
                return "application/ttml+xml";
            }
            if (b.startsWith("wvtt")) {
                return "text/vtt";
            }
            if (b.contains("cea708")) {
                return "application/cea-708";
            }
            if (!b.contains("eia608") && !b.contains("cea608")) {
                for (int size = aza.a.size(), i = 0; i < size; ++i) {
                    final tun tun = aza.a.get(i);
                    final Object b2 = tun.b;
                    if (b.startsWith(null)) {
                        final Object c = tun.c;
                        break;
                    }
                }
                return null;
            }
            return "application/cea-608";
        }
    }
    
    public static String e(final int n) {
        if (n == 32) {
            return "video/mp4v-es";
        }
        if (n == 33) {
            return "video/avc";
        }
        if (n != 35) {
            if (n != 64) {
                if (n == 163) {
                    return "video/wvc1";
                }
                if (n == 177) {
                    return "video/x-vnd.on2.vp9";
                }
                if (n == 165) {
                    return "audio/ac3";
                }
                if (n == 166) {
                    return "audio/eac3";
                }
                switch (n) {
                    default: {
                        switch (n) {
                            default: {
                                return null;
                            }
                            case 174: {
                                return "audio/ac4";
                            }
                            case 173: {
                                return "audio/opus";
                            }
                            case 170:
                            case 171: {
                                return "audio/vnd.dts.hd";
                            }
                            case 169:
                            case 172: {
                                return "audio/vnd.dts";
                            }
                        }
                        break;
                    }
                    case 106: {
                        return "video/mpeg";
                    }
                    case 105:
                    case 107: {
                        return "audio/mpeg";
                    }
                    case 96:
                    case 97:
                    case 98:
                    case 99:
                    case 100:
                    case 101: {
                        return "video/mpeg2";
                    }
                    case 102:
                    case 103:
                    case 104: {
                        break;
                    }
                }
            }
            return "audio/mp4a-latm";
        }
        return "video/hevc";
    }
    
    public static String f(String d) {
        if (d == null) {
            return null;
        }
        final String[] ar = baz.ar(d);
        for (int length = ar.length, i = 0; i < length; ++i) {
            d = d(ar[i]);
            if (d != null && m(d)) {
                return d;
            }
        }
        return null;
    }
    
    public static String g(final String s) {
        final int hashCode = s.hashCode();
        int n = 0;
        Label_0076: {
            if (hashCode != -1007807498) {
                if (hashCode != -586683234) {
                    if (hashCode == 187090231) {
                        if (s.equals("audio/mp3")) {
                            n = 1;
                            break Label_0076;
                        }
                    }
                }
                else if (s.equals("audio/x-wav")) {
                    n = 2;
                    break Label_0076;
                }
            }
            else if (s.equals("audio/x-flac")) {
                n = 0;
                break Label_0076;
            }
            n = -1;
        }
        if (n == 0) {
            return "audio/flac";
        }
        if (n == 1) {
            return "audio/mpeg";
        }
        if (n != 2) {
            return s;
        }
        return "audio/wav";
    }
    
    public static boolean h(final String s, final String s2) {
        if (s == null) {
            return false;
        }
        int n = 0;
        Label_0277: {
            switch (s.hashCode()) {
                case 1903589369: {
                    if (s.equals("audio/g711-mlaw")) {
                        n = 5;
                        break Label_0277;
                    }
                    break;
                }
                case 1903231877: {
                    if (s.equals("audio/g711-alaw")) {
                        n = 4;
                        break Label_0277;
                    }
                    break;
                }
                case 1504831518: {
                    if (s.equals("audio/mpeg")) {
                        n = 0;
                        break Label_0277;
                    }
                    break;
                }
                case 1504619009: {
                    if (s.equals("audio/flac")) {
                        n = 6;
                        break Label_0277;
                    }
                    break;
                }
                case 1504578661: {
                    if (s.equals("audio/eac3")) {
                        n = 8;
                        break Label_0277;
                    }
                    break;
                }
                case 187094639: {
                    if (s.equals("audio/raw")) {
                        n = 3;
                        break Label_0277;
                    }
                    break;
                }
                case 187078296: {
                    if (s.equals("audio/ac3")) {
                        n = 7;
                        break Label_0277;
                    }
                    break;
                }
                case -53558318: {
                    if (s.equals("audio/mp4a-latm")) {
                        n = 10;
                        break Label_0277;
                    }
                    break;
                }
                case -432837259: {
                    if (s.equals("audio/mpeg-L2")) {
                        n = 2;
                        break Label_0277;
                    }
                    break;
                }
                case -432837260: {
                    if (s.equals("audio/mpeg-L1")) {
                        n = 1;
                        break Label_0277;
                    }
                    break;
                }
                case -2123537834: {
                    if (s.equals("audio/eac3-joc")) {
                        n = 9;
                        break Label_0277;
                    }
                    break;
                }
            }
            n = -1;
        }
        switch (n) {
            default: {
                return false;
            }
            case 10: {
                if (s2 == null) {
                    return false;
                }
                final bys n2 = n(s2);
                if (n2 == null) {
                    return false;
                }
                final int a = n2.a();
                return a != 0 && a != 16;
            }
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9: {
                return true;
            }
        }
    }
    
    public static boolean i(final String s) {
        return "audio".equals(o(s));
    }
    
    public static boolean j(final String s) {
        return "image".equals(o(s));
    }
    
    public static boolean k(final String s) {
        return s != null && (s.startsWith("video/webm") || s.startsWith("audio/webm") || s.startsWith("application/webm") || s.startsWith("video/x-matroska") || s.startsWith("audio/x-matroska") || s.startsWith("application/x-matroska"));
    }
    
    public static boolean l(final String s) {
        return "text".equals(o(s)) || "application/cea-608".equals(s) || "application/cea-708".equals(s) || "application/x-mp4-cea-608".equals(s) || "application/x-subrip".equals(s) || "application/ttml+xml".equals(s) || "application/x-quicktime-tx3g".equals(s) || "application/x-mp4-vtt".equals(s) || "application/x-rawcc".equals(s) || "application/vobsub".equals(s) || "application/pgs".equals(s) || "application/dvbsubs".equals(s);
    }
    
    public static boolean m(final String s) {
        return "video".equals(o(s));
    }
    
    static bys n(String group) {
        final Matcher matcher = aza.b.matcher(group);
        if (!matcher.matches()) {
            return null;
        }
        group = matcher.group(1);
        bad.b(group);
        final String group2 = matcher.group(2);
        try {
            final int int1 = Integer.parseInt(group, 16);
            int int2;
            if (group2 != null) {
                int2 = Integer.parseInt(group2);
            }
            else {
                int2 = 0;
            }
            return new bys(int1, int2, (byte[])null, (byte[])null);
        }
        catch (final NumberFormatException ex) {
            return null;
        }
    }
    
    private static String o(final String s) {
        if (s == null) {
            return null;
        }
        final int index = s.indexOf(47);
        if (index == -1) {
            return null;
        }
        return s.substring(0, index);
    }
}
