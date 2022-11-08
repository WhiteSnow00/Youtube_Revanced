import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class atcw extends athy
{
    final atcx a;
    boolean b;
    
    public atcw(final atcx a) {
        this.a = a;
    }
    
    public final void b(final Throwable t) {
        if (this.b) {
            aulo.r(t);
            return;
        }
        this.b = true;
        final atcx a = this.a;
        asjg.b(a.e);
        if (athp.e(a.h, t)) {
            a.j = true;
            a.f();
            return;
        }
        aulo.r(t);
    }
    
    public final void tr(final Object o) {
        if (this.b) {
            return;
        }
        this.a.g();
    }
    
    public final void tu() {
        if (this.b) {
            return;
        }
        this.b = true;
        final atcx a = this.a;
        asjg.b(a.e);
        a.j = true;
        a.f();
    }
}
