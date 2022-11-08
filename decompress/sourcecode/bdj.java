import android.view.Surface;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import androidx.media3.decoder.CryptoConfig;
import android.os.Handler;
import androidx.media3.decoder.av1.Gav1Decoder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bdj extends brw
{
    private static final int e;
    private Gav1Decoder f;
    
    static {
        e = baw.c(1280, 64) * baw.c(720, 64) * 6144 / 2;
    }
    
    public bdj(final long n, final Handler handler, final bsn bsn, final int n2) {
        super(n, handler, bsn, n2);
    }
    
    public final int a(final ayf ayf) {
        if (!"video/av01".equalsIgnoreCase(ayf.n) || !bdi.a()) {
            return beq.b(0);
        }
        if (ayf.G != 0) {
            return beq.b(2);
        }
        return beq.c(4, 16, 0);
    }
    
    protected final bdy c(final String s, final ayf ayf, final ayf ayf2) {
        return new bdy(s, ayf, ayf2, 3, 0);
    }
    
    public final String d() {
        return "Libgav1VideoRenderer";
    }
    
    protected final void e(final VideoDecoderOutputBuffer videoDecoderOutputBuffer, final Surface surface) {
        final Gav1Decoder f = this.f;
        if (f == null) {
            throw new bdg("Failed to render output buffer to surface: decoder is not initialized.");
        }
        if (videoDecoderOutputBuffer.mode != 1) {
            throw new bdg("Invalid output mode.");
        }
        if (f.gav1RenderFrame(f.a, surface, videoDecoderOutputBuffer) != 0) {
            videoDecoderOutputBuffer.release();
            return;
        }
        throw new bdg("Buffer render error: ".concat(String.valueOf(f.gav1GetErrorMessage(f.a))));
    }
    
    protected final void f(final int b) {
        final Gav1Decoder f = this.f;
        if (f != null) {
            f.b = b;
        }
    }
}
