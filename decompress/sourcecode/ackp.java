import java.util.Locale;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ackp
{
    public final int a;
    public final int b;
    
    public ackp(final long n) {
        agot.u(n >= 0L);
        final int a = (int)TimeUnit.MILLISECONDS.toMinutes(n);
        this.a = a;
        this.b = (int)TimeUnit.MILLISECONDS.toSeconds(n - TimeUnit.MINUTES.toMillis(a));
    }
    
    @Override
    public final String toString() {
        return String.format(Locale.getDefault(), "%d:%02d", this.a, this.b);
    }
}
