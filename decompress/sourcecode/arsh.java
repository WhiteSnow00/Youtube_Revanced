import java.util.Locale;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arsh implements Comparable
{
    public static final arsu c;
    private static final long d;
    private static final long e;
    private static final long f;
    public final long a;
    public final arsu b;
    private volatile boolean g;
    
    static {
        c = new arsu();
        e = -(d = TimeUnit.DAYS.toNanos(36500L));
        f = TimeUnit.SECONDS.toNanos(1L);
    }
    
    private arsh(final arsu b, final long n, long min, final byte[] array) {
        this.b = b;
        min = Math.min(arsh.d, Math.max(arsh.e, min));
        this.a = n + min;
        this.g = (min <= 0L);
    }
    
    public static arsh c(final long n, final TimeUnit timeUnit) {
        return g(n, timeUnit, arsh.c);
    }
    
    public static void f(final Object o, final Object o2) {
        if (o != null) {
            return;
        }
        throw new NullPointerException((String)o2);
    }
    
    public static arsh g(long nanos, final TimeUnit timeUnit, final arsu arsu) {
        f(timeUnit, "units");
        nanos = timeUnit.toNanos(nanos);
        return new arsh(arsu, System.nanoTime(), nanos, null);
    }
    
    public final int a(final arsh arsh) {
        this.d(arsh);
        final long n = this.a - arsh.a;
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
        if (!this.g && this.a - nanoTime <= 0L) {
            this.g = true;
        }
        return timeUnit.convert(this.a - nanoTime, TimeUnit.NANOSECONDS);
    }
    
    public final void d(final arsh arsh) {
        final arsu b = this.b;
        if (b == arsh.b) {
            return;
        }
        final String string = b.toString();
        final String string2 = arsh.b.toString();
        final StringBuilder sb = new StringBuilder("Tickers (");
        sb.append(string);
        sb.append(" and ");
        sb.append(string2);
        sb.append(") don't match. Custom Ticker should only be used in tests!");
        throw new AssertionError((Object)sb.toString());
    }
    
    public final boolean e() {
        if (!this.g) {
            if (this.a - System.nanoTime() > 0L) {
                return false;
            }
            this.g = true;
        }
        return true;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof arsh)) {
            return false;
        }
        final arsh arsh = (arsh)o;
        return this.b == arsh.b && this.a == arsh.a;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.asList(this.b, this.a).hashCode();
    }
    
    @Override
    public final String toString() {
        final long b = this.b(TimeUnit.NANOSECONDS);
        final long abs = Math.abs(b);
        final long f = arsh.f;
        final long n = abs / f;
        final long n2 = Math.abs(b) % f;
        final StringBuilder sb = new StringBuilder();
        if (b < 0L) {
            sb.append('-');
        }
        sb.append(n);
        if (n2 > 0L) {
            sb.append(String.format(Locale.US, ".%09d", n2));
        }
        sb.append("s from now");
        final arsu b2 = this.b;
        if (b2 != arsh.c) {
            final String string = b2.toString();
            final StringBuilder sb2 = new StringBuilder(" (ticker=");
            sb2.append(string);
            sb2.append(")");
            sb.append(sb2.toString());
        }
        return sb.toString();
    }
}
