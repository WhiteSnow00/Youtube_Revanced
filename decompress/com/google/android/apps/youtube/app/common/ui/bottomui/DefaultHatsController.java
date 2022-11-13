// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.ui.bottomui;

import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.FeedbackEndpointOuterClass;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashMap;
import android.os.Handler;
import java.util.Map;

public class DefaultHatsController implements gbo, thl, fjq, fju, acvo, abps, ska
{
    public final vcy a;
    public gcb b;
    public final Map c;
    public aant d;
    public aanf e;
    public long f;
    private final gbc g;
    private final atke h;
    private final atke i;
    private final skc j;
    private final Handler k;
    private final Object l;
    private volatile boolean m;
    private gch n;
    private gcb o;
    private final abpu p;
    private final asiq q;
    private final wyv r;
    private boolean s;
    private boolean t;
    private final hyx u;
    
    public DefaultHatsController(final gbc g, final vcy a, final atke h, final atke i, final hyx u, final abpu p12, final wyv r, final skc j, final Handler k, final byte[] array, final byte[] array2, final byte[] array3) {
        this.g = g;
        this.a = a;
        this.h = h;
        this.i = i;
        this.u = u;
        this.p = p12;
        this.q = new asiq();
        this.r = r;
        this.c = new HashMap();
        this.j = j;
        this.k = k;
        this.m = false;
        this.l = new Object();
    }
    
    public static boolean s(final aopo aopo) {
        aopj aopj;
        if ((aopj = aopo.c) == null) {
            aopj = aopj.a;
        }
        for (final aoos aoos : aopj.l) {
            if (aoos.b == 1) {
                aoou aoou;
                if ((aoou = aoou.b(((aoor)aoos.c).b)) == null) {
                    aoou = aoou.a;
                }
                if (aoou == aoou.b) {
                    return true;
                }
                continue;
            }
        }
        return false;
    }
    
    private final void u() {
        this.b = null;
        this.d = null;
        this.e = null;
        this.f = 0L;
        this.s = false;
        this.t = false;
    }
    
    public final /* bridge */ void a(final Object o, final int n) {
        final gcb gcb = (gcb)o;
        this.g.h();
        this.o = null;
    }
    
    public final thh g() {
        return thh.b;
    }
    
    public final void k(final aopo aopo) {
        if (aopo == null) {
            return;
        }
        final gcb b = this.b;
        if (b != null && b.e(aopo)) {
            this.b = null;
            return;
        }
        final gcb o = this.o;
        if (o != null && o.e(aopo)) {
            final BottomUiContainer b2 = this.g.b();
            if (b2 != null) {
                b2.j(3);
            }
        }
    }
    
    public final void l(final say say) {
    }
    
    public final void lW(final aun aun) {
    }
    
    public final asir[] lX(final abpu abpu) {
        return new asir[] { abpu.H((aezf)fng.o, (aezf)fng.p).R().P(asil.a()).an((asjm)new gao(this, 4), (asjm)fua.f) };
    }
    
