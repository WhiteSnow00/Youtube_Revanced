import java.util.Iterator;
import java.util.Collection;
import android.media.AudioTrack;
import android.media.AudioFormat$Builder;
import android.media.AudioAttributes$Builder;
import android.media.AudioAttributes;

// 
// Decompiled by Procyon v0.6.0
// 

final class bha
{
    private static final AudioAttributes a;
    
    static {
        a = new AudioAttributes$Builder().setUsage(1).setContentType(3).setFlags(0).build();
    }
    
    public static int a(final int encoding, final int sampleRate) {
        for (int i = 8; i > 0; --i) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat$Builder().setEncoding(encoding).setSampleRate(sampleRate).setChannelMask(baw.g(i)).build(), bha.a)) {
                return i;
            }
        }
        return 0;
    }
    
    public static int[] b() {
        final afcm d = afcr.d();
        final afie k = bhb.b.s().k();
        while (((Iterator)k).hasNext()) {
            final int intValue = (int)((Iterator)k).next();
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat$Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), bha.a)) {
                d.h((Object)intValue);
            }
        }
        d.h((Object)2);
        return aesy.D((Collection)d.g());
    }
}
