import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asza implements aslb
{
    final aslb a;
    final Object b;
    private final int c;
    
    public asza(final aslb a, final asmn b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public asza(final aslb a, final AtomicReference b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public asza(final AtomicReference b, final aslb a, final int c) {
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
    public final void d(final asln asln) {
        final int c = this.c;
        if (c == 0) {
            asmr.f((AtomicReference)this.b, asln);
            return;
        }
        if (c == 1) {
            asmr.h((AtomicReference)this.b, asln);
            return;
        }
        if (c != 2) {
            this.a.d(asln);
            return;
        }
        asmr.h((AtomicReference)this.b, asln);
    }
    
    @Override
    public final void tr(Object a) {
        final int c = this.c;
        if (c == 0) {
            this.a.tr(a);
            return;
        }
        if (c != 1) {
            if (c != 2) {
                try {
                    a = ((asmn)this.b).a(a);
                    asng.b(a, "The mapper function returned a null value.");
                    this.a.tr(a);
                    return;
                }
                finally {
                    final Throwable t;
                    asjv.a(t);
                    this.b(t);
                    return;
                }
            }
            this.a.tr(a);
            return;
        }
        this.a.tr(a);
    }
}
