import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asvf implements asgz
{
    final asgz a;
    final AtomicReference b;
    private final /* synthetic */ int c;
    
    public asvf(final asgz a, final AtomicReference b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public asvf(final AtomicReference b, final asgz a, final int c) {
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
            asjg.f(this.b, asic);
            return;
        }
        if (c == 1) {
            asjg.h(this.b, asic);
            return;
        }
        if (c != 2) {
            asjg.h(this.b, asic);
            return;
        }
        asjg.f(this.b, asic);
    }
    
    public final void tp(final Object o) {
        final int c = this.c;
        if (c == 0) {
            this.a.tp(o);
            return;
        }
        if (c == 1) {
            this.a.tp(o);
            return;
        }
        if (c != 2) {
            this.a.tp(o);
            return;
        }
        this.a.tp(o);
    }
    
    public final void tu() {
        final int c = this.c;
        if (c == 0) {
            this.a.tu();
            return;
        }
        if (c == 1) {
            this.a.tu();
            return;
        }
        if (c != 2) {
            this.a.tu();
            return;
        }
        this.a.tu();
    }
}
