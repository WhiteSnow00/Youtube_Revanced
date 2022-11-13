import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class atbw extends AtomicReference implements atca
{
    private static final long serialVersionUID = 2346567790059478686L;
    atbz a;
    int b;
    
    public atbw() {
        this.set(this.a = new atbz((Object)null));
    }
    
    final void a(final atbz a) {
        this.a.set((Object)a);
        this.a = a;
        ++this.b;
    }
    
    public final void b() {
        this.a(new atbz((Object)atil.a));
        this.f();
    }
    
    public final void c(final Throwable t) {
        this.a(new atbz(atil.b(t)));
        this.f();
    }
    
    public final void d(final Object o) {
        final atil a = atil.a;
        this.a(new atbz(o));
        this.g();
    }
    
    public final void e(final atby atby) {
        if (atby.getAndIncrement() == 0) {
            int addAndGet = 1;
            do {
                atbz atbz = null;
                Label_0009: {
                    if ((atbz = (atbz)atby.c) == null) {
                        atbz = this.get();
                        atby.c = atbz;
                    }
                }
                while (!atby.d) {
                    final atbz atbz2 = (atbz)atbz.get();
                    if (atbz2 == null) {
                        atby.c = atbz;
                        continue Label_0009;
                    }
                    if (atil.e(atbz2.a, atby.b)) {
                        atby.c = null;
                        return;
                    }
                    atbz = atbz2;
                }
                atby.c = null;
            } while ((addAndGet = atby.addAndGet(-addAndGet)) != 0);
        }
    }
    
    final void f() {
        final atbz atbz = this.get();
        if (atbz.a != null) {
            final atbz atbz2 = new atbz((Object)null);
            atbz2.lazySet((Object)atbz.get());
            this.set(atbz2);
        }
    }
    
    public abstract void g();
}
