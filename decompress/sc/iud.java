import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import android.media.AudioDeviceInfo;
import android.media.AudioDeviceCallback;

// 
// Decompiled by Procyon v0.6.0
// 

final class iud extends AudioDeviceCallback
{
    final iuh a;
    
    public iud(final iuh a) {
        this.a = a;
    }
    
    public final void onAudioDevicesAdded(final AudioDeviceInfo[] array) {
        Collections.addAll(this.a.h, array);
    }
    
    public final void onAudioDevicesRemoved(final AudioDeviceInfo[] array) {
        this.a.h.removeAll(Arrays.asList(array));
    }
}
