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

public final class gux extends gut implements gvb, guk
{
    public ReelBrowseFragmentToolbarController ae;
    public ReelBrowseFragmentFeedController af;
    public Context ag;
    public wwu ah;
    public LoadingFrameLayout ai;
    public toa aj;
    public ReelBrowseFragmentControllerImpl ak;
    boolean al;
    public uyi am;
    public arud an;
    public blt ao;
    public mrm ap;
    public fzo aq;
    public fzo ar;
    private Object as;
    private Optional at;
    
    public gux() {
        this.at = Optional.empty();
        this.al = false;
    }
    
    public static gux aQ(final aioe aioe) {
        final gux gux = new gux();
        final Bundle bundle = new Bundle();
        bundle.putByteArray("ReelBrowseFragmentCommandKey", ((agxl)aioe).toByteArray());
        bundle.putInt("ReelBrowseFragmentBackgroundColor", 2130970845);
        ((br)gux).ag(bundle);
        return gux;
    }
    
    private final void aS(final aioe aioe) {
        if (!((agzd)aioe).rs((agyr)BrowseEndpointOuterClass.browseEndpoint) && !((agzd)aioe).rs((agyr)amoa.b) && this.aT()) {
            return;
        }
        this.ah.n().c(wya.b(6827), wxr.a, aioe, xkm.as(aioe, algq.b), xkm.as(aioe, algq.a));
        this.ah.n().l((wxz)new wws(wya.c(22156)));
    }
    
