import java.util.concurrent.atomic.AtomicReference;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class askp implements asks
{
    public static askp I() {
        final askp a = atch.a;
        final asmn l = aqvq.l;
        return a;
    }
    
    public static askp J(final Throwable t) {
        asng.b(t, "exception is null");
        final Callable h = asnf.h(t);
        asng.b(h, "errorSupplier is null");
        final atci atci = new atci(h);
        final asmn l = aqvq.l;
        return (askp)atci;
    }
    
    public static askp S(final Object... array) {
        final atdc atdc = new atdc(array);
        final asmn l = aqvq.l;
        return (askp)atdc;
    }
    
    public static askp T(final Callable callable) {
        asng.b(callable, "supplier is null");
        final atdd atdd = new atdd(callable);
        final asmn l = aqvq.l;
        return (askp)atdd;
    }
    
    public static askp U(final Iterable iterable) {
        asng.b(iterable, "source is null");
        final atdg atdg = new atdg(iterable);
        final asmn l = aqvq.l;
        return (askp)atdg;
    }
    
    public static askp W(final long n, final long n2, final TimeUnit timeUnit, final askz askz) {
        asng.b(timeUnit, "unit is null");
        asng.b(askz, "scheduler is null");
        final atdt atdt = new atdt(Math.max(0L, n), Math.max(0L, n2), timeUnit, askz);
        final asmn l = aqvq.l;
        return (askp)atdt;
    }
    
    public static askp X(final Object o) {
        asng.b(o, "item is null");
        final atdu atdu = new atdu(o);
        final asmn l = aqvq.l;
        return (askp)atdu;
    }
    
    public static askp Y(final Object o, final Object o2) {
        asng.b(o, "item1 is null");
        asng.b(o2, "item2 is null");
        return S(o, o2);
    }
    
    private final askp a(final asmi asmi, final asmc asmc) {
        asng.b(asmi, "onNext is null");
        asng.b(asmc, "onComplete is null");
        final atca atca = new atca((asks)this, asmi, asmc);
        final asmn l = aqvq.l;
        return (askp)atca;
    }
    
    public static askp aa(final Iterable iterable) {
        return U(iterable).L(asnf.a);
    }
    
    public static askp ab(final asks asks, final asks asks2) {
        asng.b(asks2, "source2 is null");
        return S(asks, asks2).N(asnf.a, false, 2);
    }
    
    public static askp ac(final Iterable iterable) {
        return U(iterable).M(asnf.a, true);
    }
    
    public static askp ad(final asks asks, final asks asks2) {
        return S(asks, asks2).N(asnf.a, true, 2);
    }
    
    public static askp av(final long n, final TimeUnit timeUnit) {
        return aw(n, timeUnit, atmg.a());
    }
    
    public static askp aw(final long n, final TimeUnit timeUnit, final askz askz) {
        asng.b(timeUnit, "unit is null");
        asng.b(askz, "scheduler is null");
        final atgh atgh = new atgh(Math.max(n, 0L), timeUnit, askz);
        final asmn l = aqvq.l;
        return (askp)atgh;
    }
    
    public static askp m(final Iterable iterable, asmn l) {
        final int a = aske.a;
        asng.b(l, "combiner is null");
        asng.c(a, "bufferSize");
        final atbf atbf = new atbf((asks[])null, iterable, l, a + a);
        l = aqvq.l;
        return (askp)atbf;
    }
    
    public static askp n(final asks asks, final asks asks2, final asme asme) {
        asng.b(asks, "source1 is null");
        asng.b(asks2, "source2 is null");
        return o(new asks[] { asks, asks2 }, asnf.c(asme), aske.a);
    }
    
    public static askp o(final asks[] array, final asmn asmn, final int n) {
        asng.b(asmn, "combiner is null");
        asng.c(n, "bufferSize");
        final atbf atbf = new atbf(array, (Iterable)null, asmn, n + n);
        final asmn l = aqvq.l;
        return (askp)atbf;
    }
    
    public static askp p(final asks asks, final asks asks2, final asks asks3, final asmj asmj) {
        asng.b(asks3, "source3 is null");
        return o(new asks[] { asks, asks2, asks3 }, asnf.d(asmj), aske.a);
    }
    
    public static askp r(final asks... array) {
        final atbi atbi = new atbi((asks)S((Object[])array), asnf.a, aske.a);
        final asmn l = aqvq.l;
        return (askp)atbi;
    }
    
    public static askp w(final askr askr) {
        asng.b(askr, "source is null");
        final atbn atbn = new atbn(askr);
        final asmn l = aqvq.l;
        return (askp)atbn;
    }
    
    public static askp y(final Callable callable) {
        asng.b(callable, "supplier is null");
        final atbr atbr = new atbr(callable);
        final asmn l = aqvq.l;
        return (askp)atbr;
    }
    
    public final askp A() {
        final atbx atbx = new atbx((asks)this, asng.a);
        final asmn l = aqvq.l;
        return (askp)atbx;
    }
    
    public final askp B(final asmf asmf) {
        asng.b(asmf, "comparer is null");
        final atbx atbx = new atbx((asks)this, asmf);
        final asmn l = aqvq.l;
        return (askp)atbx;
    }
    
    public final askp C(final asmc asmc) {
        asng.b(asmc, "onFinally is null");
        final atbz atbz = new atbz((asks)this, asmc);
        final asmn l = aqvq.l;
        return (askp)atbz;
    }
    
    public final askp D(final asmc asmc) {
        return this.a(asnf.d, asmc);
    }
    
    public final askp E(final asmc asmc) {
        return this.F(asnf.d, asmc);
    }
    
    public final askp F(final asmi asmi, final asmc asmc) {
        asng.b(asmi, "onSubscribe is null");
        asng.b(asmc, "onDispose is null");
        final atcb atcb = new atcb(this, asmi, asmc);
        final asmn l = aqvq.l;
        return (askp)atcb;
    }
    
    public final askp G(final asmi asmi) {
        return this.a(asmi, asnf.c);
    }
    
    public final askp H(final asmi asmi) {
        return this.F(asmi, asnf.c);
    }
    
    public final askp K(final asmo asmo) {
        asng.b(asmo, "predicate is null");
        final atck atck = new atck((asks)this, asmo);
        final asmn l = aqvq.l;
        return (askp)atck;
    }
    
    public final askp L(final asmn asmn) {
        return this.M(asmn, false);
    }
    
    public final askp M(final asmn asmn, final boolean b) {
        return this.N(asmn, b, Integer.MAX_VALUE);
    }
    
    public final askp N(final asmn asmn, final boolean b, final int n) {
        return this.O(asmn, b, n, aske.a);
    }
    
    public final askp O(asmn l, final boolean b, final int n, final int n2) {
        asng.b(l, "mapper is null");
        asng.c(n, "maxConcurrency");
        asng.c(n2, "bufferSize");
        if (!(this instanceof asnn)) {
            final atcn atcn = new atcn((asks)this, l, b, n, n2);
            l = aqvq.l;
            return (askp)atcn;
        }
        final Object call = ((asnn)this).call();
        if (call == null) {
            return I();
        }
        return asbq.f(call, l);
    }
    
    public final askp P(asmn l) {
        asng.b(l, "mapper is null");
        final atda atda = new atda((asks)this, l);
        l = aqvq.l;
        return (askp)atda;
    }
    
    public final askp Q(asmn l) {
        asng.b(l, "mapper is null");
        final atcw atcw = new atcw((asks)this, l);
        l = aqvq.l;
        return (askp)atcw;
    }
    
    public final askp R(asmn l) {
        asng.b(l, "mapper is null");
        final atcz atcz = new atcz((asks)this, l);
        l = aqvq.l;
        return (askp)atcz;
    }
    
    public final askp V() {
        final atdo atdo = new atdo((asks)this);
        final asmn l = aqvq.l;
        return (askp)atdo;
    }
    
    public final askp Z(asmn l) {
        asng.b(l, "mapper is null");
        final atdz atdz = new atdz((asks)this, l);
        l = aqvq.l;
        return (askp)atdz;
    }
    
    public final asla aA(final Callable callable, final asmd asmd) {
        asng.b(callable, "initialValueSupplier is null");
        asng.b(asmd, "collector is null");
        final atbc atbc = new atbc((asks)this, callable, asmd);
        final asmn o = aqvq.o;
        return (asla)atbc;
    }
    
    public final asla aB(final Object o, final asmd asmd) {
        asng.b(o, "initialValue is null");
        return this.aA(asnf.h(o), asmd);
    }
    
    public final asla aC(final Object o) {
        asng.b(o, "defaultItem is null");
        final atcg atcg = new atcg((asks)this, o, 0);
        final asmn o2 = aqvq.o;
        return (asla)atcg;
    }
    
    public final asla aD() {
        final atcg atcg = new atcg((asks)this, (Object)null, 0);
        final asmn o = aqvq.o;
        return (asla)atcg;
    }
    
    public final asla aE(final Object o) {
        final atfi atfi = new atfi((asks)this, o);
        final asmn o2 = aqvq.o;
        return (asla)atfi;
    }
    
    public final asla aF() {
        asng.c(16, "capacityHint");
        final atgk atgk = new atgk((asks)this);
        final asmn o = aqvq.o;
        return (asla)atgk;
    }
    
    public final asln aG() {
        final asmi d = asnf.d;
        return this.aK(d, asnf.e, asnf.c, d);
    }
    
    public final asln aH(final asmi asmi) {
        return this.aK(asmi, asnf.e, asnf.c, asnf.d);
    }
    
    public final asln aI(final asmi asmi, final asmi asmi2) {
        return this.aK(asmi, asmi2, asnf.c, asnf.d);
    }
    
    public final asln aJ(final asmi asmi, final asmi asmi2, final asmc asmc) {
        return this.aK(asmi, asmi2, asmc, asnf.d);
    }
    
    public final asln aK(final asmi asmi, final asmi asmi2, final asmc asmc, final asmi asmi3) {
        asng.b(asmi, "onNext is null");
        asng.b(asmi2, "onError is null");
        asng.b(asmc, "onComplete is null");
        final asod asod = new asod(asmi, asmi2, asmc);
        this.aP(asod);
        return asod;
    }
    
    public final Iterable aL() {
        final int a = aske.a;
        asng.c(a, "bufferSize");
        return new atao(this, a);
    }
    
    public final Object aM() {
        final asnt asnt = new asnt();
        this.aP(asnt);
        final Object f = asnt.f();
        if (f != null) {
            return f;
        }
        throw new NoSuchElementException();
    }
    
    public final Object aN(final Object o) {
        final asnt asnt = new asnt();
        this.aP(asnt);
        final Object f = asnt.f();
        if (f != null) {
            return f;
        }
        return o;
    }
    
    public final Object aO(final asmn asmn) {
        try {
            asng.b(asmn, "converter is null");
            return asmn.a(this);
        }
        finally {
            final Throwable t;
            asjv.a(t);
            throw atle.b(t);
        }
    }
    
    @Override
    public final void aP(final asku asku) {
        asng.b(asku, "observer is null");
        try {
            final asme t = aqvq.t;
            asng.b(asku, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            this.f(asku);
        }
        catch (final NullPointerException ex) {
            throw ex;
        }
        finally {
            final Throwable t2;
            asjv.a(t2);
            aqvq.w(t2);
            final NullPointerException ex2 = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            ex2.initCause(t2);
            throw ex2;
        }
    }
    
    public final askp aQ() {
        final atkz a = atkz.a;
        asng.c(2, "count");
        asng.c(1, "skip");
        asng.b(a, "bufferSupplier is null");
        final ataw ataw = new ataw((asks)this, (Callable)a);
        final asmn l = aqvq.l;
        return (askp)ataw;
    }
    
    public final askp aR(final asmn asmn) {
        return this.s(asmn, Integer.MAX_VALUE, aske.a, true);
    }
    
    public final askp aS(final long n, final TimeUnit timeUnit, final askz askz) {
        asng.b(timeUnit, "unit is null");
        asng.b(askz, "scheduler is null");
        final atbt atbt = new atbt((asks)this, n, timeUnit, askz);
        final asmn l = aqvq.l;
        return (askp)atbt;
    }
    
    public final askp aT(final askz askz) {
        return this.ag(askz, true, aske.a);
    }
    
    public final atlk aU() {
        asng.c(1, "bufferSize");
        return atfc.b((asks)this, (atet)new atfa(1));
    }
    
    public final askp aV(final TimeUnit timeUnit) {
        final askz a = atmg.a();
        asng.b(timeUnit, "unit is null");
        asng.b(a, "scheduler is null");
        final atfz atfz = new atfz((asks)this, timeUnit, a);
        final asmn l = aqvq.l;
        return (askp)atfz;
    }
    
    public final askp ae(final asks asks) {
        asng.b(asks, "other is null");
        return ab(this, asks);
    }
    
    public final askp af(final askz askz) {
        return this.ag(askz, false, aske.a);
    }
    
    public final askp ag(final askz askz, final boolean b, final int n) {
        asng.b(askz, "scheduler is null");
        asng.c(n, "bufferSize");
        final atec atec = new atec((asks)this, askz, b, n);
        final asmn l = aqvq.l;
        return (askp)atec;
    }
    
    public final askp ah(final asmn asmn) {
        asng.b(asmn, "valueSupplier is null");
        final atee atee = new atee((asks)this, asmn);
        final asmn l = aqvq.l;
        return (askp)atee;
    }
    
    public final askp ai(final Object o) {
        return this.ah(asnf.b(o));
    }
    
    public final askp aj(final Object o, final asme asme) {
        asng.b(o, "initialValue is null");
        final Callable h = asnf.h(o);
        asng.b(asme, "accumulator is null");
        final atff atff = new atff((asks)this, h, asme);
        final asmn l = aqvq.l;
        return (askp)atff;
    }
    
    public final askp ak() {
        final atfg atfg = new atfg(this);
        final asmn l = aqvq.l;
        return (askp)atfg;
    }
    
    public final askp al() {
        final AtomicReference atomicReference = new AtomicReference();
        final atei atei = new atei((asks)new ateh(atomicReference), (asks)this, atomicReference);
        final asmn m = aqvq.m;
        return ((atlk)atei).aX();
    }
    
    public final askp am(final long n) {
        if (n <= 0L) {
            final asmn l = aqvq.l;
            return this;
        }
        final atfk atfk = new atfk((asks)this);
        final asmn i = aqvq.l;
        return (askp)atfk;
    }
    
    public final askp an(final asks asks) {
        return r(asks, this);
    }
    
    public final askp ao(final Object o) {
        asng.b(o, "item is null");
        return r(X(o), this);
    }
    
    public final askp ap(final askz askz) {
        asng.b(askz, "scheduler is null");
        final atfm atfm = new atfm((asks)this, askz);
        final asmn l = aqvq.l;
        return (askp)atfm;
    }
    
    public final askp aq(final asmn asmn) {
        final int a = aske.a;
        asng.b(asmn, "mapper is null");
        asng.c(a, "bufferSize");
        Object o;
        if (this instanceof asnn) {
            final Object call = ((asnn)this).call();
            if (call == null) {
                o = I();
            }
            else {
                o = asbq.f(call, asmn);
            }
        }
        else {
            o = new atfp((asks)this, asmn, a);
            final asmn l = aqvq.l;
        }
        return (askp)o;
    }
    
    public final askp ar(final long n) {
        final atfr atfr = new atfr((asks)this, n);
        final asmn l = aqvq.l;
        return (askp)atfr;
    }
    
    public final askp as(final asmo asmo) {
        asng.b(asmo, "stopPredicate is null");
        final atfv atfv = new atfv((asks)this, asmo);
        final asmn l = aqvq.l;
        return (askp)atfv;
    }
    
    public final askp at(final long n, final TimeUnit timeUnit, final askz askz, final boolean b) {
        asng.b(timeUnit, "unit is null");
        asng.b(askz, "scheduler is null");
        final atgb atgb = new atgb(this, n, timeUnit, askz, b);
        final asmn l = aqvq.l;
        return (askp)atgb;
    }
    
    public final askp au(final long n, final TimeUnit timeUnit, final asks asks, final askz askz) {
        asng.b(timeUnit, "timeUnit is null");
        asng.b(askz, "scheduler is null");
        final atgf atgf = new atgf(this, n, timeUnit, askz, asks);
        final asmn l = aqvq.l;
        return (askp)atgf;
    }
    
    public final askp ax(final asks asks) {
        final int a = aske.a;
        asng.c(a, "bufferSize");
        final atgn atgn = new atgn((asks)this, asks, a);
        final asmn l = aqvq.l;
        return (askp)atgn;
    }
    
    public final askp ay(final asks asks, final asme asme) {
        asng.b(asks, "other is null");
        asng.b(asme, "combiner is null");
        final atgq atgq = new atgq((asks)this, asme, asks);
        final asmn l = aqvq.l;
        return (askp)atgq;
    }
    
    public final askp az(final asks asks, final asme asme) {
        final asmn c = asnf.c(asme);
        final int a = aske.a;
        asng.c(a, "bufferSize");
        final atgt atgt = new atgt(new asks[] { this, asks }, c, a);
        final asmn l = aqvq.l;
        return (askp)atgt;
    }
    
    protected abstract void f(final asku p0);
    
    public final asjy g(final asmn asmn) {
        asng.b(asmn, "mapper is null");
        final atct atct = new atct((asks)this, asmn);
        final asmn p = aqvq.p;
        return (asjy)atct;
    }
    
    public final asjy h() {
        final atdr atdr = new atdr((asks)this);
        final asmn p = aqvq.p;
        return (asjy)atdr;
    }
    
    public final aske i(final asjx asjx) {
        final astd astd = new astd(this);
        final asjx a = asjx.a;
        final int ordinal = asjx.ordinal();
        if (ordinal != 0) {
            Object o;
            if (ordinal != 1) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        return ((aske)astd).Q();
                    }
                    return ((aske)astd).R();
                }
                else {
                    o = new asud((aske)astd);
                }
            }
            else {
                o = new asuf((aske)astd);
            }
            final asmn j = aqvq.j;
            return (aske)o;
        }
        return (aske)astd;
    }
    
    public final askj j() {
        final atce atce = new atce((asks)this);
        final asmn n = aqvq.n;
        return (askj)atce;
    }
    
    public final askp k() {
        asng.c(16, "initialCapacity");
        final ataz ataz = new ataz(this);
        final asmn l = aqvq.l;
        return (askp)ataz;
    }
    
    public final askp l(final Class clazz) {
        return this.Z(asnf.a(clazz));
    }
    
    public final askp q(final askt askt) {
        asng.b(askt, "composer is null");
        final asks a = askt.a(this);
        final asmn l = aqvq.l;
        return (askp)a;
    }
    
    public final askp s(asmn l, final int n, final int n2, final boolean b) {
        asng.b(l, "mapper is null");
        asng.c(n, "maxConcurrency");
        asng.c(n2, "prefetch");
        int n3;
        if (!b) {
            n3 = 2;
        }
        else {
            n3 = 3;
        }
        final atbk atbk = new atbk((asks)this, l, n3, n, n2);
        l = aqvq.l;
        return (askp)atbk;
    }
    
    public final askp t(final asmn asmn) {
        asng.b(asmn, "mapper is null");
        final atda atda = new atda((asks)this, asmn);
        final asmn l = aqvq.l;
        return (askp)atda;
    }
    
    public final askp u(final asmn asmn) {
        asng.b(asmn, "mapper is null");
        asng.c(2, "prefetch");
        final atad atad = new atad(this, asmn);
        final asmn l = aqvq.l;
        return (askp)atad;
    }
    
    public final askp v(final asks asks) {
        asng.b(asks, "other is null");
        asng.b(asks, "source2 is null");
        return r(this, asks);
    }
    
    public final askp x(final long n, final TimeUnit timeUnit) {
        final askz a = atmg.a();
        asng.b(timeUnit, "unit is null");
        asng.b(a, "scheduler is null");
        final atbq atbq = new atbq((asks)this, n, timeUnit, a);
        final asmn l = aqvq.l;
        return (askp)atbq;
    }
    
    public final askp z(final long n, final TimeUnit timeUnit) {
        return this.aS(n, timeUnit, atmg.a());
    }
}
