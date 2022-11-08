// 
// Decompiled by Procyon v0.6.0
// 

package org.webrtc.voiceengine;

import android.media.AudioFormat$Builder;
import android.media.AudioAttributes$Builder;
import org.webrtc.ContextUtils;
import org.webrtc.Logging;
import java.nio.ByteBuffer;
import android.media.AudioTrack;
import android.media.AudioManager;

public class WebRtcAudioTrack
{
    private static final long AUDIO_TRACK_THREAD_JOIN_TIMEOUT_MS = 2000L;
    private static final int BITS_PER_SAMPLE = 16;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_USAGE = 2;
    private static final String TAG = "WebRtcAudioTrack";
    private static WebRtcAudioTrack$ErrorCallback errorCallback;
    private static WebRtcAudioTrack$WebRtcAudioTrackErrorCallback errorCallbackOld;
    private static volatile boolean speakerMute = false;
    private static int usageAttribute = 2;
    private final AudioManager audioManager;
    private WebRtcAudioTrack$AudioTrackThread audioThread;
    private AudioTrack audioTrack;
    private ByteBuffer byteBuffer;
    private byte[] emptyBytes;
    private final long nativeAudioTrack;
    private final auln threadChecker;
    
    WebRtcAudioTrack(final long nativeAudioTrack) {
        (this.threadChecker = new auln()).a();
        Logging.a("WebRtcAudioTrack", "ctor".concat(WebRtcAudioUtils.getThreadInfo()));
        this.nativeAudioTrack = nativeAudioTrack;
        this.audioManager = (AudioManager)ContextUtils.getApplicationContext().getSystemService("audio");
    }
    
    private static void assertTrue(final boolean b) {
        if (b) {
            return;
        }
        throw new AssertionError((Object)"Expected condition to be true");
    }
    
    private int channelCountToConfiguration(final int n) {
        if (n == 1) {
            return 4;
        }
        return 12;
    }
    
    private static AudioTrack createAudioTrack(final int sampleRate, final int channelMask, final int n) {
        Logging.a("WebRtcAudioTrack", "createAudioTrack");
        final int nativeOutputSampleRate = AudioTrack.getNativeOutputSampleRate(0);
        final StringBuilder sb = new StringBuilder("nativeOutputSampleRate: ");
        sb.append(nativeOutputSampleRate);
        Logging.a("WebRtcAudioTrack", sb.toString());
        if (sampleRate != nativeOutputSampleRate) {
            Logging.d("WebRtcAudioTrack", "Unable to use fast mode since requested sample rate is not native");
        }
        final int usageAttribute = WebRtcAudioTrack.usageAttribute;
        if (usageAttribute != 2) {
            final StringBuilder sb2 = new StringBuilder("A non default usage attribute is used: ");
            sb2.append(usageAttribute);
            Logging.d("WebRtcAudioTrack", sb2.toString());
        }
        return new AudioTrack(new AudioAttributes$Builder().setUsage(WebRtcAudioTrack.usageAttribute).setContentType(1).build(), new AudioFormat$Builder().setEncoding(2).setSampleRate(sampleRate).setChannelMask(channelMask).build(), n, 1, 0);
    }
    
    private int getBufferSizeInFrames() {
        return this.audioTrack.getBufferSizeInFrames();
    }
    
    private int getStreamMaxVolume() {
        this.threadChecker.a();
        Logging.a("WebRtcAudioTrack", "getStreamMaxVolume");
        assertTrue(this.audioManager != null);
        return this.audioManager.getStreamMaxVolume(0);
    }
    
    private int getStreamVolume() {
        this.threadChecker.a();
        Logging.a("WebRtcAudioTrack", "getStreamVolume");
        assertTrue(this.audioManager != null);
        return this.audioManager.getStreamVolume(0);
    }
    
    private int initPlayout(final int n, int channelCountToConfiguration, final double n2) {
        this.threadChecker.a();
        final StringBuilder sb = new StringBuilder("initPlayout(sampleRate=");
        sb.append(n);
        sb.append(", channels=");
        sb.append(channelCountToConfiguration);
        sb.append(", bufferSizeFactor=");
        sb.append(n2);
        sb.append(")");
        Logging.a("WebRtcAudioTrack", sb.toString());
        final ByteBuffer allocateDirect = ByteBuffer.allocateDirect((channelCountToConfiguration + channelCountToConfiguration) * (n / 100));
        this.byteBuffer = allocateDirect;
        final int capacity = allocateDirect.capacity();
        final StringBuilder sb2 = new StringBuilder("byteBuffer.capacity: ");
        sb2.append(capacity);
        Logging.a("WebRtcAudioTrack", sb2.toString());
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        this.nativeCacheDirectBufferAddress(this.byteBuffer, this.nativeAudioTrack);
        channelCountToConfiguration = this.channelCountToConfiguration(channelCountToConfiguration);
        final double n3 = AudioTrack.getMinBufferSize(n, channelCountToConfiguration, 2);
        Double.isNaN(n3);
        final int n4 = (int)(n3 * n2);
        final StringBuilder sb3 = new StringBuilder("minBufferSizeInBytes: ");
        sb3.append(n4);
        Logging.a("WebRtcAudioTrack", sb3.toString());
        if (n4 < this.byteBuffer.capacity()) {
            this.reportWebRtcAudioTrackInitError("AudioTrack.getMinBufferSize returns an invalid value.");
            return -1;
        }
        if (this.audioTrack != null) {
            this.reportWebRtcAudioTrackInitError("Conflict with existing AudioTrack.");
            return -1;
        }
        try {
            final AudioTrack audioTrack = createAudioTrack(n, channelCountToConfiguration, n4);
            if ((this.audioTrack = audioTrack) != null && audioTrack.getState() == 1) {
                this.logMainParameters();
                this.logMainParametersExtended();
                return n4;
            }
            this.reportWebRtcAudioTrackInitError("Initialization of audio track failed.");
            this.releaseAudioResources();
            return -1;
        }
        catch (final IllegalArgumentException ex) {
            this.reportWebRtcAudioTrackInitError(ex.getMessage());
            this.releaseAudioResources();
            return -1;
        }
    }
    
