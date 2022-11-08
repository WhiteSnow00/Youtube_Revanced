import java.util.Collections;
import android.util.Log;
import android.media.MediaCodecInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import android.media.MediaCodecInfo$CodecCapabilities;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lrj
{
    private static final Map a;
    
    static {
        new fwn("OMX.google.raw.decoder", null);
        a = new HashMap();
    }
    
    public static List a(String name) {
        monitorenter(lrj.class);
        try {
            final lrh lrh = new lrh(name);
            final List list = lrj.a.get(lrh);
            if (list != null) {
                monitorexit(lrj.class);
                return list;
            }
            final int a = lwj.a;
            final elw elw = new elw();
            try {
                final ArrayList list2 = new ArrayList();
                final String a2 = lrh.a;
                elw.t();
                for (int length = ((MediaCodecInfo[])elw.a).length, i = 0; i < length; ++i) {
                    elw.t();
                    final MediaCodecInfo mediaCodecInfo = ((MediaCodecInfo[])elw.a)[i];
                    name = mediaCodecInfo.getName();
                    if (!mediaCodecInfo.isEncoder()) {
                        for (final String s : mediaCodecInfo.getSupportedTypes()) {
                            if (s.equalsIgnoreCase(a2)) {
                                try {
                                    final MediaCodecInfo$CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(s);
                                    if (!capabilitiesForType.isFeatureSupported("secure-playback")) {
                                        list2.add(new fwn(name, capabilitiesForType));
                                    }
                                }
                                catch (final Exception ex) {
                                    final StringBuilder sb = new StringBuilder();
                                    sb.append("Failed to query codec ");
                                    sb.append(name);
                                    sb.append(" (");
                                    sb.append(s);
                                    sb.append(")");
                                    Log.e("MediaCodecUtil", sb.toString());
                                    throw ex;
                                }
                            }
                        }
                    }
                }
                final List<Object> unmodifiableList = Collections.unmodifiableList((List<?>)list2);
                lrj.a.put(lrh, unmodifiableList);
                monitorexit(lrj.class);
                return unmodifiableList;
            }
            catch (final Exception ex2) {
                throw new lri(ex2);
            }
        }
        finally {
            monitorexit(lrj.class);
            while (true) {}
        }
    }
}
