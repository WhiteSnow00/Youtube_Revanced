import java.util.concurrent.Future;
import java.util.HashSet;
import android.util.Pair;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;
import java.util.concurrent.Callable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.function.Supplier;
import j$.util.stream.Collectors;
import java.util.function.Function;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.Collection;
import j$.util.Collection$_EL;
import java.util.Set;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ihy implements aacc
{
    public final atke a;
    public final atke b;
    public final atke c;
    public final atke d;
    public final tgd e;
    public final oby f;
    public final aait g;
    private final atke h;
    private final atke i;
    private final atke j;
    private final atke k;
    private final afvs l;
    private final afvt m;
    private final vai n;
    
    public ihy(final atke a, final atke b, final atke c, final atke d, final atke h, final atke i, final atke j, final atke k, final afvs l, final afvt m, final tgd e, final oby f, final vai n, final aait g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.e = e;
        this.f = f;
        this.n = n;
        this.g = g;
    }
    
    public static final int j(final alzg alzg) {
        if ((alzg.c & 0x4) != 0x0) {
            return alzg.f;
        }
        return Integer.MAX_VALUE;
    }
    
    public static afeq k(final String s, final List list, final Set set, final amwz amwz, final aaaz aaaz, final int n, final byte[] array) {
        final afel d = afeq.d();
        Collection$_EL.stream((Collection)list).forEach((Consumer)new ihr(s, amwz, aaaz, array, set, n, d));
        return d.g();
    }
    
    public static afeq l(final String s, final Collection collection, final int n) {
        final afel d = afeq.d();
        Collection$_EL.stream(collection).forEach((Consumer)new hyj(n, s, d, 2));
        return d.g();
    }
    
    public static final void m(final zvo zvo, final List list) {
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            final agq e = ((aaba)iterator.next()).e;
            if (e != null) {
                n(zvo, e);
            }
        }
    }
    
    public static final void n(final zvo zvo, final agq agq) {
        if (zvo.aq((String)agq.e) == null) {
            zvo.ar(agq);
            return;
        }
        zvo.as(agq);
    }
    
    private final void o(final String s) {
        this.e.f((Object)new zxy(s));
    }
    
    private static final afeq p(final List list, final aabz aabz) {
        return afeq.o((Collection)Collection$_EL.stream((Collection)list).map((Function)new hra(aabz, 10)).collect(Collectors.toCollection((Supplier)ihv.b)));
    }
    
    public final aacb a(final amul amul) {
        final int cu = aqsx.cU(amul.c);
        if (cu != 0) {
            if (cu == 4) {
                return (aacb)new ihx(amul);
            }
        }
        return aacb.b;
    }
    
    public final ListenableFuture b(final zme zme, final amul amul) {
        int cu;
        if ((cu = aqsx.cU(amul.c)) == 0) {
            cu = 1;
        }
        if (--cu == 1) {
            final String i = vgl.i(amul.d);
            amuj amuj;
            if ((amuj = amul.e) == null) {
                amuj = amuj.b;
            }
            return afwm.t(afnd.o((Callable)new iht(this, zme, i, (alzg)((ahbc)amuj).rx((ahaq)alzg.b)), (Executor)this.l), 30L, TimeUnit.SECONDS, (ScheduledExecutorService)this.m);
        }
        if (cu == 2) {
            return afwm.t(afnd.o((Callable)new daa(this, zme, vgl.i(amul.d), 10), (Executor)this.l), 30L, TimeUnit.SECONDS, (ScheduledExecutorService)this.m);
        }
        if (cu == 3) {
            final String j = vgl.i(amul.d);
            amuj amuj2;
            if ((amuj2 = amul.e) == null) {
                amuj2 = amuj.b;
            }
            return afwm.t(afnd.o((Callable)new foq(this, zme, j, (alzg)((ahbc)amuj2).rx((ahaq)alzg.b), 4), (Executor)this.l), 30L, TimeUnit.SECONDS, (ScheduledExecutorService)this.m);
        }
        if (cu != 4) {
            final aaby b = aabz.c.b();
            b.b = 23;
            return afwm.m((Object)b.a());
        }
        final String k = vgl.i(amul.d);
        amuj amuj3;
        if ((amuj3 = amul.e) == null) {
            amuj3 = amuj.b;
        }
        return afwm.t(afnd.o((Callable)new ihu(this, zme, k, (alzg)((ahbc)amuj3).rx((ahaq)alzg.b)), (Executor)this.l), 30L, TimeUnit.SECONDS, (ScheduledExecutorService)this.m);
    }
    
    public final ListenableFuture c(final zme zme, final afeq afeq) {
        if (afeq.isEmpty()) {
            return afwm.m((Object)afeq.q());
        }
        final amul amul = (amul)afeq.get(0);
        final int cu = aqsx.cU(amul.c);
        if (cu != 0 && cu == 4) {
            final ArrayList list = new ArrayList();
            final HashMap hashMap = new HashMap();
            final HashMap hashMap2 = new HashMap();
            Collection$_EL.stream((Collection)afeq).forEach((Consumer)new ihs(list, hashMap, hashMap2, 0));
            amuj amuj;
            if ((amuj = amul.e) == null) {
                amuj = amuj.b;
            }
            return afwm.t(afnd.o((Callable)new iig(this, zme, list, hashMap, hashMap2, (alzg)((ahbc)amuj).rx((ahaq)alzg.b), 1), (Executor)this.l), 30L, TimeUnit.SECONDS, (ScheduledExecutorService)this.m);
        }
        throw new UnsupportedOperationException();
    }
    
    public final afeq d(zme zme, List a, Map x, Map g, final boolean b, final boolean b2) {
        tbi.e();
        final aaeh aaeh = (aaeh)fex.k((aabo)this.a.a(), zme).orElse((Object)null);
        if (aaeh == null) {
            final aaby b3 = aabz.c.b();
            b3.b = 15;
            return p((List)a, b3.a());
        }
        final zvo b4 = aaeh.B();
        if (b4 != null) {
            try {
                final afel d = afeq.d();
                final afes h = afev.h();
                int n = -1;
                int n2;
                if (b2) {
                    d.j((Iterable)a);
                    final Iterator iterator = ((List)a).iterator();
                    while (true) {
                        n2 = n;
                        if (!iterator.hasNext()) {
                            break;
                        }
                        final String s = (String)iterator.next();
                        final Integer n3 = ((Map<K, Integer>)g).get(s);
                        int intValue;
                        if (n3 != null) {
                            intValue = n3;
                        }
                        else {
                            intValue = 0;
                        }
                        h.g(s, intValue);
                    }
                }
                else {
                    final akvm b5 = ((aaeu)this.j.a()).b(b4, aaeu.c(b4, (List)a), b);
                    final Iterator iterator2 = ((List)a).iterator();
                    while (true) {
                        n2 = n;
                        if (!iterator2.hasNext()) {
                            break;
                        }
                        final String s2 = (String)iterator2.next();
                        final akvk o = aakr.o(b5, s2);
                        int max = n;
                        if (o != null) {
                            max = Math.max(n, o.d);
                        }
                        if (o != null) {
                            n = max;
                            if (o.c) {
                                continue;
                            }
                            n = max;
                            if (!o.f) {
                                continue;
                            }
                        }
                        int n4;
                        if (o != null && o.e) {
                            n4 = 0;
                        }
                        else {
                            n4 = 1;
                        }
                        d.h(s2);
                        h.g(s2, n4);
                        n = max;
                    }
                }
                final afeq g2 = d.g();
                if (g2 != null) {
                    zme = (zme)new ihw(g2, h.c(), n2);
                    final afeq a2 = ((ihw)zme).a;
                    final afev b6 = ((ihw)zme).b;
                    final afes h2 = afev.h();
                    Object o2;
                    aaeh aaeh2;
                    afev c2;
                    if (((List)a2).isEmpty()) {
                        final afev c = h2.c();
                        o2 = zme;
                        aaeh2 = aaeh;
                        c2 = c;
                    }
                    else {
                        final zzu f = aaeh.f();
                        g = aaeh.G();
                        if (f != null && g != null) {
                            final ArrayList list = new ArrayList();
                            final HashMap hashMap = new HashMap();
                            final HashMap hashMap2 = new HashMap();
                            final HashMap hashMap3 = new HashMap();
                            final HashMap hashMap4 = new HashMap();
                            final afkf d2 = a2.D();
                            while (((Iterator)d2).hasNext()) {
                                final String s3 = (String)((Iterator)d2).next();
                                final aaat s4 = b4.s(s3);
                                final Pair p6 = b4.p(s3);
                                if (s4 != null && p6 != null) {
                                    try {
                                        final zaz j = ((aanx)this.b.a()).J(s3, (int)tpe.L(x, (Object)s3, (Object)Integer.MAX_VALUE));
                                        if (j == null) {
                                            final aaby b7 = aabz.c.b();
                                            b7.b = 33;
                                            final ahaz builder = ((ahbh)amul.a).createBuilder();
                                            builder.copyOnWrite();
                                            final amul amul = (amul)builder.instance;
                                            amul.c = 2;
                                            amul.b |= 0x1;
                                            final String f2 = vgl.f(306, s3);
                                            builder.copyOnWrite();
                                            final amul amul2 = (amul)builder.instance;
                                            f2.getClass();
                                            amul2.b |= 0x2;
                                            amul2.d = f2;
                                            b7.b(afeq.r((Object)builder.build()));
                                            h2.g(s3, b7.a());
                                        }
                                        else {
                                            final Object a3 = j.a;
                                            final List list2 = (List)p6.second;
                                            ((aaec)this.c.a()).V();
                                            ((aaec)this.c.a()).W();
                                            Object b8 = j.b;
                                            final aaar aaar = (aaar)b8;
                                            if (aaar.e != ((List)a3).size()) {
                                                ttr.l("[Offline] Playlist size doesn't match number of playlist videos");
                                                b8 = new aaar(aaar, ((List)a3).size());
                                            }
                                            Label_0877: {
                                                try {
                                                    f.r((aaar)b8);
                                                    break Label_0877;
                                                }
                                                catch (final ExecutionException aaar) {}
                                                catch (final IOException ex) {}
                                                ttr.n("[Offline] Failed saving playlist thumbnail for ".concat(((aaar)b8).a), (Throwable)aaar);
                                                try {
                                                    final Set set = (Set)Collection$_EL.stream((Collection)this.e(aaeh, (List)a3)).map((Function)ifj.f).collect(Collectors.toCollection((Supplier)ihv.a));
                                                    Integer value = b6.get(s3);
                                                    if (value != null && value != 2 && b4.n(s3) > 0) {
                                                        value = 1;
                                                    }
                                                    hashMap.put(s3, b8);
                                                    hashMap2.put(s3, a3);
                                                    hashMap3.put(s3, set);
                                                    hashMap4.put(s3, b4.f(s3));
                                                    if (value != null && (value == 0 || value == 2)) {
                                                        list.add(s3);
                                                        continue;
                                                    }
                                                    continue;
                                                }
                                                catch (final InterruptedException b8) {}
                                                catch (final ExecutionException ex2) {}
                                            }
                                            ttr.d("[Offline] Failed preparing videos to download for playlist ".concat(String.valueOf(s3)), (Throwable)b8);
                                            if (this.n.f(45376318L)) {
                                                zlm.c(zll.b, zlk.B, "Legacy playlist entity controller failed preparing videos to download for playlist ".concat(String.valueOf(s3)), (Throwable)b8);
                                            }
                                            this.o(s3);
                                            final aaby b9 = aabz.c.b();
                                            b9.b = 17;
                                            h2.g(s3, b9.a());
                                        }
                                    }
                                    catch (final ExecutionException ex3) {
                                        final StringBuilder sb = new StringBuilder("[Offline] Failed requesting playlist ");
                                        sb.append(s3);
                                        sb.append(" for offline");
                                        ttr.d(sb.toString(), (Throwable)ex3);
                                        this.o(s3);
                                        final aaby b10 = aabz.b.b();
                                        b10.b = 17;
                                        h2.g(s3, b10.a());
                                    }
                                }
                                else {
                                    this.o(s3);
                                    h2.g(s3, aabz.a);
                                }
                            }
                            final afev b11 = afim.b;
                            final long t = ((acid)this.h.a()).t();
                            final zme zme2 = zme;
                            final aaeh aaeh3 = aaeh;
                            x = g.x((List)list, (Map)b6, (Map)hashMap2, (Map)hashMap3, (Map)b11, (Map)b11, (Map)hashMap4, t, (int)(b ? 1 : 0));
                            final Iterator iterator3 = hashMap.values().iterator();
                            final HashMap hashMap5 = hashMap4;
                            while (iterator3.hasNext()) {
                                final aaar aaar2 = (aaar)iterator3.next();
                                int n5;
                                if ((b ? 1 : 0) != 0) {
                                    n5 = 3;
                                }
                                else {
                                    n5 = 2;
                                }
                                final amwz amwz = (amwz)tpe.L((Map)hashMap5, (Object)aaar2.a, (Object)amwz.a);
                                final int u = ((aaec)this.c.a()).U(amwz);
                                final byte[] l = b4.l(aaar2.a);
                                final List list3 = (List)tpe.L((Map)hashMap2, (Object)aaar2.a, (Object)afeq.q());
                                final Set set2 = (Set)tpe.L(x, (Object)aaar2.a, (Object)afiq.a);
                                final Collection t2 = b4.k.t(aaar2.a, list3);
                                if (!b4.al(aaar2, list3, amwz, u, set2, aaaz.a, b4.a(aaar2.a), l, false)) {
                                    final String a4 = aaar2.a;
                                    final StringBuilder sb2 = new StringBuilder("[Offline] Failed syncing playlist ");
                                    sb2.append(a4);
                                    sb2.append(" to database");
                                    ttr.b(sb2.toString());
                                    this.o(aaar2.a);
                                    final String a5 = aaar2.a;
                                    final aaby b12 = aabz.c.b();
                                    b12.b = 6;
                                    h2.g(a5, b12.a());
                                }
                                else {
                                    b4.ad(aaar2.a);
                                    m(b4, list3);
                                    this.i(aaeh3, aaar2, set2);
                                    final String a6 = aaar2.a;
                                    final aaby a7 = aabz.a();
                                    a7.a = 2;
                                    final afel d3 = afeq.d();
                                    d3.j((Iterable)l(aaar2.a, t2, n5));
                                    d3.j((Iterable)k(aaar2.a, list3, set2, amwz, aaaz.a, n5, l));
                                    a7.b(d3.g());
                                    h2.g(a6, a7.a());
                                }
                            }
                            aaeh2 = aaeh3;
                            c2 = h2.c();
                            o2 = zme2;
                        }
                        else {
                            aaeh2 = aaeh;
                            final afkf d4 = a2.D();
                            while (((Iterator)d4).hasNext()) {
                                final String s5 = (String)((Iterator)d4).next();
                                final aaby b13 = aabz.c.b();
                                b13.b = 15;
                                h2.g(s5, b13.a());
                            }
                            final afev c3 = h2.c();
                            o2 = zme;
                            c2 = c3;
                        }
                    }
                    if ((b ? 1 : 0) != 0) {
                        if (((ihw)o2).c > 0) {
                            ((aaez)this.k.a()).c(aaeh2.q(), (long)((ihw)o2).c);
                        }
                        else {
                            ((aaez)this.k.a()).d();
                        }
                    }
                    final afel d5 = afeq.d();
                    final Iterator iterator4 = ((List)a).iterator();
                    while (iterator4.hasNext()) {
                        if ((a = (aabz)c2.get(iterator4.next())) == null) {
                            a = aabz.a;
                        }
                        d5.h(a);
                    }
                    return d5.g();
                }
                throw new NullPointerException("Null playlistIdsToRefresh");
            }
            catch (final ExecutionException ex4) {
                final aaby b14 = aabz.b.b();
                b14.b = 17;
                return p((List)a, b14.a());
            }
        }
        final aaby b15 = aabz.c.b();
        b15.b = 15;
        return p((List)a, b15.a());
    }
    
    public final Set e(final aaeh aaeh, final List list) {
        final zaz zaz = (zaz)this.i.a();
        final HashSet set = new HashSet();
        for (final aaba aaba : list) {
            final String f = aaba.f();
            tbi.e();
            final zvo b = aaeh.B();
            if (b != null && !b.k(f)) {
                final aabf t = b.t(f);
                if (t != null && !t.q()) {
                    if (!t.C()) {
                        if (!t.w() || !(boolean)oev.a((Future)zaz.h(t))) {
                            continue;
                        }
                    }
                }
                set.add(aaba);
            }
        }
        return set;
    }
    
    public final void f(final String s, final int n) {
        this.e.f((Object)new zxr(s, n));
    }
    
    public final void g(final String s) {
        this.e.f((Object)new zxt(s));
    }
    
    public final void h(final String s) {
        this.e.f((Object)new zxu(s));
    }
    
    public final void i(final aaeh aaeh, final aaar aaar, final Collection collection) {
        final aanx f = aaeh.F();
        if (f != null) {
            final String a = aaar.a;
            this.e.f((Object)new zxv(f.q(aaar, collection).c()));
        }
    }
}
