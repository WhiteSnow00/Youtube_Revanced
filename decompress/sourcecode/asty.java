import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asty extends AtomicReference implements asic
{
    private static final long serialVersionUID = -2467358622224974244L;
    public final asgz a;
    
    public asty(final asgz a) {
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
    
    public final void b(Object o) {
        if (this.get() != asjg.a) {
            final asic asic = this.getAndSet((asic)asjg.a);
            if (asic != asjg.a) {
                Label_0057: {
                    if (o != null) {
                        break Label_0057;
                    }
                    try {
                        final asgz a = this.a;
                        o = new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
                        a.b((Throwable)o);
                        while (true) {
                            if (asic != null) {
                                asic.dispose();
                                return;
                            }
                            return;
                            this.a.tp(o);
                            continue;
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
