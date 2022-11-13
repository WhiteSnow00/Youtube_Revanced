// 
// Decompiled by Procyon v0.6.0
// 

package com.google.webrtc.hwcodec;

import org.webrtc.VideoEncoder$RateControlParameters;
import org.webrtc.VideoEncoder$Settings;
import org.webrtc.VideoEncoder$ScalingSettings;
import org.webrtc.VideoEncoder$ResolutionBitrateLimits;
import org.webrtc.VideoEncoder$_CC;
import org.webrtc.VideoEncoder$EncoderInfo;
import java.util.concurrent.CountDownLatch;
import org.webrtc.VideoEncoder$EncodeInfo;
import org.webrtc.VideoFrame;
import android.media.MediaCodec;
import android.media.MediaFormat;
import org.webrtc.VideoEncoder$BitrateAllocation;
import java.util.concurrent.Callable;
import org.webrtc.Logging;
import java.util.ArrayDeque;
import java.util.concurrent.TimeUnit;
import java.util.Deque;
import org.webrtc.VideoEncoder$Callback;
import java.nio.ByteBuffer;
import android.view.Surface;
import android.os.Handler;
import android.os.HandlerThread;
import org.webrtc.VideoCodecStatus;
import org.webrtc.VideoEncoder;

public class InternalMediaCodecVideoEncoder implements VideoEncoder
{
    public static final long a;
    public int A;
    public int B;
    public VideoCodecStatus C;
    public long D;
    public int E;
    public int F;
    public int G;
    public int H;
    public long I;
    public int J;
    public final areq K;
    public final int L;
    public final aula M;
    public aeea N;
    private final String O;
    private final Integer P;
    private final Integer Q;
    private final boolean R;
    private final arek S;
    private final int T;
    private final afaq U;
    private final afeq V;
    private final aumd W;
    private HandlerThread X;
    private Handler Y;
    private boolean Z;
    private Surface aa;
    private arfk ab;
    private int ac;
    private final afhd ad;
    public final arei b;
    public final int c;
    public final long d;
    public final long e;
    public final aumi f;
    public final arfe g;
    public boolean h;
    public ByteBuffer[] i;
    public VideoEncoder$Callback j;
    public boolean k;
    public auks l;
    public arer m;
    public arfk n;
    public final Deque o;
    public int p;
    public int q;
    public boolean r;
    public long s;
    public long t;
    public int u;
    public long v;
    public long w;
    public ByteBuffer x;
    public int y;
    public double z;
    
    static {
        a = TimeUnit.SECONDS.toMicros(1L);
    }
    
    public InternalMediaCodecVideoEncoder(final String o, final arei b, final Integer p13, final Integer q, final boolean r, final arek s, final areq k, final afaq u, final afhd ad, final afeq v, final byte[] array, final byte[] array2, final byte[] array3) {
        this.M = new aula();
        final aumd w = new aumd();
        this.W = w;
        this.g = new arfe();
        this.o = new ArrayDeque();
        this.x = null;
        this.C = VideoCodecStatus.d;
        this.O = o;
        this.b = b;
        this.P = p13;
        this.Q = q;
        final int intValue = q;
        final int n = 2;
        int l;
        if (intValue != 19) {
            if (intValue != 21 && intValue != 2141391872 && intValue != 2141391876) {
                final StringBuilder sb = new StringBuilder("Unsupported colorFormat: ");
                sb.append(intValue);
                throw new IllegalArgumentException(sb.toString());
            }
            l = 2;
        }
        else {
            l = 1;
        }
        this.L = l;
        this.R = r;
        this.S = s;
        this.T = s.f;
        this.d = TimeUnit.SECONDS.toMicros(s.g);
        this.e = s.h;
        int i = n;
        if ((s.b & 0x100) != 0x0) {
            i = s.i;
            if (i <= 0) {
                final StringBuilder sb2 = new StringBuilder("Wrong maxPendingFrames value: ");
                sb2.append(i);
                Logging.d("IMCVideoEncoder", sb2.toString());
                i = n;
            }
        }
        this.c = i;
        this.K = k;
        this.U = u;
        this.ad = ad;
        this.f = new arep();
        this.V = v;
        w.b();
    }
    
