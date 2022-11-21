import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asyq implements askk
{
    final askk a;
    final AtomicReference b;
    private final int c;
    
    public asyq(final askk a, final AtomicReference b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public asyq(final AtomicReference b, final askk a, final int c) {
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
            asmr.f(this.b, asln);
            return;
        }
        if (c == 1) {
            asmr.h(this.b, asln);
            return;
        }
        if (c != 2) {
            asmr.h(this.b, asln);
            return;
        }
        asmr.f(this.b, asln);
    }
    
    @Override
    public final void tr(final Object o) {
        final int c = this.c;
        if (c == 0) {
            this.a.tr(o);
            return;
        }
        if (c == 1) {
            this.a.tr(o);
            return;
        }
        if (c != 2) {
            this.a.tr(o);
            return;
        }
        this.a.tr(o);
    }
    
    @Override
    public final void tw() {
        final int c = this.c;
        if (c == 0) {
            this.a.tw();
            return;
        }
        if (c == 1) {
            this.a.tw();
            return;
        }
        if (c != 2) {
            this.a.tw();
            return;
        }
        this.a.tw();
    }
}
