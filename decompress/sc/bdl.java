import androidx.media3.decoder.CryptoConfig;
import androidx.media3.decoder.opus.OpusDecoder;
import androidx.media3.decoder.opus.OpusLibrary;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public class bdl extends bhs
{
    public bdl() {
        super((Handler)null, (bhe)null, new azv[0]);
    }
    
    public bdl(final Handler handler, final bhe bhe, final bhk bhk) {
        super(handler, bhe, bhk);
    }
    
    public bdl(final Handler handler, final bhe bhe, final azv... array) {
        super(handler, bhe, array);
    }
    
    protected final int b(ayg i) {
        final boolean b = OpusLibrary.b(i.G);
        if (!OpusLibrary.a() || !"audio/opus".equalsIgnoreCase(i.n)) {
            return 0;
        }
        i = bax.I(2, i.A, i.B);
        if (!super.d.w(i)) {
            return 1;
        }
        if (!b) {
            return 2;
        }
        return 4;
    }
    
    protected final /* bridge */ ayg c(final bcz bcz) {
        final OpusDecoder opusDecoder = (OpusDecoder)bcz;
        int n;
        if (!opusDecoder.a) {
            n = 2;
        }
        else {
            n = 4;
        }
        return bax.I(n, opusDecoder.b, 48000);
    }
    
    public final String d() {
        return "LibopusAudioRenderer";
    }
    
    protected final /* bridge */ bcz e(final ayg ayg, final CryptoConfig cryptoConfig) {
        final int a = bax.a;
        final int a2 = super.d.a(bax.I(4, ayg.A, ayg.B));
        int o;
        if ((o = ayg.o) == -1) {
            o = 5760;
        }
        final OpusDecoder opusDecoder = new OpusDecoder(o, ayg.p, cryptoConfig, a2 == 2);
        opusDecoder.c = this.f();
        return (bcz)opusDecoder;
    }
    
    protected boolean f() {
        return false;
    }
}
