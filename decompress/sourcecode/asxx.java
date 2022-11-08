import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asxx extends AtomicReference implements ashf, asic
{
    private static final long serialVersionUID = -3434801548987643227L;
    final ashj a;
    
    public asxx(final ashj a) {
        this.a = a;
    }
    
    public final void a() {
        if (!this.tx()) {
            try {
                this.a.tu();
            }
            finally {
                asjg.b(this);
            }
        }
    }
    
    public final void b(final Throwable t) {
        if (!this.g(t)) {
            aulo.r(t);
        }
    }
    
    public final void c(final Object o) {
        if (o == null) {
            this.b(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        if (!this.tx()) {
            this.a.tr(o);
        }
    }
    
    public final void d(final asiw asiw) {
        asjg.d(this, (asic)new asje(asiw));
    }
    
    public final void dispose() {
        asjg.b(this);
    }
    
    public final void f(final asic asic) {
        asjg.d(this, asic);
    }
    
    public final boolean g(final Throwable t) {
        Throwable t2 = t;
        if (t == null) {
            t2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        if (!this.tx()) {
            try {
                this.a.b(t2);
                return true;
            }
            finally {
                asjg.b(this);
            }
        }
        return false;
    }
    
    @Override
    public final String toString() {
        return String.format("%s{%s}", this.getClass().getSimpleName(), super.toString());
    }
    
    public final boolean tx() {
        return asjg.c(this.get());
    }
}
