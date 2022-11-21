import java.util.ArrayList;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atdl extends AtomicInteger implements asku, asln
{
    static final Object a;
    private static final long serialVersionUID = -3688291656102519502L;
    final asku b;
    final asmn c;
    final int d;
    final Map e;
    asln f;
    final AtomicBoolean g;
    
    static {
        a = new Object();
    }
    
    public atdl(final asku b, final asmn c, final int d) {
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
            final atdm b = ((atll)list.get(i)).b;
            b.e = e;
            b.d = true;
            b.a();
        }
        this.b.b(e);
    }
    
    @Override
    public final void d(final asln f) {
        if (asmr.g(this.f, f)) {
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
            a = atdl.a;
        }
        this.e.remove(a);
        if (this.decrementAndGet() == 0) {
            this.f.dispose();
        }
    }
    
    @Override
    public final void tt(final Object o) {
        try {
            final Object a = this.c.a(o);
            Object a2;
            if (a != null) {
                a2 = a;
            }
            else {
                a2 = atdl.a;
            }
            atll atll;
            if ((atll = this.e.get(a2)) == null) {
                if (this.g.get()) {
                    return;
                }
                atll = new atll(a, new atdm(this.d, this, a));
                this.e.put(a2, atll);
                this.getAndIncrement();
                this.b.tt(atll);
            }
            try {
                asng.b(o, "The value supplied is null");
                final atdm b = atll.b;
                b.b.j(o);
                b.a();
            }
            finally {
                final Throwable t;
                asjv.a(t);
                this.f.dispose();
                this.b(t);
            }
        }
        finally {
            final Throwable t2;
            asjv.a(t2);
            this.f.dispose();
            this.b(t2);
        }
    }
    
    @Override
    public final void tw() {
        final ArrayList list = new ArrayList(this.e.values());
        this.e.clear();
        for (int size = list.size(), i = 0; i < size; ++i) {
            final atdm b = ((atll)list.get(i)).b;
            b.d = true;
            b.a();
        }
        this.b.tw();
    }
    
    @Override
    public final boolean tz() {
        return this.g.get();
    }
}