    public final void m(final sba sba) {
        final saz a = saz.a;
        final abka a2 = abka.a;
        final int ordinal = sba.a().ordinal();
        if (ordinal != 2) {
            if (ordinal == 3) {
                if (this.b != null && sba.b() == sgp.a) {
                    final gcb b = this.b;
                    b.getClass();
                    aopj aopj;
                    if ((aopj = b.c.c) == null) {
                        aopj = aopj.a;
                    }
                    for (final aoos aoos : aopj.l) {
                        if (aoos.b == 1) {
                            aoou aoou;
                            if ((aoou = aoou.b(((aoor)aoos.c).b)) == null) {
                                aoou = aoou.a;
                            }
                            if (aoou == aoou.e) {
                                final gcb b2 = this.b;
                                b2.getClass();
                                this.p(b2.d(sba.e()));
                                return;
                            }
                            continue;
                        }
                    }
                }
                if (this.b != null && sba.b() == sgp.b) {
                    final gcb b3 = this.b;
                    b3.getClass();
                    aopj aopj2;
                    if ((aopj2 = b3.c.c) == null) {
                        aopj2 = aopj.a;
                    }
                    for (final aoos aoos2 : aopj2.l) {
                        if (aoos2.b == 1) {
                            aoou aoou2;
                            if ((aoou2 = aoou.b(((aoor)aoos2.c).b)) == null) {
                                aoou2 = aoou.a;
                            }
                            if (aoou2 == aoou.g) {
                                final gcb b4 = this.b;
                                b4.getClass();
                                this.p(b4.d(sba.e()));
                                return;
                            }
                            continue;
                        }
                    }
                }
            }
        }
        else {
            if (this.b != null && sba.b() == sgp.a) {
                final gcb b5 = this.b;
                b5.getClass();
                aopj aopj3;
                if ((aopj3 = b5.c.c) == null) {
                    aopj3 = aopj.a;
                }
                for (final aoos aoos3 : aopj3.l) {
                    if (aoos3.b == 1) {
                        aoou aoou3;
                        if ((aoou3 = aoou.b(((aoor)aoos3.c).b)) == null) {
                            aoou3 = aoou.a;
                        }
                        if (aoou3 == aoou.d) {
                            final gcb b6 = this.b;
                            b6.getClass();
                            this.p(b6.d(sba.e()));
                            return;
                        }
                        continue;
                    }
                }
            }
            if (this.b != null && sba.b() == sgp.b) {
                final gcb b7 = this.b;
                b7.getClass();
                aopj aopj4;
                if ((aopj4 = b7.c.c) == null) {
                    aopj4 = aopj.a;
                }
                for (final aoos aoos4 : aopj4.l) {
                    if (aoos4.b == 1) {
                        aoou aoou4;
                        if ((aoou4 = aoou.b(((aoor)aoos4.c).b)) == null) {
                            aoou4 = aoou.a;
                        }
                        if (aoou4 == aoou.f) {
                            final gcb b8 = this.b;
                            b8.getClass();
                            this.p(b8.d(sba.e()));
                            break;
                        }
                        continue;
                    }
                }
            }
        }
    }
    
    public final void mM(final aun aun) {
    }
    
    public final void mq(final aun aun) {
    }
    
    public final void mv(final Object o) {
        final gcb o2 = (gcb)o;
        this.g.i((gbd)o2);
        this.o = o2;
        final HashMap hashMap = new HashMap();
        hashMap.putAll(this.c);
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", o2);
        final vcy a = this.a;
        final int b = o2.b;
        List list2 = null;
        Label_0371: {
            if (b != 1) {
                if (b != 2) {
                    if (b == 3) {
                        final aopc f = o2.f;
                        final ArrayList list = (ArrayList)(list2 = new ArrayList());
                        if (f == null) {
                            break Label_0371;
                        }
                        list2 = list;
                        if ((f.b & 0x20) != 0x0) {
                            aiqj aiqj;
                            if ((aiqj = f.h) == null) {
                                aiqj = aiqj.a;
                            }
                            list.add(aiqj);
                            list2 = list;
                        }
                        break Label_0371;
                    }
                }
                else {
                    final ArrayList list3 = new ArrayList();
                    final aopa e = o2.e;
                    if (e != null) {
                        if (e.c.size() != 0) {
                            final Iterator<Object> iterator = ((List<Object>)e.c).iterator();
                            while (true) {
                                list2 = list3;
                                if (!iterator.hasNext()) {
                                    break Label_0371;
                                }
                                final aooy aooy = iterator.next();
                                if ((aooy.b & 0x1) == 0x0) {
                                    continue;
                                }
                                aoox aoox;
                                if ((aoox = aooy.c) == null) {
                                    aoox = aoox.a;
                                }
                                list3.addAll((Collection)aoox.b);
                            }
                        }
                    }
                }
            }
            else {
                final ArrayList list4 = new ArrayList();
                final aopj d = o2.d;
                if (d != null) {
                    if (d.d.size() != 0) {
                        final Iterator<Object> iterator2 = ((List<Object>)d.d).iterator();
                        while (true) {
                            list2 = list4;
                            if (!iterator2.hasNext()) {
                                break Label_0371;
                            }
                            final aoph aoph = iterator2.next();
                            if ((aoph.b & 0x1) == 0x0) {
                                continue;
                            }
                            aopg aopg;
                            if ((aopg = aoph.c) == null) {
                                aopg = aopg.a;
                            }
                            list4.addAll((Collection)aopg.b);
                        }
                    }
                }
            }
            list2 = null;
        }
        vdh.d(a, list2, (Map)hashMap);
        final HashMap hashMap2 = new HashMap();
        hashMap2.putAll(this.c);
        final int b2 = o2.b;
        byte[] array;
        Object o3;
        if (b2 != 1) {
            if (b2 != 2) {
                if (b2 != 3) {
                    throw new AssertionError();
                }
                array = o2.f.i.I();
                aiqj aiqj2;
                if ((aiqj2 = o2.f.h) == null) {
                    aiqj2 = aiqj.a;
                }
                o3 = afeq.r((Object)aiqj2);
            }
            else {
                array = o2.e.j.I();
                final aopa e2 = o2.e;
                o3 = e2.d;
                hashMap2.put("com.google.android.libraries.youtube.innertube.endpoint.tag", e2);
            }
        }
        else {
            array = o2.d.k.I();
            final aopj d2 = o2.d;
            o3 = d2.e;
            hashMap2.put("com.google.android.libraries.youtube.innertube.endpoint.tag", d2);
        }
        this.r.pF().t((wzz)new wyt(array), (alhi)null);
        if (o3 != null) {
            final Iterator iterator3 = ((List)o3).iterator();
            while (iterator3.hasNext()) {
                this.a.c((aiqj)iterator3.next(), (Map)hashMap2);
            }
        }
    }
    
