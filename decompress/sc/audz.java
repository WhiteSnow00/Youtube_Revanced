import android.util.Log;
import j$.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Collections;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest$Callback;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class audz
{
    public final auev a;
    final Executor b;
    final Executor c;
    public final aueb d;
    
    public audz(final aueb d, final UrlRequest$Callback urlRequest$Callback, final Executor executor) {
        this.d = d;
        this.a = new auev(urlRequest$Callback);
        if (d.h) {
            this.b = executor;
            this.c = null;
            return;
        }
        this.b = (Executor)new nqr(executor, 3);
        this.c = executor;
    }
    
    final void a(final auec auec) {
        try {
            this.b.execute(new asfa(this.d, auec, 13));
        }
        catch (final RejectedExecutionException ex) {
            this.d.i(new audd("Exception posting task to executor", ex));
        }
    }
    
    public final void b() {
        try {
            final aueb d = this.d;
            final audh s = d.s;
            final int r = d.r;
            final auen o = d.o;
            Map<Object, Object> map;
            String c;
            int a;
            boolean b;
            if (o != null) {
                map = o.getAllHeaders();
                final auen o2 = this.d.o;
                c = o2.c;
                a = o2.a;
                b = o2.b;
            }
            else {
                map = Collections.emptyMap();
                c = "";
                b = false;
                a = 0;
            }
            long b2;
            long n;
            if (b) {
                b2 = 0L;
                n = 0L;
            }
            else {
                b2 = aueb.b(this.d.e);
                n = -1L;
            }
            long long1;
            long c2;
            if (b) {
                long1 = 0L;
                c2 = 0L;
            }
            else {
                c2 = aueb.c(map);
                if (map.containsKey("Content-Length")) {
                    final String s2 = map.get("Content-Length").get(0);
                    try {
                        long1 = Long.parseLong(s2);
                    }
                    catch (final NumberFormatException ex) {
                        long1 = 0L;
                    }
                }
                else {
                    long1 = -1L;
                }
            }
            s.a(r, new audf(b2, n, c2, long1, a, Duration.ofSeconds(0L), Duration.ofSeconds(0L), c, false, false));
        }
        catch (final RuntimeException ex2) {
            Log.e(aueb.a, "Error while trying to log CronetTrafficInfo: ", (Throwable)ex2);
        }
    }
    
    final void c() {
        this.a(new audt(this, 7));
    }
}
