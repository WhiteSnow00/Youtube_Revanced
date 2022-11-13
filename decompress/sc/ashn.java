import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ashn implements ashq
{
    public static ashn A(final asih asih) {
        askk.b((Object)asih, "singleSource is null");
        final asvk asvk = new asvk(asih);
        final asjr n = atqx.n;
        return (ashn)asvk;
    }
    
    public static ashn B(final Object o) {
        askk.b(o, "item is null");
        final asvo asvo = new asvo(o);
        final asjr n = atqx.n;
        return (ashn)asvo;
    }
    
    public static ashn D() {
        final asvq a = asvq.a;
        final asjr n = atqx.n;
        return (ashn)a;
    }
    
    public static ashn Q(final long n, final TimeUnit timeUnit, final asid asid) {
        askk.b((Object)timeUnit, "unit is null");
        askk.b((Object)asid, "scheduler is null");
        final aswp aswp = new aswp(Math.max(0L, n), timeUnit, asid);
        final asjr n2 = atqx.n;
        return (ashn)aswp;
    }
    
    public static ashn R(final ashq ashq) {
        final asjr n = atqx.n;
        return (ashn)ashq;
    }
    
    public static ashn S(final ashq ashq, final ashq ashq2, final asji asji) {
        return T(askj.c(asji), ashq, ashq2);
    }
    
    public static ashn T(asjr n, final ashq... array) {
        final aswx aswx = new aswx(array, n);
        n = atqx.n;
        return (ashn)aswx;
    }
    
    public static ashi f(final ashq ashq, final ashq ashq2) {
        return g(ashq, ashq2);
    }
    
    public static ashi g(final ashq... array) {
        final asum asum = new asum(array);
        final asjr j = atqx.j;
        return (ashi)asum;
    }
    
    public static ashn m(final ashp ashp) {
        askk.b((Object)ashp, "onSubscribe is null");
        final asuo asuo = new asuo(ashp);
        final asjr n = atqx.n;
        return (ashn)asuo;
    }
    
    public static ashn t() {
        final asuu a = asuu.a;
        final asjr n = atqx.n;
        return (ashn)a;
    }
    
    public static ashn u(final Throwable t) {
        askk.b((Object)t, "exception is null");
        final asuv asuv = new asuv(t);
        final asjr n = atqx.n;
        return (ashn)asuv;
    }
    
    public static ashn y(final Callable callable) {
        askk.b((Object)callable, "callable is null");
        final asvg asvg = new asvg(callable);
        final asjr n = atqx.n;
        return (ashn)asvg;
    }
    
    public static ashn z(final Future future) {
        final asvj asvj = new asvj(future);
        final asjr n = atqx.n;
        return (ashn)asvj;
    }
    
    public final ashn C(asjr n) {
        askk.b((Object)n, "mapper is null");
        final asvp asvp = new asvp((ashq)this, n);
        n = atqx.n;
        return (ashn)asvp;
    }
    
    public final ashn E(final asid asid) {
        askk.b((Object)asid, "scheduler is null");
        final asvs asvs = new asvs((ashq)this, asid);
        final asjr n = atqx.n;
        return (ashn)asvs;
    }
    
    public final ashn F() {
        return this.G(askj.f);
    }
    
    public final ashn G(final asjs asjs) {
        askk.b((Object)asjs, "predicate is null");
        final asvt asvt = new asvt((ashq)this, asjs);
        final asjr n = atqx.n;
        return (ashn)asvt;
    }
    
    public final ashn H(final ashq ashq) {
        return this.I(askj.b((Object)ashq));
    }
    
    public final ashn I(final asjr asjr) {
        final asvw asvw = new asvw((ashq)this, asjr);
        final asjr n = atqx.n;
        return (ashn)asvw;
    }
    
    public final ashn J(asjr n) {
        askk.b((Object)n, "valueSupplier is null");
        final asvx asvx = new asvx((ashq)this, n);
        n = atqx.n;
        return (ashn)asvx;
    }
    
    public final ashn K(final Object o) {
        askk.b(o, "item is null");
        return this.J(askj.b(o));
    }
    
    public final ashn L(final asid asid) {
        askk.b((Object)asid, "scheduler is null");
        final aswb aswb = new aswb((ashq)this, asid);
        final asjr n = atqx.n;
        return (ashn)aswb;
    }
    
    public final ashn M(final ashq ashq) {
        final aswd aswd = new aswd((ashq)this, ashq);
        final asjr n = atqx.n;
        return (ashn)aswd;
    }
    
    public final ashn N(final ashq ashq) {
        final aswj aswj = new aswj((ashq)this, ashq);
        final asjr n = atqx.n;
        return (ashn)aswj;
    }
    
    public final ashn O(final ashq ashq, final ashq ashq2) {
        final aswn aswn = new aswn((ashq)this, ashq, ashq2);
        final asjr n = atqx.n;
        return (ashn)aswn;
    }
    
    public final ashn P(final long n, final TimeUnit timeUnit, final asid asid, final ashq ashq) {
        return this.O(Q(n, timeUnit, asid), ashq);
    }
    
    public final ashn U(final ashq ashq, final asji asji) {
        return S(this, ashq, asji);
    }
    
    public final asho V(final asho asho) {
        this.ag(asho);
        return asho;
    }
    
    public final asht W(final asjr asjr) {
        askk.b((Object)asjr, "mapper is null");
        final asxe asxe = new asxe((ashq)this, asjr);
        final asjr l = atqx.l;
        return (asht)asxe;
    }
    
    public final asht X() {
        if (this instanceof askn) {
            return ((askn)this).a();
        }
        final aswt aswt = new aswt((ashq)this);
        final asjr l = atqx.l;
        return (asht)aswt;
    }
    
    public final asie Y(final asih asih) {
        final aswg aswg = new aswg((ashq)this, asih);
        final asjr o = atqx.o;
        return (asie)aswg;
    }
    
    public final asie Z() {
        final aswu aswu = new aswu((ashq)this, (Object)null);
        final asjr o = atqx.o;
        return (asie)aswu;
    }
    
    public final asie aa(final Object o) {
        askk.b(o, "defaultValue is null");
        final aswu aswu = new aswu((ashq)this, o);
        final asjr o2 = atqx.o;
        return (asie)aswu;
    }
    
    public final asir ab() {
        return this.ae(askj.d, askj.e, askj.c);
    }
    
    public final asir ac(final asjm asjm) {
        return this.ae(asjm, askj.e, askj.c);
    }
    
    public final asir ad(final asjm asjm, final asjm asjm2) {
        return this.ae(asjm, asjm2, askj.c);
    }
    
    public final asir ae(final asjm asjm, final asjm asjm2, final asjg asjg) {
        askk.b((Object)asjm, "onSuccess is null");
        askk.b((Object)asjm2, "onError is null");
        askk.b((Object)asjg, "onComplete is null");
        final asuk asuk = new asuk(asjm, asjm2, asjg);
        this.V((asho)asuk);
        return (asir)asuk;
    }
    
    public final Object af() {
        final asky asky = new asky();
        this.ag((asho)asky);
        return asky.c();
    }
    
    @Override
    public final void ag(final asho asho) {
        askk.b((Object)asho, "observer is null");
        final asji s = atqx.s;
        askk.b((Object)asho, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            this.ah(asho);
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
    
    protected abstract void ah(final asho p0);
    
    public final ashc c(asjr p) {
        askk.b((Object)p, "mapper is null");
        final asva asva = new asva((ashq)this, p);
        p = atqx.p;
        return (ashc)asva;
    }
    
    public final ashc e() {
        final asvn asvn = new asvn((ashq)this);
        final asjr p = atqx.p;
        return (ashc)asvn;
    }
    
    public final ashi h() {
        if (this instanceof askm) {
            return ((askm)this).a();
        }
        final aswr aswr = new aswr((ashq)this);
        final asjr j = atqx.j;
        return (ashi)aswr;
    }
    
    public final ashn i() {
        final asuj asuj = new asuj((ashq)this);
        final asjr n = atqx.n;
        return (ashn)asuj;
    }
    
    public final ashn j(final Class clazz) {
        return this.C(askj.a(clazz));
    }
    
    public final ashn k(final ashr ashr) {
        askk.b((Object)ashr, "transformer is null");
        final ashq a = ashr.a(this);
        R(a);
        return (ashn)a;
    }
    
    public final ashn l(asjr n) {
        final asvf asvf = new asvf((ashq)this, n);
        n = atqx.n;
        return (ashn)asvf;
    }
    
    public final ashn n(final Object o) {
        askk.b(o, "defaultItem is null");
        return this.M(B(o));
    }
    
    public final ashn o(final asjm asjm) {
        final asur asur = new asur((ashq)this, asjm);
        final asjr n = atqx.n;
        return (ashn)asur;
    }
    
    public final ashn p(final asjg asjg) {
        final asjm d = askj.d;
        askk.b((Object)asjg, "onComplete is null");
        final asvz asvz = new asvz((ashq)this, d, d, asjg);
        final asjr n = atqx.n;
        return (ashn)asvz;
    }
    
    public final ashn q(final asjm asjm) {
        final asjm d = askj.d;
        askk.b((Object)asjm, "onError is null");
        final asvz asvz = new asvz((ashq)this, d, asjm, askj.c);
        final asjr n = atqx.n;
        return (ashn)asvz;
    }
    
    public final ashn r(final asjh asjh) {
        final asut asut = new asut((ashq)this, asjh);
        final asjr n = atqx.n;
        return (ashn)asut;
    }
    
    public final ashn s(final asjm asjm) {
        askk.b((Object)asjm, "onSuccess is null");
        final asvz asvz = new asvz((ashq)this, asjm, askj.d, askj.c);
        final asjr n = atqx.n;
        return (ashn)asvz;
    }
    
    public final ashn v(final asjs asjs) {
        askk.b((Object)asjs, "predicate is null");
        final asuw asuw = new asuw((ashq)this, asjs);
        final asjr n = atqx.n;
        return (ashn)asuw;
    }
    
    public final ashn w(final asjr asjr) {
        askk.b((Object)asjr, "mapper is null");
        final asvf asvf = new asvf((ashq)this, asjr);
        final asjr n = atqx.n;
        return (ashn)asvf;
    }
    
    public final ashn x(asjr n, final asjr asjr, final Callable callable) {
        askk.b((Object)n, "onSuccessMapper is null");
        askk.b((Object)asjr, "onErrorMapper is null");
        askk.b((Object)callable, "onCompleteSupplier is null");
        final asvc asvc = new asvc((ashq)this, n, asjr, callable);
        n = atqx.n;
        return (ashn)asvc;
    }
}
