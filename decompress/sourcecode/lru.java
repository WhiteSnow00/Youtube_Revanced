import android.view.Display;
import android.hardware.display.DisplayManager;
import android.content.Context;
import android.view.WindowManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lru
{
    public final WindowManager a;
    public final lrt b;
    public final lrs c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public boolean i;
    public long j;
    public long k;
    public long l;
    
    public lru() {
        this(null);
    }
    
    public lru(Context applicationContext) {
        final lrs lrs = null;
        if (applicationContext != null) {
            applicationContext = applicationContext.getApplicationContext();
            this.a = (WindowManager)applicationContext.getSystemService("window");
        }
        else {
            this.a = null;
        }
        if (this.a != null) {
            final int a = lwj.a;
            final DisplayManager displayManager = (DisplayManager)applicationContext.getSystemService("display");
            lrs c;
            if (displayManager == null) {
                c = lrs;
            }
            else {
                c = new lrs(this, displayManager);
            }
            this.c = c;
            this.b = lrt.a;
        }
        else {
            this.c = null;
            this.b = null;
        }
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
    }
    
    public final void a() {
        final Display defaultDisplay = this.a.getDefaultDisplay();
        if (defaultDisplay != null) {
            final double n = defaultDisplay.getRefreshRate();
            Double.isNaN(n);
            final long d = (long)(1.0E9 / n);
            this.d = d;
            this.e = d * 80L / 100L;
        }
    }
    
    public final boolean b(final long n, final long n2) {
        return Math.abs(n2 - this.j - (n - this.k)) > 20000000L;
    }
}
