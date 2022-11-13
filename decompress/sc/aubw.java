import java.util.Iterator;
import android.util.Pair;
import java.util.concurrent.Executor;
import java.util.ArrayList;
import org.chromium.base.task.PostTask;
import J.N;
import java.util.HashSet;
import java.util.List;
import java.util.LinkedList;
import java.util.Set;
import java.lang.ref.ReferenceQueue;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aubw implements aubu
{
    public static final ReferenceQueue a;
    private static final Set h;
    public final aubx b;
    public final String c;
    public volatile long d;
    protected final Runnable e;
    public final Object f;
    public LinkedList g;
    private boolean i;
    private List j;
    
    static {
        a = new ReferenceQueue();
        h = new HashSet();
    }
    
    public aubw(final aubx aubx) {
        this.e = new ased(this, 13);
        this.f = new Object();
        this.b = aubx.c();
        this.c = "TaskRunnerImpl.PreNativeTask.run";
        c();
    }
    
    private static void c() {
        while (true) {
            final aubv aubv = (aubv)aubw.a.poll();
            if (aubv == null) {
                break;
            }
            N.MERCiIV8(aubv.a);
            final Set h = aubw.h;
            monitorenter(h);
            try {
                h.remove(aubv);
                monitorexit(h);
            }
            finally {
                monitorexit(h);
                while (true) {}
            }
        }
    }
    
    @Override
    public final void a(final Runnable runnable) {
        if (this.d != 0L) {
            N.MGnQU$47(this.d, (Object)runnable, 0L, runnable.getClass().getName());
            return;
        }
        synchronized (this.f) {
            Label_0110: {
                if (this.i) {
                    break Label_0110;
                }
                this.i = true;
                Object a = PostTask.a;
                synchronized (a) {
                    final List b = PostTask.b;
                    if (b == null) {
                        monitorexit(a);
                        this.b();
                    }
                    else {
                        b.add(this);
                        monitorexit(a);
                        a = new LinkedList();
                        this.g = (LinkedList)a;
                        a = new ArrayList();
                        this.j = (List)a;
                    }
                    if (this.d != 0L) {
                        N.MGnQU$47(this.d, (Object)runnable, 0L, runnable.getClass().getName());
                        return;
                    }
                    this.g.add(runnable);
                    final Executor e = PostTask.e;
                    PostTask.d.execute(this.e);
                }
            }
        }
    }
    
    public final void b() {
        final aubx b = this.b;
        final int f = b.f;
        final boolean g = b.g;
        final boolean h = b.h;
        final byte i = b.i;
        final byte[] j = b.j;
        final long m5_IQXaH = N.M5_IQXaH(0, f, g, h, (byte)0, (byte[])null);
        Object o = this.f;
        monitorenter(o);
        try {
            final LinkedList g2 = this.g;
            if (g2 != null) {
                for (final Runnable runnable : g2) {
                    N.MGnQU$47(m5_IQXaH, (Object)runnable, 0L, runnable.getClass().getName());
                }
                this.g = null;
            }
            final List k = this.j;
            if (k != null) {
                for (final Pair pair : k) {
                    N.MGnQU$47(m5_IQXaH, (Object)pair.first, (long)pair.second, pair.getClass().getName());
                }
                this.j = null;
            }
            this.d = m5_IQXaH;
            monitorexit(o);
            o = aubw.h;
            synchronized (o) {
                ((Set<aubv>)o).add(new aubv(this));
                c();
            }
        }
        finally {
            monitorexit(o);
            while (true) {}
        }
    }
}
