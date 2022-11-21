import java.util.concurrent.TimeUnit;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class asla implements asld
{
    public static asla C(final Throwable t) {
        asng.b(t, "exception is null");
        return D(asnf.h(t));
    }
    
    public static asla D(final Callable callable) {
        final athx athx = new athx(callable);
        final asmn o = aqvq.o;
        return (asla)athx;
    }
    
    public static asla F(final Callable callable) {
        asng.b(callable, "callable is null");
        final atie atie = new atie(callable);
        final asmn o = aqvq.o;
        return (asla)atie;
    }
    
    public static asla G(final Future future) {
        return b(aske.G(future));
    }
    
    public static asla I(final Object o) {
        asng.b(o, "item is null");
        final atih atih = new atih(o);
        final asmn o2 = aqvq.o;
        return (asla)atih;
    }
    
    public static asla K() {
        final asla a = atij.a;
        final asmn o = aqvq.o;
        return a;
    }
    
    public static asla V(final asld asld) {
        final asmn o = aqvq.o;
        return (asla)asld;
    }
    
    public static asla W(final asld asld, final asld asld2, final asme asme) {
        asng.b(asld2, "source2 is null");
        return X(asnf.c(asme), asld, asld2);
    }
    
    public static asla X(final asmn asmn, final asld... array) {
        final atja atja = new atja(array, asmn);
        final asmn o = aqvq.o;
        return (asla)atja;
    }
    
    private asla a(final long n, final TimeUnit timeUnit, final askz askz, final asld asld) {
        asng.b(timeUnit, "unit is null");
        asng.b(askz, "scheduler is null");
        final atit atit = new atit((asld)this, n, timeUnit, askz, asld);
        final asmn o = aqvq.o;
        return (asla)atit;
    }
    
    private static asla b(final aske aske) {
        final asvv asvv = new asvv(aske, (Object)null, 0);
        final asmn o = aqvq.o;
        return (asla)asvv;
    }
    
    public static asla l(final Iterable iterable) {
        final athi athi = new athi((asld[])null, iterable);
        final asmn o = aqvq.o;
        return (asla)athi;
    }
    
    public static asla m(final asld... array) {
        final athi athi = new athi(array, (Iterable)null);
        final asmn o = aqvq.o;
        return (asla)athi;
    }
    
    public static asla r(final aslc aslc) {
        asng.b(aslc, "source is null");
        final athm athm = new athm(aslc);
        final asmn o = aqvq.o;
        return (asla)athm;
    }
    
    public static asla s(final Callable callable) {
        asng.b(callable, "singleSupplier is null");
        final athn athn = new athn(callable);
        final asmn o = aqvq.o;
        return (asla)athn;
    }
    
    public final asla A(final asmi asmi) {
        asng.b(asmi, "onError is null");
        final athu athu = new athu((asld)this, asmi);
        final asmn o = aqvq.o;
        return (asla)athu;
    }
    
    public final asla B(final asmi asmi) {
        asng.b(asmi, "onSuccess is null");
        final athw athw = new athw((asld)this, asmi);
        final asmn o = aqvq.o;
        return (asla)athw;
    }
    
    public final asla E(final asmn asmn) {
        asng.b(asmn, "mapper is null");
        final athz athz = new athz((asld)this, asmn);
        final asmn o = aqvq.o;
        return (asla)athz;
    }
    
    public final asla H() {
        final atig atig = new atig((asld)this);
        final asmn o = aqvq.o;
        return (asla)atig;
    }
    
    public final asla J(final asmn asmn) {
        asng.b(asmn, "mapper is null");
        final atii atii = new atii((asld)this, asmn);
        final asmn o = aqvq.o;
        return (asla)atii;
    }
    
    public final asla L(final askz askz) {
        asng.b(askz, "scheduler is null");
        final atil atil = new atil((asld)this, askz);
        final asmn o = aqvq.o;
        return (asla)atil;
    }
    
    public final asla M(final asmn asmn) {
        asng.b(asmn, "resumeFunctionInCaseOfError is null");
        final atio atio = new atio((asld)this, asmn);
        final asmn o = aqvq.o;
        return (asla)atio;
    }
    
    public final asla N(asmn o) {
        asng.b(o, "resumeFunction is null");
        final atim atim = new atim((asld)this, o, (Object)null);
        o = aqvq.o;
        return (asla)atim;
    }
    
    public final asla O(final Object o) {
        asng.b(o, "value is null");
        final atim atim = new atim((asld)this, (asmn)null, o);
        final asmn o2 = aqvq.o;
        return (asla)atim;
    }
    
    public final asla P(asmn j) {
        final asvj asvj = new asvj(this.f(), j);
        j = aqvq.j;
        return b((aske)asvj);
    }
    
    public final asla Q(final askz askz) {
        asng.b(askz, "scheduler is null");
        final atiq atiq = new atiq((asld)this, askz);
        final asmn o = aqvq.o;
        return (asla)atiq;
    }
    
    public final asla R(final long n, final TimeUnit timeUnit) {
        return this.a(n, timeUnit, atmg.a(), null);
    }
    
    public final asla S(final long n, final TimeUnit timeUnit, final askz askz) {
        return this.a(n, timeUnit, askz, null);
    }
    
    public final asla T(final long n, final TimeUnit timeUnit, final asld asld) {
        return this.a(n, timeUnit, atmg.a(), asld);
    }
    
    public final asla U(final long n, final TimeUnit timeUnit, final askz askz, final asld asld) {
        return this.a(n, timeUnit, askz, asld);
    }
    
    public final aslb Y(final aslb aslb) {
        this.ae(aslb);
        return aslb;
    }
    
    public final asln Z() {
        return this.ab(asnf.d, asnf.e);
    }
    
    public final asln aa(final asmi asmi) {
        return this.ab(asmi, asnf.e);
    }
    
    public final asln ab(final asmi asmi, final asmi asmi2) {
        asng.b(asmi, "onSuccess is null");
        asng.b(asmi2, "onError is null");
        final asnw asnw = new asnw(asmi, asmi2);
        this.ae(asnw);
        return asnw;
    }
    
    public final Object ac() {
        final asnu asnu = new asnu();
        this.ae(asnu);
        return asnu.c();
    }
    
    public final Future ad() {
        final asoa asoa = new asoa();
        this.Y(asoa);
        return asoa;
    }
    
    @Override
    public final void ae(final aslb aslb) {
        asng.b(aslb, "observer is null");
        final asme u = aqvq.u;
        asng.b(aslb, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            this.af(aslb);
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
    
    protected abstract void af(final aslb p0);
    
    public final asjy c(final asmn asmn) {
        asng.b(asmn, "mapper is null");
        final atib atib = new atib((asld)this, asmn);
        final asmn p = aqvq.p;
        return (asjy)atib;
    }
    
    public final asjy e() {
        final aspa aspa = new aspa((asld)this);
        final asmn p = aqvq.p;
        return (asjy)aspa;
    }
    
    public final aske f() {
        if (this instanceof asni) {
            return ((asni)this).a();
        }
        final ativ ativ = new ativ((asld)this);
        final asmn j = aqvq.j;
        return (aske)ativ;
    }
    
    public final askj g(final asmo asmo) {
        asng.b(asmo, "predicate is null");
        final asxu asxu = new asxu((asld)this, asmo);
        final asmn n = aqvq.n;
        return (askj)asxu;
    }
    
    public final askj h(final asmn asmn) {
        asng.b(asmn, "mapper is null");
        final atid atid = new atid((asld)this, asmn);
        final asmn n = aqvq.n;
        return (askj)atid;
    }
    
    public final askj i() {
        final asyg asyg = new asyg((asld)this);
        final asmn n = aqvq.n;
        return (askj)asyg;
    }
    
    public final askp j(final asmn asmn) {
        asng.b(asmn, "mapper is null");
        final atal atal = new atal((asld)this, asmn);
        final asmn l = aqvq.l;
        return (askp)atal;
    }
    
    public final askp k() {
        if (this instanceof asnj) {
            return ((asnj)this).a();
        }
        final atix atix = new atix((asld)this);
        final asmn l = aqvq.l;
        return (askp)atix;
    }
    
    public final asla n(final asld asld) {
        return m(this, asld);
    }
    
    public final asla o() {
        final athk athk = new athk((asld)this);
        final asmn o = aqvq.o;
        return (asla)athk;
    }
    
    public final asla p(final Class clazz) {
        return this.J(asnf.a(clazz));
    }
    
    public final asla q(final asle asle) {
        asng.b(asle, "transformer is null");
        final asld a = asle.a(this);
        V(a);
        return (asla)a;
    }
    
    public final asla t(final long n, final TimeUnit timeUnit) {
        return this.v(n, timeUnit, atmg.a(), false);
    }
    
    public final asla u(final long n, final TimeUnit timeUnit, final askz askz) {
        return this.v(n, timeUnit, askz, false);
    }
    
    public final asla v(final long n, final TimeUnit timeUnit, final askz askz, final boolean b) {
        asng.b(timeUnit, "unit is null");
        asng.b(askz, "scheduler is null");
        final athp athp = new athp((asld)this, n, timeUnit, askz);
        final asmn o = aqvq.o;
        return (asla)athp;
    }
    
    public final asla w(final askb askb) {
        final athr athr = new athr((asld)this, askb);
        final asmn o = aqvq.o;
        return (asla)athr;
    }
    
    public final asla x(final asks asks) {
        final atht atht = new atht((asld)this, asks);
        final asmn o = aqvq.o;
        return (asla)atht;
    }
    
    public final asla y(final long n, final TimeUnit timeUnit) {
        return this.z(n, timeUnit, atmg.a());
    }
    
    public final asla z(final long n, final TimeUnit timeUnit, final askz askz) {
        return this.x(askp.aw(n, timeUnit, askz));
    }
}
