import java.util.concurrent.Callable;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class aszq extends AtomicInteger implements asir, ashy
{
    static final aszp[] a;
    static final aszp[] b;
    private static final long serialVersionUID = -2117620485640801370L;
    final ashy c;
    final asjr d;
    final boolean e;
    final int f;
    final int g;
    volatile asks h;
    volatile boolean i;
    final atid j;
    volatile boolean k;
    final AtomicReference l;
    asir m;
    long n;
    long o;
    int p;
    Queue q;
    int r;
    
    static {
        a = new aszp[0];
        b = new aszp[0];
    }
    
    public aszq(final ashy c, final asjr d, final boolean e, final int f, final int g) {
        this.j = new atid();
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        if (f != Integer.MAX_VALUE) {
            this.q = new ArrayDeque(f);
        }
        this.l = new AtomicReference((V)(Object)aszq.a);
    }
    
    @Override
    public final void b(final Throwable t) {
        if (this.i) {
            atqx.j(t);
            return;
        }
        if (atih.e((AtomicReference)this.j, t)) {
            this.i = true;
            this.f();
            return;
        }
        atqx.j(t);
    }
    
    @Override
    public final void d(final asir m) {
        if (asjv.g(this.m, m)) {
            this.m = m;
            this.c.d(this);
        }
    }
    
    @Override
    public final void dispose() {
        if (!this.k) {
            this.k = true;
            if (this.k()) {
                final Throwable d = atih.d((AtomicReference)this.j);
                if (d != null && d != atih.a) {
                    atqx.j(d);
                }
            }
        }
    }
    
    final void f() {
        if (this.getAndIncrement() == 0) {
            this.g();
        }
    }
    
    final void g() {
        final ashy c = this.c;
        int addAndGet = 1;
        while (!this.j()) {
            final asks h = this.h;
            Label_0065: {
                if (h != null) {
                    while (!this.j()) {
                        final Object tw = h.tw();
                        if (tw == null) {
                            break Label_0065;
                        }
                        c.tu(tw);
                    }
                    return;
                }
            }
            final boolean i = this.i;
            final asks h2 = this.h;
            final aszp[] array = this.l.get();
            final int length = array.length;
            int n = this.f;
            final int n2 = 0;
            Label_0133: {
                if (n != Integer.MAX_VALUE) {
                    synchronized (this) {
                        n = this.q.size();
                        break Label_0133;
                    }
                }
                n = 0;
            }
            if (i && (h2 == null || h2.i()) && length == 0 && n == 0) {
                final Throwable d = atih.d((AtomicReference)this.j);
                if (d != atih.a) {
                    if (d == null) {
                        c.tx();
                        return;
                    }
                    c.b(d);
                }
                return;
            }
            int j = n2;
            if (length != 0) {
                final long o = this.o;
                final int p = this.p;
                int n3 = 0;
                Label_0311: {
                    if (length > p) {
                        n3 = p;
                        if (array[p].a == o) {
                            break Label_0311;
                        }
                    }
                    if (length <= (n3 = p)) {
                        n3 = 0;
                    }
                    for (int n4 = 0; n4 < length && array[n3].a != o; ++n4) {
                        if (++n3 == length) {
                            n3 = 0;
                        }
                    }
                    this.p = n3;
                    this.o = array[n3].a;
                }
                int k = 0;
                int n5 = 0;
                while (k < length) {
                    if (this.j()) {
                        return;
                    }
                    final aszp aszp = array[n3];
                    final askt d2 = aszp.d;
                    Label_0523: {
                        Label_0521: {
                            Label_0446: {
                                if (d2 != null) {
                                    try {
                                        do {
                                            final Object tw2 = d2.tw();
                                            if (tw2 == null) {
                                                break Label_0446;
                                            }
                                            c.tu(tw2);
                                        } while (!this.j());
                                        return;
                                    }
                                    finally {
                                        final Throwable t;
                                        asgz.c(t);
                                        asjv.b(aszp);
                                        atih.e((AtomicReference)this.j, t);
                                        if (this.j()) {
                                            return;
                                        }
                                        this.h(aszp);
                                        final int n6 = n5 + 1;
                                        final int n7 = n3 + 1;
                                        n5 = n6;
                                        if ((n3 = n7) == length) {
                                            n5 = n6;
                                            break Label_0521;
                                        }
                                        break Label_0523;
                                    }
                                }
                            }
                            final boolean c2 = aszp.c;
                            final askt d3 = aszp.d;
                            int n8 = n5;
                            Label_0502: {
                                if (c2) {
                                    if (d3 != null) {
                                        n8 = n5;
                                        if (!d3.i()) {
                                            break Label_0502;
                                        }
                                    }
                                    this.h(aszp);
                                    if (this.j()) {
                                        return;
                                    }
                                    n8 = n5 + 1;
                                }
                            }
                            final int n9 = n3 + 1;
                            n5 = n8;
                            if ((n3 = n9) != length) {
                                break Label_0523;
                            }
                            n5 = n8;
                        }
                        n3 = 0;
                    }
                    ++k;
                }
                this.p = n3;
                this.o = array[n3].a;
                j = n5;
            }
            Label_0621: {
                if (j != 0) {
                    if (this.f != Integer.MAX_VALUE) {
                        while (j != 0) {
                            synchronized (this) {
                                final ashw ashw = this.q.poll();
                                --j;
                                if (ashw == null) {
                                    --this.r;
                                    continue;
                                }
                                monitorexit(this);
                                this.i(ashw);
                                continue;
                            }
                            break Label_0621;
                        }
                        continue;
                    }
                    continue;
                }
            }
            if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                return;
            }
        }
    }
    
    final void h(final aszp aszp) {
        aszp[] array;
        aszp[] a;
    Label_0098:
        do {
            array = this.l.get();
            final int length = array.length;
            if (length != 0) {
                int i = 0;
                while (true) {
                    while (i < length) {
                        if (array[i] == aszp) {
                            if (i < 0) {
                                return;
                            }
                            if (length == 1) {
                                a = aszq.a;
                                continue Label_0098;
                            }
                            a = new aszp[length - 1];
                            System.arraycopy(array, 0, a, 0, i);
                            System.arraycopy(array, i + 1, a, i, length - i - 1);
                            continue Label_0098;
                        }
                        else {
                            ++i;
                        }
                    }
                    i = -1;
                    continue;
                }
            }
            break;
        } while (!attr.f(this.l, (Object)array, (Object)a));
    }
    
    final void i(ashw o) {
        Label_0248: {
            while (true) {
                final boolean b = o instanceof Callable;
                boolean b2 = false;
                if (!b) {
                    break Label_0248;
                }
                final Callable callable = (Callable)o;
                Label_0188: {
                    try {
                        final Object call = callable.call();
                        if (call != null) {
                            if (this.get() == 0 && this.compareAndSet(0, 1)) {
                                this.c.tu(call);
                                if (this.decrementAndGet() == 0) {
                                    break Label_0188;
                                }
                            }
                            else {
                                Object h;
                                if ((h = this.h) == null) {
                                    if (this.f == Integer.MAX_VALUE) {
                                        h = new atgh(this.g);
                                    }
                                    else {
                                        h = new atgg(this.f);
                                    }
                                    this.h = (asks)h;
                                }
                                if (!((asks)h).j(call)) {
                                    this.b(new IllegalStateException("Scalar queue full?!"));
                                    break Label_0188;
                                }
                                if (this.getAndIncrement() != 0) {
                                    break;
                                }
                            }
                            this.g();
                        }
                    }
                    finally {
                        final Throwable t;
                        asgz.c(t);
                        atih.e((AtomicReference)this.j, t);
                        this.f();
                    }
                }
                if (this.f != Integer.MAX_VALUE) {
                    synchronized (this) {
                        o = this.q.poll();
                        if (o == null) {
                            --this.r;
                            b2 = true;
                        }
                        monitorexit(this);
                        if (!b2) {
                            continue;
                        }
                        this.f();
                        return;
                    }
                    break;
                }
                break;
            }
            return;
        }
        final long n = this.n;
        this.n = 1L + n;
        final aszp aszp = new aszp(this, n);
        aszp[] array;
        aszp[] array2;
        do {
            array = this.l.get();
            if (array == aszq.b) {
                asjv.b(aszp);
                return;
            }
            final int length = array.length;
            array2 = new aszp[length + 1];
            System.arraycopy(array, 0, array2, 0, length);
            array2[length] = aszp;
        } while (!attr.f(this.l, (Object)array, (Object)array2));
        ((ashw)o).aP(aszp);
    }
    
    final boolean j() {
        if (this.k) {
            return true;
        }
        final Throwable t = (Throwable)this.j.get();
        if (!this.e && t != null) {
            this.k();
            final Throwable d = atih.d((AtomicReference)this.j);
            if (d != atih.a) {
                this.c.b(d);
            }
            return true;
        }
        return false;
    }
    
    final boolean k() {
        this.m.dispose();
        final aszp[] array = this.l.get();
        final aszp[] b = aszq.b;
        int i = 0;
        if (array != b) {
            final aszp[] array2 = this.l.getAndSet(b);
            if (array2 != b) {
                while (i < array2.length) {
                    asjv.b(array2[i]);
                    ++i;
                }
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final boolean tA() {
        return this.k;
    }
    
    @Override
    public final void tu(final Object o) {
        if (this.i) {
            return;
        }
        try {
            final Object o2 = this.d.a(o);
            askk.b(o2, "The mapper returned a null ObservableSource");
            if (this.f != Integer.MAX_VALUE) {
                synchronized (this) {
                    final int r = this.r;
                    if (r == this.f) {
                        this.q.offer(o2);
                        return;
                    }
                    this.r = r + 1;
                }
            }
            this.i((ashw)o2);
        }
        finally {
            final Throwable t;
            asgz.c(t);
            this.m.dispose();
            this.b(t);
        }
    }
    
    @Override
    public final void tx() {
        if (this.i) {
            return;
        }
        this.i = true;
        this.f();
    }
}
