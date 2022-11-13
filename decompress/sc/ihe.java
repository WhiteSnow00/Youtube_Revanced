import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;
import java.util.concurrent.Callable;
import com.google.common.util.concurrent.ListenableFuture;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ihe implements tgg
{
    public final Context a;
    public final afvs b;
    public final ihd c;
    public final vlf d;
    public final zmf e;
    public final Object f;
    public ListenableFuture g;
    
    public ihe(final Context a, final afvs b, final ihd c, final vlf d, final zmf e) {
        this.f = new Object();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final void a(final ttg ttg) {
        try {
            synchronized (this.f) {
                if (this.g == null) {
                    this.g = aftq.f(this.b.rz((Callable)new hvu(this, 20)), (aftz)new igl(this, 16), (Executor)this.b);
                }
                final ListenableFuture g = this.g;
                monitorexit(this.f);
                aezp.k((Object)g.get(5000L, TimeUnit.MILLISECONDS));
                return;
            }
        }
        catch (final TimeoutException ex) {
            this.c.a((aezp)aeyo.a);
            ttg.a((Object)ex);
            return;
        }
        catch (final ExecutionException ex2) {}
        catch (final InterruptedException ex3) {}
        final ExecutionException ex2;
        ttg.a((Object)ex2);
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            final zmu zmu = (zmu)o;
            this.b.execute((Runnable)new hvt(this, 16));
            array = null;
        }
        else {
            array = new Class[] { zmu.class };
        }
        return array;
    }
}
