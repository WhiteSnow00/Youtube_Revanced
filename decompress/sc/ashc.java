import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ashc implements ashf
{
    public static ashc B() {
        final ashc a = asml.a;
        final asjr p = atqx.p;
        return a;
    }
    
    public static ashc J(final long n, final TimeUnit timeUnit, final asid asid) {
        askk.b((Object)timeUnit, "unit is null");
        askk.b((Object)asid, "scheduler is null");
        final asmy asmy = new asmy(n, timeUnit, asid);
        final asjr p3 = atqx.p;
        return (ashc)asmy;
    }
    
    public static ashc K(final ashf ashf) {
        final asjr p = atqx.p;
        return (ashc)ashf;
    }
    
    private ashc a(final asjm asjm, final asjm asjm2, final asjg asjg, final asjg asjg2, final asjg asjg3, final asjg asjg4) {
        askk.b((Object)asjm, "onSubscribe is null");
        askk.b((Object)asjm2, "onError is null");
        askk.b((Object)asjg, "onComplete is null");
        askk.b((Object)asjg4, "onDispose is null");
        final asmq asmq = new asmq((ashf)this, asjm, asjm2, asjg, asjg4);
        final asjr p6 = atqx.p;
        return (ashc)asmq;
    }
    
    private static NullPointerException aa(final Throwable t) {
        final NullPointerException ex = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        ex.initCause(t);
        return ex;
    }
    
    private static ashc b(final auke auke, final int n, final boolean b) {
        askk.c(Integer.MAX_VALUE, "maxConcurrency");
        final asmi asmi = new asmi(auke);
        final asjr p3 = atqx.p;
        return (ashc)asmi;
    }
    
    private ashc d(final long n, final TimeUnit timeUnit, final asid asid, final ashf ashf) {
        askk.b((Object)timeUnit, "unit is null");
        askk.b((Object)asid, "scheduler is null");
        final asmw asmw = new asmw((ashf)this, n, timeUnit, asid, ashf);
        final asjr p4 = atqx.p;
        return (ashc)asmw;
    }
    
    public static ashc f() {
        final ashc a = asly.a;
        final asjr p = atqx.p;
        return a;
    }
    
    public static ashc h(final auke auke) {
        return i(auke, 2);
    }
    
    public static ashc i(final auke auke, final int n) {
        askk.c(2, "prefetch");
        final aslq aslq = new aslq(auke);
        final asjr p2 = atqx.p;
        return (ashc)aslq;
    }
    
    public static ashc j(final ashe ashe) {
        askk.b((Object)ashe, "source is null");
        final asls asls = new asls(ashe);
        final asjr p = atqx.p;
        return (ashc)asls;
    }
    
    public static ashc k(final Callable callable) {
        askk.b((Object)callable, "completableSupplier");
        final aslt aslt = new aslt(callable);
        final asjr p = atqx.p;
        return (ashc)aslt;
    }
    
    public static ashc t(final Throwable t) {
        askk.b((Object)t, "error is null");
        final aslz aslz = new aslz(t);
        final asjr p = atqx.p;
        return (ashc)aslz;
    }
    
    public static ashc u(final asjg asjg) {
        askk.b((Object)asjg, "run is null");
        final asma asma = new asma(asjg);
        final asjr p = atqx.p;
        return (ashc)asma;
    }
    
    public static ashc v(final Callable callable) {
        askk.b((Object)callable, "callable is null");
        final asmb asmb = new asmb(callable);
        final asjr p = atqx.p;
        return (ashc)asmb;
    }
    
    public static ashc w(final Runnable runnable) {
        askk.b((Object)runnable, "run is null");
        final asmc asmc = new asmc(runnable);
        final asjr p = atqx.p;
        return (ashc)asmc;
    }
    
    public static ashc y(final ashf... array) {
        final asmk asmk = new asmk(array);
        final asjr p = atqx.p;
        return (ashc)asmk;
    }
    
    public static ashc z(final auke auke) {
        return b(auke, Integer.MAX_VALUE, true);
    }
    
    public final ashc A(final ashf ashf) {
        return y(this, ashf);
    }
    
    public final ashc C(final asid asid) {
        askk.b((Object)asid, "scheduler is null");
        final asmn asmn = new asmn((ashf)this, asid);
        final asjr p = atqx.p;
        return (ashc)asmn;
    }
    
    public final ashc D() {
        return this.E(askj.f);
    }
    
    public final ashc E(final asjs asjs) {
        askk.b((Object)asjs, "predicate is null");
        final asmo asmo = new asmo((ashf)this, asjs);
        final asjr p = atqx.p;
        return (ashc)asmo;
    }
    
    public final ashc F(final asid asid) {
        askk.b((Object)asid, "scheduler is null");
        final asms asms = new asms((ashf)this, asid);
        final asjr p = atqx.p;
        return (ashc)asms;
    }
    
    public final ashc G(final long n, final TimeUnit timeUnit) {
        return this.d(n, timeUnit, atjj.a(), null);
    }
    
    public final ashc H(final long n, final TimeUnit timeUnit, final ashf ashf) {
        return this.d(n, timeUnit, atjj.a(), ashf);
    }
    
    public final ashc I(final long n, final TimeUnit timeUnit, final asid asid, final ashf ashf) {
        return this.d(n, timeUnit, asid, ashf);
    }
    
    public final ashd L(final ashd ashd) {
        this.Y(ashd);
        return ashd;
    }
    
    public final ashi M() {
        if (this instanceof askm) {
            return ((askm)this).a();
        }
        final asmz asmz = new asmz((ashf)this);
        final asjr j = atqx.j;
        return (ashi)asmz;
    }
    
    public final ashn N(final ashq ashq) {
        final asuq asuq = new asuq(ashq, (ashf)this);
        final asjr n = atqx.n;
        return (ashn)asuq;
    }
    
    public final ashn O() {
        if (this instanceof asvn) {
            final asvl asvl = new asvl(((asvn)this).a);
            final asjr n = atqx.n;
            return (ashn)asvl;
        }
        final asvi asvi = new asvi((ashf)this);
        final asjr n2 = atqx.n;
        return (ashn)asvi;
    }
    
    public final asht P(final ashw ashw) {
        final aswz aswz = new aswz((ashf)this, ashw);
        final asjr l = atqx.l;
        return (asht)aswz;
    }
    
    public final asht Q() {
        if (this instanceof askn) {
            return ((askn)this).a();
        }
        final asnb asnb = new asnb((ashf)this);
        final asjr l = atqx.l;
        return (asht)asnb;
    }
    
    public final asie R(final asih asih) {
        final ateu ateu = new ateu(asih, (ashf)this);
        final asjr o = atqx.o;
        return (asie)ateu;
    }
    
    public final asie S(final Callable callable) {
        final asnd asnd = new asnd((ashf)this, callable, (Object)null);
        final asjr o = atqx.o;
        return (asie)asnd;
    }
    
    public final asie T(final Object o) {
        askk.b(o, "completionValue is null");
        final asnd asnd = new asnd((ashf)this, (Callable)null, o);
        final asjr o2 = atqx.o;
        return (asie)asnd;
    }
    
    public final asir U() {
        final asld asld = new asld();
        this.Y((ashd)asld);
        return (asir)asld;
    }
    
    public final asir V(final asjg asjg) {
        askk.b((Object)asjg, "onComplete is null");
        final askz askz = new askz(asjg);
        this.Y((ashd)askz);
        return (asir)askz;
    }
    
    public final asir W(final asjg asjg, final asjm asjm) {
        askk.b((Object)asjm, "onError is null");
        askk.b((Object)asjg, "onComplete is null");
        final askz askz = new askz(asjm, asjg);
        this.Y((ashd)askz);
        return (asir)askz;
    }
    
    public final void X() {
        final asky asky = new asky();
        this.Y((ashd)asky);
        asky.c();
    }
    
    @Override
    public final void Y(final ashd ashd) {
        askk.b((Object)ashd, "observer is null");
        try {
            final asji v = atqx.v;
            askk.b((Object)ashd, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            this.Z(ashd);
        }
        catch (final NullPointerException ex) {
            throw ex;
        }
        finally {
            final Throwable t;
            asgz.c(t);
            atqx.j(t);
            throw aa(t);
        }
    }
    
    protected abstract void Z(final ashd p0);
    
    public final ashc c(final ashf ashf) {
        askk.b((Object)ashf, "next is null");
        final asll asll = new asll((ashf)this, ashf);
        final asjr p = atqx.p;
        return (ashc)asll;
    }
    
    public final ashc e() {
        final asln asln = new asln((ashf)this);
        final asjr p = atqx.p;
        return (ashc)asln;
    }
    
    public final ashc g(final ashg ashg) {
        askk.b((Object)ashg, "transformer is null");
        final ashf a = ashg.a(this);
        K(a);
        return (ashc)a;
    }
    
    public final ashc l(final long n, final TimeUnit timeUnit) {
        return this.n(n, timeUnit, atjj.a(), false);
    }
    
    public final ashc m(final long n, final TimeUnit timeUnit, final asid asid) {
        return this.n(n, timeUnit, asid, false);
    }
    
    public final ashc n(final long n, final TimeUnit timeUnit, final asid asid, final boolean b) {
        askk.b((Object)timeUnit, "unit is null");
        askk.b((Object)asid, "scheduler is null");
        final aslv aslv = new aslv((ashf)this, n, timeUnit, asid);
        final asjr p4 = atqx.p;
        return (ashc)aslv;
    }
    
    public final ashc o(final asjg asjg) {
        askk.b((Object)asjg, "onFinally is null");
        final aslx aslx = new aslx((ashf)this, asjg);
        final asjr p = atqx.p;
        return (ashc)aslx;
    }
    
    public final ashc p(final asjg asjg) {
        final asjm d = askj.d;
        final asjg c = askj.c;
        return this.a(d, d, asjg, c, c, c);
    }
    
    public final ashc q(final asjg asjg) {
        final asjm d = askj.d;
        final asjg c = askj.c;
        return this.a(d, d, c, c, c, asjg);
    }
    
    public final ashc r(final asjm asjm) {
        final asjm d = askj.d;
        final asjg c = askj.c;
        return this.a(d, asjm, c, c, c, c);
    }
    
    public final ashc s(final asjm asjm) {
        final asjm d = askj.d;
        final asjg c = askj.c;
        return this.a(asjm, d, c, c, c, c);
    }
    
    public final ashc x() {
        final asmf asmf = new asmf((ashf)this);
        final asjr p = atqx.p;
        return (ashc)asmf;
    }
}
