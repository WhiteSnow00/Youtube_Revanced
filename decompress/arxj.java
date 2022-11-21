import java.util.Locale;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arxj implements Comparable
{
    private static final long a;
    private static final long b;
    private static final long c;
    private static final arxu g;
    private final long d;
    private volatile boolean e;
    private final arxu f;
    
    static {
        g = new arxu();
        b = -(a = TimeUnit.DAYS.toNanos(36500L));
        c = TimeUnit.SECONDS.toNanos(1L);
    }
    
    private arxj(final arxu f, final long n, long min, final byte[] array) {
        this.f = f;
        min = Math.min(arxj.a, Math.max(arxj.b, min));
        this.d = n + min;
        this.e = (min <= 0L);
    }
    
    public static arxj c(long nanos, final TimeUnit timeUnit) {
        final arxu g = arxj.g;
        if (timeUnit != null) {
            nanos = timeUnit.toNanos(nanos);
            return new arxj(g, System.nanoTime(), nanos, null);
        }
        throw new NullPointerException("units");
    }
    
    public final int a(final arxj arxj) {
        final arxu f = this.f;
        if (f != arxj.f) {
            final String string = f.toString();
            final String string2 = arxj.f.toString();
            final StringBuilder sb = new StringBuilder("Tickers (");
            sb.append(string);
            sb.append(" and ");
            sb.append(string2);
            sb.append(") don't match. Custom Ticker should only be used in tests!");
            throw new AssertionError((Object)sb.toString());
        }
        final long n = this.d - arxj.d;
        if (n < 0L) {
            return -1;
        }
        if (n > 0L) {
            return 1;
        }
        return 0;
    }
    
    public final long b(final TimeUnit timeUnit) {
        final long nanoTime = System.nanoTime();
        if (!this.e && this.d - nanoTime <= 0L) {
            this.e = true;
        }
        return timeUnit.convert(this.d - nanoTime, TimeUnit.NANOSECONDS);
    }
    
    @Override
    public final /* bridge */ int compareTo(final Object o) {
        return this.a((arxj)o);
    }
    
    public final boolean d() {
        if (!this.e) {
            if (this.d - System.nanoTime() > 0L) {
                return false;
            }
            this.e = true;
        }
        return true;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof arxj)) {
            return false;
        }
        final arxj arxj = (arxj)o;
        return this.f == arxj.f && this.d == arxj.d;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.asList(this.f, this.d).hashCode();
    }
    
    @Override
    public final String toString() {
        final long b = this.b(TimeUnit.NANOSECONDS);
        final long abs = Math.abs(b);
        final long c = arxj.c;
        final long n = abs / c;
        final long n2 = Math.abs(b) % c;
        final StringBuilder sb = new StringBuilder();
        if (b < 0L) {
            sb.append('-');
        }
        sb.append(n);
        if (n2 > 0L) {
            sb.append(String.format(Locale.US, ".%09d", n2));
        }
        sb.append("s from now");
        final arxu f = this.f;
        if (f != arxj.g) {
            final String string = f.toString();
            final StringBuilder sb2 = new StringBuilder(" (ticker=");
            sb2.append(string);
            sb2.append(")");
            sb.append(sb2.toString());
        }
        return sb.toString();
    }
}
