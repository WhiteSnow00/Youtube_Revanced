import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

enum arsb implements Executor
{
    a;
    
    @Override
    public final void execute(final Runnable runnable) {
        runnable.run();
    }
    
    @Override
    public final String toString() {
        return "Context.DirectExecutor";
    }
}
