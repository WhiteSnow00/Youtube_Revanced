import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class atbe extends AtomicInteger implements asln
{
    private static final long serialVersionUID = 8567835998786448817L;
    final asku a;
    final asmn b;
    final atbd[] c;
    Object[] d;
    final atje e;
    volatile boolean f;
    volatile boolean g;
    final atla h;
    int i;
    int j;
    
    public atbe(final asku a, final asmn b, final int n, final int n2) {
        this.h = new atla();
        this.a = a;
        this.b = b;
        this.d = new Object[n];
        final atbd[] c = new atbd[n];
        for (int i = 0; i < n; ++i) {
            c[i] = new atbd(this, i);
        }
        this.c = c;
        this.e = new atje(n2);
    }
    
    final void a() {
        final atbd[] c = this.c;
        for (int length = c.length, i = 0; i < length; ++i) {
            asmr.b(c[i]);
        }
    }
    
    final void b(final atje atje) {
        synchronized (this) {
            this.d = null;
            monitorexit(this);
            atje.c();
        }
    }
    
    final void c() {
        if (this.getAndIncrement() != 0) {
            return;
        }
        final atje e = this.e;
        final asku a = this.a;
        int addAndGet = 1;
        while (!this.f) {
            if (this.h.get() == null) {
                final boolean g = this.g;
                final Object[] array = (Object[])e.tv();
                if (g) {
                    if (array == null) {
                        this.b(e);
                        final Throwable d = atle.d(this.h);
                        if (d == null) {
                            a.tw();
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
                    final Object a2 = this.b.a(array);
                    asng.b(a2, "The combiner returned a null value");
                    a.tt(a2);
                    continue;
                }
                finally {
                    final Throwable t;
                    asjv.a(t);
                    atle.e(this.h, t);
                    this.a();
                    this.b(e);
                    a.b(atle.d(this.h));
                    return;
                }
            }
            this.a();
            this.b(e);
            a.b(atle.d(this.h));
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
                this.e.j((Object)d.clone());
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
    public final boolean tz() {
        return this.f;
    }
}
