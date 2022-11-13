import java.util.concurrent.CancellationException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atve extends atpr
{
    public final atvd b;
    
    public atve(final atmd atmd) {
        atmd.getClass();
        super(atmd);
        this.b = new atvd((atrw)this);
    }
    
    @Override
    protected final void f(final Throwable exception, final boolean b) {
        final atvd b2 = this.b;
        if (exception instanceof CancellationException) {
            b2.a.set((Object)new atvc((CancellationException)exception));
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