    private void logBufferCapacityInFrames() {
        final int bufferCapacityInFrames = this.audioTrack.getBufferCapacityInFrames();
        final StringBuilder sb = new StringBuilder("AudioTrack: buffer capacity in frames: ");
        sb.append(bufferCapacityInFrames);
        Logging.a("WebRtcAudioTrack", sb.toString());
    }
    
    private void logBufferSizeInFrames() {
        final int bufferSizeInFrames = this.audioTrack.getBufferSizeInFrames();
        final StringBuilder sb = new StringBuilder("AudioTrack: buffer size in frames: ");
        sb.append(bufferSizeInFrames);
        Logging.a("WebRtcAudioTrack", sb.toString());
    }
    
    private void logMainParameters() {
        final int audioSessionId = this.audioTrack.getAudioSessionId();
        final int channelCount = this.audioTrack.getChannelCount();
        final int sampleRate = this.audioTrack.getSampleRate();
        final float maxVolume = AudioTrack.getMaxVolume();
        final StringBuilder sb = new StringBuilder("AudioTrack: session ID: ");
        sb.append(audioSessionId);
        sb.append(", channels: ");
        sb.append(channelCount);
        sb.append(", sample rate: ");
        sb.append(sampleRate);
        sb.append(", max gain: ");
        sb.append(maxVolume);
        Logging.a("WebRtcAudioTrack", sb.toString());
    }
    
    private void logMainParametersExtended() {
        this.logBufferSizeInFrames();
        this.logBufferCapacityInFrames();
    }
    
    private void logUnderrunCount() {
        final int underrunCount = this.audioTrack.getUnderrunCount();
        final StringBuilder sb = new StringBuilder("underrun count: ");
        sb.append(underrunCount);
        Logging.a("WebRtcAudioTrack", sb.toString());
    }
    
    private native void nativeCacheDirectBufferAddress(final ByteBuffer p0, final long p1);
    
    private native void nativeGetPlayoutData(final int p0, final long p1);
    
