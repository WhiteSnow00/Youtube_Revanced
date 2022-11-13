import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atgf implements asks
{
    private final AtomicReference a;
    private final AtomicReference b;
    
    public atgf() {
        this.a = new AtomicReference();
        this.b = new AtomicReference();
        final atge atge = new atge();
        this.e(atge);
        this.d(atge);
    }
    
    final atge a() {
        return this.a.get();
    }
    
    public final void c() {
        while (this.tw() != null && !this.i()) {}
    }
    
    final atge d(final atge atge) {
        return this.a.getAndSet(atge);
    }
    
    final void e(final atge atge) {
        this.b.lazySet(atge);
    }
    
    public final boolean i() {
        return this.b.get() == this.a();
    }
    
    public final boolean j(final Object o) {
        if (o != null) {
            final atge atge = new atge(o);
            this.d(atge).lazySet((Object)atge);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }
    
    @Override
    public final Object tw() {
        final atge atge = this.b.get();
        final atge a = atge.a();
        if (a != null) {
            final Object b = a.b();
            this.e(a);
            return b;
        }
        if (atge != this.a()) {
            atge a2;
            do {
                a2 = atge.a();
            } while (a2 == null);
            final Object b2 = a2.b();
            this.e(a2);
            return b2;
        }
        return null;
    }
}
