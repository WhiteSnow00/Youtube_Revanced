import android.view.Surface;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import androidx.media3.decoder.CryptoConfig;
import android.os.Handler;
import androidx.media3.decoder.av1.Gav1Decoder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bdk extends brx
{
    private static final int e;
    private Gav1Decoder f;
    
    static {
        e = bax.c(1280, 64) * bax.c(720, 64) * 6144 / 2;
    }
    
    public bdk(final long n, final Handler handler, final bso bso, final int n2) {
        super(n, handler, bso, n2);
    }
    
    public final int a(final ayg ayg) {
        if (!"video/av01".equalsIgnoreCase(ayg.n) || !bdj.a()) {
            return ber.b(0);
        }
        if (ayg.G != 0) {
            return ber.b(2);
        }
        return ber.c(4, 16, 0);
    }
    
    protected final /* bridge */ bcz b(final ayg ayg, final CryptoConfig cryptoConfig) {
        final int a = bax.a;
        int n;
        if ((n = ayg.o) == -1) {
            n = bdk.e;
        }
        return (bcz)(this.f = new Gav1Decoder(n));
    }
    
    protected final bdz c(final String s, final ayg ayg, final ayg ayg2) {
        return new bdz(s, ayg, ayg2, 3, 0);
    }
    
    public final String d() {
        return "Libgav1VideoRenderer";
    }
    
    protected final void e(final VideoDecoderOutputBuffer videoDecoderOutputBuffer, final Surface surface) {
        final Gav1Decoder f = this.f;
        if (f == null) {
            throw new bdh("Failed to render output buffer to surface: decoder is not initialized.");
        }
        if (videoDecoderOutputBuffer.mode != 1) {
            throw new bdh("Invalid output mode.");
        }
        if (f.gav1RenderFrame(f.a, surface, videoDecoderOutputBuffer) != 0) {
            videoDecoderOutputBuffer.release();
            return;
        }
        throw new bdh("Buffer render error: ".concat(String.valueOf(f.gav1GetErrorMessage(f.a))));
    }
    
    protected final void f(final int b) {
        final Gav1Decoder f = this.f;
        if (f != null) {
            f.b = b;
        }
    }
}
