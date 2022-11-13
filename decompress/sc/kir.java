import java.util.Iterator;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kir implements View$OnClickListener
{
    public final kis a;
    
    public kir(final kis a) {
        this.a = a;
    }
    
    public final void onClick(final View view) {
        final kis a = this.a;
        anuv anuv;
        if ((anuv = a.c.p) == null) {
            anuv = anuv.a;
        }
        if (anuv.ry((ahaq)ButtonRendererOuterClass.buttonRenderer)) {
            anuv anuv2;
            if ((anuv2 = a.c.p) == null) {
                anuv2 = anuv.a;
            }
            final aicz aicz = (aicz)anuv2.rx((ahaq)ButtonRendererOuterClass.buttonRenderer);
            final List formfillFieldResults = a.b.getFormfillFieldResults();
            final ArrayList list = new ArrayList();
            for (int i = 0; i < formfillFieldResults.size(); ++i) {
                final ajve ajve = formfillFieldResults.get(i);
                final ahaz builder = ((ahbh)eiv.a).createBuilder();
                final ahaz builder2 = ((ahbh)eix.a).createBuilder();
                ajvf a2;
                if (ajve.c == 4) {
                    a2 = (ajvf)ajve.d;
                }
                else {
                    a2 = ajvf.a;
                }
                final String c = a2.c;
                builder2.copyOnWrite();
                final eix eix = (eix)builder2.instance;
                c.getClass();
                eix.b |= 0x1;
                eix.c = c;
                builder.copyOnWrite();
                final eiv eiv = (eiv)builder.instance;
                final eix d = (eix)builder2.build();
                d.getClass();
                eiv.d = d;
                eiv.c = 4;
                final String e = ajve.e;
                builder.copyOnWrite();
                final eiv eiv2 = (eiv)builder.instance;
                e.getClass();
                eiv2.b |= 0x1;
                eiv2.e = e;
                final boolean f = ajve.f;
                builder.copyOnWrite();
                final eiv eiv3 = (eiv)builder.instance;
                eiv3.b |= 0x2;
                eiv3.f = f;
                list.add(builder.build());
            }
            final ahbx n = a.c.n;
            final ArrayList list2 = new ArrayList();
        Label_0374:
            for (final ajve ajve2 : formfillFieldResults) {
                final String e2 = ajve2.e;
                while (true) {
                    for (final ajva ajva : n) {
                        if (ajva.d.equals(e2) && (ajva.b & 0x8) != 0x0) {
                            aiqj aiqj;
                            if ((aiqj = ajva.e) == null) {
                                aiqj = aiqj.a;
                            }
                            if (aiqj != null && ajve2.f) {
                                list2.add(aiqj);
                                continue Label_0374;
                            }
                            continue Label_0374;
                        }
                    }
                    aiqj aiqj = null;
                    continue;
                }
            }
            final ahaz builder3 = ((ahbh)alhi.a).createBuilder();
            final ahaz builder4 = ((ahbh)alhf.a).toBuilder();
            final ahaz builder5 = ((ahbh)algj.a).toBuilder();
            final String b = khl.b((List)n, 2);
            final String b2 = khl.b((List)n, 4);
            final String b3 = khl.b((List)n, 3);
            for (final ajve ajve3 : formfillFieldResults) {
                final String e3 = ajve3.e;
                if (b != null && b.equals(e3)) {
                    if (!ajve3.f) {
                        continue;
                    }
                    builder4.copyOnWrite();
                    alhf.a((alhf)builder4.instance);
                    builder5.copyOnWrite();
                    algj.a((algj)builder5.instance);
                }
                else if (b2 != null && b2.equals(e3)) {
                    if (!ajve3.f) {
                        continue;
                    }
                    builder4.copyOnWrite();
                    alhf.c((alhf)builder4.instance);
                    builder5.copyOnWrite();
                    algj.c((algj)builder5.instance);
                }
                else {
                    if (b3 == null || !b3.equals(e3) || !ajve3.f) {
                        continue;
                    }
                    builder4.copyOnWrite();
                    alhf.b((alhf)builder4.instance);
                    builder5.copyOnWrite();
                    algj.b((algj)builder5.instance);
                }
            }
            for (final ajva ajva2 : n) {
                if (b != null && b.equals(ajva2.d)) {
                    if (!ajva2.f) {
                        continue;
                    }
                    builder4.copyOnWrite();
                    alhf.d((alhf)builder4.instance);
                    builder5.copyOnWrite();
                    algj.d((algj)builder5.instance);
                }
                else if (b2 != null && b2.equals(ajva2.d)) {
                    if (!ajva2.f) {
                        continue;
                    }
                    builder4.copyOnWrite();
                    alhf.f((alhf)builder4.instance);
                    builder5.copyOnWrite();
                    algj.f((algj)builder5.instance);
                }
                else {
                    if (b3 == null || !b3.equals(ajva2.d) || !ajva2.f) {
                        continue;
                    }
                    builder4.copyOnWrite();
                    alhf.e((alhf)builder4.instance);
                    builder5.copyOnWrite();
                    algj.e((algj)builder5.instance);
                }
            }
            final ahaz builder6 = ((ahbh)algn.a).createBuilder();
            builder6.copyOnWrite();
            final algn algn = (algn)builder6.instance;
            final algj d2 = (algj)builder5.build();
            d2.getClass();
            algn.d = d2;
            algn.c = 6;
            builder3.copyOnWrite();
            final alhi alhi = (alhi)builder3.instance;
            final algn v = (algn)builder6.build();
            v.getClass();
            alhi.v = v;
            alhi.c |= 0x400;
            builder3.copyOnWrite();
            final alhi alhi2 = (alhi)builder3.instance;
            final alhf o = (alhf)builder4.build();
            o.getClass();
            alhi2.o = o;
            alhi2.b |= 0x20000;
            final alhi alhi3 = (alhi)builder3.build();
            if ((aicz.b & 0x4000) != 0x0) {
                final Map j = wyx.i((Object)a.c, false);
                j.put("FORM_RESULTS_ARG", list);
                j.put("SUBMIT_COMMANDS_ARG", list2);
                final vcy a3 = a.a;
                aiqj aiqj2;
                if ((aiqj2 = aicz.n) == null) {
                    aiqj2 = aiqj.a;
                }
                a3.c(aiqj2, j);
            }
            if ((aicz.b & 0x8000) != 0x0) {
                final Map h = wyx.h((Object)a.c, alhi3);
                final vcy a4 = a.a;
                aiqj aiqj3;
                if ((aiqj3 = aicz.o) == null) {
                    aiqj3 = aiqj.a;
                }
                a4.c(aiqj3, h);
            }
            if ((aicz.b & 0x10000) != 0x0) {
                final vcy a5 = a.a;
                aiqj aiqj4;
                if ((aiqj4 = aicz.p) == null) {
                    aiqj4 = aiqj.a;
                }
                a5.c(aiqj4, (Map)null);
            }
        }
    }
}
