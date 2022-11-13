import com.google.android.libraries.youtube.common.ui.DefaultTabsBar;
import java.util.concurrent.Callable;
import android.widget.FrameLayout;
import android.support.constraint.ConstraintLayout;
import com.google.android.apps.youtube.app.common.ui.actionbar.AppTabsBar;
import com.google.android.libraries.youtube.common.ui.RtlAwareViewPager;
import android.support.v7.widget.Toolbar;
import java.util.concurrent.Executor;
import android.util.TypedValue;
import j$.util.Objects;
import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import java.util.List;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import java.util.function.Function;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import android.os.Bundle;
import j$.util.Optional;
import com.google.android.apps.youtube.app.extensions.reel.common.browse.ReelBrowseFragmentControllerImpl;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import android.content.Context;
import com.google.android.apps.youtube.app.extensions.reel.common.browse.ReelBrowseFragmentFeedController;
import com.google.android.apps.youtube.app.extensions.reel.common.browse.ReelBrowseFragmentToolbarController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gvm extends gvi implements gvp, gva
{
    public ReelBrowseFragmentToolbarController ae;
    public ReelBrowseFragmentFeedController af;
    public Context ag;
    public wyv ah;
    public LoadingFrameLayout ai;
    public tqf aj;
    public ReelBrowseFragmentControllerImpl ak;
    boolean al;
    public vai am;
    public arwh an;
    public blu ao;
    public msr ap;
    public fzw aq;
    public fzw ar;
    private Object as;
    private Optional at;
    
    public gvm() {
        this.at = Optional.empty();
        this.al = false;
    }
    
    public static gvm aQ(final aiqj aiqj) {
        final gvm gvm = new gvm();
        final Bundle bundle = new Bundle();
        bundle.putByteArray("ReelBrowseFragmentCommandKey", ((agzk)aiqj).toByteArray());
        bundle.putInt("ReelBrowseFragmentBackgroundColor", 2130970845);
        ((br)gvm).ag(bundle);
        return gvm;
    }
    
    private final void aS(final aiqj aiqj) {
        if (!((ahbc)aiqj).ry((ahaq)BrowseEndpointOuterClass.browseEndpoint) && !((ahbc)aiqj).ry((ahaq)amqf.b) && this.aT()) {
            return;
        }
        this.ah.pF().c(xaa.b(6827), wzr.a, aiqj, xmm.ae(aiqj, aliu.b), xmm.ae(aiqj, aliu.a));
        this.ah.pF().l((wzz)new wyt(xaa.c(22156)));
    }
    
    private final boolean aT() {
        return (boolean)Optional.ofNullable((Object)((br)this).m).map((Function)gnx.s).orElse((Object)false);
    }
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        return LayoutInflater.from(this.ag).inflate(2131625191, viewGroup, false);
    }
    
    public final void aM() {
        final bu od = ((br)this).od();
        if (od == null) {
            return;
        }
        if (!this.aT()) {
            this.ah.pF().s();
        }
        ((qt)od).onBackPressed();
    }
    
    public final void aN() {
        final wyv ah = this.ah;
        if (ah != null && ah.pF() != null) {
            this.ah.pF().s();
        }
    }
    
    public final void aO() {
        if (this.al) {
            this.al = false;
            final ReelBrowseFragmentControllerImpl ak = this.ak;
            if (ak != null) {
                final BrowseResponseModel b = ak.b;
                if (b != null) {
                    ak.l(b);
                }
            }
            final adqs g = this.af.g();
            if (g != null && this.am.f(45381839L)) {
                this.af.h(this.ag, (List)g.b, g);
            }
        }
    }
    
    public final void aP(aiqj aiqj) {
        final String i = this.ah.pF().i();
        aiqj aiqj2 = aiqj;
        if (i != null) {
            final ahbb ahbb = (ahbb)((ahbh)aiqj).toBuilder();
            final ahbf b = amqf.b;
            final ahaz builder = ((ahbh)((ahbc)aiqj).rx((ahaq)amqf.b)).toBuilder();
            builder.copyOnWrite();
            final amqg amqg = (amqg)builder.instance;
            amqg.b |= 0x1;
            amqg.c = i;
            ahbb.e((ahaq)b, (Object)builder.build());
            aiqj2 = (aiqj)((ahaz)ahbb).build();
        }
        this.al = false;
        if (this.at.isPresent()) {
            aiqj = (aiqj)this.at.get();
            if (((ahbc)aiqj2).ry((ahaq)BrowseEndpointOuterClass.browseEndpoint)) {
                if (((ahbc)aiqj).ry((ahaq)BrowseEndpointOuterClass.browseEndpoint)) {
                    if (Objects.equals(((ahbc)aiqj2).rx((ahaq)BrowseEndpointOuterClass.browseEndpoint), ((ahbc)aiqj).rx((ahaq)BrowseEndpointOuterClass.browseEndpoint))) {
                        this.aS(aiqj2);
                        this.al = true;
                        return;
                    }
                }
            }
        }
        if (this.ak != null) {
            this.aS(aiqj2);
            this.ak.g(aiqj2);
        }
        else {
            final Bundle bundle = new Bundle();
            bundle.putByteArray("ReelBrowseFragmentCommandKey", ((agzk)aiqj2).toByteArray());
            ((br)this).ag(bundle);
        }
        this.at = Optional.of((Object)aiqj2);
    }
    
    public final void ab(final View view, final Bundle bundle) {
        final Bundle m = ((br)this).m;
        if (m == null) {
            ttr.b("No arguments set - these are required for ReelBrowseFragment.");
            return;
        }
        final byte[] byteArray = m.getByteArray("ReelBrowseFragmentCommandKey");
        if (byteArray == null) {
            ttr.b("No browse command set in ReelBrowseFragment arguments. This is required.");
            return;
        }
        final TypedValue typedValue = new TypedValue();
        this.ag.getTheme().resolveAttribute(m.getInt("ReelBrowseFragmentBackgroundColor", 2130970845), typedValue, true);
        view.findViewById(2131430975).setBackgroundColor(typedValue.data);
        final aiqj c = vdb.c(byteArray);
        this.ai = (LoadingFrameLayout)view.findViewById(2131430819);
        final blu ao = this.ao;
        final vnu vnu = (vnu)((atke)ao.c).a();
        vnu.getClass();
        final Executor executor = (Executor)((atke)ao.d).a();
        executor.getClass();
        final wyv wyv = (wyv)((atke)ao.a).a();
        wyv.getClass();
        final bhv bhv = (bhv)((atke)ao.e).a();
        bhv.getClass();
        final xao xao = (xao)((atke)ao.b).a();
        xao.getClass();
        this.ak = new ReelBrowseFragmentControllerImpl(vnu, executor, wyv, bhv, xao, (gvp)this, null, null, null, null);
        ((br)this).X.b((aum)this.ak);
        ((br)this).X.b((aum)this.ae);
        ((br)this).X.b((aum)this.af);
        final Object as = this.as;
        BrowseResponseModel browseResponseModel;
        adqs adqs;
        aiqj aiqj;
        if (as instanceof gvl) {
            final gvl gvl = (gvl)as;
            final BrowseResponseModel a = gvl.a;
            final adqs d = gvl.d;
            browseResponseModel = a;
            adqs = d;
            aiqj = c;
            if (gvl.b.isPresent()) {
                final ahbb ahbb = (ahbb)((ahbh)c).toBuilder();
                final ahbf b = amqf.b;
                final ahaz builder = ((ahbh)((ahbc)c).rx((ahaq)amqf.b)).toBuilder();
                final String f = (String)gvl.b.get();
                builder.copyOnWrite();
                final amqg amqg = (amqg)builder.instance;
                amqg.b |= 0x20;
                amqg.f = f;
                ahbb.e((ahaq)b, (Object)builder.build());
                aiqj = (aiqj)((ahaz)ahbb).build();
                browseResponseModel = a;
                adqs = d;
            }
        }
        else {
            browseResponseModel = null;
            adqs = null;
            aiqj = c;
        }
        this.ae.a = (Toolbar)view.findViewById(2131432125);
        final ReelBrowseFragmentFeedController af = this.af;
        af.g = af.h.b(af.a.pF(), "");
        af.b.h((Object)af, (Class)ReelBrowseFragmentFeedController.class);
        final RtlAwareViewPager rtlAwareViewPager = (RtlAwareViewPager)view.findViewById(2131430820);
        final AppTabsBar d2 = (AppTabsBar)view.findViewById(2131431926);
        af.f = (gac)new jve((arkg)new grx(af, 2), (arkg)new grx(d2, 3), (arkg)new grx((ConstraintLayout)view.findViewById(2131431927), 4), rtlAwareViewPager);
        af.d = (DefaultTabsBar)d2;
        final fzw ar = this.ar;
        ((gdh)ar.b).c((FrameLayout)view.findViewById(2131428978), acrj.Zc, (gdo)null, ((wyv)ar.a).pF());
        final fzw aq = this.aq;
        ((gdh)aq.b).c((FrameLayout)view.findViewById(2131429067), acrj.Zc, (gdo)null, ((wyv)aq.a).pF());
        this.at = Optional.of((Object)aiqj);
        this.ai.f((acxp)new hxf(this, aiqj, 1));
        if (!this.aT()) {
            this.aS(aiqj);
        }
        if (browseResponseModel == null) {
            this.ak.g(aiqj);
        }
        else {
            this.ak.l(browseResponseModel);
            if (adqs != null) {
                this.af.h(this.ag, (List)adqs.b, adqs);
            }
            this.ai.a();
        }
        ansk ansk;
        if ((ansk = this.an.f().u) == null) {
            ansk = ansk.a;
        }
        answ answ;
        if ((answ = ansk.d) == null) {
            answ = answ.a;
        }
        if (answ.t && tpe.bR(((br)this).nY()) && this.aT()) {
            this.ap.Q((Callable)new gqw(this, 4));
        }
        if (!this.aT()) {
            hnu.d(view);
        }
    }
    
    public final Object n() {
        final gvl gvl = new gvl();
        final ReelBrowseFragmentControllerImpl ak = this.ak;
        if (ak != null) {
            gvl.a = ak.b;
        }
        final ReelBrowseFragmentFeedController af = this.af;
        if (af != null) {
            gvl.d = af.g();
        }
        final wyv ah = this.ah;
        if (ah != null && ah.pF() != null) {
            gvl.b = Optional.ofNullable((Object)this.ah.pF().i());
        }
        gvl.c = Optional.ofNullable((Object)this.at.get());
        return gvl;
    }
    
    public final void o(final Object as) {
        this.as = as;
    }
}
