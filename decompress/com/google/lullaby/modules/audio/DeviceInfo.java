// 
// Decompiled by Procyon v0.6.0
// 

package com.google.lullaby.modules.audio;

import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.util.Log;
import android.media.AudioManager;
import android.content.BroadcastReceiver;
import android.content.Context;

public class DeviceInfo
{
    public final long a;
    private final Context b;
    private final BroadcastReceiver c;
    
    private DeviceInfo(final long a, final Context b) {
        this.a = a;
        this.b = b;
        this.c = new agtc(this);
    }
    
    private static DeviceInfo createAudioDeviceInfo(final long n, final Context context) {
        return new DeviceInfo(n, context);
    }
    
    private int getSystemBufferSize() {
        final String property = ((AudioManager)this.b.getSystemService("audio")).getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
        if (property == null) {
            Log.w("DeviceInfo", "Could not obtain system buffer size, defaulting to 256");
            return 256;
        }
        return Integer.parseInt(property);
    }
    
    private int getSystemSampleRate() {
        final String property = ((AudioManager)this.b.getSystemService("audio")).getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        if (property == null) {
            Log.w("DeviceInfo", "Could not obtain system sample rate, defaulting to 48000");
            return 48000;
        }
        return Integer.parseInt(property);
    }
    
    private boolean isBluetoothAudioDevicePluggedIn() {
        final AudioDeviceInfo[] devices = ((AudioManager)this.b.getSystemService("audio")).getDevices(2);
        for (int length = devices.length, i = 0; i < length; ++i) {
            if (devices[i].getType() == 8) {
                return true;
            }
        }
        return false;
    }
    
    private boolean isHeadphonePluggedIn() {
        for (final AudioDeviceInfo audioDeviceInfo : ((AudioManager)this.b.getSystemService("audio")).getDevices(2)) {
            if (audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3 || audioDeviceInfo.getType() == 22) {
                return true;
            }
        }
        return false;
    }
    
    private void registerHandlers() {
        this.b.registerReceiver(this.c, new IntentFilter("android.intent.action.HEADSET_PLUG"));
    }
    
    private void unregisterHandlers() {
        this.b.unregisterReceiver(this.c);
    }
    
    public native void nativeUpdateHeadphoneStateChange(final long p0, final int p1);
}
