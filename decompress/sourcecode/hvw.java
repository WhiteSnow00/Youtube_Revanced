import android.view.View$OnClickListener;
import java.util.Iterator;
import java.io.IOException;
import com.google.android.apps.youtube.app.common.loading.SpecificNetworkErrorViewLoadingFrameLayout;
import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hvw extends hvt implements fed
{
    public fml cV;
    public arhr cW;
    public String cX;
    public fzo cY;
    private final List cZ;
    private boolean da;
    private dbi db;
    
    public hvw() {
        this.cZ = new ArrayList();
    }
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        if (bundle != null) {
            this.da = bundle.getBoolean("instance_is_rendering_offline_browse_response");
        }
        return super.K(layoutInflater, viewGroup, bundle);
    }
    
    public final boolean a() {
        return this.da;
    }
    
    protected final void bD() {
        super.bD();
        this.e.c((fzt)new hvl(this, 2));
    }
    
    protected final boolean bQ() {
        final sin cv = this.cv;
        return (cv == null || !cv.a) && super.bQ();
    }
    
    protected final void bw(final dbi db) {
        if (!super.bX) {
            super.bw(this.db = db);
            return;
        }
        if ("FElibrary".equals(((aial)((agzd)super.ak).rr((agyr)BrowseEndpointOuterClass.browseEndpoint)).c) && db instanceof daz) {
            final fem fem = (fem)this.aU.a();
            try {
                final aioe ak = super.ak;
                final fzo cy = this.cY;
                final String c = ((aial)((agzd)ak).rr((agyr)BrowseEndpointOuterClass.browseEndpoint)).c;
                final boolean equals = c.equals("FElibrary");
                final BrowseResponseModel browseResponseModel = null;
                BrowseResponseModel f;
                if (equals) {
                    f = fem.f();
                }
                else {
                    f = null;
                }
                if (f == null) {
                    final akfw h = fem.h();
                    akfw x;
                    if ((x = h) != null) {
                        x = cy.x(h);
                    }
                    f = browseResponseModel;
                    if (x != null) {
                        f = new BrowseResponseModel(x);
                    }
                }
                BrowseResponseModel browseResponseModel2;
                if ((browseResponseModel2 = f) != null) {
                    final akfw a = f.a;
                    browseResponseModel2 = f;
                    if (a != null) {
                        browseResponseModel2 = f;
                        if ((a.b & 0x40) != 0x0) {
                            akfx akfx;
                            if ((akfx = a.f) == null) {
                                akfx = akfx.a;
                            }
                            akgf a2;
                            if (akfx.b == 58173949) {
                                a2 = (akgf)akfx.c;
                            }
                            else {
                                a2 = akgf.a;
                            }
                            browseResponseModel2 = f;
                            if (a2.c.size() > 0) {
                                browseResponseModel2 = f;
                                if (((akfz)a2.c.get(0)).b == 58174010) {
                                    final akfz akfz = (akfz)a2.c.get(0);
                                    aopg a3;
                                    if (akfz.b == 58174010) {
                                        a3 = (aopg)akfz.c;
                                    }
                                    else {
                                        a3 = aopg.a;
                                    }
                                    final agza builder = ((agzi)a3).toBuilder();
                                    builder.copyOnWrite();
                                    final aopg aopg = (aopg)builder.instance;
                                    c.getClass();
                                    aopg.b |= 0x1;
                                    aopg.c = c;
                                    final aopg c2 = (aopg)builder.build();
                                    browseResponseModel2 = new(com.google.android.libraries.youtube.innertube.model.BrowseResponseModel.class)();
                                    final agzc agzc = (agzc)((agzi)f.a).toBuilder();
                                    akfx akfx2;
                                    if ((akfx2 = f.a.f) == null) {
                                        akfx2 = akfx.a;
                                    }
                                    final agza builder2 = ((agzi)akfx2).toBuilder();
                                    final agza builder3 = ((agzi)a2).toBuilder();
                                    final agza builder4 = ((agzi)a2.c.get(0)).toBuilder();
                                    builder4.copyOnWrite();
                                    final akfz akfz2 = (akfz)builder4.instance;
                                    c2.getClass();
                                    akfz2.c = c2;
                                    akfz2.b = 58174010;
                                    builder3.copyOnWrite();
                                    final akgf akgf = (akgf)builder3.instance;
                                    final akfz akfz3 = (akfz)builder4.build();
                                    akfz3.getClass();
                                    akgf.a();
                                    akgf.c.set(0, (Object)akfz3);
                                    builder2.copyOnWrite();
                                    final akfx akfx3 = (akfx)builder2.instance;
                                    final akgf c3 = (akgf)builder3.build();
                                    c3.getClass();
                                    akfx3.c = c3;
                                    akfx3.b = 58173949;
                                    ((agza)agzc).copyOnWrite();
                                    final akfw akfw = (akfw)agzc.instance;
                                    final akfx f2 = (akfx)builder2.build();
                                    f2.getClass();
                                    akfw.f = f2;
                                    akfw.b |= 0x40;
                                    new BrowseResponseModel((akfw)((agza)agzc).build());
                                }
                            }
                        }
                    }
                }
                if (browseResponseModel2 != null) {
                    this.da = true;
                    final hvi a4 = hvj.a();
                    a4.c(ak);
                    a4.b(browseResponseModel2);
                    a4.e(true);
                    a4.f(false);
                    a4.d(false);
                    super.aO(a4.a());
                }
                return;
            }
            catch (final IOException ex) {
                trn.b("Failed to get offline browse: ".concat(ex.toString()));
                final String p = ((br)this).P(2132018878);
                final SpecificNetworkErrorViewLoadingFrameLayout specificNetworkErrorViewLoadingFrameLayout = (SpecificNetworkErrorViewLoadingFrameLayout)super.d.get();
                final fju c4 = specificNetworkErrorViewLoadingFrameLayout.c;
                c4.getClass();
                ((fjv)c4).e((CharSequence)p);
                specificNetworkErrorViewLoadingFrameLayout.c.d(false);
                specificNetworkErrorViewLoadingFrameLayout.c.b(false);
                specificNetworkErrorViewLoadingFrameLayout.g(3);
                return;
            }
        }
        final Object b = this.aN.a((Throwable)db).b;
        final Iterator iterator = this.cZ.iterator();
        while (iterator.hasNext()) {
            ((hvv)iterator.next()).f((String)b);
        }
    }
    
    public final void bx() {
        super.bx();
        this.cZ.clear();
        this.db = null;
    }
    
    protected final void by(final hvj hvj) {
        super.by(hvj);
        final BrowseResponseModel b = hvj.b;
        final int n = 0;
        if (b != null && super.bX && !gkt.E(this.az)) {
            if (!this.cV.i()) {
                final afcr g = b.g();
                final int size = ((List)g).size();
                int i = 0;
                while (i < size) {
                    final zvt zvt = (zvt)((List)g).get(i);
                    final agza builder = ((agzi)zvt.b).toBuilder();
                    if (!"FEaccount".equals(((aopg)builder.instance).c)) {
                        ++i;
                        if (!"FElibrary".equals(((aopg)builder.instance).c)) {
                            continue;
                        }
                    }
                    final agza builder2 = ((agzi)aopc.a).createBuilder();
                    final anws a = anws.a;
                    builder2.copyOnWrite();
                    final aopc aopc = (aopc)builder2.instance;
                    a.getClass();
                    aopc.c = a;
                    aopc.b |= 0x1;
                    builder.copyOnWrite();
                    final aopg aopg = (aopg)builder.instance;
                    final aopc k = (aopc)builder2.build();
                    k.getClass();
                    aopg.k = k;
                    aopg.b |= 0x2000;
                    zvt.f((aopg)builder.build());
                    break;
                }
            }
        }
        final BrowseResponseModel b2 = hvj.b;
        final String cx = this.cX;
        if (cx != null && !cx.isEmpty()) {
            if (b2 != null) {
                final afcr g2 = b2.g();
                for (int size2 = ((List)g2).size(), j = n; j < size2; ++j) {
                    final zvt zvt2 = (zvt)((List)g2).get(j);
                    final agza builder3 = ((agzi)zvt2.b).toBuilder();
                    final boolean equals = this.cX.equals(((aopg)builder3.instance).c);
                    builder3.copyOnWrite();
                    final aopg aopg2 = (aopg)builder3.instance;
                    aopg2.b |= 0x8;
                    aopg2.f = equals;
                    if (equals) {
                        final aioe al = this.aL();
                        if (al != null && ((agzd)al).rs((agyr)BrowseEndpointOuterClass.browseEndpoint)) {
                            final agza builder4 = ((agzi)((agzd)al).rr((agyr)BrowseEndpointOuterClass.browseEndpoint)).toBuilder();
                            final String c = ((aopg)builder3.instance).c;
                            builder4.copyOnWrite();
                            final aial aial = (aial)builder4.instance;
                            c.getClass();
                            aial.b |= 0x1;
                            aial.c = c;
                            final aial aial2 = (aial)builder4.build();
                            final agzc agzc = (agzc)((agzi)al).toBuilder();
                            agzc.e((agyr)BrowseEndpointOuterClass.browseEndpoint, (Object)aial2);
                            this.bI((aioe)((agza)agzc).build());
                        }
                    }
                    zvt2.f((aopg)builder3.build());
                }
                this.cX = null;
            }
        }
    }
    
    protected final void bz(final acpd acpd) {
        if (super.bX) {
            final hvv e = new hvv(this);
            final dbi db = this.db;
            if (db == null) {
                e.d((Object)actc.l((acmq)acmp.a(), (Object)null, (View$OnClickListener)null, (acob)null));
            }
            else {
                e.f((String)this.aN.a((Throwable)db).b);
            }
            this.cZ.add(e);
            final jzt jzt = (jzt)acpd;
            final achk e2 = jzt.e;
            if (e2 != e) {
                if (e2 != null) {
                    jzt.d.q(e2);
                }
                jzt.e = (achk)e;
                jzt.d.m((achk)e);
            }
        }
    }
    
    public final void h() {
        if (!this.da && !super.bX && this.db == null && this.o() != 3) {
            return;
        }
        this.om();
    }
    
    public final void om() {
        if (this.cv.a) {
            final View o = ((br)this).O;
            if (o != null) {
                o.postDelayed((Runnable)new huw(this, 5), (long)((br)this).nZ().getInteger(17694722));
            }
            return;
        }
        super.om();
    }
    
    public final void pK(final Bundle bundle) {
        super.pK(bundle);
        bundle.putBoolean("instance_is_rendering_offline_browse_response", this.da);
    }
}
