import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agpu implements Executor
{
    private volatile Executor a;
    
    public agpu(final Executor a) {
        this.a = a;
    }
    
    public final void a() {
        this.a = afwd.a;
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        this.a.execute(runnable);
    }
}
