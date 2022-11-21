import android.util.Pair;
import android.content.Context;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public class aajm implements aakg
{
    private final Activity a;
    public final tre b;
    public final tkq c;
    public final tro d;
    public final aaju e;
    public final acjq f;
    private final zoa g;
    private final zoo h;
    private final aafz i;
    private final aakm j;
    private final aakh k;
    private final aakf l;
    private final aaks m;
    private final aadl n;
    private final zct o;
    
    public aajm(final Activity a, final zoa g, final aadl n, final zoo h, final tre b, final tkq c, final aafz i, final aakm j, final aakh k, final aakf l, final tro d, final acjq f, final zct o, final aaks m, final aaju e, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.g = g;
        this.n = n;
        this.h = h;
        this.b = b;
        this.c = c;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.d = d;
        this.f = f;
        this.o = o;
        this.m = m;
        this.e = e;
    }
    
    public int a() {
        return 0;
    }
    
    @Override
    public void b(final String s, final aajy aajy) {
        if (aajy.a) {
            twd.n(s);
            this.k.d(new aajk(this, s, 0));
            return;
        }
        twd.n(s);
        this.f().r(s);
        this.e(2132019926);
    }
    
    @Override
    public void c(final String s, final aajy aajy) {
        if (aajy.a) {
            twd.n(s);
            final aacp d = this.f().d(s);
            if (d != null) {
                final aajl aajl = new aajl(this, s);
                if (d.e()) {
                    this.k.k(aajl, aajy);
                    return;
                }
                this.k.r(aajl, aajy);
            }
        }
        else {
            twd.n(s);
            if (this.f().d(s) != null) {
                this.i(s);
            }
        }
    }
    
    protected void d(final String s, final amzj amzj, final xab xab, final amvg amvg) {
        byte[] array;
        if ((amzj.b & 0x80) != 0x0) {
            array = amzj.i.I();
        }
        else {
            array = vby.b;
        }
        if (this.i.m(amzj, amvg)) {
            this.k.f(amzj, xab, new aajh(this, amzj, xab, s, array, 0), s);
            return;
        }
        final amze u = this.i.u();
        final aacw a = aacw.a;
        amvf amvf;
        if (amvg != null && (amvg.b & 0x2) != 0x0) {
            if ((amvf = amvf.b(amvg.d)) == null) {
                amvf = amvf.a;
            }
        }
        else {
            amvf = null;
        }
        aamn.t(amzj, xab, null, s, u, true, a, amvf);
        this.l(s, u, aacw.a, array);
    }
    
    public void e(final int n) {
        tqf.x((Context)this.a, n, 1);
    }
    
    public final aagd f() {
        return this.g().i();
    }
    
    public final aage g() {
        return this.n.a();
    }
    
    @Override
    public final void h(final String s) {
        this.k.u(new acyy(this, s));
    }
    
    public final void i(final String s) {
        final aaju e = this.e;
        if (e.b.p()) {
            final int a = this.a();
            if (a != 0) {
                try {
                    final aaed a2 = e.a;
                    final ahcr builder = ((ahcz)amwq.a).createBuilder();
                    builder.copyOnWrite();
                    final amwq amwq = (amwq)builder.instance;
                    amwq.c = 2;
                    amwq.b |= 0x1;
                    final String h = vht.h(a, s);
                    builder.copyOnWrite();
                    final amwq amwq2 = (amwq)builder.instance;
                    h.getClass();
                    amwq2.b |= 0x2;
                    amwq2.d = h;
                    final ahct ahct = (ahct)((ahcz)amwo.b).createBuilder();
                    final int v = ffa.v(306, 3, 2);
                    ((ahcr)ahct).copyOnWrite();
                    final amwo amwo = (amwo)ahct.instance;
                    amwo.c |= 0x1;
                    amwo.d = v;
                    final amwo e2 = (amwo)((ahcr)ahct).build();
                    builder.copyOnWrite();
                    final amwq amwq3 = (amwq)builder.instance;
                    e2.getClass();
                    amwq3.e = e2;
                    amwq3.b |= 0x4;
                    a2.a((amwq)builder.build());
                    return;
                }
                catch (final aaee aaee) {
                    tut.f("[Offline]", "Couldn't delete playlist through orchestration: ".concat(String.valueOf(s)), (Throwable)aaee);
                    return;
                }
            }
        }
        e.d.a().i().z(s);
    }
    
    @Override
    public final void j(final String s, final String s2) {
        twd.n(s2);
        twd.n(s);
        final aadc e = this.g().l().e(s2);
        if (e != null && (!e.s() || !e.w())) {
            return;
        }
        this.j.o(new aajp(this, s, s2, 1));
    }
    
    @Override
    public final void k(final String s, final amzj amzj, final xab xab, final amvg amvg) {
        twd.n(s);
        if (!this.c.o()) {
            this.d.b();
            return;
        }
        if (this.f().d(s) != null) {
            this.m(1);
            return;
        }
        if (amzj == null) {
            this.m(2);
            return;
        }
        if (!amzj.c) {
            amzh amzh;
            if ((amzh = amzj.d) == null) {
                amzh = amzh.a;
            }
            Object o;
            if ((amzh.b & 0x2) != 0x0) {
                amzh amzh2;
                if ((amzh2 = amzj.d) == null) {
                    amzh2 = amzh.a;
                }
                if ((o = amzh2.d) == null) {
                    o = aplb.a;
                }
            }
            else {
                final amzh d = amzj.d;
                amzh a;
                if (d == null) {
                    a = amzh.a;
                }
                else {
                    a = d;
                }
                if ((a.b & 0x1) != 0x0) {
                    amzh a2;
                    if ((a2 = d) == null) {
                        a2 = amzh.a;
                    }
                    if ((o = a2.c) == null) {
                        o = ajhc.a;
                    }
                }
                else {
                    o = null;
                }
            }
            this.l.a(o, xab, null, null);
            return;
        }
        if (!this.g.t()) {
            this.h.b(this.a, (byte[])null, (zom)new aaji(this, s, amzj, xab, amvg));
            return;
        }
        this.d(s, amzj, xab, amvg);
    }
    
    public final void l(final String s, final amze amze, final aacw aacw, final byte[] array) {
        this.k.j(new aajj(this, s, amze, aacw, array));
    }
    
    protected final void m(int n) {
        Label_0131: {
            if (n != 0) {
                if (n != 1) {
                    n = 2132017458;
                }
                else {
                    n = 2132019159;
                }
            }
            else {
                final aqtt w = this.i.w();
                if (w == aqtt.c && !this.c.r() && (!this.m.e() || !this.c.q())) {
                    if (this.m.e() && this.o.j()) {
                        n = 2132017464;
                        break Label_0131;
                    }
                }
                else if (w != aqtt.b || this.c.r()) {
                    n = 2132017459;
                    break Label_0131;
                }
                n = 2132017463;
            }
        }
        this.e(n);
    }
}
