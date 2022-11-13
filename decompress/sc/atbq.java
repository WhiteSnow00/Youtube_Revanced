import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atbq implements ashy
{
    final ashy a;
    final Object b;
    private final int c;
    
    public atbq(final ashy a, final AtomicReference b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public atbq(final ashy b, final vgb a, final int c) {
        this.c = c;
        this.b = b;
        this.a = (ashy)a;
    }
    
    public atbq(final atjs a, final AtomicReference b, final int c) {
        this.c = c;
        this.a = (ashy)a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        final int c = this.c;
        if (c == 0) {
            ((atjs)this.a).b(t);
            return;
        }
        if (c != 1) {
            this.a.b(t);
            return;
        }
        ((ashy)this.b).b(t);
    }
    
    @Override
    public final void d(final asir asir) {
        final int c = this.c;
        if (c == 0) {
            asjv.f((AtomicReference)this.b, asir);
            return;
        }
        if (c != 1) {
            asjv.h((AtomicReference)this.b, asir);
            return;
        }
        ((ashy)this.b).d((asir)new vga(asir, (vgb)this.a));
    }
    
    @Override
    public final void tu(final Object o) {
        final int c = this.c;
        if (c == 0) {
            ((atjs)this.a).tu(o);
            return;
        }
        if (c != 1) {
            this.a.tu(o);
            return;
        }
        ((ashy)this.b).tu(o);
    }
    
    @Override
    public final void tx() {
        final int c = this.c;
        if (c == 0) {
            ((atjs)this.a).tx();
            return;
        }
        if (c != 1) {
            this.a.tx();
            return;
        }
        ((ashy)this.b).tx();
    }
}
