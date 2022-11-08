import android.view.Surface;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import androidx.media3.decoder.CryptoConfig;
import androidx.media3.decoder.vp9.VpxLibrary;
import android.os.Handler;
import androidx.media3.decoder.vp9.VpxDecoder;

// 
// Decompiled by Procyon v0.6.0
// 

public class bdo extends brw
{
    private final int e;
    private final int f;
    private final int g;
    private VpxDecoder h;
    
    public bdo(final long n, final Handler handler, final bsn bsn, final int n2) {
        this(n, handler, bsn, n2, Runtime.getRuntime().availableProcessors(), 4, 4);
    }
    
    public bdo(final long n, final Handler handler, final bsn bsn, final int n2, final int g, final int e, final int f) {
        super(n, handler, bsn, n2);
        this.g = g;
        this.e = e;
        this.f = f;
    }
    
    public final int a(final ayf ayf) {
        if (!VpxLibrary.a() || !"video/x-vnd.on2.vp9".equalsIgnoreCase(ayf.n)) {
            return beq.b(0);
        }
        if (!VpxLibrary.b(ayf.G)) {
            return beq.b(2);
        }
        return beq.c(4, 16, 0);
    }
    
    protected final bdy c(final String s, final ayf ayf, final ayf ayf2) {
        return new bdy(s, ayf, ayf2, 3, 0);
    }
    
    public final String d() {
        return "LibvpxVideoRenderer";
    }
    
    protected final void e(final VideoDecoderOutputBuffer videoDecoderOutputBuffer, final Surface surface) {
        final VpxDecoder h = this.h;
        if (h == null) {
            throw new bdp("Failed to render output buffer to surface: decoder is not initialized.");
        }
        if (h.vpxRenderFrame(h.a, surface, videoDecoderOutputBuffer) != -1) {
            videoDecoderOutputBuffer.release();
            return;
        }
        throw new bdp("Buffer render failed.");
    }
    
    protected final void f(final int b) {
        final VpxDecoder h = this.h;
        if (h != null) {
            h.b = b;
        }
    }
}
