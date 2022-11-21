import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;
import java.util.concurrent.Callable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aabo implements aadz
{
    public final vfn a;
    public final aaig b;
    private final atnb c;
    private final afxj d;
    private final ScheduledExecutorService e;
    private final aaks f;
    private final aaec g;
    private final aefs h;
    
    public aabo(final vfn a, final aaec g, final aefs h, final atnb c, final aaig b, final afxj d, final ScheduledExecutorService e, final aaks f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7, final byte[] array8) {
        this.a = a;
        this.g = g;
        this.h = h;
        this.c = c;
        this.b = b;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    private static amxv f(int n, final amze amze, final String e, final aach aach) {
        final ahcr builder = ((ahcz)amxv.a).createBuilder();
        final String u = aahc.u(aach);
        builder.copyOnWrite();
        final amxv amxv = (amxv)builder.instance;
        amxv.b |= 0x1;
        amxv.d = u;
        builder.copyOnWrite();
        final amxv amxv2 = (amxv)builder.instance;
        amxv2.h = n - 1;
        amxv2.b |= 0x10;
        builder.copyOnWrite();
        final amxv amxv3 = (amxv)builder.instance;
        amxv3.t = amze.k;
        amxv3.b |= 0x100000;
        n = aacw.a.b();
        builder.copyOnWrite();
        final amxv amxv4 = (amxv)builder.instance;
        amxv4.r = n - 1;
        amxv4.b |= 0x10000;
        n = aqvq.cF(aahc.h(aach));
        builder.copyOnWrite();
        final amxv amxv5 = (amxv)builder.instance;
        if (n != 0) {
            amxv5.x = n - 1;
            amxv5.c |= 0x2;
            builder.copyOnWrite();
            final amxv amxv6 = (amxv)builder.instance;
            amxv6.g = 1;
            amxv6.b |= 0x8;
            builder.copyOnWrite();
            final amxv amxv7 = (amxv)builder.instance;
            e.getClass();
            amxv7.b |= 0x2;
            amxv7.e = e;
            final byte[] ag = aahc.ag(aach);
            if (ag != null) {
                final ahbt x = ahbt.x(ag);
                builder.copyOnWrite();
                final amxv amxv8 = (amxv)builder.instance;
                amxv8.c |= 0x20;
                amxv8.z = x;
            }
            return (amxv)builder.build();
        }
        throw null;
    }
    
    private static String g(final aozj aozj, final aefs aefs) {
        String s;
        if ((aozj.c & 0x400) != 0x0) {
            s = aozj.j;
        }
        else {
            s = aefs.cw();
        }
        return s;
    }
    
    public final aady a(final amwq amwq) {
        return aady.b;
    }
    
    public final ListenableFuture b(final znz znz, final amwq amwq) {
        final aozk a = aozk.a;
        int cm;
        if ((cm = aqvq.cM(amwq.c)) == 0) {
            cm = 1;
        }
        if (--cm == 1) {
            final String d = amwq.d;
            amwo amwo;
            if ((amwo = amwq.e) == null) {
                amwo = amwo.b;
            }
            return afxr.s(agra.V((Callable)new fot(this, znz, d, amwo, 17), (Executor)this.d), 30L, TimeUnit.SECONDS, this.e);
        }
        if (cm == 2) {
            return afxr.s(agra.V((Callable)new wya(this, znz, amwq.d, 7), (Executor)this.d), 30L, TimeUnit.SECONDS, this.e);
        }
        if (cm == 3) {
            final String d2 = amwq.d;
            amwo amwo2;
            if ((amwo2 = amwq.e) == null) {
                amwo2 = amwo.b;
            }
            return afxr.s(agra.V((Callable)new fot(this, znz, d2, amwo2, 18), (Executor)this.d), 30L, TimeUnit.SECONDS, this.e);
        }
        if (cm != 4) {
            final aadv b = aadw.c.b();
            b.b = 23;
            return afxr.l(b.a());
        }
        final String d3 = amwq.d;
        amwo amwo3;
        if ((amwo3 = amwq.e) == null) {
            amwo3 = amwo.b;
        }
        return afxr.s(agra.V((Callable)new fot(this, znz, d3, amwo3, 19), (Executor)this.d), 30L, TimeUnit.SECONDS, this.e);
    }
    
    public final ListenableFuture c(final znz znz, final afgh afgh) {
        throw new UnsupportedOperationException();
    }
    
    public final aadw d(final znz znz, final String s, final amwo amwo) {
        final vfm a = this.a.a(znz);
        final aozo aozo = (aozo)a.g(s).j(aozo.class).af();
        if (aozo != null) {
            final aozk transferState = aozo.getTransferState();
            final aozk a2 = aozk.a;
            final int ordinal = transferState.ordinal();
            if (ordinal == 1 || ordinal == 3 || ordinal == 4 || ordinal == 6 || ordinal == 7) {
                return aadw.a;
            }
        }
        final aozj aozj = (aozj)((ahcu)amwo).rx((ahci)aozj.b);
        final aefs h = this.h;
        final aozm d = aozn.d(s);
        d.d(g(aozj, h));
        d.g(aozk.b);
        amze amze;
        if ((amze = amze.b(aozj.d)) == null) {
            amze = amze.a;
        }
        d.f(amze);
        final aozo b = d.b((vgx)a);
        final aaec g = this.g;
        final String i = vht.i(b.e());
        amze amze2;
        if ((amze2 = amze.b(aozj.d)) == null) {
            amze2 = amze.a;
        }
        final aacg aacg = new aacg(vgw.a);
        aahc.L((aach)aacg, aakx.a(amze2, 360));
        aahc.al((aach)aacg, ((aafz)g.c).U(amze2));
        if ((aozj.c & 0x2) != 0x0) {
            aahc.J((aach)aacg, aozj.e);
        }
        aahc.U((aach)aacg, i);
        aahc.F((aach)aacg, true);
        aahc.E((aach)aacg, false);
        aahc.D((aach)aacg, false);
        aahc.O((aach)aacg, ((oco)g.d).c());
        aahc.Q((aach)aacg, b.getCotn());
        aahc.R((aach)aacg, ((zxb)g.b).b);
        aahc.H((aach)aacg, ((zxb)g.b).c);
        aahc.y((aach)aacg, ((zxb)g.b).d);
        aahc.I((aach)aacg, ((zxb)g.b).e);
        final akeo f = ((arzb)g.a).f();
        amwj amwj;
        if ((amwj = f.g) == null) {
            amwj = amwj.a;
        }
        if (amwj.i) {
            amwj amwj2;
            if ((amwj2 = f.g) == null) {
                amwj2 = amwj.a;
            }
            aahc.K((aach)aacg, amwj2.j);
        }
        final anff b2 = aaec.b(a, b.e());
        if (b2 != null) {
            aaec.c(b2, (aach)aacg);
        }
        aahc.T((aach)aacg, 4);
        final vhe d2 = a.d();
        d2.e((vgv)b, aacg.f());
        d2.b().X();
        if (this.f.c().b()) {
            amze amze3;
            if ((amze3 = amze.b(aozj.d)) == null) {
                amze3 = amze.a;
            }
            ((aacd)this.c.a()).b(f(2, amze3, b.getCotn(), (aach)aacg));
        }
        this.b.f(s);
        return aadw.a;
    }
    
    public final aadw e(final znz znz, final String s, final amwo amwo) {
        final vfm a = this.a.a(znz);
        final aozo aozo = (aozo)a.g(s).j(aozo.class).af();
        if (aozo == null) {
            final aadv b = aadw.c.b();
            b.b = 26;
            return b.a();
        }
        final vhe d = a.d();
        final afgh c = aozo.c();
        for (int c2 = ((afjx)c).c, i = 0; i < c2; ++i) {
            final amyo c3 = c.get(i).c();
            c3.d();
            d.j((vgs)c3);
        }
        final aozj aozj = (aozj)((ahcu)amwo).rx((ahci)aozj.b);
        final aozm aozm = new aozm((ahct)((ahcz)aozo.b).toBuilder());
        aozm.g(aozk.b);
        aozm.d(g(aozj, this.h));
        final aozo b2 = aozm.b((vgx)a);
        final aacg aacg = new aacg((vgw)a.l(s).ac());
        final aaec g = this.g;
        aahc.F((aach)aacg, false);
        aahc.E((aach)aacg, true);
        aahc.O((aach)aacg, ((oco)g.d).c());
        aahc.Q((aach)aacg, b2.getCotn());
        final anff b3 = aaec.b(a, b2.e());
        if (b3 != null) {
            aaec.c(b3, (aach)aacg);
        }
        d.e((vgv)b2, aacg.f());
        d.b().X();
        if (this.f.c().b()) {
            ((aacd)this.c.a()).b(f(4, aakx.c(aahc.d((aach)aacg)), b2.getCotn(), (aach)aacg));
        }
        this.b.f(s);
        return aadw.a;
    }
}
