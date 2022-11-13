import android.media.AudioDeviceInfo;
import android.media.AudioDeviceCallback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaki extends AudioDeviceCallback
{
    final aujg a;
    
    public aaki(final aujg a, final byte[] array, final byte[] array2) {
        this.a = a;
    }
    
    private final void a() {
        final aujg a = this.a;
        ((aukf)((abjj)a.a).t.k).tu((Object)((xvz)a.c).a());
    }
    
    public final void onAudioDevicesAdded(final AudioDeviceInfo[] array) {
        this.a();
    }
    
    public final void onAudioDevicesRemoved(final AudioDeviceInfo[] array) {
        this.a();
    }
}
