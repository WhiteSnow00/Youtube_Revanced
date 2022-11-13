import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ateo extends AtomicReference implements asir
{
    private static final long serialVersionUID = -2467358622224974244L;
    final asif a;
    
    public ateo(final asif a) {
        this.a = a;
    }
    
    public final void a(final Throwable t) {
        Throwable t2;
        if (t == null) {
            t2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        else {
            t2 = t;
        }
        if (this.get() != asjv.a) {
            final asir asir = this.getAndSet(asjv.a);
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
    
    public final void b(final Object o) {
        if (this.get() != asjv.a) {
            final asir asir = this.getAndSet(asjv.a);
            if (asir != asjv.a) {
                Label_0057: {
                    if (o != null) {
                        break Label_0057;
                    }
                    try {
                        this.a.b(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                        while (true) {
                            if (asir != null) {
                                asir.dispose();
                                return;
                            }
                            return;
                            this.a.ts(o);
                            continue;
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
    }
    
    @Override
    public final void dispose() {
        asjv.b(this);
    }
    
    @Override
    public final boolean tA() {
        return asjv.c(this.get());
    }
    
    @Override
    public final String toString() {
        return String.format("%s{%s}", this.getClass().getSimpleName(), super.toString());
    }
}
