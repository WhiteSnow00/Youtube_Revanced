import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class ated extends atec
{
    private static final long serialVersionUID = -5737965195918321883L;
    
    public ated(final aukf aukf, final int n, final int n2) {
        super(aukf, n, n2);
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
        atih.e((AtomicReference)this.c, t);
        this.f.decrementAndGet();
        this.b();
    }
    
    public final void g(final ateb ateb, final Object o) {
        if (this.get() == 0 && this.compareAndSet(0, 1)) {
            if (this.d.get() != 0L) {
                this.a.tu(o);
                if (this.d.get() != Long.MAX_VALUE) {
                    this.d.decrementAndGet();
                }
                final long d = ateb.d + 1L;
                if (d >= ateb.c) {
                    ateb.d = 0L;
                    ateb.get().e(d);
                }
                else {
                    ateb.d = d;
                }
            }
            else if (!ateb.d().j(o)) {
                athz.f((AtomicReference)ateb);
                atih.e((AtomicReference)this.c, (Throwable)new asja("Queue full?!"));
                this.f.decrementAndGet();
                this.h();
                return;
            }
            if (this.decrementAndGet() == 0) {
                return;
            }
        }
        else {
            if (!ateb.d().j(o) && athz.f((AtomicReference)ateb)) {
                atih.e((AtomicReference)this.c, (Throwable)new asja("Queue full?!"));
                this.f.decrementAndGet();
            }
            if (this.getAndIncrement() != 0) {
                return;
            }
        }
        this.h();
    }
    
    final void h() {
        ateb[] b = this.b;
        int length = b.length;
        final aukf a = this.a;
        int n = 1;
        while (true) {
            final long value = this.d.get();
            long n2 = 0L;
            int n3 = length;
        Label_0268:
            while (n2 != value) {
                if (this.e) {
                    this.a();
                    return;
                }
                final int value2 = this.f.get();
                int i = 0;
                boolean b2 = true;
                while (i < n3) {
                    final ateb ateb = b[i];
                    final asks e = ateb.e;
                    if (e != null) {
                        final Object tw = e.tw();
                        if (tw != null) {
                            a.tu(tw);
                            final long d = ateb.d + 1L;
                            final int c = ateb.c;
                            final ateb[] array = b;
                            final int n4 = n3;
                            if (d == c) {
                                ateb.d = 0L;
                                ateb.get().e(d);
                            }
                            else {
                                ateb.d = d;
                            }
                            ++n2;
                            if (n2 == value) {
                                b = array;
                                n3 = n4;
                                break Label_0268;
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
                        a.b(atih.d((AtomicReference)this.c));
                        return;
                    }
                    a.tx();
                    return;
                }
                else {
                    if (b2) {
                        break;
                    }
                    continue;
                }
            }
            Label_0386: {
                if (n2 == value) {
                    if (this.e) {
                        this.a();
                        return;
                    }
                    final int value3 = this.f.get();
                    int j = 0;
                    while (true) {
                        while (j < n3) {
                            final asks e2 = b[j].e;
                            if (e2 != null && !((askt)e2).i()) {
                                final boolean b3 = false;
                                if (value3 != 0 || !b3) {
                                    break Label_0386;
                                }
                                if (this.c.get() != null) {
                                    a.b(atih.d((AtomicReference)this.c));
                                    return;
                                }
                                a.tx();
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
