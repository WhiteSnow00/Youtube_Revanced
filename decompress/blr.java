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

final class blr implements blz
{
    public final MediaCodec a;
    public final blu b;
    public final blt c;
    public int d;
    private boolean e;
    
    public blr(final MediaCodec a, final HandlerThread handlerThread, final HandlerThread handlerThread2) {
        this.a = a;
        this.b = new blu(handlerThread);
        this.c = new blt(a, handlerThread2);
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
    
    @Override
    public final int a() {
        final blu b = this.b;
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
    
    @Override
    public final int b(final MediaCodec$BufferInfo mediaCodec$BufferInfo) {
        final blu b = this.b;
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
                        bad.c(b.f);
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
    
    @Override
    public final MediaFormat c() {
        final blu b = this.b;
        synchronized (b.a) {
            final MediaFormat f = b.f;
            if (f != null) {
                return f;
            }
            throw new IllegalStateException();
        }
    }
    
    @Override
    public final ByteBuffer e(final int n) {
        return this.a.getInputBuffer(n);
    }
    
    @Override
    public final ByteBuffer f(final int n) {
        return this.a.getOutputBuffer(n);
    }
    
    @Override
    public final void g() {
        this.c.a();
        this.a.flush();
        final blu b = this.b;
        synchronized (b.a) {
            ++b.g;
            final Handler c = b.c;
            final int a = baz.a;
            c.post((Runnable)new asa(b, 12));
            monitorexit(b.a);
            this.a.start();
        }
    }
    
    @Override
    public final void h() {
        try {
            if (this.d == 1) {
                final blt c = this.c;
                if (c.g) {
                    c.a();
                    c.d.quit();
                }
                c.g = false;
                final blu b = this.b;
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
    
    @Override
    public final void i(final int n, final long n2) {
        this.a.releaseOutputBuffer(n, n2);
    }
    
    @Override
    public final void j(final Surface outputSurface) {
        this.a.setOutputSurface(outputSurface);
    }
    
    @Override
    public final void k(final Bundle parameters) {
        this.a.setParameters(parameters);
    }
    
    @Override
    public final void l(final int videoScalingMode) {
        this.a.setVideoScalingMode(videoScalingMode);
    }
    
    @Override
    public final boolean m() {
        return false;
    }
    
    @Override
    public final void n(int a, final int n, final long n2, final int n3) {
        final blt c = this.c;
        c.b();
        final lvt e = blt.e();
        e.b(a, n, n2, n3);
        final Handler e2 = c.e;
        a = baz.a;
        e2.obtainMessage(0, (Object)e).sendToTarget();
    }
    
    @Override
    public final void o(int numSubSamples, final bda bda, final long n) {
        final blt c = this.c;
        c.b();
        final lvt e = blt.e();
        e.b(numSubSamples, 0, n, 0);
        final Object f = e.f;
        numSubSamples = bda.f;
        final MediaCodec$CryptoInfo mediaCodec$CryptoInfo = (MediaCodec$CryptoInfo)f;
        mediaCodec$CryptoInfo.numSubSamples = numSubSamples;
        mediaCodec$CryptoInfo.numBytesOfClearData = blt.d(bda.d, mediaCodec$CryptoInfo.numBytesOfClearData);
        mediaCodec$CryptoInfo.numBytesOfEncryptedData = blt.d(bda.e, mediaCodec$CryptoInfo.numBytesOfEncryptedData);
        mediaCodec$CryptoInfo.key = (byte[])bad.b(blt.c(bda.b, mediaCodec$CryptoInfo.key));
        mediaCodec$CryptoInfo.iv = (byte[])bad.b(blt.c(bda.a, mediaCodec$CryptoInfo.iv));
        mediaCodec$CryptoInfo.mode = bda.c;
        numSubSamples = baz.a;
        mediaCodec$CryptoInfo.setPattern(new MediaCodec$CryptoInfo$Pattern(bda.g, bda.h));
        c.e.obtainMessage(1, (Object)e).sendToTarget();
    }
    
    @Override
    public final void p(final int n) {
        this.a.releaseOutputBuffer(n, false);
    }
}
