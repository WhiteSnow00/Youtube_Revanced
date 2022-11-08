import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asks extends AtomicReference implements ashj, asic
{
    private static final long serialVersionUID = -7251123623727029452L;
    final asix a;
    final asix b;
    final asir c;
    
    public asks(final asix a, final asix b, final asir c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void b(final Throwable t) {
        if (!this.tx()) {
            this.lazySet(asjg.a);
            try {
                this.b.a((Object)t);
                return;
            }
            finally {
                final Throwable t2;
                asey.d(t2);
                aulo.r((Throwable)new asik(new Throwable[] { t, t2 }));
                return;
            }
        }
        aulo.r(t);
    }
    
    public final void d(final asic asic) {
        asjg.f(this, asic);
    }
    
    public final void dispose() {
        asjg.b(this);
    }
    
    public final void tr(final Object o) {
        if (!this.tx()) {
            try {
                this.a.a(o);
            }
            finally {
                final Throwable t;
                asey.d(t);
                this.get().dispose();
                this.b(t);
            }
        }
    }
    
    public final void tu() {
        if (!this.tx()) {
            this.lazySet(asjg.a);
            try {
                this.c.a();
            }
            finally {
                final Throwable t;
                asey.d(t);
                aulo.r(t);
            }
        }
    }
    
    public final boolean tx() {
        return this.get() == asjg.a;
    }
}
