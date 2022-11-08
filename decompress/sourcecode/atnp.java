import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicLong;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atnp
{
    public static void a(Object o, final String s) {
        String name;
        if (o == null) {
            name = "null";
        }
        else {
            name = o.getClass().getName();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" cannot be cast to ");
        sb.append(s);
        o = new ClassCastException(sb.toString());
        atnh.d((Throwable)o, atnp.class.getName());
        throw o;
    }
    
    public static boolean b(final Object o, final int n) {
        if (o instanceof atjk) {
            int arity;
            if (o instanceof atne) {
                arity = ((atne)o).getArity();
            }
            else if (o instanceof atma) {
                arity = 0;
            }
            else if (o instanceof atml) {
                arity = 1;
            }
            else if (o instanceof atmp) {
                arity = 2;
            }
            else if (o instanceof atmq) {
                arity = 3;
            }
            else if (o instanceof atmr) {
                arity = 4;
            }
            else if (o instanceof atms) {
                arity = 5;
            }
            else if (o instanceof atmt) {
                arity = 6;
            }
            else if (o instanceof atmu) {
                arity = 7;
            }
            else if (o instanceof atmv) {
                arity = 8;
            }
            else if (o instanceof atmw) {
                arity = 9;
            }
            else if (o instanceof atmb) {
                arity = 10;
            }
            else if (o instanceof atmc) {
                arity = 11;
            }
            else if (o instanceof atmd) {
                arity = 12;
            }
            else if (o instanceof atme) {
                arity = 13;
            }
            else if (o instanceof atmf) {
                arity = 14;
            }
            else if (o instanceof atmg) {
                arity = 15;
            }
            else if (o instanceof atmh) {
                arity = 16;
            }
            else if (o instanceof atmi) {
                arity = 17;
            }
            else if (o instanceof atmj) {
                arity = 18;
            }
            else if (o instanceof atmk) {
                arity = 19;
            }
            else if (o instanceof atmm) {
                arity = 20;
            }
            else if (o instanceof atmn) {
                arity = 21;
            }
            else if (o instanceof atmo) {
                arity = 22;
            }
            else {
                arity = -1;
            }
            if (arity == n) {
                return true;
            }
        }
        return false;
    }
    
    public static void c(final Object o, final int n) {
        if (!b(o, n)) {
            final StringBuilder sb = new StringBuilder("kotlin.jvm.functions.Function");
            sb.append(n);
            a(o, sb.toString());
        }
    }
    
    public static int d(final int n, final int n2) {
        if (n < n2) {
            return n2;
        }
        return n;
    }
    
    public static int e(final int n, final int n2) {
        if (n > n2) {
            return n2;
        }
        return n;
    }
    
    public static long f(final long n, final long n2) {
        if (n < n2) {
            return n2;
        }
        return n;
    }
    
    public static long g(final long n, final long n2) {
        if (n > n2) {
            return n2;
        }
        return n;
    }
    
    public static long h(final long n, final long n2, final long n3) {
        if (n2 > n3) {
            final StringBuilder sb = new StringBuilder("Cannot coerce value to an empty range: maximum ");
            sb.append(n3);
            sb.append(" is less than minimum ");
            sb.append(n2);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        }
        if (n < n2) {
            return n2;
        }
        if (n > n3) {
            return n3;
        }
        return n;
    }
    
    public static long i(final AtomicLong atomicLong, final long n) {
        long value;
        do {
            value = atomicLong.get();
            if (value == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(value, k(value, n)));
        return value;
    }
    
    public static long j(final AtomicLong atomicLong, final long n) {
        long value;
        do {
            value = atomicLong.get();
            if (value == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            if (value == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(value, k(value, n)));
        return value;
    }
    
    public static long k(long n, long n2) {
        n2 = (n += n2);
        if (n2 < 0L) {
            n = Long.MAX_VALUE;
        }
        return n;
    }
    
    public static long l(final long n, final long n2) {
        final long n3 = n * n2;
        if ((n | n2) >>> 31 != 0L && n3 / n != n2) {
            return Long.MAX_VALUE;
        }
        return n3;
    }
    
    public static void m(final AtomicLong atomicLong, final long n) {
        long value;
        long n2;
        do {
            value = atomicLong.get();
            if (value == Long.MAX_VALUE) {
                return;
            }
            final long n3 = n2 = value - n;
            if (n3 >= 0L) {
                continue;
            }
            final StringBuilder sb = new StringBuilder("More produced than requested: ");
            sb.append(n3);
            aulo.r((Throwable)new IllegalStateException(sb.toString()));
            n2 = 0L;
        } while (!atomicLong.compareAndSet(value, n2));
    }
    
    public static void n(final AtomicLong atomicLong, final long n) {
        long value;
        long n2;
        do {
            value = atomicLong.get();
            if (value == Long.MIN_VALUE) {
                return;
            }
            if (value == Long.MAX_VALUE) {
                return;
            }
            final long n3 = n2 = value - n;
            if (n3 >= 0L) {
                continue;
            }
            final StringBuilder sb = new StringBuilder("More produced than requested: ");
            sb.append(n3);
            aulo.r((Throwable)new IllegalStateException(sb.toString()));
            n2 = 0L;
        } while (!atomicLong.compareAndSet(value, n2));
    }
}
