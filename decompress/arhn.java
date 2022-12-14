import org.webrtc.Logging;
import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arhn extends arhl
{
    private double c;
    private double d;
    private int e;
    
    public arhn() {
        this.c = 0.0;
        this.d = 0.0;
        this.e = 0;
    }
    
    private final double e() {
        final double n = this.e;
        Double.isNaN(n);
        return Math.pow(4.0, n / 20.0);
    }
    
    private final void f(final boolean b) {
        final Locale english = Locale.ENGLISH;
        String s;
        if (!b) {
            s = "undershooting";
        }
        else {
            s = "overshooting";
        }
        Logging.a("IMCDynamicBitrate", String.format(english, "Encoder is %s. Scale bitrate by %.2f. Fps: %.2f, Kbps: %d", s, this.e(), this.b, this.a / 1000));
    }
    
    @Override
    public final int b() {
        synchronized (this) {
            final double n = this.a;
            final double e = this.e();
            Double.isNaN(n);
            return (int)(n * e);
        }
    }
    
    @Override
    public final void c(int n) {
        synchronized (this) {
            final double b = this.b;
            if (b == 0.0) {
                return;
            }
            final double n2 = this.a;
            Double.isNaN(n2);
            final double c = n2 / 8.0;
            final double n3 = c / b;
            final double c2 = this.c;
            final double n4 = n;
            Double.isNaN(n4);
            final double c3 = c2 + (n4 - n3);
            this.c = c3;
            this.d += 1000.0 / b;
            final double n5 = 3.0 * c;
            final double min = Math.min(c3, n5);
            this.c = min;
            final double max = Math.max(min, -n5);
            this.c = max;
            if (this.d <= 3000.0) {
                return;
            }
            if (max > c) {
                n = this.e - (int)(max / c + 0.5);
                this.e = n;
                this.e = Math.max(n, -20);
                this.c = c;
                this.f(true);
            }
            else {
                final double c4 = -c;
                if (max < c4) {
                    n = this.e + (int)(-max / c + 0.5);
                    this.e = n;
                    this.e = Math.min(n, 20);
                    this.c = c4;
                    this.f(false);
                }
            }
            this.d = 0.0;
        }
    }
    
    @Override
    public final void d(final int n, final double n2) {
        synchronized (this) {
            final int a = this.a;
            if (a > 0 && n < a) {
                final double c = this.c;
                final double n3 = n;
                Double.isNaN(n3);
                final double n4 = a;
                Double.isNaN(n4);
                this.c = c * n3 / n4;
            }
            super.d(n, n2);
        }
    }
}
