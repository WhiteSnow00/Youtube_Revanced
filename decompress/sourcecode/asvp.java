import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asvp implements ashq
{
    final ashq a;
    final Object b;
    private final /* synthetic */ int c;
    
    public asvp(final ashq a, final asjc b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public asvp(final ashq a, final AtomicReference b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public asvp(final AtomicReference b, final ashq a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public final void b(final Throwable t) {
        final int c = this.c;
        if (c == 0) {
            this.a.b(t);
            return;
        }
        if (c == 1) {
            this.a.b(t);
            return;
        }
        if (c != 2) {
            this.a.b(t);
            return;
        }
        this.a.b(t);
    }
    
    public final void d(final asic asic) {
        final int c = this.c;
        if (c == 0) {
            asjg.f((AtomicReference)this.b, asic);
            return;
        }
        if (c == 1) {
            asjg.h((AtomicReference)this.b, asic);
            return;
        }
        if (c != 2) {
            this.a.d(asic);
            return;
        }
        asjg.h((AtomicReference)this.b, asic);
    }
    
    public final void tp(Object a) {
        final int c = this.c;
        if (c == 0) {
            this.a.tp(a);
            return;
        }
        if (c != 1) {
            if (c != 2) {
                try {
                    a = ((asjc)this.b).a(a);
                    asjv.b(a, "The mapper function returned a null value.");
                    this.a.tp(a);
                    return;
                }
                finally {
                    final Throwable t;
                    asey.d(t);
                    this.b(t);
                    return;
                }
            }
            this.a.tp(a);
            return;
        }
        this.a.tp(a);
    }
}
