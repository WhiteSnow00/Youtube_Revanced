import org.webrtc.VideoFrame$I420Buffer;
import java.nio.ByteBuffer;
import org.webrtc.VideoFrame$Buffer;
import org.webrtc.YuvHelper;
import java.util.concurrent.TimeUnit;
import android.graphics.Matrix;
import android.opengl.GLES20;
import android.os.Bundle;
import org.webrtc.EncodedImage$FrameType;
import org.webrtc.Logging;
import org.webrtc.VideoCodecStatus;
import org.webrtc.VideoEncoder$EncodeInfo;
import org.webrtc.VideoFrame;
import com.google.webrtc.hwcodec.InternalMediaCodecVideoEncoder;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arhy implements Callable
{
    public final InternalMediaCodecVideoEncoder a;
    public final VideoFrame b;
    public final VideoEncoder$EncodeInfo c;
    
    public arhy(final InternalMediaCodecVideoEncoder a, final VideoFrame b, final VideoEncoder$EncodeInfo c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final Object call() {
        final InternalMediaCodecVideoEncoder a = this.a;
        VideoFrame b = this.b;
        final VideoEncoder$EncodeInfo c = this.c;
        a.g();
        VideoCodecStatus videoCodecStatus = null;
        if (a.C != VideoCodecStatus.d) {
            Logging.d("IMCVideoEncoder", "encodeInternal: Poll loop not OK: ".concat(String.valueOf(String.valueOf(a.C))));
            videoCodecStatus = a.C;
        }
        else {
            final long nanoTime = System.nanoTime();
            final boolean b2 = b.getBuffer() instanceof aupc;
            final long n = nanoTime - a.t;
            a.t = nanoTime;
            final boolean b3 = a.i() && b2;
            if (b3 != a.r) {
                a.g();
                final StringBuilder sb = new StringBuilder("resetCodec useSurfaceMode: ");
                sb.append(b3);
                Logging.a("IMCVideoEncoder", sb.toString());
                videoCodecStatus = a.f();
                if (videoCodecStatus == VideoCodecStatus.d) {
                    videoCodecStatus = a.e(a.p, a.q, b3);
                }
                if (videoCodecStatus != VideoCodecStatus.d) {
                    return videoCodecStatus;
                }
            }
            final long v = a.v;
            final double n2 = (double)InternalMediaCodecVideoEncoder.a;
            final double z = a.z;
            Double.isNaN(n2);
            a.v = (long)(n2 / z) + v;
            if (a.G <= 10) {
                final int f = a.F;
                final long a2 = InternalMediaCodecVideoEncoder.a(v);
                final long timestampNs = b.getTimestampNs();
                final int size = a.o.size();
                final double z2 = a.z;
                final int n3 = a.A / 1000;
                final StringBuilder sb2 = new StringBuilder("Encoder frame in # ");
                sb2.append(f);
                sb2.append(". TS: ");
                sb2.append(a2);
                sb2.append(". Frame TS: ");
                sb2.append(timestampNs);
                sb2.append(". Q: ");
                sb2.append(size);
                sb2.append(". Fps: ");
                sb2.append(z2);
                sb2.append(". Kbps: ");
                sb2.append(n3);
                Logging.a("IMCVideoEncoder", sb2.toString());
            }
            if (a.o.size() > a.c) {
                final int size2 = a.o.size();
                final StringBuilder sb3 = new StringBuilder("Dropped frame, encoder queue full: ");
                sb3.append(size2);
                Logging.d("IMCVideoEncoder", sb3.toString());
                if (++a.B < 60) {
                    videoCodecStatus = VideoCodecStatus.c;
                }
                else {
                    Logging.b("IMCVideoEncoder", "Encoder stall detected.");
                    videoCodecStatus = a.c();
                }
            }
            else {
                a.B = 0;
                final EncodedImage$FrameType[] a3 = c.a;
                final int length = a3.length;
                int i = 0;
                boolean b4 = false;
                while (i < length) {
                    b4 |= (a3[i] != EncodedImage$FrameType.b ^ true);
                    ++i;
                }
                Label_0766: {
                    if (!b4) {
                        a.g();
                        final long d = a.d;
                        if (d <= 0L || v <= a.s + d) {
                            if (n <= a.e || a.u <= 6) {
                                ++a.u;
                                break Label_0766;
                            }
                        }
                    }
                    a.g();
                    final int u = a.u;
                    final StringBuilder sb4 = new StringBuilder("Request key frame. Frames Since Last Key Frame: ");
                    sb4.append(u);
                    Logging.a("IMCVideoEncoder", sb4.toString());
                    try {
                        final Bundle bundle = new Bundle();
                        bundle.putInt("request-sync", 0);
                        a.N.Z(bundle);
                        a.s = v;
                    }
                    catch (final IllegalStateException ex) {
                        Logging.c("IMCVideoEncoder", "requestKeyFrame failed", (Throwable)ex);
                    }
                    a.u = 0;
                }
                final int p = a.p;
                final int q = a.q;
                final int width = b.getBuffer().getWidth();
                final int height = b.getBuffer().getHeight();
                if (width == p && height == q) {
                    b.retain();
                }
                else if (width * q == height * p) {
                    b = new VideoFrame(b.getBuffer().cropAndScale(0, 0, width, height, p, q), b.getRotation(), b.getTimestampNs());
                }
                else {
                    Logging.b("IMCVideoEncoder", "Received frame not matching the configured aspect ratio.");
                    b = null;
                }
                if (b == null) {
                    videoCodecStatus = VideoCodecStatus.i;
                }
                else {
                    final aunt aunt = new aunt();
                    aunt.e = b.getTimestampNs();
                    aunt.c = b.getBuffer().getWidth();
                    aunt.d = b.getBuffer().getHeight();
                    aunt.g = b.getRotation();
                    a.o.offer(new aria(aunt, nanoTime, v));
                    ++a.F;
                    final double a4 = a.K.a();
                    final long w = a.w;
                    final double n4 = (double)InternalMediaCodecVideoEncoder.a;
                    Double.isNaN(n4);
                    a.w = (long)(n4 / a4) + w;
                    Label_2025: {
                        if (a.r) {
                            a.g();
                            try {
                                GLES20.glClear(16384);
                                final VideoFrame videoFrame = new VideoFrame(b.getBuffer(), 0, b.getTimestampNs());
                                a.f.b(videoFrame, (auom)a.M, (Matrix)null, videoFrame.b(), videoFrame.a());
                                a.l.j(TimeUnit.MICROSECONDS.toNanos(w));
                                videoCodecStatus = VideoCodecStatus.d;
                            }
                            catch (final RuntimeException ex2) {
                                Logging.c("IMCVideoEncoder", "encodeTexture failed", (Throwable)ex2);
                                videoCodecStatus = a.c();
                            }
                        }
                        else {
                            final VideoFrame$Buffer buffer = b.getBuffer();
                            a.g();
                            try {
                                final int v2 = a.N.V(0L);
                                if (v2 == -1) {
                                    Logging.a("IMCVideoEncoder", "Dropped frame, no input buffers available");
                                    videoCodecStatus = VideoCodecStatus.c;
                                }
                                else {
                                    try {
                                        final ByteBuffer byteBuffer = a.N.ac()[v2];
                                        final int l = a.L;
                                        final int n5 = l - 1;
                                        if (l != 0) {
                                            if (n5 != 0) {
                                                if (n5 != 1) {
                                                    throw null;
                                                }
                                                final VideoFrame$I420Buffer i2 = buffer.toI420();
                                                final ByteBuffer dataY = i2.getDataY();
                                                final int strideY = i2.getStrideY();
                                                final ByteBuffer dataU = i2.getDataU();
                                                final int strideU = i2.getStrideU();
                                                final ByteBuffer dataV = i2.getDataV();
                                                final int strideV = i2.getStrideV();
                                                final int width2 = i2.getWidth();
                                                final int height2 = i2.getHeight();
                                                final int capacity = byteBuffer.capacity();
                                                final int n6 = width2 * height2;
                                                final int n7 = (width2 + 1) / 2;
                                                final int n8 = (height2 + 1) / 2 * n7;
                                                final int n9 = n8 + n8 + n6;
                                                if (capacity < n9) {
                                                    final int capacity2 = byteBuffer.capacity();
                                                    final StringBuilder sb5 = new StringBuilder("Expected destination buffer capacity to be at least ");
                                                    sb5.append(n9);
                                                    sb5.append(" was ");
                                                    sb5.append(capacity2);
                                                    throw new IllegalArgumentException(sb5.toString());
                                                }
                                                byteBuffer.limit(n6);
                                                byteBuffer.position(0);
                                                final ByteBuffer slice = byteBuffer.slice();
                                                byteBuffer.limit(n9);
                                                byteBuffer.position(n6);
                                                final ByteBuffer slice2 = byteBuffer.slice();
                                                if (dataY == null || dataU == null || dataV == null || slice == null || slice2 == null || width2 <= 0 || height2 <= 0) {
                                                    throw new IllegalArgumentException("Invalid I420ToNV12 input arguments");
                                                }
                                                YuvHelper.nativeI420ToNV12(dataY, strideY, dataU, strideU, dataV, strideV, slice, width2, slice2, n7 + n7, width2, height2);
                                                i2.release();
                                            }
                                            else {
                                                final VideoFrame$I420Buffer i3 = buffer.toI420();
                                                final ByteBuffer dataY2 = i3.getDataY();
                                                final int strideY2 = i3.getStrideY();
                                                final ByteBuffer dataU2 = i3.getDataU();
                                                final int strideU2 = i3.getStrideU();
                                                final ByteBuffer dataV2 = i3.getDataV();
                                                final int strideV2 = i3.getStrideV();
                                                final int width3 = i3.getWidth();
                                                final int height3 = i3.getHeight();
                                                final int n10 = width3 * height3;
                                                final int capacity3 = byteBuffer.capacity();
                                                final int n11 = (width3 + 1) / 2;
                                                final int n12 = (height3 + 1) / 2;
                                                final int n13 = n12 * n11 + n10;
                                                final int n14 = (n12 - 1) * n11 + n13 + n11;
                                                if (capacity3 < n14) {
                                                    final int capacity4 = byteBuffer.capacity();
                                                    final StringBuilder sb6 = new StringBuilder("Expected destination buffer capacity to be at least ");
                                                    sb6.append(n14);
                                                    sb6.append(" was ");
                                                    sb6.append(capacity4);
                                                    throw new IllegalArgumentException(sb6.toString());
                                                }
                                                byteBuffer.limit(n10);
                                                byteBuffer.position(0);
                                                final ByteBuffer slice3 = byteBuffer.slice();
                                                byteBuffer.limit(n13);
                                                byteBuffer.position(n10);
                                                final ByteBuffer slice4 = byteBuffer.slice();
                                                byteBuffer.limit(n14);
                                                byteBuffer.position(n13);
                                                final ByteBuffer slice5 = byteBuffer.slice();
                                                if (dataY2 == null || dataU2 == null || dataV2 == null || slice3 == null || slice4 == null || slice5 == null || width3 <= 0 || height3 <= 0) {
                                                    throw new IllegalArgumentException("Invalid I420Copy input arguments");
                                                }
                                                YuvHelper.nativeI420Copy(dataY2, strideY2, dataU2, strideU2, dataV2, strideV2, slice3, width3, slice4, n11, slice5, n11, width3, height3);
                                                i3.release();
                                            }
                                            try {
                                                a.N.af(v2, buffer.getHeight() * buffer.getWidth() * 3 / 2, w);
                                                videoCodecStatus = VideoCodecStatus.d;
                                            }
                                            catch (final IllegalStateException ex3) {
                                                Logging.c("IMCVideoEncoder", "queueInputBuffer failed", (Throwable)ex3);
                                                videoCodecStatus = a.c();
                                            }
                                            break Label_2025;
                                        }
                                        throw null;
                                    }
                                    catch (final IllegalStateException ex4) {
                                        Logging.c("IMCVideoEncoder", "getInputBuffers failed", (Throwable)ex4);
                                        videoCodecStatus = a.c();
                                    }
                                }
                            }
                            catch (final IllegalStateException ex5) {
                                Logging.c("IMCVideoEncoder", "dequeueInputBuffer failed", (Throwable)ex5);
                                videoCodecStatus = a.c();
                            }
                        }
                    }
                    b.release();
                    if (videoCodecStatus != VideoCodecStatus.d) {
                        a.o.pollLast();
                    }
                    a.g();
                    if (!a.o.isEmpty()) {
                        a.n.a(10L);
                        return videoCodecStatus;
                    }
                }
            }
        }
        return videoCodecStatus;
    }
}
