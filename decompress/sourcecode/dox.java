import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dox implements Executor
{
    private final /* synthetic */ int a;
    
    public dox(final int a) {
        this.a = a;
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        final int a = this.a;
        if (a == 0) {
            dpg.l(runnable);
            return;
        }
        if (a == 1) {
            runnable.run();
            return;
        }
        if (a != 2) {
            runnable.run();
            return;
        }
        runnable.run();
    }
}
