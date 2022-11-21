import java.util.List;
import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.nio.charset.Charset;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adqn extends adqs
{
    public static final Charset a;
    public final oco b;
    public final alff c;
    public final adms d;
    private final aqzy f;
    private final adnh g;
    private final Map h;
    private final adfa i;
    private final adgg k;
    private final adgg l;
    private final adme m;
    
    static {
        a = Charset.forName("UTF-8");
    }
    
    public adqn(final oco b, final arzb arzb, final alff c, final adms d, final adnk adnk, final adnm adnm, final adgg l, final adgg k, final adfa i, final adme m, final adnd adnd, final aheu aheu, final aheu aheu2, final adgg adgg, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        super(apki.g, b, arzb, l, adnd, aheu, aheu2, adgg, null, null, null, null, null);
        this.h = (Map)new ConcurrentHashMap();
        this.b = b;
        this.c = c;
        this.d = d;
        this.l = l;
        this.k = k;
        this.i = i;
        this.m = m;
        this.g = new adnh(new adnq[] { (adnq)adnk, (adnq)adnm });
        final arlz a = aqzy.a();
        a.a = 0L;
        this.f = a.a();
    }
    
    public final adnq a(final adoj adoj) {
        return (adnq)this.g;
    }
    
    public final adog b(final adoj adoj) {
        adog adog;
        if ((adog = adoj.N) == null) {
            adog = adog.a;
        }
        return adog;
    }
    
    public final ListenableFuture d(String l, final admj admj, final adoj adoj) {
        final String k = adoj.k;
        final String i = adoj.K;
        if ((adoj.c & 0x80) != 0x0) {
            l = adoj.L;
        }
        else {
            l = null;
        }
        Object y;
        if (adgg.u(adoj)) {
            y = new aqzh(adgg.q(adoj));
        }
        else {
            y = this.k.y(adoj, (adou)new adql(this, k, 0));
        }
        final aqzt aqzt = new aqzt(i, "PUT", (aqzj)null, (aqzg)y, (String)null, (aqzi)this.i.w().a, this.f, true);
        ((aqzv)aqzt).j((aqvr)new adqm(this, k), 65536, 500);
        this.m.D();
        final ListenableFuture f = afvh.f(((aqzv)aqzt).a(), (afvq)new xtd(this, l, 11), (Executor)afwd.a);
        afxr.v(f, new adrb(this, (aqzv)aqzt, k, 1), afwd.a);
        return f;
    }
    
    public final asme f() {
        return adqi.c;
    }
    
    public final String g() {
        return "ScottyTransferTask";
    }
    
    public final boolean i() {
        return true;
    }
    
    public final boolean j(final adoj adoj) {
        final int b = adoj.b;
        return (b & 0x40) != 0x0 && (adoj.c & 0x40) != 0x0 && (b & 0x2) != 0x0;
    }
    
    public final void s(final String s, final aqzv aqzv, final double n) {
        final aqzg c = aqzv.c();
        long a = 0L;
        long e;
        if (c != null) {
            e = c.e();
        }
        else {
            e = 0L;
        }
        if (c != null) {
            a = c.a();
        }
        if (a == -1L) {
            a = -1L;
        }
        this.h.put(s, e);
        this.d.f(s, e, a, n);
    }
    
    @Override
    public final admm w(final Throwable t, final adoj adoj, final boolean b) {
        if (adgg.u(adoj)) {
            final adgg l = this.l;
            adoh adoh;
            if ((adoh = adoh.a(adoj.l)) == null) {
                adoh = adoh.a;
            }
            l.E("ScottyTransferTask Fallback to Source", t, adoh);
            final adgg e = this.e;
            final apkh f = apkh.F;
            adog adog;
            if ((adog = adoj.N) == null) {
                adog = adog.a;
            }
            adog.getClass();
            return ((adrh)this).u(e.H(f, adog, this.c.e, this.l), b, adpl.c);
        }
        if (t instanceof admc) {
            final admc admc = (admc)t;
            if (admc.b) {
                final Long n = this.h.get(adoj.k);
                admm admm;
                if (n != null && n > adoj.M && !admc.c.isEmpty()) {
                    final ahcr builder = adog.a.createBuilder();
                    builder.copyOnWrite();
                    final adog adog2 = (adog)builder.instance;
                    adog2.c = 2;
                    adog2.b |= 0x1;
                    final long c = this.b.c();
                    final long longValue = admc.c.get(0);
                    builder.copyOnWrite();
                    final adog adog3 = (adog)builder.instance;
                    adog3.b |= 0x8;
                    adog3.f = c + longValue;
                    builder.copyOnWrite();
                    final adog adog4 = (adog)builder.instance;
                    adog4.b |= 0x4;
                    adog4.e = 1;
                    final apkh a = admc.a;
                    builder.copyOnWrite();
                    final adog adog5 = (adog)builder.instance;
                    adog5.d = a.aD;
                    adog5.b |= 0x2;
                    admm = ((adrh)this).u(builder.build(), b, (asmi)new adrr(n, 1));
                }
                else {
                    admm = ((adrh)this).t(this.n(adoj, admc), b);
                }
                return admm;
            }
        }
        return super.w(t, adoj, b);
    }
}
