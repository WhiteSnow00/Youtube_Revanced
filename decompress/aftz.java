import java.util.Iterator;
import com.google.android.youtube.api.jar.client.c;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.ArrayList;
import java.util.List;
import android.os.Looper;
import java.util.concurrent.Callable;
import java.math.RoundingMode;
import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aftz
{
    public static void A(final Throwable t, final Throwable t2) {
        try {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(t, t2);
        }
        catch (final Exception ex) {}
    }
    
    public static void B(final aeli aeli) {
        if (aeli instanceof aelh) {
            ((aelh)aeli).a();
        }
    }
    
    public static int C(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n == 3) {
            return 4;
        }
        if (n == 4) {
            return 5;
        }
        if (n != 5) {
            return 0;
        }
        return 6;
    }
    
    private static void D(final double[] array, final int n, final int n2) {
        final double n3 = array[n];
        array[n] = array[n2];
        array[n2] = n3;
    }
    
    private static ahcr E(final Throwable t) {
        final ahcr builder = ((ahcz)afsx.a).createBuilder();
        final String name = t.getClass().getName();
        builder.copyOnWrite();
        final afsx afsx = (afsx)builder.instance;
        name.getClass();
        afsx.b |= 0x1;
        afsx.c = name;
        if (t.getMessage() != null) {
            final String message = t.getMessage();
            builder.copyOnWrite();
            final afsx afsx2 = (afsx)builder.instance;
            message.getClass();
            afsx2.b |= 0x2;
            afsx2.d = message;
        }
        StackTraceElement[] stackTrace;
        try {
            stackTrace = t.getStackTrace();
        }
        catch (final NullPointerException ex) {
            stackTrace = null;
        }
        if (stackTrace != null) {
            for (int i = 0; i < stackTrace.length; ++i) {
                final StackTraceElement stackTraceElement = stackTrace[i];
                final ahcr builder2 = ((ahcz)afsw.a).createBuilder();
                if (stackTraceElement != null) {
                    final String className = stackTraceElement.getClassName();
                    builder2.copyOnWrite();
                    final afsw afsw = (afsw)builder2.instance;
                    className.getClass();
                    afsw.b |= 0x1;
                    afsw.c = className;
                    final String methodName = stackTraceElement.getMethodName();
                    builder2.copyOnWrite();
                    final afsw afsw2 = (afsw)builder2.instance;
                    methodName.getClass();
                    afsw2.b |= 0x2;
                    afsw2.d = methodName;
                    final int lineNumber = stackTraceElement.getLineNumber();
                    builder2.copyOnWrite();
                    final afsw afsw3 = (afsw)builder2.instance;
                    afsw3.b |= 0x8;
                    afsw3.f = lineNumber;
                    if (stackTraceElement.getFileName() != null) {
                        final String fileName = stackTraceElement.getFileName();
                        builder2.copyOnWrite();
                        final afsw afsw4 = (afsw)builder2.instance;
                        fileName.getClass();
                        afsw4.b |= 0x4;
                        afsw4.e = fileName;
                    }
                }
                builder.copyOnWrite();
                final afsx afsx3 = (afsx)builder.instance;
                final afsw afsw5 = (afsw)builder2.build();
                afsw5.getClass();
                final ahdp f = afsx3.f;
                if (!f.c()) {
                    afsx3.f = ahcz.mutableCopy(f);
                }
                afsx3.f.add((Object)afsw5);
            }
        }
        return builder;
    }
    
    private static void F(final ListenableFuture listenableFuture, final ListenableFuture listenableFuture2) {
        listenableFuture2.addListener((Runnable)new adra(listenableFuture2, listenableFuture, 15), (Executor)afwd.a);
    }
    
    public static int a(final boolean b, final boolean b2) {
        int n;
        if (b == b2) {
            n = 0;
        }
        else {
            if (b) {
                return 1;
            }
            n = -1;
        }
        return n;
    }
    
    public static int b(final boolean... array) {
        int i = 0;
        int n = 0;
        while (i < array.length) {
            int n2 = n;
            if (array[i]) {
                n2 = n + 1;
            }
            ++i;
            n = n2;
        }
        return n;
    }
    
    public static double c(final double n, final double n2, final double n3, final double n4) {
        if (n == Double.NEGATIVE_INFINITY) {
            if (n2 == Double.POSITIVE_INFINITY) {
                return Double.NaN;
            }
            return Double.NEGATIVE_INFINITY;
        }
        else {
            if (n2 == Double.POSITIVE_INFINITY) {
                return Double.POSITIVE_INFINITY;
            }
            return n + (n2 - n) * n3 / n4;
        }
    }
    
    public static void d(final int n, final int n2) {
        if (n >= 0 && n <= n2) {
            return;
        }
        final StringBuilder sb = new StringBuilder("Quantile indexes must be between 0 and the scale, which is ");
        sb.append(n2);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static void e(final int[] array, int n, final int n2, final double[] array2, final int n3, final int n4) {
        int n5 = 0;
        Label_0111: {
            if (n == n2) {
                n5 = n;
            }
            else {
                final int n6 = n3 + n4;
                n5 = n;
                int i = n2;
                while (i > n5 + 1) {
                    final int n7 = n6 >>> 1;
                    final int n8 = n5 + i >>> 1;
                    final int n9 = array[n8];
                    if (n9 > n7) {
                        i = n8;
                    }
                    else {
                        if (n9 >= n7) {
                            n5 = n8;
                            break Label_0111;
                        }
                        n5 = n8;
                    }
                }
                if (n6 - array[n5] - array[i] > 0) {
                    n5 = i;
                }
            }
        }
        final int n10 = array[n5];
        f(n10, array2, n3, n4);
        int n11;
        for (n11 = n5 - 1; n11 >= n && array[n11] == n10; --n11) {}
        if (n11 >= n) {
            e(array, n, n11, array2, n3, n10 - 1);
        }
        for (n = n5 + 1; n <= n2 && array[n] == n10; ++n) {}
        if (n <= n2) {
            e(array, n, n2, array2, n10 + 1, n4);
        }
    }
    
    public static void f(int i, final double[] array, int j, int n) {
        int n2 = j;
        int k = n;
        if (i == j) {
            i = j + 1;
            int n3 = j;
            while (i <= n) {
                int n4 = n3;
                if (array[n3] > array[i]) {
                    n4 = i;
                }
                ++i;
                n3 = n4;
            }
            if (n3 != j) {
                D(array, n3, j);
            }
            return;
        }
        while (k > n2) {
            final double n5 = array[k];
            int n6 = 1;
            final int n7 = n2 + k >>> 1;
            final double n8 = array[n7];
            if (n5 >= n8) {
                j = 0;
            }
            else {
                j = 1;
            }
            final double n9 = array[n2];
            if (n8 >= n9) {
                n = 0;
            }
            else {
                n = 1;
            }
            if (n5 >= n9) {
                n6 = 0;
            }
            if (j == n) {
                D(array, n7, n2);
            }
            else if (j != n6) {
                D(array, n2, k);
            }
            final double n10 = array[n2];
            int n11;
            for (j = (n = k); j > n2; --j, n = n11) {
                n11 = n;
                if (array[j] > n10) {
                    D(array, n, j);
                    n11 = n - 1;
                }
            }
            D(array, n2, n);
            j = k;
            if (n >= i) {
                j = n - 1;
            }
            k = j;
            if (n <= i) {
                n2 = n + 1;
                k = j;
            }
        }
    }
    
    public static boolean g(final double... array) {
        for (int i = 0; i < array.length; ++i) {
            if (Double.isNaN(array[i])) {
                return true;
            }
        }
        return false;
    }
    
    static void h(final boolean b, final String s, final long n, final long n2) {
        if (b) {
            return;
        }
        final StringBuilder sb = new StringBuilder("overflow: ");
        sb.append(s);
        sb.append("(");
        sb.append(n);
        sb.append(", ");
        sb.append(n2);
        sb.append(")");
        throw new ArithmeticException(sb.toString());
    }
    
    public static void i(final boolean b) {
        if (b) {
            return;
        }
        throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
    }
    
    public static int j(long n, final int n2) {
        final long n3 = n2;
        n %= n3;
        if (n < 0L) {
            n += n3;
        }
        return (int)n;
    }
    
    public static long k(final long n, final long n2) {
        boolean b = true;
        final boolean b2 = (n ^ n2) < 0L;
        final long n3 = n + n2;
        if ((n ^ n3) < 0L) {
            b = false;
        }
        h(b2 | b, "checkedAdd", n, n2);
        return n3;
    }
    
    public static long l(final long n, final long n2) {
        final int n3 = Long.numberOfLeadingZeros(n) + Long.numberOfLeadingZeros(~n) + Long.numberOfLeadingZeros(n2) + Long.numberOfLeadingZeros(-1L ^ n2);
        if (n3 > 65) {
            return n * n2;
        }
        h(n3 >= 64, "checkedMultiply", n, n2);
        h(true, "checkedMultiply", n, n2);
        final long n4 = n * n2;
        h(n == 0L || n4 / n == n2, "checkedMultiply", n, n2);
        return n4;
    }
    
    public static long m(final long n, final long n2) {
        boolean b = true;
        final boolean b2 = (n ^ n2) >= 0L;
        final long n3 = n - n2;
        if ((n ^ n3) < 0L) {
            b = false;
        }
        h(b2 | b, "checkedSubtract", n, n2);
        return n3;
    }
    
    public static long n(long abs, final long n, final RoundingMode roundingMode) {
        roundingMode.getClass();
        final long n2 = abs / n;
        final long n3 = abs - n * n2;
        if (n3 == 0L) {
            return n2;
        }
        final int n4 = afty.a[roundingMode.ordinal()];
        final int n5 = (int)((abs ^ n) >> 63);
        final boolean b = true;
        final int n6 = n5 | 0x1;
        int n7 = 0;
        Label_0213: {
            switch (n4) {
                default: {
                    throw new AssertionError();
                }
                case 6:
                case 7:
                case 8: {
                    abs = Math.abs(n3);
                    abs -= Math.abs(n) - abs;
                    if (abs == 0L) {
                        n7 = (b ? 1 : 0);
                        if (roundingMode == RoundingMode.HALF_UP) {
                            break Label_0213;
                        }
                        if (roundingMode == RoundingMode.HALF_EVEN && (0x1L & n2) != 0x0L) {
                            n7 = (b ? 1 : 0);
                            break Label_0213;
                        }
                        break;
                    }
                    else {
                        if (abs > 0L) {
                            n7 = (b ? 1 : 0);
                            break Label_0213;
                        }
                        break;
                    }
                    break;
                }
                case 5: {
                    if (n6 > 0) {
                        n7 = (b ? 1 : 0);
                        break Label_0213;
                    }
                    break;
                }
                case 3: {
                    if (n6 < 0) {
                        n7 = (b ? 1 : 0);
                        break Label_0213;
                    }
                    break;
                }
                case 4: {
                    return n2 + n6;
                }
                case 1: {
                    i(false);
                }
                case 2: {
                    return n2;
                }
            }
            n7 = 0;
        }
        if (n7 != 0) {
            return n2 + n6;
        }
        return n2;
    }
    
    public static int o(int abs, final int n, final RoundingMode roundingMode) {
        roundingMode.getClass();
        if (n == 0) {
            throw new ArithmeticException("/ by zero");
        }
        final int n2 = abs / n;
        final int n3 = abs - n * n2;
        if (n3 == 0) {
            return n2;
        }
        final int n4 = aftx.a[roundingMode.ordinal()];
        final int n5 = 1;
        final int n6 = (abs ^ n) >> 31 | 0x1;
        Label_0195: {
            switch (n4) {
                default: {
                    throw new AssertionError();
                }
                case 6:
                case 7:
                case 8: {
                    abs = Math.abs(n3);
                    abs -= Math.abs(n) - abs;
                    if (abs == 0) {
                        abs = n5;
                        if (roundingMode == RoundingMode.HALF_UP) {
                            break Label_0195;
                        }
                        if (roundingMode == RoundingMode.HALF_EVEN) {
                            abs = 1;
                        }
                        else {
                            abs = 0;
                        }
                        if ((abs & (n2 & 0x1)) != 0x0) {
                            abs = n5;
                            break Label_0195;
                        }
                        break;
                    }
                    else {
                        if (abs > 0) {
                            abs = n5;
                            break Label_0195;
                        }
                        break;
                    }
                    break;
                }
                case 5: {
                    if (n6 > 0) {
                        abs = n5;
                        break Label_0195;
                    }
                    break;
                }
                case 3: {
                    if (n6 < 0) {
                        abs = n5;
                        break Label_0195;
                    }
                    break;
                }
                case 4: {
                    return n2 + n6;
                }
                case 1: {
                    i(false);
                }
                case 2: {
                    return n2;
                }
            }
            abs = 0;
        }
        if (abs != 0) {
            return n2 + n6;
        }
        return n2;
    }
    
    public static int p(final int n, final int n2) {
        return afxr.F(n + (long)n2);
    }
    
    public static boolean q(final double n) {
        return Math.getExponent(n) <= 1023;
    }
    
    public static ahcr r(final Throwable t) {
        final ahcr builder = ((ahcz)afsz.a).createBuilder();
        final ahcr e = E(t);
        builder.copyOnWrite();
        final afsz afsz = (afsz)builder.instance;
        final afsx c = (afsx)e.build();
        c.getClass();
        afsz.c = c;
        afsz.b |= 0x1;
        return builder;
    }
    
    public static ahcr s(Throwable cause) {
        final ahcr builder = ((ahcz)afta.a).createBuilder();
        final ahcr e = E(cause);
        builder.copyOnWrite();
        final afta afta = (afta)builder.instance;
        final afsx e2 = (afsx)e.build();
        e2.getClass();
        afta.e = e2;
        afta.b |= 0x1;
        while (true) {
            cause = cause.getCause();
            if (cause == null) {
                break;
            }
            final ahcr e3 = E(cause);
            builder.copyOnWrite();
            final afta afta2 = (afta)builder.instance;
            final afsx afsx = (afsx)e3.build();
            afsx.getClass();
            afta2.a();
            afta2.f.add((Object)afsx);
        }
        return builder;
    }
    
    public static int t(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 47: {
                return 48;
            }
            case 46: {
                return 47;
            }
            case 45: {
                return 46;
            }
            case 41: {
                return 42;
            }
            case 40: {
                return 41;
            }
            case 39: {
                return 40;
            }
            case 38: {
                return 39;
            }
            case 37: {
                return 38;
            }
            case 36: {
                return 37;
            }
            case 35: {
                return 36;
            }
            case 34: {
                return 35;
            }
            case 33: {
                return 34;
            }
            case 32: {
                return 33;
            }
            case 31: {
                return 32;
            }
            case 30: {
                return 31;
            }
            case 29: {
                return 30;
            }
            case 28: {
                return 29;
            }
            case 27: {
                return 28;
            }
            case 26: {
                return 27;
            }
            case 25: {
                return 26;
            }
            case 24: {
                return 25;
            }
            case 23: {
                return 24;
            }
            case 22: {
                return 23;
            }
            case 21: {
                return 22;
            }
            case 20: {
                return 21;
            }
            case 19: {
                return 20;
            }
            case 18: {
                return 19;
            }
            case 17: {
                return 18;
            }
            case 16: {
                return 17;
            }
            case 15: {
                return 16;
            }
            case 14: {
                return 15;
            }
            case 13: {
                return 14;
            }
            case 12: {
                return 13;
            }
            case 11: {
                return 12;
            }
            case 10: {
                return 11;
            }
            case 9: {
                return 10;
            }
            case 8: {
                return 9;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static ListenableFuture u(final ListenableFuture listenableFuture, final Callable callable, final Executor executor) {
        final afxh a = afxh.a(callable);
        listenableFuture.addListener((Runnable)a, executor);
        F(listenableFuture, (ListenableFuture)a);
        return (ListenableFuture)a;
    }
    
    public static ListenableFuture v(final ListenableFuture listenableFuture, final afvp afvp, final Executor executor) {
        final ListenableFuture q = afxr.q(new aewb(afvp, listenableFuture, 1), new afxl(listenableFuture, executor, 1));
        F(listenableFuture, q);
        return q;
    }
    
    public static aeny w(final Looper looper) {
        return new aeny(looper);
    }
    
    public static Boolean x() {
        return true;
    }
    
    public static int y(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static ListenableFuture z(final List list, final afbk afbk, final Executor executor) {
        final ArrayList list2 = new ArrayList(list.size());
        for (final afvp afvp : list) {
            try {
                final ListenableFuture a = afvp.a();
                if (!a.isDone()) {
                    list2.add(a);
                    continue;
                }
                try {
                    final Object t = afxr.t((Future)a);
                    if (!a.isCancelled() && !afbk.a(t)) {
                        continue;
                    }
                    if (list2.isEmpty()) {
                        return a;
                    }
                    list2.add(a);
                }
                catch (final ExecutionException ex) {
                    if (list2.isEmpty()) {
                        return a;
                    }
                    list2.add(a);
                }
            }
            catch (final Exception ex2) {
                final ListenableFuture k = afxr.k(ex2);
                if (list2.isEmpty()) {
                    return k;
                }
                list2.add(k);
            }
            break;
        }
        final aelp aelp = new aelp((List)list2, afbk, executor);
        adme.T(aelp.d == -1);
        final ListenableFuture b = aelp.b();
        b.addListener((Runnable)new c(aelp, 7), aelp.c);
        return b;
    }
}
