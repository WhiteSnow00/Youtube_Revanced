import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asod extends AtomicReference implements asku, asln
{
    private static final long serialVersionUID = -7251123623727029452L;
    final asmi a;
    final asmi b;
    final asmc c;
    
    public asod(final asmi a, final asmi b, final asmc c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void b(final Throwable t) {
        if (!this.tz()) {
            this.lazySet(asmr.a);
            try {
                this.b.a(t);
                return;
            }
            finally {
                final Throwable t2;
                asjv.a(t2);
                aqvq.w((Throwable)new aslv(new Throwable[] { t, t2 }));
                return;
            }
        }
        aqvq.w(t);
    }
    
    @Override
    public final void d(final asln asln) {
        asmr.f(this, asln);
    }
    
    @Override
    public final void dispose() {
        asmr.b(this);
    }
    
    @Override
    public final void tt(final Object o) {
        if (!this.tz()) {
            try {
                this.a.a(o);
            }
            finally {
                final Throwable t;
                asjv.a(t);
                this.get().dispose();
                this.b(t);
            }
        }
    }
    
    @Override
    public final void tw() {
        if (!this.tz()) {
            this.lazySet(asmr.a);
            try {
                this.c.a();
            }
            finally {
                final Throwable t;
                asjv.a(t);
                aqvq.w(t);
            }
        }
    }
    
    @Override
    public final boolean tz() {
        return this.get() == asmr.a;
    }
}
