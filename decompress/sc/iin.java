import java.util.Iterator;
import java.util.List;
import java.util.Collection;
import j$.util.Collection$_EL;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Future;
import java.util.function.Consumer;
import j$.util.Optional;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iin implements aacc
{
    private static final aacb k;
    public final vef a;
    public final zmf b;
    public final fln c;
    public final aaec d;
    public final afvs e;
    public final tgd f;
    public final atke g;
    public final aabo h;
    public final vai i;
    public final aanx j;
    private final fln l;
    private final afvs m;
    private final vai n;
    private final aanx o;
    
    static {
        k = (aacb)new iio(1);
    }
    
    public iin(final vef a, final zmf b, final aabo h, final fln c, final fln l, final aaec d, final afvs e, final afvs m, final vai i, final aanx o, final aanx j, final tgd f, final atke g, final vai n, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.b = b;
        this.h = h;
        this.c = c;
        this.l = l;
        this.d = d;
        this.e = e;
        this.m = m;
        this.i = i;
        this.o = o;
        this.j = j;
        this.f = f;
        this.g = g;
        this.n = n;
    }
    
    public static aaba d(final amas amas, final apyk apyk) {
        final ahaz builder = ((ahbh)amvs.a).createBuilder();
        final String e = amas.e;
        builder.copyOnWrite();
        final amvs amvs = (amvs)builder.instance;
        e.getClass();
        amvs.b |= 0x1;
        amvs.c = e;
        final String g = amas.g;
        builder.copyOnWrite();
        final amvs amvs2 = (amvs)builder.instance;
        g.getClass();
        amvs2.b |= 0x8;
        amvs2.f = g;
        final long seconds = TimeUnit.MILLISECONDS.toSeconds(amas.h);
        builder.copyOnWrite();
        final amvs amvs3 = (amvs)builder.instance;
        amvs3.b |= 0x20;
        amvs3.h = seconds;
        final long o = amas.i;
        builder.copyOnWrite();
        final amvs amvs4 = (amvs)builder.instance;
        amvs4.b |= 0x2000;
        amvs4.o = o;
        final String ae = tpe.ae((long)amas.i);
        builder.copyOnWrite();
        final amvs amvs5 = (amvs)builder.instance;
        amvs5.b |= 0x10;
        amvs5.g = ae;
        final long m = amas.m;
        builder.copyOnWrite();
        final amvs amvs6 = (amvs)builder.instance;
        amvs6.b |= 0x40;
        amvs6.i = m;
        apzj apzj;
        if ((apzj = amas.p) == null) {
            apzj = apzj.a;
        }
        final String c = apzj.c;
        builder.copyOnWrite();
        final amvs amvs7 = (amvs)builder.instance;
        c.getClass();
        amvs7.b |= 0x400;
        amvs7.l = c;
        apzj apzj2;
        if ((apzj2 = amas.p) == null) {
            apzj2 = apzj.a;
        }
        final String d = apzj2.d;
        builder.copyOnWrite();
        final amvs amvs8 = (amvs)builder.instance;
        d.getClass();
        amvs8.b |= 0x800;
        amvs8.m = d;
        apzj apzj3;
        if ((apzj3 = amas.p) == null) {
            apzj3 = apzj.a;
        }
        final String e2 = apzj3.e;
        builder.copyOnWrite();
        final amvs amvs9 = (amvs)builder.instance;
        e2.getClass();
        amvs9.b |= 0x1000;
        amvs9.n = e2;
        aotp d2;
        if ((d2 = amas.j) == null) {
            d2 = aotp.a;
        }
        builder.copyOnWrite();
        final amvs amvs10 = (amvs)builder.instance;
        d2.getClass();
        amvs10.d = d2;
        amvs10.b |= 0x2;
        ajut k;
        if ((k = amas.k) == null) {
            k = ajut.a;
        }
        builder.copyOnWrite();
        final amvs amvs11 = (amvs)builder.instance;
        k.getClass();
        amvs11.k = k;
        amvs11.b |= 0x200;
        if (apyk != null) {
            final ahaz builder2 = ((ahbh)amti.a).createBuilder();
            final ahaz builder3 = ((ahbh)amth.a).createBuilder();
            final String e3 = apyk.e;
            builder3.copyOnWrite();
            final amth amth = (amth)builder3.instance;
            e3.getClass();
            amth.b |= 0x1;
            amth.c = e3;
            final String f = apyk.f;
            builder3.copyOnWrite();
            final amth amth2 = (amth)builder3.instance;
            f.getClass();
            amth2.b |= 0x4;
            amth2.e = f;
            aotp d3;
            if ((d3 = apyk.g) == null) {
                d3 = aotp.a;
            }
            builder3.copyOnWrite();
            final amth amth3 = (amth)builder3.instance;
            d3.getClass();
            amth3.d = d3;
            amth3.b |= 0x2;
            builder2.copyOnWrite();
            final amti amti = (amti)builder2.instance;
            final amth c2 = (amth)builder3.build();
            c2.getClass();
            amti.c = c2;
            amti.b |= 0x1;
            final amti e4 = (amti)builder2.build();
            builder.copyOnWrite();
            final amvs amvs12 = (amvs)builder.instance;
            e4.getClass();
            amvs12.e = e4;
            amvs12.b |= 0x4;
        }
        return aaba.c((amvs)builder.build());
    }
    
    public static aabz e(final String s, final amuj amuj) {
        final aaby a = aabz.a();
        a.a = 2;
        a.b(afeq.r((Object)t(s, amuj, 1)));
        return a.a();
    }
    
    public static aabz g(final String s, final Optional optional, final amwz amwz) {
        final ahaz builder = ancv.a.createBuilder();
        builder.copyOnWrite();
        final ancv ancv = (ancv)builder.instance;
        ancv.e = amwz.k;
        ancv.c |= 0x2;
        optional.ifPresent((Consumer)new iau(builder, 10));
        final ahaz builder2 = ((ahbh)amul.a).createBuilder();
        builder2.copyOnWrite();
        final amul amul = (amul)builder2.instance;
        amul.c = 1;
        amul.b |= 0x1;
        final String h = vgl.h(120, s);
        builder2.copyOnWrite();
        final amul amul2 = (amul)builder2.instance;
        h.getClass();
        amul2.b |= 0x2;
        amul2.d = h;
        final ahbb ahbb = (ahbb)((ahbh)amuj.b).createBuilder();
        ahbb.e((ahaq)ancv.b, (Object)builder.build());
        ahbb.p(amui.c);
        final amuj e = (amuj)((ahaz)ahbb).build();
        builder2.copyOnWrite();
        final amul amul3 = (amul)builder2.instance;
        e.getClass();
        amul3.e = e;
        amul3.b |= 0x4;
        final amul amul4 = (amul)builder2.build();
        final aaby a = aabz.a();
        a.a = 2;
        a.b(afeq.r((Object)amul4));
        return a.a();
    }
    
    public static amwz m(final amuj amuj) {
        amwz amwz;
        if ((amwz = amwz.b(((amao)((ahbc)amuj).rx((ahaq)amao.b)).d)) == null) {
            amwz = amwz.a;
        }
        return amwz;
    }
    
    public static apyk n(final amar amar) {
        final apyj g = amar.g();
        if (g != null) {
            return g.b;
        }
        return null;
    }
    
    public static afeq o(final int n, final int b) {
        final afel d = afeq.d();
        for (int i = 0; i < n; ++i) {
            final aaby b2 = aabz.c.b();
            b2.b = b;
            d.h(b2.a());
        }
        return d.g();
    }
    
    public static boolean q(final aabf aabf, final zaz zaz) {
        return (boolean)oev.a((Future)zaz.h(aabf));
    }
    
    public static boolean r(final aabf aabf, final zaz zaz) {
        return (boolean)oev.a((Future)zaz.i(aabf));
    }
    
    private final ListenableFuture s(final zme zme, final String s, final amuj amuj) {
        if (this.i.ak()) {
            return (ListenableFuture)aevf.f(this.l(this.l, s, amuj)).h((aftz)new iik(this, zme, s, amuj, 0), (Executor)this.e);
        }
        return this.j(zme, s, amuj);
    }
    
    private static amul t(final String s, amuj e, final int n) {
        final amao amao = (amao)((ahbc)e).rx((ahaq)amao.b);
        final ahaz builder = ((ahbh)amul.a).createBuilder();
        builder.copyOnWrite();
        final amul amul = (amul)builder.instance;
        int n2 = 1;
        amul.c = 1;
        amul.b |= 0x1;
        final String h = vgl.h(ancz.b.a(), s);
        builder.copyOnWrite();
        final amul amul2 = (amul)builder.instance;
        h.getClass();
        amul2.b |= 0x2;
        amul2.d = h;
        final ahbb ahbb = (ahbb)((ahbh)amuj.b).createBuilder();
        final int d = e.d;
        ((ahaz)ahbb).copyOnWrite();
        final amuj amuj = (amuj)ahbb.instance;
        amuj.c |= 0x1;
        amuj.d = d;
        ahbb.p(amui.c);
        final ahbf b = ancv.b;
        final ahaz builder2 = ancv.a.createBuilder();
        final int ad = aqsx.aD(amao.e);
        if (ad != 0) {
            n2 = ad;
        }
        builder2.copyOnWrite();
        final ancv ancv = (ancv)builder2.instance;
        ancv.k = n2 - 1;
        ancv.c |= 0x800;
        amwz amwz;
        if ((amwz = amwz.b(amao.d)) == null) {
            amwz = amwz.a;
        }
        builder2.copyOnWrite();
        final ancv ancv2 = (ancv)builder2.instance;
        ancv2.e = amwz.k;
        ancv2.c |= 0x2;
        builder2.copyOnWrite();
        final ancv ancv3 = (ancv)builder2.instance;
        ancv3.j = n - 1;
        ancv3.c |= 0x100;
        ahbb.e((ahaq)b, (Object)builder2.build());
        e = (amuj)((ahaz)ahbb).build();
        builder.copyOnWrite();
        final amul amul3 = (amul)builder.instance;
        e.getClass();
        amul3.e = e;
        amul3.b |= 0x4;
        return (amul)builder.build();
    }
    
    public final aacb a(final amul amul) {
        final int cu = aqsx.cU(amul.c);
        if (cu != 0) {
            if (cu == 4) {
                return iin.k;
            }
        }
        return aacb.b;
    }
    
    public final ListenableFuture b(final zme zme, final amul amul) {
        final String i = vgl.i(amul.d);
        if (i.isEmpty()) {
            final aaby b = aabz.c.b();
            b.b = 27;
            return afwm.m((Object)b.a());
        }
        final int c = amul.c;
        int cu;
        if ((cu = aqsx.cU(c)) == 0) {
            cu = 1;
        }
        if (--cu == 1) {
            amuj amuj;
            if ((amuj = amul.e) == null) {
                amuj = amuj.b;
            }
            final amao amao = (amao)((ahbc)amuj).rx((ahaq)amao.b);
            final int c2 = amao.c;
            Object o;
            if ((c2 & 0x8) != 0x0) {
                final String f = amao.f;
                if (amao.o) {
                    o = afnd.o((Callable)new foq(this, zme, i, f, 5), (Executor)this.m);
                }
                else {
                    o = afnd.o((Callable)new iig(this, zme, i, f, amao, amuj, 0), (Executor)this.e);
                }
            }
            else {
                if ((c2 & 0x100) != 0x0) {
                    final int dc = aqsx.dC(amao.k);
                    if (dc != 0) {
                        if (dc == 2) {
                            if (this.i.as()) {
                                o = afnd.q((ListenableFuture)afnd.t((Callable)new iii(this, zme, i, amao, amuj, 0), (Executor)this.m).b((Class)ExecutionException.class, (aezf)huo.q, (Executor)this.e), (aezf)new iij(this, zme, i, amao, amuj, 0), (Executor)this.e);
                                return (ListenableFuture)o;
                            }
                            o = afnd.t((Callable)new iii(this, zme, i, amao, amuj, 2), (Executor)this.e).b((Class)ExecutionException.class, (aezf)huo.s, (Executor)this.e);
                            return (ListenableFuture)o;
                        }
                    }
                }
                final aaej j = this.h.a().j();
                final aevf f2 = aevf.f(vdh.aY(this.c.b(i).C((asjr)ign.i).J((asjr)ign.j).aa(Optional.empty())));
                final iih iih = new iih(this, amuj, j, 3);
                Object o2;
                if (this.i.av()) {
                    o2 = this.e;
                }
                else {
                    o2 = afum.a;
                }
                final aevf aevf = (aevf)(o = f2.h((aftz)iih, (Executor)o2));
                if (this.i.am()) {
                    final iil c3 = iil.c;
                    Object o3;
                    if (this.i.av()) {
                        o3 = this.e;
                    }
                    else {
                        o3 = afum.a;
                    }
                    o = aevf.b((Class)Throwable.class, (aezf)c3, (Executor)o3);
                }
            }
            return (ListenableFuture)o;
        }
        if (cu == 2) {
            amuj amuj2;
            if ((amuj2 = amul.e) == null) {
                amuj2 = amuj.b;
            }
            Object o4;
            if ((((amao)((ahbc)amuj2).rx((ahaq)amao.b)).c & 0x8) != 0x0) {
                o4 = afnd.o((Callable)new daa(this, zme, i, 11), (Executor)this.e);
            }
            else if (this.i.as()) {
                o4 = aevf.f(this.s(zme, i, amuj2)).h((aftz)new iih(this, zme, i, 0), (Executor)this.e);
            }
            else {
                o4 = this.s(zme, i, amuj2);
            }
            return (ListenableFuture)o4;
        }
        if (cu != 3) {
            int cu2;
            if ((cu2 = aqsx.cU(c)) == 0) {
                cu2 = 1;
            }
            ttr.e("Could not handle action: %s for type %s", new Object[] { cu2 - 1, 261 });
            final aaby b2 = aabz.c.b();
            b2.b = 23;
            return afwm.m((Object)b2.a());
        }
        return this.k(zme, amul);
    }
    
    public final ListenableFuture c(final zme zme, final afeq afeq) {
        int cu;
        if ((cu = aqsx.cU(((amul)afeq.get(0)).c)) == 0) {
            cu = 1;
        }
        if (--cu != 3) {
            ttr.e("Could not handle actions: %s for type %s", new Object[] { cu, 261 });
            return afwm.m((Object)afeq.q());
        }
        return this.i(zme, afeq);
    }
    
    public final aabz f(final amar amar, final amuj amuj) {
        final String videoId = amar.getVideoId();
        final afel d = afeq.d();
        amuj e = amuj;
        if (this.n.aB()) {
            final afeq d2 = zxf.d(amar.getThumbnail());
            final ahaz builder = ((ahbh)amaj.a).createBuilder();
            for (int c = ((afih)d2).c, i = 0; i < c; ++i) {
                final String d3 = ((List<amul>)d2).get(i).d;
                builder.copyOnWrite();
                final amaj amaj = (amaj)builder.instance;
                d3.getClass();
                final ahbx d4 = amaj.d;
                if (!d4.c()) {
                    amaj.d = ahbh.mutableCopy(d4);
                }
                amaj.d.add((Object)d3);
            }
            final ahbb ahbb = (ahbb)((ahbh)amuj).toBuilder();
            ahbb.e((ahaq)amaj.b, (Object)builder.build());
            e = (amuj)((ahaz)ahbb).build();
            d.j((Iterable)d2);
        }
        final aaby a = aabz.a();
        a.a = 2;
        final ahaz builder2 = ((ahbh)amul.a).createBuilder();
        builder2.copyOnWrite();
        final amul amul = (amul)builder2.instance;
        amul.c = 1;
        amul.b |= 0x1;
        final String h = vgl.h(aman.b.a(), videoId);
        builder2.copyOnWrite();
        final amul amul2 = (amul)builder2.instance;
        h.getClass();
        amul2.b |= 0x2;
        amul2.d = h;
        builder2.copyOnWrite();
        final amul amul3 = (amul)builder2.instance;
        e.getClass();
        amul3.e = e;
        amul3.b |= 0x4;
        d.h(builder2.build());
        d.h(t(videoId, e, 2));
        a.b(d.g());
        return a.a();
    }
    
    public final aabz h(final zme zme, final String s, final amas amas, final apyk apyk, final String s2, final amwz amwz, final byte[] array, final amuj amuj) {
        tbi.e();
        final aaeh aaeh = (aaeh)fex.k(this.h, zme).orElse((Object)null);
        if (aaeh == null) {
            final aaby b = aabz.c.b();
            b.b = 35;
            return b.a();
        }
        final zvo b2 = aaeh.B();
        if (b2 == null) {
            final aaby b3 = aabz.c.b();
            b3.b = 15;
            return b3.a();
        }
        aaba aaba;
        if (amas != null) {
            aaba = d(amas, apyk);
        }
        else {
            aaba = this.o.C(s);
        }
        if (!b2.aj(aaba, amwz, s2, this.d.U(amwz), aaaz.a, 0, array, aaaq.c)) {
            final aaby b4 = aabz.c.b();
            b4.b = 40;
            return b4.a();
        }
        aaeh.l().v(s, true);
        return e(s, amuj);
    }
    
    final ListenableFuture i(final zme zme, final afeq afeq) {
        final aaeh a = this.h.a();
        final zvo b = a.B();
        if (!zme.d().equals(a.q())) {
            return afwm.m((Object)o(((afih)afeq).c, 35));
        }
        if (b == null) {
            return afwm.m((Object)o(((afih)afeq).c, 15));
        }
        final ArrayList list = new ArrayList();
        Collection$_EL.stream((Collection)afeq).forEach((Consumer)new iok(b, (List)list, 1));
        final aanx o = this.o;
        final aadw a2 = ((aadx)o.b).a();
        for (final aads aads : list) {
            final String a3 = aads.a;
            final long b2 = aads.b;
            final List c = a2.c;
            final ahaz builder = ((ahbh)akvq.a).createBuilder();
            builder.copyOnWrite();
            final akvq akvq = (akvq)builder.instance;
            akvq.b |= 0x1;
            akvq.c = a3;
            builder.copyOnWrite();
            final akvq akvq2 = (akvq)builder.instance;
            akvq2.b |= 0x2;
            akvq2.d = b2;
            c.add(builder.build());
        }
        ((vkk)a2).i();
        return afnd.q(afnd.q(((vml)((aadx)o.b).g).a((vls)a2), (aezf)zxl.m, (Executor)o.a), (aezf)new iij(this, a, b, afeq, list, 1), (Executor)this.e);
    }
    
    public final ListenableFuture j(final zme zme, final String s, final amuj amuj) {
        final aaeh aaeh = (aaeh)fex.k(this.h, zme).orElse((Object)null);
        ListenableFuture listenableFuture;
        if (aaeh == null) {
            final aaby b = aabz.c.b();
            b.b = 35;
            listenableFuture = afwm.m((Object)b.a());
        }
        else {
            final afvk m = afvk.m(aaeh.j().o(s));
            final iil b2 = iil.b;
            Object o;
            if (this.i.av()) {
                o = this.e;
            }
            else {
                o = afum.a;
            }
            listenableFuture = aftq.e((ListenableFuture)m, (aezf)b2, (Executor)o);
        }
        final aevf f = aevf.f(listenableFuture);
        final iih iih = new iih(this, s, amuj, 2);
        Object o2;
        if (this.i.av()) {
            o2 = this.e;
        }
        else {
            o2 = afum.a;
        }
        return (ListenableFuture)f.h((aftz)iih, (Executor)o2);
    }
    
    final ListenableFuture k(final zme zme, final amul amul) {
        return afnd.q(this.i(zme, afeq.r((Object)amul)), (aezf)huo.r, (Executor)this.e);
    }
    
    public final ListenableFuture l(final fln fln, final String s, final amuj amuj) {
        final afvk m = afvk.m(tpe.cp(fln.a(s)));
        final etz etz = new etz(s, amuj, 14);
        Object o;
        if (this.i.av()) {
            o = this.e;
        }
        else {
            o = afum.a;
        }
        final ListenableFuture e = aftq.e((ListenableFuture)m, (aezf)etz, (Executor)o);
        final iil a = iil.a;
        Object o2;
        if (this.i.av()) {
            o2 = this.e;
        }
        else {
            o2 = afum.a;
        }
        return afsw.e(e, (Class)Throwable.class, (aezf)a, (Executor)o2);
    }
    
    public final void p(final atib atib, final int n, final String s) {
        atib.x(n);
        atib.t().c(s);
        this.f.f((Object)new zyq(atib.t().b()));
    }
}
