import java.util.concurrent.atomic.AtomicReference;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class asht implements ashw
{
    public static asht I() {
        final asht a = aszl.a;
        final asjr l = atqx.l;
        return a;
    }
    
    public static asht J(final Throwable t) {
        askk.b((Object)t, "exception is null");
        final Callable h = askj.h((Object)t);
        askk.b((Object)h, "errorSupplier is null");
        final aszm aszm = new aszm(h);
        final asjr l = atqx.l;
        return (asht)aszm;
    }
    
    public static asht S(final Object... array) {
        final atag atag = new atag(array);
        final asjr l = atqx.l;
        return (asht)atag;
    }
    
    public static asht T(final Callable callable) {
        askk.b((Object)callable, "supplier is null");
        final atah atah = new atah(callable);
        final asjr l = atqx.l;
        return (asht)atah;
    }
    
    public static asht U(final Iterable iterable) {
        askk.b((Object)iterable, "source is null");
        final atak atak = new atak(iterable);
        final asjr l = atqx.l;
        return (asht)atak;
    }
    
    public static asht W(final long n, final long n2, final TimeUnit timeUnit, final asid asid) {
        askk.b((Object)timeUnit, "unit is null");
        askk.b((Object)asid, "scheduler is null");
        final atax atax = new atax(Math.max(0L, n), Math.max(0L, n2), timeUnit, asid);
        final asjr l = atqx.l;
        return (asht)atax;
    }
    
    public static asht X(final Object o) {
        askk.b(o, "item is null");
        final atay atay = new atay(o);
        final asjr l = atqx.l;
        return (asht)atay;
    }
    
    public static asht Y(final Object o, final Object o2) {
        askk.b(o, "item1 is null");
        askk.b(o2, "item2 is null");
        return S(o, o2);
    }
    
    private final asht a(final asjm asjm, final asjg asjg) {
        askk.b((Object)asjm, "onNext is null");
        askk.b((Object)asjg, "onComplete is null");
        final asze asze = new asze((ashw)this, asjm, asjg);
        final asjr l = atqx.l;
        return (asht)asze;
    }
    
    public static asht aa(final Iterable iterable) {
        return U(iterable).L(askj.a);
    }
    
    public static asht ab(final ashw ashw, final ashw ashw2) {
        askk.b((Object)ashw2, "source2 is null");
        return S(ashw, ashw2).N(askj.a, false, 2);
    }
    
    public static asht ac(final Iterable iterable) {
        return U(iterable).M(askj.a, true);
    }
    
    public static asht ad(final ashw ashw, final ashw ashw2) {
        return S(ashw, ashw2).N(askj.a, true, 2);
    }
    
    public static asht av(final long n, final TimeUnit timeUnit) {
        return aw(n, timeUnit, atjj.a());
    }
    
    public static asht aw(final long n, final TimeUnit timeUnit, final asid asid) {
        askk.b((Object)timeUnit, "unit is null");
        askk.b((Object)asid, "scheduler is null");
        final atdk atdk = new atdk(Math.max(n, 0L), timeUnit, asid);
        final asjr l = atqx.l;
        return (asht)atdk;
    }
    
    public static asht m(final Iterable iterable, asjr l) {
        final int a = ashi.a;
        askk.b((Object)l, "combiner is null");
        askk.c(a, "bufferSize");
        final asyj asyj = new asyj((ashw[])null, iterable, l, a + a);
        l = atqx.l;
        return (asht)asyj;
    }
    
    public static asht n(final ashw ashw, final ashw ashw2, final asji asji) {
        askk.b((Object)ashw, "source1 is null");
        askk.b((Object)ashw2, "source2 is null");
        return o(new ashw[] { ashw, ashw2 }, askj.c(asji), ashi.a);
    }
    
    public static asht o(final ashw[] array, asjr l, final int n) {
        askk.b((Object)l, "combiner is null");
        askk.c(n, "bufferSize");
        final asyj asyj = new asyj(array, (Iterable)null, l, n + n);
        l = atqx.l;
        return (asht)asyj;
    }
    
    public static asht p(final ashw ashw, final ashw ashw2, final ashw ashw3, final asjn asjn) {
        askk.b((Object)ashw3, "source3 is null");
        return o(new ashw[] { ashw, ashw2, ashw3 }, askj.d(asjn), ashi.a);
    }
    
    public static asht r(final ashw... array) {
        final asym asym = new asym((ashw)S((Object[])array), askj.a, ashi.a);
        final asjr l = atqx.l;
        return (asht)asym;
    }
    
    public static asht w(final ashv ashv) {
        askk.b((Object)ashv, "source is null");
        final asyr asyr = new asyr(ashv);
        final asjr l = atqx.l;
        return (asht)asyr;
    }
    
    public static asht y(final Callable callable) {
        askk.b((Object)callable, "supplier is null");
        final asyv asyv = new asyv(callable);
        final asjr l = atqx.l;
        return (asht)asyv;
    }
    
    public final asht A() {
        final aszb aszb = new aszb((ashw)this, askk.a);
        final asjr l = atqx.l;
        return (asht)aszb;
    }
    
    public final asht B(final asjj asjj) {
        askk.b((Object)asjj, "comparer is null");
        final aszb aszb = new aszb((ashw)this, asjj);
        final asjr l = atqx.l;
        return (asht)aszb;
    }
    
    public final asht C(final asjg asjg) {
        askk.b((Object)asjg, "onFinally is null");
        final aszd aszd = new aszd((ashw)this, asjg);
        final asjr l = atqx.l;
        return (asht)aszd;
    }
    
    public final asht D(final asjg asjg) {
        return this.a(askj.d, asjg);
    }
    
    public final asht E(final asjg asjg) {
        return this.F(askj.d, asjg);
    }
    
    public final asht F(final asjm asjm, final asjg asjg) {
        askk.b((Object)asjm, "onSubscribe is null");
        askk.b((Object)asjg, "onDispose is null");
        final aszf aszf = new aszf(this, asjm, asjg);
        final asjr l = atqx.l;
        return (asht)aszf;
    }
    
    public final asht G(final asjm asjm) {
        return this.a(asjm, askj.c);
    }
    
    public final asht H(final asjm asjm) {
        return this.F(asjm, askj.c);
    }
    
    public final asht K(final asjs asjs) {
        askk.b((Object)asjs, "predicate is null");
        final aszo aszo = new aszo((ashw)this, asjs);
        final asjr l = atqx.l;
        return (asht)aszo;
    }
    
    public final asht L(final asjr asjr) {
        return this.M(asjr, false);
    }
    
    public final asht M(final asjr asjr, final boolean b) {
        return this.N(asjr, b, Integer.MAX_VALUE);
    }
    
    public final asht N(final asjr asjr, final boolean b, final int n) {
        return this.O(asjr, b, n, ashi.a);
    }
    
    public final asht O(asjr l, final boolean b, final int n, final int n2) {
        askk.b((Object)l, "mapper is null");
        askk.c(n, "maxConcurrency");
        askk.c(n2, "bufferSize");
        if (!(this instanceof askr)) {
            final aszr aszr = new aszr((ashw)this, l, b, n, n2);
            l = atqx.l;
            return (asht)aszr;
        }
        final Object call = ((askr)this).call();
        if (call == null) {
            return I();
        }
        return aryv.f(call, l);
    }
    
    public final asht P(asjr l) {
        askk.b((Object)l, "mapper is null");
        final atae atae = new atae((ashw)this, l);
        l = atqx.l;
        return (asht)atae;
    }
    
    public final asht Q(final asjr asjr) {
        askk.b((Object)asjr, "mapper is null");
        final ataa ataa = new ataa((ashw)this, asjr);
        final asjr l = atqx.l;
        return (asht)ataa;
    }
    
    public final asht R(asjr l) {
        askk.b((Object)l, "mapper is null");
        final atad atad = new atad((ashw)this, l);
        l = atqx.l;
        return (asht)atad;
    }
    
    public final asht V() {
        final atas atas = new atas((ashw)this);
        final asjr l = atqx.l;
        return (asht)atas;
    }
    
    public final asht Z(final asjr asjr) {
        askk.b((Object)asjr, "mapper is null");
        final atbd atbd = new atbd((ashw)this, asjr);
        final asjr l = atqx.l;
        return (asht)atbd;
    }
    
    public final asie aA(final Callable callable, final asjh asjh) {
        askk.b((Object)callable, "initialValueSupplier is null");
        askk.b((Object)asjh, "collector is null");
        final asyg asyg = new asyg((ashw)this, callable, asjh);
        final asjr o = atqx.o;
        return (asie)asyg;
    }
    
    public final asie aB(final Object o, final asjh asjh) {
        askk.b(o, "initialValue is null");
        return this.aA(askj.h(o), asjh);
    }
    
    public final asie aC(final Object o) {
        askk.b(o, "defaultItem is null");
        final aszk aszk = new aszk((ashw)this, o, 0);
        final asjr o2 = atqx.o;
        return (asie)aszk;
    }
    
    public final asie aD() {
        final aszk aszk = new aszk((ashw)this, (Object)null, 0);
        final asjr o = atqx.o;
        return (asie)aszk;
    }
    
    public final asie aE(final Object o) {
        final atcm atcm = new atcm((ashw)this, o);
        final asjr o2 = atqx.o;
        return (asie)atcm;
    }
    
    public final asie aF() {
        askk.c(16, "capacityHint");
        final atdn atdn = new atdn((ashw)this);
        final asjr o = atqx.o;
        return (asie)atdn;
    }
    
    public final asir aG() {
        final asjm d = askj.d;
        return this.aK(d, askj.e, askj.c, d);
    }
    
    public final asir aH(final asjm asjm) {
        return this.aK(asjm, askj.e, askj.c, askj.d);
    }
    
    public final asir aI(final asjm asjm, final asjm asjm2) {
        return this.aK(asjm, asjm2, askj.c, askj.d);
    }
    
    public final asir aJ(final asjm asjm, final asjm asjm2, final asjg asjg) {
        return this.aK(asjm, asjm2, asjg, askj.d);
    }
    
    public final asir aK(final asjm asjm, final asjm asjm2, final asjg asjg, final asjm asjm3) {
        askk.b((Object)asjm, "onNext is null");
        askk.b((Object)asjm2, "onError is null");
        askk.b((Object)asjg, "onComplete is null");
        final aslh aslh = new aslh(asjm, asjm2, asjg);
        this.aP((ashy)aslh);
        return (asir)aslh;
    }
    
    public final Iterable aL() {
        final int a = ashi.a;
        askk.c(a, "bufferSize");
        return (Iterable)new asxs((ashw)this, a);
    }
    
    public final Object aM() {
        final askx askx = new askx();
        this.aP((ashy)askx);
        final Object f = askx.f();
        if (f != null) {
            return f;
        }
        throw new NoSuchElementException();
    }
    
    public final Object aN(final Object o) {
        final askx askx = new askx();
        this.aP((ashy)askx);
        final Object f = askx.f();
        if (f != null) {
            return f;
        }
        return o;
    }
    
    public final Object aO(final asjr asjr) {
        try {
            askk.b((Object)asjr, "converter is null");
            return asjr.a((Object)this);
        }
        finally {
            final Throwable t;
            asgz.c(t);
            throw atih.b(t);
        }
    }
    
    @Override
    public final void aP(final ashy ashy) {
        askk.b((Object)ashy, "observer is null");
        try {
            final asji t = atqx.t;
            askk.b((Object)ashy, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            this.f(ashy);
        }
        catch (final NullPointerException ex) {
            throw ex;
        }
        finally {
            final Throwable t2;
            asgz.c(t2);
            atqx.j(t2);
            final NullPointerException ex2 = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            ex2.initCause(t2);
            throw ex2;
        }
    }
    
    public final asht aQ() {
        final atic a = atic.a;
        askk.c(2, "count");
        askk.c(1, "skip");
        askk.b((Object)a, "bufferSupplier is null");
        final asya asya = new asya((ashw)this, (Callable)a);
        final asjr l = atqx.l;
        return (asht)asya;
    }
    
    public final asht aR(final asjr asjr) {
        return this.s(asjr, Integer.MAX_VALUE, ashi.a, true);
    }
    
    public final asht aS(final long n, final TimeUnit timeUnit, final asid asid) {
        askk.b((Object)timeUnit, "unit is null");
        askk.b((Object)asid, "scheduler is null");
        final asyx asyx = new asyx((ashw)this, n, timeUnit, asid);
        final asjr l = atqx.l;
        return (asht)asyx;
    }
    
    public final asht aT(final asid asid) {
        return this.ag(asid, true, ashi.a);
    }
    
    public final atin aU() {
        askk.c(1, "bufferSize");
        return atcg.b((ashw)this, (atbx)new atce(1));
    }
    
    public final asht aV(final TimeUnit timeUnit) {
        final asid a = atjj.a();
        askk.b((Object)timeUnit, "unit is null");
        askk.b((Object)a, "scheduler is null");
        final atdc atdc = new atdc((ashw)this, timeUnit, a);
        final asjr l = atqx.l;
        return (asht)atdc;
    }
    
    public final asht ae(final ashw ashw) {
        askk.b((Object)ashw, "other is null");
        return ab(this, ashw);
    }
    
    public final asht af(final asid asid) {
        return this.ag(asid, false, ashi.a);
    }
    
    public final asht ag(final asid asid, final boolean b, final int n) {
        askk.b((Object)asid, "scheduler is null");
        askk.c(n, "bufferSize");
        final atbg atbg = new atbg((ashw)this, asid, b, n);
        final asjr l = atqx.l;
        return (asht)atbg;
    }
    
    public final asht ah(final asjr asjr) {
        askk.b((Object)asjr, "valueSupplier is null");
        final atbi atbi = new atbi((ashw)this, asjr);
        final asjr l = atqx.l;
        return (asht)atbi;
    }
    
    public final asht ai(final Object o) {
        return this.ah(askj.b(o));
    }
    
    public final asht aj(final Object o, final asji asji) {
        askk.b(o, "initialValue is null");
        final Callable h = askj.h(o);
        askk.b((Object)asji, "accumulator is null");
        final atcj atcj = new atcj((ashw)this, h, asji);
        final asjr l = atqx.l;
        return (asht)atcj;
    }
    
    public final asht ak() {
        final atck atck = new atck(this);
        final asjr l = atqx.l;
        return (asht)atck;
    }
    
    public final asht al() {
        final AtomicReference atomicReference = new AtomicReference();
        final atbm atbm = new atbm((ashw)new atbl(atomicReference), (ashw)this, atomicReference);
        final asjr m = atqx.m;
        return ((atin)atbm).aX();
    }
    
    public final asht am(final long n) {
        if (n <= 0L) {
            final asjr l = atqx.l;
            return this;
        }
        final atco atco = new atco((ashw)this);
        final asjr i = atqx.l;
        return (asht)atco;
    }
    
    public final asht an(final ashw ashw) {
        return r(ashw, this);
    }
    
    public final asht ao(final Object o) {
        askk.b(o, "item is null");
        return r(X(o), this);
    }
    
    public final asht ap(final asid asid) {
        askk.b((Object)asid, "scheduler is null");
        final atcq atcq = new atcq((ashw)this, asid);
        final asjr l = atqx.l;
        return (asht)atcq;
    }
    
    public final asht aq(final asjr asjr) {
        final int a = ashi.a;
        askk.b((Object)asjr, "mapper is null");
        askk.c(a, "bufferSize");
        Object o;
        if (this instanceof askr) {
            final Object call = ((askr)this).call();
            if (call == null) {
                o = I();
            }
            else {
                o = aryv.f(call, asjr);
            }
        }
        else {
            o = new atct((ashw)this, asjr, a);
            final asjr l = atqx.l;
        }
        return (asht)o;
    }
    
    public final asht ar(final long n) {
        final atcv atcv = new atcv((ashw)this, n);
        final asjr l = atqx.l;
        return (asht)atcv;
    }
    
    public final asht as(final asjs asjs) {
        askk.b((Object)asjs, "stopPredicate is null");
        final atda atda = new atda((ashw)this, asjs);
        final asjr l = atqx.l;
        return (asht)atda;
    }
    
    public final asht at(final long n, final TimeUnit timeUnit, final asid asid, final boolean b) {
        askk.b((Object)timeUnit, "unit is null");
        askk.b((Object)asid, "scheduler is null");
        final atde atde = new atde(this, n, timeUnit, asid, b);
        final asjr l = atqx.l;
        return (asht)atde;
    }
    
    public final asht au(final long n, final TimeUnit timeUnit, final ashw ashw, final asid asid) {
        askk.b((Object)timeUnit, "timeUnit is null");
        askk.b((Object)asid, "scheduler is null");
        final atdi atdi = new atdi(this, n, timeUnit, asid, ashw);
        final asjr l = atqx.l;
        return (asht)atdi;
    }
    
    public final asht ax(final ashw ashw) {
        final int a = ashi.a;
        askk.c(a, "bufferSize");
        final atdq atdq = new atdq((ashw)this, ashw, a);
        final asjr l = atqx.l;
        return (asht)atdq;
    }
    
    public final asht ay(final ashw ashw, final asji asji) {
        askk.b((Object)ashw, "other is null");
        askk.b((Object)asji, "combiner is null");
        final atdt atdt = new atdt((ashw)this, asji, ashw);
        final asjr l = atqx.l;
        return (asht)atdt;
    }
    
    public final asht az(final ashw ashw, final asji asji) {
        final asjr c = askj.c(asji);
        final int a = ashi.a;
        askk.c(a, "bufferSize");
        final atdw atdw = new atdw(new ashw[] { this, ashw }, c, a);
        final asjr l = atqx.l;
        return (asht)atdw;
    }
    
    protected abstract void f(final ashy p0);
    
    public final ashc g(asjr p) {
        askk.b((Object)p, "mapper is null");
        final aszx aszx = new aszx((ashw)this, p);
        p = atqx.p;
        return (ashc)aszx;
    }
    
    public final ashc h() {
        final atav atav = new atav((ashw)this);
        final asjr p = atqx.p;
        return (ashc)atav;
    }
    
    public final ashi i(final ashb ashb) {
        final asqh asqh = new asqh(this);
        final ashb a = ashb.a;
        final int ordinal = ashb.ordinal();
        if (ordinal != 0) {
            Object o;
            if (ordinal != 1) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        return ((ashi)asqh).Q();
                    }
                    return ((ashi)asqh).R();
                }
                else {
                    o = new asrh((ashi)asqh);
                }
            }
            else {
                o = new asrj((ashi)asqh);
            }
            final asjr j = atqx.j;
            return (ashi)o;
        }
        return (ashi)asqh;
    }
    
    public final ashn j() {
        final aszi aszi = new aszi((ashw)this);
        final asjr n = atqx.n;
        return (ashn)aszi;
    }
    
    public final asht k() {
        askk.c(16, "initialCapacity");
        final asyd asyd = new asyd(this);
        final asjr l = atqx.l;
        return (asht)asyd;
    }
    
    public final asht l(final Class clazz) {
        return this.Z(askj.a(clazz));
    }
    
    public final asht q(final ashx ashx) {
        askk.b((Object)ashx, "composer is null");
        final ashw a = ashx.a(this);
        final asjr l = atqx.l;
        return (asht)a;
    }
    
    public final asht s(final asjr asjr, final int n, final int n2, final boolean b) {
        askk.b((Object)asjr, "mapper is null");
        askk.c(n, "maxConcurrency");
        askk.c(n2, "prefetch");
        int n3;
        if (!b) {
            n3 = 2;
        }
        else {
            n3 = 3;
        }
        final asyo asyo = new asyo((ashw)this, asjr, n3, n, n2);
        final asjr l = atqx.l;
        return (asht)asyo;
    }
    
    public final asht t(asjr l) {
        askk.b((Object)l, "mapper is null");
        final atae atae = new atae((ashw)this, l);
        l = atqx.l;
        return (asht)atae;
    }
    
    public final asht u(asjr l) {
        askk.b((Object)l, "mapper is null");
        askk.c(2, "prefetch");
        final asxh asxh = new asxh(this, l);
        l = atqx.l;
        return (asht)asxh;
    }
    
    public final asht v(final ashw ashw) {
        askk.b((Object)ashw, "other is null");
        askk.b((Object)ashw, "source2 is null");
        return r(this, ashw);
    }
    
    public final asht x(final long n, final TimeUnit timeUnit) {
        final asid a = atjj.a();
        askk.b((Object)timeUnit, "unit is null");
        askk.b((Object)a, "scheduler is null");
        final asyu asyu = new asyu((ashw)this, n, timeUnit, a);
        final asjr l = atqx.l;
        return (asht)asyu;
    }
    
    public final asht z(final long n, final TimeUnit timeUnit) {
        return this.aS(n, timeUnit, atjj.a());
    }
}
