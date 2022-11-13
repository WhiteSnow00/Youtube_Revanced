import android.widget.FrameLayout;
import java.util.Set;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import android.os.Bundle;
import java.util.Collection;
import com.google.protos.youtube.api.innertube.AdCtaButtonRendererOuterClass;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import android.view.View;
import com.google.android.apps.youtube.app.player.overlay.YouTubeControlsOverlay;
import com.google.android.apps.youtube.app.player.overlay.RepeatChapterPlaybackLoopController;
import com.google.android.apps.youtube.app.player.overlay.MusicAppDeeplinkButtonController;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ixg implements View$OnClickListener
{
    public final Object a;
    private final int b;
    
    public ixg(final MusicAppDeeplinkButtonController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ixg(final RepeatChapterPlaybackLoopController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ixg(final YouTubeControlsOverlay a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ixg(final ixj a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ixg(final ixq a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ixg(final ixq a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public ixg(final iys a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ixg(final iyy a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ixg(final izl a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ixg(final izm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ixg(final izm a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public ixg(final izm a, final int b, final char[] array) {
        this.b = b;
        this.a = a;
    }
    
    public ixg(final jac a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ixg(final jak a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ixg(final kuk a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ixg(final mcb a, final int b, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
    }
    
    public final void onClick(final View view) {
        final int b = this.b;
        boolean b2 = false;
        switch (b) {
            default: {
                final jak jak = (jak)this.a;
                if (jak.s != null) {
                    final Object r = jak.r;
                    if (r != null) {
                        aicz aicz;
                        if (jak.v == 4) {
                            ahuv ahuv;
                            if ((ahuv = ((ahuw)r).d) == null) {
                                ahuv = ahuv.a;
                            }
                            aida aida;
                            if ((aida = ahuv.c) == null) {
                                aida = aida.a;
                            }
                            if ((aicz = aida.c) == null) {
                                aicz = aicz.a;
                            }
                        }
                        else {
                            ahuu ahuu;
                            if ((ahuu = ((ahuw)r).e) == null) {
                                ahuu = ahuu.a;
                            }
                            aida aida2;
                            if ((aida2 = ahuu.b) == null) {
                                aida2 = aida.a;
                            }
                            if ((aicz = aida2.c) == null) {
                                aicz = aicz.a;
                            }
                        }
                        if (aicz != null && (aicz.b & 0x8000) != 0x0) {
                            final rqm s = ((jak)this.a).s;
                            aiqj aiqj;
                            if ((aiqj = aicz.o) == null) {
                                aiqj = aiqj.a;
                            }
                            s.l((Object)aicz, (List)Collections.singletonList(aiqj));
                        }
                    }
                }
                return;
            }
            case 19: {
                final jac jac = (jac)this.a;
                teu.n((aun)jac.b, jac.h.b(jac.i.c()), (ttg)ify.g, (ttg)new hui(jac, 18));
                return;
            }
            case 18: {
                final mcb mcb = (mcb)this.a;
                ((jea)mcb.a).v();
                ((wyw)mcb.b).J(3, (wzz)new wyt(xaa.c(159962)), (alhi)null);
                return;
            }
            case 17: {
                final izl izl = (izl)this.a;
                if (izl.d != null && izl.e != null) {
                    final ArrayList list = new ArrayList();
                    anuv anuv;
                    if ((anuv = ((izl)this.a).e.h) == null) {
                        anuv = anuv.a;
                    }
                    final ahlc ahlc = (ahlc)aakt.v(anuv, (ahaq)AdCtaButtonRendererOuterClass.adCtaButtonRenderer);
                    if (ahlc != null) {
                        list.addAll((Collection)ahlc.n);
                        if ((ahlc.b & 0x200) != 0x0) {
                            aiqj aiqj2;
                            if ((aiqj2 = ahlc.m) == null) {
                                aiqj2 = aiqj.a;
                            }
                            list.add(aiqj2);
                        }
                    }
                    ((izl)this.a).d.b((List)list);
                }
                return;
            }
            case 16: {
                final sjp d = ((izl)this.a).d;
                if (d != null) {
                    d.a();
                }
                return;
            }
            case 15: {
                ((izm)this.a).h();
                return;
            }
            case 14: {
                final izm izm = (izm)this.a;
                final sjr e = izm.e;
                if (e != null) {
                    e.c(izm.h, izm.i);
                }
                return;
            }
            case 13: {
                final izm izm2 = (izm)this.a;
                if (izm2.e == null) {
                    return;
                }
                final Bundle bundle = new Bundle();
                bundle.putBoolean("menu_as_bottom_sheet", true);
                izm2.e.a(bundle);
                return;
            }
            case 12: {
                final YouTubeControlsOverlay youTubeControlsOverlay = (YouTubeControlsOverlay)this.a;
                if (!ControlsOverlayStyle.c(youTubeControlsOverlay.O)) {
                    final abbr f = youTubeControlsOverlay.f;
                    if (f != null) {
                        f.r(youTubeControlsOverlay.J);
                    }
                    youTubeControlsOverlay.o.g(true);
                }
                return;
            }
            case 11: {
                final Object a = this.a;
                final iyy iyy = (iyy)a;
                final FrameLayout o = iyy.o;
                o.getClass();
                o.removeCallbacks(iyy.f);
                ((abbk)a).mk();
                return;
            }
            case 10: {
                ((aawr)((iyy)this.a).e.a()).f();
                return;
            }
            case 9: {
                final Object a2 = this.a;
                final iyy iyy2 = (iyy)a2;
                final FrameLayout o2 = iyy2.o;
                o2.getClass();
                o2.removeCallbacks(iyy2.f);
                ((abbk)a2).mk();
                return;
            }
            case 8: {
                final iys iys = (iys)this.a;
                final ashy c = iys.c;
                if (iys.p == 2) {
                    b2 = true;
                }
                c.tu(new wbb(b2));
                return;
            }
            case 7: {
                ((kuk)this.a).j(view);
                return;
            }
            case 6: {
                ((RepeatChapterPlaybackLoopController)this.a).c.a();
                return;
            }
            case 5: {
                final ixq ixq = (ixq)this.a;
                final abbx a3 = ixq.j.a;
                if (a3 == abbx.b) {
                    ixq.z(ixq.h);
                    ixq.i.e();
                    return;
                }
                if (a3 == abbx.c) {
                    ixq.z(ixq.g);
                    ixq.i.f();
                    return;
                }
                if (a3 == abbx.f) {
                    ixq.i.n();
                    final fqx fqx = (fqx)((tmx)((bhv)ixq.b.a()).a).c();
                    int h;
                    if ((fqx.b & 0x10) != 0x0) {
                        h = fqx.h;
                    }
                    else {
                        h = 1;
                    }
                    if (h > 0) {
                        final acwb acwb = (acwb)ixq.c.a();
                        final gbv d2 = gbx.d();
                        d2.j();
                        d2.k((CharSequence)ixq.e);
                        ((acwc)d2).m((CharSequence)ixq.f, (View$OnClickListener)new ixg(ixq, 4));
                        acwb.n((acwd)d2.a());
                        teu.m(((tmx)((bhv)ixq.b.a()).a).b((aezf)new fqt(h - 1, 1)), (tes)etj.l);
                    }
                }
                return;
            }
            case 4: {
                ((kuk)((ixq)this.a).d.a()).k(view, (Set)afft.s((Object)0));
                return;
            }
            case 3: {
                final Object a4 = this.a;
                final aicz aicz2 = (aicz)((fxx)a4).b;
                if (aicz2 != null) {
                    final int b3 = aicz2.b;
                    if ((0x10000 & b3) != 0x0) {
                        if ((b3 & 0x800000) != 0x0) {
                            ((MusicAppDeeplinkButtonController)a4).e.J(3, (wzz)new wyt(aicz2.w), (alhi)null);
                        }
                        final vcy d3 = ((MusicAppDeeplinkButtonController)this.a).d;
                        aiqj aiqj3;
                        if ((aiqj3 = aicz2.p) == null) {
                            aiqj3 = aiqj.a;
                        }
                        d3.a(aiqj3);
                    }
                }
                return;
            }
            case 2: {
                ((ixj)this.a).b(false);
                return;
            }
            case 1: {
                final ixc a5 = ((ixj)this.a).a;
                final abbs d4 = a5.d;
                if (d4 != null) {
                    d4.oE();
                }
                final abcx e2 = a5.e;
                if (e2 != null) {
                    e2.b();
                }
                return;
            }
            case 0: {
                ((ixj)this.a).b(true);
            }
        }
    }
}
