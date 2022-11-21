import java.util.concurrent.RejectedExecutionException;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afxl implements Executor
{
    final Object a;
    final Object b;
    private final int c;
    
    public afxl(final agpv b, final Executor a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public afxl(final augs a, final Executor b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public afxl(final ListenableFuture b, final Executor a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public afxl(final Executor a, final afvd b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        final int c = this.c;
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    try {
                        ((Executor)this.b).execute(runnable);
                        return;
                    }
                    catch (final RejectedExecutionException ex) {
                        ((augs)this.a).f(ex);
                        return;
                    }
                }
                ((Executor)this.a).execute(new afaa((agpv)this.b, runnable, 8));
                return;
            }
            ((ListenableFuture)this.b).addListener(runnable, (Executor)this.a);
        }
        else {
            try {
                ((Executor)this.a).execute(runnable);
            }
            catch (final RejectedExecutionException exception) {
                ((afvd)this.b).setException(exception);
            }
        }
    }
}
