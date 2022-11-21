import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class asjy implements askb
{
    public static asjy B() {
        final asjy a = asph.a;
        final asmn p = aqvq.p;
        return a;
    }
    
    public static asjy J(final long n, final TimeUnit timeUnit, final askz askz) {
        asng.b(timeUnit, "unit is null");
        asng.b(askz, "scheduler is null");
        final aspu aspu = new aspu(n, timeUnit, askz);
        final asmn p3 = aqvq.p;
        return (asjy)aspu;
    }
    
    public static asjy K(final askb askb) {
        final asmn p = aqvq.p;
        return (asjy)askb;
    }
    
    private asjy a(final asmi asmi, final asmi asmi2, final asmc asmc, final asmc asmc2, final asmc asmc3, final asmc asmc4) {
        asng.b(asmi, "onSubscribe is null");
        asng.b(asmi2, "onError is null");
        asng.b(asmc, "onComplete is null");
        asng.b(asmc4, "onDispose is null");
        final aspm aspm = new aspm((askb)this, asmi, asmi2, asmc, asmc4);
        final asmn p6 = aqvq.p;
        return (asjy)aspm;
    }
    
    private static NullPointerException aa(final Throwable t) {
        final NullPointerException ex = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        ex.initCause(t);
        return ex;
    }
    
    private static asjy b(final aumz aumz, final int n, final boolean b) {
        asng.c(Integer.MAX_VALUE, "maxConcurrency");
        final aspe aspe = new aspe(aumz);
        final asmn p3 = aqvq.p;
        return (asjy)aspe;
    }
    
    private asjy d(final long n, final TimeUnit timeUnit, final askz askz, final askb askb) {
        asng.b(timeUnit, "unit is null");
        asng.b(askz, "scheduler is null");
        final asps asps = new asps((askb)this, n, timeUnit, askz, askb);
        final asmn p4 = aqvq.p;
        return (asjy)asps;
    }
    
    public static asjy f() {
        final asjy a = asou.a;
        final asmn p = aqvq.p;
        return a;
    }
    
    public static asjy h(final aumz aumz) {
        return i(aumz, 2);
    }
    
    public static asjy i(final aumz aumz, final int n) {
        asng.c(2, "prefetch");
        final asom asom = new asom(aumz);
        final asmn p2 = aqvq.p;
        return (asjy)asom;
    }
    
    public static asjy j(final aska aska) {
        asng.b(aska, "source is null");
        final asoo asoo = new asoo(aska);
        final asmn p = aqvq.p;
        return (asjy)asoo;
    }
    
    public static asjy k(final Callable callable) {
        asng.b(callable, "completableSupplier");
        final asop asop = new asop(callable);
        final asmn p = aqvq.p;
        return (asjy)asop;
    }
    
    public static asjy t(final Throwable t) {
        asng.b(t, "error is null");
        final asov asov = new asov(t);
        final asmn p = aqvq.p;
        return (asjy)asov;
    }
    
    public static asjy u(final asmc asmc) {
        asng.b(asmc, "run is null");
        final asow asow = new asow(asmc);
        final asmn p = aqvq.p;
        return (asjy)asow;
    }
    
    public static asjy v(final Callable callable) {
        asng.b(callable, "callable is null");
        final asox asox = new asox(callable);
        final asmn p = aqvq.p;
        return (asjy)asox;
    }
    
    public static asjy w(final Runnable runnable) {
        asng.b(runnable, "run is null");
        final asoy asoy = new asoy(runnable);
        final asmn p = aqvq.p;
        return (asjy)asoy;
    }
    
    public static asjy y(final askb... array) {
        final aspg aspg = new aspg(array);
        final asmn p = aqvq.p;
        return (asjy)aspg;
    }
    
    public static asjy z(final aumz aumz) {
        return b(aumz, Integer.MAX_VALUE, true);
    }
    
    public final asjy A(final askb askb) {
        return y(this, askb);
    }
    
    public final asjy C(final askz askz) {
        asng.b(askz, "scheduler is null");
        final aspj aspj = new aspj((askb)this, askz);
        final asmn p = aqvq.p;
        return (asjy)aspj;
    }
    
    public final asjy D() {
        return this.E(asnf.f);
    }
    
    public final asjy E(final asmo asmo) {
        asng.b(asmo, "predicate is null");
        final aspk aspk = new aspk((askb)this, asmo);
        final asmn p = aqvq.p;
        return (asjy)aspk;
    }
    
    public final asjy F(final askz askz) {
        asng.b(askz, "scheduler is null");
        final aspo aspo = new aspo((askb)this, askz);
        final asmn p = aqvq.p;
        return (asjy)aspo;
    }
    
    public final asjy G(final long n, final TimeUnit timeUnit) {
        return this.d(n, timeUnit, atmg.a(), null);
    }
    
    public final asjy H(final long n, final TimeUnit timeUnit, final askb askb) {
        return this.d(n, timeUnit, atmg.a(), askb);
    }
    
    public final asjy I(final long n, final TimeUnit timeUnit, final askz askz, final askb askb) {
        return this.d(n, timeUnit, askz, askb);
    }
    
    public final asjz L(final asjz asjz) {
        this.Y(asjz);
        return asjz;
    }
    
    public final aske M() {
        if (this instanceof asni) {
            return ((asni)this).a();
        }
        final aspv aspv = new aspv((askb)this);
        final asmn j = aqvq.j;
        return (aske)aspv;
    }
    
    public final askj N(final askm askm) {
        final asxm asxm = new asxm(askm, (askb)this);
        final asmn n = aqvq.n;
        return (askj)asxm;
    }
    
    public final askj O() {
        if (this instanceof asyj) {
            final asyh asyh = new asyh(((asyj)this).a);
            final asmn n = aqvq.n;
            return (askj)asyh;
        }
        final asye asye = new asye((askb)this);
        final asmn n2 = aqvq.n;
        return (askj)asye;
    }
    
    public final askp P(final asks asks) {
        final aszv aszv = new aszv((askb)this, asks);
        final asmn l = aqvq.l;
        return (askp)aszv;
    }
    
    public final askp Q() {
        if (this instanceof asnj) {
            return ((asnj)this).a();
        }
        final aspx aspx = new aspx((askb)this);
        final asmn l = aqvq.l;
        return (askp)aspx;
    }
    
    public final asla R(final asld asld) {
        final athr athr = new athr(asld, (askb)this);
        final asmn o = aqvq.o;
        return (asla)athr;
    }
    
    public final asla S(final Callable callable) {
        final aspz aspz = new aspz((askb)this, callable, (Object)null);
        final asmn o = aqvq.o;
        return (asla)aspz;
    }
    
    public final asla T(final Object o) {
        asng.b(o, "completionValue is null");
        final aspz aspz = new aspz((askb)this, (Callable)null, o);
        final asmn o2 = aqvq.o;
        return (asla)aspz;
    }
    
    public final asln U() {
        final asnz asnz = new asnz();
        this.Y(asnz);
        return asnz;
    }
    
    public final asln V(final asmc asmc) {
        asng.b(asmc, "onComplete is null");
        final asnv asnv = new asnv(asmc);
        this.Y(asnv);
        return asnv;
    }
    
    public final asln W(final asmc asmc, final asmi asmi) {
        asng.b(asmi, "onError is null");
        asng.b(asmc, "onComplete is null");
        final asnv asnv = new asnv(asmi, asmc);
        this.Y(asnv);
        return asnv;
    }
    
    public final void X() {
        final asnu asnu = new asnu();
        this.Y(asnu);
        asnu.c();
    }
    
    @Override
    public final void Y(final asjz asjz) {
        asng.b(asjz, "observer is null");
        try {
            final asme v = aqvq.v;
            asng.b(asjz, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            this.Z(asjz);
        }
        catch (final NullPointerException ex) {
            throw ex;
        }
        finally {
            final Throwable t;
            asjv.a(t);
            aqvq.w(t);
            throw aa(t);
        }
    }
    
    protected abstract void Z(final asjz p0);
    
    public final asjy c(final askb askb) {
        asng.b(askb, "next is null");
        final asoh asoh = new asoh((askb)this, askb);
        final asmn p = aqvq.p;
        return (asjy)asoh;
    }
    
    public final asjy e() {
        final asoj asoj = new asoj((askb)this);
        final asmn p = aqvq.p;
        return (asjy)asoj;
    }
    
    public final asjy g(final askc askc) {
        asng.b(askc, "transformer is null");
        final askb a = askc.a(this);
        K(a);
        return (asjy)a;
    }
    
    public final asjy l(final long n, final TimeUnit timeUnit) {
        return this.n(n, timeUnit, atmg.a(), false);
    }
    
    public final asjy m(final long n, final TimeUnit timeUnit, final askz askz) {
        return this.n(n, timeUnit, askz, false);
    }
    
    public final asjy n(final long n, final TimeUnit timeUnit, final askz askz, final boolean b) {
        asng.b(timeUnit, "unit is null");
        asng.b(askz, "scheduler is null");
        final asor asor = new asor((askb)this, n, timeUnit, askz);
        final asmn p4 = aqvq.p;
        return (asjy)asor;
    }
    
    public final asjy o(final asmc asmc) {
        asng.b(asmc, "onFinally is null");
        final asot asot = new asot((askb)this, asmc);
        final asmn p = aqvq.p;
        return (asjy)asot;
    }
    
    public final asjy p(final asmc asmc) {
        final asmi d = asnf.d;
        final asmc c = asnf.c;
        return this.a(d, d, asmc, c, c, c);
    }
    
    public final asjy q(final asmc asmc) {
        final asmi d = asnf.d;
        final asmc c = asnf.c;
        return this.a(d, d, c, c, c, asmc);
    }
    
    public final asjy r(final asmi asmi) {
        final asmi d = asnf.d;
        final asmc c = asnf.c;
        return this.a(d, asmi, c, c, c, c);
    }
    
    public final asjy s(final asmi asmi) {
        final asmi d = asnf.d;
        final asmc c = asnf.c;
        return this.a(asmi, d, c, c, c, c);
    }
    
    public final asjy x() {
        final aspb aspb = new aspb((askb)this);
        final asmn p = aqvq.p;
        return (asjy)aspb;
    }
}
