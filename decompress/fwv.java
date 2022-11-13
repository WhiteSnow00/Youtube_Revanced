import android.media.MediaCodecInfo$CodecCapabilities;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fwv
{
    public final boolean a;
    public final Object b;
    
    public fwv(final aiqj b, final boolean a) {
        this.b = b;
        this.a = a;
    }
    
    public fwv(final Rect b, final boolean a) {
        this.b = b;
        this.a = a;
    }
    
    public fwv(final aruq b, final boolean a) {
        b.getClass();
        this.b = b;
        this.a = a;
    }
    
    public fwv(final di b, final boolean a, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
    }
    
    public fwv(final String b, final MediaCodecInfo$CodecCapabilities mediaCodecInfo$CodecCapabilities) {
        this.b = b;
        boolean a = false;
        if (mediaCodecInfo$CodecCapabilities != null) {
            final int a2 = lxo.a;
            a = a;
            if (mediaCodecInfo$CodecCapabilities.isFeatureSupported("adaptive-playback")) {
                a = true;
            }
        }
        this.a = a;
    }
    
    public fwv(final String b, final boolean a) {
        this.b = b;
        this.a = a;
    }
    
    public fwv(final jdk b, final boolean a) {
        this.b = b;
        this.a = a;
    }
    
    public fwv(final boolean a, final fwu b) {
        this.a = a;
        this.b = b;
    }
    
    public fwv(final boolean a, final String b) {
        this.a = a;
        this.b = b;
    }
}
