import com.google.android.libraries.youtube.common.ui.TouchImageView;
import java.util.Iterator;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.Map;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View$OnClickListener;
import android.view.View;
import android.text.Spanned;
import com.google.android.apps.youtube.app.player.overlay.OverlayVerticalDragEngagementPanelResizeInputSource$1;
import com.google.android.apps.youtube.app.player.overlay.NoSoundMemoOverlay;
import com.google.android.apps.youtube.app.player.overlay.MusicAppDeeplinkButtonController;
import com.google.android.apps.youtube.app.player.overlay.MiniPlayerErrorOverlay;
import com.google.android.apps.youtube.app.player.overlay.InteractiveInlineMutedControlsOverlay;
import com.google.android.apps.youtube.app.player.overlay.InlineMutedScrimOverlayRedirectController;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iwk implements asjm
{
    public final Object a;
    private final int b;
    
    public iwk(final TextView a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public iwk(final atjm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public iwk(final InlineMutedScrimOverlayRedirectController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public iwk(final InteractiveInlineMutedControlsOverlay a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public iwk(final MiniPlayerErrorOverlay a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public iwk(final MusicAppDeeplinkButtonController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public iwk(final NoSoundMemoOverlay a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public iwk(final OverlayVerticalDragEngagementPanelResizeInputSource$1 a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public iwk(final iwb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public iwk(final iwq a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public iwk(final ixj a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final Object o) {
        final int b = this.b;
        boolean b2 = false;
        final Spanned spanned = null;
        final ajut ajut = null;
        switch (b) {
            default: {
                ((OverlayVerticalDragEngagementPanelResizeInputSource$1)this.a).a.e = (boolean)o;
                return;
            }
            case 19: {
                final Object a = this.a;
                final Integer n = (Integer)o;
                ((NoSoundMemoOverlay)a).l();
                return;
            }
            case 18: {
                final Object a2 = this.a;
                final aans aans = (aans)o;
                if (aans.c() != null && !aans.c().h()) {
                    final PlayerResponseModel b3 = aans.b();
                    akxi z;
                    if (b3 != null) {
                        z = b3.z();
                    }
                    else {
                        z = null;
                    }
                    anej anej = null;
                    Label_0282: {
                        if (z != null) {
                            akxc akxc;
                            if ((akxc = z.D) == null) {
                                akxc = akxc.a;
                            }
                            if ((akxc.b & 0x1) != 0x0) {
                                akxc akxc2;
                                if ((akxc2 = z.D) == null) {
                                    akxc2 = akxc.a;
                                }
                                if ((anej = akxc2.c) == null) {
                                    anej = anej.a;
                                }
                                break Label_0282;
                            }
                        }
                        anej = null;
                    }
                    anek anek = null;
                    Label_0357: {
                        if (anej != null) {
                            anel anel;
                            if ((anel = anej.f) == null) {
                                anel = anel.a;
                            }
                            if ((anel.b & 0x1) != 0x0) {
                                anel anel2;
                                if ((anel2 = anej.f) == null) {
                                    anel2 = anel.a;
                                }
                                if ((anek = anel2.c) == null) {
                                    anek = anek.a;
                                }
                                break Label_0357;
                            }
                        }
                        anek = null;
                    }
                    Spanned b4 = spanned;
                    if (anek != null) {
                        ajut ajut2 = ajut;
                        if ((anek.b & 0x1) != 0x0 && (ajut2 = anek.c) == null) {
                            ajut2 = ajut.a;
                        }
                        b4 = acak.b(ajut2);
                    }
                    ((NoSoundMemoOverlay)a2).k(b4);
                    return;
                }
                ((NoSoundMemoOverlay)a2).k((Spanned)null);
                return;
            }
            case 17: {
                final Object a3 = this.a;
                final WatchNextResponseModel a4 = ((aani)o).a();
                if (a4 != null) {
                    final angl i = a4.i;
                    if (i != null) {
                        for (final angb angb : i.d) {
                            aicz aicz;
                            if ((aicz = angb.c) == null) {
                                aicz = aicz.a;
                            }
                            akdi akdi;
                            if ((akdi = aicz.g) == null) {
                                akdi = akdi.a;
                            }
                            if ((akdi.b & 0x1) != 0x0) {
                                aicz aicz2;
                                if ((aicz2 = angb.c) == null) {
                                    aicz2 = aicz.a;
                                }
                                akdi akdi2;
                                if ((akdi2 = aicz2.g) == null) {
                                    akdi2 = akdi.a;
                                }
                                akdh akdh;
                                if ((akdh = akdh.b(akdi2.c)) == null) {
                                    akdh = akdh.a;
                                }
                                if (akdh == akdh.kg || akdh == akdh.jd) {
                                    aicz aicz3;
                                    if ((aicz3 = angb.c) == null) {
                                        aicz3 = aicz.a;
                                    }
                                    ((fxx)a3).n((Object)aicz3);
                                    return;
                                }
                                continue;
                            }
                        }
                        final fxx fxx = (fxx)a3;
                        fxx.o(false, false);
                        fxx.n((Object)null);
                    }
                }
                return;
            }
            case 16: {
                final Object a5 = this.a;
                final aanw aanw = (aanw)o;
                final MiniPlayerErrorOverlay miniPlayerErrorOverlay = (MiniPlayerErrorOverlay)a5;
                final boolean b5 = miniPlayerErrorOverlay.b;
                if (aanw.a() == 8) {
                    b2 = true;
                }
                if (b5 != (miniPlayerErrorOverlay.b = b2)) {
                    miniPlayerErrorOverlay.j();
                }
                return;
            }
            case 15: {
                final Object a6 = this.a;
                final abkh abkh = (abkh)o;
                final MiniPlayerErrorOverlay miniPlayerErrorOverlay2 = (MiniPlayerErrorOverlay)a6;
                final boolean b6 = miniPlayerErrorOverlay2.b;
                final boolean b7 = aakv.b(abkh.i);
                miniPlayerErrorOverlay2.b = b7;
                if (b6 != b7) {
                    miniPlayerErrorOverlay2.j();
                }
                return;
            }
            case 14: {
                final Object a7 = this.a;
                final boolean booleanValue = (boolean)o;
                final ixj ixj = (ixj)a7;
                ixj.l = booleanValue;
                if (ixj.J.cD()) {
                    ixj.d();
                    return;
                }
                ixj.c();
                return;
            }
            case 13: {
                ((atjm)this.a).tu((Object)o);
                return;
            }
            case 12: {
                ((View)this.a).setOnClickListener((View$OnClickListener)o);
                return;
            }
            case 11: {
                ((TextView)this.a).setText((CharSequence)o);
                return;
            }
            case 10: {
                ((View)this.a).setVisibility((int)o);
                return;
            }
            case 9: {
                final Object a8 = this.a;
                final aanf aanf = (aanf)o;
                final String d = aanf.d();
                final InteractiveInlineMutedControlsOverlay interactiveInlineMutedControlsOverlay = (InteractiveInlineMutedControlsOverlay)a8;
                interactiveInlineMutedControlsOverlay.n = d;
                if (aanf.b().a(new abka[] { abka.h })) {
                    interactiveInlineMutedControlsOverlay.o = null;
                }
                else if (aanf.b().a(new abka[] { abka.b, abka.f })) {
                    final PlayerResponseModel a9 = aanf.a();
                    if (!adkp.ae((Object)a9, (Object)interactiveInlineMutedControlsOverlay.o)) {
                        interactiveInlineMutedControlsOverlay.o = a9;
                    }
                }
                final iwj j = interactiveInlineMutedControlsOverlay.i;
                if (j != null) {
                    j.a = interactiveInlineMutedControlsOverlay.o;
                }
                return;
            }
            case 8: {
                final Object a10 = this.a;
                final aanb aanb = (aanb)o;
                final InteractiveInlineMutedControlsOverlay interactiveInlineMutedControlsOverlay2 = (InteractiveInlineMutedControlsOverlay)a10;
                final TouchImageView w = interactiveInlineMutedControlsOverlay2.w;
                if (w == null) {
                    return;
                }
                Drawable imageDrawable;
                if (aanb.a()) {
                    imageDrawable = interactiveInlineMutedControlsOverlay2.d.getResources().getDrawable(2131233926);
                }
                else {
                    imageDrawable = interactiveInlineMutedControlsOverlay2.d.getResources().getDrawable(2131233928);
                }
                w.setImageDrawable(imageDrawable);
                return;
            }
            case 7: {
                final Object a11 = this.a;
                final Boolean b8 = (Boolean)o;
                final InteractiveInlineMutedControlsOverlay interactiveInlineMutedControlsOverlay3 = (InteractiveInlineMutedControlsOverlay)a11;
                final iwh e = interactiveInlineMutedControlsOverlay3.E;
                if (e != null) {
                    final glm c = e.c;
                    if (c != null && c.h().isPresent()) {
                        interactiveInlineMutedControlsOverlay3.B();
                    }
                }
                return;
            }
            case 6: {
                ((InteractiveInlineMutedControlsOverlay)this.a).p = (boolean)o;
                return;
            }
            case 5: {
                final Object a12 = this.a;
                final akfp akfp = (akfp)o;
                final iwq iwq = (iwq)a12;
                if (iwq.i.equals(akfp.getVideoId())) {
                    if (akfp.getCaptionVisibilityStatus() != akfr.d && akfp.getCaptionVisibilityStatus() != akfr.a && !akfp.getIsCaptionStateUpdatedByUser()) {
                        iwq.c.h(false);
                    }
                }
                return;
            }
            case 4: {
                final Object a13 = this.a;
                final akfl akfl = (akfl)o;
                final iwq iwq2 = (iwq)a13;
                if (iwq2.i.equals(akfl.getVideoId())) {
                    iwq2.b.k(akfl.getIsAudioMuted());
                }
                return;
            }
            case 3: {
                final Object a14 = this.a;
                final aanf aanf2 = (aanf)o;
                final iwq iwq3 = (iwq)a14;
                if (iwq3.j.aZ()) {
                    if (aanf2.b() == abka.b && aanf2.a() != null) {
                        final PlayerResponseModel a15 = aanf2.a();
                        a15.getClass();
                        if (a15.K() != null) {
                            final PlayerResponseModel a16 = aanf2.a();
                            a16.getClass();
                            iwq3.c.g((tcc)new kbv(iwq3, a16.K(), 1));
                        }
                    }
                }
                return;
            }
            case 2: {
                ((InlineMutedScrimOverlayRedirectController)this.a).b = (fkr)o;
                return;
            }
            case 1: {
                final Object a17 = this.a;
                final aant aant = (aant)o;
                final long f = aant.f();
                final iwb iwb = (iwb)a17;
                if (f == iwb.i) {
                    return;
                }
                iwb.i = aant.f();
                iwb.a();
                return;
            }
            case 0: {
                final Object a18 = this.a;
                final aant a19 = (aant)o;
                final InlineMutedScrimOverlayRedirectController inlineMutedScrimOverlayRedirectController = (InlineMutedScrimOverlayRedirectController)a18;
                if (inlineMutedScrimOverlayRedirectController.b == fkr.j && inlineMutedScrimOverlayRedirectController.a != null && !inlineMutedScrimOverlayRedirectController.g.w() && a19.f() > 60000L && TextUtils.equals((CharSequence)inlineMutedScrimOverlayRedirectController.a.i(), (CharSequence)a19.i())) {
                    final long n2 = a19.g() - inlineMutedScrimOverlayRedirectController.a.g();
                    if (n2 > 0L && n2 < 5000L) {
                        inlineMutedScrimOverlayRedirectController.c += n2;
                    }
                }
                else {
                    final aant a20 = inlineMutedScrimOverlayRedirectController.a;
                    if (a20 != null && !TextUtils.equals((CharSequence)a20.i(), (CharSequence)a19.i())) {
                        inlineMutedScrimOverlayRedirectController.c = 0L;
                        inlineMutedScrimOverlayRedirectController.j();
                    }
                }
                inlineMutedScrimOverlayRedirectController.a = a19;
                final long h = inlineMutedScrimOverlayRedirectController.j.h(45353146L);
                final kbo m = inlineMutedScrimOverlayRedirectController.g.m;
                if (m != null && m.a.b().a == akfg.e && h > 0L && inlineMutedScrimOverlayRedirectController.c / 1000L > h) {
                    inlineMutedScrimOverlayRedirectController.f.n().a();
                    inlineMutedScrimOverlayRedirectController.e.setVisibility(0);
                    inlineMutedScrimOverlayRedirectController.d.setVisibility(0);
                    inlineMutedScrimOverlayRedirectController.i.b(true);
                    if (inlineMutedScrimOverlayRedirectController.j.f(45354077L)) {
                        inlineMutedScrimOverlayRedirectController.e.setBackground((Drawable)new ColorDrawable(tpe.cx(inlineMutedScrimOverlayRedirectController.h, 2130970878).orElse(0)));
                    }
                }
                else {
                    final long h2 = inlineMutedScrimOverlayRedirectController.j.h(45354250L);
                    final kbo k = inlineMutedScrimOverlayRedirectController.g.m;
                    if (k != null && k.a.b().a == akfg.f && h2 > 0L && inlineMutedScrimOverlayRedirectController.c / 1000L > h2) {
                        inlineMutedScrimOverlayRedirectController.g.r((Map)afim.b);
                    }
                }
            }
        }
    }
}
