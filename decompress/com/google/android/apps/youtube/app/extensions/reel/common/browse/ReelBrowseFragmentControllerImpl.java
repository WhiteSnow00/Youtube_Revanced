// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.reel.common.browse;

import android.view.View$OnClickListener;
import android.widget.ImageView;
import com.google.protos.youtube.api.innertube.ContentPillRendererOuterClass;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import java.util.concurrent.Executor;
import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;

public final class ReelBrowseFragmentControllerImpl implements aua
{
    public xan a;
    public BrowseResponseModel b;
    public gvp c;
    private final vnu d;
    private final Executor e;
    private final wyv f;
    private final xao g;
    private final bhv h;
    
    public ReelBrowseFragmentControllerImpl(final vnu d, final Executor e, final wyv f, final bhv h, final xao g, final gvp c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.d = d;
        this.e = e;
        this.c = c;
        this.f = f;
        this.h = h;
        this.g = g;
        this.a = (xan)new xap();
    }
    
    public final void g(final aiqj aiqj) {
        if (this.c != null) {
            if (((ahbc)aiqj).ry((ahaq)BrowseEndpointOuterClass.browseEndpoint)) {
                ((gvm)this.c).ai.c();
                final aicj aicj = (aicj)((ahbc)aiqj).rx((ahaq)BrowseEndpointOuterClass.browseEndpoint);
                final vns f = this.d.f();
                f.w(aicj.c);
                f.y(aicj.d);
                ((vkk)f).j(aiqj.c);
                final xan b = this.g.b(almx.e);
                this.a = b;
                final ahaz builder = ((ahbh)almj.a).createBuilder();
                final almx e = almx.e;
                builder.copyOnWrite();
                final almj almj = (almj)builder.instance;
                almj.e = e.cI;
                almj.b |= 0x1;
                final String c = aicj.c;
                builder.copyOnWrite();
                final almj almj2 = (almj)builder.instance;
                c.getClass();
                almj2.c |= 0x8;
                almj2.B = c;
                b.a((almj)builder.build());
                this.a.c("br_s");
                teu.k(this.d.h(f, this.e), this.e, (tes)new gvn(this), (tet)new gvo(this));
            }
        }
    }
    
    public final void h(final BrowseResponseModel browseResponseModel) {
        this.h.G(this.f.pF(), browseResponseModel.a);
    }
    
    public final void i(final BrowseResponseModel browseResponseModel) {
        final akhz a = browseResponseModel.a;
        if ((a.b & 0x1000000) != 0x0) {
            final gvp c = this.c;
            anuv anuv;
            if ((anuv = a.v) == null) {
                anuv = anuv.a;
            }
            final fzw ar = ((gvm)c).ar;
            if (((ahbc)anuv).ry((ahaq)ContentPillRendererOuterClass.contentPillRenderer)) {
                ((gdh)ar.b).i(((gdh)ar.b).j((aiyd)((ahbc)anuv).rx((ahaq)ContentPillRendererOuterClass.contentPillRenderer)), false);
            }
        }
    }
    
    public final void j(final BrowseResponseModel browseResponseModel) {
        final akhz a = browseResponseModel.a;
        if ((a.b & 0x8) != 0x0) {
            final gvp c = this.c;
            anuv anuv;
            if ((anuv = a.e) == null) {
                anuv = anuv.a;
            }
            final fzw aq = ((gvm)c).aq;
            if (((ahbc)anuv).ry((ahaq)ContentPillRendererOuterClass.contentPillRenderer)) {
                ((gdh)aq.b).i(((gdh)aq.b).j((aiyd)((ahbc)anuv).rx((ahaq)ContentPillRendererOuterClass.contentPillRenderer)), false);
            }
        }
    }
    
    public final void k(final BrowseResponseModel browseResponseModel) {
        final ReelBrowseFragmentToolbarController ae = ((gvm)this.c).ae;
        akhu akhu;
        if ((akhu = browseResponseModel.a.d) == null) {
            akhu = akhu.a;
        }
        final int b = akhu.b;
        if (b == 313670307) {
            final hdy b2 = ae.b;
            final ackm ackm = new ackm();
            aobl a;
            if (akhu.b == 313670307) {
                a = (aobl)akhu.c;
            }
            else {
                a = aobl.a;
            }
            ((acld)b2).mN(ackm, (Object)a);
            ae.a.addView(ae.b.c);
            final hdy b3 = ae.b;
            aobl a2;
            if (akhu.b == 313670307) {
                a2 = (aobl)akhu.c;
            }
            else {
                a2 = aobl.a;
            }
            final fup onClickListener = new fup(ae, 16);
            aobk aobk;
            if ((aobk = a2.f) == null) {
                aobk = aobk.a;
            }
            int a3;
            if ((aobk.b & 0x1) != 0x0) {
                final acpk b4 = b3.b;
                akdi akdi;
                if ((akdi = aobk.c) == null) {
                    akdi = akdi.a;
                }
                akdh akdh;
                if ((akdh = akdh.b(akdi.c)) == null) {
                    akdh = akdh.a;
                }
                a3 = b4.a(akdh);
            }
            else {
                a3 = 0;
            }
            int bz;
            if ((bz = aqsx.bz(aobk.d)) == 0) {
                bz = 1;
            }
            ImageView imageView;
            if (bz - 1 != 1) {
                imageView = (ImageView)b3.c.findViewById(2131429993);
            }
            else {
                imageView = (ImageView)b3.c.findViewById(2131429991);
            }
            imageView.setVisibility(0);
            if (a3 > 0) {
                imageView.setImageResource(a3);
            }
            imageView.setOnClickListener((View$OnClickListener)onClickListener);
            return;
        }
        if (b == 338099421) {
            final hdx c = ae.c;
            final ackm ackm2 = new ackm();
            anst a4;
            if (akhu.b == 338099421) {
                a4 = (anst)akhu.c;
            }
            else {
                a4 = anst.a;
            }
            ((acld)c).mN(ackm2, (Object)a4);
            ae.a.addView(ae.c.a);
            ae.c.a.findViewById(2131430381).setOnClickListener((View$OnClickListener)new fup(ae, 17));
            return;
        }
        if (b == 50236216) {
            ((acld)ae.d).mN(new ackm(), (Object)browseResponseModel);
            ae.a.addView(ae.d.b);
            ae.d.b.findViewById(2131428994).setOnClickListener((View$OnClickListener)new fup(ae, 18));
            return;
        }
        ae.h();
    }
    
    public final void l(final BrowseResponseModel b) {
        if (this.c == null) {
            return;
        }
        this.h(this.b = b);
        this.i(b);
        this.j(b);
        this.k(b);
    }
    
    public final void lW(final aun aun) {
    }
    
    public final void mM(final aun aun) {
        this.c = null;
    }
    
    public final void mq(final aun aun) {
    }
    
    public final void my(final aun aun) {
    }
    
    public final void oS(final aun aun) {
    }
    
    public final void oX(final aun aun) {
    }
}