    public static long a(final long n) {
        return TimeUnit.MILLISECONDS.convert(n, TimeUnit.MICROSECONDS);
    }
    
    private final VideoCodecStatus j(final int n, final double n2) {
        this.W.a();
        if (this.h) {
            this.Y.post((Runnable)new arfc(this, n, n2));
        }
        return VideoCodecStatus.d;
    }
    
    protected final VideoCodecStatus b(final Callable callable, final String s) {
        return aqsx.i(this.Y, callable, s);
    }
    
    public final VideoCodecStatus c() {
        this.g();
        final int ac = this.ac + 1;
        this.ac = ac;
        final StringBuilder sb = new StringBuilder("HW error #");
        sb.append(ac);
        Logging.b("IMCVideoEncoder", sb.toString());
        VideoCodecStatus videoCodecStatus;
        if (this.ac <= 3) {
            videoCodecStatus = VideoCodecStatus.e;
        }
        else {
            videoCodecStatus = VideoCodecStatus.m;
        }
        return videoCodecStatus;
    }
    
    public final long createNativeVideoEncoder() {
        return 0L;
    }
    
    public final VideoCodecStatus d(final VideoEncoder$BitrateAllocation videoEncoder$BitrateAllocation, final int n) {
        return this.j(videoEncoder$BitrateAllocation.a(), n);
    }
    
    public final VideoCodecStatus e(final int p3, final int q, final boolean r) {
        this.g();
        this.p = p3;
        this.q = q;
        this.r = r;
        this.s = -1L;
        this.t = System.nanoTime();
        this.u = 0;
        this.v = 0L;
        this.w = 0L;
        this.m = arfh.a(this.b);
        this.B = 0;
        this.C = VideoCodecStatus.d;
        final int b = this.K.b();
        this.y = b;
        final double a = this.K.a();
        final int a2 = this.A;
        final double z = this.z;
        final long d = this.d;
        final int t = this.T;
        final long e = this.e;
        final int c = this.c;
        final String value = String.valueOf(this.V);
        final StringBuilder sb = new StringBuilder("startEncodeInternal: ");
        sb.append(p3);
        sb.append(" x ");
        sb.append(q);
        sb.append(". Target bitrate: ");
        sb.append(a2);
        sb.append(". Adjusted bitrate: ");
        sb.append(b);
        sb.append(". Target framerate: ");
        sb.append(z);
        sb.append(". Adjusted framerate: ");
        sb.append(a);
        sb.append(". useSurfaceMode: ");
        sb.append(r);
        sb.append(". forcedKeyFrameUs: ");
        sb.append(d);
        sb.append(". keyFrameIntervalSec: ");
        sb.append(t);
        sb.append(". maxFrameGapBeforeRequestingKeyFrameNs: ");
        sb.append(e);
        sb.append(". maxPendingFrames: ");
        sb.append(c);
        sb.append(". Bitrate limits: ");
        sb.append(value);
        sb.append(". videoFadeInController: null");
        Logging.a("IMCVideoEncoder", sb.toString());
        try {
            this.N = aqsx.x(this.O);
            Integer n;
            if (r) {
                n = this.P;
            }
            else {
                n = this.Q;
            }
            final int intValue = n;
            try {
                final MediaFormat videoFormat = MediaFormat.createVideoFormat(arfh.c(this.b), p3, q);
                videoFormat.setInteger("bitrate", this.y);
                videoFormat.setInteger("bitrate-mode", 2);
                videoFormat.setInteger("color-format", intValue);
                videoFormat.setInteger("i-frame-interval", this.T);
                videoFormat.setFloat("frame-rate", (float)a);
                if (this.b == arei.d && this.R) {
                    Logging.a("IMCVideoEncoder", "Using H264 HP.");
                    videoFormat.setInteger("profile", 8);
                    videoFormat.setInteger("level", 256);
                }
                final String value2 = String.valueOf(videoFormat);
                final StringBuilder sb2 = new StringBuilder("Format: ");
                sb2.append(value2);
                Logging.a("IMCVideoEncoder", sb2.toString());
                this.N.u(videoFormat, (Surface)null, 1);
                if (r) {
                    this.l = aukk.d((aukm)((afat)this.U).a, auks.d);
                    final Surface inputSurface = ((MediaCodec)this.N.a).createInputSurface();
                    this.aa = inputSurface;
                    this.l.d(inputSurface);
                    this.l.f();
                }
                this.N.q();
                this.i = this.N.t();
                this.o.clear();
                this.k = true;
                this.F = 0;
                this.G = 0;
                this.h();
                this.n.b();
                this.ab.a(3000L);
                return VideoCodecStatus.d;
            }
            catch (final Exception ex) {
                Logging.c("IMCVideoEncoder", "startEncodeInternal failed", (Throwable)ex);
                this.f();
                return VideoCodecStatus.m;
            }
        }
        catch (final Exception ex2) {
            Logging.c("IMCVideoEncoder", "Cannot create media encoder ".concat(String.valueOf(this.O)), (Throwable)ex2);
            return VideoCodecStatus.m;
        }
    }
    
