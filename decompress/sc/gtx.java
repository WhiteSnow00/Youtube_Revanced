import java.util.concurrent.TimeUnit;
import android.content.SharedPreferences;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gtx
{
    public static final long a;
    public final Context b;
    public final SharedPreferences c;
    public final oby d;
    
    static {
        a = TimeUnit.HOURS.toMillis(48L);
    }
    
    public gtx(final Context b, final SharedPreferences c, final oby d) {
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final boolean a() {
        return this.c.getBoolean("lens_available", false);
    }
}
