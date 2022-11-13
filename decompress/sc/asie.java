import java.util.concurrent.TimeUnit;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class asie implements asih
{
    public static asie C(final Throwable t) {
        askk.b((Object)t, "exception is null");
        return D(askj.h((Object)t));
    }
    
    public static asie D(final Callable callable) {
        final atfa atfa = new atfa(callable);
        final asjr o = atqx.o;
        return (asie)atfa;
    }
    
    public static asie F(final Callable callable) {
        askk.b((Object)callable, "callable is null");
        final atfh atfh = new atfh(callable);
        final asjr o = atqx.o;
        return (asie)atfh;
    }
    
    public static asie G(final Future future) {
        return b(ashi.G(future));
    }
    
    public static asie I(final Object o) {
        askk.b(o, "item is null");
        final atfk atfk = new atfk(o);
        final asjr o2 = atqx.o;
        return (asie)atfk;
    }
    
    public static asie K() {
        final asie a = atfm.a;
        final asjr o = atqx.o;
        return a;
    }
    
    public static asie V(final asih asih) {
        final asjr o = atqx.o;
        return (asie)asih;
    }
    
    public static asie W(final asih asih, final asih asih2, final asji asji) {
        askk.b((Object)asih2, "source2 is null");
        return X(askj.c(asji), asih, asih2);
    }
    
    public static asie X(asjr o, final asih... array) {
        final atgd atgd = new atgd(array, o);
        o = atqx.o;
        return (asie)atgd;
    }
    
    private asie a(final long n, final TimeUnit timeUnit, final asid asid, final asih asih) {
        askk.b((Object)timeUnit, "unit is null");
        askk.b((Object)asid, "scheduler is null");
        final atfw atfw = new atfw((asih)this, n, timeUnit, asid, asih);
        final asjr o = atqx.o;
        return (asie)atfw;
    }
    
    private static asie b(final ashi ashi) {
        final assz assz = new assz(ashi, (Object)null, 0);
        final asjr o = atqx.o;
        return (asie)assz;
    }
    
    public static asie l(final Iterable iterable) {
        final atel atel = new atel((asih[])null, iterable);
        final asjr o = atqx.o;
        return (asie)atel;
    }
    
    public static asie m(final asih... array) {
        final atel atel = new atel(array, (Iterable)null);
        final asjr o = atqx.o;
        return (asie)atel;
    }
    
    public static asie r(final asig asig) {
        askk.b((Object)asig, "source is null");
        final atep atep = new atep(asig);
        final asjr o = atqx.o;
        return (asie)atep;
    }
    
    public static asie s(final Callable callable) {
        askk.b((Object)callable, "singleSupplier is null");
        final ateq ateq = new ateq(callable);
        final asjr o = atqx.o;
        return (asie)ateq;
    }
    
    public final asie A(final asjm asjm) {
        askk.b((Object)asjm, "onError is null");
        final atex atex = new atex((asih)this, asjm);
        final asjr o = atqx.o;
        return (asie)atex;
    }
    
    public final asie B(final asjm asjm) {
        askk.b((Object)asjm, "onSuccess is null");
        final atez atez = new atez((asih)this, asjm);
        final asjr o = atqx.o;
        return (asie)atez;
    }
    
    public final asie E(final asjr asjr) {
        askk.b((Object)asjr, "mapper is null");
        final atfc atfc = new atfc((asih)this, asjr);
        final asjr o = atqx.o;
        return (asie)atfc;
    }
    
    public final asie H() {
        final atfj atfj = new atfj((asih)this);
        final asjr o = atqx.o;
        return (asie)atfj;
    }
    
    public final asie J(final asjr asjr) {
        askk.b((Object)asjr, "mapper is null");
        final atfl atfl = new atfl((asih)this, asjr);
        final asjr o = atqx.o;
        return (asie)atfl;
    }
    
    public final asie L(final asid asid) {
        askk.b((Object)asid, "scheduler is null");
        final atfo atfo = new atfo((asih)this, asid);
        final asjr o = atqx.o;
        return (asie)atfo;
    }
    
    public final asie M(asjr o) {
        askk.b((Object)o, "resumeFunctionInCaseOfError is null");
        final atfr atfr = new atfr((asih)this, o);
        o = atqx.o;
        return (asie)atfr;
    }
    
    public final asie N(asjr o) {
        askk.b((Object)o, "resumeFunction is null");
        final atfp atfp = new atfp((asih)this, o, (Object)null);
        o = atqx.o;
        return (asie)atfp;
    }
    
    public final asie O(final Object o) {
        askk.b(o, "value is null");
        final atfp atfp = new atfp((asih)this, (asjr)null, o);
        final asjr o2 = atqx.o;
        return (asie)atfp;
    }
    
    public final asie P(asjr j) {
        final assn assn = new assn(this.f(), j);
        j = atqx.j;
        return b((ashi)assn);
    }
    
    public final asie Q(final asid asid) {
        askk.b((Object)asid, "scheduler is null");
        final atft atft = new atft((asih)this, asid);
        final asjr o = atqx.o;
        return (asie)atft;
    }
    
    public final asie R(final long n, final TimeUnit timeUnit) {
        return this.a(n, timeUnit, atjj.a(), null);
    }
    
    public final asie S(final long n, final TimeUnit timeUnit, final asid asid) {
        return this.a(n, timeUnit, asid, null);
    }
    
    public final asie T(final long n, final TimeUnit timeUnit, final asih asih) {
        return this.a(n, timeUnit, atjj.a(), asih);
    }
    
    public final asie U(final long n, final TimeUnit timeUnit, final asid asid, final asih asih) {
        return this.a(n, timeUnit, asid, asih);
    }
    
    public final asif Y(final asif asif) {
        this.ae(asif);
        return asif;
    }
    
    public final asir Z() {
        return this.ab(askj.d, askj.e);
    }
    
    public final asir aa(final asjm asjm) {
        return this.ab(asjm, askj.e);
    }
    
    public final asir ab(final asjm asjm, final asjm asjm2) {
        askk.b((Object)asjm, "onSuccess is null");
        askk.b((Object)asjm2, "onError is null");
        final asla asla = new asla(asjm, asjm2);
        this.ae((asif)asla);
        return (asir)asla;
    }
    
    public final Object ac() {
        final asky asky = new asky();
        this.ae((asif)asky);
        return asky.c();
    }
    
    public final Future ad() {
        final asle asle = new asle();
        this.Y((asif)asle);
        return (Future)asle;
    }
    
    @Override
    public final void ae(final asif asif) {
        askk.b((Object)asif, "observer is null");
        final asji u = atqx.u;
        askk.b((Object)asif, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            this.af(asif);
        }
        catch (final NullPointerException ex) {
            throw ex;
        }
        finally {
            final Throwable t;
            asgz.c(t);
            final NullPointerException ex2 = new NullPointerException("subscribeActual failed");
            ex2.initCause(t);
            throw ex2;
        }
    }
    
    protected abstract void af(final asif p0);
    
    public final ashc c(asjr p) {
        askk.b((Object)p, "mapper is null");
        final atfe atfe = new atfe((asih)this, p);
        p = atqx.p;
        return (ashc)atfe;
    }
    
    public final ashc e() {
        final asme asme = new asme((asih)this);
        final asjr p = atqx.p;
        return (ashc)asme;
    }
    
    public final ashi f() {
        if (this instanceof askm) {
            return ((askm)this).a();
        }
        final atfy atfy = new atfy((asih)this);
        final asjr j = atqx.j;
        return (ashi)atfy;
    }
    
    public final ashn g(final asjs asjs) {
        askk.b((Object)asjs, "predicate is null");
        final asuy asuy = new asuy((asih)this, asjs);
        final asjr n = atqx.n;
        return (ashn)asuy;
    }
    
    public final ashn h(final asjr asjr) {
        askk.b((Object)asjr, "mapper is null");
        final atfg atfg = new atfg((asih)this, asjr);
        final asjr n = atqx.n;
        return (ashn)atfg;
    }
    
    public final ashn i() {
        final asvk asvk = new asvk((asih)this);
        final asjr n = atqx.n;
        return (ashn)asvk;
    }
    
    public final asht j(final asjr asjr) {
        askk.b((Object)asjr, "mapper is null");
        final asxp asxp = new asxp((asih)this, asjr);
        final asjr l = atqx.l;
        return (asht)asxp;
    }
    
    public final asht k() {
        if (this instanceof askn) {
            return ((askn)this).a();
        }
        final atga atga = new atga((asih)this);
        final asjr l = atqx.l;
        return (asht)atga;
    }
    
    public final asie n(final asih asih) {
        return m(this, asih);
    }
    
    public final asie o() {
        final aten aten = new aten((asih)this);
        final asjr o = atqx.o;
        return (asie)aten;
    }
    
    public final asie p(final Class clazz) {
        return this.J(askj.a(clazz));
    }
    
    public final asie q(final asii asii) {
        askk.b((Object)asii, "transformer is null");
        final asih a = asii.a(this);
        V(a);
        return (asie)a;
    }
    
    public final asie t(final long n, final TimeUnit timeUnit) {
        return this.v(n, timeUnit, atjj.a(), false);
    }
    
    public final asie u(final long n, final TimeUnit timeUnit, final asid asid) {
        return this.v(n, timeUnit, asid, false);
    }
    
    public final asie v(final long n, final TimeUnit timeUnit, final asid asid, final boolean b) {
        askk.b((Object)timeUnit, "unit is null");
        askk.b((Object)asid, "scheduler is null");
        final ates ates = new ates((asih)this, n, timeUnit, asid);
        final asjr o = atqx.o;
        return (asie)ates;
    }
    
    public final asie w(final ashf ashf) {
        final ateu ateu = new ateu((asih)this, ashf);
        final asjr o = atqx.o;
        return (asie)ateu;
    }
    
    public final asie x(final ashw ashw) {
        final atew atew = new atew((asih)this, ashw);
        final asjr o = atqx.o;
        return (asie)atew;
    }
    
    public final asie y(final long n, final TimeUnit timeUnit) {
        return this.z(n, timeUnit, atjj.a());
    }
    
    public final asie z(final long n, final TimeUnit timeUnit, final asid asid) {
        return this.x(asht.aw(n, timeUnit, asid));
    }
}
