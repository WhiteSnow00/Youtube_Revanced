import java.util.Set;
import java.util.concurrent.TimeUnit;
import android.net.Network;
import android.util.Log;
import android.net.ConnectivityManager$NetworkCallback;
import android.net.ConnectivityManager;
import java.util.concurrent.Executor;
import java.util.concurrent.Callable;
import android.accounts.AccountManager;
import android.accounts.OnAccountsUpdateListener;
import java.util.concurrent.ScheduledExecutorService;
import java.util.HashSet;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dmw
{
    private static volatile dmw d;
    public boolean a;
    public final Object b;
    public final Object c;
    
    private dmw(final Context context) {
        this.b = new HashSet();
        this.c = new acko(cll.m((dpa)new dms(context)), (dlx)new dmt(this));
    }
    
    public dmw(final Context context, final ScheduledExecutorService b) {
        final bnh bnh = new bnh(b, context, 8);
        this.c = agnj.E((aeyr)bnh);
        this.a = true;
        this.b = b;
    }
    
    public dmw(final Context context, final pxs pxs, final OnAccountsUpdateListener b) {
        this.a = false;
        this.b = b;
        this.c = AccountManager.get(context.getApplicationContext());
        if (td.c(context, "android.permission.GET_ACCOUNTS") != 0) {
            final pxt pxt = (pxt)pxs;
            afld.o(afld.k((Callable)new lkb(pxt, 17), (Executor)pxt.c), (afsz)new gqy(9), (Executor)afsl.a);
        }
    }
    
    public dmw(final sfh b, final sdr c) {
        this.b = b;
        this.c = c;
    }
    
    static dmw a(final Context context) {
        if (dmw.d == null) {
            synchronized (dmw.class) {
                if (dmw.d == null) {
                    dmw.d = new dmw(context.getApplicationContext());
                }
            }
        }
        return dmw.d;
    }
    
    final void b(final dlx dlx) {
        synchronized (this) {
            ((Set<dlx>)this.b).add(dlx);
            if (!this.a && !((Set)this.b).isEmpty()) {
                final Object c = this.c;
                final Network activeNetwork = ((ConnectivityManager)((dpa)((acko)c).d).a()).getActiveNetwork();
                final boolean b = true;
                ((acko)c).a = (activeNetwork != null);
                boolean a;
                try {
                    ((ConnectivityManager)((dpa)((acko)c).d).a()).registerDefaultNetworkCallback((ConnectivityManager$NetworkCallback)((acko)c).b);
                    a = b;
                }
                catch (final RuntimeException ex) {
                    if (Log.isLoggable("ConnectivityMonitor", 5)) {
                        Log.w("ConnectivityMonitor", "Failed to register callback", (Throwable)ex);
                    }
                    a = false;
                }
                this.a = a;
            }
        }
    }
    
    final void c(final dlx dlx) {
        synchronized (this) {
            ((Set)this.b).remove(dlx);
            if (this.a && ((Set)this.b).isEmpty()) {
                final Object c = this.c;
                ((ConnectivityManager)((dpa)((acko)c).d).a()).unregisterNetworkCallback((ConnectivityManager$NetworkCallback)((acko)c).b);
                this.a = false;
            }
        }
    }
    
    public final void d(final String s, final String s2) {
        this.i((Runnable)new ngo(this, s, s2, 14, (byte[])null, (byte[])null));
    }
    
    public final void e(final String s, final String s2, final String s3, final String s4, final boolean b) {
        this.i((Runnable)new ngn(this, s, s2, s3, s4, b, 3, (byte[])null, (byte[])null));
    }
    
    public final void f(final String s, final String s2, final int n, final String s3, final boolean b) {
        this.i((Runnable)new pxd(this, s, s2, n, s3, b, (byte[])null, (byte[])null));
    }
    
    public final void g(final double n, final String s, final String s2, final String s3, final String s4, final boolean b) {
        this.i((Runnable)new pxb(this, n, s, s2, s3, s4, b, (byte[])null, (byte[])null));
    }
    
    public final void h(final double n, final String s, final String s2, final int n2, final String s3, final boolean b) {
        this.i((Runnable)new pxc(this, n, s, s2, n2, s3, b, (byte[])null, (byte[])null));
    }
    
    public final void i(final Runnable runnable) {
        if (this.a) {
            ((ScheduledExecutorService)this.b).schedule((Runnable)new ojn(this, runnable, 19, (byte[])null, (byte[])null), 5L, TimeUnit.SECONDS);
            return;
        }
        runnable.run();
    }
}
