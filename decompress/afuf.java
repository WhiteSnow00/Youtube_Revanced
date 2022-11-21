import j$.time.temporal.TemporalUnit;
import j$.time.temporal.ChronoUnit;
import java.math.RoundingMode;
import java.math.BigDecimal;
import j$.time.Duration;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afuf
{
    static final Duration a;
    public static final Duration b;
    private static final double c;
    
    static {
        c = (double)(a = Duration.ofSeconds(Long.MIN_VALUE)).getSeconds();
        b = Duration.ofSeconds(Long.MAX_VALUE, 999999999L);
        Duration.ofMillis(Long.MAX_VALUE);
        Duration.ofMillis(Long.MIN_VALUE);
        c(Long.MAX_VALUE);
        c(Long.MIN_VALUE);
        Duration.ofNanos(Long.MAX_VALUE);
        Duration.ofNanos(Long.MIN_VALUE);
    }
    
    public static long a(final Duration duration) {
        if (duration.getSeconds() < -9223372036854L) {
            return aftz.k(aftz.l(duration.getSeconds() + 1L, 1000000L), duration.getNano() / 1000 - 1000000);
        }
        return aftz.k(aftz.l(duration.getSeconds(), 1000000L), duration.getNano() / 1000);
    }
    
    public static Duration b(final Duration duration, final double n) {
        if (Double.isNaN(n)) {
            throw new ArithmeticException("Cannot multiply a duration by NaN");
        }
        if (Double.isInfinite(n)) {
            throw new ArithmeticException("result does not fit into the range of a Duration");
        }
        final BigDecimal multiply = BigDecimal.valueOf(duration.getSeconds()).add(BigDecimal.valueOf(duration.getNano(), 9)).multiply(new BigDecimal(n));
        if (multiply.compareTo(BigDecimal.valueOf(9.223372036854776E18)) < 0 && multiply.compareTo(BigDecimal.valueOf(afuf.c)) > 0) {
            final long longValue = multiply.longValue();
            return Duration.ofSeconds(longValue, multiply.subtract(BigDecimal.valueOf(longValue)).setScale(9, RoundingMode.HALF_EVEN).unscaledValue().longValue());
        }
        throw new ArithmeticException("result does not fit into the range of a Duration");
    }
    
    public static Duration c(final long n) {
        return Duration.of(n, (TemporalUnit)ChronoUnit.MICROS);
    }
    
    public static Duration d(final double n) {
        if (n >= 9.223372036854776E18) {
            return afuf.b;
        }
        if (n <= afuf.c) {
            return afuf.a;
        }
        final long b = aftw.b(n, RoundingMode.FLOOR);
        final double n2 = (double)b;
        Double.isNaN(n2);
        return Duration.ofSeconds(b, aftw.b((n - n2) * 1.0E9, RoundingMode.FLOOR));
    }
    
    public static boolean e(final Duration duration) {
        return !duration.isNegative() && !duration.isZero();
    }
}
