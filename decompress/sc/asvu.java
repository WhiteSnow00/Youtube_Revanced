import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asvu implements asho
{
    final asho a;
    final AtomicReference b;
    private final int c;
    
    public asvu(final asho a, final AtomicReference b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public asvu(final AtomicReference b, final asho a, final int c) {
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
            asjv.f(this.b, asir);
            return;
        }
        if (c == 1) {
            asjv.h(this.b, asir);
            return;
        }
        if (c != 2) {
            asjv.h(this.b, asir);
            return;
        }
        asjv.f(this.b, asir);
    }
    
    @Override
    public final void ts(final Object o) {
        final int c = this.c;
        if (c == 0) {
            this.a.ts(o);
            return;
        }
        if (c == 1) {
            this.a.ts(o);
            return;
        }
        if (c != 2) {
            this.a.ts(o);
            return;
        }
        this.a.ts(o);
    }
    
    @Override
    public final void tx() {
        final int c = this.c;
        if (c == 0) {
            this.a.tx();
            return;
        }
        if (c == 1) {
            this.a.tx();
            return;
        }
        if (c != 2) {
            this.a.tx();
            return;
        }
        this.a.tx();
    }
}