    private void releaseAudioResources() {
        Logging.a("WebRtcAudioTrack", "releaseAudioResources");
        final AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            audioTrack.release();
            this.audioTrack = null;
        }
    }
    
    private void reportWebRtcAudioTrackError(final String s) {
        Logging.b("WebRtcAudioTrack", "Run-time playback error: ".concat(String.valueOf(s)));
        WebRtcAudioUtils.logAudioState("WebRtcAudioTrack");
        final WebRtcAudioTrack$WebRtcAudioTrackErrorCallback errorCallbackOld = WebRtcAudioTrack.errorCallbackOld;
        if (errorCallbackOld != null) {
            errorCallbackOld.onWebRtcAudioTrackError(s);
        }
        final WebRtcAudioTrack$ErrorCallback errorCallback = WebRtcAudioTrack.errorCallback;
        if (errorCallback != null) {
            errorCallback.onWebRtcAudioTrackError(s);
        }
    }
    
    private void reportWebRtcAudioTrackInitError(final String s) {
        Logging.b("WebRtcAudioTrack", "Init playout error: ".concat(String.valueOf(s)));
        WebRtcAudioUtils.logAudioState("WebRtcAudioTrack");
        final WebRtcAudioTrack$WebRtcAudioTrackErrorCallback errorCallbackOld = WebRtcAudioTrack.errorCallbackOld;
        if (errorCallbackOld != null) {
            errorCallbackOld.onWebRtcAudioTrackInitError(s);
        }
        final WebRtcAudioTrack$ErrorCallback errorCallback = WebRtcAudioTrack.errorCallback;
        if (errorCallback != null) {
            errorCallback.onWebRtcAudioTrackInitError(s);
        }
    }
    
    private void reportWebRtcAudioTrackStartError(final WebRtcAudioTrack$AudioTrackStartErrorCode webRtcAudioTrack$AudioTrackStartErrorCode, final String s) {
        final String value = String.valueOf(webRtcAudioTrack$AudioTrackStartErrorCode);
        final StringBuilder sb = new StringBuilder("Start playout error: ");
        sb.append(value);
        sb.append(". ");
        sb.append(s);
        Logging.b("WebRtcAudioTrack", sb.toString());
        WebRtcAudioUtils.logAudioState("WebRtcAudioTrack");
        final WebRtcAudioTrack$WebRtcAudioTrackErrorCallback errorCallbackOld = WebRtcAudioTrack.errorCallbackOld;
        if (errorCallbackOld != null) {
            errorCallbackOld.onWebRtcAudioTrackStartError(s);
        }
        final WebRtcAudioTrack$ErrorCallback errorCallback = WebRtcAudioTrack.errorCallback;
        if (errorCallback != null) {
            errorCallback.onWebRtcAudioTrackStartError(webRtcAudioTrack$AudioTrackStartErrorCode, s);
        }
    }
    
    public static void setAudioTrackUsageAttribute(final int usageAttribute) {
        synchronized (WebRtcAudioTrack.class) {
            final StringBuilder sb = new StringBuilder("Default usage attribute is changed from: 2 to ");
            sb.append(usageAttribute);
            Logging.d("WebRtcAudioTrack", sb.toString());
            WebRtcAudioTrack.usageAttribute = usageAttribute;
        }
    }
    
    public static void setErrorCallback(final WebRtcAudioTrack$ErrorCallback errorCallback) {
        Logging.a("WebRtcAudioTrack", "Set extended error callback");
        WebRtcAudioTrack.errorCallback = errorCallback;
    }
    
    @Deprecated
    public static void setErrorCallback(final WebRtcAudioTrack$WebRtcAudioTrackErrorCallback errorCallbackOld) {
        Logging.a("WebRtcAudioTrack", "Set error callback (deprecated");
        WebRtcAudioTrack.errorCallbackOld = errorCallbackOld;
    }
    
    public static void setSpeakerMute(final boolean speakerMute) {
        final StringBuilder sb = new StringBuilder("setSpeakerMute(");
        sb.append(speakerMute);
        sb.append(")");
        Logging.d("WebRtcAudioTrack", sb.toString());
        WebRtcAudioTrack.speakerMute = speakerMute;
    }
    
    private boolean setStreamVolume(final int n) {
        this.threadChecker.a();
        final StringBuilder sb = new StringBuilder("setStreamVolume(");
        sb.append(n);
        sb.append(")");
        Logging.a("WebRtcAudioTrack", sb.toString());
        assertTrue(this.audioManager != null);
        if (this.audioManager.isVolumeFixed()) {
            Logging.b("WebRtcAudioTrack", "The device implements a fixed volume policy.");
            return false;
        }
        this.audioManager.setStreamVolume(0, n, 0);
        return true;
    }
    
    private boolean startPlayout() {
        this.threadChecker.a();
        Logging.a("WebRtcAudioTrack", "startPlayout");
        assertTrue(this.audioTrack != null);
        assertTrue(this.audioThread == null);
        try {
            this.audioTrack.play();
            if (this.audioTrack.getPlayState() != 3) {
                final WebRtcAudioTrack$AudioTrackStartErrorCode audio_TRACK_START_STATE_MISMATCH = WebRtcAudioTrack$AudioTrackStartErrorCode.AUDIO_TRACK_START_STATE_MISMATCH;
                final int playState = this.audioTrack.getPlayState();
                final StringBuilder sb = new StringBuilder("AudioTrack.play failed - incorrect state :");
                sb.append(playState);
                this.reportWebRtcAudioTrackStartError(audio_TRACK_START_STATE_MISMATCH, sb.toString());
                this.releaseAudioResources();
                return false;
            }
            (this.audioThread = new WebRtcAudioTrack$AudioTrackThread(this, "AudioTrackJavaThread")).start();
            return true;
        }
        catch (final IllegalStateException ex) {
            this.reportWebRtcAudioTrackStartError(WebRtcAudioTrack$AudioTrackStartErrorCode.AUDIO_TRACK_START_EXCEPTION, "AudioTrack.play failed: ".concat(String.valueOf(ex.getMessage())));
            this.releaseAudioResources();
            return false;
        }
    }
    
    private boolean stopPlayout() {
        this.threadChecker.a();
        Logging.a("WebRtcAudioTrack", "stopPlayout");
        assertTrue(this.audioThread != null);
        this.logUnderrunCount();
        this.audioThread.stopThread();
        Logging.a("WebRtcAudioTrack", "Stopping the AudioTrackThread...");
        this.audioThread.interrupt();
        if (!aulo.e((Thread)this.audioThread)) {
            Logging.b("WebRtcAudioTrack", "Join of AudioTrackThread timed out.");
            WebRtcAudioUtils.logAudioState("WebRtcAudioTrack");
        }
        Logging.a("WebRtcAudioTrack", "AudioTrackThread has now been stopped.");
        this.audioThread = null;
        this.releaseAudioResources();
        return true;
    }
}
