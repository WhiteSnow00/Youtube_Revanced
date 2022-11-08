import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class atdl extends atdk
{
    private static final long serialVersionUID = -5737965195918321883L;
    
    public atdl(final aujp aujp, final int n, final int n2) {
        super(aujp, n, n2);
    }
    
    public final void b() {
        if (this.getAndIncrement() != 0) {
            return;
        }
        this.h();
    }
    
    public final void d() {
        this.f.decrementAndGet();
        this.b();
    }
    
    public final void f(final Throwable t) {
        athp.e(this.c, t);
        this.f.decrementAndGet();
        this.b();
    }
    
    public final void g(final atdj atdj, final Object o) {
        if (this.get() == 0 && this.compareAndSet(0, 1)) {
            if (this.d.get() != 0L) {
                this.a.tr(o);
                if (this.d.get() != Long.MAX_VALUE) {
                    this.d.decrementAndGet();
                }
                final long d = atdj.d + 1L;
                if (d >= atdj.c) {
                    atdj.d = 0L;
                    atdj.get().e(d);
                }
                else {
                    atdj.d = d;
                }
            }
            else if (!atdj.d().j(o)) {
                athh.f(atdj);
                athp.e(this.c, (Throwable)new asil("Queue full?!"));
                this.f.decrementAndGet();
                this.h();
                return;
            }
            if (this.decrementAndGet() == 0) {
                return;
            }
        }
        else {
            if (!atdj.d().j(o) && athh.f(atdj)) {
                athp.e(this.c, (Throwable)new asil("Queue full?!"));
                this.f.decrementAndGet();
            }
            if (this.getAndIncrement() != 0) {
                return;
            }
        }
        this.h();
    }
    
    final void h() {
        atdj[] b = this.b;
        int length = b.length;
        final aujp a = this.a;
        int n = 1;
        while (true) {
            final long value = this.d.get();
            long n2 = 0L;
            int n3 = length;
        Label_0264:
            while (n2 != value) {
                if (this.e) {
                    this.a();
                    return;
                }
                final int value2 = this.f.get();
                int i = 0;
                boolean b2 = true;
                while (i < n3) {
                    final atdj atdj = b[i];
                    final askd e = atdj.e;
                    if (e != null) {
                        final Object tt = e.tt();
                        if (tt != null) {
                            a.tr(tt);
                            final long d = atdj.d + 1L;
                            final int c = atdj.c;
                            final atdj[] array = b;
                            final int n4 = n3;
                            if (d == c) {
                                atdj.d = 0L;
                                atdj.get().e(d);
                            }
                            else {
                                atdj.d = d;
                            }
                            ++n2;
                            if (n2 == value) {
                                b = array;
                                n3 = n4;
                                break Label_0264;
                            }
                            b2 = false;
                        }
                    }
                    ++i;
                }
                if (value2 == 0) {
                    if (!b2) {
                        continue;
                    }
                    if (this.c.get() != null) {
                        a.b(athp.d(this.c));
                        return;
                    }
                    a.tu();
                    return;
                }
                else {
                    if (b2) {
                        break;
                    }
                    continue;
                }
            }
            Label_0380: {
                if (n2 == value) {
                    if (this.e) {
                        this.a();
                        return;
                    }
                    final int value3 = this.f.get();
                    int j = 0;
                    while (true) {
                        while (j < n3) {
                            final askd e2 = b[j].e;
                            if (e2 != null && !((aske)e2).i()) {
                                final boolean b3 = false;
                                if (value3 != 0 || !b3) {
                                    break Label_0380;
                                }
                                if (this.c.get() != null) {
                                    a.b(athp.d(this.c));
                                    return;
                                }
                                a.tu();
                                return;
                            }
                            else {
                                ++j;
                            }
                        }
                        final boolean b3 = true;
                        continue;
                    }
                }
            }
            length = n3;
            if (n2 != 0L && value != Long.MAX_VALUE) {
                this.d.addAndGet(-n2);
            }
            int n5 = this.get();
            if (n5 == n && (n5 = this.addAndGet(-n)) == 0) {
                return;
            }
            n = n5;
        }
    }
}
