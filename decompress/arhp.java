import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import android.os.SystemClock;
import org.webrtc.EncodedImage$FrameType;
import android.media.MediaCodec;
import java.util.Locale;
import org.webrtc.VideoCodecStatus;
import org.webrtc.Logging;
import org.webrtc.EncodedImage;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arhp implements Callable
{
    public final arht a;
    public final EncodedImage b;
    
    public arhp(final arht a, final EncodedImage b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final Object call() {
        final arht a = this.a;
        final EncodedImage b = this.b;
        a.i();
        final agpb e = a.E;
        VideoCodecStatus videoCodecStatus;
        if (e != null && a.w != null) {
            if (!a.f) {
                Logging.d("IMCVideoDecoder", "decodeInternal: Decoder is not running.");
                videoCodecStatus = VideoCodecStatus.d;
            }
            else if (a.r != VideoCodecStatus.d) {
                Logging.b("IMCVideoDecoder", "decodeInternal: Poll loop not OK: ".concat(String.valueOf(String.valueOf(a.r))));
                videoCodecStatus = a.r;
            }
            else {
                final int c = b.c;
                final int d = b.d;
                if (c * d > 0 && (c != a.j || d != a.k)) {
                    Logging.a("IMCVideoDecoder", String.format(Locale.ENGLISH, "Input resolution changed from %s x %s to %s x %s", a.j, a.k, b.c, b.d));
                    videoCodecStatus = VideoCodecStatus.d;
                    if (a.o()) {
                        if (a.d) {
                            Logging.a("IMCVideoDecoder", "Ignore resolution change - expect INFO_OUTPUT_FORMAT_CHANGED");
                        }
                        else {
                            final int c2 = b.c;
                            final int d2 = b.d;
                            a.i();
                            final StringBuilder sb = new StringBuilder("softReinitDecode: ");
                            sb.append(c2);
                            sb.append(" x ");
                            sb.append(d2);
                            Logging.a("IMCVideoDecoder", sb.toString());
                            a.f = false;
                            a.l.b();
                            try {
                                ((MediaCodec)a.E.a).flush();
                                a.j = c2;
                                a.k = d2;
                                a.k();
                                a.f = true;
                                Logging.a("IMCVideoDecoder", "softReinitDecode done.");
                                videoCodecStatus = VideoCodecStatus.d;
                            }
                            catch (final IllegalStateException ex) {
                                Logging.c("IMCVideoDecoder", "codec.flush failed", (Throwable)ex);
                                videoCodecStatus = VideoCodecStatus.m;
                            }
                        }
                    }
                    else {
                        final int c3 = b.c;
                        final int d3 = b.d;
                        a.i();
                        videoCodecStatus = a.h();
                        if (videoCodecStatus == VideoCodecStatus.d) {
                            videoCodecStatus = a.g(c3, d3);
                        }
                    }
                    if (videoCodecStatus != VideoCodecStatus.d) {
                        Logging.b("IMCVideoDecoder", "reinitDecode fails");
                        return videoCodecStatus;
                    }
                }
                if (a.m && b.f != EncodedImage$FrameType.b) {
                    Logging.b("IMCVideoDecoder", "decode() - key frame required first");
                    videoCodecStatus = VideoCodecStatus.c;
                }
                else {
                    Label_0810: {
                        if (a.n > a.o + a.c) {
                            if (a.a == arhd.d || a.a == arhd.e) {
                                final int n = a.n;
                                final int o = a.o;
                                final StringBuilder sb2 = new StringBuilder("Decoder is too far behind. Try to drain. Received: ");
                                sb2.append(n);
                                sb2.append(". Decoded: ");
                                sb2.append(o);
                                Logging.d("IMCVideoDecoder", sb2.toString());
                                a.j();
                            }
                        Label_0798:
                            while (true) {
                                while (SystemClock.elapsedRealtime() - SystemClock.elapsedRealtime() < 1000L) {
                                    VideoCodecStatus videoCodecStatus2 = a.d(0L);
                                    if (videoCodecStatus2 != VideoCodecStatus.d) {
                                        final int n2 = a.n;
                                        final int o2 = a.o;
                                        final StringBuilder sb3 = new StringBuilder("DeliverPendingOutputs error. Frames received: ");
                                        sb3.append(n2);
                                        sb3.append(". Frames decoded: ");
                                        sb3.append(o2);
                                        Logging.b("IMCVideoDecoder", sb3.toString());
                                    }
                                    else {
                                        if (a.o()) {
                                            a.m();
                                        }
                                        if (a.n > a.o + a.c) {
                                            try {
                                                Thread.sleep(10L);
                                                continue;
                                            }
                                            catch (final InterruptedException ex2) {
                                                Logging.c("IMCVideoDecoder", "Interrupted while draining decoder.", (Throwable)ex2);
                                                videoCodecStatus2 = VideoCodecStatus.e;
                                                break Label_0798;
                                            }
                                            break;
                                        }
                                        videoCodecStatus2 = VideoCodecStatus.d;
                                    }
                                    videoCodecStatus = videoCodecStatus2;
                                    if (videoCodecStatus2 == VideoCodecStatus.d) {
                                        break Label_0810;
                                    }
                                    return videoCodecStatus;
                                }
                                final int n3 = a.n;
                                final int o3 = a.o;
                                final StringBuilder sb4 = new StringBuilder("Output buffer dequeue timeout. Frames received: ");
                                sb4.append(n3);
                                sb4.append(". Frames decoded: ");
                                sb4.append(o3);
                                Logging.b("IMCVideoDecoder", sb4.toString());
                                VideoCodecStatus videoCodecStatus2 = a.f();
                                continue Label_0798;
                            }
                        }
                    }
                    int n4;
                    if ((n4 = a.a()) < 0) {
                        final int n5 = a.n;
                        final int o4 = a.o;
                        final StringBuilder sb5 = new StringBuilder("Input buffers are not available. Try to deliver output. Received: ");
                        sb5.append(n5);
                        sb5.append(". Decoded: ");
                        sb5.append(o4);
                        Logging.d("IMCVideoDecoder", sb5.toString());
                        if (a.d(arht.b(10L)) != VideoCodecStatus.d) {
                            final int n6 = a.n;
                            final int o5 = a.o;
                            final StringBuilder sb6 = new StringBuilder("DeliverPendingOutputs error. Frames received: ");
                            sb6.append(n6);
                            sb6.append(". Frames decoded: ");
                            sb6.append(o5);
                            Logging.b("IMCVideoDecoder", sb6.toString());
                            videoCodecStatus = a.f();
                            return videoCodecStatus;
                        }
                        if ((n4 = a.a()) < 0) {
                            Logging.b("IMCVideoDecoder", "decode() - no HW input buffers available");
                            videoCodecStatus = a.f();
                            return videoCodecStatus;
                        }
                    }
                    final int remaining = b.b.remaining();
                    final ByteBuffer byteBuffer = a.s[n4];
                    if (byteBuffer.capacity() < remaining) {
                        final int capacity = byteBuffer.capacity();
                        final StringBuilder sb7 = new StringBuilder("HW buffer too small. Buffer size ");
                        sb7.append(capacity);
                        sb7.append(". Frame size ");
                        sb7.append(remaining);
                        Logging.b("IMCVideoDecoder", sb7.toString());
                        videoCodecStatus = a.f();
                    }
                    else {
                        byteBuffer.rewind();
                        byteBuffer.put(b.b);
                        final long n7 = a.n;
                        final long micros = TimeUnit.SECONDS.toMicros(1L);
                        final int p = a.p;
                        final int q = a.q;
                        final long n8 = n7 * micros / 30L;
                        if (p <= q) {
                            Logging.a("IMCVideoDecoder", String.format(Locale.ENGLISH, "Decoder frame in # %s. Key: %s. TS: %s. Size: %s", a.n, b.f == EncodedImage$FrameType.b, arht.c(n8), remaining));
                        }
                        ++a.n;
                        a.z += remaining;
                        try {
                            a.E.af(n4, remaining, n8);
                            final arhm i = a.i;
                            Integer a2;
                            if (i != null) {
                                a2 = i.a(b.b).a;
                            }
                            else {
                                a2 = null;
                            }
                            a.g.offer(new arhr(SystemClock.elapsedRealtime(), b.e, b.g, a2));
                            a.m = false;
                            if (a.n > a.o) {
                                a.l.a(10L);
                            }
                            videoCodecStatus = a.d(0L);
                        }
                        catch (final IllegalStateException ex3) {
                            Logging.c("IMCVideoDecoder", "queueInputBuffer failed", (Throwable)ex3);
                            videoCodecStatus = a.f();
                        }
                    }
                }
            }
        }
        else {
            final String value = String.valueOf(e);
            final String value2 = String.valueOf(a.w);
            final StringBuilder sb8 = new StringBuilder("decode uninitialized, codec: ");
            sb8.append(value);
            sb8.append(", callback: ");
            sb8.append(value2);
            Logging.d("IMCVideoDecoder", sb8.toString());
            videoCodecStatus = VideoCodecStatus.k;
        }
        return videoCodecStatus;
    }
}
