import java.util.concurrent.Callable;
import j$.util.stream.Collectors;
import java.util.function.Function;
import j$.util.Collection$_EL;
import android.text.Spanned;
import java.util.Iterator;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import com.google.common.util.concurrent.ListenableFuture;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class igd implements aain, aaii
{
    public final bu a;
    public final ifr b;
    public final oiy c;
    public final oiu d;
    private final Context e;
    private final ine f;
    private final atke g;
    private final atke h;
    private final ihb i;
    private final fmr j;
    private final vai k;
    private final ziy l;
    private final aln m;
    private final msr n;
    private final bhv o;
    
    public igd(final Context e, final bu a, final ziy l, final ine f, final aln m, final atke g, final atke h, final bhv o, final ihb i, final ifr b, final oiy c, final oiu d, final fmr j, final msr n, final vai k, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.e = e;
        this.a = a;
        this.l = l;
        this.f = f;
        this.m = m;
        this.g = g;
        this.h = h;
        this.o = o;
        this.i = i;
        this.b = b;
        this.c = c;
        this.d = d;
        this.j = j;
        this.n = n;
        this.k = k;
    }
    
    public static void a(final amxe amxe, final wyw wyw) {
        if (wyw == null) {
            return;
        }
        wyw.l((wzz)new wyt(xaa.c(71610)));
        aakr.u(amxe, wyw);
    }
    
    private final void e(final aun aun, final ListenableFuture listenableFuture, final ttg ttg, final ttg ttg2) {
        if (this.k.f(45354988L)) {
            teu.o(aun, listenableFuture, ttg, ttg2);
            return;
        }
        teu.n(aun, listenableFuture, ttg, ttg2);
    }
    
    private final void g(final String s, final String s2, final amxe amxe, final wyw wyw) {
        final ziy l = this.l;
        final List c = aaan.c(amxe);
        final afeq s3 = ((aaec)l.a).s();
        final ArrayList list = new ArrayList();
        for (final ajfu ajfu : c) {
            if ((ajfu.b & 0x2) != 0x0) {
                amwz amwz;
                if ((amwz = amwz.b(ajfu.d)) == null) {
                    amwz = amwz.a;
                }
                if (!s3.contains((Object)amwz)) {
                    continue;
                }
                list.add(ajfu);
            }
        }
        Collections.sort((List<Object>)list, ((aaec)l.a).e());
        final afeq o = afeq.o((Collection)list);
        final ahbx f = amxe.f;
        final ArrayList list2 = new ArrayList();
        final Iterator iterator2 = ((List)f).iterator();
        boolean b;
        while (true) {
            final boolean hasNext = iterator2.hasNext();
            b = true;
            if (!hasNext) {
                break;
            }
            final amxa amxa = (amxa)iterator2.next();
            final int b2 = amxa.b;
            final String s4 = null;
            ajut ajut;
            if ((b2 & 0x2) != 0x0) {
                if ((ajut = amxa.d) == null) {
                    ajut = ajut.a;
                }
            }
            else {
                ajut = null;
            }
            final Spanned b3 = acak.b(ajut);
            String string;
            if (b3 != null) {
                string = b3.toString();
            }
            else {
                string = null;
            }
            final String c2 = amxa.c;
            if (aezr.f(string) || aezr.f(c2)) {
                continue;
            }
            final ahaz builder = ((ahbh)ajfs.a).createBuilder();
            builder.copyOnWrite();
            final ajfs ajfs = (ajfs)builder.instance;
            string.getClass();
            ajfs.b |= 0x2;
            ajfs.d = string;
            builder.copyOnWrite();
            final ajfs ajfs2 = (ajfs)builder.instance;
            c2.getClass();
            ajfs2.b |= 0x1;
            ajfs2.c = c2;
            ajut ajut2;
            if ((amxa.b & 0x4) != 0x0) {
                if ((ajut2 = amxa.e) == null) {
                    ajut2 = ajut.a;
                }
            }
            else {
                ajut2 = null;
            }
            final Spanned b4 = acak.b(ajut2);
            String string2 = s4;
            if (b4 != null) {
                string2 = b4.toString();
            }
            if (!aezr.f(string2)) {
                builder.copyOnWrite();
                final ajfs ajfs3 = (ajfs)builder.instance;
                string2.getClass();
                ajfs3.b |= 0x4;
                ajfs3.e = string2;
            }
            list2.add(builder.build());
        }
        final afeq o2 = afeq.o((Collection)list2);
        if (!o.isEmpty()) {
            if (!aezr.f(s)) {
                final aabf e = ((aabo)this.g.a()).a().l().e(s);
                if (e == null || !e.q()) {
                    b = false;
                }
                final boolean p4 = this.j.p(s);
                if ((b || p4) && !((tjm)this.h.a()).o()) {
                    this.c(amxe, o, o2, s, s2);
                    a(amxe, wyw);
                    return;
                }
                s.getClass();
                this.l.j((Context)this.a, amxe, s, (List)o, (tcc)new igc(this, amxe, o2, s, s2, wyw, o));
            }
            else {
                this.c(amxe, o, o2, s, s2);
                a(amxe, wyw);
            }
        }
    }
    
    public final void b(afeq afeq, final afeq afeq2, final String s, final String s2, final boolean b, final String s3, final aezp aezp) {
        final int n = ((List)Collection$_EL.stream((Collection)afeq).map((Function)ifj.c).collect(Collectors.toList())).lastIndexOf(amwq.c) + 1;
        final ArrayList list = new ArrayList((Collection<? extends E>)afeq);
        final afel d = afeq.d();
        d.j(list.subList(n, list.size()));
        int i = 0;
        d.j(list.subList(0, n));
        final afeq g = d.g();
        final amwz v = ((aaea)this.f).v(amwz.a);
        final Comparator f = aaiz.f;
        Object o = aeyo.a;
        while (i < ((List)afeq).size()) {
            final ajfu ajfu = ((List<ajfu>)afeq).get(i);
            amwq amwq;
            if ((amwq = amwq.b(ajfu.f)) == null) {
                amwq = amwq.a;
            }
            Object k = o;
            Label_0269: {
                if (amwq != amwq.c) {
                    amwz a = amwz.a;
                    if (v != a) {
                        final amwz b2 = amwz.b(ajfu.d);
                        if (b2 != null) {
                            a = b2;
                        }
                        if (v == a) {
                            o = aezp.k((Object)ajfu);
                            break;
                        }
                    }
                    if (((aezp)o).h()) {
                        k = o;
                        if (f.compare(((aezp)o).c(), ajfu) <= 0) {
                            break Label_0269;
                        }
                    }
                    k = aezp.k((Object)ajfu);
                }
            }
            ++i;
            o = k;
        }
        if (n == 0) {
            afeq = afeq.q();
        }
        else {
            final afel d2 = afeq.d();
            final ahaz builder = ((ahbh)ajfw.a).createBuilder();
            builder.copyOnWrite();
            final ajfw ajfw = (ajfw)builder.instance;
            ajfw.c = 2;
            ajfw.b |= 0x1;
            final int size = afeq.size();
            builder.copyOnWrite();
            final ajfw ajfw2 = (ajfw)builder.instance;
            ajfw2.b |= 0x2;
            ajfw2.d = size - n;
            d2.h(builder.build());
            afeq = d2.g();
        }
        final int f2 = this.o.F();
        if (!tpe.bq(this.e)) {
            final bu a2 = this.a;
            final ihb j = this.i;
            this.e((aun)a2, j.b.rz(aeun.i((Callable)new igz(j, g, (aezp)o, afeq2, s, s2, b, s3, afeq, f2, aezp))), (ttg)ify.c, (ttg)new hui(this, 10));
            return;
        }
        final bu a3 = this.a;
        final ihb l = this.i;
        this.e((aun)a3, l.b.rz(aeun.i((Callable)new iha(l, g, (aezp)o, afeq2, s, s2, b, s3, afeq, f2, aezp))), (ttg)ify.d, (ttg)new hui(this, 11));
    }
    
    public final void c(final amxe amxe, final afeq afeq, final afeq afeq2, final String s, final String s2) {
        final String a = this.n.A();
        Object o;
        if ((amxe.b & 0x80) != 0x0 && amxe.i.d() > 0) {
            o = aezp.k((Object)amxe.i);
        }
        else {
            o = aeyo.a;
        }
        this.e((aun)this.a, this.m.t(), (ttg)new igb(this, afeq, afeq2, s, s2, a, (aezp)o, 1), (ttg)new igb(this, afeq, afeq2, s, s2, a, (aezp)o, 0));
    }
    
    public final void d(final aaip aaip) {
        this.b.d(aaip);
    }
    
    public final void f(final amxe amxe, final wyw wyw, final aais aais, final String s) {
        this.g(null, s, amxe, wyw);
    }
    
    public final void h(final aaiq aaiq) {
        this.b.h(aaiq);
    }
    
    public final void i(final String s, final amxe amxe, final wyw wyw, final aais aais) {
        this.g(s, null, amxe, wyw);
    }
    
    public final void j(final aaiq aaiq) {
        this.b.j(aaiq);
    }
    
    public final void k(final aaiq aaiq, final aahz aahz) {
        this.b.k(aaiq, aahz);
    }
    
    public final void l(final aaiq aaiq) {
        this.b.l(aaiq);
    }
    
    public final void m(final aaiq aaiq, final String s, final String s2) {
        this.b.m(aaiq, s, s2);
    }
    
    public final void n(final aair aair) {
        this.b.n(aair);
    }
    
    public final void o(final aair aair) {
        this.b.o(aair);
    }
    
    public final void p(final aair aair, final String s) {
        this.b.p(aair, s);
    }
    
    public final void q(final aair aair) {
        this.b.q(aair);
    }
    
    public final void r(final aaiq aaiq, final aahz aahz) {
        this.b.k(aaiq, aahz);
    }
    
    public final void s(final aaiq aaiq) {
        this.b.s(aaiq);
    }
    
    public final void u(final acxl acxl) {
        this.b.u(acxl);
    }
}
