import java.util.concurrent.Callable;
import android.view.View$OnClickListener;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.function.Function;
import java.util.function.Predicate;
import j$.util.Optional;
import android.app.Activity;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class imv extends aagb
{
    public final qbo a;
    private final fa e;
    private final thh f;
    private final imh g;
    private final aagu h;
    private final Integer i;
    private final fml j;
    private final toi k;
    private final aaha l;
    private final uyi m;
    private final qbo n;
    private final hyr o;
    private final blt p;
    
    public imv(final fa e, final zki zki, final zzu zzu, final aabt aabt, final zkw zkw, final tny tny, final thh f, final imh g, final aagu h, final aagn aagn, final toi k, final qbo n, final qbo a, final aagv aagv, final Integer i, final yzf yzf, final fml j, final aaha l, final aaal aaal, final Executor executor, final uyi m, final blt p28, final hyr o, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        super((Activity)e, zki, zzu, aabt, zkw, tny, f, (aacf)g, h, aagn, k, aagv, yzf, l, aaal, executor, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.n = n;
        this.a = a;
        this.k = k;
        this.i = i;
        this.j = j;
        this.l = l;
        this.m = m;
        this.p = p28;
        this.o = o;
    }
    
    protected final int a() {
        return this.i;
    }
    
    protected final void b(final String s, final amva amva, final aags aags, final wwv wwv, final amqx amqx, final int n) {
        byte[] array;
        if ((amva.b & 0x80) != 0x0) {
            array = amva.i.I();
        }
        else {
            array = uyp.b;
        }
        this.g.k(amqx);
        if (this.g.m(amva, amqx)) {
            this.h.i(s, amva, wwv, (aagz)new aafy(this, amva, wwv, s, array, aags, n, 1));
            return;
        }
        amuv amuv2;
        if (this.m.ap()) {
            final amuv amuv = (amuv)Optional.ofNullable((Object)amqx).filter((Predicate)ifl.f).map((Function)iem.q).orElse((Object)this.g.v(amuv.a));
            feq.k(Optional.ofNullable((Object)amqx), amuv, amva, wwv, Optional.of((Object)s), Optional.empty());
            amuv2 = amuv;
        }
        else {
            amuv amuv3;
            if (amqx != null && (amqx.b & 0x1) != 0x0) {
                if ((amuv3 = amuv.b(amqx.c)) == null) {
                    amuv3 = amuv.a;
                }
            }
            else {
                amuv3 = this.g.u();
            }
            final zzf a = zzf.a;
            amqw amqw;
            if (amqx != null && (amqx.b & 0x2) != 0x0) {
                if ((amqw = amqw.b(amqx.d)) == null) {
                    amqw = amqw.a;
                }
            }
            else {
                amqw = null;
            }
            aaiw.t(amva, wwv, s, (String)null, amuv3, true, a, amqw);
            amuv2 = amuv3;
        }
        String e;
        if (amqx != null) {
            e = amqx.e;
        }
        else {
            e = null;
        }
        this.l(s, amuv2, e, zzf.a, array, aags, n);
    }
    
    public final void c(final String s, final boolean b) {
        if (!b) {
            this.n.O(s);
            return;
        }
        super.c(s, true);
    }
    
    public final void d(final String s, final boolean b) {
        if (!b) {
            this.n.O(vek.i(s));
            return;
        }
        super.d(s, true);
    }
    
    public final void e(final zzk zzk, final boolean b) {
        if (b) {
            final ieu ieu = new ieu(this, 4);
            final qbo a = this.a;
            if (zzk != null) {
                a.L(aexq.j(zzk.d()), Long.valueOf(zzk.a()), (aagx)ieu);
            }
            return;
        }
        this.f();
    }
    
    public final void f() {
        try {
            this.o.E();
        }
        catch (final aaan aaan) {
            trn.d(String.format("Offline refresh error. Msg: %s", aaan.getMessage()), (Throwable)aaan);
        }
    }
    
    protected final void g(final String s, final String s2, final aags aags, final int n) {
        if (this.f.p()) {
            final boolean f = aexs.f(s);
            int n2 = 1;
            if (!f) {
                if (s.equals("PPSV")) {
                    n2 = n2;
                }
                else {
                    n2 = 0;
                }
            }
            final fa e = this.e;
            ListenableFuture listenableFuture;
            if (n2 != 0) {
                final blt p4 = this.p;
                listenableFuture = afrp.e((ListenableFuture)aftj.m(p4.v().l().h(s2)), (aexg)new nob(p4, s2, n, 1, (byte[])null, (byte[])null, (byte[])null, (byte[])null), (Executor)p4.e);
            }
            else {
                final blt p5 = this.p;
                s.getClass();
                listenableFuture = p5.w(s2, s);
            }
            tcp.n((aum)e, listenableFuture, (trb)new eyc(this, aags, s2, 8), (trb)new eyc(this, aags, s2, 9));
            return;
        }
        this.k.b();
    }
    
    protected final void h(final int n) {
        Label_0143: {
            if (this.l.e()) {
                final aqoo w = this.g.w();
                if (this.f.r()) {
                    break Label_0143;
                }
                if (w != aqoo.b) {
                    if (w != aqoo.c || this.f.q()) {
                        break Label_0143;
                    }
                }
            }
            else if (!this.g.l() || this.f.r()) {
                break Label_0143;
            }
            final qbo n2 = this.n;
            final Object d = n2.d;
            final Object a = n2.a;
            final acty m = n2.M(n);
            m.m(((bu)n2.e).getApplicationContext().getString(2132017678), (View$OnClickListener)a);
            m.h(false);
            ((actx)d).n(m.b());
            return;
        }
        final qbo n3 = this.n;
        final Object d2 = n3.d;
        final Object c = n3.c;
        final acty i = n3.M(n);
        i.m(((bu)n3.e).getApplicationContext().getString(2132018825), (View$OnClickListener)c);
        i.h(false);
        i.l((actk)new ies(n3, 2, (byte[])null, (byte[])null, (byte[])null));
        ((actx)d2).n(i.b());
    }
    
    public final void i(final String s, final Object o, final wwv wwv) {
        if (o instanceof ajcz) {
            final ajcz ajcz = (ajcz)o;
            final qbo n = this.n;
            ((actx)n.d).n(n.N(ajcz.e).b());
            return;
        }
        this.q(s, o, wwv);
    }
    
    protected final boolean j(final String s, final zzl zzl) {
        final boolean b = zzl != null && zzl.q();
        final boolean p2 = this.j.p(s);
        return b || p2;
    }
    
    protected final void k(final int n) {
        if (!this.f.p()) {
            this.k.b();
            return;
        }
        if (aexs.f((String)null)) {
            final blt p = this.p;
            afrp.e(afrp.e(afrp.f((ListenableFuture)aftj.m(p.v().l().g()), (afry)new ikc(p, 4, (byte[])null, (byte[])null, (byte[])null, (byte[])null), (Executor)p.e), (aexg)imx.b, (Executor)p.e), (aexg)new lmp(p, n, 1, (byte[])null, (byte[])null, (byte[])null, (byte[])null), (Executor)p.e);
            return;
        }
        final blt p2 = this.p;
        afrp.f(afrp.e((ListenableFuture)aftj.m(p2.v().i().E()), (aexg)imx.a, (Executor)p2.e), (afry)new ikc(p2, 5, (byte[])null, (byte[])null, (byte[])null, (byte[])null), (Executor)p2.e);
    }
    
    public final void l(final String s, final amuv amuv, final String s2, final zzf zzf, final byte[] array, final aags aags, final int n) {
        final fa e = this.e;
        final blt p7 = this.p;
        tcp.n((aum)e, afld.k((Callable)new imw(p7, s, amuv, s2, zzf, array, n, null, null, null, null), (Executor)p7.e), (trb)new eyc(this, aags, s, 10), (trb)new eyc(this, aags, s, 11));
    }
}
