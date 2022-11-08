import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class audf implements Executor
{
    final /* synthetic */ Executor a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    
    public audf(final Executor a, final int b, final boolean c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        this.a.execute((Runnable)new atyo(this, runnable, 8));
    }
}
