import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class aske implements aumz
{
    public static final int a;
    
    static {
        a = Math.max(1, Integer.getInteger("rx2.buffer-size", 128));
    }
    
    public static aske A(final Throwable t) {
        final assa assa = new assa(asnf.h(t));
        final asmn j = aqvq.j;
        return (aske)assa;
    }
    
    public static aske E(final Object... array) {
        final assv assv = new assv(array);
        final asmn j = aqvq.j;
        return (aske)assv;
    }
    
    public static aske F(final Callable callable) {
        asng.b(callable, "supplier is null");
        final assw assw = new assw(callable);
        final asmn j = aqvq.j;
        return (aske)assw;
    }
    
    public static aske G(final Future future) {
        final assx assx = new assx(future);
        final asmn j = aqvq.j;
        return (aske)assx;
    }
    
    public static aske H(final Iterable iterable) {
        asng.b(iterable, "source is null");
        final astb astb = new astb(iterable);
        final asmn j = aqvq.j;
        return (aske)astb;
    }
    
    public static aske K(final Object o) {
        asng.b(o, "item is null");
        final asto asto = new asto(o);
        final asmn j = aqvq.j;
        return (aske)asto;
    }
    
    public static aske M(final Iterable iterable) {
        return H(iterable).C(asnf.a);
    }
    
    public static aske N(final aumz aumz, final aumz aumz2) {
        asng.b(aumz, "source1 is null");
        asng.b(aumz2, "source2 is null");
        return E(aumz, aumz2).aw(asnf.a, 2);
    }
    
    public static aske O(final aumz aumz, final aumz aumz2, final aumz aumz3) {
        asng.b(aumz, "source1 is null");
        asng.b(aumz2, "source2 is null");
        return E(aumz, aumz2, aumz3).aw(asnf.a, 3);
    }
    
    private final aske a(final asmi asmi, final asmi asmi2, final asmc asmc, final asmc asmc2) {
        asng.b(asmi, "onNext is null");
        asng.b(asmi2, "onError is null");
        asng.b(asmc, "onComplete is null");
        asng.b(asmc2, "onAfterTerminate is null");
        final asrr asrr = new asrr(this, asmi, asmi2, asmc, asmc2);
        final asmn j = aqvq.j;
        return (aske)asrr;
    }
    
    public static aske ad(final long n, final TimeUnit timeUnit) {
        return ae(n, timeUnit, atmg.a());
    }
    
    public static aske ae(final long n, final TimeUnit timeUnit, final askz askz) {
        asng.b(timeUnit, "unit is null");
        asng.b(askz, "scheduler is null");
        final aswt aswt = new aswt(Math.max(0L, n), timeUnit, askz);
        final asmn j = aqvq.j;
        return (aske)aswt;
    }
    
    public static aske d(asmn j, final aumz... array) {
        final int a = aske.a;
        asng.b(j, "combiner is null");
        asng.c(a, "bufferSize");
        final asqo asqo = new asqo(array, j, a);
        j = aqvq.j;
        return (aske)asqo;
    }
    
    public static aske e(final aumz aumz, final aumz aumz2, final asme asme) {
        asng.b(aumz, "source1 is null");
        asng.b(aumz2, "source2 is null");
        return d(asnf.c(asme), aumz, aumz2);
    }
    
    public static aske g(final aumz aumz, final aumz aumz2, final aumz aumz3, final aumz aumz4, final asmk asmk) {
        asng.b(aumz2, "source2 is null");
        return d(asnf.e(asmk), aumz, aumz2, aumz3, aumz4);
    }
    
    public static aske h(final aumz aumz, final aumz aumz2, final aumz aumz3, final aumz aumz4, final aumz aumz5, final asml asml) {
        return d(asnf.f(asml), aumz, aumz2, aumz3, aumz4, aumz5);
    }
    
    public static aske i(final aumz aumz, final aumz aumz2, final aumz aumz3, final aumz aumz4, final aumz aumz5, final aumz aumz6, final aumz aumz7, final asmm asmm) {
        return d(asnf.g(asmm), aumz, aumz2, aumz3, aumz4, aumz5, aumz6, aumz7);
    }
    
    public static aske k(final aumz... array) {
        final asqq asqq = new asqq(array);
        final asmn j = aqvq.j;
        return (aske)asqq;
    }
    
    public static aske m(final askg askg, final asjx asjx) {
        asng.b(askg, "source is null");
        asng.b(asjx, "mode is null");
        final asrd asrd = new asrd(askg, asjx);
        final asmn j = aqvq.j;
        return (aske)asrd;
    }
    
    public static aske tB(final aumz aumz, final aumz aumz2, final aumz aumz3, final asmj asmj) {
        asng.b(aumz, "source1 is null");
        asng.b(aumz2, "source2 is null");
        asng.b(aumz3, "source3 is null");
        return d(asnf.d(asmj), aumz, aumz2, aumz3);
    }
    
    public static aske z() {
        final aske b = asrz.b;
        final asmn j = aqvq.j;
        return b;
    }
    
    public final aske B(final asmo asmo) {
        asng.b(asmo, "predicate is null");
        final assd assd = new assd(this, asmo);
        final asmn j = aqvq.j;
        return (aske)assd;
    }
    
    public final aske C(final asmn asmn) {
        final int a = aske.a;
        return this.ax(asmn, a, a);
    }
    
    public final aske D(final asmn asmn, final int n) {
        return this.ax(asmn, n, aske.a);
    }
    
    public final aske I(asmn j) {
        final int a = aske.a;
        asng.b(j, "keySelector is null");
        asng.c(a, "bufferSize");
        final asth asth = new asth(this, j, a);
        j = aqvq.j;
        return (aske)asth;
    }
    
    public final aske J() {
        final astj astj = new astj(this);
        final asmn j = aqvq.j;
        return (aske)astj;
    }
    
    public final aske L(final asmn asmn) {
        asng.b(asmn, "mapper is null");
        final astt astt = new astt(this, asmn);
        final asmn j = aqvq.j;
        return (aske)astt;
    }
    
    public final aske P(final askz askz) {
        final int a = aske.a;
        asng.b(askz, "scheduler is null");
        asng.c(a, "bufferSize");
        final astx astx = new astx(this, askz, a);
        final asmn j = aqvq.j;
        return (aske)astx;
    }
    
    public final aske Q() {
        final int a = aske.a;
        asng.c(a, "capacity");
        final astz astz = new astz(this, a);
        final asmn j = aqvq.j;
        return (aske)astz;
    }
    
    public final aske R() {
        final asuh asuh = new asuh(this);
        final asmn j = aqvq.j;
        return (aske)asuh;
    }
    
    public final aske S(final aumz aumz) {
        asng.b(aumz, "next is null");
        final asuj asuj = new asuj(this, asnf.b(aumz));
        final asmn j = aqvq.j;
        return (aske)asuj;
    }
    
    public final aske T(final asme asme) {
        asng.b(asme, "accumulator is null");
        final asvp asvp = new asvp(this, asme);
        final asmn j = aqvq.j;
        return (aske)asvp;
    }
    
    public final aske U(final Object o, final asme asme) {
        asng.b(o, "initialValue is null");
        final Callable h = asnf.h(o);
        asng.b(asme, "accumulator is null");
        final asvr asvr = new asvr(this, h, asme);
        final asmn j = aqvq.j;
        return (aske)asvr;
    }
    
    public final aske V() {
        return this.aq().aE();
    }
    
    public final aske W(final Object o) {
        return k(K(o), this);
    }
    
    public final aske X(final askz askz) {
        asng.b(askz, "scheduler is null");
        final boolean b = this instanceof asrd;
        asng.b(askz, "scheduler is null");
        final aswd aswd = new aswd(this, askz, b ^ true);
        final asmn j = aqvq.j;
        return (aske)aswd;
    }
    
    public final aske Y(final asmn asmn) {
        final int a = aske.a;
        asng.b(asmn, "mapper is null");
        asng.c(a, "bufferSize");
        Object o;
        if (this instanceof asnn) {
            final Object call = ((asnn)this).call();
            if (call == null) {
                o = z();
            }
            else {
                o = asbp.l(call, asmn);
            }
        }
        else {
            o = new aswg(this, asmn, a);
            final asmn j = aqvq.j;
        }
        return (aske)o;
    }
    
    public final aske Z(final asmn asmn) {
        asng.b(asmn, "mapper is null");
        final aszy aszy = new aszy(this, asmn);
        final asmn j = aqvq.j;
        return (aske)aszy;
    }
    
    public final aske aA() {
        final aswi aswi = new aswi(this);
        final asmn j = aqvq.j;
        return (aske)aswi;
    }
    
    public final aske aB(final long n, final TimeUnit timeUnit) {
        return this.ac(n, timeUnit, atmg.a(), true);
    }
    
    public final aske aC(final TimeUnit timeUnit) {
        return this.n(5000L, timeUnit);
    }
    
    public final aske aD(final asmi asmi, final asmc asmc) {
        asng.b(asmi, "onSubscribe is null");
        asng.b(asmc, "onCancel is null");
        final asrt asrt = new asrt(this, asmi, asmc);
        final asmn j = aqvq.j;
        return (aske)asrt;
    }
    
    public final aske aa(final asmo asmo) {
        asng.b(asmo, "stopPredicate is null");
        final aswn aswn = new aswn(this, asmo);
        final asmn j = aqvq.j;
        return (aske)aswn;
    }
    
    public final aske ab(final aumz aumz) {
        asng.b(aumz, "other is null");
        final aswl aswl = new aswl(this, aumz);
        final asmn j = aqvq.j;
        return (aske)aswl;
    }
    
    public final aske ac(final long n, final TimeUnit timeUnit, final askz askz, final boolean b) {
        asng.b(timeUnit, "unit is null");
        asng.b(askz, "scheduler is null");
        final aswp aswp = new aswp(this, n, timeUnit, askz, b);
        final asmn j = aqvq.j;
        return (aske)aswp;
    }
    
    public final aske af(final aumz aumz, final asme asme) {
        asng.b(aumz, "other is null");
        asng.b(asme, "combiner is null");
        final aswz aswz = new aswz(this, asme, aumz);
        final asmn j = aqvq.j;
        return (aske)aswz;
    }
    
    public final aske ag(final aumz[] array, asmn j) {
        asng.b(j, "combiner is null");
        final asxc asxc = new asxc(this, array, j);
        j = aqvq.j;
        return (aske)asxc;
    }
    
    public final aske ah(final aumz aumz, final aumz aumz2, final asmj asmj) {
        asng.b(aumz, "source1 is null");
        asng.b(aumz2, "source2 is null");
        return this.ag(new aumz[] { aumz, aumz2 }, asnf.d(asmj));
    }
    
    public final askp ai() {
        final atdi atdi = new atdi((aumz)this);
        final asmn l = aqvq.l;
        return (askp)atdi;
    }
    
    public final asla aj() {
        final asvv asvv = new asvv(this, (Object)null, 1);
        final asmn o = aqvq.o;
        return (asla)asvv;
    }
    
    public final asla ak(final Object o) {
        final asvv asvv = new asvv(this, o, 0);
        final asmn o2 = aqvq.o;
        return (asla)asvv;
    }
    
    public final asln al() {
        return this.ap(asnf.d, asnf.e, asnf.c, astn.a);
    }
    
    public final asln am(final asmi asmi) {
        return this.ap(asmi, asnf.e, asnf.c, astn.a);
    }
    
    public final asln an(final asmi asmi, final asmi asmi2) {
        return this.ap(asmi, asmi2, asnf.c, astn.a);
    }
    
    public final asln ao(final asmi asmi, final asmi asmi2, final asmc asmc) {
        return this.ap(asmi, asmi2, asmc, astn.a);
    }
    
    public final asln ap(final asmi asmi, final asmi asmi2, final asmc asmc, final asmi asmi3) {
        asng.b(asmi, "onNext is null");
        asng.b(asmi2, "onError is null");
        asng.b(asmc, "onComplete is null");
        asng.b(asmi3, "onSubscribe is null");
        final atkn atkn = new atkn(asmi, asmi2, asmc, asmi3);
        this.as((askh)atkn);
        return (asln)atkn;
    }
    
    public final asma aq() {
        final int a = aske.a;
        asng.c(a, "bufferSize");
        final AtomicReference atomicReference = new AtomicReference();
        final asup asup = new asup((aumz)new asum(atomicReference, a), this, atomicReference, a);
        final asmn k = aqvq.k;
        return (asma)asup;
    }
    
    public final Object ar() {
        final atkm atkm = new atkm();
        this.as((askh)atkm);
        if (atkm.getCount() != 0L) {
            try {
                final boolean x = aqvq.x;
                atkm.await();
            }
            catch (final InterruptedException ex) {
                final aunb c = atkm.c;
                atkm.c = (aunb)atkw.a;
                if (c != null) {
                    c.ts();
                }
                throw atle.b(ex);
            }
        }
        final Throwable b = atkm.b;
        if (b != null) {
            throw atle.b(b);
        }
        final Object a = atkm.a;
        if (a != null) {
            return a;
        }
        throw new NoSuchElementException();
    }
    
    public final void as(final askh askh) {
        asng.b(askh, "s is null");
        try {
            final asme r = aqvq.r;
            asng.b(askh, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            this.au(askh);
        }
        catch (final NullPointerException ex) {
            throw ex;
        }
        finally {
            final Throwable t;
            asjv.a(t);
            aqvq.w(t);
            final NullPointerException ex2 = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            ex2.initCause(t);
            throw ex2;
        }
    }
    
    @Override
    public final void at(final auna auna) {
        if (auna instanceof askh) {
            this.as((askh)auna);
            return;
        }
        asng.b(auna, "s is null");
        this.as((askh)new atkp(auna));
    }
    
    protected abstract void au(final auna p0);
    
    public final aske av(final int n) {
        final atkz a = atkz.a;
        asng.c(n, "count");
        asng.c(1, "skip");
        asng.b(a, "bufferSupplier is null");
        final asqh asqh = new asqh(this, n, (Callable)a);
        final asmn j = aqvq.j;
        return (aske)asqh;
    }
    
    public final aske aw(final asmn asmn, final int n) {
        return this.ax(asmn, n, aske.a);
    }
    
    public final aske ax(asmn j, final int n, final int n2) {
        asng.b(j, "mapper is null");
        asng.c(n, "maxConcurrency");
        asng.c(n2, "bufferSize");
        if (!(this instanceof asnn)) {
            final assg assg = new assg(this, j, n, n2);
            j = aqvq.j;
            return (aske)assg;
        }
        final Object call = ((asnn)this).call();
        if (call == null) {
            return z();
        }
        return asbp.l(call, j);
    }
    
    public final asma ay() {
        asng.c(1, "bufferSize");
        final asvd asvd = new asvd(0);
        final AtomicReference atomicReference = new AtomicReference();
        final asvh asvh = new asvh((aumz)new asve(atomicReference, asvd), this, atomicReference, (Callable)asvd);
        final asmn k = aqvq.k;
        return (asma)asvh;
    }
    
    public final aske az() {
        final asvx asvx = new asvx(this);
        final asmn j = aqvq.j;
        return (aske)asvx;
    }
    
    public final aske j(final aski aski) {
        asng.b(aski, "composer is null");
        Object a = aski.a(this);
        if (a instanceof aske) {
            final asmn j = aqvq.j;
        }
        else {
            asng.b(a, "source is null");
            a = new aste((aumz)a);
            final asmn i = aqvq.j;
        }
        return (aske)a;
    }
    
    public final aske l(final aumz aumz) {
        asng.b(aumz, "other is null");
        asng.b(aumz, "source2 is null");
        return k(this, aumz);
    }
    
    public final aske n(final long n, final TimeUnit timeUnit) {
        return this.o(n, timeUnit, atmg.a());
    }
    
    public final aske o(final long n, final TimeUnit timeUnit, final askz askz) {
        asng.b(timeUnit, "unit is null");
        asng.b(askz, "scheduler is null");
        final asrg asrg = new asrg(this, n, timeUnit, askz);
        final asmn j = aqvq.j;
        return (aske)asrg;
    }
    
    public final aske p() {
        return this.q(asnf.a);
    }
    
    public final aske q(asmn j) {
        asng.b(j, "keySelector is null");
        final asrl asrl = new asrl(this, j, asng.a);
        j = aqvq.j;
        return (aske)asrl;
    }
    
    public final aske r(final asmc asmc) {
        final asmi d = asnf.d;
        return this.a(d, d, asnf.c, asmc);
    }
    
    public final aske s(final asmc asmc) {
        asng.b(asmc, "onFinally is null");
        final asro asro = new asro(this, asmc);
        final asmn j = aqvq.j;
        return (aske)asro;
    }
    
    public final aske t(final asmc asmc) {
        return this.aD(asnf.d, asmc);
    }
    
    public final aske u(final asmc asmc) {
        final asmi d = asnf.d;
        return this.a(d, d, asmc, asnf.c);
    }
    
    public final aske v(final asmi asmi) {
        final asmi d = asnf.d;
        final asmc c = asnf.c;
        return this.a(d, asmi, c, c);
    }
    
    public final aske w(final asmi asmi) {
        final asmi d = asnf.d;
        final asmc c = asnf.c;
        return this.a(asmi, d, c, c);
    }
    
    public final aske x(final asmi asmi) {
        return this.aD(asmi, asnf.c);
    }
    
    public final aske y(final asmc asmc) {
        return this.a(asnf.d, new asmw(asmc), asmc, asnf.c);
    }
}
