import android.media.MediaCodecInfo$CodecCapabilities;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fwn
{
    public final boolean a;
    public final Object b;
    
    public fwn(final aioe b, final boolean a) {
        this.b = b;
        this.a = a;
    }
    
    public fwn(final Rect b, final boolean a) {
        this.b = b;
        this.a = a;
    }
    
    public fwn(final arsi b, final boolean a) {
        b.getClass();
        this.b = b;
        this.a = a;
    }
    
    public fwn(final di b, final boolean a, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
    }
    
    public fwn(final String b, final MediaCodecInfo$CodecCapabilities mediaCodecInfo$CodecCapabilities) {
        this.b = b;
        boolean a = false;
        if (mediaCodecInfo$CodecCapabilities != null) {
            final int a2 = lwj.a;
            a = a;
            if (mediaCodecInfo$CodecCapabilities.isFeatureSupported("adaptive-playback")) {
                a = true;
            }
        }
        this.a = a;
    }
    
    public fwn(final String b, final boolean a) {
        this.b = b;
        this.a = a;
    }
    
    public fwn(final jcj b, final boolean a) {
        this.b = b;
        this.a = a;
    }
    
    public fwn(final boolean a, final fwm b) {
        this.a = a;
        this.b = b;
    }
    
    public fwn(final boolean a, final String b) {
        this.a = a;
        this.b = b;
    }
}
