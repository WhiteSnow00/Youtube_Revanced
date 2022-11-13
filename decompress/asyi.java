import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class asyi extends AtomicInteger implements asir
{
    private static final long serialVersionUID = 8567835998786448817L;
    final ashy a;
    final asjr b;
    final asyh[] c;
    Object[] d;
    final atgh e;
    volatile boolean f;
    volatile boolean g;
    final atid h;
    int i;
    int j;
    
    public asyi(final ashy a, final asjr b, final int n, final int n2) {
        this.h = new atid();
        this.a = a;
        this.b = b;
        this.d = new Object[n];
        final asyh[] c = new asyh[n];
        for (int i = 0; i < n; ++i) {
            c[i] = new asyh(this, i);
        }
        this.c = c;
        this.e = new atgh(n2);
    }
    
    final void a() {
        final asyh[] c = this.c;
        for (int length = c.length, i = 0; i < length; ++i) {
            asjv.b((AtomicReference)c[i]);
        }
    }
    
    final void b(final atgh atgh) {
        synchronized (this) {
            this.d = null;
            monitorexit(this);
            atgh.c();
        }
    }
    
    final void c() {
        if (this.getAndIncrement() != 0) {
            return;
        }
        final atgh e = this.e;
        final ashy a = this.a;
        int addAndGet = 1;
        while (!this.f) {
            if (this.h.get() == null) {
                final boolean g = this.g;
                final Object[] array = (Object[])e.tw();
                if (g) {
                    if (array == null) {
                        this.b(e);
                        final Throwable d = atih.d((AtomicReference)this.h);
                        if (d == null) {
                            a.tx();
                            return;
                        }
                        a.b(d);
                        return;
                    }
                }
                else if (array == null) {
                    if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                        return;
                    }
                    continue;
                }
                try {
                    final Object a2 = this.b.a((Object)array);
                    askk.b(a2, "The combiner returned a null value");
                    a.tu(a2);
                    continue;
                }
                finally {
                    final Throwable t;
                    asgz.c(t);
                    atih.e((AtomicReference)this.h, t);
                    this.a();
                    this.b(e);
                    a.b(atih.d((AtomicReference)this.h));
                    return;
                }
            }
            this.a();
            this.b(e);
            a.b(atih.d((AtomicReference)this.h));
            return;
        }
        this.b(e);
    }
    
    final void d(int n, final Object o) {
        synchronized (this) {
            final Object[] d = this.d;
            if (d == null) {
                return;
            }
            final Object o2 = d[n];
            int i;
            final int n2 = i = this.i;
            if (o2 == null) {
                i = n2 + 1;
                this.i = i;
            }
            d[n] = o;
            if (i == d.length) {
                this.e.j(d.clone());
                n = 1;
            }
            else {
                n = 0;
            }
            monitorexit(this);
            if (n != 0) {
                this.c();
            }
        }
    }
    
    @Override
    public final void dispose() {
        if (!this.f) {
            this.f = true;
            this.a();
            if (this.getAndIncrement() == 0) {
                this.b(this.e);
            }
        }
    }
    
    @Override
    public final boolean tA() {
        return this.f;
    }
}
