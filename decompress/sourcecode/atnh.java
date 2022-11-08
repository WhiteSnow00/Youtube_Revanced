import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.Callable;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atnh
{
    private atnh() {
    }
    
    public static int a(int n, final int n2) {
        if (n < n2) {
            n = -1;
        }
        else {
            if (n == n2) {
                return 0;
            }
            n = 1;
        }
        return n;
    }
    
    public static void b(final String s) {
        final StringBuilder sb = new StringBuilder("lateinit property ");
        sb.append(s);
        sb.append(" has not been initialized");
        final atju atju = new atju(sb.toString());
        d(atju, atnh.class.getName());
        throw atju;
    }
    
    public static boolean c(final Object o, final Object o2) {
        boolean equals;
        if (o == null) {
            if (o2 == null) {
                return true;
            }
            equals = false;
        }
        else {
            equals = o.equals(o2);
        }
        return equals;
    }
    
    static void d(final Throwable t, final String s) {
        final StackTraceElement[] stackTrace = t.getStackTrace();
        final int length = stackTrace.length;
        int n = -1;
        for (int i = 0; i < length; ++i) {
            if (s.equals(stackTrace[i].getClassName())) {
                n = i;
            }
        }
        t.setStackTrace(Arrays.copyOfRange(stackTrace, n + 1, length));
    }
    
    public static int e(final float n) {
        if (!Float.isNaN(n)) {
            return Math.round(n);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }
    
    public static ashe f(final Object o, asjc l) {
        final atbq atbq = new atbq(o, l);
        l = aulo.l;
        return atbq;
    }
    
    public static boolean g(ashh ashh, final ashj ashj, final asjc asjc) {
        if (ashh instanceof Callable) {
            try {
                final Object call = ((Callable)ashh).call();
                if (call == null) {
                    asjh.d(ashj);
                    return true;
                }
                try {
                    ashh = (ashh)asjc.a(call);
                    asjv.b((Object)ashh, "The mapper returned a null ObservableSource");
                    if (ashh instanceof Callable) {
                        try {
                            final Object call2 = ((Callable)ashh).call();
                            if (call2 == null) {
                                asjh.d(ashj);
                                return true;
                            }
                            final atbp atbp = new atbp(ashj, call2);
                            ashj.d((asic)atbp);
                            atbp.run();
                            return true;
                        }
                        finally {
                            return;
                        }
                    }
                    ashh.aJ(ashj);
                    return true;
                }
                finally {
                    return;
                }
            }
            finally {
                final Throwable t;
                asey.d(t);
                asjh.g(t, ashj);
                return true;
            }
        }
        return false;
    }
}
