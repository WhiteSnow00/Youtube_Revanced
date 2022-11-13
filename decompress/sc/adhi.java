import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import android.content.SharedPreferences;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adhi
{
    public final long a;
    public final Object b;
    public final Object c;
    public final Object d;
    
    public adhi(final absv absv) {
        this.d = absv.c;
        this.c = absv.a;
        this.b = absv.d;
        final Long b = absv.b;
        long longValue;
        if (b != null) {
            longValue = b;
        }
        else {
            longValue = 0L;
        }
        this.a = longValue;
    }
    
    public adhi(final SharedPreferences c, final oby d, final String b, final long n, final TimeUnit timeUnit) {
        this.c = c;
        this.b = b;
        this.d = d;
        this.a = timeUnit.toMillis(n);
    }
    
    public adhi(final String c, final long a, final List list, final List list2) {
        this.c = c;
        this.a = a;
        this.d = Collections.unmodifiableList((List<?>)list);
        this.b = Collections.unmodifiableList((List<?>)list2);
    }
    
    public adhi(final int[] b, final long[] c, final int[] d, final long a) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.a = a;
    }
    
    public static boolean d(final SharedPreferences sharedPreferences, final long n, final long n2, final long n3) {
        return sharedPreferences.getBoolean("bypass_rate_limit", false) || n + n2 <= n3;
    }
    
    public static boolean e(final SharedPreferences sharedPreferences, final String s, final long n, final long n2) {
        return d(sharedPreferences, sharedPreferences.getLong(s, 0L), n, n2);
    }
    
    public final long a() {
        final Object d = this.d;
        Long c;
        if (d != null) {
            c = ((yqb)d).c("Sequence-Number");
        }
        else {
            c = null;
        }
        if (c != null) {
            return c;
        }
        return 0L;
    }
    
    public final void b() {
        ((SharedPreferences)this.c).edit().putLong((String)this.b, ((oby)this.d).c()).apply();
    }
    
    public final boolean c() {
        return e((SharedPreferences)this.c, (String)this.b, this.a, ((oby)this.d).c());
    }
}
