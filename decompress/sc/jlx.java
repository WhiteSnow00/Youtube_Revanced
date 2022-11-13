import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Future;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jlx implements adgg
{
    public final acya a;
    private final ScheduledExecutorService b;
    private final adgg c;
    private final adgg d;
    private final adgg e;
    private final adgg f;
    private final zmf g;
    
    public jlx(final ScheduledExecutorService b, final adgg c, final adgg d, final adgg e, final adgg f, final zmf g, final acya a) {
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        e.getClass();
        this.e = e;
        f.getClass();
        this.f = f;
        g.getClass();
        this.g = g;
        a.getClass();
        this.a = a;
    }
    
    public static final anyd e(anyd anyd, final int c) {
        final ahaz builder = anyd.a.createBuilder();
        final int b = anyd.b;
        if ((b & 0x2) != 0x0) {
            anyb anyb;
            if ((anyb = anyd.d) == null) {
                anyb = anyb.a;
            }
            final ahaz builder2 = anyb.toBuilder();
            anyb anyb2;
            if ((anyb2 = anyd.d) == null) {
                anyb2 = anyb.a;
            }
            akzi akzi;
            if ((akzi = anyb2.d) == null) {
                akzi = akzi.a;
            }
            final ahaz builder3 = ((ahbh)akzi).toBuilder();
            builder3.copyOnWrite();
            final akzi akzi2 = (akzi)builder3.instance;
            akzi2.b |= 0x1;
            akzi2.c = c;
            final akzi d = (akzi)builder3.build();
            builder2.copyOnWrite();
            final anyb anyb3 = (anyb)builder2.instance;
            d.getClass();
            anyb3.d = d;
            anyb3.b |= 0x10;
            final anyb d2 = (anyb)builder2.build();
            builder.copyOnWrite();
            final anyd anyd2 = (anyd)builder.instance;
            d2.getClass();
            anyd2.d = d2;
            anyd2.b |= 0x2;
            return (anyd)builder.build();
        }
        if ((b & 0x8) != 0x0) {
            akbr akbr;
            if ((akbr = anyd.f) == null) {
                akbr = akbr.a;
            }
            final ahaz builder4 = ((ahbh)akbr).toBuilder();
            akbr akbr2;
            if ((akbr2 = anyd.f) == null) {
                akbr2 = akbr.a;
            }
            akzi akzi3;
            if ((akzi3 = akbr2.g) == null) {
                akzi3 = akzi.a;
            }
            final ahaz builder5 = ((ahbh)akzi3).toBuilder();
            builder5.copyOnWrite();
            final akzi akzi4 = (akzi)builder5.instance;
            akzi4.b |= 0x1;
            akzi4.c = c;
            final akzi g = (akzi)builder5.build();
            builder4.copyOnWrite();
            final akbr akbr3 = (akbr)builder4.instance;
            g.getClass();
            akbr3.g = g;
            akbr3.b |= 0x40;
            final akbr f = (akbr)builder4.build();
            builder.copyOnWrite();
            anyd = (anyd)builder.instance;
            f.getClass();
            anyd.f = f;
            anyd.b |= 0x8;
            return (anyd)builder.build();
        }
        anyd anyd3 = anyd;
        if ((b & 0x800) != 0x0) {
            anmo anmo;
            if ((anmo = anyd.n) == null) {
                anmo = anmo.a;
            }
            final ahaz builder6 = ((ahbh)anmo).toBuilder();
            anmo anmo2;
            if ((anmo2 = anyd.n) == null) {
                anmo2 = anmo.a;
            }
            akzi akzi5;
            if ((akzi5 = anmo2.e) == null) {
                akzi5 = akzi.a;
            }
            final ahaz builder7 = ((ahbh)akzi5).toBuilder();
            builder7.copyOnWrite();
            final akzi akzi6 = (akzi)builder7.instance;
            akzi6.b |= 0x1;
            akzi6.c = c;
            final akzi e = (akzi)builder7.build();
            builder6.copyOnWrite();
            final anmo anmo3 = (anmo)builder6.instance;
            e.getClass();
            anmo3.e = e;
            anmo3.b |= 0x10;
            final anmo n = (anmo)builder6.build();
            builder.copyOnWrite();
            anyd = (anyd)builder.instance;
            n.getClass();
            anyd.n = n;
            anyd.b |= 0x800;
            anyd3 = (anyd)builder.build();
        }
        return anyd3;
    }
    
    public static final String f(final anyd anyd) {
        final int b = anyd.b;
        if ((b & 0x2) != 0x0) {
            anyb anyb;
            if ((anyb = anyd.d) == null) {
                anyb = anyb.a;
            }
            ajut ajut;
            if ((ajut = anyb.c) == null) {
                ajut = ajut.a;
            }
            return acak.b(ajut).toString();
        }
        if ((b & 0x8) != 0x0) {
            akbr akbr;
            if ((akbr = anyd.f) == null) {
                akbr = akbr.a;
            }
            ajut ajut2;
            if ((ajut2 = akbr.f) == null) {
                ajut2 = ajut.a;
            }
            return acak.b(ajut2).toString();
        }
        if ((b & 0x800) != 0x0) {
            anmo anmo;
            if ((anmo = anyd.n) == null) {
                anmo = anmo.a;
            }
            return anmo.c;
        }
        return "";
    }
    
    @Override
    public final ListenableFuture a(final String s, final aezp aezp) {
        final ListenableFuture e = ((jlz)this.e).e(s);
        final anyc c = ((agoe)teu.h((Future)e, (Object)new agoe(s, akyu.a))).c();
        int size;
        if (c != null) {
            size = c.b.size();
            if (size >= 20) {
                return e;
            }
        }
        else {
            size = 0;
        }
        final ListenableFuture a = this.c.a(s, aezp);
        final ListenableFuture e2 = ((jly)this.d).e(s);
        final ListenableFuture t = afwm.t(afwm.n(a), (long)this.a.c(), TimeUnit.MILLISECONDS, this.b);
        final ListenableFuture k = afwm.L(new ListenableFuture[] { t, e2 }).k(aeun.c((afty)new phu(this, t, e2, a, 1)), (Executor)this.b);
        final agoe agoe = (agoe)teu.h((Future)((jma)this.f).e(s), (Object)new agoe(s, akyu.a));
        ListenableFuture i = k;
        if (agoe.a != null) {
            i = afwm.L(new ListenableFuture[] { k }).k(aeun.c((afty)new jlw(k, s, agoe, 1, null)), (Executor)this.b);
        }
        ListenableFuture j = i;
        if (size != 0) {
            j = afwm.L(new ListenableFuture[] { i }).k(aeun.c((afty)new jlw(i, s, c, 0)), (Executor)this.b);
        }
        j.addListener((Runnable)new jfu(a, 7), (Executor)afum.a);
        return j;
    }
    
    @Override
    public final ListenableFuture b() {
        return this.c.b();
    }
    
    @Override
    public final ListenableFuture c() {
        if (this.g.c().z()) {
            return this.f.c();
        }
        return this.c.c();
    }
    
    @Override
    public final void d() {
        this.c.d();
    }
}
