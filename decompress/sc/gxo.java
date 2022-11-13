import android.support.v7.widget.RecyclerView;
import com.google.research.xeno.effect.Control;
import com.google.android.libraries.youtube.edit.filters.model.FilterMapTable$FilterDescriptor;
import com.google.android.libraries.youtube.creation.common.ui.CreationButtonView;
import com.google.android.libraries.youtube.edit.gallery.MediaGridRecyclerView;
import android.widget.Toast;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.voiceover.VoiceoverSeekBar;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.timeline.TimelineSeekBar;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.camera.ShortsZoomSlider;
import android.view.View;
import android.app.AlertDialog$Builder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gxo implements Runnable
{
    public final Object a;
    private final int b;
    
    public gxo(final AlertDialog$Builder a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gxo(final View a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gxo(final ShortsZoomSlider a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gxo(final TimelineSeekBar a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gxo(final VoiceoverSeekBar a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gxo(final YouTubeTextView a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gxo(final gnr a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public gxo(final gwh a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gxo(final gxu a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gxo(final gyo a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gxo(final hao a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gxo(final hau a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gxo(final hbk a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gxo(final hbx a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gxo(final hcd a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gxo(final hcq a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gxo(final hdm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        final int b = this.b;
        final boolean b2 = false;
        switch (b) {
            default: {
                final hdm hdm = (hdm)this.a;
                hdm.y(hdm.r);
                return;
            }
            case 19: {
                final View q = ((hdm)this.a).q;
                if (q != null) {
                    q.setVisibility(8);
                }
                return;
            }
            case 18: {
                final hdm hdm2 = (hdm)this.a;
                if (hdm2.q != null) {
                    final xab z = hdm2.z;
                    if (z != null) {
                        hdm2.D.cG(z).f();
                    }
                    hdm2.q.setVisibility(8);
                }
                return;
            }
            case 17: {
                ((hdm)this.a).z();
                return;
            }
            case 16: {
                final Object a = this.a;
                zlm.b(zll.b, zlk.f, "[ShortsCreation][Android][Music]No usable audio streams found in selected music. ");
                final hcq hcq = (hcq)a;
                hcq.g.pF().t((wzz)new wyt(xaa.c(123970)), (alhi)null);
                Toast.makeText(hcq.d, 2132019444, 1).show();
                hcq.c();
                return;
            }
            case 15: {
                final Object a2 = this.a;
                final afeq a3 = hcd.a;
                if (a2 != null) {
                    ((gwh)a2).a().D(false);
                }
                return;
            }
            case 14: {
                ((AlertDialog$Builder)this.a).show();
                return;
            }
            case 13: {
                final hcd hcd = (hcd)this.a;
                hcd.aj.j();
                hcd.p(hcd.ay, false, aeea.cE(hcd.ai, hcd.as, 22156));
                return;
            }
            case 12: {
                final hcd hcd2 = (hcd)this.a;
                hcd2.aj.j();
                hcd2.q(true);
                return;
            }
            case 11: {
                final hbx hbx = (hbx)this.a;
                final MediaGridRecyclerView ah = hbx.ah;
                if (ah != null) {
                    ((RecyclerView)ah).aa(hbx.ai);
                }
                return;
            }
            case 10: {
                final hbk hbk = (hbk)this.a;
                final upw l = hbk.l;
                boolean b3 = b2;
                if (l != null) {
                    b3 = b2;
                    if (l.f()) {
                        b3 = true;
                    }
                }
                final CreationButtonView d = hbk.d;
                if (d != null && hbk.l != null) {
                    int n;
                    if (!b3) {
                        n = 2131231561;
                    }
                    else {
                        n = 2131231876;
                    }
                    d.d(d.getResources().getDrawable(n));
                }
                return;
            }
            case 9: {
                final hau hau = (hau)this.a;
                hau.l = true;
                hau.k = true;
                if (hau.o()) {
                    final bej a4 = hau.a;
                    if (a4 != null) {
                        hau.m = a4.o();
                        hau.a.y(true);
                    }
                }
                return;
            }
            case 8: {
                final hao hao = (hao)this.a;
                hao.n();
                hao.p();
                final FilterMapTable$FilterDescriptor g = hao.g;
                if (g != null) {
                    final Control b4 = g.b("green_screen_texture");
                    if (b4 != null) {
                        final hau i = hao.i;
                        if (i != null) {
                            i.l(b4.c, hao.a);
                        }
                    }
                }
                hao.o();
                hao.r();
                hao.q();
                hao.l();
                hao.m();
                return;
            }
            case 7: {
                ((VoiceoverSeekBar)this.a).b();
                return;
            }
            case 6: {
                ((TimelineSeekBar)this.a).f();
                return;
            }
            case 5: {
                ((gyo)this.a).l.e();
                return;
            }
            case 4: {
                ((View)this.a).setVisibility(8);
                return;
            }
            case 3: {
                ((YouTubeTextView)this.a).setAlpha(0.0f);
                return;
            }
            case 2: {
                ((gxu)this.a).a.animate().alpha(0.0f).setStartDelay(5000L).setDuration(500L).start();
                return;
            }
            case 1: {
                final ShortsZoomSlider shortsZoomSlider = (ShortsZoomSlider)this.a;
                if (shortsZoomSlider.c == 0.0f) {
                    shortsZoomSlider.setVisibility(4);
                    final aeea g2 = shortsZoomSlider.g;
                    if (g2 != null) {
                        g2.cG(ShortsZoomSlider.a()).f();
                    }
                }
                shortsZoomSlider.c = -1.0f;
                return;
            }
            case 0: {
                final Object a5 = this.a;
                zlm.b(zll.b, zlk.f, "[ShortsCreation][Android][Navigation]Error getting GetShortsSourceVideoResponse");
                final gnr gnr = (gnr)a5;
                ((wyv)gnr.g).pF().t((wzz)new wyt(xaa.c(123970)), (alhi)null);
                Toast.makeText(gnr.a, 2132019444, 1).show();
            }
        }
    }
}
