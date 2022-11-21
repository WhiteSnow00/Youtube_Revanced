import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class ateu extends AtomicInteger implements asln
{
    private static final long serialVersionUID = 2728361546769921047L;
    final atex a;
    final asku b;
    Object c;
    volatile boolean d;
    
    public ateu(final atex a, final asku b) {
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
    public final boolean tz() {
        return this.d;
    }
}
