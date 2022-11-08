import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Future;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jkw implements adee
{
    public final acvy a;
    private final ScheduledExecutorService b;
    private final adee c;
    private final adee d;
    private final adee e;
    private final adee f;
    private final zki g;
    
    public jkw(final ScheduledExecutorService b, final adee c, final adee d, final adee e, final adee f, final zki g, final acvy a) {
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
    
    public static final anwa e(anwa anwa, final int c) {
        final agza builder = ((agzi)anwa.a).createBuilder();
        final int b = anwa.b;
        if ((b & 0x2) != 0x0) {
            anvy anvy;
            if ((anvy = anwa.d) == null) {
                anvy = anvy.a;
            }
            final agza builder2 = ((agzi)anvy).toBuilder();
            anvy anvy2;
            if ((anvy2 = anwa.d) == null) {
                anvy2 = anvy.a;
            }
            akxf akxf;
            if ((akxf = anvy2.d) == null) {
                akxf = akxf.a;
            }
            final agza builder3 = ((agzi)akxf).toBuilder();
            builder3.copyOnWrite();
            final akxf akxf2 = (akxf)builder3.instance;
            akxf2.b |= 0x1;
            akxf2.c = c;
            final akxf d = (akxf)builder3.build();
            builder2.copyOnWrite();
            final anvy anvy3 = (anvy)builder2.instance;
            d.getClass();
            anvy3.d = d;
            anvy3.b |= 0x10;
            final anvy d2 = (anvy)builder2.build();
            builder.copyOnWrite();
            final anwa anwa2 = (anwa)builder.instance;
            d2.getClass();
            anwa2.d = d2;
            anwa2.b |= 0x2;
            return (anwa)builder.build();
        }
        if ((b & 0x8) != 0x0) {
            ajzo ajzo;
            if ((ajzo = anwa.f) == null) {
                ajzo = ajzo.a;
            }
            final agza builder4 = ((agzi)ajzo).toBuilder();
            ajzo ajzo2;
            if ((ajzo2 = anwa.f) == null) {
                ajzo2 = ajzo.a;
            }
            akxf akxf3;
            if ((akxf3 = ajzo2.g) == null) {
                akxf3 = akxf.a;
            }
            final agza builder5 = ((agzi)akxf3).toBuilder();
            builder5.copyOnWrite();
            final akxf akxf4 = (akxf)builder5.instance;
            akxf4.b |= 0x1;
            akxf4.c = c;
            final akxf g = (akxf)builder5.build();
            builder4.copyOnWrite();
            final ajzo ajzo3 = (ajzo)builder4.instance;
            g.getClass();
            ajzo3.g = g;
            ajzo3.b |= 0x40;
            final ajzo f = (ajzo)builder4.build();
            builder.copyOnWrite();
            anwa = (anwa)builder.instance;
            f.getClass();
            anwa.f = f;
            anwa.b |= 0x8;
            return (anwa)builder.build();
        }
        anwa anwa3 = anwa;
        if ((b & 0x800) != 0x0) {
            ankl ankl;
            if ((ankl = anwa.n) == null) {
                ankl = ankl.a;
            }
            final agza builder6 = ankl.toBuilder();
            ankl ankl2;
            if ((ankl2 = anwa.n) == null) {
                ankl2 = ankl.a;
            }
            akxf akxf5;
            if ((akxf5 = ankl2.e) == null) {
                akxf5 = akxf.a;
            }
            final agza builder7 = ((agzi)akxf5).toBuilder();
            builder7.copyOnWrite();
            final akxf akxf6 = (akxf)builder7.instance;
            akxf6.b |= 0x1;
            akxf6.c = c;
            final akxf e = (akxf)builder7.build();
            builder6.copyOnWrite();
            final ankl ankl3 = (ankl)builder6.instance;
            e.getClass();
            ankl3.e = e;
            ankl3.b |= 0x10;
            final ankl n = (ankl)builder6.build();
            builder.copyOnWrite();
            final anwa anwa4 = (anwa)builder.instance;
            n.getClass();
            anwa4.n = n;
            anwa4.b |= 0x800;
            anwa3 = (anwa)builder.build();
        }
        return anwa3;
    }
    
    public static final String f(final anwa anwa) {
        final int b = anwa.b;
        if ((b & 0x2) != 0x0) {
            anvy anvy;
            if ((anvy = anwa.d) == null) {
                anvy = anvy.a;
            }
            ajsq ajsq;
            if ((ajsq = anvy.c) == null) {
                ajsq = ajsq.a;
            }
            return abyh.b(ajsq).toString();
        }
        if ((b & 0x8) != 0x0) {
            ajzo ajzo;
            if ((ajzo = anwa.f) == null) {
                ajzo = ajzo.a;
            }
            ajsq ajsq2;
            if ((ajsq2 = ajzo.f) == null) {
                ajsq2 = ajsq.a;
            }
            return abyh.b(ajsq2).toString();
        }
        if ((b & 0x800) != 0x0) {
            ankl ankl;
            if ((ankl = anwa.n) == null) {
                ankl = ankl.a;
            }
            return ankl.c;
        }
        return "";
    }
    
    public final ListenableFuture a(final String s, final aexq aexq) {
        final ListenableFuture e = ((jkz)this.e).e(s);
        final anvz c = ((agmd)tcp.h((Future)e, (Object)new agmd(s, akwr.a))).c();
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
        final ListenableFuture a = this.c.a(s, aexq);
        final ListenableFuture e2 = ((jkx)this.d).e(s);
        final ListenableFuture t = afva.t(afva.n(a), this.a.c(), TimeUnit.MILLISECONDS, this.b);
        final ListenableFuture k = afva.E(t, e2).k(aesm.c((afrx)new pgk(this, t, e2, a, 1)), (Executor)this.b);
        final agmd agmd = (agmd)tcp.h((Future)((jla)this.f).e(s), (Object)new agmd(s, akwr.a));
        ListenableFuture listenableFuture = k;
        if (agmd.a != null) {
            listenableFuture = afva.E(k).k(aesm.c((afrx)new jkv(k, s, agmd, 1, null)), (Executor)this.b);
        }
        if (size != 0) {
            listenableFuture = afva.E(listenableFuture).k(aesm.c((afrx)new jkv(listenableFuture, s, c, 0)), (Executor)this.b);
        }
        listenableFuture.addListener((Runnable)new jcd(a, 9), (Executor)afsl.a);
        return listenableFuture;
    }
    
    public final ListenableFuture b() {
        return this.c.b();
    }
    
    public final ListenableFuture c() {
        if (this.g.c().z()) {
            return this.f.c();
        }
        return this.c.c();
    }
    
    public final void d() {
        this.c.d();
    }
}
