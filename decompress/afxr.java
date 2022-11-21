import java.util.concurrent.ExecutionException;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ExecutorService;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public class afxr
{
    public static int A(final long n) {
        return (int)(n ^ n >>> 32);
    }
    
    public static int B(final long n) {
        final int n2 = (int)n;
        adme.O(n2 == n, "Out of range: %s", n);
        return n2;
    }
    
    public static int C(final int n, final int n2, final int n3) {
        adme.Q(true, "min (%s) must be less than or equal to max (%s)", n2, n3);
        return Math.min(Math.max(n, n2), n3);
    }
    
    public static int D(final int[] array, final int n, int i, final int n2) {
        while (i < n2) {
            if (array[i] == n) {
                return i;
            }
            ++i;
        }
        return -1;
    }
    
    public static int E(final int... array) {
        int i = 1;
        adme.K(true);
        int n = array[0];
        while (i < 3) {
            final int n2 = array[i];
            int n3;
            if (n2 < (n3 = n)) {
                n3 = n2;
            }
            ++i;
            n = n3;
        }
        return n;
    }
    
    public static int F(final long n) {
        if (n > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (n < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int)n;
    }
    
    public static Integer G(final String s) {
        Long n6 = null;
        Label_0173: {
            Label_0007: {
                if (!s.isEmpty()) {
                    int n = 0;
                    final char char1 = s.charAt(0);
                    if (char1 == '-') {
                        n = 1;
                    }
                    if (n != s.length()) {
                        final int n2 = n + 1;
                        final int a = afue.a(s.charAt(n));
                        if (a >= 0) {
                            if (a < 10) {
                                long n3 = -a;
                                for (int i = n2; i < s.length(); ++i) {
                                    final int a2 = afue.a(s.charAt(i));
                                    if (a2 < 0 || a2 >= 10) {
                                        break Label_0007;
                                    }
                                    final long n4 = n3 * 10L;
                                    final long n5 = a2;
                                    if (n4 < Long.MIN_VALUE + n5) {
                                        break Label_0007;
                                    }
                                    n3 = n4 - n5;
                                }
                                if (char1 == '-') {
                                    n6 = n3;
                                    break Label_0173;
                                }
                                if (n3 != Long.MIN_VALUE) {
                                    n6 = -n3;
                                    break Label_0173;
                                }
                            }
                        }
                    }
                }
            }
            n6 = null;
        }
        if (n6 != null && n6 == n6.intValue()) {
            return n6.intValue();
        }
        return null;
    }
    
    public static List H(final int... array) {
        final int length = array.length;
        if (length == 0) {
            return Collections.emptyList();
        }
        return new afuc(array, 0, length);
    }
    
    public static int[] I(final Collection collection) {
        if (collection instanceof afuc) {
            final afuc afuc = (afuc)collection;
            return Arrays.copyOfRange(afuc.a, afuc.b, afuc.c);
        }
        final Object[] array = collection.toArray();
        final int length = array.length;
        final int[] array2 = new int[length];
        for (int i = 0; i < length; ++i) {
            final Object o = array[i];
            o.getClass();
            array2[i] = ((Number)o).intValue();
        }
        return array2;
    }
    
    public static float J(final float n, final float n2, final float n3) {
        if (n2 <= n3) {
            return Math.min(Math.max(n, n2), n3);
        }
        throw new IllegalArgumentException(adzw.O("min (%s) must be less than or equal to max (%s)", new Object[] { n2, n3 }));
    }
    
    public static float[] K(final Collection collection) {
        final Object[] array = collection.toArray();
        final int length = array.length;
        final float[] array2 = new float[length];
        for (int i = 0; i < length; ++i) {
            final Object o = array[i];
            o.getClass();
            array2[i] = ((Number)o).floatValue();
        }
        return array2;
    }
    
    public static ggp L(final Iterable iterable) {
        return new ggp(false, afgh.n(iterable));
    }
    
    @SafeVarargs
    public static ggp M(final ListenableFuture... array) {
        return new ggp(false, afgh.p(array));
    }
    
    public static ggp N(final Iterable iterable) {
        return new ggp(true, afgh.n(iterable));
    }
    
    @SafeVarargs
    public static ggp O(final ListenableFuture... array) {
        return new ggp(true, afgh.p(array));
    }
    
    public static afxj c(final ExecutorService executorService) {
        Object o;
        if (executorService instanceof afxj) {
            o = executorService;
        }
        else if (executorService instanceof ScheduledExecutorService) {
            o = new afxq((ScheduledExecutorService)executorService);
        }
        else {
            o = new afxn(executorService);
        }
        return (afxj)o;
    }
    
    public static afxj d() {
        return (afxj)new afxm();
    }
    
    public static afxk e(final ScheduledExecutorService scheduledExecutorService) {
        Object o;
        if (scheduledExecutorService instanceof afxk) {
            o = scheduledExecutorService;
        }
        else {
            o = new afxq(scheduledExecutorService);
        }
        return (afxk)o;
    }
    
    public static Executor f(final Executor executor) {
        return new afxv(executor);
    }
    
    static Executor g(final Executor executor, final afvd afvd) {
        executor.getClass();
        if (executor == afwd.a) {
            return executor;
        }
        return new afxl(executor, afvd, 0);
    }
    
    public static afgh h(final Iterable iterable) {
        Collection n = (Collection)iterable;
        if (!(iterable instanceof Collection)) {
            n = afgh.n(iterable);
        }
        final int n2 = 0;
        final ListenableFuture[] array = (ListenableFuture[])n.toArray(new ListenableFuture[0]);
        final afwv afwv = new afwv(array);
        final afgc h = afgh.h(array.length);
        for (int i = 0; i < array.length; ++i) {
            h.h(new afwu(afwv));
        }
        final afgh g = h.g();
        for (int j = n2; j < array.length; ++j) {
            array[j].addListener((Runnable)new wud(afwv, g, j, 10), (Executor)afwd.a);
        }
        return g;
    }
    
    public static ListenableFuture i(final Iterable iterable) {
        return (ListenableFuture)new afvy(afgh.n(iterable), true);
    }
    
    public static ListenableFuture j() {
        final afxc a = afxc.a;
        if (a != null) {
            return (ListenableFuture)a;
        }
        return (ListenableFuture)new afxc();
    }
    
    public static ListenableFuture k(final Throwable t) {
        t.getClass();
        return (ListenableFuture)new afxd(t);
    }
    
    public static ListenableFuture l(final Object o) {
        if (o == null) {
            return afxe.a;
        }
        return (ListenableFuture)new afxe(o);
    }
    
    public static ListenableFuture m(final ListenableFuture listenableFuture) {
        if (listenableFuture.isDone()) {
            return listenableFuture;
        }
        final afww afww = new afww(listenableFuture);
        listenableFuture.addListener((Runnable)afww, (Executor)afwd.a);
        return (ListenableFuture)afww;
    }
    
    public static ListenableFuture n(final afvp afvp, final long n, final TimeUnit timeUnit, final ScheduledExecutorService scheduledExecutorService) {
        final afyc c = afyc.c(afvp);
        ((afvd)c).addListener(new aevy(scheduledExecutorService.schedule((Runnable)c, n, timeUnit), 9), afwd.a);
        return (ListenableFuture)c;
    }
    
    public static ListenableFuture o(final Runnable runnable, final Executor executor) {
        final afyc e = afyc.e(runnable, (Object)null);
        executor.execute((Runnable)e);
        return (ListenableFuture)e;
    }
    
    public static ListenableFuture p(final Callable callable, final Executor executor) {
        final afyc d = afyc.d(callable);
        executor.execute((Runnable)d);
        return (ListenableFuture)d;
    }
    
    public static ListenableFuture q(final afvp afvp, final Executor executor) {
        final afyc c = afyc.c(afvp);
        executor.execute((Runnable)c);
        return (ListenableFuture)c;
    }
    
    public static ListenableFuture r(final Iterable iterable) {
        return (ListenableFuture)new afvy(afgh.n(iterable), false);
    }
    
    public static ListenableFuture s(final ListenableFuture listenableFuture, final long n, final TimeUnit timeUnit, final ScheduledExecutorService scheduledExecutorService) {
        if (listenableFuture.isDone()) {
            return listenableFuture;
        }
        final afxz afxz = new afxz(listenableFuture);
        final afxx afxx = new afxx(afxz);
        afxz.b = scheduledExecutorService.schedule(afxx, n, timeUnit);
        listenableFuture.addListener((Runnable)afxx, (Executor)afwd.a);
        return (ListenableFuture)afxz;
    }
    
    public static Object t(final Future future) {
        adme.W(future.isDone(), "Future was expected to be done: %s", future);
        return aewr.G(future);
    }
    
    public static Object u(final Future future) {
        future.getClass();
        try {
            return aewr.G(future);
        }
        catch (final ExecutionException ex) {
            final Throwable cause = ex.getCause();
            if (cause instanceof Error) {
                throw new afwe((Error)cause);
            }
            throw new afyd(cause);
        }
    }
    
    public static void v(final ListenableFuture listenableFuture, final afwr afwr, final Executor executor) {
        afwr.getClass();
        listenableFuture.addListener((Runnable)new afws((Future)listenableFuture, afwr, 0), executor);
    }
    
    public static void w(final ListenableFuture listenableFuture, final Future future) {
        if (listenableFuture instanceof afvd) {
            ((afvd)listenableFuture).k(future);
            return;
        }
        if (listenableFuture != null && listenableFuture.isCancelled() && future != null) {
            future.cancel(false);
        }
    }
    
    public static Callable x() {
        return (Callable)new vcs(9);
    }
    
    public static void y(final Throwable t, final Throwable t2) {
        try {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(t, t2);
        }
        catch (final Exception ex) {}
    }
    
    public static int z(final long n, final long n2) {
        int n3;
        if (n < n2) {
            n3 = -1;
        }
        else {
            if (n > n2) {
                return 1;
            }
            n3 = 0;
        }
        return n3;
    }
}
