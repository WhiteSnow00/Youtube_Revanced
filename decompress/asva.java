import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

class asva extends AtomicReference
{
    private static final long serialVersionUID = 2346567790059478686L;
    asvc a;
    int b;
    long c;
    
    public asva() {
        this.set(this.a = new asvc(null, 0L));
    }
    
    final void a(final asvc a) {
        this.a.set(a);
        this.a = a;
        ++this.b;
    }
    
    public final void b(final asvb asvb) {
        monitorenter(asvb);
        try {
            if (asvb.e) {
                asvb.f = true;
                monitorexit(asvb);
                return;
            }
            asvb.e = true;
            monitorexit(asvb);
            while (!asvb.tz()) {
                final long value = asvb.get();
                Object o;
                if ((o = asvb.c) == null) {
                    o = this.get();
                    asvb.c = o;
                    auop.A(asvb.d, ((asvc)o).b);
                }
                long n = value;
                long n2 = 0L;
                while (n != 0L) {
                    final asvc asvc = ((asvc)o).get();
                    if (asvc != null) {
                        o = asvc.a;
                        try {
                            final auna b = asvb.b;
                            if (o == atli.a) {
                                b.tw();
                            }
                            else if (o instanceof atlg) {
                                b.b(((atlg)o).a);
                            }
                            else {
                                b.tt(o);
                                ++n2;
                                --n;
                                if (!asvb.tz()) {
                                    o = asvc;
                                    continue;
                                }
                                asvb.c = null;
                                return;
                            }
                            asvb.c = null;
                            return;
                        }
                        finally {
                            final Throwable t;
                            asjv.a(t);
                            asvb.c = null;
                            asvb.dispose();
                            if (!atli.h(o) && !atli.g(o)) {
                                asvb.b.b(t);
                            }
                            return;
                        }
                        break;
                    }
                    break;
                }
                if (n2 != 0L) {
                    asvb.c = o;
                    if (value != Long.MAX_VALUE) {
                        auop.F((AtomicLong)asvb, n2);
                    }
                }
                synchronized (asvb) {
                    if (!asvb.f) {
                        asvb.e = false;
                        return;
                    }
                    asvb.f = false;
                    continue;
                }
            }
            asvb.c = null;
        }
        finally {
            monitorexit(asvb);
            while (true) {}
        }
    }
    
    final void c() {
        final asvc asvc = this.get();
        if (asvc.a != null) {
            final asvc asvc2 = new asvc(null, 0L);
            asvc2.lazySet(asvc.get());
            this.set(asvc2);
        }
    }
    
    public void d() {
    }
}
