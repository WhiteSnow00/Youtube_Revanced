import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public enum afwd implements Executor
{
    a;
    
    private static final afwd[] b;
    
    @Override
    public final void execute(final Runnable runnable) {
        runnable.run();
    }
    
    @Override
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
