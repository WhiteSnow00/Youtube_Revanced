import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

class asrp extends AtomicReference
{
    private static final long serialVersionUID = 2346567790059478686L;
    asrr a;
    int b;
    long c;
    
    public asrp() {
        this.set(this.a = new asrr(null, 0L));
    }
    
    final void a(final asrr a) {
        this.a.set(a);
        this.a = a;
        ++this.b;
    }
    
    public final void b(final asrq asrq) {
        monitorenter(asrq);
        try {
            if (asrq.e) {
                asrq.f = true;
                monitorexit(asrq);
                return;
            }
            asrq.e = true;
            monitorexit(asrq);
            while (!asrq.tx()) {
                final long value = asrq.get();
                Object o;
                if ((o = asrq.c) == null) {
                    o = this.get();
                    asrq.c = o;
                    atnp.i(asrq.d, ((asrr)o).b);
                }
                long n = value;
                long n2 = 0L;
                while (n != 0L) {
                    final asrr asrr = ((asrr)o).get();
                    if (asrr != null) {
                        o = asrr.a;
                        try {
                            final aujp b = asrq.b;
                            if (o == atht.a) {
                                b.tu();
                            }
                            else if (o instanceof athr) {
                                b.b(((athr)o).a);
                            }
                            else {
                                b.tr(o);
                                ++n2;
                                --n;
                                if (!asrq.tx()) {
                                    o = asrr;
                                    continue;
                                }
                                asrq.c = null;
                                return;
                            }
                            asrq.c = null;
                            return;
                        }
                        finally {
                            final Throwable t;
                            asey.d(t);
                            asrq.c = null;
                            asrq.dispose();
                            if (!atht.h(o) && !atht.g(o)) {
                                asrq.b.b(t);
                            }
                            return;
                        }
                        break;
                    }
                    break;
                }
                if (n2 != 0L) {
                    asrq.c = o;
                    if (value != Long.MAX_VALUE) {
                        atnp.n(asrq, n2);
                    }
                }
                synchronized (asrq) {
                    if (!asrq.f) {
                        asrq.e = false;
                        return;
                    }
                    asrq.f = false;
                    continue;
                }
            }
            asrq.c = null;
        }
        finally {
            monitorexit(asrq);
            while (true) {}
        }
    }
    
    final void c() {
        final asrr asrr = this.get();
        if (asrr.a != null) {
            final asrr asrr2 = new asrr(null, 0L);
            asrr2.lazySet(asrr.get());
            this.set(asrr2);
        }
    }
    
    public void d() {
    }
}
