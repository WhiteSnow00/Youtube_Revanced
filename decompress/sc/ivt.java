import java.util.Iterator;
import android.widget.RelativeLayout$LayoutParams;
import android.view.ViewGroup;
import j$.util.Optional;
import java.util.function.Consumer;
import android.view.ViewStub;
import com.google.android.libraries.youtube.player.features.markers.HeatMarkerView;
import com.google.android.apps.youtube.app.player.overlay.YouTubeControlsOverlay;
import java.util.concurrent.Callable;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View$OnLayoutChangeListener;
import app.revanced.integrations.patches.FullscreenButtonContainerRemoverPatch;
import android.widget.FrameLayout;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ivt implements iyv
{
    final Object a;
    private final int b;
    
    public ivt(final iup a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ivt(final ivw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ivt(final iwb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ivt(final iwc a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ivt(final iyb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ivt(final izr a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void a(View viewById) {
        final int b = this.b;
        if (b != 0) {
            if (b != 1) {
                if (b != 2) {
                    if (b != 3) {
                        if (b == 4) {
                            final Object a = this.a;
                            final FrameLayout frameLayout = (FrameLayout)viewById.findViewById(2131430763);
                            viewById = viewById.findViewById(2131430764);
                            FullscreenButtonContainerRemoverPatch.HideFullscreenButtonContainer(viewById);
                            final FrameLayout frameLayout2 = (FrameLayout)viewById;
                            final iyb iyb = (iyb)a;
                            frameLayout2.addView(iyb.a.a());
                            frameLayout.addOnLayoutChangeListener((View$OnLayoutChangeListener)new fti(iyb, 18));
                            (iyb.n = new toz((View)frameLayout, iyb.h, 8)).g((trk)new ivs(iyb, 2));
                            iyb.b(false);
                            return;
                        }
                        final izr izr = (izr)this.a;
                        if (izr.l != null) {
                            return;
                        }
                        izr.l = new ivf(new toz((View)viewById.findViewById(2131432063), izr.a, 4), new toz((View)viewById.findViewById(2131432068), izr.a, 4), new toz((View)viewById.findViewById(2131432066), izr.a, 8), new toz(viewById.findViewById(2131432085), izr.a, 4), new toz((View)viewById.findViewById(2131432060), izr.a, 8), new toz((View)viewById.findViewById(2131428222), izr.a, 8), izr.b, izr.c, izr.j);
                        final ivf l = izr.l;
                        final pvh n = izr.n;
                        anb.N(l.o.a, new ive(l));
                        l.o.a.setOnClickListener((View$OnClickListener)new ivc(l, n, 0, null, null, null, null));
                        l.d.a().am((asjm)new iut(l, 12));
                        l.d.b().am((asjm)new iut(l, 13));
                        izr.l.a(false);
                        izr.m.Q((Callable)new ikw(izr, 10));
                        final YouTubeControlsOverlay youTubeControlsOverlay = (YouTubeControlsOverlay)izr.o.a;
                        final FrameLayout i = youTubeControlsOverlay.l;
                        i.getClass();
                        (youTubeControlsOverlay.p = (TextView)i.findViewById(2131432066)).setOnClickListener((View$OnClickListener)new ixg(youTubeControlsOverlay, 12));
                        ((asht)youTubeControlsOverlay.z).aH((asjm)new izf(youTubeControlsOverlay, 7));
                        final izq n2 = youTubeControlsOverlay.n;
                        final View k = youTubeControlsOverlay.k;
                        k.getClass();
                        n2.l = k;
                        n2.j.n(k.findViewById(2131429097));
                        n2.j.n(k.findViewById(2131432066));
                        n2.j.o(k.findViewById(2131430764));
                        n2.j.n(k.findViewById(2131432060));
                        n2.A();
                        n2.e.b().am((asjm)new izf(n2, 15));
                        ((fos)youTubeControlsOverlay.n).k(youTubeControlsOverlay.L, youTubeControlsOverlay.K, youTubeControlsOverlay.J, youTubeControlsOverlay.M);
                    }
                    else {
                        final Object a2 = this.a;
                        final iwc iwc = (iwc)a2;
                        if (iwc.b != null) {
                            return;
                        }
                        (iwc.b = (ImageView)viewById.findViewById(2131429238)).setOnClickListener((View$OnClickListener)a2);
                    }
                }
                else {
                    final iwb iwb = (iwb)this.a;
                    if (iwb.k != null) {
                        return;
                    }
                    final HeatMarkerView heatMarkerView = (HeatMarkerView)((ViewStub)viewById.findViewById(2131429227)).inflate().findViewById(2131429226);
                    iwb.k = new toz((View)heatMarkerView);
                    final Optional j = iwb.j;
                    ((View)heatMarkerView).getClass();
                    j.ifPresent((Consumer)new inj(heatMarkerView, 6));
                    heatMarkerView.b = (atke)new esd(iwb, 17);
                    heatMarkerView.invalidate();
                    (iwb.h = Optional.ofNullable((Object)viewById.findViewById(2131432067))).ifPresent((Consumer)new inj(iwb, 7));
                    iwb.g.D((wzz)new wyt(xaa.c(139609)));
                }
            }
            else {
                final iup iup = (iup)this.a;
                if (iup.o != null && iup.a != null) {
                    return;
                }
                final View viewById2 = viewById.findViewById(2131432505);
                viewById2.getClass();
                iup.a = viewById2;
                iup.o = new toz((View)viewById.findViewById(2131427842), (long)iup.l, 8);
                iup.p = new toz((View)iup.a.findViewById(2131431879), (long)iup.l, 8);
                iup.n = iup.a.findViewById(2131432085);
                iup.g();
                if (iup.j) {
                    tpe.aF(iup.a, tpe.ap(3, 2131428073), (Class)RelativeLayout$LayoutParams.class);
                }
                iup.b = iup.a.findViewById(2131432067);
                iup.k.c(((ashi)iup.f).am((asjm)new itf(iup, 10)));
                iup.k.c(((asht)iup.g).aH((asjm)new itf(iup, 11)));
                final asiq m = iup.k;
                final atjm h = iup.h;
                final View a3 = iup.a;
                a3.getClass();
                m.c(((asht)h).aH((asjm)new itf(a3, 12)));
                final Iterator iterator = iup.i.iterator();
                while (iterator.hasNext()) {
                    iup.a((View)iterator.next());
                }
                iup.i.clear();
            }
        }
        else {
            final ivw ivw = (ivw)this.a;
            if (ivw.d != null) {
                return;
            }
            final ImageView f = (ImageView)viewById.findViewById(2131429097);
            (ivw.d = new toz((View)f, (long)f.getResources().getInteger(2131492903), 8)).g((trk)new ivs(ivw, 0));
            final ivr b2 = ivw.b;
            anb.N((View)(b2.f = f), new ivp());
            f.setOnClickListener((View$OnClickListener)new ivc(b2, f, 3));
            ((asht)b2.a).A().aH((asjm)new iut(b2, 15));
            final asht a4 = asht.n((ashw)b2.a, (ashw)b2.b, (asji)ivm.c).A();
            f.getClass();
            a4.aH((asjm)new iut(f, 16));
            ivw.a();
        }
    }
}
