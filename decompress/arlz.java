import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arlz
{
    public long a;
    public Object b;
    
    public arlz() {
    }
    
    public arlz(final byte[] array) {
        this.a = 60L;
    }
    
    public arlz(final byte[] array, final byte[] array2) {
        this.a = 0L;
        this.b = "";
    }
    
    public arlz(final char[] array) {
        this.a = -1L;
    }
    
    public arlz(final char[] array, final byte[] array2) {
    }
    
    public final aqzy a() {
        return new aqzy(this, null);
    }
    
    public final aesk b() {
        return new aesk((aesl)this.b, this.a);
    }
    
    public final void c(final long n, final TimeUnit timeUnit) {
        adme.K(true);
        this.a = TimeUnit.MILLISECONDS.convert(n, timeUnit);
    }
    
    public final void d() {
        this.b = null;
    }
    
    public final void e(final Exception b) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.b == null) {
            this.b = b;
            this.a = 100L + elapsedRealtime;
        }
        if (elapsedRealtime < this.a) {
            return;
        }
        final Object b2 = this.b;
        while (true) {
            if (b2 == b) {
                break Label_0076;
            }
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(b2, b);
                final Object b3 = this.b;
                this.d();
                throw (Throwable)b3;
            }
            catch (final Exception b) {
                continue;
            }
            break;
        }
    }
}
