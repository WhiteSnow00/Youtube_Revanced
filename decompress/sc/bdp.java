import android.view.Surface;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import androidx.media3.decoder.CryptoConfig;
import androidx.media3.decoder.vp9.VpxLibrary;
import android.os.Handler;
import androidx.media3.decoder.vp9.VpxDecoder;

// 
// Decompiled by Procyon v0.6.0
// 

public class bdp extends brx
{
    private final int e;
    private final int f;
    private final int g;
    private VpxDecoder h;
    
    public bdp(final long n, final Handler handler, final bso bso, final int n2) {
        this(n, handler, bso, n2, Runtime.getRuntime().availableProcessors(), 4, 4);
    }
    
    public bdp(final long n, final Handler handler, final bso bso, final int n2, final int g, final int e, final int f) {
        super(n, handler, bso, n2);
        this.g = g;
        this.e = e;
        this.f = f;
    }
    
    public final int a(final ayg ayg) {
        if (!VpxLibrary.a() || !"video/x-vnd.on2.vp9".equalsIgnoreCase(ayg.n)) {
            return ber.b(0);
        }
        if (!VpxLibrary.b(ayg.G)) {
            return ber.b(2);
        }
        return ber.c(4, 16, 0);
    }
    
    protected final /* bridge */ bcz b(final ayg ayg, final CryptoConfig cryptoConfig) {
        final int a = bax.a;
        int o = ayg.o;
        if (o == -1) {
            o = 786432;
        }
        return (bcz)(this.h = new VpxDecoder(this.e, this.f, o, cryptoConfig, this.g));
    }
    
    protected final bdz c(final String s, final ayg ayg, final ayg ayg2) {
        return new bdz(s, ayg, ayg2, 3, 0);
    }
    
    public final String d() {
        return "LibvpxVideoRenderer";
    }
    
    protected final void e(final VideoDecoderOutputBuffer videoDecoderOutputBuffer, final Surface surface) {
        final VpxDecoder h = this.h;
        if (h == null) {
            throw new bdq("Failed to render output buffer to surface: decoder is not initialized.");
        }
        if (h.vpxRenderFrame(h.a, surface, videoDecoderOutputBuffer) != -1) {
            videoDecoderOutputBuffer.release();
            return;
        }
        throw new bdq("Buffer render failed.");
    }
    
    protected final void f(final int b) {
        final VpxDecoder h = this.h;
        if (h != null) {
            h.b = b;
        }
    }
}
