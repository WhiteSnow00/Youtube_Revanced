import java.util.concurrent.Callable;
import j$.util.Optional;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.function.Function;
import java.util.Collection;
import j$.util.Collection$_EL;
import java.util.List;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.e;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iia extends iho implements aacc
{
    public final ativ a;
    public final iho b;
    public final Executor c;
    public final aabo d;
    public final vai e;
    public final vai f;
    private final vef g;
    private final atke h;
    private final fln i;
    private final fln j;
    private final e k;
    
    public iia(final vef g, final aabo d, final atke h, final e k, final iho b, final fln i, final fln j, final Executor c, final vai e, final vai f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = ativ.aF((Object)false);
        this.g = g;
        this.d = d;
        this.h = h;
        this.k = k;
        this.b = b;
        this.i = i;
        this.j = j;
        this.c = c;
        this.e = e;
        this.f = f;
    }
    
    public static final aabz e(final afeq afeq) {
        final aaby a = aabz.a();
        a.a = 2;
        a.b(afeq);
        return a.a();
    }
    
    public static final afeq f(final List list) {
        return (afeq)Collection$_EL.stream((Collection)list).map((Function)new ifj(6)).flatMap((Function)ifj.g).collect(afci.a);
    }
    
    private final ListenableFuture g(final fln fln) {
        return (ListenableFuture)aevf.f(vdh.aY(fln.d().j((asjr)ign.g).Z((asjr)new ign(7)).aF())).g((aezf)new huo(15), this.c);
    }
    
    public final aacb a(final amul amul) {
        return aacb.b;
    }
    
    public final ListenableFuture b(final zme zme, final amul amul) {
        final int cu = aqsx.cU(amul.c);
        final Boolean value = true;
        int n = cu;
        if (cu == 0) {
            n = 1;
        }
        Label_1072: {
            if (--n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        break Label_1072;
                    }
                }
                else {
                    if (amul.d.equals(glb.T())) {
                        return this.d(this.g.a(zme), glb.T());
                    }
                    return aftq.f((ListenableFuture)afvk.m(afwm.p((Runnable)new hvt(this, 20), this.c)), (aftz)new ier(this, this.g.a(zme), 2), this.c);
                }
            }
            amuj amuj;
            if ((amuj = amul.e) == null) {
                amuj = amuj.b;
            }
            final apyu apyu = (apyu)((ahbc)amuj).rx((ahaq)apyu.b);
            if (!apyu.e) {
                if (amul.d.equals(glb.T())) {
                    this.b.w().tu((Object)value);
                    final amuj e = amul.e;
                    return (ListenableFuture)aevf.f(((lkx)this.h.a()).j()).g((aezf)new igr(this, 5), this.c).b((Class)Throwable.class, (aezf)new igr(this, 3), this.c);
                }
                this.a.tu((Object)value);
                amuj amuj2;
                if ((amuj2 = amul.e) == null) {
                    amuj2 = amuj.b;
                }
                final e k = this.k;
                final apyu apyu2 = (apyu)((ahbc)amuj2).rx((ahaq)apyu.b);
                int af;
                if ((apyu2.c & 0x1) != 0x0) {
                    if ((af = aefb.af(apyu2.d)) == 0) {
                        af = 1;
                    }
                }
                else {
                    af = 2;
                }
                final vns f = ((vnu)k.b).f();
                f.w("FEdownloads");
                f.F = af;
                ((vkk)f).i();
                Object o;
                if (((vai)k.c).f(45368943L)) {
                    final gug gug = (gug)k.a;
                    final Optional t = ((aacf)gug.a).t(f);
                    ListenableFuture listenableFuture;
                    if (!t.isPresent()) {
                        listenableFuture = afwm.m((Object)fgu.o);
                    }
                    else {
                        final String s = (String)t.get();
                        ListenableFuture listenableFuture2;
                        if (!((List)((vai)gug.c).c(45363084L, new byte[0]).b).contains(s)) {
                            listenableFuture2 = afwm.m((Object)Optional.empty());
                        }
                        else if (((vai)gug.c).ap()) {
                            listenableFuture2 = aftq.e(((lkx)gug.f).f(), (aezf)fel.e, (Executor)gug.b);
                        }
                        else {
                            listenableFuture2 = afnd.o((Callable)new csi(gug, 9, (byte[])null, (byte[])null), (Executor)gug.b);
                        }
                        ListenableFuture listenableFuture3;
                        if (!((List)((vai)gug.c).af().b).contains(s)) {
                            listenableFuture3 = afwm.m((Object)Optional.empty());
                        }
                        else {
                            final hyx hyx = (hyx)gug.h;
                            final ListenableFuture w = ((aln)hyx.c).w(((zmf)hyx.b).c().b());
                            final ListenableFuture a = ((fmm)hyx.a).a();
                            listenableFuture3 = aftq.e((ListenableFuture)afvk.m(afnd.z(new ListenableFuture[] { w, a }).P((Callable)new exo(w, a, 4), (Executor)hyx.d)), (aezf)fel.d, (Executor)gug.b);
                        }
                        ListenableFuture listenableFuture4;
                        if (!((List)((vai)gug.c).c(45363086L, new byte[0]).b).contains(s)) {
                            listenableFuture4 = afwm.m((Object)Optional.empty());
                        }
                        else {
                            listenableFuture4 = vdh.aY(((vef)gug.e).a(((zmf)gug.d).c()).f(glb.C()).j((Class)ajio.class).C((asjr)exp.n).C((asjr)exp.o).aa((Object)Optional.empty()));
                        }
                        ListenableFuture listenableFuture5;
                        if (!((List)((vai)gug.c).c(45363085L, new byte[0]).b).contains(s)) {
                            listenableFuture5 = afwm.m((Object)Optional.empty());
                        }
                        else {
                            listenableFuture5 = aftq.e((ListenableFuture)afvk.m(((aaad)gug.g).a()), (aezf)fel.c, (Executor)gug.b);
                        }
                        listenableFuture = afnd.q(afnd.z(new ListenableFuture[] { listenableFuture2, listenableFuture3, listenableFuture4, listenableFuture5 }).P((Callable)new foq(listenableFuture2, listenableFuture3, listenableFuture4, listenableFuture5, 1), (Executor)gug.b), (aezf)new fel(5), (Executor)gug.b);
                    }
                    o = aftq.f((ListenableFuture)afvk.m(aftq.e((ListenableFuture)afvk.m(listenableFuture), (aezf)new igr(f, 7), (Executor)k.d)), (aftz)new ila(k, 2, (byte[])null, (byte[])null, (char[])null, (byte[])null), (Executor)k.d);
                }
                else {
                    o = afvk.m(((vnu)k.b).h(f, (Executor)k.d));
                }
                return afsw.e(aftq.f((ListenableFuture)afvk.m(aftq.e((ListenableFuture)o, (aezf)new iil(19), (Executor)k.d)), (aftz)new igl(this, 17), this.c), (Class)Throwable.class, (aezf)new igr(this, 4), this.c);
            }
            else if (apyu.f) {
                ListenableFuture listenableFuture6;
                if (amul.d.equals(glb.A())) {
                    listenableFuture6 = this.g(this.i);
                }
                else {
                    listenableFuture6 = this.g(this.j);
                }
                return listenableFuture6;
            }
        }
        int cu2;
        if ((cu2 = aqsx.cU(amul.c)) == 0) {
            cu2 = 1;
        }
        ttr.e("Could not handle action: %s for type %s", new Object[] { cu2 - 1, 164 });
        final aaby b = aabz.c.b();
        b.b = 23;
        return afwm.m((Object)b.a());
    }
    
    public final ListenableFuture c(final zme zme, final afeq afeq) {
        return afwm.m((Object)afeq.q());
    }
    
    public final ListenableFuture d(final vee vee, final String s) {
        return vdh.aY(vee.f(s).j((Class)alyt.class).w((asjr)new fdo(this, vee, 20)).J((asjr)ign.f).Y((asih)asie.I((Object)aabz.a)));
    }
    
    public final ashi u() {
        return ((ashi)this.a).R();
    }
    
    public final asie v() {
        return ((ashi)this.a).aA().ak((Object)false);
    }
    
    public final ativ w() {
        return this.a;
    }
}
