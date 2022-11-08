import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aslc extends AtomicReference implements asic
{
    private static final long serialVersionUID = -2467358622224974244L;
    final asgo a;
    
    public aslc(final asgo a) {
        this.a = a;
    }
    
    public final void a() {
        if (this.get() != asjg.a) {
            final asic asic = this.getAndSet((asic)asjg.a);
            if (asic != asjg.a) {
                try {
                    this.a.tu();
                    if (asic != null) {
                        asic.dispose();
                    }
                }
                finally {
                    if (asic != null) {
                        asic.dispose();
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
        if (this.get() != asjg.a) {
            final asic asic = this.getAndSet((asic)asjg.a);
            if (asic != asjg.a) {
                try {
                    this.a.b(t2);
                    if (asic != null) {
                        asic.dispose();
                    }
                    return;
                }
                finally {
                    if (asic != null) {
                        asic.dispose();
                    }
                }
            }
        }
        aulo.r(t);
    }
    
    public final void c(final asiw asiw) {
        asjg.d(this, (asic)new asje(asiw));
    }
    
    public final void dispose() {
        asjg.b(this);
    }
    
    @Override
    public final String toString() {
        return String.format("%s{%s}", this.getClass().getSimpleName(), super.toString());
    }
    
    public final boolean tx() {
        return asjg.c(this.get());
    }
}
