import java.util.ArrayList;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atap extends AtomicInteger implements ashy, asir
{
    static final Object a;
    private static final long serialVersionUID = -3688291656102519502L;
    final ashy b;
    final asjr c;
    final int d;
    final Map e;
    asir f;
    final AtomicBoolean g;
    
    static {
        a = new Object();
    }
    
    public atap(final ashy b, final asjr c, final int d) {
        this.g = new AtomicBoolean();
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = (Map)new ConcurrentHashMap();
        this.lazySet(1);
    }
    
    @Override
    public final void b(final Throwable e) {
        final ArrayList list = new ArrayList(this.e.values());
        this.e.clear();
        for (int size = list.size(), i = 0; i < size; ++i) {
            final ataq b = ((atio)list.get(i)).b;
            b.e = e;
            b.d = true;
            b.a();
        }
        this.b.b(e);
    }
    
    @Override
    public final void d(final asir f) {
        if (asjv.g(this.f, f)) {
            this.f = f;
            this.b.d(this);
        }
    }
    
    @Override
    public final void dispose() {
        if (this.g.compareAndSet(false, true) && this.decrementAndGet() == 0) {
            this.f.dispose();
        }
    }
    
    public final void f(final Object o) {
        Object a = o;
        if (o == null) {
            a = atap.a;
        }
        this.e.remove(a);
        if (this.decrementAndGet() == 0) {
            this.f.dispose();
        }
    }
    
    @Override
    public final boolean tA() {
        return this.g.get();
    }
    
    @Override
    public final void tu(final Object o) {
        try {
            final Object a = this.c.a(o);
            Object a2;
            if (a != null) {
                a2 = a;
            }
            else {
                a2 = atap.a;
            }
            atio atio;
            if ((atio = this.e.get(a2)) == null) {
                if (this.g.get()) {
                    return;
                }
                atio = new atio(a, new ataq(this.d, this, a));
                this.e.put(a2, atio);
                this.getAndIncrement();
                this.b.tu(atio);
            }
            try {
                askk.b(o, "The value supplied is null");
                final ataq b = atio.b;
                b.b.j(o);
                b.a();
            }
            finally {
                final Throwable t;
                asgz.c(t);
                this.f.dispose();
                this.b(t);
            }
        }
        finally {
            final Throwable t2;
            asgz.c(t2);
            this.f.dispose();
            this.b(t2);
        }
    }
    
    @Override
    public final void tx() {
        final ArrayList list = new ArrayList(this.e.values());
        this.e.clear();
        for (int size = list.size(), i = 0; i < size; ++i) {
            final ataq b = ((atio)list.get(i)).b;
            b.d = true;
            b.a();
        }
        this.b.tx();
    }
}
