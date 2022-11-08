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
import java.util.List;
import android.view.View;
import android.util.AttributeSet;
import java.util.SortedMap;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.Collection;
import j$.util.Collection$_EL;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import j$.util.Optional;
import android.widget.FrameLayout;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adcz extends dss
{
    @dyh(a = 13)
    @dyi(a = dyj.a)
    public aqke a;
    @dyh(a = 13)
    @dyi(a = dyj.a)
    public ort b;
    
    public adcz() {
        super("AnalyticsChart");
    }
    
    private final adcx b() {
        return (adcx)super.s;
    }
    
    protected final int K() {
        return 3;
    }
    
    protected final Object R(final Context context) {
        return new FrameLayout(context);
    }
    
    protected final void T(final dsw dsw) {
        final elw elw = new elw();
        final elw elw2 = new elw();
        final elw elw3 = new elw();
        final ort b = this.b;
        final aqke a = this.a;
        aqkx aqkx;
        if ((aqkx = a.g) == null) {
            aqkx = aqkx.a;
        }
        if (aqkx.c == 1) {
            elw.a = Optional.of((Object)new addb(dsw.b, b));
            elw2.a = Optional.empty();
            aqkx aqkx2;
            if ((aqkx2 = a.g) == null) {
                aqkx2 = aqkx.a;
            }
            aqkq a2;
            if (aqkx2.c == 1) {
                a2 = (aqkq)aqkx2.d;
            }
            else {
                a2 = aqkq.a;
            }
            elw3.a = new AtomicReference(a2.f);
        }
        else {
            elw.a = Optional.empty();
            elw2.a = Optional.of((Object)new adcw(dsw.b));
            elw3.a = new AtomicReference(nrw.B());
        }
        this.b().c = (Optional)elw.a;
        this.b().a = (Optional)elw2.a;
        this.b().b = (AtomicReference)elw3.a;
    }
    
    protected final void X(final dsw dsw, final Object o) {
        final FrameLayout frameLayout = (FrameLayout)o;
        final aqke a = this.a;
        final Optional c = this.b().c;
        final AtomicReference b = this.b().b;
        aqkx aqkx;
        if ((aqkx = a.g) == null) {
            aqkx = aqkx.a;
        }
        aqkq a2;
        if (aqkx.c == 1) {
            a2 = (aqkq)aqkx.d;
        }
        else {
            a2 = aqkq.a;
        }
        final agzy f = a2.f;
        if (c.isPresent() && !f.isEmpty()) {
            if (!Objects.equals(b.get(), (Object)f)) {
                final addb addb = (addb)c.get();
                if (addb.e.size() == f.size()) {
                    for (int i = 0; i < f.size(); ++i) {
                        final addh addh = addb.e.get(i);
                        final double c2 = f.get(i).c;
                        if (!addh.k) {
                            if (addh.i != c2) {
                                final num a3 = addh.a();
                                if (addh.h.isPresent() && a3 != null) {
                                    final Object a4 = a3.a;
                                    if (a4 != null) {
                                        final Optional d = addh.d((double)a4);
                                        final Optional d2 = addh.d(c2);
                                        if (!d.isPresent() || !d2.isPresent() || Math.abs((int)d.get() - (int)d2.get()) > 5) {
                                            ((blt)addh.h.get()).H();
                                        }
                                    }
                                }
                                addh.i = c2;
                                addh.f();
                            }
                        }
                    }
                }
                b.set(f);
            }
        }
    }
    
    public final void Z(final dsw dsw, final dta dta, final int n, final int n2, final dwp dwp) {
        final aqke a = this.a;
        final double n3 = dsw.b.getResources().getDisplayMetrics().density;
        final double n4 = a.d;
        Double.isNaN(n4);
        Double.isNaN(n3);
        dwp.a = (int)Math.floor(n4 * n3);
        final double n5 = a.e;
        Double.isNaN(n5);
        Double.isNaN(n3);
        dwp.b = (int)Math.floor(n5 * n3);
    }
    
    protected final void aa(final dsw dsw, Object o) {
        final FrameLayout frameLayout = (FrameLayout)o;
        final aqke a = this.a;
        final Optional c = this.b().c;
        final Optional a2 = this.b().a;
        frameLayout.removeAllViews();
        if (c.isPresent()) {
            final addb addb = (addb)c.get();
            addb.d = null;
            addb.e.clear();
            aqkx aqkx;
            if ((aqkx = a.g) == null) {
                aqkx = aqkx.a;
            }
            if (aqkx.c == 1) {
                aqkx aqkx2;
                if ((aqkx2 = a.g) == null) {
                    aqkx2 = aqkx.a;
                }
                aqkq a3;
                if (aqkx2.c == 1) {
                    a3 = (aqkq)aqkx2.d;
                }
                else {
                    a3 = aqkq.a;
                }
                final afcr afcr = (afcr)Collection$_EL.stream((Collection)a3.b).map((Function)acfd.i).collect(afaj.a);
                final afcr g = (afcr)Collection$_EL.stream((Collection)a3.b).filter((Predicate)acbk.m).map((Function)acfd.j).collect(afaj.a);
                adio.V((nqn)(addb.d = new nvd(addb.a)));
                final nvd d = addb.d;
                aqkx aqkx3;
                if ((aqkx3 = a.g) == null) {
                    aqkx3 = aqkx.a;
                }
                aqkq a4;
                if (aqkx3.c == 1) {
                    a4 = (aqkq)aqkx3.d;
                }
                else {
                    a4 = aqkq.a;
                }
                aqkn aqkn;
                if ((aqkn = a4.d) == null) {
                    aqkn = aqkn.a;
                }
                if (aqkn.d.size() == 0) {
                    ((nsw)((nqk)d).a()).setVisibility(8);
                }
                else {
                    aqkn aqkn2;
                    if ((aqkn2 = a4.d) == null) {
                        aqkn2 = aqkn.a;
                    }
                    final Context a5 = addb.a;
                    final nsw nsw = new nsw(a5);
                    final ntb b = new ntb(new ntb[] { new ntb((ntw)new ntz(), 3), new ntb((ntw)new ntv(), 3), new ntb((ntw)new nty(), 3), new ntb((ntw)new ntr(), 3), new ntb((ntw)new ntt(), 3), new ntb((ntw)new ntu(), 3) }, 2, (byte[])null);
                    nsw.m(false);
                    ((nsu)nsw).b = (ntf)b;
                    final TreeMap a6 = nrw.A();
                    nrw.q(60000L, new ntx("mm", "h mm", 10), (SortedMap)a6);
                    nrw.q(3600000L, (ntx)new nts(), (SortedMap)a6);
                    nrw.q(82800000L, new ntx("d", "MMM d", 2), (SortedMap)a6);
                    nrw.q(2419200000L, new ntx("MMM", "MMM yyyy", 1), (SortedMap)a6);
                    nrw.q(31536000000L, new ntx("yyyy", "yyyy", 1), (SortedMap)a6);
                    nwn.c(a6.isEmpty() ^ true, "At least one timeFormatter is needed to build a DateTimeTickFormatter");
                    ((nsu)nsw).c = (ntd)new ntq((SortedMap)a6);
                    ((nsu)nsw).j();
                    final float c2 = nsg.c(a5, 10.0f);
                    final TypedArray obtainStyledAttributes = a5.obtainStyledAttributes((AttributeSet)null, nqi.a, 0, 0);
                    ((nsu)nsw).i(obtainStyledAttributes.getDimensionPixelSize(5, (int)c2));
                    obtainStyledAttributes.recycle();
                    arzw.w((nsu)nsw);
                    if ("DEFAULT".equals(((nqk)d).b)) {
                        final String b2 = ((nqk)d).b;
                        if (b2 != null) {
                            ((nqk)d).removeView((View)((nqk)d).b(b2));
                        }
                        ((nqk)d).b = null;
                    }
                    ((nqk)d).a.put("DEFAULT", nsw);
                    final ntb b3 = new ntb((List)aqkn2.d, 0);
                    final nsw nsw2 = (nsw)((nqk)d).a();
                    ((nsu)nsw2).k((nst)new ntl());
                    ((nsu)nsw2).b = (ntf)b3;
                    ((nsu)nsw2).c = (ntd)new adda(aqkn2, 0);
                    ((nsu)nsw2).i(0);
                    ((nsw)((nqk)d).a()).m(true);
                    adio.U(a, addb.a, ((nsu)((nqk)d).a()).d);
                }
                final nvd d2 = addb.d;
                aqkx aqkx4;
                if ((aqkx4 = a.g) == null) {
                    aqkx4 = aqkx.a;
                }
                aqkq a7;
                if (aqkx4.c == 1) {
                    a7 = (aqkq)aqkx4.d;
                }
                else {
                    a7 = aqkq.a;
                }
                aqku aqku;
                if ((aqku = a7.e) == null) {
                    aqku = aqku.a;
                }
                if (aqku.d.size() == 0) {
                    ((nqk)d2).c().setVisibility(8);
                }
                else {
                    aqku aqku2;
                    if ((aqku2 = a7.e) == null) {
                        aqku2 = aqku.a;
                    }
                    final ntd o2 = adio.O(aqku2);
                    final nsw c3 = ((nqk)d2).c();
                    ((nsu)c3).k((nst)new addi());
                    ((nsu)c3).b = (ntf)new ntb((List)aqku2.d, 0);
                    ((nsu)c3).c = o2;
                    ((nsu)c3).i((int)addb.c);
                    adio.U(a, addb.a, ((nsu)((nqk)d2).c()).d);
                }
                for (int i = 0; i < a3.f.size(); ++i) {
                    final aqkp aqkp = a3.f.get(i);
                    final addh addh = new addh(addb.a);
                    nwn.a(addh.d == null, "DomainValueHighlighter must be configured before attaching to a chart.");
                    addh.i = aqkp.c;
                    addh.j = aqkp.d;
                    final Paint a8 = addh.a;
                    int e;
                    if ((aqkp.b & 0x4) != 0x0) {
                        e = aqkp.e;
                    }
                    else {
                        e = -16777216;
                    }
                    a8.setColor(e);
                    addh.b = aqkp.g;
                    addh.c = aqkp.f;
                    if ((a.c & 0x20) != 0x0) {
                        addh.e = Optional.of((Object)addb.b);
                        CommandOuterClass$Command commandOuterClass$Command;
                        if ((commandOuterClass$Command = a.h) == null) {
                            commandOuterClass$Command = CommandOuterClass$Command.getDefaultInstance();
                        }
                        addh.f = Optional.of((Object)commandOuterClass$Command);
                    }
                    if (aqkp.d && !g.isEmpty()) {
                        addh.g = g;
                    }
                    addb.e.add(addh);
                    final nvd d3 = addb.d;
                    final StringBuilder sb = new StringBuilder("domain_value_highlighter_");
                    sb.append(i);
                    ((nqn)d3).s((nrx)addh, sb.toString());
                }
                for (final aqko aqko : a3.g) {
                    final nvd d4 = addb.d;
                    o = new nrq(addb.a, Double.valueOf(aqko.c), Double.valueOf(aqko.d));
                    final nsc a9 = nsc.a;
                    nwn.g((Object)a9, "axisTarget");
                    ((nrq)o).p = a9;
                    int e2;
                    if ((aqko.b & 0x4) != 0x0) {
                        e2 = aqko.e;
                    }
                    else {
                        e2 = 503316480;
                    }
                    ((nrq)o).e.setColor(e2);
                    ((nrq)o).d = false;
                    final nrz layoutParams = new nrz(((nrq)o).getLayoutParams());
                    layoutParams.b = 10;
                    ((nrq)o).setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                    ((nqn)d4).r((nrx)o);
                }
                if (!afcr.isEmpty()) {
                    final agzl c4 = a3.b.get(0).c;
                    final afcr afcr2 = (afcr)Collection$_EL.stream((Collection)a3.b).map((Function)acfd.k).collect(afaj.a);
                    final afcr afcr3 = (afcr)Collection$_EL.stream((Collection)a3.b).map((Function)acfd.l).collect(afaj.a);
                    aqkt aqkt;
                    if ((aqkt = a3.b.get(0).e) == null) {
                        aqkt = aqkt.a;
                    }
                    int c5;
                    if ((aqkt.b & 0x1) != 0x0) {
                        aqkt aqkt2;
                        if ((aqkt2 = a3.b.get(0).e) == null) {
                            aqkt2 = aqkt.a;
                        }
                        c5 = aqkt2.c;
                    }
                    else {
                        c5 = 2;
                    }
                    ((nqn)addb.d).w();
                    final nvd d5 = addb.d;
                    d5.d.b = (int)(c5 * addb.c);
                    ((nsu)((nqk)d5).a()).i(0);
                    aqkg aqkg;
                    if ((aqkg = a3.c) == null) {
                        aqkg = aqkg.a;
                    }
                    final agzl c6 = aqkg.c;
                    aqkg aqkg2;
                    if ((aqkg2 = a3.c) == null) {
                        aqkg2 = aqkg.a;
                    }
                    final agzl d6 = aqkg2.d;
                    if (afcr.size() == 1 && ((List)c6).size() == ((List)afcr.get(0)).size() && ((List)d6).size() == ((List)afcr.get(0)).size()) {
                        final nvh d7 = addb.d.d;
                        d7.e = true;
                        d7.g = true;
                        final List list = (List)afcr.get(0);
                        final Integer n = (Integer)afcr2.get(0);
                        final aqkg c7 = a3.c;
                        aqkg a10;
                        if (c7 == null) {
                            a10 = aqkg.a;
                        }
                        else {
                            a10 = c7;
                        }
                        int e3;
                        if ((a10.b & 0x1) != 0x0) {
                            aqkg a11;
                            if ((a11 = c7) == null) {
                                a11 = aqkg.a;
                            }
                            e3 = a11.e;
                        }
                        else {
                            e3 = Integer.MIN_VALUE;
                        }
                        final nvv g2 = nrw.G("lower", (List)c4, (List)c6);
                        g2.h(nvg.f, (Object)nrw.n(e3, 0));
                        final nvs a12 = nvg.a;
                        final Integer value = 0;
                        g2.h(a12, (Object)value);
                        g2.j();
                        final nvv g3 = nrw.G("upper", (List)c4, addb.a((List)d6, (List)c6));
                        g3.h(nvg.f, (Object)e3);
                        g3.h(nvg.a, (Object)value);
                        g3.j();
                        final nvv g4 = nrw.G("target", (List)c4, addb.a(list, (List)d6));
                        g4.i(n);
                        g4.h(nvg.f, (Object)nrw.n((int)n, 0));
                        final nvd d8 = addb.d;
                        if (adio.X(g4, list, (aqkw)afcr3.get(0))) {
                            ((nqn)d8).r((nrx)new nrd(d8.getContext()));
                        }
                        else {
                            adio.W(d8);
                        }
                        final nvd d9 = addb.d;
                        final ArrayList d10 = nrw.D(4);
                        d10.add(g2);
                        d10.add(g3);
                        d10.add(g4);
                        ((nqn)d9).u((List)d10);
                    }
                    else {
                        aqkt aqkt3;
                        if ((aqkt3 = a3.b.get(0).e) == null) {
                            aqkt3 = aqkt.a;
                        }
                        addb.d.d.e = ((aqkt3.b & 0x4) != 0x0);
                        final ArrayList ak = adwd.ak();
                    Label_2464:
                        for (int j = 0; j < afcr.size(); ++j) {
                            final List list2 = (List)afcr.get(j);
                            final int intValue = (int)afcr2.get(j);
                            final StringBuilder sb2 = new StringBuilder("target_");
                            sb2.append(j);
                            final nvv g5 = nrw.G(sb2.toString(), (List)c4, list2);
                            g5.i(Integer.valueOf(intValue));
                            final nvs f = nvg.f;
                            aqkt aqkt4;
                            if ((aqkt4 = a3.b.get(j).e) == null) {
                                aqkt4 = aqkt.a;
                            }
                            g5.h(f, (Object)aqkt4.e);
                            ak.add(g5);
                            final nvd d11 = addb.d;
                            if (ak.size() != ((List)afcr3).size()) {
                                adio.W(d11);
                            }
                            else {
                                for (int k = 0; k < ((List)afcr3).size(); ++k) {
                                    if (!adio.X((nvv)ak.get(k), (List)Collection$_EL.stream((Collection)((nvv)ak.get(k)).a).map((Function)acfd.m).collect(afaj.a), (aqkw)((List)afcr3).get(k))) {
                                        adio.W(d11);
                                        continue Label_2464;
                                    }
                                }
                                ((nqn)d11).r((nrx)new nrd(d11.getContext()));
                            }
                        }
                        ((nqn)addb.d).u((List)ak);
                    }
                    if (!g.isEmpty() && Collection$_EL.stream((Collection)a3.f).noneMatch((Predicate)acbk.n)) {
                        final nvd d12 = addb.d;
                        adio.T((nqn)d12, g, d12.d.e ^ true);
                    }
                }
                else {
                    final aqkx g6 = a.g;
                    aqkx a13;
                    if (g6 == null) {
                        a13 = aqkx.a;
                    }
                    else {
                        a13 = g6;
                    }
                    if ((a13.b & 0x4) != 0x0) {
                        aqkx a14;
                        if ((a14 = g6) == null) {
                            a14 = aqkx.a;
                        }
                        final String e4 = a14.e;
                        final nvd d13 = addb.d;
                        ((nqn)d13).r((nrx)new nut(d13.getContext(), e4, adio.R(addb.a)));
                        addb.d.setContentDescription((CharSequence)e4);
                    }
                    ((nqn)addb.d).m(nrw.I("empty"));
                }
            }
            final nvd d14 = ((addb)c.get()).d;
            if (d14 != null) {
                frameLayout.addView((View)d14);
            }
        }
        else if (a2.isPresent()) {
            final adcw adcw = (adcw)a2.get();
            adcw.c = null;
            aqkx aqkx5;
            if ((aqkx5 = a.g) == null) {
                aqkx5 = aqkx.a;
            }
            aqkh a15;
            if (aqkx5.c == 2) {
                a15 = (aqkh)aqkx5.d;
            }
            else {
                a15 = aqkh.a;
            }
            aqkx aqkx6;
            if ((aqkx6 = a.g) == null) {
                aqkx6 = aqkx.a;
            }
            if (aqkx6.c == 2) {
                if (a15.c.size() != 0) {
                    final agzy c8 = a15.c;
                    ((nqn)(adcw.c = new nrj(adcw.a))).w();
                    adio.V((nqn)adcw.c);
                    final afcr afcr4 = (afcr)Collection$_EL.stream((Collection)c8).map((Function)acfd.g).collect(afaj.a);
                    final nrj c9 = adcw.c;
                    aqkx aqkx7;
                    if ((aqkx7 = a.g) == null) {
                        aqkx7 = aqkx.a;
                    }
                    aqkh a16;
                    if (aqkx7.c == 2) {
                        a16 = (aqkh)aqkx7.d;
                    }
                    else {
                        a16 = aqkh.a;
                    }
                    if ((a16.b & 0x1) != 0x0) {
                        aqku aqku3;
                        if ((aqku3 = a16.d) == null) {
                            aqku3 = aqku.a;
                        }
                        final ntd o3 = adio.O(aqku3);
                        final nsw c10 = ((nqk)c9).c();
                        ((nsu)c10).k((nst)new addi());
                        ((nsu)c10).i((int)adcw.b);
                        ((nsu)c10).b = (ntf)new ntb((List)aqku3.d, 0);
                        ((nsu)c10).c = o3;
                        adio.U(a, adcw.a, ((nsu)((nqk)c9).c()).d);
                    }
                    else {
                        ((nqk)c9).c().setVisibility(8);
                    }
                    final nrj c11 = adcw.c;
                    final aqkx g7 = a.g;
                    aqkx a17;
                    if (g7 == null) {
                        a17 = aqkx.a;
                    }
                    else {
                        a17 = g7;
                    }
                    aqkh a18;
                    if (a17.c == 2) {
                        a18 = (aqkh)a17.d;
                    }
                    else {
                        a18 = aqkh.a;
                    }
                    final agzy c12 = a18.c;
                    aqkx a19 = g7;
                    if (g7 == null) {
                        a19 = aqkx.a;
                    }
                    aqkh a20;
                    if (a19.c == 2) {
                        a20 = (aqkh)a19.d;
                    }
                    else {
                        a20 = aqkh.a;
                    }
                    aqkj aqkj;
                    if ((aqkj = a20.e) == null) {
                        aqkj = aqkj.a;
                    }
                    if (Collection$_EL.stream((Collection)c12).noneMatch((Predicate)acbk.i)) {
                        ((nsy)((nqk)c11).a()).setVisibility(8);
                    }
                    else {
                        final nsy nsy = (nsy)((nqk)c11).a();
                        final int d15 = aqql.D(aqkj.c);
                        Label_3189: {
                            if (d15 != 0) {
                                if (d15 == 3) {
                                    o = new ntl();
                                    break Label_3189;
                                }
                            }
                            o = new ntm();
                        }
                        ((nsu)nsy).k((nst)o);
                        ((nsu)nsy).b = (ntf)new ntb((List)Collection$_EL.stream((Collection)c12).filter((Predicate)acbk.j).map((Function)acfd.g).collect(afaj.a), 0);
                        ((nsu)nsy).c = (ntd)new adda(c12, 1);
                        ((nsu)((nqk)c11).a()).i(0);
                        adio.U(a, adcw.a, ((nsu)((nqk)c11).a()).d);
                    }
                    if (Collection$_EL.stream((Collection)c8).anyMatch((Predicate)acbk.k)) {
                        adcw.c.setImportantForAccessibility(2);
                        final ArrayList ak2 = adwd.ak();
                        final HashMap hashMap = new HashMap();
                        for (int l = 0; l < c8.size(); ++l) {
                            for (final aqkk aqkk : a15.c.get(l).e) {
                                int d16;
                                if ((aqkk.b & 0x2) != 0x0) {
                                    d16 = aqkk.d;
                                }
                                else {
                                    d16 = -16777216;
                                }
                                final Integer value2 = d16;
                                List<Double> list3;
                                if (hashMap.containsKey(value2)) {
                                    list3 = (List<Double>)hashMap.get(value2);
                                }
                                else {
                                    final Double[] array = new Double[afcr4.size()];
                                    Arrays.fill(array, 0.0);
                                    list3 = Arrays.asList(array);
                                    hashMap.put(value2, list3);
                                }
                                list3.set(l, aqkk.c);
                            }
                        }
                        final Iterator iterator3 = hashMap.keySet().iterator();
                        int n2 = 0;
                        while (iterator3.hasNext()) {
                            final Integer n3 = (Integer)iterator3.next();
                            final List list4 = (List)hashMap.get(n3);
                            final StringBuilder sb3 = new StringBuilder("data_");
                            sb3.append(n2);
                            final nvv h = nrw.H(sb3.toString(), (List)afcr4, (List)list4);
                            h.i(n3);
                            ak2.add(h);
                            ++n2;
                        }
                        aqkj aqkj2;
                        if ((aqkj2 = a15.e) == null) {
                            aqkj2 = aqkj.a;
                        }
                        if (!aqkj2.b) {
                            adcw.c.B.a = true;
                            if (Collection$_EL.stream((Collection)c8).noneMatch((Predicate)acbk.l)) {
                                adcw.c.B.d = 0.0f;
                            }
                        }
                        final Optional max = Collection$_EL.stream((Collection)c8).map((Function)acfd.h).max(Comparator$_CC.naturalOrder());
                        if (max.isPresent() && (int)max.get() > 0) {
                            final afcm d17 = afcr.d();
                            int n4 = 0;
                            boolean b4 = false;
                            while (n4 < (int)max.get()) {
                                final agza builder = ((agzi)aqkm.a).createBuilder();
                                for (int n5 = 0; n5 < c8.size(); ++n5) {
                                    if ((((aqkk)((aqki)c8.get(n5)).e.get(n4)).b & 0x4) != 0x0) {
                                        final String e5 = c8.get(n5).e.get(n4).e;
                                        builder.copyOnWrite();
                                        final aqkm aqkm = (aqkm)builder.instance;
                                        e5.getClass();
                                        final agzy b5 = aqkm.b;
                                        if (!b5.c()) {
                                            aqkm.b = agzi.mutableCopy(b5);
                                        }
                                        aqkm.b.add(e5);
                                        b4 = true;
                                    }
                                }
                                final agza builder2 = ((agzi)aqky.a).createBuilder();
                                builder2.copyOnWrite();
                                final aqky aqky = (aqky)builder2.instance;
                                final aqkm c13 = (aqkm)builder.build();
                                c13.getClass();
                                aqky.c = c13;
                                aqky.b = 1;
                                d17.h((Object)builder2.build());
                                ++n4;
                            }
                            if (b4) {
                                adio.T((nqn)adcw.c, d17.g(), false);
                            }
                        }
                        ((nqn)adcw.c).u((List)ak2);
                    }
                    else {
                        final aqkx g8 = a.g;
                        aqkx a21;
                        if (g8 == null) {
                            a21 = aqkx.a;
                        }
                        else {
                            a21 = g8;
                        }
                        if ((a21.b & 0x4) != 0x0) {
                            aqkx a22;
                            if ((a22 = g8) == null) {
                                a22 = aqkx.a;
                            }
                            final String e6 = a22.e;
                            final nrj c14 = adcw.c;
                            final Context a23 = adcw.a;
                            ((nqn)c14).r((nrx)new nut(a23, e6, adio.R(a23)));
                            adcw.c.setContentDescription((CharSequence)e6);
                        }
                        ((nqn)adcw.c).m(nrw.I("empty"));
                        ((nqn)adcw.c).m(nrw.H("empty", (List)afcr4, (List)Arrays.asList(new Double[((List)afcr4).size()])));
                    }
                }
            }
            final nrj c15 = ((adcw)a2.get()).c;
            if (c15 != null) {
                frameLayout.addView((View)c15);
            }
        }
    }
    
    protected final void ad(final dwq dwq, final dwq dwq2) {
        final adcx adcx = (adcx)dwq;
        final adcx adcx2 = (adcx)dwq2;
        adcx2.a = adcx.a;
        adcx2.b = adcx.b;
        adcx2.c = adcx.c;
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
    
    protected final boolean ay(final dss dss, final dss dss2) {
        final adcz adcz = (adcz)dss;
        final adcz adcz2 = (adcz)dss2;
        Object a;
        if (adcz == null) {
            a = null;
        }
        else {
            a = adcz.a;
        }
        final dua dua = new dua(a, (Object)adcz2.a);
        final aqke aqke = (aqke)dua.a;
        final aqke aqke2 = (aqke)dua.b;
        if (aqke != null) {
            if (aqke2 != null) {
                aqkx aqkx;
                if ((aqkx = aqke.g) == null) {
                    aqkx = aqkx.a;
                }
                if (aqkx.c == 1) {
                    aqkx aqkx2;
                    if ((aqkx2 = aqke2.g) == null) {
                        aqkx2 = aqkx.a;
                    }
                    if (aqkx2.c == 1) {
                        final int d = aqke.d;
                        final int d2 = aqke2.d;
                        final int e = aqke.e;
                        final int e2 = aqke2.e;
                        aqkx aqkx3;
                        if ((aqkx3 = aqke.g) == null) {
                            aqkx3 = aqkx.a;
                        }
                        aqkq a2;
                        if (aqkx3.c == 1) {
                            a2 = (aqkq)aqkx3.d;
                        }
                        else {
                            a2 = aqkq.a;
                        }
                        aqkx aqkx4;
                        if ((aqkx4 = aqke2.g) == null) {
                            aqkx4 = aqkx.a;
                        }
                        aqkq a3;
                        if (aqkx4.c == 1) {
                            a3 = (aqkq)aqkx4.d;
                        }
                        else {
                            a3 = aqkq.a;
                        }
                        if (d == d2 && e == e2 && Objects.equals((Object)a2.b, (Object)a3.b)) {
                            aqkg aqkg;
                            if ((aqkg = a2.c) == null) {
                                aqkg = aqkg.a;
                            }
                            aqkg aqkg2;
                            if ((aqkg2 = a3.c) == null) {
                                aqkg2 = aqkg.a;
                            }
                            if (Objects.equals((Object)aqkg, (Object)aqkg2)) {
                                aqkn aqkn;
                                if ((aqkn = a2.d) == null) {
                                    aqkn = aqkn.a;
                                }
                                aqkn aqkn2;
                                if ((aqkn2 = a3.d) == null) {
                                    aqkn2 = aqkn.a;
                                }
                                if (Objects.equals((Object)aqkn, (Object)aqkn2)) {
                                    aqku aqku;
                                    if ((aqku = a2.e) == null) {
                                        aqku = aqku.a;
                                    }
                                    aqku aqku2;
                                    if ((aqku2 = a3.e) == null) {
                                        aqku2 = aqku.a;
                                    }
                                    if (Objects.equals((Object)aqku, (Object)aqku2) && Objects.equals((Object)a2.g, (Object)a3.g) && a2.f.size() == a3.f.size()) {
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
    
    public final boolean f(final dss dss) {
        if (this == dss) {
            return true;
        }
        if (dss != null && this.getClass() == dss.getClass()) {
            final adcz adcz = (adcz)dss;
            final aqke a = this.a;
            Label_0062: {
                if (a != null) {
                    if (((agzi)a).equals((Object)adcz.a)) {
                        break Label_0062;
                    }
                }
                else if (adcz.a == null) {
                    break Label_0062;
                }
                return false;
            }
            final ort b = this.b;
            if (b != null) {
                if (b.equals(adcz.b)) {
                    return true;
                }
            }
            else if (adcz.b == null) {
                return true;
            }
            return false;
        }
        return false;
    }
}