    public final void my(final aun aun) {
    }
    
    public final void n(final fkr fkr) {
        if (fkr.m()) {
            this.b = null;
            return;
        }
        if (fkr.c()) {
            this.s = true;
            return;
        }
        if (fkr == fkr.d) {
            if (this.s && this.t) {
                this.s = false;
                this.k.postDelayed((Runnable)new eym(this, 19), 750L);
            }
            this.s = false;
        }
    }
    
    public final void oK(final fkr fkr, final fkr fkr2) {
        fal.b((fju)this, fkr2);
    }
    
    public final void oS(final aun aun) {
        this.q.f(this.lX(this.p));
        this.q.f(this.p.D().Y((asjr)flz.q).R().P(asil.a()).an((asjm)new gao(this, 3), (asjm)fua.f));
    }
    
    public final void oT() {
        tfg.c((thl)this);
    }
    
    public final void oW() {
        tfg.b((thl)this);
    }
    
    public final void oX(final aun aun) {
        this.q.b();
        ((fjv)this.h.a()).n((fju)this);
        ((fjr)this.i.a()).b((fjq)this);
        this.j.j((ska)this);
    }
    
    public final void p(final gcb gcb) {
        if (this.s) {
            this.t = true;
            return;
        }
        final BottomUiContainer b = this.g.b();
        if (b == null) {
            return;
        }
        final gca f = gcb.f();
        f.l = new hft(this, gcb);
        final gcb a = f.a();
        if (!this.g.qV((gbd)a)) {
            return;
        }
        this.g.g((gbd)a);
        if (this.n == null) {
            final hyx u = this.u;
            final HatsContainer g = b.g();
            final acpk acpk = (acpk)((atke)u.a).a();
            acpk.getClass();
            final vcy vcy = (vcy)((atke)u.b).a();
            vcy.getClass();
            final ashy ashy = (ashy)((atke)u.d).a();
            ashy.getClass();
            final aeea aeea = (aeea)((atke)u.c).a();
            aeea.getClass();
            g.getClass();
            this.n = new gch(acpk, vcy, ashy, aeea, g, (byte[])null, (byte[])null, (byte[])null);
        }
        b.r((gbd)a, (gbe)this.n, BottomUiContainer.p((acvo)this, a));
        this.u();
    }
    
    public final void pd(final elx elx) {
        final gcb b = this.b;
        if (b != null && s(b.c)) {
            this.u();
        }
    }
    
    public final void q(final aopo aopo) {
        this.r(aopo, false);
    }
    
