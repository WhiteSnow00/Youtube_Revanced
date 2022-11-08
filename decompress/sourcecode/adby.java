import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.CancellationException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adby implements ashq
{
    final /* synthetic */ acb a;
    
    public adby(final acb a) {
        this.a = a;
    }
    
    @Override
    public final void b(final Throwable t) {
        if (t instanceof CancellationException) {
            this.a.b();
            return;
        }
        this.a.d(t);
    }
    
    @Override
    public final void d(final asic asic) {
        this.a.a((Runnable)new adaj(asic, 3), (Executor)afsl.a);
    }
}
