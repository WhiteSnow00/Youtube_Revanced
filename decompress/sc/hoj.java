import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.function.Function;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import android.view.View;
import android.view.ViewGroup$MarginLayoutParams;
import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hoj implements asjm
{
    public final hou a;
    
    public hoj(final hou a) {
        this.a = a;
    }
    
    @Override
    public final void a(Object bv) {
        final hou a = this.a;
        final aany aany = (aany)bv;
        bv = a.b.bF;
        synchronized (bv) {
            final how b = a.b;
            b.bH = false;
            b.bI = false;
            b.bo = false;
            b.bp = false;
            if (b.bG.isPresent()) {
                hko.L(zll.a, zlk.x, "Last delayed ReelItemPlayback not processed during root change");
                a.b.bG = Optional.empty();
            }
            monitorexit(bv);
            final hri an = a.b.aN();
            if (an != null) {
                bv = an.c();
                if (bv != null) {
                    int bq;
                    if (a.b.bt()) {
                        final bu od = a.b.od();
                        od.getClass();
                        bq = (int)od.getTheme().obtainStyledAttributes(new int[] { 2130968584 }).getDimension(0, 0.0f);
                        if (!tpe.bR(a.b.nY())) {
                            bq += a.b.bq;
                        }
                    }
                    else {
                        bq = a.b.bq;
                    }
                    tpe.aF((View)bv, tpe.aB(bq), (Class)ViewGroup$MarginLayoutParams.class);
                }
                an.s();
            }
            if (a.b.aQ().g) {
                if (a.b.bd.isPresent() && (((akqn)a.b.bd.get()).b & 0x8) != 0x0) {
                    if ((bv = ((akqn)a.b.bd.get()).f) == null) {
                        bv = aiqj.a;
                    }
                    if (((ahbc)bv).ry((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
                        final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)((ahbc)bv).rx((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
                        if (reelWatchEndpointOuterClass$ReelWatchEndpoint != null) {
                            bv = aany.a();
                            final PlaybackStartDescriptor g = ((abzl)bv).g();
                            if (g != null) {
                                final aiqj b2 = g.b;
                                if (b2 != null && ((ahbc)b2).ry((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
                                    final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint2 = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)((ahbc)b2).rx((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
                                    if (reelWatchEndpointOuterClass$ReelWatchEndpoint2 != null && reelWatchEndpointOuterClass$ReelWatchEndpoint2.e.equals(reelWatchEndpointOuterClass$ReelWatchEndpoint.e) && reelWatchEndpointOuterClass$ReelWatchEndpoint2.f.equals(reelWatchEndpointOuterClass$ReelWatchEndpoint.f)) {
                                        bv = Optional.ofNullable((Object)((abzl)bv).b()).map((Function)hon.l);
                                        a.b.bp(b2, 5, (Optional)bv);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            bv = a.b.bt;
            if (aany != null && aany.a() != null) {
                final String aa = aany.a().aa();
                ((hnn)bv).a = ((hnn)bv).b;
                ((hnn)bv).b = aa;
            }
            final how b3 = a.b;
            final String bv2 = b3.bv;
            final Object o = bv = null;
            if (aany != null) {
                bv = o;
                if (aany.a() != null) {
                    bv = aany.a().aa();
                }
            }
            b3.bv = (String)bv;
            bv = a.b;
            if (((how)bv).bB != null && !adkp.ae(bv2, ((how)bv).bv)) {
                a.b.bz.tu((Object)Optional.empty());
                bv = aany.a();
                a.b.bL = Optional.empty();
                if (a.b.bs()) {
                    final how b4 = a.b;
                    final hov bl = b4.bl;
                    if (bl != null) {
                        if (bl.b) {
                            b4.bL = Optional.of(bv);
                            return;
                        }
                    }
                }
                final PlaybackStartDescriptor g2 = ((abzl)bv).g();
                if (g2 != null) {
                    final aiqj b5 = g2.b;
                    if (b5 != null && ((ahbc)b5).ry((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
                        final wyw ap = a.b.aP();
                        a.b.bu.b(ap);
                        final aiqj a2 = a.b.bu.a(b5);
                        final how b6 = a.b;
                        b6.af.d(Optional.of((Object)b6.d), a2, a.b.bv, g2.f);
                        final how b7 = a.b;
                        b7.bu.c(ap, a2, bv2, b7.bv, true);
                        a.b.bC = Optional.of((Object)a2);
                        final how b8 = a.b;
                        b8.bs = false;
                        b8.ba(((abzl)bv).c());
                    }
                }
            }
        }
    }
}
