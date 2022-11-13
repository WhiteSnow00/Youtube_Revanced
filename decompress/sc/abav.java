import java.util.Iterator;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.function.ToLongFunction;
import j$.util.Comparator$_CC;
import java.util.Collection;
import java.util.ArrayList;
import android.util.Pair;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.features.overlay.live.LiveOverlayPresenter;
import com.google.android.libraries.youtube.player.features.onesie.BandaidConnectionOpenerController;
import com.google.android.libraries.youtube.player.features.mediacontroller.VolumeControlsManager;
import com.google.android.libraries.youtube.player.features.markers.sync.TimedSyncObserverImpl;
import com.google.android.libraries.youtube.player.features.markers.entities.MarkersVisibilityOverrideObserver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abav implements asjm
{
    public final Object a;
    private final int b;
    
    public abav(final abay a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abav(final abbj a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abav(final abbu a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abav(final abbv a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abav(final MarkersVisibilityOverrideObserver a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abav(final TimedSyncObserverImpl a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abav(final VolumeControlsManager a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abav(final BandaidConnectionOpenerController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abav(final LiveOverlayPresenter a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abav(final ibx a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final Object o) {
        switch (this.b) {
            default: {
                ((LiveOverlayPresenter)this.a).u((aanw)o);
                return;
            }
            case 19: {
                ((abbu)this.a).b((ypj)o);
                return;
            }
            case 18: {
                ((abbu)this.a).g((aant)o);
                return;
            }
            case 17: {
                final Object a = this.a;
                if (((aanf)o).b() == abka.g) {
                    ((abbu)a).a.w.f(ControlsState.a());
                }
                return;
            }
            case 16: {
                final Object a2 = this.a;
                final Pair pair = (Pair)o;
                if (pair.second != null) {
                    ((abbu)a2).a((abzl)pair.first, (abkh)pair.second);
                }
                return;
            }
            case 15: {
                ((abbu)this.a).d((aani)o);
                return;
            }
            case 14: {
                final Object a3 = this.a;
                final aano aano = (aano)o;
                ((abbu)a3).i();
                return;
            }
            case 13: {
                ((abbu)this.a).c((aamh)o);
                return;
            }
            case 12: {
                ((abbu)this.a).h((aanw)o);
                return;
            }
            case 11: {
                ((abbu)this.a).f((aans)o);
                return;
            }
            case 10: {
                final Object a4 = this.a;
                final PlayerResponseModel c = ((aany)o).a().c();
                if (c == null) {
                    return;
                }
                final ibx ibx = (ibx)a4;
                ((abbv)ibx.a).G = c.r().d("PLAYER_IS_CONTENT_INTERSTITIAL_KEY");
                ((abbv)ibx.a).F = c.r().d("PLAYER_CONTENT_INTERSTITIAL_IS_PREROLL_KEY");
                ((abbv)ibx.a).e();
                return;
            }
            case 9: {
                ((abbv)this.a).w.rh(((abbc)o).a);
                return;
            }
            case 8: {
                ((abbj)this.a).a((ypj)o);
                return;
            }
            case 7: {
                final Object a5 = this.a;
                final abke c2 = ((aans)o).c();
                final abke a6 = abke.a;
                final int ordinal = c2.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        final BandaidConnectionOpenerController bandaidConnectionOpenerController = (BandaidConnectionOpenerController)a5;
                        amie amie;
                        if ((amie = bandaidConnectionOpenerController.c.b().i) == null) {
                            amie = amie.a;
                        }
                        if ((amie.b & 0x40000000) == 0x0) {
                            bandaidConnectionOpenerController.k("vl");
                        }
                        bandaidConnectionOpenerController.b = c2;
                        return;
                    }
                    if (ordinal != 9) {
                        return;
                    }
                }
                final BandaidConnectionOpenerController bandaidConnectionOpenerController2 = (BandaidConnectionOpenerController)a5;
                if (!bandaidConnectionOpenerController2.a) {
                    bandaidConnectionOpenerController2.i(1500L);
                }
                bandaidConnectionOpenerController2.b = c2;
                return;
            }
            case 6: {
                final Object a7 = this.a;
                final abuw abuw = (abuw)o;
                final abuw a8 = abuw.a;
                final int ordinal2 = abuw.ordinal();
                if (ordinal2 == 0) {
                    final VolumeControlsManager volumeControlsManager = (VolumeControlsManager)a7;
                    eg.p(volumeControlsManager.b, (eg)((eg)volumeControlsManager.a.a()).c);
                    return;
                }
                if (ordinal2 != 1) {
                    return;
                }
                eg.p(((VolumeControlsManager)a7).b, (eg)null);
                return;
            }
            case 5: {
                ((TimedSyncObserverImpl)this.a).c = (boolean)o;
                return;
            }
            case 4: {
                final Object a9 = this.a;
                final aant aant = (aant)o;
                final TimedSyncObserverImpl timedSyncObserverImpl = (TimedSyncObserverImpl)a9;
                if (!timedSyncObserverImpl.c) {
                    if (!timedSyncObserverImpl.d) {
                        final long e = aant.e();
                        if (e != timedSyncObserverImpl.b) {
                            timedSyncObserverImpl.b = e;
                            final Iterator iterator = timedSyncObserverImpl.a.values().iterator();
                            while (iterator.hasNext()) {
                                ((abax)iterator.next()).a(e);
                            }
                        }
                    }
                }
                return;
            }
            case 3: {
                final Object a10 = this.a;
                final aouj aouj = (aouj)o;
                final abay abay = (abay)a10;
                abay.a.d();
                final ArrayList list = new ArrayList();
                final Iterator<Object> iterator2 = ((List<Object>)aouj.getTimedListData().b).iterator();
                while (iterator2.hasNext()) {
                    list.addAll((Collection)iterator2.next().b);
                }
                Collections.sort((List<Object>)list, Comparator$_CC.comparingLong((ToLongFunction)ijv.k));
                if (!list.isEmpty()) {
                    int i;
                    int n;
                    for (i = 0; i < list.size() - 1; i = n) {
                        final aouq aouq = (aouq)list.get(i);
                        n = i + 1;
                        abay.a.e(afid.e((Comparable)aouq.b, (Comparable)((aouq)list.get(n)).b), new argj(i, aouq.c));
                    }
                    abay.a.e(afid.e((Comparable)((aouq)list.get(i)).b, (Comparable)Long.MAX_VALUE), new argj(i, ((aouq)list.get(i)).c));
                    if (abay.b.h()) {
                        abay.a((long)abay.b.c());
                    }
                }
                return;
            }
            case 2: {
                final Object a11 = this.a;
                if (((aani)o).c().b(abkb.e)) {
                    final MarkersVisibilityOverrideObserver markersVisibilityOverrideObserver = (MarkersVisibilityOverrideObserver)a11;
                    if (!markersVisibilityOverrideObserver.g) {
                        markersVisibilityOverrideObserver.e = null;
                        final asiq c3 = markersVisibilityOverrideObserver.c;
                        final vfw c4 = markersVisibilityOverrideObserver.a.a(markersVisibilityOverrideObserver.b.c()).c();
                        c4.g(markersVisibilityOverrideObserver.d);
                        c3.c(c4.c().U());
                    }
                }
                return;
            }
            case 1: {
                final Object a12 = this.a;
                final amca e2 = (amca)o;
                final MarkersVisibilityOverrideObserver markersVisibilityOverrideObserver2 = (MarkersVisibilityOverrideObserver)a12;
                markersVisibilityOverrideObserver2.e = e2;
                markersVisibilityOverrideObserver2.j();
                return;
            }
            case 0: {
                ((MarkersVisibilityOverrideObserver)this.a).g = (boolean)o;
            }
        }
    }
}
