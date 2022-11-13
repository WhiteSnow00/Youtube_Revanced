import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class atby extends AtomicInteger implements asir
{
    private static final long serialVersionUID = 2728361546769921047L;
    final atcb a;
    final ashy b;
    Object c;
    volatile boolean d;
    
    public atby(final atcb a, final ashy b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void dispose() {
        if (!this.d) {
            this.d = true;
            this.a.f(this);
            this.c = null;
        }
    }
    
    @Override
    public final boolean tA() {
        return this.d;
    }
}
