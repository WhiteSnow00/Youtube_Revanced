import androidx.media3.decoder.CryptoConfig;
import androidx.media3.decoder.opus.OpusDecoder;
import androidx.media3.decoder.opus.OpusLibrary;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public class bdk extends bhr
{
    public bdk() {
        super((Handler)null, (bhd)null, new azu[0]);
    }
    
    public bdk(final Handler handler, final bhd bhd, final bhj bhj) {
        super(handler, bhd, bhj);
    }
    
    public bdk(final Handler handler, final bhd bhd, final azu... array) {
        super(handler, bhd, array);
    }
    
    protected final int b(ayf i) {
        final boolean b = OpusLibrary.b(i.G);
        if (!OpusLibrary.a() || !"audio/opus".equalsIgnoreCase(i.n)) {
            return 0;
        }
        i = baw.I(2, i.A, i.B);
        if (!super.d.w(i)) {
            return 1;
        }
        if (!b) {
            return 2;
        }
        return 4;
    }
    
    public final String d() {
        return "LibopusAudioRenderer";
    }
    
    protected boolean f() {
        return false;
    }
}
