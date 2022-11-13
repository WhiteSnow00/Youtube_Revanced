import java.util.concurrent.Callable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class igw implements igq
{
    public final igu a;
    public final Executor b;
    public final vai c;
    
    public igw(final igu a, final Executor b, final vai c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static igv d(final amar amar) {
        final amam c = amar.c();
        ancy f = null;
        Object f2 = null;
        if (c != null) {
            f = c.f();
            if (f != null) {
                f2 = f.f();
            }
        }
        else {
            f2 = null;
        }
        return new igv(Optional.ofNullable((Object)f), Optional.ofNullable(f2), Optional.ofNullable((Object)c));
    }
    
    public static final aezq e(final amar amar) {
        final amam c = amar.c();
        ancy f = null;
        Object f2 = null;
        if (c != null) {
            f = c.f();
            if (f != null) {
                f2 = f.f();
            }
        }
        else {
            f2 = null;
        }
        return aezq.a((Object)Optional.ofNullable((Object)f), (Object)Optional.ofNullable(f2));
    }
    
    public final ListenableFuture a(final igp igp) {
        if (this.c.az()) {
            return aftq.f((ListenableFuture)afvk.m(afnd.o((Callable)new hvu(igp, 15), this.b)), (aftz)new igl(this, 10), this.b);
        }
        return aftq.f((ListenableFuture)afvk.m(afwm.q((Callable)new hvu(igp, 9), this.b)), (aftz)new igl(this, 3), this.b);
    }
    
    public final ListenableFuture b(final igp igp) {
        if (this.c.az()) {
            return aftq.f((ListenableFuture)afvk.m(afnd.o((Callable)new hvu(igp, 8), this.b)), (aftz)new igl(this, 6), this.b);
        }
        return aftq.f((ListenableFuture)afvk.m(afwm.q((Callable)new hvu(igp, 12), this.b)), (aftz)new igl(this, 7), this.b);
    }
    
    public final ListenableFuture c(final igp igp) {
        if (this.c.az()) {
            return aftq.f((ListenableFuture)afvk.m(afnd.o((Callable)new hvu(igp, 13), this.b)), (aftz)new igl(this, 8), this.b);
        }
        return aftq.f((ListenableFuture)afvk.m(afwm.q((Callable)new hvu(igp, 14), this.b)), (aftz)new igl(this, 9), this.b);
    }
}
