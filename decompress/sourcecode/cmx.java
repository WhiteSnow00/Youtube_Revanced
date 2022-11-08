import android.util.Log;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cmx extends cnb
{
    public cmx(final Class clazz, long millis, final TimeUnit timeUnit) {
        timeUnit.getClass();
        super(clazz);
        final crg c = super.c;
        millis = timeUnit.toMillis(millis);
        if (millis < 900000L) {
            cmr.a();
            Log.w(crg.a, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        c.b(atnp.f(millis, 900000L), atnp.f(millis, 900000L));
    }
    
    public cmx(final Class clazz, final long n, final TimeUnit timeUnit, final long n2, final TimeUnit timeUnit2) {
        timeUnit.getClass();
        timeUnit2.getClass();
        super(clazz);
        super.c.b(timeUnit.toMillis(n), timeUnit2.toMillis(n2));
    }
}
