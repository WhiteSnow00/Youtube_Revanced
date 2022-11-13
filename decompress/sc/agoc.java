import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agoc implements Executor
{
    private volatile Executor a;
    
    public agoc(final Executor a) {
        this.a = a;
    }
    
    public final void a() {
        this.a = (Executor)afum.a;
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        this.a.execute(runnable);
    }
}
