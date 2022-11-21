import java.util.concurrent.TimeUnit;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaiz implements yhl
{
    public String a;
    public long b;
    public long c;
    private int d;
    private long e;
    private long f;
    private long g;
    private double h;
    private final oco i;
    private final zyd j;
    private final aaiy k;
    
    public aaiz(final oco i, final zyd j, final aaiy k) {
        this.f = -1L;
        this.i = i;
        this.j = j;
        this.k = k;
        this.d = -1;
    }
    
    public final void g(final FormatStreamModel formatStreamModel, final long g) {
        final long e = this.b + g;
        final double n = (double)this.c;
        final double n2 = (double)e;
        Double.isNaN(n);
        final double n3 = n / 100.0;
        Double.isNaN(n2);
        final int d = (int)Math.round(n2 / n3);
        final int d2 = this.d;
        if (d2 >= 0 && d - d2 < 1.0 && e - this.e < 16777216L && g != formatStreamModel.j()) {
            return;
        }
        final long c = this.i.c();
        final long f = this.f;
        double n7;
        if (f < c) {
            double min2 = 0.0;
            Label_0262: {
                if (f != -1L) {
                    final long g2 = this.g;
                    final double n4 = (double)TimeUnit.SECONDS.toMillis(1L);
                    final long f2 = this.f;
                    final double n5 = (double)(g - g2);
                    Double.isNaN(n5);
                    Double.isNaN(n4);
                    final double n6 = (double)(c - f2);
                    Double.isNaN(n6);
                    final double min = Math.min(n5 * n4 / n6, 5000000.0);
                    final double h = this.h;
                    n7 = min;
                    if (h > 0.0) {
                        min2 = Math.min(min, h * 10.0);
                        n7 = 0.25 * min2 + this.h * 0.75;
                        break Label_0262;
                    }
                }
                else {
                    n7 = 0.0;
                }
                min2 = n7;
            }
            this.f = c;
            this.g = g;
            this.h = min2;
        }
        else {
            n7 = 0.0;
        }
        this.j.j(this.a, formatStreamModel.e(), g);
        this.k.a(this.b + g, n7);
        this.d = d;
        this.e = e;
    }
}
