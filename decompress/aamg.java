import android.media.AudioDeviceInfo;
import android.media.AudioDeviceCallback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aamg extends AudioDeviceCallback
{
    final aapu a;
    
    public aamg(final aapu a, final byte[] array) {
        this.a = a;
    }
    
    private final void a() {
        final aapu a = this.a;
        ((auna)((abkq)a.a).t.k).tt(((xxy)a.b).a());
    }
    
    public final void onAudioDevicesAdded(final AudioDeviceInfo[] array) {
        this.a();
    }
    
    public final void onAudioDevicesRemoved(final AudioDeviceInfo[] array) {
        this.a();
    }
}
