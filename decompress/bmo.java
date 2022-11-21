import java.io.IOException;
import android.media.MediaCrypto;
import android.view.Surface;
import android.media.MediaFormat;
import android.media.MediaCodec;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bmo implements bly
{
    @Override
    public final blz b(final blx ex) {
        try {
            bad.b(((blx)ex).a);
            final String a = ((bmc)((blx)ex).a).a;
            final int a2 = baz.a;
            final MediaCodec byCodecName = MediaCodec.createByCodecName(a);
            try {
                byCodecName.configure((MediaFormat)((blx)ex).b, (Surface)((blx)ex).d, (MediaCrypto)((blx)ex).e, 0);
                byCodecName.start();
                return new bmp(byCodecName);
            }
            catch (final RuntimeException ex) {}
            catch (final IOException ex) {}
        }
        catch (final RuntimeException ex) {}
        catch (final IOException ex2) {}
        final MediaCodec byCodecName = null;
        if (byCodecName != null) {
            byCodecName.release();
        }
        throw ex;
    }
}
