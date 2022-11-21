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

public final class blq implements bly
{
    private final afci a;
    private final afci c;
    
    public blq(final int n) {
        final blp a = new blp(n, 1);
        final blp c = new blp(n, 0);
        this.a = a;
        this.c = c;
    }
    
    public final blr a(final blx blx) {
        final String a = ((bmc)blx.a).a;
        Object b = null;
        MediaCodec byCodecName;
        Object o;
        try {
            final int a2 = baz.a;
            byCodecName = MediaCodec.createByCodecName(a);
            try {
                o = new blr(byCodecName, (HandlerThread)this.a.a(), (HandlerThread)this.c.a());
                try {
                    b = blx.b;
                    final Object d = blx.d;
                    final Object e = blx.e;
                    final blu b2 = ((blr)o).b;
                    final MediaCodec a3 = ((blr)o).a;
                    bad.f(b2.c == null);
                    b2.b.start();
                    final Handler c = new Handler(b2.b.getLooper());
                    a3.setCallback((MediaCodec$Callback)b2, c);
                    b2.c = c;
                    ((blr)o).a.configure((MediaFormat)b, (Surface)d, (MediaCrypto)e, 0);
                    final blt c2 = ((blr)o).c;
                    if (!c2.g) {
                        c2.d.start();
                        b = new bls(c2, c2.d.getLooper());
                        c2.e = (Handler)b;
                        c2.g = true;
                    }
                    ((blr)o).a.start();
                    ((blr)o).d = 1;
                    return (blr)o;
                }
                catch (final Exception ex) {}
            }
            catch (final Exception ex) {
                o = b;
            }
        }
        catch (final Exception ex) {
            byCodecName = null;
            o = b;
        }
        if (o == null) {
            if (byCodecName != null) {
                byCodecName.release();
            }
        }
        else {
            ((blr)o).h();
        }
        throw;
    }
    
    @Override
    public final /* bridge */ blz b(final blx blx) {
        return this.a(blx);
    }
}
