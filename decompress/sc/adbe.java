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

public final class adbe implements adak, acay, tgg
{
    private final acku A;
    private final ackz B;
    private final ackz C;
    private final SharedPreferences D;
    private boolean E;
    private final aeea F;
    public final aiqj a;
    public final vox b;
    public final tqd c;
    public final ExecutorService d;
    public final tgd e;
    public final ahtz f;
    public final Context g;
    public final adbd h;
    public final List i;
    public final dax j;
    public final adat k;
    public Future l;
    public boolean m;
    public akbo n;
    public View o;
    public boolean p;
    public final addo q;
    public final aeea r;
    private final Executor s;
    private final afvs t;
    private final wyw u;
    private final acgs v;
    private final vcy w;
    private final acpk x;
    private final adal y;
    private final acku z;
    
    public adbe(final aiqj a, final vox b, final wyw u, final tqd c, final ExecutorService d, final tgd e, final acgs v, final ahtz f, final Context g, final vcy w, final acpk x, final adbd h, final adal y, final addo q, final dax j, final aeea r, final adat k, final SharedPreferences d2, final aeea aeea, final aeea f2, final int n, final int n2, final Executor s, final afvs t, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        a.getClass();
        this.a = a;
        s.getClass();
        this.s = s;
        this.t = t;
        adkp.H(((ahbc)a).ry((ahaq)ShareEndpointOuterClass$ShareEntityEndpoint.shareEntityEndpoint));
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
        final acjv z = new acjv();
        this.z = (acku)z;
        this.B = aeea.Z((acku)z);
        final acjv a2 = new acjv();
        this.A = (acku)a2;
        (this.C = aeea.Z((acku)a2)).f((ackn)new acjx(n, n2));
        r.getClass();
        this.r = r;
        k.getClass();
        this.k = k;
        d2.getClass();
        this.D = d2;
        tbi.f();
        ((Set)q.b).clear();
        final Iterator<Object> iterator = ((Set<Object>)q.a).iterator();
        while (iterator.hasNext()) {
            q.j((adcu)iterator.next());
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
        ttr.d("Error retrieving share-capable activities.", (Throwable)list);
        return new ArrayList();
    }
    
    public final void b() {
        if (this.p) {
            final akbo n = this.n;
            if (n != null) {
                final View o = this.o;
                if (o != null) {
                    this.y.a(n, o, (Object)this.q);
                }
            }
        }
    }
    
    public final void c(final adqh adqh) {
        if (!this.m) {
            if (adqh.b == null) {
                aizm aizm;
                if ((aizm = ((akjh)adqh.a).d) == null) {
                    aizm = aizm.a;
                }
                if ((aizm.b & 0x1) != 0x0) {
                    aizm aizm2;
                    if ((aizm2 = ((akjh)adqh.a).d) == null) {
                        aizm2 = aizm.a;
                    }
                    apag apag;
                    if ((apag = aizm2.c) == null) {
                        apag = apag.a;
                    }
                    adqh.b = new zis(apag);
                }
            }
            final Object b = adqh.b;
            if (b == null) {
                if (adqh.c == null) {
                    final akjh akjh = (akjh)adqh.a;
                    if ((akjh.b & 0x4) != 0x0) {
                        aiqj c;
                        if ((c = akjh.e) == null) {
                            c = aiqj.a;
                        }
                        adqh.c = c;
                    }
                }
                final Object c2 = adqh.c;
                if (c2 != null) {
                    vcx.a(this.w, (aiqj)c2);
                }
                else {
                    ttr.b("Unified share panel not returned.");
                    this.c.c(2132017750);
                }
                this.h.h();
                return;
            }
            final zis zis = (zis)b;
            zis.B();
            aozo aozo;
            if ((aozo = ((apag)zis.a).e) == null) {
                aozo = aozo.a;
            }
            this.E = (aozo.b == 133836655);
            this.u.b(xaa.b(21760), this.a, (alhi)null);
            this.u.D((wzz)new wyt(adqh.g()));
            if (adqh.g() != null) {
                this.u.t((wzz)new wyt(adqh.g()), (alhi)null);
            }
            final aozt a = zis.A();
            if (a != null) {
                final adau adau = new adau(a, this.g, this.w);
                this.i.add(adau);
                adau.e(this.z);
                this.B.h((acjn)adau.a);
            }
            final acke acke = new acke();
            if (zis.b == null) {
                zis.b = new ArrayList();
                aozw aozw;
                if ((aozw = ((apag)zis.a).h) == null) {
                    aozw = aozw.a;
                }
                if ((aozw.b & 0x1) != 0x0) {
                    final Object b2 = zis.b;
                    aozw aozw2;
                    if ((aozw2 = ((apag)zis.a).h) == null) {
                        aozw2 = aozw.a;
                    }
                    aozv aozv;
                    if ((aozv = aozw2.c) == null) {
                        aozv = aozv.a;
                    }
                    ((List<aozv>)b2).add(aozv);
                }
                for (final aozx aozx : ((apag)zis.a).d) {
                    final int b3 = aozx.b;
                    if ((b3 & 0x2) != 0x0) {
                        final Object b4 = zis.b;
                        aozk aozk;
                        if ((aozk = aozx.c) == null) {
                            aozk = aozk.a;
                        }
                        zis.B();
                        ((List<vxg>)b4).add(new vxg(aozk));
                    }
                    else if ((b3 & 0x4) != 0x0) {
                        final Object b5 = zis.b;
                        aozp aozp;
                        if ((aozp = aozx.d) == null) {
                            aozp = aozp.a;
                        }
                        ((List<aozp>)b5).add(aozp);
                    }
                    else if ((b3 & 0x8) != 0x0) {
                        final Object b6 = zis.b;
                        apad apad;
                        if ((apad = aozx.e) == null) {
                            apad = apad.a;
                        }
                        ((List<apad>)b6).add(apad);
                    }
                    else if ((b3 & 0x40) != 0x0) {
                        final Object b7 = zis.b;
                        aozg aozg;
                        if ((aozg = aozx.g) == null) {
                            aozg = aozg.a;
                        }
                        ((List<aozg>)b7).add(aozg);
                    }
                    else {
                        if ((b3 & 0x10) == 0x0) {
                            continue;
                        }
                        final Object b8 = zis.b;
                        apac apac;
                        if ((apac = aozx.f) == null) {
                            apac = apac.a;
                        }
                        ((List<apac>)b8).add(apac);
                    }
                }
                final aozo e = ((apag)zis.a).e;
                aozo a2;
                if (e == null) {
                    a2 = aozo.a;
                }
                else {
                    a2 = e;
                }
                if (a2.b == 133836655) {
                    final Object b9 = zis.b;
                    aozo a3;
                    if ((a3 = e) == null) {
                        a3 = aozo.a;
                    }
                    aozn a4;
                    if (a3.b == 133836655) {
                        a4 = (aozn)a3.c;
                    }
                    else {
                        a4 = aozn.a;
                    }
                    ((List<aozn>)b9).add(a4);
                }
            }
            final Object b10 = zis.b;
            final aozt a5 = zis.A();
            if (a5 != null) {
                aozz aozz;
                if ((aozz = a5.c) == null) {
                    aozz = aozz.a;
                }
                if (aozz.b == 133737618) {
                    aozz aozz2;
                    if ((aozz2 = a5.c) == null) {
                        aozz2 = aozz.a;
                    }
                    apaa a6;
                    if (aozz2.b == 133737618) {
                        a6 = (apaa)aozz2.c;
                    }
                    else {
                        a6 = apaa.a;
                    }
                    ((List<apaa>)b10).add(0, a6);
                }
                aozs aozs;
                if ((aozs = a5.b) == null) {
                    aozs = aozs.a;
                }
                if ((aozs.b & 0x1) != 0x0) {
                    aozs aozs2;
                    if ((aozs2 = a5.b) == null) {
                        aozs2 = aozs.a;
                    }
                    aozi aozi;
                    if ((aozi = aozs2.c) == null) {
                        aozi = aozi.a;
                    }
                    ((List<apaa>)b10).add(0, (apaa)aozi);
                }
            }
            final Iterator<apaa> iterator2 = ((List<apaa>)b10).iterator();
            final acke acke2 = acke;
            while (iterator2.hasNext()) {
                final apaa next = iterator2.next();
                Object o;
                if (next instanceof apad) {
                    o = new adbc((apad)next, this.g, this.w, this.f, this.a(), this.h, this.e, this.v, this.q, this.u, this.E, this.s, this.t, (byte[])null);
                }
                else if (next instanceof apaa) {
                    o = new adax((apaa)next, this.g, this.w);
                }
                else if (next instanceof aozv) {
                    o = new adas((aozv)next, this.g, this.v, this.w, this.x, this.D);
                }
                else if (next instanceof aozi) {
                    o = new adam((aozi)next, this.g, this.w, this.F, this.u, this.h, (adak)this, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                }
                else if (next instanceof apac) {
                    o = new aday((apac)next, this.g, this.h, this.x, this.w);
                }
                else {
                    o = null;
                }
                if (o != null) {
                    this.i.add(o);
                    ((adav)o).e(this.A);
                    acke2.m(((adav)o).a());
                }
                else {
                    if (!(next instanceof aozn)) {
                        continue;
                    }
                    final aozn aozn = (aozn)next;
                    final addo q = this.q;
                    aida aida;
                    if ((aida = aozn.b) == null) {
                        aida = aida.a;
                    }
                    aicz aicz;
                    if ((aida.b & 0x1) != 0x0) {
                        aida aida2;
                        if ((aida2 = aozn.b) == null) {
                            aida2 = aida.a;
                        }
                        if ((aicz = aida2.c) == null) {
                            aicz = aicz.a;
                        }
                    }
                    else {
                        aicz = null;
                    }
                    ahbb ahbb;
                    if (aicz != null && (aicz.b & 0x4000) != 0x0) {
                        aiqj aiqj;
                        if ((aiqj = aicz.n) == null) {
                            aiqj = aiqj.a;
                        }
                        ahbb = (ahbb)((ahbh)aiqj).toBuilder();
                    }
                    else {
                        if (q.e != null) {
                            continue;
                        }
                        ahbb = (ahbb)((ahbh)aiqj.a).createBuilder();
                        ahbb.e((ahaq)SendShareEndpoint$SendShareToContactsEndpoint.sendShareToContactsEndpoint, (Object)SendShareEndpoint$SendShareToContactsEndpoint.a);
                    }
                    final ahaz builder = ((SendShareEndpoint$SendShareToContactsEndpoint)ahbb.rx((ahaq)SendShareEndpoint$SendShareToContactsEndpoint.sendShareToContactsEndpoint)).toBuilder();
                    if ((((SendShareEndpoint$SendShareToContactsEndpoint)builder.instance).b & 0x1) == 0x0) {
                        final akjm a7 = akjm.a;
                        builder.copyOnWrite();
                        final SendShareEndpoint$SendShareToContactsEndpoint sendShareEndpoint$SendShareToContactsEndpoint = (SendShareEndpoint$SendShareToContactsEndpoint)builder.instance;
                        a7.getClass();
                        sendShareEndpoint$SendShareToContactsEndpoint.c = a7;
                        sendShareEndpoint$SendShareToContactsEndpoint.b |= 0x1;
                    }
                    if ((((SendShareEndpoint$SendShareToContactsEndpoint)builder.instance).b & 0x2) == 0x0) {
                        final akjl a8 = akjl.a;
                        builder.copyOnWrite();
                        final SendShareEndpoint$SendShareToContactsEndpoint sendShareEndpoint$SendShareToContactsEndpoint2 = (SendShareEndpoint$SendShareToContactsEndpoint)builder.instance;
                        a8.getClass();
                        sendShareEndpoint$SendShareToContactsEndpoint2.d = a8;
                        sendShareEndpoint$SendShareToContactsEndpoint2.b |= 0x2;
                    }
                    ahbb.e((ahaq)SendShareEndpoint$SendShareToContactsEndpoint.sendShareToContactsEndpoint, (Object)builder.build());
                    q.e = ((ahaz)ahbb).build();
                }
            }
            this.C.h((acjn)acke2);
            final tgd e2 = this.e;
            this.C.a();
            e2.d((Object)new ffs());
            final ArrayList list = new ArrayList();
            list.add(this);
            list.addAll(this.i);
            final Iterator iterator3 = this.i.iterator();
            while (iterator3.hasNext()) {
                ((adav)iterator3.next()).d((List)list);
            }
            final adat k = this.k;
            for (final Object next2 : list) {
                if (next2 instanceof adcz) {
                    k.b.add(next2);
                }
            }
            final HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
            final Iterator<Object> iterator5 = ((List<Object>)((apag)zis.a).g).iterator();
            while (iterator5.hasNext()) {
                this.w.c((aiqj)iterator5.next(), (Map)hashMap);
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
                final adbf adbf = (adbf)o;
                this.h.h();
            }
            else {
                this.h.k((uzm)o);
            }
        }
        else {
            array = new Class[] { uzm.class, adbf.class };
        }
        return array;
    }
    
    public final void nu() {
        this.h.h();
    }
}
