import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afce
{
    public boolean a;
    private final afco b;
    private long c;
    private long d;
    
    public afce() {
        this.b = afco.b;
    }
    
    public afce(final afco b) {
        b.getClass();
        this.b = b;
    }
    
    public static afce b(final afco afco) {
        final afce afce = new afce(afco);
        afce.f();
        return afce;
    }
    
    public static afce c() {
        return new afce();
    }
    
    public static afce d(final afco afco) {
        return new afce(afco);
    }
    
    private final long h() {
        long c;
        if (this.a) {
            c = this.b.a() - this.d + this.c;
        }
        else {
            c = this.c;
        }
        return c;
    }
    
    public final long a(final TimeUnit timeUnit) {
        return timeUnit.convert(this.h(), TimeUnit.NANOSECONDS);
    }
    
    public final void e() {
        this.c = 0L;
        this.a = false;
    }
    
    public final void f() {
        adme.U(this.a ^ true, "This stopwatch is already running.");
        this.a = true;
        this.d = this.b.a();
    }
    
    public final void g() {
        final long a = this.b.a();
        adme.U(this.a, "This stopwatch is already stopped.");
        this.a = false;
        this.c += a - this.d;
    }
    
    @Override
    public final String toString() {
        final long h = this.h();
        TimeUnit timeUnit;
        if (TimeUnit.DAYS.convert(h, TimeUnit.NANOSECONDS) > 0L) {
            timeUnit = TimeUnit.DAYS;
        }
        else if (TimeUnit.HOURS.convert(h, TimeUnit.NANOSECONDS) > 0L) {
            timeUnit = TimeUnit.HOURS;
        }
        else if (TimeUnit.MINUTES.convert(h, TimeUnit.NANOSECONDS) > 0L) {
            timeUnit = TimeUnit.MINUTES;
        }
        else if (TimeUnit.SECONDS.convert(h, TimeUnit.NANOSECONDS) > 0L) {
            timeUnit = TimeUnit.SECONDS;
        }
        else if (TimeUnit.MILLISECONDS.convert(h, TimeUnit.NANOSECONDS) > 0L) {
            timeUnit = TimeUnit.MILLISECONDS;
        }
        else if (TimeUnit.MICROSECONDS.convert(h, TimeUnit.NANOSECONDS) > 0L) {
            timeUnit = TimeUnit.MICROSECONDS;
        }
        else {
            timeUnit = TimeUnit.NANOSECONDS;
        }
        final double n = (double)h;
        final double n2 = (double)TimeUnit.NANOSECONDS.convert(1L, timeUnit);
        final StringBuilder sb = new StringBuilder();
        Double.isNaN(n);
        Double.isNaN(n2);
        sb.append(afbj.d(n / n2));
        sb.append(" ");
        String s = null;
        switch (afcd.a[timeUnit.ordinal()]) {
            default: {
                throw new AssertionError();
            }
            case 7: {
                s = "d";
                break;
            }
            case 6: {
                s = "h";
                break;
            }
            case 5: {
                s = "min";
                break;
            }
            case 4: {
                s = "s";
                break;
            }
            case 3: {
                s = "ms";
                break;
            }
            case 2: {
                s = "\u03bcs";
                break;
            }
            case 1: {
                s = "ns";
                break;
            }
        }
        sb.append(s);
        return sb.toString();
    }
}
