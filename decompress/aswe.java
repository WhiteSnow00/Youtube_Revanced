import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aswe implements asif
{
    final asif a;
    final Object b;
    private final int c;
    
    public aswe(final asif a, final asjr b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aswe(final asif a, final AtomicReference b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aswe(final AtomicReference b, final asif a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    @Override
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
    
    @Override
    public final void d(final asir asir) {
        final int c = this.c;
        if (c == 0) {
            asjv.f((AtomicReference)this.b, asir);
            return;
        }
        if (c == 1) {
            asjv.h((AtomicReference)this.b, asir);
            return;
        }
        if (c != 2) {
            this.a.d(asir);
            return;
        }
        asjv.h((AtomicReference)this.b, asir);
    }
    
    @Override
    public final void ts(Object a) {
        final int c = this.c;
        if (c == 0) {
            this.a.ts(a);
            return;
        }
        if (c != 1) {
            if (c != 2) {
                try {
                    a = ((asjr)this.b).a(a);
                    askk.b(a, "The mapper function returned a null value.");
                    this.a.ts(a);
                    return;
                }
                finally {
                    final Throwable t;
                    asgz.c(t);
                    this.b(t);
                    return;
                }
            }
            this.a.ts(a);
            return;
        }
        this.a.ts(a);
    }
}
