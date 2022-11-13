import java.util.concurrent.Callable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class flf implements zzx
{
    private final fln a;
    private final fln b;
    private final Executor c;
    private final vai d;
    
    public flf(final fln a, final fln b, final Executor c, final vai d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static final amtj b(final String c) {
        final ahaz builder = ((ahbh)amtj.a).createBuilder();
        builder.copyOnWrite();
        final amtj amtj = (amtj)builder.instance;
        c.getClass();
        amtj.b |= 0x1;
        amtj.c = c;
        return (amtj)builder.build();
    }
    
    public final ListenableFuture a() {
        final pa a = fll.a();
        a.d(ajhp.b);
        final fll c = a.c();
        final ListenableFuture e = aftq.e((ListenableFuture)afvk.m(vdh.aY(this.a.e(c).J((asjr)exp.p))), (aezf)new fel(6), this.c);
        Object o;
        if (this.d.f(45376145L)) {
            final ListenableFuture e2 = aftq.e((ListenableFuture)afvk.m(vdh.aY(this.b.e(c).J((asjr)exp.p))), (aezf)new fel(8), this.c);
            o = afnd.y(new ListenableFuture[] { e, e2 }).P((Callable)new exo(e, e2, 3), this.c);
        }
        else {
            o = aevf.f(e).g((aezf)fel.f, this.c);
        }
        return afsw.e((ListenableFuture)afvk.m((ListenableFuture)o), (Class)Throwable.class, (aezf)new bwk(10), this.c);
    }
}
