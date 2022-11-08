import java.util.concurrent.atomic.AtomicReference;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atva
{
    public static final long a(final long n, final long n2) {
        return n & ~n2;
    }
    
    public static final long b(final long n, final int n2) {
        return a(n, 1073741823L) | (long)n2;
    }
    
    public static final Object c(final ListenableFuture listenableFuture, final atld atld) {
        try {
            if (listenableFuture.isDone()) {
                return afva.a((Future)listenableFuture);
            }
            final atpe atpe = new atpe(atza.e(atld), 1);
            atpe.t();
            listenableFuture.addListener((Runnable)new aquu(listenableFuture, (atpd)atpe, 4), (Executor)afsl.a);
            ((atpd)atpe).b((atml)new atjw(listenableFuture, 5));
            final Object h = atpe.h();
            final atlk a = atlk.a;
            return h;
        }
        catch (final ExecutionException ex) {
            throw d(ex);
        }
    }
    
    public static final Throwable d(final ExecutionException ex) {
        final Throwable cause = ex.getCause();
        cause.getClass();
        return cause;
    }
    
    public static final Set f() {
        return (Set)new atkx(new atks());
    }
    
    public static final Set g(final Object o) {
        final Set<Object> singleton = Collections.singleton(o);
        singleton.getClass();
        return singleton;
    }
    
    public static Set h(final Set set, final Iterable iterable) {
        set.getClass();
        iterable.getClass();
        final LinkedHashSet set2 = new LinkedHashSet(arsu.f(set.size() + Integer.valueOf(((Collection)iterable).size()).intValue()));
        set2.addAll(set);
        set2.addAll((Collection)iterable);
        return set2;
    }
    
    public static final void i(final Set set) {
        ((atkx)set).a.k();
    }
}