    private final boolean aT() {
        return (boolean)Optional.ofNullable((Object)((br)this).m).map((Function)gnq.s).orElse((Object)false);
    }
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        return LayoutInflater.from(this.ag).inflate(2131625186, viewGroup, false);
    }
    
    public final void aM() {
        final bu od = ((br)this).od();
        if (od == null) {
            return;
        }
        if (!this.aT()) {
            this.ah.n().s();
        }
        ((qt)od).onBackPressed();
    }
    
    public final void aN() {
        final wwu ah = this.ah;
        if (ah != null && ah.n() != null) {
            this.ah.n().s();
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
            final adoq g = this.af.g();
            if (g != null && this.am.f(45381839L)) {
                this.af.h(this.ag, (List)g.b, g);
            }
        }
    }
    
    public final void aP(aioe aioe) {
        final String i = this.ah.n().i();
        aioe aioe2 = aioe;
        if (i != null) {
            final agzc agzc = (agzc)((agzi)aioe).toBuilder();
            final agzg b = amoa.b;
            final agza builder = ((agzi)((agzd)aioe).rr((agyr)amoa.b)).toBuilder();
            builder.copyOnWrite();
            final amob amob = (amob)builder.instance;
            amob.b |= 0x1;
            amob.c = i;
            agzc.e((agyr)b, builder.build());
            aioe2 = (aioe)agzc.build();
        }
        this.al = false;
        if (this.at.isPresent()) {
            aioe = (aioe)this.at.get();
            if (((agzd)aioe2).rs((agyr)BrowseEndpointOuterClass.browseEndpoint)) {
                if (((agzd)aioe).rs((agyr)BrowseEndpointOuterClass.browseEndpoint)) {
                    if (Objects.equals(((agzd)aioe2).rr((agyr)BrowseEndpointOuterClass.browseEndpoint), ((agzd)aioe).rr((agyr)BrowseEndpointOuterClass.browseEndpoint))) {
                        this.aS(aioe2);
                        this.al = true;
                        return;
                    }
                }
            }
        }
        if (this.ak != null) {
            this.aS(aioe2);
            this.ak.g(aioe2);
        }
        else {
            final Bundle bundle = new Bundle();
            bundle.putByteArray("ReelBrowseFragmentCommandKey", ((agxl)aioe2).toByteArray());
            ((br)this).ag(bundle);
        }
        this.at = Optional.of((Object)aioe2);
    }
    
    public final void ab(final View view, Bundle m) {
        m = ((br)this).m;
        if (m == null) {
            trn.b("No arguments set - these are required for ReelBrowseFragment.");
            return;
        }
        final byte[] byteArray = m.getByteArray("ReelBrowseFragmentCommandKey");
        if (byteArray == null) {
            trn.b("No browse command set in ReelBrowseFragment arguments. This is required.");
            return;
        }
        final TypedValue typedValue = new TypedValue();
        this.ag.getTheme().resolveAttribute(m.getInt("ReelBrowseFragmentBackgroundColor", 2130970845), typedValue, true);
        view.findViewById(2131430972).setBackgroundColor(typedValue.data);
        final aioe c = vba.c(byteArray);
        this.ai = (LoadingFrameLayout)view.findViewById(2131430816);
        final blt ao = this.ao;
        final vlq vlq = (vlq)((atjj)ao.c).a();
        vlq.getClass();
        final Executor executor = (Executor)((atjj)ao.d).a();
        executor.getClass();
        final wwu wwu = (wwu)((atjj)ao.a).a();
        wwu.getClass();
        final bhu bhu = (bhu)((atjj)ao.e).a();
        bhu.getClass();
        final wyo wyo = (wyo)((atjj)ao.b).a();
        wyo.getClass();
        this.ak = new ReelBrowseFragmentControllerImpl(vlq, executor, wwu, bhu, wyo, (gvb)this, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        ((auh)((br)this).X).b((aul)this.ak);
        ((auh)((br)this).X).b((aul)this.ae);
        ((auh)((br)this).X).b((aul)this.af);
        final Object as = this.as;
        Object o;
        adoq adoq;
        aioe aioe;
        if (as instanceof guw) {
            final guw guw = (guw)as;
            final BrowseResponseModel a = guw.a;
            final adoq d = guw.d;
            o = a;
            adoq = d;
            aioe = c;
            if (guw.b.isPresent()) {
                final agzc agzc = (agzc)((agzi)c).toBuilder();
                final agzg b = amoa.b;
                final agza builder = ((agzi)((agzd)c).rr((agyr)amoa.b)).toBuilder();
                final String f = (String)guw.b.get();
                builder.copyOnWrite();
                final amob amob = (amob)builder.instance;
                amob.b |= 0x20;
                amob.f = f;
                agzc.e((agyr)b, builder.build());
                aioe = (aioe)agzc.build();
                o = a;
                adoq = d;
            }
        }
        else {
            o = (adoq = null);
            aioe = c;
        }
        this.ae.a = (Toolbar)view.findViewById(2131432122);
        final ReelBrowseFragmentFeedController af = this.af;
        af.g = af.h.b(af.a.n(), "");
        af.b.h((Object)af, (Class)ReelBrowseFragmentFeedController.class);
        final RtlAwareViewPager rtlAwareViewPager = (RtlAwareViewPager)view.findViewById(2131430817);
        final AppTabsBar d2 = (AppTabsBar)view.findViewById(2131431923);
        af.f = (fzu)new jud((arhr)new gva(af, 0), (arhr)new gva(d2, 2), (arhr)new gva((ConstraintLayout)view.findViewById(2131431924), 3), rtlAwareViewPager);
        af.d = (DefaultTabsBar)d2;
        final fzo ar = this.ar;
        ((gcy)ar.b).c((FrameLayout)view.findViewById(2131428978), acpf.Zc, null, ((wwu)ar.a).n());
        final fzo aq = this.aq;
        ((gcy)aq.b).c((FrameLayout)view.findViewById(2131429067), acpf.Zc, null, ((wwu)aq.a).n());
        this.at = Optional.of((Object)aioe);
        this.ai.f((acvn)new hwi(this, aioe, 1));
        if (!this.aT()) {
            this.aS(aioe);
        }
        if (o == null) {
            this.ak.g(aioe);
        }
        else {
            this.ak.l((BrowseResponseModel)o);
            if (adoq != null) {
                this.af.h(this.ag, (List)adoq.b, adoq);
            }
            this.ai.a();
        }
        anqh anqh;
        if ((anqh = this.an.f().u) == null) {
            anqh = anqh.a;
        }
        anqt anqt;
        if ((anqt = anqh.d) == null) {
            anqt = anqt.a;
        }
        if (anqt.t && tmy.bQ(((br)this).nY()) && this.aT()) {
            this.ap.A((Callable)new guf(this, 3));
        }
        if (!this.aT()) {
            iba.c(view);
        }
    }
    
    public final Object n() {
        final guw guw = new guw();
        final ReelBrowseFragmentControllerImpl ak = this.ak;
        if (ak != null) {
            guw.a = ak.b;
        }
        final ReelBrowseFragmentFeedController af = this.af;
        if (af != null) {
            guw.d = af.g();
        }
        final wwu ah = this.ah;
        if (ah != null && ah.n() != null) {
            guw.b = Optional.ofNullable((Object)this.ah.n().i());
        }
        guw.c = Optional.ofNullable((Object)this.at.get());
        return guw;
    }
    
    public final void o(final Object as) {
        this.as = as;
    }
}
