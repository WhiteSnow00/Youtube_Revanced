import java.util.Map;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bhs
{
    public static void a(final AudioTrack audioTrack, final bhu bhu) {
        Object a;
        if (bhu == null) {
            a = null;
        }
        else {
            a = bhu.a;
        }
        audioTrack.setPreferredDevice((AudioDeviceInfo)a);
    }
    
    public static String b(final String s) {
        return s.replace('-', '+').replace('_', '/');
    }
    
    public static bys c(bys bys, final String[] array, final Map map) {
        final int n = 0;
        int i = 0;
        if (bys == null) {
            if (array == null) {
                return null;
            }
            final int length = array.length;
            if (length == 1) {
                return map.get(array[0]);
            }
            if (length > 1) {
                bys = new bys();
                while (i < length) {
                    bys.d((bys)map.get(array[i]));
                    ++i;
                }
                return bys;
            }
        }
        else {
            if (array != null && array.length == 1) {
                bys.d(map.get(array[0]));
                return bys;
            }
            if (array != null) {
                final int length2 = array.length;
                if (length2 > 1) {
                    for (int j = n; j < length2; ++j) {
                        bys.d((bys)map.get(array[j]));
                    }
                }
            }
        }
        return bys;
    }
}
