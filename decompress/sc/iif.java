import java.util.List;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iif implements aacc
{
    private final vef a;
    private final vdr b;
    private final oby c;
    private final Executor d;
    private final ajb e;
    
    public iif(final vef a, final vdr b, final oby c, final ajb e, final Executor d, final byte[] array) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = e;
        this.d = d;
    }
    
    public final aacb a(final amul amul) {
        return aacb.b;
    }
    
    public final ListenableFuture b(final zme zme, final amul amul) {
        final String i = vgl.i(amul.d);
        if (i.isEmpty()) {
            final aaby b = aabz.c.b();
            b.b = 27;
            return afwm.m((Object)b.a());
        }
        amuj amuj;
        if ((amuj = amul.e) == null) {
            amuj = amuj.b;
        }
        final amaj amaj = (amaj)((ahbc)amuj).rx((ahaq)amaj.b);
        final int c = amul.c;
        int cu;
        if ((cu = aqsx.cU(c)) == 0) {
            cu = 1;
        }
        if (--cu == 1) {
            Object o;
            if (amaj != null) {
                o = amaj.d;
            }
            else {
                o = afeq.q();
            }
            final vee a = this.a.a(zme);
            final vfw c2 = a.c();
            final amak d = amal.d(glb.Y(i));
            d.c(this.c.c());
            d.d(glb.P(i));
            final ahbb a2 = d.a;
            ((ahaz)a2).copyOnWrite();
            final aman aman = (aman)a2.instance;
            final aman a3 = aman.a;
            final ahbx g = aman.g;
            if (!g.c()) {
                aman.g = ahbh.mutableCopy(g);
            }
            agzk.addAll((Iterable)o, (List)aman.g);
            c2.d((vfn)d.b((vfp)a));
            return afsw.e(aftq.e((ListenableFuture)afvk.m(tpe.cp(c2.b())), (aezf)huo.o, (Executor)afum.a), (Class)Throwable.class, (aezf)huo.p, (Executor)afum.a);
        }
        if (cu != 4) {
            int cu2;
            if ((cu2 = aqsx.cU(c)) == 0) {
                cu2 = 1;
            }
            ttr.e("Could not handle action: %s for type %s", new Object[] { cu2 - 1, 262 });
            final aaby b2 = aabz.c.b();
            b2.b = 23;
            return afwm.m((Object)b2.a());
        }
        ListenableFuture listenableFuture;
        if ((amaj.c & 0x1) != 0x0 && amaj.e) {
            listenableFuture = aftq.f((ListenableFuture)afvk.m(tpe.cm(this.e.d(glb.Y(i)).j(amam.class))), (aftz)new igl(this.b.a(zme), 20), this.d);
        }
        else {
            listenableFuture = afwm.m((Object)aabz.a);
        }
        return listenableFuture;
    }
    
    public final ListenableFuture c(final zme zme, final afeq afeq) {
        return afwm.m((Object)afeq.q());
    }
}
