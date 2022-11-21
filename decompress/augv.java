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

public final class augv
{
    public final auhr a;
    final Executor b;
    final Executor c;
    public final augx d;
    
    public augv(final augx d, final UrlRequest$Callback urlRequest$Callback, final Executor executor) {
        this.d = d;
        this.a = new auhr(urlRequest$Callback);
        if (d.h) {
            this.b = executor;
            this.c = null;
            return;
        }
        this.b = (Executor)new nrh(executor, 3);
        this.c = executor;
    }
    
    final void a(final augy augy) {
        try {
            this.b.execute((Runnable)new ashw(this.d, augy, 15));
        }
        catch (final RejectedExecutionException ex) {
            this.d.i(new aufz("Exception posting task to executor", ex));
        }
    }
    
    public final void b() {
        try {
            final augx d = this.d;
            final augd s = d.s;
            final int r = d.r;
            final auhj o = d.o;
            Map<Object, Object> map;
            String c;
            int a;
            boolean b;
            if (o != null) {
                map = o.getAllHeaders();
                final auhj o2 = this.d.o;
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
                b2 = augx.b(this.d.e);
                n = -1L;
            }
            long long1;
            long c2;
            if (b) {
                long1 = 0L;
                c2 = 0L;
            }
            else {
                c2 = augx.c(map);
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
            s.a(r, new augb(b2, n, c2, long1, a, Duration.ofSeconds(0L), Duration.ofSeconds(0L), c, false, false));
        }
        catch (final RuntimeException ex2) {
            Log.e(augx.a, "Error while trying to log CronetTrafficInfo: ", (Throwable)ex2);
        }
    }
    
    final void c() {
        this.a(new augq(this, 7));
    }
}
