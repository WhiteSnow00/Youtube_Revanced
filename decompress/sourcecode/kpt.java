import java.util.Deque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import android.text.TextUtils;
import java.util.Iterator;
import android.content.Context;
import android.view.View$OnClickListener;
import android.view.View;
import android.content.res.ColorStateList;
import java.util.ArrayList;
import android.view.ViewGroup;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kpt
{
    private final List a;
    private final ViewGroup b;
    private final atjj c;
    private final abno d;
    private boolean e;
    private final zzu f;
    private final hdv g;
    private final hdv h;
    private final hdv i;
    private final hdv j;
    private final hdv k;
    private final hdv l;
    private final hdv m;
    private final hdv n;
    
    public kpt(final ViewGroup b, final atjj c, final abno d, final zzu f, final kpq kpq, final kqa kqa, final kpw kpw, final kqf kqf, final kpo kpo, final kpl kpl, final kqf kqf2, final byte[] array) {
        this.a = new ArrayList();
        this.e = true;
        this.b = b;
        this.c = c;
        this.d = d;
        this.f = f;
        this.g = new hdv(b, (kpr)kpq);
        this.h = new hdv(b, (kpr)kqa);
        this.i = new hdv(b, (kpr)kpw);
        this.j = new hdv(b, (kpr)kpw);
        this.k = new hdv(b, (kpr)kqf);
        this.l = new hdv(b, (kpr)kpo);
        this.m = new hdv(b, (kpr)kpl);
        this.n = new hdv(b, (kpr)kqf2);
    }
    
    private final void h(final Object o, final String s, final acij g) {
        final boolean b = o instanceof aofz;
        boolean b2 = false;
        Object o2 = null;
        Label_1526: {
            Object o3;
            if (b) {
                final aofz r = (aofz)o;
                if (!r.c) {
                    o3 = this.g.p();
                    ((kph)o3).c(r, (wwv)this.c.a(), g);
                    this.a.add(new trg(1, (kps)o3, this.g, (byte[])null, (byte[])null, (byte[])null));
                }
                else {
                    final zzl d = this.d(s);
                    final abno d2 = this.d;
                    if ((d != null && !d.q() && !d.v()) || ezp.h(d2) != null || kpz.d(d2) != null) {
                        o2 = this.h.p();
                        final wwv q = (wwv)this.c.a();
                        ((kpz)o2).s = s;
                        r.getClass();
                        ((kpz)o2).r = r;
                        q.getClass();
                        ((kpz)o2).q = q;
                        aibc aibc;
                        if ((aibc = r.f) == null) {
                            aibc = aibc.a;
                        }
                        agot.D(0x1 == (aibc.b & 0x1));
                        aibc aibc2;
                        if ((aibc2 = r.f) == null) {
                            aibc2 = aibc.a;
                        }
                        aibb t;
                        if ((t = aibc2.c) == null) {
                            t = aibb.a;
                        }
                        ((kpz)o2).t = t;
                        ((kpz)o2).c.i = s;
                        aibc aibc3;
                        if ((aibc3 = r.f) == null) {
                            aibc3 = aibc.a;
                        }
                        aibb aibb;
                        if ((aibb = aibc3.c) == null) {
                            aibb = aibb.a;
                        }
                        final boolean h = aibb.h;
                        final boolean b3 = h ^ true;
                        final View g2 = ((kpz)o2).g;
                        float alpha;
                        if (!h) {
                            alpha = 1.0f;
                        }
                        else {
                            alpha = 0.5f;
                        }
                        g2.setAlpha(alpha);
                        final View g3 = ((kpz)o2).g;
                        View$OnClickListener m;
                        if (b3) {
                            m = ((kpz)o2).m;
                        }
                        else {
                            m = null;
                        }
                        g3.setOnClickListener(m);
                        ((kpz)o2).g.setClickable(b3);
                        ((kpz)o2).i.setClickable(b3);
                        ((kpz)o2).i.setImportantForAccessibility(2);
                        ((kpz)o2).e.g((Object)((kpz)o2).c);
                        final aibb d3 = kpz.d(((kpz)o2).k);
                        aoqe aoqe;
                        if (d3 != null && d3.c == 20) {
                            aoqe = (aoqe)d3.d;
                        }
                        else {
                            final aibb t2 = ((kpz)o2).t;
                            if (t2.c == 20) {
                                aoqe = (aoqe)t2.d;
                            }
                            else {
                                aoqe = null;
                            }
                        }
                        ColorStateList textColor;
                        if (aoqe != null && (aoqe.b & 0x1) != 0x0) {
                            final Context d4 = ((kpz)o2).d;
                            aoqb aoqb;
                            if ((aoqb = aoqb.b(aoqe.c)) == null) {
                                aoqb = aoqb.a;
                            }
                            textColor = ColorStateList.valueOf(actf.a(d4, aoqb, 0));
                        }
                        else {
                            textColor = ((kpz)o2).n;
                        }
                        ((kpz)o2).h.setTextColor(textColor);
                        ColorStateList list;
                        if (aoqe != null && (0x2 & aoqe.b) != 0x0) {
                            final Context d5 = ((kpz)o2).d;
                            aoqb aoqb2;
                            if ((aoqb2 = aoqb.b(aoqe.d)) == null) {
                                aoqb2 = aoqb.a;
                            }
                            list = ColorStateList.valueOf(actf.a(d5, aoqb2, 0));
                        }
                        else {
                            list = ((kpz)o2).o;
                        }
                        ((kpz)o2).i.b(list);
                        final aibb d6 = kpz.d(((kpz)o2).k);
                        if (d6 != null) {
                            final iez c = ((kpz)o2).c;
                            c.h = d6;
                            c.g = null;
                        }
                        else {
                            final iez c2 = ((kpz)o2).c;
                            c2.g = ezp.h(((kpz)o2).k);
                            c2.h = null;
                        }
                        if (kpz.d(((kpz)o2).k) != null) {
                            ((kpz)o2).qa((zzl)null);
                            tcp.n((aum)((kpz)o2).a, ((kpz)o2).c(), (trb)jpn.p, (trb)new kpx((kpz)o2, 1));
                        }
                        ((kpz)o2).a((zzl)null, ezp.h(((kpz)o2).k));
                        ((kpz)o2).e((zzl)null);
                        tcp.n((aum)((kpz)o2).a, ((kpz)o2).c(), (trb)jpn.q, (trb)new kpx((kpz)o2, 0));
                        ((kpz)o2).g.setId(2131430125);
                        if (((kpz)o2).g.getVisibility() == 0) {
                            final aibb t3 = ((kpz)o2).t;
                            if (t3 != null) {
                                ((kpz)o2).v.S(t3, ((kpz)o2).g);
                            }
                        }
                        this.a.add(new trg(2, (kps)o2, this.h, (byte[])null, (byte[])null, (byte[])null));
                    }
                    break Label_1526;
                }
            }
            else if (o instanceof aogc) {
                final aogc aogc = (aogc)o;
                if (aogc.c) {
                    o3 = this.i.p();
                    ((kqe)o3).k(aogc);
                    this.a.add(new trg(3, (kps)o3, this.i, (byte[])null, (byte[])null, (byte[])null));
                }
                else if (aogc.d) {
                    o3 = this.j.p();
                    ((kqe)o3).k(aogc);
                    this.a.add(new trg(4, (kps)o3, this.j, (byte[])null, (byte[])null, (byte[])null));
                }
                else {
                    o3 = this.k.p();
                    ((kqe)o3).k(aogc);
                    this.a.add(new trg(5, (kps)o3, this.k, (byte[])null, (byte[])null, (byte[])null));
                }
            }
            else if (o instanceof aofy) {
                final aofy aofy = (aofy)o;
                o3 = this.l.p();
                ((kpn)o3).n(aofy);
                this.a.add(new trg(6, (kps)o3, this.l, (byte[])null, (byte[])null, (byte[])null));
            }
            else if (o instanceof ahgv) {
                final ahgv ahgv = (ahgv)o;
                final kpk kpk = (kpk)this.m.p();
                final wwv f = (wwv)this.c.a();
                ahgv.getClass();
                f.getClass();
                kpk.f = f;
                g.getClass();
                kpk.g = g;
                if ((ahgv.b & 0x8) != 0x0) {
                    final agza builder = ((agzi)aofz.a).createBuilder();
                    aibc f2;
                    if ((f2 = ahgv.d) == null) {
                        f2 = aibc.a;
                    }
                    builder.copyOnWrite();
                    final aofz aofz = (aofz)builder.instance;
                    f2.getClass();
                    aofz.f = f2;
                    aofz.b |= 0x8;
                    kpk.c = (aofz)builder.build();
                }
                if ((ahgv.b & 0x10) != 0x0) {
                    final agza builder2 = ((agzi)aofz.a).createBuilder();
                    aibc f3;
                    if ((f3 = ahgv.e) == null) {
                        f3 = aibc.a;
                    }
                    builder2.copyOnWrite();
                    final aofz aofz2 = (aofz)builder2.instance;
                    f3.getClass();
                    aofz2.f = f3;
                    aofz2.b |= 0x8;
                    kpk.d = (aofz)builder2.build();
                }
                final String f4 = ahgv.f;
                final vbp b4 = kpk.b.b();
                if (kpk.e == null) {
                    kpk.e = ((vdo)b4).h(f4, false).aa(ashw.a()).aC((asix)new kca(kpk, 12), (asix)jky.s);
                }
                ((vdo)b4).f(f4).E(ashw.a()).s((asix)new kca(kpk, 13)).p((asir)new gco(kpk, ahgv, 9)).ab();
                this.a.add(new trg(7, (kps)kpk, this.m, (byte[])null, (byte[])null, (byte[])null));
                o3 = kpk;
            }
            else {
                if (!(o instanceof ajkj)) {
                    break Label_1526;
                }
                final ajkj ajkj = (ajkj)o;
                o3 = this.n.p();
                final wwv wwv = (wwv)this.c.a();
                final abzh d7 = ((acae)((kpu)o3).b.a()).d(ajkj);
                ((wwx)g).a(wwv);
                ((kpu)o3).a.addView(((kpu)o3).c.a(), 0);
                ((kpu)o3).c.b(g, d7);
                this.a.add(new trg(8, (kps)o3, this.n, (byte[])null, (byte[])null, (byte[])null));
            }
            o2 = o3;
        }
        final boolean e = this.e;
        if (o2 != null) {
            b2 = true;
        }
        this.e = (e | b2);
    }
    
    public final View a() {
        final kpn c = this.c();
        if (c != null) {
            return ((kpi)c).c;
        }
        return null;
    }
    
    public final View b() {
        for (final trg trg : this.a) {
            if (trg.a == 2) {
                return ((kps)trg.b).pZ();
            }
        }
        return null;
    }
    
    public final kpn c() {
        for (final trg trg : this.a) {
            if (trg.a == 6) {
                final Object b = trg.b;
                if (b instanceof kpn) {
                    return (kpn)b;
                }
                continue;
            }
        }
        return null;
    }
    
    public final zzl d(String o) {
        final Object o2 = null;
        try {
            if (TextUtils.isEmpty((CharSequence)o)) {
                o = o2;
            }
            else {
                o = ((aexq)this.f.a().l().h((String)o).get(4L, TimeUnit.SECONDS)).f();
            }
            return (zzl)o;
        }
        catch (final TimeoutException ex) {
            trn.d("Get video snapshot timed out for video id ".concat(String.valueOf(o)), (Throwable)ex);
            return null;
        }
        catch (final InterruptedException ex2) {
            trn.d("Get video snapshot was interrupted for video id ".concat(String.valueOf(o)), (Throwable)ex2);
            return null;
        }
        catch (final ExecutionException ex3) {
            trn.d("Failed to get video snapshot for video id ".concat(String.valueOf(o)), (Throwable)ex3);
            return null;
        }
    }
    
    public final void e(final Iterable iterable, final String s, final acij acij) {
        for (final aoga aoga : iterable) {
            final int b = aoga.b;
            if (b == 124608017) {
                this.h(aoga.c, s, acij);
            }
            else if (b == 124608045) {
                this.h(aoga.c, s, acij);
            }
            else if (b == 186676672) {
                this.h(aoga.c, s, acij);
            }
            else if (b == 265166751) {
                this.h(aoga.c, s, acij);
            }
            else {
                if (b != 153515154) {
                    continue;
                }
                this.h(aoga.c, s, acij);
            }
        }
    }
    
    public final void f() {
        for (final trg trg : adwd.ap(this.a)) {
            final Object c = trg.c;
            final Object b = trg.b;
            ((kps)b).b();
            final hdv hdv = (hdv)c;
            ((ViewGroup)hdv.c).removeView(((kps)b).pZ());
            ((Deque<kps>)hdv.b).offerLast((kps)b);
        }
        this.a.clear();
    }
    
    public final void g() {
        final boolean e = this.e;
        boolean b = false;
        if (e) {
            this.b.removeAllViews();
            this.e = true;
            final Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                this.b.addView(((kps)((trg)iterator.next()).b).pZ());
            }
            this.e = false;
        }
        final ViewGroup b2 = this.b;
        if (b2.getChildCount() > 0) {
            b = true;
        }
        tmy.v((View)b2, b);
    }
}
