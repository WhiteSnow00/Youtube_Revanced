import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;
import android.media.MediaFormat;
import android.media.MediaCodec$BufferInfo;
import android.media.MediaCodec;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bmp implements blz
{
    private final MediaCodec a;
    
    public bmp(final MediaCodec a) {
        this.a = a;
        final int a2 = baz.a;
    }
    
    @Override
    public final int a() {
        return this.a.dequeueInputBuffer(0L);
    }
    
    @Override
    public final int b(final MediaCodec$BufferInfo mediaCodec$BufferInfo) {
        int i;
        do {
            if ((i = this.a.dequeueOutputBuffer(mediaCodec$BufferInfo, 0L)) == -3) {
                final int a = baz.a;
                i = -3;
            }
        } while (i == -3);
        return i;
    }
    
    @Override
    public final MediaFormat c() {
        return this.a.getOutputFormat();
    }
    
    @Override
    public final ByteBuffer e(final int n) {
        final int a = baz.a;
        return this.a.getInputBuffer(n);
    }
    
    @Override
    public final ByteBuffer f(final int n) {
        final int a = baz.a;
        return this.a.getOutputBuffer(n);
    }
    
    @Override
    public final void g() {
        this.a.flush();
    }
    
    @Override
    public final void h() {
        this.a.release();
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
    public final void n(final int n, final int n2, final long n3, final int n4) {
        this.a.queueInputBuffer(n, 0, n2, n3, n4);
    }
    
    @Override
    public final void o(final int n, final bda bda, final long n2) {
        this.a.queueSecureInputBuffer(n, 0, bda.i, n2, 0);
    }
    
    @Override
    public final void p(final int n) {
        this.a.releaseOutputBuffer(n, false);
    }
}
