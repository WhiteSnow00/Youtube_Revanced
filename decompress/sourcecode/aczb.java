import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareToContactsEndpoint;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.Iterator;
import java.util.ArrayList;
import com.google.protos.youtube.api.innertube.ShareEndpointOuterClass$ShareEntityEndpoint;
import java.util.concurrent.Executor;
import android.view.View;
import java.util.concurrent.Future;
import java.util.List;
import android.content.Context;
import java.util.concurrent.ExecutorService;
import android.content.SharedPreferences;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aczb implements acyi, abyw, tec
{
    private final acir A;
    private final aciw B;
    private final aciw C;
    private final SharedPreferences D;
    private boolean E;
    private final aeby F;
    public final aioe a;
    public final vmt b;
    public final tny c;
    public final ExecutorService d;
    public final tdz e;
    public final ahsb f;
    public final Context g;
    public final acza h;
    public final List i;
    public final daw j;
    public final acyq k;
    public Future l;
    public boolean m;
    public ajzl n;
    public View o;
    public boolean p;
    public final adbl q;
    public final aeby r;
    private final Executor s;
    private final aftr t;
    private final wwv u;
    private final aceo v;
    private final vax w;
    private final acng x;
    private final acyj y;
    private final acir z;
    
    public aczb(final aioe a, final vmt b, final wwv u, final tny c, final ExecutorService d, final tdz e, final aceo v, final ahsb f, final Context g, final vax w, final acng x, final acza h, final acyj y, final adbl q, final daw j, final aeby r, final acyq k, final SharedPreferences d2, final aeby aeby, final aeby f2, final int n, final int n2, final Executor s, final aftr t, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        a.getClass();
        this.a = a;
        s.getClass();
        this.s = s;
        this.t = t;
        agot.u(((agzd)a).rs((agyr)ShareEndpointOuterClass$ShareEntityEndpoint.shareEntityEndpoint));
        b.getClass();
        this.b = b;
        u.getClass();
        this.u = u;
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        e.getClass();
        this.e = e;
        v.getClass();
        this.v = v;
        f.getClass();
        this.f = f;
        g.getClass();
        this.g = g;
        w.getClass();
        this.w = w;
        x.getClass();
        this.x = x;
        this.h = h;
        this.y = y;
        q.getClass();
        this.q = q;
        j.getClass();
        this.j = j;
        f2.getClass();
        this.F = f2;
        this.i = new ArrayList();
        final achs z = new achs();
        this.z = (acir)z;
        this.B = aeby.T((acir)z);
        final achs a2 = new achs();
        this.A = (acir)a2;
        (this.C = aeby.T((acir)a2)).f((acik)new achu(n, n2));
        r.getClass();
        this.r = r;
        k.getClass();
        this.k = k;
        d2.getClass();
        this.D = d2;
        szc.f();
        ((Set)q.b).clear();
        final Iterator<Object> iterator = ((Set<Object>)q.a).iterator();
        while (iterator.hasNext()) {
            q.j(iterator.next());
        }
    }
    
    public final List a() {
        List<?> list = null;
        try {
            list = this.l.get();
            return list;
        }
        catch (final InterruptedException list) {}
        catch (final ExecutionException list) {}
        catch (final CancellationException ex) {}
        trn.d("Error retrieving share-capable activities.", (Throwable)list);
        return new ArrayList();
    }
    
    public final void b() {
        if (this.p) {
            final ajzl n = this.n;
            if (n != null) {
                final View o = this.o;
                if (o != null) {
                    this.y.a(n, o, this.q);
                }
            }
        }
    }
    
    public final void c(final adof adof) {
        if (!this.m) {
            if (adof.b == null) {
                aixh aixh;
                if ((aixh = ((akhe)adof.a).d) == null) {
                    aixh = aixh.a;
                }
                if ((aixh.b & 0x1) != 0x0) {
                    aixh aixh2;
                    if ((aixh2 = ((akhe)adof.a).d) == null) {
                        aixh2 = aixh.a;
                    }
                    aoyc aoyc;
                    if ((aoyc = aixh2.c) == null) {
                        aoyc = aoyc.a;
                    }
                    adof.b = new vwb(aoyc);
                }
            }
            final Object b = adof.b;
            if (b == null) {
                if (adof.c == null) {
                    final akhe akhe = (akhe)adof.a;
                    if ((akhe.b & 0x4) != 0x0) {
                        aioe c;
                        if ((c = akhe.e) == null) {
                            c = aioe.a;
                        }
                        adof.c = c;
                    }
                }
                final Object c2 = adof.c;
                if (c2 != null) {
                    vaw.a(this.w, (aioe)c2);
                }
                else {
                    trn.b("Unified share panel not returned.");
                    this.c.c(2132017750);
                }
                this.h.h();
                return;
            }
            final vwb vwb = (vwb)b;
            vwb.f();
            aoxk aoxk;
            if ((aoxk = ((aoyc)vwb.b).e) == null) {
                aoxk = aoxk.a;
            }
            this.E = (aoxk.b == 133836655);
            this.u.b(wya.b(21760), this.a, (alff)null);
            this.u.D((wxz)new wws(adof.g()));
            if (adof.g() != null) {
                this.u.t((wxz)new wws(adof.g()), (alff)null);
            }
            final aoxp e = vwb.e();
            if (e != null) {
                final acyr acyr = new acyr(e, this.g, this.w);
                this.i.add(acyr);
                acyr.e(this.z);
                this.B.h((achk)acyr.a);
            }
            final acib acib = new acib();
            if (vwb.a == null) {
                vwb.a = new ArrayList();
                aoxs aoxs;
                if ((aoxs = ((aoyc)vwb.b).h) == null) {
                    aoxs = aoxs.a;
                }
                if ((aoxs.b & 0x1) != 0x0) {
                    final Object a = vwb.a;
                    aoxs aoxs2;
                    if ((aoxs2 = ((aoyc)vwb.b).h) == null) {
                        aoxs2 = aoxs.a;
                    }
                    aoxr aoxr;
                    if ((aoxr = aoxs2.c) == null) {
                        aoxr = aoxr.a;
                    }
                    ((List<aoxr>)a).add(aoxr);
                }
                for (final aoxt aoxt : ((aoyc)vwb.b).d) {
                    final int b2 = aoxt.b;
                    if ((b2 & 0x2) != 0x0) {
                        final Object a2 = vwb.a;
                        aoxg aoxg;
                        if ((aoxg = aoxt.c) == null) {
                            aoxg = aoxg.a;
                        }
                        vwb.f();
                        ((List<whx>)a2).add(new whx(aoxg));
                    }
                    else if ((b2 & 0x4) != 0x0) {
                        final Object a3 = vwb.a;
                        aoxl aoxl;
                        if ((aoxl = aoxt.d) == null) {
                            aoxl = aoxl.a;
                        }
                        ((List<aoxl>)a3).add(aoxl);
                    }
                    else if ((b2 & 0x8) != 0x0) {
                        final Object a4 = vwb.a;
                        aoxz aoxz;
                        if ((aoxz = aoxt.e) == null) {
                            aoxz = aoxz.a;
                        }
                        ((List<aoxz>)a4).add(aoxz);
                    }
                    else if ((b2 & 0x40) != 0x0) {
                        final Object a5 = vwb.a;
                        aoxc aoxc;
                        if ((aoxc = aoxt.g) == null) {
                            aoxc = aoxc.a;
                        }
                        ((List<aoxc>)a5).add(aoxc);
                    }
                    else {
                        if ((b2 & 0x10) == 0x0) {
                            continue;
                        }
                        final Object a6 = vwb.a;
                        aoxy aoxy;
                        if ((aoxy = aoxt.f) == null) {
                            aoxy = aoxy.a;
                        }
                        ((List<aoxy>)a6).add(aoxy);
                    }
                }
                final aoxk e2 = ((aoyc)vwb.b).e;
                aoxk a7;
                if (e2 == null) {
                    a7 = aoxk.a;
                }
                else {
                    a7 = e2;
                }
                if (a7.b == 133836655) {
                    final Object a8 = vwb.a;
                    aoxk a9;
                    if ((a9 = e2) == null) {
                        a9 = aoxk.a;
                    }
                    aoxj a10;
                    if (a9.b == 133836655) {
                        a10 = (aoxj)a9.c;
                    }
                    else {
                        a10 = aoxj.a;
                    }
                    ((List<aoxj>)a8).add(a10);
                }
            }
            final Object a11 = vwb.a;
            final aoxp e3 = vwb.e();
            if (e3 != null) {
                aoxv aoxv;
                if ((aoxv = e3.c) == null) {
                    aoxv = aoxv.a;
                }
                if (aoxv.b == 133737618) {
                    aoxv aoxv2;
                    if ((aoxv2 = e3.c) == null) {
                        aoxv2 = aoxv.a;
                    }
                    aoxw a12;
                    if (aoxv2.b == 133737618) {
                        a12 = (aoxw)aoxv2.c;
                    }
                    else {
                        a12 = aoxw.a;
                    }
                    ((List<aoxw>)a11).add(0, a12);
                }
                aoxo aoxo;
                if ((aoxo = e3.b) == null) {
                    aoxo = aoxo.a;
                }
                if ((aoxo.b & 0x1) != 0x0) {
                    aoxo aoxo2;
                    if ((aoxo2 = e3.b) == null) {
                        aoxo2 = aoxo.a;
                    }
                    aoxe aoxe;
                    if ((aoxe = aoxo2.c) == null) {
                        aoxe = aoxe.a;
                    }
                    ((List<aoxw>)a11).add(0, (aoxw)aoxe);
                }
            }
            for (final aoxw next : a11) {
                Object o;
                if (next instanceof aoxz) {
                    o = new acyz((aoxz)next, this.g, this.w, this.f, this.a(), this.h, this.e, this.v, this.q, this.u, this.E, this.s, this.t, (byte[])null);
                }
                else if (next instanceof aoxw) {
                    o = new acyu((aoxw)next, this.g, this.w);
                }
                else if (next instanceof aoxr) {
                    o = new acyp((aoxr)next, this.g, this.v, this.w, this.x, this.D);
                }
                else if (next instanceof aoxe) {
                    o = new acyk((aoxe)next, this.g, this.w, this.F, this.u, this.h, (acyi)this, (byte[])null, (byte[])null, (byte[])null);
                }
                else {
                    final aoxw aoxw = next;
                    if (aoxw instanceof aoxy) {
                        o = new acyv((aoxy)aoxw, this.g, this.h, this.x, this.w);
                    }
                    else {
                        o = null;
                    }
                }
                if (o != null) {
                    this.i.add(o);
                    ((acys)o).e(this.A);
                    acib.m(((acys)o).a());
                }
                else {
                    if (!(next instanceof aoxj)) {
                        continue;
                    }
                    final aoxj aoxj = (aoxj)next;
                    final adbl q = this.q;
                    aibc aibc;
                    if ((aibc = aoxj.b) == null) {
                        aibc = aibc.a;
                    }
                    aibb aibb;
                    if ((aibc.b & 0x1) != 0x0) {
                        aibc aibc2;
                        if ((aibc2 = aoxj.b) == null) {
                            aibc2 = aibc.a;
                        }
                        if ((aibb = aibc2.c) == null) {
                            aibb = aibb.a;
                        }
                    }
                    else {
                        aibb = null;
                    }
                    agzc agzc;
                    if (aibb != null && (aibb.b & 0x4000) != 0x0) {
                        aioe aioe;
                        if ((aioe = aibb.n) == null) {
                            aioe = aioe.a;
                        }
                        agzc = (agzc)((agzi)aioe).toBuilder();
                    }
                    else {
                        if (q.e != null) {
                            continue;
                        }
                        agzc = (agzc)((agzi)aioe.a).createBuilder();
                        agzc.e((agyr)SendShareEndpoint$SendShareToContactsEndpoint.sendShareToContactsEndpoint, (Object)SendShareEndpoint$SendShareToContactsEndpoint.a);
                    }
                    final agza builder = ((agzi)agzc.rr((agyr)SendShareEndpoint$SendShareToContactsEndpoint.sendShareToContactsEndpoint)).toBuilder();
                    if ((((SendShareEndpoint$SendShareToContactsEndpoint)builder.instance).b & 0x1) == 0x0) {
                        final akhj a13 = akhj.a;
                        builder.copyOnWrite();
                        final SendShareEndpoint$SendShareToContactsEndpoint sendShareEndpoint$SendShareToContactsEndpoint = (SendShareEndpoint$SendShareToContactsEndpoint)builder.instance;
                        a13.getClass();
                        sendShareEndpoint$SendShareToContactsEndpoint.c = a13;
                        sendShareEndpoint$SendShareToContactsEndpoint.b |= 0x1;
                    }
                    if ((((SendShareEndpoint$SendShareToContactsEndpoint)builder.instance).b & 0x2) == 0x0) {
                        final akhi a14 = akhi.a;
                        builder.copyOnWrite();
                        final SendShareEndpoint$SendShareToContactsEndpoint sendShareEndpoint$SendShareToContactsEndpoint2 = (SendShareEndpoint$SendShareToContactsEndpoint)builder.instance;
                        a14.getClass();
                        sendShareEndpoint$SendShareToContactsEndpoint2.d = a14;
                        sendShareEndpoint$SendShareToContactsEndpoint2.b |= 0x2;
                    }
                    agzc.e((agyr)SendShareEndpoint$SendShareToContactsEndpoint.sendShareToContactsEndpoint, (Object)builder.build());
                    q.e = ((agza)agzc).build();
                }
            }
            this.C.h((achk)acib);
            final tdz e4 = this.e;
            this.C.a();
            e4.d((Object)new ffm());
            final ArrayList list = new ArrayList();
            list.add(this);
            list.addAll(this.i);
            final Iterator iterator3 = this.i.iterator();
            while (iterator3.hasNext()) {
                ((acys)iterator3.next()).d(list);
            }
            final acyq k = this.k;
            for (final Object next2 : list) {
                if (next2 instanceof adaw) {
                    k.b.add(next2);
                }
            }
            final HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
            final Iterator<Object> iterator5 = ((List<Object>)((aoyc)vwb.b).g).iterator();
            while (iterator5.hasNext()) {
                this.w.c((aioe)iterator5.next(), (Map)hashMap);
            }
            this.h.d(this.B, this.C);
        }
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            array = null;
            if (n != 0) {
                if (n != 1) {
                    final StringBuilder sb = new StringBuilder("unsupported op code: ");
                    sb.append(n);
                    throw new IllegalStateException(sb.toString());
                }
                final aczc aczc = (aczc)o;
                this.h.h();
            }
            else {
                this.h.k((uxp)o);
            }
        }
        else {
            array = new Class[] { uxp.class, aczc.class };
        }
        return array;
    }
    
    public final void nu() {
        this.h.h();
    }
}
