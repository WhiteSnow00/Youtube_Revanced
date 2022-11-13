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

public final class hwt extends hwq implements fek
{
    public fmr cV;
    public arkg cW;
    public String cX;
    public fzw cY;
    private final List cZ;
    private boolean da;
    private dbj db;
    
    public hwt() {
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
        this.e.c((gab)new hwh(this, 2));
    }
    
    protected final boolean bQ() {
        final skt cu = this.cu;
        return (cu == null || !cu.a) && super.bQ();
    }
    
    protected final void bw(final dbj db) {
        if (!super.bZ) {
            super.bw(this.db = db);
            return;
        }
        if ("FElibrary".equals(((aicj)((ahbc)super.ak).rx((ahaq)BrowseEndpointOuterClass.browseEndpoint)).c) && db instanceof dba) {
            final fet fet = (fet)this.aU.a();
            try {
                final aiqj ak = super.ak;
                final fzw cy = this.cY;
                final String c = ((aicj)((ahbc)ak).rx((ahaq)BrowseEndpointOuterClass.browseEndpoint)).c;
                final boolean equals = c.equals("FElibrary");
                final BrowseResponseModel browseResponseModel = null;
                BrowseResponseModel f;
                if (equals) {
                    f = fet.f();
                }
                else {
                    f = null;
                }
                if (f == null) {
                    final akhz h = fet.h();
                    akhz x;
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
                    final akhz a = f.a;
                    browseResponseModel2 = f;
                    if (a != null) {
                        browseResponseModel2 = f;
                        if ((a.b & 0x40) != 0x0) {
                            akia akia;
                            if ((akia = a.f) == null) {
                                akia = akia.a;
                            }
                            akii a2;
                            if (akia.b == 58173949) {
                                a2 = (akii)akia.c;
                            }
                            else {
                                a2 = akii.a;
                            }
                            browseResponseModel2 = f;
                            if (a2.c.size() > 0) {
                                browseResponseModel2 = f;
                                if (((akic)a2.c.get(0)).b == 58174010) {
                                    final akic akic = (akic)a2.c.get(0);
                                    aorj a3;
                                    if (akic.b == 58174010) {
                                        a3 = (aorj)akic.c;
                                    }
                                    else {
                                        a3 = aorj.a;
                                    }
                                    final ahaz builder = ((ahbh)a3).toBuilder();
                                    builder.copyOnWrite();
                                    final aorj aorj = (aorj)builder.instance;
                                    c.getClass();
                                    aorj.b |= 0x1;
                                    aorj.c = c;
                                    final aorj c2 = (aorj)builder.build();
                                    browseResponseModel2 = new(com.google.android.libraries.youtube.innertube.model.BrowseResponseModel.class)();
                                    final ahbb ahbb = (ahbb)((ahbh)f.a).toBuilder();
                                    akia akia2;
                                    if ((akia2 = f.a.f) == null) {
                                        akia2 = akia.a;
                                    }
                                    final ahaz builder2 = ((ahbh)akia2).toBuilder();
                                    final ahaz builder3 = ((ahbh)a2).toBuilder();
                                    final ahaz builder4 = ((ahbh)a2.c.get(0)).toBuilder();
                                    builder4.copyOnWrite();
                                    final akic akic2 = (akic)builder4.instance;
                                    c2.getClass();
                                    akic2.c = c2;
                                    akic2.b = 58174010;
                                    builder3.copyOnWrite();
                                    final akii akii = (akii)builder3.instance;
                                    final akic akic3 = (akic)builder4.build();
                                    akic3.getClass();
                                    akii.a();
                                    akii.c.set(0, (Object)akic3);
                                    builder2.copyOnWrite();
                                    final akia akia3 = (akia)builder2.instance;
                                    final akii c3 = (akii)builder3.build();
                                    c3.getClass();
                                    akia3.c = c3;
                                    akia3.b = 58173949;
                                    ((ahaz)ahbb).copyOnWrite();
                                    final akhz akhz = (akhz)ahbb.instance;
                                    final akia f2 = (akia)builder2.build();
                                    f2.getClass();
                                    akhz.f = f2;
                                    akhz.b |= 0x40;
                                    new BrowseResponseModel((akhz)((ahaz)ahbb).build());
                                }
                            }
                        }
                    }
                }
                if (browseResponseModel2 != null) {
                    this.da = true;
                    final hwe a4 = hwf.a();
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
                ttr.b("Failed to get offline browse: ".concat(ex.toString()));
                final String p = ((br)this).P(2132018879);
                final SpecificNetworkErrorViewLoadingFrameLayout specificNetworkErrorViewLoadingFrameLayout = (SpecificNetworkErrorViewLoadingFrameLayout)super.d.get();
                final fka c4 = specificNetworkErrorViewLoadingFrameLayout.c;
                c4.getClass();
                c4.e((CharSequence)p);
                specificNetworkErrorViewLoadingFrameLayout.c.d(false);
                specificNetworkErrorViewLoadingFrameLayout.c.b(false);
                specificNetworkErrorViewLoadingFrameLayout.g(3);
                return;
            }
        }
        final Object b = this.aN.a((Throwable)db).b;
        final Iterator iterator = this.cZ.iterator();
        while (iterator.hasNext()) {
            ((hws)iterator.next()).f((String)b);
        }
    }
    
    public final void bx() {
        super.bx();
        this.cZ.clear();
        this.db = null;
    }
    
    protected final void by(final hwf hwf) {
        super.by(hwf);
        final BrowseResponseModel b = hwf.b;
        final int n = 0;
        if (b != null && super.bZ && !fbu.ag(this.az)) {
            if (!this.cV.i()) {
                final afeq g = b.g();
                final int size = ((List)g).size();
                int i = 0;
                while (i < size) {
                    final zxn zxn = (zxn)((List)g).get(i);
                    final ahaz builder = ((ahbh)zxn.b).toBuilder();
                    if (!"FEaccount".equals(((aorj)builder.instance).c)) {
                        final boolean equals = "FElibrary".equals(((aorj)builder.instance).c);
                        ++i;
                        if (!equals) {
                            continue;
                        }
                    }
                    final ahaz builder2 = ((ahbh)aorf.a).createBuilder();
                    final anyv a = anyv.a;
                    builder2.copyOnWrite();
                    final aorf aorf = (aorf)builder2.instance;
                    a.getClass();
                    aorf.c = a;
                    aorf.b |= 0x1;
                    builder.copyOnWrite();
                    final aorj aorj = (aorj)builder.instance;
                    final aorf k = (aorf)builder2.build();
                    k.getClass();
                    aorj.k = k;
                    aorj.b |= 0x2000;
                    zxn.f((aorj)builder.build());
                    break;
                }
            }
        }
        final BrowseResponseModel b2 = hwf.b;
        final String cx = this.cX;
        if (cx != null && !cx.isEmpty()) {
            if (b2 != null) {
                final afeq g2 = b2.g();
                for (int size2 = ((List)g2).size(), j = n; j < size2; ++j) {
                    final zxn zxn2 = (zxn)((List)g2).get(j);
                    final ahaz builder3 = ((ahbh)zxn2.b).toBuilder();
                    final boolean equals2 = this.cX.equals(((aorj)builder3.instance).c);
                    builder3.copyOnWrite();
                    final aorj aorj2 = (aorj)builder3.instance;
                    aorj2.b |= 0x8;
                    aorj2.f = equals2;
                    if (equals2) {
                        final aiqj al = this.aL();
                        if (al != null && ((ahbc)al).ry((ahaq)BrowseEndpointOuterClass.browseEndpoint)) {
                            final ahaz builder4 = ((ahbh)((ahbc)al).rx((ahaq)BrowseEndpointOuterClass.browseEndpoint)).toBuilder();
                            final String c = ((aorj)builder3.instance).c;
                            builder4.copyOnWrite();
                            final aicj aicj = (aicj)builder4.instance;
                            c.getClass();
                            aicj.b |= 0x1;
                            aicj.c = c;
                            final aicj aicj2 = (aicj)builder4.build();
                            final ahbb ahbb = (ahbb)((ahbh)al).toBuilder();
                            ahbb.e((ahaq)BrowseEndpointOuterClass.browseEndpoint, (Object)aicj2);
                            this.bI((aiqj)((ahaz)ahbb).build());
                        }
                    }
                    zxn2.f((aorj)builder3.build());
                }
                this.cX = null;
            }
        }
    }
    
    protected final void bz(final acrh acrh) {
        if (super.bZ) {
            final hws e = new hws(this);
            final dbj db = this.db;
            if (db == null) {
                e.d((Object)aald.r((acot)acos.a(), (Object)null, (View$OnClickListener)null, (acqf)null));
            }
            else {
                e.f((String)this.aN.a((Throwable)db).b);
            }
            this.cZ.add(e);
            final kau kau = (kau)acrh;
            final acjn e2 = kau.e;
            if (e2 != e) {
                if (e2 != null) {
                    kau.d.q(e2);
                }
                kau.e = (acjn)e;
                kau.d.m((acjn)e);
            }
        }
    }
    
    public final void h() {
        if (!this.da && !super.bZ && this.db == null && this.o() != 3) {
            return;
        }
        this.om();
    }
    
    public final void om() {
        if (this.cu.a) {
            final View o = ((br)this).O;
            if (o != null) {
                o.postDelayed((Runnable)new hvt(this, 3), (long)((br)this).nZ().getInteger(17694722));
            }
            return;
        }
        super.om();
    }
    
    public final void pP(final Bundle bundle) {
        super.pP(bundle);
        bundle.putBoolean("instance_is_rendering_offline_browse_response", this.da);
    }
}
