import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.locks.LockSupport;
import java.io.Closeable;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atvr implements Executor, Closeable
{
    public static final atvj a;
    public final int b;
    public final int c;
    public final long d;
    public final String e;
    public final atot f;
    public final atvg g;
    public final atot h;
    public final aubp i;
    public final aubp j;
    private final ator k;
    
    static {
        a = new atvj("NOT_IN_STACK");
    }
    
    public atvr(final int b, final int c, final long d) {
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
            this.i = new aubp((char[])null);
            this.j = new aubp((char[])null);
            this.f = auet.g(0L);
            this.g = new atvg(b + 1);
            this.h = auet.g((long)b << 42);
            this.k = auet.f(false);
            return;
        }
        final StringBuilder sb4 = new StringBuilder("Idle worker keep alive time ");
        sb4.append(d);
        sb4.append(" must be positive");
        throw new IllegalArgumentException(sb4.toString());
    }
    
    public static /* synthetic */ void e(final atvr atvr, final Runnable runnable) {
        atvr.d(runnable, atvy.e);
    }
    
    public static final void f(final atvv atvv) {
        atvv.getClass();
        try {
            atvv.run();
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
            final int n = (int)(b & 0x1FFFFFL);
            final int d = atnp.d(n - (int)((b & 0x3FFFFE00000L) >> 21), 0);
            if (d >= this.b) {
                return 0;
            }
            if (n >= this.c) {
                return 0;
            }
            final int n2 = (int)(this.h.b & 0x1FFFFFL) + 1;
            if (this.g.a(n2) != null) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            final atvq atvq = new atvq(this, n2);
            this.g.b(n2, atvq);
            final atot h = this.h;
            final long incrementAndGet = atot.a.incrementAndGet(h);
            final auet c = h.c;
            if (n2 == (int)(0x1FFFFFL & incrementAndGet)) {
                atvq.start();
                monitorexit(this.g);
                return d + 1;
            }
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
    
    private final atvq h() {
        final Thread currentThread = Thread.currentThread();
        atvq atvq;
        if (currentThread instanceof atvq) {
            atvq = (atvq)currentThread;
        }
        else {
            atvq = null;
        }
        if (atvq != null && atnh.c((Object)atvq.c, (Object)this)) {
            return atvq;
        }
        return null;
    }
    
    private final boolean i(final long n) {
        if (atnp.d((int)(0x1FFFFFL & n) - (int)((n & 0x3FFFFE00000L) >> 21), 0) < this.b) {
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
        atvq atvq = null;
    Label_0090:
        do {
            final atot f = this.f;
            while (true) {
                int k;
                long b;
                do {
                    b = f.b;
                    atvq = (atvq)this.g.a((int)(0x1FFFFFL & b));
                    if (atvq == null) {
                        atvq = null;
                        if (atvq == null) {
                            return false;
                        }
                        continue Label_0090;
                    }
                    else {
                        k = k(atvq);
                    }
                } while (k < 0 || !this.f.b(b, (2097152L + b & 0xFFFFFFFFFFE00000L) | (long)k));
                atvq.nextParkedWorker = atvr.a;
                continue;
            }
        } while (!atvq.a.a(-1, 0));
        LockSupport.unpark(atvq);
        return true;
    }
    
    private static final int k(atvq atvq) {
        while (true) {
            final Object nextParkedWorker = atvq.nextParkedWorker;
            if (nextParkedWorker == atvr.a) {
                return -1;
            }
            if (nextParkedWorker == null) {
                return 0;
            }
            atvq = (atvq)nextParkedWorker;
            final int indexInArray = atvq.indexInArray;
            if (indexInArray == 0) {
                continue;
            }
            return indexInArray;
        }
    }
    
    public final void a(final atvq atvq, final int n, final int n2) {
        final atot f = this.f;
        int k;
        long b;
        do {
            b = f.b;
            if ((k = (int)(0x1FFFFFL & b)) == n) {
                if (n2 == 0) {
                    k = k(atvq);
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
        final atvq h = this.h();
        Object o = this.g;
        monitorenter(o);
        try {
            final int n = (int)(this.h.b & 0x1FFFFFL);
            monitorexit(o);
            if (n > 0) {
                int n2 = 1;
                while (true) {
                    o = this.g.a(n2);
                    ((atvg)o).getClass();
                    o = o;
                    if (o != h) {
                        while (((Thread)o).isAlive()) {
                            LockSupport.unpark((Thread)o);
                            ((Thread)o).join(10000L);
                        }
                        final boolean a = atqb.a;
                        final zhb e = ((atvq)o).e;
                        o = this.j;
                        o.getClass();
                        final atvv atvv = (atvv)((atou)e.b).a(null);
                        if (atvv != null) {
                            ((aubp)o).l((Object)atvv);
                        }
                        while (true) {
                            final atvv ag = e.ag();
                            if (ag == null) {
                                break;
                            }
                            ((aubp)o).l((Object)ag);
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
                f((atvv)o);
            }
            if (h != null) {
                h.d(5);
            }
            final boolean a2 = atqb.a;
            this.f.b = 0L;
            this.h.b = 0L;
        }
        finally {
            monitorexit(o);
            while (true) {}
        }
    }
    
    public final void d(final Runnable runnable, final atvw h) {
        h.getClass();
        final long a = atvy.a;
        final long nanoTime = System.nanoTime();
        atvv atvv;
        if (runnable instanceof atvv) {
            atvv = (atvv)runnable;
            atvv.g = nanoTime;
            atvv.h = h;
        }
        else {
            atvv = new atvx(runnable, nanoTime, h);
        }
        final atvq h2 = this.h();
        atvv ah = null;
        Label_0111: {
            if (h2 != null) {
                final int d = h2.d;
                if (d != 5) {
                    if (atvv.h.a != 0 || d != 2) {
                        h2.b = true;
                        ah = h2.e.ah(atvv);
                        break Label_0111;
                    }
                }
            }
            ah = atvv;
        }
        if (ah != null) {
            boolean b;
            if (ah.h.a == 1) {
                b = this.j.l((Object)ah);
            }
            else {
                b = this.i.l((Object)ah);
            }
            if (!b) {
                throw new RejectedExecutionException(this.e.concat(" was terminated"));
            }
        }
        if (atvv.h.a != 0) {
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
        for (int i = 1; i < length; ++i, n = n6, n2 = n7, n3 = n8, n5 = n9) {
            final atvq atvq = (atvq)this.g.a(i);
            if (atvq == null) {
                n6 = n;
                n7 = n2;
                n8 = n3;
                n9 = n5;
            }
            else {
                final zhb e = atvq.e;
                int ae;
                if (((atou)e.b).a != null) {
                    ae = e.ae() + 1;
                }
                else {
                    ae = e.ae();
                }
                final int d = atvq.d;
                final int n10 = d - 1;
                if (d == 0) {
                    throw null;
                }
                if (n10 != 0) {
                    if (n10 != 1) {
                        if (n10 != 2) {
                            if (n10 != 3) {
                                if (n10 != 4) {
                                    n6 = n;
                                    n7 = n2;
                                    n8 = n3;
                                    n9 = n5;
                                }
                                else {
                                    n9 = n5 + 1;
                                    n6 = n;
                                    n7 = n2;
                                    n8 = n3;
                                }
                            }
                            else {
                                final int n11 = n4 + 1;
                                n6 = n;
                                n7 = n2;
                                n8 = n3;
                                n4 = n11;
                                n9 = n5;
                                if (ae > 0) {
                                    final StringBuilder sb = new StringBuilder();
                                    sb.append(ae);
                                    sb.append("d");
                                    list.add(sb.toString());
                                    n6 = n;
                                    n7 = n2;
                                    n8 = n3;
                                    n4 = n11;
                                    n9 = n5;
                                }
                            }
                        }
                        else {
                            n8 = n3 + 1;
                            n6 = n;
                            n7 = n2;
                            n9 = n5;
                        }
                    }
                    else {
                        n7 = n2 + 1;
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append(ae);
                        sb2.append("b");
                        list.add(sb2.toString());
                        n6 = n;
                        n8 = n3;
                        n9 = n5;
                    }
                }
                else {
                    n6 = n + 1;
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append(ae);
                    sb3.append("c");
                    list.add(sb3.toString());
                    n9 = n5;
                    n8 = n3;
                    n7 = n2;
                }
            }
        }
        final long b = this.h.b;
        final String e2 = this.e;
        final String b2 = atqc.b(this);
        final int b3 = this.b;
        final int c = this.c;
        final int j = this.i.i();
        final int k = this.j.i();
        final int b4 = this.b;
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
        sb4.append((int)(0x1FFFFFL & b));
        sb4.append(", blocking tasks = ");
        sb4.append((int)((0x3FFFFE00000L & b) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(b4 - (int)((0x7FFFFC0000000000L & b) >> 42));
        sb4.append("}]");
        return sb4.toString();
    }
}
