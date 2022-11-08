import android.media.MediaCodecInfo;
import java.util.HashMap;
import java.util.Map;
import com.google.webrtc.hwcodec.HevcBitstreamParser;
import org.webrtc.Logging;
import com.google.webrtc.hwcodec.H264BitstreamParser;
import com.google.webrtc.hwcodec.Vp9BitstreamParser;
import com.google.webrtc.hwcodec.Vp8BitstreamParser;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arct
{
    public static final afdu a;
    static final int[] b;
    public static final int[] c;
    public static final int[] d;
    
    static {
        a = afdu.v((Object)arbu.b, (Object)arbu.c, (Object)arbu.d, (Object)arbu.e);
        b = new int[] { 19, 21, 2141391872, 2141391873, 2141391874, 2141391875, 2141391876 };
        c = new int[] { 19, 21, 2141391872, 2141391876 };
        d = new int[] { 2130708361 };
    }
    
    public static arcd a(final arbu arbu) {
        final arbu a = arbu.a;
        final int ordinal = arbu.ordinal();
        if (ordinal == 1) {
            return (arcd)new Vp8BitstreamParser();
        }
        if (ordinal == 2) {
            return (arcd)new Vp9BitstreamParser();
        }
        if (ordinal == 3) {
            return (arcd)new H264BitstreamParser();
        }
        if (ordinal != 4) {
            final int g = arbu.g;
            final StringBuilder sb = new StringBuilder("No bitstream parser available for codec: ");
            sb.append(g);
            Logging.d("MediaCodecUtils", sb.toString());
            return null;
        }
        return (arcd)new HevcBitstreamParser();
    }
    
    public static Integer b(final int[] array, final int[] array2) {
        for (final int n : array) {
            for (final int n2 : array2) {
                if (n2 == n) {
                    return n2;
                }
            }
        }
        return null;
    }
    
    public static String c(final arbu arbu) {
        final arbu a = arbu.a;
        final int ordinal = arbu.ordinal();
        if (ordinal == 1) {
            return "video/x-vnd.on2.vp8";
        }
        if (ordinal == 2) {
            return "video/x-vnd.on2.vp9";
        }
        if (ordinal == 3) {
            return "video/avc";
        }
        if (ordinal == 4) {
            return "video/hevc";
        }
        if (ordinal == 5) {
            return "video/av01";
        }
        final int g = arbu.g;
        final StringBuilder sb = new StringBuilder("Unrecognized codec type ");
        sb.append(g);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static Map d(final arbu arbu, final boolean b) {
        final arbu a = arbu.a;
        final int ordinal = arbu.ordinal();
        if (ordinal != 1 && ordinal != 2) {
            if (ordinal == 3) {
                final HashMap hashMap = new HashMap();
                hashMap.put("level-asymmetry-allowed", "1");
                hashMap.put("packetization-mode", "1");
                String s;
                if (!b) {
                    s = "42e01f";
                }
                else {
                    s = "640c1f";
                }
                hashMap.put("profile-level-id", s);
                return hashMap;
            }
            if (ordinal != 4) {
                final int g = arbu.g;
                final StringBuilder sb = new StringBuilder("Unsupported codec: ");
                sb.append(g);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return new HashMap();
    }
    
    public static boolean e(final MediaCodecInfo mediaCodecInfo, final arbu arbu) {
        final String c = c(arbu);
        final String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
        for (int length = supportedTypes.length, i = 0; i < length; ++i) {
            if (supportedTypes[i].equals(c)) {
                return true;
            }
        }
        return false;
    }
}
