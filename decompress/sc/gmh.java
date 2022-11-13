import com.google.android.libraries.youtube.player.model.WatchDescriptor;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import android.text.TextUtils;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gmh implements Runnable
{
    public final gmi a;
    public final String b;
    public final float c;
    public final long d;
    public final int e;
    
    public gmh(final gmi a, final String b, final float c, final int e, final long d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = e;
        this.d = d;
    }
    
    @Override
    public final void run() {
        final gmi a = this.a;
        final String b = this.b;
        final float c = this.c;
        final int e = this.e;
        final long d = this.d;
        boolean b2 = true;
        final Float value = c;
        String.format("Receive playback rate update: %s", value);
        if (c > 0.0f && a.b.n().h() != c) {
            String.format("Apply playback rate update: %s", value);
            a.b.n().K(c);
            a.l = c;
        }
        int m = 3;
        final String au = vdh.aU(e);
        final Long value2 = d;
        String.format("Receive video update: %s, PlaybackState: %s, position: %s", b, au, value2);
        if (!TextUtils.isEmpty((CharSequence)b)) {
            if (!adkp.ae(a.b.n().s(), b) || !a.i.i()) {
                String.format("Apply video update: %s", b);
                if (e != 3) {
                    b2 = false;
                }
                final aiqj g = abkf.g(b, (String)null, 0, d / 1000.0f);
                final abjp d2 = PlaybackStartDescriptor.d();
                d2.a = g;
                d2.c(b2);
                final PlaybackStartDescriptor a2 = d2.a();
                a.h(b);
                a.f = d;
                if (e != 3) {
                    m = 2;
                }
                a.m = m;
                if (a.g) {
                    a.b.m().d(a2);
                    return;
                }
                final fkm b3 = fkn.b();
                b3.f(new WatchDescriptor(a2));
                a.c.g(b3.a());
                return;
            }
        }
        String.format("Receive playback state update: %s", vdh.aU(e));
        if (e == 3) {
            String.format("Apply playback state update: %s", "PAUSE");
            a.m = 3;
            a.b.s().c();
        }
        else if (e == 2) {
            String.format("Apply playback state update: %s", "PLAY");
            a.m = 2;
            a.b.s().d();
        }
        String.format("Receive playback position update: %s", value2);
        if (Math.abs(a.f - d) > 2000L) {
            String.format("Apply playback position update: %s", value2);
            a.f = d;
            a.b.n().Z(d);
        }
    }
}
