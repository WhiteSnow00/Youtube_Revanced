import j$.time.Duration;
import java.security.InvalidParameterException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ewl
{
    public final tmd a;
    public final tlq b;
    public final tmf c;
    public final atjj d;
    public final atjj e;
    public final atjj f;
    public final Executor g;
    public final asho h;
    public final AtomicBoolean i;
    public final tmb j;
    public final tmb k;
    public final tmb l;
    public final atjj m;
    public final AtomicBoolean n;
    private final double o;
    private final asib p;
    
    public ewl(final tmd a, final tlq b, final Executor g, final asho h, final tmf c, final atjj d, final atjj e, final atjj f, final atjj m) {
        this.a = a;
        this.c = c;
        this.d = d;
        this.e = e;
        this.g = g;
        this.h = h;
        this.f = f;
        this.b = b;
        this.m = m;
        this.j = a.b("critical");
        this.k = a.b("intentCritical");
        this.l = a.b("nonCritical");
        final double n = ewj.a();
        Double.isNaN(n);
        this.o = 1.0 / n;
        this.i = new AtomicBoolean(false);
        this.n = new AtomicBoolean(false);
        this.p = new asib();
    }
    
    static int a(final long n, final int n2) {
        return (int)(n >> n2 & 0xFFL);
    }
    
    static long n(final long n, final long n2, final long n3, final long n4, final long n5, final long n6, final long n7) {
        return n | n2 << 4 | (n3 << 8 | n4 << 12) | (n5 << 16 | 0x100000L) | (n6 << 24 | n7 << 28);
    }
    
    public final long b() {
        final double o = this.o;
        final double n = (double)ewj.d;
        Double.isNaN(n);
        return (long)(o * n);
    }
    
    public final long c() {
        final double o = this.o;
        final double n = (double)ewj.b;
        Double.isNaN(n);
        return (long)(o * n);
    }
    
    public final long d() {
        final double o = this.o;
        final double n = (double)ewj.c;
        Double.isNaN(n);
        return (long)(o * n);
    }
    
    public final long e() {
        final double o = this.o;
        final double n = (double)ewj.a;
        Double.isNaN(n);
        return (long)(o * n);
    }
    
    public final long f() {
        final double o = this.o;
        final double n = (double)ewj.e;
        Double.isNaN(n);
        return (long)(o * n);
    }
    
    public final asgn g() {
        return this.c.d().b();
    }
    
    public final void h(final long n, final asgn asgn) {
        this.p.c(asgn.m(n, TimeUnit.MILLISECONDS, this.h).V((asir)new erx(this, 2)));
    }
    
    public final void i(int n) {
        final long e = this.b.e(tlq.af);
        final int n2 = 4;
        final int n3 = 3;
        if (e != 0L) {
            long n4 = e;
            if (e == 0L) {
                if (ewj.a() == 3) {
                    n4 = n(5L, 4L, 5L, 4L, 4L, 2L, 2L);
                }
                else {
                    n4 = n(3L, 3L, 3L, 2L, 2L, 1L, 1L);
                }
            }
            if (n == 0) {
                this.j.h(a(n4, 0));
                this.k.h(a(n4, 8));
                this.l.h(a(n4, 16));
                n = a(n4, 0);
                this.j.d(n >> 4, n & 0xF, (Throwable)null);
                this.l();
                return;
            }
            if (n == 1) {
                this.k.c(this.j.a(), a(n4, 8));
                this.l.c(this.g(), a(n4, 16));
                final tmb j = this.j;
                final tmb k = this.k;
                n = a(n4, 24);
                try {
                    new tly(j, k, 0, n & 0xF).c();
                    new tly(j, k, 1, n >> 4).c();
                }
                catch (final RuntimeException ex) {
                    j.b.add(ex);
                }
                this.j.j(this.b(), this.h);
                this.k.j(this.d(), this.h);
                this.l.j(this.e(), this.h);
                this.j.a().V((asir)new erx(this, 3));
            }
        }
        else {
            final int a = ewj.a();
            if (n == 0) {
                final tmb i = this.j;
                if (a == 3) {
                    n = n2;
                }
                else {
                    n = 3;
                }
                i.b(1, n);
                final tmb l = this.j;
                n = n3;
                if (a == 3) {
                    n = 5;
                }
                l.b(0, n);
                this.l();
                return;
            }
            if (n == 1) {
                this.k.e(this.j.a(), 2, 3);
                this.l.e(this.g(), 1, 2);
                this.j.j(this.b(), this.h);
                this.k.j(this.d(), this.h);
                this.l.j(this.e(), this.h);
                this.j.a().V((asir)new erx(this, 3));
                return;
            }
            if (n == 2) {
                if (a == 3) {
                    this.k.b(1, 2);
                    this.k.b(0, 2);
                }
            }
            else if (n == 4) {
                if (a == 3) {
                    this.k.b(1, 1);
                }
            }
            else if (a == 3) {
                this.k.b(0, 1);
            }
        }
    }
    
    public final void j() {
        this.c.c().m(tme.f, 1);
    }
    
    public final void k(final int n) {
        this.a.o(33);
        if (this.c.f(tme.d, n)) {
            this.p.b();
            tmd.l(256);
        }
        this.a.j(33);
    }
    
    final void l() {
        this.c.d().g(tme.b).Z((asix)new erw(this, 2));
        if (this.b.m(tlq.ai)) {
            this.h(30000L, this.k.a());
            return;
        }
        this.h(this.c(), asgn.f());
    }
    
    public final void m() {
        final tmf c = this.c;
        if (!c.f.m(tlq.ah)) {
            final tme tme = (tme)c.h.a();
            final int p = tme.p;
            if (p == 0) {
                return;
            }
            tme.m(tme.c, p);
            tme.p = 0;
        }
        else {
            final tme g = c.g;
            if (g.p == 0) {
                return;
            }
            c.i = (c.i || g.a(tme.i) == 1);
            int p2 = 0;
            boolean b = false;
            Label_0200: {
                while (true) {
                    Label_0149: {
                        if ((p2 = c.g.p) != 5) {
                            break Label_0149;
                        }
                        if (c.b - c.c - 1 != 0) {
                            p2 = 5;
                            break Label_0149;
                        }
                        p2 = 5;
                        b = true;
                        break Label_0200;
                    }
                    if (p2 == 6 && c.c++ == 0) {
                        continue;
                    }
                    break;
                }
                if (p2 != 0 && p2 < 5) {
                    throw new InvalidParameterException();
                }
                b = false;
            }
            ++c.b;
            Duration.ofMillis(c.d.d());
            c.g = new tme(c.f, c.a, c.e, p2, (int)(b ? 1 : 0), c.i, c.d, c.b);
        }
        if (this.b.m(tlq.ah)) {
            this.p.b();
            this.i.compareAndSet(true, false);
            this.l();
        }
    }
}
