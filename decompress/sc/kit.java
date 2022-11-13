import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kit implements View$OnClickListener
{
    public final kiv a;
    
    public kit(final kiv a) {
        this.a = a;
    }
    
    public final void onClick(final View view) {
        final kiv a = this.a;
        anuv anuv;
        if ((anuv = a.d.t) == null) {
            anuv = anuv.a;
        }
        if (anuv.ry((ahaq)ButtonRendererOuterClass.buttonRenderer)) {
            final ajvk d = a.d;
            if ((d.b & 0x10000) != 0x0) {
                anuv anuv2;
                if ((anuv2 = d.t) == null) {
                    anuv2 = anuv.a;
                }
                final aicz aicz = (aicz)anuv2.rx((ahaq)ButtonRendererOuterClass.buttonRenderer);
                if (a.i(a.f(), aicz)) {
                    final String s = a.d.s;
                    final boolean f = aezr.f(s);
                    Object o2;
                    final Object o = o2 = null;
                    if (!f) {
                        final List a2 = a.b.a();
                        final ArrayList list = new ArrayList();
                        for (int i = 0; i < a2.size(); ++i) {
                            final eiv eiv = a2.get(i);
                            final ahaz builder = ajve.a.createBuilder();
                            final ahaz builder2 = ajvf.a.createBuilder();
                            eix a3;
                            if (eiv.c == 4) {
                                a3 = (eix)eiv.d;
                            }
                            else {
                                a3 = eix.a;
                            }
                            final String c = a3.c;
                            builder2.copyOnWrite();
                            final ajvf ajvf = (ajvf)builder2.instance;
                            c.getClass();
                            ajvf.b |= 0x1;
                            ajvf.c = c;
                            builder.copyOnWrite();
                            final ajve ajve = (ajve)builder.instance;
                            final ajvf d2 = (ajvf)builder2.build();
                            d2.getClass();
                            ajve.d = d2;
                            ajve.c = 4;
                            final String e = eiv.e;
                            builder.copyOnWrite();
                            final ajve ajve2 = (ajve)builder.instance;
                            e.getClass();
                            ajve2.b |= 0x1;
                            ajve2.e = e;
                            final boolean f2 = eiv.f;
                            builder.copyOnWrite();
                            final ajve ajve3 = (ajve)builder.instance;
                            ajve3.b |= 0x2;
                            ajve3.f = f2;
                            list.add(builder.build());
                        }
                        if (aezr.f(s)) {
                            o2 = o;
                        }
                        else {
                            s.getClass();
                            adkp.R(s.isEmpty() ^ true, (Object)"key cannot be empty");
                            final ahaz builder3 = ajvj.a.createBuilder();
                            builder3.copyOnWrite();
                            final ajvj ajvj = (ajvj)builder3.instance;
                            ajvj.b |= 0x1;
                            ajvj.c = s;
                            final ajvg ajvg = new ajvg(builder3);
                            if (list.isEmpty()) {
                                o2 = ajvg;
                            }
                            else {
                                final Iterator iterator = list.iterator();
                                while (true) {
                                    o2 = ajvg;
                                    if (!iterator.hasNext()) {
                                        break;
                                    }
                                    final ajve ajve4 = (ajve)iterator.next();
                                    final ahaz a4 = ajvg.a;
                                    a4.copyOnWrite();
                                    final ajvj ajvj2 = (ajvj)a4.instance;
                                    ajve4.getClass();
                                    final ahbx d3 = ajvj2.d;
                                    if (!d3.c()) {
                                        ajvj2.d = ahbh.mutableCopy(d3);
                                    }
                                    ajvj2.d.add((Object)ajve4);
                                }
                            }
                        }
                    }
                    if (o2 == null) {
                        zlm.b(zll.b, zlk.a, "Lead Form Ads on Confirmation Page failed to create an Entity with id=".concat(String.valueOf(s)));
                        return;
                    }
                    final String value = String.valueOf(s);
                    final veb e2 = ((vdw)a.c.b()).e();
                    ((vfw)e2).j((vfk)o2);
                    ((vfw)e2).b().r((asjm)new kcx("Lead Form Ads on Confirmation Page failed to create an entity with id=".concat(value), 8)).D().U();
                    a.g(aicz, false);
                }
            }
        }
    }
}