    public final void r(aopo e, final boolean h) {
        if (e == null) {
            return;
        }
        final gca gca = new gca();
        gca.c(0);
        gca.b = e;
        gca.a = true;
        gca.i |= 0x7;
        gca.j = 1;
        gca.k = 1;
        gca.b(0);
        final int b = e.b;
        final ajut ajut = null;
        ajut ajut2 = null;
        final ajut ajut3 = null;
        if ((b & 0x1) != 0x0) {
            aopj c;
            if ((c = e.c) == null) {
                c = aopj.a;
            }
            gca.c = c;
            gca.d = null;
            gca.e = null;
            gca.c(1);
            ajut ajut4 = ajut3;
            if ((c.b & 0x2) != 0x0 && (ajut4 = c.f) == null) {
                ajut4 = ajut.a;
            }
            gca.f = (CharSequence)acak.b(ajut4);
            int ar;
            if ((ar = aqsx.aR(c.m)) == 0) {
                ar = 1;
            }
            gca.j = ar;
            int ap = 0;
            Label_0253: {
                if ((c.b & 0x4000) != 0x0) {
                    aopn aopn;
                    if ((aopn = c.n) == null) {
                        aopn = aopn.a;
                    }
                    if ((ap = aqsx.aP(aopn.b)) != 0) {
                        break Label_0253;
                    }
                }
                ap = 1;
            }
            gca.k = ap;
            gca.b(c.o);
            aiqj g;
            if ((g = c.g) == null) {
                g = aiqj.a;
            }
            gca.g = g;
        }
        else if ((b & 0x2) != 0x0) {
            aopa d;
            if ((d = e.d) == null) {
                d = aopa.a;
            }
            gca.d = d;
            gca.c = null;
            gca.e = null;
            gca.c(2);
            ajut ajut5 = ajut;
            if ((d.b & 0x1) != 0x0 && (ajut5 = d.e) == null) {
                ajut5 = ajut.a;
            }
            gca.f = (CharSequence)acak.b(ajut5);
            int ar2;
            if ((ar2 = aqsx.aR(d.h)) == 0) {
                ar2 = 1;
            }
            gca.j = ar2;
            gca.k = 1;
            gca.b(0);
            aiqj g2;
            if ((g2 = d.f) == null) {
                g2 = aiqj.a;
            }
            gca.g = g2;
        }
        else if ((b & 0x8) != 0x0) {
            aopc e2;
            if ((e2 = e.f) == null) {
                e2 = aopc.a;
            }
            gca.e = e2;
            gca.c = null;
            gca.d = null;
            gca.c(3);
            if ((e2.b & 0x1) != 0x0 && (ajut2 = e2.c) == null) {
                ajut2 = ajut.a;
            }
            gca.f = (CharSequence)acak.b(ajut2);
            aiqj g3;
            if ((g3 = e2.f) == null) {
                g3 = aiqj.a;
            }
            gca.g = g3;
        }
        final gcb a = gca.a();
        if (a.b == 0) {
            return;
        }
        final BottomUiContainer b2 = this.g.b();
        if (b2 == null) {
            return;
        }
        b2.g().h = h;
        aopj aopj;
        if ((aopj = e.c) == null) {
            aopj = aopj.a;
        }
        Label_0693: {
            if (aopj.l.size() != 0) {
                if (s(e)) {
                    e = (aopo)this.e;
                    if (e != null) {
                        if (((aanf)e).b() == abka.f) {
                            break Label_0693;
                        }
                    }
                }
                Label_0782: {
                    if (this.m) {
                        break Label_0782;
                    }
                    synchronized (this.l) {
                        if (this.m) {
                            monitorexit(this.l);
                        }
                        else {
                            ((fjv)this.h.a()).l((fju)this);
                            ((fjr)this.i.a()).a((fjq)this);
                            this.j.b((ska)this);
                            this.m = true;
                            monitorexit(this.l);
                        }
                        this.b = a;
                        return;
                    }
                }
            }
        }
        this.p(a);
    }
    
    public final void t(final gcb gcb, final aiqj aiqj) {
        if (((ahbc)aiqj).ry((ahaq)FeedbackEndpointOuterClass.feedbackEndpoint)) {
            final ahaz builder = ((ahbh)((ahbc)aiqj).rx((ahaq)FeedbackEndpointOuterClass.feedbackEndpoint)).toBuilder();
            if (TextUtils.isEmpty((CharSequence)gcb.j)) {
                builder.copyOnWrite();
                final ajss ajss = (ajss)builder.instance;
                ajss.b &= 0xFFFFFFFB;
                ajss.g = ajss.a.g;
            }
            else {
                final String j = gcb.j;
                builder.copyOnWrite();
                final ajss ajss2 = (ajss)builder.instance;
                j.getClass();
                ajss2.b |= 0x4;
                ajss2.g = j;
            }
            final ahaz builder2 = ((ahbh)anzg.a).createBuilder();
            final String i = this.r.pF().i();
            builder2.copyOnWrite();
            final anzg anzg = (anzg)builder2.instance;
            i.getClass();
            anzg.b |= 0x1;
            anzg.c = i;
            final anzg anzg2 = (anzg)builder2.build();
            final ahbb ahbb = (ahbb)((ahbh)aiqj).toBuilder();
            ahbb.e((ahaq)FeedbackEndpointOuterClass.feedbackEndpoint, (Object)builder.build());
            ahbb.e((ahaq)anzh.b, (Object)anzg2);
            final aiqj aiqj2 = (aiqj)((ahaz)ahbb).build();
        }
    }
}
