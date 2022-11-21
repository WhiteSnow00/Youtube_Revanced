import java.math.RoundingMode;
import j$.time.Instant;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afug
{
    static {
        Instant.ofEpochMilli(Long.MAX_VALUE);
        Instant.ofEpochMilli(Long.MIN_VALUE);
        b(Long.MAX_VALUE);
        b(Long.MIN_VALUE);
        c(Long.MAX_VALUE);
        c(Long.MIN_VALUE);
        Instant.MIN.getEpochSecond();
        Instant.MAX.getEpochSecond();
    }
    
    public static long a(final Instant instant) {
        if (instant.getEpochSecond() < -9223372036854L) {
            return aftz.k(aftz.l(instant.getEpochSecond() + 1L, 1000000L), instant.getNano() / 1000 - 1000000);
        }
        return aftz.k(aftz.l(instant.getEpochSecond(), 1000000L), instant.getNano() / 1000);
    }
    
    public static void b(final long n) {
        Instant.ofEpochSecond(aftz.n(n, 1000000L, RoundingMode.FLOOR), (long)(aftz.j(n, 1000000) * 1000));
    }
    
    public static void c(final long n) {
        Instant.ofEpochSecond(aftz.n(n, 1000000000L, RoundingMode.FLOOR), (long)aftz.j(n, 1000000000));
    }
}
