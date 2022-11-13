import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ater implements asif
{
    public final asif a;
    final ates b;
    private final asjz c;
    
    public ater(final ates b, final asjz c, final asif a) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    @Override
    public final void b(final Throwable t) {
        final asjz c = this.c;
        final ates b = this.b;
        asjv.h(c, b.d.c((Runnable)new xoo(this, t, 7), 0L, b.c));
    }
    
    @Override
    public final void d(final asir asir) {
        asjv.h(this.c, asir);
    }
    
    @Override
    public final void ts(final Object o) {
        final asjz c = this.c;
        final ates b = this.b;
        asjv.h(c, b.d.c((Runnable)new xoo(this, o, 8), b.b, b.c));
    }
}
