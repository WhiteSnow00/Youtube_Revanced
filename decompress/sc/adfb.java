import java.util.ArrayList;
import java.util.Iterator;
import android.graphics.Paint;
import android.content.res.TypedArray;
import java.util.TreeMap;
import j$.util.Comparator$_CC;
import java.util.Arrays;
import java.util.HashMap;
import android.view.ViewGroup$LayoutParams;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import android.view.View;
import android.util.AttributeSet;
import java.util.SortedMap;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.Collection;
import j$.util.Collection$_EL;
import java.util.List;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import j$.util.Optional;
import android.widget.FrameLayout;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adfb extends dst
{
    @dyi(a = 13)
    @dyj(a = dyk.a)
    public aqmr a;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    public otc b;
    
    public adfb() {
        super("AnalyticsChart");
    }
    
    private final adez b() {
        return (adez)super.s;
    }
    
    protected final int K() {
        return 3;
    }
    
    protected final Object R(final Context context) {
        return new FrameLayout(context);
    }
    
    protected final void T(final dsx dsx) {
        final elx elx = new elx();
        final elx elx2 = new elx();
        final elx elx3 = new elx();
        final otc b = this.b;
        final aqmr a = this.a;
        aqnj aqnj;
        if ((aqnj = a.g) == null) {
            aqnj = aqnj.a;
        }
        if (aqnj.c == 1) {
            elx.a = Optional.of((Object)new adfd(dsx.b, b));
            elx2.a = Optional.empty();
            aqnj aqnj2;
            if ((aqnj2 = a.g) == null) {
                aqnj2 = aqnj.a;
            }
            aqnc a2;
            if (aqnj2.c == 1) {
                a2 = (aqnc)aqnj2.d;
            }
            else {
                a2 = aqnc.a;
            }
            elx3.a = new AtomicReference(a2.f);
        }
        else {
            elx.a = Optional.empty();
            elx2.a = Optional.of((Object)new adey(dsx.b));
            elx3.a = new AtomicReference(oap.n());
        }
        this.b().c = (Optional)elx.a;
        this.b().a = (Optional)elx2.a;
        this.b().b = (AtomicReference)elx3.a;
    }
    
    protected final void X(final dsx dsx, final Object o) {
        final FrameLayout frameLayout = (FrameLayout)o;
        final aqmr a = this.a;
        final Optional c = this.b().c;
        final AtomicReference b = this.b().b;
        aqnj aqnj;
        if ((aqnj = a.g) == null) {
            aqnj = aqnj.a;
        }
        aqnc a2;
        if (aqnj.c == 1) {
            a2 = (aqnc)aqnj.d;
        }
        else {
            a2 = aqnc.a;
        }
        final ahbx f = a2.f;
        if (c.isPresent() && !((List)f).isEmpty()) {
            if (!Objects.equals(b.get(), (Object)f)) {
                final adfd adfd = (adfd)c.get();
                if (adfd.e.size() == ((List)f).size()) {
                    for (int i = 0; i < ((List)f).size(); ++i) {
                        final adfj adfj = adfd.e.get(i);
                        final double c2 = ((aqnb)((List)f).get(i)).c;
                        if (!adfj.k) {
                            if (adfj.i != c2) {
                                final nvs a3 = adfj.a();
                                if (adfj.h.isPresent() && a3 != null) {
                                    final Object a4 = a3.a;
                                    if (a4 != null) {
                                        final Optional d = adfj.d((double)a4);
                                        final Optional d2 = adfj.d(c2);
                                        if (!d.isPresent() || !d2.isPresent() || Math.abs((int)d.get() - (int)d2.get()) > 5) {
                                            ((blu)adfj.h.get()).H();
                                        }
                                    }
                                }
                                adfj.i = c2;
                                adfj.f();
                            }
                        }
                    }
                }
                b.set(f);
            }
        }
    }
    
    public final void Z(final dsx dsx, final dtb dtb, final int n, final int n2, final dwq dwq) {
        final aqmr a = this.a;
        final double n3 = dsx.b.getResources().getDisplayMetrics().density;
        final double n4 = a.d;
        Double.isNaN(n4);
        Double.isNaN(n3);
        dwq.a = (int)Math.floor(n4 * n3);
        final double n5 = a.e;
        Double.isNaN(n5);
        Double.isNaN(n3);
        dwq.b = (int)Math.floor(n5 * n3);
    }
    
    public final /* bridge */ boolean a(final Object o) {
        return this.f((dst)o);
    }
    
    protected final void aa(final dsx dsx, Object o) {
        final FrameLayout frameLayout = (FrameLayout)o;
        final aqmr a = this.a;
        final Optional c = this.b().c;
        final Optional a2 = this.b().a;
        frameLayout.removeAllViews();
        if (c.isPresent()) {
            final adfd adfd = (adfd)c.get();
            adfd.d = null;
            adfd.e.clear();
            aqnj aqnj;
            if ((aqnj = a.g) == null) {
                aqnj = aqnj.a;
            }
            if (aqnj.c == 1) {
                aqnj aqnj2;
                if ((aqnj2 = a.g) == null) {
                    aqnj2 = aqnj.a;
                }
                aqnc a3;
                if (aqnj2.c == 1) {
                    a3 = (aqnc)aqnj2.d;
                }
                else {
                    a3 = aqnc.a;
                }
                final afeq afeq = (afeq)Collection$_EL.stream((Collection)a3.b).map((Function)achg.i).collect(afci.a);
                final afeq g = (afeq)Collection$_EL.stream((Collection)a3.b).filter((Predicate)acdl.m).map((Function)achg.j).collect(afci.a);
                adds.t((nrt)(adfd.d = new nwj(adfd.a)));
                final nwj d = adfd.d;
                aqnj aqnj3;
                if ((aqnj3 = a.g) == null) {
                    aqnj3 = aqnj.a;
                }
                aqnc a4;
                if (aqnj3.c == 1) {
                    a4 = (aqnc)aqnj3.d;
                }
                else {
                    a4 = aqnc.a;
                }
                aqmz aqmz;
                if ((aqmz = a4.d) == null) {
                    aqmz = aqmz.a;
                }
                if (aqmz.d.size() == 0) {
                    ((nuc)((nrq)d).a()).setVisibility(8);
                }
                else {
                    aqmz aqmz2;
                    if ((aqmz2 = a4.d) == null) {
                        aqmz2 = aqmz.a;
                    }
                    final Context a5 = adfd.a;
                    final nuc nuc = new nuc(a5);
                    final nuh b = new nuh(new nuh[] { new nuh((nvc)new nvf(), 3), new nuh((nvc)new nvb(), 3), new nuh((nvc)new nve(), 3), new nuh((nvc)new nux(), 3), new nuh((nvc)new nuz(), 3), new nuh((nvc)new nva(), 3) }, 2, (byte[])null);
                    nuc.m(false);
                    ((nua)nuc).b = (nul)b;
                    final TreeMap m = oap.m();
                    oap.y(60000L, new nvd("mm", "h mm", 10), (SortedMap)m);
                    oap.y(3600000L, (nvd)new nuy(), (SortedMap)m);
                    oap.y(82800000L, new nvd("d", "MMM d", 2), (SortedMap)m);
                    oap.y(2419200000L, new nvd("MMM", "MMM yyyy", 1), (SortedMap)m);
                    oap.y(31536000000L, new nvd("yyyy", "yyyy", 1), (SortedMap)m);
                    nxt.c(m.isEmpty() ^ true, "At least one timeFormatter is needed to build a DateTimeTickFormatter");
                    ((nua)nuc).c = (nuj)new nuw((SortedMap)m);
                    ((nua)nuc).j();
                    final int n = (int)ntm.c(a5, 10.0f);
                    final TypedArray obtainStyledAttributes = a5.obtainStyledAttributes((AttributeSet)null, nro.a, 0, 0);
                    ((nua)nuc).i(obtainStyledAttributes.getDimensionPixelSize(5, n));
                    obtainStyledAttributes.recycle();
                    asbe.w((nua)nuc);
                    if ("DEFAULT".equals(((nrq)d).b)) {
                        final String b2 = ((nrq)d).b;
                        if (b2 != null) {
                            ((nrq)d).removeView((View)((nrq)d).b(b2));
                        }
                        ((nrq)d).b = null;
                    }
                    ((nrq)d).a.put("DEFAULT", nuc);
                    final nuh b3 = new nuh((List)aqmz2.d, 0);
                    final nuc nuc2 = (nuc)((nrq)d).a();
                    ((nua)nuc2).k((ntz)new nur());
                    ((nua)nuc2).b = (nul)b3;
                    ((nua)nuc2).c = (nuj)new adfc(aqmz2, 0);
                    ((nua)nuc2).i(0);
                    ((nuc)((nrq)d).a()).m(true);
                    adds.s(a, adfd.a, ((nua)((nrq)d).a()).d);
                }
                final nwj d2 = adfd.d;
                aqnj aqnj4;
                if ((aqnj4 = a.g) == null) {
                    aqnj4 = aqnj.a;
                }
                aqnc a6;
                if (aqnj4.c == 1) {
                    a6 = (aqnc)aqnj4.d;
                }
                else {
                    a6 = aqnc.a;
                }
                aqng aqng;
                if ((aqng = a6.e) == null) {
                    aqng = aqng.a;
                }
                if (aqng.d.size() == 0) {
                    ((nrq)d2).c().setVisibility(8);
                }
                else {
                    aqng aqng2;
                    if ((aqng2 = a6.e) == null) {
                        aqng2 = aqng.a;
                    }
                    final nuj i = adds.m(aqng2);
                    final nuc c2 = ((nrq)d2).c();
                    ((nua)c2).k((ntz)new adfk());
                    ((nua)c2).b = (nul)new nuh((List)aqng2.d, 0);
                    ((nua)c2).c = i;
                    ((nua)c2).i((int)adfd.c);
                    adds.s(a, adfd.a, ((nua)((nrq)d2).c()).d);
                }
                for (int j = 0; j < a3.f.size(); ++j) {
                    final aqnb aqnb = (aqnb)a3.f.get(j);
                    final adfj adfj = new adfj(adfd.a);
                    nxt.a(adfj.d == null, "DomainValueHighlighter must be configured before attaching to a chart.");
                    adfj.i = aqnb.c;
                    adfj.j = aqnb.d;
                    final Paint a7 = adfj.a;
                    int e;
                    if ((aqnb.b & 0x4) != 0x0) {
                        e = aqnb.e;
                    }
                    else {
                        e = -16777216;
                    }
                    a7.setColor(e);
                    adfj.b = aqnb.g;
                    adfj.c = aqnb.f;
                    if ((a.c & 0x20) != 0x0) {
                        adfj.e = Optional.of((Object)adfd.b);
                        CommandOuterClass$Command commandOuterClass$Command;
                        if ((commandOuterClass$Command = a.h) == null) {
                            commandOuterClass$Command = CommandOuterClass$Command.getDefaultInstance();
                        }
                        adfj.f = Optional.of((Object)commandOuterClass$Command);
                    }
                    if (aqnb.d && !g.isEmpty()) {
                        adfj.g = g;
                    }
                    adfd.e.add(adfj);
                    final nwj d3 = adfd.d;
                    o = new StringBuilder("domain_value_highlighter_");
                    ((StringBuilder)o).append(j);
                    ((nrt)d3).s((ntd)adfj, ((StringBuilder)o).toString());
                }
                for (final aqna aqna : a3.g) {
                    final nwj d4 = adfd.d;
                    o = new nsw(adfd.a, Double.valueOf(aqna.c), Double.valueOf(aqna.d));
                    final nti a8 = nti.a;
                    nxt.g((Object)a8, "axisTarget");
                    ((nsw)o).p = a8;
                    int e2;
                    if ((aqna.b & 0x4) != 0x0) {
                        e2 = aqna.e;
                    }
                    else {
                        e2 = 503316480;
                    }
                    ((nsw)o).e.setColor(e2);
                    ((nsw)o).d = false;
                    final ntf layoutParams = new ntf(((nsw)o).getLayoutParams());
                    layoutParams.b = 10;
                    ((nsw)o).setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                    ((nrt)d4).r((ntd)o);
                }
                if (!afeq.isEmpty()) {
                    final ahbk c3 = ((List<aqnd>)a3.b).get(0).c;
                    final afeq afeq2 = (afeq)Collection$_EL.stream((Collection)a3.b).map((Function)achg.k).collect(afci.a);
                    final afeq afeq3 = (afeq)Collection$_EL.stream((Collection)a3.b).map((Function)achg.l).collect(afci.a);
                    aqnf aqnf;
                    if ((aqnf = ((List<aqnd>)a3.b).get(0).e) == null) {
                        aqnf = aqnf.a;
                    }
                    int c4;
                    if ((aqnf.b & 0x1) != 0x0) {
                        aqnf aqnf2;
                        if ((aqnf2 = ((List<aqnd>)a3.b).get(0).e) == null) {
                            aqnf2 = aqnf.a;
                        }
                        c4 = aqnf2.c;
                    }
                    else {
                        c4 = 2;
                    }
                    ((nrt)adfd.d).w();
                    final nwj d5 = adfd.d;
                    d5.d.b = (int)(c4 * adfd.c);
                    ((nua)((nrq)d5).a()).i(0);
                    aqms aqms;
                    if ((aqms = a3.c) == null) {
                        aqms = aqms.a;
                    }
                    final ahbk c5 = aqms.c;
                    aqms aqms2;
                    if ((aqms2 = a3.c) == null) {
                        aqms2 = aqms.a;
                    }
                    final ahbk d6 = aqms2.d;
                    if (afeq.size() == 1 && ((List)c5).size() == ((List)afeq.get(0)).size() && ((List)d6).size() == ((List)afeq.get(0)).size()) {
                        final nwn d7 = adfd.d.d;
                        d7.e = true;
                        d7.g = true;
                        final List list = (List)afeq.get(0);
                        final Integer n2 = (Integer)afeq2.get(0);
                        final aqms c6 = a3.c;
                        aqms a9;
                        if (c6 == null) {
                            a9 = aqms.a;
                        }
                        else {
                            a9 = c6;
                        }
                        int e3;
                        if ((a9.b & 0x1) != 0x0) {
                            aqms a10;
                            if ((a10 = c6) == null) {
                                a10 = aqms.a;
                            }
                            e3 = a10.e;
                        }
                        else {
                            e3 = Integer.MIN_VALUE;
                        }
                        final nxb s = oap.s("lower", (List)c3, (List)c5);
                        s.h(nwm.f, (Object)oap.v(e3, 0));
                        final nwy a11 = nwm.a;
                        final Integer value = 0;
                        s.h(a11, (Object)value);
                        s.j();
                        final nxb s2 = oap.s("upper", (List)c3, adfd.a((List)d6, (List)c5));
                        s2.h(nwm.f, (Object)e3);
                        s2.h(nwm.a, (Object)value);
                        s2.j();
                        final nxb s3 = oap.s("target", (List)c3, adfd.a(list, (List)d6));
                        s3.i(n2);
                        s3.h(nwm.f, (Object)oap.v((int)n2, 0));
                        final nwj d8 = adfd.d;
                        if (adds.v(s3, list, (aqni)afeq3.get(0))) {
                            ((nrt)d8).r((ntd)new nsj(d8.getContext()));
                        }
                        else {
                            adds.u(d8);
                        }
                        final nwj d9 = adfd.d;
                        final ArrayList p2 = oap.p(4);
                        p2.add(s);
                        p2.add(s2);
                        p2.add(s3);
                        ((nrt)d9).u((List)p2);
                    }
                    else {
                        aqnf aqnf3;
                        if ((aqnf3 = ((aqnd)a3.b.get(0)).e) == null) {
                            aqnf3 = aqnf.a;
                        }
                        adfd.d.d.e = ((aqnf3.b & 0x4) != 0x0);
                        final ArrayList o2 = agpi.O();
                    Label_2478:
                        for (int k = 0; k < afeq.size(); ++k) {
                            final List list2 = (List)afeq.get(k);
                            final int intValue = (int)afeq2.get(k);
                            final StringBuilder sb = new StringBuilder("target_");
                            sb.append(k);
                            final nxb s4 = oap.s(sb.toString(), (List)c3, list2);
                            s4.i(Integer.valueOf(intValue));
                            final nwy f = nwm.f;
                            aqnf aqnf4;
                            if ((aqnf4 = ((aqnd)a3.b.get(k)).e) == null) {
                                aqnf4 = aqnf.a;
                            }
                            s4.h(f, (Object)aqnf4.e);
                            o2.add(s4);
                            final nwj d10 = adfd.d;
                            if (o2.size() != ((List)afeq3).size()) {
                                adds.u(d10);
                            }
                            else {
                                for (int l = 0; l < ((List)afeq3).size(); ++l) {
                                    if (!adds.v((nxb)o2.get(l), (List)Collection$_EL.stream((Collection)((nxb)o2.get(l)).a).map((Function)achg.m).collect(afci.a), (aqni)((List)afeq3).get(l))) {
                                        adds.u(d10);
                                        continue Label_2478;
                                    }
                                }
                                ((nrt)d10).r((ntd)new nsj(d10.getContext()));
                            }
                        }
                        ((nrt)adfd.d).u((List)o2);
                    }
                    if (!g.isEmpty() && Collection$_EL.stream((Collection)a3.f).noneMatch((Predicate)acdl.n)) {
                        final nwj d11 = adfd.d;
                        adds.r((nrt)d11, g, d11.d.e ^ true);
                    }
                }
                else {
                    final aqnj g2 = a.g;
                    aqnj a12;
                    if (g2 == null) {
                        a12 = aqnj.a;
                    }
                    else {
                        a12 = g2;
                    }
                    if ((a12.b & 0x4) != 0x0) {
                        aqnj a13;
                        if ((a13 = g2) == null) {
                            a13 = aqnj.a;
                        }
                        final String e4 = a13.e;
                        final nwj d12 = adfd.d;
                        ((nrt)d12).r((ntd)new nvz(d12.getContext(), e4, adds.p(adfd.a)));
                        adfd.d.setContentDescription((CharSequence)e4);
                    }
                    ((nrt)adfd.d).m(oap.u("empty"));
                }
            }
            final nwj d13 = ((adfd)c.get()).d;
            if (d13 != null) {
                frameLayout.addView((View)d13);
            }
        }
        else if (a2.isPresent()) {
            final adey adey = (adey)a2.get();
            adey.c = null;
            aqnj aqnj5;
            if ((aqnj5 = a.g) == null) {
                aqnj5 = aqnj.a;
            }
            aqmt a14;
            if (aqnj5.c == 2) {
                a14 = (aqmt)aqnj5.d;
            }
            else {
                a14 = aqmt.a;
            }
            aqnj aqnj6;
            if ((aqnj6 = a.g) == null) {
                aqnj6 = aqnj.a;
            }
            if (aqnj6.c == 2) {
                if (a14.c.size() != 0) {
                    final ahbx c7 = a14.c;
                    ((nrt)(adey.c = new nsp(adey.a))).w();
                    adds.t((nrt)adey.c);
                    final afeq afeq4 = (afeq)Collection$_EL.stream((Collection)c7).map((Function)achg.g).collect(afci.a);
                    final nsp c8 = adey.c;
                    aqnj aqnj7;
                    if ((aqnj7 = a.g) == null) {
                        aqnj7 = aqnj.a;
                    }
                    aqmt a15;
                    if (aqnj7.c == 2) {
                        a15 = (aqmt)aqnj7.d;
                    }
                    else {
                        a15 = aqmt.a;
                    }
                    if ((a15.b & 0x1) != 0x0) {
                        aqng aqng3;
                        if ((aqng3 = a15.d) == null) {
                            aqng3 = aqng.a;
                        }
                        final nuj m2 = adds.m(aqng3);
                        final nuc c9 = ((nrq)c8).c();
                        ((nua)c9).k((ntz)new adfk());
                        ((nua)c9).i((int)adey.b);
                        ((nua)c9).b = (nul)new nuh((List)aqng3.d, 0);
                        ((nua)c9).c = m2;
                        adds.s(a, adey.a, ((nua)((nrq)c8).c()).d);
                    }
                    else {
                        ((nrq)c8).c().setVisibility(8);
                    }
                    final nsp c10 = adey.c;
                    final aqnj g3 = a.g;
                    aqnj a16;
                    if (g3 == null) {
                        a16 = aqnj.a;
                    }
                    else {
                        a16 = g3;
                    }
                    aqmt a17;
                    if (a16.c == 2) {
                        a17 = (aqmt)a16.d;
                    }
                    else {
                        a17 = aqmt.a;
                    }
                    final ahbx c11 = a17.c;
                    aqnj a18 = g3;
                    if (g3 == null) {
                        a18 = aqnj.a;
                    }
                    aqmt a19;
                    if (a18.c == 2) {
                        a19 = (aqmt)a18.d;
                    }
                    else {
                        a19 = aqmt.a;
                    }
                    aqmv aqmv;
                    if ((aqmv = a19.e) == null) {
                        aqmv = aqmv.a;
                    }
                    if (Collection$_EL.stream((Collection)c11).noneMatch((Predicate)acdl.i)) {
                        ((nue)((nrq)c10).a()).setVisibility(8);
                    }
                    else {
                        final nue nue = (nue)((nrq)c10).a();
                        final int e5 = aqsx.E(aqmv.c);
                        Label_3204: {
                            if (e5 != 0) {
                                if (e5 == 3) {
                                    o = new nur();
                                    break Label_3204;
                                }
                            }
                            o = new nus();
                        }
                        ((nua)nue).k((ntz)o);
                        ((nua)nue).b = (nul)new nuh((List)Collection$_EL.stream((Collection)c11).filter((Predicate)acdl.j).map((Function)achg.g).collect(afci.a), 0);
                        ((nua)nue).c = (nuj)new adfc((List)c11, 1);
                        ((nua)((nrq)c10).a()).i(0);
                        adds.s(a, adey.a, ((nua)((nrq)c10).a()).d);
                    }
                    if (Collection$_EL.stream((Collection)c7).anyMatch((Predicate)acdl.k)) {
                        adey.c.setImportantForAccessibility(2);
                        final ArrayList o3 = agpi.O();
                        final HashMap hashMap = new HashMap();
                        for (int n3 = 0; n3 < ((List)c7).size(); ++n3) {
                            for (final aqmw aqmw : ((aqmu)a14.c.get(n3)).e) {
                                int d14;
                                if ((aqmw.b & 0x2) != 0x0) {
                                    d14 = aqmw.d;
                                }
                                else {
                                    d14 = -16777216;
                                }
                                final Integer value2 = d14;
                                List<Double> list3;
                                if (hashMap.containsKey(value2)) {
                                    list3 = (List<Double>)hashMap.get(value2);
                                }
                                else {
                                    final Double[] array = new Double[afeq4.size()];
                                    Arrays.fill(array, 0.0);
                                    list3 = Arrays.asList(array);
                                    hashMap.put(value2, list3);
                                }
                                list3.set(n3, aqmw.c);
                            }
                        }
                        final Iterator iterator3 = hashMap.keySet().iterator();
                        int n4 = 0;
                        while (iterator3.hasNext()) {
                            final Integer n5 = (Integer)iterator3.next();
                            final List list4 = (List)hashMap.get(n5);
                            final StringBuilder sb2 = new StringBuilder("data_");
                            sb2.append(n4);
                            final nxb t = oap.t(sb2.toString(), (List)afeq4, (List)list4);
                            t.i(n5);
                            o3.add(t);
                            ++n4;
                        }
                        aqmv aqmv2;
                        if ((aqmv2 = a14.e) == null) {
                            aqmv2 = aqmv.a;
                        }
                        if (!aqmv2.b) {
                            adey.c.B.a = true;
                            if (Collection$_EL.stream((Collection)c7).noneMatch((Predicate)acdl.l)) {
                                adey.c.B.d = 0.0f;
                            }
                        }
                        final Optional max = Collection$_EL.stream((Collection)c7).map((Function)achg.h).max(Comparator$_CC.naturalOrder());
                        if (max.isPresent() && (int)max.get() > 0) {
                            final afel d15 = afeq.d();
                            int n6 = 0;
                            boolean b4 = false;
                            while (n6 < (int)max.get()) {
                                final ahaz builder = aqmy.a.createBuilder();
                                for (int n7 = 0; n7 < ((List)c7).size(); ++n7) {
                                    if ((((aqmw)((aqmu)((List)c7).get(n7)).e.get(n6)).b & 0x4) != 0x0) {
                                        final String e6 = ((aqmw)((aqmu)((List)c7).get(n7)).e.get(n6)).e;
                                        builder.copyOnWrite();
                                        final aqmy aqmy = (aqmy)builder.instance;
                                        e6.getClass();
                                        final ahbx b5 = aqmy.b;
                                        if (!b5.c()) {
                                            aqmy.b = ahbh.mutableCopy(b5);
                                        }
                                        aqmy.b.add((Object)e6);
                                        b4 = true;
                                    }
                                }
                                final ahaz builder2 = ((ahbh)aqnk.a).createBuilder();
                                builder2.copyOnWrite();
                                final aqnk aqnk = (aqnk)builder2.instance;
                                final aqmy c12 = (aqmy)builder.build();
                                c12.getClass();
                                aqnk.c = c12;
                                aqnk.b = 1;
                                d15.h(builder2.build());
                                ++n6;
                            }
                            if (b4) {
                                adds.r((nrt)adey.c, d15.g(), false);
                            }
                        }
                        ((nrt)adey.c).u((List)o3);
                    }
                    else {
                        final aqnj g4 = a.g;
                        aqnj a20;
                        if (g4 == null) {
                            a20 = aqnj.a;
                        }
                        else {
                            a20 = g4;
                        }
                        if ((a20.b & 0x4) != 0x0) {
                            aqnj a21;
                            if ((a21 = g4) == null) {
                                a21 = aqnj.a;
                            }
                            final String e7 = a21.e;
                            final nsp c13 = adey.c;
                            final Context a22 = adey.a;
                            ((nrt)c13).r((ntd)new nvz(a22, e7, adds.p(a22)));
                            adey.c.setContentDescription((CharSequence)e7);
                        }
                        ((nrt)adey.c).m(oap.u("empty"));
                        ((nrt)adey.c).m(oap.t("empty", (List)afeq4, (List)Arrays.asList(new Double[((List)afeq4).size()])));
                    }
                }
            }
            final nsp c14 = ((adey)a2.get()).c;
            if (c14 != null) {
                frameLayout.addView((View)c14);
            }
        }
    }
    
    protected final void ad(final dwr dwr, final dwr dwr2) {
        final adez adez = (adez)dwr;
        final adez adez2 = (adez)dwr2;
        adez2.a = adez.a;
        adez2.b = adez.b;
        adez2.c = adez.c;
    }
    
    protected final boolean af() {
        return true;
    }
    
    protected final boolean ai() {
        return true;
    }
    
    public final boolean am() {
        return true;
    }
    
    public final int an() {
        return 3;
    }
    
    protected final boolean ay(final dst dst, final dst dst2) {
        final adfb adfb = (adfb)dst;
        final adfb adfb2 = (adfb)dst2;
        Object a;
        if (adfb == null) {
            a = null;
        }
        else {
            a = adfb.a;
        }
        final dub dub = new dub(a, (Object)adfb2.a);
        final aqmr aqmr = (aqmr)dub.a;
        final aqmr aqmr2 = (aqmr)dub.b;
        if (aqmr != null) {
            if (aqmr2 != null) {
                aqnj aqnj;
                if ((aqnj = aqmr.g) == null) {
                    aqnj = aqnj.a;
                }
                if (aqnj.c == 1) {
                    aqnj aqnj2;
                    if ((aqnj2 = aqmr2.g) == null) {
                        aqnj2 = aqnj.a;
                    }
                    if (aqnj2.c == 1) {
                        final int d = aqmr.d;
                        final int d2 = aqmr2.d;
                        final int e = aqmr.e;
                        final int e2 = aqmr2.e;
                        aqnj aqnj3;
                        if ((aqnj3 = aqmr.g) == null) {
                            aqnj3 = aqnj.a;
                        }
                        aqnc a2;
                        if (aqnj3.c == 1) {
                            a2 = (aqnc)aqnj3.d;
                        }
                        else {
                            a2 = aqnc.a;
                        }
                        aqnj aqnj4;
                        if ((aqnj4 = aqmr2.g) == null) {
                            aqnj4 = aqnj.a;
                        }
                        aqnc a3;
                        if (aqnj4.c == 1) {
                            a3 = (aqnc)aqnj4.d;
                        }
                        else {
                            a3 = aqnc.a;
                        }
                        if (d == d2 && e == e2 && Objects.equals((Object)a2.b, (Object)a3.b)) {
                            aqms aqms;
                            if ((aqms = a2.c) == null) {
                                aqms = aqms.a;
                            }
                            aqms aqms2;
                            if ((aqms2 = a3.c) == null) {
                                aqms2 = aqms.a;
                            }
                            if (Objects.equals((Object)aqms, (Object)aqms2)) {
                                aqmz aqmz;
                                if ((aqmz = a2.d) == null) {
                                    aqmz = aqmz.a;
                                }
                                aqmz aqmz2;
                                if ((aqmz2 = a3.d) == null) {
                                    aqmz2 = aqmz.a;
                                }
                                if (Objects.equals((Object)aqmz, (Object)aqmz2)) {
                                    aqng aqng;
                                    if ((aqng = a2.e) == null) {
                                        aqng = aqng.a;
                                    }
                                    aqng aqng2;
                                    if ((aqng2 = a3.e) == null) {
                                        aqng2 = aqng.a;
                                    }
                                    if (Objects.equals((Object)aqng, (Object)aqng2) && Objects.equals((Object)a2.g, (Object)a3.g) && a2.f.size() == a3.f.size()) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
    
    public final boolean f(final dst dst) {
        if (this == dst) {
            return true;
        }
        if (dst != null && this.getClass() == dst.getClass()) {
            final adfb adfb = (adfb)dst;
            final aqmr a = this.a;
            Label_0062: {
                if (a != null) {
                    if (a.equals((Object)adfb.a)) {
                        break Label_0062;
                    }
                }
                else if (adfb.a == null) {
                    break Label_0062;
                }
                return false;
            }
            final otc b = this.b;
            if (b != null) {
                if (b.equals(adfb.b)) {
                    return true;
                }
            }
            else if (adfb.b == null) {
                return true;
            }
            return false;
        }
        return false;
    }
    
    protected final /* bridge */ dwr o() {
        return new adez();
    }
}
