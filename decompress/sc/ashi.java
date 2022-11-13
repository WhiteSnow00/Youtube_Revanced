import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ashi implements auke
{
    public static final int a;
    
    static {
        a = Math.max(1, Integer.getInteger("rx2.buffer-size", 128));
    }
    
    public static ashi A(final Throwable t) {
        final aspe aspe = new aspe(askj.h((Object)t));
        final asjr j = atqx.j;
        return (ashi)aspe;
    }
    
    public static ashi E(final Object... array) {
        final aspz aspz = new aspz(array);
        final asjr j = atqx.j;
        return (ashi)aspz;
    }
    
    public static ashi F(final Callable callable) {
        askk.b((Object)callable, "supplier is null");
        final asqa asqa = new asqa(callable);
        final asjr j = atqx.j;
        return (ashi)asqa;
    }
    
    public static ashi G(final Future future) {
        final asqb asqb = new asqb(future);
        final asjr j = atqx.j;
        return (ashi)asqb;
    }
    
    public static ashi H(final Iterable iterable) {
        askk.b((Object)iterable, "source is null");
        final asqf asqf = new asqf(iterable);
        final asjr j = atqx.j;
        return (ashi)asqf;
    }
    
    public static ashi K(final Object o) {
        askk.b(o, "item is null");
        final asqs asqs = new asqs(o);
        final asjr j = atqx.j;
        return (ashi)asqs;
    }
    
    public static ashi M(final Iterable iterable) {
        return H(iterable).C(askj.a);
    }
    
    public static ashi N(final auke auke, final auke auke2) {
        askk.b((Object)auke, "source1 is null");
        askk.b((Object)auke2, "source2 is null");
        return E(auke, auke2).aw(askj.a, 2);
    }
    
    public static ashi O(final auke auke, final auke auke2, final auke auke3) {
        askk.b((Object)auke, "source1 is null");
        askk.b((Object)auke2, "source2 is null");
        return E(auke, auke2, auke3).aw(askj.a, 3);
    }
    
    private final ashi a(final asjm asjm, final asjm asjm2, final asjg asjg, final asjg asjg2) {
        askk.b((Object)asjm, "onNext is null");
        askk.b((Object)asjm2, "onError is null");
        askk.b((Object)asjg, "onComplete is null");
        askk.b((Object)asjg2, "onAfterTerminate is null");
        final asov asov = new asov(this, asjm, asjm2, asjg, asjg2);
        final asjr j = atqx.j;
        return (ashi)asov;
    }
    
    public static ashi ad(final long n, final TimeUnit timeUnit) {
        return ae(n, timeUnit, atjj.a());
    }
    
    public static ashi ae(final long n, final TimeUnit timeUnit, final asid asid) {
        askk.b((Object)timeUnit, "unit is null");
        askk.b((Object)asid, "scheduler is null");
        final astx astx = new astx(Math.max(0L, n), timeUnit, asid);
        final asjr j = atqx.j;
        return (ashi)astx;
    }
    
    public static ashi d(asjr j, final auke... array) {
        final int a = ashi.a;
        askk.b((Object)j, "combiner is null");
        askk.c(a, "bufferSize");
        final asns asns = new asns(array, j, a);
        j = atqx.j;
        return (ashi)asns;
    }
    
    public static ashi e(final auke auke, final auke auke2, final asji asji) {
        askk.b((Object)auke, "source1 is null");
        askk.b((Object)auke2, "source2 is null");
        return d(askj.c(asji), auke, auke2);
    }
    
    public static ashi g(final auke auke, final auke auke2, final auke auke3, final auke auke4, final asjo asjo) {
        askk.b((Object)auke2, "source2 is null");
        return d(askj.e(asjo), auke, auke2, auke3, auke4);
    }
    
    public static ashi h(final auke auke, final auke auke2, final auke auke3, final auke auke4, final auke auke5, final asjp asjp) {
        return d(askj.f(asjp), auke, auke2, auke3, auke4, auke5);
    }
    
    public static ashi i(final auke auke, final auke auke2, final auke auke3, final auke auke4, final auke auke5, final auke auke6, final auke auke7, final asjq asjq) {
        return d(askj.g(asjq), auke, auke2, auke3, auke4, auke5, auke6, auke7);
    }
    
    public static ashi k(final auke... array) {
        final asnu asnu = new asnu(array);
        final asjr j = atqx.j;
        return (ashi)asnu;
    }
    
    public static ashi m(final ashk ashk, final ashb ashb) {
        askk.b((Object)ashk, "source is null");
        askk.b((Object)ashb, "mode is null");
        final asoh asoh = new asoh(ashk, ashb);
        final asjr j = atqx.j;
        return (ashi)asoh;
    }
    
    public static ashi tC(final auke auke, final auke auke2, final auke auke3, final asjn asjn) {
        askk.b((Object)auke, "source1 is null");
        askk.b((Object)auke2, "source2 is null");
        askk.b((Object)auke3, "source3 is null");
        return d(askj.d(asjn), auke, auke2, auke3);
    }
    
    public static ashi z() {
        final ashi b = aspd.b;
        final asjr j = atqx.j;
        return b;
    }
    
    public final ashi B(final asjs asjs) {
        askk.b((Object)asjs, "predicate is null");
        final asph asph = new asph(this, asjs);
        final asjr j = atqx.j;
        return (ashi)asph;
    }
    
    public final ashi C(final asjr asjr) {
        final int a = ashi.a;
        return this.ax(asjr, a, a);
    }
    
    public final ashi D(final asjr asjr, final int n) {
        return this.ax(asjr, n, ashi.a);
    }
    
    public final ashi I(asjr j) {
        final int a = ashi.a;
        askk.b((Object)j, "keySelector is null");
        askk.c(a, "bufferSize");
        final asql asql = new asql(this, j, a);
        j = atqx.j;
        return (ashi)asql;
    }
    
    public final ashi J() {
        final asqn asqn = new asqn(this);
        final asjr j = atqx.j;
        return (ashi)asqn;
    }
    
    public final ashi L(asjr j) {
        askk.b((Object)j, "mapper is null");
        final asqx asqx = new asqx(this, j);
        j = atqx.j;
        return (ashi)asqx;
    }
    
    public final ashi P(final asid asid) {
        final int a = ashi.a;
        askk.b((Object)asid, "scheduler is null");
        askk.c(a, "bufferSize");
        final asrb asrb = new asrb(this, asid, a);
        final asjr j = atqx.j;
        return (ashi)asrb;
    }
    
    public final ashi Q() {
        final int a = ashi.a;
        askk.c(a, "capacity");
        final asrd asrd = new asrd(this, a);
        final asjr j = atqx.j;
        return (ashi)asrd;
    }
    
    public final ashi R() {
        final asrl asrl = new asrl(this);
        final asjr j = atqx.j;
        return (ashi)asrl;
    }
    
    public final ashi S(final auke auke) {
        askk.b((Object)auke, "next is null");
        final asrn asrn = new asrn(this, askj.b((Object)auke));
        final asjr j = atqx.j;
        return (ashi)asrn;
    }
    
    public final ashi T(final asji asji) {
        askk.b((Object)asji, "accumulator is null");
        final asst asst = new asst(this, asji);
        final asjr j = atqx.j;
        return (ashi)asst;
    }
    
    public final ashi U(final Object o, final asji asji) {
        askk.b(o, "initialValue is null");
        final Callable h = askj.h(o);
        askk.b((Object)asji, "accumulator is null");
        final assv assv = new assv(this, h, asji);
        final asjr j = atqx.j;
        return (ashi)assv;
    }
    
    public final ashi V() {
        return this.aq().aE();
    }
    
    public final ashi W(final Object o) {
        return k((auke)K(o), (auke)this);
    }
    
    public final ashi X(final asid asid) {
        askk.b((Object)asid, "scheduler is null");
        final boolean b = this instanceof asoh;
        askk.b((Object)asid, "scheduler is null");
        final asth asth = new asth(this, asid, b ^ true);
        final asjr j = atqx.j;
        return (ashi)asth;
    }
    
    public final ashi Y(final asjr asjr) {
        final int a = ashi.a;
        askk.b((Object)asjr, "mapper is null");
        askk.c(a, "bufferSize");
        Object o;
        if (this instanceof askr) {
            final Object call = ((askr)this).call();
            if (call == null) {
                o = z();
            }
            else {
                o = aryu.k(call, asjr);
            }
        }
        else {
            o = new astk(this, asjr, a);
            final asjr j = atqx.j;
        }
        return (ashi)o;
    }
    
    public final ashi Z(final asjr asjr) {
        askk.b((Object)asjr, "mapper is null");
        final asxc asxc = new asxc(this, asjr);
        final asjr j = atqx.j;
        return (ashi)asxc;
    }
    
    public final ashi aA() {
        final astm astm = new astm(this);
        final asjr j = atqx.j;
        return (ashi)astm;
    }
    
    public final ashi aB(final long n, final TimeUnit timeUnit) {
        return this.ac(n, timeUnit, atjj.a(), true);
    }
    
    public final ashi aC(final TimeUnit timeUnit) {
        return this.n(5000L, timeUnit);
    }
    
    public final ashi aD(final asjm asjm, final asjg asjg) {
        askk.b((Object)asjm, "onSubscribe is null");
        askk.b((Object)asjg, "onCancel is null");
        final asox asox = new asox(this, asjm, asjg);
        final asjr j = atqx.j;
        return (ashi)asox;
    }
    
    public final ashi aa(final asjs asjs) {
        askk.b((Object)asjs, "stopPredicate is null");
        final astr astr = new astr(this, asjs);
        final asjr j = atqx.j;
        return (ashi)astr;
    }
    
    public final ashi ab(final auke auke) {
        askk.b((Object)auke, "other is null");
        final astp astp = new astp(this, auke);
        final asjr j = atqx.j;
        return (ashi)astp;
    }
    
    public final ashi ac(final long n, final TimeUnit timeUnit, final asid asid, final boolean b) {
        askk.b((Object)timeUnit, "unit is null");
        askk.b((Object)asid, "scheduler is null");
        final astt astt = new astt(this, n, timeUnit, asid, b);
        final asjr j = atqx.j;
        return (ashi)astt;
    }
    
    public final ashi af(final auke auke, final asji asji) {
        askk.b((Object)auke, "other is null");
        askk.b((Object)asji, "combiner is null");
        final asud asud = new asud(this, asji, auke);
        final asjr j = atqx.j;
        return (ashi)asud;
    }
    
    public final ashi ag(final auke[] array, asjr j) {
        askk.b((Object)j, "combiner is null");
        final asug asug = new asug(this, array, j);
        j = atqx.j;
        return (ashi)asug;
    }
    
    public final ashi ah(final auke auke, final auke auke2, final asjn asjn) {
        askk.b((Object)auke, "source1 is null");
        askk.b((Object)auke2, "source2 is null");
        return this.ag(new auke[] { auke, auke2 }, askj.d(asjn));
    }
    
    public final asht ai() {
        final atam atam = new atam((auke)this);
        final asjr l = atqx.l;
        return (asht)atam;
    }
    
    public final asie aj() {
        final assz assz = new assz(this, (Object)null, 1);
        final asjr o = atqx.o;
        return (asie)assz;
    }
    
    public final asie ak(final Object o) {
        final assz assz = new assz(this, o, 0);
        final asjr o2 = atqx.o;
        return (asie)assz;
    }
    
    public final asir al() {
        return this.ap(askj.d, askj.e, askj.c, (asjm)asqr.a);
    }
    
    public final asir am(final asjm asjm) {
        return this.ap(asjm, askj.e, askj.c, (asjm)asqr.a);
    }
    
    public final asir an(final asjm asjm, final asjm asjm2) {
        return this.ap(asjm, asjm2, askj.c, (asjm)asqr.a);
    }
    
    public final asir ao(final asjm asjm, final asjm asjm2, final asjg asjg) {
        return this.ap(asjm, asjm2, asjg, (asjm)asqr.a);
    }
    
    public final asir ap(final asjm asjm, final asjm asjm2, final asjg asjg, final asjm asjm3) {
        askk.b((Object)asjm, "onNext is null");
        askk.b((Object)asjm2, "onError is null");
        askk.b((Object)asjg, "onComplete is null");
        askk.b((Object)asjm3, "onSubscribe is null");
        final athq athq = new athq(asjm, asjm2, asjg, asjm3);
        this.as((ashl)athq);
        return (asir)athq;
    }
    
    public final asje aq() {
        final int a = ashi.a;
        askk.c(a, "bufferSize");
        final AtomicReference atomicReference = new AtomicReference();
        final asrt asrt = new asrt((auke)new asrq(atomicReference, a), this, atomicReference, a);
        final asjr k = atqx.k;
        return (asje)asrt;
    }
    
    public final Object ar() {
        final athp athp = new athp();
        this.as((ashl)athp);
        if (athp.getCount() != 0L) {
            try {
                final boolean x = atqx.x;
                athp.await();
            }
            catch (final InterruptedException ex) {
                final aukg c = athp.c;
                athp.c = (aukg)athz.a;
                if (c != null) {
                    c.tt();
                }
                throw atih.b((Throwable)ex);
            }
        }
        final Throwable b = athp.b;
        if (b != null) {
            throw atih.b(b);
        }
        final Object a = athp.a;
        if (a != null) {
            return a;
        }
        throw new NoSuchElementException();
    }
    
    public final void as(final ashl ashl) {
        askk.b((Object)ashl, "s is null");
        try {
            final asji r = atqx.r;
            askk.b((Object)ashl, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            this.au((aukf)ashl);
        }
        catch (final NullPointerException ex) {
            throw ex;
        }
        finally {
            final Throwable t;
            asgz.c(t);
            atqx.j(t);
            final NullPointerException ex2 = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            ex2.initCause(t);
            throw ex2;
        }
    }
    
    public final void at(final aukf aukf) {
        if (aukf instanceof ashl) {
            this.as((ashl)aukf);
            return;
        }
        askk.b((Object)aukf, "s is null");
        this.as((ashl)new aths(aukf));
    }
    
    protected abstract void au(final aukf p0);
    
    public final ashi av(final int n) {
        final atic a = atic.a;
        askk.c(n, "count");
        askk.c(1, "skip");
        askk.b((Object)a, "bufferSupplier is null");
        final asnl asnl = new asnl(this, n, (Callable)a);
        final asjr j = atqx.j;
        return (ashi)asnl;
    }
    
    public final ashi aw(final asjr asjr, final int n) {
        return this.ax(asjr, n, ashi.a);
    }
    
    public final ashi ax(final asjr asjr, final int n, final int n2) {
        askk.b((Object)asjr, "mapper is null");
        askk.c(n, "maxConcurrency");
        askk.c(n2, "bufferSize");
        if (!(this instanceof askr)) {
            final aspk aspk = new aspk(this, asjr, n, n2);
            final asjr j = atqx.j;
            return (ashi)aspk;
        }
        final Object call = ((askr)this).call();
        if (call == null) {
            return z();
        }
        return aryu.k(call, asjr);
    }
    
    public final asje ay() {
        askk.c(1, "bufferSize");
        final assh assh = new assh(0);
        final AtomicReference atomicReference = new AtomicReference();
        final assl assl = new assl((auke)new assi(atomicReference, (Callable)assh), this, atomicReference, (Callable)assh);
        final asjr k = atqx.k;
        return (asje)assl;
    }
    
    public final ashi az() {
        final astb astb = new astb(this);
        final asjr j = atqx.j;
        return (ashi)astb;
    }
    
    public final ashi j(final ashm ashm) {
        askk.b((Object)ashm, "composer is null");
        Object a = ashm.a(this);
        if (a instanceof ashi) {
            final asjr j = atqx.j;
        }
        else {
            askk.b(a, "source is null");
            a = new asqi((auke)a);
            final asjr i = atqx.j;
        }
        return (ashi)a;
    }
    
    public final ashi l(final auke auke) {
        askk.b((Object)auke, "other is null");
        askk.b((Object)auke, "source2 is null");
        return k((auke)this, auke);
    }
    
    public final ashi n(final long n, final TimeUnit timeUnit) {
        return this.o(n, timeUnit, atjj.a());
    }
    
    public final ashi o(final long n, final TimeUnit timeUnit, final asid asid) {
        askk.b((Object)timeUnit, "unit is null");
        askk.b((Object)asid, "scheduler is null");
        final asok asok = new asok(this, n, timeUnit, asid);
        final asjr j = atqx.j;
        return (ashi)asok;
    }
    
    public final ashi p() {
        return this.q(askj.a);
    }
    
    public final ashi q(final asjr asjr) {
        askk.b((Object)asjr, "keySelector is null");
        final asop asop = new asop(this, asjr, askk.a);
        final asjr j = atqx.j;
        return (ashi)asop;
    }
    
    public final ashi r(final asjg asjg) {
        final asjm d = askj.d;
        return this.a(d, d, askj.c, asjg);
    }
    
    public final ashi s(final asjg asjg) {
        askk.b((Object)asjg, "onFinally is null");
        final asos asos = new asos(this, asjg);
        final asjr j = atqx.j;
        return (ashi)asos;
    }
    
    public final ashi t(final asjg asjg) {
        return this.aD(askj.d, asjg);
    }
    
    public final ashi u(final asjg asjg) {
        final asjm d = askj.d;
        return this.a(d, d, asjg, askj.c);
    }
    
    public final ashi v(final asjm asjm) {
        final asjm d = askj.d;
        final asjg c = askj.c;
        return this.a(d, asjm, c, c);
    }
    
    public final ashi w(final asjm asjm) {
        final asjm d = askj.d;
        final asjg c = askj.c;
        return this.a(asjm, d, c, c);
    }
    
    public final ashi x(final asjm asjm) {
        return this.aD(asjm, askj.c);
    }
    
    public final ashi y(final asjg asjg) {
        return this.a(askj.d, new aska(asjg), asjg, askj.c);
    }
}
