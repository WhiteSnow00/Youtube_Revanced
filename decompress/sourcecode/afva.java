import java.util.concurrent.ExecutionException;
import java.util.concurrent.Callable;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Future;
import java.security.GeneralSecurityException;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afva
{
    public static int A(final long n, final long n2) {
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
    
    public static int B(final long n) {
        return (int)(n ^ n >>> 32);
    }
    
    public static long C(final long... array) {
        int i = 1;
        agot.u(true);
        long n = array[0];
        while (i < 3) {
            final long n2 = array[i];
            long n3 = n;
            if (n2 > n) {
                n3 = n2;
            }
            ++i;
            n = n3;
        }
        return n;
    }
    
    public static ggc D(final Iterable iterable) {
        return new ggc(false, afcr.n(iterable));
    }
    
    @SafeVarargs
    public static ggc E(final ListenableFuture... array) {
        return new ggc(false, afcr.p((Object[])array));
    }
    
    public static ggc F(final Iterable iterable) {
        return new ggc(true, afcr.n(iterable));
    }
    
    @SafeVarargs
    public static ggc G(final ListenableFuture... array) {
        return new ggc(true, afcr.p((Object[])array));
    }
    
    public static agli H(final String s) {
        final agli agli = afvl.h().get(s);
        if (agli != null) {
            return agli;
        }
        throw new GeneralSecurityException("cannot find key template: ".concat(s));
    }
    
    public static Object a(final Future future) {
        int n = 0;
        while (true) {
            try {
                final Object value = future.get();
                if (n != 0) {
                    Thread.currentThread().interrupt();
                }
                return value;
            }
            catch (final InterruptedException ex) {
                n = 1;
                continue;
            }
            finally {
                if (n != 0) {
                    Thread.currentThread().interrupt();
                }
            }
            break;
        }
    }
    
    public static Object b(final Future p0, final long p1, final TimeUnit p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: istore          4
        //     3: iconst_0       
        //     4: istore          5
        //     6: iload           4
        //     8: istore          6
        //    10: aload_3        
        //    11: lload_1        
        //    12: invokevirtual   java/util/concurrent/TimeUnit.toNanos:(J)J
        //    15: lstore          7
        //    17: iload           4
        //    19: istore          6
        //    21: invokestatic    java/lang/System.nanoTime:()J
        //    24: lstore          9
        //    26: lload           7
        //    28: lstore_1       
        //    29: iload           5
        //    31: istore          6
        //    33: aload_0        
        //    34: lload_1        
        //    35: getstatic       java/util/concurrent/TimeUnit.NANOSECONDS:Ljava/util/concurrent/TimeUnit;
        //    38: invokeinterface java/util/concurrent/Future.get:(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
        //    43: astore_3       
        //    44: iload           5
        //    46: ifeq            55
        //    49: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //    52: invokevirtual   java/lang/Thread.interrupt:()V
        //    55: aload_3        
        //    56: areturn        
        //    57: astore_0       
        //    58: goto            83
        //    61: astore_3       
        //    62: iconst_1       
        //    63: istore          6
        //    65: iconst_1       
        //    66: istore          5
        //    68: invokestatic    java/lang/System.nanoTime:()J
        //    71: lstore_1       
        //    72: lload           9
        //    74: lload           7
        //    76: ladd           
        //    77: lload_1        
        //    78: lsub           
        //    79: lstore_1       
        //    80: goto            29
        //    83: iload           6
        //    85: ifeq            94
        //    88: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //    91: invokevirtual   java/lang/Thread.interrupt:()V
        //    94: goto            99
        //    97: aload_0        
        //    98: athrow         
        //    99: goto            97
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  10     17     57     102    Any
        //  21     26     57     102    Any
        //  33     44     61     83     Ljava/lang/InterruptedException;
        //  33     44     57     102    Any
        //  68     72     57     102    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0055:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static void c(final Throwable t) {
        if (t instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }
    
    public static aftr d(final ExecutorService executorService) {
        Object o;
        if (executorService instanceof aftr) {
            o = executorService;
        }
        else if (executorService instanceof ScheduledExecutorService) {
            o = new afty((ScheduledExecutorService)executorService);
        }
        else {
            o = new aftv(executorService);
        }
        return (aftr)o;
    }
    
    public static aftr e() {
        return (aftr)new aftu();
    }
    
    public static afts f(final ScheduledExecutorService scheduledExecutorService) {
        Object o;
        if (scheduledExecutorService instanceof afts) {
            o = scheduledExecutorService;
        }
        else {
            o = new afty(scheduledExecutorService);
        }
        return (afts)o;
    }
    
    public static Executor g(final Executor executor) {
        return (Executor)new afuc(executor);
    }
    
    public static Executor h(final Executor executor, final afrl afrl) {
        executor.getClass();
        if (executor == afsl.a) {
            return executor;
        }
        return (Executor)new aftt(executor, afrl, 0);
    }
    
    public static afcr i(final Iterable iterable) {
        Object n = iterable;
        if (!(iterable instanceof Collection)) {
            n = afcr.n(iterable);
        }
        final int n2 = 0;
        final ListenableFuture[] array = (ListenableFuture[])((Collection)n).toArray(new ListenableFuture[0]);
        final aftd aftd = new aftd(array);
        final afcm h = afcr.h(array.length);
        for (int i = 0; i < array.length; ++i) {
            h.h(new aftc(aftd));
        }
        final afcr g = h.g();
        for (int j = n2; j < array.length; ++j) {
            array[j].addListener((Runnable)new wqx(aftd, g, j, 10), (Executor)afsl.a);
        }
        return g;
    }
    
    public static ListenableFuture j(final Iterable iterable) {
        return (ListenableFuture)new afsg((afci)afcr.n(iterable), true);
    }
    
    public static ListenableFuture k() {
        final aftk a = aftk.a;
        if (a != null) {
            return (ListenableFuture)a;
        }
        return (ListenableFuture)new aftk();
    }
    
    public static ListenableFuture l(final Throwable t) {
        t.getClass();
        return (ListenableFuture)new aftl(t);
    }
    
    public static ListenableFuture m(final Object o) {
        if (o == null) {
            return aftm.a;
        }
        return (ListenableFuture)new aftm(o);
    }
    
    public static ListenableFuture n(final ListenableFuture listenableFuture) {
        if (listenableFuture.isDone()) {
            return listenableFuture;
        }
        final afte afte = new afte(listenableFuture);
        listenableFuture.addListener((Runnable)afte, (Executor)afsl.a);
        return (ListenableFuture)afte;
    }
    
    public static ListenableFuture o(final afrx afrx, final long n, final TimeUnit timeUnit, final ScheduledExecutorService scheduledExecutorService) {
        final afuj c = afuj.c(afrx);
        ((afrl)c).addListener((Runnable)new aesf((Future)scheduledExecutorService.schedule((Runnable)c, n, timeUnit), 8), (Executor)afsl.a);
        return (ListenableFuture)c;
    }
    
    public static ListenableFuture p(final Runnable runnable, final Executor executor) {
        final afuj e = afuj.e(runnable, (Object)null);
        executor.execute((Runnable)e);
        return (ListenableFuture)e;
    }
    
    public static ListenableFuture q(final Callable callable, final Executor executor) {
        final afuj d = afuj.d(callable);
        executor.execute((Runnable)d);
        return (ListenableFuture)d;
    }
    
    public static ListenableFuture r(final afrx afrx, final Executor executor) {
        final afuj c = afuj.c(afrx);
        executor.execute((Runnable)c);
        return (ListenableFuture)c;
    }
    
    public static ListenableFuture s(final Iterable iterable) {
        return (ListenableFuture)new afsg((afci)afcr.n(iterable), false);
    }
    
    public static ListenableFuture t(final ListenableFuture listenableFuture, final long n, final TimeUnit timeUnit, final ScheduledExecutorService scheduledExecutorService) {
        if (listenableFuture.isDone()) {
            return listenableFuture;
        }
        final afug afug = new afug(listenableFuture);
        final afue afue = new afue(afug);
        afug.b = scheduledExecutorService.schedule((Runnable)afue, n, timeUnit);
        listenableFuture.addListener((Runnable)afue, (Executor)afsl.a);
        return (ListenableFuture)afug;
    }
    
    public static Object u(final Future future) {
        agot.G(future.isDone(), "Future was expected to be done: %s", (Object)future);
        return a(future);
    }
    
    public static Object v(final Future future) {
        future.getClass();
        try {
            return a(future);
        }
        catch (final ExecutionException ex) {
            final Throwable cause = ex.getCause();
            if (cause instanceof Error) {
                throw new afsm((Error)cause);
            }
            throw new afuk(cause);
        }
    }
    
    public static void w(final ListenableFuture listenableFuture, final afsz afsz, final Executor executor) {
        afsz.getClass();
        listenableFuture.addListener((Runnable)new afta((Future)listenableFuture, afsz, 0), executor);
    }
    
    public static void x(final ListenableFuture listenableFuture, final Future future) {
        if (listenableFuture instanceof afrl) {
            ((afrl)listenableFuture).k(future);
            return;
        }
        if (listenableFuture != null && listenableFuture.isCancelled() && future != null) {
            future.cancel(false);
        }
    }
    
    public static Callable y() {
        return (Callable)new xmm(8);
    }
}
