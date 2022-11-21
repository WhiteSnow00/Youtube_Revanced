import org.webrtc.VideoFrame$I420Buffer;
import android.os.HandlerThread;
import org.webrtc.VideoDecoder$Settings;
import java.util.concurrent.CountDownLatch;
import android.os.Build$VERSION;
import java.util.concurrent.Callable;
import org.webrtc.VideoDecoder$DecodeInfo;
import org.webrtc.EncodedImage;
import android.media.MediaFormat;
import android.media.MediaCodec;
import org.webrtc.VideoFrame$Buffer;
import org.webrtc.VideoFrame;
import org.webrtc.NV12Buffer;
import org.webrtc.YuvHelper;
import org.webrtc.JavaI420Buffer;
import java.util.Locale;
import android.os.SystemClock;
import android.media.MediaCodec$BufferInfo;
import java.util.concurrent.TimeUnit;
import org.webrtc.Logging;
import java.util.ArrayDeque;
import org.webrtc.VideoDecoder$Callback;
import android.view.Surface;
import org.webrtc.VideoCodecStatus;
import java.util.Queue;
import android.os.Handler;
import java.nio.ByteBuffer;
import android.os.Looper;
import org.webrtc.VideoDecoder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arht implements VideoDecoder
{
    public long A;
    public long B;
    public final Object C;
    public int D;
    public agpb E;
    private final String F;
    private final arhe G;
    private auoz H;
    private boolean I;
    private Looper J;
    private int K;
    private int L;
    private int M;
    private arie N;
    private boolean O;
    private int P;
    private int Q;
    private ByteBuffer[] R;
    public final arhd a;
    public final afci b;
    public final int c;
    public final boolean d;
    public Handler e;
    public volatile boolean f;
    public final Queue g;
    public final Queue h;
    public arhm i;
    public int j;
    public int k;
    public arie l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public int q;
    public VideoCodecStatus r;
    public ByteBuffer[] s;
    public auot t;
    public Surface u;
    public arhs v;
    public VideoDecoder$Callback w;
    public long x;
    public int y;
    public int z;
    
    public arht(final String f, final arhd a, int ordinal, final arhe g, final afci b, final boolean d) {
        this.f = false;
        this.r = VideoCodecStatus.d;
        this.E = null;
        this.C = new Object();
        this.D = 0;
        this.F = f;
        this.a = a;
        this.K = ordinal;
        g.getClass();
        this.G = g;
        this.b = b;
        this.d = d;
        this.g = new ArrayDeque();
        this.h = new ArrayDeque();
        Label_0186: {
            if ((g.b & 0x8) != 0x0) {
                final int f2 = g.f;
                if ((ordinal = f2) > 0) {
                    break Label_0186;
                }
                final StringBuilder sb = new StringBuilder("Wrong value for maxPendingFrames: ");
                sb.append(f2);
                Logging.d("IMCVideoDecoder", sb.toString());
            }
            final arhd a2 = arhd.a;
            ordinal = a.ordinal();
            if (ordinal != 1 && ordinal != 2) {
                if (ordinal != 3) {
                    ordinal = 2;
                }
                else {
                    ordinal = 3;
                }
            }
            else {
                ordinal = 1;
            }
        }
        this.c = ordinal;
    }
    
    public static long b(final long n) {
        return TimeUnit.MICROSECONDS.convert(n, TimeUnit.MILLISECONDS);
    }
    
    public static long c(final long n) {
        return TimeUnit.MILLISECONDS.convert(n, TimeUnit.MICROSECONDS);
    }
    
    public final int a() {
        this.i();
        try {
            return this.E.V(b(500L));
        }
        catch (final IllegalStateException ex) {
            Logging.c("IMCVideoDecoder", "dequeueInputBuffer failed", (Throwable)ex);
            return -2;
        }
    }
    
    public final long createNativeVideoDecoder() {
        return 0L;
    }
    
    public final VideoCodecStatus d(long c) {
        this.i();
        if (!this.f) {
            return VideoCodecStatus.d;
        }
        if (this.n <= this.o) {
            return VideoCodecStatus.d;
        }
        final MediaCodec$BufferInfo mediaCodec$BufferInfo = new MediaCodec$BufferInfo();
        try {
            this.i();
            Label_2129: {
                int l2 = 0;
                Label_1475: {
                    int j = 0;
                    Label_1098: {
                        while (true) {
                            final int w = this.E.W(mediaCodec$BufferInfo, c);
                            if (w != -3) {
                                if (w != -2) {
                                    if (w == -1) {
                                        return VideoCodecStatus.d;
                                    }
                                    if (w < 0) {
                                        final StringBuilder sb = new StringBuilder("Unexpected dequeueOutputBuffer result: ");
                                        sb.append(w);
                                        Logging.b("IMCVideoDecoder", sb.toString());
                                        return this.f();
                                    }
                                    final arhr arhr = this.g.poll();
                                    if (arhr == null) {
                                        final int o = this.o;
                                        final StringBuilder sb2 = new StringBuilder("No frameInfo for the frame #");
                                        sb2.append(o);
                                        Logging.b("IMCVideoDecoder", sb2.toString());
                                        return this.f();
                                    }
                                    final long elapsedRealtime = SystemClock.elapsedRealtime();
                                    final long n = c = elapsedRealtime - arhr.a;
                                    if (n > 200L) {
                                        Logging.d("IMCVideoDecoder", String.format(Locale.ENGLISH, "Very high decode time: %s ms. Frames received: %s. Frames decoded %s", n, this.n, this.o));
                                        this.j();
                                        c = 200L;
                                    }
                                    this.O = true;
                                    if (this.p <= this.q) {
                                        Logging.a("IMCVideoDecoder", String.format(Locale.ENGLISH, "Decoder frame out # %s. %s x %s. TS: %s. DecTime: %s.", this.o, this.j, this.k, c(mediaCodec$BufferInfo.presentationTimeUs), c));
                                    }
                                    final int o2 = this.o + 1;
                                    this.o = o2;
                                    final int n2 = this.n;
                                    if (o2 > n2) {
                                        final StringBuilder sb3 = new StringBuilder("Number of decoder frames ");
                                        sb3.append(o2);
                                        sb3.append(" exceeds number of received frames ");
                                        sb3.append(n2);
                                        Logging.d("IMCVideoDecoder", sb3.toString());
                                        this.o = this.n;
                                    }
                                    if (this.o()) {
                                        this.i();
                                        c = c(mediaCodec$BufferInfo.presentationTimeUs);
                                        this.h.add(new arhq(this.j, this.k, w, c, elapsedRealtime, arhr));
                                        this.v.b();
                                        final boolean m = this.m();
                                        if (this.h.size() > 0 && this.h.size() >= Math.min(3, this.R.length) && !m) {
                                            final arhq arhq = this.h.remove();
                                            ++this.P;
                                            ++this.p;
                                            Logging.d("IMCVideoDecoder", String.format(Locale.ENGLISH, "Too many output non rendered buffers: %s. Dropping decoded frame with TS: %s. Total number of dropped frames: %s.", this.h.size() + 1, arhq.d, this.P));
                                            this.j();
                                            if (!this.n(arhq.c, false)) {
                                                return this.f();
                                            }
                                        }
                                        return VideoCodecStatus.d;
                                    }
                                    if (mediaCodec$BufferInfo.size < this.j * this.k * 3 / 2) {
                                        final int size = mediaCodec$BufferInfo.size;
                                        final StringBuilder sb4 = new StringBuilder("Insufficient output buffer size: ");
                                        sb4.append(size);
                                        Logging.b("IMCVideoDecoder", sb4.toString());
                                        final Object o3 = VideoCodecStatus.e;
                                        return (VideoCodecStatus)o3;
                                    }
                                    final int size2 = mediaCodec$BufferInfo.size;
                                    final int l = this.L;
                                    final int k = this.k;
                                    if (size2 < l * k * 3 / 2 && this.M == k && l > this.j) {
                                        final int size3 = mediaCodec$BufferInfo.size;
                                        this.L = (size3 + size3) / (this.k * 3);
                                    }
                                    final ByteBuffer byteBuffer = this.R[w];
                                    byteBuffer.position(mediaCodec$BufferInfo.offset);
                                    byteBuffer.limit(mediaCodec$BufferInfo.offset + mediaCodec$BufferInfo.size);
                                    final ByteBuffer slice = byteBuffer.slice();
                                    Label_1583: {
                                        if (this.K == 19) {
                                            final int i = this.M;
                                            final int n3 = i % 2;
                                            if (n3 == 0) {
                                                j = this.L;
                                                final int j2 = this.j;
                                                final int k2 = this.k;
                                                if (j % 2 != 0) {
                                                    break Label_1098;
                                                }
                                                if (n3 == 0) {
                                                    final int n4 = (k2 + 1) / 2;
                                                    final int n5 = j / 2;
                                                    final int n6 = j * i;
                                                    final int n7 = i * n5 / 2;
                                                    Object o3 = this.C;
                                                    synchronized (o3) {
                                                        ++this.D;
                                                        monitorexit(o3);
                                                        final int n8 = n4 * n5;
                                                        final int n9 = n7 + n6;
                                                        final zuo zuo = new zuo(this, w, 14);
                                                        slice.limit(j * k2);
                                                        slice.position(0);
                                                        o3 = slice.slice();
                                                        slice.limit(n6 + n8);
                                                        slice.position(n6);
                                                        final ByteBuffer slice2 = slice.slice();
                                                        slice.limit(n8 + n9);
                                                        slice.position(n9);
                                                        o3 = JavaI420Buffer.b(j2, k2, (ByteBuffer)o3, j, slice2, n5, slice.slice(), n5, (Runnable)zuo);
                                                        break Label_1583;
                                                    }
                                                    break;
                                                }
                                                break;
                                            }
                                            else {
                                                l2 = this.L;
                                                final int j3 = this.j;
                                                final int k3 = this.k;
                                                if (l2 % 2 == 0) {
                                                    final int n10 = (j3 + 1) / 2;
                                                    int n11;
                                                    if (n3 == 0) {
                                                        n11 = (k3 + 1) / 2;
                                                    }
                                                    else {
                                                        n11 = k3 / 2;
                                                    }
                                                    final int n12 = l2 / 2;
                                                    final int n13 = l2 * i;
                                                    final int n14 = i * n12 / 2;
                                                    final Object o3 = JavaI420Buffer.a(j3, k3);
                                                    slice.limit(l2 * k3);
                                                    slice.position(0);
                                                    YuvHelper.nativeCopyPlane(slice.slice(), l2, ((VideoFrame$I420Buffer)o3).getDataY(), ((JavaI420Buffer)o3).a, j3, k3);
                                                    final int n15 = n12 * n11;
                                                    slice.limit(n13 + n15);
                                                    slice.position(n13);
                                                    YuvHelper.nativeCopyPlane(slice.slice(), n12, ((VideoFrame$I420Buffer)o3).getDataU(), ((JavaI420Buffer)o3).b, n10, n11);
                                                    if (n3 == 1) {
                                                        slice.position((n11 - 1) * n12 + n13);
                                                        final ByteBuffer dataU = ((VideoFrame$I420Buffer)o3).getDataU();
                                                        dataU.position(((JavaI420Buffer)o3).b * n11);
                                                        dataU.put(slice);
                                                    }
                                                    final int n16 = n13 + n14;
                                                    slice.limit(n15 + n16);
                                                    slice.position(n16);
                                                    YuvHelper.nativeCopyPlane(slice.slice(), n12, ((VideoFrame$I420Buffer)o3).getDataV(), ((JavaI420Buffer)o3).c, n10, n11);
                                                    if (n3 == 1) {
                                                        slice.position(n16 + n12 * (n11 - 1));
                                                        final ByteBuffer dataV = ((VideoFrame$I420Buffer)o3).getDataV();
                                                        dataV.position(((JavaI420Buffer)o3).c * n11);
                                                        dataV.put(slice);
                                                    }
                                                    this.E.Y(w, false);
                                                    break Label_1583;
                                                }
                                                break Label_1475;
                                            }
                                        }
                                        final int l3 = this.L;
                                        final int m2 = this.M;
                                        final int j4 = this.j;
                                        final int k4 = this.k;
                                        Object o3 = this.C;
                                        synchronized (o3) {
                                            ++this.D;
                                            monitorexit(o3);
                                            o3 = new NV12Buffer(j4, k4, l3, m2, slice, (Runnable)new zuo(this, w, 13));
                                            o3 = new VideoFrame((VideoFrame$Buffer)o3, arhr.c, arhr.b);
                                            ++this.p;
                                            this.A += c;
                                            this.B += SystemClock.elapsedRealtime() - arhr.a;
                                            this.w.a((VideoFrame)o3, Integer.valueOf((int)c), arhr.d);
                                            ((VideoFrame)o3).release();
                                            o3 = VideoCodecStatus.d;
                                            return (VideoCodecStatus)o3;
                                        }
                                    }
                                }
                                final MediaFormat outputFormat = ((MediaCodec)this.E.a).getOutputFormat();
                                Logging.a("IMCVideoDecoder", "Decoder format changed: ".concat(String.valueOf(outputFormat.toString())));
                                this.i();
                                int n17 = 0;
                                int n18 = 0;
                                Label_1842: {
                                    if (outputFormat.containsKey("crop-left") && outputFormat.containsKey("crop-right") && outputFormat.containsKey("crop-bottom") && outputFormat.containsKey("crop-top")) {
                                        final int integer = outputFormat.getInteger("crop-right");
                                        final int integer2 = outputFormat.getInteger("crop-left");
                                        final int integer3 = outputFormat.getInteger("crop-bottom");
                                        final int integer4 = outputFormat.getInteger("crop-top");
                                        if (integer > integer2 && integer3 > integer4) {
                                            n17 = integer3 + 1 - integer4;
                                            n18 = integer + 1 - integer2;
                                            break Label_1842;
                                        }
                                    }
                                    n18 = 0;
                                    n17 = 0;
                                }
                                int integer5 = 0;
                                int integer6 = 0;
                                Label_1878: {
                                    if (n18 != 0) {
                                        integer5 = n18;
                                        if ((integer6 = n17) != 0) {
                                            break Label_1878;
                                        }
                                    }
                                    integer5 = outputFormat.getInteger("width");
                                    integer6 = outputFormat.getInteger("height");
                                }
                                if (integer5 != 0 && integer6 != 0) {
                                    final int j5 = this.j;
                                    if (j5 != integer5 || this.k != integer6) {
                                        final int k5 = this.k;
                                        final StringBuilder sb5 = new StringBuilder();
                                        sb5.append("Decoder size change. Configured ");
                                        sb5.append(j5);
                                        sb5.append(" x ");
                                        sb5.append(k5);
                                        sb5.append(". New ");
                                        sb5.append(integer5);
                                        sb5.append(" x ");
                                        sb5.append(integer6);
                                        Logging.a("IMCVideoDecoder", sb5.toString());
                                    }
                                    this.j = integer5;
                                    this.k = integer6;
                                }
                                else {
                                    Logging.b("IMCVideoDecoder", "Invalid size in output format: ".concat(String.valueOf(String.valueOf(outputFormat))));
                                }
                                Label_2178: {
                                    if (!this.o() && outputFormat.containsKey("color-format")) {
                                        final int integer7 = outputFormat.getInteger("color-format");
                                        this.K = integer7;
                                        Logging.a("IMCVideoDecoder", "Color: 0x".concat(String.valueOf(Integer.toHexString(integer7))));
                                        final int k6 = this.K;
                                        final int[] b = aric.b;
                                        final int length = b.length;
                                        for (int n19 = 0; n19 < 7; ++n19) {
                                            if (b[n19] == k6) {
                                                break Label_2178;
                                            }
                                        }
                                        break Label_2129;
                                    }
                                }
                                if (outputFormat.containsKey("stride")) {
                                    this.L = outputFormat.getInteger("stride");
                                }
                                if (outputFormat.containsKey("slice-height")) {
                                    this.M = outputFormat.getInteger("slice-height");
                                }
                                Logging.a("IMCVideoDecoder", String.format(Locale.ENGLISH, "Frame dimension: %s x %s. Stride and slice height: %s x %s", this.j, this.k, this.L, this.M));
                                this.L = Math.max(this.j, this.L);
                                this.M = Math.max(this.k, this.M);
                            }
                            else {
                                final ByteBuffer[] ad = this.E.ad();
                                this.R = ad;
                                final int length2 = ad.length;
                                final StringBuilder sb6 = new StringBuilder();
                                sb6.append("Decoder output buffers changed: ");
                                sb6.append(length2);
                                Logging.a("IMCVideoDecoder", sb6.toString());
                                if (!this.O) {
                                    continue;
                                }
                                Logging.d("IMCVideoDecoder", "Unexpected output buffer change event.");
                            }
                        }
                        final StringBuilder sb7 = new StringBuilder("Slice height is not divisible by two: ");
                        sb7.append(j);
                        throw new AssertionError((Object)sb7.toString());
                    }
                    final StringBuilder sb8 = new StringBuilder("Stride is not divisible by two: ");
                    sb8.append(j);
                    throw new AssertionError((Object)sb8.toString());
                }
                final StringBuilder sb9 = new StringBuilder("Stride is not divisible by two: ");
                sb9.append(l2);
                throw new AssertionError((Object)sb9.toString());
            }
            final int k7 = this.K;
            final StringBuilder sb10 = new StringBuilder();
            sb10.append("Non supported color format: ");
            sb10.append(k7);
            throw new IllegalStateException(sb10.toString());
        }
        catch (final IllegalStateException ex) {
            Logging.c("IMCVideoDecoder", "dequeueOutputBuffer failed", (Throwable)ex);
            return this.f();
        }
    }
    
    public final VideoCodecStatus decode(final EncodedImage encodedImage, final VideoDecoder$DecodeInfo videoDecoder$DecodeInfo) {
        this.H.a();
        final ByteBuffer b = encodedImage.b;
        if (b == null) {
            Logging.b("IMCVideoDecoder", "decode() - no input data");
            return VideoCodecStatus.h;
        }
        if (b.remaining() == 0) {
            Logging.b("IMCVideoDecoder", "decode() - input buffer empty");
            return VideoCodecStatus.h;
        }
        if (!this.I) {
            Logging.b("IMCVideoDecoder", "decode() - not initialized");
            return VideoCodecStatus.k;
        }
        final VideoCodecStatus e = this.e(new arhp(this, encodedImage), "decoder.decode");
        final VideoCodecStatus a = VideoCodecStatus.a;
        return e;
    }
    
    protected final VideoCodecStatus e(final Callable callable, final String s) {
        return aqvr.l(this.e, callable, s);
    }
    
    public final VideoCodecStatus f() {
        this.i();
        final int q = this.Q + 1;
        this.Q = q;
        final StringBuilder sb = new StringBuilder("HW error #");
        sb.append(q);
        Logging.b("IMCVideoDecoder", sb.toString());
        VideoCodecStatus videoCodecStatus;
        if (this.Q <= 3) {
            videoCodecStatus = VideoCodecStatus.e;
        }
        else {
            videoCodecStatus = VideoCodecStatus.m;
        }
        return videoCodecStatus;
    }
    
    public final VideoCodecStatus g(int length, int length2) {
        final StringBuilder sb = new StringBuilder("startDecodeInternal ");
        sb.append(length);
        sb.append("x");
        sb.append(length2);
        Logging.a("IMCVideoDecoder", sb.toString());
        this.i();
        this.j = length;
        this.k = length2;
        this.k();
        try {
            final agpb z = aqvr.z(this.F);
            this.E = z;
            if (z == null) {
                Logging.b("IMCVideoDecoder", "Can not create media decoder");
                return VideoCodecStatus.m;
            }
            final String c = aric.c(this.a);
            boolean b = false;
            Label_0177: {
                if (this.G.e) {
                    final agpb e = this.E;
                    if (Build$VERSION.SDK_INT >= 30) {
                        try {
                            if (((MediaCodec)e.a).getCodecInfo().getCapabilitiesForType(c).isFeatureSupported("low-latency")) {
                                b = true;
                                break Label_0177;
                            }
                        }
                        catch (final RuntimeException ex) {
                            Logging.e("IMCVideoDecoder", "Failed to query FEATURE_LowLatency support", (Throwable)ex);
                        }
                    }
                }
                b = false;
            }
            final StringBuilder sb2 = new StringBuilder("lowLatency: ");
            sb2.append(b);
            Logging.a("IMCVideoDecoder", sb2.toString());
            try {
                final MediaFormat videoFormat = MediaFormat.createVideoFormat(c, length, length2);
                if (!this.o()) {
                    videoFormat.setInteger("color-format", this.K);
                }
                if (b) {
                    videoFormat.setInteger("low-latency", 1);
                }
                this.E.ae(videoFormat, this.u, 0);
                this.E.aa();
                this.R = this.E.ad();
                final ByteBuffer[] ac = this.E.ac();
                this.s = ac;
                length = ac.length;
                length2 = this.R.length;
                final StringBuilder sb3 = new StringBuilder("Input buffers: ");
                sb3.append(length);
                sb3.append(". Output buffers: ");
                sb3.append(length2);
                Logging.a("IMCVideoDecoder", sb3.toString());
                this.f = true;
                this.l.b();
                this.N.a(3000L);
                Logging.a("IMCVideoDecoder", "startDecodeInternal done");
                return VideoCodecStatus.d;
            }
            catch (final Exception ex2) {
                Logging.c("IMCVideoDecoder", "initDecode failed", (Throwable)ex2);
                this.h();
                return VideoCodecStatus.m;
            }
        }
        catch (final Exception ex3) {
            Logging.c("IMCVideoDecoder", "Cannot create media decoder ".concat(String.valueOf(this.F)), (Throwable)ex3);
            return VideoCodecStatus.m;
        }
    }
    
    public final String getImplementationName() {
        return "IMC: ".concat(String.valueOf(this.F));
    }
    
    public final VideoCodecStatus h() {
        this.i();
        if (!this.f) {
            Logging.a("IMCVideoDecoder", "stopDecodeInternal: Decoder is not running.");
            return VideoCodecStatus.d;
        }
        Logging.a("IMCVideoDecoder", String.format(Locale.ENGLISH, "stopDecodeInternal. Frames received: %s. Frames decoded: %s. Frames delivered: %s. Decoded frames dropped: %s", this.n, this.o, this.p, this.P));
        VideoCodecStatus videoCodecStatus = VideoCodecStatus.d;
        this.f = false;
        this.l.b();
        this.N.b();
        this.i();
        Object c = this.C;
        monitorenter(c);
        try {
        Label_0159:
            while (true) {
                while (this.D > 0) {
                    Logging.a("IMCVideoDecoder", "Waiting for all frames to be released.");
                    try {
                        this.C.wait();
                        continue;
                    }
                    catch (final InterruptedException ex) {
                        Logging.c("IMCVideoDecoder", "Interrupted while waiting for output buffers to be released.", (Throwable)ex);
                        monitorexit(c);
                        break Label_0159;
                    }
                    break;
                    final CountDownLatch countDownLatch = new CountDownLatch(1);
                    c = new Exception[] { null };
                    new Thread(new aegq(this, (Exception[])c, countDownLatch, 18), "IMCVideoDecoder.release").start();
                    try {
                        if (!countDownLatch.await(5000L, TimeUnit.MILLISECONDS)) {
                            Logging.b("IMCVideoDecoder", "Media decoder release timeout");
                            videoCodecStatus = VideoCodecStatus.e;
                        }
                        c = c[0];
                        if (c != null) {
                            Logging.c("IMCVideoDecoder", "Media encoder release error", (Throwable)c);
                            videoCodecStatus = VideoCodecStatus.e;
                        }
                        if (this.o()) {
                            this.v.a();
                        }
                        this.g.clear();
                        this.h.clear();
                        this.E = null;
                        Logging.a("IMCVideoDecoder", "stopDecodeInternal done");
                        return videoCodecStatus;
                    }
                    catch (final InterruptedException ex2) {
                        Logging.c("IMCVideoDecoder", "Interrupted", (Throwable)ex2);
                        Thread.currentThread().interrupt();
                        return VideoCodecStatus.e;
                    }
                }
                monitorexit(c);
                continue Label_0159;
            }
        }
        finally {
            monitorexit(c);
            while (true) {}
        }
    }
    
    public final void i() {
        if (this.J.isCurrentThread()) {
            return;
        }
        throw new AssertionError((Object)"Not called on the codec thread.");
    }
    
    public final VideoCodecStatus initDecode(final VideoDecoder$Settings videoDecoder$Settings, final VideoDecoder$Callback videoDecoder$Callback) {
        this.H = new auoz();
        Logging.a("IMCVideoDecoder", String.format(Locale.ENGLISH, "initDecode: %s: %s x %s. Color: 0x%X. Use surface: %s. Max pending frames: %s.", this.a, videoDecoder$Settings.a, videoDecoder$Settings.b, this.K, this.o(), this.c));
        if (this.I) {
            Logging.b("IMCVideoDecoder", "initDecode called without releasing previous decoder");
            return VideoCodecStatus.e;
        }
        if (!this.o()) {
            Logging.b("IMCVideoDecoder", "No shared EglBase.Context. Decoders will not use texture mode.");
            if (this.K == 0) {
                Logging.b("IMCVideoDecoder", "Color format is not recognized. Only surface decoding is supported.");
                return VideoCodecStatus.e;
            }
        }
        if (this.J != null) {
            try {
                Logging.a("IMCVideoDecoder", "codecThread join");
                this.J.getThread().join();
                Logging.a("IMCVideoDecoder", "codecThread join done");
            }
            catch (final InterruptedException ex) {
                Logging.b("IMCVideoDecoder", "Interrupted while waiting for old codec to stop.");
                return VideoCodecStatus.e;
            }
        }
        final HandlerThread handlerThread = new HandlerThread("IMCVideoDecoder");
        handlerThread.start();
        this.J = handlerThread.getLooper();
        this.e = new Handler(this.J);
        this.l = new arie(this.e, new arfq(this, 7));
        this.N = new arie(this.e, new arfq(this, 8));
        final VideoCodecStatus e = this.e((Callable)new wya(this, videoDecoder$Settings, videoDecoder$Callback, 13), "decoder.init");
        if (e == VideoCodecStatus.d) {
            this.I = true;
        }
        else {
            this.J.quit();
        }
        Logging.a("IMCVideoDecoder", "initDecode done: ".concat(String.valueOf(String.valueOf(e))));
        return e;
    }
    
    public final void j() {
        this.q = Math.max(this.p + 1, 15);
    }
    
    public final void k() {
        this.L = this.j;
        this.M = this.k;
        this.O = false;
        this.m = true;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.P = 0;
        this.q = 15;
        this.g.clear();
        this.h.clear();
        if (this.o()) {
            this.v.a();
        }
        this.r = VideoCodecStatus.d;
        this.l();
    }
    
    public final void l() {
        this.x = SystemClock.elapsedRealtime();
        this.y = this.p;
        this.z = 0;
        this.A = 0L;
        this.B = 0L;
    }
    
    public final boolean m() {
        this.i();
        if (!this.f) {
            return false;
        }
        final arhs v = this.v;
        Object o = v.a;
        synchronized (o) {
            final int e = v.e;
            aevn aevn = null;
            if (e == 3) {
                v.e = 1;
                final VideoFrame c = v.c;
                v.c = null;
                aevn = new(aevn.class)();
                final arhq b = v.b;
                new aevn(c, (int)Math.min(200L, b.e - b.f.a), v.b.f);
                monitorexit(o);
            }
            else {
                monitorexit(o);
            }
            if (aevn != null) {
                ++this.p;
                this.A += aevn.a;
                this.B += SystemClock.elapsedRealtime() - ((arhr)aevn.c).a;
                final VideoDecoder$Callback w = this.w;
                o = aevn.b;
                w.a((VideoFrame)o, Integer.valueOf(aevn.a), ((arhr)aevn.c).d);
                ((VideoFrame)aevn.b).release();
                if (this.h.size() > 0) {
                    return this.v.b();
                }
            }
            return false;
        }
    }
    
    public final boolean n(final int n, final boolean b) {
        try {
            this.E.Y(n, b);
            return true;
        }
        catch (final IllegalStateException ex) {
            Logging.c("IMCVideoDecoder", "releaseOutputBuffer failed", (Throwable)ex);
            return false;
        }
    }
    
    public final boolean o() {
        return ((afcl)this.b).a != null;
    }
    
    public final VideoCodecStatus release() {
        Logging.a("IMCVideoDecoder", "release");
        if (!this.I) {
            Logging.d("IMCVideoDecoder", "Calling release for non initialized codec");
            return VideoCodecStatus.d;
        }
        final VideoCodecStatus e = this.e((Callable)new aenb(this, 10), "decoder.release");
        this.J.quit();
        this.I = false;
        Logging.a("IMCVideoDecoder", "release done");
        return e;
    }
}
