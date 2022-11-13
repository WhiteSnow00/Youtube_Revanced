import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import android.view.View;
import android.widget.TextView;
import android.widget.FrameLayout;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import android.text.Spanned;
import android.text.SpannedString;
import android.view.View$OnClickListener;
import android.graphics.Rect;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
import com.google.android.apps.youtube.app.player.overlay.YouTubeControlsOverlay;
import com.google.android.apps.youtube.app.player.overlay.SubtitleButtonController;
import com.google.android.apps.youtube.app.player.overlay.SizeAdjustableOverlayWrapperLayout;
import com.google.android.apps.youtube.app.player.overlay.RepeatChapterPlaybackLoopController;
import com.google.android.apps.youtube.app.player.overlay.PipPaidProductBadgeOverlay;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ixr implements asjm
{
    public final Object a;
    private final int b;
    
    public ixr(final PipPaidProductBadgeOverlay a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ixr(final RepeatChapterPlaybackLoopController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ixr(final SizeAdjustableOverlayWrapperLayout a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ixr(final SubtitleButtonController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ixr(final YouTubeControlsOverlay a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ixr(final ixs a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ixr(final ixv a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ixr(final ixw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ixr(final iyb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ixr(final iyd a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ixr(final iys a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ixr(final iyt a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final Object o) {
        final int b = this.b;
        final Spanned spanned = null;
        final ajmo ajmo = null;
        boolean c = true;
        final boolean b2 = true;
        switch (b) {
            default: {
                final Object a = this.a;
                if (o) {
                    ((YouTubeControlsOverlay)a).Y(true);
                    return;
                }
                break;
            }
            case 19: {
                final Object a2 = this.a;
                if (((abkh)o).i == 15) {
                    final YouTubeControlsOverlay youTubeControlsOverlay = (YouTubeControlsOverlay)a2;
                    youTubeControlsOverlay.d.b(youTubeControlsOverlay.s);
                    return;
                }
                final YouTubeControlsOverlay youTubeControlsOverlay2 = (YouTubeControlsOverlay)a2;
                youTubeControlsOverlay2.d.a(youTubeControlsOverlay2.s);
                return;
            }
            case 18: {
                final Object a3 = this.a;
                final boolean booleanValue = (boolean)o;
                final iyt iyt = (iyt)a3;
                iyt.l = booleanValue;
                iyt.a();
                return;
            }
            case 17: {
                final Object a4 = this.a;
                final boolean booleanValue2 = (boolean)o;
                final iys iys = (iys)a4;
                final ktn r = iys.r;
                if (r == null) {
                    return;
                }
                final aidi n = iys.n;
                if (n != null) {
                    final int b3 = n.b;
                    if ((b3 & 0x1000) != 0x0 && (b3 & 0x20) != 0x0) {
                        final TouchImageView touchImageView = (TouchImageView)((toz)r.d).a;
                        final gfk b4 = iys.b;
                        akdh akdh;
                        if (booleanValue2) {
                            akdi akdi;
                            if ((akdi = n.m) == null) {
                                akdi = akdi.a;
                            }
                            if ((akdh = akdh.b(akdi.c)) == null) {
                                akdh = akdh.a;
                            }
                        }
                        else {
                            akdi akdi2;
                            if ((akdi2 = n.g) == null) {
                                akdi2 = akdi.a;
                            }
                            if ((akdh = akdh.b(akdi2.c)) == null) {
                                akdh = akdh.a;
                            }
                        }
                        touchImageView.setImageResource(b4.a(akdh));
                        final TouchImageView touchImageView2 = (TouchImageView)((toz)iys.r.d).a;
                        String contentDescription;
                        if (booleanValue2) {
                            contentDescription = n.o;
                        }
                        else {
                            contentDescription = n.i;
                        }
                        touchImageView2.setContentDescription((CharSequence)contentDescription);
                        return;
                    }
                }
                iys.a.i = false;
                return;
            }
            case 16: {
                final Object a5 = this.a;
                final aanl aanl = (aanl)o;
                final SubtitleButtonController subtitleButtonController = (SubtitleButtonController)a5;
                if (!subtitleButtonController.c) {
                    return;
                }
                subtitleButtonController.D(aanl.a());
                return;
            }
            case 15: {
                final Object a6 = this.a;
                final boolean a7 = ((aanm)o).a();
                final SubtitleButtonController subtitleButtonController2 = (SubtitleButtonController)a6;
                if (a7) {
                    subtitleButtonController2.c = true;
                    return;
                }
                subtitleButtonController2.c = false;
                subtitleButtonController2.D((SubtitleTrack)null);
                return;
            }
            case 14: {
                final Object a8 = this.a;
                final aani aani = (aani)o;
                final abkb c2 = aani.c();
                final SubtitleButtonController subtitleButtonController3 = (SubtitleButtonController)a8;
                subtitleButtonController3.d = c2;
                if (subtitleButtonController3.f.isPresent() && aani.c() == abkb.d) {
                    subtitleButtonController3.e.pF().D((wzz)new wyt((xab)subtitleButtonController3.f.get()));
                }
                return;
            }
            case 13: {
                ((SizeAdjustableOverlayWrapperLayout)this.a).g((Rect)o);
                return;
            }
            case 12: {
                final Object a9 = this.a;
                final aazu aazu = (aazu)o;
                final RepeatChapterPlaybackLoopController repeatChapterPlaybackLoopController = (RepeatChapterPlaybackLoopController)a9;
                repeatChapterPlaybackLoopController.f.k(true);
                if (aazu.a() == 0) {
                    final gbu gbu = (gbu)repeatChapterPlaybackLoopController.a.a();
                    final gbv gbv = (gbv)gbu.j();
                    gbv.k((CharSequence)repeatChapterPlaybackLoopController.b.getResources().getString(2132017694));
                    gbv.j();
                    gbu.n((acwd)gbv.a());
                    return;
                }
                if (aazu.a() == 1) {
                    final gbu gbu2 = (gbu)repeatChapterPlaybackLoopController.a.a();
                    final gbv gbv2 = (gbv)gbu2.j();
                    gbv2.k((CharSequence)repeatChapterPlaybackLoopController.b.getResources().getString(2132017694));
                    ((acwc)gbv2).m((CharSequence)repeatChapterPlaybackLoopController.b.getResources().getString(2132017695), (View$OnClickListener)new ixg(repeatChapterPlaybackLoopController, 6));
                    gbv2.j();
                    gbu2.n((acwd)gbv2.a());
                }
                ++repeatChapterPlaybackLoopController.h;
                final TimelineMarker b5 = repeatChapterPlaybackLoopController.f.b(abea.f);
                if (b5 != null && b5.d != null) {
                    repeatChapterPlaybackLoopController.d.l(2000L, 200L, 200L, repeatChapterPlaybackLoopController.e.e((Spanned)new SpannedString((CharSequence)repeatChapterPlaybackLoopController.b.getResources().getString(2132017697, new Object[] { b5.c + 1 })), (Spanned)new SpannedString(b5.d), ahab.b));
                }
                return;
            }
            case 11: {
                ((RepeatChapterPlaybackLoopController)this.a).i = ((aanf)o).d();
                return;
            }
            case 10: {
                final Object a10 = this.a;
                final aazn aazn = (aazn)o;
                final RepeatChapterPlaybackLoopController repeatChapterPlaybackLoopController2 = (RepeatChapterPlaybackLoopController)a10;
                final ouf j = repeatChapterPlaybackLoopController2.j;
                if (j.c != null) {
                    final vfw c3 = ((vfp)((vdr)j.a).a(((zmf)j.b).c())).c();
                    final Object c4 = j.c;
                    c4.getClass();
                    c3.g((String)c4);
                    c3.b().W((asjg)gex.p, (asjm)aaof.q);
                }
                repeatChapterPlaybackLoopController2.f.k(false);
                final anvd a11 = anve.a();
                final long n2 = repeatChapterPlaybackLoopController2.h;
                a11.copyOnWrite();
                anve.c((anve)a11.instance, n2);
                final String i = repeatChapterPlaybackLoopController2.i;
                if (i != null) {
                    a11.copyOnWrite();
                    anve.d((anve)a11.instance, i);
                }
                final aknr d = aknt.d();
                ((ahaz)d).copyOnWrite();
                aknt.aa((aknt)d.instance, (anve)a11.build());
                repeatChapterPlaybackLoopController2.g.d((aknt)((ahaz)d).build());
                repeatChapterPlaybackLoopController2.h = 0;
                return;
            }
            case 9: {
                ((iyd)this.a).d = (int)o;
                return;
            }
            case 8: {
                final Object a12 = this.a;
                final aans aans = (aans)o;
                boolean k = b2;
                if (aans.c() != abke.e) {
                    k = (aans.c() == abke.f && b2);
                }
                final iyb iyb = (iyb)a12;
                if (iyb.k != k) {
                    iyb.k = k;
                    iyb.b(false);
                }
                return;
            }
            case 7: {
                final Object a13 = this.a;
                final WatchNextResponseModel a14 = ((aani)o).a();
                if (a14 == null) {
                    return;
                }
                final alem a15 = a14.a;
                aldx aldx;
                if ((aldx = a15.g) == null) {
                    aldx = aldx.a;
                }
                angl a16;
                if (aldx.b == 78882851) {
                    a16 = (angl)aldx.c;
                }
                else {
                    a16 = angl.a;
                }
                anuv anuv;
                if ((anuv = a16.m) == null) {
                    anuv = anuv.a;
                }
                ajmo ajmo2;
                if (!anuv.ry((ahaq)ElementRendererOuterClass.elementRenderer)) {
                    ajmo2 = ajmo;
                }
                else {
                    aldx aldx2;
                    if ((aldx2 = a15.g) == null) {
                        aldx2 = aldx.a;
                    }
                    angl a17;
                    if (aldx2.b == 78882851) {
                        a17 = (angl)aldx2.c;
                    }
                    else {
                        a17 = angl.a;
                    }
                    anuv anuv2;
                    if ((anuv2 = a17.m) == null) {
                        anuv2 = anuv.a;
                    }
                    ajmo2 = (ajmo)anuv2.rx((ahaq)ElementRendererOuterClass.elementRenderer);
                }
                ((iyb)a13).c(ajmo2);
                return;
            }
            case 6: {
                final Object a18 = this.a;
                final boolean booleanValue3 = (boolean)o;
                final iyb iyb2 = (iyb)a18;
                iyb2.m = booleanValue3;
                iyb2.b(false);
                return;
            }
            case 5: {
                final Object a19 = this.a;
                final boolean booleanValue4 = (boolean)o;
                final iyb iyb3 = (iyb)a19;
                iyb3.l = booleanValue4;
                iyb3.b(false);
                return;
            }
            case 4: {
                final Object a20 = this.a;
                if (((aanf)o).b() == abka.a) {
                    ((ixw)a20).a();
                }
                return;
            }
            case 3: {
                final Object a21 = this.a;
                final aani aani2 = (aani)o;
                final ixw ixw = (ixw)a21;
                if (ixw.e != null) {
                    if (aani2.c() == abkb.a) {
                        ixw.a();
                        return;
                    }
                    final WatchNextResponseModel a22 = aani2.a();
                    if (aani2.c() == abkb.e && a22 != null) {
                        final angl l = a22.i;
                        if (l != null && (l.b & 0x200000) != 0x0) {
                            anuv anuv3;
                            if ((anuv3 = l.p) == null) {
                                anuv3 = anuv.a;
                            }
                            if (anuv3.ry((ahaq)ElementRendererOuterClass.elementRenderer)) {
                                final ajmo ajmo3 = (ajmo)anuv3.rx((ahaq)ElementRendererOuterClass.elementRenderer);
                                final acbj d2 = ixw.b.d(ajmo3);
                                ixw.d.D((wzz)new wyt(ajmo3.e));
                                ixw.a.b(ixw.c, d2);
                                final FrameLayout e = ixw.e;
                                if (e != null) {
                                    e.removeAllViews();
                                    ixw.e.addView(ixw.a.a());
                                    ixw.e.setVisibility(0);
                                }
                            }
                        }
                    }
                }
                return;
            }
            case 2: {
                final Object a23 = this.a;
                if (o instanceof ajmo) {
                    final ixu m = ((ixv)a23).i;
                    final ajmo ajmo4 = (ajmo)o;
                    final ixt ixt = (ixt)m;
                    final ixv a24 = ixt.a;
                    final TextView g = a24.g;
                    final View f = a24.f;
                    if (g != null) {
                        if (f != null) {
                            f.setVisibility(0);
                            g.setVisibility(8);
                            final ixv a25 = ixt.a;
                            a25.b.b(a25.d, ((accf)a25.c.a()).d(ajmo4));
                        }
                    }
                }
                else if (o instanceof CharSequence) {
                    final ixu h = ((ixv)a23).h;
                    final CharSequence text = (CharSequence)o;
                    final ixv a26 = ((ixt)h).a;
                    final TextView g2 = a26.g;
                    final View f2 = a26.f;
                    if (g2 != null && f2 != null) {
                        g2.setVisibility(0);
                        f2.setVisibility(8);
                        g2.setText(text);
                    }
                }
                return;
            }
            case 1: {
                final Object a27 = this.a;
                final aans aans2 = (aans)o;
                if (aans2.c() == abke.a) {
                    final PipPaidProductBadgeOverlay pipPaidProductBadgeOverlay = (PipPaidProductBadgeOverlay)a27;
                    pipPaidProductBadgeOverlay.j();
                    pipPaidProductBadgeOverlay.d = 10000L;
                }
                final boolean a28 = aans2.c().a(new abke[] { abke.d, abke.e, abke.f });
                final PipPaidProductBadgeOverlay pipPaidProductBadgeOverlay2 = (PipPaidProductBadgeOverlay)a27;
                pipPaidProductBadgeOverlay2.b = a28;
                final PlayerResponseModel b6 = aans2.b();
                Label_2151: {
                    if (b6 != null) {
                        akwv akwv;
                        if ((akwv = b6.z().C) == null) {
                            akwv = akwv.a;
                        }
                        amyj a29;
                        if (akwv.b == 130741768) {
                            a29 = (amyj)akwv.c;
                        }
                        else {
                            a29 = amyj.a;
                        }
                        if (a29.g) {
                            break Label_2151;
                        }
                    }
                    c = false;
                }
                pipPaidProductBadgeOverlay2.c = c;
                pipPaidProductBadgeOverlay2.l();
                return;
            }
            case 0: {
                final Object a30 = this.a;
                final aani aani3 = (aani)o;
                if (aani3.c().b(abkb.e)) {
                    ((ixs)a30).b(aani3.a());
                    return;
                }
                if (aani3.c().b(abkb.d)) {
                    final PlayerResponseModel b7 = aani3.b();
                    Spanned b8;
                    if (b7 == null) {
                        b8 = spanned;
                    }
                    else {
                        final ahbb ahbb = (ahbb)((ahbh)ajut.a).createBuilder();
                        final String j2 = b7.J();
                        ((ahaz)ahbb).copyOnWrite();
                        final ajut ajut = (ajut)ahbb.instance;
                        j2.getClass();
                        ajut.b |= 0x1;
                        ajut.d = j2;
                        b8 = acak.b((ajut)((ahaz)ahbb).build());
                    }
                    ((ixs)a30).a(b8);
                    return;
                }
                ((ixs)a30).b(null);
                break;
            }
        }
    }
}
