import java.io.IOException;
import android.media.MediaCrypto;
import android.view.Surface;
import android.media.MediaFormat;
import android.media.MediaCodec;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bmk implements blu
{
    public final blv b(final blt ex) {
        try {
            dk.d(((blt)ex).a);
            final String a = ((bly)((blt)ex).a).a;
            final int a2 = baw.a;
            final MediaCodec byCodecName = MediaCodec.createByCodecName(a);
            try {
                byCodecName.configure((MediaFormat)((blt)ex).b, (Surface)((blt)ex).d, (MediaCrypto)((blt)ex).e, 0);
                byCodecName.start();
                return (blv)new bml(byCodecName);
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
