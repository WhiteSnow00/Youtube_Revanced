// 
// Decompiled by Procyon v0.6.0
// 

package com.google.webrtc.hwcodec;

import java.util.Iterator;
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
    private final aeyr c;
    private final aeyr d;
    private final afcs e;
    private final afcw f;
    private final aepj g;
    
    static {
        a = Arrays.asList("SAMSUNG-SGH-I337", "Nexus 7", "Nexus 4");
    }
    
    public InternalMediaCodecVideoEncoderFactory(final aeyr d, final aepj g, final afcs e, final afcw f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.b = new HashMap();
        this.c = agnj.E((aeyr)ypg.q);
        Logging.a("IMCVideoEncoderFactory", "InternalMediaCodecVideoEncoderFactory ctor");
        this.d = d;
        this.g = g;
        this.e = e;
        this.f = f;
    }
    
    public static arbw a(final arbu arbu, final String d, final arbs arbs) {
        final agza builder = ((agzi)arbw.a).createBuilder();
        builder.copyOnWrite();
        final arbw arbw = (arbw)builder.instance;
        arbw.c = arbu.g;
        arbw.b |= 0x1;
        builder.copyOnWrite();
        final arbw arbw2 = (arbw)builder.instance;
        arbw2.b |= 0x2;
        arbw2.d = d;
        builder.copyOnWrite();
        final arbw arbw3 = (arbw)builder.instance;
        arbw3.e = arbs.d;
        arbw3.b |= 0x10;
        builder.copyOnWrite();
        final arbw arbw4 = (arbw)builder.instance;
        arbw4.b |= 0x20;
        arbw4.f = 3600;
        builder.copyOnWrite();
        final arbw arbw5 = (arbw)builder.instance;
        arbw5.b |= 0x40;
        arbw5.g = 0;
        builder.copyOnWrite();
        final arbw arbw6 = (arbw)builder.instance;
        arbw6.b |= 0x80;
        arbw6.h = 3000000000L;
        return (arbw)builder.build();
    }
    
    private final arcs b(final arbu arbu) {
        if (this.b.containsKey(arbu)) {
            return this.b.get(arbu);
        }
        Logging.a("IMCVideoEncoderFactory", "Searching HW encoder for ".concat(arct.c(arbu)));
        arcs arcs = null;
        Label_0391: {
            try {
                final MediaCodecInfo[] array = (MediaCodecInfo[])this.c.a();
                if (array == null) {
                    Logging.b("IMCVideoEncoderFactory", "Empty codec info");
                    arcs = arcs.a;
                }
                else {
                    for (final MediaCodecInfo mediaCodecInfo : array) {
                        if (mediaCodecInfo != null && mediaCodecInfo.isEncoder()) {
                            final boolean e = arct.e(mediaCodecInfo, arbu);
                            final arbw arbw = null;
                            arbw arbw2 = null;
                            Label_0235: {
                                if (!e) {
                                    arbw2 = arbw;
                                }
                                else {
                                    final afcr a = this.e.a((Object)arbu);
                                    if (a == null) {
                                        arbw2 = arbw;
                                    }
                                    else {
                                        final String name = mediaCodecInfo.getName();
                                        Logging.a("IMCVideoEncoderFactory", "Found candidate encoder ".concat(String.valueOf(name)));
                                        final int size = ((List)a).size();
                                        int n = 0;
                                        do {
                                            arbw2 = arbw;
                                            if (n >= size) {
                                                break Label_0235;
                                            }
                                            arbw2 = (arbw)((List)a).get(n);
                                            ++n;
                                        } while (!name.startsWith(arbw2.d));
                                        Logging.a("IMCVideoEncoderFactory", "Found target encoder ".concat(String.valueOf(name)));
                                    }
                                }
                            }
                            if (arbw2 != null) {
                                final String name2 = mediaCodecInfo.getName();
                                arbu arbu2;
                                if ((arbu2 = arbu.b(arbw2.c)) == null) {
                                    arbu2 = arbu.a;
                                }
                                try {
                                    final MediaCodecInfo$CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(arct.c(arbu2));
                                    arcs = new arcs(name2, arct.b(arct.d, capabilitiesForType.colorFormats), arct.b(arct.c, capabilitiesForType.colorFormats), arbw2, arbu2 == arbu.d && name2.startsWith("OMX.Exynos."));
                                }
                                catch (final IllegalArgumentException ex) {
                                    Logging.e("IMCVideoEncoderFactory", "Cannot retrieve encoder capabilities.", (Throwable)ex);
                                    arcs = arcs.a;
                                }
                                break Label_0391;
                            }
                        }
                    }
                    arcs = arcs.a;
                }
            }
            catch (final Exception ex2) {
                Logging.c("IMCVideoEncoderFactory", "Cannot retrieve encoder codec info", (Throwable)ex2);
                arcs = arcs.a;
            }
        }
        this.b.put(arbu, arcs);
        Logging.a("IMCVideoEncoderFactory", "Search result: ".concat(arcs.toString()));
        return arcs;
    }
    
    private static native boolean nativeIsSameH264Profile(final Map p0, final Map p1);
    
    public final VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo) {
        Logging.a("IMCVideoEncoderFactory", "createEncoder for: ".concat(String.valueOf(videoCodecInfo.a)));
        try {
            final arbu r = aqqm.r(videoCodecInfo.a);
            final arcs b = this.b(r);
            if (!b.b) {
                Logging.b("IMCVideoEncoderFactory", "Unsupported encoder: ".concat(String.valueOf(videoCodecInfo.a)));
                return null;
            }
            boolean b2 = false;
            Label_0194: {
                if (r == arbu.d) {
                    final boolean nativeIsSameH264Profile = nativeIsSameH264Profile(videoCodecInfo.b, arct.d(r, true));
                    final boolean nativeIsSameH264Profile2 = nativeIsSameH264Profile(videoCodecInfo.b, arct.d(r, false));
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
                            break Label_0194;
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
            final arbw f = b.f;
            if ((videoCodecInfo = (VideoCodecInfo)arbs.b(f.e)) == null) {
                videoCodecInfo = (VideoCodecInfo)arbs.a;
            }
            final int ordinal = ((arbs)videoCodecInfo).ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        throw new IllegalArgumentException("Unknown bitrate adjuster type.");
                    }
                    videoCodecInfo = (VideoCodecInfo)new arce();
                }
                else {
                    videoCodecInfo = (VideoCodecInfo)new arcf();
                }
            }
            else {
                videoCodecInfo = (VideoCodecInfo)new arcc();
            }
            return (VideoEncoder)new InternalMediaCodecVideoEncoder(c, r, d, e, b2, f, (arcc)videoCodecInfo, this.d, this.g, (afcr)this.f.getOrDefault((Object)r, (Object)afcr.q()), null, null, null, null);
        }
        catch (final IllegalArgumentException ex) {
            Logging.c("IMCVideoEncoderFactory", "Unknown codec type: ".concat(String.valueOf(videoCodecInfo.a)), (Throwable)ex);
            return null;
        }
    }
    
    public final VideoCodecInfo[] getSupportedCodecs() {
        final ArrayList list = new ArrayList();
        final afie k = arct.a.k();
        while (((Iterator)k).hasNext()) {
            final arbu arbu = (arbu)((Iterator)k).next();
            final arcs b = this.b(arbu);
            ArrayList list2;
            if (!b.b) {
                list2 = new ArrayList();
            }
            else {
                list2 = new ArrayList();
                if (arbu == arbu.d && b.g) {
                    list2.add(new VideoCodecInfo(arbu.name(), arct.d(arbu, true)));
                }
                list2.add(new VideoCodecInfo(arbu.name(), arct.d(arbu, false)));
            }
            list.addAll(list2);
        }
        return (VideoCodecInfo[])list.toArray(new VideoCodecInfo[list.size()]);
    }
}
