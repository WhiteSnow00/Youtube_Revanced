import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asyp extends AtomicReference implements ashu, asir
{
    private static final long serialVersionUID = -3434801548987643227L;
    final ashy a;
    
    public asyp(final ashy a) {
        this.a = a;
    }
    
    public final void a() {
        if (!this.tA()) {
            try {
                this.a.tx();
            }
            finally {
                asjv.b((AtomicReference)this);
            }
        }
    }
    
    public final void b(final Throwable t) {
        if (!this.g(t)) {
            atqx.j(t);
        }
    }
    
    public final void c(final Object o) {
        if (o == null) {
            this.b(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        if (!this.tA()) {
            this.a.tu(o);
        }
    }
    
    public final void d(final asjl asjl) {
        asjv.d((AtomicReference)this, (asir)new asjt(asjl));
    }
    
    public final void dispose() {
        asjv.b((AtomicReference)this);
    }
    
    public final void f(final asir asir) {
        asjv.d((AtomicReference)this, asir);
    }
    
    public final boolean g(final Throwable t) {
        Throwable t2 = t;
        if (t == null) {
            t2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        if (!this.tA()) {
            try {
                this.a.b(t2);
                return true;
            }
            finally {
                asjv.b((AtomicReference)this);
            }
        }
        return false;
    }
    
    public final boolean tA() {
        return asjv.c((asir)this.get());
    }
    
    @Override
    public final String toString() {
        return String.format("%s{%s}", this.getClass().getSimpleName(), super.toString());
    }
}
