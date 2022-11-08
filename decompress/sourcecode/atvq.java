import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.Random;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atvq extends Thread
{
    public final atos a;
    public boolean b;
    final /* synthetic */ atvr c;
    public int d;
    public final zhb e;
    private long f;
    private long g;
    private int h;
    public volatile int indexInArray;
    public volatile Object nextParkedWorker;
    
    public atvq(final atvr c, final int n) {
        this.c = c;
        this.setDaemon(true);
        this.e = new zhb((byte[])null);
        this.d = 4;
        this.a = auet.i();
        this.nextParkedWorker = atvr.a;
        final atnv b = atnw.b;
        final Object value = ((atns)atnw.c).a.get();
        value.getClass();
        this.h = ((Random)value).nextInt();
        this.c(n);
    }
    
    private final atvv e() {
        if (this.a(2) == 0) {
            final atvv atvv = (atvv)this.c.i.j();
            if (atvv != null) {
                return atvv;
            }
            return (atvv)this.c.j.j();
        }
        else {
            final atvv atvv2 = (atvv)this.c.j.j();
            if (atvv2 != null) {
                return atvv2;
            }
            return (atvv)this.c.i.j();
        }
    }
    
    private final atvv f(final boolean b) {
        final boolean a = atqb.a;
        final int n = (int)(this.c.h.b & 0x1FFFFFL);
        if (n < 2) {
            return null;
        }
        int a2 = this.a(n);
        final atvr c = this.c;
        int i = 0;
        long g = Long.MAX_VALUE;
        while (i < n) {
            if (++a2 > n) {
                a2 = 1;
            }
            final atvq atvq = (atvq)c.g.a(a2);
            long min;
            if (atvq != null && atvq != this) {
                long n3 = 0L;
                int n4 = 0;
                Label_0359: {
                    if (b) {
                        final zhb e = this.e;
                        final zhb e2 = atvq.e;
                        e2.getClass();
                        int j = ((atos)e2.c).a;
                        final int a3 = ((atos)e2.e).a;
                        final Object a4 = e2.a;
                        while (true) {
                            while (j != a3) {
                                final int n2 = j & 0x7F;
                                if (((atos)e2.d).a == 0) {
                                    break;
                                }
                                final AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray)a4;
                                final atvv atvv = atomicReferenceArray.get(n2);
                                Label_0271: {
                                    if (atvv != null && atvv.h.a == 1) {
                                        while (!atomicReferenceArray.compareAndSet(n2, atvv, null)) {
                                            if (atomicReferenceArray.get(n2) != atvv) {
                                                break Label_0271;
                                            }
                                        }
                                        ((atos)e2.d).c();
                                        e.ah(atvv);
                                        n3 = -1L;
                                        n4 = a2;
                                        break Label_0359;
                                    }
                                }
                                ++j;
                            }
                            n3 = e.at(e2, true);
                            continue;
                        }
                    }
                    final zhb e3 = this.e;
                    final zhb e4 = atvq.e;
                    e4.getClass();
                    final atvv ag = e4.ag();
                    if (ag != null) {
                        e3.ah(ag);
                        n3 = -1L;
                        n4 = a2;
                    }
                    else {
                        n3 = e3.at(e4, false);
                        n4 = a2;
                    }
                }
                if (n3 == -1L) {
                    return this.e.af();
                }
                min = g;
                a2 = n4;
                if (n3 > 0L) {
                    min = Math.min(g, n3);
                    a2 = n4;
                }
            }
            else {
                min = g;
            }
            ++i;
            g = min;
        }
        if (g == Long.MAX_VALUE) {
            g = 0L;
        }
        this.g = g;
        return null;
    }
    
    private final boolean g() {
        return this.nextParkedWorker != atvr.a;
    }
    
    public final int a(final int n) {
        final int h = this.h;
        final int n2 = h ^ h << 13;
        final int n3 = n2 ^ n2 >> 17;
        final int h2 = n3 ^ n3 << 5;
        this.h = h2;
        final int n4 = n - 1;
        if ((n4 & n) == 0x0) {
            return h2 & n4;
        }
        return (h2 & Integer.MAX_VALUE) % n;
    }
    
    public final atvv b(final boolean b) {
        final int d = this.d;
        boolean b2 = true;
        if (d != 1) {
            final atvr c = this.c;
            final atot h = c.h;
            long b3;
            do {
                b3 = h.b;
                if ((int)((0x7FFFFC0000000000L & b3) >> 42) == 0) {
                    atvv af;
                    if (b) {
                        if ((af = this.e.af()) == null) {
                            af = (atvv)this.c.j.j();
                        }
                    }
                    else {
                        af = (atvv)this.c.j.j();
                    }
                    atvv f;
                    if ((f = af) == null) {
                        f = this.f(true);
                    }
                    return f;
                }
            } while (!c.h.b(b3, -4398046511104L + b3));
            this.d = 1;
        }
        atvv atvv;
        if (b) {
            final int b4 = this.c.b;
            if (this.a(b4 + b4) != 0) {
                b2 = false;
            }
            if (b2) {
                atvv = this.e();
                if (atvv != null) {
                    return atvv;
                }
            }
            atvv = this.e.af();
            if (atvv == null) {
                if (b2) {
                    return this.f(false);
                }
                atvv = this.e();
                if (atvv == null) {
                    return this.f(false);
                }
            }
        }
        else {
            atvv = this.e();
            if (atvv == null) {
                return this.f(false);
            }
        }
        return atvv;
    }
    
    public final void c(final int indexInArray) {
        final String e = this.c.e;
        String value;
        if (indexInArray == 0) {
            value = "TERMINATED";
        }
        else {
            value = String.valueOf(indexInArray);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(e);
        sb.append("-worker-");
        sb.append(value);
        this.setName(sb.toString());
        this.indexInArray = indexInArray;
    }
    
    public final boolean d(final int d) {
        final int d2 = this.d;
        boolean b = true;
        if (d2 != 1) {
            b = false;
        }
        if (b) {
            this.c.h.a(4398046511104L);
        }
        if (d2 != d) {
            this.d = d;
        }
        return b;
    }
    
    @Override
    public final void run() {
    Label_0000:
        while (true) {
            int n = 0;
            while (!this.c.c() && this.d != 5) {
                final atvv b = this.b(this.b);
                if (b != null) {
                    this.g = 0L;
                    final int a = b.h.a;
                    this.f = 0L;
                    if (this.d == 3) {
                        final boolean a2 = atqb.a;
                        this.d = 2;
                    }
                    if (a != 0) {
                        if (this.d(2)) {
                            this.c.b();
                        }
                    }
                    atvr.f(b);
                    if (a == 0) {
                        continue Label_0000;
                    }
                    this.c.h.a(-2097152L);
                    if (this.d != 5) {
                        final boolean a3 = atqb.a;
                        this.d = 4;
                        continue Label_0000;
                    }
                    continue Label_0000;
                }
                else {
                    this.b = false;
                    if (this.g != 0L) {
                        if (n != 0) {
                            this.d(3);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.g);
                            this.g = 0L;
                            continue Label_0000;
                        }
                        n = 1;
                    }
                    else if (!this.g()) {
                        final atvr c = this.c;
                        if (this.nextParkedWorker != atvr.a) {
                            continue;
                        }
                        final atot f = c.f;
                        long b2;
                        int indexInArray;
                        do {
                            b2 = f.b;
                            indexInArray = this.indexInArray;
                            final boolean a4 = atqb.a;
                            this.nextParkedWorker = c.g.a((int)(b2 & 0x1FFFFFL));
                        } while (!c.f.b(b2, (long)indexInArray | (2097152L + b2 & 0xFFFFFFFFFFE00000L)));
                    }
                    else {
                        final boolean a5 = atqb.a;
                        this.a.a = -1;
                        while (this.g() && this.a.a == -1 && !this.c.c() && this.d != 5) {
                            this.d(3);
                            Thread.interrupted();
                            if (this.f == 0L) {
                                this.f = System.nanoTime() + this.c.d;
                            }
                            LockSupport.parkNanos(this.c.d);
                            if (System.nanoTime() - this.f >= 0L) {
                                this.f = 0L;
                                final atvr c2 = this.c;
                                synchronized (c2.g) {
                                    if (c2.c()) {
                                        continue;
                                    }
                                    if ((int)(c2.h.b & 0x1FFFFFL) <= c2.b) {
                                        continue;
                                    }
                                    if (!this.a.a(-1, 1)) {
                                        continue;
                                    }
                                    final int indexInArray2 = this.indexInArray;
                                    this.c(0);
                                    c2.a(this, indexInArray2, 0);
                                    final atot h = c2.h;
                                    final long andDecrement = atot.a.getAndDecrement(h);
                                    final auet c3 = h.c;
                                    final int n2 = (int)(andDecrement & 0x1FFFFFL);
                                    if (n2 != indexInArray2) {
                                        final Object a6 = c2.g.a(n2);
                                        a6.getClass();
                                        final atvq atvq = (atvq)a6;
                                        c2.g.b(indexInArray2, atvq);
                                        atvq.c(indexInArray2);
                                        c2.a(atvq, n2, indexInArray2);
                                    }
                                    c2.g.b(n2, null);
                                    monitorexit(c2.g);
                                    this.d = 5;
                                }
                            }
                        }
                    }
                }
            }
            break;
        }
        this.d(5);
    }
}
