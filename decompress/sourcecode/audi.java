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

public final class audi
{
    public final auee a;
    final Executor b;
    final Executor c;
    public final /* synthetic */ audk d;
    
    public audi(final audk d, final UrlRequest$Callback urlRequest$Callback, final Executor executor) {
        this.d = d;
        this.a = new auee(urlRequest$Callback);
        if (d.h) {
            this.b = executor;
            this.c = null;
            return;
        }
        this.b = (Executor)new npm(executor, 3);
        this.c = executor;
    }
    
    final void a(final audl audl) {
        try {
            this.b.execute((Runnable)new atyo(this.d, audl, 13));
        }
        catch (final RejectedExecutionException ex) {
            this.d.i((CronetException)new aucm("Exception posting task to executor", ex));
        }
    }
    
    public final void b() {
        try {
            final audk d = this.d;
            final aucq s = d.s;
            final int r = d.r;
            final audw o = d.o;
            Map<Object, Object> map;
            String c;
            int a;
            boolean b;
            if (o != null) {
                map = o.getAllHeaders();
                final audw o2 = this.d.o;
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
            long n;
            long b2;
            if (b) {
                b2 = (n = 0L);
            }
            else {
                b2 = audk.b(this.d.e);
                n = -1L;
            }
            long c2;
            long long1;
            if (b) {
                long1 = (c2 = 0L);
            }
            else {
                c2 = audk.c((Map)map);
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
            s.a(r, new auco(b2, n, c2, long1, a, Duration.ofSeconds(0L), Duration.ofSeconds(0L), c, false, false));
        }
        catch (final RuntimeException ex2) {
            Log.e(audk.a, "Error while trying to log CronetTrafficInfo: ", (Throwable)ex2);
        }
    }
    
    final void c() {
        this.a((audl)new audc(this, 7));
    }
}
