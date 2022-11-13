import java.util.concurrent.Callable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class igx implements igq
{
    public final Executor a;
    public final Object b;
    private final int c;
    
    public igx(final igu b, final Executor a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public igx(final zaz b, final Executor a, final int c, final byte[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public static final aezq d(final apys apys) {
        return aezq.a((Object)Optional.ofNullable((Object)apys.f()), (Object)Optional.ofNullable((Object)apys.c()));
    }
    
    public final ListenableFuture a(final igp igp) {
        if (this.c != 0) {
            final Object b = this.b;
            final aabf aabf = (aabf)igp.b();
            aabf.getClass();
            final zaz zaz = (zaz)b;
            return aftq.e((ListenableFuture)afvk.m(aftq.e(((aacf)zaz.b).e(aabf.a()), (aezf)new zrh(aabf, 10), (Executor)zaz.a)), (aezf)new huo(11), this.a);
        }
        return aftq.f((ListenableFuture)afvk.m(afwm.q((Callable)new hvu(igp, 17), this.a)), (aftz)new igl(this, 12), this.a);
    }
    
    public final ListenableFuture b(final igp igp) {
        if (this.c != 0) {
            return ((zaz)this.b).h((aabf)igp.b());
        }
        return aftq.f((ListenableFuture)afvk.m(afwm.q((Callable)new hvu(igp, 18), this.a)), (aftz)new igl(this, 13), this.a);
    }
    
    public final ListenableFuture c(final igp igp) {
        if (this.c != 0) {
            return ((zaz)this.b).i((aabf)igp.b());
        }
        return aftq.f((ListenableFuture)afvk.m(afwm.q((Callable)new hvu(igp, 19), this.a)), (aftz)new igl(this, 14), this.a);
    }
}
