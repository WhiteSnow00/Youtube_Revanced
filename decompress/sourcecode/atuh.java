import java.util.concurrent.CancellationException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atuh extends atow
{
    public final atug b;
    
    public atuh(final atli atli) {
        atli.getClass();
        super(atli);
        this.b = new atug((atrb)this);
    }
    
    @Override
    protected final void f(final Throwable exception, final boolean b) {
        final atug b2 = this.b;
        if (exception instanceof CancellationException) {
            b2.a.set((Object)new atuf((CancellationException)exception));
            return;
        }
        if (b2.a.setException(exception)) {
            b2.b = true;
        }
    }
    
    @Override
    protected final void g(final Object o) {
        this.b.a.set(o);
    }
}
