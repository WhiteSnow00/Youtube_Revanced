import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atqz
{
    private static aapu a;
    
    private atqz() {
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
        final atnm atnm = new atnm(sb.toString());
        d(atnm, atqz.class.getName());
        throw atnm;
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
        int i = 0;
        int n = -1;
        while (i < length) {
            if (s.equals(stackTrace[i].getClassName())) {
                n = i;
            }
            ++i;
        }
        t.setStackTrace(Arrays.copyOfRange(stackTrace, n + 1, length));
    }
    
    public static boolean e(final AtomicReference atomicReference, final Object o, final Object o2) {
        while (!atomicReference.compareAndSet(o, o2)) {
            if (atomicReference.get() != o) {
                return false;
            }
        }
        return true;
    }
    
    public static int f(final long n) {
        if (n >= -2147483648L && n <= 2147483647L) {
            return (int)n;
        }
        final StringBuilder sb = new StringBuilder("Value cannot fit in an int: ");
        sb.append(n);
        throw new ArithmeticException(sb.toString());
    }
    
    public static long g(final long n, final long n2) {
        final long n3 = n + n2;
        if ((n ^ n3) < 0L && (n ^ n2) >= 0L) {
            final StringBuilder sb = new StringBuilder("The calculation caused an overflow: ");
            sb.append(n);
            sb.append(" + ");
            sb.append(n2);
            throw new ArithmeticException(sb.toString());
        }
        return n3;
    }
    
    public static long h(final long n, final int n2) {
        final long n3 = n2;
        final long n4 = n * n3;
        if (n4 / n3 == n) {
            return n4;
        }
        final StringBuilder sb = new StringBuilder("Multiplication overflows a long: ");
        sb.append(n);
        sb.append(" * ");
        sb.append(n2);
        throw new ArithmeticException(sb.toString());
    }
    
    public static long i(final long n, final long n2) {
        final long n3 = n - n2;
        if ((n ^ n3) < 0L && (n ^ n2) < 0L) {
            final StringBuilder sb = new StringBuilder("The calculation caused an overflow: ");
            sb.append(n);
            sb.append(" - ");
            sb.append(n2);
            throw new ArithmeticException(sb.toString());
        }
        return n3;
    }
    
    public static void j(final auij auij, final int n, final int n2, final int n3) {
        if (n >= n2 && n <= n3) {
            return;
        }
        throw new auiu(auij.p(), n, n2, n3);
    }
    
    public static boolean k(final Object o, final Object o2) {
        return o == o2 || (o != null && o2 != null && o.equals(o2));
    }
    
    public static aapu l() {
        if (atqz.a == null) {
            final aumk aumk = new aumk();
            final aumg aumg = new aumg("P");
            aumk.c((aumm)aumg, (auml)aumg);
            aumk.a(0);
            aumk.h("Y");
            aumk.a(1);
            aumk.h("M");
            aumk.a(2);
            aumk.h("W");
            aumk.a(3);
            aumk.h("D");
            List list = aumk.b;
            Label_0253: {
                if (list.size() != 0) {
                    int size = list.size();
                    while (true) {
                        while (--size >= 0) {
                            if (list.get(size) instanceof aumi) {
                                final aumi aumi = list.get(size);
                                list = list.subList(size + 1, list.size());
                                if (aumi != null && list.size() == 0) {
                                    throw new IllegalStateException("Cannot have two adjacent separators");
                                }
                                final Object[] b = aumk.b(list);
                                list.clear();
                                final aumm aumm = (aumm)b[0];
                                final auml auml = (auml)b[1];
                                final aumi aumi2 = new aumi(aumm);
                                list.add(aumi2);
                                list.add(aumi2);
                                break Label_0253;
                            }
                            else {
                                --size;
                            }
                        }
                        final aumi aumi = null;
                        continue;
                    }
                }
                final aumi aumi3 = new aumi((aumm)aumg.a);
                aumk.c((aumm)aumi3, (auml)aumi3);
            }
            aumk.d();
            aumk.h("H");
            aumk.e();
            aumk.h("M");
            aumk.a(9);
            aumk.h("S");
            atqz.a = aumk.i();
        }
        return atqz.a;
    }
}
