import java.util.Map;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bht
{
    public static void a(final AudioTrack audioTrack, final bhv bhv) {
        Object a;
        if (bhv == null) {
            a = null;
        }
        else {
            a = bhv.a;
        }
        audioTrack.setPreferredDevice((AudioDeviceInfo)a);
    }
    
    public static String b(final String s) {
        return s.replace('-', '+').replace('_', '/');
    }
    
    public static byt c(byt byt, final String[] array, final Map map) {
        int i = 0;
        final int n = 0;
        if (byt == null) {
            if (array == null) {
                return null;
            }
            final int length = array.length;
            if (length == 1) {
                return map.get(array[0]);
            }
            if (length > 1) {
                byt = new byt();
                for (int j = n; j < length; ++j) {
                    byt.d((byt)map.get(array[j]));
                }
                return byt;
            }
        }
        else {
            if (array != null && array.length == 1) {
                byt.d((byt)map.get(array[0]));
                return byt;
            }
            if (array != null) {
                final int length2 = array.length;
                if (length2 > 1) {
                    while (i < length2) {
                        byt.d((byt)map.get(array[i]));
                        ++i;
                    }
                }
            }
        }
        return byt;
    }
}
