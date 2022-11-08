import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.Collections;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class exe implements tec
{
    public final arhr a;
    public final zki b;
    public ext c;
    public final uyi d;
    private final arhr e;
    private final atje f;
    private final rkw g;
    private final Executor h;
    private final uyf i;
    
    public exe(final arhr a, final arhr e, final arhr arhr, final uyf i, final zki b, final Executor h, final asho asho, final tdz tdz, final uyi d, final rkw g) {
        this.c = ext.a;
        this.a = a;
        this.e = e;
        this.i = i;
        this.b = b;
        this.g = g;
        this.h = h;
        this.d = d;
        this.f = ((atje)atir.aR((Object)b.c().b())).aX();
        if (gkt.v(i)) {
            h.execute((Runnable)new tu(this, arhr, asho, tdz, 15));
        }
        else {
            a.a();
            e.a();
            this.h(arhr, asho, tdz);
        }
        this.o();
    }
    
    public static boolean k(final boolean b) {
        return !b;
    }
    
    private final void o() {
        tcp.i(qsq.c(this.b.c(), this.g, this.h), (tco)new exa(this, this.b(), 0));
    }
    
    public final ewx a(final ewx ewx) {
        ewx ewx2 = ewx;
        if (ewx != null) {
            ewx2 = ewx;
            if (!ewx.i) {
                ewx2 = ewx;
                if (qsq.e(this.b.c())) {
                    if (this.d.bT()) {
                        final agza builder = ewx.toBuilder();
                        builder.copyOnWrite();
                        final ewx ewx3 = (ewx)builder.instance;
                        ewx3.b |= 0x1;
                        ewx3.c = true;
                        builder.copyOnWrite();
                        final ewx ewx4 = (ewx)builder.instance;
                        ewx4.b |= 0x2;
                        ewx4.d = 1320;
                        return (ewx)builder.build();
                    }
                    final agza builder2 = ewx.toBuilder();
                    builder2.copyOnWrite();
                    final ewx ewx5 = (ewx)builder2.instance;
                    ewx5.b |= 0x1;
                    ewx5.c = true;
                    ewx2 = (ewx)builder2.build();
                }
            }
        }
        return ewx2;
    }
    
    public final ewx b() {
        final ewx ewx = (ewx)((tku)this.a.a()).c();
        final String b = this.b.c().b();
        final Map<Object, Object> unmodifiableMap = Collections.unmodifiableMap((Map<?, ?>)((ewz)((tku)this.e.a()).c()).b);
        ewx ewx2 = ewx;
        if (unmodifiableMap.containsKey(b)) {
            ewx2 = ewx;
            if (unmodifiableMap.get(b) != null) {
                ewx2 = unmodifiableMap.get(b);
            }
        }
        return this.a(ewx2);
    }
    
    final ListenableFuture c(final aexg aexg) {
        return ((tku)this.e.a()).b((aexg)new etw(this, aexg, 2));
    }
    
    public final asgn d(final boolean b) {
        final ListenableFuture c = this.c((aexg)new exb(b, 0));
        final asgn d = tmy.cm(c).r((asix)ezm.b).D();
        tcp.m(c, (tcn)new etg(2));
        return d;
    }
    
    final asgn f(final boolean b, final long n) {
        final ListenableFuture c = this.c((aexg)new exc(b, n));
        final asgn e = tmy.cm(c).E((asjd)exd.a);
        tcp.m(c, (tcn)new etg(2));
        return e;
    }
    
    public final ashe g() {
        return ashe.o((ashh)((tku)this.a.a()).d().ai(), (ashh)((tku)this.e.a()).d().ai(), (ashh)this.f, (asiy)new flk(this, 1));
    }
    
    public final void h(final arhr arhr, final asho asho, final tdz tdz) {
        tdz.g((Object)this);
        ((blt)arhr.a()).f().aa(asho).aB((asix)new erw(this, 6));
        if (gkt.v(this.i)) {
            this.j();
        }
    }
    
    public final boolean i() {
        return k(this.b.c().g());
    }
    
    public final boolean j() {
        return this.i() && this.b().c;
    }
    
    public final boolean l() {
        return this.j() && this.b().j;
    }
    
    public final boolean m() {
        return this.b().f;
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            array = null;
            if (n != 0) {
                if (n != 1) {
                    final StringBuilder sb = new StringBuilder("unsupported op code: ");
                    sb.append(n);
                    throw new IllegalStateException(sb.toString());
                }
                final zkx zkx = (zkx)o;
                this.f.tr((Object)this.b.c().b());
                this.o();
            }
            else {
                final zkv zkv = (zkv)o;
                this.f.tr((Object)this.b.c().b());
                this.o();
            }
        }
        else {
            array = new Class[] { zkv.class, zkx.class };
        }
        return array;
    }
    
    public final void n(final boolean b) {
        tcp.m(this.c((aexg)new exb(b, 1)), (tcn)new etg(2));
    }
}
