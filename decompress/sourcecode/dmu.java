import java.util.Collection;
import com.google.android.libraries.youtube.creation.common.ui.CreationButtonView;
import android.widget.ImageView;
import android.widget.FrameLayout;
import java.util.Iterator;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.ui.fullscreen.remoteloaded.c;
import android.os.SystemClock;
import android.graphics.drawable.TransitionDrawable;
import com.google.protos.youtube.api.innertube.MultiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint;
import com.google.protos.youtube.api.innertube.StickerCatalogEndpointOuterClass$StickerCatalogEndpoint;
import java.util.Map;
import com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.a;
import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.jar.g;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.ac;
import android.view.View;
import java.util.Deque;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.u;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.aa;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dmu implements Runnable
{
    final /* synthetic */ boolean a = a;
    final /* synthetic */ Object b = b;
    private final /* synthetic */ int c;
    
    public dmu(final dmv b, final boolean a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public dmu(final Deque b, final boolean a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        final int c = this.c;
        int visibility = 4;
        float n = 1.0f;
        boolean o = false;
        switch (c) {
            default: {
                final Object b = this.b;
                final boolean a = this.a;
                final aa aa = (aa)b;
                if (aa.a.f()) {
                    final c v = aa.a.v;
                    v.g = a;
                    if (v.e.b) {
                        final qpt h = v.h;
                        if (((ac)h.a).f()) {
                            final u b2 = ((g)((ac)h.a).R.a).b;
                            if (b2 != null) {
                                b2.d.post((Runnable)new dmu(b2, a, 19));
                            }
                        }
                    }
                    else {
                        Label_1726: {
                            if (!v.a.f()) {
                                if (a) {
                                    ((tnr)v.b).q(1);
                                    break Label_1726;
                                }
                            }
                            ((tnr)v.b).g();
                        }
                        final qpt h2 = v.h;
                        if (((ac)h2.a).f()) {
                            final Object a2 = h2.a;
                            try {
                                o = ((ac)a2).d.O();
                            }
                            catch (final RemoteException ex) {
                                jfi.ak(ex);
                            }
                            ((ac)a2).B = o;
                            final qpt r = ((ac)h2.a).R;
                            if (a) {
                                final g g = (g)r.a;
                                if (g.c == null) {
                                    final u b3 = g.b;
                                    if (b3 != null) {
                                        g.d = b3;
                                        b3.d.post((Runnable)new a(b3, b3.b(), 12));
                                    }
                                }
                            }
                            else {
                                final u c2 = ((g)r.a).c;
                                if (c2 != null) {
                                    c2.d.post((Runnable)new com.google.android.apps.youtube.embeddedplayer.service.jar.client.a(c2, 7));
                                }
                            }
                        }
                    }
                }
                return;
            }
            case 19: {
                final Object b4 = this.b;
                final boolean a3 = this.a;
                try {
                    ((u)b4).k.k(a3);
                }
                catch (final RemoteException ex2) {
                    afqg.r("Cannot send fullscreen event, client disconnected.");
                }
            }
            case 18: {
                final Object b5 = this.b;
                final boolean a4 = this.a;
                try {
                    ((u)b5).k.i(a4);
                }
                catch (final RemoteException ex3) {
                    afqg.r("Problem sending ad events authorization to client.");
                }
            }
            case 17: {
                final Object b6 = this.b;
                final boolean a5 = this.a;
                final aefd aefd = (aefd)b6;
                final aefi p = aefd.P;
                if (p != null && aefd.aw()) {
                    try {
                        final Parcel qq = ((eny)p).qQ();
                        eoa.f(qq, a5);
                        ((eny)p).qS(4, qq);
                    }
                    catch (final RemoteException ex4) {
                        throw new aeft(ex4);
                    }
                }
                return;
            }
            case 16: {
                final Object b7 = this.b;
                final boolean a6 = this.a;
                final aefd aefd2 = (aefd)b7;
                final aefh q = aefd2.Q;
                if (q != null && aefd2.aw()) {
                    try {
                        final Parcel qq2 = ((eny)q).qQ();
                        eoa.f(qq2, a6);
                        ((eny)q).qS(1, qq2);
                    }
                    catch (final RemoteException ex5) {
                        throw new aeft(ex5);
                    }
                }
                return;
            }
            case 15: {
                final Object b8 = this.b;
                final boolean a7 = this.a;
                final zcp k = ((hts)b8).a.K;
                if (k != null) {
                    k.d(a7);
                }
                return;
            }
            case 14: {
                final Object b9 = this.b;
                final boolean a8 = this.a;
                final hje hje = (hje)b9;
                if (tmy.bP(hje.h)) {
                    for (final Map.Entry<aibb, V> entry : ((Map<Object, Object>)hje.b.v.e).entrySet()) {
                        aioe aioe;
                        if ((aioe = entry.getKey().o) == null) {
                            aioe = aioe.a;
                        }
                        if (!((agzd)aioe).rs((agyr)StickerCatalogEndpointOuterClass$StickerCatalogEndpoint.stickerCatalogEndpoint)) {
                            aioe aioe2;
                            if ((aioe2 = entry.getKey().o) == null) {
                                aioe2 = aioe.a;
                            }
                            if (!((agzd)aioe2).rs((agyr)MultiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint.multiPageStickerCatalogEndpoint)) {
                                continue;
                            }
                        }
                        hmb.a((View)entry.getValue(), a8);
                    }
                }
                return;
            }
            case 13: {
                final Object b10 = this.b;
                final boolean a9 = this.a;
                final hje hje2 = (hje)b10;
                if (!tmy.bP(hje2.h)) {
                    return;
                }
                hmb.a(hje2.b.i, a9);
                return;
            }
            case 12: {
                final Object b11 = this.b;
                final boolean a10 = this.a;
                final hje hje3 = (hje)b11;
                if (!tmy.bP(hje3.h)) {
                    return;
                }
                if (a10) {
                    hje3.e.performHapticFeedback(1);
                }
                if (hje3.f.getAnimation() != null && hje3.f.getAnimation().hasStarted() && !hje3.f.getAnimation().hasEnded()) {
                    hje3.f.getAnimation().reset();
                }
                if (a10) {
                    n = 1.1667f;
                }
                hje3.f.animate().scaleX(n).scaleY(n).setDuration(75L).start();
                final TransitionDrawable transitionDrawable = (TransitionDrawable)hje3.f.getBackground();
                if (a10) {
                    transitionDrawable.startTransition(75);
                    hje3.o.J(3, (wxz)new wws(wya.c(39104)), (alff)null);
                    return;
                }
                transitionDrawable.reverseTransition(75);
                return;
            }
            case 11: {
                final Object b12 = this.b;
                final boolean a11 = this.a;
                final hfc hfc = (hfc)b12;
                final tvf f = hfc.f;
                if (f != null) {
                    if (a11) {
                        f.h(100);
                    }
                    hfc.f.d();
                    final hfb g2 = hfc.g;
                    if (g2 != null) {
                        g2.a();
                    }
                }
                return;
            }
            case 10: {
                final Object b13 = this.b;
                final boolean a12 = this.a;
                final View q2 = ((hcu)b13).q;
                if (q2 != null) {
                    q2.setEnabled(a12);
                }
                return;
            }
            case 9: {
                final Object b14 = this.b;
                final boolean a13 = this.a;
                final hdx hdx = (hdx)b14;
                final View ar = ((gwg)hdx.a).ar;
                final boolean b15 = ar != null && avt.R(ar, a13);
                final View ar2 = ((gwg)hdx.a).ar;
                if (ar2 != null) {
                    if (a13) {
                        visibility = 0;
                    }
                    ar2.setVisibility(visibility);
                }
                if (b15) {
                    final gwg gwg = (gwg)hdx.a;
                    if (gwg.aT) {
                        final tuw s = gwg.bT.S(wya.c(96650));
                        s.k(a13);
                        s.j();
                    }
                }
                return;
            }
            case 8: {
                final Object b16 = this.b;
                final boolean a14 = this.a;
                final gvp j = ((gwg)((hdx)b16).a).J;
                if (j != null) {
                    j.c(a14);
                }
                return;
            }
            case 7: {
                final Object b17 = this.b;
                final boolean a15 = this.a;
                final gwg gwg2 = (gwg)b17;
                final FrameLayout aw = gwg2.aw;
                if (aw != null) {
                    aw.setEnabled(a15);
                }
                final ImageView ax = gwg2.ax;
                if (ax != null) {
                    ax.setEnabled(a15);
                }
                if (gwg2.ba) {
                    final CreationButtonView q3 = gwg2.Q;
                    if (q3 != null) {
                        q3.setEnabled(a15);
                    }
                }
                if (gwg2.bd) {
                    final CreationButtonView av = gwg2.av;
                    if (av != null) {
                        av.setEnabled(a15);
                    }
                }
                final CreationButtonView aa2 = gwg2.aa;
                if (aa2 != null) {
                    aa2.setEnabled(a15);
                }
                final CreationButtonView ak = gwg2.ak;
                if (ak != null) {
                    ak.setEnabled(a15);
                }
                final CreationButtonView ag = gwg2.ag;
                if (ag != null) {
                    ag.setEnabled(a15);
                }
                return;
            }
            case 6: {
                final boolean a16 = this.a;
                final Object b18 = this.b;
                final wyb a17 = gvj.a;
                if (!a16) {
                    final View view = (View)b18;
                    view.setVisibility(8);
                    view.setAlpha(1.0f);
                }
                return;
            }
            case 5: {
                ((gju)this.b).o(true, this.a);
                return;
            }
            case 4: {
                ((gju)this.b).p(this.a);
                return;
            }
            case 3: {
                ((gel)this.b).a.d((Object)new gek(this.a, null));
                return;
            }
            case 2: {
                final long uptimeMillis = SystemClock.uptimeMillis();
                while (!((Collection)this.b).isEmpty()) {
                    final dzy dzy = ((Deque<dzy>)this.b).pollFirst();
                    final boolean a18 = this.a;
                    final eac c3 = dzy.c;
                    final dzs b19 = dzy.b;
                    final boolean a19 = dzy.a;
                    final ble d = dzy.d;
                    bkv.e();
                    if (b19 != null) {
                        c3.k(b19, a19, a18, uptimeMillis, d, 0);
                    }
                }
                return;
            }
            case 1: {
                final Object b20 = this.b;
                final boolean a20 = this.a;
                final Object b21 = ((eaa)b20).b;
                final int a21 = baw.a;
                ((bhd)b21).n(a20);
                return;
            }
            case 0: {
                final Object b22 = this.b;
                final boolean a22 = this.a;
                dpg.k();
                final acko a23 = ((dmv)b22).a;
                final boolean a24 = a23.a;
                a23.a = a22;
                if (a24 != a22) {
                    ((dlx)a23.c).a(a22);
                }
            }
        }
    }
}
