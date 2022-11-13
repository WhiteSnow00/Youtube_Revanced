import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aslr extends AtomicReference implements asir
{
    private static final long serialVersionUID = -2467358622224974244L;
    final ashd a;
    
    public aslr(final ashd a) {
        this.a = a;
    }
    
    public final void a() {
        if (this.get() != asjv.a) {
            final asir asir = this.getAndSet((asir)asjv.a);
            if (asir != asjv.a) {
                try {
                    this.a.tx();
                    if (asir != null) {
                        asir.dispose();
                    }
                }
                finally {
                    if (asir != null) {
                        asir.dispose();
                    }
                }
            }
        }
    }
    
    public final void b(final Throwable t) {
        Throwable t2;
        if (t == null) {
            t2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        else {
            t2 = t;
        }
        if (this.get() != asjv.a) {
            final asir asir = this.getAndSet((asir)asjv.a);
            if (asir != asjv.a) {
                try {
                    this.a.b(t2);
                    if (asir != null) {
                        asir.dispose();
                    }
                    return;
                }
                finally {
                    if (asir != null) {
                        asir.dispose();
                    }
                }
            }
        }
        atqx.j(t);
    }
    
    public final void c(final asjl asjl) {
        asjv.d((AtomicReference)this, (asir)new asjt(asjl));
    }
    
    @Override
    public final void dispose() {
        asjv.b((AtomicReference)this);
    }
    
    @Override
    public final boolean tA() {
        return asjv.c((asir)this.get());
    }
    
    @Override
    public final String toString() {
        return String.format("%s{%s}", this.getClass().getSimpleName(), super.toString());
    }
}
