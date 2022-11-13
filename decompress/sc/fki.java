import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fki implements fke
{
    public static final int c = 0;
    public final wxx b;
    private final atke d;
    private final Executor e;
    private final atke f;
    private final oby g;
    private final tnu h;
    private final atke i;
    private final AtomicBoolean j;
    private boolean k;
    private final vai l;
    
    public fki(final atke d, final Executor e, final wxx b, final atke f, final oby g, final tnu h, final atke i, final vai l) {
        this.j = new AtomicBoolean(false);
        this.k = false;
        this.d = d;
        this.e = e;
        this.b = b;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.l = l;
    }
    
    private final long p(final asht asht) {
        synchronized (this) {
            final AtomicLong atomicLong = new AtomicLong();
            asjv.b((AtomicReference)asht.aH((asjm)new fcx(atomicLong, 8)));
            return atomicLong.get();
        }
    }
    
    private final boolean q(final int n) {
        return (n & this.h.b(tnu.Q)) == 0x0;
    }
    
    public final void a() {
        if (this.q(4)) {
            return;
        }
        this.n("th0");
    }
    
    public final void b() {
        if (this.q(32)) {
            return;
        }
        if (!this.k) {
            return;
        }
        this.l("short_t");
    }
    
    public final void c() {
        if (this.q(32)) {
            return;
        }
        if (!(this.k = ((tdz)this.i.a()).b(this.p(this.l.n(45382276L)) * 0.01f))) {
            return;
        }
        this.m("short_t");
    }
    
    public final void d() {
        if (this.q(16)) {
            return;
        }
        this.l("shorts_l");
    }
    
    public final void e() {
        if (this.q(16)) {
            return;
        }
        this.m("shorts_l");
    }
    
    public final void f() {
        if (this.q(8)) {
            return;
        }
        this.l("watch_l");
    }
    
    public final void g() {
        if (this.q(8)) {
            return;
        }
        this.m("watch_l");
    }
    
    public final void h() {
    }
    
    public final void i() {
    }
    
    public final void j() {
        if (this.q(2)) {
            return;
        }
        if (this.j.compareAndSet(false, true)) {
            this.n("uiwwa_pre");
        }
    }
    
    public final void k() {
    }
    
    final void l(final String s) {
        afnd.s(((ofs)this.d.a()).a((Object)s), (afva)new fkh(this, s, 0), this.e);
    }
    
    final void m(final String s) {
        afnd.s(((ofs)this.d.a()).b((Object)s), (afva)new npp(s, 1), this.e);
    }
    
    final void n(final String s) {
        afnd.s(((ofs)this.d.a()).c(), (afva)new fkh(this, s, 1), this.e);
    }
    
    public final void o(final String c, int i, final Collection collection) {
        if (collection.isEmpty()) {
            return;
        }
        final aknr d = aknt.d();
        final ahaz builder = ((ahbh)aoqj.a).createBuilder();
        final ahaz builder2 = ((ahbh)aoqk.a).createBuilder();
        final ahaz builder3 = ((ahbh)aosn.a).createBuilder();
        builder3.copyOnWrite();
        final aosn aosn = (aosn)builder3.instance;
        aosn.b |= 0x1;
        aosn.c = c;
        builder3.copyOnWrite();
        final aosn aosn2 = (aosn)builder3.instance;
        aosn2.d = i - 1;
        aosn2.b |= 0x2;
        for (final oft oft : collection) {
            final ahaz builder4 = ((ahbh)aosm.a).createBuilder();
            final String a = oft.a;
            builder4.copyOnWrite();
            final aosm aosm = (aosm)builder4.instance;
            aosm.b |= 0x1;
            aosm.c = a;
            i = oft.d;
            builder4.copyOnWrite();
            final aosm aosm2 = (aosm)builder4.instance;
            aosm2.b |= 0x8;
            aosm2.e = i;
            i = oft.c;
            builder4.copyOnWrite();
            final aosm aosm3 = (aosm)builder4.instance;
            aosm3.b |= 0x4;
            aosm3.d = i;
            final ofp a2 = oft.a();
            final long millis = TimeUnit.NANOSECONDS.toMillis(a2.b);
            builder4.copyOnWrite();
            final aosm aosm4 = (aosm)builder4.instance;
            aosm4.b |= 0x10;
            aosm4.f = millis;
            final long millis2 = TimeUnit.NANOSECONDS.toMillis(a2.c);
            builder4.copyOnWrite();
            final aosm aosm5 = (aosm)builder4.instance;
            aosm5.b |= 0x20;
            aosm5.g = millis2;
            final long d2 = a2.d;
            builder4.copyOnWrite();
            final aosm aosm6 = (aosm)builder4.instance;
            aosm6.b |= 0x40;
            aosm6.h = d2;
            final long b = a2.b;
            final long n = a2.c + b;
            if (n == 0L) {
                i = 0;
            }
            else {
                i = afwm.G(b * 100L / n);
            }
            builder4.copyOnWrite();
            final aosm aosm7 = (aosm)builder4.instance;
            aosm7.b |= 0x80;
            aosm7.i = i;
            final aosm aosm8 = (aosm)builder4.build();
            builder3.copyOnWrite();
            final aosn aosn3 = (aosn)builder3.instance;
            aosm8.getClass();
            final ahbx e = aosn3.e;
            if (!e.c()) {
                aosn3.e = ahbh.mutableCopy(e);
            }
            aosn3.e.add((Object)aosm8);
        }
        final aosn j = (aosn)builder3.build();
        builder2.copyOnWrite();
        final aoqk aoqk = (aoqk)builder2.instance;
        j.getClass();
        aoqk.j = j;
        aoqk.b |= 0x2000;
        final aoqk c2 = (aoqk)builder2.build();
        builder.copyOnWrite();
        final aoqj aoqj = (aoqj)builder.instance;
        c2.getClass();
        aoqj.c = c2;
        aoqj.b |= 0x1;
        final aoqj aoqj2 = (aoqj)builder.build();
        ((ahaz)d).copyOnWrite();
        aknt.cf((aknt)d.instance, aoqj2);
        final aknt aknt = (aknt)((ahaz)d).build();
        if ("app_l".equals(c)) {
            ((tok)this.f.a()).g(tok.a).ab((asjm)new fkg(this, aknt, this.g.c()), (asjm)ezq.m);
            return;
        }
        this.b.d(aknt);
    }
}
