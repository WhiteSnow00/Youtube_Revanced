import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class aszh extends AtomicReference implements askk, asln
{
    private static final long serialVersionUID = -5955289211445418871L;
    final askk a;
    final aszi b;
    final askm c;
    final aszg d;
    
    public aszh(final askk a, final askm c) {
        this.a = a;
        this.b = new aszi(this);
        this.c = c;
        this.d = new aszg(a);
    }
    
    @Override
    public final void b(final Throwable t) {
        asmr.b(this.b);
        if (this.getAndSet(asmr.a) != asmr.a) {
            this.a.b(t);
            return;
        }
        aqvq.w(t);
    }
    
    public final void c() {
        if (asmr.b(this)) {
            final askm c = this.c;
            if (c == null) {
                this.a.b(new TimeoutException());
                return;
            }
            c.ag(this.d);
        }
    }
    
    @Override
    public final void d(final asln asln) {
        asmr.f(this, asln);
    }
    
    @Override
    public final void dispose() {
        asmr.b(this);
        asmr.b(this.b);
        final aszg d = this.d;
        if (d != null) {
            asmr.b(d);
        }
    }
    
    @Override
    public final void tr(final Object o) {
        asmr.b(this.b);
        if (this.getAndSet(asmr.a) != asmr.a) {
            this.a.tr(o);
        }
    }
    
    @Override
    public final void tw() {
        asmr.b(this.b);
        if (this.getAndSet(asmr.a) != asmr.a) {
            this.a.tw();
        }
    }
    
    @Override
    public final boolean tz() {
        return asmr.c(this.get());
    }
}