    public final VideoCodecStatus encode(final VideoFrame videoFrame, final VideoEncoder$EncodeInfo videoEncoder$EncodeInfo) {
        this.W.a();
        if (!this.h) {
            return VideoCodecStatus.k;
        }
        final VideoCodecStatus b = this.b((Callable)new arfd(this, videoFrame, videoEncoder$EncodeInfo), "encoder.encode");
        final VideoCodecStatus a = VideoCodecStatus.a;
        return b;
    }
    
    public final VideoCodecStatus f() {
        this.g();
        Logging.a("IMCVideoEncoder", "stopEncodeInternal");
        this.n.b();
        this.ab.b();
        this.x = null;
        this.o.clear();
        this.g.a();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Exception[] array = { null };
        new Thread((Runnable)new arfj(this, array, countDownLatch, 1), "IMCVideoEncoder.release").start();
        try {
            final boolean await = countDownLatch.await(5000L, TimeUnit.MILLISECONDS);
            final Exception ex = array[0];
            if (ex != null) {
                Logging.c("IMCVideoEncoder", "MediaCodec release exception.", (Throwable)ex);
                return VideoCodecStatus.e;
            }
            if (!await) {
                Logging.b("IMCVideoEncoder", "MediaCodec release timed out.");
                final afhd ad = this.ad;
                if (ad != null) {
                    final wwc wwc = (wwc)ad.a;
                    wwc.F.bO("onCriticalEncodeError");
                    final wwq c = wwc.C;
                    if (c != null) {
                        c.a();
                    }
                }
                return VideoCodecStatus.e;
            }
            this.N = null;
            this.i = null;
            this.k = false;
            this.M.c();
            this.f.a();
            final auks l = this.l;
            if (l != null) {
                l.g();
                this.l = null;
            }
            final Surface aa = this.aa;
            if (aa != null) {
                aa.release();
                this.aa = null;
            }
            final arer m = this.m;
            if (m != null) {
                m.b();
                this.m = null;
            }
            Logging.a("IMCVideoEncoder", "stopEncodeInternal done");
            return VideoCodecStatus.d;
        }
        catch (final InterruptedException ex2) {
            Logging.c("IMCVideoEncoder", "Interrupted", (Throwable)ex2);
            Thread.currentThread().interrupt();
            return VideoCodecStatus.e;
        }
    }
    
    public final void g() {
        if (Thread.currentThread() == this.X) {
            return;
        }
        throw new AssertionError((Object)"Not called on the codec thread.");
    }
    
    public final VideoEncoder$EncoderInfo getEncoderInfo() {
        return VideoEncoder$_CC.$default$getEncoderInfo((VideoEncoder)this);
    }
    
    public final String getImplementationName() {
        return "IMC: ".concat(String.valueOf(this.O));
    }
    
