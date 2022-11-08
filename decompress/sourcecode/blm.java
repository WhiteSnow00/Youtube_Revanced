import android.media.MediaCrypto;
import android.view.Surface;
import android.media.MediaFormat;
import android.media.MediaCodec$Callback;
import android.os.Handler;
import android.os.HandlerThread;
import android.media.MediaCodec;

// 
// Decompiled by Procyon v0.6.0
// 

public final class blm implements blu
{
    private final aeyr a;
    private final aeyr c;
    
    public blm(final int n) {
        final bll a = new bll(n, 1);
        final bll c = new bll(n, 0);
        this.a = (aeyr)a;
        this.c = (aeyr)c;
    }
    
    public final bln a(final blt blt) {
        final String a = ((bly)blt.a).a;
        Object o = null;
        MediaCodec byCodecName;
        Object o2;
        try {
            final int a2 = baw.a;
            byCodecName = MediaCodec.createByCodecName(a);
            try {
                o2 = new bln(byCodecName, (HandlerThread)this.a.a(), (HandlerThread)this.c.a());
                try {
                    o = blt.b;
                    final Object d = blt.d;
                    final Object e = blt.e;
                    final blq b = ((bln)o2).b;
                    final MediaCodec a3 = ((bln)o2).a;
                    dk.h(b.c == null);
                    b.b.start();
                    final Handler c = new Handler(b.b.getLooper());
                    a3.setCallback((MediaCodec$Callback)b, c);
                    b.c = c;
                    ((bln)o2).a.configure((MediaFormat)o, (Surface)d, (MediaCrypto)e, 0);
                    o = ((bln)o2).c;
                    if (!((blp)o).g) {
                        ((blp)o).d.start();
                        ((blp)o).e = (Handler)new blo((blp)o, ((blp)o).d.getLooper());
                        ((blp)o).g = true;
                    }
                    ((bln)o2).a.start();
                    ((bln)o2).d = 1;
                    return (bln)o2;
                }
                catch (final Exception ex) {}
            }
            catch (final Exception ex) {
                o2 = o;
            }
        }
        catch (final Exception ex) {
            byCodecName = null;
            o2 = o;
        }
        if (o2 == null) {
            if (byCodecName != null) {
                byCodecName.release();
            }
        }
        else {
            ((bln)o2).h();
        }
        throw;
    }
}
