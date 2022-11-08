import android.os.Bundle;
import java.nio.ByteBuffer;
import android.media.MediaFormat;
import android.media.MediaCodec$BufferInfo;
import android.view.Surface;
import android.media.MediaCodec;
import androidx.media3.exoplayer.video.PlaceholderSurface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lys implements blv
{
    public final boolean a;
    public PlaceholderSurface b;
    private final MediaCodec c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private Surface h;
    
    public lys(final MediaCodec c, final Surface h, final boolean d, final boolean a) {
        this.c = c;
        this.h = h;
        this.d = d;
        this.a = a;
        this.e = true;
    }
    
    public final int a() {
        return this.c.dequeueInputBuffer(0L);
    }
    
    public final int b(final MediaCodec$BufferInfo mediaCodec$BufferInfo) {
        if (!this.f) {
            int i;
            do {
                i = this.c.dequeueOutputBuffer(mediaCodec$BufferInfo, 0L);
            } while (i == -3);
            return i;
        }
        this.f = false;
        return -2;
    }
    
    public final MediaFormat c() {
        return this.c.getOutputFormat();
    }
    
    final void d() {
        synchronized (this) {
            if (this.e) {
                final yzr a = yzr.a;
                this.d = false;
                return;
            }
            yzs.d(yzr.k, (Object)"Codec released.");
            this.c.release();
            final PlaceholderSurface b = this.b;
            if (b != null) {
                b.release();
            }
        }
    }
    
    public final ByteBuffer e(final int n) {
        final int a = baw.a;
        return this.c.getInputBuffer(n);
    }
    
    public final ByteBuffer f(final int n) {
        final int a = baw.a;
        return this.c.getOutputBuffer(n);
    }
    
    public final void g() {
        synchronized (this) {
            this.c.flush();
        }
    }
    
    public final void h() {
        synchronized (this) {
            this.e = false;
            if (this.d) {
                final yzr a = yzr.a;
                this.c.flush();
                this.f = true;
                return;
            }
            yzs.d(yzr.k, (Object)"Codec Released.");
            this.c.release();
            final PlaceholderSurface b = this.b;
            if (b != null) {
                b.release();
            }
        }
    }
    
    public final void i(final int n, final long n2) {
        this.c.releaseOutputBuffer(n, n2);
    }
    
    public final void j(final Surface surface) {
        if (this.h.equals(surface)) {
            return;
        }
        this.c.setOutputSurface(surface);
        this.h = surface;
        final PlaceholderSurface b = this.b;
        if (b != null && !surface.equals(b)) {
            final yzr a = yzr.a;
            this.b.release();
            this.b = null;
        }
    }
    
    public final void k(final Bundle parameters) {
        this.c.setParameters(parameters);
    }
    
    public final void l(final int videoScalingMode) {
        this.c.setVideoScalingMode(videoScalingMode);
    }
    
    public final boolean m() {
        return this.g;
    }
    
    public final void n(final int n, final int n2, final long n3, final int n4) {
        this.c.queueInputBuffer(n, 0, n2, n3, n4);
    }
    
    public final void o(final int n, final bcx bcx, final long n2) {
        this.c.queueSecureInputBuffer(n, 0, bcx.i, n2, 0);
    }
    
    public final void p(final int n) {
        this.c.releaseOutputBuffer(n, false);
    }
    
    final void q() {
        synchronized (this) {
            this.g = true;
            this.e = true;
        }
    }
}
