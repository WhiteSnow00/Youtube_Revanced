import android.os.BadParcelableException;
import android.app.Activity;
import java.io.Closeable;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Callable;
import java.util.Random;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aewf
{
    public static long a;
    public static final HashMap b;
    public static final Object c;
    public static aevl d;
    
    static {
        aewf.a = (long)Math.abs(new Random().nextInt()) << 30;
        b = new HashMap();
        c = new Object();
    }
    
    public static final afax a(final afax afax) {
        afax.getClass();
        return new aewd(aewp.c(), afax);
    }
    
    public static final afci b(final afci afci) {
        afci.getClass();
        return new bnl(aewp.c(), afci, 19);
    }
    
    public static final afvp c(final afvp afvp) {
        afvp.getClass();
        return new aewb(aewp.c(), afvp, 0);
    }
    
    public static final afvq d(final afvq afvq) {
        afvq.getClass();
        return new afvt(aewp.c(), afvq, 1);
    }
    
    public static final afvu e(final afvu afvu) {
        afvu.getClass();
        return new aewc(aewp.c(), afvu);
    }
    
    public static final afwr f(final afwr afwr) {
        afwr.getClass();
        return new aewe(aewp.c(), afwr);
    }
    
    public static final Runnable g(final aevl aevl, final Runnable runnable) {
        aevl.getClass();
        runnable.getClass();
        return new aewa(aevl, runnable);
    }
    
    public static final Runnable h(final Runnable runnable) {
        runnable.getClass();
        return g(aewp.c(), runnable);
    }
    
    public static final Callable i(final Callable callable) {
        callable.getClass();
        return new afvs(aewp.c(), callable, 1);
    }
    
    public static final void j(final Intent intent) {
        intent.getClass();
    }
    
    public static final void k(final Context context, Intent p) {
        context.getClass();
        p.getClass();
        final Intent intent = new Intent(p);
        p = (Intent)p(intent);
        try {
            context.startActivity(intent);
            auek.c((Closeable)p, null);
        }
        finally {
            try {}
            finally {
                final Throwable t;
                auek.c((Closeable)p, t);
            }
        }
    }
    
    public static final void l(final Activity activity, Intent p) {
        activity.getClass();
        final Intent intent = new Intent(p);
        p = (Intent)p(intent);
        try {
            activity.startActivityForResult(intent, 0);
            auek.c((Closeable)p, null);
        }
        finally {
            try {}
            finally {
                auek.c((Closeable)p, (Throwable)activity);
            }
        }
    }
    
    public static final aevl m(final Intent intent) {
        intent.getClass();
        return n(intent, true);
    }
    
    public static final aevl n(final Intent intent, final boolean b) {
        try {
            if (intent.hasExtra("tracing_intent_id")) {
                final long longExtra = intent.getLongExtra("tracing_intent_id", -1L);
                final HashMap b2 = aewf.b;
                monitorenter(b2);
                Label_0049: {
                    if (!b) {
                        break Label_0049;
                    }
                    try {
                        Object o = b2.remove(longExtra);
                        return (aevl)o;
                        o = b2.get(longExtra);
                        return (aevl)o;
                    }
                    finally {
                        monitorexit(b2);
                    }
                }
            }
            return null;
        }
        catch (final BadParcelableException ex) {
            return null;
        }
    }
    
    public static final aevl o(final aevl d) {
        d.getClass();
        synchronized (aewf.c) {
            aewf.d = d;
            monitorexit(aewf.c);
            return new aetr(d, 5);
        }
    }
    
    public static final aevz p(final Intent intent) {
        final aevk c = aewp.c();
        final HashMap b = aewf.b;
        synchronized (b) {
            final long a = aewf.a;
            aewf.a = 1L + a;
            final aevk aevk = b.put(a, c);
            monitorexit(b);
            intent.putExtra("tracing_intent_id", a);
            return new aevz(a);
        }
    }
}
