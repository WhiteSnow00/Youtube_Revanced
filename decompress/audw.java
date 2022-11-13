import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class audw implements Executor
{
    final Executor a;
    public final int b;
    public final boolean c;
    public final int d;
    
    public audw(final Executor a, final int b, final boolean c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        this.a.execute(new asfa(this, runnable, 8));
    }
}
