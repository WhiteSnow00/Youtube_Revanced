import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class askj implements askm
{
    public static askj A(final asld asld) {
        asng.b(asld, "singleSource is null");
        final asyg asyg = new asyg(asld);
        final asmn n = aqvq.n;
        return (askj)asyg;
    }
    
    public static askj B(final Object o) {
        asng.b(o, "item is null");
        final asyk asyk = new asyk(o);
        final asmn n = aqvq.n;
        return (askj)asyk;
    }
    
    public static askj D() {
        final asym a = asym.a;
        final asmn n = aqvq.n;
        return (askj)a;
    }
    
    public static askj Q(final long n, final TimeUnit timeUnit, final askz askz) {
        asng.b(timeUnit, "unit is null");
        asng.b(askz, "scheduler is null");
        final aszl aszl = new aszl(Math.max(0L, n), timeUnit, askz);
        final asmn n2 = aqvq.n;
        return (askj)aszl;
    }
    
    public static askj R(final askm askm) {
        final asmn n = aqvq.n;
        return (askj)askm;
    }
    
    public static askj S(final askm askm, final askm askm2, final asme asme) {
        return T(asnf.c(asme), askm, askm2);
    }
    
    public static askj T(asmn n, final askm... array) {
        final aszt aszt = new aszt(array, n);
        n = aqvq.n;
        return (askj)aszt;
    }
    
    public static aske f(final askm askm, final askm askm2) {
        return g(askm, askm2);
    }
    
    public static aske g(final askm... array) {
        final asxi asxi = new asxi(array);
        final asmn j = aqvq.j;
        return (aske)asxi;
    }
    
    public static askj m(final askl askl) {
        asng.b(askl, "onSubscribe is null");
        final asxk asxk = new asxk(askl);
        final asmn n = aqvq.n;
        return (askj)asxk;
    }
    
    public static askj t() {
        final asxq a = asxq.a;
        final asmn n = aqvq.n;
        return (askj)a;
    }
    
    public static askj u(final Throwable t) {
        asng.b(t, "exception is null");
        final asxr asxr = new asxr(t);
        final asmn n = aqvq.n;
        return (askj)asxr;
    }
    
    public static askj y(final Callable callable) {
        asng.b(callable, "callable is null");
        final asyc asyc = new asyc(callable);
        final asmn n = aqvq.n;
        return (askj)asyc;
    }
    
    public static askj z(final Future future) {
        final asyf asyf = new asyf(future);
        final asmn n = aqvq.n;
        return (askj)asyf;
    }
    
    public final askj C(asmn n) {
        asng.b(n, "mapper is null");
        final asyl asyl = new asyl((askm)this, n);
        n = aqvq.n;
        return (askj)asyl;
    }
    
    public final askj E(final askz askz) {
        asng.b(askz, "scheduler is null");
        final asyo asyo = new asyo((askm)this, askz);
        final asmn n = aqvq.n;
        return (askj)asyo;
    }
    
    public final askj F() {
        return this.G(asnf.f);
    }
    
    public final askj G(final asmo asmo) {
        asng.b(asmo, "predicate is null");
        final asyp asyp = new asyp((askm)this, asmo);
        final asmn n = aqvq.n;
        return (askj)asyp;
    }
    
    public final askj H(final askm askm) {
        return this.I(asnf.b(askm));
    }
    
    public final askj I(asmn n) {
        final asys asys = new asys((askm)this, n);
        n = aqvq.n;
        return (askj)asys;
    }
    
    public final askj J(final asmn asmn) {
        asng.b(asmn, "valueSupplier is null");
        final asyt asyt = new asyt((askm)this, asmn);
        final asmn n = aqvq.n;
        return (askj)asyt;
    }
    
    public final askj K(final Object o) {
        asng.b(o, "item is null");
        return this.J(asnf.b(o));
    }
    
    public final askj L(final askz askz) {
        asng.b(askz, "scheduler is null");
        final asyx asyx = new asyx((askm)this, askz);
        final asmn n = aqvq.n;
        return (askj)asyx;
    }
    
    public final askj M(final askm askm) {
        final asyz asyz = new asyz((askm)this, askm);
        final asmn n = aqvq.n;
        return (askj)asyz;
    }
    
    public final askj N(final askm askm) {
        final aszf aszf = new aszf((askm)this, askm);
        final asmn n = aqvq.n;
        return (askj)aszf;
    }
    
    public final askj O(final askm askm, final askm askm2) {
        final aszj aszj = new aszj((askm)this, askm, askm2);
        final asmn n = aqvq.n;
        return (askj)aszj;
    }
    
    public final askj P(final long n, final TimeUnit timeUnit, final askz askz, final askm askm) {
        return this.O(Q(n, timeUnit, askz), askm);
    }
    
    public final askj U(final askm askm, final asme asme) {
        return S(this, askm, asme);
    }
    
    public final askk V(final askk askk) {
        this.ag(askk);
        return askk;
    }
    
    public final askp W(final asmn asmn) {
        asng.b(asmn, "mapper is null");
        final ataa ataa = new ataa((askm)this, asmn);
        final asmn l = aqvq.l;
        return (askp)ataa;
    }
    
    public final askp X() {
        if (this instanceof asnj) {
            return ((asnj)this).a();
        }
        final aszp aszp = new aszp((askm)this);
        final asmn l = aqvq.l;
        return (askp)aszp;
    }
    
    public final asla Y(final asld asld) {
        final aszc aszc = new aszc((askm)this, asld);
        final asmn o = aqvq.o;
        return (asla)aszc;
    }
    
    public final asla Z() {
        final aszq aszq = new aszq((askm)this, (Object)null);
        final asmn o = aqvq.o;
        return (asla)aszq;
    }
    
    public final asla aa(final Object o) {
        asng.b(o, "defaultValue is null");
        final aszq aszq = new aszq((askm)this, o);
        final asmn o2 = aqvq.o;
        return (asla)aszq;
    }
    
    public final asln ab() {
        return this.ae(asnf.d, asnf.e, asnf.c);
    }
    
    public final asln ac(final asmi asmi) {
        return this.ae(asmi, asnf.e, asnf.c);
    }
    
    public final asln ad(final asmi asmi, final asmi asmi2) {
        return this.ae(asmi, asmi2, asnf.c);
    }
    
    public final asln ae(final asmi asmi, final asmi asmi2, final asmc asmc) {
        asng.b(asmi, "onSuccess is null");
        asng.b(asmi2, "onError is null");
        asng.b(asmc, "onComplete is null");
        final asxg asxg = new asxg(asmi, asmi2, asmc);
        this.V(asxg);
        return asxg;
    }
    
    public final Object af() {
        final asnu asnu = new asnu();
        this.ag(asnu);
        return asnu.c();
    }
    
    @Override
    public final void ag(final askk askk) {
        asng.b(askk, "observer is null");
        final asme s = aqvq.s;
        asng.b(askk, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            this.ah(askk);
        }
        catch (final NullPointerException ex) {
            throw ex;
        }
        finally {
            final Throwable t;
            asjv.a(t);
            final NullPointerException ex2 = new NullPointerException("subscribeActual failed");
            ex2.initCause(t);
            throw ex2;
        }
    }
    
    protected abstract void ah(final askk p0);
    
    public final asjy c(final asmn asmn) {
        asng.b(asmn, "mapper is null");
        final asxw asxw = new asxw((askm)this, asmn);
        final asmn p = aqvq.p;
        return (asjy)asxw;
    }
    
    public final asjy e() {
        final asyj asyj = new asyj((askm)this);
        final asmn p = aqvq.p;
        return (asjy)asyj;
    }
    
    public final aske h() {
        if (this instanceof asni) {
            return ((asni)this).a();
        }
        final aszn aszn = new aszn((askm)this);
        final asmn j = aqvq.j;
        return (aske)aszn;
    }
    
    public final askj i() {
        final asxf asxf = new asxf((askm)this);
        final asmn n = aqvq.n;
        return (askj)asxf;
    }
    
    public final askj j(final Class clazz) {
        return this.C(asnf.a(clazz));
    }
    
    public final askj k(final askn askn) {
        asng.b(askn, "transformer is null");
        final askm a = askn.a(this);
        R(a);
        return (askj)a;
    }
    
    public final askj l(asmn n) {
        final asyb asyb = new asyb((askm)this, n);
        n = aqvq.n;
        return (askj)asyb;
    }
    
    public final askj n(final Object o) {
        asng.b(o, "defaultItem is null");
        return this.M(B(o));
    }
    
    public final askj o(final asmi asmi) {
        final asxn asxn = new asxn((askm)this, asmi);
        final asmn n = aqvq.n;
        return (askj)asxn;
    }
    
    public final askj p(final asmc asmc) {
        final asmi d = asnf.d;
        asng.b(asmc, "onComplete is null");
        final asyv asyv = new asyv((askm)this, d, d, asmc);
        final asmn n = aqvq.n;
        return (askj)asyv;
    }
    
    public final askj q(final asmi asmi) {
        final asmi d = asnf.d;
        asng.b(asmi, "onError is null");
        final asyv asyv = new asyv((askm)this, d, asmi, asnf.c);
        final asmn n = aqvq.n;
        return (askj)asyv;
    }
    
    public final askj r(final asmd asmd) {
        final asxp asxp = new asxp((askm)this, asmd);
        final asmn n = aqvq.n;
        return (askj)asxp;
    }
    
    public final askj s(final asmi asmi) {
        asng.b(asmi, "onSuccess is null");
        final asyv asyv = new asyv((askm)this, asmi, asnf.d, asnf.c);
        final asmn n = aqvq.n;
        return (askj)asyv;
    }
    
    public final askj v(final asmo asmo) {
        asng.b(asmo, "predicate is null");
        final asxs asxs = new asxs((askm)this, asmo);
        final asmn n = aqvq.n;
        return (askj)asxs;
    }
    
    public final askj w(asmn n) {
        asng.b(n, "mapper is null");
        final asyb asyb = new asyb((askm)this, n);
        n = aqvq.n;
        return (askj)asyb;
    }
    
    public final askj x(asmn n, final asmn asmn, final Callable callable) {
        asng.b(n, "onSuccessMapper is null");
        asng.b(asmn, "onErrorMapper is null");
        asng.b(callable, "onCompleteSupplier is null");
        final asxy asxy = new asxy((askm)this, n, asmn, callable);
        n = aqvq.n;
        return (askj)asxy;
    }
}
