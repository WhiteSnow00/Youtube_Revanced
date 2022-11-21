import android.content.Intent;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aagf implements thj
{
    static final long a;
    private final Context b;
    private final ScheduledExecutorService c;
    private ScheduledFuture d;
    private long e;
    private final acjq f;
    
    static {
        a = TimeUnit.MINUTES.toMillis(1L);
    }
    
    public aagf(final Context b, final thg thg, final ScheduledExecutorService c, final acjq f, final byte[] array, final byte[] array2) {
        this.e = Long.MAX_VALUE;
        this.b = b;
        this.c = c;
        this.f = f;
        thg.g((Object)this);
    }
    
    private final void d(final Class clazz) {
        synchronized (this) {
            this.d = this.c.schedule((Runnable)new zwj(this, clazz, 16), aagf.a, TimeUnit.MILLISECONDS);
        }
    }
    
    final void a() {
        synchronized (this) {
            final ScheduledFuture d = this.d;
            if (d != null) {
                d.cancel(false);
                this.d = null;
            }
            this.e = Long.MAX_VALUE;
        }
    }
    
    public final void b(final Class clazz) {
        synchronized (this) {
            if (this.f.t() >= this.e) {
                final Context b = this.b;
                aakw.a(b, new Intent(b, clazz).setAction("com.google.android.libraries.youtube.offline.transfer.service.ActionWakeup"));
                this.e = Long.MAX_VALUE;
                return;
            }
            this.d(clazz);
        }
    }
    
    public final void c(final String s, final long e) {
        monitorenter(this);
        try {
            try {
                final Class<?> forName = Class.forName(s);
                final ScheduledFuture d = this.d;
                if (d == null || d.isDone()) {
                    this.d(forName);
                }
                if (this.e > e) {
                    this.e = e;
                    monitorexit(this);
                    return;
                }
                monitorexit(this);
                return;
            }
            finally {}
        }
        catch (final ClassNotFoundException ex) {
            tut.d("Failed to resolve transfer service.", (Throwable)ex);
            monitorexit(this);
            return;
        }
        monitorexit(this);
    }
    
    public final Class[] mr(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            array = null;
            if (n != 0) {
                if (n != 1) {
                    final StringBuilder sb = new StringBuilder("unsupported op code: ");
                    sb.append(n);
                    throw new IllegalStateException(sb.toString());
                }
                final zop zop = (zop)o;
                this.a();
            }
            else {
                final ton ton = (ton)o;
                this.a();
            }
        }
        else {
            array = new Class[] { ton.class, zop.class };
        }
        return array;
    }
}
