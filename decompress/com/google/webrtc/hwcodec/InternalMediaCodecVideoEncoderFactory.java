// 
// Decompiled by Procyon v0.6.0
// 

package com.google.webrtc.hwcodec;

import java.util.Collection;
import java.util.ArrayList;
import org.webrtc.VideoEncoderFactory$_CC;
import org.webrtc.VideoEncoderFactory$VideoEncoderSelector;
import org.webrtc.VideoEncoder;
import org.webrtc.VideoCodecInfo;
import android.media.MediaCodecInfo$CodecCapabilities;
import android.media.MediaCodecInfo;
import org.webrtc.Logging;
import java.util.HashMap;
import java.util.Arrays;
import java.util.Map;
import java.util.List;
import org.webrtc.VideoEncoderFactory;

public class InternalMediaCodecVideoEncoderFactory implements VideoEncoderFactory
{
    public static final List a;
    private final Map b;
    private final afaq c;
    private final afaq d;
    private final afer e;
    private final afev f;
    private final afhd g;
    
    static {
        a = Arrays.asList("SAMSUNG-SGH-I337", "Nexus 7", "Nexus 4");
    }
    
    public InternalMediaCodecVideoEncoderFactory(final afaq d, final afhd g, final afer e, final afev f, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = new HashMap();
        this.c = adyf.A((afaq)yrg.q);
        Logging.a("IMCVideoEncoderFactory", "InternalMediaCodecVideoEncoderFactory ctor");
        this.d = d;
        this.g = g;
        this.e = e;
        this.f = f;
    }
    
    public static arek a(final arei arei, final String d, final areh areh) {
        final ahaz builder = ((ahbh)arek.a).createBuilder();
        builder.copyOnWrite();
        final arek arek = (arek)builder.instance;
        arek.c = arei.g;
        arek.b |= 0x1;
        builder.copyOnWrite();
        final arek arek2 = (arek)builder.instance;
        arek2.b |= 0x2;
        arek2.d = d;
        builder.copyOnWrite();
        final arek arek3 = (arek)builder.instance;
        arek3.e = areh.d;
        arek3.b |= 0x10;
        builder.copyOnWrite();
        final arek arek4 = (arek)builder.instance;
        arek4.b |= 0x20;
        arek4.f = 3600;
        builder.copyOnWrite();
        final arek arek5 = (arek)builder.instance;
        arek5.b |= 0x40;
        arek5.g = 0;
        builder.copyOnWrite();
        final arek arek6 = (arek)builder.instance;
        arek6.b |= 0x80;
        arek6.h = 3000000000L;
        return (arek)builder.build();
    }
    
    private final arfg b(final arei arei) {
        if (this.b.containsKey(arei)) {
            return this.b.get(arei);
        }
        Logging.a("IMCVideoEncoderFactory", "Searching HW encoder for ".concat(arfh.c(arei)));
        arfg arfg = null;
        Label_0411: {
            try {
                final MediaCodecInfo[] array = (MediaCodecInfo[])this.c.a();
                if (array == null) {
                    Logging.b("IMCVideoEncoderFactory", "Empty codec info");
                    arfg = arfg.a;
                }
                else {
                    for (int i = 0; i < array.length; ++i) {
                        final MediaCodecInfo mediaCodecInfo = array[i];
                        if (mediaCodecInfo != null && mediaCodecInfo.isEncoder()) {
                            final boolean e = arfh.e(mediaCodecInfo, arei);
                            final arek arek = null;
                            arek arek2 = null;
                            Label_0239: {
                                if (!e) {
                                    arek2 = arek;
                                }
                                else {
                                    final afeq a = this.e.a((Object)arei);
                                    if (a == null) {
                                        arek2 = arek;
                                    }
                                    else {
                                        final String name = mediaCodecInfo.getName();
                                        Logging.a("IMCVideoEncoderFactory", "Found candidate encoder ".concat(String.valueOf(name)));
                                        final int size = ((List)a).size();
                                        int n = 0;
                                        boolean startsWith;
                                        do {
                                            arek2 = arek;
                                            if (n >= size) {
                                                break Label_0239;
                                            }
                                            arek2 = (arek)((List)a).get(n);
                                            startsWith = name.startsWith(arek2.d);
                                            ++n;
                                        } while (!startsWith);
                                        Logging.a("IMCVideoEncoderFactory", "Found target encoder ".concat(String.valueOf(name)));
                                    }
                                }
                            }
                            if (arek2 != null) {
                                final String name2 = mediaCodecInfo.getName();
                                arei arei2;
                                if ((arei2 = arei.b(arek2.c)) == null) {
                                    arei2 = arei.a;
                                }
                                try {
                                    final MediaCodecInfo$CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(arfh.c(arei2));
                                    arfg = new arfg(name2, arfh.b(arfh.d, capabilitiesForType.colorFormats), arfh.b(arfh.c, capabilitiesForType.colorFormats), arek2, arei2 == arei.d && name2.startsWith("OMX.Exynos."));
                                }
                                catch (final IllegalArgumentException ex) {
                                    Logging.e("IMCVideoEncoderFactory", "Cannot retrieve encoder capabilities.", (Throwable)ex);
                                    arfg = arfg.a;
                                }
                                break Label_0411;
                            }
                        }
                    }
                    arfg = arfg.a;
                }
            }
            catch (final Exception ex2) {
                Logging.c("IMCVideoEncoderFactory", "Cannot retrieve encoder codec info", (Throwable)ex2);
                arfg = arfg.a;
            }
        }
        this.b.put(arei, arfg);
        Logging.a("IMCVideoEncoderFactory", "Search result: ".concat(arfg.toString()));
        return arfg;
    }
    
