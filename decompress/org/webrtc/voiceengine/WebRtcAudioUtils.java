// 
// Decompiled by Procyon v0.6.0
// 

package org.webrtc.voiceengine;

import android.os.Build$VERSION;
import android.media.AudioDeviceInfo;
import org.webrtc.Logging;
import android.media.AudioManager;
import org.webrtc.ContextUtils;
import java.util.List;
import android.os.Build;
import java.util.Arrays;

public final class WebRtcAudioUtils
{
    private static final String[] BLACKLISTED_AEC_MODELS;
    private static final String[] BLACKLISTED_NS_MODELS;
    private static final String[] BLACKLISTED_OPEN_SL_ES_MODELS;
    private static final int DEFAULT_SAMPLE_RATE_HZ = 16000;
    private static final String TAG = "WebRtcAudioUtils";
    private static int defaultSampleRateHz = 16000;
    private static boolean isDefaultSampleRateOverridden;
    private static boolean useWebRtcBasedAcousticEchoCanceler;
    private static boolean useWebRtcBasedNoiseSuppressor;
    
    static {
        BLACKLISTED_OPEN_SL_ES_MODELS = new String[0];
        BLACKLISTED_AEC_MODELS = new String[0];
        BLACKLISTED_NS_MODELS = new String[0];
    }
    
    public static boolean deviceIsBlacklistedForOpenSLESUsage() {
        return Arrays.asList(WebRtcAudioUtils.BLACKLISTED_OPEN_SL_ES_MODELS).contains(Build.MODEL);
    }
    
    private static String deviceTypeToString(final int n) {
        switch (n) {
            default: {
                return "TYPE_UNKNOWN";
            }
            case 22: {
                return "TYPE_USB_HEADSET";
            }
            case 21: {
                return "TYPE_BUS";
            }
            case 20: {
                return "TYPE_IP";
            }
            case 19: {
                return "TYPE_AUX_LINE";
            }
            case 18: {
                return "TYPE_TELEPHONY";
            }
            case 17: {
                return "TYPE_TV_TUNER";
            }
            case 16: {
                return "TYPE_FM_TUNER";
            }
            case 15: {
                return "TYPE_BUILTIN_MIC";
            }
            case 14: {
                return "TYPE_FM";
            }
            case 13: {
                return "TYPE_DOCK";
            }
            case 12: {
                return "TYPE_USB_ACCESSORY";
            }
            case 11: {
                return "TYPE_USB_DEVICE";
            }
            case 10: {
                return "TYPE_HDMI_ARC";
            }
            case 9: {
                return "TYPE_HDMI";
            }
            case 8: {
                return "TYPE_BLUETOOTH_A2DP";
            }
            case 7: {
                return "TYPE_BLUETOOTH_SCO";
            }
            case 6: {
                return "TYPE_LINE_DIGITAL";
            }
            case 5: {
                return "TYPE_LINE_ANALOG";
            }
            case 4: {
                return "TYPE_WIRED_HEADPHONES";
            }
            case 3: {
                return "TYPE_WIRED_HEADSET";
            }
            case 2: {
                return "TYPE_BUILTIN_SPEAKER";
            }
            case 1: {
                return "TYPE_BUILTIN_EARPIECE";
            }
        }
    }
    
    public static List getBlackListedModelsForAecUsage() {
        return Arrays.asList(WebRtcAudioUtils.BLACKLISTED_AEC_MODELS);
    }
    
    public static List getBlackListedModelsForNsUsage() {
        return Arrays.asList(WebRtcAudioUtils.BLACKLISTED_NS_MODELS);
    }
    
    public static int getDefaultSampleRateHz() {
        synchronized (WebRtcAudioUtils.class) {
            return WebRtcAudioUtils.defaultSampleRateHz;
        }
    }
    
    public static String getThreadInfo() {
        final String name = Thread.currentThread().getName();
        final long id = Thread.currentThread().getId();
        final StringBuilder sb = new StringBuilder("@[name=");
        sb.append(name);
        sb.append(", id=");
        sb.append(id);
        sb.append("]");
        return sb.toString();
    }
    
    private static boolean hasMicrophone() {
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.microphone");
    }
    
    public static boolean isAcousticEchoCancelerSupported() {
        return WebRtcAudioEffects.canUseAcousticEchoCanceler();
    }
    
    public static boolean isAutomaticGainControlSupported() {
        return false;
    }
    
