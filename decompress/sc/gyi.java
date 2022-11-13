import java.util.List;
import com.google.android.libraries.youtube.player.ui.PlayerView;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.ViewGroup$LayoutParams;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import android.widget.ImageView$ScaleType;
import com.google.android.libraries.youtube.creation.common.ui.ShortsEditToolButtonView;
import com.google.android.libraries.youtube.creation.music.ShortsCreationSelectedTrack;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.search.MusicSearchSuggestionsController;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.timeline.TimelineSeekBar;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gyi implements asjm
{
    public final Object a;
    private final int b;
    
    public gyi(final TimelineSeekBar a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gyi(final MusicSearchSuggestionsController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gyi(final gyo a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gyi(final gyy a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gyi(final gzz a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gyi(final hac a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gyi(final haj a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gyi(final hcd a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gyi(final hcv a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gyi(final hdf a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gyi(final hdm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gyi(final het a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gyi(final khd a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public gyi(final txx a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(Object layoutParams) {
        final int b = this.b;
        final aiqj aiqj = null;
        switch (b) {
            default: {
                final Object a = this.a;
                final uby al = (uby)layoutParams;
                final het het = (het)a;
                het.al = al;
                het.af = true;
                het.al.N(het.aB);
                return;
            }
            case 19: {
                final Object a2 = this.a;
                final agoe agoe = (agoe)layoutParams;
                final MusicSearchSuggestionsController musicSearchSuggestionsController = (MusicSearchSuggestionsController)a2;
                if (musicSearchSuggestionsController.j != null) {
                    if (musicSearchSuggestionsController.l != null) {
                        musicSearchSuggestionsController.e.pF().l((wzz)new wyt(((akyu)agoe.a).d));
                        musicSearchSuggestionsController.l.a();
                        musicSearchSuggestionsController.m.setVisibility(0);
                        musicSearchSuggestionsController.n.setVisibility(8);
                        ((acns)musicSearchSuggestionsController.j).N(agoe.b());
                    }
                }
                return;
            }
            case 18: {
                ((hdm)this.a).A((aezp)layoutParams);
                return;
            }
            case 17: {
                final Object a3 = this.a;
                final aezp aezp = (aezp)layoutParams;
                if (aezp.h() && !aezr.f(((ShortsCreationSelectedTrack)aezp.c()).m())) {
                    final ShortsCreationSelectedTrack shortsCreationSelectedTrack = (ShortsCreationSelectedTrack)aezp.c();
                    final hdf hdf = (hdf)a3;
                    final xab b2 = hdf.e.b;
                    if (b2 != null) {
                        final twx cg = hdf.n.cG(b2);
                        cg.b = (ahbh)hdf.i;
                        cg.h();
                    }
                    final xab a4 = hdf.e.a;
                    if (a4 != null) {
                        final twx cg2 = hdf.n.cG(a4);
                        cg2.b = (ahbh)hdf.i;
                        cg2.f();
                    }
                    final TextView f = hdf.f;
                    if (f != null) {
                        f.setText((CharSequence)shortsCreationSelectedTrack.m());
                    }
                    if (hdf.l && hdf.k) {
                        final View b3 = hdf.b;
                        ((ShortsEditToolButtonView)b3).a(b3.getContext().getString(2132019757));
                    }
                    if (hdf.k) {
                        hdf.b.setContentDescription((CharSequence)String.format("%1$s\n%2$s", shortsCreationSelectedTrack.m(), hdf.b.getContext().getString(2132017467)));
                    }
                    if (hdf.g != null) {
                        final achb h = hdf.h;
                        if (h != null) {
                            h.l(shortsCreationSelectedTrack.k(), (tpn)new hdd(hdf));
                            hdf.g.setScaleType(ImageView$ScaleType.CENTER_CROP);
                            hdf.g.setBackground(hdf.b.getContext().getDrawable(2131233260));
                            hdf.g.setClipToOutline(true);
                        }
                    }
                }
                else {
                    final hdf hdf2 = (hdf)a3;
                    final xab b4 = hdf2.e.b;
                    if (b4 != null) {
                        final twx cg3 = hdf2.n.cG(b4);
                        cg3.b = (ahbh)hdf2.i;
                        cg3.f();
                    }
                    final xab a5 = hdf2.e.a;
                    if (a5 != null) {
                        final twx cg4 = hdf2.n.cG(a5);
                        cg4.b = (ahbh)hdf2.i;
                        cg4.h();
                    }
                    final TextView f2 = hdf2.f;
                    if (f2 != null) {
                        f2.setText(2132017574);
                    }
                    if (hdf2.l && hdf2.k) {
                        final View b5 = hdf2.b;
                        ((ShortsEditToolButtonView)b5).a(b5.getContext().getString(2132019758));
                    }
                    if (hdf2.k) {
                        hdf2.b.setContentDescription((CharSequence)null);
                    }
                    hdf2.e();
                }
                final TextView f3 = ((hdf)a3).f;
                if (f3 != null) {
                    f3.setSelected(true);
                }
                return;
            }
            case 16: {
                final Object a6 = this.a;
                if (((aanw)layoutParams).f()) {
                    final hcv hcv = (hcv)a6;
                    final String s = hcv.a.s();
                    if (s != null) {
                        final PlayerView c = hcv.c;
                        if (c != null) {
                            if (c.getVisibility() != 0 || !s.equals(hcv.d)) {
                                final abvx p = hcv.a.p();
                                if (p != null && p.d() != null) {
                                    final List s2 = p.d().n().s;
                                    if (!s2.isEmpty()) {
                                        final PlayerView c2 = hcv.c;
                                        if (c2 != null) {
                                            final FormatStreamModel formatStreamModel = s2.get(0);
                                            int i = formatStreamModel.i();
                                            final int d = formatStreamModel.d();
                                            int n;
                                            if (i < 0 || (n = d) < 0) {
                                                n = 720;
                                                i = 1280;
                                            }
                                            float n3;
                                            final float n2 = n3 = 0.0f;
                                            if (n > 0) {
                                                n3 = n2;
                                                if (i > 0) {
                                                    n3 = i / (float)n;
                                                }
                                            }
                                            final PlayerView c3 = hcv.c;
                                            if (c3 == null) {
                                                layoutParams = new ViewGroup$LayoutParams(0, 0);
                                            }
                                            else {
                                                layoutParams = c3.getLayoutParams();
                                                final int intValue = (int)tpe.bi(hcv.b).first;
                                                final double n4 = n3;
                                                double n7 = 0.0;
                                                Label_1078: {
                                                    double n8 = 0.0;
                                                    Label_1072: {
                                                        if (afsh.a(n4, 1.777999997138977, 0.01) < 0) {
                                                            double n5;
                                                            if (afsh.a(n4, 1.3329999446868896, 0.01) >= 0) {
                                                                n5 = intValue;
                                                                Double.isNaN(n5);
                                                            }
                                                            else {
                                                                if (afsh.a(n4, 0.75, 0.01) > 0) {
                                                                    final double n6 = intValue;
                                                                    Double.isNaN(n6);
                                                                    n7 = n6 * 0.3;
                                                                    break Label_1078;
                                                                }
                                                                if (afsh.a(n4, 0.5630000233650208, 0.01) <= 0) {
                                                                    n8 = intValue;
                                                                    Double.isNaN(n8);
                                                                    break Label_1072;
                                                                }
                                                                n5 = intValue;
                                                                Double.isNaN(n5);
                                                            }
                                                            n7 = n5 * 0.35;
                                                            break Label_1078;
                                                        }
                                                        n8 = intValue;
                                                        Double.isNaN(n8);
                                                    }
                                                    n7 = n8 * 0.4;
                                                }
                                                final int n9 = (int)n7;
                                                if (afsh.a(n4, 1.0, 0.01) == 0) {
                                                    ((ViewGroup$LayoutParams)layoutParams).width = n9;
                                                    ((ViewGroup$LayoutParams)layoutParams).height = n9;
                                                }
                                                else if (afsh.a(n4, 1.0, 0.01) > 0) {
                                                    ((ViewGroup$LayoutParams)layoutParams).width = n9;
                                                    ((ViewGroup$LayoutParams)layoutParams).height = (int)(n9 / n3);
                                                }
                                                else {
                                                    ((ViewGroup$LayoutParams)layoutParams).height = n9;
                                                    ((ViewGroup$LayoutParams)layoutParams).width = (int)(n9 * n3);
                                                }
                                            }
                                            c2.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                                            hcv.c.setVisibility(0);
                                            hcv.d = s;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return;
            }
            case 15: {
                ((hcd)this.a).au = (ucd)layoutParams;
                return;
            }
            case 14: {
                ((haj)this.a).h((int)layoutParams);
                return;
            }
            case 13: {
                ((haj)this.a).m((boolean)layoutParams);
                return;
            }
            case 12: {
                final Object a7 = this.a;
                final int intValue2 = (int)layoutParams;
                final haj haj = (haj)a7;
                if (haj.l) {
                    final ual k = haj.k;
                    if (k != null) {
                        haj.b();
                        k.p((long)intValue2);
                    }
                    haj.l = false;
                }
                return;
            }
            case 11: {
                final Object a8 = this.a;
                final int a9 = ((atwt)layoutParams).a;
                ((acjg)a8).u();
                return;
            }
            case 10: {
                final Object a10 = this.a;
                final Boolean b6 = (Boolean)layoutParams;
                ((gzz)a10).a();
                return;
            }
            case 9: {
                ((TimelineSeekBar)this.a).e((long)layoutParams);
                return;
            }
            case 8: {
                final Object a11 = this.a;
                final Boolean b7 = (Boolean)layoutParams;
                final TimelineSeekBar timelineSeekBar = (TimelineSeekBar)a11;
                if (timelineSeekBar.e.ah()) {
                    timelineSeekBar.f();
                    return;
                }
                timelineSeekBar.removeCallbacks(timelineSeekBar.d);
                timelineSeekBar.d();
                return;
            }
            case 7: {
                final Object a12 = this.a;
                if (layoutParams) {
                    final TimelineSeekBar timelineSeekBar2 = (TimelineSeekBar)a12;
                    timelineSeekBar2.c.setMax((int)timelineSeekBar2.e.I());
                    timelineSeekBar2.f();
                    return;
                }
                final TimelineSeekBar timelineSeekBar3 = (TimelineSeekBar)a12;
                timelineSeekBar3.removeCallbacks(timelineSeekBar3.d);
                return;
            }
            case 6: {
                final Object a13 = this.a;
                final aezp aezp2 = (aezp)layoutParams;
                if (aezp2.h()) {
                    ((gyy)a13).a = new gza((ShortsCreationSelectedTrack)aezp2.c());
                }
                else {
                    ((gyy)a13).a = null;
                }
                ((acjg)a13).u();
                return;
            }
            case 5: {
                final Object a14 = this.a;
                final Boolean b8 = (Boolean)layoutParams;
                final khd khd = (khd)a14;
                final wyw g = ((uho)khd.c).g;
                aiqj ce = aiqj;
                if (g != null) {
                    ce = aeea.cE(g, aiqj.a, 117497);
                }
                ((gzs)khd.b).f(Long.MIN_VALUE, ce);
                return;
            }
            case 4: {
                final Object a15 = this.a;
                final Boolean b9 = (Boolean)layoutParams;
                final khd khd2 = (khd)a15;
                ((gzs)khd2.b).k();
                ((uho)khd2.c).k(aeea.cE((wyw)((gzs)khd2.b).k().a, aiqj.a, 116666));
                return;
            }
            case 3: {
                final Object a16 = this.a;
                final boolean booleanValue = (boolean)layoutParams;
                final khd khd3 = (khd)a16;
                ((ImageView)khd3.a).setEnabled(booleanValue);
                vdh.P(((ImageView)khd3.a).getContext(), (ImageView)khd3.a, booleanValue);
                return;
            }
            case 2: {
                final Object a17 = this.a;
                final Boolean b10 = (Boolean)layoutParams;
                final gyo gyo = (gyo)a17;
                if (gyo.p && !b10) {
                    gyo.m.r(gyo.l.v());
                }
                gyo.w.o((boolean)b10);
                return;
            }
            case 1: {
                final Object a18 = this.a;
                final boolean booleanValue2 = (boolean)layoutParams;
                final gyo gyo2 = (gyo)a18;
                gyo2.w.o(booleanValue2);
                aqzv aqzv;
                if (booleanValue2) {
                    aqzv = aqzv.c;
                }
                else {
                    aqzv = aqzv.b;
                }
                aqzv.toString();
                gyo2.g.q(aqzv);
                if (!booleanValue2) {
                    gyo2.c.h();
                }
                return;
            }
            case 0: {
                ((txx)this.a).o((boolean)layoutParams);
            }
        }
    }
}
