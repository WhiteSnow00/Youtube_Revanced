import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atlx
{
    public static long b(final String s) {
        final long n = -1L;
        if (s == null) {
            return -1L;
        }
        try {
            return Long.parseLong(s);
        }
        catch (final NumberFormatException ex) {
            return n;
        }
    }
    
    public static final int c(final atzg atzg, int n) {
        final int[] f = atzg.f;
        final int n2 = n + 1;
        n = atzg.e.length - 1;
        int i = 0;
        while (true) {
            while (i <= n) {
                final int n3 = i + n >>> 1;
                final int n4 = f[n3];
                if (n4 < n2) {
                    i = n3 + 1;
                }
                else {
                    n = n3;
                    if (n4 > n2) {
                        n = n3 - 1;
                    }
                    else {
                        if (n >= 0) {
                            return n;
                        }
                        return ~n;
                    }
                }
            }
            n = -i - 1;
            continue;
        }
    }
}
