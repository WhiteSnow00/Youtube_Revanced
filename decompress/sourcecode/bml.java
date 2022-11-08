import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;
import android.media.MediaFormat;
import android.media.MediaCodec$BufferInfo;
import android.media.MediaCodec;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bml implements blv
{
    private final MediaCodec a;
    
    public bml(final MediaCodec a) {
        this.a = a;
        final int a2 = baw.a;
    }
    
    public final int a() {
        return this.a.dequeueInputBuffer(0L);
    }
    
    public final int b(final MediaCodec$BufferInfo mediaCodec$BufferInfo) {
        int i;
        do {
            if ((i = this.a.dequeueOutputBuffer(mediaCodec$BufferInfo, 0L)) == -3) {
                final int a = baw.a;
                i = -3;
            }
        } while (i == -3);
        return i;
    }
    
    public final MediaFormat c() {
        return this.a.getOutputFormat();
    }
    
    public final ByteBuffer e(final int n) {
        final int a = baw.a;
        return this.a.getInputBuffer(n);
    }
    
    public final ByteBuffer f(final int n) {
        final int a = baw.a;
        return this.a.getOutputBuffer(n);
    }
    
    public final void g() {
        this.a.flush();
    }
    
    public final void h() {
        this.a.release();
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
    
    public final void n(final int n, final int n2, final long n3, final int n4) {
        this.a.queueInputBuffer(n, 0, n2, n3, n4);
    }
    
    public final void o(final int n, final bcx bcx, final long n2) {
        this.a.queueSecureInputBuffer(n, 0, bcx.i, n2, 0);
    }
    
    public final void p(final int n) {
        this.a.releaseOutputBuffer(n, false);
    }
}