    private static native boolean nativeIsSameH264Profile(final Map p0, final Map p1);
    
    public final VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo) {
        Logging.a("IMCVideoEncoderFactory", "createEncoder for: ".concat(String.valueOf(videoCodecInfo.a)));
        try {
            final arei r = aqsy.r(videoCodecInfo.a);
            final arfg b = this.b(r);
            if (!b.b) {
                Logging.b("IMCVideoEncoderFactory", "Unsupported encoder: ".concat(String.valueOf(videoCodecInfo.a)));
                return null;
            }
            boolean b2 = false;
            Label_0197: {
                if (r == arei.d) {
                    final boolean nativeIsSameH264Profile = nativeIsSameH264Profile(videoCodecInfo.b, arfh.d(r, true));
                    final boolean nativeIsSameH264Profile2 = nativeIsSameH264Profile(videoCodecInfo.b, arfh.d(r, false));
                    final boolean g = b.g;
                    videoCodecInfo = (VideoCodecInfo)new StringBuilder("h264HighProfileRequested: ");
                    ((StringBuilder)videoCodecInfo).append(nativeIsSameH264Profile);
                    ((StringBuilder)videoCodecInfo).append(" h264BaselineRequested: ");
                    ((StringBuilder)videoCodecInfo).append(nativeIsSameH264Profile2);
                    ((StringBuilder)videoCodecInfo).append(" isH264HighProfileSupported: ");
                    ((StringBuilder)videoCodecInfo).append(g);
                    Logging.a("IMCVideoEncoderFactory", ((StringBuilder)videoCodecInfo).toString());
                    if (nativeIsSameH264Profile) {
                        if (g) {
                            b2 = true;
                            break Label_0197;
                        }
                    }
                    else if (!nativeIsSameH264Profile2) {
                        Logging.b("IMCVideoEncoderFactory", "Unknown / unsupported profile.");
                        return null;
                    }
                }
                b2 = false;
            }
            Logging.a("IMCVideoEncoderFactory", "encoder settings: ".concat(String.valueOf(String.valueOf(b))));
            final String c = b.c;
            final Integer d = b.d;
            final Integer e = b.e;
            final arek f = b.f;
            if ((videoCodecInfo = (VideoCodecInfo)areh.b(f.e)) == null) {
                videoCodecInfo = (VideoCodecInfo)areh.a;
            }
            final int ordinal = ((areh)videoCodecInfo).ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        throw new IllegalArgumentException("Unknown bitrate adjuster type.");
                    }
                    videoCodecInfo = (VideoCodecInfo)new ares();
                }
                else {
                    videoCodecInfo = (VideoCodecInfo)new aret();
                }
            }
            else {
                videoCodecInfo = (VideoCodecInfo)new areq();
            }
            return (VideoEncoder)new InternalMediaCodecVideoEncoder(c, r, d, e, b2, f, (areq)videoCodecInfo, this.d, this.g, (afeq)this.f.getOrDefault(r, afeq.q()), null, null, null);
        }
        catch (final IllegalArgumentException ex) {
            Logging.c("IMCVideoEncoderFactory", "Unknown codec type: ".concat(String.valueOf(videoCodecInfo.a)), (Throwable)ex);
            return null;
        }
    }
    
    public final VideoEncoderFactory$VideoEncoderSelector getEncoderSelector() {
        return null;
    }
    
    public final VideoCodecInfo[] getImplementations() {
        return VideoEncoderFactory$_CC.$default$getImplementations((VideoEncoderFactory)this);
    }
    
    public final VideoCodecInfo[] getSupportedCodecs() {
        final ArrayList list = new ArrayList();
        final afke k = arfh.a.k();
        while (k.hasNext()) {
            final arei arei = k.next();
            final arfg b = this.b(arei);
            ArrayList list2;
            if (!b.b) {
                list2 = new ArrayList();
            }
            else {
                list2 = new ArrayList();
                if (arei == arei.d && b.g) {
                    list2.add(new VideoCodecInfo(arei.name(), arfh.d(arei, true)));
                }
                list2.add(new VideoCodecInfo(arei.name(), arfh.d(arei, false)));
            }
            list.addAll(list2);
        }
        return (VideoCodecInfo[])list.toArray(new VideoCodecInfo[list.size()]);
    }
}
