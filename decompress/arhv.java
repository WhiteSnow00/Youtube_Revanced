import java.util.Iterator;
import java.util.ArrayList;
import org.webrtc.VideoDecoder;
import org.webrtc.VideoCodecInfo;
import android.media.MediaCodecInfo$CodecCapabilities;
import android.media.MediaCodecInfo;
import org.webrtc.Logging;
import java.util.HashMap;
import java.util.Map;
import org.webrtc.VideoDecoderFactory;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arhv implements VideoDecoderFactory
{
    public final afci a;
    public final afhk b;
    private final Map c;
    private final afci d;
    private final afgi e;
    
    public arhv(final afci a, final afgi e, final afhk b) {
        this.c = new HashMap();
        this.d = adzw.M((afci)ytb.p);
        Logging.a("IMCVideoDecoderFactory", "InternalMediaCodecVideoDecoderFactory ctor.");
        this.a = a;
        this.e = e;
        this.b = b;
    }
    
    public static arhe a(final arhd arhd, final String d) {
        final ahcr builder = arhe.a.createBuilder();
        builder.copyOnWrite();
        final arhe arhe = (arhe)builder.instance;
        arhe.c = arhd.g;
        arhe.b |= 0x1;
        builder.copyOnWrite();
        final arhe arhe2 = (arhe)builder.instance;
        d.getClass();
        arhe2.b |= 0x2;
        arhe2.d = d;
        return (arhe)builder.build();
    }
    
    public final arhu b(final arhd arhd) {
        if (this.c.containsKey(arhd)) {
            return this.c.get(arhd);
        }
        Logging.a("IMCVideoDecoderFactory", "Searching HW decoder for ".concat(aric.c(arhd)));
        arhu arhu = null;
        Label_0486: {
            try {
                final MediaCodecInfo[] array = (MediaCodecInfo[])this.d.a();
                if (array == null) {
                    Logging.b("IMCVideoDecoderFactory", "Empty media codec info");
                    arhu = arhu.a;
                }
                else {
                    final boolean b = false;
                    for (int i = 0; i < array.length; ++i) {
                        final MediaCodecInfo mediaCodecInfo = array[i];
                        if (mediaCodecInfo != null && !mediaCodecInfo.isEncoder()) {
                            final boolean e = aric.e(mediaCodecInfo, arhd);
                            final arhe arhe = null;
                            arhe arhe2 = null;
                            Label_0242: {
                                if (!e) {
                                    arhe2 = arhe;
                                }
                                else {
                                    final afgh a = this.e.a((Object)arhd);
                                    if (a == null) {
                                        arhe2 = arhe;
                                    }
                                    else {
                                        final String name = mediaCodecInfo.getName();
                                        Logging.a("IMCVideoDecoderFactory", "Found candidate decoder ".concat(String.valueOf(name)));
                                        final int size = a.size();
                                        int n = 0;
                                        boolean startsWith;
                                        do {
                                            arhe2 = arhe;
                                            if (n >= size) {
                                                break Label_0242;
                                            }
                                            arhe2 = (arhe)a.get(n);
                                            startsWith = name.startsWith(arhe2.d);
                                            ++n;
                                        } while (!startsWith);
                                        Logging.a("IMCVideoDecoderFactory", "Found target decoder ".concat(String.valueOf(name)));
                                    }
                                }
                            }
                            if (arhe2 != null) {
                                final String name2 = mediaCodecInfo.getName();
                                arhd arhd2;
                                if ((arhd2 = arhd.b(arhe2.c)) == null) {
                                    arhd2 = arhd.a;
                                }
                                try {
                                    final MediaCodecInfo$CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(aric.c(arhd2));
                                    final int[] colorFormats = capabilitiesForType.colorFormats;
                                    for (int length = colorFormats.length, j = 0; j < length; ++j) {
                                        Logging.a("IMCVideoDecoderFactory", "   Color: 0x".concat(String.valueOf(Integer.toHexString(colorFormats[j]))));
                                    }
                                    Integer n2;
                                    if ((n2 = aric.b(aric.b, capabilitiesForType.colorFormats)) == null) {
                                        Logging.d("IMCVideoDecoderFactory", "Can not find supported color format. Only surface decoding is supported.");
                                        n2 = 0;
                                    }
                                    boolean b2 = b;
                                    Label_0414: {
                                        if (arhd2 == arhd.d) {
                                            if (!name2.startsWith("OMX.qcom.")) {
                                                b2 = b;
                                                if (!name2.startsWith("OMX.Exynos.")) {
                                                    break Label_0414;
                                                }
                                            }
                                            b2 = true;
                                        }
                                    }
                                    arhu = new arhu(name2, n2, b2, arhe2);
                                }
                                catch (final IllegalArgumentException ex) {
                                    Logging.c("IMCVideoDecoderFactory", "Cannot retrieve decoder capabilities", (Throwable)ex);
                                    arhu = arhu.a;
                                }
                                break Label_0486;
                            }
                        }
                    }
                    arhu = arhu.a;
                }
            }
            catch (final Exception ex2) {
                Logging.c("IMCVideoDecoderFactory", "Cannot retrieve media codec info", (Throwable)ex2);
                arhu = arhu.a;
            }
        }
        this.c.put(arhd, arhu);
        Logging.a("IMCVideoDecoderFactory", "Search result: ".concat(arhu.toString()));
        return arhu;
    }
    
    public final VideoDecoder createDecoder(final VideoCodecInfo videoCodecInfo) {
        try {
            final arhd k = aqvr.k(videoCodecInfo.a);
            final boolean contains = this.b.contains(k);
            final String a = videoCodecInfo.a;
            final String c = aric.c(k);
            final StringBuilder sb = new StringBuilder("createDecoder for type: ");
            sb.append(a);
            sb.append(", mime: ");
            sb.append(c);
            sb.append(", dynamic reconfig: ");
            sb.append(contains);
            Logging.a("IMCVideoDecoderFactory", sb.toString());
            final arhu b = this.b(k);
            if (!b.b) {
                Logging.b("IMCVideoDecoderFactory", "Unsupported decoder: ".concat(String.valueOf(videoCodecInfo.a)));
                return null;
            }
            return (VideoDecoder)new arht(b.c, k, b.d, b.f, this.a, contains);
        }
        catch (final IllegalArgumentException ex) {
            Logging.c("IMCVideoDecoderFactory", "Unknown codec type: ".concat(String.valueOf(videoCodecInfo.a)), (Throwable)ex);
            return null;
        }
    }
    
    public final VideoCodecInfo[] getSupportedCodecs() {
        final ArrayList list = new ArrayList();
        final aflu k = aric.a.k();
        while (((Iterator)k).hasNext()) {
            final arhd arhd = (arhd)((Iterator)k).next();
            final arhu b = this.b(arhd);
            Object o;
            if (!b.b) {
                o = null;
            }
            else {
                final arhd d = arhd.d;
                boolean b2 = false;
                if (arhd == d) {
                    b2 = b2;
                    if (b.e) {
                        b2 = true;
                    }
                }
                o = new VideoCodecInfo(arhd.name(), aric.d(arhd, b2));
            }
            if (o != null) {
                list.add(o);
            }
        }
        return (VideoCodecInfo[])list.toArray(new VideoCodecInfo[list.size()]);
    }
}
