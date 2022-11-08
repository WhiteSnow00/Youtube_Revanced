import java.util.concurrent.locks.LockSupport;

// 
// Decompiled by Procyon v0.6.0
// 

final class odc implements Runnable
{
    final int a;
    Thread b;
    volatile Thread c;
    odb d;
    int e;
    long f;
    volatile long g;
    final /* synthetic */ odd h;
    volatile int i;
    
    public odc(final odd h, final int a) {
        this.h = h;
        this.i = 2;
        this.a = a;
    }
    
    private final void d() {
        if (this.h.j) {
            final long n = this.f + 1L;
            this.f = n;
            this.g = n;
        }
    }
    
    public final void a() {
        if (this.b != null) {
            this.h.f.incrementAndGet();
        }
        this.b = null;
        this.c = null;
        this.i = 3;
        this.h.o.countDown();
    }
    
    public final void b() {
        this.h.i.newThread(this).start();
    }
    
    public final void c(final odb d) {
        final int e = this.e;
        if (e < 5) {
            d.a = this.d;
            d.b = this.a;
            this.d = d;
            this.e = e + 1;
        }
    }
    
    @Override
    public final void run() {
        final Thread currentThread = Thread.currentThread();
        this.b = currentThread;
        this.c = currentThread;
        if (!this.h.h.get()) {
        Label_0512:
            while (true) {
                final odb odb = this.h.c.poll();
                if (odb != null) {
                    this.h.a();
                    final Runnable runnable = (Runnable)odb.a;
                    this.c(odb);
                    try {
                        this.h.k.run();
                        try {
                            runnable.run();
                            try {
                                this.h.l.run();
                                this.d();
                                Thread.interrupted();
                                if (this.h.g) {
                                    break;
                                }
                                continue;
                            }
                            finally {
                                this.d();
                            }
                        }
                        finally {
                            try {
                                this.h.l.run();
                                this.d();
                            }
                            finally {
                                try {
                                    this.d();
                                }
                                catch (final Error odb) {}
                                catch (final RuntimeException ex) {}
                            }
                        }
                    }
                    catch (final Error error) {}
                    catch (final RuntimeException ex2) {}
                    if (this.h.h.get()) {
                        this.a();
                    }
                    else {
                        this.b();
                    }
                    throw odb;
                }
                this.i = 2;
                final odd h = this.h;
                odb odb2 = null;
                boolean b = false;
                int n = 0;
                Label_0417: {
                    while (true) {
                        final odb a = h.p.get();
                        final Object a2 = a.a;
                        final Object a3 = odd.a;
                        b = false;
                        if (a2 == a3) {
                            final int b2 = a.b;
                            if (b2 == 0) {
                                n = 3;
                                break Label_0417;
                            }
                            if (!oaw.f(h.p, a, h.n[b2 - 1])) {
                                continue;
                            }
                            if (odb2 != null) {
                                this.c(odb2);
                                break;
                            }
                            break;
                        }
                        else {
                            if (a2 == odd.b) {
                                final int b3 = a.b;
                                if (b3 > 0) {
                                    if (!oaw.f(h.p, a, h.m[b3 - 1])) {
                                        continue;
                                    }
                                    if (odb2 != null) {
                                        this.c(odb2);
                                        break;
                                    }
                                    break;
                                }
                            }
                            odb d;
                            if ((d = odb2) == null) {
                                d = this.d;
                                if (d == null) {
                                    d = new odb(this.h.m[0], this.a);
                                }
                                else {
                                    this.d = (odb)d.a;
                                    --this.e;
                                }
                            }
                            d.a = a;
                            odb2 = d;
                            if (oaw.f(h.p, a, d)) {
                                n = 2;
                                break Label_0417;
                            }
                            continue;
                        }
                    }
                    n = 1;
                }
                if (--n != 0) {
                    if (n == 2) {
                        this.i = 3;
                        break;
                    }
                    boolean b4 = b;
                    while (true) {
                        LockSupport.park(this.h);
                        final int i = this.i;
                        final int n2 = i - 1;
                        if (i == 0) {
                            throw null;
                        }
                        if (n2 != 0) {
                            if (n2 != 1) {
                                if (n2 != 2) {
                                    continue;
                                }
                                break Label_0512;
                            }
                            else {
                                b4 |= Thread.interrupted();
                            }
                        }
                        else {
                            if (b4) {
                                this.b.interrupt();
                                break;
                            }
                            break;
                        }
                    }
                }
                else {
                    this.i = 1;
                }
            }
            this.a();
            return;
        }
        this.a();
    }
}
