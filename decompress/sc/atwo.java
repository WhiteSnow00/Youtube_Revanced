import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.locks.LockSupport;
import java.io.Closeable;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atwo implements Executor, Closeable
{
    public static final atwg a;
    public final int b;
    public final int c;
    public final long d;
    public final String e;
    public final atpo f;
    public final atwd g;
    public final atpo h;
    public final auch i;
    public final auch j;
    private final atpm k;
    
    static {
        a = new atwg("NOT_IN_STACK");
    }
    
    public atwo(final int b, final int c, final long d) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = "DefaultDispatcher";
        if (b <= 0) {
            final StringBuilder sb = new StringBuilder("Core pool size ");
            sb.append(b);
            sb.append(" should be at least 1");
            throw new IllegalArgumentException(sb.toString());
        }
        if (c < b) {
            final StringBuilder sb2 = new StringBuilder("Max pool size ");
            sb2.append(c);
            sb2.append(" should be greater than or equals to core pool size ");
            sb2.append(b);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (c > 2097150) {
            final StringBuilder sb3 = new StringBuilder("Max pool size ");
            sb3.append(c);
            sb3.append(" should not exceed maximal supported number of threads 2097150");
            throw new IllegalArgumentException(sb3.toString());
        }
        if (d > 0L) {
            this.i = new auch((byte[])null, (byte[])null);
            this.j = new auch((byte[])null, (byte[])null);
            this.f = aucl.h(0L);
            this.g = new atwd(b + 1);
            this.h = aucl.h((long)b << 42);
            this.k = aucl.g(false);
            return;
        }
        final StringBuilder sb4 = new StringBuilder("Idle worker keep alive time ");
        sb4.append(d);
        sb4.append(" must be positive");
        throw new IllegalArgumentException(sb4.toString());
    }
    
    public static void e(final atwo atwo, final Runnable runnable) {
        atwo.d(runnable, atwv.e);
    }
    
    public static final void f(final atws atws) {
        atws.getClass();
        try {
            atws.run();
        }
        finally {
            try {
                final Thread currentThread = Thread.currentThread();
                final Throwable t;
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, t);
            }
            finally {}
        }
    }
    
    private final int g() {
        synchronized (this.g) {
            if (this.c()) {
                return -1;
            }
            final long b = this.h.b;
            final int n = (int)((b & 0x3FFFFE00000L) >> 21);
            final int n2 = (int)(b & 0x1FFFFFL);
            final int e = aryu.e(n2 - n, 0);
            if (e >= this.b) {
                return 0;
            }
            if (n2 >= this.c) {
                return 0;
            }
            final long b2 = this.h.b;
            final atwd g = this.g;
            final int n3 = (int)(b2 & 0x1FFFFFL) + 1;
            if (g.a(n3) != null) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            final atwn atwn = new atwn(this, n3);
            this.g.b(n3, (Object)atwn);
            final atpo h = this.h;
            final long incrementAndGet = atpo.a.incrementAndGet(h);
            final aucl c = h.c;
            if (n3 == (int)(0x1FFFFFL & incrementAndGet)) {
                atwn.start();
                monitorexit(this.g);
                return e + 1;
            }
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
    
    private final atwn h() {
        final Thread currentThread = Thread.currentThread();
        atwn atwn;
        if (currentThread instanceof atwn) {
            atwn = (atwn)currentThread;
        }
        else {
            atwn = null;
        }
        if (atwn != null && atoc.c((Object)atwn.c, (Object)this)) {
            return atwn;
        }
        return null;
    }
    
    private final boolean i(final long n) {
        if (aryu.e((int)(n & 0x1FFFFFL) - (int)((0x3FFFFE00000L & n) >> 21), 0) < this.b) {
            final int g = this.g();
            if (g == 1) {
                if (this.b > 1) {
                    this.g();
                }
            }
            else if (g <= 0) {
                return false;
            }
            return true;
        }
        return false;
    }
    
    private final boolean j() {
        Object o = null;
    Label_0089:
        do {
            final atpo f = this.f;
            while (true) {
                int k;
                long b;
                do {
                    b = f.b;
                    o = this.g.a((int)(0x1FFFFFL & b));
                    if (o == null) {
                        o = null;
                        if (o == null) {
                            return false;
                        }
                        continue Label_0089;
                    }
                    else {
                        k = k((atwn)o);
                    }
                } while (k < 0 || !this.f.b(b, (2097152L + b & 0xFFFFFFFFFFE00000L) | (long)k));
                ((atwn)o).nextParkedWorker = atwo.a;
                continue;
            }
        } while (!((atwn)o).a.a(-1, 0));
        LockSupport.unpark((Thread)o);
        return true;
    }
    
    private static final int k(atwn atwn) {
        while (true) {
            final Object nextParkedWorker = atwn.nextParkedWorker;
            if (nextParkedWorker == atwo.a) {
                return -1;
            }
            if (nextParkedWorker == null) {
                return 0;
            }
            atwn = (atwn)nextParkedWorker;
            final int indexInArray = atwn.indexInArray;
            if (indexInArray == 0) {
                continue;
            }
            return indexInArray;
        }
    }
    
    public final void a(final atwn atwn, final int n, final int n2) {
        final atpo f = this.f;
        int k;
        long b;
        do {
            b = f.b;
            if ((k = (int)(0x1FFFFFL & b)) == n) {
                if (n2 == 0) {
                    k = k(atwn);
                }
                else {
                    k = n2;
                }
            }
        } while (k < 0 || !this.f.b(b, (2097152L + b & 0xFFFFFFFFFFE00000L) | (long)k));
    }
    
    public final void b() {
        if (!this.j()) {
            if (this.i(this.h.b)) {
                return;
            }
            this.j();
        }
    }
    
    public final boolean c() {
        return this.k.a();
    }
    
    @Override
    public final void close() {
        if (!this.k.b()) {
            return;
        }
        final atwn h = this.h();
        Object o = this.g;
        monitorenter(o);
        try {
            final long b = this.h.b;
            monitorexit(o);
            final int n = (int)(b & 0x1FFFFFL);
            if (n > 0) {
                int n2 = 1;
                while (true) {
                    o = this.g.a(n2);
                    ((atwd)o).getClass();
                    o = o;
                    if (o != h) {
                        while (((atwn)o).isAlive()) {
                            LockSupport.unpark((Thread)o);
                            ((atwn)o).join(10000L);
                        }
                        final boolean a = atqw.a;
                        final ziy e = ((atwn)o).e;
                        o = this.j;
                        o.getClass();
                        final atws atws = (atws)((atpp)e.b).a((Object)null);
                        if (atws != null) {
                            ((auch)o).l((Object)atws);
                        }
                        while (true) {
                            final atws ae = e.ae();
                            if (ae == null) {
                                break;
                            }
                            ((auch)o).l((Object)ae);
                        }
                    }
                    if (n2 == n) {
                        break;
                    }
                    ++n2;
                }
            }
            this.j.k();
            this.i.k();
            while ((h != null && (o = h.b(true)) != null) || (o = this.i.j()) != null || (o = this.j.j()) != null) {
                f((atws)o);
            }
            if (h != null) {
                h.d(5);
            }
            final boolean a2 = atqw.a;
            this.f.b = 0L;
            this.h.b = 0L;
        }
        finally {
            monitorexit(o);
            while (true) {}
        }
    }
    
    public final void d(final Runnable runnable, final atwt h) {
        h.getClass();
        final long a = atwv.a;
        final long nanoTime = System.nanoTime();
        Object o;
        if (runnable instanceof atws) {
            o = runnable;
            ((atws)o).g = nanoTime;
            ((atws)o).h = h;
        }
        else {
            o = new atwu(runnable, nanoTime, h);
        }
        final atwn h2 = this.h();
        atws af = null;
        Label_0112: {
            if (h2 != null) {
                final int d = h2.d;
                if (d != 5) {
                    if (((atws)o).h.a != 0 || d != 2) {
                        h2.b = true;
                        af = h2.e.af((atws)o);
                        break Label_0112;
                    }
                }
            }
            af = (atws)o;
        }
        if (af != null) {
            boolean b;
            if (af.h.a == 1) {
                b = this.j.l((Object)af);
            }
            else {
                b = this.i.l((Object)af);
            }
            if (!b) {
                throw new RejectedExecutionException(this.e.concat(" was terminated"));
            }
        }
        if (((atws)o).h.a != 0) {
            final long a2 = this.h.a(2097152L);
            if (!this.j()) {
                if (!this.i(a2)) {
                    this.j();
                }
            }
            return;
        }
        this.b();
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        runnable.getClass();
        e(this, runnable);
    }
    
    @Override
    public final String toString() {
        final ArrayList list = new ArrayList();
        final int length = this.g.array.length();
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        for (int i = 1; i < length; ++i, n = n6, n2 = n7, n3 = n8, n4 = n9, n5 = n10) {
            final atwn atwn = (atwn)this.g.a(i);
            n6 = n;
            n7 = n2;
            n8 = n3;
            n9 = n4;
            n10 = n5;
            if (atwn != null) {
                final ziy e = atwn.e;
                int ac;
                if (((atpp)e.b).a != null) {
                    ac = e.ac() + 1;
                }
                else {
                    ac = e.ac();
                }
                final int d = atwn.d;
                final int n11 = d - 1;
                if (d == 0) {
                    throw null;
                }
                if (n11 != 0) {
                    if (n11 != 1) {
                        if (n11 != 2) {
                            if (n11 != 3) {
                                if (n11 != 4) {
                                    n6 = n;
                                    n7 = n2;
                                    n8 = n3;
                                    n9 = n4;
                                    n10 = n5;
                                }
                                else {
                                    n10 = n5 + 1;
                                    n6 = n;
                                    n7 = n2;
                                    n8 = n3;
                                    n9 = n4;
                                }
                            }
                            else {
                                ++n4;
                                n6 = n;
                                n7 = n2;
                                n8 = n3;
                                n9 = n4;
                                n10 = n5;
                                if (ac > 0) {
                                    final StringBuilder sb = new StringBuilder();
                                    sb.append(ac);
                                    sb.append("d");
                                    list.add(sb.toString());
                                    n6 = n;
                                    n7 = n2;
                                    n8 = n3;
                                    n9 = n4;
                                    n10 = n5;
                                }
                            }
                        }
                        else {
                            n8 = n3 + 1;
                            n6 = n;
                            n7 = n2;
                            n9 = n4;
                            n10 = n5;
                        }
                    }
                    else {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append(ac);
                        sb2.append("b");
                        list.add(sb2.toString());
                        n7 = n2 + 1;
                        n6 = n;
                        n8 = n3;
                        n9 = n4;
                        n10 = n5;
                    }
                }
                else {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append(ac);
                    sb3.append("c");
                    list.add(sb3.toString());
                    n6 = n + 1;
                    n7 = n2;
                    n8 = n3;
                    n9 = n4;
                    n10 = n5;
                }
            }
        }
        final long b = this.h.b;
        final String e2 = this.e;
        final String b2 = atqx.b((Object)this);
        final int b3 = this.b;
        final int c = this.c;
        final int j = this.i.i();
        final int k = this.j.i();
        final int b4 = this.b;
        final int n12 = (int)((b & 0x7FFFFC0000000000L) >> 42);
        final StringBuilder sb4 = new StringBuilder();
        sb4.append(e2);
        sb4.append("@");
        sb4.append(b2);
        sb4.append("[Pool Size {core = ");
        sb4.append(b3);
        sb4.append(", max = ");
        sb4.append(c);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(n);
        sb4.append(", blocking = ");
        sb4.append(n2);
        sb4.append(", parked = ");
        sb4.append(n3);
        sb4.append(", dormant = ");
        sb4.append(n4);
        sb4.append(", terminated = ");
        sb4.append(n5);
        sb4.append("}, running workers queues = ");
        sb4.append(list);
        sb4.append(", global CPU queue size = ");
        sb4.append(j);
        sb4.append(", global blocking queue size = ");
        sb4.append(k);
        sb4.append(", Control State {created workers= ");
        sb4.append((int)(b & 0x1FFFFFL));
        sb4.append(", blocking tasks = ");
        sb4.append((int)((0x3FFFFE00000L & b) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(b4 - n12);
        sb4.append("}]");
        return sb4.toString();
    }
}
