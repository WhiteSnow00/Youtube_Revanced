import android.media.MediaCodecList;
import android.media.MediaCodecInfo;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acxo
{
    public boolean a;
    public boolean b;
    public acxm c;
    
    public acxo() {
        this.b = false;
    }
    
    public static MediaCodecInfo a(final String s) {
        for (int codecCount = MediaCodecList.getCodecCount(), i = 0; i < codecCount; ++i) {
            final MediaCodecInfo codecInfo = MediaCodecList.getCodecInfoAt(i);
            if (codecInfo.isEncoder()) {
                final String[] supportedTypes = codecInfo.getSupportedTypes();
                for (int j = 0; j < supportedTypes.length; ++j) {
                    if (aeda.y(supportedTypes[j], s)) {
                        return codecInfo;
                    }
                }
            }
        }
        return null;
    }
    
    public static String b(int n) {
        if (--n == 1) {
            return "audio/amr-wb";
        }
        if (n != 2) {
            return "";
        }
        return "audio/flac";
    }
    
    public static int c(final int n) {
        switch (n - 1) {
            default: {
                return 1;
            }
            case 12000:
            case 16000: {
                return 4;
            }
            case 6600:
            case 8850:
            case 12650:
            case 14250:
            case 15850:
            case 18250:
            case 19850:
            case 23050:
            case 23850: {
                return 2;
            }
            case 1: {
                return 3;
            }
        }
    }
}
