import android.view.View;
import android.widget.TextView;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import android.graphics.Rect;
import com.google.android.apps.youtube.app.player.overlay.YouTubeControlsOverlay;

// 
// Decompiled by Procyon v0.6.0
// 

public final class izf implements asjm
{
    public final Object a;
    private final int b;
    
    public izf(final YouTubeControlsOverlay a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public izf(final iuv a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public izf(final ivf a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public izf(final izq a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public izf(final izr a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final Object o) {
        switch (this.b) {
            default: {
                final Object a = this.a;
                final boolean booleanValue = (boolean)o;
                final ivf l = ((izr)a).l;
                if (l != null) {
                    if (l.e != booleanValue) {
                        l.e = booleanValue;
                        l.j(false);
                    }
                }
                return;
            }
            case 19: {
                final Object a2 = this.a;
                final ajb ajb = (ajb)o;
                final ivf i = ((izr)a2).l;
                if (i == null) {
                    return;
                }
                i.e((CharSequence)ajb.b, (CharSequence)ajb.c, (CharSequence)ajb.a);
                return;
            }
            case 18: {
                ((ivf)this.a).d((boolean)o);
                return;
            }
            case 17: {
                ((ivf)this.a).b((boolean)o);
                return;
            }
            case 16: {
                ((ivf)this.a).c((boolean)o);
                return;
            }
            case 15: {
                final Object a3 = this.a;
                final jbg jbg = (jbg)o;
                ((fpg)a3).pv();
                final izq izq = (izq)a3;
                izq.z(true);
                if (izq.e.f && !jbh.k(jbg)) {
                    izq.A();
                }
                return;
            }
            case 14: {
                final Object a4 = this.a;
                if (((aanf)o).b() == abka.g) {
                    final YouTubeControlsOverlay youTubeControlsOverlay = (YouTubeControlsOverlay)a4;
                    youTubeControlsOverlay.d.b(youTubeControlsOverlay.s);
                    return;
                }
                final YouTubeControlsOverlay youTubeControlsOverlay2 = (YouTubeControlsOverlay)a4;
                youTubeControlsOverlay2.d.a(youTubeControlsOverlay2.s);
                return;
            }
            case 13: {
                ((iuv)this.a).g.tu((Object)o);
                return;
            }
            case 12: {
                final Object a5 = this.a;
                final abbc p = (abbc)o;
                final YouTubeControlsOverlay youTubeControlsOverlay3 = (YouTubeControlsOverlay)a5;
                youTubeControlsOverlay3.P = p;
                youTubeControlsOverlay3.rh(youTubeControlsOverlay3.P.a);
                return;
            }
            case 11: {
                final Object a6 = this.a;
                final Boolean b = (Boolean)o;
                ((YouTubeControlsOverlay)a6).oE();
                return;
            }
            case 10: {
                final Object a7 = this.a;
                final gsf gsf = (gsf)o;
                final YouTubeControlsOverlay youTubeControlsOverlay4 = (YouTubeControlsOverlay)a7;
                youTubeControlsOverlay4.G = gsf;
                if (gsf.a) {
                    youTubeControlsOverlay4.n(gsf.b, gsf.c, gsf.d, gsf.e);
                }
                youTubeControlsOverlay4.C.d((ixd)iwy.p, (Object)gsf.a);
                final abie d = ((fos)youTubeControlsOverlay4.n).d;
                if (d instanceof jcn) {
                    ((jcn)d).e = gsf;
                }
                return;
            }
            case 9: {
                final Object a8 = this.a;
                final boolean k = jbh.k((jbg)o);
                if (k) {
                    ((YouTubeControlsOverlay)a8).oE();
                }
                ((YouTubeControlsOverlay)a8).b.h.tu((Object)k);
                return;
            }
            case 8: {
                final Object a9 = this.a;
                final aany aany = (aany)o;
                final YouTubeControlsOverlay youTubeControlsOverlay5 = (YouTubeControlsOverlay)a9;
                if (youTubeControlsOverlay5.U) {
                    final wzz a10 = youTubeControlsOverlay5.A;
                    if (a10 != null && youTubeControlsOverlay5.B != null) {
                        youTubeControlsOverlay5.w.D(a10);
                        youTubeControlsOverlay5.w.D(youTubeControlsOverlay5.B);
                    }
                }
                youTubeControlsOverlay5.c.b();
                final PlaybackStartDescriptor g = aany.a().g();
                String j;
                if (g == null) {
                    j = null;
                }
                else {
                    j = g.i();
                }
                youTubeControlsOverlay5.q = j;
                youTubeControlsOverlay5.b.e(aezr.f(youTubeControlsOverlay5.q));
                return;
            }
            case 7: {
                final Object a11 = this.a;
                final CharSequence text = (CharSequence)o;
                final TextView p2 = ((YouTubeControlsOverlay)a11).p;
                if (p2 == null) {
                    return;
                }
                p2.setText(text);
                return;
            }
            case 6: {
                final Object a12 = this.a;
                if (o) {
                    final YouTubeControlsOverlay youTubeControlsOverlay6 = (YouTubeControlsOverlay)a12;
                    youTubeControlsOverlay6.oE();
                    final View m = youTubeControlsOverlay6.k;
                    m.getClass();
                    m.setPadding(0, 0, 0, 0);
                    youTubeControlsOverlay6.g.j(YouTubeControlsOverlay.a);
                    youTubeControlsOverlay6.j.d(YouTubeControlsOverlay.a);
                    return;
                }
                final YouTubeControlsOverlay youTubeControlsOverlay7 = (YouTubeControlsOverlay)a12;
                youTubeControlsOverlay7.W(youTubeControlsOverlay7.T);
                return;
            }
            case 5: {
                ((YouTubeControlsOverlay)this.a).W((Rect)o);
                return;
            }
            case 4: {
                final Object a13 = this.a;
                final Boolean b2 = (Boolean)o;
                final ixq e = ((YouTubeControlsOverlay)a13).e;
                if (e == null) {
                    return;
                }
                e.k = b2;
                ((ius)e).f();
                return;
            }
            case 3: {
                final Object a14 = this.a;
                final boolean booleanValue2 = (boolean)o;
                final YouTubeControlsOverlay youTubeControlsOverlay8 = (YouTubeControlsOverlay)a14;
                if (youTubeControlsOverlay8.I == booleanValue2) {
                    return;
                }
                youTubeControlsOverlay8.I = booleanValue2;
                youTubeControlsOverlay8.V(true);
                return;
            }
            case 2: {
                final Object a15 = this.a;
                final iuw iuw = (iuw)o;
                if (!iuw.a) {
                    final YouTubeControlsOverlay youTubeControlsOverlay9 = (YouTubeControlsOverlay)a15;
                    if (youTubeControlsOverlay9.H != 0 && youTubeControlsOverlay9.Z()) {
                        youTubeControlsOverlay9.S();
                    }
                    return;
                }
                final YouTubeControlsOverlay youTubeControlsOverlay10 = (YouTubeControlsOverlay)a15;
                youTubeControlsOverlay10.P(false);
                if (iuw.b) {
                    youTubeControlsOverlay10.C();
                    return;
                }
                youTubeControlsOverlay10.G();
                return;
            }
            case 1: {
                ((YouTubeControlsOverlay)this.a).y.tu((Object)o);
                return;
            }
            case 0: {
                final Object a16 = this.a;
                final fqc fqc = (fqc)o;
                ((YouTubeControlsOverlay)a16).U();
            }
        }
    }
}
