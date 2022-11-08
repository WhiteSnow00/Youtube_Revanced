import java.util.concurrent.Callable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fky implements zyc
{
    private final flg a;
    private final flg b;
    private final Executor c;
    private final uyi d;
    
    public fky(final flg a, final flg b, final Executor c, final uyi d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static final amrf b(final String c) {
        final agza builder = ((agzi)amrf.a).createBuilder();
        builder.copyOnWrite();
        final amrf amrf = (amrf)builder.instance;
        c.getClass();
        amrf.b |= 0x1;
        amrf.c = c;
        return (amrf)builder.build();
    }
    
    public final ListenableFuture a() {
        final pa a = fle.a();
        a.d(ajfl.b);
        final fle c = a.c();
        final ListenableFuture e = afrp.e((ListenableFuture)aftj.m(uji.P(this.a.e(c).J((asjc)exl.p))), new fee(6), this.c);
        Object o;
        if (this.d.f(45376145L)) {
            final ListenableFuture e2 = afrp.e((ListenableFuture)aftj.m(uji.P(this.b.e(c).J((asjc)exl.p))), new fee(8), this.c);
            o = afld.s(new ListenableFuture[] { e, e2 }).P((Callable)new exk(e, e2, 3), this.c);
        }
        else {
            o = aete.f(e).g((aexg)fee.f, this.c);
        }
        return afqv.e((ListenableFuture)aftj.m((ListenableFuture)o), Throwable.class, (aexg)new bwj(10), this.c);
    }
}