    public VideoEncoder$ResolutionBitrateLimits[] getResolutionBitrateLimits() {
        return (VideoEncoder$ResolutionBitrateLimits[])agpc.ab((Iterable)this.V, VideoEncoder$ResolutionBitrateLimits.class);
    }
    
    public final VideoEncoder$ScalingSettings getScalingSettings() {
        if (!this.Z) {
            return VideoEncoder$ScalingSettings.a;
        }
        final arei a = arei.a;
        final int ordinal = this.b.ordinal();
        if (ordinal == 1) {
            return new VideoEncoder$ScalingSettings(27, 80);
        }
        if (ordinal == 3) {
            return new VideoEncoder$ScalingSettings(23, 33);
        }
        if (ordinal != 4) {
            return VideoEncoder$ScalingSettings.a;
        }
        return new VideoEncoder$ScalingSettings(27, 35);
    }
    
    public final void h() {
        this.D = System.currentTimeMillis();
        this.E = this.G;
        this.H = 0;
        this.I = 0L;
        this.J = 0;
    }
    
    public final boolean i() {
        final afaq u = this.U;
        return u != null && ((afat)u).a != null && this.P != null;
    }
    
    public final VideoCodecStatus initEncode(final VideoEncoder$Settings videoEncoder$Settings, final VideoEncoder$Callback videoEncoder$Callback) {
        this.W.a();
        this.Z = videoEncoder$Settings.f;
        if (this.X != null) {
            try {
                Logging.a("IMCVideoEncoder", "codecThread join");
                this.X.join();
                Logging.a("IMCVideoEncoder", "codecThread join done");
            }
            catch (final InterruptedException ex) {
                Logging.b("IMCVideoEncoder", "Interrupted while waiting for old codec to stop.");
                return VideoCodecStatus.e;
            }
        }
        (this.X = new HandlerThread("IMCVideoEncoder")).start();
        this.Y = new Handler(this.X.getLooper());
        this.n = new arfk(this.Y, (Runnable)new arfb(this));
        this.ab = new arfk(this.Y, (Runnable)new arcu(this, 9));
        final int a = videoEncoder$Settings.a;
        final int b = videoEncoder$Settings.b;
        final int c = videoEncoder$Settings.c;
        final int d = videoEncoder$Settings.d;
        final boolean i = this.i();
        final StringBuilder sb = new StringBuilder("initEncode: ");
        sb.append(a);
        sb.append(" x ");
        sb.append(b);
        sb.append(". @ ");
        sb.append(c);
        sb.append("kbps. Fps: ");
        sb.append(d);
        sb.append(". Use  surface: ");
        sb.append(i);
        Logging.a("IMCVideoEncoder", sb.toString());
        if (!this.i()) {
            Logging.b("IMCVideoEncoder", "No shared EglBase.Context. Encoders will not use texture mode.");
        }
        final VideoCodecStatus b2 = this.b((Callable)new veu(this, videoEncoder$Settings, videoEncoder$Callback, 15), "encoder.init");
        if (b2 == VideoCodecStatus.d) {
            this.h = true;
        }
        else {
            this.X.quit();
        }
        return b2;
    }
    
    public final boolean isHardwareEncoder() {
        return true;
    }
    
    public final VideoCodecStatus release() {
        this.W.a();
        Logging.a("IMCVideoEncoder", "release");
        VideoCodecStatus videoCodecStatus = VideoCodecStatus.d;
        if (this.h) {
            videoCodecStatus = this.b((Callable)new aerg(this, 7), "encoder.release");
            this.X.quit();
            this.h = false;
        }
        else {
            Logging.d("IMCVideoEncoder", "Calling release on non-initialized codec.");
        }
        this.W.b();
        Logging.a("IMCVideoEncoder", "release done");
        return videoCodecStatus;
    }
    
    public final VideoCodecStatus setRates(final VideoEncoder$RateControlParameters videoEncoder$RateControlParameters) {
        return this.j(videoEncoder$RateControlParameters.a.a(), videoEncoder$RateControlParameters.b);
    }
}