    public static boolean isDefaultSampleRateOverridden() {
        synchronized (WebRtcAudioUtils.class) {
            return WebRtcAudioUtils.isDefaultSampleRateOverridden;
        }
    }
    
    public static boolean isNoiseSuppressorSupported() {
        return WebRtcAudioEffects.canUseNoiseSuppressor();
    }
    
    private static void logAudioDeviceInfo(final String s, final AudioManager audioManager) {
        final AudioDeviceInfo[] devices = audioManager.getDevices(3);
        final int length = devices.length;
        if (length == 0) {
            return;
        }
        Logging.a(s, "Audio Devices: ");
        for (final AudioDeviceInfo audioDeviceInfo : devices) {
            final StringBuilder sb = new StringBuilder("  ");
            sb.append(deviceTypeToString(audioDeviceInfo.getType()));
            String s2;
            if (!audioDeviceInfo.isSource()) {
                s2 = "(out): ";
            }
            else {
                s2 = "(in): ";
            }
            sb.append(s2);
            if (audioDeviceInfo.getChannelCounts().length > 0) {
                sb.append("channels=");
                sb.append(Arrays.toString(audioDeviceInfo.getChannelCounts()));
                sb.append(", ");
            }
            if (audioDeviceInfo.getEncodings().length > 0) {
                sb.append("encodings=");
                sb.append(Arrays.toString(audioDeviceInfo.getEncodings()));
                sb.append(", ");
            }
            if (audioDeviceInfo.getSampleRates().length > 0) {
                sb.append("sample rates=");
                sb.append(Arrays.toString(audioDeviceInfo.getSampleRates()));
                sb.append(", ");
            }
            sb.append("id=");
            sb.append(audioDeviceInfo.getId());
            Logging.a(s, sb.toString());
        }
    }
    
    static void logAudioState(final String s) {
        logDeviceInfo(s);
        final AudioManager audioManager = (AudioManager)ContextUtils.getApplicationContext().getSystemService("audio");
        logAudioStateBasic(s, audioManager);
        logAudioStateVolume(s, audioManager);
        logAudioDeviceInfo(s, audioManager);
    }
    
    private static void logAudioStateBasic(final String s, final AudioManager audioManager) {
        final int mode = audioManager.getMode();
        final boolean hasMicrophone = hasMicrophone();
        final boolean microphoneMute = audioManager.isMicrophoneMute();
        final boolean musicActive = audioManager.isMusicActive();
        final boolean speakerphoneOn = audioManager.isSpeakerphoneOn();
        final boolean bluetoothScoOn = audioManager.isBluetoothScoOn();
        final StringBuilder sb = new StringBuilder("Audio State: audio mode: ");
        sb.append(modeToString(mode));
        sb.append(", has mic: ");
        sb.append(hasMicrophone);
        sb.append(", mic muted: ");
        sb.append(microphoneMute);
        sb.append(", music active: ");
        sb.append(musicActive);
        sb.append(", speakerphone: ");
        sb.append(speakerphoneOn);
        sb.append(", BT SCO: ");
        sb.append(bluetoothScoOn);
        Logging.a(s, sb.toString());
    }
    
    private static void logAudioStateVolume(final String s, final AudioManager audioManager) {
        Logging.a(s, "Audio State: ");
        final boolean volumeFixed = audioManager.isVolumeFixed();
        final StringBuilder sb = new StringBuilder("  fixed volume=");
        sb.append(volumeFixed);
        Logging.a(s, sb.toString());
        if (!volumeFixed) {
            for (int i = 0; i < 6; ++i) {
                final int n = (new int[] { 0, 3, 2, 4, 5, 1 })[i];
                final StringBuilder sb2 = new StringBuilder();
                final StringBuilder sb3 = new StringBuilder("  ");
                sb3.append(streamTypeToString(n));
                sb3.append(": ");
                sb2.append(sb3.toString());
                sb2.append("volume=");
                sb2.append(audioManager.getStreamVolume(n));
                sb2.append(", max=");
                sb2.append(audioManager.getStreamMaxVolume(n));
                logIsStreamMute(s, audioManager, n, sb2);
                Logging.a(s, sb2.toString());
            }
        }
    }
    
