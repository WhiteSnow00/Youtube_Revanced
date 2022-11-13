import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class atfs extends AtomicReference implements Runnable, asif, asir
{
    private static final long serialVersionUID = 7000911171163930287L;
    final asif a;
    final asjz b;
    final asih c;
    
    public atfs(final asif a, final asih c) {
        this.a = a;
        this.c = c;
        this.b = new asjz();
    }
    
    @Override
    public final void b(final Throwable t) {
        this.a.b(t);
    }
    
    @Override
    public final void d(final asir asir) {
        asjv.f(this, asir);
    }
    
    @Override
    public final void dispose() {
        asjv.b(this);
        asjv.b(this.b);
    }
    
    @Override
    public final void run() {
        this.c.ae(this);
    }
    
    @Override
    public final boolean tA() {
        return asjv.c(this.get());
    }
    
    @Override
    public final void ts(final Object o) {
        this.a.ts(o);
    }
}
