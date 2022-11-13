import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.apps.youtube.app.player.overlay.YouTubeControlsOverlay;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ize implements asjm
{
    public final YouTubeControlsOverlay a;
    
    public ize(final YouTubeControlsOverlay a) {
        this.a = a;
    }
    
    @Override
    public final void a(final Object o) {
        final YouTubeControlsOverlay a = this.a;
        final aani aani = (aani)o;
        if (aani.c() == abkb.e) {
            a.w.l((wzz)new wyt(xaa.c(54319)));
            a.w.l((wzz)new wyt(xaa.c(54318)));
            final WatchNextResponseModel a2 = aani.a();
            final izr o2 = a.o;
            if (a2 != null) {
                o2.h.tu((Object)a2);
            }
        }
        final PlayerResponseModel b = aani.b();
        if (b != null) {
            final PlayerConfigModel m = b.m();
            anei anei;
            if ((anei = m.c.m) == null) {
                anei = anei.a;
            }
            a.N(anei.b);
            if (!fbu.aw(a.V)) {
                final VideoStreamingData n = b.n();
                final boolean b2 = true;
                final boolean b3 = n != null && b.n().B();
                final ixc c = a.C;
                boolean b4 = false;
                Label_0228: {
                    if (m.ab()) {
                        b4 = b2;
                        if (m.ap()) {
                            break Label_0228;
                        }
                        if (b3) {
                            b4 = b2;
                            break Label_0228;
                        }
                    }
                    b4 = false;
                }
                c.d((ixd)iwy.m, (Object)b4);
            }
        }
        final PlayerResponseModel b5 = aani.b();
        if (b5 != null) {
            final akxi z = b5.z();
            if (z != null) {
                aneh aneh;
                if ((aneh = z.e) == null) {
                    aneh = aneh.a;
                }
                andr andr;
                if ((andr = aneh.g) == null) {
                    andr = andr.a;
                }
                apnr apnr;
                if ((apnr = andr.e) == null) {
                    apnr = apnr.a;
                }
                if ((apnr.b & 0x2) != 0x0) {
                    final apnr f = andr.f;
                    apnr a3;
                    if (f == null) {
                        a3 = apnr.a;
                    }
                    else {
                        a3 = f;
                    }
                    if ((a3.b & 0x2) != 0x0) {
                        final izq n2 = a.n;
                        apnr apnr2;
                        if ((apnr2 = andr.e) == null) {
                            apnr2 = apnr.a;
                        }
                        final long d = apnr2.d;
                        apnr a4;
                        if ((a4 = f) == null) {
                            a4 = apnr.a;
                        }
                        ((fos)n2).px(d, a4.d);
                    }
                }
            }
        }
        final WatchNextResponseModel a5 = aani.a();
        if (a5 != null) {
            final angl i = a5.i;
            if (i != null) {
                apnr apnr3;
                if ((apnr3 = i.s) == null) {
                    apnr3 = apnr.a;
                }
                if ((apnr3.b & 0x2) != 0x0) {
                    final apnr t = i.t;
                    apnr a6;
                    if (t == null) {
                        a6 = apnr.a;
                    }
                    else {
                        a6 = t;
                    }
                    if ((a6.b & 0x2) != 0x0) {
                        final izq n3 = a.n;
                        apnr apnr4;
                        if ((apnr4 = i.s) == null) {
                            apnr4 = apnr.a;
                        }
                        final long d2 = apnr4.d;
                        apnr a7;
                        if ((a7 = t) == null) {
                            a7 = apnr.a;
                        }
                        ((fos)n3).px(d2, a7.d);
                    }
                }
            }
        }
        final WatchNextResponseModel a8 = aani.a();
        if (aezr.f(a.q) && a8 != null) {
            final anjb g = a8.g;
            if (g != null) {
                a.q = g.m;
            }
        }
        a.b.e(aezr.f(a.q));
    }
}