    static void logDeviceInfo(final String s) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        final String release = Build$VERSION.RELEASE;
        final String brand = Build.BRAND;
        final String device = Build.DEVICE;
        final String id = Build.ID;
        final String hardware = Build.HARDWARE;
        final String manufacturer = Build.MANUFACTURER;
        final String model = Build.MODEL;
        final String product = Build.PRODUCT;
        final StringBuilder sb = new StringBuilder("Android SDK: ");
        sb.append(sdk_INT);
        sb.append(", Release: ");
        sb.append(release);
        sb.append(", Brand: ");
        sb.append(brand);
        sb.append(", Device: ");
        sb.append(device);
        sb.append(", Id: ");
        sb.append(id);
        sb.append(", Hardware: ");
        sb.append(hardware);
        sb.append(", Manufacturer: ");
        sb.append(manufacturer);
        sb.append(", Model: ");
        sb.append(model);
        sb.append(", Product: ");
        sb.append(product);
        Logging.a(s, sb.toString());
    }
    
    private static void logIsStreamMute(final String s, final AudioManager audioManager, final int n, final StringBuilder sb) {
        sb.append(", muted=");
        sb.append(audioManager.isStreamMute(n));
    }
    
    static String modeToString(final int n) {
        if (n == 0) {
            return "MODE_NORMAL";
        }
        if (n == 1) {
            return "MODE_RINGTONE";
        }
        if (n == 2) {
            return "MODE_IN_CALL";
        }
        if (n != 3) {
            return "MODE_INVALID";
        }
        return "MODE_IN_COMMUNICATION";
    }
    
    public static boolean runningOnEmulator() {
        return Build.HARDWARE.equals("goldfish") && Build.BRAND.startsWith("generic_");
    }
    
    public static void setDefaultSampleRateHz(final int defaultSampleRateHz) {
        synchronized (WebRtcAudioUtils.class) {
            WebRtcAudioUtils.isDefaultSampleRateOverridden = true;
            WebRtcAudioUtils.defaultSampleRateHz = defaultSampleRateHz;
        }
    }
    
    public static void setWebRtcBasedAcousticEchoCanceler(final boolean useWebRtcBasedAcousticEchoCanceler) {
        synchronized (WebRtcAudioUtils.class) {
            WebRtcAudioUtils.useWebRtcBasedAcousticEchoCanceler = useWebRtcBasedAcousticEchoCanceler;
        }
    }
    
    public static void setWebRtcBasedAutomaticGainControl(final boolean b) {
        synchronized (WebRtcAudioUtils.class) {
            Logging.d("WebRtcAudioUtils", "setWebRtcBasedAutomaticGainControl() is deprecated");
        }
    }
    
    public static void setWebRtcBasedNoiseSuppressor(final boolean useWebRtcBasedNoiseSuppressor) {
        synchronized (WebRtcAudioUtils.class) {
            WebRtcAudioUtils.useWebRtcBasedNoiseSuppressor = useWebRtcBasedNoiseSuppressor;
        }
    }
    
    private static String streamTypeToString(final int n) {
        if (n == 0) {
            return "STREAM_VOICE_CALL";
        }
        if (n == 1) {
            return "STREAM_SYSTEM";
        }
        if (n == 2) {
            return "STREAM_RING";
        }
        if (n == 3) {
            return "STREAM_MUSIC";
        }
        if (n == 4) {
            return "STREAM_ALARM";
        }
        if (n != 5) {
            return "STREAM_INVALID";
        }
        return "STREAM_NOTIFICATION";
    }
    
    public static boolean useWebRtcBasedAcousticEchoCanceler() {
        synchronized (WebRtcAudioUtils.class) {
            if (WebRtcAudioUtils.useWebRtcBasedAcousticEchoCanceler) {
                Logging.d("WebRtcAudioUtils", "Overriding default behavior; now using WebRTC AEC!");
            }
            return WebRtcAudioUtils.useWebRtcBasedAcousticEchoCanceler;
        }
    }
    
    public static boolean useWebRtcBasedAutomaticGainControl() {
        monitorenter(WebRtcAudioUtils.class);
        monitorexit(WebRtcAudioUtils.class);
        return true;
    }
    
    public static boolean useWebRtcBasedNoiseSuppressor() {
        synchronized (WebRtcAudioUtils.class) {
            if (WebRtcAudioUtils.useWebRtcBasedNoiseSuppressor) {
                Logging.d("WebRtcAudioUtils", "Overriding default behavior; now using WebRTC NS!");
            }
            return WebRtcAudioUtils.useWebRtcBasedNoiseSuppressor;
        }
    }
}
