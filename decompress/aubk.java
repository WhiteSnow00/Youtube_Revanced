import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aubk
{
    public static int a(final int n) {
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
    
    public static int b(final int n) {
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
        if (n != 4) {
            return 0;
        }
        return 5;
    }
    
    public static final int c(final int n) {
        return Integer.highestOneBit(asbp.g(n, 1) * 3);
    }
    
    public static final int d(final int n) {
        return Integer.numberOfLeadingZeros(n) + 1;
    }
    
    public static boolean e(final AtomicReference atomicReference, final Object o, final Object o2) {
        while (!atomicReference.compareAndSet(o, o2)) {
            if (atomicReference.get() != o) {
                return false;
            }
        }
        return true;
    }
}
