import java.util.concurrent.TimeUnit;
import org.webrtc.EncodedImage;
import org.webrtc.EncodedImage$FrameType;
import android.os.Bundle;
import org.webrtc.Logging;
import java.nio.ByteBuffer;
import android.media.MediaCodec$BufferInfo;
import com.google.webrtc.hwcodec.InternalMediaCodecVideoEncoder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arhw implements Runnable
{
    public final InternalMediaCodecVideoEncoder a;
    
    public arhw(final InternalMediaCodecVideoEncoder a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        final InternalMediaCodecVideoEncoder a = this.a;
        a.g();
        if (a.h) {
            while (true) {
                a.g();
                try {
                    final MediaCodec$BufferInfo mediaCodec$BufferInfo = new MediaCodec$BufferInfo();
                    final int w = a.N.W(mediaCodec$BufferInfo, 0L);
                    if (w < 0) {
                        if (w == -3) {
                            a.g.a();
                            a.i = a.N.ad();
                        }
                    }
                    else {
                        final ByteBuffer byteBuffer = a.i[w];
                        byteBuffer.position(mediaCodec$BufferInfo.offset);
                        byteBuffer.limit(mediaCodec$BufferInfo.offset + mediaCodec$BufferInfo.size);
                        final int flags = mediaCodec$BufferInfo.flags;
                        int i = 0;
                        if ((flags & 0x2) != 0x0) {
                            (a.x = ByteBuffer.allocateDirect(mediaCodec$BufferInfo.size)).put(byteBuffer);
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Config frame generated. Offset: ");
                            sb.append(mediaCodec$BufferInfo.offset);
                            sb.append(". Size: ");
                            sb.append(mediaCodec$BufferInfo.size);
                            sb.append(". Data: ");
                            while (i < Math.min(mediaCodec$BufferInfo.size, 8)) {
                                sb.append(Integer.toHexString(a.x.get(i) & 0xFF));
                                sb.append(" ");
                                ++i;
                            }
                            Logging.a("IMCVideoEncoder", sb.toString());
                            continue;
                        }
                        a.K.c(mediaCodec$BufferInfo.size);
                        a.g();
                        final int b = a.K.b();
                        if (b != a.y) {
                            a.g();
                            try {
                                final Bundle bundle = new Bundle();
                                bundle.putInt("video-bitrate", b);
                                a.N.Z(bundle);
                            }
                            catch (final IllegalStateException ex) {
                                Logging.c("IMCVideoEncoder", "updateBitrate failed", (Throwable)ex);
                            }
                            a.y = b;
                        }
                        final int n = mediaCodec$BufferInfo.flags & 0x1;
                        if (n != 0) {
                            Logging.a("IMCVideoEncoder", "Sync frame generated");
                        }
                        Label_0620: {
                            if (n != 0 && (a.b == arhd.d || a.b == arhd.e)) {
                                final int capacity = a.x.capacity();
                                final int offset = mediaCodec$BufferInfo.offset;
                                final int size = mediaCodec$BufferInfo.size;
                                final StringBuilder sb2 = new StringBuilder();
                                sb2.append("Prepending config frame of size ");
                                sb2.append(capacity);
                                sb2.append(" to output buffer with offset ");
                                sb2.append(offset);
                                sb2.append(", size ");
                                sb2.append(size);
                                Logging.a("IMCVideoEncoder", sb2.toString());
                                final ByteBuffer a2 = ByteBuffer.allocateDirect(mediaCodec$BufferInfo.size + a.x.capacity());
                                a.x.rewind();
                                a2.put(a.x);
                                a2.put(byteBuffer);
                                a2.flip();
                                a.N.Y(w, false);
                                final Object b2 = null;
                                break Label_0620;
                            }
                            final ByteBuffer a2 = byteBuffer.slice();
                            final arhz g = a.g;
                            Object b2 = g.a;
                            synchronized (b2) {
                                ++g.b;
                                monitorexit(b2);
                                b2 = new zuo(a, w, 15);
                                EncodedImage$FrameType f;
                                if (n != 0) {
                                    f = EncodedImage$FrameType.b;
                                }
                                else {
                                    f = EncodedImage$FrameType.c;
                                }
                                final aria aria = a.o.poll();
                                final Object c = aria.c;
                                ((aunt)c).a = a2;
                                ((aunt)c).b = (Runnable)b2;
                                ((aunt)c).f = f;
                                b2 = a.m;
                                if (b2 != null) {
                                    final Integer a3 = ((arhm)b2).a(a2).a;
                                    if ((((aunt)c).h = a3) != null) {
                                        a.J += a3;
                                    }
                                }
                                ++a.G;
                                a.H += mediaCodec$BufferInfo.size;
                                final long n2 = System.nanoTime() - aria.a;
                                a.I += n2;
                                final EncodedImage encodedImage = new EncodedImage(((aunt)c).a, ((aunt)c).b, ((aunt)c).c, ((aunt)c).d, ((aunt)c).e, ((aunt)c).f, ((aunt)c).g, ((aunt)c).h);
                                a.j.a(encodedImage);
                                encodedImage.a.release();
                                final int g2 = a.G;
                                if (g2 <= 10) {
                                    final int size2 = mediaCodec$BufferInfo.size;
                                    final long a4 = InternalMediaCodecVideoEncoder.a(aria.b);
                                    final long e = encodedImage.e;
                                    final long convert = TimeUnit.MILLISECONDS.convert(n2, TimeUnit.NANOSECONDS);
                                    final StringBuilder sb3 = new StringBuilder();
                                    sb3.append("Encoder frame out # ");
                                    sb3.append(g2 - 1);
                                    sb3.append(". Key: ");
                                    boolean b3 = true;
                                    if (n == 0) {
                                        b3 = false;
                                    }
                                    sb3.append(b3);
                                    sb3.append(". Size: ");
                                    sb3.append(size2);
                                    sb3.append(". TS: ");
                                    sb3.append(a4);
                                    sb3.append(". Frame TS: ");
                                    sb3.append(e);
                                    sb3.append(". Enc time: ");
                                    sb3.append(convert);
                                    Logging.a("IMCVideoEncoder", sb3.toString());
                                }
                            }
                        }
                    }
                }
                catch (final IllegalStateException ex2) {
                    Logging.c("IMCVideoEncoder", "deliverOutput failed", (Throwable)ex2);
                    a.C = a.c();
                    a.n.b();
                }
                break;
            }
            a.g();
            if (a.o.isEmpty()) {
                a.n.a(100L);
            }
        }
    }
}
