import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asbx implements arwb
{
    private final int a;
    
    public asbx(final int a) {
        this.a = a;
    }
    
    public final Object a(final String s) {
        if (this.a != 0) {
            return s;
        }
        adkp.I(s.length() > 0, (Object)"empty timeout");
        adkp.I(s.length() <= 9, (Object)"bad timeout format");
        final long long1 = Long.parseLong(s.substring(0, s.length() - 1));
        final char char1 = s.charAt(s.length() - 1);
        Long n;
        if (char1 != 'H') {
            if (char1 != 'M') {
                if (char1 != 'S') {
                    if (char1 != 'u') {
                        if (char1 != 'm') {
                            if (char1 != 'n') {
                                throw new IllegalArgumentException(String.format("Invalid timeout unit: %s", char1));
                            }
                            n = long1;
                        }
                        else {
                            n = TimeUnit.MILLISECONDS.toNanos(long1);
                        }
                    }
                    else {
                        n = TimeUnit.MICROSECONDS.toNanos(long1);
                    }
                }
                else {
                    n = TimeUnit.SECONDS.toNanos(long1);
                }
            }
            else {
                n = TimeUnit.MINUTES.toNanos(long1);
            }
        }
        else {
            n = TimeUnit.HOURS.toNanos(long1);
        }
        return n;
    }
    
    public final String b(final Object o) {
        if (this.a != 0) {
            return (String)o;
        }
        final Long n = (Long)o;
        final TimeUnit nanoseconds = TimeUnit.NANOSECONDS;
        if (n >= 0L) {
            String s;
            if (n < 100000000L) {
                new StringBuilder().append(n);
                s = n.toString().concat("n");
            }
            else if (n < 100000000000L) {
                final long micros = nanoseconds.toMicros(n);
                final StringBuilder sb = new StringBuilder();
                sb.append(micros);
                sb.append("u");
                s = sb.toString();
            }
            else if (n < 100000000000000L) {
                final long millis = nanoseconds.toMillis(n);
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(millis);
                sb2.append("m");
                s = sb2.toString();
            }
            else if (n < 100000000000000000L) {
                final long seconds = nanoseconds.toSeconds(n);
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(seconds);
                sb3.append("S");
                s = sb3.toString();
            }
            else if (n < 6000000000000000000L) {
                final long minutes = nanoseconds.toMinutes(n);
                final StringBuilder sb4 = new StringBuilder();
                sb4.append(minutes);
                sb4.append("M");
                s = sb4.toString();
            }
            else {
                final long hours = nanoseconds.toHours(n);
                final StringBuilder sb5 = new StringBuilder();
                sb5.append(hours);
                sb5.append("H");
                s = sb5.toString();
            }
            return s;
        }
        throw new IllegalArgumentException("Timeout too small");
    }
}
