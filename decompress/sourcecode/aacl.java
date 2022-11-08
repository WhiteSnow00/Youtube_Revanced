import android.content.Intent;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aacl implements tec
{
    static final long a;
    private final Context b;
    private final ScheduledExecutorService c;
    private ScheduledFuture d;
    private long e;
    private final acga f;
    
    static {
        a = TimeUnit.MINUTES.toMillis(1L);
    }
    
    public aacl(final Context b, final tdz tdz, final ScheduledExecutorService c, final acga f, final byte[] array, final byte[] array2, final byte[] array3) {
        this.e = Long.MAX_VALUE;
        this.b = b;
        this.c = c;
        this.f = f;
        tdz.g((Object)this);
    }
    
    private final void d(final Class clazz) {
        synchronized (this) {
            this.d = this.c.schedule((Runnable)new zst(this, clazz, 11), aacl.a, TimeUnit.MILLISECONDS);
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
            if (this.f.s() >= this.e) {
                final Context b = this.b;
                aahe.a(b, new Intent(b, clazz).setAction("com.google.android.libraries.youtube.offline.transfer.service.ActionWakeup"));
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
            trn.d("Failed to resolve transfer service.", (Throwable)ex);
            monitorexit(this);
            return;
        }
        monitorexit(this);
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            array = null;
            if (n != 0) {
                if (n != 1) {
                    final StringBuilder sb = new StringBuilder("unsupported op code: ");
                    sb.append(n);
                    throw new IllegalStateException(sb.toString());
                }
                final zkx zkx = (zkx)o;
                this.a();
            }
            else {
                final tli tli = (tli)o;
                this.a();
            }
        }
        else {
            array = new Class[] { tli.class, zkx.class };
        }
        return array;
    }
}
