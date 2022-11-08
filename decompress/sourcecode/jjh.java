import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import android.content.Context;
import android.view.View$OnClickListener;
import android.support.v7.widget.RecyclerView;
import android.content.res.Resources;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jjh extends aclr implements tec
{
    private final aeby A;
    public final acjb a;
    public final Handler b;
    public final Resources c;
    public apot d;
    public final RecyclerView e;
    public final acpd f;
    public final acae g;
    public int h;
    public int i;
    public int j;
    final View$OnClickListener k;
    private final acib l;
    private final achf m;
    private final int n;
    private final int o;
    private final int p;
    private final acjb q;
    private final acjb r;
    private final jhs s;
    private final jjy t;
    private final tdz u;
    private final Context v;
    private boolean w;
    private boolean x;
    private boolean y;
    private final bx z;
    
    public jjh(final Context v, final acno acno, final tdz u, final Handler b, final aeby a, final bx z, final acae g, final apot d, final RecyclerView e, final acpd f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.w = false;
        this.x = false;
        this.y = false;
        acno.b((Class)apot.class);
        this.v = v;
        this.u = u;
        this.b = b;
        this.c = v.getResources();
        this.d = d;
        this.e = e;
        this.f = f;
        this.A = a;
        this.z = z;
        this.g = g;
        u.g((Object)this);
        this.k = (View$OnClickListener)new jfv(this, 18);
        final acib l = new acib();
        this.l = l;
        final acjb acjb = new acjb();
        l.m((achk)acjb);
        final apot d2 = this.d;
        final int b2 = d2.b;
        Label_0228: {
            if ((b2 & 0x1) == 0x0) {
                if ((b2 & 0x2) == 0x0) {
                    break Label_0228;
                }
            }
            appc appc;
            if ((appc = d2.c) == null) {
                appc = appc.a;
            }
            apoz apoz;
            if ((apoz = this.d.d) == null) {
                apoz = apoz.a;
            }
            acjb.add((Object)new jjg(appc, apoz));
        }
        final apot d3 = this.d;
        Label_0370: {
            if ((d3.b & 0x2) != 0x0) {
                apoz apoz2;
                if ((apoz2 = d3.d) == null) {
                    apoz2 = apoz.a;
                }
                if (apoz2.b == 122710540) {
                    this.x = true;
                    break Label_0370;
                }
            }
            apoz apoz3;
            if ((apoz3 = this.d.d) == null) {
                apoz3 = apoz.a;
            }
            if (apoz3.b == 132989167) {
                apoz apoz4;
                if ((apoz4 = this.d.d) == null) {
                    apoz4 = apoz.a;
                }
                aoid a2;
                if (apoz4.b == 132989167) {
                    a2 = (aoid)apoz4.c;
                }
                else {
                    a2 = aoid.a;
                }
                this.w = (0x1 == ((a2.b & 0x1) ^ 0x1));
            }
        }
        l.m((achk)(this.q = new acjb()));
        final acjb a3 = new acjb();
        this.a = a3;
        l.m((achk)(this.m = new achf((achk)a3)));
        final apot d4 = this.d;
        this.p = d4.f;
        int n;
        if (d4.e.size() != 0) {
            this.o = this.d.e.size();
            int h = 0;
            int i = Integer.MAX_VALUE;
            while (true) {
                n = i;
                if (h >= this.d.e.size()) {
                    break;
                }
                final int size = ((tdv)this.a).size();
                int n2 = i;
                if (h >= this.p && size < (n2 = i)) {
                    n2 = size;
                }
                if (h > 0) {
                    this.a.add((Object)new jjy());
                }
                final appq appq = (appq)this.d.e.get(h);
                appp a4;
                if (appq.b == 117457335) {
                    a4 = (appp)appq.c;
                }
                else {
                    a4 = appp.a;
                }
                Label_1612: {
                    if ((a4.b & 0x1) != 0x0) {
                        final appq appq2 = (appq)this.d.e.get(h);
                        appp a5;
                        if (appq2.b == 117457335) {
                            a5 = (appp)appq2.c;
                        }
                        else {
                            a5 = appp.a;
                        }
                        appg appg;
                        if ((appg = a5.c) == null) {
                            appg = appg.a;
                        }
                        this.h(appg);
                        i = n2;
                    }
                    else {
                        final appq appq3 = (appq)this.d.e.get(h);
                        appo a6;
                        if (appq3.b == 117548244) {
                            a6 = (appo)appq3.c;
                        }
                        else {
                            a6 = appo.a;
                        }
                        if (a6.c.size() != 0) {
                            final appq appq4 = (appq)this.d.e.get(h);
                            appo a7;
                            if (appq4.b == 117548244) {
                                a7 = (appo)appq4.c;
                            }
                            else {
                                a7 = appo.a;
                            }
                            if (this.x) {
                                this.a.add((Object)ftm.b());
                            }
                            final appq appq5 = (appq)this.d.e.get(h);
                            appo a8;
                            if (appq5.b == 117548244) {
                                a8 = (appo)appq5.c;
                            }
                            else {
                                a8 = appo.a;
                            }
                            final Iterator<Object> iterator = ((List<Object>)a8.c).iterator();
                            int n3 = 0;
                            while (iterator.hasNext()) {
                                final appg appg2 = iterator.next();
                                this.h(appg2);
                                final int b3 = appg2.b;
                                int n4;
                                if (b3 == 117337765) {
                                    n4 = ((apou)appg2.c).c.size();
                                }
                                else if (b3 == 88962895) {
                                    n4 = ((akac)appg2.c).d.size();
                                }
                                else {
                                    n4 = 0;
                                }
                                n3 += n4;
                            }
                            i = n2;
                            if (this.d.e.size() == 1) {
                                i = n2;
                                if ((a7.b & 0x1) != 0x0) {
                                    i = n2;
                                    if (n3 > 0) {
                                        int d5 = a7.d;
                                        this.y = (n3 <= d5);
                                        acjb a9;
                                        Object value;
                                        int n5;
                                        for (a9 = this.a, i = 0; i < ((tdv)a9).size(); ++i, d5 = n5) {
                                            if (d5 == 0) {
                                                break Label_1612;
                                            }
                                            value = ((tdv)a9).get(i);
                                            if (!(value instanceof appb) && !(value instanceof aoif)) {
                                                n5 = d5;
                                                if (!(value instanceof ajkj)) {
                                                    continue;
                                                }
                                            }
                                            n5 = d5 - 1;
                                        }
                                        i = ((tdv)a9).size();
                                    }
                                }
                            }
                        }
                        else {
                            final appq appq6 = (appq)this.d.e.get(h);
                            appn a10;
                            if (appq6.b == 147633782) {
                                a10 = (appn)appq6.c;
                            }
                            else {
                                a10 = appn.a;
                            }
                            i = n2;
                            if (a10.c.size() != 0) {
                                final acjb a11 = this.a;
                                final appq appq7 = (appq)this.d.e.get(h);
                                appn a12;
                                if (appq7.b == 147633782) {
                                    a12 = (appn)appq7.c;
                                }
                                else {
                                    a12 = appn.a;
                                }
                                a11.add((Object)a12);
                                ++this.j;
                                final appq appq8 = (appq)this.d.e.get(h);
                                appn a13;
                                if (appq8.b == 147633782) {
                                    a13 = (appn)appq8.c;
                                }
                                else {
                                    a13 = appn.a;
                                }
                                if (a13.c.size() > 0) {
                                    final agza builder = ((agzi)this.d.e.get(h)).toBuilder();
                                    final appq appq9 = (appq)builder.instance;
                                    appn a14;
                                    if (appq9.b == 147633782) {
                                        a14 = (appn)appq9.c;
                                    }
                                    else {
                                        a14 = appn.a;
                                    }
                                    final agzc agzc = (agzc)((agzi)a14).toBuilder();
                                    if (agzc.rs((agyr)apoi.c) && (boolean)agzc.rr((agyr)apoi.c)) {
                                        int intValue;
                                        if (((agzd)this.d).rs((agyr)apoh.b)) {
                                            intValue = (int)((agzd)this.d).rr((agyr)apoh.b);
                                        }
                                        else {
                                            intValue = 0;
                                        }
                                        this.h(agzc.t(intValue));
                                        this.i = ((appn)agzc.instance).f;
                                        agzc.e((agyr)apoi.b, (Object)intValue);
                                    }
                                    else {
                                        this.h(agzc.t(((appn)agzc.instance).f));
                                        final int f2 = ((appn)agzc.instance).f;
                                        this.i = f2;
                                        agzc.e((agyr)apoi.b, (Object)f2);
                                    }
                                    builder.copyOnWrite();
                                    final appq appq10 = (appq)builder.instance;
                                    final appn c = (appn)((agza)agzc).build();
                                    c.getClass();
                                    appq10.c = c;
                                    appq10.b = 147633782;
                                    final acjb a15 = this.a;
                                    final appq appq11 = (appq)builder.instance;
                                    appn a16;
                                    if (appq11.b == 147633782) {
                                        a16 = (appn)appq11.c;
                                    }
                                    else {
                                        a16 = appn.a;
                                    }
                                    a15.o((Object)a14, (Object)a16);
                                    final agzc agzc2 = (agzc)((agzi)this.d).toBuilder();
                                    agzc2.cJ(h, builder);
                                    this.d = (apot)((agza)agzc2).build();
                                }
                                this.h = h;
                                i = n2;
                            }
                        }
                    }
                }
                ++h;
            }
        }
        else {
            this.o = 0;
            n = Integer.MAX_VALUE;
        }
        this.n = n;
        this.m.h(n);
        if (n < Integer.MAX_VALUE && !this.y) {
            final apot d6 = this.d;
            ajsq ajsq;
            if ((d6.b & 0x8) != 0x0) {
                if ((ajsq = d6.g) == null) {
                    ajsq = ajsq.a;
                }
            }
            else {
                ajsq = null;
            }
            final jhs s = new jhs(abyh.b(ajsq), this.x);
            this.s = s;
            s.b = this.k;
            final acjb r = new acjb();
            (this.r = r).add((Object)s);
            this.l.m((achk)r);
            this.d(false);
        }
        else {
            this.s = null;
            this.r = null;
        }
        if (this.w) {
            this.t = new jjy();
            this.f();
        }
        else {
            this.t = null;
        }
        if ((this.d.b & 0x10) != 0x0) {
            final acjb acjb2 = new acjb();
            if (this.y) {
                acjb2.add((Object)ftm.b());
            }
            ajkm ajkm;
            if ((ajkm = this.d.h) == null) {
                ajkm = ajkm.a;
            }
            acjb2.add((Object)new achx(ajkm));
            this.l.m((achk)acjb2);
        }
    }
    
    public static boolean g(final apos apos) {
        if (apos.b == 122814739) {
            final int ae = aqql.ae(((appb)apos.c).k);
            if (ae != 0) {
                if (ae == 3) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private final void h(final appg appg) {
        final int b = appg.b;
        if (b == 117337765) {
            final acjb a = this.a;
            final apou apou = (apou)appg.c;
            for (int i = 0; i < apou.c.size(); ++i) {
                final apos apos = (apos)apou.c.get(i);
                final int b2 = apos.b;
                if (b2 == 122814739) {
                    a.add((Object)apos.c);
                    if (g(apos) && i < apou.c.size() - 1) {
                        a.add((Object)new jjy());
                    }
                }
                else if (b2 == 130523099) {
                    a.add((Object)apos.c);
                    final int b3 = apos.b;
                    Label_0213: {
                        int n;
                        if (b3 == 122814739) {
                            n = ((appb)apos.c).b;
                        }
                        else if (b3 == 130523099) {
                            n = ((aoif)apos.c).b;
                        }
                        else {
                            if (b3 == 153515154) {
                                continue;
                            }
                            break Label_0213;
                        }
                        if ((n & 0x1) != 0x0) {
                            continue;
                        }
                    }
                    if (i < apou.c.size() - 1) {
                        a.add((Object)new jjy());
                    }
                }
                else if (b2 == 153515154) {
                    a.add((Object)this.g.d((ajkj)apos.c));
                }
            }
            final int b4 = apou.b;
            if ((b4 & 0x2) != 0x0 && (b4 & 0x4) != 0x0) {
                a.m((aext)ihq.i);
                ajsq ajsq;
                if ((ajsq = apou.e) == null) {
                    ajsq = ajsq.a;
                }
                aioe aioe;
                if ((aioe = apou.d) == null) {
                    aioe = aioe.a;
                }
                a.add((Object)new jjs(ajsq, aioe));
            }
        }
        else if (b == 88962895) {
            final acjb a2 = this.a;
            final akac akac = (akac)appg.c;
            final Iterator iterator = this.A.R(akac).iterator();
            while (iterator.hasNext()) {
                final int b5 = ((akae)iterator.next()).b;
                if ((b5 & 0x100) == 0x0) {
                    if ((b5 & 0x1) == 0x0) {
                        continue;
                    }
                }
                if ((akac.b & 0x1) != 0x0) {
                    akaa akaa;
                    if ((akaa = akac.c) == null) {
                        akaa = akaa.a;
                    }
                    if ((akaa.b & 0x1) != 0x0) {
                        akaf akaf;
                        if ((akaf = akaa.e) == null) {
                            akaf = akaf.a;
                        }
                        a2.add((Object)akaf);
                    }
                    a2.add((Object)akac);
                    break;
                }
                break;
            }
        }
    }
    
    public final achk a() {
        return (achk)this.l;
    }
    
    public final void d(final boolean b) {
        if (this.s == null) {
            return;
        }
        if (b && tqt.e(this.v)) {
            this.f.t().qK((achj)new jjf(this, 0));
        }
        if (((agzd)this.d).rs((agyr)apoh.c) && (boolean)((agzd)this.d).rr((agyr)apoh.c)) {
            this.s.a = 1;
            this.m.h(Integer.MAX_VALUE);
        }
        else {
            this.s.a = 0;
            this.m.h(this.n);
        }
        this.r.l();
    }
    
    public final void f() {
        if (!this.w) {
            return;
        }
        final boolean rs = ((agzd)this.d).rs((agyr)apoh.c);
        boolean b = false;
        final boolean b2 = rs && (boolean)((agzd)this.d).rr((agyr)apoh.c);
        if (this.o == 0 || b2 || this.p > 0) {
            b = true;
        }
        if (b == ((tdv)this.q).isEmpty()) {
            if (b) {
                this.q.add((Object)this.t);
            }
            else {
                ((tdv)this.q).clear();
            }
            this.q.l();
        }
    }
    
    public final Class[] ms(final Class clazz, final Object o, int i) {
        Class[] array2;
        if (i != -1) {
            if (i != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
            final jhr jhr = (jhr)o;
            i = this.d.e.size();
            final int h = this.h;
            if (i > h) {
                final appq appq = (appq)this.d.e.get(h);
                appn a;
                if (appq.b == 147633782) {
                    a = (appn)appq.c;
                }
                else {
                    a = appn.a;
                }
                if (a.c.size() != 0 && this.i != jhr.a()) {
                    final apot d = this.d;
                    i = this.h;
                    final appq appq2 = (appq)d.e.get(i);
                    appn a2;
                    if (appq2.b == 147633782) {
                        a2 = (appn)appq2.c;
                    }
                    else {
                        a2 = appn.a;
                    }
                    if (a2.c.size() > jhr.a()) {
                        final apot d2 = this.d;
                        i = this.h;
                        final appq appq3 = (appq)d2.e.get(i);
                        appn a3;
                        if (appq3.b == 147633782) {
                            a3 = (appn)appq3.c;
                        }
                        else {
                            a3 = appn.a;
                        }
                        i = jhr.a();
                        final appg appg = (appg)a3.c.get(i);
                        apou a4;
                        if (appg.b == 117337765) {
                            a4 = (apou)appg.c;
                        }
                        else {
                            a4 = apou.a;
                        }
                        final apos[] array = ((List)a4.c).toArray(new apos[0]);
                        final ArrayList list = new ArrayList();
                        int length;
                        for (length = array.length, i = 0; i < length; ++i) {
                            list.add(array[i]);
                        }
                        this.b.removeCallbacksAndMessages((Object)null);
                        this.a.m((aext)ihq.j);
                        int dimensionPixelSize;
                        int n;
                        for (i = 0; i < list.size(); ++i) {
                            dimensionPixelSize = this.c.getDimensionPixelSize(2131170351);
                            n = dimensionPixelSize + dimensionPixelSize;
                            if (((apos)list.get(i)).b == 153515154) {
                                this.a.add((Object)ftm.a((int)(this.c.getDimensionPixelSize(2131167260) / this.c.getFraction(2131361819, 1, 1)) + n));
                            }
                            else if (g((apos)list.get(i))) {
                                this.a.add((Object)ftm.a((int)(this.c.getDimensionPixelSize(2131170354) / this.c.getFraction(2131361819, 1, 1))));
                                if (i < list.size() - 1) {
                                    this.a.add((Object)ftm.a(this.c.getDimensionPixelSize(2131167246) + n));
                                }
                            }
                            else {
                                this.a.add((Object)ftm.a((int)(this.c.getDimensionPixelSize(2131170356) / this.c.getFraction(2131361819, 1, 1)) + n));
                            }
                        }
                        i = a4.b;
                        if ((i & 0x2) != 0x0 && (i & 0x4) != 0x0) {
                            final acjb a5 = this.a;
                            ajsq ajsq;
                            if ((ajsq = a4.e) == null) {
                                ajsq = ajsq.a;
                            }
                            aioe aioe;
                            if ((aioe = a4.d) == null) {
                                aioe = aioe.a;
                            }
                            a5.add((Object)new jjs(ajsq, aioe));
                        }
                        int j = 0;
                        i = 0;
                        while (j < list.size()) {
                            this.b.postDelayed((Runnable)new frp(this, (List)list, j, i, 2), (long)(j * 100));
                            int n2 = i;
                            if (g((apos)list.get(j))) {
                                n2 = i;
                                if (j < list.size() - 1) {
                                    n2 = i + 1;
                                }
                            }
                            ++j;
                            i = n2 + 1;
                        }
                        this.i = jhr.a();
                        final agzc agzc = (agzc)((agzi)this.d).toBuilder();
                        agzc.e((agyr)apoh.b, (Object)jhr.a());
                        final apot d3 = (apot)((agza)agzc).build();
                        this.d = d3;
                        i = this.h;
                        final agza builder = ((agzi)d3.e.get(i)).toBuilder();
                        final appq appq4 = (appq)builder.instance;
                        appn a6;
                        if (appq4.b == 147633782) {
                            a6 = (appn)appq4.c;
                        }
                        else {
                            a6 = appn.a;
                        }
                        final agzc agzc2 = (agzc)((agzi)a6).toBuilder();
                        agzc2.e((agyr)apoi.b, (Object)this.i);
                        agzc2.e((agyr)apoi.c, (Object)true);
                        final appn c = (appn)((agza)agzc2).build();
                        builder.copyOnWrite();
                        final appq appq5 = (appq)builder.instance;
                        c.getClass();
                        appq5.c = c;
                        appq5.b = 147633782;
                        this.a.o((Object)a6, (Object)appq5.c);
                        final agzc agzc3 = (agzc)((agzi)this.d).toBuilder();
                        agzc3.cJ(this.h, builder);
                        this.d = (apot)((agza)agzc3).build();
                    }
                }
            }
            array2 = null;
        }
        else {
            array2 = new Class[] { jhr.class };
        }
        return array2;
    }
    
    @Override
    public final void rU() {
        this.u.m((Object)this);
        apoz apoz;
        if ((apoz = this.d.d) == null) {
            apoz = apoz.a;
        }
        appd a;
        if (apoz.b == 122710540) {
            a = (appd)apoz.c;
        }
        else {
            a = appd.a;
        }
        if ((a.b & 0x200) != 0x0) {
            final bx z = this.z;
            apoz apoz2;
            if ((apoz2 = this.d.d) == null) {
                apoz2 = apoz.a;
            }
            appd a2;
            if (apoz2.b == 122710540) {
                a2 = (appd)apoz2.c;
            }
            else {
                a2 = appd.a;
            }
            final String l = a2.l;
            if (l != null) {
                ((Map<Object, Object>)z.a).remove(l);
            }
        }
    }
}
