import java.util.function.Supplier;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adst
{
    private static final afma a;
    
    static {
        a = afma.m("com/google/android/livesharing/internal/ExceptionUtils");
    }
    
    public static ListenableFuture a(final ListenableFuture listenableFuture, final String s, final Object... array) {
        return afun.f(listenableFuture, (Class)Throwable.class, (afvq)new xtd(s, array, 12), adth.a);
    }
    
    public static ListenableFuture b(final ListenableFuture listenableFuture, final String s) {
        return afun.f(listenableFuture, (Class)Throwable.class, (afvq)new zwb(s, 5), adth.a);
    }
    
    public static Object c(final Supplier supplier, final String s) {
        try {
            return supplier.get();
        }
        finally {
            final Throwable t;
            e(t);
            throw adfe.U(s);
        }
    }
    
    public static void d(final Runnable runnable, final String s) {
        final Void void1 = (Void)c((Supplier)new zmn(runnable, 5), s);
    }
    
    public static void e(final Throwable t) {
        f(t, "", new Object[0]);
    }
    
    public static void f(final Throwable t, final String s, final Object... array) {
        ((afly)((afly)((afly)((aflw)adst.a).g()).i(t)).j("com/google/android/livesharing/internal/ExceptionUtils", "recordInternalException", 25, "ExceptionUtils.java")).z(s, array);
    }
}
