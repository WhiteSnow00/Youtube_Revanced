import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class ates extends AtomicReference implements atew
{
    private static final long serialVersionUID = 2346567790059478686L;
    atev a;
    int b;
    
    public ates() {
        this.set(this.a = new atev(null));
    }
    
    final void a(final atev a) {
        this.a.set(a);
        this.a = a;
        ++this.b;
    }
    
    @Override
    public final void b() {
        this.a(new atev(atli.a));
        this.f();
    }
    
    @Override
    public final void c(final Throwable t) {
        this.a(new atev(atli.b(t)));
        this.f();
    }
    
    @Override
    public final void d(final Object o) {
        final atli a = atli.a;
        this.a(new atev(o));
        this.g();
    }
    
    @Override
    public final void e(final ateu ateu) {
        if (ateu.getAndIncrement() == 0) {
            int addAndGet = 1;
            do {
                atev atev = null;
                Label_0009: {
                    if ((atev = (atev)ateu.c) == null) {
                        atev = this.get();
                        ateu.c = atev;
                    }
                }
                while (!ateu.d) {
                    final atev atev2 = atev.get();
                    if (atev2 == null) {
                        ateu.c = atev;
                        continue Label_0009;
                    }
                    if (atli.e(atev2.a, ateu.b)) {
                        ateu.c = null;
                        return;
                    }
                    atev = atev2;
                }
                ateu.c = null;
            } while ((addAndGet = ateu.addAndGet(-addAndGet)) != 0);
        }
    }
    
    final void f() {
        final atev atev = this.get();
        if (atev.a != null) {
            final atev atev2 = new atev(null);
            atev2.lazySet(atev.get());
            this.set(atev2);
        }
    }
    
    public abstract void g();
}
