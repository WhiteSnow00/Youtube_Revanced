import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.apps.youtube.app.ui.inline.InlinePlaybackController;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import android.view.View;
import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
import j$.time.temporal.TemporalAmount;
import j$.time.Instant;
import android.app.Activity;
import android.os.Build$VERSION;
import java.util.concurrent.Executor;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.NextGenWatchLayout;
import com.google.android.apps.youtube.app.common.util.AccessibilityStateReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kxw implements Runnable
{
    final /* synthetic */ Object a = a;
    private final /* synthetic */ int b;
    
    public kxw(final kxy a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        final int b = this.b;
        boolean b2 = false;
        switch (b) {
            default: {
                final liu liu = (liu)this.a;
                liu.g.b.e((Executor)liu.P);
                return;
            }
            case 19: {
                final ljr ljr = (ljr)this.a;
                ljr.x(ljr.C.isInMultiWindowMode());
                ljr.n.g((Object)ljr.e);
                final InlinePlaybackController w = ljr.W;
                if (w != null) {
                    ljr.K.f(w.lX(ljr.y));
                }
                ljr.n.g((Object)ljr.o);
                ((fbf)ljr.v.a()).a();
                return;
            }
            case 18: {
                final Object a = this.a;
                if (Build$VERSION.SDK_INT < 33) {
                    ((zqm)((liu)a).N.a()).e();
                    return;
                }
                final liu liu2 = (liu)a;
                final zph zph = (zph)liu2.O.a();
                final adcr a2 = zph.a((Activity)liu2.a);
                if (zph.d(a2)) {
                    zph.c(a2);
                    return;
                }
                ((zqm)liu2.N.a()).e();
                return;
            }
            case 17: {
                ((hdv)((liu)this.a).aN.a()).l();
                return;
            }
            case 16: {
                final liu liu3 = (liu)this.a;
                if (liu3.aZ.f(45370120L)) {
                    tcp.i(((adbu)liu3.aM.a()).a(), (tco)jne.d);
                }
                return;
            }
            case 15: {
                ((liv)this.a).by.q();
                return;
            }
            case 14: {
                final liu liu4 = (liu)this.a;
                if (!((cya)liu4.aL.a()).q()) {
                    return;
                }
                tcp.i(((grj)liu4.aK.a()).a(), (tco)jne.e);
                return;
            }
            case 13: {
                final liu liu5 = (liu)this.a;
                liu5.as.e(liu5.aD.d);
                return;
            }
            case 12: {
                ((liu)this.a).i();
                return;
            }
            case 11: {
                final liu liu6 = (liu)this.a;
                liu6.am.a(liu6.aD);
                return;
            }
            case 10: {
                final Object a3 = this.a;
                final xdg xdg = (xdg)a3;
                xdg.a.i((xlt)a3);
                if (xdg.a.g() != null) {
                    b2 = true;
                }
                xdg.a(b2);
                return;
            }
            case 9: {
                final abgx abgx = (abgx)this.a;
                abgx.a.b();
                abgx.a.f(abgx.lX(abgx.b));
                return;
            }
            case 8: {
                final liu liu7 = (liu)this.a;
                if (liu7.aZ.bJ()) {
                    final lhz lhz = (lhz)liu7.aP.a();
                    if (lhz.a) {
                        if (lhz.b()) {
                            final Instant a4 = ((afqr)lhz.c).a();
                            final Object d = lhz.d;
                            d.getClass();
                            if (a4.isAfter(((Instant)d).plus((TemporalAmount)lhz.b))) {
                                final ljn y = liu7.Y;
                                liu7.Y.y(y.l(), y.i | 0x2);
                            }
                        }
                    }
                    final lhz lhz2 = (lhz)liu7.aP.a();
                    if (lhz2.a) {
                        lhz2.d = null;
                    }
                }
                return;
            }
            case 7: {
                ((liu)this.a).k();
                return;
            }
            case 6: {
                ((liu)this.a).l();
                return;
            }
            case 5: {
                final AccessibilityStateReceiver accessibilityStateReceiver = (AccessibilityStateReceiver)this.a;
                accessibilityStateReceiver.m();
                accessibilityStateReceiver.o();
                return;
            }
            case 4: {
                final liu liu8 = (liu)this.a;
                liu8.af.i(liu8.aS);
                liu8.aS = false;
                ((tdz)liu8.bh.a).d((Object)new fim());
                return;
            }
            case 3: {
                final ldf ldf = (ldf)this.a;
                final WatchNextResponseModel k = ldf.k;
                if (k != null) {
                    final utk h = ldf.h;
                    final ajnl i = ldf.k(k);
                    final wxs d2 = ldf.d;
                    final agyc u = ldf.k.a.u;
                    final agza builder = ((agzi)ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.a).createBuilder();
                    builder.copyOnWrite();
                    final ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint = (ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint)builder.instance;
                    showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.c = 1;
                    showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.d = "engagement-panel-playlist";
                    final ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint2 = (ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint)builder.build();
                    final agzc agzc = (agzc)((agzi)aioe.a).createBuilder();
                    agzc.e((agyr)ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint, (Object)showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint2);
                    ((agza)agzc).copyOnWrite();
                    final aioe aioe = (aioe)agzc.instance;
                    u.getClass();
                    aioe.b |= 0x1;
                    aioe.c = u;
                    h.q(i, (alff)null, true, d2.f((aioe)((agza)agzc).build()), false);
                }
                ldf.f();
                return;
            }
            case 2: {
                ((View)this.a).requestLayout();
                return;
            }
            case 1: {
                final kxa kxa = (kxa)this.a;
                if ((0x1 & kxa.a.b) != 0x0) {
                    final kwy b3 = kxa.b.b;
                    final abhx d3 = PlaybackStartDescriptor.d();
                    aioe a5;
                    if ((a5 = kxa.a.c) == null) {
                        a5 = aioe.a;
                    }
                    d3.a = a5;
                    b3.f(d3.a(), false);
                }
                return;
            }
            case 0: {
                ((kxy)this.a).f.setSelected(true);
            }
        }
    }
}
