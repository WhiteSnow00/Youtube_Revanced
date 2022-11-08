import android.media.MediaCodec$CryptoInfo$Pattern;
import android.media.MediaCodec$CryptoInfo;
import android.os.Bundle;
import android.view.Surface;
import android.os.Handler;
import java.nio.ByteBuffer;
import android.media.MediaFormat;
import android.media.MediaCodec$BufferInfo;
import android.os.HandlerThread;
import android.media.MediaCodec;

// 
// Decompiled by Procyon v0.6.0
// 

final class bln implements blv
{
    public final MediaCodec a;
    public final blq b;
    public final blp c;
    public int d;
    private boolean e;
    
    public bln(final MediaCodec a, final HandlerThread handlerThread, final HandlerThread handlerThread2) {
        this.a = a;
        this.b = new blq(handlerThread);
        this.c = new blp(a, handlerThread2);
        this.d = 0;
    }
    
    public static String d(final int n, final String s) {
        final StringBuilder sb = new StringBuilder(s);
        if (n == 1) {
            sb.append("Audio");
        }
        else if (n == 2) {
            sb.append("Video");
        }
        else {
            sb.append("Unknown(");
            sb.append(n);
            sb.append(")");
        }
        return sb.toString();
    }
    
    public final int a() {
        final blq b = this.b;
        synchronized (b.a) {
            final boolean c = b.c();
            int c2 = -1;
            if (c) {
                monitorexit(b.a);
            }
            else {
                b.b();
                if (!b.j.f()) {
                    c2 = b.j.c();
                }
            }
            return c2;
        }
    }
    
    public final int b(final MediaCodec$BufferInfo mediaCodec$BufferInfo) {
        final blq b = this.b;
        synchronized (b.a) {
            final boolean c = b.c();
            int c2 = -1;
            if (c) {
                monitorexit(b.a);
            }
            else {
                b.b();
                if (b.k.f()) {
                    monitorexit(b.a);
                }
                else {
                    c2 = b.k.c();
                    if (c2 >= 0) {
                        dk.e((Object)b.f);
                        final MediaCodec$BufferInfo mediaCodec$BufferInfo2 = b.d.remove();
                        mediaCodec$BufferInfo.set(mediaCodec$BufferInfo2.offset, mediaCodec$BufferInfo2.size, mediaCodec$BufferInfo2.presentationTimeUs, mediaCodec$BufferInfo2.flags);
                    }
                    else if (c2 == -2) {
                        b.f = (MediaFormat)b.e.remove();
                        c2 = -2;
                    }
                }
            }
            return c2;
        }
    }
    
    public final MediaFormat c() {
        final blq b = this.b;
        synchronized (b.a) {
            final MediaFormat f = b.f;
            if (f != null) {
                return f;
            }
            throw new IllegalStateException();
        }
    }
    
    public final ByteBuffer e(final int n) {
        return this.a.getInputBuffer(n);
    }
    
    public final ByteBuffer f(final int n) {
        return this.a.getOutputBuffer(n);
    }
    
    public final void g() {
        this.c.a();
        this.a.flush();
        final blq b = this.b;
        synchronized (b.a) {
            ++b.g;
            final Handler c = b.c;
            final int a = baw.a;
            c.post((Runnable)new aur(b, 11));
            monitorexit(b.a);
            this.a.start();
        }
    }
    
    public final void h() {
        try {
            if (this.d == 1) {
                final blp c = this.c;
                if (c.g) {
                    c.a();
                    c.d.quit();
                }
                c.g = false;
                final blq b = this.b;
                synchronized (b.a) {
                    b.h = true;
                    b.b.quit();
                    b.a();
                }
            }
            this.d = 2;
        }
        finally {
            if (!this.e) {
                this.a.release();
                this.e = true;
            }
        }
    }
    
    public final void i(final int n, final long n2) {
        this.a.releaseOutputBuffer(n, n2);
    }
    
    public final void j(final Surface outputSurface) {
        this.a.setOutputSurface(outputSurface);
    }
    
    public final void k(final Bundle parameters) {
        this.a.setParameters(parameters);
    }
    
    public final void l(final int videoScalingMode) {
        this.a.setVideoScalingMode(videoScalingMode);
    }
    
    public final boolean m() {
        return false;
    }
    
    public final void n(int a, final int n, final long n2, final int n3) {
        final blp c = this.c;
        c.b();
        final lua e = blp.e();
        e.b(a, n, n2, n3);
        final Handler e2 = c.e;
        a = baw.a;
        e2.obtainMessage(0, (Object)e).sendToTarget();
    }
    
    public final void o(int numSubSamples, final bcx bcx, final long n) {
        final blp c = this.c;
        c.b();
        final lua e = blp.e();
        e.b(numSubSamples, 0, n, 0);
        final Object f = e.f;
        numSubSamples = bcx.f;
        final MediaCodec$CryptoInfo mediaCodec$CryptoInfo = (MediaCodec$CryptoInfo)f;
        mediaCodec$CryptoInfo.numSubSamples = numSubSamples;
        mediaCodec$CryptoInfo.numBytesOfClearData = blp.d(bcx.d, mediaCodec$CryptoInfo.numBytesOfClearData);
        mediaCodec$CryptoInfo.numBytesOfEncryptedData = blp.d(bcx.e, mediaCodec$CryptoInfo.numBytesOfEncryptedData);
        mediaCodec$CryptoInfo.key = (byte[])dk.d((Object)blp.c(bcx.b, mediaCodec$CryptoInfo.key));
        mediaCodec$CryptoInfo.iv = (byte[])dk.d((Object)blp.c(bcx.a, mediaCodec$CryptoInfo.iv));
        mediaCodec$CryptoInfo.mode = bcx.c;
        numSubSamples = baw.a;
        mediaCodec$CryptoInfo.setPattern(new MediaCodec$CryptoInfo$Pattern(bcx.g, bcx.h));
        c.e.obtainMessage(1, (Object)e).sendToTarget();
    }
    
    public final void p(final int n) {
        this.a.releaseOutputBuffer(n, false);
    }
}
