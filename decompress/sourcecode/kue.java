import android.view.View;
import android.widget.AdapterView;
import com.google.protobuf.MessageLite;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.Iterator;
import android.support.v7.widget.RecyclerView;
import android.graphics.drawable.Drawable;
import android.widget.ListAdapter;
import java.util.function.Consumer;
import android.text.TextUtils;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.List;
import com.google.android.apps.youtube.app.watch.panel.ui.cinematics.WatchCinematicSettingsController;
import android.content.Context;
import android.widget.ListView;
import android.widget.AdapterView$OnItemClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kue implements AdapterView$OnItemClickListener, abyw, abnq
{
    private static final aext d;
    private ListView A;
    private final mri B;
    private final bx C;
    private final aeby D;
    private final aeby E;
    private qpt F;
    public kud a;
    wxz b;
    achr c;
    private final Context e;
    private final abno f;
    private final acng g;
    private final isf h;
    private final isa i;
    private final WatchCinematicSettingsController j;
    private final abns k;
    private final gps l;
    private final wwv m;
    private final List n;
    private final acae o;
    private final acrz p;
    private final atjj q;
    private final asib r;
    private final Map s;
    private final Map t;
    private final Set u;
    private final Set v;
    private final List w;
    private final String x;
    private final Set y;
    private achf z;
    
    static {
        d = kcf.i;
    }
    
    public kue(final Context e, final abno f, final acng g, final isf h, final isa i, final WatchCinematicSettingsController j, final aeby e2, final abns k, final gps l, final wwv m, final bx c, final List n, final vax vax, final aeby d, final acae o, final olq olq, final uyi uyi, final osx osx, final atjj atjj, final atjj q, final String x, final ameo ameo, final Set y, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        this.r = new asib();
        this.s = new HashMap();
        this.t = new HashMap();
        this.u = new HashSet();
        this.v = new HashSet();
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.E = e2;
        this.k = k;
        this.l = l;
        this.m = m;
        this.C = c;
        this.n = n;
        this.D = d;
        this.o = o;
        this.q = q;
        final ota a = otb.a(olq.a);
        a.d(false);
        this.p = new acrz(olq, a.a(), uyi, m, osx, atjj);
        this.x = x;
        this.y = y;
        if (ameo != null) {
            this.w = ameo.c;
        }
        else {
            this.w = new ArrayList();
        }
        this.B = new mri(f, vax);
    }
    
    private final irv j(final iru iru) {
        final irv a = iru.a();
        if (this.F == null) {
            this.F = new qpt(this);
        }
        final qpt f = this.F;
        f.getClass();
        a.a.add(f);
        a.j = (Runnable)new kpa(this, a, 8);
        this.u.add(a);
        this.t.put(iru.oQ(), true);
        return a;
    }
    
    public final Optional a() {
        final acjb acjb = new acjb();
        final List w = this.w;
        int n2;
        if (w != null) {
            final Iterator iterator = w.iterator();
            int n = 0;
            while (true) {
                n2 = n;
                if (!iterator.hasNext()) {
                    break;
                }
                final amel amel = (amel)iterator.next();
                amem amem;
                if ((amem = amel.c) == null) {
                    amem = amem.a;
                }
                if ((amem.b & 0x2) != 0x0) {
                    amem amem2;
                    if ((amem2 = amel.c) == null) {
                        amem2 = amem.a;
                    }
                    akbf akbf;
                    if ((akbf = amem2.d) == null) {
                        akbf = akbf.a;
                    }
                    akbe akbe;
                    if ((akbe = akbe.b(akbf.c)) == null) {
                        akbe = akbe.a;
                    }
                    if (akbe == akbe.pq && TextUtils.isEmpty((CharSequence)vwh.g(amel))) {
                        continue;
                    }
                }
                final amem c = amel.c;
                amem a;
                if (c == null) {
                    a = amem.a;
                }
                else {
                    a = c;
                }
                if ((a.b & 0x2) != 0x0) {
                    amem a2;
                    if ((a2 = c) == null) {
                        a2 = amem.a;
                    }
                    akbf akbf2;
                    if ((akbf2 = a2.d) == null) {
                        akbf2 = akbf.a;
                    }
                    akbe akbe2;
                    if ((akbe2 = akbe.b(akbf2.c)) == null) {
                        akbe2 = akbe.a;
                    }
                    if (akbe2 == akbe.kB && TextUtils.isEmpty((CharSequence)vwh.g(amel))) {
                        continue;
                    }
                }
                final int b = amel.b;
                n |= (((b & 0x2000) != 0x0) ? 1 : 0);
                Optional optional = null;
                Label_0717: {
                    if ((b & 0x4000) != 0x0) {
                        amen amen;
                        if ((amen = amel.q) == null) {
                            amen = amen.a;
                        }
                        final iru iru = this.s.get(amen.b);
                        Object j;
                        if (iru == null) {
                            j = null;
                        }
                        else {
                            j = this.j(iru);
                        }
                        optional = Optional.ofNullable(j);
                    }
                    else {
                        final String g = vwh.g(amel);
                        if (g != null) {
                            final iru iru2 = this.s.get(g);
                            if (iru2 != null && this.v.contains(g) && (amel.b & 0x2000) == 0x0) {
                                optional = Optional.of((Object)this.j(iru2));
                                break Label_0717;
                            }
                            this.t.put(g, false);
                        }
                        if ((amel.b & 0x2000) != 0x0) {
                            final acae o = this.o;
                            ajkj ajkj;
                            if ((ajkj = amel.p) == null) {
                                ajkj = ajkj.a;
                            }
                            optional = Optional.of((Object)o.d(ajkj));
                        }
                        else {
                            final CharSequence f = vwh.f(amel);
                            final akbf d = vwh.d(amel);
                            if (f == null) {
                                if (d != null && (d.b & 0x1) != 0x0) {
                                    final zjo b2 = zjo.b;
                                    final zjn y = zjn.y;
                                    akbe akbe3;
                                    if ((akbe3 = akbe.b(d.c)) == null) {
                                        akbe3 = akbe.a;
                                    }
                                    final int sv = akbe3.sv;
                                    final StringBuilder sb = new StringBuilder("Text missing for BottomSheetListMenuItem with iconType: ");
                                    sb.append(sv);
                                    zjp.b(b2, y, sb.toString());
                                }
                                else {
                                    zjp.b(zjo.b, zjn.y, "Text missing for BottomSheetListMenuItem.");
                                }
                                optional = Optional.empty();
                            }
                            else {
                                final acpv acpv = new acpv(f.toString(), amel);
                                if (d != null) {
                                    final acng g2 = this.g;
                                    akbe akbe4;
                                    if ((akbe4 = akbe.b(d.c)) == null) {
                                        akbe4 = akbe.a;
                                    }
                                    final int a3 = g2.a(akbe4);
                                    if (a3 > 0) {
                                        ((qjg)acpv).e = this.e.getResources().getDrawable(a3);
                                    }
                                }
                                ((acpu)acpv).j = (Runnable)new kpa(this, acpv, 9);
                                optional = Optional.of((Object)acpv);
                            }
                        }
                    }
                }
                optional.ifPresent((Consumer)new jpl(acjb, 16));
            }
        }
        else {
            n2 = 0;
        }
        final acjb acjb2 = new acjb();
        this.z = new achf((achk)acjb2);
        for (final iru iru3 : this.n) {
            if (!this.t.containsKey(iru3.oQ())) {
                acjb2.add((Object)this.j(iru3));
            }
        }
        for (final iru iru4 : this.n) {
            final Boolean b3 = this.t.get(iru4.oQ());
            if (b3 == null || !b3) {
                iru4.oO();
            }
        }
        final acib acib = new acib();
        acib.m((achk)acjb);
        final achf z = this.z;
        if (z != null) {
            acib.m((achk)z);
        }
        this.c = new achr((achk)acib, kue.d);
        Object t;
        if (n2 != 0) {
            final achs achs = new achs();
            ((acir)achs).f(irv.class, (acip)new acit(this.q, 0));
            ((acir)achs).f(acpv.class, (acip)new acit(this.q, 0));
            t = this.D.T((acir)achs);
            final achr c2 = this.c;
            c2.getClass();
            ((aciw)t).h((achk)c2);
        }
        else {
            final Context e = this.e;
            final achr c3 = this.c;
            c3.getClass();
            t = new acps(e, (achk)c3);
        }
        if (t instanceof acps) {
            final acps adapter = (acps)t;
            if (adapter.getCount() == 0) {
                return Optional.empty();
            }
            (this.A = (ListView)new acqo(this.e)).setNestedScrollingEnabled(true);
            this.A.setAdapter((ListAdapter)adapter);
            this.A.setOnItemClickListener((AdapterView$OnItemClickListener)this);
            this.A.setDivider((Drawable)null);
            this.A.setDividerHeight(0);
            return Optional.of((Object)this.A);
        }
        else {
            if (t instanceof aciw) {
                final aciw aciw = (aciw)t;
                Optional optional2;
                if (aciw.a() == 0) {
                    optional2 = Optional.empty();
                }
                else {
                    final RecyclerView recyclerView = new RecyclerView(this.e);
                    ((acon)this.p.b(recyclerView, aciw)).a(recyclerView);
                    optional2 = Optional.of((Object)recyclerView);
                }
                return optional2;
            }
            return Optional.empty();
        }
    }
    
    public final void b() {
        this.s.clear();
        this.v.clear();
        for (final iru iru : this.n) {
            this.s.put(iru.oQ(), iru);
            if (iru.oP()) {
                this.v.add(iru.oQ());
            }
        }
    }
    
    public final void c() {
        this.r.b();
        this.E.am((abyw)this);
        this.l.d(false);
        final wxz b = this.b;
        if (b != null) {
            this.m.o(b, (alff)null);
            this.l.c();
        }
        this.h.k();
        this.i.j();
        this.j.b.b("menu_item_cinematic_lighting", Boolean.valueOf(false));
        if (!this.u.isEmpty() && this.F != null) {
            for (final irv irv : this.u) {
                final qpt f = this.F;
                f.getClass();
                irv.a.remove(f);
            }
        }
    }
    
    public final void f(final qjf qjf) {
        if (!(qjf instanceof qjg)) {
            return;
        }
        final mri b = this.B;
        final qjg qjg = (qjg)qjf;
        if (qjg instanceof acpv) {
            final amel k = ((acpv)qjg).k;
            if (k != null) {
                final String x = this.x;
                if (x != null) {
                    final Object a = b.a;
                    final Object b2 = b.b;
                    if (TextUtils.equals((CharSequence)x, (CharSequence)((abno)a).s())) {
                        aioe aioe;
                        if ((aioe = vwh.c(k)) == null) {
                            aioe = vwh.b(k);
                        }
                        if (aioe != null) {
                            ((vax)b2).a(aioe);
                        }
                    }
                }
            }
        }
        else if (qjg instanceof irv) {
            ((irv)qjg).a();
        }
        final kud a2 = this.a;
        if (a2 != null) {
            a2.a();
        }
    }
    
    public final void g(final PlayerResponseModel playerResponseModel) {
        if (playerResponseModel == null) {
            return;
        }
        final wws a = wws.a((MessageLite)playerResponseModel.A());
        final wxz b = this.b;
        if (a != b) {
            if (b != null) {
                this.m.o(b, (alff)null);
            }
            if ((this.b = (wxz)a) != null) {
                this.m.D((wxz)a);
                this.m.t(this.b, (alff)null);
                this.l.c();
            }
        }
    }
    
    public final void h() {
        this.i();
        this.r.b();
        this.r.f(this.lX(this.k));
        this.E.aj((abyw)this);
        this.C.O();
        this.l.d(true);
        final abtt q = this.f.q();
        if (q != null) {
            this.g(q.d());
        }
        final Set y = this.y;
        boolean b = false;
        if (y != null) {
            b = b;
            if (y.contains(0)) {
                b = true;
            }
        }
        this.h.l(b);
        this.i.k();
        final Set y2 = this.y;
        if (y2 != null && y2.contains(1)) {
            this.j.b.b("menu_item_cinematic_lighting", Boolean.valueOf(true));
        }
    }
    
    public final void i() {
        final boolean equals = TextUtils.equals((CharSequence)this.f.s(), (CharSequence)this.x);
        final achf z = this.z;
        if (z != null) {
            int n;
            if (!equals) {
                n = 0;
            }
            else {
                n = Integer.MAX_VALUE;
            }
            z.h(n);
        }
        if (equals) {
            final kud a = this.a;
            if (a == null || a.b()) {
                final achf z2 = this.z;
                if (z2 != null) {
                    ((achd)z2).u();
                }
            }
        }
    }
    
    public final asic[] lX(final abns abns) {
        return new asic[] { ((asgt)abns.q().b).am((asix)new kuc(this, 1), (asix)kul.b), abns.w().am((asix)new kuc(this, 0), (asix)kul.b) };
    }
    
    public final void nu() {
        final kud a = this.a;
        if (a != null) {
            a.a();
        }
    }
    
    public final void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        final ListView a = this.A;
        if (a == null) {
            return;
        }
        this.f((qjf)a.getAdapter().getItem(n));
    }
}
